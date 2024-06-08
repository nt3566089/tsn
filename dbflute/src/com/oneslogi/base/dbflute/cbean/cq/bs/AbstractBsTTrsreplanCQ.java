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
 * The abstract condition-query of T_TRSREPLAN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsreplanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsreplanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSREPLAN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_Equal(Long trsreplanId) {
        doSetTrsreplanId_Equal(trsreplanId);
    }

    protected void doSetTrsreplanId_Equal(Long trsreplanId) {
        regTrsreplanId(CK_EQ, trsreplanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_NotEqual(Long trsreplanId) {
        doSetTrsreplanId_NotEqual(trsreplanId);
    }

    protected void doSetTrsreplanId_NotEqual(Long trsreplanId) {
        regTrsreplanId(CK_NES, trsreplanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_GreaterThan(Long trsreplanId) {
        regTrsreplanId(CK_GT, trsreplanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_LessThan(Long trsreplanId) {
        regTrsreplanId(CK_LT, trsreplanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_GreaterEqual(Long trsreplanId) {
        regTrsreplanId(CK_GE, trsreplanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanId The value of trsreplanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsreplanId_LessEqual(Long trsreplanId) {
        regTrsreplanId(CK_LE, trsreplanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsreplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsreplanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsreplanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsreplanId(), "TRSREPLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanIdList The collection of trsreplanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplanId_InScope(Collection<Long> trsreplanIdList) {
        doSetTrsreplanId_InScope(trsreplanIdList);
    }

    protected void doSetTrsreplanId_InScope(Collection<Long> trsreplanIdList) {
        regINS(CK_INS, cTL(trsreplanIdList), xgetCValueTrsreplanId(), "TRSREPLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trsreplanIdList The collection of trsreplanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsreplanId_NotInScope(Collection<Long> trsreplanIdList) {
        doSetTrsreplanId_NotInScope(trsreplanIdList);
    }

    protected void doSetTrsreplanId_NotInScope(Collection<Long> trsreplanIdList) {
        regINS(CK_NINS, cTL(trsreplanIdList), xgetCValueTrsreplanId(), "TRSREPLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsreplanId_IsNull() { regTrsreplanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrsreplanId_IsNotNull() { regTrsreplanId(CK_ISNN, DOBJ); }

    protected void regTrsreplanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsreplanId(), "TRSREPLAN_ID"); }
    protected abstract ConditionValue xgetCValueTrsreplanId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_Equal(java.math.BigDecimal prekey) {
        doSetPrekey_Equal(prekey);
    }

    protected void doSetPrekey_Equal(java.math.BigDecimal prekey) {
        regPrekey(CK_EQ, prekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_NotEqual(java.math.BigDecimal prekey) {
        doSetPrekey_NotEqual(prekey);
    }

    protected void doSetPrekey_NotEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_NES, prekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_GreaterThan(java.math.BigDecimal prekey) {
        regPrekey(CK_GT, prekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_LessThan(java.math.BigDecimal prekey) {
        regPrekey(CK_LT, prekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_GreaterEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_GE, prekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekey The value of prekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_LessEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_LE, prekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param minNumber The min number of prekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrekey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrekey(), "PREKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekeyList The collection of prekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrekey_InScope(Collection<java.math.BigDecimal> prekeyList) {
        doSetPrekey_InScope(prekeyList);
    }

    protected void doSetPrekey_InScope(Collection<java.math.BigDecimal> prekeyList) {
        regINS(CK_INS, cTL(prekeyList), xgetCValuePrekey(), "PREKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     * @param prekeyList The collection of prekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrekey_NotInScope(Collection<java.math.BigDecimal> prekeyList) {
        doSetPrekey_NotInScope(prekeyList);
    }

    protected void doSetPrekey_NotInScope(Collection<java.math.BigDecimal> prekeyList) {
        regINS(CK_NINS, cTL(prekeyList), xgetCValuePrekey(), "PREKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     */
    public void setPrekey_IsNull() { regPrekey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PREKEY: {decimal(16, 6)}
     */
    public void setPrekey_IsNotNull() { regPrekey(CK_ISNN, DOBJ); }

    protected void regPrekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrekey(), "PREKEY"); }
    protected abstract ConditionValue xgetCValuePrekey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_Equal(java.math.BigDecimal templateflg) {
        doSetTemplateflg_Equal(templateflg);
    }

    protected void doSetTemplateflg_Equal(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_EQ, templateflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_NotEqual(java.math.BigDecimal templateflg) {
        doSetTemplateflg_NotEqual(templateflg);
    }

    protected void doSetTemplateflg_NotEqual(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_NES, templateflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_GreaterThan(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_GT, templateflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_LessThan(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_LT, templateflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_GreaterEqual(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_GE, templateflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflg The value of templateflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTemplateflg_LessEqual(java.math.BigDecimal templateflg) {
        regTemplateflg(CK_LE, templateflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of templateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of templateflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTemplateflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTemplateflg(), "TEMPLATEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflgList The collection of templateflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemplateflg_InScope(Collection<java.math.BigDecimal> templateflgList) {
        doSetTemplateflg_InScope(templateflgList);
    }

    protected void doSetTemplateflg_InScope(Collection<java.math.BigDecimal> templateflgList) {
        regINS(CK_INS, cTL(templateflgList), xgetCValueTemplateflg(), "TEMPLATEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param templateflgList The collection of templateflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTemplateflg_NotInScope(Collection<java.math.BigDecimal> templateflgList) {
        doSetTemplateflg_NotInScope(templateflgList);
    }

    protected void doSetTemplateflg_NotInScope(Collection<java.math.BigDecimal> templateflgList) {
        regINS(CK_NINS, cTL(templateflgList), xgetCValueTemplateflg(), "TEMPLATEFLG");
    }

    protected void regTemplateflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTemplateflg(), "TEMPLATEFLG"); }
    protected abstract ConditionValue xgetCValueTemplateflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_Equal(java.math.BigDecimal rcvinspectflg) {
        doSetRcvinspectflg_Equal(rcvinspectflg);
    }

    protected void doSetRcvinspectflg_Equal(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_EQ, rcvinspectflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_NotEqual(java.math.BigDecimal rcvinspectflg) {
        doSetRcvinspectflg_NotEqual(rcvinspectflg);
    }

    protected void doSetRcvinspectflg_NotEqual(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_NES, rcvinspectflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_GreaterThan(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_GT, rcvinspectflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_LessThan(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_LT, rcvinspectflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_GreaterEqual(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_GE, rcvinspectflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflg The value of rcvinspectflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvinspectflg_LessEqual(java.math.BigDecimal rcvinspectflg) {
        regRcvinspectflg(CK_LE, rcvinspectflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of rcvinspectflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvinspectflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvinspectflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvinspectflg(), "RCVINSPECTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflgList The collection of rcvinspectflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvinspectflg_InScope(Collection<java.math.BigDecimal> rcvinspectflgList) {
        doSetRcvinspectflg_InScope(rcvinspectflgList);
    }

    protected void doSetRcvinspectflg_InScope(Collection<java.math.BigDecimal> rcvinspectflgList) {
        regINS(CK_INS, cTL(rcvinspectflgList), xgetCValueRcvinspectflg(), "RCVINSPECTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param rcvinspectflgList The collection of rcvinspectflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvinspectflg_NotInScope(Collection<java.math.BigDecimal> rcvinspectflgList) {
        doSetRcvinspectflg_NotInScope(rcvinspectflgList);
    }

    protected void doSetRcvinspectflg_NotInScope(Collection<java.math.BigDecimal> rcvinspectflgList) {
        regINS(CK_NINS, cTL(rcvinspectflgList), xgetCValueRcvinspectflg(), "RCVINSPECTFLG");
    }

    protected void regRcvinspectflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvinspectflg(), "RCVINSPECTFLG"); }
    protected abstract ConditionValue xgetCValueRcvinspectflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_Equal(String rmano) {
        doSetRmano_Equal(fRES(rmano));
    }

    protected void doSetRmano_Equal(String rmano) {
        regRmano(CK_EQ, rmano);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotEqual(String rmano) {
        doSetRmano_NotEqual(fRES(rmano));
    }

    protected void doSetRmano_NotEqual(String rmano) {
        regRmano(CK_NES, rmano);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmanoList The collection of rmano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_InScope(Collection<String> rmanoList) {
        doSetRmano_InScope(rmanoList);
    }

    protected void doSetRmano_InScope(Collection<String> rmanoList) {
        regINS(CK_INS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmanoList The collection of rmano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotInScope(Collection<String> rmanoList) {
        doSetRmano_NotInScope(rmanoList);
    }

    protected void doSetRmano_NotInScope(Collection<String> rmanoList) {
        regINS(CK_NINS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)} <br>
     * <pre>e.g. setRmano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmano The value of rmano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmano_LikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNull() { regRmano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNullOrEmpty() { regRmano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNotNull() { regRmano(CK_ISNN, DOBJ); }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RMANO"); }
    protected abstract ConditionValue xgetCValueRmano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_Equal(String rcvtype) {
        doSetRcvtype_Equal(fRES(rcvtype));
    }

    protected void doSetRcvtype_Equal(String rcvtype) {
        regRcvtype(CK_EQ, rcvtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_NotEqual(String rcvtype) {
        doSetRcvtype_NotEqual(fRES(rcvtype));
    }

    protected void doSetRcvtype_NotEqual(String rcvtype) {
        regRcvtype(CK_NES, rcvtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_GreaterThan(String rcvtype) {
        regRcvtype(CK_GT, fRES(rcvtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_LessThan(String rcvtype) {
        regRcvtype(CK_LT, fRES(rcvtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_GreaterEqual(String rcvtype) {
        regRcvtype(CK_GE, fRES(rcvtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_LessEqual(String rcvtype) {
        regRcvtype(CK_LE, fRES(rcvtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtypeList The collection of rcvtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_InScope(Collection<String> rcvtypeList) {
        doSetRcvtype_InScope(rcvtypeList);
    }

    protected void doSetRcvtype_InScope(Collection<String> rcvtypeList) {
        regINS(CK_INS, cTL(rcvtypeList), xgetCValueRcvtype(), "RCVTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtypeList The collection of rcvtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_NotInScope(Collection<String> rcvtypeList) {
        doSetRcvtype_NotInScope(rcvtypeList);
    }

    protected void doSetRcvtype_NotInScope(Collection<String> rcvtypeList) {
        regINS(CK_NINS, cTL(rcvtypeList), xgetCValueRcvtype(), "RCVTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVTYPE: {varchar(30)} <br>
     * <pre>e.g. setRcvtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvtype The value of rcvtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvtype_LikeSearch(String rcvtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvtype), xgetCValueRcvtype(), "RCVTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvtype_NotLikeSearch(String rcvtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvtype), xgetCValueRcvtype(), "RCVTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVTYPE: {varchar(30)}
     * @param rcvtype The value of rcvtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvtype_PrefixSearch(String rcvtype) {
        setRcvtype_LikeSearch(rcvtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     */
    public void setRcvtype_IsNull() { regRcvtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     */
    public void setRcvtype_IsNullOrEmpty() { regRcvtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVTYPE: {varchar(30)}
     */
    public void setRcvtype_IsNotNull() { regRcvtype(CK_ISNN, DOBJ); }

    protected void regRcvtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvtype(), "RCVTYPE"); }
    protected abstract ConditionValue xgetCValueRcvtype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_Equal(java.math.BigDecimal partflg) {
        doSetPartflg_Equal(partflg);
    }

    protected void doSetPartflg_Equal(java.math.BigDecimal partflg) {
        regPartflg(CK_EQ, partflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_NotEqual(java.math.BigDecimal partflg) {
        doSetPartflg_NotEqual(partflg);
    }

    protected void doSetPartflg_NotEqual(java.math.BigDecimal partflg) {
        regPartflg(CK_NES, partflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_GreaterThan(java.math.BigDecimal partflg) {
        regPartflg(CK_GT, partflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_LessThan(java.math.BigDecimal partflg) {
        regPartflg(CK_LT, partflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_GreaterEqual(java.math.BigDecimal partflg) {
        regPartflg(CK_GE, partflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflg The value of partflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartflg_LessEqual(java.math.BigDecimal partflg) {
        regPartflg(CK_LE, partflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of partflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of partflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPartflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePartflg(), "PARTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflgList The collection of partflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_InScope(Collection<java.math.BigDecimal> partflgList) {
        doSetPartflg_InScope(partflgList);
    }

    protected void doSetPartflg_InScope(Collection<java.math.BigDecimal> partflgList) {
        regINS(CK_INS, cTL(partflgList), xgetCValuePartflg(), "PARTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param partflgList The collection of partflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_NotInScope(Collection<java.math.BigDecimal> partflgList) {
        doSetPartflg_NotInScope(partflgList);
    }

    protected void doSetPartflg_NotInScope(Collection<java.math.BigDecimal> partflgList) {
        regINS(CK_NINS, cTL(partflgList), xgetCValuePartflg(), "PARTFLG");
    }

    protected void regPartflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartflg(), "PARTFLG"); }
    protected abstract ConditionValue xgetCValuePartflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_Equal(java.math.BigDecimal actflg) {
        doSetActflg_Equal(actflg);
    }

    protected void doSetActflg_Equal(java.math.BigDecimal actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(java.math.BigDecimal actflg) {
        doSetActflg_NotEqual(actflg);
    }

    protected void doSetActflg_NotEqual(java.math.BigDecimal actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6)}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_Equal(Long sts) {
        doSetSts_Equal(sts);
    }

    protected void doSetSts_Equal(Long sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_NotEqual(Long sts) {
        doSetSts_NotEqual(sts);
    }

    protected void doSetSts_NotEqual(Long sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(Long sts) {
        regSts(CK_GT, sts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessThan(Long sts) {
        regSts(CK_LT, sts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(Long sts) {
        regSts(CK_GE, sts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param sts The value of sts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessEqual(Long sts) {
        regSts(CK_LE, sts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSts(), "STS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<Long> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<Long> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {NotNull, bigint(19), default=[(0)]}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<Long> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<Long> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_Equal(java.math.BigDecimal priorities) {
        doSetPriorities_Equal(priorities);
    }

    protected void doSetPriorities_Equal(java.math.BigDecimal priorities) {
        regPriorities(CK_EQ, priorities);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_NotEqual(java.math.BigDecimal priorities) {
        doSetPriorities_NotEqual(priorities);
    }

    protected void doSetPriorities_NotEqual(java.math.BigDecimal priorities) {
        regPriorities(CK_NES, priorities);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_GreaterThan(java.math.BigDecimal priorities) {
        regPriorities(CK_GT, priorities);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_LessThan(java.math.BigDecimal priorities) {
        regPriorities(CK_LT, priorities);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_GreaterEqual(java.math.BigDecimal priorities) {
        regPriorities(CK_GE, priorities);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param priorities The value of priorities as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_LessEqual(java.math.BigDecimal priorities) {
        regPriorities(CK_LE, priorities);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param minNumber The min number of priorities. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priorities. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriorities_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriorities(), "PRIORITIES", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param prioritiesList The collection of priorities as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorities_InScope(Collection<java.math.BigDecimal> prioritiesList) {
        doSetPriorities_InScope(prioritiesList);
    }

    protected void doSetPriorities_InScope(Collection<java.math.BigDecimal> prioritiesList) {
        regINS(CK_INS, cTL(prioritiesList), xgetCValuePriorities(), "PRIORITIES");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     * @param prioritiesList The collection of priorities as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorities_NotInScope(Collection<java.math.BigDecimal> prioritiesList) {
        doSetPriorities_NotInScope(prioritiesList);
    }

    protected void doSetPriorities_NotInScope(Collection<java.math.BigDecimal> prioritiesList) {
        regINS(CK_NINS, cTL(prioritiesList), xgetCValuePriorities(), "PRIORITIES");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     */
    public void setPriorities_IsNull() { regPriorities(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRIORITIES: {decimal(16, 6)}
     */
    public void setPriorities_IsNotNull() { regPriorities(CK_ISNN, DOBJ); }

    protected void regPriorities(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriorities(), "PRIORITIES"); }
    protected abstract ConditionValue xgetCValuePriorities();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_Equal(String companycd) {
        doSetCompanycd_Equal(fRES(companycd));
    }

    protected void doSetCompanycd_Equal(String companycd) {
        regCompanycd(CK_EQ, companycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotEqual(String companycd) {
        doSetCompanycd_NotEqual(fRES(companycd));
    }

    protected void doSetCompanycd_NotEqual(String companycd) {
        regCompanycd(CK_NES, companycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycdList The collection of companycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_InScope(Collection<String> companycdList) {
        doSetCompanycd_InScope(companycdList);
    }

    protected void doSetCompanycd_InScope(Collection<String> companycdList) {
        regINS(CK_INS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycdList The collection of companycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotInScope(Collection<String> companycdList) {
        doSetCompanycd_NotInScope(companycdList);
    }

    protected void doSetCompanycd_NotInScope(Collection<String> companycdList) {
        regINS(CK_NINS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companycd The value of companycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanycd_LikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {NotNull, varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_Equal(String rcvschdate) {
        doSetRcvschdate_Equal(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_Equal(String rcvschdate) {
        regRcvschdate(CK_EQ, rcvschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotEqual(String rcvschdate) {
        doSetRcvschdate_NotEqual(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_NotEqual(String rcvschdate) {
        regRcvschdate(CK_NES, rcvschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterThan(String rcvschdate) {
        regRcvschdate(CK_GT, fRES(rcvschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessThan(String rcvschdate) {
        regRcvschdate(CK_LT, fRES(rcvschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterEqual(String rcvschdate) {
        regRcvschdate(CK_GE, fRES(rcvschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessEqual(String rcvschdate) {
        regRcvschdate(CK_LE, fRES(rcvschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_InScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_InScope(rcvschdateList);
    }

    protected void doSetRcvschdate_InScope(Collection<String> rcvschdateList) {
        regINS(CK_INS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_NotInScope(rcvschdateList);
    }

    protected void doSetRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        regINS(CK_NINS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setRcvschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvschdate The value of rcvschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvschdate_LikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvschdate_NotLikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     * @param rcvschdate The value of rcvschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_PrefixSearch(String rcvschdate) {
        setRcvschdate_LikeSearch(rcvschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNull() { regRcvschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNullOrEmpty() { regRcvschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVSCHDATE: {varchar(8)}
     */
    public void setRcvschdate_IsNotNull() { regRcvschdate(CK_ISNN, DOBJ); }

    protected void regRcvschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvschdate(), "RCVSCHDATE"); }
    protected abstract ConditionValue xgetCValueRcvschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_Equal(String receivedate) {
        doSetReceivedate_Equal(fRES(receivedate));
    }

    protected void doSetReceivedate_Equal(String receivedate) {
        regReceivedate(CK_EQ, receivedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotEqual(String receivedate) {
        doSetReceivedate_NotEqual(fRES(receivedate));
    }

    protected void doSetReceivedate_NotEqual(String receivedate) {
        regReceivedate(CK_NES, receivedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "RECEIVEDATE"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_Equal(String logisticscd) {
        doSetLogisticscd_Equal(fRES(logisticscd));
    }

    protected void doSetLogisticscd_Equal(String logisticscd) {
        regLogisticscd(CK_EQ, logisticscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotEqual(String logisticscd) {
        doSetLogisticscd_NotEqual(fRES(logisticscd));
    }

    protected void doSetLogisticscd_NotEqual(String logisticscd) {
        regLogisticscd(CK_NES, logisticscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterThan(String logisticscd) {
        regLogisticscd(CK_GT, fRES(logisticscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessThan(String logisticscd) {
        regLogisticscd(CK_LT, fRES(logisticscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterEqual(String logisticscd) {
        regLogisticscd(CK_GE, fRES(logisticscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessEqual(String logisticscd) {
        regLogisticscd(CK_LE, fRES(logisticscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscdList The collection of logisticscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_InScope(Collection<String> logisticscdList) {
        doSetLogisticscd_InScope(logisticscdList);
    }

    protected void doSetLogisticscd_InScope(Collection<String> logisticscdList) {
        regINS(CK_INS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscdList The collection of logisticscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotInScope(Collection<String> logisticscdList) {
        doSetLogisticscd_NotInScope(logisticscdList);
    }

    protected void doSetLogisticscd_NotInScope(Collection<String> logisticscdList) {
        regINS(CK_NINS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLogisticscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logisticscd The value of logisticscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogisticscd_LikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogisticscd_NotLikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_PrefixSearch(String logisticscd) {
        setLogisticscd_LikeSearch(logisticscd, xcLSOPPre());
    }

    protected void regLogisticscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogisticscd(), "LOGISTICSCD"); }
    protected abstract ConditionValue xgetCValueLogisticscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNull() { regSuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNullOrEmpty() { regSuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNotNull() { regSuppliercd(CK_ISNN, DOBJ); }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_Equal(String suppliername) {
        doSetSuppliername_Equal(fRES(suppliername));
    }

    protected void doSetSuppliername_Equal(String suppliername) {
        regSuppliername(CK_EQ, suppliername);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_NotEqual(String suppliername) {
        doSetSuppliername_NotEqual(fRES(suppliername));
    }

    protected void doSetSuppliername_NotEqual(String suppliername) {
        regSuppliername(CK_NES, suppliername);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_GreaterThan(String suppliername) {
        regSuppliername(CK_GT, fRES(suppliername));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_LessThan(String suppliername) {
        regSuppliername(CK_LT, fRES(suppliername));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_GreaterEqual(String suppliername) {
        regSuppliername(CK_GE, fRES(suppliername));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_LessEqual(String suppliername) {
        regSuppliername(CK_LE, fRES(suppliername));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliernameList The collection of suppliername as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_InScope(Collection<String> suppliernameList) {
        doSetSuppliername_InScope(suppliernameList);
    }

    protected void doSetSuppliername_InScope(Collection<String> suppliernameList) {
        regINS(CK_INS, cTL(suppliernameList), xgetCValueSuppliername(), "SUPPLIERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliernameList The collection of suppliername as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_NotInScope(Collection<String> suppliernameList) {
        doSetSuppliername_NotInScope(suppliernameList);
    }

    protected void doSetSuppliername_NotInScope(Collection<String> suppliernameList) {
        regINS(CK_NINS, cTL(suppliernameList), xgetCValueSuppliername(), "SUPPLIERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)} <br>
     * <pre>e.g. setSuppliername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliername The value of suppliername as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliername_LikeSearch(String suppliername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliername), xgetCValueSuppliername(), "SUPPLIERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliername_NotLikeSearch(String suppliername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliername), xgetCValueSuppliername(), "SUPPLIERNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_PrefixSearch(String suppliername) {
        setSuppliername_LikeSearch(suppliername, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNull() { regSuppliername(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNullOrEmpty() { regSuppliername(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNotNull() { regSuppliername(CK_ISNN, DOBJ); }

    protected void regSuppliername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliername(), "SUPPLIERNAME"); }
    protected abstract ConditionValue xgetCValueSuppliername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_Equal(String postno) {
        doSetPostno_Equal(fRES(postno));
    }

    protected void doSetPostno_Equal(String postno) {
        regPostno(CK_EQ, postno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotEqual(String postno) {
        doSetPostno_NotEqual(fRES(postno));
    }

    protected void doSetPostno_NotEqual(String postno) {
        regPostno(CK_NES, postno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterThan(String postno) {
        regPostno(CK_GT, fRES(postno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessThan(String postno) {
        regPostno(CK_LT, fRES(postno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterEqual(String postno) {
        regPostno(CK_GE, fRES(postno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessEqual(String postno) {
        regPostno(CK_LE, fRES(postno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postnoList The collection of postno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_InScope(Collection<String> postnoList) {
        doSetPostno_InScope(postnoList);
    }

    protected void doSetPostno_InScope(Collection<String> postnoList) {
        regINS(CK_INS, cTL(postnoList), xgetCValuePostno(), "POSTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postnoList The collection of postno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotInScope(Collection<String> postnoList) {
        doSetPostno_NotInScope(postnoList);
    }

    protected void doSetPostno_NotInScope(Collection<String> postnoList) {
        regINS(CK_NINS, cTL(postnoList), xgetCValuePostno(), "POSTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {varchar(30)} <br>
     * <pre>e.g. setPostno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postno The value of postno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPostno_LikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postno), xgetCValuePostno(), "POSTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPostno_NotLikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postno), xgetCValuePostno(), "POSTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {varchar(30)}
     * @param postno The value of postno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_PrefixSearch(String postno) {
        setPostno_LikeSearch(postno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     */
    public void setPostno_IsNull() { regPostno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     */
    public void setPostno_IsNullOrEmpty() { regPostno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POSTNO: {varchar(30)}
     */
    public void setPostno_IsNotNull() { regPostno(CK_ISNN, DOBJ); }

    protected void regPostno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostno(), "POSTNO"); }
    protected abstract ConditionValue xgetCValuePostno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_Equal(String countrycd) {
        doSetCountrycd_Equal(fRES(countrycd));
    }

    protected void doSetCountrycd_Equal(String countrycd) {
        regCountrycd(CK_EQ, countrycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotEqual(String countrycd) {
        doSetCountrycd_NotEqual(fRES(countrycd));
    }

    protected void doSetCountrycd_NotEqual(String countrycd) {
        regCountrycd(CK_NES, countrycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterThan(String countrycd) {
        regCountrycd(CK_GT, fRES(countrycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessThan(String countrycd) {
        regCountrycd(CK_LT, fRES(countrycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterEqual(String countrycd) {
        regCountrycd(CK_GE, fRES(countrycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessEqual(String countrycd) {
        regCountrycd(CK_LE, fRES(countrycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycdList The collection of countrycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_InScope(Collection<String> countrycdList) {
        doSetCountrycd_InScope(countrycdList);
    }

    protected void doSetCountrycd_InScope(Collection<String> countrycdList) {
        regINS(CK_INS, cTL(countrycdList), xgetCValueCountrycd(), "COUNTRYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycdList The collection of countrycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotInScope(Collection<String> countrycdList) {
        doSetCountrycd_NotInScope(countrycdList);
    }

    protected void doSetCountrycd_NotInScope(Collection<String> countrycdList) {
        regINS(CK_NINS, cTL(countrycdList), xgetCValueCountrycd(), "COUNTRYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)} <br>
     * <pre>e.g. setCountrycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countrycd The value of countrycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCountrycd_LikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countrycd), xgetCValueCountrycd(), "COUNTRYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCountrycd_NotLikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countrycd), xgetCValueCountrycd(), "COUNTRYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_PrefixSearch(String countrycd) {
        setCountrycd_LikeSearch(countrycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNull() { regCountrycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNullOrEmpty() { regCountrycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNotNull() { regCountrycd(CK_ISNN, DOBJ); }

    protected void regCountrycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountrycd(), "COUNTRYCD"); }
    protected abstract ConditionValue xgetCValueCountrycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_Equal(String portcd) {
        doSetPortcd_Equal(fRES(portcd));
    }

    protected void doSetPortcd_Equal(String portcd) {
        regPortcd(CK_EQ, portcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotEqual(String portcd) {
        doSetPortcd_NotEqual(fRES(portcd));
    }

    protected void doSetPortcd_NotEqual(String portcd) {
        regPortcd(CK_NES, portcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterThan(String portcd) {
        regPortcd(CK_GT, fRES(portcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessThan(String portcd) {
        regPortcd(CK_LT, fRES(portcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterEqual(String portcd) {
        regPortcd(CK_GE, fRES(portcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessEqual(String portcd) {
        regPortcd(CK_LE, fRES(portcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcdList The collection of portcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_InScope(Collection<String> portcdList) {
        doSetPortcd_InScope(portcdList);
    }

    protected void doSetPortcd_InScope(Collection<String> portcdList) {
        regINS(CK_INS, cTL(portcdList), xgetCValuePortcd(), "PORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcdList The collection of portcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotInScope(Collection<String> portcdList) {
        doSetPortcd_NotInScope(portcdList);
    }

    protected void doSetPortcd_NotInScope(Collection<String> portcdList) {
        regINS(CK_NINS, cTL(portcdList), xgetCValuePortcd(), "PORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)} <br>
     * <pre>e.g. setPortcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param portcd The value of portcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPortcd_LikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(portcd), xgetCValuePortcd(), "PORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPortcd_NotLikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(portcd), xgetCValuePortcd(), "PORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_PrefixSearch(String portcd) {
        setPortcd_LikeSearch(portcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNull() { regPortcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNullOrEmpty() { regPortcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNotNull() { regPortcd(CK_ISNN, DOBJ); }

    protected void regPortcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePortcd(), "PORTCD"); }
    protected abstract ConditionValue xgetCValuePortcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_Equal(String districtcd) {
        doSetDistrictcd_Equal(fRES(districtcd));
    }

    protected void doSetDistrictcd_Equal(String districtcd) {
        regDistrictcd(CK_EQ, districtcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotEqual(String districtcd) {
        doSetDistrictcd_NotEqual(fRES(districtcd));
    }

    protected void doSetDistrictcd_NotEqual(String districtcd) {
        regDistrictcd(CK_NES, districtcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterThan(String districtcd) {
        regDistrictcd(CK_GT, fRES(districtcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessThan(String districtcd) {
        regDistrictcd(CK_LT, fRES(districtcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterEqual(String districtcd) {
        regDistrictcd(CK_GE, fRES(districtcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessEqual(String districtcd) {
        regDistrictcd(CK_LE, fRES(districtcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcdList The collection of districtcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_InScope(Collection<String> districtcdList) {
        doSetDistrictcd_InScope(districtcdList);
    }

    protected void doSetDistrictcd_InScope(Collection<String> districtcdList) {
        regINS(CK_INS, cTL(districtcdList), xgetCValueDistrictcd(), "DISTRICTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcdList The collection of districtcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotInScope(Collection<String> districtcdList) {
        doSetDistrictcd_NotInScope(districtcdList);
    }

    protected void doSetDistrictcd_NotInScope(Collection<String> districtcdList) {
        regINS(CK_NINS, cTL(districtcdList), xgetCValueDistrictcd(), "DISTRICTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)} <br>
     * <pre>e.g. setDistrictcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param districtcd The value of districtcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistrictcd_LikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(districtcd), xgetCValueDistrictcd(), "DISTRICTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistrictcd_NotLikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(districtcd), xgetCValueDistrictcd(), "DISTRICTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_PrefixSearch(String districtcd) {
        setDistrictcd_LikeSearch(districtcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNull() { regDistrictcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNullOrEmpty() { regDistrictcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNotNull() { regDistrictcd(CK_ISNN, DOBJ); }

    protected void regDistrictcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistrictcd(), "DISTRICTCD"); }
    protected abstract ConditionValue xgetCValueDistrictcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_Equal(String supplierphone) {
        doSetSupplierphone_Equal(fRES(supplierphone));
    }

    protected void doSetSupplierphone_Equal(String supplierphone) {
        regSupplierphone(CK_EQ, supplierphone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_NotEqual(String supplierphone) {
        doSetSupplierphone_NotEqual(fRES(supplierphone));
    }

    protected void doSetSupplierphone_NotEqual(String supplierphone) {
        regSupplierphone(CK_NES, supplierphone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_GreaterThan(String supplierphone) {
        regSupplierphone(CK_GT, fRES(supplierphone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_LessThan(String supplierphone) {
        regSupplierphone(CK_LT, fRES(supplierphone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_GreaterEqual(String supplierphone) {
        regSupplierphone(CK_GE, fRES(supplierphone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_LessEqual(String supplierphone) {
        regSupplierphone(CK_LE, fRES(supplierphone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphoneList The collection of supplierphone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_InScope(Collection<String> supplierphoneList) {
        doSetSupplierphone_InScope(supplierphoneList);
    }

    protected void doSetSupplierphone_InScope(Collection<String> supplierphoneList) {
        regINS(CK_INS, cTL(supplierphoneList), xgetCValueSupplierphone(), "SUPPLIERPHONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphoneList The collection of supplierphone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_NotInScope(Collection<String> supplierphoneList) {
        doSetSupplierphone_NotInScope(supplierphoneList);
    }

    protected void doSetSupplierphone_NotInScope(Collection<String> supplierphoneList) {
        regINS(CK_NINS, cTL(supplierphoneList), xgetCValueSupplierphone(), "SUPPLIERPHONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)} <br>
     * <pre>e.g. setSupplierphone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierphone The value of supplierphone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierphone_LikeSearch(String supplierphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierphone), xgetCValueSupplierphone(), "SUPPLIERPHONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierphone_NotLikeSearch(String supplierphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierphone), xgetCValueSupplierphone(), "SUPPLIERPHONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     * @param supplierphone The value of supplierphone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierphone_PrefixSearch(String supplierphone) {
        setSupplierphone_LikeSearch(supplierphone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     */
    public void setSupplierphone_IsNull() { regSupplierphone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     */
    public void setSupplierphone_IsNullOrEmpty() { regSupplierphone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERPHONE: {varchar(60)}
     */
    public void setSupplierphone_IsNotNull() { regSupplierphone(CK_ISNN, DOBJ); }

    protected void regSupplierphone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierphone(), "SUPPLIERPHONE"); }
    protected abstract ConditionValue xgetCValueSupplierphone();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_Equal(String fax1) {
        doSetFax1_Equal(fRES(fax1));
    }

    protected void doSetFax1_Equal(String fax1) {
        regFax1(CK_EQ, fax1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotEqual(String fax1) {
        doSetFax1_NotEqual(fRES(fax1));
    }

    protected void doSetFax1_NotEqual(String fax1) {
        regFax1(CK_NES, fax1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterThan(String fax1) {
        regFax1(CK_GT, fRES(fax1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessThan(String fax1) {
        regFax1(CK_LT, fRES(fax1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterEqual(String fax1) {
        regFax1(CK_GE, fRES(fax1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessEqual(String fax1) {
        regFax1(CK_LE, fRES(fax1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_InScope(Collection<String> fax1List) {
        doSetFax1_InScope(fax1List);
    }

    protected void doSetFax1_InScope(Collection<String> fax1List) {
        regINS(CK_INS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotInScope(Collection<String> fax1List) {
        doSetFax1_NotInScope(fax1List);
    }

    protected void doSetFax1_NotInScope(Collection<String> fax1List) {
        regINS(CK_NINS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax1_LikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax1_NotLikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_PrefixSearch(String fax1) {
        setFax1_LikeSearch(fax1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNull() { regFax1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNullOrEmpty() { regFax1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNotNull() { regFax1(CK_ISNN, DOBJ); }

    protected void regFax1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax1(), "FAX1"); }
    protected abstract ConditionValue xgetCValueFax1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param emailList The collection of email as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    protected void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param emailList The collection of email as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    protected void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_PrefixSearch(String email) {
        setEmail_LikeSearch(email, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNull() { regEmail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNullOrEmpty() { regEmail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNotNull() { regEmail(CK_ISNN, DOBJ); }

    protected void regEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail(), "EMAIL"); }
    protected abstract ConditionValue xgetCValueEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_Equal(String refname) {
        doSetRefname_Equal(fRES(refname));
    }

    protected void doSetRefname_Equal(String refname) {
        regRefname(CK_EQ, refname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotEqual(String refname) {
        doSetRefname_NotEqual(fRES(refname));
    }

    protected void doSetRefname_NotEqual(String refname) {
        regRefname(CK_NES, refname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterThan(String refname) {
        regRefname(CK_GT, fRES(refname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessThan(String refname) {
        regRefname(CK_LT, fRES(refname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterEqual(String refname) {
        regRefname(CK_GE, fRES(refname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessEqual(String refname) {
        regRefname(CK_LE, fRES(refname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refnameList The collection of refname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_InScope(Collection<String> refnameList) {
        doSetRefname_InScope(refnameList);
    }

    protected void doSetRefname_InScope(Collection<String> refnameList) {
        regINS(CK_INS, cTL(refnameList), xgetCValueRefname(), "REFNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refnameList The collection of refname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotInScope(Collection<String> refnameList) {
        doSetRefname_NotInScope(refnameList);
    }

    protected void doSetRefname_NotInScope(Collection<String> refnameList) {
        regINS(CK_NINS, cTL(refnameList), xgetCValueRefname(), "REFNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)} <br>
     * <pre>e.g. setRefname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refname The value of refname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefname_LikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refname), xgetCValueRefname(), "REFNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefname_NotLikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refname), xgetCValueRefname(), "REFNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_PrefixSearch(String refname) {
        setRefname_LikeSearch(refname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNull() { regRefname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNullOrEmpty() { regRefname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNotNull() { regRefname(CK_ISNN, DOBJ); }

    protected void regRefname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefname(), "REFNAME"); }
    protected abstract ConditionValue xgetCValueRefname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_Equal(String fromcd) {
        doSetFromcd_Equal(fRES(fromcd));
    }

    protected void doSetFromcd_Equal(String fromcd) {
        regFromcd(CK_EQ, fromcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_NotEqual(String fromcd) {
        doSetFromcd_NotEqual(fRES(fromcd));
    }

    protected void doSetFromcd_NotEqual(String fromcd) {
        regFromcd(CK_NES, fromcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_GreaterThan(String fromcd) {
        regFromcd(CK_GT, fRES(fromcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_LessThan(String fromcd) {
        regFromcd(CK_LT, fRES(fromcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_GreaterEqual(String fromcd) {
        regFromcd(CK_GE, fRES(fromcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_LessEqual(String fromcd) {
        regFromcd(CK_LE, fRES(fromcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcdList The collection of fromcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_InScope(Collection<String> fromcdList) {
        doSetFromcd_InScope(fromcdList);
    }

    protected void doSetFromcd_InScope(Collection<String> fromcdList) {
        regINS(CK_INS, cTL(fromcdList), xgetCValueFromcd(), "FROMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcdList The collection of fromcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_NotInScope(Collection<String> fromcdList) {
        doSetFromcd_NotInScope(fromcdList);
    }

    protected void doSetFromcd_NotInScope(Collection<String> fromcdList) {
        regINS(CK_NINS, cTL(fromcdList), xgetCValueFromcd(), "FROMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCD: {varchar(30)} <br>
     * <pre>e.g. setFromcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromcd The value of fromcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromcd_LikeSearch(String fromcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromcd), xgetCValueFromcd(), "FROMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromcd_NotLikeSearch(String fromcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromcd), xgetCValueFromcd(), "FROMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCD: {varchar(30)}
     * @param fromcd The value of fromcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcd_PrefixSearch(String fromcd) {
        setFromcd_LikeSearch(fromcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     */
    public void setFromcd_IsNull() { regFromcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     */
    public void setFromcd_IsNullOrEmpty() { regFromcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMCD: {varchar(30)}
     */
    public void setFromcd_IsNotNull() { regFromcd(CK_ISNN, DOBJ); }

    protected void regFromcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromcd(), "FROMCD"); }
    protected abstract ConditionValue xgetCValueFromcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_Equal(String fromsub) {
        doSetFromsub_Equal(fRES(fromsub));
    }

    protected void doSetFromsub_Equal(String fromsub) {
        regFromsub(CK_EQ, fromsub);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_NotEqual(String fromsub) {
        doSetFromsub_NotEqual(fRES(fromsub));
    }

    protected void doSetFromsub_NotEqual(String fromsub) {
        regFromsub(CK_NES, fromsub);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_GreaterThan(String fromsub) {
        regFromsub(CK_GT, fRES(fromsub));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_LessThan(String fromsub) {
        regFromsub(CK_LT, fRES(fromsub));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_GreaterEqual(String fromsub) {
        regFromsub(CK_GE, fRES(fromsub));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_LessEqual(String fromsub) {
        regFromsub(CK_LE, fRES(fromsub));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsubList The collection of fromsub as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_InScope(Collection<String> fromsubList) {
        doSetFromsub_InScope(fromsubList);
    }

    protected void doSetFromsub_InScope(Collection<String> fromsubList) {
        regINS(CK_INS, cTL(fromsubList), xgetCValueFromsub(), "FROMSUB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsubList The collection of fromsub as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_NotInScope(Collection<String> fromsubList) {
        doSetFromsub_NotInScope(fromsubList);
    }

    protected void doSetFromsub_NotInScope(Collection<String> fromsubList) {
        regINS(CK_NINS, cTL(fromsubList), xgetCValueFromsub(), "FROMSUB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMSUB: {varchar(60)} <br>
     * <pre>e.g. setFromsub_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromsub The value of fromsub as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromsub_LikeSearch(String fromsub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromsub), xgetCValueFromsub(), "FROMSUB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromsub_NotLikeSearch(String fromsub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromsub), xgetCValueFromsub(), "FROMSUB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMSUB: {varchar(60)}
     * @param fromsub The value of fromsub as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromsub_PrefixSearch(String fromsub) {
        setFromsub_LikeSearch(fromsub, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     */
    public void setFromsub_IsNull() { regFromsub(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     */
    public void setFromsub_IsNullOrEmpty() { regFromsub(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMSUB: {varchar(60)}
     */
    public void setFromsub_IsNotNull() { regFromsub(CK_ISNN, DOBJ); }

    protected void regFromsub(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromsub(), "FROMSUB"); }
    protected abstract ConditionValue xgetCValueFromsub();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_Equal(String fromname) {
        doSetFromname_Equal(fRES(fromname));
    }

    protected void doSetFromname_Equal(String fromname) {
        regFromname(CK_EQ, fromname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_NotEqual(String fromname) {
        doSetFromname_NotEqual(fRES(fromname));
    }

    protected void doSetFromname_NotEqual(String fromname) {
        regFromname(CK_NES, fromname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_GreaterThan(String fromname) {
        regFromname(CK_GT, fRES(fromname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_LessThan(String fromname) {
        regFromname(CK_LT, fRES(fromname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_GreaterEqual(String fromname) {
        regFromname(CK_GE, fRES(fromname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_LessEqual(String fromname) {
        regFromname(CK_LE, fRES(fromname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromnameList The collection of fromname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_InScope(Collection<String> fromnameList) {
        doSetFromname_InScope(fromnameList);
    }

    protected void doSetFromname_InScope(Collection<String> fromnameList) {
        regINS(CK_INS, cTL(fromnameList), xgetCValueFromname(), "FROMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromnameList The collection of fromname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_NotInScope(Collection<String> fromnameList) {
        doSetFromname_NotInScope(fromnameList);
    }

    protected void doSetFromname_NotInScope(Collection<String> fromnameList) {
        regINS(CK_NINS, cTL(fromnameList), xgetCValueFromname(), "FROMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMNAME: {varchar(255)} <br>
     * <pre>e.g. setFromname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromname The value of fromname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromname_LikeSearch(String fromname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromname), xgetCValueFromname(), "FROMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromname_NotLikeSearch(String fromname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromname), xgetCValueFromname(), "FROMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMNAME: {varchar(255)}
     * @param fromname The value of fromname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromname_PrefixSearch(String fromname) {
        setFromname_LikeSearch(fromname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     */
    public void setFromname_IsNull() { regFromname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     */
    public void setFromname_IsNullOrEmpty() { regFromname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMNAME: {varchar(255)}
     */
    public void setFromname_IsNotNull() { regFromname(CK_ISNN, DOBJ); }

    protected void regFromname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromname(), "FROMNAME"); }
    protected abstract ConditionValue xgetCValueFromname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_Equal(String fromaddress1) {
        doSetFromaddress1_Equal(fRES(fromaddress1));
    }

    protected void doSetFromaddress1_Equal(String fromaddress1) {
        regFromaddress1(CK_EQ, fromaddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_NotEqual(String fromaddress1) {
        doSetFromaddress1_NotEqual(fRES(fromaddress1));
    }

    protected void doSetFromaddress1_NotEqual(String fromaddress1) {
        regFromaddress1(CK_NES, fromaddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_GreaterThan(String fromaddress1) {
        regFromaddress1(CK_GT, fRES(fromaddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_LessThan(String fromaddress1) {
        regFromaddress1(CK_LT, fRES(fromaddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_GreaterEqual(String fromaddress1) {
        regFromaddress1(CK_GE, fRES(fromaddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_LessEqual(String fromaddress1) {
        regFromaddress1(CK_LE, fRES(fromaddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1List The collection of fromaddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_InScope(Collection<String> fromaddress1List) {
        doSetFromaddress1_InScope(fromaddress1List);
    }

    protected void doSetFromaddress1_InScope(Collection<String> fromaddress1List) {
        regINS(CK_INS, cTL(fromaddress1List), xgetCValueFromaddress1(), "FROMADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1List The collection of fromaddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_NotInScope(Collection<String> fromaddress1List) {
        doSetFromaddress1_NotInScope(fromaddress1List);
    }

    protected void doSetFromaddress1_NotInScope(Collection<String> fromaddress1List) {
        regINS(CK_NINS, cTL(fromaddress1List), xgetCValueFromaddress1(), "FROMADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setFromaddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromaddress1 The value of fromaddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromaddress1_LikeSearch(String fromaddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromaddress1), xgetCValueFromaddress1(), "FROMADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromaddress1_NotLikeSearch(String fromaddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromaddress1), xgetCValueFromaddress1(), "FROMADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     * @param fromaddress1 The value of fromaddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress1_PrefixSearch(String fromaddress1) {
        setFromaddress1_LikeSearch(fromaddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     */
    public void setFromaddress1_IsNull() { regFromaddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     */
    public void setFromaddress1_IsNullOrEmpty() { regFromaddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS1: {varchar(255)}
     */
    public void setFromaddress1_IsNotNull() { regFromaddress1(CK_ISNN, DOBJ); }

    protected void regFromaddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromaddress1(), "FROMADDRESS1"); }
    protected abstract ConditionValue xgetCValueFromaddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_Equal(String fromaddress2) {
        doSetFromaddress2_Equal(fRES(fromaddress2));
    }

    protected void doSetFromaddress2_Equal(String fromaddress2) {
        regFromaddress2(CK_EQ, fromaddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_NotEqual(String fromaddress2) {
        doSetFromaddress2_NotEqual(fRES(fromaddress2));
    }

    protected void doSetFromaddress2_NotEqual(String fromaddress2) {
        regFromaddress2(CK_NES, fromaddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_GreaterThan(String fromaddress2) {
        regFromaddress2(CK_GT, fRES(fromaddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_LessThan(String fromaddress2) {
        regFromaddress2(CK_LT, fRES(fromaddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_GreaterEqual(String fromaddress2) {
        regFromaddress2(CK_GE, fRES(fromaddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_LessEqual(String fromaddress2) {
        regFromaddress2(CK_LE, fRES(fromaddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2List The collection of fromaddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_InScope(Collection<String> fromaddress2List) {
        doSetFromaddress2_InScope(fromaddress2List);
    }

    protected void doSetFromaddress2_InScope(Collection<String> fromaddress2List) {
        regINS(CK_INS, cTL(fromaddress2List), xgetCValueFromaddress2(), "FROMADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2List The collection of fromaddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_NotInScope(Collection<String> fromaddress2List) {
        doSetFromaddress2_NotInScope(fromaddress2List);
    }

    protected void doSetFromaddress2_NotInScope(Collection<String> fromaddress2List) {
        regINS(CK_NINS, cTL(fromaddress2List), xgetCValueFromaddress2(), "FROMADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setFromaddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromaddress2 The value of fromaddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromaddress2_LikeSearch(String fromaddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromaddress2), xgetCValueFromaddress2(), "FROMADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromaddress2_NotLikeSearch(String fromaddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromaddress2), xgetCValueFromaddress2(), "FROMADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     * @param fromaddress2 The value of fromaddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress2_PrefixSearch(String fromaddress2) {
        setFromaddress2_LikeSearch(fromaddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     */
    public void setFromaddress2_IsNull() { regFromaddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     */
    public void setFromaddress2_IsNullOrEmpty() { regFromaddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS2: {varchar(255)}
     */
    public void setFromaddress2_IsNotNull() { regFromaddress2(CK_ISNN, DOBJ); }

    protected void regFromaddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromaddress2(), "FROMADDRESS2"); }
    protected abstract ConditionValue xgetCValueFromaddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_Equal(String fromaddress3) {
        doSetFromaddress3_Equal(fRES(fromaddress3));
    }

    protected void doSetFromaddress3_Equal(String fromaddress3) {
        regFromaddress3(CK_EQ, fromaddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_NotEqual(String fromaddress3) {
        doSetFromaddress3_NotEqual(fRES(fromaddress3));
    }

    protected void doSetFromaddress3_NotEqual(String fromaddress3) {
        regFromaddress3(CK_NES, fromaddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_GreaterThan(String fromaddress3) {
        regFromaddress3(CK_GT, fRES(fromaddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_LessThan(String fromaddress3) {
        regFromaddress3(CK_LT, fRES(fromaddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_GreaterEqual(String fromaddress3) {
        regFromaddress3(CK_GE, fRES(fromaddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_LessEqual(String fromaddress3) {
        regFromaddress3(CK_LE, fRES(fromaddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3List The collection of fromaddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_InScope(Collection<String> fromaddress3List) {
        doSetFromaddress3_InScope(fromaddress3List);
    }

    protected void doSetFromaddress3_InScope(Collection<String> fromaddress3List) {
        regINS(CK_INS, cTL(fromaddress3List), xgetCValueFromaddress3(), "FROMADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3List The collection of fromaddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_NotInScope(Collection<String> fromaddress3List) {
        doSetFromaddress3_NotInScope(fromaddress3List);
    }

    protected void doSetFromaddress3_NotInScope(Collection<String> fromaddress3List) {
        regINS(CK_NINS, cTL(fromaddress3List), xgetCValueFromaddress3(), "FROMADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setFromaddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromaddress3 The value of fromaddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromaddress3_LikeSearch(String fromaddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromaddress3), xgetCValueFromaddress3(), "FROMADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromaddress3_NotLikeSearch(String fromaddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromaddress3), xgetCValueFromaddress3(), "FROMADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     * @param fromaddress3 The value of fromaddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromaddress3_PrefixSearch(String fromaddress3) {
        setFromaddress3_LikeSearch(fromaddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     */
    public void setFromaddress3_IsNull() { regFromaddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     */
    public void setFromaddress3_IsNullOrEmpty() { regFromaddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMADDRESS3: {varchar(255)}
     */
    public void setFromaddress3_IsNotNull() { regFromaddress3(CK_ISNN, DOBJ); }

    protected void regFromaddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromaddress3(), "FROMADDRESS3"); }
    protected abstract ConditionValue xgetCValueFromaddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_Equal(String frompostno) {
        doSetFrompostno_Equal(fRES(frompostno));
    }

    protected void doSetFrompostno_Equal(String frompostno) {
        regFrompostno(CK_EQ, frompostno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_NotEqual(String frompostno) {
        doSetFrompostno_NotEqual(fRES(frompostno));
    }

    protected void doSetFrompostno_NotEqual(String frompostno) {
        regFrompostno(CK_NES, frompostno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_GreaterThan(String frompostno) {
        regFrompostno(CK_GT, fRES(frompostno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_LessThan(String frompostno) {
        regFrompostno(CK_LT, fRES(frompostno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_GreaterEqual(String frompostno) {
        regFrompostno(CK_GE, fRES(frompostno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_LessEqual(String frompostno) {
        regFrompostno(CK_LE, fRES(frompostno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostnoList The collection of frompostno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_InScope(Collection<String> frompostnoList) {
        doSetFrompostno_InScope(frompostnoList);
    }

    protected void doSetFrompostno_InScope(Collection<String> frompostnoList) {
        regINS(CK_INS, cTL(frompostnoList), xgetCValueFrompostno(), "FROMPOSTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostnoList The collection of frompostno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_NotInScope(Collection<String> frompostnoList) {
        doSetFrompostno_NotInScope(frompostnoList);
    }

    protected void doSetFrompostno_NotInScope(Collection<String> frompostnoList) {
        regINS(CK_NINS, cTL(frompostnoList), xgetCValueFrompostno(), "FROMPOSTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPOSTNO: {varchar(30)} <br>
     * <pre>e.g. setFrompostno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param frompostno The value of frompostno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFrompostno_LikeSearch(String frompostno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(frompostno), xgetCValueFrompostno(), "FROMPOSTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFrompostno_NotLikeSearch(String frompostno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(frompostno), xgetCValueFrompostno(), "FROMPOSTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     * @param frompostno The value of frompostno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFrompostno_PrefixSearch(String frompostno) {
        setFrompostno_LikeSearch(frompostno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     */
    public void setFrompostno_IsNull() { regFrompostno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     */
    public void setFrompostno_IsNullOrEmpty() { regFrompostno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMPOSTNO: {varchar(30)}
     */
    public void setFrompostno_IsNotNull() { regFrompostno(CK_ISNN, DOBJ); }

    protected void regFrompostno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFrompostno(), "FROMPOSTNO"); }
    protected abstract ConditionValue xgetCValueFrompostno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_Equal(String fromcountrycd) {
        doSetFromcountrycd_Equal(fRES(fromcountrycd));
    }

    protected void doSetFromcountrycd_Equal(String fromcountrycd) {
        regFromcountrycd(CK_EQ, fromcountrycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_NotEqual(String fromcountrycd) {
        doSetFromcountrycd_NotEqual(fRES(fromcountrycd));
    }

    protected void doSetFromcountrycd_NotEqual(String fromcountrycd) {
        regFromcountrycd(CK_NES, fromcountrycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_GreaterThan(String fromcountrycd) {
        regFromcountrycd(CK_GT, fRES(fromcountrycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_LessThan(String fromcountrycd) {
        regFromcountrycd(CK_LT, fRES(fromcountrycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_GreaterEqual(String fromcountrycd) {
        regFromcountrycd(CK_GE, fRES(fromcountrycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_LessEqual(String fromcountrycd) {
        regFromcountrycd(CK_LE, fRES(fromcountrycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycdList The collection of fromcountrycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_InScope(Collection<String> fromcountrycdList) {
        doSetFromcountrycd_InScope(fromcountrycdList);
    }

    protected void doSetFromcountrycd_InScope(Collection<String> fromcountrycdList) {
        regINS(CK_INS, cTL(fromcountrycdList), xgetCValueFromcountrycd(), "FROMCOUNTRYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycdList The collection of fromcountrycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_NotInScope(Collection<String> fromcountrycdList) {
        doSetFromcountrycd_NotInScope(fromcountrycdList);
    }

    protected void doSetFromcountrycd_NotInScope(Collection<String> fromcountrycdList) {
        regINS(CK_NINS, cTL(fromcountrycdList), xgetCValueFromcountrycd(), "FROMCOUNTRYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)} <br>
     * <pre>e.g. setFromcountrycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromcountrycd The value of fromcountrycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromcountrycd_LikeSearch(String fromcountrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromcountrycd), xgetCValueFromcountrycd(), "FROMCOUNTRYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromcountrycd_NotLikeSearch(String fromcountrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromcountrycd), xgetCValueFromcountrycd(), "FROMCOUNTRYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     * @param fromcountrycd The value of fromcountrycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromcountrycd_PrefixSearch(String fromcountrycd) {
        setFromcountrycd_LikeSearch(fromcountrycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     */
    public void setFromcountrycd_IsNull() { regFromcountrycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     */
    public void setFromcountrycd_IsNullOrEmpty() { regFromcountrycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMCOUNTRYCD: {varchar(60)}
     */
    public void setFromcountrycd_IsNotNull() { regFromcountrycd(CK_ISNN, DOBJ); }

    protected void regFromcountrycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromcountrycd(), "FROMCOUNTRYCD"); }
    protected abstract ConditionValue xgetCValueFromcountrycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_Equal(String fromportcd) {
        doSetFromportcd_Equal(fRES(fromportcd));
    }

    protected void doSetFromportcd_Equal(String fromportcd) {
        regFromportcd(CK_EQ, fromportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_NotEqual(String fromportcd) {
        doSetFromportcd_NotEqual(fRES(fromportcd));
    }

    protected void doSetFromportcd_NotEqual(String fromportcd) {
        regFromportcd(CK_NES, fromportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_GreaterThan(String fromportcd) {
        regFromportcd(CK_GT, fRES(fromportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_LessThan(String fromportcd) {
        regFromportcd(CK_LT, fRES(fromportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_GreaterEqual(String fromportcd) {
        regFromportcd(CK_GE, fRES(fromportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_LessEqual(String fromportcd) {
        regFromportcd(CK_LE, fRES(fromportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcdList The collection of fromportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_InScope(Collection<String> fromportcdList) {
        doSetFromportcd_InScope(fromportcdList);
    }

    protected void doSetFromportcd_InScope(Collection<String> fromportcdList) {
        regINS(CK_INS, cTL(fromportcdList), xgetCValueFromportcd(), "FROMPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcdList The collection of fromportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_NotInScope(Collection<String> fromportcdList) {
        doSetFromportcd_NotInScope(fromportcdList);
    }

    protected void doSetFromportcd_NotInScope(Collection<String> fromportcdList) {
        regINS(CK_NINS, cTL(fromportcdList), xgetCValueFromportcd(), "FROMPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPORTCD: {varchar(60)} <br>
     * <pre>e.g. setFromportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromportcd The value of fromportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromportcd_LikeSearch(String fromportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromportcd), xgetCValueFromportcd(), "FROMPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromportcd_NotLikeSearch(String fromportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromportcd), xgetCValueFromportcd(), "FROMPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     * @param fromportcd The value of fromportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromportcd_PrefixSearch(String fromportcd) {
        setFromportcd_LikeSearch(fromportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     */
    public void setFromportcd_IsNull() { regFromportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     */
    public void setFromportcd_IsNullOrEmpty() { regFromportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMPORTCD: {varchar(60)}
     */
    public void setFromportcd_IsNotNull() { regFromportcd(CK_ISNN, DOBJ); }

    protected void regFromportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromportcd(), "FROMPORTCD"); }
    protected abstract ConditionValue xgetCValueFromportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_Equal(String fromdistrictcd) {
        doSetFromdistrictcd_Equal(fRES(fromdistrictcd));
    }

    protected void doSetFromdistrictcd_Equal(String fromdistrictcd) {
        regFromdistrictcd(CK_EQ, fromdistrictcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_NotEqual(String fromdistrictcd) {
        doSetFromdistrictcd_NotEqual(fRES(fromdistrictcd));
    }

    protected void doSetFromdistrictcd_NotEqual(String fromdistrictcd) {
        regFromdistrictcd(CK_NES, fromdistrictcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_GreaterThan(String fromdistrictcd) {
        regFromdistrictcd(CK_GT, fRES(fromdistrictcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_LessThan(String fromdistrictcd) {
        regFromdistrictcd(CK_LT, fRES(fromdistrictcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_GreaterEqual(String fromdistrictcd) {
        regFromdistrictcd(CK_GE, fRES(fromdistrictcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_LessEqual(String fromdistrictcd) {
        regFromdistrictcd(CK_LE, fRES(fromdistrictcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcdList The collection of fromdistrictcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_InScope(Collection<String> fromdistrictcdList) {
        doSetFromdistrictcd_InScope(fromdistrictcdList);
    }

    protected void doSetFromdistrictcd_InScope(Collection<String> fromdistrictcdList) {
        regINS(CK_INS, cTL(fromdistrictcdList), xgetCValueFromdistrictcd(), "FROMDISTRICTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcdList The collection of fromdistrictcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_NotInScope(Collection<String> fromdistrictcdList) {
        doSetFromdistrictcd_NotInScope(fromdistrictcdList);
    }

    protected void doSetFromdistrictcd_NotInScope(Collection<String> fromdistrictcdList) {
        regINS(CK_NINS, cTL(fromdistrictcdList), xgetCValueFromdistrictcd(), "FROMDISTRICTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)} <br>
     * <pre>e.g. setFromdistrictcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromdistrictcd The value of fromdistrictcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromdistrictcd_LikeSearch(String fromdistrictcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromdistrictcd), xgetCValueFromdistrictcd(), "FROMDISTRICTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromdistrictcd_NotLikeSearch(String fromdistrictcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromdistrictcd), xgetCValueFromdistrictcd(), "FROMDISTRICTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     * @param fromdistrictcd The value of fromdistrictcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromdistrictcd_PrefixSearch(String fromdistrictcd) {
        setFromdistrictcd_LikeSearch(fromdistrictcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     */
    public void setFromdistrictcd_IsNull() { regFromdistrictcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     */
    public void setFromdistrictcd_IsNullOrEmpty() { regFromdistrictcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMDISTRICTCD: {varchar(30)}
     */
    public void setFromdistrictcd_IsNotNull() { regFromdistrictcd(CK_ISNN, DOBJ); }

    protected void regFromdistrictcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromdistrictcd(), "FROMDISTRICTCD"); }
    protected abstract ConditionValue xgetCValueFromdistrictcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_Equal(String fromphone) {
        doSetFromphone_Equal(fRES(fromphone));
    }

    protected void doSetFromphone_Equal(String fromphone) {
        regFromphone(CK_EQ, fromphone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotEqual(String fromphone) {
        doSetFromphone_NotEqual(fRES(fromphone));
    }

    protected void doSetFromphone_NotEqual(String fromphone) {
        regFromphone(CK_NES, fromphone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterThan(String fromphone) {
        regFromphone(CK_GT, fRES(fromphone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessThan(String fromphone) {
        regFromphone(CK_LT, fRES(fromphone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_GreaterEqual(String fromphone) {
        regFromphone(CK_GE, fRES(fromphone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_LessEqual(String fromphone) {
        regFromphone(CK_LE, fRES(fromphone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphoneList The collection of fromphone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_InScope(Collection<String> fromphoneList) {
        doSetFromphone_InScope(fromphoneList);
    }

    protected void doSetFromphone_InScope(Collection<String> fromphoneList) {
        regINS(CK_INS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphoneList The collection of fromphone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_NotInScope(Collection<String> fromphoneList) {
        doSetFromphone_NotInScope(fromphoneList);
    }

    protected void doSetFromphone_NotInScope(Collection<String> fromphoneList) {
        regINS(CK_NINS, cTL(fromphoneList), xgetCValueFromphone(), "FROMPHONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)} <br>
     * <pre>e.g. setFromphone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromphone The value of fromphone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromphone_LikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromphone_NotLikeSearch(String fromphone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromphone), xgetCValueFromphone(), "FROMPHONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMPHONE: {varchar(60)}
     * @param fromphone The value of fromphone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromphone_PrefixSearch(String fromphone) {
        setFromphone_LikeSearch(fromphone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNull() { regFromphone(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNullOrEmpty() { regFromphone(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMPHONE: {varchar(60)}
     */
    public void setFromphone_IsNotNull() { regFromphone(CK_ISNN, DOBJ); }

    protected void regFromphone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromphone(), "FROMPHONE"); }
    protected abstract ConditionValue xgetCValueFromphone();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_Equal(String fromfax) {
        doSetFromfax_Equal(fRES(fromfax));
    }

    protected void doSetFromfax_Equal(String fromfax) {
        regFromfax(CK_EQ, fromfax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotEqual(String fromfax) {
        doSetFromfax_NotEqual(fRES(fromfax));
    }

    protected void doSetFromfax_NotEqual(String fromfax) {
        regFromfax(CK_NES, fromfax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterThan(String fromfax) {
        regFromfax(CK_GT, fRES(fromfax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessThan(String fromfax) {
        regFromfax(CK_LT, fRES(fromfax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_GreaterEqual(String fromfax) {
        regFromfax(CK_GE, fRES(fromfax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_LessEqual(String fromfax) {
        regFromfax(CK_LE, fRES(fromfax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfaxList The collection of fromfax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_InScope(Collection<String> fromfaxList) {
        doSetFromfax_InScope(fromfaxList);
    }

    protected void doSetFromfax_InScope(Collection<String> fromfaxList) {
        regINS(CK_INS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfaxList The collection of fromfax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_NotInScope(Collection<String> fromfaxList) {
        doSetFromfax_NotInScope(fromfaxList);
    }

    protected void doSetFromfax_NotInScope(Collection<String> fromfaxList) {
        regINS(CK_NINS, cTL(fromfaxList), xgetCValueFromfax(), "FROMFAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)} <br>
     * <pre>e.g. setFromfax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromfax The value of fromfax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromfax_LikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromfax_NotLikeSearch(String fromfax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromfax), xgetCValueFromfax(), "FROMFAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMFAX: {varchar(60)}
     * @param fromfax The value of fromfax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromfax_PrefixSearch(String fromfax) {
        setFromfax_LikeSearch(fromfax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNull() { regFromfax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNullOrEmpty() { regFromfax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMFAX: {varchar(60)}
     */
    public void setFromfax_IsNotNull() { regFromfax(CK_ISNN, DOBJ); }

    protected void regFromfax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromfax(), "FROMFAX"); }
    protected abstract ConditionValue xgetCValueFromfax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_Equal(String fromemail) {
        doSetFromemail_Equal(fRES(fromemail));
    }

    protected void doSetFromemail_Equal(String fromemail) {
        regFromemail(CK_EQ, fromemail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_NotEqual(String fromemail) {
        doSetFromemail_NotEqual(fRES(fromemail));
    }

    protected void doSetFromemail_NotEqual(String fromemail) {
        regFromemail(CK_NES, fromemail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_GreaterThan(String fromemail) {
        regFromemail(CK_GT, fRES(fromemail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_LessThan(String fromemail) {
        regFromemail(CK_LT, fRES(fromemail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_GreaterEqual(String fromemail) {
        regFromemail(CK_GE, fRES(fromemail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_LessEqual(String fromemail) {
        regFromemail(CK_LE, fRES(fromemail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemailList The collection of fromemail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_InScope(Collection<String> fromemailList) {
        doSetFromemail_InScope(fromemailList);
    }

    protected void doSetFromemail_InScope(Collection<String> fromemailList) {
        regINS(CK_INS, cTL(fromemailList), xgetCValueFromemail(), "FROMEMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemailList The collection of fromemail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_NotInScope(Collection<String> fromemailList) {
        doSetFromemail_NotInScope(fromemailList);
    }

    protected void doSetFromemail_NotInScope(Collection<String> fromemailList) {
        regINS(CK_NINS, cTL(fromemailList), xgetCValueFromemail(), "FROMEMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)} <br>
     * <pre>e.g. setFromemail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromemail The value of fromemail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromemail_LikeSearch(String fromemail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromemail), xgetCValueFromemail(), "FROMEMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromemail_NotLikeSearch(String fromemail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromemail), xgetCValueFromemail(), "FROMEMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     * @param fromemail The value of fromemail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromemail_PrefixSearch(String fromemail) {
        setFromemail_LikeSearch(fromemail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNull() { regFromemail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNullOrEmpty() { regFromemail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMEMAIL: {varchar(255)}
     */
    public void setFromemail_IsNotNull() { regFromemail(CK_ISNN, DOBJ); }

    protected void regFromemail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromemail(), "FROMEMAIL"); }
    protected abstract ConditionValue xgetCValueFromemail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_Equal(String fromrefname) {
        doSetFromrefname_Equal(fRES(fromrefname));
    }

    protected void doSetFromrefname_Equal(String fromrefname) {
        regFromrefname(CK_EQ, fromrefname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_NotEqual(String fromrefname) {
        doSetFromrefname_NotEqual(fRES(fromrefname));
    }

    protected void doSetFromrefname_NotEqual(String fromrefname) {
        regFromrefname(CK_NES, fromrefname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_GreaterThan(String fromrefname) {
        regFromrefname(CK_GT, fRES(fromrefname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_LessThan(String fromrefname) {
        regFromrefname(CK_LT, fRES(fromrefname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_GreaterEqual(String fromrefname) {
        regFromrefname(CK_GE, fRES(fromrefname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_LessEqual(String fromrefname) {
        regFromrefname(CK_LE, fRES(fromrefname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefnameList The collection of fromrefname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_InScope(Collection<String> fromrefnameList) {
        doSetFromrefname_InScope(fromrefnameList);
    }

    protected void doSetFromrefname_InScope(Collection<String> fromrefnameList) {
        regINS(CK_INS, cTL(fromrefnameList), xgetCValueFromrefname(), "FROMREFNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefnameList The collection of fromrefname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_NotInScope(Collection<String> fromrefnameList) {
        doSetFromrefname_NotInScope(fromrefnameList);
    }

    protected void doSetFromrefname_NotInScope(Collection<String> fromrefnameList) {
        regINS(CK_NINS, cTL(fromrefnameList), xgetCValueFromrefname(), "FROMREFNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMREFNAME: {varchar(60)} <br>
     * <pre>e.g. setFromrefname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fromrefname The value of fromrefname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFromrefname_LikeSearch(String fromrefname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fromrefname), xgetCValueFromrefname(), "FROMREFNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFromrefname_NotLikeSearch(String fromrefname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fromrefname), xgetCValueFromrefname(), "FROMREFNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     * @param fromrefname The value of fromrefname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromrefname_PrefixSearch(String fromrefname) {
        setFromrefname_LikeSearch(fromrefname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     */
    public void setFromrefname_IsNull() { regFromrefname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     */
    public void setFromrefname_IsNullOrEmpty() { regFromrefname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FROMREFNAME: {varchar(60)}
     */
    public void setFromrefname_IsNotNull() { regFromrefname(CK_ISNN, DOBJ); }

    protected void regFromrefname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromrefname(), "FROMREFNAME"); }
    protected abstract ConditionValue xgetCValueFromrefname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_Equal(String carriercd) {
        doSetCarriercd_Equal(fRES(carriercd));
    }

    protected void doSetCarriercd_Equal(String carriercd) {
        regCarriercd(CK_EQ, carriercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_NotEqual(String carriercd) {
        doSetCarriercd_NotEqual(fRES(carriercd));
    }

    protected void doSetCarriercd_NotEqual(String carriercd) {
        regCarriercd(CK_NES, carriercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_GreaterThan(String carriercd) {
        regCarriercd(CK_GT, fRES(carriercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_LessThan(String carriercd) {
        regCarriercd(CK_LT, fRES(carriercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_GreaterEqual(String carriercd) {
        regCarriercd(CK_GE, fRES(carriercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_LessEqual(String carriercd) {
        regCarriercd(CK_LE, fRES(carriercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercdList The collection of carriercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_InScope(Collection<String> carriercdList) {
        doSetCarriercd_InScope(carriercdList);
    }

    protected void doSetCarriercd_InScope(Collection<String> carriercdList) {
        regINS(CK_INS, cTL(carriercdList), xgetCValueCarriercd(), "CARRIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercdList The collection of carriercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_NotInScope(Collection<String> carriercdList) {
        doSetCarriercd_NotInScope(carriercdList);
    }

    protected void doSetCarriercd_NotInScope(Collection<String> carriercdList) {
        regINS(CK_NINS, cTL(carriercdList), xgetCValueCarriercd(), "CARRIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)} <br>
     * <pre>e.g. setCarriercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriercd The value of carriercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriercd_LikeSearch(String carriercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriercd), xgetCValueCarriercd(), "CARRIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriercd_NotLikeSearch(String carriercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriercd), xgetCValueCarriercd(), "CARRIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_PrefixSearch(String carriercd) {
        setCarriercd_LikeSearch(carriercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNull() { regCarriercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNullOrEmpty() { regCarriercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNotNull() { regCarriercd(CK_ISNN, DOBJ); }

    protected void regCarriercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriercd(), "CARRIERCD"); }
    protected abstract ConditionValue xgetCValueCarriercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_Equal(String carriername) {
        doSetCarriername_Equal(fRES(carriername));
    }

    protected void doSetCarriername_Equal(String carriername) {
        regCarriername(CK_EQ, carriername);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotEqual(String carriername) {
        doSetCarriername_NotEqual(fRES(carriername));
    }

    protected void doSetCarriername_NotEqual(String carriername) {
        regCarriername(CK_NES, carriername);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterThan(String carriername) {
        regCarriername(CK_GT, fRES(carriername));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessThan(String carriername) {
        regCarriername(CK_LT, fRES(carriername));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterEqual(String carriername) {
        regCarriername(CK_GE, fRES(carriername));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessEqual(String carriername) {
        regCarriername(CK_LE, fRES(carriername));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_InScope(Collection<String> carriernameList) {
        doSetCarriername_InScope(carriernameList);
    }

    protected void doSetCarriername_InScope(Collection<String> carriernameList) {
        regINS(CK_INS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotInScope(Collection<String> carriernameList) {
        doSetCarriername_NotInScope(carriernameList);
    }

    protected void doSetCarriername_NotInScope(Collection<String> carriernameList) {
        regINS(CK_NINS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)} <br>
     * <pre>e.g. setCarriername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriername The value of carriername as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriername_LikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriername_NotLikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_PrefixSearch(String carriername) {
        setCarriername_LikeSearch(carriername, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNull() { regCarriername(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNullOrEmpty() { regCarriername(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNotNull() { regCarriername(CK_ISNN, DOBJ); }

    protected void regCarriername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriername(), "CARRIERNAME"); }
    protected abstract ConditionValue xgetCValueCarriername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_Equal(String carrierwbno) {
        doSetCarrierwbno_Equal(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_Equal(String carrierwbno) {
        regCarrierwbno(CK_EQ, carrierwbno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotEqual(String carrierwbno) {
        doSetCarrierwbno_NotEqual(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_NotEqual(String carrierwbno) {
        regCarrierwbno(CK_NES, carrierwbno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterThan(String carrierwbno) {
        regCarrierwbno(CK_GT, fRES(carrierwbno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessThan(String carrierwbno) {
        regCarrierwbno(CK_LT, fRES(carrierwbno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterEqual(String carrierwbno) {
        regCarrierwbno(CK_GE, fRES(carrierwbno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessEqual(String carrierwbno) {
        regCarrierwbno(CK_LE, fRES(carrierwbno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbnoList The collection of carrierwbno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_InScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        regINS(CK_INS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbnoList The collection of carrierwbno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_NotInScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        regINS(CK_NINS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)} <br>
     * <pre>e.g. setCarrierwbno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierwbno The value of carrierwbno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierwbno_LikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierwbno_NotLikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_PrefixSearch(String carrierwbno) {
        setCarrierwbno_LikeSearch(carrierwbno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNull() { regCarrierwbno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNullOrEmpty() { regCarrierwbno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNotNull() { regCarrierwbno(CK_ISNN, DOBJ); }

    protected void regCarrierwbno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierwbno(), "CARRIERWBNO"); }
    protected abstract ConditionValue xgetCValueCarrierwbno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_Equal(String deliverycd) {
        doSetDeliverycd_Equal(fRES(deliverycd));
    }

    protected void doSetDeliverycd_Equal(String deliverycd) {
        regDeliverycd(CK_EQ, deliverycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_NotEqual(String deliverycd) {
        doSetDeliverycd_NotEqual(fRES(deliverycd));
    }

    protected void doSetDeliverycd_NotEqual(String deliverycd) {
        regDeliverycd(CK_NES, deliverycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterThan(String deliverycd) {
        regDeliverycd(CK_GT, fRES(deliverycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessThan(String deliverycd) {
        regDeliverycd(CK_LT, fRES(deliverycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterEqual(String deliverycd) {
        regDeliverycd(CK_GE, fRES(deliverycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessEqual(String deliverycd) {
        regDeliverycd(CK_LE, fRES(deliverycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycdList The collection of deliverycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_InScope(Collection<String> deliverycdList) {
        doSetDeliverycd_InScope(deliverycdList);
    }

    protected void doSetDeliverycd_InScope(Collection<String> deliverycdList) {
        regINS(CK_INS, cTL(deliverycdList), xgetCValueDeliverycd(), "DELIVERYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycdList The collection of deliverycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_NotInScope(Collection<String> deliverycdList) {
        doSetDeliverycd_NotInScope(deliverycdList);
    }

    protected void doSetDeliverycd_NotInScope(Collection<String> deliverycdList) {
        regINS(CK_NINS, cTL(deliverycdList), xgetCValueDeliverycd(), "DELIVERYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)} <br>
     * <pre>e.g. setDeliverycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverycd The value of deliverycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverycd_LikeSearch(String deliverycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverycd), xgetCValueDeliverycd(), "DELIVERYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverycd_NotLikeSearch(String deliverycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverycd), xgetCValueDeliverycd(), "DELIVERYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_PrefixSearch(String deliverycd) {
        setDeliverycd_LikeSearch(deliverycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNull() { regDeliverycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNullOrEmpty() { regDeliverycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNotNull() { regDeliverycd(CK_ISNN, DOBJ); }

    protected void regDeliverycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverycd(), "DELIVERYCD"); }
    protected abstract ConditionValue xgetCValueDeliverycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_Equal(String carriersname) {
        doSetCarriersname_Equal(fRES(carriersname));
    }

    protected void doSetCarriersname_Equal(String carriersname) {
        regCarriersname(CK_EQ, carriersname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotEqual(String carriersname) {
        doSetCarriersname_NotEqual(fRES(carriersname));
    }

    protected void doSetCarriersname_NotEqual(String carriersname) {
        regCarriersname(CK_NES, carriersname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterThan(String carriersname) {
        regCarriersname(CK_GT, fRES(carriersname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessThan(String carriersname) {
        regCarriersname(CK_LT, fRES(carriersname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterEqual(String carriersname) {
        regCarriersname(CK_GE, fRES(carriersname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessEqual(String carriersname) {
        regCarriersname(CK_LE, fRES(carriersname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersnameList The collection of carriersname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_InScope(Collection<String> carriersnameList) {
        doSetCarriersname_InScope(carriersnameList);
    }

    protected void doSetCarriersname_InScope(Collection<String> carriersnameList) {
        regINS(CK_INS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersnameList The collection of carriersname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotInScope(Collection<String> carriersnameList) {
        doSetCarriersname_NotInScope(carriersnameList);
    }

    protected void doSetCarriersname_NotInScope(Collection<String> carriersnameList) {
        regINS(CK_NINS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]} <br>
     * <pre>e.g. setCarriersname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriersname The value of carriersname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriersname_LikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriersname_NotLikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     * @param carriersname The value of carriersname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_PrefixSearch(String carriersname) {
        setCarriersname_LikeSearch(carriersname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     */
    public void setCarriersname_IsNull() { regCarriersname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     */
    public void setCarriersname_IsNullOrEmpty() { regCarriersname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100), default=[(0)]}
     */
    public void setCarriersname_IsNotNull() { regCarriersname(CK_ISNN, DOBJ); }

    protected void regCarriersname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriersname(), "CARRIERSNAME"); }
    protected abstract ConditionValue xgetCValueCarriersname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_Equal(java.math.BigDecimal carrierseq) {
        doSetCarrierseq_Equal(carrierseq);
    }

    protected void doSetCarrierseq_Equal(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_EQ, carrierseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_NotEqual(java.math.BigDecimal carrierseq) {
        doSetCarrierseq_NotEqual(carrierseq);
    }

    protected void doSetCarrierseq_NotEqual(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_NES, carrierseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterThan(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_GT, carrierseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_LessThan(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_LT, carrierseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterEqual(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_GE, carrierseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseq The value of carrierseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_LessEqual(java.math.BigDecimal carrierseq) {
        regCarrierseq(CK_LE, carrierseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param minNumber The min number of carrierseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierseq_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierseq(), "CARRIERSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseqList The collection of carrierseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_InScope(Collection<java.math.BigDecimal> carrierseqList) {
        doSetCarrierseq_InScope(carrierseqList);
    }

    protected void doSetCarrierseq_InScope(Collection<java.math.BigDecimal> carrierseqList) {
        regINS(CK_INS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     * @param carrierseqList The collection of carrierseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_NotInScope(Collection<java.math.BigDecimal> carrierseqList) {
        doSetCarrierseq_NotInScope(carrierseqList);
    }

    protected void doSetCarrierseq_NotInScope(Collection<java.math.BigDecimal> carrierseqList) {
        regINS(CK_NINS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     */
    public void setCarrierseq_IsNull() { regCarrierseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {decimal(16, 6)}
     */
    public void setCarrierseq_IsNotNull() { regCarrierseq(CK_ISNN, DOBJ); }

    protected void regCarrierseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierseq(), "CARRIERSEQ"); }
    protected abstract ConditionValue xgetCValueCarrierseq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_Equal(String expectedtime) {
        doSetExpectedtime_Equal(fRES(expectedtime));
    }

    protected void doSetExpectedtime_Equal(String expectedtime) {
        regExpectedtime(CK_EQ, expectedtime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_NotEqual(String expectedtime) {
        doSetExpectedtime_NotEqual(fRES(expectedtime));
    }

    protected void doSetExpectedtime_NotEqual(String expectedtime) {
        regExpectedtime(CK_NES, expectedtime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_GreaterThan(String expectedtime) {
        regExpectedtime(CK_GT, fRES(expectedtime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_LessThan(String expectedtime) {
        regExpectedtime(CK_LT, fRES(expectedtime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_GreaterEqual(String expectedtime) {
        regExpectedtime(CK_GE, fRES(expectedtime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_LessEqual(String expectedtime) {
        regExpectedtime(CK_LE, fRES(expectedtime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtimeList The collection of expectedtime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_InScope(Collection<String> expectedtimeList) {
        doSetExpectedtime_InScope(expectedtimeList);
    }

    protected void doSetExpectedtime_InScope(Collection<String> expectedtimeList) {
        regINS(CK_INS, cTL(expectedtimeList), xgetCValueExpectedtime(), "EXPECTEDTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtimeList The collection of expectedtime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_NotInScope(Collection<String> expectedtimeList) {
        doSetExpectedtime_NotInScope(expectedtimeList);
    }

    protected void doSetExpectedtime_NotInScope(Collection<String> expectedtimeList) {
        regINS(CK_NINS, cTL(expectedtimeList), xgetCValueExpectedtime(), "EXPECTEDTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTEDTIME: {varchar(8)} <br>
     * <pre>e.g. setExpectedtime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param expectedtime The value of expectedtime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpectedtime_LikeSearch(String expectedtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expectedtime), xgetCValueExpectedtime(), "EXPECTEDTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpectedtime_NotLikeSearch(String expectedtime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expectedtime), xgetCValueExpectedtime(), "EXPECTEDTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     * @param expectedtime The value of expectedtime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectedtime_PrefixSearch(String expectedtime) {
        setExpectedtime_LikeSearch(expectedtime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     */
    public void setExpectedtime_IsNull() { regExpectedtime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     */
    public void setExpectedtime_IsNullOrEmpty() { regExpectedtime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTEDTIME: {varchar(8)}
     */
    public void setExpectedtime_IsNotNull() { regExpectedtime(CK_ISNN, DOBJ); }

    protected void regExpectedtime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectedtime(), "EXPECTEDTIME"); }
    protected abstract ConditionValue xgetCValueExpectedtime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_Equal(String otherrefno1) {
        doSetOtherrefno1_Equal(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_Equal(String otherrefno1) {
        regOtherrefno1(CK_EQ, otherrefno1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotEqual(String otherrefno1) {
        doSetOtherrefno1_NotEqual(fRES(otherrefno1));
    }

    protected void doSetOtherrefno1_NotEqual(String otherrefno1) {
        regOtherrefno1(CK_NES, otherrefno1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterThan(String otherrefno1) {
        regOtherrefno1(CK_GT, fRES(otherrefno1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessThan(String otherrefno1) {
        regOtherrefno1(CK_LT, fRES(otherrefno1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_GreaterEqual(String otherrefno1) {
        regOtherrefno1(CK_GE, fRES(otherrefno1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_LessEqual(String otherrefno1) {
        regOtherrefno1(CK_LE, fRES(otherrefno1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1List The collection of otherrefno1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_InScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_InScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_InScope(Collection<String> otherrefno1List) {
        regINS(CK_INS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1List The collection of otherrefno1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        doSetOtherrefno1_NotInScope(otherrefno1List);
    }

    protected void doSetOtherrefno1_NotInScope(Collection<String> otherrefno1List) {
        regINS(CK_NINS, cTL(otherrefno1List), xgetCValueOtherrefno1(), "OTHERREFNO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(60)} <br>
     * <pre>e.g. setOtherrefno1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno1 The value of otherrefno1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno1_LikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno1_NotLikeSearch(String otherrefno1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno1), xgetCValueOtherrefno1(), "OTHERREFNO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     * @param otherrefno1 The value of otherrefno1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno1_PrefixSearch(String otherrefno1) {
        setOtherrefno1_LikeSearch(otherrefno1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     */
    public void setOtherrefno1_IsNull() { regOtherrefno1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     */
    public void setOtherrefno1_IsNullOrEmpty() { regOtherrefno1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO1: {varchar(60)}
     */
    public void setOtherrefno1_IsNotNull() { regOtherrefno1(CK_ISNN, DOBJ); }

    protected void regOtherrefno1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno1(), "OTHERREFNO1"); }
    protected abstract ConditionValue xgetCValueOtherrefno1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_Equal(String otherrefno2) {
        doSetOtherrefno2_Equal(fRES(otherrefno2));
    }

    protected void doSetOtherrefno2_Equal(String otherrefno2) {
        regOtherrefno2(CK_EQ, otherrefno2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_NotEqual(String otherrefno2) {
        doSetOtherrefno2_NotEqual(fRES(otherrefno2));
    }

    protected void doSetOtherrefno2_NotEqual(String otherrefno2) {
        regOtherrefno2(CK_NES, otherrefno2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterThan(String otherrefno2) {
        regOtherrefno2(CK_GT, fRES(otherrefno2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessThan(String otherrefno2) {
        regOtherrefno2(CK_LT, fRES(otherrefno2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_GreaterEqual(String otherrefno2) {
        regOtherrefno2(CK_GE, fRES(otherrefno2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_LessEqual(String otherrefno2) {
        regOtherrefno2(CK_LE, fRES(otherrefno2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2List The collection of otherrefno2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_InScope(Collection<String> otherrefno2List) {
        doSetOtherrefno2_InScope(otherrefno2List);
    }

    protected void doSetOtherrefno2_InScope(Collection<String> otherrefno2List) {
        regINS(CK_INS, cTL(otherrefno2List), xgetCValueOtherrefno2(), "OTHERREFNO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2List The collection of otherrefno2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_NotInScope(Collection<String> otherrefno2List) {
        doSetOtherrefno2_NotInScope(otherrefno2List);
    }

    protected void doSetOtherrefno2_NotInScope(Collection<String> otherrefno2List) {
        regINS(CK_NINS, cTL(otherrefno2List), xgetCValueOtherrefno2(), "OTHERREFNO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)} <br>
     * <pre>e.g. setOtherrefno2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno2 The value of otherrefno2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno2_LikeSearch(String otherrefno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno2), xgetCValueOtherrefno2(), "OTHERREFNO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno2_NotLikeSearch(String otherrefno2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno2), xgetCValueOtherrefno2(), "OTHERREFNO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     * @param otherrefno2 The value of otherrefno2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno2_PrefixSearch(String otherrefno2) {
        setOtherrefno2_LikeSearch(otherrefno2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNull() { regOtherrefno2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNullOrEmpty() { regOtherrefno2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO2: {varchar(60)}
     */
    public void setOtherrefno2_IsNotNull() { regOtherrefno2(CK_ISNN, DOBJ); }

    protected void regOtherrefno2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno2(), "OTHERREFNO2"); }
    protected abstract ConditionValue xgetCValueOtherrefno2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_Equal(String otherrefno3) {
        doSetOtherrefno3_Equal(fRES(otherrefno3));
    }

    protected void doSetOtherrefno3_Equal(String otherrefno3) {
        regOtherrefno3(CK_EQ, otherrefno3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_NotEqual(String otherrefno3) {
        doSetOtherrefno3_NotEqual(fRES(otherrefno3));
    }

    protected void doSetOtherrefno3_NotEqual(String otherrefno3) {
        regOtherrefno3(CK_NES, otherrefno3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_GreaterThan(String otherrefno3) {
        regOtherrefno3(CK_GT, fRES(otherrefno3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_LessThan(String otherrefno3) {
        regOtherrefno3(CK_LT, fRES(otherrefno3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_GreaterEqual(String otherrefno3) {
        regOtherrefno3(CK_GE, fRES(otherrefno3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_LessEqual(String otherrefno3) {
        regOtherrefno3(CK_LE, fRES(otherrefno3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3List The collection of otherrefno3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_InScope(Collection<String> otherrefno3List) {
        doSetOtherrefno3_InScope(otherrefno3List);
    }

    protected void doSetOtherrefno3_InScope(Collection<String> otherrefno3List) {
        regINS(CK_INS, cTL(otherrefno3List), xgetCValueOtherrefno3(), "OTHERREFNO3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3List The collection of otherrefno3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_NotInScope(Collection<String> otherrefno3List) {
        doSetOtherrefno3_NotInScope(otherrefno3List);
    }

    protected void doSetOtherrefno3_NotInScope(Collection<String> otherrefno3List) {
        regINS(CK_NINS, cTL(otherrefno3List), xgetCValueOtherrefno3(), "OTHERREFNO3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {varchar(60)} <br>
     * <pre>e.g. setOtherrefno3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherrefno3 The value of otherrefno3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherrefno3_LikeSearch(String otherrefno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherrefno3), xgetCValueOtherrefno3(), "OTHERREFNO3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherrefno3_NotLikeSearch(String otherrefno3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherrefno3), xgetCValueOtherrefno3(), "OTHERREFNO3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     * @param otherrefno3 The value of otherrefno3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherrefno3_PrefixSearch(String otherrefno3) {
        setOtherrefno3_LikeSearch(otherrefno3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     */
    public void setOtherrefno3_IsNull() { regOtherrefno3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     */
    public void setOtherrefno3_IsNullOrEmpty() { regOtherrefno3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERREFNO3: {varchar(60)}
     */
    public void setOtherrefno3_IsNotNull() { regOtherrefno3(CK_ISNN, DOBJ); }

    protected void regOtherrefno3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherrefno3(), "OTHERREFNO3"); }
    protected abstract ConditionValue xgetCValueOtherrefno3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_Equal(String allocgroup) {
        doSetAllocgroup_Equal(fRES(allocgroup));
    }

    protected void doSetAllocgroup_Equal(String allocgroup) {
        regAllocgroup(CK_EQ, allocgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_NotEqual(String allocgroup) {
        doSetAllocgroup_NotEqual(fRES(allocgroup));
    }

    protected void doSetAllocgroup_NotEqual(String allocgroup) {
        regAllocgroup(CK_NES, allocgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_GreaterThan(String allocgroup) {
        regAllocgroup(CK_GT, fRES(allocgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_LessThan(String allocgroup) {
        regAllocgroup(CK_LT, fRES(allocgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_GreaterEqual(String allocgroup) {
        regAllocgroup(CK_GE, fRES(allocgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_LessEqual(String allocgroup) {
        regAllocgroup(CK_LE, fRES(allocgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroupList The collection of allocgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_InScope(Collection<String> allocgroupList) {
        doSetAllocgroup_InScope(allocgroupList);
    }

    protected void doSetAllocgroup_InScope(Collection<String> allocgroupList) {
        regINS(CK_INS, cTL(allocgroupList), xgetCValueAllocgroup(), "ALLOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroupList The collection of allocgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_NotInScope(Collection<String> allocgroupList) {
        doSetAllocgroup_NotInScope(allocgroupList);
    }

    protected void doSetAllocgroup_NotInScope(Collection<String> allocgroupList) {
        regINS(CK_NINS, cTL(allocgroupList), xgetCValueAllocgroup(), "ALLOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)} <br>
     * <pre>e.g. setAllocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocgroup The value of allocgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocgroup_LikeSearch(String allocgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocgroup), xgetCValueAllocgroup(), "ALLOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocgroup_NotLikeSearch(String allocgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocgroup), xgetCValueAllocgroup(), "ALLOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_PrefixSearch(String allocgroup) {
        setAllocgroup_LikeSearch(allocgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNull() { regAllocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNullOrEmpty() { regAllocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNotNull() { regAllocgroup(CK_ISNN, DOBJ); }

    protected void regAllocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocgroup(), "ALLOCGROUP"); }
    protected abstract ConditionValue xgetCValueAllocgroup();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_Equal(java.math.BigDecimal acceptkey) {
        doSetAcceptkey_Equal(acceptkey);
    }

    protected void doSetAcceptkey_Equal(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_EQ, acceptkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_NotEqual(java.math.BigDecimal acceptkey) {
        doSetAcceptkey_NotEqual(acceptkey);
    }

    protected void doSetAcceptkey_NotEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_NES, acceptkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GT, acceptkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessThan(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LT, acceptkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_GreaterEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_GE, acceptkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkey The value of acceptkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptkey_LessEqual(java.math.BigDecimal acceptkey) {
        regAcceptkey(CK_LE, acceptkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param minNumber The min number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of acceptkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAcceptkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAcceptkey(), "ACCEPTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkeyList The collection of acceptkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptkey_InScope(Collection<java.math.BigDecimal> acceptkeyList) {
        doSetAcceptkey_InScope(acceptkeyList);
    }

    protected void doSetAcceptkey_InScope(Collection<java.math.BigDecimal> acceptkeyList) {
        regINS(CK_INS, cTL(acceptkeyList), xgetCValueAcceptkey(), "ACCEPTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     * @param acceptkeyList The collection of acceptkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptkey_NotInScope(Collection<java.math.BigDecimal> acceptkeyList) {
        doSetAcceptkey_NotInScope(acceptkeyList);
    }

    protected void doSetAcceptkey_NotInScope(Collection<java.math.BigDecimal> acceptkeyList) {
        regINS(CK_NINS, cTL(acceptkeyList), xgetCValueAcceptkey(), "ACCEPTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     */
    public void setAcceptkey_IsNull() { regAcceptkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTKEY: {decimal(16, 6)}
     */
    public void setAcceptkey_IsNotNull() { regAcceptkey(CK_ISNN, DOBJ); }

    protected void regAcceptkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptkey(), "ACCEPTKEY"); }
    protected abstract ConditionValue xgetCValueAcceptkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_Equal(String acceptusercd) {
        doSetAcceptusercd_Equal(fRES(acceptusercd));
    }

    protected void doSetAcceptusercd_Equal(String acceptusercd) {
        regAcceptusercd(CK_EQ, acceptusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_NotEqual(String acceptusercd) {
        doSetAcceptusercd_NotEqual(fRES(acceptusercd));
    }

    protected void doSetAcceptusercd_NotEqual(String acceptusercd) {
        regAcceptusercd(CK_NES, acceptusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterThan(String acceptusercd) {
        regAcceptusercd(CK_GT, fRES(acceptusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessThan(String acceptusercd) {
        regAcceptusercd(CK_LT, fRES(acceptusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_GreaterEqual(String acceptusercd) {
        regAcceptusercd(CK_GE, fRES(acceptusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_LessEqual(String acceptusercd) {
        regAcceptusercd(CK_LE, fRES(acceptusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_InScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_InScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_InScope(Collection<String> acceptusercdList) {
        regINS(CK_INS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "ACCEPTUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercdList The collection of acceptusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        doSetAcceptusercd_NotInScope(acceptusercdList);
    }

    protected void doSetAcceptusercd_NotInScope(Collection<String> acceptusercdList) {
        regINS(CK_NINS, cTL(acceptusercdList), xgetCValueAcceptusercd(), "ACCEPTUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)} <br>
     * <pre>e.g. setAcceptusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param acceptusercd The value of acceptusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptusercd_LikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptusercd), xgetCValueAcceptusercd(), "ACCEPTUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptusercd_NotLikeSearch(String acceptusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptusercd), xgetCValueAcceptusercd(), "ACCEPTUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     * @param acceptusercd The value of acceptusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptusercd_PrefixSearch(String acceptusercd) {
        setAcceptusercd_LikeSearch(acceptusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNull() { regAcceptusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNullOrEmpty() { regAcceptusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTUSERCD: {varchar(30)}
     */
    public void setAcceptusercd_IsNotNull() { regAcceptusercd(CK_ISNN, DOBJ); }

    protected void regAcceptusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptusercd(), "ACCEPTUSERCD"); }
    protected abstract ConditionValue xgetCValueAcceptusercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_Equal(String inspectedusercd) {
        doSetInspectedusercd_Equal(fRES(inspectedusercd));
    }

    protected void doSetInspectedusercd_Equal(String inspectedusercd) {
        regInspectedusercd(CK_EQ, inspectedusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_NotEqual(String inspectedusercd) {
        doSetInspectedusercd_NotEqual(fRES(inspectedusercd));
    }

    protected void doSetInspectedusercd_NotEqual(String inspectedusercd) {
        regInspectedusercd(CK_NES, inspectedusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_GreaterThan(String inspectedusercd) {
        regInspectedusercd(CK_GT, fRES(inspectedusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_LessThan(String inspectedusercd) {
        regInspectedusercd(CK_LT, fRES(inspectedusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_GreaterEqual(String inspectedusercd) {
        regInspectedusercd(CK_GE, fRES(inspectedusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_LessEqual(String inspectedusercd) {
        regInspectedusercd(CK_LE, fRES(inspectedusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercdList The collection of inspectedusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_InScope(Collection<String> inspectedusercdList) {
        doSetInspectedusercd_InScope(inspectedusercdList);
    }

    protected void doSetInspectedusercd_InScope(Collection<String> inspectedusercdList) {
        regINS(CK_INS, cTL(inspectedusercdList), xgetCValueInspectedusercd(), "INSPECTEDUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercdList The collection of inspectedusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_NotInScope(Collection<String> inspectedusercdList) {
        doSetInspectedusercd_NotInScope(inspectedusercdList);
    }

    protected void doSetInspectedusercd_NotInScope(Collection<String> inspectedusercdList) {
        regINS(CK_NINS, cTL(inspectedusercdList), xgetCValueInspectedusercd(), "INSPECTEDUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)} <br>
     * <pre>e.g. setInspectedusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inspectedusercd The value of inspectedusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInspectedusercd_LikeSearch(String inspectedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inspectedusercd), xgetCValueInspectedusercd(), "INSPECTEDUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInspectedusercd_NotLikeSearch(String inspectedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inspectedusercd), xgetCValueInspectedusercd(), "INSPECTEDUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_PrefixSearch(String inspectedusercd) {
        setInspectedusercd_LikeSearch(inspectedusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNull() { regInspectedusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNullOrEmpty() { regInspectedusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNotNull() { regInspectedusercd(CK_ISNN, DOBJ); }

    protected void regInspectedusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedusercd(), "INSPECTEDUSERCD"); }
    protected abstract ConditionValue xgetCValueInspectedusercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_Equal(String receivedusercd) {
        doSetReceivedusercd_Equal(fRES(receivedusercd));
    }

    protected void doSetReceivedusercd_Equal(String receivedusercd) {
        regReceivedusercd(CK_EQ, receivedusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_NotEqual(String receivedusercd) {
        doSetReceivedusercd_NotEqual(fRES(receivedusercd));
    }

    protected void doSetReceivedusercd_NotEqual(String receivedusercd) {
        regReceivedusercd(CK_NES, receivedusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_GreaterThan(String receivedusercd) {
        regReceivedusercd(CK_GT, fRES(receivedusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_LessThan(String receivedusercd) {
        regReceivedusercd(CK_LT, fRES(receivedusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_GreaterEqual(String receivedusercd) {
        regReceivedusercd(CK_GE, fRES(receivedusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_LessEqual(String receivedusercd) {
        regReceivedusercd(CK_LE, fRES(receivedusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercdList The collection of receivedusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_InScope(Collection<String> receivedusercdList) {
        doSetReceivedusercd_InScope(receivedusercdList);
    }

    protected void doSetReceivedusercd_InScope(Collection<String> receivedusercdList) {
        regINS(CK_INS, cTL(receivedusercdList), xgetCValueReceivedusercd(), "RECEIVEDUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercdList The collection of receivedusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_NotInScope(Collection<String> receivedusercdList) {
        doSetReceivedusercd_NotInScope(receivedusercdList);
    }

    protected void doSetReceivedusercd_NotInScope(Collection<String> receivedusercdList) {
        regINS(CK_NINS, cTL(receivedusercdList), xgetCValueReceivedusercd(), "RECEIVEDUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)} <br>
     * <pre>e.g. setReceivedusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedusercd The value of receivedusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedusercd_LikeSearch(String receivedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedusercd), xgetCValueReceivedusercd(), "RECEIVEDUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedusercd_NotLikeSearch(String receivedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedusercd), xgetCValueReceivedusercd(), "RECEIVEDUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     * @param receivedusercd The value of receivedusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedusercd_PrefixSearch(String receivedusercd) {
        setReceivedusercd_LikeSearch(receivedusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     */
    public void setReceivedusercd_IsNull() { regReceivedusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     */
    public void setReceivedusercd_IsNullOrEmpty() { regReceivedusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDUSERCD: {varchar(30)}
     */
    public void setReceivedusercd_IsNotNull() { regReceivedusercd(CK_ISNN, DOBJ); }

    protected void regReceivedusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedusercd(), "RECEIVEDUSERCD"); }
    protected abstract ConditionValue xgetCValueReceivedusercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_Equal(java.math.BigDecimal movekey) {
        doSetMovekey_Equal(movekey);
    }

    protected void doSetMovekey_Equal(java.math.BigDecimal movekey) {
        regMovekey(CK_EQ, movekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_NotEqual(java.math.BigDecimal movekey) {
        doSetMovekey_NotEqual(movekey);
    }

    protected void doSetMovekey_NotEqual(java.math.BigDecimal movekey) {
        regMovekey(CK_NES, movekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_GreaterThan(java.math.BigDecimal movekey) {
        regMovekey(CK_GT, movekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_LessThan(java.math.BigDecimal movekey) {
        regMovekey(CK_LT, movekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_GreaterEqual(java.math.BigDecimal movekey) {
        regMovekey(CK_GE, movekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekey The value of movekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMovekey_LessEqual(java.math.BigDecimal movekey) {
        regMovekey(CK_LE, movekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param minNumber The min number of movekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of movekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMovekey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMovekey(), "MOVEKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekeyList The collection of movekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovekey_InScope(Collection<java.math.BigDecimal> movekeyList) {
        doSetMovekey_InScope(movekeyList);
    }

    protected void doSetMovekey_InScope(Collection<java.math.BigDecimal> movekeyList) {
        regINS(CK_INS, cTL(movekeyList), xgetCValueMovekey(), "MOVEKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     * @param movekeyList The collection of movekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMovekey_NotInScope(Collection<java.math.BigDecimal> movekeyList) {
        doSetMovekey_NotInScope(movekeyList);
    }

    protected void doSetMovekey_NotInScope(Collection<java.math.BigDecimal> movekeyList) {
        regINS(CK_NINS, cTL(movekeyList), xgetCValueMovekey(), "MOVEKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     */
    public void setMovekey_IsNull() { regMovekey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOVEKEY: {decimal(16, 6)}
     */
    public void setMovekey_IsNotNull() { regMovekey(CK_ISNN, DOBJ); }

    protected void regMovekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMovekey(), "MOVEKEY"); }
    protected abstract ConditionValue xgetCValueMovekey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_Equal(java.math.BigDecimal assykey) {
        doSetAssykey_Equal(assykey);
    }

    protected void doSetAssykey_Equal(java.math.BigDecimal assykey) {
        regAssykey(CK_EQ, assykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_NotEqual(java.math.BigDecimal assykey) {
        doSetAssykey_NotEqual(assykey);
    }

    protected void doSetAssykey_NotEqual(java.math.BigDecimal assykey) {
        regAssykey(CK_NES, assykey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_GreaterThan(java.math.BigDecimal assykey) {
        regAssykey(CK_GT, assykey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_LessThan(java.math.BigDecimal assykey) {
        regAssykey(CK_LT, assykey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_GreaterEqual(java.math.BigDecimal assykey) {
        regAssykey(CK_GE, assykey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykey The value of assykey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssykey_LessEqual(java.math.BigDecimal assykey) {
        regAssykey(CK_LE, assykey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param minNumber The min number of assykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssykey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssykey(), "ASSYKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykeyList The collection of assykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssykey_InScope(Collection<java.math.BigDecimal> assykeyList) {
        doSetAssykey_InScope(assykeyList);
    }

    protected void doSetAssykey_InScope(Collection<java.math.BigDecimal> assykeyList) {
        regINS(CK_INS, cTL(assykeyList), xgetCValueAssykey(), "ASSYKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     * @param assykeyList The collection of assykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssykey_NotInScope(Collection<java.math.BigDecimal> assykeyList) {
        doSetAssykey_NotInScope(assykeyList);
    }

    protected void doSetAssykey_NotInScope(Collection<java.math.BigDecimal> assykeyList) {
        regINS(CK_NINS, cTL(assykeyList), xgetCValueAssykey(), "ASSYKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     */
    public void setAssykey_IsNull() { regAssykey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSYKEY: {decimal(16, 6)}
     */
    public void setAssykey_IsNotNull() { regAssykey(CK_ISNN, DOBJ); }

    protected void regAssykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssykey(), "ASSYKEY"); }
    protected abstract ConditionValue xgetCValueAssykey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_Equal(Long producekey) {
        doSetProducekey_Equal(producekey);
    }

    protected void doSetProducekey_Equal(Long producekey) {
        regProducekey(CK_EQ, producekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_NotEqual(Long producekey) {
        doSetProducekey_NotEqual(producekey);
    }

    protected void doSetProducekey_NotEqual(Long producekey) {
        regProducekey(CK_NES, producekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_GreaterThan(Long producekey) {
        regProducekey(CK_GT, producekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_LessThan(Long producekey) {
        regProducekey(CK_LT, producekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_GreaterEqual(Long producekey) {
        regProducekey(CK_GE, producekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekey The value of producekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProducekey_LessEqual(Long producekey) {
        regProducekey(CK_LE, producekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param minNumber The min number of producekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of producekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProducekey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProducekey(), "PRODUCEKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekeyList The collection of producekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProducekey_InScope(Collection<Long> producekeyList) {
        doSetProducekey_InScope(producekeyList);
    }

    protected void doSetProducekey_InScope(Collection<Long> producekeyList) {
        regINS(CK_INS, cTL(producekeyList), xgetCValueProducekey(), "PRODUCEKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     * @param producekeyList The collection of producekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProducekey_NotInScope(Collection<Long> producekeyList) {
        doSetProducekey_NotInScope(producekeyList);
    }

    protected void doSetProducekey_NotInScope(Collection<Long> producekeyList) {
        regINS(CK_NINS, cTL(producekeyList), xgetCValueProducekey(), "PRODUCEKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     */
    public void setProducekey_IsNull() { regProducekey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCEKEY: {bigint(19)}
     */
    public void setProducekey_IsNotNull() { regProducekey(CK_ISNN, DOBJ); }

    protected void regProducekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProducekey(), "PRODUCEKEY"); }
    protected abstract ConditionValue xgetCValueProducekey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_Equal(String syhnKbn) {
        doSetSyhnKbn_Equal(fRES(syhnKbn));
    }

    protected void doSetSyhnKbn_Equal(String syhnKbn) {
        regSyhnKbn(CK_EQ, syhnKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_NotEqual(String syhnKbn) {
        doSetSyhnKbn_NotEqual(fRES(syhnKbn));
    }

    protected void doSetSyhnKbn_NotEqual(String syhnKbn) {
        regSyhnKbn(CK_NES, syhnKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_GreaterThan(String syhnKbn) {
        regSyhnKbn(CK_GT, fRES(syhnKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_LessThan(String syhnKbn) {
        regSyhnKbn(CK_LT, fRES(syhnKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_GreaterEqual(String syhnKbn) {
        regSyhnKbn(CK_GE, fRES(syhnKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_LessEqual(String syhnKbn) {
        regSyhnKbn(CK_LE, fRES(syhnKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbnList The collection of syhnKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_InScope(Collection<String> syhnKbnList) {
        doSetSyhnKbn_InScope(syhnKbnList);
    }

    protected void doSetSyhnKbn_InScope(Collection<String> syhnKbnList) {
        regINS(CK_INS, cTL(syhnKbnList), xgetCValueSyhnKbn(), "SYHN_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbnList The collection of syhnKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_NotInScope(Collection<String> syhnKbnList) {
        doSetSyhnKbn_NotInScope(syhnKbnList);
    }

    protected void doSetSyhnKbn_NotInScope(Collection<String> syhnKbnList) {
        regINS(CK_NINS, cTL(syhnKbnList), xgetCValueSyhnKbn(), "SYHN_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHN_KBN: {varchar(30)} <br>
     * <pre>e.g. setSyhnKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param syhnKbn The value of syhnKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSyhnKbn_LikeSearch(String syhnKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(syhnKbn), xgetCValueSyhnKbn(), "SYHN_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSyhnKbn_NotLikeSearch(String syhnKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(syhnKbn), xgetCValueSyhnKbn(), "SYHN_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     * @param syhnKbn The value of syhnKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSyhnKbn_PrefixSearch(String syhnKbn) {
        setSyhnKbn_LikeSearch(syhnKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     */
    public void setSyhnKbn_IsNull() { regSyhnKbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     */
    public void setSyhnKbn_IsNullOrEmpty() { regSyhnKbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYHN_KBN: {varchar(30)}
     */
    public void setSyhnKbn_IsNotNull() { regSyhnKbn(CK_ISNN, DOBJ); }

    protected void regSyhnKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSyhnKbn(), "SYHN_KBN"); }
    protected abstract ConditionValue xgetCValueSyhnKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_Equal(String cggdid) {
        doSetCggdid_Equal(fRES(cggdid));
    }

    protected void doSetCggdid_Equal(String cggdid) {
        regCggdid(CK_EQ, cggdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotEqual(String cggdid) {
        doSetCggdid_NotEqual(fRES(cggdid));
    }

    protected void doSetCggdid_NotEqual(String cggdid) {
        regCggdid(CK_NES, cggdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterThan(String cggdid) {
        regCggdid(CK_GT, fRES(cggdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessThan(String cggdid) {
        regCggdid(CK_LT, fRES(cggdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_GreaterEqual(String cggdid) {
        regCggdid(CK_GE, fRES(cggdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_LessEqual(String cggdid) {
        regCggdid(CK_LE, fRES(cggdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_InScope(Collection<String> cggdidList) {
        doSetCggdid_InScope(cggdidList);
    }

    protected void doSetCggdid_InScope(Collection<String> cggdidList) {
        regINS(CK_INS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdidList The collection of cggdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_NotInScope(Collection<String> cggdidList) {
        doSetCggdid_NotInScope(cggdidList);
    }

    protected void doSetCggdid_NotInScope(Collection<String> cggdidList) {
        regINS(CK_NINS, cTL(cggdidList), xgetCValueCggdid(), "CGGDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)} <br>
     * <pre>e.g. setCggdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cggdid The value of cggdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCggdid_LikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCggdid_NotLikeSearch(String cggdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cggdid), xgetCValueCggdid(), "CGGDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CGGDID: {varchar(30)}
     * @param cggdid The value of cggdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCggdid_PrefixSearch(String cggdid) {
        setCggdid_LikeSearch(cggdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNull() { regCggdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNullOrEmpty() { regCggdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CGGDID: {varchar(30)}
     */
    public void setCggdid_IsNotNull() { regCggdid(CK_ISNN, DOBJ); }

    protected void regCggdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCggdid(), "CGGDID"); }
    protected abstract ConditionValue xgetCValueCggdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_Equal(String confirmedFlg) {
        doSetConfirmedFlg_Equal(fRES(confirmedFlg));
    }

    protected void doSetConfirmedFlg_Equal(String confirmedFlg) {
        regConfirmedFlg(CK_EQ, confirmedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_NotEqual(String confirmedFlg) {
        doSetConfirmedFlg_NotEqual(fRES(confirmedFlg));
    }

    protected void doSetConfirmedFlg_NotEqual(String confirmedFlg) {
        regConfirmedFlg(CK_NES, confirmedFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_GreaterThan(String confirmedFlg) {
        regConfirmedFlg(CK_GT, fRES(confirmedFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_LessThan(String confirmedFlg) {
        regConfirmedFlg(CK_LT, fRES(confirmedFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_GreaterEqual(String confirmedFlg) {
        regConfirmedFlg(CK_GE, fRES(confirmedFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_LessEqual(String confirmedFlg) {
        regConfirmedFlg(CK_LE, fRES(confirmedFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlgList The collection of confirmedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_InScope(Collection<String> confirmedFlgList) {
        doSetConfirmedFlg_InScope(confirmedFlgList);
    }

    protected void doSetConfirmedFlg_InScope(Collection<String> confirmedFlgList) {
        regINS(CK_INS, cTL(confirmedFlgList), xgetCValueConfirmedFlg(), "CONFIRMED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlgList The collection of confirmedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_NotInScope(Collection<String> confirmedFlgList) {
        doSetConfirmedFlg_NotInScope(confirmedFlgList);
    }

    protected void doSetConfirmedFlg_NotInScope(Collection<String> confirmedFlgList) {
        regINS(CK_NINS, cTL(confirmedFlgList), xgetCValueConfirmedFlg(), "CONFIRMED_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_FLG: {char(1)} <br>
     * <pre>e.g. setConfirmedFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param confirmedFlg The value of confirmedFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConfirmedFlg_LikeSearch(String confirmedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(confirmedFlg), xgetCValueConfirmedFlg(), "CONFIRMED_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConfirmedFlg_NotLikeSearch(String confirmedFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(confirmedFlg), xgetCValueConfirmedFlg(), "CONFIRMED_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     * @param confirmedFlg The value of confirmedFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedFlg_PrefixSearch(String confirmedFlg) {
        setConfirmedFlg_LikeSearch(confirmedFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     */
    public void setConfirmedFlg_IsNull() { regConfirmedFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_FLG: {char(1)}
     */
    public void setConfirmedFlg_IsNotNull() { regConfirmedFlg(CK_ISNN, DOBJ); }

    protected void regConfirmedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfirmedFlg(), "CONFIRMED_FLG"); }
    protected abstract ConditionValue xgetCValueConfirmedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_Equal(String sufferUsageFlg) {
        doSetSufferUsageFlg_Equal(fRES(sufferUsageFlg));
    }

    protected void doSetSufferUsageFlg_Equal(String sufferUsageFlg) {
        regSufferUsageFlg(CK_EQ, sufferUsageFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_NotEqual(String sufferUsageFlg) {
        doSetSufferUsageFlg_NotEqual(fRES(sufferUsageFlg));
    }

    protected void doSetSufferUsageFlg_NotEqual(String sufferUsageFlg) {
        regSufferUsageFlg(CK_NES, sufferUsageFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_GreaterThan(String sufferUsageFlg) {
        regSufferUsageFlg(CK_GT, fRES(sufferUsageFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_LessThan(String sufferUsageFlg) {
        regSufferUsageFlg(CK_LT, fRES(sufferUsageFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_GreaterEqual(String sufferUsageFlg) {
        regSufferUsageFlg(CK_GE, fRES(sufferUsageFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_LessEqual(String sufferUsageFlg) {
        regSufferUsageFlg(CK_LE, fRES(sufferUsageFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlgList The collection of sufferUsageFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_InScope(Collection<String> sufferUsageFlgList) {
        doSetSufferUsageFlg_InScope(sufferUsageFlgList);
    }

    protected void doSetSufferUsageFlg_InScope(Collection<String> sufferUsageFlgList) {
        regINS(CK_INS, cTL(sufferUsageFlgList), xgetCValueSufferUsageFlg(), "SUFFER_USAGE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlgList The collection of sufferUsageFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_NotInScope(Collection<String> sufferUsageFlgList) {
        doSetSufferUsageFlg_NotInScope(sufferUsageFlgList);
    }

    protected void doSetSufferUsageFlg_NotInScope(Collection<String> sufferUsageFlgList) {
        regINS(CK_NINS, cTL(sufferUsageFlgList), xgetCValueSufferUsageFlg(), "SUFFER_USAGE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)} <br>
     * <pre>e.g. setSufferUsageFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sufferUsageFlg The value of sufferUsageFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSufferUsageFlg_LikeSearch(String sufferUsageFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sufferUsageFlg), xgetCValueSufferUsageFlg(), "SUFFER_USAGE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSufferUsageFlg_NotLikeSearch(String sufferUsageFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sufferUsageFlg), xgetCValueSufferUsageFlg(), "SUFFER_USAGE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     * @param sufferUsageFlg The value of sufferUsageFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSufferUsageFlg_PrefixSearch(String sufferUsageFlg) {
        setSufferUsageFlg_LikeSearch(sufferUsageFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     */
    public void setSufferUsageFlg_IsNull() { regSufferUsageFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUFFER_USAGE_FLG: {char(1)}
     */
    public void setSufferUsageFlg_IsNotNull() { regSufferUsageFlg(CK_ISNN, DOBJ); }

    protected void regSufferUsageFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSufferUsageFlg(), "SUFFER_USAGE_FLG"); }
    protected abstract ConditionValue xgetCValueSufferUsageFlg();

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
    public HpSLCFunction<TTrsreplanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsreplanCB.class);
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
    public HpSLCFunction<TTrsreplanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsreplanCB.class);
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
    public HpSLCFunction<TTrsreplanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsreplanCB.class);
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
    public HpSLCFunction<TTrsreplanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsreplanCB.class);
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
    public HpSLCFunction<TTrsreplanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsreplanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsreplanCB&gt;() {
     *     public void query(TTrsreplanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsreplanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsreplanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsreplanCQ sq);

    protected TTrsreplanCB xcreateScalarConditionCB() {
        TTrsreplanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsreplanCB xcreateScalarConditionPartitionByCB() {
        TTrsreplanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsreplanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplanCB cb = new TTrsreplanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSREPLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsreplanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsreplanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsreplanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsreplanCB cb = new TTrsreplanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSREPLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsreplanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsreplanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsreplanCB cb = new TTrsreplanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsreplanCQ sq);

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
    protected TTrsreplanCB newMyCB() {
        return new TTrsreplanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsreplanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
