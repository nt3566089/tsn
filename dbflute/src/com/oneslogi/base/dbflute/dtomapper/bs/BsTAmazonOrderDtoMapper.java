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
 * The DTO mapper of T_AMAZON_ORDER as TABLE. <br>
 * Amazon受注
 * <pre>
 * [primary-key]
 *     AMAZON_ORDER_ID
 *
 * [column]
 *     AMAZON_ORDER_ID, ORDER_ID, ORDER_ITEM_ID, PURCHASE_DATE, PAYMENTS_DATE, BUYER_EMAIL, BUYER_NAME, BUYER_PHONE_NUMBER, SKU, PRODUCT_NAME, QUANTITY_PURCHASED, CURRENCY, ITEM_PRICE, ITEM_TAX, SHIPPING_PRICE, SHIPPING_TAX, GIFT_WRAP_PRICE, GIFT_WRAP_TAX, SHIP_SERVICE_LEVEL, RECIPIENT_NAME, SHIP_ADDRESS_1, SHIP_ADDRESS_2, SHIP_ADDRESS_3, SHIP_CITY, SHIP_STATE, SHIP_POSTAL_CODE, SHIP_COUNTRY, SHIP_PHONE_NUMBER, GIFT_WRAP_TYPE, GIFT_MASSAGE_TEXT, ITEM_PROMOTION_DISCOUNT, ITEM_PROMOTION_ID, SHIP_PROMOTION_DISCOUNT, SHIP_PROMOTION_ID, DELIVERY_START_DATE, DELIVERY_END_DATE, DELIVERY_TIME_ZONE, DELIVERY_INSTRUCTIONS, PAYMENT_METHOD, COD_COLLECTIBLE_AMOUNT, ALREADY_PAID, PAYMENT_METHOD_FEE, SCHEDULED_DELI_ST_DATE, SCHEDULED_DELI_ED_DATE, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     AMAZON_ORDER_ID
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
public abstract class BsTAmazonOrderDtoMapper implements DtoMapper<TAmazonOrder, TAmazonOrderDto>, Serializable {

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
    public BsTAmazonOrderDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTAmazonOrderDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TAmazonOrderDto mappingToDto(TAmazonOrder entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TAmazonOrderDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TAmazonOrderDto dto = new TAmazonOrderDto();
        dto.setAmazonOrderId(entity.getAmazonOrderId());
        dto.setOrderId(entity.getOrderId());
        dto.setOrderItemId(entity.getOrderItemId());
        dto.setPurchaseDate(entity.getPurchaseDate());
        dto.setPaymentsDate(entity.getPaymentsDate());
        dto.setBuyerEmail(entity.getBuyerEmail());
        dto.setBuyerName(entity.getBuyerName());
        dto.setBuyerPhoneNumber(entity.getBuyerPhoneNumber());
        dto.setSku(entity.getSku());
        dto.setProductName(entity.getProductName());
        dto.setQuantityPurchased(entity.getQuantityPurchased());
        dto.setCurrency(entity.getCurrency());
        dto.setItemPrice(entity.getItemPrice());
        dto.setItemTax(entity.getItemTax());
        dto.setShippingPrice(entity.getShippingPrice());
        dto.setShippingTax(entity.getShippingTax());
        dto.setGiftWrapPrice(entity.getGiftWrapPrice());
        dto.setGiftWrapTax(entity.getGiftWrapTax());
        dto.setShipServiceLevel(entity.getShipServiceLevel());
        dto.setRecipientName(entity.getRecipientName());
        dto.setShipAddress1(entity.getShipAddress1());
        dto.setShipAddress2(entity.getShipAddress2());
        dto.setShipAddress3(entity.getShipAddress3());
        dto.setShipCity(entity.getShipCity());
        dto.setShipState(entity.getShipState());
        dto.setShipPostalCode(entity.getShipPostalCode());
        dto.setShipCountry(entity.getShipCountry());
        dto.setShipPhoneNumber(entity.getShipPhoneNumber());
        dto.setGiftWrapType(entity.getGiftWrapType());
        dto.setGiftMassageText(entity.getGiftMassageText());
        dto.setItemPromotionDiscount(entity.getItemPromotionDiscount());
        dto.setItemPromotionId(entity.getItemPromotionId());
        dto.setShipPromotionDiscount(entity.getShipPromotionDiscount());
        dto.setShipPromotionId(entity.getShipPromotionId());
        dto.setDeliveryStartDate(entity.getDeliveryStartDate());
        dto.setDeliveryEndDate(entity.getDeliveryEndDate());
        dto.setDeliveryTimeZone(entity.getDeliveryTimeZone());
        dto.setDeliveryInstructions(entity.getDeliveryInstructions());
        dto.setPaymentMethod(entity.getPaymentMethod());
        dto.setCodCollectibleAmount(entity.getCodCollectibleAmount());
        dto.setAlreadyPaid(entity.getAlreadyPaid());
        dto.setPaymentMethodFee(entity.getPaymentMethodFee());
        dto.setScheduledDeliStDate(entity.getScheduledDeliStDate());
        dto.setScheduledDeliEdDate(entity.getScheduledDeliEdDate());
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
                    relationDto.getTAmazonOrderList().add(dto);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTAmazonOrderList();
                TEcOrderBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderB(relationDto);
                if (reverseReference) {
                    relationDto.getTAmazonOrderList().add(dto);
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
    public List<TAmazonOrderDto> mappingToDtoList(List<TAmazonOrder> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TAmazonOrderDto> dtoList = new ArrayList<TAmazonOrderDto>();
        for (TAmazonOrder entity : entityList) {
            TAmazonOrderDto dto = mappingToDto(entity);
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
    public TAmazonOrder mappingToEntity(TAmazonOrderDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TAmazonOrder)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TAmazonOrder entity = new TAmazonOrder();
        if (needsMapping(dto, dto.getAmazonOrderId(), "amazonOrderId")) {
            entity.setAmazonOrderId(dto.getAmazonOrderId());
        }
        if (needsMapping(dto, dto.getOrderId(), "orderId")) {
            entity.setOrderId(dto.getOrderId());
        }
        if (needsMapping(dto, dto.getOrderItemId(), "orderItemId")) {
            entity.setOrderItemId(dto.getOrderItemId());
        }
        if (needsMapping(dto, dto.getPurchaseDate(), "purchaseDate")) {
            entity.setPurchaseDate(dto.getPurchaseDate());
        }
        if (needsMapping(dto, dto.getPaymentsDate(), "paymentsDate")) {
            entity.setPaymentsDate(dto.getPaymentsDate());
        }
        if (needsMapping(dto, dto.getBuyerEmail(), "buyerEmail")) {
            entity.setBuyerEmail(dto.getBuyerEmail());
        }
        if (needsMapping(dto, dto.getBuyerName(), "buyerName")) {
            entity.setBuyerName(dto.getBuyerName());
        }
        if (needsMapping(dto, dto.getBuyerPhoneNumber(), "buyerPhoneNumber")) {
            entity.setBuyerPhoneNumber(dto.getBuyerPhoneNumber());
        }
        if (needsMapping(dto, dto.getSku(), "sku")) {
            entity.setSku(dto.getSku());
        }
        if (needsMapping(dto, dto.getProductName(), "productName")) {
            entity.setProductName(dto.getProductName());
        }
        if (needsMapping(dto, dto.getQuantityPurchased(), "quantityPurchased")) {
            entity.setQuantityPurchased(dto.getQuantityPurchased());
        }
        if (needsMapping(dto, dto.getCurrency(), "currency")) {
            entity.setCurrency(dto.getCurrency());
        }
        if (needsMapping(dto, dto.getItemPrice(), "itemPrice")) {
            entity.setItemPrice(dto.getItemPrice());
        }
        if (needsMapping(dto, dto.getItemTax(), "itemTax")) {
            entity.setItemTax(dto.getItemTax());
        }
        if (needsMapping(dto, dto.getShippingPrice(), "shippingPrice")) {
            entity.setShippingPrice(dto.getShippingPrice());
        }
        if (needsMapping(dto, dto.getShippingTax(), "shippingTax")) {
            entity.setShippingTax(dto.getShippingTax());
        }
        if (needsMapping(dto, dto.getGiftWrapPrice(), "giftWrapPrice")) {
            entity.setGiftWrapPrice(dto.getGiftWrapPrice());
        }
        if (needsMapping(dto, dto.getGiftWrapTax(), "giftWrapTax")) {
            entity.setGiftWrapTax(dto.getGiftWrapTax());
        }
        if (needsMapping(dto, dto.getShipServiceLevel(), "shipServiceLevel")) {
            entity.setShipServiceLevel(dto.getShipServiceLevel());
        }
        if (needsMapping(dto, dto.getRecipientName(), "recipientName")) {
            entity.setRecipientName(dto.getRecipientName());
        }
        if (needsMapping(dto, dto.getShipAddress1(), "shipAddress1")) {
            entity.setShipAddress1(dto.getShipAddress1());
        }
        if (needsMapping(dto, dto.getShipAddress2(), "shipAddress2")) {
            entity.setShipAddress2(dto.getShipAddress2());
        }
        if (needsMapping(dto, dto.getShipAddress3(), "shipAddress3")) {
            entity.setShipAddress3(dto.getShipAddress3());
        }
        if (needsMapping(dto, dto.getShipCity(), "shipCity")) {
            entity.setShipCity(dto.getShipCity());
        }
        if (needsMapping(dto, dto.getShipState(), "shipState")) {
            entity.setShipState(dto.getShipState());
        }
        if (needsMapping(dto, dto.getShipPostalCode(), "shipPostalCode")) {
            entity.setShipPostalCode(dto.getShipPostalCode());
        }
        if (needsMapping(dto, dto.getShipCountry(), "shipCountry")) {
            entity.setShipCountry(dto.getShipCountry());
        }
        if (needsMapping(dto, dto.getShipPhoneNumber(), "shipPhoneNumber")) {
            entity.setShipPhoneNumber(dto.getShipPhoneNumber());
        }
        if (needsMapping(dto, dto.getGiftWrapType(), "giftWrapType")) {
            entity.setGiftWrapType(dto.getGiftWrapType());
        }
        if (needsMapping(dto, dto.getGiftMassageText(), "giftMassageText")) {
            entity.setGiftMassageText(dto.getGiftMassageText());
        }
        if (needsMapping(dto, dto.getItemPromotionDiscount(), "itemPromotionDiscount")) {
            entity.setItemPromotionDiscount(dto.getItemPromotionDiscount());
        }
        if (needsMapping(dto, dto.getItemPromotionId(), "itemPromotionId")) {
            entity.setItemPromotionId(dto.getItemPromotionId());
        }
        if (needsMapping(dto, dto.getShipPromotionDiscount(), "shipPromotionDiscount")) {
            entity.setShipPromotionDiscount(dto.getShipPromotionDiscount());
        }
        if (needsMapping(dto, dto.getShipPromotionId(), "shipPromotionId")) {
            entity.setShipPromotionId(dto.getShipPromotionId());
        }
        if (needsMapping(dto, dto.getDeliveryStartDate(), "deliveryStartDate")) {
            entity.setDeliveryStartDate(dto.getDeliveryStartDate());
        }
        if (needsMapping(dto, dto.getDeliveryEndDate(), "deliveryEndDate")) {
            entity.setDeliveryEndDate(dto.getDeliveryEndDate());
        }
        if (needsMapping(dto, dto.getDeliveryTimeZone(), "deliveryTimeZone")) {
            entity.setDeliveryTimeZone(dto.getDeliveryTimeZone());
        }
        if (needsMapping(dto, dto.getDeliveryInstructions(), "deliveryInstructions")) {
            entity.setDeliveryInstructions(dto.getDeliveryInstructions());
        }
        if (needsMapping(dto, dto.getPaymentMethod(), "paymentMethod")) {
            entity.setPaymentMethod(dto.getPaymentMethod());
        }
        if (needsMapping(dto, dto.getCodCollectibleAmount(), "codCollectibleAmount")) {
            entity.setCodCollectibleAmount(dto.getCodCollectibleAmount());
        }
        if (needsMapping(dto, dto.getAlreadyPaid(), "alreadyPaid")) {
            entity.setAlreadyPaid(dto.getAlreadyPaid());
        }
        if (needsMapping(dto, dto.getPaymentMethodFee(), "paymentMethodFee")) {
            entity.setPaymentMethodFee(dto.getPaymentMethodFee());
        }
        if (needsMapping(dto, dto.getScheduledDeliStDate(), "scheduledDeliStDate")) {
            entity.setScheduledDeliStDate(dto.getScheduledDeliStDate());
        }
        if (needsMapping(dto, dto.getScheduledDeliEdDate(), "scheduledDeliEdDate")) {
            entity.setScheduledDeliEdDate(dto.getScheduledDeliEdDate());
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
                    relationEntity.getTAmazonOrderList().add(entity);
                }
            } else {
                TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTAmazonOrderList();
                TEcOrderB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTAmazonOrderList().add(entity);
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
    protected boolean needsMapping(TAmazonOrderDto dto, Object value, String propName) {
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
    public List<TAmazonOrder> mappingToEntityList(List<TAmazonOrderDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TAmazonOrder> entityList = new ArrayList<TAmazonOrder>();
        for (TAmazonOrderDto dto : dtoList) {
            TAmazonOrder entity = mappingToEntity(dto);
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
    public TAmazonOrderDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TAmazonOrderDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TAmazonOrderDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TAmazonOrderDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TAmazonOrderDtoMapper reverseReference() {
        setReverseReference(true);
        return (TAmazonOrderDtoMapper)this;
    }
}
