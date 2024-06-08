package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TSN_USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     TSN_USER_ID
 *
 * [column]
 *     TSN_USER_ID, IMPORT_FLG, COMMON_AUTH_ID, EMPLOYEE_NO, ID_TYPE, ENROLLMENT_STATUS, LAST_NAME, FIRST_NAME, LAST_NAME_KANA, FIRST_NAME_KANA, MAIL_ADDRESS, ADMIN_FLG, COMPANY_UNIT_CD, BIZ_SYSTEM_CD, BIZ_SYSTEM_NM, USER_ROLE_CD, USER_ROLE_NM, PLAN_COMPANY_CD, WMS_COMPANY_CD, DLV_ROOT_COMPANY_CD, SVF_COMPANY_CD, KB_COMPANY_CD, ORDER_LOGIN_COMPANY_CD, ORDER_OFFICE_COMPANY_CD, ORDER_SMARTEDIT_COMPANY_CD, SUPANDDEM_TAX_COMPANY_CD, VALID_FRDATEH, VALID_TODATEH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TSN_USER_ID
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
public class LoaderOfETsnUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETsnUser> _selectedList;
    protected BehaviorSelector _selector;
    protected ETsnUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETsnUser ready(List<ETsnUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETsnUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETsnUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETsnUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
