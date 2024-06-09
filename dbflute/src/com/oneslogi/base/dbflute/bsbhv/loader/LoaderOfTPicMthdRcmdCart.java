package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_PIC_MTHD_RCMD_CART as TABLE. <br>
 * <pre>
 * [primary key]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_CART_ID, PACKING_H_ID, CART_NO, PIC_MTHD_RCMD_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_PACKING_H, T_PIC_MTHD_RCMD
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPackingH, tPicMthdRcmd
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPicMthdRcmdCart {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPicMthdRcmdCart> _selectedList;
    protected BehaviorSelector _selector;
    protected TPicMthdRcmdCartBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPicMthdRcmdCart ready(List<TPicMthdRcmdCart> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPicMthdRcmdCartBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPicMthdRcmdCartBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTPackingH _foreignTPackingHLoader;
    public LoaderOfTPackingH pulloutTPackingH() {
        if (_foreignTPackingHLoader == null)
        { _foreignTPackingHLoader = new LoaderOfTPackingH().ready(myBhv().pulloutTPackingH(_selectedList), _selector); }
        return _foreignTPackingHLoader;
    }

    protected LoaderOfTPicMthdRcmd _foreignTPicMthdRcmdLoader;
    public LoaderOfTPicMthdRcmd pulloutTPicMthdRcmd() {
        if (_foreignTPicMthdRcmdLoader == null)
        { _foreignTPicMthdRcmdLoader = new LoaderOfTPicMthdRcmd().ready(myBhv().pulloutTPicMthdRcmd(_selectedList), _selector); }
        return _foreignTPicMthdRcmdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPicMthdRcmdCart> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
