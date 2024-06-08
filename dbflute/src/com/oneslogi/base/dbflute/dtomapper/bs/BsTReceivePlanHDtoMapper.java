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
 * The DTO mapper of T_RECEIVE_PLAN_H as TABLE. <br>
 * 入荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_RECEIVE_PLAN_H, M_CUSTOMER, M_CLIENT, M_STOCK_TYPE, M_CENTER, M_PROCESS_TYPE, T_PICKING_H, B_CLASS_DTL(ByCenterTransitFlg), T_RECEIVE_PLAN_R(AsOne), T_TRRCV(AsOne)
 *
 * [referrer-table]
 *     T_RECEIVE_PLAN_B, T_RECEIVE_PLAN_H, T_STORE_RECORD_H, T_RECEIVE_PLAN_R, T_TRRCV
 *
 * [foreign-property]
 *     tReceivePlanHSelf, mCustomerByPlanDepositId, mClient, mStockType, mCenter, mProcessType, mCustomerByPlanSupplierId, tPickingH, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne, tTrrcvAsOne
 *
 * [referrer-property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanHDtoMapper implements DtoMapper<TReceivePlanH, TReceivePlanHDto>, Serializable {

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
    protected boolean _suppressTReceivePlanHSelf;
    protected boolean _suppressMCustomerByPlanDepositId;
    protected boolean _suppressMClient;
    protected boolean _suppressMStockType;
    protected boolean _suppressMCenter;
    protected boolean _suppressMProcessType;
    protected boolean _suppressMCustomerByPlanSupplierId;
    protected boolean _suppressTPickingH;
    protected boolean _suppressBClassDtlByCenterTransitFlg;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressBClassDtlByInputType;
    protected boolean _suppressBClassDtlByReceiveDeliveryStatus;
    protected boolean _suppressBClassDtlByReceiveStatus;
    protected boolean _suppressTReceivePlanBList;
    protected boolean _suppressTReceivePlanHSelfList;
    protected boolean _suppressTReceivePlanRAsOne;
    protected boolean _suppressTStoreRecordHList;
    protected boolean _suppressTTrrcvAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTReceivePlanHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TReceivePlanHDto mappingToDto(TReceivePlanH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TReceivePlanHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanHDto dto = new TReceivePlanHDto();
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setReceivePlanDt(entity.getReceivePlanDt());
        dto.setPlanClientReceiveNo(entity.getPlanClientReceiveNo());
        dto.setReceiveSlipNo(entity.getReceiveSlipNo());
        dto.setPlanSupplierId(entity.getPlanSupplierId());
        dto.setPlanSupplierCd(entity.getPlanSupplierCd());
        dto.setPlanDepositId(entity.getPlanDepositId());
        dto.setPlanDepositCd(entity.getPlanDepositCd());
        dto.setReceiveStatus(entity.getReceiveStatus());
        dto.setInputType(entity.getInputType());
        dto.setReceiveDeliveryStatus(entity.getReceiveDeliveryStatus());
        dto.setOldReceivePlanHId(entity.getOldReceivePlanHId());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setCenterTransitFlg(entity.getCenterTransitFlg());
        dto.setPickingHId(entity.getPickingHId());
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
        if (!_suppressTReceivePlanHSelf && entity.getTReceivePlanHSelf() != null) {
            TReceivePlanH relationEntity = entity.getTReceivePlanHSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanHDto relationDto = (TReceivePlanHDto)cachedDto;
                dto.setTReceivePlanHSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHSelfList().add(dto);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHSelfList();
                TReceivePlanHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanHSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanHSelf());
                }
            }
        };
        if (!_suppressMCustomerByPlanDepositId && entity.getMCustomerByPlanDepositId() != null) {
            MCustomer relationEntity = entity.getMCustomerByPlanDepositId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByPlanDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHByPlanDepositIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHByPlanDepositIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByPlanDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHByPlanDepositIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByPlanDepositId());
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
                    relationDto.getTReceivePlanHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMStockType && entity.getMStockType() != null) {
            MStockType relationEntity = entity.getMStockType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MStockTypeDto relationDto = (MStockTypeDto)cachedDto;
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getTReceivePlanHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMProcessType && entity.getMProcessType() != null) {
            MProcessType relationEntity = entity.getMProcessType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProcessTypeDto relationDto = (MProcessTypeDto)cachedDto;
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressMCustomerByPlanSupplierId && entity.getMCustomerByPlanSupplierId() != null) {
            MCustomer relationEntity = entity.getMCustomerByPlanSupplierId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByPlanSupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHByPlanSupplierIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHByPlanSupplierIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByPlanSupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHByPlanSupplierIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByPlanSupplierId());
                }
            }
        };
        if (!_suppressTPickingH && entity.getTPickingH() != null) {
            TPickingH relationEntity = entity.getTPickingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPickingHDto relationDto = (TPickingHDto)cachedDto;
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                TPickingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPickingH());
                }
            }
        };
        if (!_suppressBClassDtlByCenterTransitFlg && entity.getBClassDtlByCenterTransitFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCenterTransitFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCenterTransitFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCenterTransitFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCenterTransitFlg());
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
        if (!_suppressBClassDtlByInputType && entity.getBClassDtlByInputType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInputType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveDeliveryStatus && entity.getBClassDtlByReceiveDeliveryStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByReceiveDeliveryStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByReceiveDeliveryStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByReceiveDeliveryStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByReceiveDeliveryStatus());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveStatus && entity.getBClassDtlByReceiveStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByReceiveStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByReceiveStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByReceiveStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByReceiveStatus());
                }
            }
        };
        if (!_suppressTReceivePlanBList && !entity.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanH();
            List<TReceivePlanBDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanBList());
            dto.setTReceivePlanBList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanBDto relationDto : relationDtoList) {
                    relationDto.setTReceivePlanH(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHSelfList && !entity.getTReceivePlanHSelfList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanHSelf();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHSelfList());
            dto.setTReceivePlanHSelfList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setTReceivePlanHSelf(dto);
                }
            }
        };
        if (!_suppressTReceivePlanRAsOne && entity.getTReceivePlanRAsOne() != null) {
            TReceivePlanR relationEntity = entity.getTReceivePlanRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanRDto relationDto = (TReceivePlanRDto)cachedDto;
                dto.setTReceivePlanRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanH(dto);
                }
            } else {
                TReceivePlanRDtoMapper mapper = new TReceivePlanRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanH();
                TReceivePlanRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanRAsOne());
                }
            }
        };
        if (!_suppressTStoreRecordHList && !entity.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanH();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHList());
            dto.setTStoreRecordHList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setTReceivePlanH(dto);
                }
            }
        };
        if (!_suppressTTrrcvAsOne && entity.getTTrrcvAsOne() != null) {
            TTrrcv relationEntity = entity.getTTrrcvAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrrcvDto relationDto = (TTrrcvDto)cachedDto;
                dto.setTTrrcvAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanH(dto);
                }
            } else {
                TTrrcvDtoMapper mapper = new TTrrcvDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanH();
                TTrrcvDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrrcvAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrrcvAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TReceivePlanHDto> mappingToDtoList(List<TReceivePlanH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TReceivePlanHDto> dtoList = new ArrayList<TReceivePlanHDto>();
        for (TReceivePlanH entity : entityList) {
            TReceivePlanHDto dto = mappingToDto(entity);
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
    public TReceivePlanH mappingToEntity(TReceivePlanHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TReceivePlanH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanH entity = new TReceivePlanH();
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getReceivePlanDt(), "receivePlanDt")) {
            entity.setReceivePlanDt(dto.getReceivePlanDt());
        }
        if (needsMapping(dto, dto.getPlanClientReceiveNo(), "planClientReceiveNo")) {
            entity.setPlanClientReceiveNo(dto.getPlanClientReceiveNo());
        }
        if (needsMapping(dto, dto.getReceiveSlipNo(), "receiveSlipNo")) {
            entity.setReceiveSlipNo(dto.getReceiveSlipNo());
        }
        if (needsMapping(dto, dto.getPlanSupplierId(), "planSupplierId")) {
            entity.setPlanSupplierId(dto.getPlanSupplierId());
        }
        if (needsMapping(dto, dto.getPlanSupplierCd(), "planSupplierCd")) {
            entity.setPlanSupplierCd(dto.getPlanSupplierCd());
        }
        if (needsMapping(dto, dto.getPlanDepositId(), "planDepositId")) {
            entity.setPlanDepositId(dto.getPlanDepositId());
        }
        if (needsMapping(dto, dto.getPlanDepositCd(), "planDepositCd")) {
            entity.setPlanDepositCd(dto.getPlanDepositCd());
        }
        if (needsMapping(dto, dto.getReceiveStatus(), "receiveStatus")) {
            entity.setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.codeOf(dto.getReceiveStatus()));
        }
        if (needsMapping(dto, dto.getInputType(), "inputType")) {
            entity.setInputTypeAsInputType(CDef.InputType.codeOf(dto.getInputType()));
        }
        if (needsMapping(dto, dto.getReceiveDeliveryStatus(), "receiveDeliveryStatus")) {
            entity.setReceiveDeliveryStatusAsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.codeOf(dto.getReceiveDeliveryStatus()));
        }
        if (needsMapping(dto, dto.getOldReceivePlanHId(), "oldReceivePlanHId")) {
            entity.setOldReceivePlanHId(dto.getOldReceivePlanHId());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getCenterTransitFlg(), "centerTransitFlg")) {
            entity.setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.codeOf(dto.getCenterTransitFlg()));
        }
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
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
        if (!_suppressTReceivePlanHSelf && dto.getTReceivePlanHSelf() != null) {
            TReceivePlanHDto relationDto = dto.getTReceivePlanHSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanH relationEntity = (TReceivePlanH)cachedEntity;
                entity.setTReceivePlanHSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHSelfList().add(entity);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHSelfList();
                TReceivePlanH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanHSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHSelfList().add(entity);
                }
                if (instanceCache && entity.getTReceivePlanHSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanHSelf());
                }
            }
        };
        if (!_suppressMCustomerByPlanDepositId && dto.getMCustomerByPlanDepositId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByPlanDepositId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByPlanDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHByPlanDepositIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHByPlanDepositIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByPlanDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHByPlanDepositIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByPlanDepositId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByPlanDepositId());
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
                    relationEntity.getTReceivePlanHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMStockType && dto.getMStockType() != null) {
            MStockTypeDto relationDto = dto.getMStockType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MStockType relationEntity = (MStockType)cachedEntity;
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getTReceivePlanHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMProcessType && dto.getMProcessType() != null) {
            MProcessTypeDto relationDto = dto.getMProcessType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProcessType relationEntity = (MProcessType)cachedEntity;
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressMCustomerByPlanSupplierId && dto.getMCustomerByPlanSupplierId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByPlanSupplierId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByPlanSupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHByPlanSupplierIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHByPlanSupplierIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByPlanSupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHByPlanSupplierIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByPlanSupplierId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByPlanSupplierId());
                }
            }
        };
        if (!_suppressTPickingH && dto.getTPickingH() != null) {
            TPickingHDto relationDto = dto.getTPickingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPickingH relationEntity = (TPickingH)cachedEntity;
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanHList();
                TPickingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanHList().add(entity);
                }
                if (instanceCache && entity.getTPickingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPickingH());
                }
            }
        };
        if (!_suppressBClassDtlByCenterTransitFlg && dto.getBClassDtlByCenterTransitFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCenterTransitFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCenterTransitFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCenterTransitFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCenterTransitFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCenterTransitFlg());
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
        if (!_suppressBClassDtlByInputType && dto.getBClassDtlByInputType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInputType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInputType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveDeliveryStatus && dto.getBClassDtlByReceiveDeliveryStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByReceiveDeliveryStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByReceiveDeliveryStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByReceiveDeliveryStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByReceiveDeliveryStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByReceiveDeliveryStatus());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveStatus && dto.getBClassDtlByReceiveStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByReceiveStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByReceiveStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByReceiveStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByReceiveStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByReceiveStatus());
                }
            }
        };
        if (!_suppressTReceivePlanBList && !dto.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanH();
            List<TReceivePlanB> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanBList());
            entity.setTReceivePlanBList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanB relationEntity : relationEntityList) {
                    relationEntity.setTReceivePlanH(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHSelfList && !dto.getTReceivePlanHSelfList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanHSelf();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHSelfList());
            entity.setTReceivePlanHSelfList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setTReceivePlanHSelf(entity);
                }
            }
        };
        if (!_suppressTReceivePlanRAsOne && dto.getTReceivePlanRAsOne() != null) {
            TReceivePlanRDto relationDto = dto.getTReceivePlanRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanR relationEntity = (TReceivePlanR)cachedEntity;
                entity.setTReceivePlanRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanH(entity);
                }
            } else {
                TReceivePlanRDtoMapper mapper = new TReceivePlanRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanH();
                TReceivePlanR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanH(entity);
                }
                if (instanceCache && entity.getTReceivePlanRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanRAsOne());
                }
            }
        };
        if (!_suppressTStoreRecordHList && !dto.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanH();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHList());
            entity.setTStoreRecordHList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setTReceivePlanH(entity);
                }
            }
        };
        if (!_suppressTTrrcvAsOne && dto.getTTrrcvAsOne() != null) {
            TTrrcvDto relationDto = dto.getTTrrcvAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrrcv relationEntity = (TTrrcv)cachedEntity;
                entity.setTTrrcvAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanH(entity);
                }
            } else {
                TTrrcvDtoMapper mapper = new TTrrcvDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanH();
                TTrrcv relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrrcvAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanH(entity);
                }
                if (instanceCache && entity.getTTrrcvAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrrcvAsOne());
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
    protected boolean needsMapping(TReceivePlanHDto dto, Object value, String propName) {
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
    public List<TReceivePlanH> mappingToEntityList(List<TReceivePlanHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TReceivePlanH> entityList = new ArrayList<TReceivePlanH>();
        for (TReceivePlanHDto dto : dtoList) {
            TReceivePlanH entity = mappingToEntity(dto);
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
    public void suppressTReceivePlanHSelf() {
        _suppressTReceivePlanHSelf = true;
    }
    public void suppressMCustomerByPlanDepositId() {
        _suppressMCustomerByPlanDepositId = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressMCustomerByPlanSupplierId() {
        _suppressMCustomerByPlanSupplierId = true;
    }
    public void suppressTPickingH() {
        _suppressTPickingH = true;
    }
    public void suppressBClassDtlByCenterTransitFlg() {
        _suppressBClassDtlByCenterTransitFlg = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressBClassDtlByInputType() {
        _suppressBClassDtlByInputType = true;
    }
    public void suppressBClassDtlByReceiveDeliveryStatus() {
        _suppressBClassDtlByReceiveDeliveryStatus = true;
    }
    public void suppressBClassDtlByReceiveStatus() {
        _suppressBClassDtlByReceiveStatus = true;
    }
    public void suppressTReceivePlanBList() {
        _suppressTReceivePlanBList = true;
    }
    public void suppressTReceivePlanHSelfList() {
        _suppressTReceivePlanHSelfList = true;
    }
    public void suppressTReceivePlanRAsOne() {
        _suppressTReceivePlanRAsOne = true;
    }
    public void suppressTStoreRecordHList() {
        _suppressTStoreRecordHList = true;
    }
    public void suppressTTrrcvAsOne() {
        _suppressTTrrcvAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressTReceivePlanHSelf();
        suppressMCustomerByPlanDepositId();
        suppressMClient();
        suppressMStockType();
        suppressMCenter();
        suppressMProcessType();
        suppressMCustomerByPlanSupplierId();
        suppressTPickingH();
        suppressBClassDtlByCenterTransitFlg();
        suppressBClassDtlByErrorFlg();
        suppressBClassDtlByInputType();
        suppressBClassDtlByReceiveDeliveryStatus();
        suppressBClassDtlByReceiveStatus();
        suppressTReceivePlanBList();
        suppressTReceivePlanHSelfList();
        suppressTReceivePlanRAsOne();
        suppressTStoreRecordHList();
        suppressTTrrcvAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressTReceivePlanHSelf = false;
        _suppressMCustomerByPlanDepositId = false;
        _suppressMClient = false;
        _suppressMStockType = false;
        _suppressMCenter = false;
        _suppressMProcessType = false;
        _suppressMCustomerByPlanSupplierId = false;
        _suppressTPickingH = false;
        _suppressBClassDtlByCenterTransitFlg = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressBClassDtlByInputType = false;
        _suppressBClassDtlByReceiveDeliveryStatus = false;
        _suppressBClassDtlByReceiveStatus = false;
        _suppressTReceivePlanBList = false;
        _suppressTReceivePlanHSelfList = false;
        _suppressTReceivePlanRAsOne = false;
        _suppressTStoreRecordHList = false;
        _suppressTTrrcvAsOne = false;
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
    public TReceivePlanHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TReceivePlanHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TReceivePlanHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TReceivePlanHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TReceivePlanHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TReceivePlanHDtoMapper)this;
    }
}
