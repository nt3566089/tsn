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
 * The DTO mapper of T_STORE_RECORD_H as TABLE. <br>
 * 入庫実績ヘッダ
 * <pre>
 * [primary-key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, CLIENT_RECEIVE_NO, SUPPLIER_ID, DEPOSIT_ID, STORE_RECORD_H_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, T_RECEIVE_PLAN_H, M_CENTER, M_PROCESS_TYPE, M_STOCK_TYPE, M_CLIENT, T_STORE_RECORD_R(AsOne)
 *
 * [referrer-table]
 *     T_STORE_RECORD_B, T_STORE_RECORD_R
 *
 * [foreign-property]
 *     mCustomerByDepositId, tReceivePlanH, mCenter, mCustomerBySupplierId, mProcessType, mStockType, mClient, tStoreRecordRAsOne
 *
 * [referrer-property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStoreRecordHDtoMapper implements DtoMapper<TStoreRecordH, TStoreRecordHDto>, Serializable {

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
    protected boolean _suppressMCustomerByDepositId;
    protected boolean _suppressTReceivePlanH;
    protected boolean _suppressMCenter;
    protected boolean _suppressMCustomerBySupplierId;
    protected boolean _suppressMProcessType;
    protected boolean _suppressMStockType;
    protected boolean _suppressMClient;
    protected boolean _suppressTStoreRecordBList;
    protected boolean _suppressTStoreRecordRAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStoreRecordHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStoreRecordHDto mappingToDto(TStoreRecordH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStoreRecordHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStoreRecordHDto dto = new TStoreRecordHDto();
        dto.setStoreRecordHId(entity.getStoreRecordHId());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setClientReceiveNo(entity.getClientReceiveNo());
        dto.setSupplierId(entity.getSupplierId());
        dto.setDepositId(entity.getDepositId());
        dto.setStoreRecordHComment(entity.getStoreRecordHComment());
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
        if (!_suppressMCustomerByDepositId && entity.getMCustomerByDepositId() != null) {
            MCustomer relationEntity = entity.getMCustomerByDepositId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerByDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHByDepositIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHByDepositIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerByDepositId(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHByDepositIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerByDepositId());
                }
            }
        };
        if (!_suppressTReceivePlanH && entity.getTReceivePlanH() != null) {
            TReceivePlanH relationEntity = entity.getTReceivePlanH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanHDto relationDto = (TReceivePlanHDto)cachedDto;
                dto.setTReceivePlanH(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                TReceivePlanHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanH(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanH());
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
                    relationDto.getTStoreRecordHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMCustomerBySupplierId && entity.getMCustomerBySupplierId() != null) {
            MCustomer relationEntity = entity.getMCustomerBySupplierId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomerBySupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHBySupplierIdList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHBySupplierIdList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomerBySupplierId(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHBySupplierIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomerBySupplierId());
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
                    relationDto.getTStoreRecordHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
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
                    relationDto.getTStoreRecordHList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getTStoreRecordHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressTStoreRecordBList && !entity.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStoreRecordH();
            List<TStoreRecordBDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordBList());
            dto.setTStoreRecordBList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordBDto relationDto : relationDtoList) {
                    relationDto.setTStoreRecordH(dto);
                }
            }
        };
        if (!_suppressTStoreRecordRAsOne && entity.getTStoreRecordRAsOne() != null) {
            TStoreRecordR relationEntity = entity.getTStoreRecordRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStoreRecordRDto relationDto = (TStoreRecordRDto)cachedDto;
                dto.setTStoreRecordRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStoreRecordH(dto);
                }
            } else {
                TStoreRecordRDtoMapper mapper = new TStoreRecordRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordH();
                TStoreRecordRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreRecordRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStoreRecordH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreRecordRAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStoreRecordHDto> mappingToDtoList(List<TStoreRecordH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStoreRecordHDto> dtoList = new ArrayList<TStoreRecordHDto>();
        for (TStoreRecordH entity : entityList) {
            TStoreRecordHDto dto = mappingToDto(entity);
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
    public TStoreRecordH mappingToEntity(TStoreRecordHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStoreRecordH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStoreRecordH entity = new TStoreRecordH();
        if (needsMapping(dto, dto.getStoreRecordHId(), "storeRecordHId")) {
            entity.setStoreRecordHId(dto.getStoreRecordHId());
        }
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
        if (needsMapping(dto, dto.getClientReceiveNo(), "clientReceiveNo")) {
            entity.setClientReceiveNo(dto.getClientReceiveNo());
        }
        if (needsMapping(dto, dto.getSupplierId(), "supplierId")) {
            entity.setSupplierId(dto.getSupplierId());
        }
        if (needsMapping(dto, dto.getDepositId(), "depositId")) {
            entity.setDepositId(dto.getDepositId());
        }
        if (needsMapping(dto, dto.getStoreRecordHComment(), "storeRecordHComment")) {
            entity.setStoreRecordHComment(dto.getStoreRecordHComment());
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
        if (!_suppressMCustomerByDepositId && dto.getMCustomerByDepositId() != null) {
            MCustomerDto relationDto = dto.getMCustomerByDepositId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerByDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHByDepositIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHByDepositIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerByDepositId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHByDepositIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerByDepositId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerByDepositId());
                }
            }
        };
        if (!_suppressTReceivePlanH && dto.getTReceivePlanH() != null) {
            TReceivePlanHDto relationDto = dto.getTReceivePlanH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanH relationEntity = (TReceivePlanH)cachedEntity;
                entity.setTReceivePlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                TReceivePlanH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
                if (instanceCache && entity.getTReceivePlanH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanH());
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
                    relationEntity.getTStoreRecordHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMCustomerBySupplierId && dto.getMCustomerBySupplierId() != null) {
            MCustomerDto relationDto = dto.getMCustomerBySupplierId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomerBySupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHBySupplierIdList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHBySupplierIdList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomerBySupplierId(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHBySupplierIdList().add(entity);
                }
                if (instanceCache && entity.getMCustomerBySupplierId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomerBySupplierId());
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
                    relationEntity.getTStoreRecordHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
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
                    relationEntity.getTStoreRecordHList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getTStoreRecordHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressTStoreRecordBList && !dto.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStoreRecordH();
            List<TStoreRecordB> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordBList());
            entity.setTStoreRecordBList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordB relationEntity : relationEntityList) {
                    relationEntity.setTStoreRecordH(entity);
                }
            }
        };
        if (!_suppressTStoreRecordRAsOne && dto.getTStoreRecordRAsOne() != null) {
            TStoreRecordRDto relationDto = dto.getTStoreRecordRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStoreRecordR relationEntity = (TStoreRecordR)cachedEntity;
                entity.setTStoreRecordRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStoreRecordH(entity);
                }
            } else {
                TStoreRecordRDtoMapper mapper = new TStoreRecordRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordH();
                TStoreRecordR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreRecordRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStoreRecordH(entity);
                }
                if (instanceCache && entity.getTStoreRecordRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreRecordRAsOne());
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
    protected boolean needsMapping(TStoreRecordHDto dto, Object value, String propName) {
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
    public List<TStoreRecordH> mappingToEntityList(List<TStoreRecordHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStoreRecordH> entityList = new ArrayList<TStoreRecordH>();
        for (TStoreRecordHDto dto : dtoList) {
            TStoreRecordH entity = mappingToEntity(dto);
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
    public void suppressMCustomerByDepositId() {
        _suppressMCustomerByDepositId = true;
    }
    public void suppressTReceivePlanH() {
        _suppressTReceivePlanH = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMCustomerBySupplierId() {
        _suppressMCustomerBySupplierId = true;
    }
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressTStoreRecordBList() {
        _suppressTStoreRecordBList = true;
    }
    public void suppressTStoreRecordRAsOne() {
        _suppressTStoreRecordRAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCustomerByDepositId();
        suppressTReceivePlanH();
        suppressMCenter();
        suppressMCustomerBySupplierId();
        suppressMProcessType();
        suppressMStockType();
        suppressMClient();
        suppressTStoreRecordBList();
        suppressTStoreRecordRAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressMCustomerByDepositId = false;
        _suppressTReceivePlanH = false;
        _suppressMCenter = false;
        _suppressMCustomerBySupplierId = false;
        _suppressMProcessType = false;
        _suppressMStockType = false;
        _suppressMClient = false;
        _suppressTStoreRecordBList = false;
        _suppressTStoreRecordRAsOne = false;
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
    public TStoreRecordHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStoreRecordHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStoreRecordHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStoreRecordHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStoreRecordHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStoreRecordHDtoMapper)this;
    }
}
