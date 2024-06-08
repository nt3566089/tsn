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
 * The abstract condition-query of T_TRSORCVDIRECT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsorcvdirectCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsorcvdirectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSORCVDIRECT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_Equal(Long sojtlineid) {
        doSetSojtlineid_Equal(sojtlineid);
    }

    protected void doSetSojtlineid_Equal(Long sojtlineid) {
        regSojtlineid(CK_EQ, sojtlineid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_NotEqual(Long sojtlineid) {
        doSetSojtlineid_NotEqual(sojtlineid);
    }

    protected void doSetSojtlineid_NotEqual(Long sojtlineid) {
        regSojtlineid(CK_NES, sojtlineid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_GreaterThan(Long sojtlineid) {
        regSojtlineid(CK_GT, sojtlineid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_LessThan(Long sojtlineid) {
        regSojtlineid(CK_LT, sojtlineid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_GreaterEqual(Long sojtlineid) {
        regSojtlineid(CK_GE, sojtlineid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_LessEqual(Long sojtlineid) {
        regSojtlineid(CK_LE, sojtlineid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sojtlineid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtlineid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtlineid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtlineid(), "SOJTLINEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineidList The collection of sojtlineid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineid_InScope(Collection<Long> sojtlineidList) {
        doSetSojtlineid_InScope(sojtlineidList);
    }

    protected void doSetSojtlineid_InScope(Collection<Long> sojtlineidList) {
        regINS(CK_INS, cTL(sojtlineidList), xgetCValueSojtlineid(), "SOJTLINEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineidList The collection of sojtlineid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineid_NotInScope(Collection<Long> sojtlineidList) {
        doSetSojtlineid_NotInScope(sojtlineidList);
    }

    protected void doSetSojtlineid_NotInScope(Collection<Long> sojtlineidList) {
        regINS(CK_NINS, cTL(sojtlineidList), xgetCValueSojtlineid(), "SOJTLINEID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtlineid_IsNull() { regSojtlineid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtlineid_IsNotNull() { regSojtlineid(CK_ISNN, DOBJ); }

    protected void regSojtlineid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtlineid(), "SOJTLINEID"); }
    protected abstract ConditionValue xgetCValueSojtlineid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_Equal(Long sorcvdirectkey) {
        doSetSorcvdirectkey_Equal(sorcvdirectkey);
    }

    protected void doSetSorcvdirectkey_Equal(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_EQ, sorcvdirectkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_NotEqual(Long sorcvdirectkey) {
        doSetSorcvdirectkey_NotEqual(sorcvdirectkey);
    }

    protected void doSetSorcvdirectkey_NotEqual(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_NES, sorcvdirectkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_GreaterThan(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_GT, sorcvdirectkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_LessThan(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_LT, sorcvdirectkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_GreaterEqual(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_GE, sorcvdirectkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkey The value of sorcvdirectkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_LessEqual(Long sorcvdirectkey) {
        regSorcvdirectkey(CK_LE, sorcvdirectkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param minNumber The min number of sorcvdirectkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sorcvdirectkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSorcvdirectkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSorcvdirectkey(), "SoRcvDirectKey", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkeyList The collection of sorcvdirectkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_InScope(Collection<Long> sorcvdirectkeyList) {
        doSetSorcvdirectkey_InScope(sorcvdirectkeyList);
    }

    protected void doSetSorcvdirectkey_InScope(Collection<Long> sorcvdirectkeyList) {
        regINS(CK_INS, cTL(sorcvdirectkeyList), xgetCValueSorcvdirectkey(), "SoRcvDirectKey");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     * @param sorcvdirectkeyList The collection of sorcvdirectkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSorcvdirectkey_NotInScope(Collection<Long> sorcvdirectkeyList) {
        doSetSorcvdirectkey_NotInScope(sorcvdirectkeyList);
    }

    protected void doSetSorcvdirectkey_NotInScope(Collection<Long> sorcvdirectkeyList) {
        regINS(CK_NINS, cTL(sorcvdirectkeyList), xgetCValueSorcvdirectkey(), "SoRcvDirectKey");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     */
    public void setSorcvdirectkey_IsNull() { regSorcvdirectkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SoRcvDirectKey: {bigint(19)}
     */
    public void setSorcvdirectkey_IsNotNull() { regSorcvdirectkey(CK_ISNN, DOBJ); }

    protected void regSorcvdirectkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSorcvdirectkey(), "SoRcvDirectKey"); }
    protected abstract ConditionValue xgetCValueSorcvdirectkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_Equal(String instructionsdate) {
        doSetInstructionsdate_Equal(fRES(instructionsdate));
    }

    protected void doSetInstructionsdate_Equal(String instructionsdate) {
        regInstructionsdate(CK_EQ, instructionsdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_NotEqual(String instructionsdate) {
        doSetInstructionsdate_NotEqual(fRES(instructionsdate));
    }

    protected void doSetInstructionsdate_NotEqual(String instructionsdate) {
        regInstructionsdate(CK_NES, instructionsdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_GreaterThan(String instructionsdate) {
        regInstructionsdate(CK_GT, fRES(instructionsdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_LessThan(String instructionsdate) {
        regInstructionsdate(CK_LT, fRES(instructionsdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_GreaterEqual(String instructionsdate) {
        regInstructionsdate(CK_GE, fRES(instructionsdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_LessEqual(String instructionsdate) {
        regInstructionsdate(CK_LE, fRES(instructionsdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdateList The collection of instructionsdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_InScope(Collection<String> instructionsdateList) {
        doSetInstructionsdate_InScope(instructionsdateList);
    }

    protected void doSetInstructionsdate_InScope(Collection<String> instructionsdateList) {
        regINS(CK_INS, cTL(instructionsdateList), xgetCValueInstructionsdate(), "InstructionsDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdateList The collection of instructionsdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_NotInScope(Collection<String> instructionsdateList) {
        doSetInstructionsdate_NotInScope(instructionsdateList);
    }

    protected void doSetInstructionsdate_NotInScope(Collection<String> instructionsdateList) {
        regINS(CK_NINS, cTL(instructionsdateList), xgetCValueInstructionsdate(), "InstructionsDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)} <br>
     * <pre>e.g. setInstructionsdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param instructionsdate The value of instructionsdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInstructionsdate_LikeSearch(String instructionsdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(instructionsdate), xgetCValueInstructionsdate(), "InstructionsDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInstructionsdate_NotLikeSearch(String instructionsdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(instructionsdate), xgetCValueInstructionsdate(), "InstructionsDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * InstructionsDate: {NotNull, varchar(8)}
     * @param instructionsdate The value of instructionsdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstructionsdate_PrefixSearch(String instructionsdate) {
        setInstructionsdate_LikeSearch(instructionsdate, xcLSOPPre());
    }

    protected void regInstructionsdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstructionsdate(), "InstructionsDate"); }
    protected abstract ConditionValue xgetCValueInstructionsdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_Equal(String ownerdirectno) {
        doSetOwnerdirectno_Equal(fRES(ownerdirectno));
    }

    protected void doSetOwnerdirectno_Equal(String ownerdirectno) {
        regOwnerdirectno(CK_EQ, ownerdirectno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_NotEqual(String ownerdirectno) {
        doSetOwnerdirectno_NotEqual(fRES(ownerdirectno));
    }

    protected void doSetOwnerdirectno_NotEqual(String ownerdirectno) {
        regOwnerdirectno(CK_NES, ownerdirectno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_GreaterThan(String ownerdirectno) {
        regOwnerdirectno(CK_GT, fRES(ownerdirectno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_LessThan(String ownerdirectno) {
        regOwnerdirectno(CK_LT, fRES(ownerdirectno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_GreaterEqual(String ownerdirectno) {
        regOwnerdirectno(CK_GE, fRES(ownerdirectno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_LessEqual(String ownerdirectno) {
        regOwnerdirectno(CK_LE, fRES(ownerdirectno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectnoList The collection of ownerdirectno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_InScope(Collection<String> ownerdirectnoList) {
        doSetOwnerdirectno_InScope(ownerdirectnoList);
    }

    protected void doSetOwnerdirectno_InScope(Collection<String> ownerdirectnoList) {
        regINS(CK_INS, cTL(ownerdirectnoList), xgetCValueOwnerdirectno(), "OwnerDirectNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectnoList The collection of ownerdirectno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_NotInScope(Collection<String> ownerdirectnoList) {
        doSetOwnerdirectno_NotInScope(ownerdirectnoList);
    }

    protected void doSetOwnerdirectno_NotInScope(Collection<String> ownerdirectnoList) {
        regINS(CK_NINS, cTL(ownerdirectnoList), xgetCValueOwnerdirectno(), "OwnerDirectNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnerdirectno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerdirectno The value of ownerdirectno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerdirectno_LikeSearch(String ownerdirectno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerdirectno), xgetCValueOwnerdirectno(), "OwnerDirectNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerdirectno_NotLikeSearch(String ownerdirectno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerdirectno), xgetCValueOwnerdirectno(), "OwnerDirectNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @param ownerdirectno The value of ownerdirectno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerdirectno_PrefixSearch(String ownerdirectno) {
        setOwnerdirectno_LikeSearch(ownerdirectno, xcLSOPPre());
    }

    protected void regOwnerdirectno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerdirectno(), "OwnerDirectNo"); }
    protected abstract ConditionValue xgetCValueOwnerdirectno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_Equal(String salestype) {
        doSetSalestype_Equal(fRES(salestype));
    }

    protected void doSetSalestype_Equal(String salestype) {
        regSalestype(CK_EQ, salestype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_NotEqual(String salestype) {
        doSetSalestype_NotEqual(fRES(salestype));
    }

    protected void doSetSalestype_NotEqual(String salestype) {
        regSalestype(CK_NES, salestype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_GreaterThan(String salestype) {
        regSalestype(CK_GT, fRES(salestype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_LessThan(String salestype) {
        regSalestype(CK_LT, fRES(salestype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_GreaterEqual(String salestype) {
        regSalestype(CK_GE, fRES(salestype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_LessEqual(String salestype) {
        regSalestype(CK_LE, fRES(salestype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestypeList The collection of salestype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_InScope(Collection<String> salestypeList) {
        doSetSalestype_InScope(salestypeList);
    }

    protected void doSetSalestype_InScope(Collection<String> salestypeList) {
        regINS(CK_INS, cTL(salestypeList), xgetCValueSalestype(), "SalesType");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestypeList The collection of salestype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_NotInScope(Collection<String> salestypeList) {
        doSetSalestype_NotInScope(salestypeList);
    }

    protected void doSetSalestype_NotInScope(Collection<String> salestypeList) {
        regINS(CK_NINS, cTL(salestypeList), xgetCValueSalestype(), "SalesType");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesType: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSalestype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salestype The value of salestype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalestype_LikeSearch(String salestype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salestype), xgetCValueSalestype(), "SalesType", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalestype_NotLikeSearch(String salestype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salestype), xgetCValueSalestype(), "SalesType", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesType: {NotNull, varchar(30)}
     * @param salestype The value of salestype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestype_PrefixSearch(String salestype) {
        setSalestype_LikeSearch(salestype, xcLSOPPre());
    }

    protected void regSalestype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalestype(), "SalesType"); }
    protected abstract ConditionValue xgetCValueSalestype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_Equal(String salestypecd) {
        doSetSalestypecd_Equal(fRES(salestypecd));
    }

    protected void doSetSalestypecd_Equal(String salestypecd) {
        regSalestypecd(CK_EQ, salestypecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_NotEqual(String salestypecd) {
        doSetSalestypecd_NotEqual(fRES(salestypecd));
    }

    protected void doSetSalestypecd_NotEqual(String salestypecd) {
        regSalestypecd(CK_NES, salestypecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_GreaterThan(String salestypecd) {
        regSalestypecd(CK_GT, fRES(salestypecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_LessThan(String salestypecd) {
        regSalestypecd(CK_LT, fRES(salestypecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_GreaterEqual(String salestypecd) {
        regSalestypecd(CK_GE, fRES(salestypecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_LessEqual(String salestypecd) {
        regSalestypecd(CK_LE, fRES(salestypecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecdList The collection of salestypecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_InScope(Collection<String> salestypecdList) {
        doSetSalestypecd_InScope(salestypecdList);
    }

    protected void doSetSalestypecd_InScope(Collection<String> salestypecdList) {
        regINS(CK_INS, cTL(salestypecdList), xgetCValueSalestypecd(), "SalesTypeCd");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecdList The collection of salestypecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_NotInScope(Collection<String> salestypecdList) {
        doSetSalestypecd_NotInScope(salestypecdList);
    }

    protected void doSetSalestypecd_NotInScope(Collection<String> salestypecdList) {
        regINS(CK_NINS, cTL(salestypecdList), xgetCValueSalestypecd(), "SalesTypeCd");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)} <br>
     * <pre>e.g. setSalestypecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salestypecd The value of salestypecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalestypecd_LikeSearch(String salestypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salestypecd), xgetCValueSalestypecd(), "SalesTypeCd", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalestypecd_NotLikeSearch(String salestypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salestypecd), xgetCValueSalestypecd(), "SalesTypeCd", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SalesTypeCd: {NotNull, char(1)}
     * @param salestypecd The value of salestypecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalestypecd_PrefixSearch(String salestypecd) {
        setSalestypecd_LikeSearch(salestypecd, xcLSOPPre());
    }

    protected void regSalestypecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalestypecd(), "SalesTypeCd"); }
    protected abstract ConditionValue xgetCValueSalestypecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_Equal(String shiptocode) {
        doSetShiptocode_Equal(fRES(shiptocode));
    }

    protected void doSetShiptocode_Equal(String shiptocode) {
        regShiptocode(CK_EQ, shiptocode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_NotEqual(String shiptocode) {
        doSetShiptocode_NotEqual(fRES(shiptocode));
    }

    protected void doSetShiptocode_NotEqual(String shiptocode) {
        regShiptocode(CK_NES, shiptocode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_GreaterThan(String shiptocode) {
        regShiptocode(CK_GT, fRES(shiptocode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_LessThan(String shiptocode) {
        regShiptocode(CK_LT, fRES(shiptocode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_GreaterEqual(String shiptocode) {
        regShiptocode(CK_GE, fRES(shiptocode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_LessEqual(String shiptocode) {
        regShiptocode(CK_LE, fRES(shiptocode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocodeList The collection of shiptocode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_InScope(Collection<String> shiptocodeList) {
        doSetShiptocode_InScope(shiptocodeList);
    }

    protected void doSetShiptocode_InScope(Collection<String> shiptocodeList) {
        regINS(CK_INS, cTL(shiptocodeList), xgetCValueShiptocode(), "ShipToCode");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocodeList The collection of shiptocode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_NotInScope(Collection<String> shiptocodeList) {
        doSetShiptocode_NotInScope(shiptocodeList);
    }

    protected void doSetShiptocode_NotInScope(Collection<String> shiptocodeList) {
        regINS(CK_NINS, cTL(shiptocodeList), xgetCValueShiptocode(), "ShipToCode");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)} <br>
     * <pre>e.g. setShiptocode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocode The value of shiptocode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocode_LikeSearch(String shiptocode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocode), xgetCValueShiptocode(), "ShipToCode", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocode_NotLikeSearch(String shiptocode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocode), xgetCValueShiptocode(), "ShipToCode", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ShipToCode: {NotNull, varchar(30)}
     * @param shiptocode The value of shiptocode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocode_PrefixSearch(String shiptocode) {
        setShiptocode_LikeSearch(shiptocode, xcLSOPPre());
    }

    protected void regShiptocode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocode(), "ShipToCode"); }
    protected abstract ConditionValue xgetCValueShiptocode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_Equal(String originalpono) {
        doSetOriginalpono_Equal(fRES(originalpono));
    }

    protected void doSetOriginalpono_Equal(String originalpono) {
        regOriginalpono(CK_EQ, originalpono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotEqual(String originalpono) {
        doSetOriginalpono_NotEqual(fRES(originalpono));
    }

    protected void doSetOriginalpono_NotEqual(String originalpono) {
        regOriginalpono(CK_NES, originalpono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterThan(String originalpono) {
        regOriginalpono(CK_GT, fRES(originalpono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessThan(String originalpono) {
        regOriginalpono(CK_LT, fRES(originalpono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_GreaterEqual(String originalpono) {
        regOriginalpono(CK_GE, fRES(originalpono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_LessEqual(String originalpono) {
        regOriginalpono(CK_LE, fRES(originalpono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalponoList The collection of originalpono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_InScope(Collection<String> originalponoList) {
        doSetOriginalpono_InScope(originalponoList);
    }

    protected void doSetOriginalpono_InScope(Collection<String> originalponoList) {
        regINS(CK_INS, cTL(originalponoList), xgetCValueOriginalpono(), "OriginalPONo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalponoList The collection of originalpono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_NotInScope(Collection<String> originalponoList) {
        doSetOriginalpono_NotInScope(originalponoList);
    }

    protected void doSetOriginalpono_NotInScope(Collection<String> originalponoList) {
        regINS(CK_NINS, cTL(originalponoList), xgetCValueOriginalpono(), "OriginalPONo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOriginalpono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalpono The value of originalpono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOriginalpono_LikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalpono), xgetCValueOriginalpono(), "OriginalPONo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOriginalpono_NotLikeSearch(String originalpono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalpono), xgetCValueOriginalpono(), "OriginalPONo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OriginalPONo: {NotNull, varchar(30)}
     * @param originalpono The value of originalpono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOriginalpono_PrefixSearch(String originalpono) {
        setOriginalpono_LikeSearch(originalpono, xcLSOPPre());
    }

    protected void regOriginalpono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalpono(), "OriginalPONo"); }
    protected abstract ConditionValue xgetCValueOriginalpono();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_Equal(Long expectqty) {
        doSetExpectqty_Equal(expectqty);
    }

    protected void doSetExpectqty_Equal(Long expectqty) {
        regExpectqty(CK_EQ, expectqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_NotEqual(Long expectqty) {
        doSetExpectqty_NotEqual(expectqty);
    }

    protected void doSetExpectqty_NotEqual(Long expectqty) {
        regExpectqty(CK_NES, expectqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_GreaterThan(Long expectqty) {
        regExpectqty(CK_GT, expectqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_LessThan(Long expectqty) {
        regExpectqty(CK_LT, expectqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_GreaterEqual(Long expectqty) {
        regExpectqty(CK_GE, expectqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqty The value of expectqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty_LessEqual(Long expectqty) {
        regExpectqty(CK_LE, expectqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param minNumber The min number of expectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty(), "ExpectQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqtyList The collection of expectqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty_InScope(Collection<Long> expectqtyList) {
        doSetExpectqty_InScope(expectqtyList);
    }

    protected void doSetExpectqty_InScope(Collection<Long> expectqtyList) {
        regINS(CK_INS, cTL(expectqtyList), xgetCValueExpectqty(), "ExpectQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ExpectQty: {NotNull, bigint(19)}
     * @param expectqtyList The collection of expectqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty_NotInScope(Collection<Long> expectqtyList) {
        doSetExpectqty_NotInScope(expectqtyList);
    }

    protected void doSetExpectqty_NotInScope(Collection<Long> expectqtyList) {
        regINS(CK_NINS, cTL(expectqtyList), xgetCValueExpectqty(), "ExpectQty");
    }

    protected void regExpectqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty(), "ExpectQty"); }
    protected abstract ConditionValue xgetCValueExpectqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_Equal(Long planprice) {
        doSetPlanprice_Equal(planprice);
    }

    protected void doSetPlanprice_Equal(Long planprice) {
        regPlanprice(CK_EQ, planprice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_NotEqual(Long planprice) {
        doSetPlanprice_NotEqual(planprice);
    }

    protected void doSetPlanprice_NotEqual(Long planprice) {
        regPlanprice(CK_NES, planprice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_GreaterThan(Long planprice) {
        regPlanprice(CK_GT, planprice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_LessThan(Long planprice) {
        regPlanprice(CK_LT, planprice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_GreaterEqual(Long planprice) {
        regPlanprice(CK_GE, planprice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planprice The value of planprice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanprice_LessEqual(Long planprice) {
        regPlanprice(CK_LE, planprice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param minNumber The min number of planprice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planprice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanprice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanprice(), "PlanPrice", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planpriceList The collection of planprice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice_InScope(Collection<Long> planpriceList) {
        doSetPlanprice_InScope(planpriceList);
    }

    protected void doSetPlanprice_InScope(Collection<Long> planpriceList) {
        regINS(CK_INS, cTL(planpriceList), xgetCValuePlanprice(), "PlanPrice");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PlanPrice: {NotNull, bigint(19)}
     * @param planpriceList The collection of planprice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice_NotInScope(Collection<Long> planpriceList) {
        doSetPlanprice_NotInScope(planpriceList);
    }

    protected void doSetPlanprice_NotInScope(Collection<Long> planpriceList) {
        regINS(CK_NINS, cTL(planpriceList), xgetCValuePlanprice(), "PlanPrice");
    }

    protected void regPlanprice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanprice(), "PlanPrice"); }
    protected abstract ConditionValue xgetCValuePlanprice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_Equal(Long planpricetotal) {
        doSetPlanpricetotal_Equal(planpricetotal);
    }

    protected void doSetPlanpricetotal_Equal(Long planpricetotal) {
        regPlanpricetotal(CK_EQ, planpricetotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_NotEqual(Long planpricetotal) {
        doSetPlanpricetotal_NotEqual(planpricetotal);
    }

    protected void doSetPlanpricetotal_NotEqual(Long planpricetotal) {
        regPlanpricetotal(CK_NES, planpricetotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_GreaterThan(Long planpricetotal) {
        regPlanpricetotal(CK_GT, planpricetotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_LessThan(Long planpricetotal) {
        regPlanpricetotal(CK_LT, planpricetotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_GreaterEqual(Long planpricetotal) {
        regPlanpricetotal(CK_GE, planpricetotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotal The value of planpricetotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanpricetotal_LessEqual(Long planpricetotal) {
        regPlanpricetotal(CK_LE, planpricetotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param minNumber The min number of planpricetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planpricetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanpricetotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanpricetotal(), "PlanPriceTotal", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotalList The collection of planpricetotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpricetotal_InScope(Collection<Long> planpricetotalList) {
        doSetPlanpricetotal_InScope(planpricetotalList);
    }

    protected void doSetPlanpricetotal_InScope(Collection<Long> planpricetotalList) {
        regINS(CK_INS, cTL(planpricetotalList), xgetCValuePlanpricetotal(), "PlanPriceTotal");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @param planpricetotalList The collection of planpricetotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpricetotal_NotInScope(Collection<Long> planpricetotalList) {
        doSetPlanpricetotal_NotInScope(planpricetotalList);
    }

    protected void doSetPlanpricetotal_NotInScope(Collection<Long> planpricetotalList) {
        regINS(CK_NINS, cTL(planpricetotalList), xgetCValuePlanpricetotal(), "PlanPriceTotal");
    }

    protected void regPlanpricetotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanpricetotal(), "PlanPriceTotal"); }
    protected abstract ConditionValue xgetCValuePlanpricetotal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_Equal(String planname) {
        doSetPlanname_Equal(fRES(planname));
    }

    protected void doSetPlanname_Equal(String planname) {
        regPlanname(CK_EQ, planname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_NotEqual(String planname) {
        doSetPlanname_NotEqual(fRES(planname));
    }

    protected void doSetPlanname_NotEqual(String planname) {
        regPlanname(CK_NES, planname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_GreaterThan(String planname) {
        regPlanname(CK_GT, fRES(planname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_LessThan(String planname) {
        regPlanname(CK_LT, fRES(planname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_GreaterEqual(String planname) {
        regPlanname(CK_GE, fRES(planname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_LessEqual(String planname) {
        regPlanname(CK_LE, fRES(planname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param plannameList The collection of planname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_InScope(Collection<String> plannameList) {
        doSetPlanname_InScope(plannameList);
    }

    protected void doSetPlanname_InScope(Collection<String> plannameList) {
        regINS(CK_INS, cTL(plannameList), xgetCValuePlanname(), "PlanName");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param plannameList The collection of planname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_NotInScope(Collection<String> plannameList) {
        doSetPlanname_NotInScope(plannameList);
    }

    protected void doSetPlanname_NotInScope(Collection<String> plannameList) {
        regINS(CK_NINS, cTL(plannameList), xgetCValuePlanname(), "PlanName");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanName: {NotNull, varchar(100)} <br>
     * <pre>e.g. setPlanname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planname The value of planname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanname_LikeSearch(String planname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planname), xgetCValuePlanname(), "PlanName", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanname_NotLikeSearch(String planname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planname), xgetCValuePlanname(), "PlanName", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanName: {NotNull, varchar(100)}
     * @param planname The value of planname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanname_PrefixSearch(String planname) {
        setPlanname_LikeSearch(planname, xcLSOPPre());
    }

    protected void regPlanname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanname(), "PlanName"); }
    protected abstract ConditionValue xgetCValuePlanname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_Equal(String planpost) {
        doSetPlanpost_Equal(fRES(planpost));
    }

    protected void doSetPlanpost_Equal(String planpost) {
        regPlanpost(CK_EQ, planpost);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotEqual(String planpost) {
        doSetPlanpost_NotEqual(fRES(planpost));
    }

    protected void doSetPlanpost_NotEqual(String planpost) {
        regPlanpost(CK_NES, planpost);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterThan(String planpost) {
        regPlanpost(CK_GT, fRES(planpost));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessThan(String planpost) {
        regPlanpost(CK_LT, fRES(planpost));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_GreaterEqual(String planpost) {
        regPlanpost(CK_GE, fRES(planpost));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_LessEqual(String planpost) {
        regPlanpost(CK_LE, fRES(planpost));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpostList The collection of planpost as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_InScope(Collection<String> planpostList) {
        doSetPlanpost_InScope(planpostList);
    }

    protected void doSetPlanpost_InScope(Collection<String> planpostList) {
        regINS(CK_INS, cTL(planpostList), xgetCValuePlanpost(), "PlanPost");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpostList The collection of planpost as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_NotInScope(Collection<String> planpostList) {
        doSetPlanpost_NotInScope(planpostList);
    }

    protected void doSetPlanpost_NotInScope(Collection<String> planpostList) {
        regINS(CK_NINS, cTL(planpostList), xgetCValuePlanpost(), "PlanPost");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanPost: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPlanpost_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planpost The value of planpost as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanpost_LikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planpost), xgetCValuePlanpost(), "PlanPost", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanpost_NotLikeSearch(String planpost, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planpost), xgetCValuePlanpost(), "PlanPost", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanPost: {NotNull, varchar(30)}
     * @param planpost The value of planpost as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanpost_PrefixSearch(String planpost) {
        setPlanpost_LikeSearch(planpost, xcLSOPPre());
    }

    protected void regPlanpost(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanpost(), "PlanPost"); }
    protected abstract ConditionValue xgetCValuePlanpost();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_Equal(String planaddress1) {
        doSetPlanaddress1_Equal(fRES(planaddress1));
    }

    protected void doSetPlanaddress1_Equal(String planaddress1) {
        regPlanaddress1(CK_EQ, planaddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_NotEqual(String planaddress1) {
        doSetPlanaddress1_NotEqual(fRES(planaddress1));
    }

    protected void doSetPlanaddress1_NotEqual(String planaddress1) {
        regPlanaddress1(CK_NES, planaddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_GreaterThan(String planaddress1) {
        regPlanaddress1(CK_GT, fRES(planaddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_LessThan(String planaddress1) {
        regPlanaddress1(CK_LT, fRES(planaddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_GreaterEqual(String planaddress1) {
        regPlanaddress1(CK_GE, fRES(planaddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_LessEqual(String planaddress1) {
        regPlanaddress1(CK_LE, fRES(planaddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1List The collection of planaddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_InScope(Collection<String> planaddress1List) {
        doSetPlanaddress1_InScope(planaddress1List);
    }

    protected void doSetPlanaddress1_InScope(Collection<String> planaddress1List) {
        regINS(CK_INS, cTL(planaddress1List), xgetCValuePlanaddress1(), "PlanAddress1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1List The collection of planaddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_NotInScope(Collection<String> planaddress1List) {
        doSetPlanaddress1_NotInScope(planaddress1List);
    }

    protected void doSetPlanaddress1_NotInScope(Collection<String> planaddress1List) {
        regINS(CK_NINS, cTL(planaddress1List), xgetCValuePlanaddress1(), "PlanAddress1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)} <br>
     * <pre>e.g. setPlanaddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planaddress1 The value of planaddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanaddress1_LikeSearch(String planaddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planaddress1), xgetCValuePlanaddress1(), "PlanAddress1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanaddress1_NotLikeSearch(String planaddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planaddress1), xgetCValuePlanaddress1(), "PlanAddress1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress1: {NotNull, varchar(100)}
     * @param planaddress1 The value of planaddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress1_PrefixSearch(String planaddress1) {
        setPlanaddress1_LikeSearch(planaddress1, xcLSOPPre());
    }

    protected void regPlanaddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanaddress1(), "PlanAddress1"); }
    protected abstract ConditionValue xgetCValuePlanaddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_Equal(String planaddress2) {
        doSetPlanaddress2_Equal(fRES(planaddress2));
    }

    protected void doSetPlanaddress2_Equal(String planaddress2) {
        regPlanaddress2(CK_EQ, planaddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_NotEqual(String planaddress2) {
        doSetPlanaddress2_NotEqual(fRES(planaddress2));
    }

    protected void doSetPlanaddress2_NotEqual(String planaddress2) {
        regPlanaddress2(CK_NES, planaddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_GreaterThan(String planaddress2) {
        regPlanaddress2(CK_GT, fRES(planaddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_LessThan(String planaddress2) {
        regPlanaddress2(CK_LT, fRES(planaddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_GreaterEqual(String planaddress2) {
        regPlanaddress2(CK_GE, fRES(planaddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_LessEqual(String planaddress2) {
        regPlanaddress2(CK_LE, fRES(planaddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2List The collection of planaddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_InScope(Collection<String> planaddress2List) {
        doSetPlanaddress2_InScope(planaddress2List);
    }

    protected void doSetPlanaddress2_InScope(Collection<String> planaddress2List) {
        regINS(CK_INS, cTL(planaddress2List), xgetCValuePlanaddress2(), "PlanAddress2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2List The collection of planaddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_NotInScope(Collection<String> planaddress2List) {
        doSetPlanaddress2_NotInScope(planaddress2List);
    }

    protected void doSetPlanaddress2_NotInScope(Collection<String> planaddress2List) {
        regINS(CK_NINS, cTL(planaddress2List), xgetCValuePlanaddress2(), "PlanAddress2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)} <br>
     * <pre>e.g. setPlanaddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planaddress2 The value of planaddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanaddress2_LikeSearch(String planaddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planaddress2), xgetCValuePlanaddress2(), "PlanAddress2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanaddress2_NotLikeSearch(String planaddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planaddress2), xgetCValuePlanaddress2(), "PlanAddress2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanAddress2: {NotNull, varchar(255)}
     * @param planaddress2 The value of planaddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanaddress2_PrefixSearch(String planaddress2) {
        setPlanaddress2_LikeSearch(planaddress2, xcLSOPPre());
    }

    protected void regPlanaddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanaddress2(), "PlanAddress2"); }
    protected abstract ConditionValue xgetCValuePlanaddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_Equal(String planitemname) {
        doSetPlanitemname_Equal(fRES(planitemname));
    }

    protected void doSetPlanitemname_Equal(String planitemname) {
        regPlanitemname(CK_EQ, planitemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_NotEqual(String planitemname) {
        doSetPlanitemname_NotEqual(fRES(planitemname));
    }

    protected void doSetPlanitemname_NotEqual(String planitemname) {
        regPlanitemname(CK_NES, planitemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_GreaterThan(String planitemname) {
        regPlanitemname(CK_GT, fRES(planitemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_LessThan(String planitemname) {
        regPlanitemname(CK_LT, fRES(planitemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_GreaterEqual(String planitemname) {
        regPlanitemname(CK_GE, fRES(planitemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_LessEqual(String planitemname) {
        regPlanitemname(CK_LE, fRES(planitemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemnameList The collection of planitemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_InScope(Collection<String> planitemnameList) {
        doSetPlanitemname_InScope(planitemnameList);
    }

    protected void doSetPlanitemname_InScope(Collection<String> planitemnameList) {
        regINS(CK_INS, cTL(planitemnameList), xgetCValuePlanitemname(), "PlanItemName");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemnameList The collection of planitemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_NotInScope(Collection<String> planitemnameList) {
        doSetPlanitemname_NotInScope(planitemnameList);
    }

    protected void doSetPlanitemname_NotInScope(Collection<String> planitemnameList) {
        regINS(CK_NINS, cTL(planitemnameList), xgetCValuePlanitemname(), "PlanItemName");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanItemName: {varchar(255)} <br>
     * <pre>e.g. setPlanitemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planitemname The value of planitemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanitemname_LikeSearch(String planitemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planitemname), xgetCValuePlanitemname(), "PlanItemName", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanitemname_NotLikeSearch(String planitemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planitemname), xgetCValuePlanitemname(), "PlanItemName", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PlanItemName: {varchar(255)}
     * @param planitemname The value of planitemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_PrefixSearch(String planitemname) {
        setPlanitemname_LikeSearch(planitemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     */
    public void setPlanitemname_IsNull() { regPlanitemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     */
    public void setPlanitemname_IsNullOrEmpty() { regPlanitemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PlanItemName: {varchar(255)}
     */
    public void setPlanitemname_IsNotNull() { regPlanitemname(CK_ISNN, DOBJ); }

    protected void regPlanitemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanitemname(), "PlanItemName"); }
    protected abstract ConditionValue xgetCValuePlanitemname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_Equal(String warehouseplant) {
        doSetWarehouseplant_Equal(fRES(warehouseplant));
    }

    protected void doSetWarehouseplant_Equal(String warehouseplant) {
        regWarehouseplant(CK_EQ, warehouseplant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_NotEqual(String warehouseplant) {
        doSetWarehouseplant_NotEqual(fRES(warehouseplant));
    }

    protected void doSetWarehouseplant_NotEqual(String warehouseplant) {
        regWarehouseplant(CK_NES, warehouseplant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_GreaterThan(String warehouseplant) {
        regWarehouseplant(CK_GT, fRES(warehouseplant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_LessThan(String warehouseplant) {
        regWarehouseplant(CK_LT, fRES(warehouseplant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_GreaterEqual(String warehouseplant) {
        regWarehouseplant(CK_GE, fRES(warehouseplant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_LessEqual(String warehouseplant) {
        regWarehouseplant(CK_LE, fRES(warehouseplant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplantList The collection of warehouseplant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_InScope(Collection<String> warehouseplantList) {
        doSetWarehouseplant_InScope(warehouseplantList);
    }

    protected void doSetWarehouseplant_InScope(Collection<String> warehouseplantList) {
        regINS(CK_INS, cTL(warehouseplantList), xgetCValueWarehouseplant(), "WareHousePlant");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplantList The collection of warehouseplant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_NotInScope(Collection<String> warehouseplantList) {
        doSetWarehouseplant_NotInScope(warehouseplantList);
    }

    protected void doSetWarehouseplant_NotInScope(Collection<String> warehouseplantList) {
        regINS(CK_NINS, cTL(warehouseplantList), xgetCValueWarehouseplant(), "WareHousePlant");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehouseplant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseplant The value of warehouseplant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseplant_LikeSearch(String warehouseplant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseplant), xgetCValueWarehouseplant(), "WareHousePlant", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseplant_NotLikeSearch(String warehouseplant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseplant), xgetCValueWarehouseplant(), "WareHousePlant", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlant: {NotNull, varchar(30)}
     * @param warehouseplant The value of warehouseplant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplant_PrefixSearch(String warehouseplant) {
        setWarehouseplant_LikeSearch(warehouseplant, xcLSOPPre());
    }

    protected void regWarehouseplant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseplant(), "WareHousePlant"); }
    protected abstract ConditionValue xgetCValueWarehouseplant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_Equal(String warehouseplantname) {
        doSetWarehouseplantname_Equal(fRES(warehouseplantname));
    }

    protected void doSetWarehouseplantname_Equal(String warehouseplantname) {
        regWarehouseplantname(CK_EQ, warehouseplantname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_NotEqual(String warehouseplantname) {
        doSetWarehouseplantname_NotEqual(fRES(warehouseplantname));
    }

    protected void doSetWarehouseplantname_NotEqual(String warehouseplantname) {
        regWarehouseplantname(CK_NES, warehouseplantname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_GreaterThan(String warehouseplantname) {
        regWarehouseplantname(CK_GT, fRES(warehouseplantname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_LessThan(String warehouseplantname) {
        regWarehouseplantname(CK_LT, fRES(warehouseplantname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_GreaterEqual(String warehouseplantname) {
        regWarehouseplantname(CK_GE, fRES(warehouseplantname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_LessEqual(String warehouseplantname) {
        regWarehouseplantname(CK_LE, fRES(warehouseplantname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantnameList The collection of warehouseplantname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_InScope(Collection<String> warehouseplantnameList) {
        doSetWarehouseplantname_InScope(warehouseplantnameList);
    }

    protected void doSetWarehouseplantname_InScope(Collection<String> warehouseplantnameList) {
        regINS(CK_INS, cTL(warehouseplantnameList), xgetCValueWarehouseplantname(), "WareHousePlantName");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantnameList The collection of warehouseplantname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_NotInScope(Collection<String> warehouseplantnameList) {
        doSetWarehouseplantname_NotInScope(warehouseplantnameList);
    }

    protected void doSetWarehouseplantname_NotInScope(Collection<String> warehouseplantnameList) {
        regINS(CK_NINS, cTL(warehouseplantnameList), xgetCValueWarehouseplantname(), "WareHousePlantName");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehouseplantname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseplantname The value of warehouseplantname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseplantname_LikeSearch(String warehouseplantname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseplantname), xgetCValueWarehouseplantname(), "WareHousePlantName", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseplantname_NotLikeSearch(String warehouseplantname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseplantname), xgetCValueWarehouseplantname(), "WareHousePlantName", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHousePlantName: {NotNull, varchar(30)}
     * @param warehouseplantname The value of warehouseplantname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseplantname_PrefixSearch(String warehouseplantname) {
        setWarehouseplantname_LikeSearch(warehouseplantname, xcLSOPPre());
    }

    protected void regWarehouseplantname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseplantname(), "WareHousePlantName"); }
    protected abstract ConditionValue xgetCValueWarehouseplantname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
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
     * WareHouseName: {NotNull, varchar(60)}
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
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterThan(String warehousename) {
        regWarehousename(CK_GT, fRES(warehousename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessThan(String warehousename) {
        regWarehousename(CK_LT, fRES(warehousename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterEqual(String warehousename) {
        regWarehousename(CK_GE, fRES(warehousename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessEqual(String warehousename) {
        regWarehousename(CK_LE, fRES(warehousename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousenameList The collection of warehousename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_InScope(Collection<String> warehousenameList) {
        doSetWarehousename_InScope(warehousenameList);
    }

    protected void doSetWarehousename_InScope(Collection<String> warehousenameList) {
        regINS(CK_INS, cTL(warehousenameList), xgetCValueWarehousename(), "WareHouseName");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousenameList The collection of warehousename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_NotInScope(Collection<String> warehousenameList) {
        doSetWarehousename_NotInScope(warehousenameList);
    }

    protected void doSetWarehousename_NotInScope(Collection<String> warehousenameList) {
        regINS(CK_NINS, cTL(warehousenameList), xgetCValueWarehousename(), "WareHouseName");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)} <br>
     * <pre>e.g. setWarehousename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousename The value of warehousename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousename_LikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousename), xgetCValueWarehousename(), "WareHouseName", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousename_NotLikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousename), xgetCValueWarehousename(), "WareHouseName", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WareHouseName: {NotNull, varchar(60)}
     * @param warehousename The value of warehousename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_PrefixSearch(String warehousename) {
        setWarehousename_LikeSearch(warehousename, xcLSOPPre());
    }

    protected void regWarehousename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousename(), "WareHouseName"); }
    protected abstract ConditionValue xgetCValueWarehousename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_Equal(String orderdate) {
        doSetOrderdate_Equal(fRES(orderdate));
    }

    protected void doSetOrderdate_Equal(String orderdate) {
        regOrderdate(CK_EQ, orderdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_NotEqual(String orderdate) {
        doSetOrderdate_NotEqual(fRES(orderdate));
    }

    protected void doSetOrderdate_NotEqual(String orderdate) {
        regOrderdate(CK_NES, orderdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterThan(String orderdate) {
        regOrderdate(CK_GT, fRES(orderdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessThan(String orderdate) {
        regOrderdate(CK_LT, fRES(orderdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterEqual(String orderdate) {
        regOrderdate(CK_GE, fRES(orderdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessEqual(String orderdate) {
        regOrderdate(CK_LE, fRES(orderdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdateList The collection of orderdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_InScope(Collection<String> orderdateList) {
        doSetOrderdate_InScope(orderdateList);
    }

    protected void doSetOrderdate_InScope(Collection<String> orderdateList) {
        regINS(CK_INS, cTL(orderdateList), xgetCValueOrderdate(), "OrderDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdateList The collection of orderdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_NotInScope(Collection<String> orderdateList) {
        doSetOrderdate_NotInScope(orderdateList);
    }

    protected void doSetOrderdate_NotInScope(Collection<String> orderdateList) {
        regINS(CK_NINS, cTL(orderdateList), xgetCValueOrderdate(), "OrderDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OrderDate: {NotNull, varchar(8)} <br>
     * <pre>e.g. setOrderdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderdate The value of orderdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderdate_LikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderdate), xgetCValueOrderdate(), "OrderDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderdate_NotLikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderdate), xgetCValueOrderdate(), "OrderDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OrderDate: {NotNull, varchar(8)}
     * @param orderdate The value of orderdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_PrefixSearch(String orderdate) {
        setOrderdate_LikeSearch(orderdate, xcLSOPPre());
    }

    protected void regOrderdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderdate(), "OrderDate"); }
    protected abstract ConditionValue xgetCValueOrderdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_Equal(String deliverydate) {
        doSetDeliverydate_Equal(fRES(deliverydate));
    }

    protected void doSetDeliverydate_Equal(String deliverydate) {
        regDeliverydate(CK_EQ, deliverydate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_NotEqual(String deliverydate) {
        doSetDeliverydate_NotEqual(fRES(deliverydate));
    }

    protected void doSetDeliverydate_NotEqual(String deliverydate) {
        regDeliverydate(CK_NES, deliverydate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_GreaterThan(String deliverydate) {
        regDeliverydate(CK_GT, fRES(deliverydate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_LessThan(String deliverydate) {
        regDeliverydate(CK_LT, fRES(deliverydate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_GreaterEqual(String deliverydate) {
        regDeliverydate(CK_GE, fRES(deliverydate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_LessEqual(String deliverydate) {
        regDeliverydate(CK_LE, fRES(deliverydate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydateList The collection of deliverydate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_InScope(Collection<String> deliverydateList) {
        doSetDeliverydate_InScope(deliverydateList);
    }

    protected void doSetDeliverydate_InScope(Collection<String> deliverydateList) {
        regINS(CK_INS, cTL(deliverydateList), xgetCValueDeliverydate(), "DeliveryDate");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydateList The collection of deliverydate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_NotInScope(Collection<String> deliverydateList) {
        doSetDeliverydate_NotInScope(deliverydateList);
    }

    protected void doSetDeliverydate_NotInScope(Collection<String> deliverydateList) {
        regINS(CK_NINS, cTL(deliverydateList), xgetCValueDeliverydate(), "DeliveryDate");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DeliveryDate: {varchar(8)} <br>
     * <pre>e.g. setDeliverydate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverydate The value of deliverydate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverydate_LikeSearch(String deliverydate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverydate), xgetCValueDeliverydate(), "DeliveryDate", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverydate_NotLikeSearch(String deliverydate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverydate), xgetCValueDeliverydate(), "DeliveryDate", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DeliveryDate: {varchar(8)}
     * @param deliverydate The value of deliverydate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_PrefixSearch(String deliverydate) {
        setDeliverydate_LikeSearch(deliverydate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     */
    public void setDeliverydate_IsNull() { regDeliverydate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     */
    public void setDeliverydate_IsNullOrEmpty() { regDeliverydate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DeliveryDate: {varchar(8)}
     */
    public void setDeliverydate_IsNotNull() { regDeliverydate(CK_ISNN, DOBJ); }

    protected void regDeliverydate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverydate(), "DeliveryDate"); }
    protected abstract ConditionValue xgetCValueDeliverydate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_Equal(String purchasenumber) {
        doSetPurchasenumber_Equal(fRES(purchasenumber));
    }

    protected void doSetPurchasenumber_Equal(String purchasenumber) {
        regPurchasenumber(CK_EQ, purchasenumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_NotEqual(String purchasenumber) {
        doSetPurchasenumber_NotEqual(fRES(purchasenumber));
    }

    protected void doSetPurchasenumber_NotEqual(String purchasenumber) {
        regPurchasenumber(CK_NES, purchasenumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_GreaterThan(String purchasenumber) {
        regPurchasenumber(CK_GT, fRES(purchasenumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_LessThan(String purchasenumber) {
        regPurchasenumber(CK_LT, fRES(purchasenumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_GreaterEqual(String purchasenumber) {
        regPurchasenumber(CK_GE, fRES(purchasenumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_LessEqual(String purchasenumber) {
        regPurchasenumber(CK_LE, fRES(purchasenumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumberList The collection of purchasenumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_InScope(Collection<String> purchasenumberList) {
        doSetPurchasenumber_InScope(purchasenumberList);
    }

    protected void doSetPurchasenumber_InScope(Collection<String> purchasenumberList) {
        regINS(CK_INS, cTL(purchasenumberList), xgetCValuePurchasenumber(), "PurchaseNumber");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumberList The collection of purchasenumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_NotInScope(Collection<String> purchasenumberList) {
        doSetPurchasenumber_NotInScope(purchasenumberList);
    }

    protected void doSetPurchasenumber_NotInScope(Collection<String> purchasenumberList) {
        regINS(CK_NINS, cTL(purchasenumberList), xgetCValuePurchasenumber(), "PurchaseNumber");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PurchaseNumber: {varchar(100)} <br>
     * <pre>e.g. setPurchasenumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchasenumber The value of purchasenumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchasenumber_LikeSearch(String purchasenumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchasenumber), xgetCValuePurchasenumber(), "PurchaseNumber", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchasenumber_NotLikeSearch(String purchasenumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchasenumber), xgetCValuePurchasenumber(), "PurchaseNumber", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     * @param purchasenumber The value of purchasenumber as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasenumber_PrefixSearch(String purchasenumber) {
        setPurchasenumber_LikeSearch(purchasenumber, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     */
    public void setPurchasenumber_IsNull() { regPurchasenumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     */
    public void setPurchasenumber_IsNullOrEmpty() { regPurchasenumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PurchaseNumber: {varchar(100)}
     */
    public void setPurchasenumber_IsNotNull() { regPurchasenumber(CK_ISNN, DOBJ); }

    protected void regPurchasenumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasenumber(), "PurchaseNumber"); }
    protected abstract ConditionValue xgetCValuePurchasenumber();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_Equal(Long ordernumber) {
        doSetOrdernumber_Equal(ordernumber);
    }

    protected void doSetOrdernumber_Equal(Long ordernumber) {
        regOrdernumber(CK_EQ, ordernumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_NotEqual(Long ordernumber) {
        doSetOrdernumber_NotEqual(ordernumber);
    }

    protected void doSetOrdernumber_NotEqual(Long ordernumber) {
        regOrdernumber(CK_NES, ordernumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_GreaterThan(Long ordernumber) {
        regOrdernumber(CK_GT, ordernumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_LessThan(Long ordernumber) {
        regOrdernumber(CK_LT, ordernumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_GreaterEqual(Long ordernumber) {
        regOrdernumber(CK_GE, ordernumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumber The value of ordernumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrdernumber_LessEqual(Long ordernumber) {
        regOrdernumber(CK_LE, ordernumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param minNumber The min number of ordernumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ordernumber. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrdernumber_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrdernumber(), "OrderNumber", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumberList The collection of ordernumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernumber_InScope(Collection<Long> ordernumberList) {
        doSetOrdernumber_InScope(ordernumberList);
    }

    protected void doSetOrdernumber_InScope(Collection<Long> ordernumberList) {
        regINS(CK_INS, cTL(ordernumberList), xgetCValueOrdernumber(), "OrderNumber");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OrderNumber: {NotNull, bigint(19)}
     * @param ordernumberList The collection of ordernumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdernumber_NotInScope(Collection<Long> ordernumberList) {
        doSetOrdernumber_NotInScope(ordernumberList);
    }

    protected void doSetOrdernumber_NotInScope(Collection<Long> ordernumberList) {
        regINS(CK_NINS, cTL(ordernumberList), xgetCValueOrdernumber(), "OrderNumber");
    }

    protected void regOrdernumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdernumber(), "OrderNumber"); }
    protected abstract ConditionValue xgetCValueOrdernumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_Equal(String itemlineno) {
        doSetItemlineno_Equal(fRES(itemlineno));
    }

    protected void doSetItemlineno_Equal(String itemlineno) {
        regItemlineno(CK_EQ, itemlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_NotEqual(String itemlineno) {
        doSetItemlineno_NotEqual(fRES(itemlineno));
    }

    protected void doSetItemlineno_NotEqual(String itemlineno) {
        regItemlineno(CK_NES, itemlineno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_GreaterThan(String itemlineno) {
        regItemlineno(CK_GT, fRES(itemlineno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_LessThan(String itemlineno) {
        regItemlineno(CK_LT, fRES(itemlineno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_GreaterEqual(String itemlineno) {
        regItemlineno(CK_GE, fRES(itemlineno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_LessEqual(String itemlineno) {
        regItemlineno(CK_LE, fRES(itemlineno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlinenoList The collection of itemlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_InScope(Collection<String> itemlinenoList) {
        doSetItemlineno_InScope(itemlinenoList);
    }

    protected void doSetItemlineno_InScope(Collection<String> itemlinenoList) {
        regINS(CK_INS, cTL(itemlinenoList), xgetCValueItemlineno(), "ItemLineNo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlinenoList The collection of itemlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_NotInScope(Collection<String> itemlinenoList) {
        doSetItemlineno_NotInScope(itemlinenoList);
    }

    protected void doSetItemlineno_NotInScope(Collection<String> itemlinenoList) {
        regINS(CK_NINS, cTL(itemlinenoList), xgetCValueItemlineno(), "ItemLineNo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemlineno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemlineno The value of itemlineno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemlineno_LikeSearch(String itemlineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemlineno), xgetCValueItemlineno(), "ItemLineNo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemlineno_NotLikeSearch(String itemlineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemlineno), xgetCValueItemlineno(), "ItemLineNo", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ItemLineNo: {NotNull, varchar(30)}
     * @param itemlineno The value of itemlineno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemlineno_PrefixSearch(String itemlineno) {
        setItemlineno_LikeSearch(itemlineno, xcLSOPPre());
    }

    protected void regItemlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemlineno(), "ItemLineNo"); }
    protected abstract ConditionValue xgetCValueItemlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_Equal(String skucode) {
        doSetSkucode_Equal(fRES(skucode));
    }

    protected void doSetSkucode_Equal(String skucode) {
        regSkucode(CK_EQ, skucode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_NotEqual(String skucode) {
        doSetSkucode_NotEqual(fRES(skucode));
    }

    protected void doSetSkucode_NotEqual(String skucode) {
        regSkucode(CK_NES, skucode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_GreaterThan(String skucode) {
        regSkucode(CK_GT, fRES(skucode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_LessThan(String skucode) {
        regSkucode(CK_LT, fRES(skucode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_GreaterEqual(String skucode) {
        regSkucode(CK_GE, fRES(skucode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_LessEqual(String skucode) {
        regSkucode(CK_LE, fRES(skucode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucodeList The collection of skucode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_InScope(Collection<String> skucodeList) {
        doSetSkucode_InScope(skucodeList);
    }

    protected void doSetSkucode_InScope(Collection<String> skucodeList) {
        regINS(CK_INS, cTL(skucodeList), xgetCValueSkucode(), "SkuCode");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucodeList The collection of skucode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_NotInScope(Collection<String> skucodeList) {
        doSetSkucode_NotInScope(skucodeList);
    }

    protected void doSetSkucode_NotInScope(Collection<String> skucodeList) {
        regINS(CK_NINS, cTL(skucodeList), xgetCValueSkucode(), "SkuCode");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SkuCode: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSkucode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucode The value of skucode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucode_LikeSearch(String skucode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucode), xgetCValueSkucode(), "SkuCode", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucode_NotLikeSearch(String skucode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucode), xgetCValueSkucode(), "SkuCode", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SkuCode: {NotNull, varchar(30)}
     * @param skucode The value of skucode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucode_PrefixSearch(String skucode) {
        setSkucode_LikeSearch(skucode, xcLSOPPre());
    }

    protected void regSkucode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucode(), "SkuCode"); }
    protected abstract ConditionValue xgetCValueSkucode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_Equal(Long cardboard) {
        doSetCardboard_Equal(cardboard);
    }

    protected void doSetCardboard_Equal(Long cardboard) {
        regCardboard(CK_EQ, cardboard);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_NotEqual(Long cardboard) {
        doSetCardboard_NotEqual(cardboard);
    }

    protected void doSetCardboard_NotEqual(Long cardboard) {
        regCardboard(CK_NES, cardboard);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_GreaterThan(Long cardboard) {
        regCardboard(CK_GT, cardboard);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_LessThan(Long cardboard) {
        regCardboard(CK_LT, cardboard);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_GreaterEqual(Long cardboard) {
        regCardboard(CK_GE, cardboard);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboard The value of cardboard as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCardboard_LessEqual(Long cardboard) {
        regCardboard(CK_LE, cardboard);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param minNumber The min number of cardboard. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cardboard. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCardboard_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCardboard(), "CardBoard", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboardList The collection of cardboard as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_InScope(Collection<Long> cardboardList) {
        doSetCardboard_InScope(cardboardList);
    }

    protected void doSetCardboard_InScope(Collection<Long> cardboardList) {
        regINS(CK_INS, cTL(cardboardList), xgetCValueCardboard(), "CardBoard");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CardBoard: {bigint(19)}
     * @param cardboardList The collection of cardboard as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboard_NotInScope(Collection<Long> cardboardList) {
        doSetCardboard_NotInScope(cardboardList);
    }

    protected void doSetCardboard_NotInScope(Collection<Long> cardboardList) {
        regINS(CK_NINS, cTL(cardboardList), xgetCValueCardboard(), "CardBoard");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     */
    public void setCardboard_IsNull() { regCardboard(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CardBoard: {bigint(19)}
     */
    public void setCardboard_IsNotNull() { regCardboard(CK_ISNN, DOBJ); }

    protected void regCardboard(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardboard(), "CardBoard"); }
    protected abstract ConditionValue xgetCValueCardboard();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_Equal(Long carton) {
        doSetCarton_Equal(carton);
    }

    protected void doSetCarton_Equal(Long carton) {
        regCarton(CK_EQ, carton);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_NotEqual(Long carton) {
        doSetCarton_NotEqual(carton);
    }

    protected void doSetCarton_NotEqual(Long carton) {
        regCarton(CK_NES, carton);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_GreaterThan(Long carton) {
        regCarton(CK_GT, carton);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_LessThan(Long carton) {
        regCarton(CK_LT, carton);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_GreaterEqual(Long carton) {
        regCarton(CK_GE, carton);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param carton The value of carton as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarton_LessEqual(Long carton) {
        regCarton(CK_LE, carton);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     * @param minNumber The min number of carton. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carton. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarton_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarton(), "CarTon", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CarTon: {bigint(19)}
     * @param cartonList The collection of carton as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_InScope(Collection<Long> cartonList) {
        doSetCarton_InScope(cartonList);
    }

    protected void doSetCarton_InScope(Collection<Long> cartonList) {
        regINS(CK_INS, cTL(cartonList), xgetCValueCarton(), "CarTon");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CarTon: {bigint(19)}
     * @param cartonList The collection of carton as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarton_NotInScope(Collection<Long> cartonList) {
        doSetCarton_NotInScope(cartonList);
    }

    protected void doSetCarton_NotInScope(Collection<Long> cartonList) {
        regINS(CK_NINS, cTL(cartonList), xgetCValueCarton(), "CarTon");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     */
    public void setCarton_IsNull() { regCarton(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CarTon: {bigint(19)}
     */
    public void setCarton_IsNotNull() { regCarton(CK_ISNN, DOBJ); }

    protected void regCarton(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarton(), "CarTon"); }
    protected abstract ConditionValue xgetCValueCarton();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_Equal(Long totalexpectqty) {
        doSetTotalexpectqty_Equal(totalexpectqty);
    }

    protected void doSetTotalexpectqty_Equal(Long totalexpectqty) {
        regTotalexpectqty(CK_EQ, totalexpectqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_NotEqual(Long totalexpectqty) {
        doSetTotalexpectqty_NotEqual(totalexpectqty);
    }

    protected void doSetTotalexpectqty_NotEqual(Long totalexpectqty) {
        regTotalexpectqty(CK_NES, totalexpectqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_GreaterThan(Long totalexpectqty) {
        regTotalexpectqty(CK_GT, totalexpectqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_LessThan(Long totalexpectqty) {
        regTotalexpectqty(CK_LT, totalexpectqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_GreaterEqual(Long totalexpectqty) {
        regTotalexpectqty(CK_GE, totalexpectqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqty The value of totalexpectqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalexpectqty_LessEqual(Long totalexpectqty) {
        regTotalexpectqty(CK_LE, totalexpectqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param minNumber The min number of totalexpectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalexpectqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalexpectqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalexpectqty(), "TotalExpectQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqtyList The collection of totalexpectqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalexpectqty_InScope(Collection<Long> totalexpectqtyList) {
        doSetTotalexpectqty_InScope(totalexpectqtyList);
    }

    protected void doSetTotalexpectqty_InScope(Collection<Long> totalexpectqtyList) {
        regINS(CK_INS, cTL(totalexpectqtyList), xgetCValueTotalexpectqty(), "TotalExpectQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     * @param totalexpectqtyList The collection of totalexpectqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalexpectqty_NotInScope(Collection<Long> totalexpectqtyList) {
        doSetTotalexpectqty_NotInScope(totalexpectqtyList);
    }

    protected void doSetTotalexpectqty_NotInScope(Collection<Long> totalexpectqtyList) {
        regINS(CK_NINS, cTL(totalexpectqtyList), xgetCValueTotalexpectqty(), "TotalExpectQty");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     */
    public void setTotalexpectqty_IsNull() { regTotalexpectqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TotalExpectQty: {bigint(19)}
     */
    public void setTotalexpectqty_IsNotNull() { regTotalexpectqty(CK_ISNN, DOBJ); }

    protected void regTotalexpectqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalexpectqty(), "TotalExpectQty"); }
    protected abstract ConditionValue xgetCValueTotalexpectqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_Equal(Long totalcardboardqty) {
        doSetTotalcardboardqty_Equal(totalcardboardqty);
    }

    protected void doSetTotalcardboardqty_Equal(Long totalcardboardqty) {
        regTotalcardboardqty(CK_EQ, totalcardboardqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_NotEqual(Long totalcardboardqty) {
        doSetTotalcardboardqty_NotEqual(totalcardboardqty);
    }

    protected void doSetTotalcardboardqty_NotEqual(Long totalcardboardqty) {
        regTotalcardboardqty(CK_NES, totalcardboardqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_GreaterThan(Long totalcardboardqty) {
        regTotalcardboardqty(CK_GT, totalcardboardqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_LessThan(Long totalcardboardqty) {
        regTotalcardboardqty(CK_LT, totalcardboardqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_GreaterEqual(Long totalcardboardqty) {
        regTotalcardboardqty(CK_GE, totalcardboardqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqty The value of totalcardboardqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_LessEqual(Long totalcardboardqty) {
        regTotalcardboardqty(CK_LE, totalcardboardqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param minNumber The min number of totalcardboardqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalcardboardqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalcardboardqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalcardboardqty(), "TotalCardBoardQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqtyList The collection of totalcardboardqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_InScope(Collection<Long> totalcardboardqtyList) {
        doSetTotalcardboardqty_InScope(totalcardboardqtyList);
    }

    protected void doSetTotalcardboardqty_InScope(Collection<Long> totalcardboardqtyList) {
        regINS(CK_INS, cTL(totalcardboardqtyList), xgetCValueTotalcardboardqty(), "TotalCardBoardQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     * @param totalcardboardqtyList The collection of totalcardboardqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalcardboardqty_NotInScope(Collection<Long> totalcardboardqtyList) {
        doSetTotalcardboardqty_NotInScope(totalcardboardqtyList);
    }

    protected void doSetTotalcardboardqty_NotInScope(Collection<Long> totalcardboardqtyList) {
        regINS(CK_NINS, cTL(totalcardboardqtyList), xgetCValueTotalcardboardqty(), "TotalCardBoardQty");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     */
    public void setTotalcardboardqty_IsNull() { regTotalcardboardqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TotalCardBoardQty: {bigint(19)}
     */
    public void setTotalcardboardqty_IsNotNull() { regTotalcardboardqty(CK_ISNN, DOBJ); }

    protected void regTotalcardboardqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalcardboardqty(), "TotalCardBoardQty"); }
    protected abstract ConditionValue xgetCValueTotalcardboardqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_Equal(Long totalcartonqty) {
        doSetTotalcartonqty_Equal(totalcartonqty);
    }

    protected void doSetTotalcartonqty_Equal(Long totalcartonqty) {
        regTotalcartonqty(CK_EQ, totalcartonqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_NotEqual(Long totalcartonqty) {
        doSetTotalcartonqty_NotEqual(totalcartonqty);
    }

    protected void doSetTotalcartonqty_NotEqual(Long totalcartonqty) {
        regTotalcartonqty(CK_NES, totalcartonqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_GreaterThan(Long totalcartonqty) {
        regTotalcartonqty(CK_GT, totalcartonqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_LessThan(Long totalcartonqty) {
        regTotalcartonqty(CK_LT, totalcartonqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_GreaterEqual(Long totalcartonqty) {
        regTotalcartonqty(CK_GE, totalcartonqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqty The value of totalcartonqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalcartonqty_LessEqual(Long totalcartonqty) {
        regTotalcartonqty(CK_LE, totalcartonqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param minNumber The min number of totalcartonqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalcartonqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalcartonqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalcartonqty(), "TotalCarTonQty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqtyList The collection of totalcartonqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalcartonqty_InScope(Collection<Long> totalcartonqtyList) {
        doSetTotalcartonqty_InScope(totalcartonqtyList);
    }

    protected void doSetTotalcartonqty_InScope(Collection<Long> totalcartonqtyList) {
        regINS(CK_INS, cTL(totalcartonqtyList), xgetCValueTotalcartonqty(), "TotalCarTonQty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     * @param totalcartonqtyList The collection of totalcartonqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalcartonqty_NotInScope(Collection<Long> totalcartonqtyList) {
        doSetTotalcartonqty_NotInScope(totalcartonqtyList);
    }

    protected void doSetTotalcartonqty_NotInScope(Collection<Long> totalcartonqtyList) {
        regINS(CK_NINS, cTL(totalcartonqtyList), xgetCValueTotalcartonqty(), "TotalCarTonQty");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     */
    public void setTotalcartonqty_IsNull() { regTotalcartonqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TotalCarTonQty: {bigint(19)}
     */
    public void setTotalcartonqty_IsNotNull() { regTotalcartonqty(CK_ISNN, DOBJ); }

    protected void regTotalcartonqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalcartonqty(), "TotalCarTonQty"); }
    protected abstract ConditionValue xgetCValueTotalcartonqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_Equal(String note) {
        doSetNote_Equal(fRES(note));
    }

    protected void doSetNote_Equal(String note) {
        regNote(CK_EQ, note);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_NotEqual(String note) {
        doSetNote_NotEqual(fRES(note));
    }

    protected void doSetNote_NotEqual(String note) {
        regNote(CK_NES, note);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_GreaterThan(String note) {
        regNote(CK_GT, fRES(note));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_LessThan(String note) {
        regNote(CK_LT, fRES(note));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_GreaterEqual(String note) {
        regNote(CK_GE, fRES(note));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_LessEqual(String note) {
        regNote(CK_LE, fRES(note));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Note: {varchar(4000)}
     * @param noteList The collection of note as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_InScope(Collection<String> noteList) {
        doSetNote_InScope(noteList);
    }

    protected void doSetNote_InScope(Collection<String> noteList) {
        regINS(CK_INS, cTL(noteList), xgetCValueNote(), "Note");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Note: {varchar(4000)}
     * @param noteList The collection of note as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_NotInScope(Collection<String> noteList) {
        doSetNote_NotInScope(noteList);
    }

    protected void doSetNote_NotInScope(Collection<String> noteList) {
        regINS(CK_NINS, cTL(noteList), xgetCValueNote(), "Note");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Note: {varchar(4000)} <br>
     * <pre>e.g. setNote_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param note The value of note as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNote_LikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(note), xgetCValueNote(), "Note", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNote_NotLikeSearch(String note, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(note), xgetCValueNote(), "Note", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Note: {varchar(4000)}
     * @param note The value of note as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNote_PrefixSearch(String note) {
        setNote_LikeSearch(note, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     */
    public void setNote_IsNull() { regNote(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     */
    public void setNote_IsNullOrEmpty() { regNote(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Note: {varchar(4000)}
     */
    public void setNote_IsNotNull() { regNote(CK_ISNN, DOBJ); }

    protected void regNote(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNote(), "Note"); }
    protected abstract ConditionValue xgetCValueNote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_Equal(String reserve2) {
        doSetReserve2_Equal(fRES(reserve2));
    }

    protected void doSetReserve2_Equal(String reserve2) {
        regReserve2(CK_EQ, reserve2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_NotEqual(String reserve2) {
        doSetReserve2_NotEqual(fRES(reserve2));
    }

    protected void doSetReserve2_NotEqual(String reserve2) {
        regReserve2(CK_NES, reserve2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_GreaterThan(String reserve2) {
        regReserve2(CK_GT, fRES(reserve2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_LessThan(String reserve2) {
        regReserve2(CK_LT, fRES(reserve2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_GreaterEqual(String reserve2) {
        regReserve2(CK_GE, fRES(reserve2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_LessEqual(String reserve2) {
        regReserve2(CK_LE, fRES(reserve2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2List The collection of reserve2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_InScope(Collection<String> reserve2List) {
        doSetReserve2_InScope(reserve2List);
    }

    protected void doSetReserve2_InScope(Collection<String> reserve2List) {
        regINS(CK_INS, cTL(reserve2List), xgetCValueReserve2(), "Reserve2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2List The collection of reserve2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_NotInScope(Collection<String> reserve2List) {
        doSetReserve2_NotInScope(reserve2List);
    }

    protected void doSetReserve2_NotInScope(Collection<String> reserve2List) {
        regINS(CK_NINS, cTL(reserve2List), xgetCValueReserve2(), "Reserve2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve2: {varchar(255)} <br>
     * <pre>e.g. setReserve2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve2 The value of reserve2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve2_LikeSearch(String reserve2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve2), xgetCValueReserve2(), "Reserve2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve2_NotLikeSearch(String reserve2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve2), xgetCValueReserve2(), "Reserve2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve2: {varchar(255)}
     * @param reserve2 The value of reserve2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve2_PrefixSearch(String reserve2) {
        setReserve2_LikeSearch(reserve2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     */
    public void setReserve2_IsNull() { regReserve2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     */
    public void setReserve2_IsNullOrEmpty() { regReserve2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Reserve2: {varchar(255)}
     */
    public void setReserve2_IsNotNull() { regReserve2(CK_ISNN, DOBJ); }

    protected void regReserve2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve2(), "Reserve2"); }
    protected abstract ConditionValue xgetCValueReserve2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_Equal(String reserve3) {
        doSetReserve3_Equal(fRES(reserve3));
    }

    protected void doSetReserve3_Equal(String reserve3) {
        regReserve3(CK_EQ, reserve3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_NotEqual(String reserve3) {
        doSetReserve3_NotEqual(fRES(reserve3));
    }

    protected void doSetReserve3_NotEqual(String reserve3) {
        regReserve3(CK_NES, reserve3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_GreaterThan(String reserve3) {
        regReserve3(CK_GT, fRES(reserve3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_LessThan(String reserve3) {
        regReserve3(CK_LT, fRES(reserve3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_GreaterEqual(String reserve3) {
        regReserve3(CK_GE, fRES(reserve3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_LessEqual(String reserve3) {
        regReserve3(CK_LE, fRES(reserve3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3List The collection of reserve3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_InScope(Collection<String> reserve3List) {
        doSetReserve3_InScope(reserve3List);
    }

    protected void doSetReserve3_InScope(Collection<String> reserve3List) {
        regINS(CK_INS, cTL(reserve3List), xgetCValueReserve3(), "Reserve3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3List The collection of reserve3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_NotInScope(Collection<String> reserve3List) {
        doSetReserve3_NotInScope(reserve3List);
    }

    protected void doSetReserve3_NotInScope(Collection<String> reserve3List) {
        regINS(CK_NINS, cTL(reserve3List), xgetCValueReserve3(), "Reserve3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve3: {varchar(255)} <br>
     * <pre>e.g. setReserve3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve3 The value of reserve3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve3_LikeSearch(String reserve3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve3), xgetCValueReserve3(), "Reserve3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve3_NotLikeSearch(String reserve3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve3), xgetCValueReserve3(), "Reserve3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve3: {varchar(255)}
     * @param reserve3 The value of reserve3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve3_PrefixSearch(String reserve3) {
        setReserve3_LikeSearch(reserve3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     */
    public void setReserve3_IsNull() { regReserve3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     */
    public void setReserve3_IsNullOrEmpty() { regReserve3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Reserve3: {varchar(255)}
     */
    public void setReserve3_IsNotNull() { regReserve3(CK_ISNN, DOBJ); }

    protected void regReserve3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve3(), "Reserve3"); }
    protected abstract ConditionValue xgetCValueReserve3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_Equal(String reserve) {
        doSetReserve_Equal(fRES(reserve));
    }

    protected void doSetReserve_Equal(String reserve) {
        regReserve(CK_EQ, reserve);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_NotEqual(String reserve) {
        doSetReserve_NotEqual(fRES(reserve));
    }

    protected void doSetReserve_NotEqual(String reserve) {
        regReserve(CK_NES, reserve);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_GreaterThan(String reserve) {
        regReserve(CK_GT, fRES(reserve));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_LessThan(String reserve) {
        regReserve(CK_LT, fRES(reserve));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_GreaterEqual(String reserve) {
        regReserve(CK_GE, fRES(reserve));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_LessEqual(String reserve) {
        regReserve(CK_LE, fRES(reserve));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserveList The collection of reserve as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_InScope(Collection<String> reserveList) {
        doSetReserve_InScope(reserveList);
    }

    protected void doSetReserve_InScope(Collection<String> reserveList) {
        regINS(CK_INS, cTL(reserveList), xgetCValueReserve(), "Reserve");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserveList The collection of reserve as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_NotInScope(Collection<String> reserveList) {
        doSetReserve_NotInScope(reserveList);
    }

    protected void doSetReserve_NotInScope(Collection<String> reserveList) {
        regINS(CK_NINS, cTL(reserveList), xgetCValueReserve(), "Reserve");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve: {varchar(255)} <br>
     * <pre>e.g. setReserve_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reserve The value of reserve as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReserve_LikeSearch(String reserve, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reserve), xgetCValueReserve(), "Reserve", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReserve_NotLikeSearch(String reserve, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reserve), xgetCValueReserve(), "Reserve", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * Reserve: {varchar(255)}
     * @param reserve The value of reserve as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReserve_PrefixSearch(String reserve) {
        setReserve_LikeSearch(reserve, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     */
    public void setReserve_IsNull() { regReserve(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     */
    public void setReserve_IsNullOrEmpty() { regReserve(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Reserve: {varchar(255)}
     */
    public void setReserve_IsNotNull() { regReserve(CK_ISNN, DOBJ); }

    protected void regReserve(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReserve(), "Reserve"); }
    protected abstract ConditionValue xgetCValueReserve();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_Equal(Long centerid) {
        doSetCenterid_Equal(centerid);
    }

    protected void doSetCenterid_Equal(Long centerid) {
        regCenterid(CK_EQ, centerid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_NotEqual(Long centerid) {
        doSetCenterid_NotEqual(centerid);
    }

    protected void doSetCenterid_NotEqual(Long centerid) {
        regCenterid(CK_NES, centerid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_GreaterThan(Long centerid) {
        regCenterid(CK_GT, centerid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_LessThan(Long centerid) {
        regCenterid(CK_LT, centerid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_GreaterEqual(Long centerid) {
        regCenterid(CK_GE, centerid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centerid The value of centerid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterid_LessEqual(Long centerid) {
        regCenterid(CK_LE, centerid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param minNumber The min number of centerid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterid(), "CenterId", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centeridList The collection of centerid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterid_InScope(Collection<Long> centeridList) {
        doSetCenterid_InScope(centeridList);
    }

    protected void doSetCenterid_InScope(Collection<Long> centeridList) {
        regINS(CK_INS, cTL(centeridList), xgetCValueCenterid(), "CenterId");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CenterId: {NotNull, bigint(19)}
     * @param centeridList The collection of centerid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterid_NotInScope(Collection<Long> centeridList) {
        doSetCenterid_NotInScope(centeridList);
    }

    protected void doSetCenterid_NotInScope(Collection<Long> centeridList) {
        regINS(CK_NINS, cTL(centeridList), xgetCValueCenterid(), "CenterId");
    }

    protected void regCenterid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterid(), "CenterId"); }
    protected abstract ConditionValue xgetCValueCenterid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_Equal(Long clientid) {
        doSetClientid_Equal(clientid);
    }

    protected void doSetClientid_Equal(Long clientid) {
        regClientid(CK_EQ, clientid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_NotEqual(Long clientid) {
        doSetClientid_NotEqual(clientid);
    }

    protected void doSetClientid_NotEqual(Long clientid) {
        regClientid(CK_NES, clientid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_GreaterThan(Long clientid) {
        regClientid(CK_GT, clientid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_LessThan(Long clientid) {
        regClientid(CK_LT, clientid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_GreaterEqual(Long clientid) {
        regClientid(CK_GE, clientid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientid The value of clientid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientid_LessEqual(Long clientid) {
        regClientid(CK_LE, clientid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param minNumber The min number of clientid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientid(), "ClientId", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientidList The collection of clientid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientid_InScope(Collection<Long> clientidList) {
        doSetClientid_InScope(clientidList);
    }

    protected void doSetClientid_InScope(Collection<Long> clientidList) {
        regINS(CK_INS, cTL(clientidList), xgetCValueClientid(), "ClientId");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ClientId: {NotNull, bigint(19)}
     * @param clientidList The collection of clientid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientid_NotInScope(Collection<Long> clientidList) {
        doSetClientid_NotInScope(clientidList);
    }

    protected void doSetClientid_NotInScope(Collection<Long> clientidList) {
        regINS(CK_NINS, cTL(clientidList), xgetCValueClientid(), "ClientId");
    }

    protected void regClientid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientid(), "ClientId"); }
    protected abstract ConditionValue xgetCValueClientid();

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
    public HpSLCFunction<TTrsorcvdirectCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsorcvdirectCB.class);
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
    public HpSLCFunction<TTrsorcvdirectCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsorcvdirectCB.class);
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
    public HpSLCFunction<TTrsorcvdirectCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsorcvdirectCB.class);
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
    public HpSLCFunction<TTrsorcvdirectCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsorcvdirectCB.class);
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
    public HpSLCFunction<TTrsorcvdirectCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsorcvdirectCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsorcvdirectCB&gt;() {
     *     public void query(TTrsorcvdirectCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsorcvdirectCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsorcvdirectCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsorcvdirectCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsorcvdirectCQ sq);

    protected TTrsorcvdirectCB xcreateScalarConditionCB() {
        TTrsorcvdirectCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsorcvdirectCB xcreateScalarConditionPartitionByCB() {
        TTrsorcvdirectCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsorcvdirectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsorcvdirectCB cb = new TTrsorcvdirectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOJTLINEID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsorcvdirectCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsorcvdirectCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsorcvdirectCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsorcvdirectCB cb = new TTrsorcvdirectCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOJTLINEID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsorcvdirectCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsorcvdirectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsorcvdirectCB cb = new TTrsorcvdirectCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsorcvdirectCQ sq);

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
    protected TTrsorcvdirectCB newMyCB() {
        return new TTrsorcvdirectCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsorcvdirectCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
