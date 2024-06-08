package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_EDI_COLUMN as TABLE. <br>
 * <pre>
 * [primary key]
 *     EDI_COLUMN_ID
 *
 * [column]
 *     EDI_COLUMN_ID, EDI_ID, EDI_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EDI_COLUMN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_EDI
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B
 *
 * [foreign property]
 *     mEdi
 *
 * [referrer property]
 *     mImportTypeBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMEdiColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MEdiColumn> _selectedList;
    protected BehaviorSelector _selector;
    protected MEdiColumnBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMEdiColumn ready(List<MEdiColumn> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MEdiColumnBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MEdiColumnBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MImportTypeB> _referrerMImportTypeBList;

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by EDI_COLUMN_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mEdiColumnBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mEdiColumnList</span>, <span style="color: #553000">columnLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">columnLoader</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MEdiColumn mEdiColumn : <span style="color: #553000">mEdiColumnList</span>) {
     *     ... = mEdiColumn.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEdiColumnId_InScope(pkList);
     * cb.query().addOrderBy_EdiColumnId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportTypeB> loadMImportTypeBList(ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        myBhv().loadMImportTypeBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeBList = refLs);
        return hd -> hd.handle(new LoaderOfMImportTypeB().ready(_referrerMImportTypeBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMEdi _foreignMEdiLoader;
    public LoaderOfMEdi pulloutMEdi() {
        if (_foreignMEdiLoader == null)
        { _foreignMEdiLoader = new LoaderOfMEdi().ready(myBhv().pulloutMEdi(_selectedList), _selector); }
        return _foreignMEdiLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MEdiColumn> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
