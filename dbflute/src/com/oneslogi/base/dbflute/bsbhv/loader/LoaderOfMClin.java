package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CLIN as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIN_ID
 *
 * [column]
 *     CLIN_ID, LINCD, LINNM, SPLCTG, LINBLK1, LINBLK2, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, LINBLK3, SPRPRSID, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMClin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClin> _selectedList;
    protected BehaviorSelector _selector;
    protected MClinBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClin ready(List<MClin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClinBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClinBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MClin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
