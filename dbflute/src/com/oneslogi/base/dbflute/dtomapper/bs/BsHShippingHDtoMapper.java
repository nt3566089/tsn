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
 * The DTO mapper of H_SHIPPING_H as TABLE. <br>
 * 出荷ヘッダ履歴
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SHIPPING_DT, WORK_DT, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, PICKING_WORK_MESSAGE, TOTAL_PRICE, TOTAL_TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PROCESS_TYPE, B_CLASS_DTL(ByDelivTz)
 *
 * [referrer-table]
 *     H_PACKING_H, H_SHIPPING_B
 *
 * [foreign-property]
 *     mProcessType, bClassDtlByDelivTz, bClassDtlByEmergencyFlg
 *
 * [referrer-property]
 *     hPackingHList, hShippingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHShippingHDtoMapper implements DtoMapper<HShippingH, HShippingHDto>, Serializable {

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
    protected boolean _suppressMProcessType;
    protected boolean _suppressBClassDtlByDelivTz;
    protected boolean _suppressBClassDtlByEmergencyFlg;
    protected boolean _suppressHPackingHList;
    protected boolean _suppressHShippingBList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHShippingHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsHShippingHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public HShippingHDto mappingToDto(HShippingH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (HShippingHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HShippingHDto dto = new HShippingHDto();
        dto.setShippingInstHId(entity.getShippingInstHId());
        dto.setHistDt(entity.getHistDt());
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setDelivPlanDt(entity.getDelivPlanDt());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setShippingDt(entity.getShippingDt());
        dto.setWorkDt(entity.getWorkDt());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setSupplyCustomerId(entity.getSupplyCustomerId());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDelivCustomerId(entity.getDelivCustomerId());
        dto.setDelivCustomerCd(entity.getDelivCustomerCd());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setDelivAddressSupply(entity.getDelivAddressSupply());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierId(entity.getCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setPickingWorkMessage(entity.getPickingWorkMessage());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setTotalTax(entity.getTotalTax());
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
        if (!_suppressMProcessType && entity.getMProcessType() != null) {
            MProcessType relationEntity = entity.getMProcessType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProcessTypeDto relationDto = (MProcessTypeDto)cachedDto;
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getHShippingHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHShippingHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getHShippingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressBClassDtlByDelivTz && entity.getBClassDtlByDelivTz() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelivTz();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelivTz(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelivTz(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelivTz());
                }
            }
        };
        if (!_suppressBClassDtlByEmergencyFlg && entity.getBClassDtlByEmergencyFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByEmergencyFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByEmergencyFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByEmergencyFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByEmergencyFlg());
                }
            }
        };
        if (!_suppressHPackingHList && !entity.getHPackingHList().isEmpty()) {
            HPackingHDtoMapper mapper = new HPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressHShippingH();
            List<HPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getHPackingHList());
            dto.setHPackingHList(relationDtoList);
            if (reverseReference) {
                for (HPackingHDto relationDto : relationDtoList) {
                    relationDto.setHShippingH(dto);
                }
            }
        };
        if (!_suppressHShippingBList && !entity.getHShippingBList().isEmpty()) {
            HShippingBDtoMapper mapper = new HShippingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressHShippingH();
            List<HShippingBDto> relationDtoList = mapper.mappingToDtoList(entity.getHShippingBList());
            dto.setHShippingBList(relationDtoList);
            if (reverseReference) {
                for (HShippingBDto relationDto : relationDtoList) {
                    relationDto.setHShippingH(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<HShippingHDto> mappingToDtoList(List<HShippingH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<HShippingHDto> dtoList = new ArrayList<HShippingHDto>();
        for (HShippingH entity : entityList) {
            HShippingHDto dto = mappingToDto(entity);
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
    public HShippingH mappingToEntity(HShippingHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (HShippingH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HShippingH entity = new HShippingH();
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
        }
        if (needsMapping(dto, dto.getHistDt(), "histDt")) {
            entity.setHistDt(dto.getHistDt());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getDelivPlanDt(), "delivPlanDt")) {
            entity.setDelivPlanDt(dto.getDelivPlanDt());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTzAsDelivTz(CDef.DelivTz.codeOf(dto.getDelivTz()));
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getSupplyCustomerId(), "supplyCustomerId")) {
            entity.setSupplyCustomerId(dto.getSupplyCustomerId());
        }
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerId(), "delivCustomerId")) {
            entity.setDelivCustomerId(dto.getDelivCustomerId());
        }
        if (needsMapping(dto, dto.getDelivCustomerCd(), "delivCustomerCd")) {
            entity.setDelivCustomerCd(dto.getDelivCustomerCd());
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
        if (needsMapping(dto, dto.getDelivAddressSupply(), "delivAddressSupply")) {
            entity.setDelivAddressSupply(dto.getDelivAddressSupply());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getCarrierId(), "carrierId")) {
            entity.setCarrierId(dto.getCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.codeOf(dto.getEmergencyFlg()));
        }
        if (needsMapping(dto, dto.getPickingWorkMessage(), "pickingWorkMessage")) {
            entity.setPickingWorkMessage(dto.getPickingWorkMessage());
        }
        if (needsMapping(dto, dto.getTotalPrice(), "totalPrice")) {
            entity.setTotalPrice(dto.getTotalPrice());
        }
        if (needsMapping(dto, dto.getTotalTax(), "totalTax")) {
            entity.setTotalTax(dto.getTotalTax());
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
        if (!_suppressMProcessType && dto.getMProcessType() != null) {
            MProcessTypeDto relationDto = dto.getMProcessType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProcessType relationEntity = (MProcessType)cachedEntity;
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getHShippingHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHShippingHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getHShippingHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressBClassDtlByDelivTz && dto.getBClassDtlByDelivTz() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelivTz();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelivTz(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelivTz(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelivTz().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelivTz());
                }
            }
        };
        if (!_suppressBClassDtlByEmergencyFlg && dto.getBClassDtlByEmergencyFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByEmergencyFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByEmergencyFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByEmergencyFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByEmergencyFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByEmergencyFlg());
                }
            }
        };
        if (!_suppressHPackingHList && !dto.getHPackingHList().isEmpty()) {
            HPackingHDtoMapper mapper = new HPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressHShippingH();
            List<HPackingH> relationEntityList = mapper.mappingToEntityList(dto.getHPackingHList());
            entity.setHPackingHList(relationEntityList);
            if (reverseReference) {
                for (HPackingH relationEntity : relationEntityList) {
                    relationEntity.setHShippingH(entity);
                }
            }
        };
        if (!_suppressHShippingBList && !dto.getHShippingBList().isEmpty()) {
            HShippingBDtoMapper mapper = new HShippingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressHShippingH();
            List<HShippingB> relationEntityList = mapper.mappingToEntityList(dto.getHShippingBList());
            entity.setHShippingBList(relationEntityList);
            if (reverseReference) {
                for (HShippingB relationEntity : relationEntityList) {
                    relationEntity.setHShippingH(entity);
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
    protected boolean needsMapping(HShippingHDto dto, Object value, String propName) {
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
    public List<HShippingH> mappingToEntityList(List<HShippingHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<HShippingH> entityList = new ArrayList<HShippingH>();
        for (HShippingHDto dto : dtoList) {
            HShippingH entity = mappingToEntity(dto);
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
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressBClassDtlByDelivTz() {
        _suppressBClassDtlByDelivTz = true;
    }
    public void suppressBClassDtlByEmergencyFlg() {
        _suppressBClassDtlByEmergencyFlg = true;
    }
    public void suppressHPackingHList() {
        _suppressHPackingHList = true;
    }
    public void suppressHShippingBList() {
        _suppressHShippingBList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProcessType();
        suppressBClassDtlByDelivTz();
        suppressBClassDtlByEmergencyFlg();
        suppressHPackingHList();
        suppressHShippingBList();
    }
    protected void doSuppressClear() { // internal
        _suppressMProcessType = false;
        _suppressBClassDtlByDelivTz = false;
        _suppressBClassDtlByEmergencyFlg = false;
        _suppressHPackingHList = false;
        _suppressHShippingBList = false;
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
    public HShippingHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (HShippingHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public HShippingHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (HShippingHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public HShippingHDtoMapper reverseReference() {
        setReverseReference(true);
        return (HShippingHDtoMapper)this;
    }
}
