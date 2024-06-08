package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CORG as TABLE. <br>
 * <pre>
 * [primary key]
 *     CORG_ID
 *
 * [column]
 *     CORG_ID, CENTER_ID, ORGID, ORGNMKJF, ORGNMKNF, ORGNMKJ, ORGNMKN, UPORGNCD, ZZBASECD, ZZCOMACD, ZZWHMGID, OTRNK, RDVDID, ZZABLYMD, ZZFRDATEH, ZZTODATEH, SASASID, CMLRASID, ANWHNM, ODTSCD, LNARCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CORG_ID
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
public class LoaderOfMCorg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCorg> _selectedList;
    protected BehaviorSelector _selector;
    protected MCorgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCorg ready(List<MCorg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCorgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCorgBhv.class); return _myBhv; } }

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
    public List<MCorg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
