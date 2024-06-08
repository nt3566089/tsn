package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_ROLE_GRP as TABLE. <br>
 * <pre>
 * [primary key]
 *     ROLE_GRP_ID
 *
 * [column]
 *     ROLE_GRP_ID, ROLE_GRP_CD, DICT_ID, ROLE_CONTROL_CLASS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, V_DICT, B_CLASS_DTL(ByRoleControlClass)
 *
 * [referrer table]
 *     B_ROLE_GRP_DTL, B_USER
 *
 * [foreign property]
 *     bDict, vDict, bClassDtlByRoleControlClass
 *
 * [referrer property]
 *     bRoleGrpDtlList, bUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBRoleGrp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BRoleGrp> _selectedList;
    protected BehaviorSelector _selector;
    protected BRoleGrpBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBRoleGrp ready(List<BRoleGrp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BRoleGrpBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BRoleGrpBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BRoleGrpDtl> _referrerBRoleGrpDtlList;

    /**
     * Load referrer of BRoleGrpDtlList by the set-upper of referrer. <br>
     * B_ROLE_GRP_DTL by ROLE_GRP_ID, named 'BRoleGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadBRoleGrpDtlList</span>(<span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dtlCB</span>.setupSelect...
     *         <span style="color: #553000">dtlCB</span>.query().set...
     *         <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dtlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dtlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRoleGrp bRoleGrp : <span style="color: #553000">bRoleGrpList</span>) {
     *     ... = bRoleGrp.<span style="color: #CC4747">getBRoleGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBRoleGrpDtl> loadBRoleGrpDtlList(ConditionBeanSetupper<BRoleGrpDtlCB> refCBLambda) {
        myBhv().loadBRoleGrpDtlList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBRoleGrpDtlList = refLs);
        return hd -> hd.handle(new LoaderOfBRoleGrpDtl().ready(_referrerBRoleGrpDtlList, _selector));
    }

    protected List<BUser> _referrerBUserList;

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by ROLE_GRP_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bRoleGrpBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bRoleGrpList</span>, <span style="color: #553000">grpLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpLoader</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">userCB</span>.setupSelect...
     *         <span style="color: #553000">userCB</span>.query().set...
     *         <span style="color: #553000">userCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">userLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    userLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BRoleGrp bRoleGrp : <span style="color: #553000">bRoleGrpList</span>) {
     *     ... = bRoleGrp.<span style="color: #CC4747">getBUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleGrpId_InScope(pkList);
     * cb.query().addOrderBy_RoleGrpId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBUser> loadBUserList(ConditionBeanSetupper<BUserCB> refCBLambda) {
        myBhv().loadBUserList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBUserList = refLs);
        return hd -> hd.handle(new LoaderOfBUser().ready(_referrerBUserList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByRoleControlClassLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByRoleControlClass() {
        if (_foreignBClassDtlByRoleControlClassLoader == null)
        { _foreignBClassDtlByRoleControlClassLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByRoleControlClass(_selectedList), _selector); }
        return _foreignBClassDtlByRoleControlClassLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BRoleGrp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
