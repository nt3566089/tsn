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
 * The DTO mapper of W_HT_RECEIVE_STORE as TABLE. <br>
 * 入庫格納ワーク
 * <pre>
 * [primary-key]
 *     HT_RECEIVE_STORE_ID
 *
 * [column]
 *     HT_RECEIVE_STORE_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, LOC_ID, LOC_CD, LOC_NM, JAN_CD, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, STK_CLS_NM, STORE_NUM, ONS_NUM, LOT_ID, LOT, LIMIT_DT, PLAN_NUM, WORK_START_DT, WORK_END_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_RECEIVE_STORE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT, M_LOCATION, T_LOT, M_PRODUCT, M_STOCK_TYPE, M_WAREHOUSE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient, mLocation, tLot, mProduct, mStockType, mWarehouse
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWHtReceiveStoreDtoMapper implements DtoMapper<WHtReceiveStore, WHtReceiveStoreDto>, Serializable {

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
    protected boolean _suppressMLocation;
    protected boolean _suppressTLot;
    protected boolean _suppressMProduct;
    protected boolean _suppressMStockType;
    protected boolean _suppressMWarehouse;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWHtReceiveStoreDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWHtReceiveStoreDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WHtReceiveStoreDto mappingToDto(WHtReceiveStore entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WHtReceiveStoreDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WHtReceiveStoreDto dto = new WHtReceiveStoreDto();
        dto.setHtReceiveStoreId(entity.getHtReceiveStoreId());
        dto.setMacAddress(entity.getMacAddress());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setLocId(entity.getLocId());
        dto.setLocCd(entity.getLocCd());
        dto.setLocNm(entity.getLocNm());
        dto.setJanCd(entity.getJanCd());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setStkClsNm(entity.getStkClsNm());
        dto.setStoreNum(entity.getStoreNum());
        dto.setOnsNum(entity.getOnsNum());
        dto.setLotId(entity.getLotId());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setPlanNum(entity.getPlanNum());
        dto.setWorkStartDt(entity.getWorkStartDt());
        dto.setWorkEndDt(entity.getWorkEndDt());
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
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
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
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressTLot && entity.getTLot() != null) {
            TLot relationEntity = entity.getTLot();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TLotDto relationDto = (TLotDto)cachedDto;
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                TLotDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTLot());
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
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
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
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getWHtReceiveStoreList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WHtReceiveStoreDto> mappingToDtoList(List<WHtReceiveStore> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WHtReceiveStoreDto> dtoList = new ArrayList<WHtReceiveStoreDto>();
        for (WHtReceiveStore entity : entityList) {
            WHtReceiveStoreDto dto = mappingToDto(entity);
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
    public WHtReceiveStore mappingToEntity(WHtReceiveStoreDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WHtReceiveStore)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WHtReceiveStore entity = new WHtReceiveStore();
        if (needsMapping(dto, dto.getHtReceiveStoreId(), "htReceiveStoreId")) {
            entity.setHtReceiveStoreId(dto.getHtReceiveStoreId());
        }
        if (needsMapping(dto, dto.getMacAddress(), "macAddress")) {
            entity.setMacAddress(dto.getMacAddress());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getLocId(), "locId")) {
            entity.setLocId(dto.getLocId());
        }
        if (needsMapping(dto, dto.getLocCd(), "locCd")) {
            entity.setLocCd(dto.getLocCd());
        }
        if (needsMapping(dto, dto.getLocNm(), "locNm")) {
            entity.setLocNm(dto.getLocNm());
        }
        if (needsMapping(dto, dto.getJanCd(), "janCd")) {
            entity.setJanCd(dto.getJanCd());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getStkClsNm(), "stkClsNm")) {
            entity.setStkClsNm(dto.getStkClsNm());
        }
        if (needsMapping(dto, dto.getStoreNum(), "storeNum")) {
            entity.setStoreNum(dto.getStoreNum());
        }
        if (needsMapping(dto, dto.getOnsNum(), "onsNum")) {
            entity.setOnsNum(dto.getOnsNum());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getPlanNum(), "planNum")) {
            entity.setPlanNum(dto.getPlanNum());
        }
        if (needsMapping(dto, dto.getWorkStartDt(), "workStartDt")) {
            entity.setWorkStartDt(dto.getWorkStartDt());
        }
        if (needsMapping(dto, dto.getWorkEndDt(), "workEndDt")) {
            entity.setWorkEndDt(dto.getWorkEndDt());
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
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
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
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressTLot && dto.getTLot() != null) {
            TLotDto relationDto = dto.getTLot();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TLot relationEntity = (TLot)cachedEntity;
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                TLot relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getTLot().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTLot());
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
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
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
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWHtReceiveStoreList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getWHtReceiveStoreList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
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
    protected boolean needsMapping(WHtReceiveStoreDto dto, Object value, String propName) {
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
    public List<WHtReceiveStore> mappingToEntityList(List<WHtReceiveStoreDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WHtReceiveStore> entityList = new ArrayList<WHtReceiveStore>();
        for (WHtReceiveStoreDto dto : dtoList) {
            WHtReceiveStore entity = mappingToEntity(dto);
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
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressTLot() {
        _suppressTLot = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMClient();
        suppressMLocation();
        suppressTLot();
        suppressMProduct();
        suppressMStockType();
        suppressMWarehouse();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMClient = false;
        _suppressMLocation = false;
        _suppressTLot = false;
        _suppressMProduct = false;
        _suppressMStockType = false;
        _suppressMWarehouse = false;
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
    public WHtReceiveStoreDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WHtReceiveStoreDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WHtReceiveStoreDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WHtReceiveStoreDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WHtReceiveStoreDtoMapper reverseReference() {
        setReverseReference(true);
        return (WHtReceiveStoreDtoMapper)this;
    }
}
