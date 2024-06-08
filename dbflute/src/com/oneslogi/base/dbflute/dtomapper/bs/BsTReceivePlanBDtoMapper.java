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
 * The DTO mapper of T_RECEIVE_PLAN_B as TABLE. <br>
 * 入荷予定ボディ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_LOCATION, M_WAREHOUSE, T_RECEIVE_PLAN_H, M_PRODUCT, B_CLASS_DTL(ByErrorFlg), T_RECEIVE_PLAN_SPARE(AsOne), T_TRRCVDETAIL(AsOne)
 *
 * [referrer-table]
 *     T_STORE_RECORD_B, T_RECEIVE_PLAN_SPARE, T_TRRCVDETAIL
 *
 * [foreign-property]
 *     mLocation, mWarehouse, tReceivePlanH, mProduct, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne, tTrrcvdetailAsOne
 *
 * [referrer-property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTReceivePlanBDtoMapper implements DtoMapper<TReceivePlanB, TReceivePlanBDto>, Serializable {

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
    protected boolean _suppressMLocation;
    protected boolean _suppressMWarehouse;
    protected boolean _suppressTReceivePlanH;
    protected boolean _suppressMProduct;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressBClassDtlByReceiveStatus;
    protected boolean _suppressTReceivePlanSpareAsOne;
    protected boolean _suppressTStoreRecordBList;
    protected boolean _suppressTTrrcvdetailAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTReceivePlanBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TReceivePlanBDto mappingToDto(TReceivePlanB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TReceivePlanBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanBDto dto = new TReceivePlanBDto();
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setLineNo(entity.getLineNo());
        dto.setReceiveStatus(entity.getReceiveStatus());
        dto.setPlanClientOrderNo(entity.getPlanClientOrderNo());
        dto.setPlanWarehouseId(entity.getPlanWarehouseId());
        dto.setPlanWarehouseCd(entity.getPlanWarehouseCd());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setPlanLot(entity.getPlanLot());
        dto.setPlanLimitDt(entity.getPlanLimitDt());
        dto.setPlanLocationId(entity.getPlanLocationId());
        dto.setPlanLocationCd(entity.getPlanLocationCd());
        dto.setPlanStoreLabelNo(entity.getPlanStoreLabelNo());
        dto.setPlanNum(entity.getPlanNum());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
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
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressMWarehouse && entity.getMWarehouse() != null) {
            MWarehouse relationEntity = entity.getMWarehouse();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MWarehouseDto relationDto = (MWarehouseDto)cachedDto;
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
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
                    relationDto.getTReceivePlanBList().add(dto);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                TReceivePlanHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanH(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanH());
                }
            }
        };
        if (!_suppressMProduct && entity.getMProduct() != null) {
            MProduct relationEntity = entity.getMProduct();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTReceivePlanBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
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
        if (!_suppressTReceivePlanSpareAsOne && entity.getTReceivePlanSpareAsOne() != null) {
            TReceivePlanSpare relationEntity = entity.getTReceivePlanSpareAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanSpareDto relationDto = (TReceivePlanSpareDto)cachedDto;
                dto.setTReceivePlanSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanB(dto);
                }
            } else {
                TReceivePlanSpareDtoMapper mapper = new TReceivePlanSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanB();
                TReceivePlanSpareDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanB(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanSpareAsOne());
                }
            }
        };
        if (!_suppressTStoreRecordBList && !entity.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanB();
            List<TStoreRecordBDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordBList());
            dto.setTStoreRecordBList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordBDto relationDto : relationDtoList) {
                    relationDto.setTReceivePlanB(dto);
                }
            }
        };
        if (!_suppressTTrrcvdetailAsOne && entity.getTTrrcvdetailAsOne() != null) {
            TTrrcvdetail relationEntity = entity.getTTrrcvdetailAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrrcvdetailDto relationDto = (TTrrcvdetailDto)cachedDto;
                dto.setTTrrcvdetailAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanB(dto);
                }
            } else {
                TTrrcvdetailDtoMapper mapper = new TTrrcvdetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanB();
                TTrrcvdetailDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrrcvdetailAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTReceivePlanB(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrrcvdetailAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TReceivePlanBDto> mappingToDtoList(List<TReceivePlanB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TReceivePlanBDto> dtoList = new ArrayList<TReceivePlanBDto>();
        for (TReceivePlanB entity : entityList) {
            TReceivePlanBDto dto = mappingToDto(entity);
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
    public TReceivePlanB mappingToEntity(TReceivePlanBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TReceivePlanB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TReceivePlanB entity = new TReceivePlanB();
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
        }
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getReceiveStatus(), "receiveStatus")) {
            entity.setReceiveStatusAsReceiveStatus(CDef.ReceiveStatus.codeOf(dto.getReceiveStatus()));
        }
        if (needsMapping(dto, dto.getPlanClientOrderNo(), "planClientOrderNo")) {
            entity.setPlanClientOrderNo(dto.getPlanClientOrderNo());
        }
        if (needsMapping(dto, dto.getPlanWarehouseId(), "planWarehouseId")) {
            entity.setPlanWarehouseId(dto.getPlanWarehouseId());
        }
        if (needsMapping(dto, dto.getPlanWarehouseCd(), "planWarehouseCd")) {
            entity.setPlanWarehouseCd(dto.getPlanWarehouseCd());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getPlanLot(), "planLot")) {
            entity.setPlanLot(dto.getPlanLot());
        }
        if (needsMapping(dto, dto.getPlanLimitDt(), "planLimitDt")) {
            entity.setPlanLimitDt(dto.getPlanLimitDt());
        }
        if (needsMapping(dto, dto.getPlanLocationId(), "planLocationId")) {
            entity.setPlanLocationId(dto.getPlanLocationId());
        }
        if (needsMapping(dto, dto.getPlanLocationCd(), "planLocationCd")) {
            entity.setPlanLocationCd(dto.getPlanLocationCd());
        }
        if (needsMapping(dto, dto.getPlanStoreLabelNo(), "planStoreLabelNo")) {
            entity.setPlanStoreLabelNo(dto.getPlanStoreLabelNo());
        }
        if (needsMapping(dto, dto.getPlanNum(), "planNum")) {
            entity.setPlanNum(dto.getPlanNum());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
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
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressMWarehouse && dto.getMWarehouse() != null) {
            MWarehouseDto relationDto = dto.getMWarehouse();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MWarehouse relationEntity = (MWarehouse)cachedEntity;
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
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
                    relationEntity.getTReceivePlanBList().add(entity);
                }
            } else {
                TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                TReceivePlanH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
                if (instanceCache && entity.getTReceivePlanH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanH());
                }
            }
        };
        if (!_suppressMProduct && dto.getMProduct() != null) {
            MProductDto relationDto = dto.getMProduct();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanBList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTReceivePlanBList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
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
        if (!_suppressTReceivePlanSpareAsOne && dto.getTReceivePlanSpareAsOne() != null) {
            TReceivePlanSpareDto relationDto = dto.getTReceivePlanSpareAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanSpare relationEntity = (TReceivePlanSpare)cachedEntity;
                entity.setTReceivePlanSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanB(entity);
                }
            } else {
                TReceivePlanSpareDtoMapper mapper = new TReceivePlanSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanB();
                TReceivePlanSpare relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanB(entity);
                }
                if (instanceCache && entity.getTReceivePlanSpareAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanSpareAsOne());
                }
            }
        };
        if (!_suppressTStoreRecordBList && !dto.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTReceivePlanB();
            List<TStoreRecordB> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordBList());
            entity.setTStoreRecordBList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordB relationEntity : relationEntityList) {
                    relationEntity.setTReceivePlanB(entity);
                }
            }
        };
        if (!_suppressTTrrcvdetailAsOne && dto.getTTrrcvdetailAsOne() != null) {
            TTrrcvdetailDto relationDto = dto.getTTrrcvdetailAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrrcvdetail relationEntity = (TTrrcvdetail)cachedEntity;
                entity.setTTrrcvdetailAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanB(entity);
                }
            } else {
                TTrrcvdetailDtoMapper mapper = new TTrrcvdetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTReceivePlanB();
                TTrrcvdetail relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrrcvdetailAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTReceivePlanB(entity);
                }
                if (instanceCache && entity.getTTrrcvdetailAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrrcvdetailAsOne());
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
    protected boolean needsMapping(TReceivePlanBDto dto, Object value, String propName) {
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
    public List<TReceivePlanB> mappingToEntityList(List<TReceivePlanBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TReceivePlanB> entityList = new ArrayList<TReceivePlanB>();
        for (TReceivePlanBDto dto : dtoList) {
            TReceivePlanB entity = mappingToEntity(dto);
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
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    public void suppressTReceivePlanH() {
        _suppressTReceivePlanH = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressBClassDtlByReceiveStatus() {
        _suppressBClassDtlByReceiveStatus = true;
    }
    public void suppressTReceivePlanSpareAsOne() {
        _suppressTReceivePlanSpareAsOne = true;
    }
    public void suppressTStoreRecordBList() {
        _suppressTStoreRecordBList = true;
    }
    public void suppressTTrrcvdetailAsOne() {
        _suppressTTrrcvdetailAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressMLocation();
        suppressMWarehouse();
        suppressTReceivePlanH();
        suppressMProduct();
        suppressBClassDtlByErrorFlg();
        suppressBClassDtlByReceiveStatus();
        suppressTReceivePlanSpareAsOne();
        suppressTStoreRecordBList();
        suppressTTrrcvdetailAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressMLocation = false;
        _suppressMWarehouse = false;
        _suppressTReceivePlanH = false;
        _suppressMProduct = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressBClassDtlByReceiveStatus = false;
        _suppressTReceivePlanSpareAsOne = false;
        _suppressTStoreRecordBList = false;
        _suppressTTrrcvdetailAsOne = false;
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
    public TReceivePlanBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TReceivePlanBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TReceivePlanBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TReceivePlanBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TReceivePlanBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TReceivePlanBDtoMapper)this;
    }
}
