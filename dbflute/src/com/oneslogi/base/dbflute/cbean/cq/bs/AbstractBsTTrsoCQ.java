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
 * The abstract condition-query of T_TRSO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSoid_IsNull() { regSoid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSoid_IsNotNull() { regSoid(CK_ISNN, DOBJ); }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_Equal(Long sokey) {
        doSetSokey_Equal(sokey);
    }

    protected void doSetSokey_Equal(Long sokey) {
        regSokey(CK_EQ, sokey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_NotEqual(Long sokey) {
        doSetSokey_NotEqual(sokey);
    }

    protected void doSetSokey_NotEqual(Long sokey) {
        regSokey(CK_NES, sokey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterThan(Long sokey) {
        regSokey(CK_GT, sokey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessThan(Long sokey) {
        regSokey(CK_LT, sokey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_GreaterEqual(Long sokey) {
        regSokey(CK_GE, sokey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokey The value of sokey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSokey_LessEqual(Long sokey) {
        regSokey(CK_LE, sokey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sokey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSokey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSokey(), "SOKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokeyList The collection of sokey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_InScope(Collection<Long> sokeyList) {
        doSetSokey_InScope(sokeyList);
    }

    protected void doSetSokey_InScope(Collection<Long> sokeyList) {
        regINS(CK_INS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOKEY: {NotNull, bigint(19)}
     * @param sokeyList The collection of sokey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSokey_NotInScope(Collection<Long> sokeyList) {
        doSetSokey_NotInScope(sokeyList);
    }

    protected void doSetSokey_NotInScope(Collection<Long> sokeyList) {
        regINS(CK_NINS, cTL(sokeyList), xgetCValueSokey(), "SOKEY");
    }

    protected void regSokey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSokey(), "SOKEY"); }
    protected abstract ConditionValue xgetCValueSokey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_Equal(String ownersono) {
        doSetOwnersono_Equal(fRES(ownersono));
    }

    protected void doSetOwnersono_Equal(String ownersono) {
        regOwnersono(CK_EQ, ownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotEqual(String ownersono) {
        doSetOwnersono_NotEqual(fRES(ownersono));
    }

    protected void doSetOwnersono_NotEqual(String ownersono) {
        regOwnersono(CK_NES, ownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersonoList The collection of ownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_InScope(Collection<String> ownersonoList) {
        doSetOwnersono_InScope(ownersonoList);
    }

    protected void doSetOwnersono_InScope(Collection<String> ownersonoList) {
        regINS(CK_INS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersonoList The collection of ownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotInScope(Collection<String> ownersonoList) {
        doSetOwnersono_NotInScope(ownersonoList);
    }

    protected void doSetOwnersono_NotInScope(Collection<String> ownersonoList) {
        regINS(CK_NINS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)} <br>
     * <pre>e.g. setOwnersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersono The value of ownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersono_LikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNull() { regOwnersono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNullOrEmpty() { regOwnersono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNotNull() { regOwnersono(CK_ISNN, DOBJ); }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_Equal(String preownersono) {
        doSetPreownersono_Equal(fRES(preownersono));
    }

    protected void doSetPreownersono_Equal(String preownersono) {
        regPreownersono(CK_EQ, preownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_NotEqual(String preownersono) {
        doSetPreownersono_NotEqual(fRES(preownersono));
    }

    protected void doSetPreownersono_NotEqual(String preownersono) {
        regPreownersono(CK_NES, preownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_GreaterThan(String preownersono) {
        regPreownersono(CK_GT, fRES(preownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_LessThan(String preownersono) {
        regPreownersono(CK_LT, fRES(preownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_GreaterEqual(String preownersono) {
        regPreownersono(CK_GE, fRES(preownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_LessEqual(String preownersono) {
        regPreownersono(CK_LE, fRES(preownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersonoList The collection of preownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_InScope(Collection<String> preownersonoList) {
        doSetPreownersono_InScope(preownersonoList);
    }

    protected void doSetPreownersono_InScope(Collection<String> preownersonoList) {
        regINS(CK_INS, cTL(preownersonoList), xgetCValuePreownersono(), "PREOWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersonoList The collection of preownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_NotInScope(Collection<String> preownersonoList) {
        doSetPreownersono_NotInScope(preownersonoList);
    }

    protected void doSetPreownersono_NotInScope(Collection<String> preownersonoList) {
        regINS(CK_NINS, cTL(preownersonoList), xgetCValuePreownersono(), "PREOWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREOWNERSONO: {varchar(60)} <br>
     * <pre>e.g. setPreownersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param preownersono The value of preownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPreownersono_LikeSearch(String preownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(preownersono), xgetCValuePreownersono(), "PREOWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPreownersono_NotLikeSearch(String preownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(preownersono), xgetCValuePreownersono(), "PREOWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     * @param preownersono The value of preownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPreownersono_PrefixSearch(String preownersono) {
        setPreownersono_LikeSearch(preownersono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     */
    public void setPreownersono_IsNull() { regPreownersono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     */
    public void setPreownersono_IsNullOrEmpty() { regPreownersono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PREOWNERSONO: {varchar(60)}
     */
    public void setPreownersono_IsNotNull() { regPreownersono(CK_ISNN, DOBJ); }

    protected void regPreownersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePreownersono(), "PREOWNERSONO"); }
    protected abstract ConditionValue xgetCValuePreownersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_Equal(String sotype) {
        doSetSotype_Equal(fRES(sotype));
    }

    protected void doSetSotype_Equal(String sotype) {
        regSotype(CK_EQ, sotype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_NotEqual(String sotype) {
        doSetSotype_NotEqual(fRES(sotype));
    }

    protected void doSetSotype_NotEqual(String sotype) {
        regSotype(CK_NES, sotype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_GreaterThan(String sotype) {
        regSotype(CK_GT, fRES(sotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_LessThan(String sotype) {
        regSotype(CK_LT, fRES(sotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_GreaterEqual(String sotype) {
        regSotype(CK_GE, fRES(sotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_LessEqual(String sotype) {
        regSotype(CK_LE, fRES(sotype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotypeList The collection of sotype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_InScope(Collection<String> sotypeList) {
        doSetSotype_InScope(sotypeList);
    }

    protected void doSetSotype_InScope(Collection<String> sotypeList) {
        regINS(CK_INS, cTL(sotypeList), xgetCValueSotype(), "SOTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotypeList The collection of sotype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_NotInScope(Collection<String> sotypeList) {
        doSetSotype_NotInScope(sotypeList);
    }

    protected void doSetSotype_NotInScope(Collection<String> sotypeList) {
        regINS(CK_NINS, cTL(sotypeList), xgetCValueSotype(), "SOTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTYPE: {varchar(30)} <br>
     * <pre>e.g. setSotype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotype The value of sotype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotype_LikeSearch(String sotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotype), xgetCValueSotype(), "SOTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotype_NotLikeSearch(String sotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotype), xgetCValueSotype(), "SOTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTYPE: {varchar(30)}
     * @param sotype The value of sotype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotype_PrefixSearch(String sotype) {
        setSotype_LikeSearch(sotype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     */
    public void setSotype_IsNull() { regSotype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     */
    public void setSotype_IsNullOrEmpty() { regSotype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTYPE: {varchar(30)}
     */
    public void setSotype_IsNotNull() { regSotype(CK_ISNN, DOBJ); }

    protected void regSotype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotype(), "SOTYPE"); }
    protected abstract ConditionValue xgetCValueSotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_Equal(String partflg) {
        doSetPartflg_Equal(fRES(partflg));
    }

    protected void doSetPartflg_Equal(String partflg) {
        regPartflg(CK_EQ, partflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_NotEqual(String partflg) {
        doSetPartflg_NotEqual(fRES(partflg));
    }

    protected void doSetPartflg_NotEqual(String partflg) {
        regPartflg(CK_NES, partflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_GreaterThan(String partflg) {
        regPartflg(CK_GT, fRES(partflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_LessThan(String partflg) {
        regPartflg(CK_LT, fRES(partflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_GreaterEqual(String partflg) {
        regPartflg(CK_GE, fRES(partflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_LessEqual(String partflg) {
        regPartflg(CK_LE, fRES(partflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflgList The collection of partflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_InScope(Collection<String> partflgList) {
        doSetPartflg_InScope(partflgList);
    }

    protected void doSetPartflg_InScope(Collection<String> partflgList) {
        regINS(CK_INS, cTL(partflgList), xgetCValuePartflg(), "PARTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflgList The collection of partflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_NotInScope(Collection<String> partflgList) {
        doSetPartflg_NotInScope(partflgList);
    }

    protected void doSetPartflg_NotInScope(Collection<String> partflgList) {
        regINS(CK_NINS, cTL(partflgList), xgetCValuePartflg(), "PARTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]} <br>
     * <pre>e.g. setPartflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param partflg The value of partflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPartflg_LikeSearch(String partflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partflg), xgetCValuePartflg(), "PARTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPartflg_NotLikeSearch(String partflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partflg), xgetCValuePartflg(), "PARTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARTFLG: {NotNull, char(1), default=[(0)]}
     * @param partflg The value of partflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPartflg_PrefixSearch(String partflg) {
        setPartflg_LikeSearch(partflg, xcLSOPPre());
    }

    protected void regPartflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartflg(), "PARTFLG"); }
    protected abstract ConditionValue xgetCValuePartflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_Equal(String sts) {
        doSetSts_Equal(fRES(sts));
    }

    protected void doSetSts_Equal(String sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotEqual(String sts) {
        doSetSts_NotEqual(fRES(sts));
    }

    protected void doSetSts_NotEqual(String sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(String sts) {
        regSts(CK_GT, fRES(sts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_LessThan(String sts) {
        regSts(CK_LT, fRES(sts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(String sts) {
        regSts(CK_GE, fRES(sts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_LessEqual(String sts) {
        regSts(CK_LE, fRES(sts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<String> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<String> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<String> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<String> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setSts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sts The value of sts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSts_LikeSearch(String sts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sts), xgetCValueSts(), "STS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSts_NotLikeSearch(String sts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sts), xgetCValueSts(), "STS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {IX, NotNull, varchar(30)}
     * @param sts The value of sts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_PrefixSearch(String sts) {
        setSts_LikeSearch(sts, xcLSOPPre());
    }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
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
     * COMPANYCD: {IX, varchar(30)}
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
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
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
     * COMPANYCD: {IX, varchar(30)}
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
     * COMPANYCD: {IX, varchar(30)} <br>
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
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     */
    public void setCompanycd_IsNull() { regCompanycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     */
    public void setCompanycd_IsNullOrEmpty() { regCompanycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {IX, varchar(30)}
     */
    public void setCompanycd_IsNotNull() { regCompanycd(CK_ISNN, DOBJ); }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_Equal(Long orderkey) {
        doSetOrderkey_Equal(orderkey);
    }

    protected void doSetOrderkey_Equal(Long orderkey) {
        regOrderkey(CK_EQ, orderkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_NotEqual(Long orderkey) {
        doSetOrderkey_NotEqual(orderkey);
    }

    protected void doSetOrderkey_NotEqual(Long orderkey) {
        regOrderkey(CK_NES, orderkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_GreaterThan(Long orderkey) {
        regOrderkey(CK_GT, orderkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_LessThan(Long orderkey) {
        regOrderkey(CK_LT, orderkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_GreaterEqual(Long orderkey) {
        regOrderkey(CK_GE, orderkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkey The value of orderkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderkey_LessEqual(Long orderkey) {
        regOrderkey(CK_LE, orderkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param minNumber The min number of orderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderkey(), "ORDERKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkeyList The collection of orderkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderkey_InScope(Collection<Long> orderkeyList) {
        doSetOrderkey_InScope(orderkeyList);
    }

    protected void doSetOrderkey_InScope(Collection<Long> orderkeyList) {
        regINS(CK_INS, cTL(orderkeyList), xgetCValueOrderkey(), "ORDERKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDERKEY: {bigint(19)}
     * @param orderkeyList The collection of orderkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderkey_NotInScope(Collection<Long> orderkeyList) {
        doSetOrderkey_NotInScope(orderkeyList);
    }

    protected void doSetOrderkey_NotInScope(Collection<Long> orderkeyList) {
        regINS(CK_NINS, cTL(orderkeyList), xgetCValueOrderkey(), "ORDERKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     */
    public void setOrderkey_IsNull() { regOrderkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERKEY: {bigint(19)}
     */
    public void setOrderkey_IsNotNull() { regOrderkey(CK_ISNN, DOBJ); }

    protected void regOrderkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderkey(), "ORDERKEY"); }
    protected abstract ConditionValue xgetCValueOrderkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_Equal(String ownerorderno) {
        doSetOwnerorderno_Equal(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_Equal(String ownerorderno) {
        regOwnerorderno(CK_EQ, ownerorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotEqual(String ownerorderno) {
        doSetOwnerorderno_NotEqual(fRES(ownerorderno));
    }

    protected void doSetOwnerorderno_NotEqual(String ownerorderno) {
        regOwnerorderno(CK_NES, ownerorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterThan(String ownerorderno) {
        regOwnerorderno(CK_GT, fRES(ownerorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessThan(String ownerorderno) {
        regOwnerorderno(CK_LT, fRES(ownerorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_GreaterEqual(String ownerorderno) {
        regOwnerorderno(CK_GE, fRES(ownerorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_LessEqual(String ownerorderno) {
        regOwnerorderno(CK_LE, fRES(ownerorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerordernoList The collection of ownerorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_InScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_InScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_InScope(Collection<String> ownerordernoList) {
        regINS(CK_INS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OWNERORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerordernoList The collection of ownerorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        doSetOwnerorderno_NotInScope(ownerordernoList);
    }

    protected void doSetOwnerorderno_NotInScope(Collection<String> ownerordernoList) {
        regINS(CK_NINS, cTL(ownerordernoList), xgetCValueOwnerorderno(), "OWNERORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)} <br>
     * <pre>e.g. setOwnerorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerorderno The value of ownerorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerorderno_LikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OWNERORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerorderno_NotLikeSearch(String ownerorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerorderno), xgetCValueOwnerorderno(), "OWNERORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     * @param ownerorderno The value of ownerorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerorderno_PrefixSearch(String ownerorderno) {
        setOwnerorderno_LikeSearch(ownerorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNull() { regOwnerorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNullOrEmpty() { regOwnerorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERORDERNO: {varchar(60)}
     */
    public void setOwnerorderno_IsNotNull() { regOwnerorderno(CK_ISNN, DOBJ); }

    protected void regOwnerorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerorderno(), "OWNERORDERNO"); }
    protected abstract ConditionValue xgetCValueOwnerorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_Equal(String ordertype) {
        doSetOrdertype_Equal(fRES(ordertype));
    }

    protected void doSetOrdertype_Equal(String ordertype) {
        regOrdertype(CK_EQ, ordertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotEqual(String ordertype) {
        doSetOrdertype_NotEqual(fRES(ordertype));
    }

    protected void doSetOrdertype_NotEqual(String ordertype) {
        regOrdertype(CK_NES, ordertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterThan(String ordertype) {
        regOrdertype(CK_GT, fRES(ordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessThan(String ordertype) {
        regOrdertype(CK_LT, fRES(ordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_GreaterEqual(String ordertype) {
        regOrdertype(CK_GE, fRES(ordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_LessEqual(String ordertype) {
        regOrdertype(CK_LE, fRES(ordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_InScope(Collection<String> ordertypeList) {
        doSetOrdertype_InScope(ordertypeList);
    }

    protected void doSetOrdertype_InScope(Collection<String> ordertypeList) {
        regINS(CK_INS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertypeList The collection of ordertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_NotInScope(Collection<String> ordertypeList) {
        doSetOrdertype_NotInScope(ordertypeList);
    }

    protected void doSetOrdertype_NotInScope(Collection<String> ordertypeList) {
        regINS(CK_NINS, cTL(ordertypeList), xgetCValueOrdertype(), "ORDERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)} <br>
     * <pre>e.g. setOrdertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordertype The value of ordertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdertype_LikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdertype_NotLikeSearch(String ordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordertype), xgetCValueOrdertype(), "ORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     * @param ordertype The value of ordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdertype_PrefixSearch(String ordertype) {
        setOrdertype_LikeSearch(ordertype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNull() { regOrdertype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNullOrEmpty() { regOrdertype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERTYPE: {varchar(30)}
     */
    public void setOrdertype_IsNotNull() { regOrdertype(CK_ISNN, DOBJ); }

    protected void regOrdertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdertype(), "ORDERTYPE"); }
    protected abstract ConditionValue xgetCValueOrdertype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_Equal(String custorderno) {
        doSetCustorderno_Equal(fRES(custorderno));
    }

    protected void doSetCustorderno_Equal(String custorderno) {
        regCustorderno(CK_EQ, custorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotEqual(String custorderno) {
        doSetCustorderno_NotEqual(fRES(custorderno));
    }

    protected void doSetCustorderno_NotEqual(String custorderno) {
        regCustorderno(CK_NES, custorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterThan(String custorderno) {
        regCustorderno(CK_GT, fRES(custorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessThan(String custorderno) {
        regCustorderno(CK_LT, fRES(custorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_GreaterEqual(String custorderno) {
        regCustorderno(CK_GE, fRES(custorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_LessEqual(String custorderno) {
        regCustorderno(CK_LE, fRES(custorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custordernoList The collection of custorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_InScope(Collection<String> custordernoList) {
        doSetCustorderno_InScope(custordernoList);
    }

    protected void doSetCustorderno_InScope(Collection<String> custordernoList) {
        regINS(CK_INS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custordernoList The collection of custorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_NotInScope(Collection<String> custordernoList) {
        doSetCustorderno_NotInScope(custordernoList);
    }

    protected void doSetCustorderno_NotInScope(Collection<String> custordernoList) {
        regINS(CK_NINS, cTL(custordernoList), xgetCValueCustorderno(), "CUSTORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)} <br>
     * <pre>e.g. setCustorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param custorderno The value of custorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustorderno_LikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustorderno_NotLikeSearch(String custorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(custorderno), xgetCValueCustorderno(), "CUSTORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     * @param custorderno The value of custorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustorderno_PrefixSearch(String custorderno) {
        setCustorderno_LikeSearch(custorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNull() { regCustorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNullOrEmpty() { regCustorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTORDERNO: {varchar(60)}
     */
    public void setCustorderno_IsNotNull() { regCustorderno(CK_ISNN, DOBJ); }

    protected void regCustorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustorderno(), "CUSTORDERNO"); }
    protected abstract ConditionValue xgetCValueCustorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
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
     * CUSTOMER_CD: {varchar(60)}
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
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
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
     * CUSTOMER_CD: {varchar(60)}
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
     * CUSTOMER_CD: {varchar(60)} <br>
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
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {varchar(60)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

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
     * ORDERDATE: {varchar(8)}
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
     * ORDERDATE: {varchar(8)}
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
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterThan(String orderdate) {
        regOrderdate(CK_GT, fRES(orderdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessThan(String orderdate) {
        regOrderdate(CK_LT, fRES(orderdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_GreaterEqual(String orderdate) {
        regOrderdate(CK_GE, fRES(orderdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_LessEqual(String orderdate) {
        regOrderdate(CK_LE, fRES(orderdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdateList The collection of orderdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_InScope(Collection<String> orderdateList) {
        doSetOrderdate_InScope(orderdateList);
    }

    protected void doSetOrderdate_InScope(Collection<String> orderdateList) {
        regINS(CK_INS, cTL(orderdateList), xgetCValueOrderdate(), "ORDERDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdateList The collection of orderdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_NotInScope(Collection<String> orderdateList) {
        doSetOrderdate_NotInScope(orderdateList);
    }

    protected void doSetOrderdate_NotInScope(Collection<String> orderdateList) {
        regINS(CK_NINS, cTL(orderdateList), xgetCValueOrderdate(), "ORDERDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)} <br>
     * <pre>e.g. setOrderdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderdate The value of orderdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderdate_LikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderdate), xgetCValueOrderdate(), "ORDERDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderdate_NotLikeSearch(String orderdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderdate), xgetCValueOrderdate(), "ORDERDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERDATE: {varchar(8)}
     * @param orderdate The value of orderdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderdate_PrefixSearch(String orderdate) {
        setOrderdate_LikeSearch(orderdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNull() { regOrderdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNullOrEmpty() { regOrderdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERDATE: {varchar(8)}
     */
    public void setOrderdate_IsNotNull() { regOrderdate(CK_ISNN, DOBJ); }

    protected void regOrderdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderdate(), "ORDERDATE"); }
    protected abstract ConditionValue xgetCValueOrderdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_Equal(String shipschdate) {
        doSetShipschdate_Equal(fRES(shipschdate));
    }

    protected void doSetShipschdate_Equal(String shipschdate) {
        regShipschdate(CK_EQ, shipschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotEqual(String shipschdate) {
        doSetShipschdate_NotEqual(fRES(shipschdate));
    }

    protected void doSetShipschdate_NotEqual(String shipschdate) {
        regShipschdate(CK_NES, shipschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterThan(String shipschdate) {
        regShipschdate(CK_GT, fRES(shipschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessThan(String shipschdate) {
        regShipschdate(CK_LT, fRES(shipschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterEqual(String shipschdate) {
        regShipschdate(CK_GE, fRES(shipschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessEqual(String shipschdate) {
        regShipschdate(CK_LE, fRES(shipschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdateList The collection of shipschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_InScope(Collection<String> shipschdateList) {
        doSetShipschdate_InScope(shipschdateList);
    }

    protected void doSetShipschdate_InScope(Collection<String> shipschdateList) {
        regINS(CK_INS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdateList The collection of shipschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotInScope(Collection<String> shipschdateList) {
        doSetShipschdate_NotInScope(shipschdateList);
    }

    protected void doSetShipschdate_NotInScope(Collection<String> shipschdateList) {
        regINS(CK_NINS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setShipschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipschdate The value of shipschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipschdate_LikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschdate_NotLikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {IX, NotNull, varchar(8)}
     * @param shipschdate The value of shipschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_PrefixSearch(String shipschdate) {
        setShipschdate_LikeSearch(shipschdate, xcLSOPPre());
    }

    protected void regShipschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschdate(), "SHIPSCHDATE"); }
    protected abstract ConditionValue xgetCValueShipschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_Equal(String shipdate) {
        doSetShipdate_Equal(fRES(shipdate));
    }

    protected void doSetShipdate_Equal(String shipdate) {
        regShipdate(CK_EQ, shipdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotEqual(String shipdate) {
        doSetShipdate_NotEqual(fRES(shipdate));
    }

    protected void doSetShipdate_NotEqual(String shipdate) {
        regShipdate(CK_NES, shipdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterThan(String shipdate) {
        regShipdate(CK_GT, fRES(shipdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessThan(String shipdate) {
        regShipdate(CK_LT, fRES(shipdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterEqual(String shipdate) {
        regShipdate(CK_GE, fRES(shipdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessEqual(String shipdate) {
        regShipdate(CK_LE, fRES(shipdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdateList The collection of shipdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_InScope(Collection<String> shipdateList) {
        doSetShipdate_InScope(shipdateList);
    }

    protected void doSetShipdate_InScope(Collection<String> shipdateList) {
        regINS(CK_INS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdateList The collection of shipdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotInScope(Collection<String> shipdateList) {
        doSetShipdate_NotInScope(shipdateList);
    }

    protected void doSetShipdate_NotInScope(Collection<String> shipdateList) {
        regINS(CK_NINS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)} <br>
     * <pre>e.g. setShipdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipdate The value of shipdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipdate_LikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipdate_NotLikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_PrefixSearch(String shipdate) {
        setShipdate_LikeSearch(shipdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNull() { regShipdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNullOrEmpty() { regShipdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNotNull() { regShipdate(CK_ISNN, DOBJ); }

    protected void regShipdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipdate(), "SHIPDATE"); }
    protected abstract ConditionValue xgetCValueShipdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_Equal(String delivschdate) {
        doSetDelivschdate_Equal(fRES(delivschdate));
    }

    protected void doSetDelivschdate_Equal(String delivschdate) {
        regDelivschdate(CK_EQ, delivschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_NotEqual(String delivschdate) {
        doSetDelivschdate_NotEqual(fRES(delivschdate));
    }

    protected void doSetDelivschdate_NotEqual(String delivschdate) {
        regDelivschdate(CK_NES, delivschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_GreaterThan(String delivschdate) {
        regDelivschdate(CK_GT, fRES(delivschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_LessThan(String delivschdate) {
        regDelivschdate(CK_LT, fRES(delivschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_GreaterEqual(String delivschdate) {
        regDelivschdate(CK_GE, fRES(delivschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_LessEqual(String delivschdate) {
        regDelivschdate(CK_LE, fRES(delivschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdateList The collection of delivschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_InScope(Collection<String> delivschdateList) {
        doSetDelivschdate_InScope(delivschdateList);
    }

    protected void doSetDelivschdate_InScope(Collection<String> delivschdateList) {
        regINS(CK_INS, cTL(delivschdateList), xgetCValueDelivschdate(), "DELIVSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdateList The collection of delivschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_NotInScope(Collection<String> delivschdateList) {
        doSetDelivschdate_NotInScope(delivschdateList);
    }

    protected void doSetDelivschdate_NotInScope(Collection<String> delivschdateList) {
        regINS(CK_NINS, cTL(delivschdateList), xgetCValueDelivschdate(), "DELIVSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} <br>
     * <pre>e.g. setDelivschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivschdate The value of delivschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivschdate_LikeSearch(String delivschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivschdate), xgetCValueDelivschdate(), "DELIVSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivschdate_NotLikeSearch(String delivschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivschdate), xgetCValueDelivschdate(), "DELIVSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivschdate_PrefixSearch(String delivschdate) {
        setDelivschdate_LikeSearch(delivschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     */
    public void setDelivschdate_IsNull() { regDelivschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     */
    public void setDelivschdate_IsNullOrEmpty() { regDelivschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {varchar(8), default=[sysdatetime()]}
     */
    public void setDelivschdate_IsNotNull() { regDelivschdate(CK_ISNN, DOBJ); }

    protected void regDelivschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivschdate(), "DELIVSCHDATE"); }
    protected abstract ConditionValue xgetCValueDelivschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_Equal(String delivdate) {
        doSetDelivdate_Equal(fRES(delivdate));
    }

    protected void doSetDelivdate_Equal(String delivdate) {
        regDelivdate(CK_EQ, delivdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_NotEqual(String delivdate) {
        doSetDelivdate_NotEqual(fRES(delivdate));
    }

    protected void doSetDelivdate_NotEqual(String delivdate) {
        regDelivdate(CK_NES, delivdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_GreaterThan(String delivdate) {
        regDelivdate(CK_GT, fRES(delivdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_LessThan(String delivdate) {
        regDelivdate(CK_LT, fRES(delivdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_GreaterEqual(String delivdate) {
        regDelivdate(CK_GE, fRES(delivdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_LessEqual(String delivdate) {
        regDelivdate(CK_LE, fRES(delivdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdateList The collection of delivdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_InScope(Collection<String> delivdateList) {
        doSetDelivdate_InScope(delivdateList);
    }

    protected void doSetDelivdate_InScope(Collection<String> delivdateList) {
        regINS(CK_INS, cTL(delivdateList), xgetCValueDelivdate(), "DELIVDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdateList The collection of delivdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_NotInScope(Collection<String> delivdateList) {
        doSetDelivdate_NotInScope(delivdateList);
    }

    protected void doSetDelivdate_NotInScope(Collection<String> delivdateList) {
        regINS(CK_NINS, cTL(delivdateList), xgetCValueDelivdate(), "DELIVDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVDATE: {varchar(8)} <br>
     * <pre>e.g. setDelivdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivdate The value of delivdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivdate_LikeSearch(String delivdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivdate), xgetCValueDelivdate(), "DELIVDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivdate_NotLikeSearch(String delivdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivdate), xgetCValueDelivdate(), "DELIVDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVDATE: {varchar(8)}
     * @param delivdate The value of delivdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivdate_PrefixSearch(String delivdate) {
        setDelivdate_LikeSearch(delivdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     */
    public void setDelivdate_IsNull() { regDelivdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     */
    public void setDelivdate_IsNullOrEmpty() { regDelivdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVDATE: {varchar(8)}
     */
    public void setDelivdate_IsNotNull() { regDelivdate(CK_ISNN, DOBJ); }

    protected void regDelivdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivdate(), "DELIVDATE"); }
    protected abstract ConditionValue xgetCValueDelivdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_Equal(String carryschdate) {
        doSetCarryschdate_Equal(fRES(carryschdate));
    }

    protected void doSetCarryschdate_Equal(String carryschdate) {
        regCarryschdate(CK_EQ, carryschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_NotEqual(String carryschdate) {
        doSetCarryschdate_NotEqual(fRES(carryschdate));
    }

    protected void doSetCarryschdate_NotEqual(String carryschdate) {
        regCarryschdate(CK_NES, carryschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_GreaterThan(String carryschdate) {
        regCarryschdate(CK_GT, fRES(carryschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_LessThan(String carryschdate) {
        regCarryschdate(CK_LT, fRES(carryschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_GreaterEqual(String carryschdate) {
        regCarryschdate(CK_GE, fRES(carryschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_LessEqual(String carryschdate) {
        regCarryschdate(CK_LE, fRES(carryschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdateList The collection of carryschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_InScope(Collection<String> carryschdateList) {
        doSetCarryschdate_InScope(carryschdateList);
    }

    protected void doSetCarryschdate_InScope(Collection<String> carryschdateList) {
        regINS(CK_INS, cTL(carryschdateList), xgetCValueCarryschdate(), "CARRYSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdateList The collection of carryschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_NotInScope(Collection<String> carryschdateList) {
        doSetCarryschdate_NotInScope(carryschdateList);
    }

    protected void doSetCarryschdate_NotInScope(Collection<String> carryschdateList) {
        regINS(CK_NINS, cTL(carryschdateList), xgetCValueCarryschdate(), "CARRYSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setCarryschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carryschdate The value of carryschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarryschdate_LikeSearch(String carryschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carryschdate), xgetCValueCarryschdate(), "CARRYSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarryschdate_NotLikeSearch(String carryschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carryschdate), xgetCValueCarryschdate(), "CARRYSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     * @param carryschdate The value of carryschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryschdate_PrefixSearch(String carryschdate) {
        setCarryschdate_LikeSearch(carryschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     */
    public void setCarryschdate_IsNull() { regCarryschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     */
    public void setCarryschdate_IsNullOrEmpty() { regCarryschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRYSCHDATE: {varchar(8)}
     */
    public void setCarryschdate_IsNotNull() { regCarryschdate(CK_ISNN, DOBJ); }

    protected void regCarryschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarryschdate(), "CARRYSCHDATE"); }
    protected abstract ConditionValue xgetCValueCarryschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_Equal(String carryoutdate) {
        doSetCarryoutdate_Equal(fRES(carryoutdate));
    }

    protected void doSetCarryoutdate_Equal(String carryoutdate) {
        regCarryoutdate(CK_EQ, carryoutdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_NotEqual(String carryoutdate) {
        doSetCarryoutdate_NotEqual(fRES(carryoutdate));
    }

    protected void doSetCarryoutdate_NotEqual(String carryoutdate) {
        regCarryoutdate(CK_NES, carryoutdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_GreaterThan(String carryoutdate) {
        regCarryoutdate(CK_GT, fRES(carryoutdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_LessThan(String carryoutdate) {
        regCarryoutdate(CK_LT, fRES(carryoutdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_GreaterEqual(String carryoutdate) {
        regCarryoutdate(CK_GE, fRES(carryoutdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_LessEqual(String carryoutdate) {
        regCarryoutdate(CK_LE, fRES(carryoutdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdateList The collection of carryoutdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_InScope(Collection<String> carryoutdateList) {
        doSetCarryoutdate_InScope(carryoutdateList);
    }

    protected void doSetCarryoutdate_InScope(Collection<String> carryoutdateList) {
        regINS(CK_INS, cTL(carryoutdateList), xgetCValueCarryoutdate(), "CARRYOUTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdateList The collection of carryoutdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_NotInScope(Collection<String> carryoutdateList) {
        doSetCarryoutdate_NotInScope(carryoutdateList);
    }

    protected void doSetCarryoutdate_NotInScope(Collection<String> carryoutdateList) {
        regINS(CK_NINS, cTL(carryoutdateList), xgetCValueCarryoutdate(), "CARRYOUTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYOUTDATE: {varchar(8)} <br>
     * <pre>e.g. setCarryoutdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carryoutdate The value of carryoutdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarryoutdate_LikeSearch(String carryoutdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carryoutdate), xgetCValueCarryoutdate(), "CARRYOUTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarryoutdate_NotLikeSearch(String carryoutdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carryoutdate), xgetCValueCarryoutdate(), "CARRYOUTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     * @param carryoutdate The value of carryoutdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarryoutdate_PrefixSearch(String carryoutdate) {
        setCarryoutdate_LikeSearch(carryoutdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     */
    public void setCarryoutdate_IsNull() { regCarryoutdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     */
    public void setCarryoutdate_IsNullOrEmpty() { regCarryoutdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRYOUTDATE: {varchar(8)}
     */
    public void setCarryoutdate_IsNotNull() { regCarryoutdate(CK_ISNN, DOBJ); }

    protected void regCarryoutdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarryoutdate(), "CARRYOUTDATE"); }
    protected abstract ConditionValue xgetCValueCarryoutdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_Equal(java.math.BigDecimal transportpriority) {
        doSetTransportpriority_Equal(transportpriority);
    }

    protected void doSetTransportpriority_Equal(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_EQ, transportpriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_NotEqual(java.math.BigDecimal transportpriority) {
        doSetTransportpriority_NotEqual(transportpriority);
    }

    protected void doSetTransportpriority_NotEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_NES, transportpriority);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_GreaterThan(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_GT, transportpriority);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_LessThan(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_LT, transportpriority);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_GreaterEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_GE, transportpriority);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_LessEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_LE, transportpriority);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transportpriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transportpriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransportpriority_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransportpriority(), "TRANSPORTPRIORITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriorityList The collection of transportpriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportpriority_InScope(Collection<java.math.BigDecimal> transportpriorityList) {
        doSetTransportpriority_InScope(transportpriorityList);
    }

    protected void doSetTransportpriority_InScope(Collection<java.math.BigDecimal> transportpriorityList) {
        regINS(CK_INS, cTL(transportpriorityList), xgetCValueTransportpriority(), "TRANSPORTPRIORITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriorityList The collection of transportpriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportpriority_NotInScope(Collection<java.math.BigDecimal> transportpriorityList) {
        doSetTransportpriority_NotInScope(transportpriorityList);
    }

    protected void doSetTransportpriority_NotInScope(Collection<java.math.BigDecimal> transportpriorityList) {
        regINS(CK_NINS, cTL(transportpriorityList), xgetCValueTransportpriority(), "TRANSPORTPRIORITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     */
    public void setTransportpriority_IsNull() { regTransportpriority(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     */
    public void setTransportpriority_IsNotNull() { regTransportpriority(CK_ISNN, DOBJ); }

    protected void regTransportpriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportpriority(), "TRANSPORTPRIORITY"); }
    protected abstract ConditionValue xgetCValueTransportpriority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_Equal(String shiptocd) {
        doSetShiptocd_Equal(fRES(shiptocd));
    }

    protected void doSetShiptocd_Equal(String shiptocd) {
        regShiptocd(CK_EQ, shiptocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotEqual(String shiptocd) {
        doSetShiptocd_NotEqual(fRES(shiptocd));
    }

    protected void doSetShiptocd_NotEqual(String shiptocd) {
        regShiptocd(CK_NES, shiptocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {IX, varchar(30)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_Equal(String shiptosub) {
        doSetShiptosub_Equal(fRES(shiptosub));
    }

    protected void doSetShiptosub_Equal(String shiptosub) {
        regShiptosub(CK_EQ, shiptosub);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_NotEqual(String shiptosub) {
        doSetShiptosub_NotEqual(fRES(shiptosub));
    }

    protected void doSetShiptosub_NotEqual(String shiptosub) {
        regShiptosub(CK_NES, shiptosub);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_GreaterThan(String shiptosub) {
        regShiptosub(CK_GT, fRES(shiptosub));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_LessThan(String shiptosub) {
        regShiptosub(CK_LT, fRES(shiptosub));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_GreaterEqual(String shiptosub) {
        regShiptosub(CK_GE, fRES(shiptosub));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_LessEqual(String shiptosub) {
        regShiptosub(CK_LE, fRES(shiptosub));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosubList The collection of shiptosub as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_InScope(Collection<String> shiptosubList) {
        doSetShiptosub_InScope(shiptosubList);
    }

    protected void doSetShiptosub_InScope(Collection<String> shiptosubList) {
        regINS(CK_INS, cTL(shiptosubList), xgetCValueShiptosub(), "SHIPTOSUB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosubList The collection of shiptosub as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_NotInScope(Collection<String> shiptosubList) {
        doSetShiptosub_NotInScope(shiptosubList);
    }

    protected void doSetShiptosub_NotInScope(Collection<String> shiptosubList) {
        regINS(CK_NINS, cTL(shiptosubList), xgetCValueShiptosub(), "SHIPTOSUB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSUB: {char(1)} <br>
     * <pre>e.g. setShiptosub_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptosub The value of shiptosub as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptosub_LikeSearch(String shiptosub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptosub), xgetCValueShiptosub(), "SHIPTOSUB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptosub_NotLikeSearch(String shiptosub, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptosub), xgetCValueShiptosub(), "SHIPTOSUB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOSUB: {char(1)}
     * @param shiptosub The value of shiptosub as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptosub_PrefixSearch(String shiptosub) {
        setShiptosub_LikeSearch(shiptosub, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     */
    public void setShiptosub_IsNull() { regShiptosub(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOSUB: {char(1)}
     */
    public void setShiptosub_IsNotNull() { regShiptosub(CK_ISNN, DOBJ); }

    protected void regShiptosub(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptosub(), "SHIPTOSUB"); }
    protected abstract ConditionValue xgetCValueShiptosub();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_Equal(String delivname) {
        doSetDelivname_Equal(fRES(delivname));
    }

    protected void doSetDelivname_Equal(String delivname) {
        regDelivname(CK_EQ, delivname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_NotEqual(String delivname) {
        doSetDelivname_NotEqual(fRES(delivname));
    }

    protected void doSetDelivname_NotEqual(String delivname) {
        regDelivname(CK_NES, delivname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_GreaterThan(String delivname) {
        regDelivname(CK_GT, fRES(delivname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_LessThan(String delivname) {
        regDelivname(CK_LT, fRES(delivname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_GreaterEqual(String delivname) {
        regDelivname(CK_GE, fRES(delivname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_LessEqual(String delivname) {
        regDelivname(CK_LE, fRES(delivname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivnameList The collection of delivname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_InScope(Collection<String> delivnameList) {
        doSetDelivname_InScope(delivnameList);
    }

    protected void doSetDelivname_InScope(Collection<String> delivnameList) {
        regINS(CK_INS, cTL(delivnameList), xgetCValueDelivname(), "DELIVNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivnameList The collection of delivname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_NotInScope(Collection<String> delivnameList) {
        doSetDelivname_NotInScope(delivnameList);
    }

    protected void doSetDelivname_NotInScope(Collection<String> delivnameList) {
        regINS(CK_NINS, cTL(delivnameList), xgetCValueDelivname(), "DELIVNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)} <br>
     * <pre>e.g. setDelivname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivname The value of delivname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivname_LikeSearch(String delivname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivname), xgetCValueDelivname(), "DELIVNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivname_NotLikeSearch(String delivname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivname), xgetCValueDelivname(), "DELIVNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVNAME: {varchar(255)}
     * @param delivname The value of delivname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivname_PrefixSearch(String delivname) {
        setDelivname_LikeSearch(delivname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNull() { regDelivname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNullOrEmpty() { regDelivname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVNAME: {varchar(255)}
     */
    public void setDelivname_IsNotNull() { regDelivname(CK_ISNN, DOBJ); }

    protected void regDelivname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivname(), "DELIVNAME"); }
    protected abstract ConditionValue xgetCValueDelivname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
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
     * ADDRESS1: {char(1)}
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
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {char(1)}
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
     * ADDRESS1: {char(1)}
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
     * ADDRESS1: {char(1)} <br>
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
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {char(1)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {char(1)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
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
     * ADDRESS2: {varchar(8)}
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
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(8)}
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
     * ADDRESS2: {varchar(8)}
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
     * ADDRESS2: {varchar(8)} <br>
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
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(8)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(8)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
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
     * ADDRESS3: {varchar(30)}
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
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(30)}
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
     * ADDRESS3: {varchar(30)}
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
     * ADDRESS3: {varchar(30)} <br>
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
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(30)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(30)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
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
     * POSTNO: {char(1)}
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
     * POSTNO: {char(1)}
     * @param postno The value of postno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterThan(String postno) {
        regPostno(CK_GT, fRES(postno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
     * @param postno The value of postno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessThan(String postno) {
        regPostno(CK_LT, fRES(postno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
     * @param postno The value of postno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterEqual(String postno) {
        regPostno(CK_GE, fRES(postno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
     * @param postno The value of postno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessEqual(String postno) {
        regPostno(CK_LE, fRES(postno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSTNO: {char(1)}
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
     * POSTNO: {char(1)}
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
     * POSTNO: {char(1)} <br>
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
     * POSTNO: {char(1)}
     * @param postno The value of postno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPostno_NotLikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postno), xgetCValuePostno(), "POSTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {char(1)}
     * @param postno The value of postno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_PrefixSearch(String postno) {
        setPostno_LikeSearch(postno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
     */
    public void setPostno_IsNull() { regPostno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POSTNO: {char(1)}
     */
    public void setPostno_IsNotNull() { regPostno(CK_ISNN, DOBJ); }

    protected void regPostno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostno(), "POSTNO"); }
    protected abstract ConditionValue xgetCValuePostno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
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
     * COUNTRYCD: {varchar(30)}
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
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterThan(String countrycd) {
        regCountrycd(CK_GT, fRES(countrycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessThan(String countrycd) {
        regCountrycd(CK_LT, fRES(countrycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterEqual(String countrycd) {
        regCountrycd(CK_GE, fRES(countrycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessEqual(String countrycd) {
        regCountrycd(CK_LE, fRES(countrycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(30)}
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
     * COUNTRYCD: {varchar(30)}
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
     * COUNTRYCD: {varchar(30)} <br>
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
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCountrycd_NotLikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countrycd), xgetCValueCountrycd(), "COUNTRYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     * @param countrycd The value of countrycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_PrefixSearch(String countrycd) {
        setCountrycd_LikeSearch(countrycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     */
    public void setCountrycd_IsNull() { regCountrycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     */
    public void setCountrycd_IsNullOrEmpty() { regCountrycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(30)}
     */
    public void setCountrycd_IsNotNull() { regCountrycd(CK_ISNN, DOBJ); }

    protected void regCountrycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountrycd(), "COUNTRYCD"); }
    protected abstract ConditionValue xgetCValueCountrycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
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
     * PORTCD: {varchar(30)}
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
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterThan(String portcd) {
        regPortcd(CK_GT, fRES(portcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessThan(String portcd) {
        regPortcd(CK_LT, fRES(portcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterEqual(String portcd) {
        regPortcd(CK_GE, fRES(portcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessEqual(String portcd) {
        regPortcd(CK_LE, fRES(portcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(30)}
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
     * PORTCD: {varchar(30)}
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
     * PORTCD: {varchar(30)} <br>
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
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPortcd_NotLikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(portcd), xgetCValuePortcd(), "PORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(30)}
     * @param portcd The value of portcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_PrefixSearch(String portcd) {
        setPortcd_LikeSearch(portcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
     */
    public void setPortcd_IsNull() { regPortcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
     */
    public void setPortcd_IsNullOrEmpty() { regPortcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(30)}
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
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_Equal(String phoneno) {
        doSetPhoneno_Equal(fRES(phoneno));
    }

    protected void doSetPhoneno_Equal(String phoneno) {
        regPhoneno(CK_EQ, phoneno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_NotEqual(String phoneno) {
        doSetPhoneno_NotEqual(fRES(phoneno));
    }

    protected void doSetPhoneno_NotEqual(String phoneno) {
        regPhoneno(CK_NES, phoneno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_GreaterThan(String phoneno) {
        regPhoneno(CK_GT, fRES(phoneno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_LessThan(String phoneno) {
        regPhoneno(CK_LT, fRES(phoneno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_GreaterEqual(String phoneno) {
        regPhoneno(CK_GE, fRES(phoneno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_LessEqual(String phoneno) {
        regPhoneno(CK_LE, fRES(phoneno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phonenoList The collection of phoneno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_InScope(Collection<String> phonenoList) {
        doSetPhoneno_InScope(phonenoList);
    }

    protected void doSetPhoneno_InScope(Collection<String> phonenoList) {
        regINS(CK_INS, cTL(phonenoList), xgetCValuePhoneno(), "PHONENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phonenoList The collection of phoneno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_NotInScope(Collection<String> phonenoList) {
        doSetPhoneno_NotInScope(phonenoList);
    }

    protected void doSetPhoneno_NotInScope(Collection<String> phonenoList) {
        regINS(CK_NINS, cTL(phonenoList), xgetCValuePhoneno(), "PHONENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONENO: {varchar(60)} <br>
     * <pre>e.g. setPhoneno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phoneno The value of phoneno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhoneno_LikeSearch(String phoneno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneno), xgetCValuePhoneno(), "PHONENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhoneno_NotLikeSearch(String phoneno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneno), xgetCValuePhoneno(), "PHONENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONENO: {varchar(60)}
     * @param phoneno The value of phoneno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhoneno_PrefixSearch(String phoneno) {
        setPhoneno_LikeSearch(phoneno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     */
    public void setPhoneno_IsNull() { regPhoneno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     */
    public void setPhoneno_IsNullOrEmpty() { regPhoneno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHONENO: {varchar(60)}
     */
    public void setPhoneno_IsNotNull() { regPhoneno(CK_ISNN, DOBJ); }

    protected void regPhoneno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhoneno(), "PHONENO"); }
    protected abstract ConditionValue xgetCValuePhoneno();

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
     * EMAIL: {char(1)}
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
     * EMAIL: {char(1)}
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
     * EMAIL: {char(1)}
     * @param email The value of email as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {char(1)}
     * @param email The value of email as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {char(1)}
     * @param email The value of email as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {char(1)}
     * @param email The value of email as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {char(1)}
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
     * EMAIL: {char(1)}
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
     * EMAIL: {char(1)} <br>
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
     * EMAIL: {char(1)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {char(1)}
     * @param email The value of email as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_PrefixSearch(String email) {
        setEmail_LikeSearch(email, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMAIL: {char(1)}
     */
    public void setEmail_IsNull() { regEmail(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMAIL: {char(1)}
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
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_Equal(String areacd) {
        doSetAreacd_Equal(fRES(areacd));
    }

    protected void doSetAreacd_Equal(String areacd) {
        regAreacd(CK_EQ, areacd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_NotEqual(String areacd) {
        doSetAreacd_NotEqual(fRES(areacd));
    }

    protected void doSetAreacd_NotEqual(String areacd) {
        regAreacd(CK_NES, areacd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_GreaterThan(String areacd) {
        regAreacd(CK_GT, fRES(areacd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_LessThan(String areacd) {
        regAreacd(CK_LT, fRES(areacd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_GreaterEqual(String areacd) {
        regAreacd(CK_GE, fRES(areacd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_LessEqual(String areacd) {
        regAreacd(CK_LE, fRES(areacd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacdList The collection of areacd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_InScope(Collection<String> areacdList) {
        doSetAreacd_InScope(areacdList);
    }

    protected void doSetAreacd_InScope(Collection<String> areacdList) {
        regINS(CK_INS, cTL(areacdList), xgetCValueAreacd(), "AREACD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacdList The collection of areacd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_NotInScope(Collection<String> areacdList) {
        doSetAreacd_NotInScope(areacdList);
    }

    protected void doSetAreacd_NotInScope(Collection<String> areacdList) {
        regINS(CK_NINS, cTL(areacdList), xgetCValueAreacd(), "AREACD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AREACD: {varchar(30)} <br>
     * <pre>e.g. setAreacd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param areacd The value of areacd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAreacd_LikeSearch(String areacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(areacd), xgetCValueAreacd(), "AREACD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAreacd_NotLikeSearch(String areacd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(areacd), xgetCValueAreacd(), "AREACD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AREACD: {varchar(30)}
     * @param areacd The value of areacd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAreacd_PrefixSearch(String areacd) {
        setAreacd_LikeSearch(areacd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     */
    public void setAreacd_IsNull() { regAreacd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     */
    public void setAreacd_IsNullOrEmpty() { regAreacd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AREACD: {varchar(30)}
     */
    public void setAreacd_IsNotNull() { regAreacd(CK_ISNN, DOBJ); }

    protected void regAreacd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAreacd(), "AREACD"); }
    protected abstract ConditionValue xgetCValueAreacd();

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
     * DELIVERYCD: {IX, varchar(30)}
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
     * DELIVERYCD: {IX, varchar(30)}
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
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterThan(String deliverycd) {
        regDeliverycd(CK_GT, fRES(deliverycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessThan(String deliverycd) {
        regDeliverycd(CK_LT, fRES(deliverycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterEqual(String deliverycd) {
        regDeliverycd(CK_GE, fRES(deliverycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessEqual(String deliverycd) {
        regDeliverycd(CK_LE, fRES(deliverycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
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
     * DELIVERYCD: {IX, varchar(30)}
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
     * DELIVERYCD: {IX, varchar(30)} <br>
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
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverycd_NotLikeSearch(String deliverycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverycd), xgetCValueDeliverycd(), "DELIVERYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     * @param deliverycd The value of deliverycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_PrefixSearch(String deliverycd) {
        setDeliverycd_LikeSearch(deliverycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     */
    public void setDeliverycd_IsNull() { regDeliverycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
     */
    public void setDeliverycd_IsNullOrEmpty() { regDeliverycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {IX, varchar(30)}
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
     * CARRIERSNAME: {varchar(100)}
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
     * CARRIERSNAME: {varchar(100)}
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
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterThan(String carriersname) {
        regCarriersname(CK_GT, fRES(carriersname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessThan(String carriersname) {
        regCarriersname(CK_LT, fRES(carriersname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterEqual(String carriersname) {
        regCarriersname(CK_GE, fRES(carriersname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessEqual(String carriersname) {
        regCarriersname(CK_LE, fRES(carriersname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
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
     * CARRIERSNAME: {varchar(100)}
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
     * CARRIERSNAME: {varchar(100)} <br>
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
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriersname_NotLikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_PrefixSearch(String carriersname) {
        setCarriersname_LikeSearch(carriersname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNull() { regCarriersname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNullOrEmpty() { regCarriersname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNotNull() { regCarriersname(CK_ISNN, DOBJ); }

    protected void regCarriersname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriersname(), "CARRIERSNAME"); }
    protected abstract ConditionValue xgetCValueCarriersname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_Equal(String carcd) {
        doSetCarcd_Equal(fRES(carcd));
    }

    protected void doSetCarcd_Equal(String carcd) {
        regCarcd(CK_EQ, carcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_NotEqual(String carcd) {
        doSetCarcd_NotEqual(fRES(carcd));
    }

    protected void doSetCarcd_NotEqual(String carcd) {
        regCarcd(CK_NES, carcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_GreaterThan(String carcd) {
        regCarcd(CK_GT, fRES(carcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_LessThan(String carcd) {
        regCarcd(CK_LT, fRES(carcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_GreaterEqual(String carcd) {
        regCarcd(CK_GE, fRES(carcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_LessEqual(String carcd) {
        regCarcd(CK_LE, fRES(carcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcdList The collection of carcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_InScope(Collection<String> carcdList) {
        doSetCarcd_InScope(carcdList);
    }

    protected void doSetCarcd_InScope(Collection<String> carcdList) {
        regINS(CK_INS, cTL(carcdList), xgetCValueCarcd(), "CARCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcdList The collection of carcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_NotInScope(Collection<String> carcdList) {
        doSetCarcd_NotInScope(carcdList);
    }

    protected void doSetCarcd_NotInScope(Collection<String> carcdList) {
        regINS(CK_NINS, cTL(carcdList), xgetCValueCarcd(), "CARCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARCD: {varchar(30)} <br>
     * <pre>e.g. setCarcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carcd The value of carcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarcd_LikeSearch(String carcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carcd), xgetCValueCarcd(), "CARCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarcd_NotLikeSearch(String carcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carcd), xgetCValueCarcd(), "CARCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARCD: {varchar(30)}
     * @param carcd The value of carcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarcd_PrefixSearch(String carcd) {
        setCarcd_LikeSearch(carcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     */
    public void setCarcd_IsNull() { regCarcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     */
    public void setCarcd_IsNullOrEmpty() { regCarcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARCD: {varchar(30)}
     */
    public void setCarcd_IsNotNull() { regCarcd(CK_ISNN, DOBJ); }

    protected void regCarcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarcd(), "CARCD"); }
    protected abstract ConditionValue xgetCValueCarcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_Equal(Long carrierseq) {
        doSetCarrierseq_Equal(carrierseq);
    }

    protected void doSetCarrierseq_Equal(Long carrierseq) {
        regCarrierseq(CK_EQ, carrierseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_NotEqual(Long carrierseq) {
        doSetCarrierseq_NotEqual(carrierseq);
    }

    protected void doSetCarrierseq_NotEqual(Long carrierseq) {
        regCarrierseq(CK_NES, carrierseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterThan(Long carrierseq) {
        regCarrierseq(CK_GT, carrierseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_LessThan(Long carrierseq) {
        regCarrierseq(CK_LT, carrierseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_GreaterEqual(Long carrierseq) {
        regCarrierseq(CK_GE, carrierseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseq The value of carrierseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierseq_LessEqual(Long carrierseq) {
        regCarrierseq(CK_LE, carrierseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param minNumber The min number of carrierseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierseq(), "CARRIERSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseqList The collection of carrierseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_InScope(Collection<Long> carrierseqList) {
        doSetCarrierseq_InScope(carrierseqList);
    }

    protected void doSetCarrierseq_InScope(Collection<Long> carrierseqList) {
        regINS(CK_INS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     * @param carrierseqList The collection of carrierseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierseq_NotInScope(Collection<Long> carrierseqList) {
        doSetCarrierseq_NotInScope(carrierseqList);
    }

    protected void doSetCarrierseq_NotInScope(Collection<Long> carrierseqList) {
        regINS(CK_NINS, cTL(carrierseqList), xgetCValueCarrierseq(), "CARRIERSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     */
    public void setCarrierseq_IsNull() { regCarrierseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSEQ: {bigint(19), default=[(0)]}
     */
    public void setCarrierseq_IsNotNull() { regCarrierseq(CK_ISNN, DOBJ); }

    protected void regCarrierseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierseq(), "CARRIERSEQ"); }
    protected abstract ConditionValue xgetCValueCarrierseq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_Equal(String itemcd) {
        doSetItemcd_Equal(fRES(itemcd));
    }

    protected void doSetItemcd_Equal(String itemcd) {
        regItemcd(CK_EQ, itemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotEqual(String itemcd) {
        doSetItemcd_NotEqual(fRES(itemcd));
    }

    protected void doSetItemcd_NotEqual(String itemcd) {
        regItemcd(CK_NES, itemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterThan(String itemcd) {
        regItemcd(CK_GT, fRES(itemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessThan(String itemcd) {
        regItemcd(CK_LT, fRES(itemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterEqual(String itemcd) {
        regItemcd(CK_GE, fRES(itemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessEqual(String itemcd) {
        regItemcd(CK_LE, fRES(itemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_InScope(Collection<String> itemcdList) {
        doSetItemcd_InScope(itemcdList);
    }

    protected void doSetItemcd_InScope(Collection<String> itemcdList) {
        regINS(CK_INS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotInScope(Collection<String> itemcdList) {
        doSetItemcd_NotInScope(itemcdList);
    }

    protected void doSetItemcd_NotInScope(Collection<String> itemcdList) {
        regINS(CK_NINS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)} <br>
     * <pre>e.g. setItemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcd The value of itemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcd_LikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcd_NotLikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_PrefixSearch(String itemcd) {
        setItemcd_LikeSearch(itemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNull() { regItemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNullOrEmpty() { regItemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNotNull() { regItemcd(CK_ISNN, DOBJ); }

    protected void regItemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcd(), "ITEMCD"); }
    protected abstract ConditionValue xgetCValueItemcd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_Equal(Long pickingInstId) {
        doSetPickingInstId_Equal(pickingInstId);
    }

    protected void doSetPickingInstId_Equal(Long pickingInstId) {
        regPickingInstId(CK_EQ, pickingInstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_NotEqual(Long pickingInstId) {
        doSetPickingInstId_NotEqual(pickingInstId);
    }

    protected void doSetPickingInstId_NotEqual(Long pickingInstId) {
        regPickingInstId(CK_NES, pickingInstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterThan(Long pickingInstId) {
        regPickingInstId(CK_GT, pickingInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessThan(Long pickingInstId) {
        regPickingInstId(CK_LT, pickingInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterEqual(Long pickingInstId) {
        regPickingInstId(CK_GE, pickingInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessEqual(Long pickingInstId) {
        regPickingInstId(CK_LE, pickingInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param minNumber The min number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstId(), "PICKING_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_InScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        regINS(CK_INS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_NotInScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        regINS(CK_NINS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     */
    public void setPickingInstId_IsNull() { regPickingInstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     */
    public void setPickingInstId_IsNotNull() { regPickingInstId(CK_ISNN, DOBJ); }

    protected void regPickingInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstId(), "PICKING_INST_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_Equal(Long execkey) {
        doSetExeckey_Equal(execkey);
    }

    protected void doSetExeckey_Equal(Long execkey) {
        regExeckey(CK_EQ, execkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_NotEqual(Long execkey) {
        doSetExeckey_NotEqual(execkey);
    }

    protected void doSetExeckey_NotEqual(Long execkey) {
        regExeckey(CK_NES, execkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_GreaterThan(Long execkey) {
        regExeckey(CK_GT, execkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_LessThan(Long execkey) {
        regExeckey(CK_LT, execkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_GreaterEqual(Long execkey) {
        regExeckey(CK_GE, execkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_LessEqual(Long execkey) {
        regExeckey(CK_LE, execkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param minNumber The min number of execkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of execkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExeckey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExeckey(), "EXECKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkeyList The collection of execkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExeckey_InScope(Collection<Long> execkeyList) {
        doSetExeckey_InScope(execkeyList);
    }

    protected void doSetExeckey_InScope(Collection<Long> execkeyList) {
        regINS(CK_INS, cTL(execkeyList), xgetCValueExeckey(), "EXECKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkeyList The collection of execkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExeckey_NotInScope(Collection<Long> execkeyList) {
        doSetExeckey_NotInScope(execkeyList);
    }

    protected void doSetExeckey_NotInScope(Collection<Long> execkeyList) {
        regINS(CK_NINS, cTL(execkeyList), xgetCValueExeckey(), "EXECKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     */
    public void setExeckey_IsNull() { regExeckey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     */
    public void setExeckey_IsNotNull() { regExeckey(CK_ISNN, DOBJ); }

    protected void regExeckey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExeckey(), "EXECKEY"); }
    protected abstract ConditionValue xgetCValueExeckey();

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
    public HpSLCFunction<TTrsoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsoCB.class);
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
    public HpSLCFunction<TTrsoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsoCB.class);
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
    public HpSLCFunction<TTrsoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsoCB.class);
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
    public HpSLCFunction<TTrsoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsoCB.class);
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
    public HpSLCFunction<TTrsoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsoCB&gt;() {
     *     public void query(TTrsoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsoCQ sq);

    protected TTrsoCB xcreateScalarConditionCB() {
        TTrsoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsoCB xcreateScalarConditionPartitionByCB() {
        TTrsoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsoCB cb = new TTrsoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsoCB cb = new TTrsoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsoCB cb = new TTrsoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsoCQ sq);

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
    protected TTrsoCB newMyCB() {
        return new TTrsoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
