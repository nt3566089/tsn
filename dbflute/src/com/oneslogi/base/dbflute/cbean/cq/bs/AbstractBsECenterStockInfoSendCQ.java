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
 * The abstract condition-query of E_CENTER_STOCK_INFO_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsECenterStockInfoSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsECenterStockInfoSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_CENTER_STOCK_INFO_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_Equal(Long centerStockInfoSendId) {
        doSetCenterStockInfoSendId_Equal(centerStockInfoSendId);
    }

    protected void doSetCenterStockInfoSendId_Equal(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_EQ, centerStockInfoSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_NotEqual(Long centerStockInfoSendId) {
        doSetCenterStockInfoSendId_NotEqual(centerStockInfoSendId);
    }

    protected void doSetCenterStockInfoSendId_NotEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_NES, centerStockInfoSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_GreaterThan(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_GT, centerStockInfoSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_LessThan(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_LT, centerStockInfoSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_GreaterEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_GE, centerStockInfoSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendId The value of centerStockInfoSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_LessEqual(Long centerStockInfoSendId) {
        regCenterStockInfoSendId(CK_LE, centerStockInfoSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of centerStockInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerStockInfoSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterStockInfoSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendIdList The collection of centerStockInfoSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_InScope(Collection<Long> centerStockInfoSendIdList) {
        doSetCenterStockInfoSendId_InScope(centerStockInfoSendIdList);
    }

    protected void doSetCenterStockInfoSendId_InScope(Collection<Long> centerStockInfoSendIdList) {
        regINS(CK_INS, cTL(centerStockInfoSendIdList), xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param centerStockInfoSendIdList The collection of centerStockInfoSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterStockInfoSendId_NotInScope(Collection<Long> centerStockInfoSendIdList) {
        doSetCenterStockInfoSendId_NotInScope(centerStockInfoSendIdList);
    }

    protected void doSetCenterStockInfoSendId_NotInScope(Collection<Long> centerStockInfoSendIdList) {
        regINS(CK_NINS, cTL(centerStockInfoSendIdList), xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterStockInfoSendId_IsNull() { regCenterStockInfoSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_STOCK_INFO_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCenterStockInfoSendId_IsNotNull() { regCenterStockInfoSendId(CK_ISNN, DOBJ); }

    protected void regCenterStockInfoSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterStockInfoSendId(), "CENTER_STOCK_INFO_SEND_ID"); }
    protected abstract ConditionValue xgetCValueCenterStockInfoSendId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_Equal(String processDt) {
        doSetProcessDt_Equal(fRES(processDt));
    }

    protected void doSetProcessDt_Equal(String processDt) {
        regProcessDt(CK_EQ, processDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotEqual(String processDt) {
        doSetProcessDt_NotEqual(fRES(processDt));
    }

    protected void doSetProcessDt_NotEqual(String processDt) {
        regProcessDt(CK_NES, processDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterThan(String processDt) {
        regProcessDt(CK_GT, fRES(processDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessThan(String processDt) {
        regProcessDt(CK_LT, fRES(processDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_GreaterEqual(String processDt) {
        regProcessDt(CK_GE, fRES(processDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_LessEqual(String processDt) {
        regProcessDt(CK_LE, fRES(processDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDtList The collection of processDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_InScope(Collection<String> processDtList) {
        doSetProcessDt_InScope(processDtList);
    }

    protected void doSetProcessDt_InScope(Collection<String> processDtList) {
        regINS(CK_INS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDtList The collection of processDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_NotInScope(Collection<String> processDtList) {
        doSetProcessDt_NotInScope(processDtList);
    }

    protected void doSetProcessDt_NotInScope(Collection<String> processDtList) {
        regINS(CK_NINS, cTL(processDtList), xgetCValueProcessDt(), "PROCESS_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)} <br>
     * <pre>e.g. setProcessDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processDt The value of processDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessDt_LikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessDt_NotLikeSearch(String processDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processDt), xgetCValueProcessDt(), "PROCESS_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_DT: {NotNull, varchar(8)}
     * @param processDt The value of processDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessDt_PrefixSearch(String processDt) {
        setProcessDt_LikeSearch(processDt, xcLSOPPre());
    }

    protected void regProcessDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessDt(), "PROCESS_DT"); }
    protected abstract ConditionValue xgetCValueProcessDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
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
     * WAREHOUSE_CD: {NotNull, varchar(30)}
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
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
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
     * WAREHOUSE_CD: {NotNull, varchar(30)}
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
     * WAREHOUSE_CD: {NotNull, varchar(30)} <br>
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
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {NotNull, varchar(30)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_Equal(String warehouseName) {
        doSetWarehouseName_Equal(fRES(warehouseName));
    }

    protected void doSetWarehouseName_Equal(String warehouseName) {
        regWarehouseName(CK_EQ, warehouseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_NotEqual(String warehouseName) {
        doSetWarehouseName_NotEqual(fRES(warehouseName));
    }

    protected void doSetWarehouseName_NotEqual(String warehouseName) {
        regWarehouseName(CK_NES, warehouseName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_GreaterThan(String warehouseName) {
        regWarehouseName(CK_GT, fRES(warehouseName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_LessThan(String warehouseName) {
        regWarehouseName(CK_LT, fRES(warehouseName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_GreaterEqual(String warehouseName) {
        regWarehouseName(CK_GE, fRES(warehouseName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_LessEqual(String warehouseName) {
        regWarehouseName(CK_LE, fRES(warehouseName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseNameList The collection of warehouseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_InScope(Collection<String> warehouseNameList) {
        doSetWarehouseName_InScope(warehouseNameList);
    }

    protected void doSetWarehouseName_InScope(Collection<String> warehouseNameList) {
        regINS(CK_INS, cTL(warehouseNameList), xgetCValueWarehouseName(), "WAREHOUSE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseNameList The collection of warehouseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_NotInScope(Collection<String> warehouseNameList) {
        doSetWarehouseName_NotInScope(warehouseNameList);
    }

    protected void doSetWarehouseName_NotInScope(Collection<String> warehouseNameList) {
        regINS(CK_NINS, cTL(warehouseNameList), xgetCValueWarehouseName(), "WAREHOUSE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)} <br>
     * <pre>e.g. setWarehouseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseName The value of warehouseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseName_LikeSearch(String warehouseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseName), xgetCValueWarehouseName(), "WAREHOUSE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseName_NotLikeSearch(String warehouseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseName), xgetCValueWarehouseName(), "WAREHOUSE_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_NAME: {NotNull, varchar(60)}
     * @param warehouseName The value of warehouseName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseName_PrefixSearch(String warehouseName) {
        setWarehouseName_LikeSearch(warehouseName, xcLSOPPre());
    }

    protected void regWarehouseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseName(), "WAREHOUSE_NAME"); }
    protected abstract ConditionValue xgetCValueWarehouseName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_Equal(String itemCd) {
        doSetItemCd_Equal(fRES(itemCd));
    }

    protected void doSetItemCd_Equal(String itemCd) {
        regItemCd(CK_EQ, itemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotEqual(String itemCd) {
        doSetItemCd_NotEqual(fRES(itemCd));
    }

    protected void doSetItemCd_NotEqual(String itemCd) {
        regItemCd(CK_NES, itemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterThan(String itemCd) {
        regItemCd(CK_GT, fRES(itemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessThan(String itemCd) {
        regItemCd(CK_LT, fRES(itemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_GreaterEqual(String itemCd) {
        regItemCd(CK_GE, fRES(itemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_LessEqual(String itemCd) {
        regItemCd(CK_LE, fRES(itemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCdList The collection of itemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_InScope(Collection<String> itemCdList) {
        doSetItemCd_InScope(itemCdList);
    }

    protected void doSetItemCd_InScope(Collection<String> itemCdList) {
        regINS(CK_INS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCdList The collection of itemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_NotInScope(Collection<String> itemCdList) {
        doSetItemCd_NotInScope(itemCdList);
    }

    protected void doSetItemCd_NotInScope(Collection<String> itemCdList) {
        regINS(CK_NINS, cTL(itemCdList), xgetCValueItemCd(), "ITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemCd The value of itemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemCd_LikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemCd_NotLikeSearch(String itemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemCd), xgetCValueItemCd(), "ITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_CD: {NotNull, varchar(30)}
     * @param itemCd The value of itemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemCd_PrefixSearch(String itemCd) {
        setItemCd_LikeSearch(itemCd, xcLSOPPre());
    }

    protected void regItemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemCd(), "ITEM_CD"); }
    protected abstract ConditionValue xgetCValueItemCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_Equal(String itemName) {
        doSetItemName_Equal(fRES(itemName));
    }

    protected void doSetItemName_Equal(String itemName) {
        regItemName(CK_EQ, itemName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotEqual(String itemName) {
        doSetItemName_NotEqual(fRES(itemName));
    }

    protected void doSetItemName_NotEqual(String itemName) {
        regItemName(CK_NES, itemName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterThan(String itemName) {
        regItemName(CK_GT, fRES(itemName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessThan(String itemName) {
        regItemName(CK_LT, fRES(itemName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterEqual(String itemName) {
        regItemName(CK_GE, fRES(itemName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessEqual(String itemName) {
        regItemName(CK_LE, fRES(itemName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemNameList The collection of itemName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_InScope(Collection<String> itemNameList) {
        doSetItemName_InScope(itemNameList);
    }

    protected void doSetItemName_InScope(Collection<String> itemNameList) {
        regINS(CK_INS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemNameList The collection of itemName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotInScope(Collection<String> itemNameList) {
        doSetItemName_NotInScope(itemNameList);
    }

    protected void doSetItemName_NotInScope(Collection<String> itemNameList) {
        regINS(CK_NINS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)} <br>
     * <pre>e.g. setItemName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemName The value of itemName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemName_LikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemName_NotLikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, varchar(60)}
     * @param itemName The value of itemName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_PrefixSearch(String itemName) {
        setItemName_LikeSearch(itemName, xcLSOPPre());
    }

    protected void regItemName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemName(), "ITEM_NAME"); }
    protected abstract ConditionValue xgetCValueItemName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_Equal(String limitDate) {
        doSetLimitDate_Equal(fRES(limitDate));
    }

    protected void doSetLimitDate_Equal(String limitDate) {
        regLimitDate(CK_EQ, limitDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_NotEqual(String limitDate) {
        doSetLimitDate_NotEqual(fRES(limitDate));
    }

    protected void doSetLimitDate_NotEqual(String limitDate) {
        regLimitDate(CK_NES, limitDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_GreaterThan(String limitDate) {
        regLimitDate(CK_GT, fRES(limitDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_LessThan(String limitDate) {
        regLimitDate(CK_LT, fRES(limitDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_GreaterEqual(String limitDate) {
        regLimitDate(CK_GE, fRES(limitDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_LessEqual(String limitDate) {
        regLimitDate(CK_LE, fRES(limitDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDateList The collection of limitDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_InScope(Collection<String> limitDateList) {
        doSetLimitDate_InScope(limitDateList);
    }

    protected void doSetLimitDate_InScope(Collection<String> limitDateList) {
        regINS(CK_INS, cTL(limitDateList), xgetCValueLimitDate(), "LIMIT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDateList The collection of limitDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_NotInScope(Collection<String> limitDateList) {
        doSetLimitDate_NotInScope(limitDateList);
    }

    protected void doSetLimitDate_NotInScope(Collection<String> limitDateList) {
        regINS(CK_NINS, cTL(limitDateList), xgetCValueLimitDate(), "LIMIT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)} <br>
     * <pre>e.g. setLimitDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDate The value of limitDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDate_LikeSearch(String limitDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDate), xgetCValueLimitDate(), "LIMIT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDate_NotLikeSearch(String limitDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDate), xgetCValueLimitDate(), "LIMIT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     * @param limitDate The value of limitDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDate_PrefixSearch(String limitDate) {
        setLimitDate_LikeSearch(limitDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNull() { regLimitDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNullOrEmpty() { regLimitDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DATE: {varchar(8)}
     */
    public void setLimitDate_IsNotNull() { regLimitDate(CK_ISNN, DOBJ); }

    protected void regLimitDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDate(), "LIMIT_DATE"); }
    protected abstract ConditionValue xgetCValueLimitDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
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
     * DESIGN_CD: {varchar(30)}
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
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterThan(String designCd) {
        regDesignCd(CK_GT, fRES(designCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessThan(String designCd) {
        regDesignCd(CK_LT, fRES(designCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterEqual(String designCd) {
        regDesignCd(CK_GE, fRES(designCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessEqual(String designCd) {
        regDesignCd(CK_LE, fRES(designCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(30)}
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
     * DESIGN_CD: {varchar(30)}
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
     * DESIGN_CD: {varchar(30)} <br>
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
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignCd_NotLikeSearch(String designCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designCd), xgetCValueDesignCd(), "DESIGN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     * @param designCd The value of designCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_PrefixSearch(String designCd) {
        setDesignCd_LikeSearch(designCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     */
    public void setDesignCd_IsNull() { regDesignCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     */
    public void setDesignCd_IsNullOrEmpty() { regDesignCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(30)}
     */
    public void setDesignCd_IsNotNull() { regDesignCd(CK_ISNN, DOBJ); }

    protected void regDesignCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignCd(), "DESIGN_CD"); }
    protected abstract ConditionValue xgetCValueDesignCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_Equal(String invType) {
        doSetInvType_Equal(fRES(invType));
    }

    protected void doSetInvType_Equal(String invType) {
        regInvType(CK_EQ, invType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_NotEqual(String invType) {
        doSetInvType_NotEqual(fRES(invType));
    }

    protected void doSetInvType_NotEqual(String invType) {
        regInvType(CK_NES, invType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_GreaterThan(String invType) {
        regInvType(CK_GT, fRES(invType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_LessThan(String invType) {
        regInvType(CK_LT, fRES(invType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_GreaterEqual(String invType) {
        regInvType(CK_GE, fRES(invType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_LessEqual(String invType) {
        regInvType(CK_LE, fRES(invType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invTypeList The collection of invType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_InScope(Collection<String> invTypeList) {
        doSetInvType_InScope(invTypeList);
    }

    protected void doSetInvType_InScope(Collection<String> invTypeList) {
        regINS(CK_INS, cTL(invTypeList), xgetCValueInvType(), "INV_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invTypeList The collection of invType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_NotInScope(Collection<String> invTypeList) {
        doSetInvType_NotInScope(invTypeList);
    }

    protected void doSetInvType_NotInScope(Collection<String> invTypeList) {
        regINS(CK_NINS, cTL(invTypeList), xgetCValueInvType(), "INV_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)} <br>
     * <pre>e.g. setInvType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invType The value of invType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvType_LikeSearch(String invType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invType), xgetCValueInvType(), "INV_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvType_NotLikeSearch(String invType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invType), xgetCValueInvType(), "INV_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INV_TYPE: {NotNull, varchar(60)}
     * @param invType The value of invType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvType_PrefixSearch(String invType) {
        setInvType_LikeSearch(invType, xcLSOPPre());
    }

    protected void regInvType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvType(), "INV_TYPE"); }
    protected abstract ConditionValue xgetCValueInvType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_Equal(java.math.BigDecimal invNum) {
        doSetInvNum_Equal(invNum);
    }

    protected void doSetInvNum_Equal(java.math.BigDecimal invNum) {
        regInvNum(CK_EQ, invNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_NotEqual(java.math.BigDecimal invNum) {
        doSetInvNum_NotEqual(invNum);
    }

    protected void doSetInvNum_NotEqual(java.math.BigDecimal invNum) {
        regInvNum(CK_NES, invNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterThan(java.math.BigDecimal invNum) {
        regInvNum(CK_GT, invNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessThan(java.math.BigDecimal invNum) {
        regInvNum(CK_LT, invNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterEqual(java.math.BigDecimal invNum) {
        regInvNum(CK_GE, invNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNum The value of invNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessEqual(java.math.BigDecimal invNum) {
        regInvNum(CK_LE, invNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param minNumber The min number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvNum(), "INV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNumList The collection of invNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_InScope(Collection<java.math.BigDecimal> invNumList) {
        doSetInvNum_InScope(invNumList);
    }

    protected void doSetInvNum_InScope(Collection<java.math.BigDecimal> invNumList) {
        regINS(CK_INS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     * @param invNumList The collection of invNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotInScope(Collection<java.math.BigDecimal> invNumList) {
        doSetInvNum_NotInScope(invNumList);
    }

    protected void doSetInvNum_NotInScope(Collection<java.math.BigDecimal> invNumList) {
        regINS(CK_NINS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     */
    public void setInvNum_IsNull() { regInvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {decimal(16, 6)}
     */
    public void setInvNum_IsNotNull() { regInvNum(CK_ISNN, DOBJ); }

    protected void regInvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvNum(), "INV_NUM"); }
    protected abstract ConditionValue xgetCValueInvNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_Equal(String transportCd) {
        doSetTransportCd_Equal(fRES(transportCd));
    }

    protected void doSetTransportCd_Equal(String transportCd) {
        regTransportCd(CK_EQ, transportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_NotEqual(String transportCd) {
        doSetTransportCd_NotEqual(fRES(transportCd));
    }

    protected void doSetTransportCd_NotEqual(String transportCd) {
        regTransportCd(CK_NES, transportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterThan(String transportCd) {
        regTransportCd(CK_GT, fRES(transportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessThan(String transportCd) {
        regTransportCd(CK_LT, fRES(transportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_GreaterEqual(String transportCd) {
        regTransportCd(CK_GE, fRES(transportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_LessEqual(String transportCd) {
        regTransportCd(CK_LE, fRES(transportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCdList The collection of transportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_InScope(Collection<String> transportCdList) {
        doSetTransportCd_InScope(transportCdList);
    }

    protected void doSetTransportCd_InScope(Collection<String> transportCdList) {
        regINS(CK_INS, cTL(transportCdList), xgetCValueTransportCd(), "TRANSPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCdList The collection of transportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_NotInScope(Collection<String> transportCdList) {
        doSetTransportCd_NotInScope(transportCdList);
    }

    protected void doSetTransportCd_NotInScope(Collection<String> transportCdList) {
        regINS(CK_NINS, cTL(transportCdList), xgetCValueTransportCd(), "TRANSPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(30)} <br>
     * <pre>e.g. setTransportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportCd The value of transportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportCd_LikeSearch(String transportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportCd), xgetCValueTransportCd(), "TRANSPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportCd_NotLikeSearch(String transportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportCd), xgetCValueTransportCd(), "TRANSPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     * @param transportCd The value of transportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportCd_PrefixSearch(String transportCd) {
        setTransportCd_LikeSearch(transportCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     */
    public void setTransportCd_IsNull() { regTransportCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     */
    public void setTransportCd_IsNullOrEmpty() { regTransportCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORT_CD: {varchar(30)}
     */
    public void setTransportCd_IsNotNull() { regTransportCd(CK_ISNN, DOBJ); }

    protected void regTransportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportCd(), "TRANSPORT_CD"); }
    protected abstract ConditionValue xgetCValueTransportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_Equal(String firmtransportCd) {
        doSetFirmtransportCd_Equal(fRES(firmtransportCd));
    }

    protected void doSetFirmtransportCd_Equal(String firmtransportCd) {
        regFirmtransportCd(CK_EQ, firmtransportCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_NotEqual(String firmtransportCd) {
        doSetFirmtransportCd_NotEqual(fRES(firmtransportCd));
    }

    protected void doSetFirmtransportCd_NotEqual(String firmtransportCd) {
        regFirmtransportCd(CK_NES, firmtransportCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_GreaterThan(String firmtransportCd) {
        regFirmtransportCd(CK_GT, fRES(firmtransportCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_LessThan(String firmtransportCd) {
        regFirmtransportCd(CK_LT, fRES(firmtransportCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_GreaterEqual(String firmtransportCd) {
        regFirmtransportCd(CK_GE, fRES(firmtransportCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_LessEqual(String firmtransportCd) {
        regFirmtransportCd(CK_LE, fRES(firmtransportCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCdList The collection of firmtransportCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_InScope(Collection<String> firmtransportCdList) {
        doSetFirmtransportCd_InScope(firmtransportCdList);
    }

    protected void doSetFirmtransportCd_InScope(Collection<String> firmtransportCdList) {
        regINS(CK_INS, cTL(firmtransportCdList), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCdList The collection of firmtransportCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_NotInScope(Collection<String> firmtransportCdList) {
        doSetFirmtransportCd_NotInScope(firmtransportCdList);
    }

    protected void doSetFirmtransportCd_NotInScope(Collection<String> firmtransportCdList) {
        regINS(CK_NINS, cTL(firmtransportCdList), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)} <br>
     * <pre>e.g. setFirmtransportCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmtransportCd The value of firmtransportCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmtransportCd_LikeSearch(String firmtransportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmtransportCd), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmtransportCd_NotLikeSearch(String firmtransportCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmtransportCd), xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     * @param firmtransportCd The value of firmtransportCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportCd_PrefixSearch(String firmtransportCd) {
        setFirmtransportCd_LikeSearch(firmtransportCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNull() { regFirmtransportCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNullOrEmpty() { regFirmtransportCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_CD: {varchar(30)}
     */
    public void setFirmtransportCd_IsNotNull() { regFirmtransportCd(CK_ISNN, DOBJ); }

    protected void regFirmtransportCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmtransportCd(), "FIRMTRANSPORT_CD"); }
    protected abstract ConditionValue xgetCValueFirmtransportCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_Equal(String sourceCd) {
        doSetSourceCd_Equal(fRES(sourceCd));
    }

    protected void doSetSourceCd_Equal(String sourceCd) {
        regSourceCd(CK_EQ, sourceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotEqual(String sourceCd) {
        doSetSourceCd_NotEqual(fRES(sourceCd));
    }

    protected void doSetSourceCd_NotEqual(String sourceCd) {
        regSourceCd(CK_NES, sourceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterThan(String sourceCd) {
        regSourceCd(CK_GT, fRES(sourceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessThan(String sourceCd) {
        regSourceCd(CK_LT, fRES(sourceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_GreaterEqual(String sourceCd) {
        regSourceCd(CK_GE, fRES(sourceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_LessEqual(String sourceCd) {
        regSourceCd(CK_LE, fRES(sourceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCdList The collection of sourceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_InScope(Collection<String> sourceCdList) {
        doSetSourceCd_InScope(sourceCdList);
    }

    protected void doSetSourceCd_InScope(Collection<String> sourceCdList) {
        regINS(CK_INS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCdList The collection of sourceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_NotInScope(Collection<String> sourceCdList) {
        doSetSourceCd_NotInScope(sourceCdList);
    }

    protected void doSetSourceCd_NotInScope(Collection<String> sourceCdList) {
        regINS(CK_NINS, cTL(sourceCdList), xgetCValueSourceCd(), "SOURCE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)} <br>
     * <pre>e.g. setSourceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceCd The value of sourceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceCd_LikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceCd_NotLikeSearch(String sourceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceCd), xgetCValueSourceCd(), "SOURCE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     * @param sourceCd The value of sourceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceCd_PrefixSearch(String sourceCd) {
        setSourceCd_LikeSearch(sourceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNull() { regSourceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNullOrEmpty() { regSourceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_CD: {varchar(30)}
     */
    public void setSourceCd_IsNotNull() { regSourceCd(CK_ISNN, DOBJ); }

    protected void regSourceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCd(), "SOURCE_CD"); }
    protected abstract ConditionValue xgetCValueSourceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_Equal(String sourceName) {
        doSetSourceName_Equal(fRES(sourceName));
    }

    protected void doSetSourceName_Equal(String sourceName) {
        regSourceName(CK_EQ, sourceName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_NotEqual(String sourceName) {
        doSetSourceName_NotEqual(fRES(sourceName));
    }

    protected void doSetSourceName_NotEqual(String sourceName) {
        regSourceName(CK_NES, sourceName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_GreaterThan(String sourceName) {
        regSourceName(CK_GT, fRES(sourceName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_LessThan(String sourceName) {
        regSourceName(CK_LT, fRES(sourceName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_GreaterEqual(String sourceName) {
        regSourceName(CK_GE, fRES(sourceName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_LessEqual(String sourceName) {
        regSourceName(CK_LE, fRES(sourceName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceNameList The collection of sourceName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_InScope(Collection<String> sourceNameList) {
        doSetSourceName_InScope(sourceNameList);
    }

    protected void doSetSourceName_InScope(Collection<String> sourceNameList) {
        regINS(CK_INS, cTL(sourceNameList), xgetCValueSourceName(), "SOURCE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceNameList The collection of sourceName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_NotInScope(Collection<String> sourceNameList) {
        doSetSourceName_NotInScope(sourceNameList);
    }

    protected void doSetSourceName_NotInScope(Collection<String> sourceNameList) {
        regINS(CK_NINS, cTL(sourceNameList), xgetCValueSourceName(), "SOURCE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(100)} <br>
     * <pre>e.g. setSourceName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceName The value of sourceName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSourceName_LikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSourceName_NotLikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     * @param sourceName The value of sourceName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSourceName_PrefixSearch(String sourceName) {
        setSourceName_LikeSearch(sourceName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     */
    public void setSourceName_IsNull() { regSourceName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     */
    public void setSourceName_IsNullOrEmpty() { regSourceName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOURCE_NAME: {varchar(100)}
     */
    public void setSourceName_IsNotNull() { regSourceName(CK_ISNN, DOBJ); }

    protected void regSourceName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceName(), "SOURCE_NAME"); }
    protected abstract ConditionValue xgetCValueSourceName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_Equal(String schDate) {
        doSetSchDate_Equal(fRES(schDate));
    }

    protected void doSetSchDate_Equal(String schDate) {
        regSchDate(CK_EQ, schDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_NotEqual(String schDate) {
        doSetSchDate_NotEqual(fRES(schDate));
    }

    protected void doSetSchDate_NotEqual(String schDate) {
        regSchDate(CK_NES, schDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_GreaterThan(String schDate) {
        regSchDate(CK_GT, fRES(schDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_LessThan(String schDate) {
        regSchDate(CK_LT, fRES(schDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_GreaterEqual(String schDate) {
        regSchDate(CK_GE, fRES(schDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_LessEqual(String schDate) {
        regSchDate(CK_LE, fRES(schDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDateList The collection of schDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_InScope(Collection<String> schDateList) {
        doSetSchDate_InScope(schDateList);
    }

    protected void doSetSchDate_InScope(Collection<String> schDateList) {
        regINS(CK_INS, cTL(schDateList), xgetCValueSchDate(), "SCH_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDateList The collection of schDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_NotInScope(Collection<String> schDateList) {
        doSetSchDate_NotInScope(schDateList);
    }

    protected void doSetSchDate_NotInScope(Collection<String> schDateList) {
        regINS(CK_NINS, cTL(schDateList), xgetCValueSchDate(), "SCH_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {varchar(8)} <br>
     * <pre>e.g. setSchDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schDate The value of schDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchDate_LikeSearch(String schDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schDate), xgetCValueSchDate(), "SCH_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchDate_NotLikeSearch(String schDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schDate), xgetCValueSchDate(), "SCH_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCH_DATE: {varchar(8)}
     * @param schDate The value of schDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchDate_PrefixSearch(String schDate) {
        setSchDate_LikeSearch(schDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     */
    public void setSchDate_IsNull() { regSchDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     */
    public void setSchDate_IsNullOrEmpty() { regSchDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCH_DATE: {varchar(8)}
     */
    public void setSchDate_IsNotNull() { regSchDate(CK_ISNN, DOBJ); }

    protected void regSchDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchDate(), "SCH_DATE"); }
    protected abstract ConditionValue xgetCValueSchDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
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
     * RECEIVE_DATE: {varchar(8)}
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
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_GreaterThan(String receiveDate) {
        regReceiveDate(CK_GT, fRES(receiveDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_LessThan(String receiveDate) {
        regReceiveDate(CK_LT, fRES(receiveDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_GreaterEqual(String receiveDate) {
        regReceiveDate(CK_GE, fRES(receiveDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_LessEqual(String receiveDate) {
        regReceiveDate(CK_LE, fRES(receiveDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
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
     * RECEIVE_DATE: {varchar(8)}
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
     * RECEIVE_DATE: {varchar(8)} <br>
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
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveDate_NotLikeSearch(String receiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveDate), xgetCValueReceiveDate(), "RECEIVE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     * @param receiveDate The value of receiveDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDate_PrefixSearch(String receiveDate) {
        setReceiveDate_LikeSearch(receiveDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     */
    public void setReceiveDate_IsNull() { regReceiveDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     */
    public void setReceiveDate_IsNullOrEmpty() { regReceiveDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DATE: {varchar(8)}
     */
    public void setReceiveDate_IsNotNull() { regReceiveDate(CK_ISNN, DOBJ); }

    protected void regReceiveDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDate(), "RECEIVE_DATE"); }
    protected abstract ConditionValue xgetCValueReceiveDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_Equal(String schreceiveDate) {
        doSetSchreceiveDate_Equal(fRES(schreceiveDate));
    }

    protected void doSetSchreceiveDate_Equal(String schreceiveDate) {
        regSchreceiveDate(CK_EQ, schreceiveDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_NotEqual(String schreceiveDate) {
        doSetSchreceiveDate_NotEqual(fRES(schreceiveDate));
    }

    protected void doSetSchreceiveDate_NotEqual(String schreceiveDate) {
        regSchreceiveDate(CK_NES, schreceiveDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_GreaterThan(String schreceiveDate) {
        regSchreceiveDate(CK_GT, fRES(schreceiveDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_LessThan(String schreceiveDate) {
        regSchreceiveDate(CK_LT, fRES(schreceiveDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_GreaterEqual(String schreceiveDate) {
        regSchreceiveDate(CK_GE, fRES(schreceiveDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_LessEqual(String schreceiveDate) {
        regSchreceiveDate(CK_LE, fRES(schreceiveDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDateList The collection of schreceiveDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_InScope(Collection<String> schreceiveDateList) {
        doSetSchreceiveDate_InScope(schreceiveDateList);
    }

    protected void doSetSchreceiveDate_InScope(Collection<String> schreceiveDateList) {
        regINS(CK_INS, cTL(schreceiveDateList), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDateList The collection of schreceiveDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_NotInScope(Collection<String> schreceiveDateList) {
        doSetSchreceiveDate_NotInScope(schreceiveDateList);
    }

    protected void doSetSchreceiveDate_NotInScope(Collection<String> schreceiveDateList) {
        regINS(CK_NINS, cTL(schreceiveDateList), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)} <br>
     * <pre>e.g. setSchreceiveDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schreceiveDate The value of schreceiveDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchreceiveDate_LikeSearch(String schreceiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schreceiveDate), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchreceiveDate_NotLikeSearch(String schreceiveDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schreceiveDate), xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     * @param schreceiveDate The value of schreceiveDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveDate_PrefixSearch(String schreceiveDate) {
        setSchreceiveDate_LikeSearch(schreceiveDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     */
    public void setSchreceiveDate_IsNull() { regSchreceiveDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     */
    public void setSchreceiveDate_IsNullOrEmpty() { regSchreceiveDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_DATE: {varchar(8)}
     */
    public void setSchreceiveDate_IsNotNull() { regSchreceiveDate(CK_ISNN, DOBJ); }

    protected void regSchreceiveDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchreceiveDate(), "SCHRECEIVE_DATE"); }
    protected abstract ConditionValue xgetCValueSchreceiveDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_Equal(java.math.BigDecimal schreceiveNum) {
        doSetSchreceiveNum_Equal(schreceiveNum);
    }

    protected void doSetSchreceiveNum_Equal(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_EQ, schreceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_NotEqual(java.math.BigDecimal schreceiveNum) {
        doSetSchreceiveNum_NotEqual(schreceiveNum);
    }

    protected void doSetSchreceiveNum_NotEqual(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_NES, schreceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_GreaterThan(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_GT, schreceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_LessThan(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_LT, schreceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_GreaterEqual(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_GE, schreceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNum The value of schreceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchreceiveNum_LessEqual(java.math.BigDecimal schreceiveNum) {
        regSchreceiveNum(CK_LE, schreceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param minNumber The min number of schreceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of schreceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSchreceiveNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNumList The collection of schreceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_InScope(Collection<java.math.BigDecimal> schreceiveNumList) {
        doSetSchreceiveNum_InScope(schreceiveNumList);
    }

    protected void doSetSchreceiveNum_InScope(Collection<java.math.BigDecimal> schreceiveNumList) {
        regINS(CK_INS, cTL(schreceiveNumList), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     * @param schreceiveNumList The collection of schreceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchreceiveNum_NotInScope(Collection<java.math.BigDecimal> schreceiveNumList) {
        doSetSchreceiveNum_NotInScope(schreceiveNumList);
    }

    protected void doSetSchreceiveNum_NotInScope(Collection<java.math.BigDecimal> schreceiveNumList) {
        regINS(CK_NINS, cTL(schreceiveNumList), xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     */
    public void setSchreceiveNum_IsNull() { regSchreceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHRECEIVE_NUM: {decimal(16, 6)}
     */
    public void setSchreceiveNum_IsNotNull() { regSchreceiveNum(CK_ISNN, DOBJ); }

    protected void regSchreceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchreceiveNum(), "SCHRECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueSchreceiveNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_Equal(java.math.BigDecimal transportPriority) {
        doSetTransportPriority_Equal(transportPriority);
    }

    protected void doSetTransportPriority_Equal(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_EQ, transportPriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_NotEqual(java.math.BigDecimal transportPriority) {
        doSetTransportPriority_NotEqual(transportPriority);
    }

    protected void doSetTransportPriority_NotEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_NES, transportPriority);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterThan(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_GT, transportPriority);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_LessThan(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_LT, transportPriority);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_GreaterEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_GE, transportPriority);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriority The value of transportPriority as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportPriority_LessEqual(java.math.BigDecimal transportPriority) {
        regTransportPriority(CK_LE, transportPriority);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of transportPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transportPriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransportPriority_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransportPriority(), "TRANSPORT_PRIORITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriorityList The collection of transportPriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_InScope(Collection<java.math.BigDecimal> transportPriorityList) {
        doSetTransportPriority_InScope(transportPriorityList);
    }

    protected void doSetTransportPriority_InScope(Collection<java.math.BigDecimal> transportPriorityList) {
        regINS(CK_INS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORT_PRIORITY: {NotNull, decimal(16, 6)}
     * @param transportPriorityList The collection of transportPriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportPriority_NotInScope(Collection<java.math.BigDecimal> transportPriorityList) {
        doSetTransportPriority_NotInScope(transportPriorityList);
    }

    protected void doSetTransportPriority_NotInScope(Collection<java.math.BigDecimal> transportPriorityList) {
        regINS(CK_NINS, cTL(transportPriorityList), xgetCValueTransportPriority(), "TRANSPORT_PRIORITY");
    }

    protected void regTransportPriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportPriority(), "TRANSPORT_PRIORITY"); }
    protected abstract ConditionValue xgetCValueTransportPriority();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_Equal(java.math.BigDecimal itemSort) {
        doSetItemSort_Equal(itemSort);
    }

    protected void doSetItemSort_Equal(java.math.BigDecimal itemSort) {
        regItemSort(CK_EQ, itemSort);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_NotEqual(java.math.BigDecimal itemSort) {
        doSetItemSort_NotEqual(itemSort);
    }

    protected void doSetItemSort_NotEqual(java.math.BigDecimal itemSort) {
        regItemSort(CK_NES, itemSort);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_GreaterThan(java.math.BigDecimal itemSort) {
        regItemSort(CK_GT, itemSort);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_LessThan(java.math.BigDecimal itemSort) {
        regItemSort(CK_LT, itemSort);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_GreaterEqual(java.math.BigDecimal itemSort) {
        regItemSort(CK_GE, itemSort);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSort The value of itemSort as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemSort_LessEqual(java.math.BigDecimal itemSort) {
        regItemSort(CK_LE, itemSort);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of itemSort. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemSort. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemSort_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemSort(), "ITEM_SORT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSortList The collection of itemSort as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSort_InScope(Collection<java.math.BigDecimal> itemSortList) {
        doSetItemSort_InScope(itemSortList);
    }

    protected void doSetItemSort_InScope(Collection<java.math.BigDecimal> itemSortList) {
        regINS(CK_INS, cTL(itemSortList), xgetCValueItemSort(), "ITEM_SORT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_SORT: {NotNull, decimal(16, 6)}
     * @param itemSortList The collection of itemSort as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSort_NotInScope(Collection<java.math.BigDecimal> itemSortList) {
        doSetItemSort_NotInScope(itemSortList);
    }

    protected void doSetItemSort_NotInScope(Collection<java.math.BigDecimal> itemSortList) {
        regINS(CK_NINS, cTL(itemSortList), xgetCValueItemSort(), "ITEM_SORT");
    }

    protected void regItemSort(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSort(), "ITEM_SORT"); }
    protected abstract ConditionValue xgetCValueItemSort();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_Equal(java.math.BigDecimal useType) {
        doSetUseType_Equal(useType);
    }

    protected void doSetUseType_Equal(java.math.BigDecimal useType) {
        regUseType(CK_EQ, useType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_NotEqual(java.math.BigDecimal useType) {
        doSetUseType_NotEqual(useType);
    }

    protected void doSetUseType_NotEqual(java.math.BigDecimal useType) {
        regUseType(CK_NES, useType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_GreaterThan(java.math.BigDecimal useType) {
        regUseType(CK_GT, useType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_LessThan(java.math.BigDecimal useType) {
        regUseType(CK_LT, useType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_GreaterEqual(java.math.BigDecimal useType) {
        regUseType(CK_GE, useType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useType The value of useType as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUseType_LessEqual(java.math.BigDecimal useType) {
        regUseType(CK_LE, useType);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of useType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of useType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUseType_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUseType(), "USE_TYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useTypeList The collection of useType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseType_InScope(Collection<java.math.BigDecimal> useTypeList) {
        doSetUseType_InScope(useTypeList);
    }

    protected void doSetUseType_InScope(Collection<java.math.BigDecimal> useTypeList) {
        regINS(CK_INS, cTL(useTypeList), xgetCValueUseType(), "USE_TYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USE_TYPE: {NotNull, decimal(16, 6)}
     * @param useTypeList The collection of useType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseType_NotInScope(Collection<java.math.BigDecimal> useTypeList) {
        doSetUseType_NotInScope(useTypeList);
    }

    protected void doSetUseType_NotInScope(Collection<java.math.BigDecimal> useTypeList) {
        regINS(CK_NINS, cTL(useTypeList), xgetCValueUseType(), "USE_TYPE");
    }

    protected void regUseType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseType(), "USE_TYPE"); }
    protected abstract ConditionValue xgetCValueUseType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)}
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
     * SEND_CD: {varchar(30)} <br>
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
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNull() { regSendCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNullOrEmpty() { regSendCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNotNull() { regSendCd(CK_ISNN, DOBJ); }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_Equal(String sendFlg) {
        doSetSendFlg_Equal(fRES(sendFlg));
    }

    protected void doSetSendFlg_Equal(String sendFlg) {
        regSendFlg(CK_EQ, sendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotEqual(String sendFlg) {
        doSetSendFlg_NotEqual(fRES(sendFlg));
    }

    protected void doSetSendFlg_NotEqual(String sendFlg) {
        regSendFlg(CK_NES, sendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterThan(String sendFlg) {
        regSendFlg(CK_GT, fRES(sendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessThan(String sendFlg) {
        regSendFlg(CK_LT, fRES(sendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterEqual(String sendFlg) {
        regSendFlg(CK_GE, fRES(sendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessEqual(String sendFlg) {
        regSendFlg(CK_LE, fRES(sendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlgList The collection of sendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_InScope(Collection<String> sendFlgList) {
        doSetSendFlg_InScope(sendFlgList);
    }

    protected void doSetSendFlg_InScope(Collection<String> sendFlgList) {
        regINS(CK_INS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlgList The collection of sendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotInScope(Collection<String> sendFlgList) {
        doSetSendFlg_NotInScope(sendFlgList);
    }

    protected void doSetSendFlg_NotInScope(Collection<String> sendFlgList) {
        regINS(CK_NINS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {char(1)} <br>
     * <pre>e.g. setSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendFlg The value of sendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendFlg_LikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendFlg_NotLikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {char(1)}
     * @param sendFlg The value of sendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_PrefixSearch(String sendFlg) {
        setSendFlg_LikeSearch(sendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     */
    public void setSendFlg_IsNull() { regSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_FLG: {char(1)}
     */
    public void setSendFlg_IsNotNull() { regSendFlg(CK_ISNN, DOBJ); }

    protected void regSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendFlg(), "SEND_FLG"); }
    protected abstract ConditionValue xgetCValueSendFlg();

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
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ECenterStockInfoSendCB.class);
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
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ECenterStockInfoSendCB.class);
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
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ECenterStockInfoSendCB.class);
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
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ECenterStockInfoSendCB.class);
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
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ECenterStockInfoSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ECenterStockInfoSendCB&gt;() {
     *     public void query(ECenterStockInfoSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ECenterStockInfoSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ECenterStockInfoSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ECenterStockInfoSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ECenterStockInfoSendCQ sq);

    protected ECenterStockInfoSendCB xcreateScalarConditionCB() {
        ECenterStockInfoSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ECenterStockInfoSendCB xcreateScalarConditionPartitionByCB() {
        ECenterStockInfoSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ECenterStockInfoSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECenterStockInfoSendCB cb = new ECenterStockInfoSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_STOCK_INFO_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ECenterStockInfoSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ECenterStockInfoSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ECenterStockInfoSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ECenterStockInfoSendCB cb = new ECenterStockInfoSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_STOCK_INFO_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ECenterStockInfoSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ECenterStockInfoSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ECenterStockInfoSendCB cb = new ECenterStockInfoSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ECenterStockInfoSendCQ sq);

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
    protected ECenterStockInfoSendCB newMyCB() {
        return new ECenterStockInfoSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ECenterStockInfoSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
