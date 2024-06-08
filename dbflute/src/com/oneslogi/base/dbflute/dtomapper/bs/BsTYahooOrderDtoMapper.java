package com.oneslogi.base.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of T_YAHOO_ORDER as TABLE. <br>
 * YAHOO受注
 * <pre>
 * [primary-key]
 *     YAHOO_ORDER_ID
 *
 * [column]
 *     YAHOO_ORDER_ID, ORDER_ID, PARENT_ORDER_ID, DEVICE_TYPE, IS_AFFILIATE, FSP_LICENSE_CODE, FSP_LICENSE_NAME, ORDER_TIME, ORDER_TIME_UNIX_EPOCH, USE_POINT_TYPE, ORDER_STATUS, STORE_STATUS, REFERER, ENTRY_POINT, CLINK, SUSPECT_MESSAGE, IS_ITEM_COUPON, IS_SHIPPING_COUPON, SHIP_NAME, SHIP_FIRST_NAME, SHIP_LAST_NAME, SHIP_ADDRESS1, SHIP_ADDRESS2, SHIP_CITY, SHIP_PREFECTURE, SHIP_ZIP_CODE, SHIP_NAME_KANA, SHIP_FIRST_NAME_KANA, SHIP_LAST_NAME_KANA, SHIP_ADDRESS1_KANA, SHIP_ADDRESS2_KANA, SHIP_CITY_KANA, SHIP_PREFECTURE_KANA, SHIP_SECTION1_FIELD, SHIP_SECTION1_VALUE, SHIP_SECTION2_FIELD, SHIP_SECTION2_VALUE, SHIP_PHONE_NUMBER, SHIP_EMG_PHONE_NUMBER, SHIP_METHOD, SHIP_METHOD_NAME, SHIP_REQUEST_DATE, SHIP_REQUEST_TIME, SHIP_NOTES, ARRIVE_TYPE, SHIP_INVOICE_NUMBER1, SHIP_INVOICE_NUMBER2, SHIP_URL, SHIP_DATE, GIFT_WRAP_TYPE, GIFT_WRAP_PAPER_TYPE, GIFT_WRAP_NAME, NEED_BILL_SLIP, NEED_DETAILED_SLIP, NEED_RECEIPT, OPTION1_FIELD, OPTION1_VALUE, OPTION2_FIELD, OPTION2_VALUE, GIFT_WRAP_MASSAGE, BILL_NAME, BILL_FIRST_NAME, BILL_LAST_NAME, BILL_ADDRESS1, BILL_ADDRESS2, BILL_CITY, BILL_PREFECTURE, BILL_ZIP_CODE, BILL_NAME_KANA, BILL_FIRST_NAME_KANA, BILL_LAST_NAME_KANA, BILL_ADDRESS1_KANA, BILL_ADDRESS2_KANA, BILL_CITY_KANA, BILL_PREFECTURE_KANA, BILL_SECTION1_FIELD, BILL_SECTION1_VALUE, BILL_SECTION2_FIELD, BILL_SECTION2_VALUE, BILL_PHONE_NUMBER, BILL_EMG_PHONE_NUMBER, BILL_MAIL_ADDRESS, PAY_MATHOD, PAY_MATHOD_NAME, PAY_KIND, CARD_PAY_COUNT, CARD_PAY_TYPE, SETTLE_STATUS, SETTLE_ID, PAY_NO, PAY_NO_ISSUE_DATE, PAY_DATE, BUYER_COMMENTS, AGE_CONFIRM, QUANTITY_DETAIL, SHIP_CHARGE, PAY_CHARGE, GIFT_WRAP_CHARGE, DISCOUNT, ADJUSTMENTS, USE_POINT, GET_POINT, TOTAL, TOTAL_PRICE, SHIPPING_C_DISCOUNT, ITEM_C_DISCOUNT, TOTAL_MALL_C_DISCOUNT, GET_POINT_CRG_TO_STORE, LINE_ID, QUANTITY, ITEM_ID, SUB_CODE, TITLE, ITEM_OPTION_NAME, ITEM_OPTION_VALUE, SUB_CODE_OPTION, INSCRIPTION_NAME, INSCRIPTION_VALUE, UNIT_PRICE, UNIT_GET_POINT, LINE_SUB_TOTAL, LINE_GET_POINT, POINT_FSP_CODE, ITEM_CONDITION, COUPON_ID, COUPON_DISCOUNT, ORIGINAL_PRICE, IS_GET_POINT_FIX, GET_POINT_FIX_DATE, RELEASE_DATE, GET_POINT_TYPE, JAN, PRODUCT_ID, POINT_CHARGED_TO_STORE, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     YAHOO_ORDER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_EC_ORDER_B
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tEcOrderB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTYahooOrderDtoMapper implements DtoMapper<TYahooOrder, TYahooOrderDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached
    protected boolean _suppressTEcOrderB;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYahooOrderDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTYahooOrderDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public TYahooOrderDto mappingToDto(TYahooOrder entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TYahooOrderDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TYahooOrderDto dto = new TYahooOrderDto();
        dto.setYahooOrderId(entity.getYahooOrderId());
        dto.setOrderId(entity.getOrderId());
        dto.setParentOrderId(entity.getParentOrderId());
        dto.setDeviceType(entity.getDeviceType());
        dto.setIsAffiliate(entity.getIsAffiliate());
        dto.setFspLicenseCode(entity.getFspLicenseCode());
        dto.setFspLicenseName(entity.getFspLicenseName());
        dto.setOrderTime(entity.getOrderTime());
        dto.setOrderTimeUnixEpoch(entity.getOrderTimeUnixEpoch());
        dto.setUsePointType(entity.getUsePointType());
        dto.setOrderStatus(entity.getOrderStatus());
        dto.setStoreStatus(entity.getStoreStatus());
        dto.setReferer(entity.getReferer());
        dto.setEntryPoint(entity.getEntryPoint());
        dto.setClink(entity.getClink());
        dto.setSuspectMessage(entity.getSuspectMessage());
        dto.setIsItemCoupon(entity.getIsItemCoupon());
        dto.setIsShippingCoupon(entity.getIsShippingCoupon());
        dto.setShipName(entity.getShipName());
        dto.setShipFirstName(entity.getShipFirstName());
        dto.setShipLastName(entity.getShipLastName());
        dto.setShipAddress1(entity.getShipAddress1());
        dto.setShipAddress2(entity.getShipAddress2());
        dto.setShipCity(entity.getShipCity());
        dto.setShipPrefecture(entity.getShipPrefecture());
        dto.setShipZipCode(entity.getShipZipCode());
        dto.setShipNameKana(entity.getShipNameKana());
        dto.setShipFirstNameKana(entity.getShipFirstNameKana());
        dto.setShipLastNameKana(entity.getShipLastNameKana());
        dto.setShipAddress1Kana(entity.getShipAddress1Kana());
        dto.setShipAddress2Kana(entity.getShipAddress2Kana());
        dto.setShipCityKana(entity.getShipCityKana());
        dto.setShipPrefectureKana(entity.getShipPrefectureKana());
        dto.setShipSection1Field(entity.getShipSection1Field());
        dto.setShipSection1Value(entity.getShipSection1Value());
        dto.setShipSection2Field(entity.getShipSection2Field());
        dto.setShipSection2Value(entity.getShipSection2Value());
        dto.setShipPhoneNumber(entity.getShipPhoneNumber());
        dto.setShipEmgPhoneNumber(entity.getShipEmgPhoneNumber());
        dto.setShipMethod(entity.getShipMethod());
        dto.setShipMethodName(entity.getShipMethodName());
        dto.setShipRequestDate(entity.getShipRequestDate());
        dto.setShipRequestTime(entity.getShipRequestTime());
        dto.setShipNotes(entity.getShipNotes());
        dto.setArriveType(entity.getArriveType());
        dto.setShipInvoiceNumber1(entity.getShipInvoiceNumber1());
        dto.setShipInvoiceNumber2(entity.getShipInvoiceNumber2());
        dto.setShipUrl(entity.getShipUrl());
        dto.setShipDate(entity.getShipDate());
        dto.setGiftWrapType(entity.getGiftWrapType());
        dto.setGiftWrapPaperType(entity.getGiftWrapPaperType());
        dto.setGiftWrapName(entity.getGiftWrapName());
        dto.setNeedBillSlip(entity.getNeedBillSlip());
        dto.setNeedDetailedSlip(entity.getNeedDetailedSlip());
        dto.setNeedReceipt(entity.getNeedReceipt());
        dto.setOption1Field(entity.getOption1Field());
        dto.setOption1Value(entity.getOption1Value());
        dto.setOption2Field(entity.getOption2Field());
        dto.setOption2Value(entity.getOption2Value());
        dto.setGiftWrapMassage(entity.getGiftWrapMassage());
        dto.setBillName(entity.getBillName());
        dto.setBillFirstName(entity.getBillFirstName());
        dto.setBillLastName(entity.getBillLastName());
        dto.setBillAddress1(entity.getBillAddress1());
        dto.setBillAddress2(entity.getBillAddress2());
        dto.setBillCity(entity.getBillCity());
        dto.setBillPrefecture(entity.getBillPrefecture());
        dto.setBillZipCode(entity.getBillZipCode());
        dto.setBillNameKana(entity.getBillNameKana());
        dto.setBillFirstNameKana(entity.getBillFirstNameKana());
        dto.setBillLastNameKana(entity.getBillLastNameKana());
        dto.setBillAddress1Kana(entity.getBillAddress1Kana());
        dto.setBillAddress2Kana(entity.getBillAddress2Kana());
        dto.setBillCityKana(entity.getBillCityKana());
        dto.setBillPrefectureKana(entity.getBillPrefectureKana());
        dto.setBillSection1Field(entity.getBillSection1Field());
        dto.setBillSection1Value(entity.getBillSection1Value());
        dto.setBillSection2Field(entity.getBillSection2Field());
        dto.setBillSection2Value(entity.getBillSection2Value());
        dto.setBillPhoneNumber(entity.getBillPhoneNumber());
        dto.setBillEmgPhoneNumber(entity.getBillEmgPhoneNumber());
        dto.setBillMailAddress(entity.getBillMailAddress());
        dto.setPayMathod(entity.getPayMathod());
        dto.setPayMathodName(entity.getPayMathodName());
        dto.setPayKind(entity.getPayKind());
        dto.setCardPayCount(entity.getCardPayCount());
        dto.setCardPayType(entity.getCardPayType());
        dto.setSettleStatus(entity.getSettleStatus());
        dto.setSettleId(entity.getSettleId());
        dto.setPayNo(entity.getPayNo());
        dto.setPayNoIssueDate(entity.getPayNoIssueDate());
        dto.setPayDate(entity.getPayDate());
        dto.setBuyerComments(entity.getBuyerComments());
        dto.setAgeConfirm(entity.getAgeConfirm());
        dto.setQuantityDetail(entity.getQuantityDetail());
        dto.setShipCharge(entity.getShipCharge());
        dto.setPayCharge(entity.getPayCharge());
        dto.setGiftWrapCharge(entity.getGiftWrapCharge());
        dto.setDiscount(entity.getDiscount());
        dto.setAdjustments(entity.getAdjustments());
        dto.setUsePoint(entity.getUsePoint());
        dto.setGetPoint(entity.getGetPoint());
        dto.setTotal(entity.getTotal());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setShippingCDiscount(entity.getShippingCDiscount());
        dto.setItemCDiscount(entity.getItemCDiscount());
        dto.setTotalMallCDiscount(entity.getTotalMallCDiscount());
        dto.setGetPointCrgToStore(entity.getGetPointCrgToStore());
        dto.setLineId(entity.getLineId());
        dto.setQuantity(entity.getQuantity());
        dto.setItemId(entity.getItemId());
        dto.setSubCode(entity.getSubCode());
        dto.setTitle(entity.getTitle());
        dto.setItemOptionName(entity.getItemOptionName());
        dto.setItemOptionValue(entity.getItemOptionValue());
        dto.setSubCodeOption(entity.getSubCodeOption());
        dto.setInscriptionName(entity.getInscriptionName());
        dto.setInscriptionValue(entity.getInscriptionValue());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setUnitGetPoint(entity.getUnitGetPoint());
        dto.setLineSubTotal(entity.getLineSubTotal());
        dto.setLineGetPoint(entity.getLineGetPoint());
        dto.setPointFspCode(entity.getPointFspCode());
        dto.setItemCondition(entity.getItemCondition());
        dto.setCouponId(entity.getCouponId());
        dto.setCouponDiscount(entity.getCouponDiscount());
        dto.setOriginalPrice(entity.getOriginalPrice());
        dto.setIsGetPointFix(entity.getIsGetPointFix());
        dto.setGetPointFixDate(entity.getGetPointFixDate());
        dto.setReleaseDate(entity.getReleaseDate());
        dto.setGetPointType(entity.getGetPointType());
        dto.setJan(entity.getJan());
        dto.setProductId(entity.getProductId());
        dto.setPointChargedToStore(entity.getPointChargedToStore());
        dto.setPackingQty(entity.getPackingQty());
        dto.setSlipItemNm1(entity.getSlipItemNm1());
        dto.setSlipItemNm2(entity.getSlipItemNm2());
        dto.setSlipItemNm3(entity.getSlipItemNm3());
        dto.setSlipItemNm4(entity.getSlipItemNm4());
        dto.setSlipItemNm5(entity.getSlipItemNm5());
        dto.setSlipItemCd1(entity.getSlipItemCd1());
        dto.setSlipItemCd2(entity.getSlipItemCd2());
        dto.setFreightHandling1(entity.getFreightHandling1());
        dto.setFreightHandling2(entity.getFreightHandling2());
        dto.setArticle(entity.getArticle());
        dto.setReceiveId(entity.getReceiveId());
        dto.setRowNo(entity.getRowNo());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setImportFlg(entity.getImportFlg());
        dto.setImportTypeId(entity.getImportTypeId());
        dto.setEcOrderBId(entity.getEcOrderBId());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTEcOrderB && entity.getTEcOrderB() != null) {
            TEcOrderB relationEntity = entity.getTEcOrderB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TEcOrderBDto relationDto = (TEcOrderBDto)cachedDto;
                dto.setTEcOrderB(relationDto);
                if (reverseReference) {
                    relationDto.getTYahooOrderList().add(dto);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYahooOrderList();
                TEcOrderBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderB(relationDto);
                if (reverseReference) {
                    relationDto.getTYahooOrderList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTEcOrderB());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TYahooOrderDto> mappingToDtoList(List<TYahooOrder> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TYahooOrderDto> dtoList = new ArrayList<TYahooOrderDto>();
        for (TYahooOrder entity : entityList) {
            TYahooOrderDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public TYahooOrder mappingToEntity(TYahooOrderDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TYahooOrder)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TYahooOrder entity = new TYahooOrder();
        if (needsMapping(dto, dto.getYahooOrderId(), "yahooOrderId")) {
            entity.setYahooOrderId(dto.getYahooOrderId());
        }
        if (needsMapping(dto, dto.getOrderId(), "orderId")) {
            entity.setOrderId(dto.getOrderId());
        }
        if (needsMapping(dto, dto.getParentOrderId(), "parentOrderId")) {
            entity.setParentOrderId(dto.getParentOrderId());
        }
        if (needsMapping(dto, dto.getDeviceType(), "deviceType")) {
            entity.setDeviceType(dto.getDeviceType());
        }
        if (needsMapping(dto, dto.getIsAffiliate(), "isAffiliate")) {
            entity.setIsAffiliate(dto.getIsAffiliate());
        }
        if (needsMapping(dto, dto.getFspLicenseCode(), "fspLicenseCode")) {
            entity.setFspLicenseCode(dto.getFspLicenseCode());
        }
        if (needsMapping(dto, dto.getFspLicenseName(), "fspLicenseName")) {
            entity.setFspLicenseName(dto.getFspLicenseName());
        }
        if (needsMapping(dto, dto.getOrderTime(), "orderTime")) {
            entity.setOrderTime(dto.getOrderTime());
        }
        if (needsMapping(dto, dto.getOrderTimeUnixEpoch(), "orderTimeUnixEpoch")) {
            entity.setOrderTimeUnixEpoch(dto.getOrderTimeUnixEpoch());
        }
        if (needsMapping(dto, dto.getUsePointType(), "usePointType")) {
            entity.setUsePointType(dto.getUsePointType());
        }
        if (needsMapping(dto, dto.getOrderStatus(), "orderStatus")) {
            entity.setOrderStatus(dto.getOrderStatus());
        }
        if (needsMapping(dto, dto.getStoreStatus(), "storeStatus")) {
            entity.setStoreStatus(dto.getStoreStatus());
        }
        if (needsMapping(dto, dto.getReferer(), "referer")) {
            entity.setReferer(dto.getReferer());
        }
        if (needsMapping(dto, dto.getEntryPoint(), "entryPoint")) {
            entity.setEntryPoint(dto.getEntryPoint());
        }
        if (needsMapping(dto, dto.getClink(), "clink")) {
            entity.setClink(dto.getClink());
        }
        if (needsMapping(dto, dto.getSuspectMessage(), "suspectMessage")) {
            entity.setSuspectMessage(dto.getSuspectMessage());
        }
        if (needsMapping(dto, dto.getIsItemCoupon(), "isItemCoupon")) {
            entity.setIsItemCoupon(dto.getIsItemCoupon());
        }
        if (needsMapping(dto, dto.getIsShippingCoupon(), "isShippingCoupon")) {
            entity.setIsShippingCoupon(dto.getIsShippingCoupon());
        }
        if (needsMapping(dto, dto.getShipName(), "shipName")) {
            entity.setShipName(dto.getShipName());
        }
        if (needsMapping(dto, dto.getShipFirstName(), "shipFirstName")) {
            entity.setShipFirstName(dto.getShipFirstName());
        }
        if (needsMapping(dto, dto.getShipLastName(), "shipLastName")) {
            entity.setShipLastName(dto.getShipLastName());
        }
        if (needsMapping(dto, dto.getShipAddress1(), "shipAddress1")) {
            entity.setShipAddress1(dto.getShipAddress1());
        }
        if (needsMapping(dto, dto.getShipAddress2(), "shipAddress2")) {
            entity.setShipAddress2(dto.getShipAddress2());
        }
        if (needsMapping(dto, dto.getShipCity(), "shipCity")) {
            entity.setShipCity(dto.getShipCity());
        }
        if (needsMapping(dto, dto.getShipPrefecture(), "shipPrefecture")) {
            entity.setShipPrefecture(dto.getShipPrefecture());
        }
        if (needsMapping(dto, dto.getShipZipCode(), "shipZipCode")) {
            entity.setShipZipCode(dto.getShipZipCode());
        }
        if (needsMapping(dto, dto.getShipNameKana(), "shipNameKana")) {
            entity.setShipNameKana(dto.getShipNameKana());
        }
        if (needsMapping(dto, dto.getShipFirstNameKana(), "shipFirstNameKana")) {
            entity.setShipFirstNameKana(dto.getShipFirstNameKana());
        }
        if (needsMapping(dto, dto.getShipLastNameKana(), "shipLastNameKana")) {
            entity.setShipLastNameKana(dto.getShipLastNameKana());
        }
        if (needsMapping(dto, dto.getShipAddress1Kana(), "shipAddress1Kana")) {
            entity.setShipAddress1Kana(dto.getShipAddress1Kana());
        }
        if (needsMapping(dto, dto.getShipAddress2Kana(), "shipAddress2Kana")) {
            entity.setShipAddress2Kana(dto.getShipAddress2Kana());
        }
        if (needsMapping(dto, dto.getShipCityKana(), "shipCityKana")) {
            entity.setShipCityKana(dto.getShipCityKana());
        }
        if (needsMapping(dto, dto.getShipPrefectureKana(), "shipPrefectureKana")) {
            entity.setShipPrefectureKana(dto.getShipPrefectureKana());
        }
        if (needsMapping(dto, dto.getShipSection1Field(), "shipSection1Field")) {
            entity.setShipSection1Field(dto.getShipSection1Field());
        }
        if (needsMapping(dto, dto.getShipSection1Value(), "shipSection1Value")) {
            entity.setShipSection1Value(dto.getShipSection1Value());
        }
        if (needsMapping(dto, dto.getShipSection2Field(), "shipSection2Field")) {
            entity.setShipSection2Field(dto.getShipSection2Field());
        }
        if (needsMapping(dto, dto.getShipSection2Value(), "shipSection2Value")) {
            entity.setShipSection2Value(dto.getShipSection2Value());
        }
        if (needsMapping(dto, dto.getShipPhoneNumber(), "shipPhoneNumber")) {
            entity.setShipPhoneNumber(dto.getShipPhoneNumber());
        }
        if (needsMapping(dto, dto.getShipEmgPhoneNumber(), "shipEmgPhoneNumber")) {
            entity.setShipEmgPhoneNumber(dto.getShipEmgPhoneNumber());
        }
        if (needsMapping(dto, dto.getShipMethod(), "shipMethod")) {
            entity.setShipMethod(dto.getShipMethod());
        }
        if (needsMapping(dto, dto.getShipMethodName(), "shipMethodName")) {
            entity.setShipMethodName(dto.getShipMethodName());
        }
        if (needsMapping(dto, dto.getShipRequestDate(), "shipRequestDate")) {
            entity.setShipRequestDate(dto.getShipRequestDate());
        }
        if (needsMapping(dto, dto.getShipRequestTime(), "shipRequestTime")) {
            entity.setShipRequestTime(dto.getShipRequestTime());
        }
        if (needsMapping(dto, dto.getShipNotes(), "shipNotes")) {
            entity.setShipNotes(dto.getShipNotes());
        }
        if (needsMapping(dto, dto.getArriveType(), "arriveType")) {
            entity.setArriveType(dto.getArriveType());
        }
        if (needsMapping(dto, dto.getShipInvoiceNumber1(), "shipInvoiceNumber1")) {
            entity.setShipInvoiceNumber1(dto.getShipInvoiceNumber1());
        }
        if (needsMapping(dto, dto.getShipInvoiceNumber2(), "shipInvoiceNumber2")) {
            entity.setShipInvoiceNumber2(dto.getShipInvoiceNumber2());
        }
        if (needsMapping(dto, dto.getShipUrl(), "shipUrl")) {
            entity.setShipUrl(dto.getShipUrl());
        }
        if (needsMapping(dto, dto.getShipDate(), "shipDate")) {
            entity.setShipDate(dto.getShipDate());
        }
        if (needsMapping(dto, dto.getGiftWrapType(), "giftWrapType")) {
            entity.setGiftWrapType(dto.getGiftWrapType());
        }
        if (needsMapping(dto, dto.getGiftWrapPaperType(), "giftWrapPaperType")) {
            entity.setGiftWrapPaperType(dto.getGiftWrapPaperType());
        }
        if (needsMapping(dto, dto.getGiftWrapName(), "giftWrapName")) {
            entity.setGiftWrapName(dto.getGiftWrapName());
        }
        if (needsMapping(dto, dto.getNeedBillSlip(), "needBillSlip")) {
            entity.setNeedBillSlip(dto.getNeedBillSlip());
        }
        if (needsMapping(dto, dto.getNeedDetailedSlip(), "needDetailedSlip")) {
            entity.setNeedDetailedSlip(dto.getNeedDetailedSlip());
        }
        if (needsMapping(dto, dto.getNeedReceipt(), "needReceipt")) {
            entity.setNeedReceipt(dto.getNeedReceipt());
        }
        if (needsMapping(dto, dto.getOption1Field(), "option1Field")) {
            entity.setOption1Field(dto.getOption1Field());
        }
        if (needsMapping(dto, dto.getOption1Value(), "option1Value")) {
            entity.setOption1Value(dto.getOption1Value());
        }
        if (needsMapping(dto, dto.getOption2Field(), "option2Field")) {
            entity.setOption2Field(dto.getOption2Field());
        }
        if (needsMapping(dto, dto.getOption2Value(), "option2Value")) {
            entity.setOption2Value(dto.getOption2Value());
        }
        if (needsMapping(dto, dto.getGiftWrapMassage(), "giftWrapMassage")) {
            entity.setGiftWrapMassage(dto.getGiftWrapMassage());
        }
        if (needsMapping(dto, dto.getBillName(), "billName")) {
            entity.setBillName(dto.getBillName());
        }
        if (needsMapping(dto, dto.getBillFirstName(), "billFirstName")) {
            entity.setBillFirstName(dto.getBillFirstName());
        }
        if (needsMapping(dto, dto.getBillLastName(), "billLastName")) {
            entity.setBillLastName(dto.getBillLastName());
        }
        if (needsMapping(dto, dto.getBillAddress1(), "billAddress1")) {
            entity.setBillAddress1(dto.getBillAddress1());
        }
        if (needsMapping(dto, dto.getBillAddress2(), "billAddress2")) {
            entity.setBillAddress2(dto.getBillAddress2());
        }
        if (needsMapping(dto, dto.getBillCity(), "billCity")) {
            entity.setBillCity(dto.getBillCity());
        }
        if (needsMapping(dto, dto.getBillPrefecture(), "billPrefecture")) {
            entity.setBillPrefecture(dto.getBillPrefecture());
        }
        if (needsMapping(dto, dto.getBillZipCode(), "billZipCode")) {
            entity.setBillZipCode(dto.getBillZipCode());
        }
        if (needsMapping(dto, dto.getBillNameKana(), "billNameKana")) {
            entity.setBillNameKana(dto.getBillNameKana());
        }
        if (needsMapping(dto, dto.getBillFirstNameKana(), "billFirstNameKana")) {
            entity.setBillFirstNameKana(dto.getBillFirstNameKana());
        }
        if (needsMapping(dto, dto.getBillLastNameKana(), "billLastNameKana")) {
            entity.setBillLastNameKana(dto.getBillLastNameKana());
        }
        if (needsMapping(dto, dto.getBillAddress1Kana(), "billAddress1Kana")) {
            entity.setBillAddress1Kana(dto.getBillAddress1Kana());
        }
        if (needsMapping(dto, dto.getBillAddress2Kana(), "billAddress2Kana")) {
            entity.setBillAddress2Kana(dto.getBillAddress2Kana());
        }
        if (needsMapping(dto, dto.getBillCityKana(), "billCityKana")) {
            entity.setBillCityKana(dto.getBillCityKana());
        }
        if (needsMapping(dto, dto.getBillPrefectureKana(), "billPrefectureKana")) {
            entity.setBillPrefectureKana(dto.getBillPrefectureKana());
        }
        if (needsMapping(dto, dto.getBillSection1Field(), "billSection1Field")) {
            entity.setBillSection1Field(dto.getBillSection1Field());
        }
        if (needsMapping(dto, dto.getBillSection1Value(), "billSection1Value")) {
            entity.setBillSection1Value(dto.getBillSection1Value());
        }
        if (needsMapping(dto, dto.getBillSection2Field(), "billSection2Field")) {
            entity.setBillSection2Field(dto.getBillSection2Field());
        }
        if (needsMapping(dto, dto.getBillSection2Value(), "billSection2Value")) {
            entity.setBillSection2Value(dto.getBillSection2Value());
        }
        if (needsMapping(dto, dto.getBillPhoneNumber(), "billPhoneNumber")) {
            entity.setBillPhoneNumber(dto.getBillPhoneNumber());
        }
        if (needsMapping(dto, dto.getBillEmgPhoneNumber(), "billEmgPhoneNumber")) {
            entity.setBillEmgPhoneNumber(dto.getBillEmgPhoneNumber());
        }
        if (needsMapping(dto, dto.getBillMailAddress(), "billMailAddress")) {
            entity.setBillMailAddress(dto.getBillMailAddress());
        }
        if (needsMapping(dto, dto.getPayMathod(), "payMathod")) {
            entity.setPayMathod(dto.getPayMathod());
        }
        if (needsMapping(dto, dto.getPayMathodName(), "payMathodName")) {
            entity.setPayMathodName(dto.getPayMathodName());
        }
        if (needsMapping(dto, dto.getPayKind(), "payKind")) {
            entity.setPayKind(dto.getPayKind());
        }
        if (needsMapping(dto, dto.getCardPayCount(), "cardPayCount")) {
            entity.setCardPayCount(dto.getCardPayCount());
        }
        if (needsMapping(dto, dto.getCardPayType(), "cardPayType")) {
            entity.setCardPayType(dto.getCardPayType());
        }
        if (needsMapping(dto, dto.getSettleStatus(), "settleStatus")) {
            entity.setSettleStatus(dto.getSettleStatus());
        }
        if (needsMapping(dto, dto.getSettleId(), "settleId")) {
            entity.setSettleId(dto.getSettleId());
        }
        if (needsMapping(dto, dto.getPayNo(), "payNo")) {
            entity.setPayNo(dto.getPayNo());
        }
        if (needsMapping(dto, dto.getPayNoIssueDate(), "payNoIssueDate")) {
            entity.setPayNoIssueDate(dto.getPayNoIssueDate());
        }
        if (needsMapping(dto, dto.getPayDate(), "payDate")) {
            entity.setPayDate(dto.getPayDate());
        }
        if (needsMapping(dto, dto.getBuyerComments(), "buyerComments")) {
            entity.setBuyerComments(dto.getBuyerComments());
        }
        if (needsMapping(dto, dto.getAgeConfirm(), "ageConfirm")) {
            entity.setAgeConfirm(dto.getAgeConfirm());
        }
        if (needsMapping(dto, dto.getQuantityDetail(), "quantityDetail")) {
            entity.setQuantityDetail(dto.getQuantityDetail());
        }
        if (needsMapping(dto, dto.getShipCharge(), "shipCharge")) {
            entity.setShipCharge(dto.getShipCharge());
        }
        if (needsMapping(dto, dto.getPayCharge(), "payCharge")) {
            entity.setPayCharge(dto.getPayCharge());
        }
        if (needsMapping(dto, dto.getGiftWrapCharge(), "giftWrapCharge")) {
            entity.setGiftWrapCharge(dto.getGiftWrapCharge());
        }
        if (needsMapping(dto, dto.getDiscount(), "discount")) {
            entity.setDiscount(dto.getDiscount());
        }
        if (needsMapping(dto, dto.getAdjustments(), "adjustments")) {
            entity.setAdjustments(dto.getAdjustments());
        }
        if (needsMapping(dto, dto.getUsePoint(), "usePoint")) {
            entity.setUsePoint(dto.getUsePoint());
        }
        if (needsMapping(dto, dto.getGetPoint(), "getPoint")) {
            entity.setGetPoint(dto.getGetPoint());
        }
        if (needsMapping(dto, dto.getTotal(), "total")) {
            entity.setTotal(dto.getTotal());
        }
        if (needsMapping(dto, dto.getTotalPrice(), "totalPrice")) {
            entity.setTotalPrice(dto.getTotalPrice());
        }
        if (needsMapping(dto, dto.getShippingCDiscount(), "shippingCDiscount")) {
            entity.setShippingCDiscount(dto.getShippingCDiscount());
        }
        if (needsMapping(dto, dto.getItemCDiscount(), "itemCDiscount")) {
            entity.setItemCDiscount(dto.getItemCDiscount());
        }
        if (needsMapping(dto, dto.getTotalMallCDiscount(), "totalMallCDiscount")) {
            entity.setTotalMallCDiscount(dto.getTotalMallCDiscount());
        }
        if (needsMapping(dto, dto.getGetPointCrgToStore(), "getPointCrgToStore")) {
            entity.setGetPointCrgToStore(dto.getGetPointCrgToStore());
        }
        if (needsMapping(dto, dto.getLineId(), "lineId")) {
            entity.setLineId(dto.getLineId());
        }
        if (needsMapping(dto, dto.getQuantity(), "quantity")) {
            entity.setQuantity(dto.getQuantity());
        }
        if (needsMapping(dto, dto.getItemId(), "itemId")) {
            entity.setItemId(dto.getItemId());
        }
        if (needsMapping(dto, dto.getSubCode(), "subCode")) {
            entity.setSubCode(dto.getSubCode());
        }
        if (needsMapping(dto, dto.getTitle(), "title")) {
            entity.setTitle(dto.getTitle());
        }
        if (needsMapping(dto, dto.getItemOptionName(), "itemOptionName")) {
            entity.setItemOptionName(dto.getItemOptionName());
        }
        if (needsMapping(dto, dto.getItemOptionValue(), "itemOptionValue")) {
            entity.setItemOptionValue(dto.getItemOptionValue());
        }
        if (needsMapping(dto, dto.getSubCodeOption(), "subCodeOption")) {
            entity.setSubCodeOption(dto.getSubCodeOption());
        }
        if (needsMapping(dto, dto.getInscriptionName(), "inscriptionName")) {
            entity.setInscriptionName(dto.getInscriptionName());
        }
        if (needsMapping(dto, dto.getInscriptionValue(), "inscriptionValue")) {
            entity.setInscriptionValue(dto.getInscriptionValue());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getUnitGetPoint(), "unitGetPoint")) {
            entity.setUnitGetPoint(dto.getUnitGetPoint());
        }
        if (needsMapping(dto, dto.getLineSubTotal(), "lineSubTotal")) {
            entity.setLineSubTotal(dto.getLineSubTotal());
        }
        if (needsMapping(dto, dto.getLineGetPoint(), "lineGetPoint")) {
            entity.setLineGetPoint(dto.getLineGetPoint());
        }
        if (needsMapping(dto, dto.getPointFspCode(), "pointFspCode")) {
            entity.setPointFspCode(dto.getPointFspCode());
        }
        if (needsMapping(dto, dto.getItemCondition(), "itemCondition")) {
            entity.setItemCondition(dto.getItemCondition());
        }
        if (needsMapping(dto, dto.getCouponId(), "couponId")) {
            entity.setCouponId(dto.getCouponId());
        }
        if (needsMapping(dto, dto.getCouponDiscount(), "couponDiscount")) {
            entity.setCouponDiscount(dto.getCouponDiscount());
        }
        if (needsMapping(dto, dto.getOriginalPrice(), "originalPrice")) {
            entity.setOriginalPrice(dto.getOriginalPrice());
        }
        if (needsMapping(dto, dto.getIsGetPointFix(), "isGetPointFix")) {
            entity.setIsGetPointFix(dto.getIsGetPointFix());
        }
        if (needsMapping(dto, dto.getGetPointFixDate(), "getPointFixDate")) {
            entity.setGetPointFixDate(dto.getGetPointFixDate());
        }
        if (needsMapping(dto, dto.getReleaseDate(), "releaseDate")) {
            entity.setReleaseDate(dto.getReleaseDate());
        }
        if (needsMapping(dto, dto.getGetPointType(), "getPointType")) {
            entity.setGetPointType(dto.getGetPointType());
        }
        if (needsMapping(dto, dto.getJan(), "jan")) {
            entity.setJan(dto.getJan());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getPointChargedToStore(), "pointChargedToStore")) {
            entity.setPointChargedToStore(dto.getPointChargedToStore());
        }
        if (needsMapping(dto, dto.getPackingQty(), "packingQty")) {
            entity.setPackingQty(dto.getPackingQty());
        }
        if (needsMapping(dto, dto.getSlipItemNm1(), "slipItemNm1")) {
            entity.setSlipItemNm1(dto.getSlipItemNm1());
        }
        if (needsMapping(dto, dto.getSlipItemNm2(), "slipItemNm2")) {
            entity.setSlipItemNm2(dto.getSlipItemNm2());
        }
        if (needsMapping(dto, dto.getSlipItemNm3(), "slipItemNm3")) {
            entity.setSlipItemNm3(dto.getSlipItemNm3());
        }
        if (needsMapping(dto, dto.getSlipItemNm4(), "slipItemNm4")) {
            entity.setSlipItemNm4(dto.getSlipItemNm4());
        }
        if (needsMapping(dto, dto.getSlipItemNm5(), "slipItemNm5")) {
            entity.setSlipItemNm5(dto.getSlipItemNm5());
        }
        if (needsMapping(dto, dto.getSlipItemCd1(), "slipItemCd1")) {
            entity.setSlipItemCd1(dto.getSlipItemCd1());
        }
        if (needsMapping(dto, dto.getSlipItemCd2(), "slipItemCd2")) {
            entity.setSlipItemCd2(dto.getSlipItemCd2());
        }
        if (needsMapping(dto, dto.getFreightHandling1(), "freightHandling1")) {
            entity.setFreightHandling1(dto.getFreightHandling1());
        }
        if (needsMapping(dto, dto.getFreightHandling2(), "freightHandling2")) {
            entity.setFreightHandling2(dto.getFreightHandling2());
        }
        if (needsMapping(dto, dto.getArticle(), "article")) {
            entity.setArticle(dto.getArticle());
        }
        if (needsMapping(dto, dto.getReceiveId(), "receiveId")) {
            entity.setReceiveId(dto.getReceiveId());
        }
        if (needsMapping(dto, dto.getRowNo(), "rowNo")) {
            entity.setRowNo(dto.getRowNo());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getImportTypeId(), "importTypeId")) {
            entity.setImportTypeId(dto.getImportTypeId());
        }
        if (needsMapping(dto, dto.getEcOrderBId(), "ecOrderBId")) {
            entity.setEcOrderBId(dto.getEcOrderBId());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTEcOrderB && dto.getTEcOrderB() != null) {
            TEcOrderBDto relationDto = dto.getTEcOrderB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TEcOrderB relationEntity = (TEcOrderB)cachedEntity;
                entity.setTEcOrderB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYahooOrderList().add(entity);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYahooOrderList();
                TEcOrderB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYahooOrderList().add(entity);
                }
                if (instanceCache && entity.getTEcOrderB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTEcOrderB());
                }
            }
        };
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(TYahooOrderDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<TYahooOrder> mappingToEntityList(List<TYahooOrderDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TYahooOrder> entityList = new ArrayList<TYahooOrder>();
        for (TYahooOrderDto dto : dtoList) {
            TYahooOrder entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    public void suppressTEcOrderB() {
        _suppressTEcOrderB = true;
    }
    protected void doSuppressAll() { // internal
        suppressTEcOrderB();
    }
    protected void doSuppressClear() { // internal
        _suppressTEcOrderB = false;
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public TYahooOrderDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TYahooOrderDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TYahooOrderDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TYahooOrderDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TYahooOrderDtoMapper reverseReference() {
        setReverseReference(true);
        return (TYahooOrderDtoMapper)this;
    }
}
