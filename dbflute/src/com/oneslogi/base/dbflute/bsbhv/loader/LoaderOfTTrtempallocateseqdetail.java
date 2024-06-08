package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRTEMPALLOCATESEQDETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [column]
 *     TEMPORARY_ALLOC_DETAIL_ID, TEMPORARY_ALLOC_ID, ALLOCATESEQ, LOT_ID, LOCATION_ID, LISTKBN, DETAILLINENO, PALLET_ID, TEMPPICKEDQTY1, TEMPPICKEDQTY2, TEMPPICKEDQTY3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TEMPORARY_ALLOC_DETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_TRTEMPALLOCATESEQ
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tTrtempallocateseq
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrtempallocateseqdetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrtempallocateseqdetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrtempallocateseqdetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrtempallocateseqdetail ready(List<TTrtempallocateseqdetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrtempallocateseqdetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrtempallocateseqdetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTTrtempallocateseq _foreignTTrtempallocateseqLoader;
    public LoaderOfTTrtempallocateseq pulloutTTrtempallocateseq() {
        if (_foreignTTrtempallocateseqLoader == null)
        { _foreignTTrtempallocateseqLoader = new LoaderOfTTrtempallocateseq().ready(myBhv().pulloutTTrtempallocateseq(_selectedList), _selector); }
        return _foreignTTrtempallocateseqLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrtempallocateseqdetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
