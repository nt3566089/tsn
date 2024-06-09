package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of T_EC_ORDER_R as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, STATEMENT_OUT_FLG, STATEMENT_OUT_USER_ID, STATEMENT_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_H, B_USER, B_CLASS_DTL(ByInvoiceCreateFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tEcOrderH, bUser, bClassDtlByInvoiceCreateFlg, bClassDtlByStatementOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTEcOrderR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TEcOrderR> _selectedList;
    protected BehaviorSelector _selector;
    protected TEcOrderRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTEcOrderR ready(List<TEcOrderR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TEcOrderRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TEcOrderRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTEcOrderH _foreignTEcOrderHLoader;
    public LoaderOfTEcOrderH pulloutTEcOrderH() {
        if (_foreignTEcOrderHLoader == null)
        { _foreignTEcOrderHLoader = new LoaderOfTEcOrderH().ready(myBhv().pulloutTEcOrderH(_selectedList), _selector); }
        return _foreignTEcOrderHLoader;
    }

    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInvoiceCreateFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInvoiceCreateFlg() {
        if (_foreignBClassDtlByInvoiceCreateFlgLoader == null)
        { _foreignBClassDtlByInvoiceCreateFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInvoiceCreateFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInvoiceCreateFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStatementOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStatementOutFlg() {
        if (_foreignBClassDtlByStatementOutFlgLoader == null)
        { _foreignBClassDtlByStatementOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStatementOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStatementOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TEcOrderR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
