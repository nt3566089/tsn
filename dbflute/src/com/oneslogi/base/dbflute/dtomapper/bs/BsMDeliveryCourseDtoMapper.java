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
 * The DTO mapper of M_DELIVERY_COURSE as TABLE. <br>
 * 配送コースマスタ
 * <pre>
 * [primary-key]
 *     DELIVERY_COURSE_ID
 *
 * [column]
 *     DELIVERY_COURSE_ID, CENTER_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, CARRIER_SLIP_YMT_ID, CARRIER_SLIP_SGW_ID, CARRIER_SLIP_YUPK_ID, TRACKING_NUMBERING_KEY, TRACKING_NUMBERING_AFTER_KEY, TRACKING_NUMBERING_UNIT, TAG_TYPE, TAG_TYPE_AFTER, TAG_DATA_TYPE, PAYMENT_TERM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIVERY_COURSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CARRIER, M_CARRIER_SLIP_SGW, M_CARRIER_SLIP_YMT, M_CARRIER_SLIP_YUPK, M_CENTER, B_CLASS_DTL(ByDelFlg), M_CENTER_CLASS_DTL(ByTagDataType)
 *
 * [referrer-table]
 *     M_CENTER_CUSTOMER, M_PARAM, T_ALLOC_INST_H, T_SHIPPING_INST_H, W_HT_LOADING
 *
 * [foreign-property]
 *     mCarrier, mCarrierSlipSgw, mCarrierSlipYmt, mCarrierSlipYupk, mCenter, bClassDtlByDelFlg, mCenterClassDtlByTagDataType, mCenterClassDtlByTagType, mCenterClassDtlByTagTypeAfter, bClassDtlByTrackingNumberingUnit, bClassDtlByPaymentTerm
 *
 * [referrer-property]
 *     mCenterCustomerList, mParamList, tAllocInstHList, tShippingInstHList, wHtLoadingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMDeliveryCourseDtoMapper implements DtoMapper<MDeliveryCourse, MDeliveryCourseDto>, Serializable {

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
    protected boolean _suppressMCarrier;
    protected boolean _suppressMCarrierSlipSgw;
    protected boolean _suppressMCarrierSlipYmt;
    protected boolean _suppressMCarrierSlipYupk;
    protected boolean _suppressMCenter;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMCenterClassDtlByTagDataType;
    protected boolean _suppressMCenterClassDtlByTagType;
    protected boolean _suppressMCenterClassDtlByTagTypeAfter;
    protected boolean _suppressBClassDtlByTrackingNumberingUnit;
    protected boolean _suppressBClassDtlByPaymentTerm;
    protected boolean _suppressMCenterCustomerList;
    protected boolean _suppressMParamList;
    protected boolean _suppressTAllocInstHList;
    protected boolean _suppressTShippingInstHList;
    protected boolean _suppressWHtLoadingList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMDeliveryCourseDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMDeliveryCourseDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MDeliveryCourseDto mappingToDto(MDeliveryCourse entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MDeliveryCourseDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MDeliveryCourseDto dto = new MDeliveryCourseDto();
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setCenterId(entity.getCenterId());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierId(entity.getCarrierId());
        dto.setPickingTime(entity.getPickingTime());
        dto.setStowageTime(entity.getStowageTime());
        dto.setShippingTime(entity.getShippingTime());
        dto.setCarrierSlipYmtId(entity.getCarrierSlipYmtId());
        dto.setCarrierSlipSgwId(entity.getCarrierSlipSgwId());
        dto.setCarrierSlipYupkId(entity.getCarrierSlipYupkId());
        dto.setTrackingNumberingKey(entity.getTrackingNumberingKey());
        dto.setTrackingNumberingAfterKey(entity.getTrackingNumberingAfterKey());
        dto.setTrackingNumberingUnit(entity.getTrackingNumberingUnit());
        dto.setTagType(entity.getTagType());
        dto.setTagTypeAfter(entity.getTagTypeAfter());
        dto.setTagDataType(entity.getTagDataType());
        dto.setPaymentTerm(entity.getPaymentTerm());
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
        if (!_suppressMCarrier && entity.getMCarrier() != null) {
            MCarrier relationEntity = entity.getMCarrier();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierDto relationDto = (MCarrierDto)cachedDto;
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrier());
                }
            }
        };
        if (!_suppressMCarrierSlipSgw && entity.getMCarrierSlipSgw() != null) {
            MCarrierSlipSgw relationEntity = entity.getMCarrierSlipSgw();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierSlipSgwDto relationDto = (MCarrierSlipSgwDto)cachedDto;
                dto.setMCarrierSlipSgw(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
            } else {
                MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipSgwDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierSlipSgw(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierSlipSgw());
                }
            }
        };
        if (!_suppressMCarrierSlipYmt && entity.getMCarrierSlipYmt() != null) {
            MCarrierSlipYmt relationEntity = entity.getMCarrierSlipYmt();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierSlipYmtDto relationDto = (MCarrierSlipYmtDto)cachedDto;
                dto.setMCarrierSlipYmt(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
            } else {
                MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipYmtDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierSlipYmt(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierSlipYmt());
                }
            }
        };
        if (!_suppressMCarrierSlipYupk && entity.getMCarrierSlipYupk() != null) {
            MCarrierSlipYupk relationEntity = entity.getMCarrierSlipYupk();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCarrierSlipYupkDto relationDto = (MCarrierSlipYupkDto)cachedDto;
                dto.setMCarrierSlipYupk(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
            } else {
                MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipYupkDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCarrierSlipYupk(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCarrierSlipYupk());
                }
            }
        };
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMDeliveryCourseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagDataType && entity.getMCenterClassDtlByTagDataType() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByTagDataType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByTagDataType(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByTagDataType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByTagDataType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagType && entity.getMCenterClassDtlByTagType() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByTagType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByTagType(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByTagType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByTagType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagTypeAfter && entity.getMCenterClassDtlByTagTypeAfter() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByTagTypeAfter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByTagTypeAfter(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByTagTypeAfter(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByTagTypeAfter());
                }
            }
        };
        if (!_suppressBClassDtlByTrackingNumberingUnit && entity.getBClassDtlByTrackingNumberingUnit() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTrackingNumberingUnit();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTrackingNumberingUnit(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTrackingNumberingUnit(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTrackingNumberingUnit());
                }
            }
        };
        if (!_suppressBClassDtlByPaymentTerm && entity.getBClassDtlByPaymentTerm() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPaymentTerm();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPaymentTerm(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPaymentTerm(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPaymentTerm());
                }
            }
        };
        if (!_suppressMCenterCustomerList && !entity.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<MCenterCustomerDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterCustomerList());
            dto.setMCenterCustomerList(relationDtoList);
            if (reverseReference) {
                for (MCenterCustomerDto relationDto : relationDtoList) {
                    relationDto.setMDeliveryCourse(dto);
                }
            }
        };
        if (!_suppressMParamList && !entity.getMParamList().isEmpty()) {
            MParamDtoMapper mapper = new MParamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<MParamDto> relationDtoList = mapper.mappingToDtoList(entity.getMParamList());
            dto.setMParamList(relationDtoList);
            if (reverseReference) {
                for (MParamDto relationDto : relationDtoList) {
                    relationDto.setMDeliveryCourse(dto);
                }
            }
        };
        if (!_suppressTAllocInstHList && !entity.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHList());
            dto.setTAllocInstHList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMDeliveryCourse(dto);
                }
            }
        };
        if (!_suppressTShippingInstHList && !entity.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHList());
            dto.setTShippingInstHList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMDeliveryCourse(dto);
                }
            }
        };
        if (!_suppressWHtLoadingList && !entity.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<WHtLoadingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtLoadingList());
            dto.setWHtLoadingList(relationDtoList);
            if (reverseReference) {
                for (WHtLoadingDto relationDto : relationDtoList) {
                    relationDto.setMDeliveryCourse(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MDeliveryCourseDto> mappingToDtoList(List<MDeliveryCourse> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MDeliveryCourseDto> dtoList = new ArrayList<MDeliveryCourseDto>();
        for (MDeliveryCourse entity : entityList) {
            MDeliveryCourseDto dto = mappingToDto(entity);
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
    public MDeliveryCourse mappingToEntity(MDeliveryCourseDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MDeliveryCourse)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MDeliveryCourse entity = new MDeliveryCourse();
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
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
        if (needsMapping(dto, dto.getPickingTime(), "pickingTime")) {
            entity.setPickingTime(dto.getPickingTime());
        }
        if (needsMapping(dto, dto.getStowageTime(), "stowageTime")) {
            entity.setStowageTime(dto.getStowageTime());
        }
        if (needsMapping(dto, dto.getShippingTime(), "shippingTime")) {
            entity.setShippingTime(dto.getShippingTime());
        }
        if (needsMapping(dto, dto.getCarrierSlipYmtId(), "carrierSlipYmtId")) {
            entity.setCarrierSlipYmtId(dto.getCarrierSlipYmtId());
        }
        if (needsMapping(dto, dto.getCarrierSlipSgwId(), "carrierSlipSgwId")) {
            entity.setCarrierSlipSgwId(dto.getCarrierSlipSgwId());
        }
        if (needsMapping(dto, dto.getCarrierSlipYupkId(), "carrierSlipYupkId")) {
            entity.setCarrierSlipYupkId(dto.getCarrierSlipYupkId());
        }
        if (needsMapping(dto, dto.getTrackingNumberingKey(), "trackingNumberingKey")) {
            entity.setTrackingNumberingKey(dto.getTrackingNumberingKey());
        }
        if (needsMapping(dto, dto.getTrackingNumberingAfterKey(), "trackingNumberingAfterKey")) {
            entity.setTrackingNumberingAfterKey(dto.getTrackingNumberingAfterKey());
        }
        if (needsMapping(dto, dto.getTrackingNumberingUnit(), "trackingNumberingUnit")) {
            entity.setTrackingNumberingUnitAsTrackingNumberingUnit(CDef.TrackingNumberingUnit.codeOf(dto.getTrackingNumberingUnit()));
        }
        if (needsMapping(dto, dto.getTagType(), "tagType")) {
            entity.setTagTypeAsCenterTagType(CDef.CenterTagType.codeOf(dto.getTagType()));
        }
        if (needsMapping(dto, dto.getTagTypeAfter(), "tagTypeAfter")) {
            entity.setTagTypeAfterAsCenterTagTypeAfter(CDef.CenterTagTypeAfter.codeOf(dto.getTagTypeAfter()));
        }
        if (needsMapping(dto, dto.getTagDataType(), "tagDataType")) {
            entity.setTagDataTypeAsCenterTagDataType(CDef.CenterTagDataType.codeOf(dto.getTagDataType()));
        }
        if (needsMapping(dto, dto.getPaymentTerm(), "paymentTerm")) {
            entity.setPaymentTermAsPaymentTerm(CDef.PaymentTerm.codeOf(dto.getPaymentTerm()));
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
        if (!_suppressMCarrier && dto.getMCarrier() != null) {
            MCarrierDto relationDto = dto.getMCarrier();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrier relationEntity = (MCarrier)cachedEntity;
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
            } else {
                MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
                if (instanceCache && entity.getMCarrier().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrier());
                }
            }
        };
        if (!_suppressMCarrierSlipSgw && dto.getMCarrierSlipSgw() != null) {
            MCarrierSlipSgwDto relationDto = dto.getMCarrierSlipSgw();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrierSlipSgw relationEntity = (MCarrierSlipSgw)cachedEntity;
                entity.setMCarrierSlipSgw(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
            } else {
                MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipSgw relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierSlipSgw(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
                if (instanceCache && entity.getMCarrierSlipSgw().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierSlipSgw());
                }
            }
        };
        if (!_suppressMCarrierSlipYmt && dto.getMCarrierSlipYmt() != null) {
            MCarrierSlipYmtDto relationDto = dto.getMCarrierSlipYmt();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrierSlipYmt relationEntity = (MCarrierSlipYmt)cachedEntity;
                entity.setMCarrierSlipYmt(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
            } else {
                MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipYmt relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierSlipYmt(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
                if (instanceCache && entity.getMCarrierSlipYmt().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierSlipYmt());
                }
            }
        };
        if (!_suppressMCarrierSlipYupk && dto.getMCarrierSlipYupk() != null) {
            MCarrierSlipYupkDto relationDto = dto.getMCarrierSlipYupk();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCarrierSlipYupk relationEntity = (MCarrierSlipYupk)cachedEntity;
                entity.setMCarrierSlipYupk(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
            } else {
                MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCarrierSlipYupk relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCarrierSlipYupk(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
                if (instanceCache && entity.getMCarrierSlipYupk().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCarrierSlipYupk());
                }
            }
        };
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMDeliveryCourseList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMDeliveryCourseList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagDataType && dto.getMCenterClassDtlByTagDataType() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByTagDataType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByTagDataType(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByTagDataType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByTagDataType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByTagDataType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagType && dto.getMCenterClassDtlByTagType() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByTagType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByTagType(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByTagType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByTagType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByTagType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTagTypeAfter && dto.getMCenterClassDtlByTagTypeAfter() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByTagTypeAfter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByTagTypeAfter(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByTagTypeAfter(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByTagTypeAfter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByTagTypeAfter());
                }
            }
        };
        if (!_suppressBClassDtlByTrackingNumberingUnit && dto.getBClassDtlByTrackingNumberingUnit() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTrackingNumberingUnit();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTrackingNumberingUnit(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTrackingNumberingUnit(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTrackingNumberingUnit().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTrackingNumberingUnit());
                }
            }
        };
        if (!_suppressBClassDtlByPaymentTerm && dto.getBClassDtlByPaymentTerm() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPaymentTerm();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPaymentTerm(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPaymentTerm(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPaymentTerm().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPaymentTerm());
                }
            }
        };
        if (!_suppressMCenterCustomerList && !dto.getMCenterCustomerList().isEmpty()) {
            MCenterCustomerDtoMapper mapper = new MCenterCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<MCenterCustomer> relationEntityList = mapper.mappingToEntityList(dto.getMCenterCustomerList());
            entity.setMCenterCustomerList(relationEntityList);
            if (reverseReference) {
                for (MCenterCustomer relationEntity : relationEntityList) {
                    relationEntity.setMDeliveryCourse(entity);
                }
            }
        };
        if (!_suppressMParamList && !dto.getMParamList().isEmpty()) {
            MParamDtoMapper mapper = new MParamDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<MParam> relationEntityList = mapper.mappingToEntityList(dto.getMParamList());
            entity.setMParamList(relationEntityList);
            if (reverseReference) {
                for (MParam relationEntity : relationEntityList) {
                    relationEntity.setMDeliveryCourse(entity);
                }
            }
        };
        if (!_suppressTAllocInstHList && !dto.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHList());
            entity.setTAllocInstHList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMDeliveryCourse(entity);
                }
            }
        };
        if (!_suppressTShippingInstHList && !dto.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHList());
            entity.setTShippingInstHList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMDeliveryCourse(entity);
                }
            }
        };
        if (!_suppressWHtLoadingList && !dto.getWHtLoadingList().isEmpty()) {
            WHtLoadingDtoMapper mapper = new WHtLoadingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMDeliveryCourse();
            List<WHtLoading> relationEntityList = mapper.mappingToEntityList(dto.getWHtLoadingList());
            entity.setWHtLoadingList(relationEntityList);
            if (reverseReference) {
                for (WHtLoading relationEntity : relationEntityList) {
                    relationEntity.setMDeliveryCourse(entity);
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
    protected boolean needsMapping(MDeliveryCourseDto dto, Object value, String propName) {
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
    public List<MDeliveryCourse> mappingToEntityList(List<MDeliveryCourseDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MDeliveryCourse> entityList = new ArrayList<MDeliveryCourse>();
        for (MDeliveryCourseDto dto : dtoList) {
            MDeliveryCourse entity = mappingToEntity(dto);
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
    public void suppressMCarrier() {
        _suppressMCarrier = true;
    }
    public void suppressMCarrierSlipSgw() {
        _suppressMCarrierSlipSgw = true;
    }
    public void suppressMCarrierSlipYmt() {
        _suppressMCarrierSlipYmt = true;
    }
    public void suppressMCarrierSlipYupk() {
        _suppressMCarrierSlipYupk = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMCenterClassDtlByTagDataType() {
        _suppressMCenterClassDtlByTagDataType = true;
    }
    public void suppressMCenterClassDtlByTagType() {
        _suppressMCenterClassDtlByTagType = true;
    }
    public void suppressMCenterClassDtlByTagTypeAfter() {
        _suppressMCenterClassDtlByTagTypeAfter = true;
    }
    public void suppressBClassDtlByTrackingNumberingUnit() {
        _suppressBClassDtlByTrackingNumberingUnit = true;
    }
    public void suppressBClassDtlByPaymentTerm() {
        _suppressBClassDtlByPaymentTerm = true;
    }
    public void suppressMCenterCustomerList() {
        _suppressMCenterCustomerList = true;
    }
    public void suppressMParamList() {
        _suppressMParamList = true;
    }
    public void suppressTAllocInstHList() {
        _suppressTAllocInstHList = true;
    }
    public void suppressTShippingInstHList() {
        _suppressTShippingInstHList = true;
    }
    public void suppressWHtLoadingList() {
        _suppressWHtLoadingList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCarrier();
        suppressMCarrierSlipSgw();
        suppressMCarrierSlipYmt();
        suppressMCarrierSlipYupk();
        suppressMCenter();
        suppressBClassDtlByDelFlg();
        suppressMCenterClassDtlByTagDataType();
        suppressMCenterClassDtlByTagType();
        suppressMCenterClassDtlByTagTypeAfter();
        suppressBClassDtlByTrackingNumberingUnit();
        suppressBClassDtlByPaymentTerm();
        suppressMCenterCustomerList();
        suppressMParamList();
        suppressTAllocInstHList();
        suppressTShippingInstHList();
        suppressWHtLoadingList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCarrier = false;
        _suppressMCarrierSlipSgw = false;
        _suppressMCarrierSlipYmt = false;
        _suppressMCarrierSlipYupk = false;
        _suppressMCenter = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMCenterClassDtlByTagDataType = false;
        _suppressMCenterClassDtlByTagType = false;
        _suppressMCenterClassDtlByTagTypeAfter = false;
        _suppressBClassDtlByTrackingNumberingUnit = false;
        _suppressBClassDtlByPaymentTerm = false;
        _suppressMCenterCustomerList = false;
        _suppressMParamList = false;
        _suppressTAllocInstHList = false;
        _suppressTShippingInstHList = false;
        _suppressWHtLoadingList = false;
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
    public MDeliveryCourseDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MDeliveryCourseDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MDeliveryCourseDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MDeliveryCourseDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MDeliveryCourseDtoMapper reverseReference() {
        setReverseReference(true);
        return (MDeliveryCourseDtoMapper)this;
    }
}
