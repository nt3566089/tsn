package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_TRIFCOMPANYDATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, COMPANYCD, ITEMADMIN, COMPANYGROUP, ACTFLG, NAME, SNAME, ANAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONE1, PHONE2, FAX1, FAX2, REFNAME, EMAIL, URL, TYPEOWNER, TYPECUSTOMER, TYPESHIPTO, TYPESUPPLIER, TYPEWAREHOUSE, TYPECARRIER, TYPEETC, OWNORANOTHERFLG, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, TRANSPORTPRIORITY, PURCHASETYPE, CALENDARCD, OWNERCUSTOMERCD, OWNERSUPPLIERCD, OWNERREFFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LoaderOfETrifcompanydata {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ETrifcompanydata> _selectedList;
    protected BehaviorSelector _selector;
    protected ETrifcompanydataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfETrifcompanydata ready(List<ETrifcompanydata> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ETrifcompanydataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ETrifcompanydataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ETrifcompanydata> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
