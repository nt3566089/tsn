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
 * The DTO mapper of T_RAKUTEN_ORDER as TABLE. <br>
 * 楽天RMS受注
 * <pre>
 * [primary-key]
 *     RAKUTEN_ORDER_ID
 *
 * [column]
 *     RAKUTEN_ORDER_ID, ORDER_NO, ORDER_STATUS, CARD_STATUS, PAYMENT_DT, SHIPPING_DT, DELIV_TZ, DELIV_DT, PERSON_IN_CHARGE, SINGLE_MEMO, MAIL_INPUT, FIRST_PAYMENT, TERMINAL, MAIL_CARRIER_CD, GIFT_FLG, RAKUTEN_ORDER_COMMENT, ORDER_DATETIME, MULTI_DELIV_FLG, ALERT_FLG, MEMBER_FLG, TOTAL, TAX, CARRIAGE, COD, AMOUNT_BILLED, TOTAL_AMOUNT, COMBINE_ID, COMBINE_STATUS, COMBINE_TOTAL, COMBINE_CARRIAGE, COMBINE_COD, COMBINE_TAX, COMBINE_BILLED, COMBINE_AMOUNT, COMBINE_BANK_FEE, COMBINE_POINT_USE, MAIL_FLG, ORDER_DT, ORDER_TIME, MOBILE_PAYMENT_NO, HISTORY_MOD_FLG, HISTORY_ICON_FLG, HISTORY_MAIL_FLG, DELIV_MATCH_FLG, POINT_USE_FLG, ORDER_ZIP_CD1, ORDER_ZIP_CD2, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM1, ORDER_CUSTOMER_NM2, ORDER_CUSTOMER_KN1, ORDER_CUSTOMER_KN2, ORDER_TEL_NO1, ORDER_TEL_NO2, ORDER_TEL_NO3, MAIL_ADDRESS, ORDER_SEX, ORDER_BIRTHDAY, PAYMENT_METHOD, CARD_TYPE, CARD_NO, CARD_NM, CARD_AVAILABLE, CARD_INST, CARD_INST_COMMENT, DELIV_METHOD, DELIV_TYPE, POINT_USE, POINT_CONDITION, POINT_STATUS, BANK_STATUS, BANK_FEE_FLG, BANK_FEE, WRAPPING_TITLE_P, WRAPPING_NM_P, WRAPPING_FEE_P, WRAPPING_TAX_P, WRAPPING_TITLE_R, WRAPPING_NM_R, WRAPPING_FEE_R, WRAPPING_TAX_R, DELIV_CARRIAGE, DELIV_COD, DELIV_TAX, CARRIER_TRACE_NUM, DELIV_TOTAL, NOSHI, DELIV_ZIP_CD1, DELIV_ZIP_CD2, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_CUSTOMER_KN1, DELIV_CUSTOMER_KN2, DELIV_TEL_NO1, DELIV_TEL_NO2, DELIV_TEL_NO3, PRODUCT_ID, PRODUCT_NM, PRODUCT_NO, PRODUCT_URL, UNIT_PRICE, ORDER_NUM, PRODUCT_CARRIAGE, PRODUCT_TAX, PRODUCT_COD, ITEM_CHOICE, POINT_SCALE, POINT_TYPE, RECORD_NUMBER, DELIVERY_INFO, STOCK_TYPE, WRAPPING_TYPE_P, WRAPPING_TYPE_R, TOMORROW_FLG, COUPON_USE, SHOP_COUPON_USE, RAKUTEN_COUPON_USE, COMBINE_COUPON_USE, DELIV_COMPANY, PHAMACE_FLG, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RAKUTEN_ORDER_ID
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
public abstract class BsTRakutenOrderDtoMapper implements DtoMapper<TRakutenOrder, TRakutenOrderDto>, Serializable {

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
    public BsTRakutenOrderDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTRakutenOrderDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TRakutenOrderDto mappingToDto(TRakutenOrder entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TRakutenOrderDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TRakutenOrderDto dto = new TRakutenOrderDto();
        dto.setRakutenOrderId(entity.getRakutenOrderId());
        dto.setOrderNo(entity.getOrderNo());
        dto.setOrderStatus(entity.getOrderStatus());
        dto.setCardStatus(entity.getCardStatus());
        dto.setPaymentDt(entity.getPaymentDt());
        dto.setShippingDt(entity.getShippingDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setDelivDt(entity.getDelivDt());
        dto.setPersonInCharge(entity.getPersonInCharge());
        dto.setSingleMemo(entity.getSingleMemo());
        dto.setMailInput(entity.getMailInput());
        dto.setFirstPayment(entity.getFirstPayment());
        dto.setTerminal(entity.getTerminal());
        dto.setMailCarrierCd(entity.getMailCarrierCd());
        dto.setGiftFlg(entity.getGiftFlg());
        dto.setRakutenOrderComment(entity.getRakutenOrderComment());
        dto.setOrderDatetime(entity.getOrderDatetime());
        dto.setMultiDelivFlg(entity.getMultiDelivFlg());
        dto.setAlertFlg(entity.getAlertFlg());
        dto.setMemberFlg(entity.getMemberFlg());
        dto.setTotal(entity.getTotal());
        dto.setTax(entity.getTax());
        dto.setCarriage(entity.getCarriage());
        dto.setCod(entity.getCod());
        dto.setAmountBilled(entity.getAmountBilled());
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setCombineId(entity.getCombineId());
        dto.setCombineStatus(entity.getCombineStatus());
        dto.setCombineTotal(entity.getCombineTotal());
        dto.setCombineCarriage(entity.getCombineCarriage());
        dto.setCombineCod(entity.getCombineCod());
        dto.setCombineTax(entity.getCombineTax());
        dto.setCombineBilled(entity.getCombineBilled());
        dto.setCombineAmount(entity.getCombineAmount());
        dto.setCombineBankFee(entity.getCombineBankFee());
        dto.setCombinePointUse(entity.getCombinePointUse());
        dto.setMailFlg(entity.getMailFlg());
        dto.setOrderDt(entity.getOrderDt());
        dto.setOrderTime(entity.getOrderTime());
        dto.setMobilePaymentNo(entity.getMobilePaymentNo());
        dto.setHistoryModFlg(entity.getHistoryModFlg());
        dto.setHistoryIconFlg(entity.getHistoryIconFlg());
        dto.setHistoryMailFlg(entity.getHistoryMailFlg());
        dto.setDelivMatchFlg(entity.getDelivMatchFlg());
        dto.setPointUseFlg(entity.getPointUseFlg());
        dto.setOrderZipCd1(entity.getOrderZipCd1());
        dto.setOrderZipCd2(entity.getOrderZipCd2());
        dto.setOrderAddress1(entity.getOrderAddress1());
        dto.setOrderAddress2(entity.getOrderAddress2());
        dto.setOrderAddress3(entity.getOrderAddress3());
        dto.setOrderCustomerNm1(entity.getOrderCustomerNm1());
        dto.setOrderCustomerNm2(entity.getOrderCustomerNm2());
        dto.setOrderCustomerKn1(entity.getOrderCustomerKn1());
        dto.setOrderCustomerKn2(entity.getOrderCustomerKn2());
        dto.setOrderTelNo1(entity.getOrderTelNo1());
        dto.setOrderTelNo2(entity.getOrderTelNo2());
        dto.setOrderTelNo3(entity.getOrderTelNo3());
        dto.setMailAddress(entity.getMailAddress());
        dto.setOrderSex(entity.getOrderSex());
        dto.setOrderBirthday(entity.getOrderBirthday());
        dto.setPaymentMethod(entity.getPaymentMethod());
        dto.setCardType(entity.getCardType());
        dto.setCardNo(entity.getCardNo());
        dto.setCardNm(entity.getCardNm());
        dto.setCardAvailable(entity.getCardAvailable());
        dto.setCardInst(entity.getCardInst());
        dto.setCardInstComment(entity.getCardInstComment());
        dto.setDelivMethod(entity.getDelivMethod());
        dto.setDelivType(entity.getDelivType());
        dto.setPointUse(entity.getPointUse());
        dto.setPointCondition(entity.getPointCondition());
        dto.setPointStatus(entity.getPointStatus());
        dto.setBankStatus(entity.getBankStatus());
        dto.setBankFeeFlg(entity.getBankFeeFlg());
        dto.setBankFee(entity.getBankFee());
        dto.setWrappingTitleP(entity.getWrappingTitleP());
        dto.setWrappingNmP(entity.getWrappingNmP());
        dto.setWrappingFeeP(entity.getWrappingFeeP());
        dto.setWrappingTaxP(entity.getWrappingTaxP());
        dto.setWrappingTitleR(entity.getWrappingTitleR());
        dto.setWrappingNmR(entity.getWrappingNmR());
        dto.setWrappingFeeR(entity.getWrappingFeeR());
        dto.setWrappingTaxR(entity.getWrappingTaxR());
        dto.setDelivCarriage(entity.getDelivCarriage());
        dto.setDelivCod(entity.getDelivCod());
        dto.setDelivTax(entity.getDelivTax());
        dto.setCarrierTraceNum(entity.getCarrierTraceNum());
        dto.setDelivTotal(entity.getDelivTotal());
        dto.setNoshi(entity.getNoshi());
        dto.setDelivZipCd1(entity.getDelivZipCd1());
        dto.setDelivZipCd2(entity.getDelivZipCd2());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivCustomerNm1(entity.getDelivCustomerNm1());
        dto.setDelivCustomerNm2(entity.getDelivCustomerNm2());
        dto.setDelivCustomerKn1(entity.getDelivCustomerKn1());
        dto.setDelivCustomerKn2(entity.getDelivCustomerKn2());
        dto.setDelivTelNo1(entity.getDelivTelNo1());
        dto.setDelivTelNo2(entity.getDelivTelNo2());
        dto.setDelivTelNo3(entity.getDelivTelNo3());
        dto.setProductId(entity.getProductId());
        dto.setProductNm(entity.getProductNm());
        dto.setProductNo(entity.getProductNo());
        dto.setProductUrl(entity.getProductUrl());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setOrderNum(entity.getOrderNum());
        dto.setProductCarriage(entity.getProductCarriage());
        dto.setProductTax(entity.getProductTax());
        dto.setProductCod(entity.getProductCod());
        dto.setItemChoice(entity.getItemChoice());
        dto.setPointScale(entity.getPointScale());
        dto.setPointType(entity.getPointType());
        dto.setRecordNumber(entity.getRecordNumber());
        dto.setDeliveryInfo(entity.getDeliveryInfo());
        dto.setStockType(entity.getStockType());
        dto.setWrappingTypeP(entity.getWrappingTypeP());
        dto.setWrappingTypeR(entity.getWrappingTypeR());
        dto.setTomorrowFlg(entity.getTomorrowFlg());
        dto.setCouponUse(entity.getCouponUse());
        dto.setShopCouponUse(entity.getShopCouponUse());
        dto.setRakutenCouponUse(entity.getRakutenCouponUse());
        dto.setCombineCouponUse(entity.getCombineCouponUse());
        dto.setDelivCompany(entity.getDelivCompany());
        dto.setPhamaceFlg(entity.getPhamaceFlg());
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
                    relationDto.getTRakutenOrderList().add(dto);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTRakutenOrderList();
                TEcOrderBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderB(relationDto);
                if (reverseReference) {
                    relationDto.getTRakutenOrderList().add(dto);
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
    public List<TRakutenOrderDto> mappingToDtoList(List<TRakutenOrder> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TRakutenOrderDto> dtoList = new ArrayList<TRakutenOrderDto>();
        for (TRakutenOrder entity : entityList) {
            TRakutenOrderDto dto = mappingToDto(entity);
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
    public TRakutenOrder mappingToEntity(TRakutenOrderDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TRakutenOrder)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TRakutenOrder entity = new TRakutenOrder();
        if (needsMapping(dto, dto.getRakutenOrderId(), "rakutenOrderId")) {
            entity.setRakutenOrderId(dto.getRakutenOrderId());
        }
        if (needsMapping(dto, dto.getOrderNo(), "orderNo")) {
            entity.setOrderNo(dto.getOrderNo());
        }
        if (needsMapping(dto, dto.getOrderStatus(), "orderStatus")) {
            entity.setOrderStatus(dto.getOrderStatus());
        }
        if (needsMapping(dto, dto.getCardStatus(), "cardStatus")) {
            entity.setCardStatus(dto.getCardStatus());
        }
        if (needsMapping(dto, dto.getPaymentDt(), "paymentDt")) {
            entity.setPaymentDt(dto.getPaymentDt());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getPersonInCharge(), "personInCharge")) {
            entity.setPersonInCharge(dto.getPersonInCharge());
        }
        if (needsMapping(dto, dto.getSingleMemo(), "singleMemo")) {
            entity.setSingleMemo(dto.getSingleMemo());
        }
        if (needsMapping(dto, dto.getMailInput(), "mailInput")) {
            entity.setMailInput(dto.getMailInput());
        }
        if (needsMapping(dto, dto.getFirstPayment(), "firstPayment")) {
            entity.setFirstPayment(dto.getFirstPayment());
        }
        if (needsMapping(dto, dto.getTerminal(), "terminal")) {
            entity.setTerminal(dto.getTerminal());
        }
        if (needsMapping(dto, dto.getMailCarrierCd(), "mailCarrierCd")) {
            entity.setMailCarrierCd(dto.getMailCarrierCd());
        }
        if (needsMapping(dto, dto.getGiftFlg(), "giftFlg")) {
            entity.setGiftFlg(dto.getGiftFlg());
        }
        if (needsMapping(dto, dto.getRakutenOrderComment(), "rakutenOrderComment")) {
            entity.setRakutenOrderComment(dto.getRakutenOrderComment());
        }
        if (needsMapping(dto, dto.getOrderDatetime(), "orderDatetime")) {
            entity.setOrderDatetime(dto.getOrderDatetime());
        }
        if (needsMapping(dto, dto.getMultiDelivFlg(), "multiDelivFlg")) {
            entity.setMultiDelivFlg(dto.getMultiDelivFlg());
        }
        if (needsMapping(dto, dto.getAlertFlg(), "alertFlg")) {
            entity.setAlertFlg(dto.getAlertFlg());
        }
        if (needsMapping(dto, dto.getMemberFlg(), "memberFlg")) {
            entity.setMemberFlg(dto.getMemberFlg());
        }
        if (needsMapping(dto, dto.getTotal(), "total")) {
            entity.setTotal(dto.getTotal());
        }
        if (needsMapping(dto, dto.getTax(), "tax")) {
            entity.setTax(dto.getTax());
        }
        if (needsMapping(dto, dto.getCarriage(), "carriage")) {
            entity.setCarriage(dto.getCarriage());
        }
        if (needsMapping(dto, dto.getCod(), "cod")) {
            entity.setCod(dto.getCod());
        }
        if (needsMapping(dto, dto.getAmountBilled(), "amountBilled")) {
            entity.setAmountBilled(dto.getAmountBilled());
        }
        if (needsMapping(dto, dto.getTotalAmount(), "totalAmount")) {
            entity.setTotalAmount(dto.getTotalAmount());
        }
        if (needsMapping(dto, dto.getCombineId(), "combineId")) {
            entity.setCombineId(dto.getCombineId());
        }
        if (needsMapping(dto, dto.getCombineStatus(), "combineStatus")) {
            entity.setCombineStatus(dto.getCombineStatus());
        }
        if (needsMapping(dto, dto.getCombineTotal(), "combineTotal")) {
            entity.setCombineTotal(dto.getCombineTotal());
        }
        if (needsMapping(dto, dto.getCombineCarriage(), "combineCarriage")) {
            entity.setCombineCarriage(dto.getCombineCarriage());
        }
        if (needsMapping(dto, dto.getCombineCod(), "combineCod")) {
            entity.setCombineCod(dto.getCombineCod());
        }
        if (needsMapping(dto, dto.getCombineTax(), "combineTax")) {
            entity.setCombineTax(dto.getCombineTax());
        }
        if (needsMapping(dto, dto.getCombineBilled(), "combineBilled")) {
            entity.setCombineBilled(dto.getCombineBilled());
        }
        if (needsMapping(dto, dto.getCombineAmount(), "combineAmount")) {
            entity.setCombineAmount(dto.getCombineAmount());
        }
        if (needsMapping(dto, dto.getCombineBankFee(), "combineBankFee")) {
            entity.setCombineBankFee(dto.getCombineBankFee());
        }
        if (needsMapping(dto, dto.getCombinePointUse(), "combinePointUse")) {
            entity.setCombinePointUse(dto.getCombinePointUse());
        }
        if (needsMapping(dto, dto.getMailFlg(), "mailFlg")) {
            entity.setMailFlg(dto.getMailFlg());
        }
        if (needsMapping(dto, dto.getOrderDt(), "orderDt")) {
            entity.setOrderDt(dto.getOrderDt());
        }
        if (needsMapping(dto, dto.getOrderTime(), "orderTime")) {
            entity.setOrderTime(dto.getOrderTime());
        }
        if (needsMapping(dto, dto.getMobilePaymentNo(), "mobilePaymentNo")) {
            entity.setMobilePaymentNo(dto.getMobilePaymentNo());
        }
        if (needsMapping(dto, dto.getHistoryModFlg(), "historyModFlg")) {
            entity.setHistoryModFlg(dto.getHistoryModFlg());
        }
        if (needsMapping(dto, dto.getHistoryIconFlg(), "historyIconFlg")) {
            entity.setHistoryIconFlg(dto.getHistoryIconFlg());
        }
        if (needsMapping(dto, dto.getHistoryMailFlg(), "historyMailFlg")) {
            entity.setHistoryMailFlg(dto.getHistoryMailFlg());
        }
        if (needsMapping(dto, dto.getDelivMatchFlg(), "delivMatchFlg")) {
            entity.setDelivMatchFlg(dto.getDelivMatchFlg());
        }
        if (needsMapping(dto, dto.getPointUseFlg(), "pointUseFlg")) {
            entity.setPointUseFlg(dto.getPointUseFlg());
        }
        if (needsMapping(dto, dto.getOrderZipCd1(), "orderZipCd1")) {
            entity.setOrderZipCd1(dto.getOrderZipCd1());
        }
        if (needsMapping(dto, dto.getOrderZipCd2(), "orderZipCd2")) {
            entity.setOrderZipCd2(dto.getOrderZipCd2());
        }
        if (needsMapping(dto, dto.getOrderAddress1(), "orderAddress1")) {
            entity.setOrderAddress1(dto.getOrderAddress1());
        }
        if (needsMapping(dto, dto.getOrderAddress2(), "orderAddress2")) {
            entity.setOrderAddress2(dto.getOrderAddress2());
        }
        if (needsMapping(dto, dto.getOrderAddress3(), "orderAddress3")) {
            entity.setOrderAddress3(dto.getOrderAddress3());
        }
        if (needsMapping(dto, dto.getOrderCustomerNm1(), "orderCustomerNm1")) {
            entity.setOrderCustomerNm1(dto.getOrderCustomerNm1());
        }
        if (needsMapping(dto, dto.getOrderCustomerNm2(), "orderCustomerNm2")) {
            entity.setOrderCustomerNm2(dto.getOrderCustomerNm2());
        }
        if (needsMapping(dto, dto.getOrderCustomerKn1(), "orderCustomerKn1")) {
            entity.setOrderCustomerKn1(dto.getOrderCustomerKn1());
        }
        if (needsMapping(dto, dto.getOrderCustomerKn2(), "orderCustomerKn2")) {
            entity.setOrderCustomerKn2(dto.getOrderCustomerKn2());
        }
        if (needsMapping(dto, dto.getOrderTelNo1(), "orderTelNo1")) {
            entity.setOrderTelNo1(dto.getOrderTelNo1());
        }
        if (needsMapping(dto, dto.getOrderTelNo2(), "orderTelNo2")) {
            entity.setOrderTelNo2(dto.getOrderTelNo2());
        }
        if (needsMapping(dto, dto.getOrderTelNo3(), "orderTelNo3")) {
            entity.setOrderTelNo3(dto.getOrderTelNo3());
        }
        if (needsMapping(dto, dto.getMailAddress(), "mailAddress")) {
            entity.setMailAddress(dto.getMailAddress());
        }
        if (needsMapping(dto, dto.getOrderSex(), "orderSex")) {
            entity.setOrderSex(dto.getOrderSex());
        }
        if (needsMapping(dto, dto.getOrderBirthday(), "orderBirthday")) {
            entity.setOrderBirthday(dto.getOrderBirthday());
        }
        if (needsMapping(dto, dto.getPaymentMethod(), "paymentMethod")) {
            entity.setPaymentMethod(dto.getPaymentMethod());
        }
        if (needsMapping(dto, dto.getCardType(), "cardType")) {
            entity.setCardType(dto.getCardType());
        }
        if (needsMapping(dto, dto.getCardNo(), "cardNo")) {
            entity.setCardNo(dto.getCardNo());
        }
        if (needsMapping(dto, dto.getCardNm(), "cardNm")) {
            entity.setCardNm(dto.getCardNm());
        }
        if (needsMapping(dto, dto.getCardAvailable(), "cardAvailable")) {
            entity.setCardAvailable(dto.getCardAvailable());
        }
        if (needsMapping(dto, dto.getCardInst(), "cardInst")) {
            entity.setCardInst(dto.getCardInst());
        }
        if (needsMapping(dto, dto.getCardInstComment(), "cardInstComment")) {
            entity.setCardInstComment(dto.getCardInstComment());
        }
        if (needsMapping(dto, dto.getDelivMethod(), "delivMethod")) {
            entity.setDelivMethod(dto.getDelivMethod());
        }
        if (needsMapping(dto, dto.getDelivType(), "delivType")) {
            entity.setDelivType(dto.getDelivType());
        }
        if (needsMapping(dto, dto.getPointUse(), "pointUse")) {
            entity.setPointUse(dto.getPointUse());
        }
        if (needsMapping(dto, dto.getPointCondition(), "pointCondition")) {
            entity.setPointCondition(dto.getPointCondition());
        }
        if (needsMapping(dto, dto.getPointStatus(), "pointStatus")) {
            entity.setPointStatus(dto.getPointStatus());
        }
        if (needsMapping(dto, dto.getBankStatus(), "bankStatus")) {
            entity.setBankStatus(dto.getBankStatus());
        }
        if (needsMapping(dto, dto.getBankFeeFlg(), "bankFeeFlg")) {
            entity.setBankFeeFlg(dto.getBankFeeFlg());
        }
        if (needsMapping(dto, dto.getBankFee(), "bankFee")) {
            entity.setBankFee(dto.getBankFee());
        }
        if (needsMapping(dto, dto.getWrappingTitleP(), "wrappingTitleP")) {
            entity.setWrappingTitleP(dto.getWrappingTitleP());
        }
        if (needsMapping(dto, dto.getWrappingNmP(), "wrappingNmP")) {
            entity.setWrappingNmP(dto.getWrappingNmP());
        }
        if (needsMapping(dto, dto.getWrappingFeeP(), "wrappingFeeP")) {
            entity.setWrappingFeeP(dto.getWrappingFeeP());
        }
        if (needsMapping(dto, dto.getWrappingTaxP(), "wrappingTaxP")) {
            entity.setWrappingTaxP(dto.getWrappingTaxP());
        }
        if (needsMapping(dto, dto.getWrappingTitleR(), "wrappingTitleR")) {
            entity.setWrappingTitleR(dto.getWrappingTitleR());
        }
        if (needsMapping(dto, dto.getWrappingNmR(), "wrappingNmR")) {
            entity.setWrappingNmR(dto.getWrappingNmR());
        }
        if (needsMapping(dto, dto.getWrappingFeeR(), "wrappingFeeR")) {
            entity.setWrappingFeeR(dto.getWrappingFeeR());
        }
        if (needsMapping(dto, dto.getWrappingTaxR(), "wrappingTaxR")) {
            entity.setWrappingTaxR(dto.getWrappingTaxR());
        }
        if (needsMapping(dto, dto.getDelivCarriage(), "delivCarriage")) {
            entity.setDelivCarriage(dto.getDelivCarriage());
        }
        if (needsMapping(dto, dto.getDelivCod(), "delivCod")) {
            entity.setDelivCod(dto.getDelivCod());
        }
        if (needsMapping(dto, dto.getDelivTax(), "delivTax")) {
            entity.setDelivTax(dto.getDelivTax());
        }
        if (needsMapping(dto, dto.getCarrierTraceNum(), "carrierTraceNum")) {
            entity.setCarrierTraceNum(dto.getCarrierTraceNum());
        }
        if (needsMapping(dto, dto.getDelivTotal(), "delivTotal")) {
            entity.setDelivTotal(dto.getDelivTotal());
        }
        if (needsMapping(dto, dto.getNoshi(), "noshi")) {
            entity.setNoshi(dto.getNoshi());
        }
        if (needsMapping(dto, dto.getDelivZipCd1(), "delivZipCd1")) {
            entity.setDelivZipCd1(dto.getDelivZipCd1());
        }
        if (needsMapping(dto, dto.getDelivZipCd2(), "delivZipCd2")) {
            entity.setDelivZipCd2(dto.getDelivZipCd2());
        }
        if (needsMapping(dto, dto.getDelivAddress1(), "delivAddress1")) {
            entity.setDelivAddress1(dto.getDelivAddress1());
        }
        if (needsMapping(dto, dto.getDelivAddress2(), "delivAddress2")) {
            entity.setDelivAddress2(dto.getDelivAddress2());
        }
        if (needsMapping(dto, dto.getDelivAddress3(), "delivAddress3")) {
            entity.setDelivAddress3(dto.getDelivAddress3());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm1(), "delivCustomerNm1")) {
            entity.setDelivCustomerNm1(dto.getDelivCustomerNm1());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm2(), "delivCustomerNm2")) {
            entity.setDelivCustomerNm2(dto.getDelivCustomerNm2());
        }
        if (needsMapping(dto, dto.getDelivCustomerKn1(), "delivCustomerKn1")) {
            entity.setDelivCustomerKn1(dto.getDelivCustomerKn1());
        }
        if (needsMapping(dto, dto.getDelivCustomerKn2(), "delivCustomerKn2")) {
            entity.setDelivCustomerKn2(dto.getDelivCustomerKn2());
        }
        if (needsMapping(dto, dto.getDelivTelNo1(), "delivTelNo1")) {
            entity.setDelivTelNo1(dto.getDelivTelNo1());
        }
        if (needsMapping(dto, dto.getDelivTelNo2(), "delivTelNo2")) {
            entity.setDelivTelNo2(dto.getDelivTelNo2());
        }
        if (needsMapping(dto, dto.getDelivTelNo3(), "delivTelNo3")) {
            entity.setDelivTelNo3(dto.getDelivTelNo3());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getProductNo(), "productNo")) {
            entity.setProductNo(dto.getProductNo());
        }
        if (needsMapping(dto, dto.getProductUrl(), "productUrl")) {
            entity.setProductUrl(dto.getProductUrl());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getOrderNum(), "orderNum")) {
            entity.setOrderNum(dto.getOrderNum());
        }
        if (needsMapping(dto, dto.getProductCarriage(), "productCarriage")) {
            entity.setProductCarriage(dto.getProductCarriage());
        }
        if (needsMapping(dto, dto.getProductTax(), "productTax")) {
            entity.setProductTax(dto.getProductTax());
        }
        if (needsMapping(dto, dto.getProductCod(), "productCod")) {
            entity.setProductCod(dto.getProductCod());
        }
        if (needsMapping(dto, dto.getItemChoice(), "itemChoice")) {
            entity.setItemChoice(dto.getItemChoice());
        }
        if (needsMapping(dto, dto.getPointScale(), "pointScale")) {
            entity.setPointScale(dto.getPointScale());
        }
        if (needsMapping(dto, dto.getPointType(), "pointType")) {
            entity.setPointType(dto.getPointType());
        }
        if (needsMapping(dto, dto.getRecordNumber(), "recordNumber")) {
            entity.setRecordNumber(dto.getRecordNumber());
        }
        if (needsMapping(dto, dto.getDeliveryInfo(), "deliveryInfo")) {
            entity.setDeliveryInfo(dto.getDeliveryInfo());
        }
        if (needsMapping(dto, dto.getStockType(), "stockType")) {
            entity.setStockType(dto.getStockType());
        }
        if (needsMapping(dto, dto.getWrappingTypeP(), "wrappingTypeP")) {
            entity.setWrappingTypeP(dto.getWrappingTypeP());
        }
        if (needsMapping(dto, dto.getWrappingTypeR(), "wrappingTypeR")) {
            entity.setWrappingTypeR(dto.getWrappingTypeR());
        }
        if (needsMapping(dto, dto.getTomorrowFlg(), "tomorrowFlg")) {
            entity.setTomorrowFlg(dto.getTomorrowFlg());
        }
        if (needsMapping(dto, dto.getCouponUse(), "couponUse")) {
            entity.setCouponUse(dto.getCouponUse());
        }
        if (needsMapping(dto, dto.getShopCouponUse(), "shopCouponUse")) {
            entity.setShopCouponUse(dto.getShopCouponUse());
        }
        if (needsMapping(dto, dto.getRakutenCouponUse(), "rakutenCouponUse")) {
            entity.setRakutenCouponUse(dto.getRakutenCouponUse());
        }
        if (needsMapping(dto, dto.getCombineCouponUse(), "combineCouponUse")) {
            entity.setCombineCouponUse(dto.getCombineCouponUse());
        }
        if (needsMapping(dto, dto.getDelivCompany(), "delivCompany")) {
            entity.setDelivCompany(dto.getDelivCompany());
        }
        if (needsMapping(dto, dto.getPhamaceFlg(), "phamaceFlg")) {
            entity.setPhamaceFlg(dto.getPhamaceFlg());
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
                    relationEntity.getTRakutenOrderList().add(entity);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTRakutenOrderList();
                TEcOrderB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTRakutenOrderList().add(entity);
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
    protected boolean needsMapping(TRakutenOrderDto dto, Object value, String propName) {
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
    public List<TRakutenOrder> mappingToEntityList(List<TRakutenOrderDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TRakutenOrder> entityList = new ArrayList<TRakutenOrder>();
        for (TRakutenOrderDto dto : dtoList) {
            TRakutenOrder entity = mappingToEntity(dto);
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
    public TRakutenOrderDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TRakutenOrderDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TRakutenOrderDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TRakutenOrderDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TRakutenOrderDtoMapper reverseReference() {
        setReverseReference(true);
        return (TRakutenOrderDtoMapper)this;
    }
}
