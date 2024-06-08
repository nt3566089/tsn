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
 * The abstract condition-query of E_SHOP_IMPORT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShopImportSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShopImportSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHOP_IMPORT_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_Equal(Long shopImportSendId) {
        doSetShopImportSendId_Equal(shopImportSendId);
    }

    protected void doSetShopImportSendId_Equal(Long shopImportSendId) {
        regShopImportSendId(CK_EQ, shopImportSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_NotEqual(Long shopImportSendId) {
        doSetShopImportSendId_NotEqual(shopImportSendId);
    }

    protected void doSetShopImportSendId_NotEqual(Long shopImportSendId) {
        regShopImportSendId(CK_NES, shopImportSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_GreaterThan(Long shopImportSendId) {
        regShopImportSendId(CK_GT, shopImportSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_LessThan(Long shopImportSendId) {
        regShopImportSendId(CK_LT, shopImportSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_GreaterEqual(Long shopImportSendId) {
        regShopImportSendId(CK_GE, shopImportSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendId The value of shopImportSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopImportSendId_LessEqual(Long shopImportSendId) {
        regShopImportSendId(CK_LE, shopImportSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shopImportSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopImportSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShopImportSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShopImportSendId(), "SHOP_IMPORT_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendIdList The collection of shopImportSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopImportSendId_InScope(Collection<Long> shopImportSendIdList) {
        doSetShopImportSendId_InScope(shopImportSendIdList);
    }

    protected void doSetShopImportSendId_InScope(Collection<Long> shopImportSendIdList) {
        regINS(CK_INS, cTL(shopImportSendIdList), xgetCValueShopImportSendId(), "SHOP_IMPORT_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopImportSendIdList The collection of shopImportSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopImportSendId_NotInScope(Collection<Long> shopImportSendIdList) {
        doSetShopImportSendId_NotInScope(shopImportSendIdList);
    }

    protected void doSetShopImportSendId_NotInScope(Collection<Long> shopImportSendIdList) {
        regINS(CK_NINS, cTL(shopImportSendIdList), xgetCValueShopImportSendId(), "SHOP_IMPORT_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShopImportSendId_IsNull() { regShopImportSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShopImportSendId_IsNotNull() { regShopImportSendId(CK_ISNN, DOBJ); }

    protected void regShopImportSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopImportSendId(), "SHOP_IMPORT_SEND_ID"); }
    protected abstract ConditionValue xgetCValueShopImportSendId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_Equal(String sendCd) {
        doSetSendCd_Equal(fRES(sendCd));
    }

    protected void doSetSendCd_Equal(String sendCd) {
        regSendCd(CK_EQ, sendCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotEqual(String sendCd) {
        doSetSendCd_NotEqual(fRES(sendCd));
    }

    protected void doSetSendCd_NotEqual(String sendCd) {
        regSendCd(CK_NES, sendCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCdList The collection of sendCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_InScope(Collection<String> sendCdList) {
        doSetSendCd_InScope(sendCdList);
    }

    protected void doSetSendCd_InScope(Collection<String> sendCdList) {
        regINS(CK_INS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCdList The collection of sendCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotInScope(Collection<String> sendCdList) {
        doSetSendCd_NotInScope(sendCdList);
    }

    protected void doSetSendCd_NotInScope(Collection<String> sendCdList) {
        regINS(CK_NINS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSendCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendCd The value of sendCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendCd_LikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {NotNull, varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_Equal(Long sendRowId) {
        doSetSendRowId_Equal(sendRowId);
    }

    protected void doSetSendRowId_Equal(Long sendRowId) {
        regSendRowId(CK_EQ, sendRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_NotEqual(Long sendRowId) {
        doSetSendRowId_NotEqual(sendRowId);
    }

    protected void doSetSendRowId_NotEqual(Long sendRowId) {
        regSendRowId(CK_NES, sendRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterThan(Long sendRowId) {
        regSendRowId(CK_GT, sendRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessThan(Long sendRowId) {
        regSendRowId(CK_LT, sendRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterEqual(Long sendRowId) {
        regSendRowId(CK_GE, sendRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessEqual(Long sendRowId) {
        regSendRowId(CK_LE, sendRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowId(), "SEND_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowIdList The collection of sendRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_InScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_InScope(sendRowIdList);
    }

    protected void doSetSendRowId_InScope(Collection<Long> sendRowIdList) {
        regINS(CK_INS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowIdList The collection of sendRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_NotInScope(sendRowIdList);
    }

    protected void doSetSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        regINS(CK_NINS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    protected void regSendRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowId(), "SEND_ROW_ID"); }
    protected abstract ConditionValue xgetCValueSendRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_Equal(String workFlg) {
        doSetWorkFlg_Equal(fRES(workFlg));
    }

    protected void doSetWorkFlg_Equal(String workFlg) {
        regWorkFlg(CK_EQ, workFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotEqual(String workFlg) {
        doSetWorkFlg_NotEqual(fRES(workFlg));
    }

    protected void doSetWorkFlg_NotEqual(String workFlg) {
        regWorkFlg(CK_NES, workFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlgList The collection of workFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_InScope(Collection<String> workFlgList) {
        doSetWorkFlg_InScope(workFlgList);
    }

    protected void doSetWorkFlg_InScope(Collection<String> workFlgList) {
        regINS(CK_INS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlgList The collection of workFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotInScope(Collection<String> workFlgList) {
        doSetWorkFlg_NotInScope(workFlgList);
    }

    protected void doSetWorkFlg_NotInScope(Collection<String> workFlgList) {
        regINS(CK_NINS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setWorkFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workFlg The value of workFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkFlg_LikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_Equal(String symbolPosKey) {
        doSetSymbolPosKey_Equal(fRES(symbolPosKey));
    }

    protected void doSetSymbolPosKey_Equal(String symbolPosKey) {
        regSymbolPosKey(CK_EQ, symbolPosKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_NotEqual(String symbolPosKey) {
        doSetSymbolPosKey_NotEqual(fRES(symbolPosKey));
    }

    protected void doSetSymbolPosKey_NotEqual(String symbolPosKey) {
        regSymbolPosKey(CK_NES, symbolPosKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_GreaterThan(String symbolPosKey) {
        regSymbolPosKey(CK_GT, fRES(symbolPosKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_LessThan(String symbolPosKey) {
        regSymbolPosKey(CK_LT, fRES(symbolPosKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_GreaterEqual(String symbolPosKey) {
        regSymbolPosKey(CK_GE, fRES(symbolPosKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_LessEqual(String symbolPosKey) {
        regSymbolPosKey(CK_LE, fRES(symbolPosKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKeyList The collection of symbolPosKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_InScope(Collection<String> symbolPosKeyList) {
        doSetSymbolPosKey_InScope(symbolPosKeyList);
    }

    protected void doSetSymbolPosKey_InScope(Collection<String> symbolPosKeyList) {
        regINS(CK_INS, cTL(symbolPosKeyList), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKeyList The collection of symbolPosKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_NotInScope(Collection<String> symbolPosKeyList) {
        doSetSymbolPosKey_NotInScope(symbolPosKeyList);
    }

    protected void doSetSymbolPosKey_NotInScope(Collection<String> symbolPosKeyList) {
        regINS(CK_NINS, cTL(symbolPosKeyList), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)} <br>
     * <pre>e.g. setSymbolPosKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolPosKey The value of symbolPosKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolPosKey_LikeSearch(String symbolPosKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolPosKey), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolPosKey_NotLikeSearch(String symbolPosKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolPosKey), xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     * @param symbolPosKey The value of symbolPosKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolPosKey_PrefixSearch(String symbolPosKey) {
        setSymbolPosKey_LikeSearch(symbolPosKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNull() { regSymbolPosKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNullOrEmpty() { regSymbolPosKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOL_POS_KEY: {varchar(255)}
     */
    public void setSymbolPosKey_IsNotNull() { regSymbolPosKey(CK_ISNN, DOBJ); }

    protected void regSymbolPosKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolPosKey(), "SYMBOL_POS_KEY"); }
    protected abstract ConditionValue xgetCValueSymbolPosKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_Equal(String warehouseSname) {
        doSetWarehouseSname_Equal(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_Equal(String warehouseSname) {
        regWarehouseSname(CK_EQ, warehouseSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotEqual(String warehouseSname) {
        doSetWarehouseSname_NotEqual(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_NotEqual(String warehouseSname) {
        regWarehouseSname(CK_NES, warehouseSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterThan(String warehouseSname) {
        regWarehouseSname(CK_GT, fRES(warehouseSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessThan(String warehouseSname) {
        regWarehouseSname(CK_LT, fRES(warehouseSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterEqual(String warehouseSname) {
        regWarehouseSname(CK_GE, fRES(warehouseSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessEqual(String warehouseSname) {
        regWarehouseSname(CK_LE, fRES(warehouseSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSnameList The collection of warehouseSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_InScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        regINS(CK_INS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSnameList The collection of warehouseSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_NotInScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        regINS(CK_NINS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)} <br>
     * <pre>e.g. setWarehouseSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseSname The value of warehouseSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseSname_LikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseSname_NotLikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     * @param warehouseSname The value of warehouseSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_PrefixSearch(String warehouseSname) {
        setWarehouseSname_LikeSearch(warehouseSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNull() { regWarehouseSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNullOrEmpty() { regWarehouseSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {varchar(255)}
     */
    public void setWarehouseSname_IsNotNull() { regWarehouseSname(CK_ISNN, DOBJ); }

    protected void regWarehouseSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseSname(), "WAREHOUSE_SNAME"); }
    protected abstract ConditionValue xgetCValueWarehouseSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_Equal(String factoryCd) {
        doSetFactoryCd_Equal(fRES(factoryCd));
    }

    protected void doSetFactoryCd_Equal(String factoryCd) {
        regFactoryCd(CK_EQ, factoryCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_NotEqual(String factoryCd) {
        doSetFactoryCd_NotEqual(fRES(factoryCd));
    }

    protected void doSetFactoryCd_NotEqual(String factoryCd) {
        regFactoryCd(CK_NES, factoryCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_GreaterThan(String factoryCd) {
        regFactoryCd(CK_GT, fRES(factoryCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_LessThan(String factoryCd) {
        regFactoryCd(CK_LT, fRES(factoryCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_GreaterEqual(String factoryCd) {
        regFactoryCd(CK_GE, fRES(factoryCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_LessEqual(String factoryCd) {
        regFactoryCd(CK_LE, fRES(factoryCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCdList The collection of factoryCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_InScope(Collection<String> factoryCdList) {
        doSetFactoryCd_InScope(factoryCdList);
    }

    protected void doSetFactoryCd_InScope(Collection<String> factoryCdList) {
        regINS(CK_INS, cTL(factoryCdList), xgetCValueFactoryCd(), "FACTORY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCdList The collection of factoryCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_NotInScope(Collection<String> factoryCdList) {
        doSetFactoryCd_NotInScope(factoryCdList);
    }

    protected void doSetFactoryCd_NotInScope(Collection<String> factoryCdList) {
        regINS(CK_NINS, cTL(factoryCdList), xgetCValueFactoryCd(), "FACTORY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_CD: {varchar(255)} <br>
     * <pre>e.g. setFactoryCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factoryCd The value of factoryCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactoryCd_LikeSearch(String factoryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factoryCd), xgetCValueFactoryCd(), "FACTORY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactoryCd_NotLikeSearch(String factoryCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factoryCd), xgetCValueFactoryCd(), "FACTORY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     * @param factoryCd The value of factoryCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryCd_PrefixSearch(String factoryCd) {
        setFactoryCd_LikeSearch(factoryCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     */
    public void setFactoryCd_IsNull() { regFactoryCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     */
    public void setFactoryCd_IsNullOrEmpty() { regFactoryCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORY_CD: {varchar(255)}
     */
    public void setFactoryCd_IsNotNull() { regFactoryCd(CK_ISNN, DOBJ); }

    protected void regFactoryCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactoryCd(), "FACTORY_CD"); }
    protected abstract ConditionValue xgetCValueFactoryCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_Equal(String factorySname) {
        doSetFactorySname_Equal(fRES(factorySname));
    }

    protected void doSetFactorySname_Equal(String factorySname) {
        regFactorySname(CK_EQ, factorySname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_NotEqual(String factorySname) {
        doSetFactorySname_NotEqual(fRES(factorySname));
    }

    protected void doSetFactorySname_NotEqual(String factorySname) {
        regFactorySname(CK_NES, factorySname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_GreaterThan(String factorySname) {
        regFactorySname(CK_GT, fRES(factorySname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_LessThan(String factorySname) {
        regFactorySname(CK_LT, fRES(factorySname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_GreaterEqual(String factorySname) {
        regFactorySname(CK_GE, fRES(factorySname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_LessEqual(String factorySname) {
        regFactorySname(CK_LE, fRES(factorySname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySnameList The collection of factorySname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_InScope(Collection<String> factorySnameList) {
        doSetFactorySname_InScope(factorySnameList);
    }

    protected void doSetFactorySname_InScope(Collection<String> factorySnameList) {
        regINS(CK_INS, cTL(factorySnameList), xgetCValueFactorySname(), "FACTORY_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySnameList The collection of factorySname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_NotInScope(Collection<String> factorySnameList) {
        doSetFactorySname_NotInScope(factorySnameList);
    }

    protected void doSetFactorySname_NotInScope(Collection<String> factorySnameList) {
        regINS(CK_NINS, cTL(factorySnameList), xgetCValueFactorySname(), "FACTORY_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {varchar(255)} <br>
     * <pre>e.g. setFactorySname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorySname The value of factorySname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorySname_LikeSearch(String factorySname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorySname), xgetCValueFactorySname(), "FACTORY_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorySname_NotLikeSearch(String factorySname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorySname), xgetCValueFactorySname(), "FACTORY_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     * @param factorySname The value of factorySname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_PrefixSearch(String factorySname) {
        setFactorySname_LikeSearch(factorySname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     */
    public void setFactorySname_IsNull() { regFactorySname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     */
    public void setFactorySname_IsNullOrEmpty() { regFactorySname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {varchar(255)}
     */
    public void setFactorySname_IsNotNull() { regFactorySname(CK_ISNN, DOBJ); }

    protected void regFactorySname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorySname(), "FACTORY_SNAME"); }
    protected abstract ConditionValue xgetCValueFactorySname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_Equal(String itemCdCase) {
        doSetItemCdCase_Equal(fRES(itemCdCase));
    }

    protected void doSetItemCdCase_Equal(String itemCdCase) {
        regItemCdCase(CK_EQ, itemCdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_NotEqual(String itemCdCase) {
        doSetItemCdCase_NotEqual(fRES(itemCdCase));
    }

    protected void doSetItemCdCase_NotEqual(String itemCdCase) {
        regItemCdCase(CK_NES, itemCdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_GreaterThan(String itemCdCase) {
        regItemCdCase(CK_GT, fRES(itemCdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_LessThan(String itemCdCase) {
        regItemCdCase(CK_LT, fRES(itemCdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_GreaterEqual(String itemCdCase) {
        regItemCdCase(CK_GE, fRES(itemCdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_LessEqual(String itemCdCase) {
        regItemCdCase(CK_LE, fRES(itemCdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCaseList The collection of itemCdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_InScope(Collection<String> itemCdCaseList) {
        doSetItemCdCase_InScope(itemCdCaseList);
    }

    protected void doSetItemCdCase_InScope(Collection<String> itemCdCaseList) {
        regINS(CK_INS, cTL(itemCdCaseList), xgetCValueItemCdCase(), "ITEM_CD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCaseList The collection of itemCdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_NotInScope(Collection<String> itemCdCaseList) {
        doSetItemCdCase_NotInScope(itemCdCaseList);
    }

    protected void doSetItemCdCase_NotInScope(Collection<String> itemCdCaseList) {
        regINS(CK_NINS, cTL(itemCdCaseList), xgetCValueItemCdCase(), "ITEM_CD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)} <br>
     * <pre>e.g. setItemCdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCdCase The value of itemCdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCdCase_LikeSearch(String itemCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCdCase), xgetCValueItemCdCase(), "ITEM_CD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCdCase_NotLikeSearch(String itemCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCdCase), xgetCValueItemCdCase(), "ITEM_CD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     * @param itemCdCase The value of itemCdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdCase_PrefixSearch(String itemCdCase) {
        setItemCdCase_LikeSearch(itemCdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     */
    public void setItemCdCase_IsNull() { regItemCdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     */
    public void setItemCdCase_IsNullOrEmpty() { regItemCdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_CD_CASE: {varchar(255)}
     */
    public void setItemCdCase_IsNotNull() { regItemCdCase(CK_ISNN, DOBJ); }

    protected void regItemCdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCdCase(), "ITEM_CD_CASE"); }
    protected abstract ConditionValue xgetCValueItemCdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_Equal(String itemSnameCase) {
        doSetItemSnameCase_Equal(fRES(itemSnameCase));
    }

    protected void doSetItemSnameCase_Equal(String itemSnameCase) {
        regItemSnameCase(CK_EQ, itemSnameCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_NotEqual(String itemSnameCase) {
        doSetItemSnameCase_NotEqual(fRES(itemSnameCase));
    }

    protected void doSetItemSnameCase_NotEqual(String itemSnameCase) {
        regItemSnameCase(CK_NES, itemSnameCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_GreaterThan(String itemSnameCase) {
        regItemSnameCase(CK_GT, fRES(itemSnameCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_LessThan(String itemSnameCase) {
        regItemSnameCase(CK_LT, fRES(itemSnameCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_GreaterEqual(String itemSnameCase) {
        regItemSnameCase(CK_GE, fRES(itemSnameCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_LessEqual(String itemSnameCase) {
        regItemSnameCase(CK_LE, fRES(itemSnameCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCaseList The collection of itemSnameCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_InScope(Collection<String> itemSnameCaseList) {
        doSetItemSnameCase_InScope(itemSnameCaseList);
    }

    protected void doSetItemSnameCase_InScope(Collection<String> itemSnameCaseList) {
        regINS(CK_INS, cTL(itemSnameCaseList), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCaseList The collection of itemSnameCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_NotInScope(Collection<String> itemSnameCaseList) {
        doSetItemSnameCase_NotInScope(itemSnameCaseList);
    }

    protected void doSetItemSnameCase_NotInScope(Collection<String> itemSnameCaseList) {
        regINS(CK_NINS, cTL(itemSnameCaseList), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)} <br>
     * <pre>e.g. setItemSnameCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSnameCase The value of itemSnameCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSnameCase_LikeSearch(String itemSnameCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSnameCase), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSnameCase_NotLikeSearch(String itemSnameCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSnameCase), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     * @param itemSnameCase The value of itemSnameCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_PrefixSearch(String itemSnameCase) {
        setItemSnameCase_LikeSearch(itemSnameCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     */
    public void setItemSnameCase_IsNull() { regItemSnameCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     */
    public void setItemSnameCase_IsNullOrEmpty() { regItemSnameCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {varchar(255)}
     */
    public void setItemSnameCase_IsNotNull() { regItemSnameCase(CK_ISNN, DOBJ); }

    protected void regItemSnameCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSnameCase(), "ITEM_SNAME_CASE"); }
    protected abstract ConditionValue xgetCValueItemSnameCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_Equal(String itemCdWh) {
        doSetItemCdWh_Equal(fRES(itemCdWh));
    }

    protected void doSetItemCdWh_Equal(String itemCdWh) {
        regItemCdWh(CK_EQ, itemCdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_NotEqual(String itemCdWh) {
        doSetItemCdWh_NotEqual(fRES(itemCdWh));
    }

    protected void doSetItemCdWh_NotEqual(String itemCdWh) {
        regItemCdWh(CK_NES, itemCdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_GreaterThan(String itemCdWh) {
        regItemCdWh(CK_GT, fRES(itemCdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_LessThan(String itemCdWh) {
        regItemCdWh(CK_LT, fRES(itemCdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_GreaterEqual(String itemCdWh) {
        regItemCdWh(CK_GE, fRES(itemCdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_LessEqual(String itemCdWh) {
        regItemCdWh(CK_LE, fRES(itemCdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWhList The collection of itemCdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_InScope(Collection<String> itemCdWhList) {
        doSetItemCdWh_InScope(itemCdWhList);
    }

    protected void doSetItemCdWh_InScope(Collection<String> itemCdWhList) {
        regINS(CK_INS, cTL(itemCdWhList), xgetCValueItemCdWh(), "ITEM_CD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWhList The collection of itemCdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_NotInScope(Collection<String> itemCdWhList) {
        doSetItemCdWh_NotInScope(itemCdWhList);
    }

    protected void doSetItemCdWh_NotInScope(Collection<String> itemCdWhList) {
        regINS(CK_NINS, cTL(itemCdWhList), xgetCValueItemCdWh(), "ITEM_CD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_WH: {varchar(255)} <br>
     * <pre>e.g. setItemCdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCdWh The value of itemCdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCdWh_LikeSearch(String itemCdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCdWh), xgetCValueItemCdWh(), "ITEM_CD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCdWh_NotLikeSearch(String itemCdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCdWh), xgetCValueItemCdWh(), "ITEM_CD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     * @param itemCdWh The value of itemCdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCdWh_PrefixSearch(String itemCdWh) {
        setItemCdWh_LikeSearch(itemCdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     */
    public void setItemCdWh_IsNull() { regItemCdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     */
    public void setItemCdWh_IsNullOrEmpty() { regItemCdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_CD_WH: {varchar(255)}
     */
    public void setItemCdWh_IsNotNull() { regItemCdWh(CK_ISNN, DOBJ); }

    protected void regItemCdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCdWh(), "ITEM_CD_WH"); }
    protected abstract ConditionValue xgetCValueItemCdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_Equal(String itemSnameWh) {
        doSetItemSnameWh_Equal(fRES(itemSnameWh));
    }

    protected void doSetItemSnameWh_Equal(String itemSnameWh) {
        regItemSnameWh(CK_EQ, itemSnameWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_NotEqual(String itemSnameWh) {
        doSetItemSnameWh_NotEqual(fRES(itemSnameWh));
    }

    protected void doSetItemSnameWh_NotEqual(String itemSnameWh) {
        regItemSnameWh(CK_NES, itemSnameWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_GreaterThan(String itemSnameWh) {
        regItemSnameWh(CK_GT, fRES(itemSnameWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_LessThan(String itemSnameWh) {
        regItemSnameWh(CK_LT, fRES(itemSnameWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_GreaterEqual(String itemSnameWh) {
        regItemSnameWh(CK_GE, fRES(itemSnameWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_LessEqual(String itemSnameWh) {
        regItemSnameWh(CK_LE, fRES(itemSnameWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWhList The collection of itemSnameWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_InScope(Collection<String> itemSnameWhList) {
        doSetItemSnameWh_InScope(itemSnameWhList);
    }

    protected void doSetItemSnameWh_InScope(Collection<String> itemSnameWhList) {
        regINS(CK_INS, cTL(itemSnameWhList), xgetCValueItemSnameWh(), "ITEM_SNAME_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWhList The collection of itemSnameWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_NotInScope(Collection<String> itemSnameWhList) {
        doSetItemSnameWh_NotInScope(itemSnameWhList);
    }

    protected void doSetItemSnameWh_NotInScope(Collection<String> itemSnameWhList) {
        regINS(CK_NINS, cTL(itemSnameWhList), xgetCValueItemSnameWh(), "ITEM_SNAME_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)} <br>
     * <pre>e.g. setItemSnameWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSnameWh The value of itemSnameWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSnameWh_LikeSearch(String itemSnameWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSnameWh), xgetCValueItemSnameWh(), "ITEM_SNAME_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSnameWh_NotLikeSearch(String itemSnameWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSnameWh), xgetCValueItemSnameWh(), "ITEM_SNAME_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     * @param itemSnameWh The value of itemSnameWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_PrefixSearch(String itemSnameWh) {
        setItemSnameWh_LikeSearch(itemSnameWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     */
    public void setItemSnameWh_IsNull() { regItemSnameWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     */
    public void setItemSnameWh_IsNullOrEmpty() { regItemSnameWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {varchar(255)}
     */
    public void setItemSnameWh_IsNotNull() { regItemSnameWh(CK_ISNN, DOBJ); }

    protected void regItemSnameWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSnameWh(), "ITEM_SNAME_WH"); }
    protected abstract ConditionValue xgetCValueItemSnameWh();

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
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_Equal(String machineNo) {
        doSetMachineNo_Equal(fRES(machineNo));
    }

    protected void doSetMachineNo_Equal(String machineNo) {
        regMachineNo(CK_EQ, machineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_NotEqual(String machineNo) {
        doSetMachineNo_NotEqual(fRES(machineNo));
    }

    protected void doSetMachineNo_NotEqual(String machineNo) {
        regMachineNo(CK_NES, machineNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_GreaterThan(String machineNo) {
        regMachineNo(CK_GT, fRES(machineNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_LessThan(String machineNo) {
        regMachineNo(CK_LT, fRES(machineNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_GreaterEqual(String machineNo) {
        regMachineNo(CK_GE, fRES(machineNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_LessEqual(String machineNo) {
        regMachineNo(CK_LE, fRES(machineNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNoList The collection of machineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_InScope(Collection<String> machineNoList) {
        doSetMachineNo_InScope(machineNoList);
    }

    protected void doSetMachineNo_InScope(Collection<String> machineNoList) {
        regINS(CK_INS, cTL(machineNoList), xgetCValueMachineNo(), "MACHINE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNoList The collection of machineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_NotInScope(Collection<String> machineNoList) {
        doSetMachineNo_NotInScope(machineNoList);
    }

    protected void doSetMachineNo_NotInScope(Collection<String> machineNoList) {
        regINS(CK_NINS, cTL(machineNoList), xgetCValueMachineNo(), "MACHINE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINE_NO: {varchar(255)} <br>
     * <pre>e.g. setMachineNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machineNo The value of machineNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachineNo_LikeSearch(String machineNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machineNo), xgetCValueMachineNo(), "MACHINE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachineNo_NotLikeSearch(String machineNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machineNo), xgetCValueMachineNo(), "MACHINE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     * @param machineNo The value of machineNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineNo_PrefixSearch(String machineNo) {
        setMachineNo_LikeSearch(machineNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     */
    public void setMachineNo_IsNull() { regMachineNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     */
    public void setMachineNo_IsNullOrEmpty() { regMachineNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHINE_NO: {varchar(255)}
     */
    public void setMachineNo_IsNotNull() { regMachineNo(CK_ISNN, DOBJ); }

    protected void regMachineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachineNo(), "MACHINE_NO"); }
    protected abstract ConditionValue xgetCValueMachineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_Equal(String createNo) {
        doSetCreateNo_Equal(fRES(createNo));
    }

    protected void doSetCreateNo_Equal(String createNo) {
        regCreateNo(CK_EQ, createNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_NotEqual(String createNo) {
        doSetCreateNo_NotEqual(fRES(createNo));
    }

    protected void doSetCreateNo_NotEqual(String createNo) {
        regCreateNo(CK_NES, createNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_GreaterThan(String createNo) {
        regCreateNo(CK_GT, fRES(createNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_LessThan(String createNo) {
        regCreateNo(CK_LT, fRES(createNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_GreaterEqual(String createNo) {
        regCreateNo(CK_GE, fRES(createNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_LessEqual(String createNo) {
        regCreateNo(CK_LE, fRES(createNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNoList The collection of createNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_InScope(Collection<String> createNoList) {
        doSetCreateNo_InScope(createNoList);
    }

    protected void doSetCreateNo_InScope(Collection<String> createNoList) {
        regINS(CK_INS, cTL(createNoList), xgetCValueCreateNo(), "CREATE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNoList The collection of createNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_NotInScope(Collection<String> createNoList) {
        doSetCreateNo_NotInScope(createNoList);
    }

    protected void doSetCreateNo_NotInScope(Collection<String> createNoList) {
        regINS(CK_NINS, cTL(createNoList), xgetCValueCreateNo(), "CREATE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_NO: {varchar(255)} <br>
     * <pre>e.g. setCreateNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createNo The value of createNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateNo_LikeSearch(String createNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createNo), xgetCValueCreateNo(), "CREATE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateNo_NotLikeSearch(String createNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createNo), xgetCValueCreateNo(), "CREATE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_NO: {varchar(255)}
     * @param createNo The value of createNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateNo_PrefixSearch(String createNo) {
        setCreateNo_LikeSearch(createNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     */
    public void setCreateNo_IsNull() { regCreateNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     */
    public void setCreateNo_IsNullOrEmpty() { regCreateNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATE_NO: {varchar(255)}
     */
    public void setCreateNo_IsNotNull() { regCreateNo(CK_ISNN, DOBJ); }

    protected void regCreateNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateNo(), "CREATE_NO"); }
    protected abstract ConditionValue xgetCValueCreateNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_Equal(String limitDateNow) {
        doSetLimitDateNow_Equal(fRES(limitDateNow));
    }

    protected void doSetLimitDateNow_Equal(String limitDateNow) {
        regLimitDateNow(CK_EQ, limitDateNow);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_NotEqual(String limitDateNow) {
        doSetLimitDateNow_NotEqual(fRES(limitDateNow));
    }

    protected void doSetLimitDateNow_NotEqual(String limitDateNow) {
        regLimitDateNow(CK_NES, limitDateNow);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_GreaterThan(String limitDateNow) {
        regLimitDateNow(CK_GT, fRES(limitDateNow));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_LessThan(String limitDateNow) {
        regLimitDateNow(CK_LT, fRES(limitDateNow));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_GreaterEqual(String limitDateNow) {
        regLimitDateNow(CK_GE, fRES(limitDateNow));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_LessEqual(String limitDateNow) {
        regLimitDateNow(CK_LE, fRES(limitDateNow));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNowList The collection of limitDateNow as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_InScope(Collection<String> limitDateNowList) {
        doSetLimitDateNow_InScope(limitDateNowList);
    }

    protected void doSetLimitDateNow_InScope(Collection<String> limitDateNowList) {
        regINS(CK_INS, cTL(limitDateNowList), xgetCValueLimitDateNow(), "LIMIT_DATE_NOW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNowList The collection of limitDateNow as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_NotInScope(Collection<String> limitDateNowList) {
        doSetLimitDateNow_NotInScope(limitDateNowList);
    }

    protected void doSetLimitDateNow_NotInScope(Collection<String> limitDateNowList) {
        regINS(CK_NINS, cTL(limitDateNowList), xgetCValueLimitDateNow(), "LIMIT_DATE_NOW");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)} <br>
     * <pre>e.g. setLimitDateNow_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDateNow The value of limitDateNow as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDateNow_LikeSearch(String limitDateNow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDateNow), xgetCValueLimitDateNow(), "LIMIT_DATE_NOW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDateNow_NotLikeSearch(String limitDateNow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDateNow), xgetCValueLimitDateNow(), "LIMIT_DATE_NOW", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     * @param limitDateNow The value of limitDateNow as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDateNow_PrefixSearch(String limitDateNow) {
        setLimitDateNow_LikeSearch(limitDateNow, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     */
    public void setLimitDateNow_IsNull() { regLimitDateNow(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     */
    public void setLimitDateNow_IsNullOrEmpty() { regLimitDateNow(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE_NOW: {varchar(255)}
     */
    public void setLimitDateNow_IsNotNull() { regLimitDateNow(CK_ISNN, DOBJ); }

    protected void regLimitDateNow(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDateNow(), "LIMIT_DATE_NOW"); }
    protected abstract ConditionValue xgetCValueLimitDateNow();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_Equal(String designCdCase) {
        doSetDesignCdCase_Equal(fRES(designCdCase));
    }

    protected void doSetDesignCdCase_Equal(String designCdCase) {
        regDesignCdCase(CK_EQ, designCdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_NotEqual(String designCdCase) {
        doSetDesignCdCase_NotEqual(fRES(designCdCase));
    }

    protected void doSetDesignCdCase_NotEqual(String designCdCase) {
        regDesignCdCase(CK_NES, designCdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_GreaterThan(String designCdCase) {
        regDesignCdCase(CK_GT, fRES(designCdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_LessThan(String designCdCase) {
        regDesignCdCase(CK_LT, fRES(designCdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_GreaterEqual(String designCdCase) {
        regDesignCdCase(CK_GE, fRES(designCdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_LessEqual(String designCdCase) {
        regDesignCdCase(CK_LE, fRES(designCdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCaseList The collection of designCdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_InScope(Collection<String> designCdCaseList) {
        doSetDesignCdCase_InScope(designCdCaseList);
    }

    protected void doSetDesignCdCase_InScope(Collection<String> designCdCaseList) {
        regINS(CK_INS, cTL(designCdCaseList), xgetCValueDesignCdCase(), "DESIGN_CD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCaseList The collection of designCdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_NotInScope(Collection<String> designCdCaseList) {
        doSetDesignCdCase_NotInScope(designCdCaseList);
    }

    protected void doSetDesignCdCase_NotInScope(Collection<String> designCdCaseList) {
        regINS(CK_NINS, cTL(designCdCaseList), xgetCValueDesignCdCase(), "DESIGN_CD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)} <br>
     * <pre>e.g. setDesignCdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designCdCase The value of designCdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignCdCase_LikeSearch(String designCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designCdCase), xgetCValueDesignCdCase(), "DESIGN_CD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignCdCase_NotLikeSearch(String designCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designCdCase), xgetCValueDesignCdCase(), "DESIGN_CD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     * @param designCdCase The value of designCdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCdCase_PrefixSearch(String designCdCase) {
        setDesignCdCase_LikeSearch(designCdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     */
    public void setDesignCdCase_IsNull() { regDesignCdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     */
    public void setDesignCdCase_IsNullOrEmpty() { regDesignCdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD_CASE: {varchar(255)}
     */
    public void setDesignCdCase_IsNotNull() { regDesignCdCase(CK_ISNN, DOBJ); }

    protected void regDesignCdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignCdCase(), "DESIGN_CD_CASE"); }
    protected abstract ConditionValue xgetCValueDesignCdCase();

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
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_Equal(String manufactureCd) {
        doSetManufactureCd_Equal(fRES(manufactureCd));
    }

    protected void doSetManufactureCd_Equal(String manufactureCd) {
        regManufactureCd(CK_EQ, manufactureCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_NotEqual(String manufactureCd) {
        doSetManufactureCd_NotEqual(fRES(manufactureCd));
    }

    protected void doSetManufactureCd_NotEqual(String manufactureCd) {
        regManufactureCd(CK_NES, manufactureCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_GreaterThan(String manufactureCd) {
        regManufactureCd(CK_GT, fRES(manufactureCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_LessThan(String manufactureCd) {
        regManufactureCd(CK_LT, fRES(manufactureCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_GreaterEqual(String manufactureCd) {
        regManufactureCd(CK_GE, fRES(manufactureCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_LessEqual(String manufactureCd) {
        regManufactureCd(CK_LE, fRES(manufactureCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCdList The collection of manufactureCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_InScope(Collection<String> manufactureCdList) {
        doSetManufactureCd_InScope(manufactureCdList);
    }

    protected void doSetManufactureCd_InScope(Collection<String> manufactureCdList) {
        regINS(CK_INS, cTL(manufactureCdList), xgetCValueManufactureCd(), "MANUFACTURE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCdList The collection of manufactureCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_NotInScope(Collection<String> manufactureCdList) {
        doSetManufactureCd_NotInScope(manufactureCdList);
    }

    protected void doSetManufactureCd_NotInScope(Collection<String> manufactureCdList) {
        regINS(CK_NINS, cTL(manufactureCdList), xgetCValueManufactureCd(), "MANUFACTURE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)} <br>
     * <pre>e.g. setManufactureCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufactureCd The value of manufactureCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufactureCd_LikeSearch(String manufactureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufactureCd), xgetCValueManufactureCd(), "MANUFACTURE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufactureCd_NotLikeSearch(String manufactureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufactureCd), xgetCValueManufactureCd(), "MANUFACTURE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     * @param manufactureCd The value of manufactureCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufactureCd_PrefixSearch(String manufactureCd) {
        setManufactureCd_LikeSearch(manufactureCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     */
    public void setManufactureCd_IsNull() { regManufactureCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     */
    public void setManufactureCd_IsNullOrEmpty() { regManufactureCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURE_CD: {varchar(255)}
     */
    public void setManufactureCd_IsNotNull() { regManufactureCd(CK_ISNN, DOBJ); }

    protected void regManufactureCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufactureCd(), "MANUFACTURE_CD"); }
    protected abstract ConditionValue xgetCValueManufactureCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_Equal(String otherLot1) {
        doSetOtherLot1_Equal(fRES(otherLot1));
    }

    protected void doSetOtherLot1_Equal(String otherLot1) {
        regOtherLot1(CK_EQ, otherLot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_NotEqual(String otherLot1) {
        doSetOtherLot1_NotEqual(fRES(otherLot1));
    }

    protected void doSetOtherLot1_NotEqual(String otherLot1) {
        regOtherLot1(CK_NES, otherLot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_GreaterThan(String otherLot1) {
        regOtherLot1(CK_GT, fRES(otherLot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_LessThan(String otherLot1) {
        regOtherLot1(CK_LT, fRES(otherLot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_GreaterEqual(String otherLot1) {
        regOtherLot1(CK_GE, fRES(otherLot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_LessEqual(String otherLot1) {
        regOtherLot1(CK_LE, fRES(otherLot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1List The collection of otherLot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_InScope(Collection<String> otherLot1List) {
        doSetOtherLot1_InScope(otherLot1List);
    }

    protected void doSetOtherLot1_InScope(Collection<String> otherLot1List) {
        regINS(CK_INS, cTL(otherLot1List), xgetCValueOtherLot1(), "OTHER_LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1List The collection of otherLot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_NotInScope(Collection<String> otherLot1List) {
        doSetOtherLot1_NotInScope(otherLot1List);
    }

    protected void doSetOtherLot1_NotInScope(Collection<String> otherLot1List) {
        regINS(CK_NINS, cTL(otherLot1List), xgetCValueOtherLot1(), "OTHER_LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER_LOT1: {varchar(255)} <br>
     * <pre>e.g. setOtherLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherLot1 The value of otherLot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherLot1_LikeSearch(String otherLot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherLot1), xgetCValueOtherLot1(), "OTHER_LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherLot1_NotLikeSearch(String otherLot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherLot1), xgetCValueOtherLot1(), "OTHER_LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     * @param otherLot1 The value of otherLot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherLot1_PrefixSearch(String otherLot1) {
        setOtherLot1_LikeSearch(otherLot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     */
    public void setOtherLot1_IsNull() { regOtherLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     */
    public void setOtherLot1_IsNullOrEmpty() { regOtherLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER_LOT1: {varchar(255)}
     */
    public void setOtherLot1_IsNotNull() { regOtherLot1(CK_ISNN, DOBJ); }

    protected void regOtherLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherLot1(), "OTHER_LOT1"); }
    protected abstract ConditionValue xgetCValueOtherLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_Equal(String caseCreateType) {
        doSetCaseCreateType_Equal(fRES(caseCreateType));
    }

    protected void doSetCaseCreateType_Equal(String caseCreateType) {
        regCaseCreateType(CK_EQ, caseCreateType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_NotEqual(String caseCreateType) {
        doSetCaseCreateType_NotEqual(fRES(caseCreateType));
    }

    protected void doSetCaseCreateType_NotEqual(String caseCreateType) {
        regCaseCreateType(CK_NES, caseCreateType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_GreaterThan(String caseCreateType) {
        regCaseCreateType(CK_GT, fRES(caseCreateType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_LessThan(String caseCreateType) {
        regCaseCreateType(CK_LT, fRES(caseCreateType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_GreaterEqual(String caseCreateType) {
        regCaseCreateType(CK_GE, fRES(caseCreateType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_LessEqual(String caseCreateType) {
        regCaseCreateType(CK_LE, fRES(caseCreateType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateTypeList The collection of caseCreateType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_InScope(Collection<String> caseCreateTypeList) {
        doSetCaseCreateType_InScope(caseCreateTypeList);
    }

    protected void doSetCaseCreateType_InScope(Collection<String> caseCreateTypeList) {
        regINS(CK_INS, cTL(caseCreateTypeList), xgetCValueCaseCreateType(), "CASE_CREATE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateTypeList The collection of caseCreateType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_NotInScope(Collection<String> caseCreateTypeList) {
        doSetCaseCreateType_NotInScope(caseCreateTypeList);
    }

    protected void doSetCaseCreateType_NotInScope(Collection<String> caseCreateTypeList) {
        regINS(CK_NINS, cTL(caseCreateTypeList), xgetCValueCaseCreateType(), "CASE_CREATE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setCaseCreateType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseCreateType The value of caseCreateType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseCreateType_LikeSearch(String caseCreateType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseCreateType), xgetCValueCaseCreateType(), "CASE_CREATE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseCreateType_NotLikeSearch(String caseCreateType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseCreateType), xgetCValueCaseCreateType(), "CASE_CREATE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     * @param caseCreateType The value of caseCreateType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCreateType_PrefixSearch(String caseCreateType) {
        setCaseCreateType_LikeSearch(caseCreateType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     */
    public void setCaseCreateType_IsNull() { regCaseCreateType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     */
    public void setCaseCreateType_IsNullOrEmpty() { regCaseCreateType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_CREATE_TYPE: {varchar(255)}
     */
    public void setCaseCreateType_IsNotNull() { regCaseCreateType(CK_ISNN, DOBJ); }

    protected void regCaseCreateType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCreateType(), "CASE_CREATE_TYPE"); }
    protected abstract ConditionValue xgetCValueCaseCreateType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_Equal(String codeSname) {
        doSetCodeSname_Equal(fRES(codeSname));
    }

    protected void doSetCodeSname_Equal(String codeSname) {
        regCodeSname(CK_EQ, codeSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_NotEqual(String codeSname) {
        doSetCodeSname_NotEqual(fRES(codeSname));
    }

    protected void doSetCodeSname_NotEqual(String codeSname) {
        regCodeSname(CK_NES, codeSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_GreaterThan(String codeSname) {
        regCodeSname(CK_GT, fRES(codeSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_LessThan(String codeSname) {
        regCodeSname(CK_LT, fRES(codeSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_GreaterEqual(String codeSname) {
        regCodeSname(CK_GE, fRES(codeSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_LessEqual(String codeSname) {
        regCodeSname(CK_LE, fRES(codeSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSnameList The collection of codeSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_InScope(Collection<String> codeSnameList) {
        doSetCodeSname_InScope(codeSnameList);
    }

    protected void doSetCodeSname_InScope(Collection<String> codeSnameList) {
        regINS(CK_INS, cTL(codeSnameList), xgetCValueCodeSname(), "CODE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSnameList The collection of codeSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_NotInScope(Collection<String> codeSnameList) {
        doSetCodeSname_NotInScope(codeSnameList);
    }

    protected void doSetCodeSname_NotInScope(Collection<String> codeSnameList) {
        regINS(CK_NINS, cTL(codeSnameList), xgetCValueCodeSname(), "CODE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CODE_SNAME: {varchar(255)} <br>
     * <pre>e.g. setCodeSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param codeSname The value of codeSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCodeSname_LikeSearch(String codeSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(codeSname), xgetCValueCodeSname(), "CODE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCodeSname_NotLikeSearch(String codeSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(codeSname), xgetCValueCodeSname(), "CODE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     * @param codeSname The value of codeSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodeSname_PrefixSearch(String codeSname) {
        setCodeSname_LikeSearch(codeSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     */
    public void setCodeSname_IsNull() { regCodeSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     */
    public void setCodeSname_IsNullOrEmpty() { regCodeSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CODE_SNAME: {varchar(255)}
     */
    public void setCodeSname_IsNotNull() { regCodeSname(CK_ISNN, DOBJ); }

    protected void regCodeSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodeSname(), "CODE_SNAME"); }
    protected abstract ConditionValue xgetCValueCodeSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_Equal(String receiveDate) {
        doSetReceiveDate_Equal(fRES(receiveDate));
    }

    protected void doSetReceiveDate_Equal(String receiveDate) {
        regReceiveDate(CK_EQ, receiveDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_NotEqual(String receiveDate) {
        doSetReceiveDate_NotEqual(fRES(receiveDate));
    }

    protected void doSetReceiveDate_NotEqual(String receiveDate) {
        regReceiveDate(CK_NES, receiveDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_GreaterThan(String receiveDate) {
        regReceiveDate(CK_GT, fRES(receiveDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_LessThan(String receiveDate) {
        regReceiveDate(CK_LT, fRES(receiveDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_GreaterEqual(String receiveDate) {
        regReceiveDate(CK_GE, fRES(receiveDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_LessEqual(String receiveDate) {
        regReceiveDate(CK_LE, fRES(receiveDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDateList The collection of receiveDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_InScope(Collection<String> receiveDateList) {
        doSetReceiveDate_InScope(receiveDateList);
    }

    protected void doSetReceiveDate_InScope(Collection<String> receiveDateList) {
        regINS(CK_INS, cTL(receiveDateList), xgetCValueReceiveDate(), "RECEIVE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDateList The collection of receiveDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_NotInScope(Collection<String> receiveDateList) {
        doSetReceiveDate_NotInScope(receiveDateList);
    }

    protected void doSetReceiveDate_NotInScope(Collection<String> receiveDateList) {
        regINS(CK_NINS, cTL(receiveDateList), xgetCValueReceiveDate(), "RECEIVE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(255)} <br>
     * <pre>e.g. setReceiveDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveDate The value of receiveDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveDate_LikeSearch(String receiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveDate), xgetCValueReceiveDate(), "RECEIVE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveDate_NotLikeSearch(String receiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveDate), xgetCValueReceiveDate(), "RECEIVE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     * @param receiveDate The value of receiveDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_PrefixSearch(String receiveDate) {
        setReceiveDate_LikeSearch(receiveDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     */
    public void setReceiveDate_IsNull() { regReceiveDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     */
    public void setReceiveDate_IsNullOrEmpty() { regReceiveDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(255)}
     */
    public void setReceiveDate_IsNotNull() { regReceiveDate(CK_ISNN, DOBJ); }

    protected void regReceiveDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDate(), "RECEIVE_DATE"); }
    protected abstract ConditionValue xgetCValueReceiveDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_Equal(String arrivalPortDate) {
        doSetArrivalPortDate_Equal(fRES(arrivalPortDate));
    }

    protected void doSetArrivalPortDate_Equal(String arrivalPortDate) {
        regArrivalPortDate(CK_EQ, arrivalPortDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_NotEqual(String arrivalPortDate) {
        doSetArrivalPortDate_NotEqual(fRES(arrivalPortDate));
    }

    protected void doSetArrivalPortDate_NotEqual(String arrivalPortDate) {
        regArrivalPortDate(CK_NES, arrivalPortDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_GreaterThan(String arrivalPortDate) {
        regArrivalPortDate(CK_GT, fRES(arrivalPortDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_LessThan(String arrivalPortDate) {
        regArrivalPortDate(CK_LT, fRES(arrivalPortDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_GreaterEqual(String arrivalPortDate) {
        regArrivalPortDate(CK_GE, fRES(arrivalPortDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_LessEqual(String arrivalPortDate) {
        regArrivalPortDate(CK_LE, fRES(arrivalPortDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDateList The collection of arrivalPortDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_InScope(Collection<String> arrivalPortDateList) {
        doSetArrivalPortDate_InScope(arrivalPortDateList);
    }

    protected void doSetArrivalPortDate_InScope(Collection<String> arrivalPortDateList) {
        regINS(CK_INS, cTL(arrivalPortDateList), xgetCValueArrivalPortDate(), "ARRIVAL_PORT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDateList The collection of arrivalPortDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_NotInScope(Collection<String> arrivalPortDateList) {
        doSetArrivalPortDate_NotInScope(arrivalPortDateList);
    }

    protected void doSetArrivalPortDate_NotInScope(Collection<String> arrivalPortDateList) {
        regINS(CK_NINS, cTL(arrivalPortDateList), xgetCValueArrivalPortDate(), "ARRIVAL_PORT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)} <br>
     * <pre>e.g. setArrivalPortDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalPortDate The value of arrivalPortDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalPortDate_LikeSearch(String arrivalPortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalPortDate), xgetCValueArrivalPortDate(), "ARRIVAL_PORT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalPortDate_NotLikeSearch(String arrivalPortDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalPortDate), xgetCValueArrivalPortDate(), "ARRIVAL_PORT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     * @param arrivalPortDate The value of arrivalPortDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalPortDate_PrefixSearch(String arrivalPortDate) {
        setArrivalPortDate_LikeSearch(arrivalPortDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     */
    public void setArrivalPortDate_IsNull() { regArrivalPortDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     */
    public void setArrivalPortDate_IsNullOrEmpty() { regArrivalPortDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_PORT_DATE: {varchar(255)}
     */
    public void setArrivalPortDate_IsNotNull() { regArrivalPortDate(CK_ISNN, DOBJ); }

    protected void regArrivalPortDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalPortDate(), "ARRIVAL_PORT_DATE"); }
    protected abstract ConditionValue xgetCValueArrivalPortDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_Equal(String shipName) {
        doSetShipName_Equal(fRES(shipName));
    }

    protected void doSetShipName_Equal(String shipName) {
        regShipName(CK_EQ, shipName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_NotEqual(String shipName) {
        doSetShipName_NotEqual(fRES(shipName));
    }

    protected void doSetShipName_NotEqual(String shipName) {
        regShipName(CK_NES, shipName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_GreaterThan(String shipName) {
        regShipName(CK_GT, fRES(shipName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_LessThan(String shipName) {
        regShipName(CK_LT, fRES(shipName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_GreaterEqual(String shipName) {
        regShipName(CK_GE, fRES(shipName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_LessEqual(String shipName) {
        regShipName(CK_LE, fRES(shipName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipNameList The collection of shipName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_InScope(Collection<String> shipNameList) {
        doSetShipName_InScope(shipNameList);
    }

    protected void doSetShipName_InScope(Collection<String> shipNameList) {
        regINS(CK_INS, cTL(shipNameList), xgetCValueShipName(), "SHIP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipNameList The collection of shipName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_NotInScope(Collection<String> shipNameList) {
        doSetShipName_NotInScope(shipNameList);
    }

    protected void doSetShipName_NotInScope(Collection<String> shipNameList) {
        regINS(CK_NINS, cTL(shipNameList), xgetCValueShipName(), "SHIP_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)} <br>
     * <pre>e.g. setShipName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipName The value of shipName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipName_LikeSearch(String shipName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipName), xgetCValueShipName(), "SHIP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipName_NotLikeSearch(String shipName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipName), xgetCValueShipName(), "SHIP_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     * @param shipName The value of shipName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipName_PrefixSearch(String shipName) {
        setShipName_LikeSearch(shipName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNull() { regShipName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNullOrEmpty() { regShipName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_NAME: {varchar(255)}
     */
    public void setShipName_IsNotNull() { regShipName(CK_ISNN, DOBJ); }

    protected void regShipName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipName(), "SHIP_NAME"); }
    protected abstract ConditionValue xgetCValueShipName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_Equal(String initNum) {
        doSetInitNum_Equal(fRES(initNum));
    }

    protected void doSetInitNum_Equal(String initNum) {
        regInitNum(CK_EQ, initNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_NotEqual(String initNum) {
        doSetInitNum_NotEqual(fRES(initNum));
    }

    protected void doSetInitNum_NotEqual(String initNum) {
        regInitNum(CK_NES, initNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_GreaterThan(String initNum) {
        regInitNum(CK_GT, fRES(initNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_LessThan(String initNum) {
        regInitNum(CK_LT, fRES(initNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_GreaterEqual(String initNum) {
        regInitNum(CK_GE, fRES(initNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_LessEqual(String initNum) {
        regInitNum(CK_LE, fRES(initNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNumList The collection of initNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_InScope(Collection<String> initNumList) {
        doSetInitNum_InScope(initNumList);
    }

    protected void doSetInitNum_InScope(Collection<String> initNumList) {
        regINS(CK_INS, cTL(initNumList), xgetCValueInitNum(), "INIT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNumList The collection of initNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_NotInScope(Collection<String> initNumList) {
        doSetInitNum_NotInScope(initNumList);
    }

    protected void doSetInitNum_NotInScope(Collection<String> initNumList) {
        regINS(CK_NINS, cTL(initNumList), xgetCValueInitNum(), "INIT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)} <br>
     * <pre>e.g. setInitNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param initNum The value of initNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInitNum_LikeSearch(String initNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(initNum), xgetCValueInitNum(), "INIT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInitNum_NotLikeSearch(String initNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(initNum), xgetCValueInitNum(), "INIT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INIT_NUM: {varchar(255)}
     * @param initNum The value of initNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitNum_PrefixSearch(String initNum) {
        setInitNum_LikeSearch(initNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNull() { regInitNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNullOrEmpty() { regInitNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INIT_NUM: {varchar(255)}
     */
    public void setInitNum_IsNotNull() { regInitNum(CK_ISNN, DOBJ); }

    protected void regInitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitNum(), "INIT_NUM"); }
    protected abstract ConditionValue xgetCValueInitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_Equal(String mixedFlg) {
        doSetMixedFlg_Equal(fRES(mixedFlg));
    }

    protected void doSetMixedFlg_Equal(String mixedFlg) {
        regMixedFlg(CK_EQ, mixedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_NotEqual(String mixedFlg) {
        doSetMixedFlg_NotEqual(fRES(mixedFlg));
    }

    protected void doSetMixedFlg_NotEqual(String mixedFlg) {
        regMixedFlg(CK_NES, mixedFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_GreaterThan(String mixedFlg) {
        regMixedFlg(CK_GT, fRES(mixedFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_LessThan(String mixedFlg) {
        regMixedFlg(CK_LT, fRES(mixedFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_GreaterEqual(String mixedFlg) {
        regMixedFlg(CK_GE, fRES(mixedFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_LessEqual(String mixedFlg) {
        regMixedFlg(CK_LE, fRES(mixedFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlgList The collection of mixedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_InScope(Collection<String> mixedFlgList) {
        doSetMixedFlg_InScope(mixedFlgList);
    }

    protected void doSetMixedFlg_InScope(Collection<String> mixedFlgList) {
        regINS(CK_INS, cTL(mixedFlgList), xgetCValueMixedFlg(), "MIXED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlgList The collection of mixedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_NotInScope(Collection<String> mixedFlgList) {
        doSetMixedFlg_NotInScope(mixedFlgList);
    }

    protected void doSetMixedFlg_NotInScope(Collection<String> mixedFlgList) {
        regINS(CK_NINS, cTL(mixedFlgList), xgetCValueMixedFlg(), "MIXED_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {varchar(255)} <br>
     * <pre>e.g. setMixedFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mixedFlg The value of mixedFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMixedFlg_LikeSearch(String mixedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mixedFlg), xgetCValueMixedFlg(), "MIXED_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMixedFlg_NotLikeSearch(String mixedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mixedFlg), xgetCValueMixedFlg(), "MIXED_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     * @param mixedFlg The value of mixedFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_PrefixSearch(String mixedFlg) {
        setMixedFlg_LikeSearch(mixedFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     */
    public void setMixedFlg_IsNull() { regMixedFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     */
    public void setMixedFlg_IsNullOrEmpty() { regMixedFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIXED_FLG: {varchar(255)}
     */
    public void setMixedFlg_IsNotNull() { regMixedFlg(CK_ISNN, DOBJ); }

    protected void regMixedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedFlg(), "MIXED_FLG"); }
    protected abstract ConditionValue xgetCValueMixedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_Equal(String lendFlg) {
        doSetLendFlg_Equal(fRES(lendFlg));
    }

    protected void doSetLendFlg_Equal(String lendFlg) {
        regLendFlg(CK_EQ, lendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_NotEqual(String lendFlg) {
        doSetLendFlg_NotEqual(fRES(lendFlg));
    }

    protected void doSetLendFlg_NotEqual(String lendFlg) {
        regLendFlg(CK_NES, lendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_GreaterThan(String lendFlg) {
        regLendFlg(CK_GT, fRES(lendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_LessThan(String lendFlg) {
        regLendFlg(CK_LT, fRES(lendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_GreaterEqual(String lendFlg) {
        regLendFlg(CK_GE, fRES(lendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_LessEqual(String lendFlg) {
        regLendFlg(CK_LE, fRES(lendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlgList The collection of lendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_InScope(Collection<String> lendFlgList) {
        doSetLendFlg_InScope(lendFlgList);
    }

    protected void doSetLendFlg_InScope(Collection<String> lendFlgList) {
        regINS(CK_INS, cTL(lendFlgList), xgetCValueLendFlg(), "LEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlgList The collection of lendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_NotInScope(Collection<String> lendFlgList) {
        doSetLendFlg_NotInScope(lendFlgList);
    }

    protected void doSetLendFlg_NotInScope(Collection<String> lendFlgList) {
        regINS(CK_NINS, cTL(lendFlgList), xgetCValueLendFlg(), "LEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LEND_FLG: {varchar(255)} <br>
     * <pre>e.g. setLendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lendFlg The value of lendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLendFlg_LikeSearch(String lendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lendFlg), xgetCValueLendFlg(), "LEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLendFlg_NotLikeSearch(String lendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lendFlg), xgetCValueLendFlg(), "LEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LEND_FLG: {varchar(255)}
     * @param lendFlg The value of lendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendFlg_PrefixSearch(String lendFlg) {
        setLendFlg_LikeSearch(lendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     */
    public void setLendFlg_IsNull() { regLendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     */
    public void setLendFlg_IsNullOrEmpty() { regLendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LEND_FLG: {varchar(255)}
     */
    public void setLendFlg_IsNotNull() { regLendFlg(CK_ISNN, DOBJ); }

    protected void regLendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLendFlg(), "LEND_FLG"); }
    protected abstract ConditionValue xgetCValueLendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_Equal(String locGroup) {
        doSetLocGroup_Equal(fRES(locGroup));
    }

    protected void doSetLocGroup_Equal(String locGroup) {
        regLocGroup(CK_EQ, locGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_NotEqual(String locGroup) {
        doSetLocGroup_NotEqual(fRES(locGroup));
    }

    protected void doSetLocGroup_NotEqual(String locGroup) {
        regLocGroup(CK_NES, locGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_GreaterThan(String locGroup) {
        regLocGroup(CK_GT, fRES(locGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_LessThan(String locGroup) {
        regLocGroup(CK_LT, fRES(locGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_GreaterEqual(String locGroup) {
        regLocGroup(CK_GE, fRES(locGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_LessEqual(String locGroup) {
        regLocGroup(CK_LE, fRES(locGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroupList The collection of locGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_InScope(Collection<String> locGroupList) {
        doSetLocGroup_InScope(locGroupList);
    }

    protected void doSetLocGroup_InScope(Collection<String> locGroupList) {
        regINS(CK_INS, cTL(locGroupList), xgetCValueLocGroup(), "LOC_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroupList The collection of locGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_NotInScope(Collection<String> locGroupList) {
        doSetLocGroup_NotInScope(locGroupList);
    }

    protected void doSetLocGroup_NotInScope(Collection<String> locGroupList) {
        regINS(CK_NINS, cTL(locGroupList), xgetCValueLocGroup(), "LOC_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_GROUP: {varchar(255)} <br>
     * <pre>e.g. setLocGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locGroup The value of locGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocGroup_LikeSearch(String locGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locGroup), xgetCValueLocGroup(), "LOC_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocGroup_NotLikeSearch(String locGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locGroup), xgetCValueLocGroup(), "LOC_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     * @param locGroup The value of locGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocGroup_PrefixSearch(String locGroup) {
        setLocGroup_LikeSearch(locGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     */
    public void setLocGroup_IsNull() { regLocGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     */
    public void setLocGroup_IsNullOrEmpty() { regLocGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_GROUP: {varchar(255)}
     */
    public void setLocGroup_IsNotNull() { regLocGroup(CK_ISNN, DOBJ); }

    protected void regLocGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocGroup(), "LOC_GROUP"); }
    protected abstract ConditionValue xgetCValueLocGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_Equal(String locCd) {
        doSetLocCd_Equal(fRES(locCd));
    }

    protected void doSetLocCd_Equal(String locCd) {
        regLocCd(CK_EQ, locCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_NotEqual(String locCd) {
        doSetLocCd_NotEqual(fRES(locCd));
    }

    protected void doSetLocCd_NotEqual(String locCd) {
        regLocCd(CK_NES, locCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_GreaterThan(String locCd) {
        regLocCd(CK_GT, fRES(locCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_LessThan(String locCd) {
        regLocCd(CK_LT, fRES(locCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_GreaterEqual(String locCd) {
        regLocCd(CK_GE, fRES(locCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_LessEqual(String locCd) {
        regLocCd(CK_LE, fRES(locCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCdList The collection of locCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_InScope(Collection<String> locCdList) {
        doSetLocCd_InScope(locCdList);
    }

    protected void doSetLocCd_InScope(Collection<String> locCdList) {
        regINS(CK_INS, cTL(locCdList), xgetCValueLocCd(), "LOC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCdList The collection of locCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_NotInScope(Collection<String> locCdList) {
        doSetLocCd_NotInScope(locCdList);
    }

    protected void doSetLocCd_NotInScope(Collection<String> locCdList) {
        regINS(CK_NINS, cTL(locCdList), xgetCValueLocCd(), "LOC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(255)} <br>
     * <pre>e.g. setLocCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locCd The value of locCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocCd_LikeSearch(String locCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locCd), xgetCValueLocCd(), "LOC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocCd_NotLikeSearch(String locCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locCd), xgetCValueLocCd(), "LOC_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC_CD: {varchar(255)}
     * @param locCd The value of locCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocCd_PrefixSearch(String locCd) {
        setLocCd_LikeSearch(locCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     */
    public void setLocCd_IsNull() { regLocCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     */
    public void setLocCd_IsNullOrEmpty() { regLocCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOC_CD: {varchar(255)}
     */
    public void setLocCd_IsNotNull() { regLocCd(CK_ISNN, DOBJ); }

    protected void regLocCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocCd(), "LOC_CD"); }
    protected abstract ConditionValue xgetCValueLocCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_Equal(String shipDate) {
        doSetShipDate_Equal(fRES(shipDate));
    }

    protected void doSetShipDate_Equal(String shipDate) {
        regShipDate(CK_EQ, shipDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotEqual(String shipDate) {
        doSetShipDate_NotEqual(fRES(shipDate));
    }

    protected void doSetShipDate_NotEqual(String shipDate) {
        regShipDate(CK_NES, shipDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterThan(String shipDate) {
        regShipDate(CK_GT, fRES(shipDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessThan(String shipDate) {
        regShipDate(CK_LT, fRES(shipDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_GreaterEqual(String shipDate) {
        regShipDate(CK_GE, fRES(shipDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_LessEqual(String shipDate) {
        regShipDate(CK_LE, fRES(shipDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDateList The collection of shipDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_InScope(Collection<String> shipDateList) {
        doSetShipDate_InScope(shipDateList);
    }

    protected void doSetShipDate_InScope(Collection<String> shipDateList) {
        regINS(CK_INS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDateList The collection of shipDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_NotInScope(Collection<String> shipDateList) {
        doSetShipDate_NotInScope(shipDateList);
    }

    protected void doSetShipDate_NotInScope(Collection<String> shipDateList) {
        regINS(CK_NINS, cTL(shipDateList), xgetCValueShipDate(), "SHIP_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(255)} <br>
     * <pre>e.g. setShipDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipDate The value of shipDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipDate_LikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipDate_NotLikeSearch(String shipDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipDate), xgetCValueShipDate(), "SHIP_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     * @param shipDate The value of shipDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipDate_PrefixSearch(String shipDate) {
        setShipDate_LikeSearch(shipDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     */
    public void setShipDate_IsNull() { regShipDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     */
    public void setShipDate_IsNullOrEmpty() { regShipDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_DATE: {varchar(255)}
     */
    public void setShipDate_IsNotNull() { regShipDate(CK_ISNN, DOBJ); }

    protected void regShipDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipDate(), "SHIP_DATE"); }
    protected abstract ConditionValue xgetCValueShipDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_Equal(String currentLocationCd) {
        doSetCurrentLocationCd_Equal(fRES(currentLocationCd));
    }

    protected void doSetCurrentLocationCd_Equal(String currentLocationCd) {
        regCurrentLocationCd(CK_EQ, currentLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_NotEqual(String currentLocationCd) {
        doSetCurrentLocationCd_NotEqual(fRES(currentLocationCd));
    }

    protected void doSetCurrentLocationCd_NotEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_NES, currentLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_GreaterThan(String currentLocationCd) {
        regCurrentLocationCd(CK_GT, fRES(currentLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_LessThan(String currentLocationCd) {
        regCurrentLocationCd(CK_LT, fRES(currentLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_GreaterEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_GE, fRES(currentLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_LessEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_LE, fRES(currentLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCdList The collection of currentLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_InScope(Collection<String> currentLocationCdList) {
        doSetCurrentLocationCd_InScope(currentLocationCdList);
    }

    protected void doSetCurrentLocationCd_InScope(Collection<String> currentLocationCdList) {
        regINS(CK_INS, cTL(currentLocationCdList), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCdList The collection of currentLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_NotInScope(Collection<String> currentLocationCdList) {
        doSetCurrentLocationCd_NotInScope(currentLocationCdList);
    }

    protected void doSetCurrentLocationCd_NotInScope(Collection<String> currentLocationCdList) {
        regINS(CK_NINS, cTL(currentLocationCdList), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)} <br>
     * <pre>e.g. setCurrentLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currentLocationCd The value of currentLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrentLocationCd_LikeSearch(String currentLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currentLocationCd), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrentLocationCd_NotLikeSearch(String currentLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currentLocationCd), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     * @param currentLocationCd The value of currentLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_PrefixSearch(String currentLocationCd) {
        setCurrentLocationCd_LikeSearch(currentLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     */
    public void setCurrentLocationCd_IsNull() { regCurrentLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     */
    public void setCurrentLocationCd_IsNullOrEmpty() { regCurrentLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(255)}
     */
    public void setCurrentLocationCd_IsNotNull() { regCurrentLocationCd(CK_ISNN, DOBJ); }

    protected void regCurrentLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueCurrentLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_Equal(String currentLocationSname) {
        doSetCurrentLocationSname_Equal(fRES(currentLocationSname));
    }

    protected void doSetCurrentLocationSname_Equal(String currentLocationSname) {
        regCurrentLocationSname(CK_EQ, currentLocationSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_NotEqual(String currentLocationSname) {
        doSetCurrentLocationSname_NotEqual(fRES(currentLocationSname));
    }

    protected void doSetCurrentLocationSname_NotEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_NES, currentLocationSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_GreaterThan(String currentLocationSname) {
        regCurrentLocationSname(CK_GT, fRES(currentLocationSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_LessThan(String currentLocationSname) {
        regCurrentLocationSname(CK_LT, fRES(currentLocationSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_GreaterEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_GE, fRES(currentLocationSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_LessEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_LE, fRES(currentLocationSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSnameList The collection of currentLocationSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_InScope(Collection<String> currentLocationSnameList) {
        doSetCurrentLocationSname_InScope(currentLocationSnameList);
    }

    protected void doSetCurrentLocationSname_InScope(Collection<String> currentLocationSnameList) {
        regINS(CK_INS, cTL(currentLocationSnameList), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSnameList The collection of currentLocationSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_NotInScope(Collection<String> currentLocationSnameList) {
        doSetCurrentLocationSname_NotInScope(currentLocationSnameList);
    }

    protected void doSetCurrentLocationSname_NotInScope(Collection<String> currentLocationSnameList) {
        regINS(CK_NINS, cTL(currentLocationSnameList), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)} <br>
     * <pre>e.g. setCurrentLocationSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currentLocationSname The value of currentLocationSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrentLocationSname_LikeSearch(String currentLocationSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currentLocationSname), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrentLocationSname_NotLikeSearch(String currentLocationSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currentLocationSname), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     * @param currentLocationSname The value of currentLocationSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_PrefixSearch(String currentLocationSname) {
        setCurrentLocationSname_LikeSearch(currentLocationSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     */
    public void setCurrentLocationSname_IsNull() { regCurrentLocationSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     */
    public void setCurrentLocationSname_IsNullOrEmpty() { regCurrentLocationSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(255)}
     */
    public void setCurrentLocationSname_IsNotNull() { regCurrentLocationSname(CK_ISNN, DOBJ); }

    protected void regCurrentLocationSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME"); }
    protected abstract ConditionValue xgetCValueCurrentLocationSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_Equal(String shipToCd) {
        doSetShipToCd_Equal(fRES(shipToCd));
    }

    protected void doSetShipToCd_Equal(String shipToCd) {
        regShipToCd(CK_EQ, shipToCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_NotEqual(String shipToCd) {
        doSetShipToCd_NotEqual(fRES(shipToCd));
    }

    protected void doSetShipToCd_NotEqual(String shipToCd) {
        regShipToCd(CK_NES, shipToCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_GreaterThan(String shipToCd) {
        regShipToCd(CK_GT, fRES(shipToCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_LessThan(String shipToCd) {
        regShipToCd(CK_LT, fRES(shipToCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_GreaterEqual(String shipToCd) {
        regShipToCd(CK_GE, fRES(shipToCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_LessEqual(String shipToCd) {
        regShipToCd(CK_LE, fRES(shipToCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCdList The collection of shipToCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_InScope(Collection<String> shipToCdList) {
        doSetShipToCd_InScope(shipToCdList);
    }

    protected void doSetShipToCd_InScope(Collection<String> shipToCdList) {
        regINS(CK_INS, cTL(shipToCdList), xgetCValueShipToCd(), "SHIP_TO_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCdList The collection of shipToCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_NotInScope(Collection<String> shipToCdList) {
        doSetShipToCd_NotInScope(shipToCdList);
    }

    protected void doSetShipToCd_NotInScope(Collection<String> shipToCdList) {
        regINS(CK_NINS, cTL(shipToCdList), xgetCValueShipToCd(), "SHIP_TO_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_CD: {varchar(255)} <br>
     * <pre>e.g. setShipToCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipToCd The value of shipToCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipToCd_LikeSearch(String shipToCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipToCd), xgetCValueShipToCd(), "SHIP_TO_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipToCd_NotLikeSearch(String shipToCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipToCd), xgetCValueShipToCd(), "SHIP_TO_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     * @param shipToCd The value of shipToCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToCd_PrefixSearch(String shipToCd) {
        setShipToCd_LikeSearch(shipToCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     */
    public void setShipToCd_IsNull() { regShipToCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     */
    public void setShipToCd_IsNullOrEmpty() { regShipToCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_TO_CD: {varchar(255)}
     */
    public void setShipToCd_IsNotNull() { regShipToCd(CK_ISNN, DOBJ); }

    protected void regShipToCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipToCd(), "SHIP_TO_CD"); }
    protected abstract ConditionValue xgetCValueShipToCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_Equal(String shipToSname) {
        doSetShipToSname_Equal(fRES(shipToSname));
    }

    protected void doSetShipToSname_Equal(String shipToSname) {
        regShipToSname(CK_EQ, shipToSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_NotEqual(String shipToSname) {
        doSetShipToSname_NotEqual(fRES(shipToSname));
    }

    protected void doSetShipToSname_NotEqual(String shipToSname) {
        regShipToSname(CK_NES, shipToSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_GreaterThan(String shipToSname) {
        regShipToSname(CK_GT, fRES(shipToSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_LessThan(String shipToSname) {
        regShipToSname(CK_LT, fRES(shipToSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_GreaterEqual(String shipToSname) {
        regShipToSname(CK_GE, fRES(shipToSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_LessEqual(String shipToSname) {
        regShipToSname(CK_LE, fRES(shipToSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSnameList The collection of shipToSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_InScope(Collection<String> shipToSnameList) {
        doSetShipToSname_InScope(shipToSnameList);
    }

    protected void doSetShipToSname_InScope(Collection<String> shipToSnameList) {
        regINS(CK_INS, cTL(shipToSnameList), xgetCValueShipToSname(), "SHIP_TO_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSnameList The collection of shipToSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_NotInScope(Collection<String> shipToSnameList) {
        doSetShipToSname_NotInScope(shipToSnameList);
    }

    protected void doSetShipToSname_NotInScope(Collection<String> shipToSnameList) {
        regINS(CK_NINS, cTL(shipToSnameList), xgetCValueShipToSname(), "SHIP_TO_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)} <br>
     * <pre>e.g. setShipToSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipToSname The value of shipToSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipToSname_LikeSearch(String shipToSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipToSname), xgetCValueShipToSname(), "SHIP_TO_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipToSname_NotLikeSearch(String shipToSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipToSname), xgetCValueShipToSname(), "SHIP_TO_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     * @param shipToSname The value of shipToSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipToSname_PrefixSearch(String shipToSname) {
        setShipToSname_LikeSearch(shipToSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     */
    public void setShipToSname_IsNull() { regShipToSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     */
    public void setShipToSname_IsNullOrEmpty() { regShipToSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIP_TO_SNAME: {varchar(255)}
     */
    public void setShipToSname_IsNotNull() { regShipToSname(CK_ISNN, DOBJ); }

    protected void regShipToSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipToSname(), "SHIP_TO_SNAME"); }
    protected abstract ConditionValue xgetCValueShipToSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_Equal(String createDatetime) {
        doSetCreateDatetime_Equal(fRES(createDatetime));
    }

    protected void doSetCreateDatetime_Equal(String createDatetime) {
        regCreateDatetime(CK_EQ, createDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_NotEqual(String createDatetime) {
        doSetCreateDatetime_NotEqual(fRES(createDatetime));
    }

    protected void doSetCreateDatetime_NotEqual(String createDatetime) {
        regCreateDatetime(CK_NES, createDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_GreaterThan(String createDatetime) {
        regCreateDatetime(CK_GT, fRES(createDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_LessThan(String createDatetime) {
        regCreateDatetime(CK_LT, fRES(createDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_GreaterEqual(String createDatetime) {
        regCreateDatetime(CK_GE, fRES(createDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_LessEqual(String createDatetime) {
        regCreateDatetime(CK_LE, fRES(createDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetimeList The collection of createDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_InScope(Collection<String> createDatetimeList) {
        doSetCreateDatetime_InScope(createDatetimeList);
    }

    protected void doSetCreateDatetime_InScope(Collection<String> createDatetimeList) {
        regINS(CK_INS, cTL(createDatetimeList), xgetCValueCreateDatetime(), "CREATE_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetimeList The collection of createDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_NotInScope(Collection<String> createDatetimeList) {
        doSetCreateDatetime_NotInScope(createDatetimeList);
    }

    protected void doSetCreateDatetime_NotInScope(Collection<String> createDatetimeList) {
        regINS(CK_NINS, cTL(createDatetimeList), xgetCValueCreateDatetime(), "CREATE_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setCreateDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createDatetime The value of createDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateDatetime_LikeSearch(String createDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createDatetime), xgetCValueCreateDatetime(), "CREATE_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateDatetime_NotLikeSearch(String createDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createDatetime), xgetCValueCreateDatetime(), "CREATE_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     * @param createDatetime The value of createDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateDatetime_PrefixSearch(String createDatetime) {
        setCreateDatetime_LikeSearch(createDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNull() { regCreateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNullOrEmpty() { regCreateDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATE_DATETIME: {varchar(255)}
     */
    public void setCreateDatetime_IsNotNull() { regCreateDatetime(CK_ISNN, DOBJ); }

    protected void regCreateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateDatetime(), "CREATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueCreateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_Equal(String traceType) {
        doSetTraceType_Equal(fRES(traceType));
    }

    protected void doSetTraceType_Equal(String traceType) {
        regTraceType(CK_EQ, traceType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_NotEqual(String traceType) {
        doSetTraceType_NotEqual(fRES(traceType));
    }

    protected void doSetTraceType_NotEqual(String traceType) {
        regTraceType(CK_NES, traceType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_GreaterThan(String traceType) {
        regTraceType(CK_GT, fRES(traceType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_LessThan(String traceType) {
        regTraceType(CK_LT, fRES(traceType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_GreaterEqual(String traceType) {
        regTraceType(CK_GE, fRES(traceType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_LessEqual(String traceType) {
        regTraceType(CK_LE, fRES(traceType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceTypeList The collection of traceType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_InScope(Collection<String> traceTypeList) {
        doSetTraceType_InScope(traceTypeList);
    }

    protected void doSetTraceType_InScope(Collection<String> traceTypeList) {
        regINS(CK_INS, cTL(traceTypeList), xgetCValueTraceType(), "TRACE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceTypeList The collection of traceType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_NotInScope(Collection<String> traceTypeList) {
        doSetTraceType_NotInScope(traceTypeList);
    }

    protected void doSetTraceType_NotInScope(Collection<String> traceTypeList) {
        regINS(CK_NINS, cTL(traceTypeList), xgetCValueTraceType(), "TRACE_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)} <br>
     * <pre>e.g. setTraceType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param traceType The value of traceType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTraceType_LikeSearch(String traceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(traceType), xgetCValueTraceType(), "TRACE_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTraceType_NotLikeSearch(String traceType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(traceType), xgetCValueTraceType(), "TRACE_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     * @param traceType The value of traceType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceType_PrefixSearch(String traceType) {
        setTraceType_LikeSearch(traceType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNull() { regTraceType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNullOrEmpty() { regTraceType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE: {varchar(255)}
     */
    public void setTraceType_IsNotNull() { regTraceType(CK_ISNN, DOBJ); }

    protected void regTraceType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTraceType(), "TRACE_TYPE"); }
    protected abstract ConditionValue xgetCValueTraceType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_Equal(String traceTypeSname) {
        doSetTraceTypeSname_Equal(fRES(traceTypeSname));
    }

    protected void doSetTraceTypeSname_Equal(String traceTypeSname) {
        regTraceTypeSname(CK_EQ, traceTypeSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_NotEqual(String traceTypeSname) {
        doSetTraceTypeSname_NotEqual(fRES(traceTypeSname));
    }

    protected void doSetTraceTypeSname_NotEqual(String traceTypeSname) {
        regTraceTypeSname(CK_NES, traceTypeSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_GreaterThan(String traceTypeSname) {
        regTraceTypeSname(CK_GT, fRES(traceTypeSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_LessThan(String traceTypeSname) {
        regTraceTypeSname(CK_LT, fRES(traceTypeSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_GreaterEqual(String traceTypeSname) {
        regTraceTypeSname(CK_GE, fRES(traceTypeSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_LessEqual(String traceTypeSname) {
        regTraceTypeSname(CK_LE, fRES(traceTypeSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSnameList The collection of traceTypeSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_InScope(Collection<String> traceTypeSnameList) {
        doSetTraceTypeSname_InScope(traceTypeSnameList);
    }

    protected void doSetTraceTypeSname_InScope(Collection<String> traceTypeSnameList) {
        regINS(CK_INS, cTL(traceTypeSnameList), xgetCValueTraceTypeSname(), "TRACE_TYPE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSnameList The collection of traceTypeSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_NotInScope(Collection<String> traceTypeSnameList) {
        doSetTraceTypeSname_NotInScope(traceTypeSnameList);
    }

    protected void doSetTraceTypeSname_NotInScope(Collection<String> traceTypeSnameList) {
        regINS(CK_NINS, cTL(traceTypeSnameList), xgetCValueTraceTypeSname(), "TRACE_TYPE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)} <br>
     * <pre>e.g. setTraceTypeSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param traceTypeSname The value of traceTypeSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTraceTypeSname_LikeSearch(String traceTypeSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(traceTypeSname), xgetCValueTraceTypeSname(), "TRACE_TYPE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTraceTypeSname_NotLikeSearch(String traceTypeSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(traceTypeSname), xgetCValueTraceTypeSname(), "TRACE_TYPE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     * @param traceTypeSname The value of traceTypeSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTraceTypeSname_PrefixSearch(String traceTypeSname) {
        setTraceTypeSname_LikeSearch(traceTypeSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     */
    public void setTraceTypeSname_IsNull() { regTraceTypeSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     */
    public void setTraceTypeSname_IsNullOrEmpty() { regTraceTypeSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACE_TYPE_SNAME: {varchar(255)}
     */
    public void setTraceTypeSname_IsNotNull() { regTraceTypeSname(CK_ISNN, DOBJ); }

    protected void regTraceTypeSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTraceTypeSname(), "TRACE_TYPE_SNAME"); }
    protected abstract ConditionValue xgetCValueTraceTypeSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_Equal(String examSts) {
        doSetExamSts_Equal(fRES(examSts));
    }

    protected void doSetExamSts_Equal(String examSts) {
        regExamSts(CK_EQ, examSts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_NotEqual(String examSts) {
        doSetExamSts_NotEqual(fRES(examSts));
    }

    protected void doSetExamSts_NotEqual(String examSts) {
        regExamSts(CK_NES, examSts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_GreaterThan(String examSts) {
        regExamSts(CK_GT, fRES(examSts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_LessThan(String examSts) {
        regExamSts(CK_LT, fRES(examSts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_GreaterEqual(String examSts) {
        regExamSts(CK_GE, fRES(examSts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_LessEqual(String examSts) {
        regExamSts(CK_LE, fRES(examSts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examStsList The collection of examSts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_InScope(Collection<String> examStsList) {
        doSetExamSts_InScope(examStsList);
    }

    protected void doSetExamSts_InScope(Collection<String> examStsList) {
        regINS(CK_INS, cTL(examStsList), xgetCValueExamSts(), "EXAM_STS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examStsList The collection of examSts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_NotInScope(Collection<String> examStsList) {
        doSetExamSts_NotInScope(examStsList);
    }

    protected void doSetExamSts_NotInScope(Collection<String> examStsList) {
        regINS(CK_NINS, cTL(examStsList), xgetCValueExamSts(), "EXAM_STS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAM_STS: {varchar(255)} <br>
     * <pre>e.g. setExamSts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examSts The value of examSts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamSts_LikeSearch(String examSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examSts), xgetCValueExamSts(), "EXAM_STS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamSts_NotLikeSearch(String examSts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examSts), xgetCValueExamSts(), "EXAM_STS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAM_STS: {varchar(255)}
     * @param examSts The value of examSts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamSts_PrefixSearch(String examSts) {
        setExamSts_LikeSearch(examSts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     */
    public void setExamSts_IsNull() { regExamSts(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     */
    public void setExamSts_IsNullOrEmpty() { regExamSts(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAM_STS: {varchar(255)}
     */
    public void setExamSts_IsNotNull() { regExamSts(CK_ISNN, DOBJ); }

    protected void regExamSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamSts(), "EXAM_STS"); }
    protected abstract ConditionValue xgetCValueExamSts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_Equal(String caseInNum) {
        doSetCaseInNum_Equal(fRES(caseInNum));
    }

    protected void doSetCaseInNum_Equal(String caseInNum) {
        regCaseInNum(CK_EQ, caseInNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_NotEqual(String caseInNum) {
        doSetCaseInNum_NotEqual(fRES(caseInNum));
    }

    protected void doSetCaseInNum_NotEqual(String caseInNum) {
        regCaseInNum(CK_NES, caseInNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_GreaterThan(String caseInNum) {
        regCaseInNum(CK_GT, fRES(caseInNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_LessThan(String caseInNum) {
        regCaseInNum(CK_LT, fRES(caseInNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_GreaterEqual(String caseInNum) {
        regCaseInNum(CK_GE, fRES(caseInNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_LessEqual(String caseInNum) {
        regCaseInNum(CK_LE, fRES(caseInNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNumList The collection of caseInNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_InScope(Collection<String> caseInNumList) {
        doSetCaseInNum_InScope(caseInNumList);
    }

    protected void doSetCaseInNum_InScope(Collection<String> caseInNumList) {
        regINS(CK_INS, cTL(caseInNumList), xgetCValueCaseInNum(), "CASE_IN_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNumList The collection of caseInNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_NotInScope(Collection<String> caseInNumList) {
        doSetCaseInNum_NotInScope(caseInNumList);
    }

    protected void doSetCaseInNum_NotInScope(Collection<String> caseInNumList) {
        regINS(CK_NINS, cTL(caseInNumList), xgetCValueCaseInNum(), "CASE_IN_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)} <br>
     * <pre>e.g. setCaseInNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseInNum The value of caseInNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseInNum_LikeSearch(String caseInNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseInNum), xgetCValueCaseInNum(), "CASE_IN_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseInNum_NotLikeSearch(String caseInNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseInNum), xgetCValueCaseInNum(), "CASE_IN_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     * @param caseInNum The value of caseInNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseInNum_PrefixSearch(String caseInNum) {
        setCaseInNum_LikeSearch(caseInNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNull() { regCaseInNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNullOrEmpty() { regCaseInNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_IN_NUM: {varchar(255)}
     */
    public void setCaseInNum_IsNotNull() { regCaseInNum(CK_ISNN, DOBJ); }

    protected void regCaseInNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseInNum(), "CASE_IN_NUM"); }
    protected abstract ConditionValue xgetCValueCaseInNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_Equal(String shippingNum) {
        doSetShippingNum_Equal(fRES(shippingNum));
    }

    protected void doSetShippingNum_Equal(String shippingNum) {
        regShippingNum(CK_EQ, shippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_NotEqual(String shippingNum) {
        doSetShippingNum_NotEqual(fRES(shippingNum));
    }

    protected void doSetShippingNum_NotEqual(String shippingNum) {
        regShippingNum(CK_NES, shippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterThan(String shippingNum) {
        regShippingNum(CK_GT, fRES(shippingNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_LessThan(String shippingNum) {
        regShippingNum(CK_LT, fRES(shippingNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterEqual(String shippingNum) {
        regShippingNum(CK_GE, fRES(shippingNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_LessEqual(String shippingNum) {
        regShippingNum(CK_LE, fRES(shippingNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNumList The collection of shippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_InScope(Collection<String> shippingNumList) {
        doSetShippingNum_InScope(shippingNumList);
    }

    protected void doSetShippingNum_InScope(Collection<String> shippingNumList) {
        regINS(CK_INS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNumList The collection of shippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_NotInScope(Collection<String> shippingNumList) {
        doSetShippingNum_NotInScope(shippingNumList);
    }

    protected void doSetShippingNum_NotInScope(Collection<String> shippingNumList) {
        regINS(CK_NINS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {varchar(255)} <br>
     * <pre>e.g. setShippingNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingNum The value of shippingNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingNum_LikeSearch(String shippingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingNum), xgetCValueShippingNum(), "SHIPPING_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingNum_NotLikeSearch(String shippingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingNum), xgetCValueShippingNum(), "SHIPPING_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     * @param shippingNum The value of shippingNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_PrefixSearch(String shippingNum) {
        setShippingNum_LikeSearch(shippingNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     */
    public void setShippingNum_IsNull() { regShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     */
    public void setShippingNum_IsNullOrEmpty() { regShippingNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {varchar(255)}
     */
    public void setShippingNum_IsNotNull() { regShippingNum(CK_ISNN, DOBJ); }

    protected void regShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingNum(), "SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueShippingNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_Equal(String assortDatetime) {
        doSetAssortDatetime_Equal(fRES(assortDatetime));
    }

    protected void doSetAssortDatetime_Equal(String assortDatetime) {
        regAssortDatetime(CK_EQ, assortDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_NotEqual(String assortDatetime) {
        doSetAssortDatetime_NotEqual(fRES(assortDatetime));
    }

    protected void doSetAssortDatetime_NotEqual(String assortDatetime) {
        regAssortDatetime(CK_NES, assortDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_GreaterThan(String assortDatetime) {
        regAssortDatetime(CK_GT, fRES(assortDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_LessThan(String assortDatetime) {
        regAssortDatetime(CK_LT, fRES(assortDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_GreaterEqual(String assortDatetime) {
        regAssortDatetime(CK_GE, fRES(assortDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_LessEqual(String assortDatetime) {
        regAssortDatetime(CK_LE, fRES(assortDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetimeList The collection of assortDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_InScope(Collection<String> assortDatetimeList) {
        doSetAssortDatetime_InScope(assortDatetimeList);
    }

    protected void doSetAssortDatetime_InScope(Collection<String> assortDatetimeList) {
        regINS(CK_INS, cTL(assortDatetimeList), xgetCValueAssortDatetime(), "ASSORT_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetimeList The collection of assortDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_NotInScope(Collection<String> assortDatetimeList) {
        doSetAssortDatetime_NotInScope(assortDatetimeList);
    }

    protected void doSetAssortDatetime_NotInScope(Collection<String> assortDatetimeList) {
        regINS(CK_NINS, cTL(assortDatetimeList), xgetCValueAssortDatetime(), "ASSORT_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setAssortDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortDatetime The value of assortDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortDatetime_LikeSearch(String assortDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortDatetime), xgetCValueAssortDatetime(), "ASSORT_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortDatetime_NotLikeSearch(String assortDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortDatetime), xgetCValueAssortDatetime(), "ASSORT_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     * @param assortDatetime The value of assortDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDatetime_PrefixSearch(String assortDatetime) {
        setAssortDatetime_LikeSearch(assortDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     */
    public void setAssortDatetime_IsNull() { regAssortDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     */
    public void setAssortDatetime_IsNullOrEmpty() { regAssortDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_DATETIME: {varchar(255)}
     */
    public void setAssortDatetime_IsNotNull() { regAssortDatetime(CK_ISNN, DOBJ); }

    protected void regAssortDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortDatetime(), "ASSORT_DATETIME"); }
    protected abstract ConditionValue xgetCValueAssortDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNull() { regLineBlock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNullOrEmpty() { regLineBlock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_BLOCK: {varchar(255)}
     */
    public void setLineBlock_IsNotNull() { regLineBlock(CK_ISNN, DOBJ); }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_Equal(String assortedUnit) {
        doSetAssortedUnit_Equal(fRES(assortedUnit));
    }

    protected void doSetAssortedUnit_Equal(String assortedUnit) {
        regAssortedUnit(CK_EQ, assortedUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_NotEqual(String assortedUnit) {
        doSetAssortedUnit_NotEqual(fRES(assortedUnit));
    }

    protected void doSetAssortedUnit_NotEqual(String assortedUnit) {
        regAssortedUnit(CK_NES, assortedUnit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_GreaterThan(String assortedUnit) {
        regAssortedUnit(CK_GT, fRES(assortedUnit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_LessThan(String assortedUnit) {
        regAssortedUnit(CK_LT, fRES(assortedUnit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_GreaterEqual(String assortedUnit) {
        regAssortedUnit(CK_GE, fRES(assortedUnit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_LessEqual(String assortedUnit) {
        regAssortedUnit(CK_LE, fRES(assortedUnit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnitList The collection of assortedUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_InScope(Collection<String> assortedUnitList) {
        doSetAssortedUnit_InScope(assortedUnitList);
    }

    protected void doSetAssortedUnit_InScope(Collection<String> assortedUnitList) {
        regINS(CK_INS, cTL(assortedUnitList), xgetCValueAssortedUnit(), "ASSORTED_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnitList The collection of assortedUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_NotInScope(Collection<String> assortedUnitList) {
        doSetAssortedUnit_NotInScope(assortedUnitList);
    }

    protected void doSetAssortedUnit_NotInScope(Collection<String> assortedUnitList) {
        regINS(CK_NINS, cTL(assortedUnitList), xgetCValueAssortedUnit(), "ASSORTED_UNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortedUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedUnit The value of assortedUnit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedUnit_LikeSearch(String assortedUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedUnit), xgetCValueAssortedUnit(), "ASSORTED_UNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedUnit_NotLikeSearch(String assortedUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedUnit), xgetCValueAssortedUnit(), "ASSORTED_UNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     * @param assortedUnit The value of assortedUnit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedUnit_PrefixSearch(String assortedUnit) {
        setAssortedUnit_LikeSearch(assortedUnit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     */
    public void setAssortedUnit_IsNull() { regAssortedUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     */
    public void setAssortedUnit_IsNullOrEmpty() { regAssortedUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTED_UNIT: {varchar(255)}
     */
    public void setAssortedUnit_IsNotNull() { regAssortedUnit(CK_ISNN, DOBJ); }

    protected void regAssortedUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedUnit(), "ASSORTED_UNIT"); }
    protected abstract ConditionValue xgetCValueAssortedUnit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_Equal(String assortedIndex) {
        doSetAssortedIndex_Equal(fRES(assortedIndex));
    }

    protected void doSetAssortedIndex_Equal(String assortedIndex) {
        regAssortedIndex(CK_EQ, assortedIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_NotEqual(String assortedIndex) {
        doSetAssortedIndex_NotEqual(fRES(assortedIndex));
    }

    protected void doSetAssortedIndex_NotEqual(String assortedIndex) {
        regAssortedIndex(CK_NES, assortedIndex);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_GreaterThan(String assortedIndex) {
        regAssortedIndex(CK_GT, fRES(assortedIndex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_LessThan(String assortedIndex) {
        regAssortedIndex(CK_LT, fRES(assortedIndex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_GreaterEqual(String assortedIndex) {
        regAssortedIndex(CK_GE, fRES(assortedIndex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_LessEqual(String assortedIndex) {
        regAssortedIndex(CK_LE, fRES(assortedIndex));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndexList The collection of assortedIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_InScope(Collection<String> assortedIndexList) {
        doSetAssortedIndex_InScope(assortedIndexList);
    }

    protected void doSetAssortedIndex_InScope(Collection<String> assortedIndexList) {
        regINS(CK_INS, cTL(assortedIndexList), xgetCValueAssortedIndex(), "ASSORTED_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndexList The collection of assortedIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_NotInScope(Collection<String> assortedIndexList) {
        doSetAssortedIndex_NotInScope(assortedIndexList);
    }

    protected void doSetAssortedIndex_NotInScope(Collection<String> assortedIndexList) {
        regINS(CK_NINS, cTL(assortedIndexList), xgetCValueAssortedIndex(), "ASSORTED_INDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)} <br>
     * <pre>e.g. setAssortedIndex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedIndex The value of assortedIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedIndex_LikeSearch(String assortedIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedIndex), xgetCValueAssortedIndex(), "ASSORTED_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedIndex_NotLikeSearch(String assortedIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedIndex), xgetCValueAssortedIndex(), "ASSORTED_INDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     * @param assortedIndex The value of assortedIndex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedIndex_PrefixSearch(String assortedIndex) {
        setAssortedIndex_LikeSearch(assortedIndex, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     */
    public void setAssortedIndex_IsNull() { regAssortedIndex(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     */
    public void setAssortedIndex_IsNullOrEmpty() { regAssortedIndex(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTED_INDEX: {varchar(255)}
     */
    public void setAssortedIndex_IsNotNull() { regAssortedIndex(CK_ISNN, DOBJ); }

    protected void regAssortedIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedIndex(), "ASSORTED_INDEX"); }
    protected abstract ConditionValue xgetCValueAssortedIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_Equal(String operationCode) {
        doSetOperationCode_Equal(fRES(operationCode));
    }

    protected void doSetOperationCode_Equal(String operationCode) {
        regOperationCode(CK_EQ, operationCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_NotEqual(String operationCode) {
        doSetOperationCode_NotEqual(fRES(operationCode));
    }

    protected void doSetOperationCode_NotEqual(String operationCode) {
        regOperationCode(CK_NES, operationCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_GreaterThan(String operationCode) {
        regOperationCode(CK_GT, fRES(operationCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_LessThan(String operationCode) {
        regOperationCode(CK_LT, fRES(operationCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_GreaterEqual(String operationCode) {
        regOperationCode(CK_GE, fRES(operationCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_LessEqual(String operationCode) {
        regOperationCode(CK_LE, fRES(operationCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCodeList The collection of operationCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_InScope(Collection<String> operationCodeList) {
        doSetOperationCode_InScope(operationCodeList);
    }

    protected void doSetOperationCode_InScope(Collection<String> operationCodeList) {
        regINS(CK_INS, cTL(operationCodeList), xgetCValueOperationCode(), "OPERATION_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCodeList The collection of operationCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_NotInScope(Collection<String> operationCodeList) {
        doSetOperationCode_NotInScope(operationCodeList);
    }

    protected void doSetOperationCode_NotInScope(Collection<String> operationCodeList) {
        regINS(CK_NINS, cTL(operationCodeList), xgetCValueOperationCode(), "OPERATION_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)} <br>
     * <pre>e.g. setOperationCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationCode The value of operationCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationCode_LikeSearch(String operationCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationCode), xgetCValueOperationCode(), "OPERATION_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationCode_NotLikeSearch(String operationCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationCode), xgetCValueOperationCode(), "OPERATION_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     * @param operationCode The value of operationCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationCode_PrefixSearch(String operationCode) {
        setOperationCode_LikeSearch(operationCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNull() { regOperationCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNullOrEmpty() { regOperationCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATION_CODE: {varchar(255)}
     */
    public void setOperationCode_IsNotNull() { regOperationCode(CK_ISNN, DOBJ); }

    protected void regOperationCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationCode(), "OPERATION_CODE"); }
    protected abstract ConditionValue xgetCValueOperationCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_Equal(String operationNum) {
        doSetOperationNum_Equal(fRES(operationNum));
    }

    protected void doSetOperationNum_Equal(String operationNum) {
        regOperationNum(CK_EQ, operationNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_NotEqual(String operationNum) {
        doSetOperationNum_NotEqual(fRES(operationNum));
    }

    protected void doSetOperationNum_NotEqual(String operationNum) {
        regOperationNum(CK_NES, operationNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_GreaterThan(String operationNum) {
        regOperationNum(CK_GT, fRES(operationNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_LessThan(String operationNum) {
        regOperationNum(CK_LT, fRES(operationNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_GreaterEqual(String operationNum) {
        regOperationNum(CK_GE, fRES(operationNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_LessEqual(String operationNum) {
        regOperationNum(CK_LE, fRES(operationNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNumList The collection of operationNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_InScope(Collection<String> operationNumList) {
        doSetOperationNum_InScope(operationNumList);
    }

    protected void doSetOperationNum_InScope(Collection<String> operationNumList) {
        regINS(CK_INS, cTL(operationNumList), xgetCValueOperationNum(), "OPERATION_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNumList The collection of operationNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_NotInScope(Collection<String> operationNumList) {
        doSetOperationNum_NotInScope(operationNumList);
    }

    protected void doSetOperationNum_NotInScope(Collection<String> operationNumList) {
        regINS(CK_NINS, cTL(operationNumList), xgetCValueOperationNum(), "OPERATION_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_NUM: {varchar(255)} <br>
     * <pre>e.g. setOperationNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationNum The value of operationNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationNum_LikeSearch(String operationNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationNum), xgetCValueOperationNum(), "OPERATION_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationNum_NotLikeSearch(String operationNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationNum), xgetCValueOperationNum(), "OPERATION_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     * @param operationNum The value of operationNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationNum_PrefixSearch(String operationNum) {
        setOperationNum_LikeSearch(operationNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     */
    public void setOperationNum_IsNull() { regOperationNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     */
    public void setOperationNum_IsNullOrEmpty() { regOperationNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATION_NUM: {varchar(255)}
     */
    public void setOperationNum_IsNotNull() { regOperationNum(CK_ISNN, DOBJ); }

    protected void regOperationNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationNum(), "OPERATION_NUM"); }
    protected abstract ConditionValue xgetCValueOperationNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_Equal(String assortNum) {
        doSetAssortNum_Equal(fRES(assortNum));
    }

    protected void doSetAssortNum_Equal(String assortNum) {
        regAssortNum(CK_EQ, assortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_NotEqual(String assortNum) {
        doSetAssortNum_NotEqual(fRES(assortNum));
    }

    protected void doSetAssortNum_NotEqual(String assortNum) {
        regAssortNum(CK_NES, assortNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_GreaterThan(String assortNum) {
        regAssortNum(CK_GT, fRES(assortNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_LessThan(String assortNum) {
        regAssortNum(CK_LT, fRES(assortNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_GreaterEqual(String assortNum) {
        regAssortNum(CK_GE, fRES(assortNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_LessEqual(String assortNum) {
        regAssortNum(CK_LE, fRES(assortNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNumList The collection of assortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_InScope(Collection<String> assortNumList) {
        doSetAssortNum_InScope(assortNumList);
    }

    protected void doSetAssortNum_InScope(Collection<String> assortNumList) {
        regINS(CK_INS, cTL(assortNumList), xgetCValueAssortNum(), "ASSORT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNumList The collection of assortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_NotInScope(Collection<String> assortNumList) {
        doSetAssortNum_NotInScope(assortNumList);
    }

    protected void doSetAssortNum_NotInScope(Collection<String> assortNumList) {
        regINS(CK_NINS, cTL(assortNumList), xgetCValueAssortNum(), "ASSORT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)} <br>
     * <pre>e.g. setAssortNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortNum The value of assortNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortNum_LikeSearch(String assortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortNum), xgetCValueAssortNum(), "ASSORT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortNum_NotLikeSearch(String assortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortNum), xgetCValueAssortNum(), "ASSORT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     * @param assortNum The value of assortNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortNum_PrefixSearch(String assortNum) {
        setAssortNum_LikeSearch(assortNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNull() { regAssortNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNullOrEmpty() { regAssortNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_NUM: {varchar(255)}
     */
    public void setAssortNum_IsNotNull() { regAssortNum(CK_ISNN, DOBJ); }

    protected void regAssortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortNum(), "ASSORT_NUM"); }
    protected abstract ConditionValue xgetCValueAssortNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_Equal(String assortDifNum) {
        doSetAssortDifNum_Equal(fRES(assortDifNum));
    }

    protected void doSetAssortDifNum_Equal(String assortDifNum) {
        regAssortDifNum(CK_EQ, assortDifNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_NotEqual(String assortDifNum) {
        doSetAssortDifNum_NotEqual(fRES(assortDifNum));
    }

    protected void doSetAssortDifNum_NotEqual(String assortDifNum) {
        regAssortDifNum(CK_NES, assortDifNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_GreaterThan(String assortDifNum) {
        regAssortDifNum(CK_GT, fRES(assortDifNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_LessThan(String assortDifNum) {
        regAssortDifNum(CK_LT, fRES(assortDifNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_GreaterEqual(String assortDifNum) {
        regAssortDifNum(CK_GE, fRES(assortDifNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_LessEqual(String assortDifNum) {
        regAssortDifNum(CK_LE, fRES(assortDifNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNumList The collection of assortDifNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_InScope(Collection<String> assortDifNumList) {
        doSetAssortDifNum_InScope(assortDifNumList);
    }

    protected void doSetAssortDifNum_InScope(Collection<String> assortDifNumList) {
        regINS(CK_INS, cTL(assortDifNumList), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNumList The collection of assortDifNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_NotInScope(Collection<String> assortDifNumList) {
        doSetAssortDifNum_NotInScope(assortDifNumList);
    }

    protected void doSetAssortDifNum_NotInScope(Collection<String> assortDifNumList) {
        regINS(CK_NINS, cTL(assortDifNumList), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)} <br>
     * <pre>e.g. setAssortDifNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortDifNum The value of assortDifNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortDifNum_LikeSearch(String assortDifNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortDifNum), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortDifNum_NotLikeSearch(String assortDifNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortDifNum), xgetCValueAssortDifNum(), "ASSORT_DIF_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     * @param assortDifNum The value of assortDifNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortDifNum_PrefixSearch(String assortDifNum) {
        setAssortDifNum_LikeSearch(assortDifNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNull() { regAssortDifNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNullOrEmpty() { regAssortDifNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORT_DIF_NUM: {varchar(255)}
     */
    public void setAssortDifNum_IsNotNull() { regAssortDifNum(CK_ISNN, DOBJ); }

    protected void regAssortDifNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortDifNum(), "ASSORT_DIF_NUM"); }
    protected abstract ConditionValue xgetCValueAssortDifNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_Equal(String directionCd) {
        doSetDirectionCd_Equal(fRES(directionCd));
    }

    protected void doSetDirectionCd_Equal(String directionCd) {
        regDirectionCd(CK_EQ, directionCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_NotEqual(String directionCd) {
        doSetDirectionCd_NotEqual(fRES(directionCd));
    }

    protected void doSetDirectionCd_NotEqual(String directionCd) {
        regDirectionCd(CK_NES, directionCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_GreaterThan(String directionCd) {
        regDirectionCd(CK_GT, fRES(directionCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_LessThan(String directionCd) {
        regDirectionCd(CK_LT, fRES(directionCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_GreaterEqual(String directionCd) {
        regDirectionCd(CK_GE, fRES(directionCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_LessEqual(String directionCd) {
        regDirectionCd(CK_LE, fRES(directionCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCdList The collection of directionCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_InScope(Collection<String> directionCdList) {
        doSetDirectionCd_InScope(directionCdList);
    }

    protected void doSetDirectionCd_InScope(Collection<String> directionCdList) {
        regINS(CK_INS, cTL(directionCdList), xgetCValueDirectionCd(), "DIRECTION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCdList The collection of directionCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_NotInScope(Collection<String> directionCdList) {
        doSetDirectionCd_NotInScope(directionCdList);
    }

    protected void doSetDirectionCd_NotInScope(Collection<String> directionCdList) {
        regINS(CK_NINS, cTL(directionCdList), xgetCValueDirectionCd(), "DIRECTION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)} <br>
     * <pre>e.g. setDirectionCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionCd The value of directionCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionCd_LikeSearch(String directionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionCd), xgetCValueDirectionCd(), "DIRECTION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionCd_NotLikeSearch(String directionCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionCd), xgetCValueDirectionCd(), "DIRECTION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     * @param directionCd The value of directionCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionCd_PrefixSearch(String directionCd) {
        setDirectionCd_LikeSearch(directionCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNull() { regDirectionCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNullOrEmpty() { regDirectionCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTION_CD: {varchar(255)}
     */
    public void setDirectionCd_IsNotNull() { regDirectionCd(CK_ISNN, DOBJ); }

    protected void regDirectionCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionCd(), "DIRECTION_CD"); }
    protected abstract ConditionValue xgetCValueDirectionCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_Equal(String pistonType) {
        doSetPistonType_Equal(fRES(pistonType));
    }

    protected void doSetPistonType_Equal(String pistonType) {
        regPistonType(CK_EQ, pistonType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_NotEqual(String pistonType) {
        doSetPistonType_NotEqual(fRES(pistonType));
    }

    protected void doSetPistonType_NotEqual(String pistonType) {
        regPistonType(CK_NES, pistonType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_GreaterThan(String pistonType) {
        regPistonType(CK_GT, fRES(pistonType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_LessThan(String pistonType) {
        regPistonType(CK_LT, fRES(pistonType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_GreaterEqual(String pistonType) {
        regPistonType(CK_GE, fRES(pistonType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_LessEqual(String pistonType) {
        regPistonType(CK_LE, fRES(pistonType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonTypeList The collection of pistonType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_InScope(Collection<String> pistonTypeList) {
        doSetPistonType_InScope(pistonTypeList);
    }

    protected void doSetPistonType_InScope(Collection<String> pistonTypeList) {
        regINS(CK_INS, cTL(pistonTypeList), xgetCValuePistonType(), "PISTON_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonTypeList The collection of pistonType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_NotInScope(Collection<String> pistonTypeList) {
        doSetPistonType_NotInScope(pistonTypeList);
    }

    protected void doSetPistonType_NotInScope(Collection<String> pistonTypeList) {
        regINS(CK_NINS, cTL(pistonTypeList), xgetCValuePistonType(), "PISTON_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)} <br>
     * <pre>e.g. setPistonType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistonType The value of pistonType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistonType_LikeSearch(String pistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistonType), xgetCValuePistonType(), "PISTON_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistonType_NotLikeSearch(String pistonType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistonType), xgetCValuePistonType(), "PISTON_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     * @param pistonType The value of pistonType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistonType_PrefixSearch(String pistonType) {
        setPistonType_LikeSearch(pistonType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNull() { regPistonType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNullOrEmpty() { regPistonType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTON_TYPE: {varchar(255)}
     */
    public void setPistonType_IsNotNull() { regPistonType(CK_ISNN, DOBJ); }

    protected void regPistonType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistonType(), "PISTON_TYPE"); }
    protected abstract ConditionValue xgetCValuePistonType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(255)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_Equal(String directionNum) {
        doSetDirectionNum_Equal(fRES(directionNum));
    }

    protected void doSetDirectionNum_Equal(String directionNum) {
        regDirectionNum(CK_EQ, directionNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_NotEqual(String directionNum) {
        doSetDirectionNum_NotEqual(fRES(directionNum));
    }

    protected void doSetDirectionNum_NotEqual(String directionNum) {
        regDirectionNum(CK_NES, directionNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_GreaterThan(String directionNum) {
        regDirectionNum(CK_GT, fRES(directionNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_LessThan(String directionNum) {
        regDirectionNum(CK_LT, fRES(directionNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_GreaterEqual(String directionNum) {
        regDirectionNum(CK_GE, fRES(directionNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_LessEqual(String directionNum) {
        regDirectionNum(CK_LE, fRES(directionNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNumList The collection of directionNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_InScope(Collection<String> directionNumList) {
        doSetDirectionNum_InScope(directionNumList);
    }

    protected void doSetDirectionNum_InScope(Collection<String> directionNumList) {
        regINS(CK_INS, cTL(directionNumList), xgetCValueDirectionNum(), "DIRECTION_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNumList The collection of directionNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_NotInScope(Collection<String> directionNumList) {
        doSetDirectionNum_NotInScope(directionNumList);
    }

    protected void doSetDirectionNum_NotInScope(Collection<String> directionNumList) {
        regINS(CK_NINS, cTL(directionNumList), xgetCValueDirectionNum(), "DIRECTION_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)} <br>
     * <pre>e.g. setDirectionNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionNum The value of directionNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionNum_LikeSearch(String directionNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionNum), xgetCValueDirectionNum(), "DIRECTION_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionNum_NotLikeSearch(String directionNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionNum), xgetCValueDirectionNum(), "DIRECTION_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     * @param directionNum The value of directionNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionNum_PrefixSearch(String directionNum) {
        setDirectionNum_LikeSearch(directionNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNull() { regDirectionNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNullOrEmpty() { regDirectionNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTION_NUM: {varchar(255)}
     */
    public void setDirectionNum_IsNotNull() { regDirectionNum(CK_ISNN, DOBJ); }

    protected void regDirectionNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionNum(), "DIRECTION_NUM"); }
    protected abstract ConditionValue xgetCValueDirectionNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_Equal(String supplierRcvNo) {
        doSetSupplierRcvNo_Equal(fRES(supplierRcvNo));
    }

    protected void doSetSupplierRcvNo_Equal(String supplierRcvNo) {
        regSupplierRcvNo(CK_EQ, supplierRcvNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_NotEqual(String supplierRcvNo) {
        doSetSupplierRcvNo_NotEqual(fRES(supplierRcvNo));
    }

    protected void doSetSupplierRcvNo_NotEqual(String supplierRcvNo) {
        regSupplierRcvNo(CK_NES, supplierRcvNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_GreaterThan(String supplierRcvNo) {
        regSupplierRcvNo(CK_GT, fRES(supplierRcvNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_LessThan(String supplierRcvNo) {
        regSupplierRcvNo(CK_LT, fRES(supplierRcvNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_GreaterEqual(String supplierRcvNo) {
        regSupplierRcvNo(CK_GE, fRES(supplierRcvNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_LessEqual(String supplierRcvNo) {
        regSupplierRcvNo(CK_LE, fRES(supplierRcvNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNoList The collection of supplierRcvNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_InScope(Collection<String> supplierRcvNoList) {
        doSetSupplierRcvNo_InScope(supplierRcvNoList);
    }

    protected void doSetSupplierRcvNo_InScope(Collection<String> supplierRcvNoList) {
        regINS(CK_INS, cTL(supplierRcvNoList), xgetCValueSupplierRcvNo(), "SUPPLIER_RCV_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNoList The collection of supplierRcvNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_NotInScope(Collection<String> supplierRcvNoList) {
        doSetSupplierRcvNo_NotInScope(supplierRcvNoList);
    }

    protected void doSetSupplierRcvNo_NotInScope(Collection<String> supplierRcvNoList) {
        regINS(CK_NINS, cTL(supplierRcvNoList), xgetCValueSupplierRcvNo(), "SUPPLIER_RCV_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)} <br>
     * <pre>e.g. setSupplierRcvNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierRcvNo The value of supplierRcvNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierRcvNo_LikeSearch(String supplierRcvNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierRcvNo), xgetCValueSupplierRcvNo(), "SUPPLIER_RCV_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierRcvNo_NotLikeSearch(String supplierRcvNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierRcvNo), xgetCValueSupplierRcvNo(), "SUPPLIER_RCV_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     * @param supplierRcvNo The value of supplierRcvNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierRcvNo_PrefixSearch(String supplierRcvNo) {
        setSupplierRcvNo_LikeSearch(supplierRcvNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     */
    public void setSupplierRcvNo_IsNull() { regSupplierRcvNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     */
    public void setSupplierRcvNo_IsNullOrEmpty() { regSupplierRcvNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIER_RCV_NO: {varchar(255)}
     */
    public void setSupplierRcvNo_IsNotNull() { regSupplierRcvNo(CK_ISNN, DOBJ); }

    protected void regSupplierRcvNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierRcvNo(), "SUPPLIER_RCV_NO"); }
    protected abstract ConditionValue xgetCValueSupplierRcvNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_Equal(String tokuhanCd) {
        doSetTokuhanCd_Equal(fRES(tokuhanCd));
    }

    protected void doSetTokuhanCd_Equal(String tokuhanCd) {
        regTokuhanCd(CK_EQ, tokuhanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_NotEqual(String tokuhanCd) {
        doSetTokuhanCd_NotEqual(fRES(tokuhanCd));
    }

    protected void doSetTokuhanCd_NotEqual(String tokuhanCd) {
        regTokuhanCd(CK_NES, tokuhanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_GreaterThan(String tokuhanCd) {
        regTokuhanCd(CK_GT, fRES(tokuhanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_LessThan(String tokuhanCd) {
        regTokuhanCd(CK_LT, fRES(tokuhanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_GreaterEqual(String tokuhanCd) {
        regTokuhanCd(CK_GE, fRES(tokuhanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_LessEqual(String tokuhanCd) {
        regTokuhanCd(CK_LE, fRES(tokuhanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCdList The collection of tokuhanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_InScope(Collection<String> tokuhanCdList) {
        doSetTokuhanCd_InScope(tokuhanCdList);
    }

    protected void doSetTokuhanCd_InScope(Collection<String> tokuhanCdList) {
        regINS(CK_INS, cTL(tokuhanCdList), xgetCValueTokuhanCd(), "TOKUHAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCdList The collection of tokuhanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_NotInScope(Collection<String> tokuhanCdList) {
        doSetTokuhanCd_NotInScope(tokuhanCdList);
    }

    protected void doSetTokuhanCd_NotInScope(Collection<String> tokuhanCdList) {
        regINS(CK_NINS, cTL(tokuhanCdList), xgetCValueTokuhanCd(), "TOKUHAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_CD: {varchar(255)} <br>
     * <pre>e.g. setTokuhanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokuhanCd The value of tokuhanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTokuhanCd_LikeSearch(String tokuhanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokuhanCd), xgetCValueTokuhanCd(), "TOKUHAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTokuhanCd_NotLikeSearch(String tokuhanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokuhanCd), xgetCValueTokuhanCd(), "TOKUHAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     * @param tokuhanCd The value of tokuhanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanCd_PrefixSearch(String tokuhanCd) {
        setTokuhanCd_LikeSearch(tokuhanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     */
    public void setTokuhanCd_IsNull() { regTokuhanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     */
    public void setTokuhanCd_IsNullOrEmpty() { regTokuhanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_CD: {varchar(255)}
     */
    public void setTokuhanCd_IsNotNull() { regTokuhanCd(CK_ISNN, DOBJ); }

    protected void regTokuhanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokuhanCd(), "TOKUHAN_CD"); }
    protected abstract ConditionValue xgetCValueTokuhanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_Equal(String tokuhanSname) {
        doSetTokuhanSname_Equal(fRES(tokuhanSname));
    }

    protected void doSetTokuhanSname_Equal(String tokuhanSname) {
        regTokuhanSname(CK_EQ, tokuhanSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_NotEqual(String tokuhanSname) {
        doSetTokuhanSname_NotEqual(fRES(tokuhanSname));
    }

    protected void doSetTokuhanSname_NotEqual(String tokuhanSname) {
        regTokuhanSname(CK_NES, tokuhanSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_GreaterThan(String tokuhanSname) {
        regTokuhanSname(CK_GT, fRES(tokuhanSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_LessThan(String tokuhanSname) {
        regTokuhanSname(CK_LT, fRES(tokuhanSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_GreaterEqual(String tokuhanSname) {
        regTokuhanSname(CK_GE, fRES(tokuhanSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_LessEqual(String tokuhanSname) {
        regTokuhanSname(CK_LE, fRES(tokuhanSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSnameList The collection of tokuhanSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_InScope(Collection<String> tokuhanSnameList) {
        doSetTokuhanSname_InScope(tokuhanSnameList);
    }

    protected void doSetTokuhanSname_InScope(Collection<String> tokuhanSnameList) {
        regINS(CK_INS, cTL(tokuhanSnameList), xgetCValueTokuhanSname(), "TOKUHAN_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSnameList The collection of tokuhanSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_NotInScope(Collection<String> tokuhanSnameList) {
        doSetTokuhanSname_NotInScope(tokuhanSnameList);
    }

    protected void doSetTokuhanSname_NotInScope(Collection<String> tokuhanSnameList) {
        regINS(CK_NINS, cTL(tokuhanSnameList), xgetCValueTokuhanSname(), "TOKUHAN_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)} <br>
     * <pre>e.g. setTokuhanSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokuhanSname The value of tokuhanSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTokuhanSname_LikeSearch(String tokuhanSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokuhanSname), xgetCValueTokuhanSname(), "TOKUHAN_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTokuhanSname_NotLikeSearch(String tokuhanSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokuhanSname), xgetCValueTokuhanSname(), "TOKUHAN_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     * @param tokuhanSname The value of tokuhanSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanSname_PrefixSearch(String tokuhanSname) {
        setTokuhanSname_LikeSearch(tokuhanSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     */
    public void setTokuhanSname_IsNull() { regTokuhanSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     */
    public void setTokuhanSname_IsNullOrEmpty() { regTokuhanSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_SNAME: {varchar(255)}
     */
    public void setTokuhanSname_IsNotNull() { regTokuhanSname(CK_ISNN, DOBJ); }

    protected void regTokuhanSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokuhanSname(), "TOKUHAN_SNAME"); }
    protected abstract ConditionValue xgetCValueTokuhanSname();

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
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_Equal(String caseItfNo) {
        doSetCaseItfNo_Equal(fRES(caseItfNo));
    }

    protected void doSetCaseItfNo_Equal(String caseItfNo) {
        regCaseItfNo(CK_EQ, caseItfNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_NotEqual(String caseItfNo) {
        doSetCaseItfNo_NotEqual(fRES(caseItfNo));
    }

    protected void doSetCaseItfNo_NotEqual(String caseItfNo) {
        regCaseItfNo(CK_NES, caseItfNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_GreaterThan(String caseItfNo) {
        regCaseItfNo(CK_GT, fRES(caseItfNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_LessThan(String caseItfNo) {
        regCaseItfNo(CK_LT, fRES(caseItfNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_GreaterEqual(String caseItfNo) {
        regCaseItfNo(CK_GE, fRES(caseItfNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_LessEqual(String caseItfNo) {
        regCaseItfNo(CK_LE, fRES(caseItfNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNoList The collection of caseItfNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_InScope(Collection<String> caseItfNoList) {
        doSetCaseItfNo_InScope(caseItfNoList);
    }

    protected void doSetCaseItfNo_InScope(Collection<String> caseItfNoList) {
        regINS(CK_INS, cTL(caseItfNoList), xgetCValueCaseItfNo(), "CASE_ITF_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNoList The collection of caseItfNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_NotInScope(Collection<String> caseItfNoList) {
        doSetCaseItfNo_NotInScope(caseItfNoList);
    }

    protected void doSetCaseItfNo_NotInScope(Collection<String> caseItfNoList) {
        regINS(CK_NINS, cTL(caseItfNoList), xgetCValueCaseItfNo(), "CASE_ITF_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_ITF_NO: {varchar(255)} <br>
     * <pre>e.g. setCaseItfNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseItfNo The value of caseItfNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseItfNo_LikeSearch(String caseItfNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseItfNo), xgetCValueCaseItfNo(), "CASE_ITF_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseItfNo_NotLikeSearch(String caseItfNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseItfNo), xgetCValueCaseItfNo(), "CASE_ITF_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     * @param caseItfNo The value of caseItfNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseItfNo_PrefixSearch(String caseItfNo) {
        setCaseItfNo_LikeSearch(caseItfNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     */
    public void setCaseItfNo_IsNull() { regCaseItfNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     */
    public void setCaseItfNo_IsNullOrEmpty() { regCaseItfNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_ITF_NO: {varchar(255)}
     */
    public void setCaseItfNo_IsNotNull() { regCaseItfNo(CK_ISNN, DOBJ); }

    protected void regCaseItfNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseItfNo(), "CASE_ITF_NO"); }
    protected abstract ConditionValue xgetCValueCaseItfNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_Equal(String caseBarcodeValiant) {
        doSetCaseBarcodeValiant_Equal(fRES(caseBarcodeValiant));
    }

    protected void doSetCaseBarcodeValiant_Equal(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_EQ, caseBarcodeValiant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_NotEqual(String caseBarcodeValiant) {
        doSetCaseBarcodeValiant_NotEqual(fRES(caseBarcodeValiant));
    }

    protected void doSetCaseBarcodeValiant_NotEqual(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_NES, caseBarcodeValiant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_GreaterThan(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_GT, fRES(caseBarcodeValiant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_LessThan(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_LT, fRES(caseBarcodeValiant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_GreaterEqual(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_GE, fRES(caseBarcodeValiant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_LessEqual(String caseBarcodeValiant) {
        regCaseBarcodeValiant(CK_LE, fRES(caseBarcodeValiant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiantList The collection of caseBarcodeValiant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_InScope(Collection<String> caseBarcodeValiantList) {
        doSetCaseBarcodeValiant_InScope(caseBarcodeValiantList);
    }

    protected void doSetCaseBarcodeValiant_InScope(Collection<String> caseBarcodeValiantList) {
        regINS(CK_INS, cTL(caseBarcodeValiantList), xgetCValueCaseBarcodeValiant(), "CASE_BARCODE_VALIANT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiantList The collection of caseBarcodeValiant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_NotInScope(Collection<String> caseBarcodeValiantList) {
        doSetCaseBarcodeValiant_NotInScope(caseBarcodeValiantList);
    }

    protected void doSetCaseBarcodeValiant_NotInScope(Collection<String> caseBarcodeValiantList) {
        regINS(CK_NINS, cTL(caseBarcodeValiantList), xgetCValueCaseBarcodeValiant(), "CASE_BARCODE_VALIANT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)} <br>
     * <pre>e.g. setCaseBarcodeValiant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseBarcodeValiant The value of caseBarcodeValiant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseBarcodeValiant_LikeSearch(String caseBarcodeValiant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseBarcodeValiant), xgetCValueCaseBarcodeValiant(), "CASE_BARCODE_VALIANT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseBarcodeValiant_NotLikeSearch(String caseBarcodeValiant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseBarcodeValiant), xgetCValueCaseBarcodeValiant(), "CASE_BARCODE_VALIANT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     * @param caseBarcodeValiant The value of caseBarcodeValiant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseBarcodeValiant_PrefixSearch(String caseBarcodeValiant) {
        setCaseBarcodeValiant_LikeSearch(caseBarcodeValiant, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     */
    public void setCaseBarcodeValiant_IsNull() { regCaseBarcodeValiant(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     */
    public void setCaseBarcodeValiant_IsNullOrEmpty() { regCaseBarcodeValiant(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_BARCODE_VALIANT: {varchar(255)}
     */
    public void setCaseBarcodeValiant_IsNotNull() { regCaseBarcodeValiant(CK_ISNN, DOBJ); }

    protected void regCaseBarcodeValiant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseBarcodeValiant(), "CASE_BARCODE_VALIANT"); }
    protected abstract ConditionValue xgetCValueCaseBarcodeValiant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_Equal(String caseLot4) {
        doSetCaseLot4_Equal(fRES(caseLot4));
    }

    protected void doSetCaseLot4_Equal(String caseLot4) {
        regCaseLot4(CK_EQ, caseLot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_NotEqual(String caseLot4) {
        doSetCaseLot4_NotEqual(fRES(caseLot4));
    }

    protected void doSetCaseLot4_NotEqual(String caseLot4) {
        regCaseLot4(CK_NES, caseLot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_GreaterThan(String caseLot4) {
        regCaseLot4(CK_GT, fRES(caseLot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_LessThan(String caseLot4) {
        regCaseLot4(CK_LT, fRES(caseLot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_GreaterEqual(String caseLot4) {
        regCaseLot4(CK_GE, fRES(caseLot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_LessEqual(String caseLot4) {
        regCaseLot4(CK_LE, fRES(caseLot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4List The collection of caseLot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_InScope(Collection<String> caseLot4List) {
        doSetCaseLot4_InScope(caseLot4List);
    }

    protected void doSetCaseLot4_InScope(Collection<String> caseLot4List) {
        regINS(CK_INS, cTL(caseLot4List), xgetCValueCaseLot4(), "CASE_LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4List The collection of caseLot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_NotInScope(Collection<String> caseLot4List) {
        doSetCaseLot4_NotInScope(caseLot4List);
    }

    protected void doSetCaseLot4_NotInScope(Collection<String> caseLot4List) {
        regINS(CK_NINS, cTL(caseLot4List), xgetCValueCaseLot4(), "CASE_LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_LOT4: {varchar(255)} <br>
     * <pre>e.g. setCaseLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseLot4 The value of caseLot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseLot4_LikeSearch(String caseLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseLot4), xgetCValueCaseLot4(), "CASE_LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseLot4_NotLikeSearch(String caseLot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseLot4), xgetCValueCaseLot4(), "CASE_LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     * @param caseLot4 The value of caseLot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseLot4_PrefixSearch(String caseLot4) {
        setCaseLot4_LikeSearch(caseLot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     */
    public void setCaseLot4_IsNull() { regCaseLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     */
    public void setCaseLot4_IsNullOrEmpty() { regCaseLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_LOT4: {varchar(255)}
     */
    public void setCaseLot4_IsNotNull() { regCaseLot4(CK_ISNN, DOBJ); }

    protected void regCaseLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseLot4(), "CASE_LOT4"); }
    protected abstract ConditionValue xgetCValueCaseLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_Equal(String caseCenterNo) {
        doSetCaseCenterNo_Equal(fRES(caseCenterNo));
    }

    protected void doSetCaseCenterNo_Equal(String caseCenterNo) {
        regCaseCenterNo(CK_EQ, caseCenterNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_NotEqual(String caseCenterNo) {
        doSetCaseCenterNo_NotEqual(fRES(caseCenterNo));
    }

    protected void doSetCaseCenterNo_NotEqual(String caseCenterNo) {
        regCaseCenterNo(CK_NES, caseCenterNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_GreaterThan(String caseCenterNo) {
        regCaseCenterNo(CK_GT, fRES(caseCenterNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_LessThan(String caseCenterNo) {
        regCaseCenterNo(CK_LT, fRES(caseCenterNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_GreaterEqual(String caseCenterNo) {
        regCaseCenterNo(CK_GE, fRES(caseCenterNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_LessEqual(String caseCenterNo) {
        regCaseCenterNo(CK_LE, fRES(caseCenterNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNoList The collection of caseCenterNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_InScope(Collection<String> caseCenterNoList) {
        doSetCaseCenterNo_InScope(caseCenterNoList);
    }

    protected void doSetCaseCenterNo_InScope(Collection<String> caseCenterNoList) {
        regINS(CK_INS, cTL(caseCenterNoList), xgetCValueCaseCenterNo(), "CASE_CENTER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNoList The collection of caseCenterNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_NotInScope(Collection<String> caseCenterNoList) {
        doSetCaseCenterNo_NotInScope(caseCenterNoList);
    }

    protected void doSetCaseCenterNo_NotInScope(Collection<String> caseCenterNoList) {
        regINS(CK_NINS, cTL(caseCenterNoList), xgetCValueCaseCenterNo(), "CASE_CENTER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)} <br>
     * <pre>e.g. setCaseCenterNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseCenterNo The value of caseCenterNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseCenterNo_LikeSearch(String caseCenterNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseCenterNo), xgetCValueCaseCenterNo(), "CASE_CENTER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseCenterNo_NotLikeSearch(String caseCenterNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseCenterNo), xgetCValueCaseCenterNo(), "CASE_CENTER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     * @param caseCenterNo The value of caseCenterNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseCenterNo_PrefixSearch(String caseCenterNo) {
        setCaseCenterNo_LikeSearch(caseCenterNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     */
    public void setCaseCenterNo_IsNull() { regCaseCenterNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     */
    public void setCaseCenterNo_IsNullOrEmpty() { regCaseCenterNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_CENTER_NO: {varchar(255)}
     */
    public void setCaseCenterNo_IsNotNull() { regCaseCenterNo(CK_ISNN, DOBJ); }

    protected void regCaseCenterNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCenterNo(), "CASE_CENTER_NO"); }
    protected abstract ConditionValue xgetCValueCaseCenterNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_Equal(String casePackNo) {
        doSetCasePackNo_Equal(fRES(casePackNo));
    }

    protected void doSetCasePackNo_Equal(String casePackNo) {
        regCasePackNo(CK_EQ, casePackNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_NotEqual(String casePackNo) {
        doSetCasePackNo_NotEqual(fRES(casePackNo));
    }

    protected void doSetCasePackNo_NotEqual(String casePackNo) {
        regCasePackNo(CK_NES, casePackNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_GreaterThan(String casePackNo) {
        regCasePackNo(CK_GT, fRES(casePackNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_LessThan(String casePackNo) {
        regCasePackNo(CK_LT, fRES(casePackNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_GreaterEqual(String casePackNo) {
        regCasePackNo(CK_GE, fRES(casePackNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_LessEqual(String casePackNo) {
        regCasePackNo(CK_LE, fRES(casePackNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNoList The collection of casePackNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_InScope(Collection<String> casePackNoList) {
        doSetCasePackNo_InScope(casePackNoList);
    }

    protected void doSetCasePackNo_InScope(Collection<String> casePackNoList) {
        regINS(CK_INS, cTL(casePackNoList), xgetCValueCasePackNo(), "CASE_PACK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNoList The collection of casePackNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_NotInScope(Collection<String> casePackNoList) {
        doSetCasePackNo_NotInScope(casePackNoList);
    }

    protected void doSetCasePackNo_NotInScope(Collection<String> casePackNoList) {
        regINS(CK_NINS, cTL(casePackNoList), xgetCValueCasePackNo(), "CASE_PACK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_NO: {varchar(255)} <br>
     * <pre>e.g. setCasePackNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casePackNo The value of casePackNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasePackNo_LikeSearch(String casePackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casePackNo), xgetCValueCasePackNo(), "CASE_PACK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasePackNo_NotLikeSearch(String casePackNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casePackNo), xgetCValueCasePackNo(), "CASE_PACK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     * @param casePackNo The value of casePackNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackNo_PrefixSearch(String casePackNo) {
        setCasePackNo_LikeSearch(casePackNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     */
    public void setCasePackNo_IsNull() { regCasePackNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     */
    public void setCasePackNo_IsNullOrEmpty() { regCasePackNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PACK_NO: {varchar(255)}
     */
    public void setCasePackNo_IsNotNull() { regCasePackNo(CK_ISNN, DOBJ); }

    protected void regCasePackNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePackNo(), "CASE_PACK_NO"); }
    protected abstract ConditionValue xgetCValueCasePackNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_Equal(String casePackTime) {
        doSetCasePackTime_Equal(fRES(casePackTime));
    }

    protected void doSetCasePackTime_Equal(String casePackTime) {
        regCasePackTime(CK_EQ, casePackTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_NotEqual(String casePackTime) {
        doSetCasePackTime_NotEqual(fRES(casePackTime));
    }

    protected void doSetCasePackTime_NotEqual(String casePackTime) {
        regCasePackTime(CK_NES, casePackTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_GreaterThan(String casePackTime) {
        regCasePackTime(CK_GT, fRES(casePackTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_LessThan(String casePackTime) {
        regCasePackTime(CK_LT, fRES(casePackTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_GreaterEqual(String casePackTime) {
        regCasePackTime(CK_GE, fRES(casePackTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_LessEqual(String casePackTime) {
        regCasePackTime(CK_LE, fRES(casePackTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTimeList The collection of casePackTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_InScope(Collection<String> casePackTimeList) {
        doSetCasePackTime_InScope(casePackTimeList);
    }

    protected void doSetCasePackTime_InScope(Collection<String> casePackTimeList) {
        regINS(CK_INS, cTL(casePackTimeList), xgetCValueCasePackTime(), "CASE_PACK_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTimeList The collection of casePackTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_NotInScope(Collection<String> casePackTimeList) {
        doSetCasePackTime_NotInScope(casePackTimeList);
    }

    protected void doSetCasePackTime_NotInScope(Collection<String> casePackTimeList) {
        regINS(CK_NINS, cTL(casePackTimeList), xgetCValueCasePackTime(), "CASE_PACK_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)} <br>
     * <pre>e.g. setCasePackTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casePackTime The value of casePackTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasePackTime_LikeSearch(String casePackTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casePackTime), xgetCValueCasePackTime(), "CASE_PACK_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasePackTime_NotLikeSearch(String casePackTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casePackTime), xgetCValueCasePackTime(), "CASE_PACK_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     * @param casePackTime The value of casePackTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePackTime_PrefixSearch(String casePackTime) {
        setCasePackTime_LikeSearch(casePackTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     */
    public void setCasePackTime_IsNull() { regCasePackTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     */
    public void setCasePackTime_IsNullOrEmpty() { regCasePackTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PACK_TIME: {varchar(255)}
     */
    public void setCasePackTime_IsNotNull() { regCasePackTime(CK_ISNN, DOBJ); }

    protected void regCasePackTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePackTime(), "CASE_PACK_TIME"); }
    protected abstract ConditionValue xgetCValueCasePackTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_Equal(String senderLocation) {
        doSetSenderLocation_Equal(fRES(senderLocation));
    }

    protected void doSetSenderLocation_Equal(String senderLocation) {
        regSenderLocation(CK_EQ, senderLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotEqual(String senderLocation) {
        doSetSenderLocation_NotEqual(fRES(senderLocation));
    }

    protected void doSetSenderLocation_NotEqual(String senderLocation) {
        regSenderLocation(CK_NES, senderLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterThan(String senderLocation) {
        regSenderLocation(CK_GT, fRES(senderLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessThan(String senderLocation) {
        regSenderLocation(CK_LT, fRES(senderLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterEqual(String senderLocation) {
        regSenderLocation(CK_GE, fRES(senderLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessEqual(String senderLocation) {
        regSenderLocation(CK_LE, fRES(senderLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocationList The collection of senderLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_InScope(Collection<String> senderLocationList) {
        doSetSenderLocation_InScope(senderLocationList);
    }

    protected void doSetSenderLocation_InScope(Collection<String> senderLocationList) {
        regINS(CK_INS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocationList The collection of senderLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotInScope(Collection<String> senderLocationList) {
        doSetSenderLocation_NotInScope(senderLocationList);
    }

    protected void doSetSenderLocation_NotInScope(Collection<String> senderLocationList) {
        regINS(CK_NINS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(255)} <br>
     * <pre>e.g. setSenderLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param senderLocation The value of senderLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSenderLocation_LikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSenderLocation_NotLikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     * @param senderLocation The value of senderLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_PrefixSearch(String senderLocation) {
        setSenderLocation_LikeSearch(senderLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     */
    public void setSenderLocation_IsNull() { regSenderLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     */
    public void setSenderLocation_IsNullOrEmpty() { regSenderLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(255)}
     */
    public void setSenderLocation_IsNotNull() { regSenderLocation(CK_ISNN, DOBJ); }

    protected void regSenderLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSenderLocation(), "SENDER_LOCATION"); }
    protected abstract ConditionValue xgetCValueSenderLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_Equal(String receiverLocation) {
        doSetReceiverLocation_Equal(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_Equal(String receiverLocation) {
        regReceiverLocation(CK_EQ, receiverLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotEqual(String receiverLocation) {
        doSetReceiverLocation_NotEqual(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_NotEqual(String receiverLocation) {
        regReceiverLocation(CK_NES, receiverLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterThan(String receiverLocation) {
        regReceiverLocation(CK_GT, fRES(receiverLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessThan(String receiverLocation) {
        regReceiverLocation(CK_LT, fRES(receiverLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterEqual(String receiverLocation) {
        regReceiverLocation(CK_GE, fRES(receiverLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessEqual(String receiverLocation) {
        regReceiverLocation(CK_LE, fRES(receiverLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocationList The collection of receiverLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_InScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_InScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_InScope(Collection<String> receiverLocationList) {
        regINS(CK_INS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocationList The collection of receiverLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_NotInScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        regINS(CK_NINS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)} <br>
     * <pre>e.g. setReceiverLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiverLocation The value of receiverLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiverLocation_LikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiverLocation_NotLikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     * @param receiverLocation The value of receiverLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_PrefixSearch(String receiverLocation) {
        setReceiverLocation_LikeSearch(receiverLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     */
    public void setReceiverLocation_IsNull() { regReceiverLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     */
    public void setReceiverLocation_IsNullOrEmpty() { regReceiverLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(255)}
     */
    public void setReceiverLocation_IsNotNull() { regReceiverLocation(CK_ISNN, DOBJ); }

    protected void regReceiverLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiverLocation(), "RECEIVER_LOCATION"); }
    protected abstract ConditionValue xgetCValueReceiverLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_Equal(String shipmentId) {
        doSetShipmentId_Equal(fRES(shipmentId));
    }

    protected void doSetShipmentId_Equal(String shipmentId) {
        regShipmentId(CK_EQ, shipmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotEqual(String shipmentId) {
        doSetShipmentId_NotEqual(fRES(shipmentId));
    }

    protected void doSetShipmentId_NotEqual(String shipmentId) {
        regShipmentId(CK_NES, shipmentId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterThan(String shipmentId) {
        regShipmentId(CK_GT, fRES(shipmentId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessThan(String shipmentId) {
        regShipmentId(CK_LT, fRES(shipmentId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterEqual(String shipmentId) {
        regShipmentId(CK_GE, fRES(shipmentId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessEqual(String shipmentId) {
        regShipmentId(CK_LE, fRES(shipmentId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentIdList The collection of shipmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_InScope(Collection<String> shipmentIdList) {
        doSetShipmentId_InScope(shipmentIdList);
    }

    protected void doSetShipmentId_InScope(Collection<String> shipmentIdList) {
        regINS(CK_INS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentIdList The collection of shipmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotInScope(Collection<String> shipmentIdList) {
        doSetShipmentId_NotInScope(shipmentIdList);
    }

    protected void doSetShipmentId_NotInScope(Collection<String> shipmentIdList) {
        regINS(CK_NINS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(255)} <br>
     * <pre>e.g. setShipmentId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentId The value of shipmentId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentId_LikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentId_NotLikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     * @param shipmentId The value of shipmentId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_PrefixSearch(String shipmentId) {
        setShipmentId_LikeSearch(shipmentId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     */
    public void setShipmentId_IsNull() { regShipmentId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     */
    public void setShipmentId_IsNullOrEmpty() { regShipmentId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(255)}
     */
    public void setShipmentId_IsNotNull() { regShipmentId(CK_ISNN, DOBJ); }

    protected void regShipmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentId(), "SHIPMENT_ID"); }
    protected abstract ConditionValue xgetCValueShipmentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_Equal(String shipmentDate) {
        doSetShipmentDate_Equal(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_Equal(String shipmentDate) {
        regShipmentDate(CK_EQ, shipmentDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotEqual(String shipmentDate) {
        doSetShipmentDate_NotEqual(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_NotEqual(String shipmentDate) {
        regShipmentDate(CK_NES, shipmentDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterThan(String shipmentDate) {
        regShipmentDate(CK_GT, fRES(shipmentDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessThan(String shipmentDate) {
        regShipmentDate(CK_LT, fRES(shipmentDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterEqual(String shipmentDate) {
        regShipmentDate(CK_GE, fRES(shipmentDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessEqual(String shipmentDate) {
        regShipmentDate(CK_LE, fRES(shipmentDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDateList The collection of shipmentDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_InScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_InScope(shipmentDateList);
    }

    protected void doSetShipmentDate_InScope(Collection<String> shipmentDateList) {
        regINS(CK_INS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDateList The collection of shipmentDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_NotInScope(shipmentDateList);
    }

    protected void doSetShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        regINS(CK_NINS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)} <br>
     * <pre>e.g. setShipmentDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentDate The value of shipmentDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentDate_LikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentDate_NotLikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     * @param shipmentDate The value of shipmentDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_PrefixSearch(String shipmentDate) {
        setShipmentDate_LikeSearch(shipmentDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     */
    public void setShipmentDate_IsNull() { regShipmentDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     */
    public void setShipmentDate_IsNullOrEmpty() { regShipmentDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(255)}
     */
    public void setShipmentDate_IsNotNull() { regShipmentDate(CK_ISNN, DOBJ); }

    protected void regShipmentDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentDate(), "SHIPMENT_DATE"); }
    protected abstract ConditionValue xgetCValueShipmentDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_Equal(String numberOfPallets) {
        doSetNumberOfPallets_Equal(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_Equal(String numberOfPallets) {
        regNumberOfPallets(CK_EQ, numberOfPallets);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotEqual(String numberOfPallets) {
        doSetNumberOfPallets_NotEqual(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_NotEqual(String numberOfPallets) {
        regNumberOfPallets(CK_NES, numberOfPallets);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterThan(String numberOfPallets) {
        regNumberOfPallets(CK_GT, fRES(numberOfPallets));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessThan(String numberOfPallets) {
        regNumberOfPallets(CK_LT, fRES(numberOfPallets));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterEqual(String numberOfPallets) {
        regNumberOfPallets(CK_GE, fRES(numberOfPallets));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessEqual(String numberOfPallets) {
        regNumberOfPallets(CK_LE, fRES(numberOfPallets));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPalletsList The collection of numberOfPallets as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_InScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        regINS(CK_INS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPalletsList The collection of numberOfPallets as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_NotInScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        regINS(CK_NINS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)} <br>
     * <pre>e.g. setNumberOfPallets_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberOfPallets The value of numberOfPallets as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberOfPallets_LikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberOfPallets_NotLikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     * @param numberOfPallets The value of numberOfPallets as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_PrefixSearch(String numberOfPallets) {
        setNumberOfPallets_LikeSearch(numberOfPallets, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     */
    public void setNumberOfPallets_IsNull() { regNumberOfPallets(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     */
    public void setNumberOfPallets_IsNullOrEmpty() { regNumberOfPallets(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(255)}
     */
    public void setNumberOfPallets_IsNotNull() { regNumberOfPallets(CK_ISNN, DOBJ); }

    protected void regNumberOfPallets(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS"); }
    protected abstract ConditionValue xgetCValueNumberOfPallets();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_Equal(String carrierNo) {
        doSetCarrierNo_Equal(fRES(carrierNo));
    }

    protected void doSetCarrierNo_Equal(String carrierNo) {
        regCarrierNo(CK_EQ, carrierNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_NotEqual(String carrierNo) {
        doSetCarrierNo_NotEqual(fRES(carrierNo));
    }

    protected void doSetCarrierNo_NotEqual(String carrierNo) {
        regCarrierNo(CK_NES, carrierNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_GreaterThan(String carrierNo) {
        regCarrierNo(CK_GT, fRES(carrierNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_LessThan(String carrierNo) {
        regCarrierNo(CK_LT, fRES(carrierNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_GreaterEqual(String carrierNo) {
        regCarrierNo(CK_GE, fRES(carrierNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_LessEqual(String carrierNo) {
        regCarrierNo(CK_LE, fRES(carrierNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNoList The collection of carrierNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_InScope(Collection<String> carrierNoList) {
        doSetCarrierNo_InScope(carrierNoList);
    }

    protected void doSetCarrierNo_InScope(Collection<String> carrierNoList) {
        regINS(CK_INS, cTL(carrierNoList), xgetCValueCarrierNo(), "CARRIER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNoList The collection of carrierNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_NotInScope(Collection<String> carrierNoList) {
        doSetCarrierNo_NotInScope(carrierNoList);
    }

    protected void doSetCarrierNo_NotInScope(Collection<String> carrierNoList) {
        regINS(CK_NINS, cTL(carrierNoList), xgetCValueCarrierNo(), "CARRIER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NO: {varchar(255)} <br>
     * <pre>e.g. setCarrierNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierNo The value of carrierNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierNo_LikeSearch(String carrierNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierNo), xgetCValueCarrierNo(), "CARRIER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNo_NotLikeSearch(String carrierNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNo), xgetCValueCarrierNo(), "CARRIER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     * @param carrierNo The value of carrierNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNo_PrefixSearch(String carrierNo) {
        setCarrierNo_LikeSearch(carrierNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     */
    public void setCarrierNo_IsNull() { regCarrierNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     */
    public void setCarrierNo_IsNullOrEmpty() { regCarrierNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_NO: {varchar(255)}
     */
    public void setCarrierNo_IsNotNull() { regCarrierNo(CK_ISNN, DOBJ); }

    protected void regCarrierNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNo(), "CARRIER_NO"); }
    protected abstract ConditionValue xgetCValueCarrierNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_Equal(String orderNo) {
        doSetOrderNo_Equal(fRES(orderNo));
    }

    protected void doSetOrderNo_Equal(String orderNo) {
        regOrderNo(CK_EQ, orderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotEqual(String orderNo) {
        doSetOrderNo_NotEqual(fRES(orderNo));
    }

    protected void doSetOrderNo_NotEqual(String orderNo) {
        regOrderNo(CK_NES, orderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterThan(String orderNo) {
        regOrderNo(CK_GT, fRES(orderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessThan(String orderNo) {
        regOrderNo(CK_LT, fRES(orderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_GreaterEqual(String orderNo) {
        regOrderNo(CK_GE, fRES(orderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_LessEqual(String orderNo) {
        regOrderNo(CK_LE, fRES(orderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNoList The collection of orderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_InScope(Collection<String> orderNoList) {
        doSetOrderNo_InScope(orderNoList);
    }

    protected void doSetOrderNo_InScope(Collection<String> orderNoList) {
        regINS(CK_INS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNoList The collection of orderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_NotInScope(Collection<String> orderNoList) {
        doSetOrderNo_NotInScope(orderNoList);
    }

    protected void doSetOrderNo_NotInScope(Collection<String> orderNoList) {
        regINS(CK_NINS, cTL(orderNoList), xgetCValueOrderNo(), "ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(255)} <br>
     * <pre>e.g. setOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNo The value of orderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNo_LikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNo_NotLikeSearch(String orderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNo), xgetCValueOrderNo(), "ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO: {varchar(255)}
     * @param orderNo The value of orderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNo_PrefixSearch(String orderNo) {
        setOrderNo_LikeSearch(orderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     */
    public void setOrderNo_IsNull() { regOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     */
    public void setOrderNo_IsNullOrEmpty() { regOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NO: {varchar(255)}
     */
    public void setOrderNo_IsNotNull() { regOrderNo(CK_ISNN, DOBJ); }

    protected void regOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNo(), "ORDER_NO"); }
    protected abstract ConditionValue xgetCValueOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_Equal(String srcCd) {
        doSetSrcCd_Equal(fRES(srcCd));
    }

    protected void doSetSrcCd_Equal(String srcCd) {
        regSrcCd(CK_EQ, srcCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_NotEqual(String srcCd) {
        doSetSrcCd_NotEqual(fRES(srcCd));
    }

    protected void doSetSrcCd_NotEqual(String srcCd) {
        regSrcCd(CK_NES, srcCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_GreaterThan(String srcCd) {
        regSrcCd(CK_GT, fRES(srcCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_LessThan(String srcCd) {
        regSrcCd(CK_LT, fRES(srcCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_GreaterEqual(String srcCd) {
        regSrcCd(CK_GE, fRES(srcCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_LessEqual(String srcCd) {
        regSrcCd(CK_LE, fRES(srcCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCdList The collection of srcCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_InScope(Collection<String> srcCdList) {
        doSetSrcCd_InScope(srcCdList);
    }

    protected void doSetSrcCd_InScope(Collection<String> srcCdList) {
        regINS(CK_INS, cTL(srcCdList), xgetCValueSrcCd(), "SRC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCdList The collection of srcCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_NotInScope(Collection<String> srcCdList) {
        doSetSrcCd_NotInScope(srcCdList);
    }

    protected void doSetSrcCd_NotInScope(Collection<String> srcCdList) {
        regINS(CK_NINS, cTL(srcCdList), xgetCValueSrcCd(), "SRC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRC_CD: {varchar(255)} <br>
     * <pre>e.g. setSrcCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srcCd The value of srcCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrcCd_LikeSearch(String srcCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srcCd), xgetCValueSrcCd(), "SRC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrcCd_NotLikeSearch(String srcCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srcCd), xgetCValueSrcCd(), "SRC_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRC_CD: {varchar(255)}
     * @param srcCd The value of srcCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrcCd_PrefixSearch(String srcCd) {
        setSrcCd_LikeSearch(srcCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     */
    public void setSrcCd_IsNull() { regSrcCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     */
    public void setSrcCd_IsNullOrEmpty() { regSrcCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRC_CD: {varchar(255)}
     */
    public void setSrcCd_IsNotNull() { regSrcCd(CK_ISNN, DOBJ); }

    protected void regSrcCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrcCd(), "SRC_CD"); }
    protected abstract ConditionValue xgetCValueSrcCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_Equal(String blNo) {
        doSetBlNo_Equal(fRES(blNo));
    }

    protected void doSetBlNo_Equal(String blNo) {
        regBlNo(CK_EQ, blNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_NotEqual(String blNo) {
        doSetBlNo_NotEqual(fRES(blNo));
    }

    protected void doSetBlNo_NotEqual(String blNo) {
        regBlNo(CK_NES, blNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_GreaterThan(String blNo) {
        regBlNo(CK_GT, fRES(blNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_LessThan(String blNo) {
        regBlNo(CK_LT, fRES(blNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_GreaterEqual(String blNo) {
        regBlNo(CK_GE, fRES(blNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_LessEqual(String blNo) {
        regBlNo(CK_LE, fRES(blNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNoList The collection of blNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_InScope(Collection<String> blNoList) {
        doSetBlNo_InScope(blNoList);
    }

    protected void doSetBlNo_InScope(Collection<String> blNoList) {
        regINS(CK_INS, cTL(blNoList), xgetCValueBlNo(), "BL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNoList The collection of blNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_NotInScope(Collection<String> blNoList) {
        doSetBlNo_NotInScope(blNoList);
    }

    protected void doSetBlNo_NotInScope(Collection<String> blNoList) {
        regINS(CK_NINS, cTL(blNoList), xgetCValueBlNo(), "BL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)} <br>
     * <pre>e.g. setBlNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blNo The value of blNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlNo_LikeSearch(String blNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blNo), xgetCValueBlNo(), "BL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlNo_NotLikeSearch(String blNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blNo), xgetCValueBlNo(), "BL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BL_NO: {varchar(255)}
     * @param blNo The value of blNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlNo_PrefixSearch(String blNo) {
        setBlNo_LikeSearch(blNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNull() { regBlNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNullOrEmpty() { regBlNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BL_NO: {varchar(255)}
     */
    public void setBlNo_IsNotNull() { regBlNo(CK_ISNN, DOBJ); }

    protected void regBlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlNo(), "BL_NO"); }
    protected abstract ConditionValue xgetCValueBlNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_Equal(String invoiceNo) {
        doSetInvoiceNo_Equal(fRES(invoiceNo));
    }

    protected void doSetInvoiceNo_Equal(String invoiceNo) {
        regInvoiceNo(CK_EQ, invoiceNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_NotEqual(String invoiceNo) {
        doSetInvoiceNo_NotEqual(fRES(invoiceNo));
    }

    protected void doSetInvoiceNo_NotEqual(String invoiceNo) {
        regInvoiceNo(CK_NES, invoiceNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_GreaterThan(String invoiceNo) {
        regInvoiceNo(CK_GT, fRES(invoiceNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_LessThan(String invoiceNo) {
        regInvoiceNo(CK_LT, fRES(invoiceNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_GreaterEqual(String invoiceNo) {
        regInvoiceNo(CK_GE, fRES(invoiceNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_LessEqual(String invoiceNo) {
        regInvoiceNo(CK_LE, fRES(invoiceNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNoList The collection of invoiceNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_InScope(Collection<String> invoiceNoList) {
        doSetInvoiceNo_InScope(invoiceNoList);
    }

    protected void doSetInvoiceNo_InScope(Collection<String> invoiceNoList) {
        regINS(CK_INS, cTL(invoiceNoList), xgetCValueInvoiceNo(), "INVOICE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNoList The collection of invoiceNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_NotInScope(Collection<String> invoiceNoList) {
        doSetInvoiceNo_NotInScope(invoiceNoList);
    }

    protected void doSetInvoiceNo_NotInScope(Collection<String> invoiceNoList) {
        regINS(CK_NINS, cTL(invoiceNoList), xgetCValueInvoiceNo(), "INVOICE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_NO: {varchar(255)} <br>
     * <pre>e.g. setInvoiceNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceNo The value of invoiceNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceNo_LikeSearch(String invoiceNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceNo), xgetCValueInvoiceNo(), "INVOICE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceNo_NotLikeSearch(String invoiceNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceNo), xgetCValueInvoiceNo(), "INVOICE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     * @param invoiceNo The value of invoiceNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceNo_PrefixSearch(String invoiceNo) {
        setInvoiceNo_LikeSearch(invoiceNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     */
    public void setInvoiceNo_IsNull() { regInvoiceNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     */
    public void setInvoiceNo_IsNullOrEmpty() { regInvoiceNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_NO: {varchar(255)}
     */
    public void setInvoiceNo_IsNotNull() { regInvoiceNo(CK_ISNN, DOBJ); }

    protected void regInvoiceNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceNo(), "INVOICE_NO"); }
    protected abstract ConditionValue xgetCValueInvoiceNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_Equal(String sscc) {
        doSetSscc_Equal(fRES(sscc));
    }

    protected void doSetSscc_Equal(String sscc) {
        regSscc(CK_EQ, sscc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotEqual(String sscc) {
        doSetSscc_NotEqual(fRES(sscc));
    }

    protected void doSetSscc_NotEqual(String sscc) {
        regSscc(CK_NES, sscc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterThan(String sscc) {
        regSscc(CK_GT, fRES(sscc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessThan(String sscc) {
        regSscc(CK_LT, fRES(sscc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterEqual(String sscc) {
        regSscc(CK_GE, fRES(sscc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessEqual(String sscc) {
        regSscc(CK_LE, fRES(sscc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(255)}
     * @param ssccList The collection of sscc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_InScope(Collection<String> ssccList) {
        doSetSscc_InScope(ssccList);
    }

    protected void doSetSscc_InScope(Collection<String> ssccList) {
        regINS(CK_INS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(255)}
     * @param ssccList The collection of sscc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotInScope(Collection<String> ssccList) {
        doSetSscc_NotInScope(ssccList);
    }

    protected void doSetSscc_NotInScope(Collection<String> ssccList) {
        regINS(CK_NINS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(255)} <br>
     * <pre>e.g. setSscc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscc The value of sscc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscc_LikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscc_NotLikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(255)}
     * @param sscc The value of sscc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_PrefixSearch(String sscc) {
        setSscc_LikeSearch(sscc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     */
    public void setSscc_IsNull() { regSscc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     */
    public void setSscc_IsNullOrEmpty() { regSscc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(255)}
     */
    public void setSscc_IsNotNull() { regSscc(CK_ISNN, DOBJ); }

    protected void regSscc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscc(), "SSCC"); }
    protected abstract ConditionValue xgetCValueSscc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_Equal(String caseNo) {
        doSetCaseNo_Equal(fRES(caseNo));
    }

    protected void doSetCaseNo_Equal(String caseNo) {
        regCaseNo(CK_EQ, caseNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_NotEqual(String caseNo) {
        doSetCaseNo_NotEqual(fRES(caseNo));
    }

    protected void doSetCaseNo_NotEqual(String caseNo) {
        regCaseNo(CK_NES, caseNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_GreaterThan(String caseNo) {
        regCaseNo(CK_GT, fRES(caseNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_LessThan(String caseNo) {
        regCaseNo(CK_LT, fRES(caseNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_GreaterEqual(String caseNo) {
        regCaseNo(CK_GE, fRES(caseNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_LessEqual(String caseNo) {
        regCaseNo(CK_LE, fRES(caseNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNoList The collection of caseNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_InScope(Collection<String> caseNoList) {
        doSetCaseNo_InScope(caseNoList);
    }

    protected void doSetCaseNo_InScope(Collection<String> caseNoList) {
        regINS(CK_INS, cTL(caseNoList), xgetCValueCaseNo(), "CASE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNoList The collection of caseNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_NotInScope(Collection<String> caseNoList) {
        doSetCaseNo_NotInScope(caseNoList);
    }

    protected void doSetCaseNo_NotInScope(Collection<String> caseNoList) {
        regINS(CK_NINS, cTL(caseNoList), xgetCValueCaseNo(), "CASE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_NO: {varchar(255)} <br>
     * <pre>e.g. setCaseNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseNo The value of caseNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseNo_LikeSearch(String caseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseNo), xgetCValueCaseNo(), "CASE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseNo_NotLikeSearch(String caseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseNo), xgetCValueCaseNo(), "CASE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_NO: {varchar(255)}
     * @param caseNo The value of caseNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseNo_PrefixSearch(String caseNo) {
        setCaseNo_LikeSearch(caseNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     */
    public void setCaseNo_IsNull() { regCaseNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     */
    public void setCaseNo_IsNullOrEmpty() { regCaseNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_NO: {varchar(255)}
     */
    public void setCaseNo_IsNotNull() { regCaseNo(CK_ISNN, DOBJ); }

    protected void regCaseNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseNo(), "CASE_NO"); }
    protected abstract ConditionValue xgetCValueCaseNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_Equal(String invNum) {
        doSetInvNum_Equal(fRES(invNum));
    }

    protected void doSetInvNum_Equal(String invNum) {
        regInvNum(CK_EQ, invNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotEqual(String invNum) {
        doSetInvNum_NotEqual(fRES(invNum));
    }

    protected void doSetInvNum_NotEqual(String invNum) {
        regInvNum(CK_NES, invNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_GreaterThan(String invNum) {
        regInvNum(CK_GT, fRES(invNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_LessThan(String invNum) {
        regInvNum(CK_LT, fRES(invNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_GreaterEqual(String invNum) {
        regInvNum(CK_GE, fRES(invNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_LessEqual(String invNum) {
        regInvNum(CK_LE, fRES(invNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNumList The collection of invNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_InScope(Collection<String> invNumList) {
        doSetInvNum_InScope(invNumList);
    }

    protected void doSetInvNum_InScope(Collection<String> invNumList) {
        regINS(CK_INS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNumList The collection of invNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotInScope(Collection<String> invNumList) {
        doSetInvNum_NotInScope(invNumList);
    }

    protected void doSetInvNum_NotInScope(Collection<String> invNumList) {
        regINS(CK_NINS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)} <br>
     * <pre>e.g. setInvNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invNum The value of invNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvNum_LikeSearch(String invNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invNum), xgetCValueInvNum(), "INV_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvNum_NotLikeSearch(String invNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invNum), xgetCValueInvNum(), "INV_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_NUM: {varchar(255)}
     * @param invNum The value of invNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_PrefixSearch(String invNum) {
        setInvNum_LikeSearch(invNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNull() { regInvNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNullOrEmpty() { regInvNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {varchar(255)}
     */
    public void setInvNum_IsNotNull() { regInvNum(CK_ISNN, DOBJ); }

    protected void regInvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvNum(), "INV_NUM"); }
    protected abstract ConditionValue xgetCValueInvNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_Equal(String sortNum) {
        doSetSortNum_Equal(fRES(sortNum));
    }

    protected void doSetSortNum_Equal(String sortNum) {
        regSortNum(CK_EQ, sortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotEqual(String sortNum) {
        doSetSortNum_NotEqual(fRES(sortNum));
    }

    protected void doSetSortNum_NotEqual(String sortNum) {
        regSortNum(CK_NES, sortNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_GreaterThan(String sortNum) {
        regSortNum(CK_GT, fRES(sortNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_LessThan(String sortNum) {
        regSortNum(CK_LT, fRES(sortNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_GreaterEqual(String sortNum) {
        regSortNum(CK_GE, fRES(sortNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_LessEqual(String sortNum) {
        regSortNum(CK_LE, fRES(sortNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNumList The collection of sortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_InScope(Collection<String> sortNumList) {
        doSetSortNum_InScope(sortNumList);
    }

    protected void doSetSortNum_InScope(Collection<String> sortNumList) {
        regINS(CK_INS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNumList The collection of sortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotInScope(Collection<String> sortNumList) {
        doSetSortNum_NotInScope(sortNumList);
    }

    protected void doSetSortNum_NotInScope(Collection<String> sortNumList) {
        regINS(CK_NINS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)} <br>
     * <pre>e.g. setSortNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sortNum The value of sortNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSortNum_LikeSearch(String sortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sortNum), xgetCValueSortNum(), "SORT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSortNum_NotLikeSearch(String sortNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sortNum), xgetCValueSortNum(), "SORT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SORT_NUM: {varchar(255)}
     * @param sortNum The value of sortNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_PrefixSearch(String sortNum) {
        setSortNum_LikeSearch(sortNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNull() { regSortNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNullOrEmpty() { regSortNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {varchar(255)}
     */
    public void setSortNum_IsNotNull() { regSortNum(CK_ISNN, DOBJ); }

    protected void regSortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortNum(), "SORT_NUM"); }
    protected abstract ConditionValue xgetCValueSortNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_Equal(String adoptNum) {
        doSetAdoptNum_Equal(fRES(adoptNum));
    }

    protected void doSetAdoptNum_Equal(String adoptNum) {
        regAdoptNum(CK_EQ, adoptNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotEqual(String adoptNum) {
        doSetAdoptNum_NotEqual(fRES(adoptNum));
    }

    protected void doSetAdoptNum_NotEqual(String adoptNum) {
        regAdoptNum(CK_NES, adoptNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterThan(String adoptNum) {
        regAdoptNum(CK_GT, fRES(adoptNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_LessThan(String adoptNum) {
        regAdoptNum(CK_LT, fRES(adoptNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterEqual(String adoptNum) {
        regAdoptNum(CK_GE, fRES(adoptNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_LessEqual(String adoptNum) {
        regAdoptNum(CK_LE, fRES(adoptNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNumList The collection of adoptNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_InScope(Collection<String> adoptNumList) {
        doSetAdoptNum_InScope(adoptNumList);
    }

    protected void doSetAdoptNum_InScope(Collection<String> adoptNumList) {
        regINS(CK_INS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNumList The collection of adoptNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotInScope(Collection<String> adoptNumList) {
        doSetAdoptNum_NotInScope(adoptNumList);
    }

    protected void doSetAdoptNum_NotInScope(Collection<String> adoptNumList) {
        regINS(CK_NINS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)} <br>
     * <pre>e.g. setAdoptNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adoptNum The value of adoptNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdoptNum_LikeSearch(String adoptNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adoptNum), xgetCValueAdoptNum(), "ADOPT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdoptNum_NotLikeSearch(String adoptNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adoptNum), xgetCValueAdoptNum(), "ADOPT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     * @param adoptNum The value of adoptNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_PrefixSearch(String adoptNum) {
        setAdoptNum_LikeSearch(adoptNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNull() { regAdoptNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNullOrEmpty() { regAdoptNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {varchar(255)}
     */
    public void setAdoptNum_IsNotNull() { regAdoptNum(CK_ISNN, DOBJ); }

    protected void regAdoptNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdoptNum(), "ADOPT_NUM"); }
    protected abstract ConditionValue xgetCValueAdoptNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_Equal(String deliveryDatetime) {
        doSetDeliveryDatetime_Equal(fRES(deliveryDatetime));
    }

    protected void doSetDeliveryDatetime_Equal(String deliveryDatetime) {
        regDeliveryDatetime(CK_EQ, deliveryDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_NotEqual(String deliveryDatetime) {
        doSetDeliveryDatetime_NotEqual(fRES(deliveryDatetime));
    }

    protected void doSetDeliveryDatetime_NotEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_NES, deliveryDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_GreaterThan(String deliveryDatetime) {
        regDeliveryDatetime(CK_GT, fRES(deliveryDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_LessThan(String deliveryDatetime) {
        regDeliveryDatetime(CK_LT, fRES(deliveryDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_GreaterEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_GE, fRES(deliveryDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_LessEqual(String deliveryDatetime) {
        regDeliveryDatetime(CK_LE, fRES(deliveryDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetimeList The collection of deliveryDatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_InScope(Collection<String> deliveryDatetimeList) {
        doSetDeliveryDatetime_InScope(deliveryDatetimeList);
    }

    protected void doSetDeliveryDatetime_InScope(Collection<String> deliveryDatetimeList) {
        regINS(CK_INS, cTL(deliveryDatetimeList), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetimeList The collection of deliveryDatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_NotInScope(Collection<String> deliveryDatetimeList) {
        doSetDeliveryDatetime_NotInScope(deliveryDatetimeList);
    }

    protected void doSetDeliveryDatetime_NotInScope(Collection<String> deliveryDatetimeList) {
        regINS(CK_NINS, cTL(deliveryDatetimeList), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)} <br>
     * <pre>e.g. setDeliveryDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryDatetime The value of deliveryDatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryDatetime_LikeSearch(String deliveryDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryDatetime), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryDatetime_NotLikeSearch(String deliveryDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryDatetime), xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     * @param deliveryDatetime The value of deliveryDatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryDatetime_PrefixSearch(String deliveryDatetime) {
        setDeliveryDatetime_LikeSearch(deliveryDatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNull() { regDeliveryDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNullOrEmpty() { regDeliveryDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_DATETIME: {varchar(255)}
     */
    public void setDeliveryDatetime_IsNotNull() { regDeliveryDatetime(CK_ISNN, DOBJ); }

    protected void regDeliveryDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryDatetime(), "DELIVERY_DATETIME"); }
    protected abstract ConditionValue xgetCValueDeliveryDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_Equal(String spareStr) {
        doSetSpareStr_Equal(fRES(spareStr));
    }

    protected void doSetSpareStr_Equal(String spareStr) {
        regSpareStr(CK_EQ, spareStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotEqual(String spareStr) {
        doSetSpareStr_NotEqual(fRES(spareStr));
    }

    protected void doSetSpareStr_NotEqual(String spareStr) {
        regSpareStr(CK_NES, spareStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterThan(String spareStr) {
        regSpareStr(CK_GT, fRES(spareStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessThan(String spareStr) {
        regSpareStr(CK_LT, fRES(spareStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterEqual(String spareStr) {
        regSpareStr(CK_GE, fRES(spareStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessEqual(String spareStr) {
        regSpareStr(CK_LE, fRES(spareStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStrList The collection of spareStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_InScope(Collection<String> spareStrList) {
        doSetSpareStr_InScope(spareStrList);
    }

    protected void doSetSpareStr_InScope(Collection<String> spareStrList) {
        regINS(CK_INS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStrList The collection of spareStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotInScope(Collection<String> spareStrList) {
        doSetSpareStr_NotInScope(spareStrList);
    }

    protected void doSetSpareStr_NotInScope(Collection<String> spareStrList) {
        regINS(CK_NINS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {varchar(255)} <br>
     * <pre>e.g. setSpareStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr The value of spareStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr_LikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr_NotLikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {varchar(255)}
     * @param spareStr The value of spareStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_PrefixSearch(String spareStr) {
        setSpareStr_LikeSearch(spareStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     */
    public void setSpareStr_IsNull() { regSpareStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     */
    public void setSpareStr_IsNullOrEmpty() { regSpareStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {varchar(255)}
     */
    public void setSpareStr_IsNotNull() { regSpareStr(CK_ISNN, DOBJ); }

    protected void regSpareStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr(), "SPARE_STR"); }
    protected abstract ConditionValue xgetCValueSpareStr();

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
    public HpSLCFunction<EShopImportSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShopImportSendCB.class);
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
    public HpSLCFunction<EShopImportSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShopImportSendCB.class);
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
    public HpSLCFunction<EShopImportSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShopImportSendCB.class);
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
    public HpSLCFunction<EShopImportSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShopImportSendCB.class);
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
    public HpSLCFunction<EShopImportSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShopImportSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShopImportSendCB&gt;() {
     *     public void query(EShopImportSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShopImportSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShopImportSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopImportSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShopImportSendCQ sq);

    protected EShopImportSendCB xcreateScalarConditionCB() {
        EShopImportSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShopImportSendCB xcreateScalarConditionPartitionByCB() {
        EShopImportSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShopImportSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopImportSendCB cb = new EShopImportSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHOP_IMPORT_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShopImportSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShopImportSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShopImportSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopImportSendCB cb = new EShopImportSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHOP_IMPORT_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShopImportSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShopImportSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShopImportSendCB cb = new EShopImportSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShopImportSendCQ sq);

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
    protected EShopImportSendCB newMyCB() {
        return new EShopImportSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShopImportSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
