package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_TRSOJT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOJTID
 *
 * [column]
 *     SOJTID, SOJTKEY, OWNERSONO, CUSTOMER_CD, ORDERDATE, PLANSEQ, PLANRCVDATETIME, BEFOREPLANSEQ, PLANRCVFLG, HTOPEFLG, TRSOADDDATE, TRSOADDFLG, SOID, PLANNAME, PLANPOST, PLANADDRESS, PLANWAREHOUSENAME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrsojt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrsojt> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrsojtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrsojt ready(List<TTrsojt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrsojtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrsojtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrsojt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
