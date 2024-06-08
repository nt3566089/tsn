package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_RAKUTEN_ORDER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TRakutenOrderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TRakutenOrderDbm _instance = new TRakutenOrderDbm();
    private TRakutenOrderDbm() {}
    public static TRakutenOrderDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getRakutenOrderId(), (et, vl) -> ((TRakutenOrder)et).setRakutenOrderId(ctl(vl)), "rakutenOrderId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderNo(), (et, vl) -> ((TRakutenOrder)et).setOrderNo((String)vl), "orderNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderStatus(), (et, vl) -> ((TRakutenOrder)et).setOrderStatus((String)vl), "orderStatus");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardStatus(), (et, vl) -> ((TRakutenOrder)et).setCardStatus((String)vl), "cardStatus");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPaymentDt(), (et, vl) -> ((TRakutenOrder)et).setPaymentDt((String)vl), "paymentDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getShippingDt(), (et, vl) -> ((TRakutenOrder)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTz(), (et, vl) -> ((TRakutenOrder)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivDt(), (et, vl) -> ((TRakutenOrder)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPersonInCharge(), (et, vl) -> ((TRakutenOrder)et).setPersonInCharge((String)vl), "personInCharge");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSingleMemo(), (et, vl) -> ((TRakutenOrder)et).setSingleMemo((String)vl), "singleMemo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMailInput(), (et, vl) -> ((TRakutenOrder)et).setMailInput((String)vl), "mailInput");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getFirstPayment(), (et, vl) -> ((TRakutenOrder)et).setFirstPayment(ctl(vl)), "firstPayment");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getTerminal(), (et, vl) -> ((TRakutenOrder)et).setTerminal((String)vl), "terminal");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMailCarrierCd(), (et, vl) -> ((TRakutenOrder)et).setMailCarrierCd((String)vl), "mailCarrierCd");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getGiftFlg(), (et, vl) -> ((TRakutenOrder)et).setGiftFlg((String)vl), "giftFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getRakutenOrderComment(), (et, vl) -> ((TRakutenOrder)et).setRakutenOrderComment((String)vl), "rakutenOrderComment");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderDatetime(), (et, vl) -> ((TRakutenOrder)et).setOrderDatetime((String)vl), "orderDatetime");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMultiDelivFlg(), (et, vl) -> ((TRakutenOrder)et).setMultiDelivFlg((String)vl), "multiDelivFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getAlertFlg(), (et, vl) -> ((TRakutenOrder)et).setAlertFlg((String)vl), "alertFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMemberFlg(), (et, vl) -> ((TRakutenOrder)et).setMemberFlg((String)vl), "memberFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getTotal(), (et, vl) -> ((TRakutenOrder)et).setTotal(ctl(vl)), "total");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getTax(), (et, vl) -> ((TRakutenOrder)et).setTax(ctl(vl)), "tax");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCarriage(), (et, vl) -> ((TRakutenOrder)et).setCarriage(ctl(vl)), "carriage");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCod(), (et, vl) -> ((TRakutenOrder)et).setCod(ctl(vl)), "cod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getAmountBilled(), (et, vl) -> ((TRakutenOrder)et).setAmountBilled(ctl(vl)), "amountBilled");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getTotalAmount(), (et, vl) -> ((TRakutenOrder)et).setTotalAmount(ctl(vl)), "totalAmount");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineId(), (et, vl) -> ((TRakutenOrder)et).setCombineId((String)vl), "combineId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineStatus(), (et, vl) -> ((TRakutenOrder)et).setCombineStatus((String)vl), "combineStatus");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineTotal(), (et, vl) -> ((TRakutenOrder)et).setCombineTotal(ctl(vl)), "combineTotal");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineCarriage(), (et, vl) -> ((TRakutenOrder)et).setCombineCarriage(ctl(vl)), "combineCarriage");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineCod(), (et, vl) -> ((TRakutenOrder)et).setCombineCod(ctl(vl)), "combineCod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineTax(), (et, vl) -> ((TRakutenOrder)et).setCombineTax(ctl(vl)), "combineTax");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineBilled(), (et, vl) -> ((TRakutenOrder)et).setCombineBilled(ctl(vl)), "combineBilled");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineAmount(), (et, vl) -> ((TRakutenOrder)et).setCombineAmount(ctl(vl)), "combineAmount");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineBankFee(), (et, vl) -> ((TRakutenOrder)et).setCombineBankFee(ctl(vl)), "combineBankFee");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombinePointUse(), (et, vl) -> ((TRakutenOrder)et).setCombinePointUse(ctl(vl)), "combinePointUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMailFlg(), (et, vl) -> ((TRakutenOrder)et).setMailFlg((String)vl), "mailFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderDt(), (et, vl) -> ((TRakutenOrder)et).setOrderDt((String)vl), "orderDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderTime(), (et, vl) -> ((TRakutenOrder)et).setOrderTime((String)vl), "orderTime");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMobilePaymentNo(), (et, vl) -> ((TRakutenOrder)et).setMobilePaymentNo((String)vl), "mobilePaymentNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getHistoryModFlg(), (et, vl) -> ((TRakutenOrder)et).setHistoryModFlg((String)vl), "historyModFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getHistoryIconFlg(), (et, vl) -> ((TRakutenOrder)et).setHistoryIconFlg((String)vl), "historyIconFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getHistoryMailFlg(), (et, vl) -> ((TRakutenOrder)et).setHistoryMailFlg((String)vl), "historyMailFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivMatchFlg(), (et, vl) -> ((TRakutenOrder)et).setDelivMatchFlg((String)vl), "delivMatchFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointUseFlg(), (et, vl) -> ((TRakutenOrder)et).setPointUseFlg((String)vl), "pointUseFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderZipCd1(), (et, vl) -> ((TRakutenOrder)et).setOrderZipCd1((String)vl), "orderZipCd1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderZipCd2(), (et, vl) -> ((TRakutenOrder)et).setOrderZipCd2((String)vl), "orderZipCd2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderAddress1(), (et, vl) -> ((TRakutenOrder)et).setOrderAddress1((String)vl), "orderAddress1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderAddress2(), (et, vl) -> ((TRakutenOrder)et).setOrderAddress2((String)vl), "orderAddress2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderAddress3(), (et, vl) -> ((TRakutenOrder)et).setOrderAddress3((String)vl), "orderAddress3");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderCustomerNm1(), (et, vl) -> ((TRakutenOrder)et).setOrderCustomerNm1((String)vl), "orderCustomerNm1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderCustomerNm2(), (et, vl) -> ((TRakutenOrder)et).setOrderCustomerNm2((String)vl), "orderCustomerNm2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderCustomerKn1(), (et, vl) -> ((TRakutenOrder)et).setOrderCustomerKn1((String)vl), "orderCustomerKn1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderCustomerKn2(), (et, vl) -> ((TRakutenOrder)et).setOrderCustomerKn2((String)vl), "orderCustomerKn2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderTelNo1(), (et, vl) -> ((TRakutenOrder)et).setOrderTelNo1((String)vl), "orderTelNo1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderTelNo2(), (et, vl) -> ((TRakutenOrder)et).setOrderTelNo2((String)vl), "orderTelNo2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderTelNo3(), (et, vl) -> ((TRakutenOrder)et).setOrderTelNo3((String)vl), "orderTelNo3");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getMailAddress(), (et, vl) -> ((TRakutenOrder)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderSex(), (et, vl) -> ((TRakutenOrder)et).setOrderSex((String)vl), "orderSex");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderBirthday(), (et, vl) -> ((TRakutenOrder)et).setOrderBirthday((String)vl), "orderBirthday");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPaymentMethod(), (et, vl) -> ((TRakutenOrder)et).setPaymentMethod((String)vl), "paymentMethod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardType(), (et, vl) -> ((TRakutenOrder)et).setCardType((String)vl), "cardType");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardNo(), (et, vl) -> ((TRakutenOrder)et).setCardNo((String)vl), "cardNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardNm(), (et, vl) -> ((TRakutenOrder)et).setCardNm((String)vl), "cardNm");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardAvailable(), (et, vl) -> ((TRakutenOrder)et).setCardAvailable((String)vl), "cardAvailable");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardInst(), (et, vl) -> ((TRakutenOrder)et).setCardInst((String)vl), "cardInst");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCardInstComment(), (et, vl) -> ((TRakutenOrder)et).setCardInstComment((String)vl), "cardInstComment");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivMethod(), (et, vl) -> ((TRakutenOrder)et).setDelivMethod((String)vl), "delivMethod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivType(), (et, vl) -> ((TRakutenOrder)et).setDelivType((String)vl), "delivType");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointUse(), (et, vl) -> ((TRakutenOrder)et).setPointUse(ctl(vl)), "pointUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointCondition(), (et, vl) -> ((TRakutenOrder)et).setPointCondition((String)vl), "pointCondition");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointStatus(), (et, vl) -> ((TRakutenOrder)et).setPointStatus((String)vl), "pointStatus");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getBankStatus(), (et, vl) -> ((TRakutenOrder)et).setBankStatus((String)vl), "bankStatus");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getBankFeeFlg(), (et, vl) -> ((TRakutenOrder)et).setBankFeeFlg((String)vl), "bankFeeFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getBankFee(), (et, vl) -> ((TRakutenOrder)et).setBankFee(ctl(vl)), "bankFee");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTitleP(), (et, vl) -> ((TRakutenOrder)et).setWrappingTitleP((String)vl), "wrappingTitleP");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingNmP(), (et, vl) -> ((TRakutenOrder)et).setWrappingNmP((String)vl), "wrappingNmP");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingFeeP(), (et, vl) -> ((TRakutenOrder)et).setWrappingFeeP(ctl(vl)), "wrappingFeeP");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTaxP(), (et, vl) -> ((TRakutenOrder)et).setWrappingTaxP(ctl(vl)), "wrappingTaxP");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTitleR(), (et, vl) -> ((TRakutenOrder)et).setWrappingTitleR((String)vl), "wrappingTitleR");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingNmR(), (et, vl) -> ((TRakutenOrder)et).setWrappingNmR((String)vl), "wrappingNmR");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingFeeR(), (et, vl) -> ((TRakutenOrder)et).setWrappingFeeR(ctl(vl)), "wrappingFeeR");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTaxR(), (et, vl) -> ((TRakutenOrder)et).setWrappingTaxR(ctl(vl)), "wrappingTaxR");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCarriage(), (et, vl) -> ((TRakutenOrder)et).setDelivCarriage(ctl(vl)), "delivCarriage");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCod(), (et, vl) -> ((TRakutenOrder)et).setDelivCod(ctl(vl)), "delivCod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTax(), (et, vl) -> ((TRakutenOrder)et).setDelivTax(ctl(vl)), "delivTax");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCarrierTraceNum(), (et, vl) -> ((TRakutenOrder)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTotal(), (et, vl) -> ((TRakutenOrder)et).setDelivTotal(ctl(vl)), "delivTotal");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getNoshi(), (et, vl) -> ((TRakutenOrder)et).setNoshi((String)vl), "noshi");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivZipCd1(), (et, vl) -> ((TRakutenOrder)et).setDelivZipCd1((String)vl), "delivZipCd1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivZipCd2(), (et, vl) -> ((TRakutenOrder)et).setDelivZipCd2((String)vl), "delivZipCd2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivAddress1(), (et, vl) -> ((TRakutenOrder)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivAddress2(), (et, vl) -> ((TRakutenOrder)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivAddress3(), (et, vl) -> ((TRakutenOrder)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCustomerNm1(), (et, vl) -> ((TRakutenOrder)et).setDelivCustomerNm1((String)vl), "delivCustomerNm1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCustomerNm2(), (et, vl) -> ((TRakutenOrder)et).setDelivCustomerNm2((String)vl), "delivCustomerNm2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCustomerKn1(), (et, vl) -> ((TRakutenOrder)et).setDelivCustomerKn1((String)vl), "delivCustomerKn1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCustomerKn2(), (et, vl) -> ((TRakutenOrder)et).setDelivCustomerKn2((String)vl), "delivCustomerKn2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTelNo1(), (et, vl) -> ((TRakutenOrder)et).setDelivTelNo1((String)vl), "delivTelNo1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTelNo2(), (et, vl) -> ((TRakutenOrder)et).setDelivTelNo2((String)vl), "delivTelNo2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivTelNo3(), (et, vl) -> ((TRakutenOrder)et).setDelivTelNo3((String)vl), "delivTelNo3");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductId(), (et, vl) -> ((TRakutenOrder)et).setProductId((String)vl), "productId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductNm(), (et, vl) -> ((TRakutenOrder)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductNo(), (et, vl) -> ((TRakutenOrder)et).setProductNo((String)vl), "productNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductUrl(), (et, vl) -> ((TRakutenOrder)et).setProductUrl((String)vl), "productUrl");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getUnitPrice(), (et, vl) -> ((TRakutenOrder)et).setUnitPrice(ctl(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getOrderNum(), (et, vl) -> ((TRakutenOrder)et).setOrderNum(ctl(vl)), "orderNum");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductCarriage(), (et, vl) -> ((TRakutenOrder)et).setProductCarriage(ctl(vl)), "productCarriage");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductTax(), (et, vl) -> ((TRakutenOrder)et).setProductTax(ctl(vl)), "productTax");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getProductCod(), (et, vl) -> ((TRakutenOrder)et).setProductCod(ctl(vl)), "productCod");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getItemChoice(), (et, vl) -> ((TRakutenOrder)et).setItemChoice((String)vl), "itemChoice");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointScale(), (et, vl) -> ((TRakutenOrder)et).setPointScale(ctb(vl)), "pointScale");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPointType(), (et, vl) -> ((TRakutenOrder)et).setPointType((String)vl), "pointType");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getRecordNumber(), (et, vl) -> ((TRakutenOrder)et).setRecordNumber(ctl(vl)), "recordNumber");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDeliveryInfo(), (et, vl) -> ((TRakutenOrder)et).setDeliveryInfo((String)vl), "deliveryInfo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getStockType(), (et, vl) -> ((TRakutenOrder)et).setStockType((String)vl), "stockType");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTypeP(), (et, vl) -> ((TRakutenOrder)et).setWrappingTypeP((String)vl), "wrappingTypeP");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getWrappingTypeR(), (et, vl) -> ((TRakutenOrder)et).setWrappingTypeR((String)vl), "wrappingTypeR");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getTomorrowFlg(), (et, vl) -> ((TRakutenOrder)et).setTomorrowFlg((String)vl), "tomorrowFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCouponUse(), (et, vl) -> ((TRakutenOrder)et).setCouponUse(ctl(vl)), "couponUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getShopCouponUse(), (et, vl) -> ((TRakutenOrder)et).setShopCouponUse(ctl(vl)), "shopCouponUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getRakutenCouponUse(), (et, vl) -> ((TRakutenOrder)et).setRakutenCouponUse(ctl(vl)), "rakutenCouponUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getCombineCouponUse(), (et, vl) -> ((TRakutenOrder)et).setCombineCouponUse(ctl(vl)), "combineCouponUse");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelivCompany(), (et, vl) -> ((TRakutenOrder)et).setDelivCompany((String)vl), "delivCompany");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPhamaceFlg(), (et, vl) -> ((TRakutenOrder)et).setPhamaceFlg((String)vl), "phamaceFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getPackingQty(), (et, vl) -> ((TRakutenOrder)et).setPackingQty(ctl(vl)), "packingQty");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemNm1(), (et, vl) -> ((TRakutenOrder)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemNm2(), (et, vl) -> ((TRakutenOrder)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemNm3(), (et, vl) -> ((TRakutenOrder)et).setSlipItemNm3((String)vl), "slipItemNm3");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemNm4(), (et, vl) -> ((TRakutenOrder)et).setSlipItemNm4((String)vl), "slipItemNm4");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemNm5(), (et, vl) -> ((TRakutenOrder)et).setSlipItemNm5((String)vl), "slipItemNm5");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemCd1(), (et, vl) -> ((TRakutenOrder)et).setSlipItemCd1((String)vl), "slipItemCd1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getSlipItemCd2(), (et, vl) -> ((TRakutenOrder)et).setSlipItemCd2((String)vl), "slipItemCd2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getFreightHandling1(), (et, vl) -> ((TRakutenOrder)et).setFreightHandling1((String)vl), "freightHandling1");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getFreightHandling2(), (et, vl) -> ((TRakutenOrder)et).setFreightHandling2((String)vl), "freightHandling2");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getArticle(), (et, vl) -> ((TRakutenOrder)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getReceiveId(), (et, vl) -> ((TRakutenOrder)et).setReceiveId(ctl(vl)), "receiveId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getRowNo(), (et, vl) -> ((TRakutenOrder)et).setRowNo(ctl(vl)), "rowNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getErrorFlg(), (et, vl) -> ((TRakutenOrder)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getImportFlg(), (et, vl) -> ((TRakutenOrder)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getImportTypeId(), (et, vl) -> ((TRakutenOrder)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getEcOrderBId(), (et, vl) -> ((TRakutenOrder)et).setEcOrderBId(ctl(vl)), "ecOrderBId");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getDelFlg(), (et, vl) -> ((TRakutenOrder)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getVersionNo(), (et, vl) -> ((TRakutenOrder)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getControlNo(), (et, vl) -> ((TRakutenOrder)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getAddDt(), (et, vl) -> ((TRakutenOrder)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getAddUser(), (et, vl) -> ((TRakutenOrder)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getAddProcess(), (et, vl) -> ((TRakutenOrder)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getUpdDt(), (et, vl) -> ((TRakutenOrder)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getUpdUser(), (et, vl) -> ((TRakutenOrder)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TRakutenOrder)et).getUpdProcess(), (et, vl) -> ((TRakutenOrder)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TRakutenOrder)et).getTEcOrderB(), (et, vl) -> ((TRakutenOrder)et).setTEcOrderB((TEcOrderB)vl), "TEcOrderB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_RAKUTEN_ORDER";
    protected final String _tableDispName = "T_RAKUTEN_ORDER";
    protected final String _tablePropertyName = "TRakutenOrder";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_RAKUTEN_ORDER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRakutenOrderId = cci("RAKUTEN_ORDER_ID", "RAKUTEN_ORDER_ID", null, null, Long.class, "rakutenOrderId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNo = cci("ORDER_NO", "ORDER_NO", null, null, String.class, "orderNo", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderStatus = cci("ORDER_STATUS", "ORDER_STATUS", null, null, String.class, "orderStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardStatus = cci("CARD_STATUS", "CARD_STATUS", null, null, String.class, "cardStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentDt = cci("PAYMENT_DT", "PAYMENT_DT", null, null, String.class, "paymentDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPersonInCharge = cci("PERSON_IN_CHARGE", "PERSON_IN_CHARGE", null, null, String.class, "personInCharge", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSingleMemo = cci("SINGLE_MEMO", "SINGLE_MEMO", null, null, String.class, "singleMemo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailInput = cci("MAIL_INPUT", "MAIL_INPUT", null, null, String.class, "mailInput", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstPayment = cci("FIRST_PAYMENT", "FIRST_PAYMENT", null, null, Long.class, "firstPayment", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTerminal = cci("TERMINAL", "TERMINAL", null, null, String.class, "terminal", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailCarrierCd = cci("MAIL_CARRIER_CD", "MAIL_CARRIER_CD", null, null, String.class, "mailCarrierCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftFlg = cci("GIFT_FLG", "GIFT_FLG", null, null, String.class, "giftFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRakutenOrderComment = cci("RAKUTEN_ORDER_COMMENT", "RAKUTEN_ORDER_COMMENT", null, null, String.class, "rakutenOrderComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDatetime = cci("ORDER_DATETIME", "ORDER_DATETIME", null, null, String.class, "orderDatetime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMultiDelivFlg = cci("MULTI_DELIV_FLG", "MULTI_DELIV_FLG", null, null, String.class, "multiDelivFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlertFlg = cci("ALERT_FLG", "ALERT_FLG", null, null, String.class, "alertFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberFlg = cci("MEMBER_FLG", "MEMBER_FLG", null, null, String.class, "memberFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotal = cci("TOTAL", "TOTAL", null, null, Long.class, "total", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, Long.class, "tax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriage = cci("CARRIAGE", "CARRIAGE", null, null, Long.class, "carriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCod = cci("COD", "COD", null, null, Long.class, "cod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmountBilled = cci("AMOUNT_BILLED", "AMOUNT_BILLED", null, null, Long.class, "amountBilled", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalAmount = cci("TOTAL_AMOUNT", "TOTAL_AMOUNT", null, null, Long.class, "totalAmount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineId = cci("COMBINE_ID", "COMBINE_ID", null, null, String.class, "combineId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineStatus = cci("COMBINE_STATUS", "COMBINE_STATUS", null, null, String.class, "combineStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineTotal = cci("COMBINE_TOTAL", "COMBINE_TOTAL", null, null, Long.class, "combineTotal", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineCarriage = cci("COMBINE_CARRIAGE", "COMBINE_CARRIAGE", null, null, Long.class, "combineCarriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineCod = cci("COMBINE_COD", "COMBINE_COD", null, null, Long.class, "combineCod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineTax = cci("COMBINE_TAX", "COMBINE_TAX", null, null, Long.class, "combineTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineBilled = cci("COMBINE_BILLED", "COMBINE_BILLED", null, null, Long.class, "combineBilled", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineAmount = cci("COMBINE_AMOUNT", "COMBINE_AMOUNT", null, null, Long.class, "combineAmount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineBankFee = cci("COMBINE_BANK_FEE", "COMBINE_BANK_FEE", null, null, Long.class, "combineBankFee", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombinePointUse = cci("COMBINE_POINT_USE", "COMBINE_POINT_USE", null, null, Long.class, "combinePointUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailFlg = cci("MAIL_FLG", "MAIL_FLG", null, null, String.class, "mailFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderDt = cci("ORDER_DT", "ORDER_DT", null, null, String.class, "orderDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTime = cci("ORDER_TIME", "ORDER_TIME", null, null, String.class, "orderTime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMobilePaymentNo = cci("MOBILE_PAYMENT_NO", "MOBILE_PAYMENT_NO", null, null, String.class, "mobilePaymentNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistoryModFlg = cci("HISTORY_MOD_FLG", "HISTORY_MOD_FLG", null, null, String.class, "historyModFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistoryIconFlg = cci("HISTORY_ICON_FLG", "HISTORY_ICON_FLG", null, null, String.class, "historyIconFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistoryMailFlg = cci("HISTORY_MAIL_FLG", "HISTORY_MAIL_FLG", null, null, String.class, "historyMailFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivMatchFlg = cci("DELIV_MATCH_FLG", "DELIV_MATCH_FLG", null, null, String.class, "delivMatchFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointUseFlg = cci("POINT_USE_FLG", "POINT_USE_FLG", null, null, String.class, "pointUseFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderZipCd1 = cci("ORDER_ZIP_CD1", "ORDER_ZIP_CD1", null, null, String.class, "orderZipCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderZipCd2 = cci("ORDER_ZIP_CD2", "ORDER_ZIP_CD2", null, null, String.class, "orderZipCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress1 = cci("ORDER_ADDRESS1", "ORDER_ADDRESS1", null, null, String.class, "orderAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress2 = cci("ORDER_ADDRESS2", "ORDER_ADDRESS2", null, null, String.class, "orderAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress3 = cci("ORDER_ADDRESS3", "ORDER_ADDRESS3", null, null, String.class, "orderAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerNm1 = cci("ORDER_CUSTOMER_NM1", "ORDER_CUSTOMER_NM1", null, null, String.class, "orderCustomerNm1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerNm2 = cci("ORDER_CUSTOMER_NM2", "ORDER_CUSTOMER_NM2", null, null, String.class, "orderCustomerNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerKn1 = cci("ORDER_CUSTOMER_KN1", "ORDER_CUSTOMER_KN1", null, null, String.class, "orderCustomerKn1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerKn2 = cci("ORDER_CUSTOMER_KN2", "ORDER_CUSTOMER_KN2", null, null, String.class, "orderCustomerKn2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTelNo1 = cci("ORDER_TEL_NO1", "ORDER_TEL_NO1", null, null, String.class, "orderTelNo1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTelNo2 = cci("ORDER_TEL_NO2", "ORDER_TEL_NO2", null, null, String.class, "orderTelNo2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTelNo3 = cci("ORDER_TEL_NO3", "ORDER_TEL_NO3", null, null, String.class, "orderTelNo3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderSex = cci("ORDER_SEX", "ORDER_SEX", null, null, String.class, "orderSex", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderBirthday = cci("ORDER_BIRTHDAY", "ORDER_BIRTHDAY", null, null, String.class, "orderBirthday", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethod = cci("PAYMENT_METHOD", "PAYMENT_METHOD", null, null, String.class, "paymentMethod", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardType = cci("CARD_TYPE", "CARD_TYPE", null, null, String.class, "cardType", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardNo = cci("CARD_NO", "CARD_NO", null, null, String.class, "cardNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardNm = cci("CARD_NM", "CARD_NM", null, null, String.class, "cardNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardAvailable = cci("CARD_AVAILABLE", "CARD_AVAILABLE", null, null, String.class, "cardAvailable", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardInst = cci("CARD_INST", "CARD_INST", null, null, String.class, "cardInst", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardInstComment = cci("CARD_INST_COMMENT", "CARD_INST_COMMENT", null, null, String.class, "cardInstComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivMethod = cci("DELIV_METHOD", "DELIV_METHOD", null, null, String.class, "delivMethod", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivType = cci("DELIV_TYPE", "DELIV_TYPE", null, null, String.class, "delivType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointUse = cci("POINT_USE", "POINT_USE", null, null, Long.class, "pointUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointCondition = cci("POINT_CONDITION", "POINT_CONDITION", null, null, String.class, "pointCondition", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointStatus = cci("POINT_STATUS", "POINT_STATUS", null, null, String.class, "pointStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBankStatus = cci("BANK_STATUS", "BANK_STATUS", null, null, String.class, "bankStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBankFeeFlg = cci("BANK_FEE_FLG", "BANK_FEE_FLG", null, null, String.class, "bankFeeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBankFee = cci("BANK_FEE", "BANK_FEE", null, null, Long.class, "bankFee", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTitleP = cci("WRAPPING_TITLE_P", "WRAPPING_TITLE_P", null, null, String.class, "wrappingTitleP", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingNmP = cci("WRAPPING_NM_P", "WRAPPING_NM_P", null, null, String.class, "wrappingNmP", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingFeeP = cci("WRAPPING_FEE_P", "WRAPPING_FEE_P", null, null, Long.class, "wrappingFeeP", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTaxP = cci("WRAPPING_TAX_P", "WRAPPING_TAX_P", null, null, Long.class, "wrappingTaxP", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTitleR = cci("WRAPPING_TITLE_R", "WRAPPING_TITLE_R", null, null, String.class, "wrappingTitleR", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingNmR = cci("WRAPPING_NM_R", "WRAPPING_NM_R", null, null, String.class, "wrappingNmR", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingFeeR = cci("WRAPPING_FEE_R", "WRAPPING_FEE_R", null, null, Long.class, "wrappingFeeR", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTaxR = cci("WRAPPING_TAX_R", "WRAPPING_TAX_R", null, null, Long.class, "wrappingTaxR", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCarriage = cci("DELIV_CARRIAGE", "DELIV_CARRIAGE", null, null, Long.class, "delivCarriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCod = cci("DELIV_COD", "DELIV_COD", null, null, Long.class, "delivCod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTax = cci("DELIV_TAX", "DELIV_TAX", null, null, Long.class, "delivTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTotal = cci("DELIV_TOTAL", "DELIV_TOTAL", null, null, Long.class, "delivTotal", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshi = cci("NOSHI", "NOSHI", null, null, String.class, "noshi", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd1 = cci("DELIV_ZIP_CD1", "DELIV_ZIP_CD1", null, null, String.class, "delivZipCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd2 = cci("DELIV_ZIP_CD2", "DELIV_ZIP_CD2", null, null, String.class, "delivZipCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm1 = cci("DELIV_CUSTOMER_NM1", "DELIV_CUSTOMER_NM1", null, null, String.class, "delivCustomerNm1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm2 = cci("DELIV_CUSTOMER_NM2", "DELIV_CUSTOMER_NM2", null, null, String.class, "delivCustomerNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerKn1 = cci("DELIV_CUSTOMER_KN1", "DELIV_CUSTOMER_KN1", null, null, String.class, "delivCustomerKn1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerKn2 = cci("DELIV_CUSTOMER_KN2", "DELIV_CUSTOMER_KN2", null, null, String.class, "delivCustomerKn2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo1 = cci("DELIV_TEL_NO1", "DELIV_TEL_NO1", null, null, String.class, "delivTelNo1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo2 = cci("DELIV_TEL_NO2", "DELIV_TEL_NO2", null, null, String.class, "delivTelNo2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo3 = cci("DELIV_TEL_NO3", "DELIV_TEL_NO3", null, null, String.class, "delivTelNo3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, String.class, "productId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNo = cci("PRODUCT_NO", "PRODUCT_NO", null, null, String.class, "productNo", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductUrl = cci("PRODUCT_URL", "PRODUCT_URL", null, null, String.class, "productUrl", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, Long.class, "unitPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNum = cci("ORDER_NUM", "ORDER_NUM", null, null, Long.class, "orderNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCarriage = cci("PRODUCT_CARRIAGE", "PRODUCT_CARRIAGE", null, null, Long.class, "productCarriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductTax = cci("PRODUCT_TAX", "PRODUCT_TAX", null, null, Long.class, "productTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCod = cci("PRODUCT_COD", "PRODUCT_COD", null, null, Long.class, "productCod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemChoice = cci("ITEM_CHOICE", "ITEM_CHOICE", null, null, String.class, "itemChoice", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointScale = cci("POINT_SCALE", "POINT_SCALE", null, null, java.math.BigDecimal.class, "pointScale", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointType = cci("POINT_TYPE", "POINT_TYPE", null, null, String.class, "pointType", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecordNumber = cci("RECORD_NUMBER", "RECORD_NUMBER", null, null, Long.class, "recordNumber", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryInfo = cci("DELIVERY_INFO", "DELIVERY_INFO", null, null, String.class, "deliveryInfo", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockType = cci("STOCK_TYPE", "STOCK_TYPE", null, null, String.class, "stockType", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTypeP = cci("WRAPPING_TYPE_P", "WRAPPING_TYPE_P", null, null, String.class, "wrappingTypeP", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrappingTypeR = cci("WRAPPING_TYPE_R", "WRAPPING_TYPE_R", null, null, String.class, "wrappingTypeR", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTomorrowFlg = cci("TOMORROW_FLG", "TOMORROW_FLG", null, null, String.class, "tomorrowFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCouponUse = cci("COUPON_USE", "COUPON_USE", null, null, Long.class, "couponUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShopCouponUse = cci("SHOP_COUPON_USE", "SHOP_COUPON_USE", null, null, Long.class, "shopCouponUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRakutenCouponUse = cci("RAKUTEN_COUPON_USE", "RAKUTEN_COUPON_USE", null, null, Long.class, "rakutenCouponUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCombineCouponUse = cci("COMBINE_COUPON_USE", "COMBINE_COUPON_USE", null, null, Long.class, "combineCouponUse", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCompany = cci("DELIV_COMPANY", "DELIV_COMPANY", null, null, String.class, "delivCompany", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhamaceFlg = cci("PHAMACE_FLG", "PHAMACE_FLG", null, null, String.class, "phamaceFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingQty = cci("PACKING_QTY", "PACKING_QTY", null, null, Long.class, "packingQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm1 = cci("SLIP_ITEM_NM1", "SLIP_ITEM_NM1", null, null, String.class, "slipItemNm1", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm2 = cci("SLIP_ITEM_NM2", "SLIP_ITEM_NM2", null, null, String.class, "slipItemNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm3 = cci("SLIP_ITEM_NM3", "SLIP_ITEM_NM3", null, null, String.class, "slipItemNm3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm4 = cci("SLIP_ITEM_NM4", "SLIP_ITEM_NM4", null, null, String.class, "slipItemNm4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm5 = cci("SLIP_ITEM_NM5", "SLIP_ITEM_NM5", null, null, String.class, "slipItemNm5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd1 = cci("SLIP_ITEM_CD1", "SLIP_ITEM_CD1", null, null, String.class, "slipItemCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd2 = cci("SLIP_ITEM_CD2", "SLIP_ITEM_CD2", null, null, String.class, "slipItemCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling1 = cci("FREIGHT_HANDLING1", "FREIGHT_HANDLING1", null, null, String.class, "freightHandling1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling2 = cci("FREIGHT_HANDLING2", "FREIGHT_HANDLING2", null, null, String.class, "freightHandling2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticle = cci("ARTICLE", "ARTICLE", null, null, String.class, "article", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveId = cci("RECEIVE_ID", "RECEIVE_ID", null, null, Long.class, "receiveId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, Long.class, "rowNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportTypeId = cci("IMPORT_TYPE_ID", "IMPORT_TYPE_ID", null, null, Long.class, "importTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderBId = cci("EC_ORDER_B_ID", "EC_ORDER_B_ID", null, null, Long.class, "ecOrderBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TEcOrderB", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * RAKUTEN_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRakutenOrderId() { return _columnRakutenOrderId; }
    /**
     * ORDER_NO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNo() { return _columnOrderNo; }
    /**
     * ORDER_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderStatus() { return _columnOrderStatus; }
    /**
     * CARD_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardStatus() { return _columnCardStatus; }
    /**
     * PAYMENT_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDt() { return _columnPaymentDt; }
    /**
     * SHIPPING_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * DELIV_TZ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * DELIV_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * PERSON_IN_CHARGE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPersonInCharge() { return _columnPersonInCharge; }
    /**
     * SINGLE_MEMO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSingleMemo() { return _columnSingleMemo; }
    /**
     * MAIL_INPUT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailInput() { return _columnMailInput; }
    /**
     * FIRST_PAYMENT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstPayment() { return _columnFirstPayment; }
    /**
     * TERMINAL: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTerminal() { return _columnTerminal; }
    /**
     * MAIL_CARRIER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailCarrierCd() { return _columnMailCarrierCd; }
    /**
     * GIFT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftFlg() { return _columnGiftFlg; }
    /**
     * RAKUTEN_ORDER_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRakutenOrderComment() { return _columnRakutenOrderComment; }
    /**
     * ORDER_DATETIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDatetime() { return _columnOrderDatetime; }
    /**
     * MULTI_DELIV_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiDelivFlg() { return _columnMultiDelivFlg; }
    /**
     * ALERT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlertFlg() { return _columnAlertFlg; }
    /**
     * MEMBER_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberFlg() { return _columnMemberFlg; }
    /**
     * TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotal() { return _columnTotal; }
    /**
     * TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriage() { return _columnCarriage; }
    /**
     * COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCod() { return _columnCod; }
    /**
     * AMOUNT_BILLED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmountBilled() { return _columnAmountBilled; }
    /**
     * TOTAL_AMOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalAmount() { return _columnTotalAmount; }
    /**
     * COMBINE_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineId() { return _columnCombineId; }
    /**
     * COMBINE_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineStatus() { return _columnCombineStatus; }
    /**
     * COMBINE_TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineTotal() { return _columnCombineTotal; }
    /**
     * COMBINE_CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineCarriage() { return _columnCombineCarriage; }
    /**
     * COMBINE_COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineCod() { return _columnCombineCod; }
    /**
     * COMBINE_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineTax() { return _columnCombineTax; }
    /**
     * COMBINE_BILLED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineBilled() { return _columnCombineBilled; }
    /**
     * COMBINE_AMOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineAmount() { return _columnCombineAmount; }
    /**
     * COMBINE_BANK_FEE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineBankFee() { return _columnCombineBankFee; }
    /**
     * COMBINE_POINT_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombinePointUse() { return _columnCombinePointUse; }
    /**
     * MAIL_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailFlg() { return _columnMailFlg; }
    /**
     * ORDER_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDt() { return _columnOrderDt; }
    /**
     * ORDER_TIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTime() { return _columnOrderTime; }
    /**
     * MOBILE_PAYMENT_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobilePaymentNo() { return _columnMobilePaymentNo; }
    /**
     * HISTORY_MOD_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistoryModFlg() { return _columnHistoryModFlg; }
    /**
     * HISTORY_ICON_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistoryIconFlg() { return _columnHistoryIconFlg; }
    /**
     * HISTORY_MAIL_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistoryMailFlg() { return _columnHistoryMailFlg; }
    /**
     * DELIV_MATCH_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivMatchFlg() { return _columnDelivMatchFlg; }
    /**
     * POINT_USE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointUseFlg() { return _columnPointUseFlg; }
    /**
     * ORDER_ZIP_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderZipCd1() { return _columnOrderZipCd1; }
    /**
     * ORDER_ZIP_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderZipCd2() { return _columnOrderZipCd2; }
    /**
     * ORDER_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress1() { return _columnOrderAddress1; }
    /**
     * ORDER_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress2() { return _columnOrderAddress2; }
    /**
     * ORDER_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress3() { return _columnOrderAddress3; }
    /**
     * ORDER_CUSTOMER_NM1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerNm1() { return _columnOrderCustomerNm1; }
    /**
     * ORDER_CUSTOMER_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerNm2() { return _columnOrderCustomerNm2; }
    /**
     * ORDER_CUSTOMER_KN1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerKn1() { return _columnOrderCustomerKn1; }
    /**
     * ORDER_CUSTOMER_KN2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerKn2() { return _columnOrderCustomerKn2; }
    /**
     * ORDER_TEL_NO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTelNo1() { return _columnOrderTelNo1; }
    /**
     * ORDER_TEL_NO2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTelNo2() { return _columnOrderTelNo2; }
    /**
     * ORDER_TEL_NO3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTelNo3() { return _columnOrderTelNo3; }
    /**
     * MAIL_ADDRESS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * ORDER_SEX: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderSex() { return _columnOrderSex; }
    /**
     * ORDER_BIRTHDAY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderBirthday() { return _columnOrderBirthday; }
    /**
     * PAYMENT_METHOD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethod() { return _columnPaymentMethod; }
    /**
     * CARD_TYPE: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardType() { return _columnCardType; }
    /**
     * CARD_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardNo() { return _columnCardNo; }
    /**
     * CARD_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardNm() { return _columnCardNm; }
    /**
     * CARD_AVAILABLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardAvailable() { return _columnCardAvailable; }
    /**
     * CARD_INST: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardInst() { return _columnCardInst; }
    /**
     * CARD_INST_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardInstComment() { return _columnCardInstComment; }
    /**
     * DELIV_METHOD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivMethod() { return _columnDelivMethod; }
    /**
     * DELIV_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivType() { return _columnDelivType; }
    /**
     * POINT_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointUse() { return _columnPointUse; }
    /**
     * POINT_CONDITION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointCondition() { return _columnPointCondition; }
    /**
     * POINT_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointStatus() { return _columnPointStatus; }
    /**
     * BANK_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBankStatus() { return _columnBankStatus; }
    /**
     * BANK_FEE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBankFeeFlg() { return _columnBankFeeFlg; }
    /**
     * BANK_FEE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBankFee() { return _columnBankFee; }
    /**
     * WRAPPING_TITLE_P: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTitleP() { return _columnWrappingTitleP; }
    /**
     * WRAPPING_NM_P: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingNmP() { return _columnWrappingNmP; }
    /**
     * WRAPPING_FEE_P: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingFeeP() { return _columnWrappingFeeP; }
    /**
     * WRAPPING_TAX_P: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTaxP() { return _columnWrappingTaxP; }
    /**
     * WRAPPING_TITLE_R: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTitleR() { return _columnWrappingTitleR; }
    /**
     * WRAPPING_NM_R: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingNmR() { return _columnWrappingNmR; }
    /**
     * WRAPPING_FEE_R: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingFeeR() { return _columnWrappingFeeR; }
    /**
     * WRAPPING_TAX_R: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTaxR() { return _columnWrappingTaxR; }
    /**
     * DELIV_CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCarriage() { return _columnDelivCarriage; }
    /**
     * DELIV_COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCod() { return _columnDelivCod; }
    /**
     * DELIV_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTax() { return _columnDelivTax; }
    /**
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * DELIV_TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTotal() { return _columnDelivTotal; }
    /**
     * NOSHI: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshi() { return _columnNoshi; }
    /**
     * DELIV_ZIP_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd1() { return _columnDelivZipCd1; }
    /**
     * DELIV_ZIP_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd2() { return _columnDelivZipCd2; }
    /**
     * DELIV_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress1() { return _columnDelivAddress1; }
    /**
     * DELIV_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress2() { return _columnDelivAddress2; }
    /**
     * DELIV_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress3() { return _columnDelivAddress3; }
    /**
     * DELIV_CUSTOMER_NM1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm1() { return _columnDelivCustomerNm1; }
    /**
     * DELIV_CUSTOMER_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm2() { return _columnDelivCustomerNm2; }
    /**
     * DELIV_CUSTOMER_KN1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerKn1() { return _columnDelivCustomerKn1; }
    /**
     * DELIV_CUSTOMER_KN2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerKn2() { return _columnDelivCustomerKn2; }
    /**
     * DELIV_TEL_NO1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo1() { return _columnDelivTelNo1; }
    /**
     * DELIV_TEL_NO2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo2() { return _columnDelivTelNo2; }
    /**
     * DELIV_TEL_NO3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo3() { return _columnDelivTelNo3; }
    /**
     * PRODUCT_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_NO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNo() { return _columnProductNo; }
    /**
     * PRODUCT_URL: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductUrl() { return _columnProductUrl; }
    /**
     * UNIT_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * ORDER_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNum() { return _columnOrderNum; }
    /**
     * PRODUCT_CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCarriage() { return _columnProductCarriage; }
    /**
     * PRODUCT_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductTax() { return _columnProductTax; }
    /**
     * PRODUCT_COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCod() { return _columnProductCod; }
    /**
     * ITEM_CHOICE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemChoice() { return _columnItemChoice; }
    /**
     * POINT_SCALE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointScale() { return _columnPointScale; }
    /**
     * POINT_TYPE: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointType() { return _columnPointType; }
    /**
     * RECORD_NUMBER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecordNumber() { return _columnRecordNumber; }
    /**
     * DELIVERY_INFO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryInfo() { return _columnDeliveryInfo; }
    /**
     * STOCK_TYPE: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockType() { return _columnStockType; }
    /**
     * WRAPPING_TYPE_P: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTypeP() { return _columnWrappingTypeP; }
    /**
     * WRAPPING_TYPE_R: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrappingTypeR() { return _columnWrappingTypeR; }
    /**
     * TOMORROW_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTomorrowFlg() { return _columnTomorrowFlg; }
    /**
     * COUPON_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCouponUse() { return _columnCouponUse; }
    /**
     * SHOP_COUPON_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShopCouponUse() { return _columnShopCouponUse; }
    /**
     * RAKUTEN_COUPON_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRakutenCouponUse() { return _columnRakutenCouponUse; }
    /**
     * COMBINE_COUPON_USE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCombineCouponUse() { return _columnCombineCouponUse; }
    /**
     * DELIV_COMPANY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCompany() { return _columnDelivCompany; }
    /**
     * PHAMACE_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhamaceFlg() { return _columnPhamaceFlg; }
    /**
     * PACKING_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingQty() { return _columnPackingQty; }
    /**
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm1() { return _columnSlipItemNm1; }
    /**
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm2() { return _columnSlipItemNm2; }
    /**
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm3() { return _columnSlipItemNm3; }
    /**
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm4() { return _columnSlipItemNm4; }
    /**
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm5() { return _columnSlipItemNm5; }
    /**
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd1() { return _columnSlipItemCd1; }
    /**
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd2() { return _columnSlipItemCd2; }
    /**
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling1() { return _columnFreightHandling1; }
    /**
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling2() { return _columnFreightHandling2; }
    /**
     * ARTICLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticle() { return _columnArticle; }
    /**
     * RECEIVE_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveId() { return _columnReceiveId; }
    /**
     * ROW_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNo() { return _columnRowNo; }
    /**
     * ERROR_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * IMPORT_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * IMPORT_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeId() { return _columnImportTypeId; }
    /**
     * EC_ORDER_B_ID: {bigint(19), FK to T_EC_ORDER_B}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBId() { return _columnEcOrderBId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRakutenOrderId());
        ls.add(columnOrderNo());
        ls.add(columnOrderStatus());
        ls.add(columnCardStatus());
        ls.add(columnPaymentDt());
        ls.add(columnShippingDt());
        ls.add(columnDelivTz());
        ls.add(columnDelivDt());
        ls.add(columnPersonInCharge());
        ls.add(columnSingleMemo());
        ls.add(columnMailInput());
        ls.add(columnFirstPayment());
        ls.add(columnTerminal());
        ls.add(columnMailCarrierCd());
        ls.add(columnGiftFlg());
        ls.add(columnRakutenOrderComment());
        ls.add(columnOrderDatetime());
        ls.add(columnMultiDelivFlg());
        ls.add(columnAlertFlg());
        ls.add(columnMemberFlg());
        ls.add(columnTotal());
        ls.add(columnTax());
        ls.add(columnCarriage());
        ls.add(columnCod());
        ls.add(columnAmountBilled());
        ls.add(columnTotalAmount());
        ls.add(columnCombineId());
        ls.add(columnCombineStatus());
        ls.add(columnCombineTotal());
        ls.add(columnCombineCarriage());
        ls.add(columnCombineCod());
        ls.add(columnCombineTax());
        ls.add(columnCombineBilled());
        ls.add(columnCombineAmount());
        ls.add(columnCombineBankFee());
        ls.add(columnCombinePointUse());
        ls.add(columnMailFlg());
        ls.add(columnOrderDt());
        ls.add(columnOrderTime());
        ls.add(columnMobilePaymentNo());
        ls.add(columnHistoryModFlg());
        ls.add(columnHistoryIconFlg());
        ls.add(columnHistoryMailFlg());
        ls.add(columnDelivMatchFlg());
        ls.add(columnPointUseFlg());
        ls.add(columnOrderZipCd1());
        ls.add(columnOrderZipCd2());
        ls.add(columnOrderAddress1());
        ls.add(columnOrderAddress2());
        ls.add(columnOrderAddress3());
        ls.add(columnOrderCustomerNm1());
        ls.add(columnOrderCustomerNm2());
        ls.add(columnOrderCustomerKn1());
        ls.add(columnOrderCustomerKn2());
        ls.add(columnOrderTelNo1());
        ls.add(columnOrderTelNo2());
        ls.add(columnOrderTelNo3());
        ls.add(columnMailAddress());
        ls.add(columnOrderSex());
        ls.add(columnOrderBirthday());
        ls.add(columnPaymentMethod());
        ls.add(columnCardType());
        ls.add(columnCardNo());
        ls.add(columnCardNm());
        ls.add(columnCardAvailable());
        ls.add(columnCardInst());
        ls.add(columnCardInstComment());
        ls.add(columnDelivMethod());
        ls.add(columnDelivType());
        ls.add(columnPointUse());
        ls.add(columnPointCondition());
        ls.add(columnPointStatus());
        ls.add(columnBankStatus());
        ls.add(columnBankFeeFlg());
        ls.add(columnBankFee());
        ls.add(columnWrappingTitleP());
        ls.add(columnWrappingNmP());
        ls.add(columnWrappingFeeP());
        ls.add(columnWrappingTaxP());
        ls.add(columnWrappingTitleR());
        ls.add(columnWrappingNmR());
        ls.add(columnWrappingFeeR());
        ls.add(columnWrappingTaxR());
        ls.add(columnDelivCarriage());
        ls.add(columnDelivCod());
        ls.add(columnDelivTax());
        ls.add(columnCarrierTraceNum());
        ls.add(columnDelivTotal());
        ls.add(columnNoshi());
        ls.add(columnDelivZipCd1());
        ls.add(columnDelivZipCd2());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivCustomerNm1());
        ls.add(columnDelivCustomerNm2());
        ls.add(columnDelivCustomerKn1());
        ls.add(columnDelivCustomerKn2());
        ls.add(columnDelivTelNo1());
        ls.add(columnDelivTelNo2());
        ls.add(columnDelivTelNo3());
        ls.add(columnProductId());
        ls.add(columnProductNm());
        ls.add(columnProductNo());
        ls.add(columnProductUrl());
        ls.add(columnUnitPrice());
        ls.add(columnOrderNum());
        ls.add(columnProductCarriage());
        ls.add(columnProductTax());
        ls.add(columnProductCod());
        ls.add(columnItemChoice());
        ls.add(columnPointScale());
        ls.add(columnPointType());
        ls.add(columnRecordNumber());
        ls.add(columnDeliveryInfo());
        ls.add(columnStockType());
        ls.add(columnWrappingTypeP());
        ls.add(columnWrappingTypeR());
        ls.add(columnTomorrowFlg());
        ls.add(columnCouponUse());
        ls.add(columnShopCouponUse());
        ls.add(columnRakutenCouponUse());
        ls.add(columnCombineCouponUse());
        ls.add(columnDelivCompany());
        ls.add(columnPhamaceFlg());
        ls.add(columnPackingQty());
        ls.add(columnSlipItemNm1());
        ls.add(columnSlipItemNm2());
        ls.add(columnSlipItemNm3());
        ls.add(columnSlipItemNm4());
        ls.add(columnSlipItemNm5());
        ls.add(columnSlipItemCd1());
        ls.add(columnSlipItemCd2());
        ls.add(columnFreightHandling1());
        ls.add(columnFreightHandling2());
        ls.add(columnArticle());
        ls.add(columnReceiveId());
        ls.add(columnRowNo());
        ls.add(columnErrorFlg());
        ls.add(columnImportFlg());
        ls.add(columnImportTypeId());
        ls.add(columnEcOrderBId());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRakutenOrderId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * T_EC_ORDER_B by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTEcOrderB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderBId(), TEcOrderBDbm.getInstance().columnEcOrderBId());
        return cfi("T_RAKUTEN_ORDER_FK1", "TEcOrderB", this, TEcOrderBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TRakutenOrderList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TRakutenOrder"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TRakutenOrderCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TRakutenOrderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TRakutenOrder> getEntityType() { return TRakutenOrder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TRakutenOrder newEntity() { return new TRakutenOrder(); }
    public TRakutenOrder newMyEntity() { return new TRakutenOrder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TRakutenOrder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TRakutenOrder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
