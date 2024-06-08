package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_FUNC as TABLE. <br>
 * <pre>
 * [primary key]
 *     FUNC_ID
 *
 * [column]
 *     FUNC_ID, CLASS_CD, METHOD_CD, FUNC_CD, FUNC_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FUNC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     B_ARG, B_FUNC_ROLE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     bArgList, bFuncRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBFunc {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BFunc> _selectedList;
    protected BehaviorSelector _selector;
    protected BFuncBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBFunc ready(List<BFunc> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BFuncBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BFuncBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BArg> _referrerBArgList;

    /**
     * Load referrer of BArgList by the set-upper of referrer. <br>
     * B_ARG by FUNC_ID, named 'BArgList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bFuncList</span>, <span style="color: #553000">funcLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">funcLoader</span>.<span style="color: #CC4747">loadBArgList</span>(<span style="color: #553000">argCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">argCB</span>.setupSelect...
     *         <span style="color: #553000">argCB</span>.query().set...
     *         <span style="color: #553000">argCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">argLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    argLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BFunc bFunc : <span style="color: #553000">bFuncList</span>) {
     *     ... = bFunc.<span style="color: #CC4747">getBArgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBArg> loadBArgList(ConditionBeanSetupper<BArgCB> refCBLambda) {
        myBhv().loadBArgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBArgList = refLs);
        return hd -> hd.handle(new LoaderOfBArg().ready(_referrerBArgList, _selector));
    }

    protected List<BFuncRole> _referrerBFuncRoleList;

    /**
     * Load referrer of BFuncRoleList by the set-upper of referrer. <br>
     * B_FUNC_ROLE by FUNC_ID, named 'BFuncRoleList'.
     * <pre>
     * <span style="color: #0000C0">bFuncBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bFuncList</span>, <span style="color: #553000">funcLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">funcLoader</span>.<span style="color: #CC4747">loadBFuncRoleList</span>(<span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">roleCB</span>.setupSelect...
     *         <span style="color: #553000">roleCB</span>.query().set...
     *         <span style="color: #553000">roleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">roleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    roleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BFunc bFunc : <span style="color: #553000">bFuncList</span>) {
     *     ... = bFunc.<span style="color: #CC4747">getBFuncRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFuncId_InScope(pkList);
     * cb.query().addOrderBy_FuncId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBFuncRole> loadBFuncRoleList(ConditionBeanSetupper<BFuncRoleCB> refCBLambda) {
        myBhv().loadBFuncRoleList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBFuncRoleList = refLs);
        return hd -> hd.handle(new LoaderOfBFuncRole().ready(_referrerBFuncRoleList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BFunc> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
