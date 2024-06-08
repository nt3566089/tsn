package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_CULTURE as TABLE. <br>
 * <pre>
 * [primary key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, CULTURE_CD, DICT_ID, LANG_CULTURE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_CULTURE, V_DICT, B_CULTURE_ATTRIBUTE(AsOne)
 *
 * [referrer table]
 *     B_CULTURE, B_DICT_CULTURE, B_INFO, B_MESSAGE, B_USER, M_CENTER, B_CULTURE_ATTRIBUTE
 *
 * [foreign property]
 *     bDict, bCultureSelf, vDict, bCultureAttributeAsOne
 *
 * [referrer property]
 *     bCultureSelfList, bDictCultureList, bInfoList, bMessageList, bUserList, mCenterList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBCulture {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BCulture> _selectedList;
    protected BehaviorSelector _selector;
    protected BCultureBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBCulture ready(List<BCulture> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BCultureBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BCultureBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<BCulture> _referrerBCultureSelfList;

    /**
     * Load referrer of BCultureSelfList by the set-upper of referrer. <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadBCultureSelfList</span>(<span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cultureCB</span>.setupSelect...
     *         <span style="color: #553000">cultureCB</span>.query().set...
     *         <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cultureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cultureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBCultureSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLangCultureId_InScope(pkList);
     * cb.query().addOrderBy_LangCultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBCulture> loadBCultureSelfList(ConditionBeanSetupper<BCultureCB> refCBLambda) {
        myBhv().loadBCultureSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBCultureSelfList = refLs);
        return hd -> hd.handle(new LoaderOfBCulture().ready(_referrerBCultureSelfList, _selector));
    }

    protected List<BDictCulture> _referrerBDictCultureList;

    /**
     * Load referrer of BDictCultureList by the set-upper of referrer. <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadBDictCultureList</span>(<span style="color: #553000">cultureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cultureCB</span>.setupSelect...
     *         <span style="color: #553000">cultureCB</span>.query().set...
     *         <span style="color: #553000">cultureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cultureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cultureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBDictCultureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBDictCulture> loadBDictCultureList(ConditionBeanSetupper<BDictCultureCB> refCBLambda) {
        myBhv().loadBDictCultureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBDictCultureList = refLs);
        return hd -> hd.handle(new LoaderOfBDictCulture().ready(_referrerBDictCultureList, _selector));
    }

    protected List<BInfo> _referrerBInfoList;

    /**
     * Load referrer of BInfoList by the set-upper of referrer. <br>
     * B_INFO by CULTURE_ID, named 'BInfoList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadBInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBInfo> loadBInfoList(ConditionBeanSetupper<BInfoCB> refCBLambda) {
        myBhv().loadBInfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBInfoList = refLs);
        return hd -> hd.handle(new LoaderOfBInfo().ready(_referrerBInfoList, _selector));
    }

    protected List<BMessage> _referrerBMessageList;

    /**
     * Load referrer of BMessageList by the set-upper of referrer. <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadBMessageList</span>(<span style="color: #553000">messageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">messageCB</span>.setupSelect...
     *         <span style="color: #553000">messageCB</span>.query().set...
     *         <span style="color: #553000">messageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">messageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    messageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBMessageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBMessage> loadBMessageList(ConditionBeanSetupper<BMessageCB> refCBLambda) {
        myBhv().loadBMessageList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBMessageList = refLs);
        return hd -> hd.handle(new LoaderOfBMessage().ready(_referrerBMessageList, _selector));
    }

    protected List<BUser> _referrerBUserList;

    /**
     * Load referrer of BUserList by the set-upper of referrer. <br>
     * B_USER by CULTURE_ID, named 'BUserList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadBUserList</span>(<span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">userCB</span>.setupSelect...
     *         <span style="color: #553000">userCB</span>.query().set...
     *         <span style="color: #553000">userCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">userLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    userLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getBUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBUser> loadBUserList(ConditionBeanSetupper<BUserCB> refCBLambda) {
        myBhv().loadBUserList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBUserList = refLs);
        return hd -> hd.handle(new LoaderOfBUser().ready(_referrerBUserList, _selector));
    }

    protected List<MCenter> _referrerMCenterList;

    /**
     * Load referrer of MCenterList by the set-upper of referrer. <br>
     * M_CENTER by CULTURE_ID, named 'MCenterList'.
     * <pre>
     * <span style="color: #0000C0">bCultureBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bCultureList</span>, <span style="color: #553000">cultureLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cultureLoader</span>.<span style="color: #CC4747">loadMCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BCulture bCulture : <span style="color: #553000">bCultureList</span>) {
     *     ... = bCulture.<span style="color: #CC4747">getMCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCultureId_InScope(pkList);
     * cb.query().addOrderBy_CultureId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenter> loadMCenterList(ConditionBeanSetupper<MCenterCB> refCBLambda) {
        myBhv().loadMCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMCenter().ready(_referrerMCenterList, _selector));
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

    protected LoaderOfBCulture _foreignBCultureSelfLoader;
    public LoaderOfBCulture pulloutBCultureSelf() {
        if (_foreignBCultureSelfLoader == null)
        { _foreignBCultureSelfLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCultureSelf(_selectedList), _selector); }
        return _foreignBCultureSelfLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    protected LoaderOfBCultureAttribute _foreignBCultureAttributeAsOneLoader;
    public LoaderOfBCultureAttribute pulloutBCultureAttributeAsOne() {
        if (_foreignBCultureAttributeAsOneLoader == null)
        { _foreignBCultureAttributeAsOneLoader = new LoaderOfBCultureAttribute().ready(myBhv().pulloutBCultureAttributeAsOne(_selectedList), _selector); }
        return _foreignBCultureAttributeAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BCulture> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
