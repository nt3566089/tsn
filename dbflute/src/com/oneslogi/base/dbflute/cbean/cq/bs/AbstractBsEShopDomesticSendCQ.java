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
 * The abstract condition-query of E_SHOP_DOMESTIC_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShopDomesticSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShopDomesticSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SHOP_DOMESTIC_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_Equal(Long shopDomesticSendId) {
        doSetShopDomesticSendId_Equal(shopDomesticSendId);
    }

    protected void doSetShopDomesticSendId_Equal(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_EQ, shopDomesticSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_NotEqual(Long shopDomesticSendId) {
        doSetShopDomesticSendId_NotEqual(shopDomesticSendId);
    }

    protected void doSetShopDomesticSendId_NotEqual(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_NES, shopDomesticSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_GreaterThan(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_GT, shopDomesticSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_LessThan(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_LT, shopDomesticSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_GreaterEqual(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_GE, shopDomesticSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendId The value of shopDomesticSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_LessEqual(Long shopDomesticSendId) {
        regShopDomesticSendId(CK_LE, shopDomesticSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shopDomesticSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shopDomesticSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShopDomesticSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShopDomesticSendId(), "SHOP_DOMESTIC_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendIdList The collection of shopDomesticSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_InScope(Collection<Long> shopDomesticSendIdList) {
        doSetShopDomesticSendId_InScope(shopDomesticSendIdList);
    }

    protected void doSetShopDomesticSendId_InScope(Collection<Long> shopDomesticSendIdList) {
        regINS(CK_INS, cTL(shopDomesticSendIdList), xgetCValueShopDomesticSendId(), "SHOP_DOMESTIC_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shopDomesticSendIdList The collection of shopDomesticSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShopDomesticSendId_NotInScope(Collection<Long> shopDomesticSendIdList) {
        doSetShopDomesticSendId_NotInScope(shopDomesticSendIdList);
    }

    protected void doSetShopDomesticSendId_NotInScope(Collection<Long> shopDomesticSendIdList) {
        regINS(CK_NINS, cTL(shopDomesticSendIdList), xgetCValueShopDomesticSendId(), "SHOP_DOMESTIC_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShopDomesticSendId_IsNull() { regShopDomesticSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHOP_DOMESTIC_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShopDomesticSendId_IsNotNull() { regShopDomesticSendId(CK_ISNN, DOBJ); }

    protected void regShopDomesticSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShopDomesticSendId(), "SHOP_DOMESTIC_SEND_ID"); }
    protected abstract ConditionValue xgetCValueShopDomesticSendId();

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
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_Equal(Long sendRowCd) {
        doSetSendRowCd_Equal(sendRowCd);
    }

    protected void doSetSendRowCd_Equal(Long sendRowCd) {
        regSendRowCd(CK_EQ, sendRowCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_NotEqual(Long sendRowCd) {
        doSetSendRowCd_NotEqual(sendRowCd);
    }

    protected void doSetSendRowCd_NotEqual(Long sendRowCd) {
        regSendRowCd(CK_NES, sendRowCd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_GreaterThan(Long sendRowCd) {
        regSendRowCd(CK_GT, sendRowCd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_LessThan(Long sendRowCd) {
        regSendRowCd(CK_LT, sendRowCd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_GreaterEqual(Long sendRowCd) {
        regSendRowCd(CK_GE, sendRowCd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCd The value of sendRowCd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowCd_LessEqual(Long sendRowCd) {
        regSendRowCd(CK_LE, sendRowCd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param minNumber The min number of sendRowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowCd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowCd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowCd(), "SEND_ROW_CD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCdList The collection of sendRowCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowCd_InScope(Collection<Long> sendRowCdList) {
        doSetSendRowCd_InScope(sendRowCdList);
    }

    protected void doSetSendRowCd_InScope(Collection<Long> sendRowCdList) {
        regINS(CK_INS, cTL(sendRowCdList), xgetCValueSendRowCd(), "SEND_ROW_CD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_CD: {NotNull, bigint(19)}
     * @param sendRowCdList The collection of sendRowCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowCd_NotInScope(Collection<Long> sendRowCdList) {
        doSetSendRowCd_NotInScope(sendRowCdList);
    }

    protected void doSetSendRowCd_NotInScope(Collection<Long> sendRowCdList) {
        regINS(CK_NINS, cTL(sendRowCdList), xgetCValueSendRowCd(), "SEND_ROW_CD");
    }

    protected void regSendRowCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowCd(), "SEND_ROW_CD"); }
    protected abstract ConditionValue xgetCValueSendRowCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)}
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
     * WORK_FLG: {NotNull, char(1)} <br>
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
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1)}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_Equal(String usernum1) {
        doSetUsernum1_Equal(fRES(usernum1));
    }

    protected void doSetUsernum1_Equal(String usernum1) {
        regUsernum1(CK_EQ, usernum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotEqual(String usernum1) {
        doSetUsernum1_NotEqual(fRES(usernum1));
    }

    protected void doSetUsernum1_NotEqual(String usernum1) {
        regUsernum1(CK_NES, usernum1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterThan(String usernum1) {
        regUsernum1(CK_GT, fRES(usernum1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessThan(String usernum1) {
        regUsernum1(CK_LT, fRES(usernum1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterEqual(String usernum1) {
        regUsernum1(CK_GE, fRES(usernum1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessEqual(String usernum1) {
        regUsernum1(CK_LE, fRES(usernum1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1List The collection of usernum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_InScope(Collection<String> usernum1List) {
        doSetUsernum1_InScope(usernum1List);
    }

    protected void doSetUsernum1_InScope(Collection<String> usernum1List) {
        regINS(CK_INS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1List The collection of usernum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotInScope(Collection<String> usernum1List) {
        doSetUsernum1_NotInScope(usernum1List);
    }

    protected void doSetUsernum1_NotInScope(Collection<String> usernum1List) {
        regINS(CK_NINS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {char(1)} <br>
     * <pre>e.g. setUsernum1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum1 The value of usernum1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum1_LikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum1_NotLikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {char(1)}
     * @param usernum1 The value of usernum1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_PrefixSearch(String usernum1) {
        setUsernum1_LikeSearch(usernum1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     */
    public void setUsernum1_IsNull() { regUsernum1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {char(1)}
     */
    public void setUsernum1_IsNotNull() { regUsernum1(CK_ISNN, DOBJ); }

    protected void regUsernum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum1(), "USERNUM1"); }
    protected abstract ConditionValue xgetCValueUsernum1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_Equal(String tracekey) {
        doSetTracekey_Equal(fRES(tracekey));
    }

    protected void doSetTracekey_Equal(String tracekey) {
        regTracekey(CK_EQ, tracekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_NotEqual(String tracekey) {
        doSetTracekey_NotEqual(fRES(tracekey));
    }

    protected void doSetTracekey_NotEqual(String tracekey) {
        regTracekey(CK_NES, tracekey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_GreaterThan(String tracekey) {
        regTracekey(CK_GT, fRES(tracekey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_LessThan(String tracekey) {
        regTracekey(CK_LT, fRES(tracekey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_GreaterEqual(String tracekey) {
        regTracekey(CK_GE, fRES(tracekey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_LessEqual(String tracekey) {
        regTracekey(CK_LE, fRES(tracekey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekeyList The collection of tracekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_InScope(Collection<String> tracekeyList) {
        doSetTracekey_InScope(tracekeyList);
    }

    protected void doSetTracekey_InScope(Collection<String> tracekeyList) {
        regINS(CK_INS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekeyList The collection of tracekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_NotInScope(Collection<String> tracekeyList) {
        doSetTracekey_NotInScope(tracekeyList);
    }

    protected void doSetTracekey_NotInScope(Collection<String> tracekeyList) {
        regINS(CK_NINS, cTL(tracekeyList), xgetCValueTracekey(), "TRACEKEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)} <br>
     * <pre>e.g. setTracekey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracekey The value of tracekey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracekey_LikeSearch(String tracekey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracekey), xgetCValueTracekey(), "TRACEKEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracekey_NotLikeSearch(String tracekey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracekey), xgetCValueTracekey(), "TRACEKEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACEKEY: {varchar(255)}
     * @param tracekey The value of tracekey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracekey_PrefixSearch(String tracekey) {
        setTracekey_LikeSearch(tracekey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNull() { regTracekey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNullOrEmpty() { regTracekey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACEKEY: {varchar(255)}
     */
    public void setTracekey_IsNotNull() { regTracekey(CK_ISNN, DOBJ); }

    protected void regTracekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracekey(), "TRACEKEY"); }
    protected abstract ConditionValue xgetCValueTracekey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNullOrEmpty() { regWarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {varchar(255)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_Equal(String warehousename) {
        doSetWarehousename_Equal(fRES(warehousename));
    }

    protected void doSetWarehousename_Equal(String warehousename) {
        regWarehousename(CK_EQ, warehousename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_NotEqual(String warehousename) {
        doSetWarehousename_NotEqual(fRES(warehousename));
    }

    protected void doSetWarehousename_NotEqual(String warehousename) {
        regWarehousename(CK_NES, warehousename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterThan(String warehousename) {
        regWarehousename(CK_GT, fRES(warehousename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessThan(String warehousename) {
        regWarehousename(CK_LT, fRES(warehousename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterEqual(String warehousename) {
        regWarehousename(CK_GE, fRES(warehousename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessEqual(String warehousename) {
        regWarehousename(CK_LE, fRES(warehousename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousenameList The collection of warehousename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_InScope(Collection<String> warehousenameList) {
        doSetWarehousename_InScope(warehousenameList);
    }

    protected void doSetWarehousename_InScope(Collection<String> warehousenameList) {
        regINS(CK_INS, cTL(warehousenameList), xgetCValueWarehousename(), "WAREHOUSENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousenameList The collection of warehousename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_NotInScope(Collection<String> warehousenameList) {
        doSetWarehousename_NotInScope(warehousenameList);
    }

    protected void doSetWarehousename_NotInScope(Collection<String> warehousenameList) {
        regINS(CK_NINS, cTL(warehousenameList), xgetCValueWarehousename(), "WAREHOUSENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(255)} <br>
     * <pre>e.g. setWarehousename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousename The value of warehousename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousename_LikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousename), xgetCValueWarehousename(), "WAREHOUSENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousename_NotLikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousename), xgetCValueWarehousename(), "WAREHOUSENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     * @param warehousename The value of warehousename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_PrefixSearch(String warehousename) {
        setWarehousename_LikeSearch(warehousename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     */
    public void setWarehousename_IsNull() { regWarehousename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     */
    public void setWarehousename_IsNullOrEmpty() { regWarehousename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(255)}
     */
    public void setWarehousename_IsNotNull() { regWarehousename(CK_ISNN, DOBJ); }

    protected void regWarehousename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousename(), "WAREHOUSENAME"); }
    protected abstract ConditionValue xgetCValueWarehousename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(255)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNull() { regFactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNullOrEmpty() { regFactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(255)}
     */
    public void setFactorycd_IsNotNull() { regFactorycd(CK_ISNN, DOBJ); }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_Equal(String factoryname) {
        doSetFactoryname_Equal(fRES(factoryname));
    }

    protected void doSetFactoryname_Equal(String factoryname) {
        regFactoryname(CK_EQ, factoryname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_NotEqual(String factoryname) {
        doSetFactoryname_NotEqual(fRES(factoryname));
    }

    protected void doSetFactoryname_NotEqual(String factoryname) {
        regFactoryname(CK_NES, factoryname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_GreaterThan(String factoryname) {
        regFactoryname(CK_GT, fRES(factoryname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_LessThan(String factoryname) {
        regFactoryname(CK_LT, fRES(factoryname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_GreaterEqual(String factoryname) {
        regFactoryname(CK_GE, fRES(factoryname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_LessEqual(String factoryname) {
        regFactoryname(CK_LE, fRES(factoryname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factorynameList The collection of factoryname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_InScope(Collection<String> factorynameList) {
        doSetFactoryname_InScope(factorynameList);
    }

    protected void doSetFactoryname_InScope(Collection<String> factorynameList) {
        regINS(CK_INS, cTL(factorynameList), xgetCValueFactoryname(), "FACTORYNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factorynameList The collection of factoryname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_NotInScope(Collection<String> factorynameList) {
        doSetFactoryname_NotInScope(factorynameList);
    }

    protected void doSetFactoryname_NotInScope(Collection<String> factorynameList) {
        regINS(CK_NINS, cTL(factorynameList), xgetCValueFactoryname(), "FACTORYNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYNAME: {varchar(255)} <br>
     * <pre>e.g. setFactoryname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factoryname The value of factoryname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactoryname_LikeSearch(String factoryname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factoryname), xgetCValueFactoryname(), "FACTORYNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactoryname_NotLikeSearch(String factoryname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factoryname), xgetCValueFactoryname(), "FACTORYNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     * @param factoryname The value of factoryname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactoryname_PrefixSearch(String factoryname) {
        setFactoryname_LikeSearch(factoryname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     */
    public void setFactoryname_IsNull() { regFactoryname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     */
    public void setFactoryname_IsNullOrEmpty() { regFactoryname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYNAME: {varchar(255)}
     */
    public void setFactoryname_IsNotNull() { regFactoryname(CK_ISNN, DOBJ); }

    protected void regFactoryname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactoryname(), "FACTORYNAME"); }
    protected abstract ConditionValue xgetCValueFactoryname();

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
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_Equal(String itemname) {
        doSetItemname_Equal(fRES(itemname));
    }

    protected void doSetItemname_Equal(String itemname) {
        regItemname(CK_EQ, itemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotEqual(String itemname) {
        doSetItemname_NotEqual(fRES(itemname));
    }

    protected void doSetItemname_NotEqual(String itemname) {
        regItemname(CK_NES, itemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterThan(String itemname) {
        regItemname(CK_GT, fRES(itemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessThan(String itemname) {
        regItemname(CK_LT, fRES(itemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterEqual(String itemname) {
        regItemname(CK_GE, fRES(itemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessEqual(String itemname) {
        regItemname(CK_LE, fRES(itemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemnameList The collection of itemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_InScope(Collection<String> itemnameList) {
        doSetItemname_InScope(itemnameList);
    }

    protected void doSetItemname_InScope(Collection<String> itemnameList) {
        regINS(CK_INS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemnameList The collection of itemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotInScope(Collection<String> itemnameList) {
        doSetItemname_NotInScope(itemnameList);
    }

    protected void doSetItemname_NotInScope(Collection<String> itemnameList) {
        regINS(CK_NINS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(255)} <br>
     * <pre>e.g. setItemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemname The value of itemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemname_LikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemname_NotLikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(255)}
     * @param itemname The value of itemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_PrefixSearch(String itemname) {
        setItemname_LikeSearch(itemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     */
    public void setItemname_IsNull() { regItemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     */
    public void setItemname_IsNullOrEmpty() { regItemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(255)}
     */
    public void setItemname_IsNotNull() { regItemname(CK_ISNN, DOBJ); }

    protected void regItemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemname(), "ITEMNAME"); }
    protected abstract ConditionValue xgetCValueItemname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_Equal(String skucd) {
        doSetSkucd_Equal(fRES(skucd));
    }

    protected void doSetSkucd_Equal(String skucd) {
        regSkucd(CK_EQ, skucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotEqual(String skucd) {
        doSetSkucd_NotEqual(fRES(skucd));
    }

    protected void doSetSkucd_NotEqual(String skucd) {
        regSkucd(CK_NES, skucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterThan(String skucd) {
        regSkucd(CK_GT, fRES(skucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessThan(String skucd) {
        regSkucd(CK_LT, fRES(skucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterEqual(String skucd) {
        regSkucd(CK_GE, fRES(skucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessEqual(String skucd) {
        regSkucd(CK_LE, fRES(skucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_InScope(Collection<String> skucdList) {
        doSetSkucd_InScope(skucdList);
    }

    protected void doSetSkucd_InScope(Collection<String> skucdList) {
        regINS(CK_INS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucdList The collection of skucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotInScope(Collection<String> skucdList) {
        doSetSkucd_NotInScope(skucdList);
    }

    protected void doSetSkucd_NotInScope(Collection<String> skucdList) {
        regINS(CK_NINS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)} <br>
     * <pre>e.g. setSkucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucd The value of skucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucd_LikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucd_NotLikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(255)}
     * @param skucd The value of skucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_PrefixSearch(String skucd) {
        setSkucd_LikeSearch(skucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNull() { regSkucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNullOrEmpty() { regSkucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(255)}
     */
    public void setSkucd_IsNotNull() { regSkucd(CK_ISNN, DOBJ); }

    protected void regSkucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucd(), "SKUCD"); }
    protected abstract ConditionValue xgetCValueSkucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_Equal(String receivecd) {
        doSetReceivecd_Equal(fRES(receivecd));
    }

    protected void doSetReceivecd_Equal(String receivecd) {
        regReceivecd(CK_EQ, receivecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_NotEqual(String receivecd) {
        doSetReceivecd_NotEqual(fRES(receivecd));
    }

    protected void doSetReceivecd_NotEqual(String receivecd) {
        regReceivecd(CK_NES, receivecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterThan(String receivecd) {
        regReceivecd(CK_GT, fRES(receivecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessThan(String receivecd) {
        regReceivecd(CK_LT, fRES(receivecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_GreaterEqual(String receivecd) {
        regReceivecd(CK_GE, fRES(receivecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_LessEqual(String receivecd) {
        regReceivecd(CK_LE, fRES(receivecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecdList The collection of receivecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_InScope(Collection<String> receivecdList) {
        doSetReceivecd_InScope(receivecdList);
    }

    protected void doSetReceivecd_InScope(Collection<String> receivecdList) {
        regINS(CK_INS, cTL(receivecdList), xgetCValueReceivecd(), "RECEIVECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecdList The collection of receivecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_NotInScope(Collection<String> receivecdList) {
        doSetReceivecd_NotInScope(receivecdList);
    }

    protected void doSetReceivecd_NotInScope(Collection<String> receivecdList) {
        regINS(CK_NINS, cTL(receivecdList), xgetCValueReceivecd(), "RECEIVECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {varchar(255)} <br>
     * <pre>e.g. setReceivecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivecd The value of receivecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivecd_LikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivecd), xgetCValueReceivecd(), "RECEIVECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivecd_NotLikeSearch(String receivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivecd), xgetCValueReceivecd(), "RECEIVECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVECD: {varchar(255)}
     * @param receivecd The value of receivecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivecd_PrefixSearch(String receivecd) {
        setReceivecd_LikeSearch(receivecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     */
    public void setReceivecd_IsNull() { regReceivecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     */
    public void setReceivecd_IsNullOrEmpty() { regReceivecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVECD: {varchar(255)}
     */
    public void setReceivecd_IsNotNull() { regReceivecd(CK_ISNN, DOBJ); }

    protected void regReceivecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivecd(), "RECEIVECD"); }
    protected abstract ConditionValue xgetCValueReceivecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_Equal(String productmark) {
        doSetProductmark_Equal(fRES(productmark));
    }

    protected void doSetProductmark_Equal(String productmark) {
        regProductmark(CK_EQ, productmark);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_NotEqual(String productmark) {
        doSetProductmark_NotEqual(fRES(productmark));
    }

    protected void doSetProductmark_NotEqual(String productmark) {
        regProductmark(CK_NES, productmark);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_GreaterThan(String productmark) {
        regProductmark(CK_GT, fRES(productmark));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_LessThan(String productmark) {
        regProductmark(CK_LT, fRES(productmark));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_GreaterEqual(String productmark) {
        regProductmark(CK_GE, fRES(productmark));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_LessEqual(String productmark) {
        regProductmark(CK_LE, fRES(productmark));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmarkList The collection of productmark as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_InScope(Collection<String> productmarkList) {
        doSetProductmark_InScope(productmarkList);
    }

    protected void doSetProductmark_InScope(Collection<String> productmarkList) {
        regINS(CK_INS, cTL(productmarkList), xgetCValueProductmark(), "PRODUCTMARK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmarkList The collection of productmark as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_NotInScope(Collection<String> productmarkList) {
        doSetProductmark_NotInScope(productmarkList);
    }

    protected void doSetProductmark_NotInScope(Collection<String> productmarkList) {
        regINS(CK_NINS, cTL(productmarkList), xgetCValueProductmark(), "PRODUCTMARK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTMARK: {varchar(255)} <br>
     * <pre>e.g. setProductmark_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productmark The value of productmark as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductmark_LikeSearch(String productmark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productmark), xgetCValueProductmark(), "PRODUCTMARK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductmark_NotLikeSearch(String productmark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productmark), xgetCValueProductmark(), "PRODUCTMARK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     * @param productmark The value of productmark as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductmark_PrefixSearch(String productmark) {
        setProductmark_LikeSearch(productmark, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     */
    public void setProductmark_IsNull() { regProductmark(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     */
    public void setProductmark_IsNullOrEmpty() { regProductmark(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCTMARK: {varchar(255)}
     */
    public void setProductmark_IsNotNull() { regProductmark(CK_ISNN, DOBJ); }

    protected void regProductmark(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductmark(), "PRODUCTMARK"); }
    protected abstract ConditionValue xgetCValueProductmark();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_Equal(String orderno) {
        doSetOrderno_Equal(fRES(orderno));
    }

    protected void doSetOrderno_Equal(String orderno) {
        regOrderno(CK_EQ, orderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotEqual(String orderno) {
        doSetOrderno_NotEqual(fRES(orderno));
    }

    protected void doSetOrderno_NotEqual(String orderno) {
        regOrderno(CK_NES, orderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterThan(String orderno) {
        regOrderno(CK_GT, fRES(orderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessThan(String orderno) {
        regOrderno(CK_LT, fRES(orderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterEqual(String orderno) {
        regOrderno(CK_GE, fRES(orderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessEqual(String orderno) {
        regOrderno(CK_LE, fRES(orderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param ordernoList The collection of orderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_InScope(Collection<String> ordernoList) {
        doSetOrderno_InScope(ordernoList);
    }

    protected void doSetOrderno_InScope(Collection<String> ordernoList) {
        regINS(CK_INS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param ordernoList The collection of orderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotInScope(Collection<String> ordernoList) {
        doSetOrderno_NotInScope(ordernoList);
    }

    protected void doSetOrderno_NotInScope(Collection<String> ordernoList) {
        regINS(CK_NINS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)} <br>
     * <pre>e.g. setOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderno The value of orderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderno_LikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderno_NotLikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(255)}
     * @param orderno The value of orderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_PrefixSearch(String orderno) {
        setOrderno_LikeSearch(orderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNull() { regOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNullOrEmpty() { regOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(255)}
     */
    public void setOrderno_IsNotNull() { regOrderno(CK_ISNN, DOBJ); }

    protected void regOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderno(), "ORDERNO"); }
    protected abstract ConditionValue xgetCValueOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_Equal(String printerno) {
        doSetPrinterno_Equal(fRES(printerno));
    }

    protected void doSetPrinterno_Equal(String printerno) {
        regPrinterno(CK_EQ, printerno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_NotEqual(String printerno) {
        doSetPrinterno_NotEqual(fRES(printerno));
    }

    protected void doSetPrinterno_NotEqual(String printerno) {
        regPrinterno(CK_NES, printerno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_GreaterThan(String printerno) {
        regPrinterno(CK_GT, fRES(printerno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_LessThan(String printerno) {
        regPrinterno(CK_LT, fRES(printerno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_GreaterEqual(String printerno) {
        regPrinterno(CK_GE, fRES(printerno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_LessEqual(String printerno) {
        regPrinterno(CK_LE, fRES(printerno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printernoList The collection of printerno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_InScope(Collection<String> printernoList) {
        doSetPrinterno_InScope(printernoList);
    }

    protected void doSetPrinterno_InScope(Collection<String> printernoList) {
        regINS(CK_INS, cTL(printernoList), xgetCValuePrinterno(), "PRINTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printernoList The collection of printerno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_NotInScope(Collection<String> printernoList) {
        doSetPrinterno_NotInScope(printernoList);
    }

    protected void doSetPrinterno_NotInScope(Collection<String> printernoList) {
        regINS(CK_NINS, cTL(printernoList), xgetCValuePrinterno(), "PRINTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTERNO: {varchar(255)} <br>
     * <pre>e.g. setPrinterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printerno The value of printerno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrinterno_LikeSearch(String printerno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printerno), xgetCValuePrinterno(), "PRINTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterno_NotLikeSearch(String printerno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerno), xgetCValuePrinterno(), "PRINTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTERNO: {varchar(255)}
     * @param printerno The value of printerno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterno_PrefixSearch(String printerno) {
        setPrinterno_LikeSearch(printerno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     */
    public void setPrinterno_IsNull() { regPrinterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     */
    public void setPrinterno_IsNullOrEmpty() { regPrinterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTERNO: {varchar(255)}
     */
    public void setPrinterno_IsNotNull() { regPrinterno(CK_ISNN, DOBJ); }

    protected void regPrinterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterno(), "PRINTERNO"); }
    protected abstract ConditionValue xgetCValuePrinterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_Equal(String makeno) {
        doSetMakeno_Equal(fRES(makeno));
    }

    protected void doSetMakeno_Equal(String makeno) {
        regMakeno(CK_EQ, makeno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_NotEqual(String makeno) {
        doSetMakeno_NotEqual(fRES(makeno));
    }

    protected void doSetMakeno_NotEqual(String makeno) {
        regMakeno(CK_NES, makeno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_GreaterThan(String makeno) {
        regMakeno(CK_GT, fRES(makeno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_LessThan(String makeno) {
        regMakeno(CK_LT, fRES(makeno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_GreaterEqual(String makeno) {
        regMakeno(CK_GE, fRES(makeno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_LessEqual(String makeno) {
        regMakeno(CK_LE, fRES(makeno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makenoList The collection of makeno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_InScope(Collection<String> makenoList) {
        doSetMakeno_InScope(makenoList);
    }

    protected void doSetMakeno_InScope(Collection<String> makenoList) {
        regINS(CK_INS, cTL(makenoList), xgetCValueMakeno(), "MAKENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makenoList The collection of makeno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_NotInScope(Collection<String> makenoList) {
        doSetMakeno_NotInScope(makenoList);
    }

    protected void doSetMakeno_NotInScope(Collection<String> makenoList) {
        regINS(CK_NINS, cTL(makenoList), xgetCValueMakeno(), "MAKENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKENO: {varchar(255)} <br>
     * <pre>e.g. setMakeno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makeno The value of makeno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakeno_LikeSearch(String makeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makeno), xgetCValueMakeno(), "MAKENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakeno_NotLikeSearch(String makeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makeno), xgetCValueMakeno(), "MAKENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKENO: {varchar(255)}
     * @param makeno The value of makeno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeno_PrefixSearch(String makeno) {
        setMakeno_LikeSearch(makeno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     */
    public void setMakeno_IsNull() { regMakeno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     */
    public void setMakeno_IsNullOrEmpty() { regMakeno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKENO: {varchar(255)}
     */
    public void setMakeno_IsNotNull() { regMakeno(CK_ISNN, DOBJ); }

    protected void regMakeno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakeno(), "MAKENO"); }
    protected abstract ConditionValue xgetCValueMakeno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(255)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(255)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_Equal(String maketime) {
        doSetMaketime_Equal(fRES(maketime));
    }

    protected void doSetMaketime_Equal(String maketime) {
        regMaketime(CK_EQ, maketime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_NotEqual(String maketime) {
        doSetMaketime_NotEqual(fRES(maketime));
    }

    protected void doSetMaketime_NotEqual(String maketime) {
        regMaketime(CK_NES, maketime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_GreaterThan(String maketime) {
        regMaketime(CK_GT, fRES(maketime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_LessThan(String maketime) {
        regMaketime(CK_LT, fRES(maketime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_GreaterEqual(String maketime) {
        regMaketime(CK_GE, fRES(maketime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_LessEqual(String maketime) {
        regMaketime(CK_LE, fRES(maketime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketimeList The collection of maketime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_InScope(Collection<String> maketimeList) {
        doSetMaketime_InScope(maketimeList);
    }

    protected void doSetMaketime_InScope(Collection<String> maketimeList) {
        regINS(CK_INS, cTL(maketimeList), xgetCValueMaketime(), "MAKETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketimeList The collection of maketime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_NotInScope(Collection<String> maketimeList) {
        doSetMaketime_NotInScope(maketimeList);
    }

    protected void doSetMaketime_NotInScope(Collection<String> maketimeList) {
        regINS(CK_NINS, cTL(maketimeList), xgetCValueMaketime(), "MAKETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKETIME: {varchar(255)} <br>
     * <pre>e.g. setMaketime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param maketime The value of maketime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMaketime_LikeSearch(String maketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(maketime), xgetCValueMaketime(), "MAKETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMaketime_NotLikeSearch(String maketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(maketime), xgetCValueMaketime(), "MAKETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKETIME: {varchar(255)}
     * @param maketime The value of maketime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaketime_PrefixSearch(String maketime) {
        setMaketime_LikeSearch(maketime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     */
    public void setMaketime_IsNull() { regMaketime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     */
    public void setMaketime_IsNullOrEmpty() { regMaketime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKETIME: {varchar(255)}
     */
    public void setMaketime_IsNotNull() { regMaketime(CK_ISNN, DOBJ); }

    protected void regMaketime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaketime(), "MAKETIME"); }
    protected abstract ConditionValue xgetCValueMaketime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_Equal(String transportcd) {
        doSetTransportcd_Equal(fRES(transportcd));
    }

    protected void doSetTransportcd_Equal(String transportcd) {
        regTransportcd(CK_EQ, transportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotEqual(String transportcd) {
        doSetTransportcd_NotEqual(fRES(transportcd));
    }

    protected void doSetTransportcd_NotEqual(String transportcd) {
        regTransportcd(CK_NES, transportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_InScope(Collection<String> transportcdList) {
        doSetTransportcd_InScope(transportcdList);
    }

    protected void doSetTransportcd_InScope(Collection<String> transportcdList) {
        regINS(CK_INS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcdList The collection of transportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotInScope(Collection<String> transportcdList) {
        doSetTransportcd_NotInScope(transportcdList);
    }

    protected void doSetTransportcd_NotInScope(Collection<String> transportcdList) {
        regINS(CK_NINS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)} <br>
     * <pre>e.g. setTransportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportcd The value of transportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportcd_LikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNull() { regTransportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNullOrEmpty() { regTransportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(255)}
     */
    public void setTransportcd_IsNotNull() { regTransportcd(CK_ISNN, DOBJ); }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_Equal(String distributioncd) {
        doSetDistributioncd_Equal(fRES(distributioncd));
    }

    protected void doSetDistributioncd_Equal(String distributioncd) {
        regDistributioncd(CK_EQ, distributioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotEqual(String distributioncd) {
        doSetDistributioncd_NotEqual(fRES(distributioncd));
    }

    protected void doSetDistributioncd_NotEqual(String distributioncd) {
        regDistributioncd(CK_NES, distributioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_InScope(Collection<String> distributioncdList) {
        doSetDistributioncd_InScope(distributioncdList);
    }

    protected void doSetDistributioncd_InScope(Collection<String> distributioncdList) {
        regINS(CK_INS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncdList The collection of distributioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotInScope(Collection<String> distributioncdList) {
        doSetDistributioncd_NotInScope(distributioncdList);
    }

    protected void doSetDistributioncd_NotInScope(Collection<String> distributioncdList) {
        regINS(CK_NINS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)} <br>
     * <pre>e.g. setDistributioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distributioncd The value of distributioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistributioncd_LikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNullOrEmpty() { regDistributioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(255)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_Equal(String palletid) {
        doSetPalletid_Equal(fRES(palletid));
    }

    protected void doSetPalletid_Equal(String palletid) {
        regPalletid(CK_EQ, palletid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotEqual(String palletid) {
        doSetPalletid_NotEqual(fRES(palletid));
    }

    protected void doSetPalletid_NotEqual(String palletid) {
        regPalletid(CK_NES, palletid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterThan(String palletid) {
        regPalletid(CK_GT, fRES(palletid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessThan(String palletid) {
        regPalletid(CK_LT, fRES(palletid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterEqual(String palletid) {
        regPalletid(CK_GE, fRES(palletid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessEqual(String palletid) {
        regPalletid(CK_LE, fRES(palletid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_InScope(Collection<String> palletidList) {
        doSetPalletid_InScope(palletidList);
    }

    protected void doSetPalletid_InScope(Collection<String> palletidList) {
        regINS(CK_INS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletidList The collection of palletid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotInScope(Collection<String> palletidList) {
        doSetPalletid_NotInScope(palletidList);
    }

    protected void doSetPalletid_NotInScope(Collection<String> palletidList) {
        regINS(CK_NINS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)} <br>
     * <pre>e.g. setPalletid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletid The value of palletid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletid_LikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletid_NotLikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(255)}
     * @param palletid The value of palletid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_PrefixSearch(String palletid) {
        setPalletid_LikeSearch(palletid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNull() { regPalletid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNullOrEmpty() { regPalletid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(255)}
     */
    public void setPalletid_IsNotNull() { regPalletid(CK_ISNN, DOBJ); }

    protected void regPalletid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletid(), "PALLETID"); }
    protected abstract ConditionValue xgetCValuePalletid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_Equal(String initnum) {
        doSetInitnum_Equal(fRES(initnum));
    }

    protected void doSetInitnum_Equal(String initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(String initnum) {
        doSetInitnum_NotEqual(fRES(initnum));
    }

    protected void doSetInitnum_NotEqual(String initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(String initnum) {
        regInitnum(CK_GT, fRES(initnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(String initnum) {
        regInitnum(CK_LT, fRES(initnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(String initnum) {
        regInitnum(CK_GE, fRES(initnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(String initnum) {
        regInitnum(CK_LE, fRES(initnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<String> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<String> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<String> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<String> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)} <br>
     * <pre>e.g. setInitnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param initnum The value of initnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInitnum_LikeSearch(String initnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(initnum), xgetCValueInitnum(), "INITNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInitnum_NotLikeSearch(String initnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(initnum), xgetCValueInitnum(), "INITNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INITNUM: {varchar(255)}
     * @param initnum The value of initnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_PrefixSearch(String initnum) {
        setInitnum_LikeSearch(initnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNullOrEmpty() { regInitnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INITNUM: {varchar(255)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "INITNUM"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(String createdatetime) {
        doSetCreatedatetime_Equal(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_Equal(String createdatetime) {
        regCreatedatetime(CK_EQ, createdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotEqual(String createdatetime) {
        doSetCreatedatetime_NotEqual(fRES(createdatetime));
    }

    protected void doSetCreatedatetime_NotEqual(String createdatetime) {
        regCreatedatetime(CK_NES, createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(String createdatetime) {
        regCreatedatetime(CK_GT, fRES(createdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(String createdatetime) {
        regCreatedatetime(CK_LT, fRES(createdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(String createdatetime) {
        regCreatedatetime(CK_GE, fRES(createdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(String createdatetime) {
        regCreatedatetime(CK_LE, fRES(createdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetimeList The collection of createdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_InScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_InScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_InScope(Collection<String> createdatetimeList) {
        regINS(CK_INS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetimeList The collection of createdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        doSetCreatedatetime_NotInScope(createdatetimeList);
    }

    protected void doSetCreatedatetime_NotInScope(Collection<String> createdatetimeList) {
        regINS(CK_NINS, cTL(createdatetimeList), xgetCValueCreatedatetime(), "CREATEDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)} <br>
     * <pre>e.g. setCreatedatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdatetime The value of createdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreatedatetime_LikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreatedatetime_NotLikeSearch(String createdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdatetime), xgetCValueCreatedatetime(), "CREATEDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     * @param createdatetime The value of createdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedatetime_PrefixSearch(String createdatetime) {
        setCreatedatetime_LikeSearch(createdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNull() { regCreatedatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNullOrEmpty() { regCreatedatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {varchar(255)}
     */
    public void setCreatedatetime_IsNotNull() { regCreatedatetime(CK_ISNN, DOBJ); }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_Equal(String assortdatetime) {
        doSetAssortdatetime_Equal(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_Equal(String assortdatetime) {
        regAssortdatetime(CK_EQ, assortdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotEqual(String assortdatetime) {
        doSetAssortdatetime_NotEqual(fRES(assortdatetime));
    }

    protected void doSetAssortdatetime_NotEqual(String assortdatetime) {
        regAssortdatetime(CK_NES, assortdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterThan(String assortdatetime) {
        regAssortdatetime(CK_GT, fRES(assortdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessThan(String assortdatetime) {
        regAssortdatetime(CK_LT, fRES(assortdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_GreaterEqual(String assortdatetime) {
        regAssortdatetime(CK_GE, fRES(assortdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_LessEqual(String assortdatetime) {
        regAssortdatetime(CK_LE, fRES(assortdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetimeList The collection of assortdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_InScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_InScope(Collection<String> assortdatetimeList) {
        regINS(CK_INS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetimeList The collection of assortdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        doSetAssortdatetime_NotInScope(assortdatetimeList);
    }

    protected void doSetAssortdatetime_NotInScope(Collection<String> assortdatetimeList) {
        regINS(CK_NINS, cTL(assortdatetimeList), xgetCValueAssortdatetime(), "ASSORTDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)} <br>
     * <pre>e.g. setAssortdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortdatetime The value of assortdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortdatetime_LikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortdatetime_NotLikeSearch(String assortdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortdatetime), xgetCValueAssortdatetime(), "ASSORTDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     * @param assortdatetime The value of assortdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdatetime_PrefixSearch(String assortdatetime) {
        setAssortdatetime_LikeSearch(assortdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNull() { regAssortdatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNullOrEmpty() { regAssortdatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDATETIME: {varchar(255)}
     */
    public void setAssortdatetime_IsNotNull() { regAssortdatetime(CK_ISNN, DOBJ); }

    protected void regAssortdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdatetime(), "ASSORTDATETIME"); }
    protected abstract ConditionValue xgetCValueAssortdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_Equal(String tracetype) {
        doSetTracetype_Equal(fRES(tracetype));
    }

    protected void doSetTracetype_Equal(String tracetype) {
        regTracetype(CK_EQ, tracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotEqual(String tracetype) {
        doSetTracetype_NotEqual(fRES(tracetype));
    }

    protected void doSetTracetype_NotEqual(String tracetype) {
        regTracetype(CK_NES, tracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterThan(String tracetype) {
        regTracetype(CK_GT, fRES(tracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessThan(String tracetype) {
        regTracetype(CK_LT, fRES(tracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterEqual(String tracetype) {
        regTracetype(CK_GE, fRES(tracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessEqual(String tracetype) {
        regTracetype(CK_LE, fRES(tracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetypeList The collection of tracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_InScope(Collection<String> tracetypeList) {
        doSetTracetype_InScope(tracetypeList);
    }

    protected void doSetTracetype_InScope(Collection<String> tracetypeList) {
        regINS(CK_INS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetypeList The collection of tracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotInScope(Collection<String> tracetypeList) {
        doSetTracetype_NotInScope(tracetypeList);
    }

    protected void doSetTracetype_NotInScope(Collection<String> tracetypeList) {
        regINS(CK_NINS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)} <br>
     * <pre>e.g. setTracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetype The value of tracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetype_LikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetype_NotLikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(255)}
     * @param tracetype The value of tracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_PrefixSearch(String tracetype) {
        setTracetype_LikeSearch(tracetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNull() { regTracetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNullOrEmpty() { regTracetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(255)}
     */
    public void setTracetype_IsNotNull() { regTracetype(CK_ISNN, DOBJ); }

    protected void regTracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetype(), "TRACETYPE"); }
    protected abstract ConditionValue xgetCValueTracetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_Equal(String tracetypename) {
        doSetTracetypename_Equal(fRES(tracetypename));
    }

    protected void doSetTracetypename_Equal(String tracetypename) {
        regTracetypename(CK_EQ, tracetypename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_NotEqual(String tracetypename) {
        doSetTracetypename_NotEqual(fRES(tracetypename));
    }

    protected void doSetTracetypename_NotEqual(String tracetypename) {
        regTracetypename(CK_NES, tracetypename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_GreaterThan(String tracetypename) {
        regTracetypename(CK_GT, fRES(tracetypename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_LessThan(String tracetypename) {
        regTracetypename(CK_LT, fRES(tracetypename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_GreaterEqual(String tracetypename) {
        regTracetypename(CK_GE, fRES(tracetypename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_LessEqual(String tracetypename) {
        regTracetypename(CK_LE, fRES(tracetypename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypenameList The collection of tracetypename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_InScope(Collection<String> tracetypenameList) {
        doSetTracetypename_InScope(tracetypenameList);
    }

    protected void doSetTracetypename_InScope(Collection<String> tracetypenameList) {
        regINS(CK_INS, cTL(tracetypenameList), xgetCValueTracetypename(), "TRACETYPENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypenameList The collection of tracetypename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_NotInScope(Collection<String> tracetypenameList) {
        doSetTracetypename_NotInScope(tracetypenameList);
    }

    protected void doSetTracetypename_NotInScope(Collection<String> tracetypenameList) {
        regINS(CK_NINS, cTL(tracetypenameList), xgetCValueTracetypename(), "TRACETYPENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPENAME: {varchar(255)} <br>
     * <pre>e.g. setTracetypename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetypename The value of tracetypename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetypename_LikeSearch(String tracetypename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetypename), xgetCValueTracetypename(), "TRACETYPENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetypename_NotLikeSearch(String tracetypename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetypename), xgetCValueTracetypename(), "TRACETYPENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     * @param tracetypename The value of tracetypename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetypename_PrefixSearch(String tracetypename) {
        setTracetypename_LikeSearch(tracetypename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     */
    public void setTracetypename_IsNull() { regTracetypename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     */
    public void setTracetypename_IsNullOrEmpty() { regTracetypename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPENAME: {varchar(255)}
     */
    public void setTracetypename_IsNotNull() { regTracetypename(CK_ISNN, DOBJ); }

    protected void regTracetypename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetypename(), "TRACETYPENAME"); }
    protected abstract ConditionValue xgetCValueTracetypename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_Equal(String lineblock) {
        doSetLineblock_Equal(fRES(lineblock));
    }

    protected void doSetLineblock_Equal(String lineblock) {
        regLineblock(CK_EQ, lineblock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotEqual(String lineblock) {
        doSetLineblock_NotEqual(fRES(lineblock));
    }

    protected void doSetLineblock_NotEqual(String lineblock) {
        regLineblock(CK_NES, lineblock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterThan(String lineblock) {
        regLineblock(CK_GT, fRES(lineblock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessThan(String lineblock) {
        regLineblock(CK_LT, fRES(lineblock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_GreaterEqual(String lineblock) {
        regLineblock(CK_GE, fRES(lineblock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_LessEqual(String lineblock) {
        regLineblock(CK_LE, fRES(lineblock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblockList The collection of lineblock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_InScope(Collection<String> lineblockList) {
        doSetLineblock_InScope(lineblockList);
    }

    protected void doSetLineblock_InScope(Collection<String> lineblockList) {
        regINS(CK_INS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblockList The collection of lineblock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_NotInScope(Collection<String> lineblockList) {
        doSetLineblock_NotInScope(lineblockList);
    }

    protected void doSetLineblock_NotInScope(Collection<String> lineblockList) {
        regINS(CK_NINS, cTL(lineblockList), xgetCValueLineblock(), "LINEBLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)} <br>
     * <pre>e.g. setLineblock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineblock The value of lineblock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineblock_LikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineblock_NotLikeSearch(String lineblock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineblock), xgetCValueLineblock(), "LINEBLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     * @param lineblock The value of lineblock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineblock_PrefixSearch(String lineblock) {
        setLineblock_LikeSearch(lineblock, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNull() { regLineblock(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNullOrEmpty() { regLineblock(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINEBLOCK: {varchar(255)}
     */
    public void setLineblock_IsNotNull() { regLineblock(CK_ISNN, DOBJ); }

    protected void regLineblock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineblock(), "LINEBLOCK"); }
    protected abstract ConditionValue xgetCValueLineblock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_Equal(String assortedunit) {
        doSetAssortedunit_Equal(fRES(assortedunit));
    }

    protected void doSetAssortedunit_Equal(String assortedunit) {
        regAssortedunit(CK_EQ, assortedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotEqual(String assortedunit) {
        doSetAssortedunit_NotEqual(fRES(assortedunit));
    }

    protected void doSetAssortedunit_NotEqual(String assortedunit) {
        regAssortedunit(CK_NES, assortedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterThan(String assortedunit) {
        regAssortedunit(CK_GT, fRES(assortedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessThan(String assortedunit) {
        regAssortedunit(CK_LT, fRES(assortedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterEqual(String assortedunit) {
        regAssortedunit(CK_GE, fRES(assortedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessEqual(String assortedunit) {
        regAssortedunit(CK_LE, fRES(assortedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_InScope(Collection<String> assortedunitList) {
        doSetAssortedunit_InScope(assortedunitList);
    }

    protected void doSetAssortedunit_InScope(Collection<String> assortedunitList) {
        regINS(CK_INS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunitList The collection of assortedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotInScope(Collection<String> assortedunitList) {
        doSetAssortedunit_NotInScope(assortedunitList);
    }

    protected void doSetAssortedunit_NotInScope(Collection<String> assortedunitList) {
        regINS(CK_NINS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)} <br>
     * <pre>e.g. setAssortedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedunit The value of assortedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedunit_LikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedunit_NotLikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     * @param assortedunit The value of assortedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_PrefixSearch(String assortedunit) {
        setAssortedunit_LikeSearch(assortedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNull() { regAssortedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNullOrEmpty() { regAssortedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(255)}
     */
    public void setAssortedunit_IsNotNull() { regAssortedunit(CK_ISNN, DOBJ); }

    protected void regAssortedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedunit(), "ASSORTEDUNIT"); }
    protected abstract ConditionValue xgetCValueAssortedunit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_Equal(String assortedindex) {
        doSetAssortedindex_Equal(fRES(assortedindex));
    }

    protected void doSetAssortedindex_Equal(String assortedindex) {
        regAssortedindex(CK_EQ, assortedindex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotEqual(String assortedindex) {
        doSetAssortedindex_NotEqual(fRES(assortedindex));
    }

    protected void doSetAssortedindex_NotEqual(String assortedindex) {
        regAssortedindex(CK_NES, assortedindex);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterThan(String assortedindex) {
        regAssortedindex(CK_GT, fRES(assortedindex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_LessThan(String assortedindex) {
        regAssortedindex(CK_LT, fRES(assortedindex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_GreaterEqual(String assortedindex) {
        regAssortedindex(CK_GE, fRES(assortedindex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_LessEqual(String assortedindex) {
        regAssortedindex(CK_LE, fRES(assortedindex));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindexList The collection of assortedindex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_InScope(Collection<String> assortedindexList) {
        doSetAssortedindex_InScope(assortedindexList);
    }

    protected void doSetAssortedindex_InScope(Collection<String> assortedindexList) {
        regINS(CK_INS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindexList The collection of assortedindex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_NotInScope(Collection<String> assortedindexList) {
        doSetAssortedindex_NotInScope(assortedindexList);
    }

    protected void doSetAssortedindex_NotInScope(Collection<String> assortedindexList) {
        regINS(CK_NINS, cTL(assortedindexList), xgetCValueAssortedindex(), "ASSORTEDINDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)} <br>
     * <pre>e.g. setAssortedindex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedindex The value of assortedindex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedindex_LikeSearch(String assortedindex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedindex), xgetCValueAssortedindex(), "ASSORTEDINDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedindex_NotLikeSearch(String assortedindex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedindex), xgetCValueAssortedindex(), "ASSORTEDINDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     * @param assortedindex The value of assortedindex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedindex_PrefixSearch(String assortedindex) {
        setAssortedindex_LikeSearch(assortedindex, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNull() { regAssortedindex(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNullOrEmpty() { regAssortedindex(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDINDEX: {varchar(255)}
     */
    public void setAssortedindex_IsNotNull() { regAssortedindex(CK_ISNN, DOBJ); }

    protected void regAssortedindex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedindex(), "ASSORTEDINDEX"); }
    protected abstract ConditionValue xgetCValueAssortedindex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_Equal(String operationcode) {
        doSetOperationcode_Equal(fRES(operationcode));
    }

    protected void doSetOperationcode_Equal(String operationcode) {
        regOperationcode(CK_EQ, operationcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotEqual(String operationcode) {
        doSetOperationcode_NotEqual(fRES(operationcode));
    }

    protected void doSetOperationcode_NotEqual(String operationcode) {
        regOperationcode(CK_NES, operationcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterThan(String operationcode) {
        regOperationcode(CK_GT, fRES(operationcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessThan(String operationcode) {
        regOperationcode(CK_LT, fRES(operationcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_GreaterEqual(String operationcode) {
        regOperationcode(CK_GE, fRES(operationcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_LessEqual(String operationcode) {
        regOperationcode(CK_LE, fRES(operationcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcodeList The collection of operationcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_InScope(Collection<String> operationcodeList) {
        doSetOperationcode_InScope(operationcodeList);
    }

    protected void doSetOperationcode_InScope(Collection<String> operationcodeList) {
        regINS(CK_INS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcodeList The collection of operationcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_NotInScope(Collection<String> operationcodeList) {
        doSetOperationcode_NotInScope(operationcodeList);
    }

    protected void doSetOperationcode_NotInScope(Collection<String> operationcodeList) {
        regINS(CK_NINS, cTL(operationcodeList), xgetCValueOperationcode(), "OPERATIONCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)} <br>
     * <pre>e.g. setOperationcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param operationcode The value of operationcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOperationcode_LikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOperationcode_NotLikeSearch(String operationcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(operationcode), xgetCValueOperationcode(), "OPERATIONCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     * @param operationcode The value of operationcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationcode_PrefixSearch(String operationcode) {
        setOperationcode_LikeSearch(operationcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNull() { regOperationcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNullOrEmpty() { regOperationcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATIONCODE: {varchar(255)}
     */
    public void setOperationcode_IsNotNull() { regOperationcode(CK_ISNN, DOBJ); }

    protected void regOperationcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationcode(), "OPERATIONCODE"); }
    protected abstract ConditionValue xgetCValueOperationcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_Equal(String caseinnum) {
        doSetCaseinnum_Equal(fRES(caseinnum));
    }

    protected void doSetCaseinnum_Equal(String caseinnum) {
        regCaseinnum(CK_EQ, caseinnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotEqual(String caseinnum) {
        doSetCaseinnum_NotEqual(fRES(caseinnum));
    }

    protected void doSetCaseinnum_NotEqual(String caseinnum) {
        regCaseinnum(CK_NES, caseinnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterThan(String caseinnum) {
        regCaseinnum(CK_GT, fRES(caseinnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_LessThan(String caseinnum) {
        regCaseinnum(CK_LT, fRES(caseinnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_GreaterEqual(String caseinnum) {
        regCaseinnum(CK_GE, fRES(caseinnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_LessEqual(String caseinnum) {
        regCaseinnum(CK_LE, fRES(caseinnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnumList The collection of caseinnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_InScope(Collection<String> caseinnumList) {
        doSetCaseinnum_InScope(caseinnumList);
    }

    protected void doSetCaseinnum_InScope(Collection<String> caseinnumList) {
        regINS(CK_INS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnumList The collection of caseinnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_NotInScope(Collection<String> caseinnumList) {
        doSetCaseinnum_NotInScope(caseinnumList);
    }

    protected void doSetCaseinnum_NotInScope(Collection<String> caseinnumList) {
        regINS(CK_NINS, cTL(caseinnumList), xgetCValueCaseinnum(), "CASEINNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)} <br>
     * <pre>e.g. setCaseinnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseinnum The value of caseinnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseinnum_LikeSearch(String caseinnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseinnum), xgetCValueCaseinnum(), "CASEINNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseinnum_NotLikeSearch(String caseinnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseinnum), xgetCValueCaseinnum(), "CASEINNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEINNUM: {varchar(255)}
     * @param caseinnum The value of caseinnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnum_PrefixSearch(String caseinnum) {
        setCaseinnum_LikeSearch(caseinnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNull() { regCaseinnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNullOrEmpty() { regCaseinnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUM: {varchar(255)}
     */
    public void setCaseinnum_IsNotNull() { regCaseinnum(CK_ISNN, DOBJ); }

    protected void regCaseinnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnum(), "CASEINNUM"); }
    protected abstract ConditionValue xgetCValueCaseinnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_Equal(String assortnum) {
        doSetAssortnum_Equal(fRES(assortnum));
    }

    protected void doSetAssortnum_Equal(String assortnum) {
        regAssortnum(CK_EQ, assortnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotEqual(String assortnum) {
        doSetAssortnum_NotEqual(fRES(assortnum));
    }

    protected void doSetAssortnum_NotEqual(String assortnum) {
        regAssortnum(CK_NES, assortnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterThan(String assortnum) {
        regAssortnum(CK_GT, fRES(assortnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_LessThan(String assortnum) {
        regAssortnum(CK_LT, fRES(assortnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_GreaterEqual(String assortnum) {
        regAssortnum(CK_GE, fRES(assortnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_LessEqual(String assortnum) {
        regAssortnum(CK_LE, fRES(assortnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnumList The collection of assortnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_InScope(Collection<String> assortnumList) {
        doSetAssortnum_InScope(assortnumList);
    }

    protected void doSetAssortnum_InScope(Collection<String> assortnumList) {
        regINS(CK_INS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnumList The collection of assortnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_NotInScope(Collection<String> assortnumList) {
        doSetAssortnum_NotInScope(assortnumList);
    }

    protected void doSetAssortnum_NotInScope(Collection<String> assortnumList) {
        regINS(CK_NINS, cTL(assortnumList), xgetCValueAssortnum(), "ASSORTNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)} <br>
     * <pre>e.g. setAssortnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortnum The value of assortnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortnum_LikeSearch(String assortnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortnum), xgetCValueAssortnum(), "ASSORTNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortnum_NotLikeSearch(String assortnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortnum), xgetCValueAssortnum(), "ASSORTNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     * @param assortnum The value of assortnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortnum_PrefixSearch(String assortnum) {
        setAssortnum_LikeSearch(assortnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNull() { regAssortnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNullOrEmpty() { regAssortnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTNUM: {varchar(255)}
     */
    public void setAssortnum_IsNotNull() { regAssortnum(CK_ISNN, DOBJ); }

    protected void regAssortnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortnum(), "ASSORTNUM"); }
    protected abstract ConditionValue xgetCValueAssortnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_Equal(String assortdifnum) {
        doSetAssortdifnum_Equal(fRES(assortdifnum));
    }

    protected void doSetAssortdifnum_Equal(String assortdifnum) {
        regAssortdifnum(CK_EQ, assortdifnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotEqual(String assortdifnum) {
        doSetAssortdifnum_NotEqual(fRES(assortdifnum));
    }

    protected void doSetAssortdifnum_NotEqual(String assortdifnum) {
        regAssortdifnum(CK_NES, assortdifnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterThan(String assortdifnum) {
        regAssortdifnum(CK_GT, fRES(assortdifnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessThan(String assortdifnum) {
        regAssortdifnum(CK_LT, fRES(assortdifnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_GreaterEqual(String assortdifnum) {
        regAssortdifnum(CK_GE, fRES(assortdifnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_LessEqual(String assortdifnum) {
        regAssortdifnum(CK_LE, fRES(assortdifnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnumList The collection of assortdifnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_InScope(Collection<String> assortdifnumList) {
        doSetAssortdifnum_InScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_InScope(Collection<String> assortdifnumList) {
        regINS(CK_INS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnumList The collection of assortdifnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_NotInScope(Collection<String> assortdifnumList) {
        doSetAssortdifnum_NotInScope(assortdifnumList);
    }

    protected void doSetAssortdifnum_NotInScope(Collection<String> assortdifnumList) {
        regINS(CK_NINS, cTL(assortdifnumList), xgetCValueAssortdifnum(), "ASSORTDIFNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)} <br>
     * <pre>e.g. setAssortdifnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortdifnum The value of assortdifnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortdifnum_LikeSearch(String assortdifnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortdifnum), xgetCValueAssortdifnum(), "ASSORTDIFNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortdifnum_NotLikeSearch(String assortdifnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortdifnum), xgetCValueAssortdifnum(), "ASSORTDIFNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     * @param assortdifnum The value of assortdifnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortdifnum_PrefixSearch(String assortdifnum) {
        setAssortdifnum_LikeSearch(assortdifnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNull() { regAssortdifnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNullOrEmpty() { regAssortdifnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTDIFNUM: {varchar(255)}
     */
    public void setAssortdifnum_IsNotNull() { regAssortdifnum(CK_ISNN, DOBJ); }

    protected void regAssortdifnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortdifnum(), "ASSORTDIFNUM"); }
    protected abstract ConditionValue xgetCValueAssortdifnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_Equal(String directioncd) {
        doSetDirectioncd_Equal(fRES(directioncd));
    }

    protected void doSetDirectioncd_Equal(String directioncd) {
        regDirectioncd(CK_EQ, directioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotEqual(String directioncd) {
        doSetDirectioncd_NotEqual(fRES(directioncd));
    }

    protected void doSetDirectioncd_NotEqual(String directioncd) {
        regDirectioncd(CK_NES, directioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterThan(String directioncd) {
        regDirectioncd(CK_GT, fRES(directioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessThan(String directioncd) {
        regDirectioncd(CK_LT, fRES(directioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterEqual(String directioncd) {
        regDirectioncd(CK_GE, fRES(directioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessEqual(String directioncd) {
        regDirectioncd(CK_LE, fRES(directioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncdList The collection of directioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_InScope(Collection<String> directioncdList) {
        doSetDirectioncd_InScope(directioncdList);
    }

    protected void doSetDirectioncd_InScope(Collection<String> directioncdList) {
        regINS(CK_INS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncdList The collection of directioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotInScope(Collection<String> directioncdList) {
        doSetDirectioncd_NotInScope(directioncdList);
    }

    protected void doSetDirectioncd_NotInScope(Collection<String> directioncdList) {
        regINS(CK_NINS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)} <br>
     * <pre>e.g. setDirectioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directioncd The value of directioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectioncd_LikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectioncd_NotLikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     * @param directioncd The value of directioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_PrefixSearch(String directioncd) {
        setDirectioncd_LikeSearch(directioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNull() { regDirectioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNullOrEmpty() { regDirectioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(255)}
     */
    public void setDirectioncd_IsNotNull() { regDirectioncd(CK_ISNN, DOBJ); }

    protected void regDirectioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectioncd(), "DIRECTIONCD"); }
    protected abstract ConditionValue xgetCValueDirectioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_Equal(String pistontype) {
        doSetPistontype_Equal(fRES(pistontype));
    }

    protected void doSetPistontype_Equal(String pistontype) {
        regPistontype(CK_EQ, pistontype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotEqual(String pistontype) {
        doSetPistontype_NotEqual(fRES(pistontype));
    }

    protected void doSetPistontype_NotEqual(String pistontype) {
        regPistontype(CK_NES, pistontype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterThan(String pistontype) {
        regPistontype(CK_GT, fRES(pistontype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessThan(String pistontype) {
        regPistontype(CK_LT, fRES(pistontype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterEqual(String pistontype) {
        regPistontype(CK_GE, fRES(pistontype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessEqual(String pistontype) {
        regPistontype(CK_LE, fRES(pistontype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontypeList The collection of pistontype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_InScope(Collection<String> pistontypeList) {
        doSetPistontype_InScope(pistontypeList);
    }

    protected void doSetPistontype_InScope(Collection<String> pistontypeList) {
        regINS(CK_INS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontypeList The collection of pistontype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotInScope(Collection<String> pistontypeList) {
        doSetPistontype_NotInScope(pistontypeList);
    }

    protected void doSetPistontype_NotInScope(Collection<String> pistontypeList) {
        regINS(CK_NINS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)} <br>
     * <pre>e.g. setPistontype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistontype The value of pistontype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistontype_LikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistontype_NotLikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     * @param pistontype The value of pistontype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_PrefixSearch(String pistontype) {
        setPistontype_LikeSearch(pistontype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNull() { regPistontype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNullOrEmpty() { regPistontype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {varchar(255)}
     */
    public void setPistontype_IsNotNull() { regPistontype(CK_ISNN, DOBJ); }

    protected void regPistontype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistontype(), "PISTONTYPE"); }
    protected abstract ConditionValue xgetCValuePistontype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(255)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(String directionnum) {
        doSetDirectionnum_Equal(fRES(directionnum));
    }

    protected void doSetDirectionnum_Equal(String directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(String directionnum) {
        doSetDirectionnum_NotEqual(fRES(directionnum));
    }

    protected void doSetDirectionnum_NotEqual(String directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(String directionnum) {
        regDirectionnum(CK_GT, fRES(directionnum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(String directionnum) {
        regDirectionnum(CK_LT, fRES(directionnum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(String directionnum) {
        regDirectionnum(CK_GE, fRES(directionnum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(String directionnum) {
        regDirectionnum(CK_LE, fRES(directionnum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<String> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<String> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<String> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<String> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)} <br>
     * <pre>e.g. setDirectionnum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directionnum The value of directionnum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectionnum_LikeSearch(String directionnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directionnum), xgetCValueDirectionnum(), "DIRECTIONNUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectionnum_NotLikeSearch(String directionnum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directionnum), xgetCValueDirectionnum(), "DIRECTIONNUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     * @param directionnum The value of directionnum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_PrefixSearch(String directionnum) {
        setDirectionnum_LikeSearch(directionnum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNullOrEmpty() { regDirectionnum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {varchar(255)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_Equal(String distwarehousecd) {
        doSetDistwarehousecd_Equal(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_Equal(String distwarehousecd) {
        regDistwarehousecd(CK_EQ, distwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotEqual(String distwarehousecd) {
        doSetDistwarehousecd_NotEqual(fRES(distwarehousecd));
    }

    protected void doSetDistwarehousecd_NotEqual(String distwarehousecd) {
        regDistwarehousecd(CK_NES, distwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterThan(String distwarehousecd) {
        regDistwarehousecd(CK_GT, fRES(distwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessThan(String distwarehousecd) {
        regDistwarehousecd(CK_LT, fRES(distwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_GreaterEqual(String distwarehousecd) {
        regDistwarehousecd(CK_GE, fRES(distwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_LessEqual(String distwarehousecd) {
        regDistwarehousecd(CK_LE, fRES(distwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecdList The collection of distwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_InScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_InScope(Collection<String> distwarehousecdList) {
        regINS(CK_INS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecdList The collection of distwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        doSetDistwarehousecd_NotInScope(distwarehousecdList);
    }

    protected void doSetDistwarehousecd_NotInScope(Collection<String> distwarehousecdList) {
        regINS(CK_NINS, cTL(distwarehousecdList), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)} <br>
     * <pre>e.g. setDistwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousecd The value of distwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousecd_LikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousecd_NotLikeSearch(String distwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousecd), xgetCValueDistwarehousecd(), "DISTWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     * @param distwarehousecd The value of distwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousecd_PrefixSearch(String distwarehousecd) {
        setDistwarehousecd_LikeSearch(distwarehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNull() { regDistwarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNullOrEmpty() { regDistwarehousecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSECD: {varchar(255)}
     */
    public void setDistwarehousecd_IsNotNull() { regDistwarehousecd(CK_ISNN, DOBJ); }

    protected void regDistwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousecd(), "DISTWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDistwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_Equal(String distwarehousename) {
        doSetDistwarehousename_Equal(fRES(distwarehousename));
    }

    protected void doSetDistwarehousename_Equal(String distwarehousename) {
        regDistwarehousename(CK_EQ, distwarehousename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_NotEqual(String distwarehousename) {
        doSetDistwarehousename_NotEqual(fRES(distwarehousename));
    }

    protected void doSetDistwarehousename_NotEqual(String distwarehousename) {
        regDistwarehousename(CK_NES, distwarehousename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_GreaterThan(String distwarehousename) {
        regDistwarehousename(CK_GT, fRES(distwarehousename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_LessThan(String distwarehousename) {
        regDistwarehousename(CK_LT, fRES(distwarehousename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_GreaterEqual(String distwarehousename) {
        regDistwarehousename(CK_GE, fRES(distwarehousename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_LessEqual(String distwarehousename) {
        regDistwarehousename(CK_LE, fRES(distwarehousename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousenameList The collection of distwarehousename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_InScope(Collection<String> distwarehousenameList) {
        doSetDistwarehousename_InScope(distwarehousenameList);
    }

    protected void doSetDistwarehousename_InScope(Collection<String> distwarehousenameList) {
        regINS(CK_INS, cTL(distwarehousenameList), xgetCValueDistwarehousename(), "DISTWAREHOUSENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousenameList The collection of distwarehousename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_NotInScope(Collection<String> distwarehousenameList) {
        doSetDistwarehousename_NotInScope(distwarehousenameList);
    }

    protected void doSetDistwarehousename_NotInScope(Collection<String> distwarehousenameList) {
        regINS(CK_NINS, cTL(distwarehousenameList), xgetCValueDistwarehousename(), "DISTWAREHOUSENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)} <br>
     * <pre>e.g. setDistwarehousename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distwarehousename The value of distwarehousename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistwarehousename_LikeSearch(String distwarehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distwarehousename), xgetCValueDistwarehousename(), "DISTWAREHOUSENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistwarehousename_NotLikeSearch(String distwarehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distwarehousename), xgetCValueDistwarehousename(), "DISTWAREHOUSENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     * @param distwarehousename The value of distwarehousename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistwarehousename_PrefixSearch(String distwarehousename) {
        setDistwarehousename_LikeSearch(distwarehousename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     */
    public void setDistwarehousename_IsNull() { regDistwarehousename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     */
    public void setDistwarehousename_IsNullOrEmpty() { regDistwarehousename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTWAREHOUSENAME: {varchar(255)}
     */
    public void setDistwarehousename_IsNotNull() { regDistwarehousename(CK_ISNN, DOBJ); }

    protected void regDistwarehousename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistwarehousename(), "DISTWAREHOUSENAME"); }
    protected abstract ConditionValue xgetCValueDistwarehousename();

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
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_Equal(String whItemcd) {
        doSetWhItemcd_Equal(fRES(whItemcd));
    }

    protected void doSetWhItemcd_Equal(String whItemcd) {
        regWhItemcd(CK_EQ, whItemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_NotEqual(String whItemcd) {
        doSetWhItemcd_NotEqual(fRES(whItemcd));
    }

    protected void doSetWhItemcd_NotEqual(String whItemcd) {
        regWhItemcd(CK_NES, whItemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_GreaterThan(String whItemcd) {
        regWhItemcd(CK_GT, fRES(whItemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_LessThan(String whItemcd) {
        regWhItemcd(CK_LT, fRES(whItemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_GreaterEqual(String whItemcd) {
        regWhItemcd(CK_GE, fRES(whItemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_LessEqual(String whItemcd) {
        regWhItemcd(CK_LE, fRES(whItemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcdList The collection of whItemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_InScope(Collection<String> whItemcdList) {
        doSetWhItemcd_InScope(whItemcdList);
    }

    protected void doSetWhItemcd_InScope(Collection<String> whItemcdList) {
        regINS(CK_INS, cTL(whItemcdList), xgetCValueWhItemcd(), "WH_ITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcdList The collection of whItemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_NotInScope(Collection<String> whItemcdList) {
        doSetWhItemcd_NotInScope(whItemcdList);
    }

    protected void doSetWhItemcd_NotInScope(Collection<String> whItemcdList) {
        regINS(CK_NINS, cTL(whItemcdList), xgetCValueWhItemcd(), "WH_ITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMCD: {varchar(255)} <br>
     * <pre>e.g. setWhItemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param whItemcd The value of whItemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWhItemcd_LikeSearch(String whItemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(whItemcd), xgetCValueWhItemcd(), "WH_ITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWhItemcd_NotLikeSearch(String whItemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(whItemcd), xgetCValueWhItemcd(), "WH_ITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     * @param whItemcd The value of whItemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemcd_PrefixSearch(String whItemcd) {
        setWhItemcd_LikeSearch(whItemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     */
    public void setWhItemcd_IsNull() { regWhItemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     */
    public void setWhItemcd_IsNullOrEmpty() { regWhItemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WH_ITEMCD: {varchar(255)}
     */
    public void setWhItemcd_IsNotNull() { regWhItemcd(CK_ISNN, DOBJ); }

    protected void regWhItemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWhItemcd(), "WH_ITEMCD"); }
    protected abstract ConditionValue xgetCValueWhItemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_Equal(String whItemname) {
        doSetWhItemname_Equal(fRES(whItemname));
    }

    protected void doSetWhItemname_Equal(String whItemname) {
        regWhItemname(CK_EQ, whItemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_NotEqual(String whItemname) {
        doSetWhItemname_NotEqual(fRES(whItemname));
    }

    protected void doSetWhItemname_NotEqual(String whItemname) {
        regWhItemname(CK_NES, whItemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_GreaterThan(String whItemname) {
        regWhItemname(CK_GT, fRES(whItemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_LessThan(String whItemname) {
        regWhItemname(CK_LT, fRES(whItemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_GreaterEqual(String whItemname) {
        regWhItemname(CK_GE, fRES(whItemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_LessEqual(String whItemname) {
        regWhItemname(CK_LE, fRES(whItemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemnameList The collection of whItemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_InScope(Collection<String> whItemnameList) {
        doSetWhItemname_InScope(whItemnameList);
    }

    protected void doSetWhItemname_InScope(Collection<String> whItemnameList) {
        regINS(CK_INS, cTL(whItemnameList), xgetCValueWhItemname(), "WH_ITEMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemnameList The collection of whItemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_NotInScope(Collection<String> whItemnameList) {
        doSetWhItemname_NotInScope(whItemnameList);
    }

    protected void doSetWhItemname_NotInScope(Collection<String> whItemnameList) {
        regINS(CK_NINS, cTL(whItemnameList), xgetCValueWhItemname(), "WH_ITEMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMNAME: {varchar(255)} <br>
     * <pre>e.g. setWhItemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param whItemname The value of whItemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWhItemname_LikeSearch(String whItemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(whItemname), xgetCValueWhItemname(), "WH_ITEMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWhItemname_NotLikeSearch(String whItemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(whItemname), xgetCValueWhItemname(), "WH_ITEMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     * @param whItemname The value of whItemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhItemname_PrefixSearch(String whItemname) {
        setWhItemname_LikeSearch(whItemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     */
    public void setWhItemname_IsNull() { regWhItemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     */
    public void setWhItemname_IsNullOrEmpty() { regWhItemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WH_ITEMNAME: {varchar(255)}
     */
    public void setWhItemname_IsNotNull() { regWhItemname(CK_ISNN, DOBJ); }

    protected void regWhItemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWhItemname(), "WH_ITEMNAME"); }
    protected abstract ConditionValue xgetCValueWhItemname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_Equal(String whDesigncd) {
        doSetWhDesigncd_Equal(fRES(whDesigncd));
    }

    protected void doSetWhDesigncd_Equal(String whDesigncd) {
        regWhDesigncd(CK_EQ, whDesigncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_NotEqual(String whDesigncd) {
        doSetWhDesigncd_NotEqual(fRES(whDesigncd));
    }

    protected void doSetWhDesigncd_NotEqual(String whDesigncd) {
        regWhDesigncd(CK_NES, whDesigncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_GreaterThan(String whDesigncd) {
        regWhDesigncd(CK_GT, fRES(whDesigncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_LessThan(String whDesigncd) {
        regWhDesigncd(CK_LT, fRES(whDesigncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_GreaterEqual(String whDesigncd) {
        regWhDesigncd(CK_GE, fRES(whDesigncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_LessEqual(String whDesigncd) {
        regWhDesigncd(CK_LE, fRES(whDesigncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncdList The collection of whDesigncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_InScope(Collection<String> whDesigncdList) {
        doSetWhDesigncd_InScope(whDesigncdList);
    }

    protected void doSetWhDesigncd_InScope(Collection<String> whDesigncdList) {
        regINS(CK_INS, cTL(whDesigncdList), xgetCValueWhDesigncd(), "WH_DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncdList The collection of whDesigncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_NotInScope(Collection<String> whDesigncdList) {
        doSetWhDesigncd_NotInScope(whDesigncdList);
    }

    protected void doSetWhDesigncd_NotInScope(Collection<String> whDesigncdList) {
        regINS(CK_NINS, cTL(whDesigncdList), xgetCValueWhDesigncd(), "WH_DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_DESIGNCD: {varchar(255)} <br>
     * <pre>e.g. setWhDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param whDesigncd The value of whDesigncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWhDesigncd_LikeSearch(String whDesigncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(whDesigncd), xgetCValueWhDesigncd(), "WH_DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWhDesigncd_NotLikeSearch(String whDesigncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(whDesigncd), xgetCValueWhDesigncd(), "WH_DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     * @param whDesigncd The value of whDesigncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWhDesigncd_PrefixSearch(String whDesigncd) {
        setWhDesigncd_LikeSearch(whDesigncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     */
    public void setWhDesigncd_IsNull() { regWhDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     */
    public void setWhDesigncd_IsNullOrEmpty() { regWhDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WH_DESIGNCD: {varchar(255)}
     */
    public void setWhDesigncd_IsNotNull() { regWhDesigncd(CK_ISNN, DOBJ); }

    protected void regWhDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWhDesigncd(), "WH_DESIGNCD"); }
    protected abstract ConditionValue xgetCValueWhDesigncd();

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
    public HpSLCFunction<EShopDomesticSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShopDomesticSendCB.class);
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
    public HpSLCFunction<EShopDomesticSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShopDomesticSendCB.class);
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
    public HpSLCFunction<EShopDomesticSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShopDomesticSendCB.class);
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
    public HpSLCFunction<EShopDomesticSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShopDomesticSendCB.class);
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
    public HpSLCFunction<EShopDomesticSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShopDomesticSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShopDomesticSendCB&gt;() {
     *     public void query(EShopDomesticSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShopDomesticSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShopDomesticSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopDomesticSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShopDomesticSendCQ sq);

    protected EShopDomesticSendCB xcreateScalarConditionCB() {
        EShopDomesticSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShopDomesticSendCB xcreateScalarConditionPartitionByCB() {
        EShopDomesticSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShopDomesticSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopDomesticSendCB cb = new EShopDomesticSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHOP_DOMESTIC_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShopDomesticSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShopDomesticSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShopDomesticSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShopDomesticSendCB cb = new EShopDomesticSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHOP_DOMESTIC_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShopDomesticSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShopDomesticSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShopDomesticSendCB cb = new EShopDomesticSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShopDomesticSendCQ sq);

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
    protected EShopDomesticSendCB newMyCB() {
        return new EShopDomesticSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShopDomesticSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
