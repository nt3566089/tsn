package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_PASSWORD_POLICY as TABLE. <br>
 * <pre>
 * [primary key]
 *     PASSWORD_POLICY_ID
 *
 * [column]
 *     PASSWORD_POLICY_ID, PASSWORD_POLICY_NM, FIRST_CHANGE_CONTROL, MIN_LENGTH, MIN_ALPHA, MIN_LOWER_CASE, MIN_UPPER_CASE, MIN_NUMBERS, MIN_SYMBOL, MAX_AGE, MAX_FAILURE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PASSWORD_POLICY_ID
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
public class LoaderOfBPasswordPolicy {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BPasswordPolicy> _selectedList;
    protected BehaviorSelector _selector;
    protected BPasswordPolicyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBPasswordPolicy ready(List<BPasswordPolicy> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BPasswordPolicyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BPasswordPolicyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BPasswordPolicy> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
