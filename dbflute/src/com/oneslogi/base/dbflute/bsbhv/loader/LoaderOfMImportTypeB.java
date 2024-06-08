package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_IMPORT_TYPE_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPORT_TYPE_B_ID
 *
 * [column]
 *     IMPORT_TYPE_B_ID, IMPORT_TYPE_ID, COLUMN_NO, EDI_COLUMN_ID, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_IMPORT_TYPE, M_EDI_COLUMN
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B_COPY_B, M_IMPORT_TYPE_B_COPY_H
 *
 * [foreign property]
 *     mImportType, mEdiColumn
 *
 * [referrer property]
 *     mImportTypeBCopyBList, mImportTypeBCopyHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMImportTypeB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MImportTypeB> _selectedList;
    protected BehaviorSelector _selector;
    protected MImportTypeBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMImportTypeB ready(List<MImportTypeB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MImportTypeBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MImportTypeBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MImportTypeBCopyB> _referrerMImportTypeBCopyBList;

    /**
     * Load referrer of MImportTypeBCopyBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mImportTypeBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadMImportTypeBCopyBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MImportTypeB mImportTypeB : <span style="color: #553000">mImportTypeBList</span>) {
     *     ... = mImportTypeB.<span style="color: #CC4747">getMImportTypeBCopyBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportTypeBCopyB> loadMImportTypeBCopyBList(ConditionBeanSetupper<MImportTypeBCopyBCB> refCBLambda) {
        myBhv().loadMImportTypeBCopyBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeBCopyBList = refLs);
        return hd -> hd.handle(new LoaderOfMImportTypeBCopyB().ready(_referrerMImportTypeBCopyBList, _selector));
    }

    protected List<MImportTypeBCopyH> _referrerMImportTypeBCopyHList;

    /**
     * Load referrer of MImportTypeBCopyHList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mImportTypeBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadMImportTypeBCopyHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MImportTypeB mImportTypeB : <span style="color: #553000">mImportTypeBList</span>) {
     *     ... = mImportTypeB.<span style="color: #CC4747">getMImportTypeBCopyHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportTypeBCopyH> loadMImportTypeBCopyHList(ConditionBeanSetupper<MImportTypeBCopyHCB> refCBLambda) {
        myBhv().loadMImportTypeBCopyHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeBCopyHList = refLs);
        return hd -> hd.handle(new LoaderOfMImportTypeBCopyH().ready(_referrerMImportTypeBCopyHList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMImportType _foreignMImportTypeLoader;
    public LoaderOfMImportType pulloutMImportType() {
        if (_foreignMImportTypeLoader == null)
        { _foreignMImportTypeLoader = new LoaderOfMImportType().ready(myBhv().pulloutMImportType(_selectedList), _selector); }
        return _foreignMImportTypeLoader;
    }

    protected LoaderOfMEdiColumn _foreignMEdiColumnLoader;
    public LoaderOfMEdiColumn pulloutMEdiColumn() {
        if (_foreignMEdiColumnLoader == null)
        { _foreignMEdiColumnLoader = new LoaderOfMEdiColumn().ready(myBhv().pulloutMEdiColumn(_selectedList), _selector); }
        return _foreignMEdiColumnLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MImportTypeB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
