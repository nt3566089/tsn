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
 * The DB meta of T_YAHOO_ORDER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TYahooOrderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TYahooOrderDbm _instance = new TYahooOrderDbm();
    private TYahooOrderDbm() {}
    public static TYahooOrderDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getYahooOrderId(), (et, vl) -> ((TYahooOrder)et).setYahooOrderId(ctl(vl)), "yahooOrderId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOrderId(), (et, vl) -> ((TYahooOrder)et).setOrderId((String)vl), "orderId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getParentOrderId(), (et, vl) -> ((TYahooOrder)et).setParentOrderId((String)vl), "parentOrderId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getDeviceType(), (et, vl) -> ((TYahooOrder)et).setDeviceType((String)vl), "deviceType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getIsAffiliate(), (et, vl) -> ((TYahooOrder)et).setIsAffiliate((String)vl), "isAffiliate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getFspLicenseCode(), (et, vl) -> ((TYahooOrder)et).setFspLicenseCode((String)vl), "fspLicenseCode");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getFspLicenseName(), (et, vl) -> ((TYahooOrder)et).setFspLicenseName((String)vl), "fspLicenseName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOrderTime(), (et, vl) -> ((TYahooOrder)et).setOrderTime((String)vl), "orderTime");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOrderTimeUnixEpoch(), (et, vl) -> ((TYahooOrder)et).setOrderTimeUnixEpoch((String)vl), "orderTimeUnixEpoch");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUsePointType(), (et, vl) -> ((TYahooOrder)et).setUsePointType((String)vl), "usePointType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOrderStatus(), (et, vl) -> ((TYahooOrder)et).setOrderStatus((String)vl), "orderStatus");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getStoreStatus(), (et, vl) -> ((TYahooOrder)et).setStoreStatus((String)vl), "storeStatus");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getReferer(), (et, vl) -> ((TYahooOrder)et).setReferer((String)vl), "referer");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getEntryPoint(), (et, vl) -> ((TYahooOrder)et).setEntryPoint((String)vl), "entryPoint");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getClink(), (et, vl) -> ((TYahooOrder)et).setClink((String)vl), "clink");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSuspectMessage(), (et, vl) -> ((TYahooOrder)et).setSuspectMessage((String)vl), "suspectMessage");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getIsItemCoupon(), (et, vl) -> ((TYahooOrder)et).setIsItemCoupon((String)vl), "isItemCoupon");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getIsShippingCoupon(), (et, vl) -> ((TYahooOrder)et).setIsShippingCoupon((String)vl), "isShippingCoupon");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipName(), (et, vl) -> ((TYahooOrder)et).setShipName((String)vl), "shipName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipFirstName(), (et, vl) -> ((TYahooOrder)et).setShipFirstName((String)vl), "shipFirstName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipLastName(), (et, vl) -> ((TYahooOrder)et).setShipLastName((String)vl), "shipLastName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipAddress1(), (et, vl) -> ((TYahooOrder)et).setShipAddress1((String)vl), "shipAddress1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipAddress2(), (et, vl) -> ((TYahooOrder)et).setShipAddress2((String)vl), "shipAddress2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipCity(), (et, vl) -> ((TYahooOrder)et).setShipCity((String)vl), "shipCity");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipPrefecture(), (et, vl) -> ((TYahooOrder)et).setShipPrefecture((String)vl), "shipPrefecture");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipZipCode(), (et, vl) -> ((TYahooOrder)et).setShipZipCode((String)vl), "shipZipCode");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipNameKana(), (et, vl) -> ((TYahooOrder)et).setShipNameKana((String)vl), "shipNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipFirstNameKana(), (et, vl) -> ((TYahooOrder)et).setShipFirstNameKana((String)vl), "shipFirstNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipLastNameKana(), (et, vl) -> ((TYahooOrder)et).setShipLastNameKana((String)vl), "shipLastNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipAddress1Kana(), (et, vl) -> ((TYahooOrder)et).setShipAddress1Kana((String)vl), "shipAddress1Kana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipAddress2Kana(), (et, vl) -> ((TYahooOrder)et).setShipAddress2Kana((String)vl), "shipAddress2Kana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipCityKana(), (et, vl) -> ((TYahooOrder)et).setShipCityKana((String)vl), "shipCityKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipPrefectureKana(), (et, vl) -> ((TYahooOrder)et).setShipPrefectureKana((String)vl), "shipPrefectureKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipSection1Field(), (et, vl) -> ((TYahooOrder)et).setShipSection1Field((String)vl), "shipSection1Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipSection1Value(), (et, vl) -> ((TYahooOrder)et).setShipSection1Value((String)vl), "shipSection1Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipSection2Field(), (et, vl) -> ((TYahooOrder)et).setShipSection2Field((String)vl), "shipSection2Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipSection2Value(), (et, vl) -> ((TYahooOrder)et).setShipSection2Value((String)vl), "shipSection2Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipPhoneNumber(), (et, vl) -> ((TYahooOrder)et).setShipPhoneNumber((String)vl), "shipPhoneNumber");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipEmgPhoneNumber(), (et, vl) -> ((TYahooOrder)et).setShipEmgPhoneNumber((String)vl), "shipEmgPhoneNumber");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipMethod(), (et, vl) -> ((TYahooOrder)et).setShipMethod((String)vl), "shipMethod");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipMethodName(), (et, vl) -> ((TYahooOrder)et).setShipMethodName((String)vl), "shipMethodName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipRequestDate(), (et, vl) -> ((TYahooOrder)et).setShipRequestDate((String)vl), "shipRequestDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipRequestTime(), (et, vl) -> ((TYahooOrder)et).setShipRequestTime((String)vl), "shipRequestTime");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipNotes(), (et, vl) -> ((TYahooOrder)et).setShipNotes((String)vl), "shipNotes");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getArriveType(), (et, vl) -> ((TYahooOrder)et).setArriveType((String)vl), "arriveType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipInvoiceNumber1(), (et, vl) -> ((TYahooOrder)et).setShipInvoiceNumber1((String)vl), "shipInvoiceNumber1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipInvoiceNumber2(), (et, vl) -> ((TYahooOrder)et).setShipInvoiceNumber2((String)vl), "shipInvoiceNumber2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipUrl(), (et, vl) -> ((TYahooOrder)et).setShipUrl((String)vl), "shipUrl");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipDate(), (et, vl) -> ((TYahooOrder)et).setShipDate((String)vl), "shipDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGiftWrapType(), (et, vl) -> ((TYahooOrder)et).setGiftWrapType((String)vl), "giftWrapType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGiftWrapPaperType(), (et, vl) -> ((TYahooOrder)et).setGiftWrapPaperType((String)vl), "giftWrapPaperType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGiftWrapName(), (et, vl) -> ((TYahooOrder)et).setGiftWrapName((String)vl), "giftWrapName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getNeedBillSlip(), (et, vl) -> ((TYahooOrder)et).setNeedBillSlip((String)vl), "needBillSlip");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getNeedDetailedSlip(), (et, vl) -> ((TYahooOrder)et).setNeedDetailedSlip((String)vl), "needDetailedSlip");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getNeedReceipt(), (et, vl) -> ((TYahooOrder)et).setNeedReceipt((String)vl), "needReceipt");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOption1Field(), (et, vl) -> ((TYahooOrder)et).setOption1Field((String)vl), "option1Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOption1Value(), (et, vl) -> ((TYahooOrder)et).setOption1Value((String)vl), "option1Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOption2Field(), (et, vl) -> ((TYahooOrder)et).setOption2Field((String)vl), "option2Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOption2Value(), (et, vl) -> ((TYahooOrder)et).setOption2Value((String)vl), "option2Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGiftWrapMassage(), (et, vl) -> ((TYahooOrder)et).setGiftWrapMassage((String)vl), "giftWrapMassage");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillName(), (et, vl) -> ((TYahooOrder)et).setBillName((String)vl), "billName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillFirstName(), (et, vl) -> ((TYahooOrder)et).setBillFirstName((String)vl), "billFirstName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillLastName(), (et, vl) -> ((TYahooOrder)et).setBillLastName((String)vl), "billLastName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillAddress1(), (et, vl) -> ((TYahooOrder)et).setBillAddress1((String)vl), "billAddress1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillAddress2(), (et, vl) -> ((TYahooOrder)et).setBillAddress2((String)vl), "billAddress2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillCity(), (et, vl) -> ((TYahooOrder)et).setBillCity((String)vl), "billCity");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillPrefecture(), (et, vl) -> ((TYahooOrder)et).setBillPrefecture((String)vl), "billPrefecture");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillZipCode(), (et, vl) -> ((TYahooOrder)et).setBillZipCode((String)vl), "billZipCode");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillNameKana(), (et, vl) -> ((TYahooOrder)et).setBillNameKana((String)vl), "billNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillFirstNameKana(), (et, vl) -> ((TYahooOrder)et).setBillFirstNameKana((String)vl), "billFirstNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillLastNameKana(), (et, vl) -> ((TYahooOrder)et).setBillLastNameKana((String)vl), "billLastNameKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillAddress1Kana(), (et, vl) -> ((TYahooOrder)et).setBillAddress1Kana((String)vl), "billAddress1Kana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillAddress2Kana(), (et, vl) -> ((TYahooOrder)et).setBillAddress2Kana((String)vl), "billAddress2Kana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillCityKana(), (et, vl) -> ((TYahooOrder)et).setBillCityKana((String)vl), "billCityKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillPrefectureKana(), (et, vl) -> ((TYahooOrder)et).setBillPrefectureKana((String)vl), "billPrefectureKana");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillSection1Field(), (et, vl) -> ((TYahooOrder)et).setBillSection1Field((String)vl), "billSection1Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillSection1Value(), (et, vl) -> ((TYahooOrder)et).setBillSection1Value((String)vl), "billSection1Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillSection2Field(), (et, vl) -> ((TYahooOrder)et).setBillSection2Field((String)vl), "billSection2Field");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillSection2Value(), (et, vl) -> ((TYahooOrder)et).setBillSection2Value((String)vl), "billSection2Value");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillPhoneNumber(), (et, vl) -> ((TYahooOrder)et).setBillPhoneNumber((String)vl), "billPhoneNumber");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillEmgPhoneNumber(), (et, vl) -> ((TYahooOrder)et).setBillEmgPhoneNumber((String)vl), "billEmgPhoneNumber");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBillMailAddress(), (et, vl) -> ((TYahooOrder)et).setBillMailAddress((String)vl), "billMailAddress");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayMathod(), (et, vl) -> ((TYahooOrder)et).setPayMathod((String)vl), "payMathod");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayMathodName(), (et, vl) -> ((TYahooOrder)et).setPayMathodName((String)vl), "payMathodName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayKind(), (et, vl) -> ((TYahooOrder)et).setPayKind((String)vl), "payKind");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getCardPayCount(), (et, vl) -> ((TYahooOrder)et).setCardPayCount(ctl(vl)), "cardPayCount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getCardPayType(), (et, vl) -> ((TYahooOrder)et).setCardPayType((String)vl), "cardPayType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSettleStatus(), (et, vl) -> ((TYahooOrder)et).setSettleStatus((String)vl), "settleStatus");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSettleId(), (et, vl) -> ((TYahooOrder)et).setSettleId((String)vl), "settleId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayNo(), (et, vl) -> ((TYahooOrder)et).setPayNo((String)vl), "payNo");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayNoIssueDate(), (et, vl) -> ((TYahooOrder)et).setPayNoIssueDate((String)vl), "payNoIssueDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayDate(), (et, vl) -> ((TYahooOrder)et).setPayDate((String)vl), "payDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getBuyerComments(), (et, vl) -> ((TYahooOrder)et).setBuyerComments((String)vl), "buyerComments");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getAgeConfirm(), (et, vl) -> ((TYahooOrder)et).setAgeConfirm((String)vl), "ageConfirm");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getQuantityDetail(), (et, vl) -> ((TYahooOrder)et).setQuantityDetail(ctl(vl)), "quantityDetail");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShipCharge(), (et, vl) -> ((TYahooOrder)et).setShipCharge(ctl(vl)), "shipCharge");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPayCharge(), (et, vl) -> ((TYahooOrder)et).setPayCharge(ctl(vl)), "payCharge");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGiftWrapCharge(), (et, vl) -> ((TYahooOrder)et).setGiftWrapCharge(ctl(vl)), "giftWrapCharge");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getDiscount(), (et, vl) -> ((TYahooOrder)et).setDiscount(ctl(vl)), "discount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getAdjustments(), (et, vl) -> ((TYahooOrder)et).setAdjustments(ctl(vl)), "adjustments");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUsePoint(), (et, vl) -> ((TYahooOrder)et).setUsePoint(ctl(vl)), "usePoint");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGetPoint(), (et, vl) -> ((TYahooOrder)et).setGetPoint(ctl(vl)), "getPoint");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getTotal(), (et, vl) -> ((TYahooOrder)et).setTotal(ctl(vl)), "total");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getTotalPrice(), (et, vl) -> ((TYahooOrder)et).setTotalPrice(ctl(vl)), "totalPrice");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getShippingCDiscount(), (et, vl) -> ((TYahooOrder)et).setShippingCDiscount(ctl(vl)), "shippingCDiscount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getItemCDiscount(), (et, vl) -> ((TYahooOrder)et).setItemCDiscount(ctl(vl)), "itemCDiscount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getTotalMallCDiscount(), (et, vl) -> ((TYahooOrder)et).setTotalMallCDiscount(ctl(vl)), "totalMallCDiscount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGetPointCrgToStore(), (et, vl) -> ((TYahooOrder)et).setGetPointCrgToStore(ctl(vl)), "getPointCrgToStore");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getLineId(), (et, vl) -> ((TYahooOrder)et).setLineId((String)vl), "lineId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getQuantity(), (et, vl) -> ((TYahooOrder)et).setQuantity(ctl(vl)), "quantity");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getItemId(), (et, vl) -> ((TYahooOrder)et).setItemId((String)vl), "itemId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSubCode(), (et, vl) -> ((TYahooOrder)et).setSubCode((String)vl), "subCode");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getTitle(), (et, vl) -> ((TYahooOrder)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getItemOptionName(), (et, vl) -> ((TYahooOrder)et).setItemOptionName((String)vl), "itemOptionName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getItemOptionValue(), (et, vl) -> ((TYahooOrder)et).setItemOptionValue((String)vl), "itemOptionValue");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSubCodeOption(), (et, vl) -> ((TYahooOrder)et).setSubCodeOption((String)vl), "subCodeOption");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getInscriptionName(), (et, vl) -> ((TYahooOrder)et).setInscriptionName((String)vl), "inscriptionName");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getInscriptionValue(), (et, vl) -> ((TYahooOrder)et).setInscriptionValue((String)vl), "inscriptionValue");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUnitPrice(), (et, vl) -> ((TYahooOrder)et).setUnitPrice(ctl(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUnitGetPoint(), (et, vl) -> ((TYahooOrder)et).setUnitGetPoint(ctl(vl)), "unitGetPoint");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getLineSubTotal(), (et, vl) -> ((TYahooOrder)et).setLineSubTotal(ctl(vl)), "lineSubTotal");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getLineGetPoint(), (et, vl) -> ((TYahooOrder)et).setLineGetPoint(ctl(vl)), "lineGetPoint");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPointFspCode(), (et, vl) -> ((TYahooOrder)et).setPointFspCode((String)vl), "pointFspCode");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getItemCondition(), (et, vl) -> ((TYahooOrder)et).setItemCondition((String)vl), "itemCondition");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getCouponId(), (et, vl) -> ((TYahooOrder)et).setCouponId((String)vl), "couponId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getCouponDiscount(), (et, vl) -> ((TYahooOrder)et).setCouponDiscount(ctl(vl)), "couponDiscount");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getOriginalPrice(), (et, vl) -> ((TYahooOrder)et).setOriginalPrice(ctl(vl)), "originalPrice");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getIsGetPointFix(), (et, vl) -> ((TYahooOrder)et).setIsGetPointFix((String)vl), "isGetPointFix");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGetPointFixDate(), (et, vl) -> ((TYahooOrder)et).setGetPointFixDate((String)vl), "getPointFixDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getReleaseDate(), (et, vl) -> ((TYahooOrder)et).setReleaseDate((String)vl), "releaseDate");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getGetPointType(), (et, vl) -> ((TYahooOrder)et).setGetPointType((String)vl), "getPointType");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getJan(), (et, vl) -> ((TYahooOrder)et).setJan((String)vl), "jan");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getProductId(), (et, vl) -> ((TYahooOrder)et).setProductId((String)vl), "productId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPointChargedToStore(), (et, vl) -> ((TYahooOrder)et).setPointChargedToStore(ctl(vl)), "pointChargedToStore");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getPackingQty(), (et, vl) -> ((TYahooOrder)et).setPackingQty(ctl(vl)), "packingQty");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemNm1(), (et, vl) -> ((TYahooOrder)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemNm2(), (et, vl) -> ((TYahooOrder)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemNm3(), (et, vl) -> ((TYahooOrder)et).setSlipItemNm3((String)vl), "slipItemNm3");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemNm4(), (et, vl) -> ((TYahooOrder)et).setSlipItemNm4((String)vl), "slipItemNm4");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemNm5(), (et, vl) -> ((TYahooOrder)et).setSlipItemNm5((String)vl), "slipItemNm5");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemCd1(), (et, vl) -> ((TYahooOrder)et).setSlipItemCd1((String)vl), "slipItemCd1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getSlipItemCd2(), (et, vl) -> ((TYahooOrder)et).setSlipItemCd2((String)vl), "slipItemCd2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getFreightHandling1(), (et, vl) -> ((TYahooOrder)et).setFreightHandling1((String)vl), "freightHandling1");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getFreightHandling2(), (et, vl) -> ((TYahooOrder)et).setFreightHandling2((String)vl), "freightHandling2");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getArticle(), (et, vl) -> ((TYahooOrder)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getReceiveId(), (et, vl) -> ((TYahooOrder)et).setReceiveId(ctl(vl)), "receiveId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getRowNo(), (et, vl) -> ((TYahooOrder)et).setRowNo(ctl(vl)), "rowNo");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getErrorFlg(), (et, vl) -> ((TYahooOrder)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getImportFlg(), (et, vl) -> ((TYahooOrder)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getImportTypeId(), (et, vl) -> ((TYahooOrder)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getEcOrderBId(), (et, vl) -> ((TYahooOrder)et).setEcOrderBId(ctl(vl)), "ecOrderBId");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getDelFlg(), (et, vl) -> ((TYahooOrder)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getVersionNo(), (et, vl) -> ((TYahooOrder)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getControlNo(), (et, vl) -> ((TYahooOrder)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getAddDt(), (et, vl) -> ((TYahooOrder)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getAddUser(), (et, vl) -> ((TYahooOrder)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getAddProcess(), (et, vl) -> ((TYahooOrder)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUpdDt(), (et, vl) -> ((TYahooOrder)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUpdUser(), (et, vl) -> ((TYahooOrder)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TYahooOrder)et).getUpdProcess(), (et, vl) -> ((TYahooOrder)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TYahooOrder)et).getTEcOrderB(), (et, vl) -> ((TYahooOrder)et).setTEcOrderB((TEcOrderB)vl), "TEcOrderB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_YAHOO_ORDER";
    protected final String _tableDispName = "T_YAHOO_ORDER";
    protected final String _tablePropertyName = "TYahooOrder";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_YAHOO_ORDER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnYahooOrderId = cci("YAHOO_ORDER_ID", "YAHOO_ORDER_ID", null, null, Long.class, "yahooOrderId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderId = cci("ORDER_ID", "ORDER_ID", null, null, String.class, "orderId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParentOrderId = cci("PARENT_ORDER_ID", "PARENT_ORDER_ID", null, null, String.class, "parentOrderId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeviceType = cci("DEVICE_TYPE", "DEVICE_TYPE", null, null, String.class, "deviceType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsAffiliate = cci("IS_AFFILIATE", "IS_AFFILIATE", null, null, String.class, "isAffiliate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFspLicenseCode = cci("FSP_LICENSE_CODE", "FSP_LICENSE_CODE", null, null, String.class, "fspLicenseCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFspLicenseName = cci("FSP_LICENSE_NAME", "FSP_LICENSE_NAME", null, null, String.class, "fspLicenseName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTime = cci("ORDER_TIME", "ORDER_TIME", null, null, String.class, "orderTime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTimeUnixEpoch = cci("ORDER_TIME_UNIX_EPOCH", "ORDER_TIME_UNIX_EPOCH", null, null, String.class, "orderTimeUnixEpoch", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsePointType = cci("USE_POINT_TYPE", "USE_POINT_TYPE", null, null, String.class, "usePointType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderStatus = cci("ORDER_STATUS", "ORDER_STATUS", null, null, String.class, "orderStatus", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStatus = cci("STORE_STATUS", "STORE_STATUS", null, null, String.class, "storeStatus", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferer = cci("REFERER", "REFERER", null, null, String.class, "referer", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryPoint = cci("ENTRY_POINT", "ENTRY_POINT", null, null, String.class, "entryPoint", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClink = cci("CLINK", "CLINK", null, null, String.class, "clink", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuspectMessage = cci("SUSPECT_MESSAGE", "SUSPECT_MESSAGE", null, null, String.class, "suspectMessage", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsItemCoupon = cci("IS_ITEM_COUPON", "IS_ITEM_COUPON", null, null, String.class, "isItemCoupon", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsShippingCoupon = cci("IS_SHIPPING_COUPON", "IS_SHIPPING_COUPON", null, null, String.class, "isShippingCoupon", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipName = cci("SHIP_NAME", "SHIP_NAME", null, null, String.class, "shipName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipFirstName = cci("SHIP_FIRST_NAME", "SHIP_FIRST_NAME", null, null, String.class, "shipFirstName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipLastName = cci("SHIP_LAST_NAME", "SHIP_LAST_NAME", null, null, String.class, "shipLastName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress1 = cci("SHIP_ADDRESS1", "SHIP_ADDRESS1", null, null, String.class, "shipAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress2 = cci("SHIP_ADDRESS2", "SHIP_ADDRESS2", null, null, String.class, "shipAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCity = cci("SHIP_CITY", "SHIP_CITY", null, null, String.class, "shipCity", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPrefecture = cci("SHIP_PREFECTURE", "SHIP_PREFECTURE", null, null, String.class, "shipPrefecture", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipZipCode = cci("SHIP_ZIP_CODE", "SHIP_ZIP_CODE", null, null, String.class, "shipZipCode", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipNameKana = cci("SHIP_NAME_KANA", "SHIP_NAME_KANA", null, null, String.class, "shipNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipFirstNameKana = cci("SHIP_FIRST_NAME_KANA", "SHIP_FIRST_NAME_KANA", null, null, String.class, "shipFirstNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipLastNameKana = cci("SHIP_LAST_NAME_KANA", "SHIP_LAST_NAME_KANA", null, null, String.class, "shipLastNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress1Kana = cci("SHIP_ADDRESS1_KANA", "SHIP_ADDRESS1_KANA", null, null, String.class, "shipAddress1Kana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipAddress2Kana = cci("SHIP_ADDRESS2_KANA", "SHIP_ADDRESS2_KANA", null, null, String.class, "shipAddress2Kana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCityKana = cci("SHIP_CITY_KANA", "SHIP_CITY_KANA", null, null, String.class, "shipCityKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPrefectureKana = cci("SHIP_PREFECTURE_KANA", "SHIP_PREFECTURE_KANA", null, null, String.class, "shipPrefectureKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSection1Field = cci("SHIP_SECTION1_FIELD", "SHIP_SECTION1_FIELD", null, null, String.class, "shipSection1Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSection1Value = cci("SHIP_SECTION1_VALUE", "SHIP_SECTION1_VALUE", null, null, String.class, "shipSection1Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSection2Field = cci("SHIP_SECTION2_FIELD", "SHIP_SECTION2_FIELD", null, null, String.class, "shipSection2Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipSection2Value = cci("SHIP_SECTION2_VALUE", "SHIP_SECTION2_VALUE", null, null, String.class, "shipSection2Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipPhoneNumber = cci("SHIP_PHONE_NUMBER", "SHIP_PHONE_NUMBER", null, null, String.class, "shipPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipEmgPhoneNumber = cci("SHIP_EMG_PHONE_NUMBER", "SHIP_EMG_PHONE_NUMBER", null, null, String.class, "shipEmgPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipMethod = cci("SHIP_METHOD", "SHIP_METHOD", null, null, String.class, "shipMethod", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipMethodName = cci("SHIP_METHOD_NAME", "SHIP_METHOD_NAME", null, null, String.class, "shipMethodName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipRequestDate = cci("SHIP_REQUEST_DATE", "SHIP_REQUEST_DATE", null, null, String.class, "shipRequestDate", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipRequestTime = cci("SHIP_REQUEST_TIME", "SHIP_REQUEST_TIME", null, null, String.class, "shipRequestTime", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipNotes = cci("SHIP_NOTES", "SHIP_NOTES", null, null, String.class, "shipNotes", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArriveType = cci("ARRIVE_TYPE", "ARRIVE_TYPE", null, null, String.class, "arriveType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipInvoiceNumber1 = cci("SHIP_INVOICE_NUMBER1", "SHIP_INVOICE_NUMBER1", null, null, String.class, "shipInvoiceNumber1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipInvoiceNumber2 = cci("SHIP_INVOICE_NUMBER2", "SHIP_INVOICE_NUMBER2", null, null, String.class, "shipInvoiceNumber2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipUrl = cci("SHIP_URL", "SHIP_URL", null, null, String.class, "shipUrl", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipDate = cci("SHIP_DATE", "SHIP_DATE", null, null, String.class, "shipDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapType = cci("GIFT_WRAP_TYPE", "GIFT_WRAP_TYPE", null, null, String.class, "giftWrapType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapPaperType = cci("GIFT_WRAP_PAPER_TYPE", "GIFT_WRAP_PAPER_TYPE", null, null, String.class, "giftWrapPaperType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapName = cci("GIFT_WRAP_NAME", "GIFT_WRAP_NAME", null, null, String.class, "giftWrapName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNeedBillSlip = cci("NEED_BILL_SLIP", "NEED_BILL_SLIP", null, null, String.class, "needBillSlip", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNeedDetailedSlip = cci("NEED_DETAILED_SLIP", "NEED_DETAILED_SLIP", null, null, String.class, "needDetailedSlip", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNeedReceipt = cci("NEED_RECEIPT", "NEED_RECEIPT", null, null, String.class, "needReceipt", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOption1Field = cci("OPTION1_FIELD", "OPTION1_FIELD", null, null, String.class, "option1Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOption1Value = cci("OPTION1_VALUE", "OPTION1_VALUE", null, null, String.class, "option1Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOption2Field = cci("OPTION2_FIELD", "OPTION2_FIELD", null, null, String.class, "option2Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOption2Value = cci("OPTION2_VALUE", "OPTION2_VALUE", null, null, String.class, "option2Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapMassage = cci("GIFT_WRAP_MASSAGE", "GIFT_WRAP_MASSAGE", null, null, String.class, "giftWrapMassage", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillName = cci("BILL_NAME", "BILL_NAME", null, null, String.class, "billName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillFirstName = cci("BILL_FIRST_NAME", "BILL_FIRST_NAME", null, null, String.class, "billFirstName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillLastName = cci("BILL_LAST_NAME", "BILL_LAST_NAME", null, null, String.class, "billLastName", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress1 = cci("BILL_ADDRESS1", "BILL_ADDRESS1", null, null, String.class, "billAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress2 = cci("BILL_ADDRESS2", "BILL_ADDRESS2", null, null, String.class, "billAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillCity = cci("BILL_CITY", "BILL_CITY", null, null, String.class, "billCity", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillPrefecture = cci("BILL_PREFECTURE", "BILL_PREFECTURE", null, null, String.class, "billPrefecture", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillZipCode = cci("BILL_ZIP_CODE", "BILL_ZIP_CODE", null, null, String.class, "billZipCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillNameKana = cci("BILL_NAME_KANA", "BILL_NAME_KANA", null, null, String.class, "billNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillFirstNameKana = cci("BILL_FIRST_NAME_KANA", "BILL_FIRST_NAME_KANA", null, null, String.class, "billFirstNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillLastNameKana = cci("BILL_LAST_NAME_KANA", "BILL_LAST_NAME_KANA", null, null, String.class, "billLastNameKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress1Kana = cci("BILL_ADDRESS1_KANA", "BILL_ADDRESS1_KANA", null, null, String.class, "billAddress1Kana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillAddress2Kana = cci("BILL_ADDRESS2_KANA", "BILL_ADDRESS2_KANA", null, null, String.class, "billAddress2Kana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillCityKana = cci("BILL_CITY_KANA", "BILL_CITY_KANA", null, null, String.class, "billCityKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillPrefectureKana = cci("BILL_PREFECTURE_KANA", "BILL_PREFECTURE_KANA", null, null, String.class, "billPrefectureKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillSection1Field = cci("BILL_SECTION1_FIELD", "BILL_SECTION1_FIELD", null, null, String.class, "billSection1Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillSection1Value = cci("BILL_SECTION1_VALUE", "BILL_SECTION1_VALUE", null, null, String.class, "billSection1Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillSection2Field = cci("BILL_SECTION2_FIELD", "BILL_SECTION2_FIELD", null, null, String.class, "billSection2Field", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillSection2Value = cci("BILL_SECTION2_VALUE", "BILL_SECTION2_VALUE", null, null, String.class, "billSection2Value", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillPhoneNumber = cci("BILL_PHONE_NUMBER", "BILL_PHONE_NUMBER", null, null, String.class, "billPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillEmgPhoneNumber = cci("BILL_EMG_PHONE_NUMBER", "BILL_EMG_PHONE_NUMBER", null, null, String.class, "billEmgPhoneNumber", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillMailAddress = cci("BILL_MAIL_ADDRESS", "BILL_MAIL_ADDRESS", null, null, String.class, "billMailAddress", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayMathod = cci("PAY_MATHOD", "PAY_MATHOD", null, null, String.class, "payMathod", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayMathodName = cci("PAY_MATHOD_NAME", "PAY_MATHOD_NAME", null, null, String.class, "payMathodName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayKind = cci("PAY_KIND", "PAY_KIND", null, null, String.class, "payKind", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardPayCount = cci("CARD_PAY_COUNT", "CARD_PAY_COUNT", null, null, Long.class, "cardPayCount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardPayType = cci("CARD_PAY_TYPE", "CARD_PAY_TYPE", null, null, String.class, "cardPayType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSettleStatus = cci("SETTLE_STATUS", "SETTLE_STATUS", null, null, String.class, "settleStatus", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSettleId = cci("SETTLE_ID", "SETTLE_ID", null, null, String.class, "settleId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayNo = cci("PAY_NO", "PAY_NO", null, null, String.class, "payNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayNoIssueDate = cci("PAY_NO_ISSUE_DATE", "PAY_NO_ISSUE_DATE", null, null, String.class, "payNoIssueDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayDate = cci("PAY_DATE", "PAY_DATE", null, null, String.class, "payDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBuyerComments = cci("BUYER_COMMENTS", "BUYER_COMMENTS", null, null, String.class, "buyerComments", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAgeConfirm = cci("AGE_CONFIRM", "AGE_CONFIRM", null, null, String.class, "ageConfirm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuantityDetail = cci("QUANTITY_DETAIL", "QUANTITY_DETAIL", null, null, Long.class, "quantityDetail", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCharge = cci("SHIP_CHARGE", "SHIP_CHARGE", null, null, Long.class, "shipCharge", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPayCharge = cci("PAY_CHARGE", "PAY_CHARGE", null, null, Long.class, "payCharge", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftWrapCharge = cci("GIFT_WRAP_CHARGE", "GIFT_WRAP_CHARGE", null, null, Long.class, "giftWrapCharge", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiscount = cci("DISCOUNT", "DISCOUNT", null, null, Long.class, "discount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustments = cci("ADJUSTMENTS", "ADJUSTMENTS", null, null, Long.class, "adjustments", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsePoint = cci("USE_POINT", "USE_POINT", null, null, Long.class, "usePoint", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetPoint = cci("GET_POINT", "GET_POINT", null, null, Long.class, "getPoint", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotal = cci("TOTAL", "TOTAL", null, null, Long.class, "total", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPrice = cci("TOTAL_PRICE", "TOTAL_PRICE", null, null, Long.class, "totalPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingCDiscount = cci("SHIPPING_C_DISCOUNT", "SHIPPING_C_DISCOUNT", null, null, Long.class, "shippingCDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCDiscount = cci("ITEM_C_DISCOUNT", "ITEM_C_DISCOUNT", null, null, Long.class, "itemCDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalMallCDiscount = cci("TOTAL_MALL_C_DISCOUNT", "TOTAL_MALL_C_DISCOUNT", null, null, Long.class, "totalMallCDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetPointCrgToStore = cci("GET_POINT_CRG_TO_STORE", "GET_POINT_CRG_TO_STORE", null, null, Long.class, "getPointCrgToStore", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineId = cci("LINE_ID", "LINE_ID", null, null, String.class, "lineId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuantity = cci("QUANTITY", "QUANTITY", null, null, Long.class, "quantity", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemId = cci("ITEM_ID", "ITEM_ID", null, null, String.class, "itemId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubCode = cci("SUB_CODE", "SUB_CODE", null, null, String.class, "subCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTitle = cci("TITLE", "TITLE", null, null, String.class, "title", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemOptionName = cci("ITEM_OPTION_NAME", "ITEM_OPTION_NAME", null, null, String.class, "itemOptionName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemOptionValue = cci("ITEM_OPTION_VALUE", "ITEM_OPTION_VALUE", null, null, String.class, "itemOptionValue", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubCodeOption = cci("SUB_CODE_OPTION", "SUB_CODE_OPTION", null, null, String.class, "subCodeOption", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInscriptionName = cci("INSCRIPTION_NAME", "INSCRIPTION_NAME", null, null, String.class, "inscriptionName", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInscriptionValue = cci("INSCRIPTION_VALUE", "INSCRIPTION_VALUE", null, null, String.class, "inscriptionValue", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, Long.class, "unitPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitGetPoint = cci("UNIT_GET_POINT", "UNIT_GET_POINT", null, null, Long.class, "unitGetPoint", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineSubTotal = cci("LINE_SUB_TOTAL", "LINE_SUB_TOTAL", null, null, Long.class, "lineSubTotal", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineGetPoint = cci("LINE_GET_POINT", "LINE_GET_POINT", null, null, Long.class, "lineGetPoint", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointFspCode = cci("POINT_FSP_CODE", "POINT_FSP_CODE", null, null, String.class, "pointFspCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCondition = cci("ITEM_CONDITION", "ITEM_CONDITION", null, null, String.class, "itemCondition", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCouponId = cci("COUPON_ID", "COUPON_ID", null, null, String.class, "couponId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCouponDiscount = cci("COUPON_DISCOUNT", "COUPON_DISCOUNT", null, null, Long.class, "couponDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalPrice = cci("ORIGINAL_PRICE", "ORIGINAL_PRICE", null, null, Long.class, "originalPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsGetPointFix = cci("IS_GET_POINT_FIX", "IS_GET_POINT_FIX", null, null, String.class, "isGetPointFix", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetPointFixDate = cci("GET_POINT_FIX_DATE", "GET_POINT_FIX_DATE", null, null, String.class, "getPointFixDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReleaseDate = cci("RELEASE_DATE", "RELEASE_DATE", null, null, String.class, "releaseDate", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGetPointType = cci("GET_POINT_TYPE", "GET_POINT_TYPE", null, null, String.class, "getPointType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJan = cci("JAN", "JAN", null, null, String.class, "jan", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, String.class, "productId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointChargedToStore = cci("POINT_CHARGED_TO_STORE", "POINT_CHARGED_TO_STORE", null, null, Long.class, "pointChargedToStore", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * YAHOO_ORDER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYahooOrderId() { return _columnYahooOrderId; }
    /**
     * ORDER_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderId() { return _columnOrderId; }
    /**
     * PARENT_ORDER_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentOrderId() { return _columnParentOrderId; }
    /**
     * DEVICE_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeviceType() { return _columnDeviceType; }
    /**
     * IS_AFFILIATE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsAffiliate() { return _columnIsAffiliate; }
    /**
     * FSP_LICENSE_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFspLicenseCode() { return _columnFspLicenseCode; }
    /**
     * FSP_LICENSE_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFspLicenseName() { return _columnFspLicenseName; }
    /**
     * ORDER_TIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTime() { return _columnOrderTime; }
    /**
     * ORDER_TIME_UNIX_EPOCH: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTimeUnixEpoch() { return _columnOrderTimeUnixEpoch; }
    /**
     * USE_POINT_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsePointType() { return _columnUsePointType; }
    /**
     * ORDER_STATUS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderStatus() { return _columnOrderStatus; }
    /**
     * STORE_STATUS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStatus() { return _columnStoreStatus; }
    /**
     * REFERER: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferer() { return _columnReferer; }
    /**
     * ENTRY_POINT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryPoint() { return _columnEntryPoint; }
    /**
     * CLINK: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClink() { return _columnClink; }
    /**
     * SUSPECT_MESSAGE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuspectMessage() { return _columnSuspectMessage; }
    /**
     * IS_ITEM_COUPON: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsItemCoupon() { return _columnIsItemCoupon; }
    /**
     * IS_SHIPPING_COUPON: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsShippingCoupon() { return _columnIsShippingCoupon; }
    /**
     * SHIP_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipName() { return _columnShipName; }
    /**
     * SHIP_FIRST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipFirstName() { return _columnShipFirstName; }
    /**
     * SHIP_LAST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipLastName() { return _columnShipLastName; }
    /**
     * SHIP_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress1() { return _columnShipAddress1; }
    /**
     * SHIP_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress2() { return _columnShipAddress2; }
    /**
     * SHIP_CITY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCity() { return _columnShipCity; }
    /**
     * SHIP_PREFECTURE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPrefecture() { return _columnShipPrefecture; }
    /**
     * SHIP_ZIP_CODE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipZipCode() { return _columnShipZipCode; }
    /**
     * SHIP_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipNameKana() { return _columnShipNameKana; }
    /**
     * SHIP_FIRST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipFirstNameKana() { return _columnShipFirstNameKana; }
    /**
     * SHIP_LAST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipLastNameKana() { return _columnShipLastNameKana; }
    /**
     * SHIP_ADDRESS1_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress1Kana() { return _columnShipAddress1Kana; }
    /**
     * SHIP_ADDRESS2_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipAddress2Kana() { return _columnShipAddress2Kana; }
    /**
     * SHIP_CITY_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCityKana() { return _columnShipCityKana; }
    /**
     * SHIP_PREFECTURE_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPrefectureKana() { return _columnShipPrefectureKana; }
    /**
     * SHIP_SECTION1_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSection1Field() { return _columnShipSection1Field; }
    /**
     * SHIP_SECTION1_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSection1Value() { return _columnShipSection1Value; }
    /**
     * SHIP_SECTION2_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSection2Field() { return _columnShipSection2Field; }
    /**
     * SHIP_SECTION2_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipSection2Value() { return _columnShipSection2Value; }
    /**
     * SHIP_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipPhoneNumber() { return _columnShipPhoneNumber; }
    /**
     * SHIP_EMG_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipEmgPhoneNumber() { return _columnShipEmgPhoneNumber; }
    /**
     * SHIP_METHOD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipMethod() { return _columnShipMethod; }
    /**
     * SHIP_METHOD_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipMethodName() { return _columnShipMethodName; }
    /**
     * SHIP_REQUEST_DATE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipRequestDate() { return _columnShipRequestDate; }
    /**
     * SHIP_REQUEST_TIME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipRequestTime() { return _columnShipRequestTime; }
    /**
     * SHIP_NOTES: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipNotes() { return _columnShipNotes; }
    /**
     * ARRIVE_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArriveType() { return _columnArriveType; }
    /**
     * SHIP_INVOICE_NUMBER1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipInvoiceNumber1() { return _columnShipInvoiceNumber1; }
    /**
     * SHIP_INVOICE_NUMBER2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipInvoiceNumber2() { return _columnShipInvoiceNumber2; }
    /**
     * SHIP_URL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipUrl() { return _columnShipUrl; }
    /**
     * SHIP_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipDate() { return _columnShipDate; }
    /**
     * GIFT_WRAP_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapType() { return _columnGiftWrapType; }
    /**
     * GIFT_WRAP_PAPER_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapPaperType() { return _columnGiftWrapPaperType; }
    /**
     * GIFT_WRAP_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapName() { return _columnGiftWrapName; }
    /**
     * NEED_BILL_SLIP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNeedBillSlip() { return _columnNeedBillSlip; }
    /**
     * NEED_DETAILED_SLIP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNeedDetailedSlip() { return _columnNeedDetailedSlip; }
    /**
     * NEED_RECEIPT: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNeedReceipt() { return _columnNeedReceipt; }
    /**
     * OPTION1_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOption1Field() { return _columnOption1Field; }
    /**
     * OPTION1_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOption1Value() { return _columnOption1Value; }
    /**
     * OPTION2_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOption2Field() { return _columnOption2Field; }
    /**
     * OPTION2_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOption2Value() { return _columnOption2Value; }
    /**
     * GIFT_WRAP_MASSAGE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapMassage() { return _columnGiftWrapMassage; }
    /**
     * BILL_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillName() { return _columnBillName; }
    /**
     * BILL_FIRST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillFirstName() { return _columnBillFirstName; }
    /**
     * BILL_LAST_NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillLastName() { return _columnBillLastName; }
    /**
     * BILL_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress1() { return _columnBillAddress1; }
    /**
     * BILL_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress2() { return _columnBillAddress2; }
    /**
     * BILL_CITY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillCity() { return _columnBillCity; }
    /**
     * BILL_PREFECTURE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillPrefecture() { return _columnBillPrefecture; }
    /**
     * BILL_ZIP_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillZipCode() { return _columnBillZipCode; }
    /**
     * BILL_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillNameKana() { return _columnBillNameKana; }
    /**
     * BILL_FIRST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillFirstNameKana() { return _columnBillFirstNameKana; }
    /**
     * BILL_LAST_NAME_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillLastNameKana() { return _columnBillLastNameKana; }
    /**
     * BILL_ADDRESS1_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress1Kana() { return _columnBillAddress1Kana; }
    /**
     * BILL_ADDRESS2_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillAddress2Kana() { return _columnBillAddress2Kana; }
    /**
     * BILL_CITY_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillCityKana() { return _columnBillCityKana; }
    /**
     * BILL_PREFECTURE_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillPrefectureKana() { return _columnBillPrefectureKana; }
    /**
     * BILL_SECTION1_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillSection1Field() { return _columnBillSection1Field; }
    /**
     * BILL_SECTION1_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillSection1Value() { return _columnBillSection1Value; }
    /**
     * BILL_SECTION2_FIELD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillSection2Field() { return _columnBillSection2Field; }
    /**
     * BILL_SECTION2_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillSection2Value() { return _columnBillSection2Value; }
    /**
     * BILL_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillPhoneNumber() { return _columnBillPhoneNumber; }
    /**
     * BILL_EMG_PHONE_NUMBER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillEmgPhoneNumber() { return _columnBillEmgPhoneNumber; }
    /**
     * BILL_MAIL_ADDRESS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillMailAddress() { return _columnBillMailAddress; }
    /**
     * PAY_MATHOD: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayMathod() { return _columnPayMathod; }
    /**
     * PAY_MATHOD_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayMathodName() { return _columnPayMathodName; }
    /**
     * PAY_KIND: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayKind() { return _columnPayKind; }
    /**
     * CARD_PAY_COUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardPayCount() { return _columnCardPayCount; }
    /**
     * CARD_PAY_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardPayType() { return _columnCardPayType; }
    /**
     * SETTLE_STATUS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSettleStatus() { return _columnSettleStatus; }
    /**
     * SETTLE_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSettleId() { return _columnSettleId; }
    /**
     * PAY_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayNo() { return _columnPayNo; }
    /**
     * PAY_NO_ISSUE_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayNoIssueDate() { return _columnPayNoIssueDate; }
    /**
     * PAY_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayDate() { return _columnPayDate; }
    /**
     * BUYER_COMMENTS: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBuyerComments() { return _columnBuyerComments; }
    /**
     * AGE_CONFIRM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAgeConfirm() { return _columnAgeConfirm; }
    /**
     * QUANTITY_DETAIL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuantityDetail() { return _columnQuantityDetail; }
    /**
     * SHIP_CHARGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCharge() { return _columnShipCharge; }
    /**
     * PAY_CHARGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPayCharge() { return _columnPayCharge; }
    /**
     * GIFT_WRAP_CHARGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftWrapCharge() { return _columnGiftWrapCharge; }
    /**
     * DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiscount() { return _columnDiscount; }
    /**
     * ADJUSTMENTS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustments() { return _columnAdjustments; }
    /**
     * USE_POINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsePoint() { return _columnUsePoint; }
    /**
     * GET_POINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetPoint() { return _columnGetPoint; }
    /**
     * TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotal() { return _columnTotal; }
    /**
     * TOTAL_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPrice() { return _columnTotalPrice; }
    /**
     * SHIPPING_C_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingCDiscount() { return _columnShippingCDiscount; }
    /**
     * ITEM_C_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCDiscount() { return _columnItemCDiscount; }
    /**
     * TOTAL_MALL_C_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalMallCDiscount() { return _columnTotalMallCDiscount; }
    /**
     * GET_POINT_CRG_TO_STORE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetPointCrgToStore() { return _columnGetPointCrgToStore; }
    /**
     * LINE_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineId() { return _columnLineId; }
    /**
     * QUANTITY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuantity() { return _columnQuantity; }
    /**
     * ITEM_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemId() { return _columnItemId; }
    /**
     * SUB_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubCode() { return _columnSubCode; }
    /**
     * TITLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * ITEM_OPTION_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemOptionName() { return _columnItemOptionName; }
    /**
     * ITEM_OPTION_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemOptionValue() { return _columnItemOptionValue; }
    /**
     * SUB_CODE_OPTION: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubCodeOption() { return _columnSubCodeOption; }
    /**
     * INSCRIPTION_NAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInscriptionName() { return _columnInscriptionName; }
    /**
     * INSCRIPTION_VALUE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInscriptionValue() { return _columnInscriptionValue; }
    /**
     * UNIT_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * UNIT_GET_POINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitGetPoint() { return _columnUnitGetPoint; }
    /**
     * LINE_SUB_TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineSubTotal() { return _columnLineSubTotal; }
    /**
     * LINE_GET_POINT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineGetPoint() { return _columnLineGetPoint; }
    /**
     * POINT_FSP_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointFspCode() { return _columnPointFspCode; }
    /**
     * ITEM_CONDITION: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCondition() { return _columnItemCondition; }
    /**
     * COUPON_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCouponId() { return _columnCouponId; }
    /**
     * COUPON_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCouponDiscount() { return _columnCouponDiscount; }
    /**
     * ORIGINAL_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalPrice() { return _columnOriginalPrice; }
    /**
     * IS_GET_POINT_FIX: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsGetPointFix() { return _columnIsGetPointFix; }
    /**
     * GET_POINT_FIX_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetPointFixDate() { return _columnGetPointFixDate; }
    /**
     * RELEASE_DATE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReleaseDate() { return _columnReleaseDate; }
    /**
     * GET_POINT_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGetPointType() { return _columnGetPointType; }
    /**
     * JAN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJan() { return _columnJan; }
    /**
     * PRODUCT_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * POINT_CHARGED_TO_STORE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointChargedToStore() { return _columnPointChargedToStore; }
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
        ls.add(columnYahooOrderId());
        ls.add(columnOrderId());
        ls.add(columnParentOrderId());
        ls.add(columnDeviceType());
        ls.add(columnIsAffiliate());
        ls.add(columnFspLicenseCode());
        ls.add(columnFspLicenseName());
        ls.add(columnOrderTime());
        ls.add(columnOrderTimeUnixEpoch());
        ls.add(columnUsePointType());
        ls.add(columnOrderStatus());
        ls.add(columnStoreStatus());
        ls.add(columnReferer());
        ls.add(columnEntryPoint());
        ls.add(columnClink());
        ls.add(columnSuspectMessage());
        ls.add(columnIsItemCoupon());
        ls.add(columnIsShippingCoupon());
        ls.add(columnShipName());
        ls.add(columnShipFirstName());
        ls.add(columnShipLastName());
        ls.add(columnShipAddress1());
        ls.add(columnShipAddress2());
        ls.add(columnShipCity());
        ls.add(columnShipPrefecture());
        ls.add(columnShipZipCode());
        ls.add(columnShipNameKana());
        ls.add(columnShipFirstNameKana());
        ls.add(columnShipLastNameKana());
        ls.add(columnShipAddress1Kana());
        ls.add(columnShipAddress2Kana());
        ls.add(columnShipCityKana());
        ls.add(columnShipPrefectureKana());
        ls.add(columnShipSection1Field());
        ls.add(columnShipSection1Value());
        ls.add(columnShipSection2Field());
        ls.add(columnShipSection2Value());
        ls.add(columnShipPhoneNumber());
        ls.add(columnShipEmgPhoneNumber());
        ls.add(columnShipMethod());
        ls.add(columnShipMethodName());
        ls.add(columnShipRequestDate());
        ls.add(columnShipRequestTime());
        ls.add(columnShipNotes());
        ls.add(columnArriveType());
        ls.add(columnShipInvoiceNumber1());
        ls.add(columnShipInvoiceNumber2());
        ls.add(columnShipUrl());
        ls.add(columnShipDate());
        ls.add(columnGiftWrapType());
        ls.add(columnGiftWrapPaperType());
        ls.add(columnGiftWrapName());
        ls.add(columnNeedBillSlip());
        ls.add(columnNeedDetailedSlip());
        ls.add(columnNeedReceipt());
        ls.add(columnOption1Field());
        ls.add(columnOption1Value());
        ls.add(columnOption2Field());
        ls.add(columnOption2Value());
        ls.add(columnGiftWrapMassage());
        ls.add(columnBillName());
        ls.add(columnBillFirstName());
        ls.add(columnBillLastName());
        ls.add(columnBillAddress1());
        ls.add(columnBillAddress2());
        ls.add(columnBillCity());
        ls.add(columnBillPrefecture());
        ls.add(columnBillZipCode());
        ls.add(columnBillNameKana());
        ls.add(columnBillFirstNameKana());
        ls.add(columnBillLastNameKana());
        ls.add(columnBillAddress1Kana());
        ls.add(columnBillAddress2Kana());
        ls.add(columnBillCityKana());
        ls.add(columnBillPrefectureKana());
        ls.add(columnBillSection1Field());
        ls.add(columnBillSection1Value());
        ls.add(columnBillSection2Field());
        ls.add(columnBillSection2Value());
        ls.add(columnBillPhoneNumber());
        ls.add(columnBillEmgPhoneNumber());
        ls.add(columnBillMailAddress());
        ls.add(columnPayMathod());
        ls.add(columnPayMathodName());
        ls.add(columnPayKind());
        ls.add(columnCardPayCount());
        ls.add(columnCardPayType());
        ls.add(columnSettleStatus());
        ls.add(columnSettleId());
        ls.add(columnPayNo());
        ls.add(columnPayNoIssueDate());
        ls.add(columnPayDate());
        ls.add(columnBuyerComments());
        ls.add(columnAgeConfirm());
        ls.add(columnQuantityDetail());
        ls.add(columnShipCharge());
        ls.add(columnPayCharge());
        ls.add(columnGiftWrapCharge());
        ls.add(columnDiscount());
        ls.add(columnAdjustments());
        ls.add(columnUsePoint());
        ls.add(columnGetPoint());
        ls.add(columnTotal());
        ls.add(columnTotalPrice());
        ls.add(columnShippingCDiscount());
        ls.add(columnItemCDiscount());
        ls.add(columnTotalMallCDiscount());
        ls.add(columnGetPointCrgToStore());
        ls.add(columnLineId());
        ls.add(columnQuantity());
        ls.add(columnItemId());
        ls.add(columnSubCode());
        ls.add(columnTitle());
        ls.add(columnItemOptionName());
        ls.add(columnItemOptionValue());
        ls.add(columnSubCodeOption());
        ls.add(columnInscriptionName());
        ls.add(columnInscriptionValue());
        ls.add(columnUnitPrice());
        ls.add(columnUnitGetPoint());
        ls.add(columnLineSubTotal());
        ls.add(columnLineGetPoint());
        ls.add(columnPointFspCode());
        ls.add(columnItemCondition());
        ls.add(columnCouponId());
        ls.add(columnCouponDiscount());
        ls.add(columnOriginalPrice());
        ls.add(columnIsGetPointFix());
        ls.add(columnGetPointFixDate());
        ls.add(columnReleaseDate());
        ls.add(columnGetPointType());
        ls.add(columnJan());
        ls.add(columnProductId());
        ls.add(columnPointChargedToStore());
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
    protected UniqueInfo cpui() { return hpcpui(columnYahooOrderId()); }
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
        return cfi("T_YAHOO_ORDER_FK1", "TEcOrderB", this, TEcOrderBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TYahooOrderList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TYahooOrder"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TYahooOrderCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TYahooOrderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TYahooOrder> getEntityType() { return TYahooOrder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TYahooOrder newEntity() { return new TYahooOrder(); }
    public TYahooOrder newMyEntity() { return new TYahooOrder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TYahooOrder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TYahooOrder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
