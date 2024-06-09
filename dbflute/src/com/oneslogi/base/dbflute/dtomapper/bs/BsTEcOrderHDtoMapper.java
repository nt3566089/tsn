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
 * The DTO mapper of T_EC_ORDER_H as TABLE. <br>
 * EC受注ヘッダ
 * <pre>
 * [primary-key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, CLIENT_ID, CENTER_ID, IMPORT_DT, ORDER_NO, PRIORITY_FLG, ORDER_DT, ORDER_TIME, DELIV_DT, DELIV_TZ, COMMENT1, COMMENT2, GIFT_FLG, NOSHI, ORDER_ZIP_CD, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM, ORDER_CUSTOMER_NM_KANA, ORDER_TEL_NO, DELIV_MATCH_FLG, MERGE_ID, MERGE_STATUS, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, INVOICE_DELIV_ADDRESS1, INVOICE_DELIV_ADDRESS2, INVOICE_DELIV_ADDRESS3, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM_KANA, DELIV_TEL_NO, DELIV_METHOD, DELIV_TYPE, DELIV_COMPANY, PAYMENT_METHOD, CARD_TYPE, TOTAL, TAX, CARRIAGE, COD, TOTAL_AMOUNT, COUPON_DISCOUNT, POINT_DISCOUNT, OTHER_DISCOUNT, AMOUNT_BILLED, MERGE_TOTAL, MERGE_CARRIAGE, MERGE_COD, MERGE_TAX, MERGE_AMOUNT_BILLED, MERGE_TOTAL_AMOUNT, MERGE_COUPON_DISCOUNT, MERGE_POINT_DISCOUNT, MERGE_OTHER_DISCOUNT, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, IMPORT_TYPE_ID, SHIPPING_INST_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_IMPORT_TYPE, T_SHIPPING_INST_H, B_CLASS_DTL(ByDelivMatchFlg), T_EC_ORDER_R(AsOne)
 *
 * [referrer-table]
 *     T_EC_ORDER_B, T_EC_ORDER_R
 *
 * [foreign-property]
 *     mCenter, mClient, mImportType, tShippingInstH, bClassDtlByDelivMatchFlg, bClassDtlByErrorFlg, bClassDtlByGiftFlg, bClassDtlByImportFlg, bClassDtlByPriorityFlg, tEcOrderRAsOne
 *
 * [referrer-property]
 *     tEcOrderBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderHDtoMapper implements DtoMapper<TEcOrderH, TEcOrderHDto>, Serializable {

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
    protected boolean _suppressMCenter;
    protected boolean _suppressMClient;
    protected boolean _suppressMImportType;
    protected boolean _suppressTShippingInstH;
    protected boolean _suppressBClassDtlByDelivMatchFlg;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressBClassDtlByGiftFlg;
    protected boolean _suppressBClassDtlByImportFlg;
    protected boolean _suppressBClassDtlByPriorityFlg;
    protected boolean _suppressTEcOrderBList;
    protected boolean _suppressTEcOrderRAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTEcOrderHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TEcOrderHDto mappingToDto(TEcOrderH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TEcOrderHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderHDto dto = new TEcOrderHDto();
        dto.setEcOrderHId(entity.getEcOrderHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setImportDt(entity.getImportDt());
        dto.setOrderNo(entity.getOrderNo());
        dto.setPriorityFlg(entity.getPriorityFlg());
        dto.setOrderDt(entity.getOrderDt());
        dto.setOrderTime(entity.getOrderTime());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setComment1(entity.getComment1());
        dto.setComment2(entity.getComment2());
        dto.setGiftFlg(entity.getGiftFlg());
        dto.setNoshi(entity.getNoshi());
        dto.setOrderZipCd(entity.getOrderZipCd());
        dto.setOrderAddress1(entity.getOrderAddress1());
        dto.setOrderAddress2(entity.getOrderAddress2());
        dto.setOrderAddress3(entity.getOrderAddress3());
        dto.setOrderCustomerNm(entity.getOrderCustomerNm());
        dto.setOrderCustomerNmKana(entity.getOrderCustomerNmKana());
        dto.setOrderTelNo(entity.getOrderTelNo());
        dto.setDelivMatchFlg(entity.getDelivMatchFlg());
        dto.setMergeId(entity.getMergeId());
        dto.setMergeStatus(entity.getMergeStatus());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setInvoiceDelivAddress1(entity.getInvoiceDelivAddress1());
        dto.setInvoiceDelivAddress2(entity.getInvoiceDelivAddress2());
        dto.setInvoiceDelivAddress3(entity.getInvoiceDelivAddress3());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivCustomerNmKana(entity.getDelivCustomerNmKana());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setDelivMethod(entity.getDelivMethod());
        dto.setDelivType(entity.getDelivType());
        dto.setDelivCompany(entity.getDelivCompany());
        dto.setPaymentMethod(entity.getPaymentMethod());
        dto.setCardType(entity.getCardType());
        dto.setTotal(entity.getTotal());
        dto.setTax(entity.getTax());
        dto.setCarriage(entity.getCarriage());
        dto.setCod(entity.getCod());
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setCouponDiscount(entity.getCouponDiscount());
        dto.setPointDiscount(entity.getPointDiscount());
        dto.setOtherDiscount(entity.getOtherDiscount());
        dto.setAmountBilled(entity.getAmountBilled());
        dto.setMergeTotal(entity.getMergeTotal());
        dto.setMergeCarriage(entity.getMergeCarriage());
        dto.setMergeCod(entity.getMergeCod());
        dto.setMergeTax(entity.getMergeTax());
        dto.setMergeAmountBilled(entity.getMergeAmountBilled());
        dto.setMergeTotalAmount(entity.getMergeTotalAmount());
        dto.setMergeCouponDiscount(entity.getMergeCouponDiscount());
        dto.setMergePointDiscount(entity.getMergePointDiscount());
        dto.setMergeOtherDiscount(entity.getMergeOtherDiscount());
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
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setImportFlg(entity.getImportFlg());
        dto.setImportTypeId(entity.getImportTypeId());
        dto.setShippingInstHId(entity.getShippingInstHId());
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
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMImportType && entity.getMImportType() != null) {
            MImportType relationEntity = entity.getMImportType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MImportTypeDto relationDto = (MImportTypeDto)cachedDto;
                dto.setMImportType(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
            } else {
                MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MImportTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMImportType(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMImportType());
                }
            }
        };
        if (!_suppressTShippingInstH && entity.getTShippingInstH() != null) {
            TShippingInstH relationEntity = entity.getTShippingInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingInstHDto relationDto = (TShippingInstHDto)cachedDto;
                dto.setTShippingInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                TShippingInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTEcOrderHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingInstH());
                }
            }
        };
        if (!_suppressBClassDtlByDelivMatchFlg && entity.getBClassDtlByDelivMatchFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelivMatchFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelivMatchFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelivMatchFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelivMatchFlg());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && entity.getBClassDtlByErrorFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByErrorFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByErrorFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressBClassDtlByGiftFlg && entity.getBClassDtlByGiftFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByGiftFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByGiftFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByGiftFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByGiftFlg());
                }
            }
        };
        if (!_suppressBClassDtlByImportFlg && entity.getBClassDtlByImportFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByImportFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByImportFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByImportFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByImportFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPriorityFlg && entity.getBClassDtlByPriorityFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPriorityFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPriorityFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPriorityFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPriorityFlg());
                }
            }
        };
        if (!_suppressTEcOrderBList && !entity.getTEcOrderBList().isEmpty()) {
            TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderH();
            List<TEcOrderBDto> relationDtoList = mapper.mappingToDtoList(entity.getTEcOrderBList());
            dto.setTEcOrderBList(relationDtoList);
            if (reverseReference) {
                for (TEcOrderBDto relationDto : relationDtoList) {
                    relationDto.setTEcOrderH(dto);
                }
            }
        };
        if (!_suppressTEcOrderRAsOne && entity.getTEcOrderRAsOne() != null) {
            TEcOrderR relationEntity = entity.getTEcOrderRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TEcOrderRDto relationDto = (TEcOrderRDto)cachedDto;
                dto.setTEcOrderRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTEcOrderH(dto);
                }
            } else {
                TEcOrderRDtoMapper mapper = new TEcOrderRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderH();
                TEcOrderRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTEcOrderRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTEcOrderH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTEcOrderRAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TEcOrderHDto> mappingToDtoList(List<TEcOrderH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TEcOrderHDto> dtoList = new ArrayList<TEcOrderHDto>();
        for (TEcOrderH entity : entityList) {
            TEcOrderHDto dto = mappingToDto(entity);
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
    public TEcOrderH mappingToEntity(TEcOrderHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TEcOrderH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TEcOrderH entity = new TEcOrderH();
        if (needsMapping(dto, dto.getEcOrderHId(), "ecOrderHId")) {
            entity.setEcOrderHId(dto.getEcOrderHId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getImportDt(), "importDt")) {
            entity.setImportDt(dto.getImportDt());
        }
        if (needsMapping(dto, dto.getOrderNo(), "orderNo")) {
            entity.setOrderNo(dto.getOrderNo());
        }
        if (needsMapping(dto, dto.getPriorityFlg(), "priorityFlg")) {
            entity.setPriorityFlgAsPriorityFlg(CDef.PriorityFlg.codeOf(dto.getPriorityFlg()));
        }
        if (needsMapping(dto, dto.getOrderDt(), "orderDt")) {
            entity.setOrderDt(dto.getOrderDt());
        }
        if (needsMapping(dto, dto.getOrderTime(), "orderTime")) {
            entity.setOrderTime(dto.getOrderTime());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getComment1(), "comment1")) {
            entity.setComment1(dto.getComment1());
        }
        if (needsMapping(dto, dto.getComment2(), "comment2")) {
            entity.setComment2(dto.getComment2());
        }
        if (needsMapping(dto, dto.getGiftFlg(), "giftFlg")) {
            entity.setGiftFlgAsGiftFlg(CDef.GiftFlg.codeOf(dto.getGiftFlg()));
        }
        if (needsMapping(dto, dto.getNoshi(), "noshi")) {
            entity.setNoshi(dto.getNoshi());
        }
        if (needsMapping(dto, dto.getOrderZipCd(), "orderZipCd")) {
            entity.setOrderZipCd(dto.getOrderZipCd());
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
        if (needsMapping(dto, dto.getOrderCustomerNm(), "orderCustomerNm")) {
            entity.setOrderCustomerNm(dto.getOrderCustomerNm());
        }
        if (needsMapping(dto, dto.getOrderCustomerNmKana(), "orderCustomerNmKana")) {
            entity.setOrderCustomerNmKana(dto.getOrderCustomerNmKana());
        }
        if (needsMapping(dto, dto.getOrderTelNo(), "orderTelNo")) {
            entity.setOrderTelNo(dto.getOrderTelNo());
        }
        if (needsMapping(dto, dto.getDelivMatchFlg(), "delivMatchFlg")) {
            entity.setDelivMatchFlgAsDelivMatchFlg(CDef.DelivMatchFlg.codeOf(dto.getDelivMatchFlg()));
        }
        if (needsMapping(dto, dto.getMergeId(), "mergeId")) {
            entity.setMergeId(dto.getMergeId());
        }
        if (needsMapping(dto, dto.getMergeStatus(), "mergeStatus")) {
            entity.setMergeStatus(dto.getMergeStatus());
        }
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
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
        if (needsMapping(dto, dto.getInvoiceDelivAddress1(), "invoiceDelivAddress1")) {
            entity.setInvoiceDelivAddress1(dto.getInvoiceDelivAddress1());
        }
        if (needsMapping(dto, dto.getInvoiceDelivAddress2(), "invoiceDelivAddress2")) {
            entity.setInvoiceDelivAddress2(dto.getInvoiceDelivAddress2());
        }
        if (needsMapping(dto, dto.getInvoiceDelivAddress3(), "invoiceDelivAddress3")) {
            entity.setInvoiceDelivAddress3(dto.getInvoiceDelivAddress3());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerNmKana(), "delivCustomerNmKana")) {
            entity.setDelivCustomerNmKana(dto.getDelivCustomerNmKana());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getDelivMethod(), "delivMethod")) {
            entity.setDelivMethod(dto.getDelivMethod());
        }
        if (needsMapping(dto, dto.getDelivType(), "delivType")) {
            entity.setDelivType(dto.getDelivType());
        }
        if (needsMapping(dto, dto.getDelivCompany(), "delivCompany")) {
            entity.setDelivCompany(dto.getDelivCompany());
        }
        if (needsMapping(dto, dto.getPaymentMethod(), "paymentMethod")) {
            entity.setPaymentMethod(dto.getPaymentMethod());
        }
        if (needsMapping(dto, dto.getCardType(), "cardType")) {
            entity.setCardType(dto.getCardType());
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
        if (needsMapping(dto, dto.getTotalAmount(), "totalAmount")) {
            entity.setTotalAmount(dto.getTotalAmount());
        }
        if (needsMapping(dto, dto.getCouponDiscount(), "couponDiscount")) {
            entity.setCouponDiscount(dto.getCouponDiscount());
        }
        if (needsMapping(dto, dto.getPointDiscount(), "pointDiscount")) {
            entity.setPointDiscount(dto.getPointDiscount());
        }
        if (needsMapping(dto, dto.getOtherDiscount(), "otherDiscount")) {
            entity.setOtherDiscount(dto.getOtherDiscount());
        }
        if (needsMapping(dto, dto.getAmountBilled(), "amountBilled")) {
            entity.setAmountBilled(dto.getAmountBilled());
        }
        if (needsMapping(dto, dto.getMergeTotal(), "mergeTotal")) {
            entity.setMergeTotal(dto.getMergeTotal());
        }
        if (needsMapping(dto, dto.getMergeCarriage(), "mergeCarriage")) {
            entity.setMergeCarriage(dto.getMergeCarriage());
        }
        if (needsMapping(dto, dto.getMergeCod(), "mergeCod")) {
            entity.setMergeCod(dto.getMergeCod());
        }
        if (needsMapping(dto, dto.getMergeTax(), "mergeTax")) {
            entity.setMergeTax(dto.getMergeTax());
        }
        if (needsMapping(dto, dto.getMergeAmountBilled(), "mergeAmountBilled")) {
            entity.setMergeAmountBilled(dto.getMergeAmountBilled());
        }
        if (needsMapping(dto, dto.getMergeTotalAmount(), "mergeTotalAmount")) {
            entity.setMergeTotalAmount(dto.getMergeTotalAmount());
        }
        if (needsMapping(dto, dto.getMergeCouponDiscount(), "mergeCouponDiscount")) {
            entity.setMergeCouponDiscount(dto.getMergeCouponDiscount());
        }
        if (needsMapping(dto, dto.getMergePointDiscount(), "mergePointDiscount")) {
            entity.setMergePointDiscount(dto.getMergePointDiscount());
        }
        if (needsMapping(dto, dto.getMergeOtherDiscount(), "mergeOtherDiscount")) {
            entity.setMergeOtherDiscount(dto.getMergeOtherDiscount());
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
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlgAsImportFlg(CDef.ImportFlg.codeOf(dto.getImportFlg()));
        }
        if (needsMapping(dto, dto.getImportTypeId(), "importTypeId")) {
            entity.setImportTypeId(dto.getImportTypeId());
        }
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
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
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMImportType && dto.getMImportType() != null) {
            MImportTypeDto relationDto = dto.getMImportType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MImportType relationEntity = (MImportType)cachedEntity;
                entity.setMImportType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
            } else {
                MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                MImportType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMImportType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
                if (instanceCache && entity.getMImportType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMImportType());
                }
            }
        };
        if (!_suppressTShippingInstH && dto.getTShippingInstH() != null) {
            TShippingInstHDto relationDto = dto.getTShippingInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingInstH relationEntity = (TShippingInstH)cachedEntity;
                entity.setTShippingInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderHList();
                TShippingInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTEcOrderHList().add(entity);
                }
                if (instanceCache && entity.getTShippingInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingInstH());
                }
            }
        };
        if (!_suppressBClassDtlByDelivMatchFlg && dto.getBClassDtlByDelivMatchFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelivMatchFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelivMatchFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelivMatchFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelivMatchFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelivMatchFlg());
                }
            }
        };
        if (!_suppressBClassDtlByErrorFlg && dto.getBClassDtlByErrorFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByErrorFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByErrorFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByErrorFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByErrorFlg());
                }
            }
        };
        if (!_suppressBClassDtlByGiftFlg && dto.getBClassDtlByGiftFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByGiftFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByGiftFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByGiftFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByGiftFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByGiftFlg());
                }
            }
        };
        if (!_suppressBClassDtlByImportFlg && dto.getBClassDtlByImportFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByImportFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByImportFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByImportFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByImportFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByImportFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPriorityFlg && dto.getBClassDtlByPriorityFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPriorityFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPriorityFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPriorityFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPriorityFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPriorityFlg());
                }
            }
        };
        if (!_suppressTEcOrderBList && !dto.getTEcOrderBList().isEmpty()) {
            TEcOrderBDtoMapper mapper = new TEcOrderBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTEcOrderH();
            List<TEcOrderB> relationEntityList = mapper.mappingToEntityList(dto.getTEcOrderBList());
            entity.setTEcOrderBList(relationEntityList);
            if (reverseReference) {
                for (TEcOrderB relationEntity : relationEntityList) {
                    relationEntity.setTEcOrderH(entity);
                }
            }
        };
        if (!_suppressTEcOrderRAsOne && dto.getTEcOrderRAsOne() != null) {
            TEcOrderRDto relationDto = dto.getTEcOrderRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TEcOrderR relationEntity = (TEcOrderR)cachedEntity;
                entity.setTEcOrderRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTEcOrderH(entity);
                }
            } else {
                TEcOrderRDtoMapper mapper = new TEcOrderRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTEcOrderH();
                TEcOrderR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTEcOrderRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTEcOrderH(entity);
                }
                if (instanceCache && entity.getTEcOrderRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTEcOrderRAsOne());
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
    protected boolean needsMapping(TEcOrderHDto dto, Object value, String propName) {
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
    public List<TEcOrderH> mappingToEntityList(List<TEcOrderHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TEcOrderH> entityList = new ArrayList<TEcOrderH>();
        for (TEcOrderHDto dto : dtoList) {
            TEcOrderH entity = mappingToEntity(dto);
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
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMImportType() {
        _suppressMImportType = true;
    }
    public void suppressTShippingInstH() {
        _suppressTShippingInstH = true;
    }
    public void suppressBClassDtlByDelivMatchFlg() {
        _suppressBClassDtlByDelivMatchFlg = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressBClassDtlByGiftFlg() {
        _suppressBClassDtlByGiftFlg = true;
    }
    public void suppressBClassDtlByImportFlg() {
        _suppressBClassDtlByImportFlg = true;
    }
    public void suppressBClassDtlByPriorityFlg() {
        _suppressBClassDtlByPriorityFlg = true;
    }
    public void suppressTEcOrderBList() {
        _suppressTEcOrderBList = true;
    }
    public void suppressTEcOrderRAsOne() {
        _suppressTEcOrderRAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMClient();
        suppressMImportType();
        suppressTShippingInstH();
        suppressBClassDtlByDelivMatchFlg();
        suppressBClassDtlByErrorFlg();
        suppressBClassDtlByGiftFlg();
        suppressBClassDtlByImportFlg();
        suppressBClassDtlByPriorityFlg();
        suppressTEcOrderBList();
        suppressTEcOrderRAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMClient = false;
        _suppressMImportType = false;
        _suppressTShippingInstH = false;
        _suppressBClassDtlByDelivMatchFlg = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressBClassDtlByGiftFlg = false;
        _suppressBClassDtlByImportFlg = false;
        _suppressBClassDtlByPriorityFlg = false;
        _suppressTEcOrderBList = false;
        _suppressTEcOrderRAsOne = false;
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
    public TEcOrderHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TEcOrderHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TEcOrderHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TEcOrderHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TEcOrderHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TEcOrderHDtoMapper)this;
    }
}
