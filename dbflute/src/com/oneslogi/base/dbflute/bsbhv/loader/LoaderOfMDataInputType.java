package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of M_DATA_INPUT_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DATA_INPUT_TYPE_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_ID, DATA_INPUT_TYPE_CD, DATA_INPUT_TYPE_NM, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByDataInputTypeCd)
 *
 * [referrer table]
 *     M_DATA_INPUT_TYPE_B
 *
 * [foreign property]
 *     bClassDtlByDataInputTypeCd
 *
 * [referrer property]
 *     mDataInputTypeBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMDataInputType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MDataInputType> _selectedList;
    protected BehaviorSelector _selector;
    protected MDataInputTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMDataInputType ready(List<MDataInputType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MDataInputTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MDataInputTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MDataInputTypeB> _referrerMDataInputTypeBList;

    /**
     * Load referrer of MDataInputTypeBList by the set-upper of referrer. <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mDataInputTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mDataInputTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadMDataInputTypeBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MDataInputType mDataInputType : <span style="color: #553000">mDataInputTypeList</span>) {
     *     ... = mDataInputType.<span style="color: #CC4747">getMDataInputTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDataInputTypeId_InScope(pkList);
     * cb.query().addOrderBy_DataInputTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDataInputTypeB> loadMDataInputTypeBList(ConditionBeanSetupper<MDataInputTypeBCB> refCBLambda) {
        myBhv().loadMDataInputTypeBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDataInputTypeBList = refLs);
        return hd -> hd.handle(new LoaderOfMDataInputTypeB().ready(_referrerMDataInputTypeBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBClassDtl _foreignBClassDtlByDataInputTypeCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDataInputTypeCd() {
        if (_foreignBClassDtlByDataInputTypeCdLoader == null)
        { _foreignBClassDtlByDataInputTypeCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDataInputTypeCd(_selectedList), _selector); }
        return _foreignBClassDtlByDataInputTypeCdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MDataInputType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
