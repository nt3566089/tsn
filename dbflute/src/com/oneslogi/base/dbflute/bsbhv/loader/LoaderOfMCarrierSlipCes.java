package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_CARRIER_SLIP_CES as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CUSTOMER, B_CLASS_DTL(BySatDeliveryFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, bClassDtlBySatDeliveryFlg, bClassDtlByResidentialDeliveryFlg, bClassDtlByCodFlg, bClassDtlBySignatureRequiredFlg, bClassDtlBySignatureReleaseFlg, bClassDtlByCallBeforeDeliveryFlg, bClassDtlByFreezableProtectionFlg, bClassDtlByGuaranteedPlusFlg, bClassDtlByResidentialPickupFlg, bClassDtlByDoNotStackStackFlg, bClassDtlByLimitedAccessDeliveryFlg, bClassDtlByLimitedAccessPickupFlg, bClassDtlByOverSizedFlg, bClassDtlByPoisonFlg, bClassDtlByFoogFlg, bClassDtlByLiftgateDeliveryPrepaidFlg, bClassDtlByLiftgateDeliveryCollectFlg, bClassDtlByLiftgatePickupPrepaidFlg, bClassDtlByLiftgatePickupCollectFlg, bClassDtlByInsideDeliveryPrepaidFlg, bClassDtlByInsideDeliveryCollectFlg, bClassDtlByInsidePickupPrepaidFlg, bClassDtlByInsidePickupCollectFlg, bClassDtlByDelFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierSlipCes {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierSlipCes> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierSlipCesBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierSlipCes ready(List<MCarrierSlipCes> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierSlipCesBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierSlipCesBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySatDeliveryFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySatDeliveryFlg() {
        if (_foreignBClassDtlBySatDeliveryFlgLoader == null)
        { _foreignBClassDtlBySatDeliveryFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySatDeliveryFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySatDeliveryFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByResidentialDeliveryFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByResidentialDeliveryFlg() {
        if (_foreignBClassDtlByResidentialDeliveryFlgLoader == null)
        { _foreignBClassDtlByResidentialDeliveryFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByResidentialDeliveryFlg(_selectedList), _selector); }
        return _foreignBClassDtlByResidentialDeliveryFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCodFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCodFlg() {
        if (_foreignBClassDtlByCodFlgLoader == null)
        { _foreignBClassDtlByCodFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCodFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCodFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySignatureRequiredFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySignatureRequiredFlg() {
        if (_foreignBClassDtlBySignatureRequiredFlgLoader == null)
        { _foreignBClassDtlBySignatureRequiredFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySignatureRequiredFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySignatureRequiredFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySignatureReleaseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySignatureReleaseFlg() {
        if (_foreignBClassDtlBySignatureReleaseFlgLoader == null)
        { _foreignBClassDtlBySignatureReleaseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySignatureReleaseFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySignatureReleaseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCallBeforeDeliveryFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCallBeforeDeliveryFlg() {
        if (_foreignBClassDtlByCallBeforeDeliveryFlgLoader == null)
        { _foreignBClassDtlByCallBeforeDeliveryFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCallBeforeDeliveryFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCallBeforeDeliveryFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFreezableProtectionFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByFreezableProtectionFlg() {
        if (_foreignBClassDtlByFreezableProtectionFlgLoader == null)
        { _foreignBClassDtlByFreezableProtectionFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFreezableProtectionFlg(_selectedList), _selector); }
        return _foreignBClassDtlByFreezableProtectionFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByGuaranteedPlusFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByGuaranteedPlusFlg() {
        if (_foreignBClassDtlByGuaranteedPlusFlgLoader == null)
        { _foreignBClassDtlByGuaranteedPlusFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByGuaranteedPlusFlg(_selectedList), _selector); }
        return _foreignBClassDtlByGuaranteedPlusFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByResidentialPickupFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByResidentialPickupFlg() {
        if (_foreignBClassDtlByResidentialPickupFlgLoader == null)
        { _foreignBClassDtlByResidentialPickupFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByResidentialPickupFlg(_selectedList), _selector); }
        return _foreignBClassDtlByResidentialPickupFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDoNotStackStackFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDoNotStackStackFlg() {
        if (_foreignBClassDtlByDoNotStackStackFlgLoader == null)
        { _foreignBClassDtlByDoNotStackStackFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDoNotStackStackFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDoNotStackStackFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitedAccessDeliveryFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitedAccessDeliveryFlg() {
        if (_foreignBClassDtlByLimitedAccessDeliveryFlgLoader == null)
        { _foreignBClassDtlByLimitedAccessDeliveryFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitedAccessDeliveryFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitedAccessDeliveryFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitedAccessPickupFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitedAccessPickupFlg() {
        if (_foreignBClassDtlByLimitedAccessPickupFlgLoader == null)
        { _foreignBClassDtlByLimitedAccessPickupFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitedAccessPickupFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitedAccessPickupFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByOverSizedFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByOverSizedFlg() {
        if (_foreignBClassDtlByOverSizedFlgLoader == null)
        { _foreignBClassDtlByOverSizedFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByOverSizedFlg(_selectedList), _selector); }
        return _foreignBClassDtlByOverSizedFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPoisonFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPoisonFlg() {
        if (_foreignBClassDtlByPoisonFlgLoader == null)
        { _foreignBClassDtlByPoisonFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPoisonFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPoisonFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFoogFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByFoogFlg() {
        if (_foreignBClassDtlByFoogFlgLoader == null)
        { _foreignBClassDtlByFoogFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFoogFlg(_selectedList), _selector); }
        return _foreignBClassDtlByFoogFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLiftgateDeliveryPrepaidFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLiftgateDeliveryPrepaidFlg() {
        if (_foreignBClassDtlByLiftgateDeliveryPrepaidFlgLoader == null)
        { _foreignBClassDtlByLiftgateDeliveryPrepaidFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLiftgateDeliveryPrepaidFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLiftgateDeliveryPrepaidFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLiftgateDeliveryCollectFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLiftgateDeliveryCollectFlg() {
        if (_foreignBClassDtlByLiftgateDeliveryCollectFlgLoader == null)
        { _foreignBClassDtlByLiftgateDeliveryCollectFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLiftgateDeliveryCollectFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLiftgateDeliveryCollectFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLiftgatePickupPrepaidFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLiftgatePickupPrepaidFlg() {
        if (_foreignBClassDtlByLiftgatePickupPrepaidFlgLoader == null)
        { _foreignBClassDtlByLiftgatePickupPrepaidFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLiftgatePickupPrepaidFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLiftgatePickupPrepaidFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLiftgatePickupCollectFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLiftgatePickupCollectFlg() {
        if (_foreignBClassDtlByLiftgatePickupCollectFlgLoader == null)
        { _foreignBClassDtlByLiftgatePickupCollectFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLiftgatePickupCollectFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLiftgatePickupCollectFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInsideDeliveryPrepaidFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInsideDeliveryPrepaidFlg() {
        if (_foreignBClassDtlByInsideDeliveryPrepaidFlgLoader == null)
        { _foreignBClassDtlByInsideDeliveryPrepaidFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInsideDeliveryPrepaidFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInsideDeliveryPrepaidFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInsideDeliveryCollectFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInsideDeliveryCollectFlg() {
        if (_foreignBClassDtlByInsideDeliveryCollectFlgLoader == null)
        { _foreignBClassDtlByInsideDeliveryCollectFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInsideDeliveryCollectFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInsideDeliveryCollectFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInsidePickupPrepaidFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInsidePickupPrepaidFlg() {
        if (_foreignBClassDtlByInsidePickupPrepaidFlgLoader == null)
        { _foreignBClassDtlByInsidePickupPrepaidFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInsidePickupPrepaidFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInsidePickupPrepaidFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInsidePickupCollectFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInsidePickupCollectFlg() {
        if (_foreignBClassDtlByInsidePickupCollectFlgLoader == null)
        { _foreignBClassDtlByInsidePickupCollectFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInsidePickupCollectFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInsidePickupCollectFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierSlipCes> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
