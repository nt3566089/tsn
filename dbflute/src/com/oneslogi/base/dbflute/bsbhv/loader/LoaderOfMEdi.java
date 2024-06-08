package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_EDI as TABLE. <br>
 * <pre>
 * [primary key]
 *     EDI_ID
 *
 * [column]
 *     EDI_ID, EDI_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EDI_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     M_EDI_COLUMN, M_IMPORT_TYPE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mEdiColumnList, mImportTypeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMEdi {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MEdi> _selectedList;
    protected BehaviorSelector _selector;
    protected MEdiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMEdi ready(List<MEdi> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MEdiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MEdiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MEdiColumn> _referrerMEdiColumnList;

    /**
     * Load referrer of MEdiColumnList by the set-upper of referrer. <br>
     * M_EDI_COLUMN by EDI_ID, named 'MEdiColumnList'.
     * <pre>
     * <span style="color: #0000C0">mEdiBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mEdiList</span>, <span style="color: #553000">ediLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ediLoader</span>.<span style="color: #CC4747">loadMEdiColumnList</span>(<span style="color: #553000">columnCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">columnCB</span>.setupSelect...
     *         <span style="color: #553000">columnCB</span>.query().set...
     *         <span style="color: #553000">columnCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">columnLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    columnLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MEdi mEdi : <span style="color: #553000">mEdiList</span>) {
     *     ... = mEdi.<span style="color: #CC4747">getMEdiColumnList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEdiId_InScope(pkList);
     * cb.query().addOrderBy_EdiId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMEdiColumn> loadMEdiColumnList(ConditionBeanSetupper<MEdiColumnCB> refCBLambda) {
        myBhv().loadMEdiColumnList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMEdiColumnList = refLs);
        return hd -> hd.handle(new LoaderOfMEdiColumn().ready(_referrerMEdiColumnList, _selector));
    }

    protected List<MImportType> _referrerMImportTypeList;

    /**
     * Load referrer of MImportTypeList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE by EDI_ID, named 'MImportTypeList'.
     * <pre>
     * <span style="color: #0000C0">mEdiBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mEdiList</span>, <span style="color: #553000">ediLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ediLoader</span>.<span style="color: #CC4747">loadMImportTypeList</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MEdi mEdi : <span style="color: #553000">mEdiList</span>) {
     *     ... = mEdi.<span style="color: #CC4747">getMImportTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEdiId_InScope(pkList);
     * cb.query().addOrderBy_EdiId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportType> loadMImportTypeList(ConditionBeanSetupper<MImportTypeCB> refCBLambda) {
        myBhv().loadMImportTypeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeList = refLs);
        return hd -> hd.handle(new LoaderOfMImportType().ready(_referrerMImportTypeList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MEdi> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
