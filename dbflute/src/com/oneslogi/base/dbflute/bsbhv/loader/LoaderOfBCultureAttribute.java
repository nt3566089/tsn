package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of B_CULTURE_ATTRIBUTE as TABLE. <br>
 * <pre>
 * [primary key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, DATE_TIME_FORMAT_DISPLAY, DATE_TIME_FORMAT_REPORT, DATE_TIME_FORMAT_EXCEL, DATE_TIME_FORMAT_TEXT, DATE_FORMAT_DISPLAY, DATE_FORMAT_REPORT, DATE_FORMAT_EXCEL, DATE_FORMAT_TEXT, TIME_FORMAT_DISPLAY, TIME_FORMAT_REPORT, TIME_FORMAT_EXCEL, TIME_FORMAT_TEXT, NUMBER_FORMAT_DISPLAY, NUMBER_FORMAT_REPORT, NUMBER_FORMAT_EXCEL, NUMBER_FORMAT_TEXT, CURRENCY_FORMAT_REPORT, FONT_NAME_EXCEL, FONT_SIZE_EXCEL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CULTURE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCulture
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBCultureAttribute {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BCultureAttribute> _selectedList;
    protected BehaviorSelector _selector;
    protected BCultureAttributeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBCultureAttribute ready(List<BCultureAttribute> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BCultureAttributeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BCultureAttributeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BCultureAttribute> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
