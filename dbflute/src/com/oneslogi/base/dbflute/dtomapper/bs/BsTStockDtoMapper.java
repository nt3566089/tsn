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
 * The DTO mapper of T_STOCK as TABLE. <br>
 * 在庫
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, COMPANYCD, LOGICFLG1, LOGICFLG2, LOGICFLG3, TAGCD, QTY2AVG, QTY3AVG, QTY1INSTRUCTED, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_SHAPE, T_LOT, M_STOCK_TYPE, M_CLIENT, M_PRODUCT, M_WAREHOUSE, M_CUSTOMER, T_STORE_NO, M_LOCATION, T_STOCK_REPORT(AsOne)
 *
 * [referrer-table]
 *     T_INVENTORY_B, T_PALLET, T_PICKING_B, T_STOCK_INOUT, T_TRIMALLOCSTOCK, T_TRPICKDETAIL, T_STOCK_REPORT
 *
 * [foreign-property]
 *     mShape, tLot, mStockType, mClient, mProduct, mWarehouse, mCustomer, tStoreNo, mLocation, tStockReportAsOne
 *
 * [referrer-property]
 *     tInventoryBList, tPalletList, tPickingBList, tStockInoutList, tTrimallocstockList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStockDtoMapper implements DtoMapper<TStock, TStockDto>, Serializable {

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
    protected boolean _suppressMShape;
    protected boolean _suppressTLot;
    protected boolean _suppressMStockType;
    protected boolean _suppressMClient;
    protected boolean _suppressMProduct;
    protected boolean _suppressMWarehouse;
    protected boolean _suppressMCustomer;
    protected boolean _suppressTStoreNo;
    protected boolean _suppressMLocation;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTPalletList;
    protected boolean _suppressTPickingBList;
    protected boolean _suppressTStockInoutList;
    protected boolean _suppressTStockReportAsOne;
    protected boolean _suppressTTrimallocstockList;
    protected boolean _suppressTTrpickdetailList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStockDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStockDto mappingToDto(TStock entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStockDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockDto dto = new TStockDto();
        dto.setStockId(entity.getStockId());
        dto.setClientId(entity.getClientId());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setProductId(entity.getProductId());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setLocationId(entity.getLocationId());
        dto.setDepositId(entity.getDepositId());
        dto.setLotId(entity.getLotId());
        dto.setShapeId(entity.getShapeId());
        dto.setStoreNoId(entity.getStoreNoId());
        dto.setUnitNum(entity.getUnitNum());
        dto.setChargeNum(entity.getChargeNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setMoveNum(entity.getMoveNum());
        dto.setTransitNum(entity.getTransitNum());
        dto.setCompanycd(entity.getCompanycd());
        dto.setLogicflg1(entity.getLogicflg1());
        dto.setLogicflg2(entity.getLogicflg2());
        dto.setLogicflg3(entity.getLogicflg3());
        dto.setTagcd(entity.getTagcd());
        dto.setQty2avg(entity.getQty2avg());
        dto.setQty3avg(entity.getQty3avg());
        dto.setQty1instructed(entity.getQty1instructed());
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
        if (!_suppressMShape && entity.getMShape() != null) {
            MShape relationEntity = entity.getMShape();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MShapeDto relationDto = (MShapeDto)cachedDto;
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShape());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TLotDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTLot());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
                }
            }
        };
        if (!_suppressMCustomer && entity.getMCustomer() != null) {
            MCustomer relationEntity = entity.getMCustomer();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
                }
            }
        };
        if (!_suppressTStoreNo && entity.getTStoreNo() != null) {
            TStoreNo relationEntity = entity.getTStoreNo();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStoreNoDto relationDto = (TStoreNoDto)cachedDto;
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TStoreNoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreNo());
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
                    relationDto.getTStockList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTStockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTPalletList && !entity.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPalletDto> relationDtoList = mapper.mappingToDtoList(entity.getTPalletList());
            dto.setTPalletList(relationDtoList);
            if (reverseReference) {
                for (TPalletDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTPickingBList && !entity.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingBList());
            dto.setTPickingBList(relationDtoList);
            if (reverseReference) {
                for (TPickingBDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTStockInoutList && !entity.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutList());
            dto.setTStockInoutList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTStockReportAsOne && entity.getTStockReportAsOne() != null) {
            TStockReport relationEntity = entity.getTStockReportAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockReportDto relationDto = (TStockReportDto)cachedDto;
                dto.setTStockReportAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStock(dto);
                }
            } else {
                TStockReportDtoMapper mapper = new TStockReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStock();
                TStockReportDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStockReportAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTStock(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStockReportAsOne());
                }
            }
        };
        if (!_suppressTTrimallocstockList && !entity.getTTrimallocstockList().isEmpty()) {
            TTrimallocstockDtoMapper mapper = new TTrimallocstockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TTrimallocstockDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrimallocstockList());
            dto.setTTrimallocstockList(relationDtoList);
            if (reverseReference) {
                for (TTrimallocstockDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !entity.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TTrpickdetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpickdetailList());
            dto.setTTrpickdetailList(relationDtoList);
            if (reverseReference) {
                for (TTrpickdetailDto relationDto : relationDtoList) {
                    relationDto.setTStock(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStockDto> mappingToDtoList(List<TStock> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStockDto> dtoList = new ArrayList<TStockDto>();
        for (TStock entity : entityList) {
            TStockDto dto = mappingToDto(entity);
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
    public TStock mappingToEntity(TStockDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStock)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStock entity = new TStock();
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getDepositId(), "depositId")) {
            entity.setDepositId(dto.getDepositId());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
        }
        if (needsMapping(dto, dto.getStoreNoId(), "storeNoId")) {
            entity.setStoreNoId(dto.getStoreNoId());
        }
        if (needsMapping(dto, dto.getUnitNum(), "unitNum")) {
            entity.setUnitNum(dto.getUnitNum());
        }
        if (needsMapping(dto, dto.getChargeNum(), "chargeNum")) {
            entity.setChargeNum(dto.getChargeNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getMoveNum(), "moveNum")) {
            entity.setMoveNum(dto.getMoveNum());
        }
        if (needsMapping(dto, dto.getTransitNum(), "transitNum")) {
            entity.setTransitNum(dto.getTransitNum());
        }
        if (needsMapping(dto, dto.getCompanycd(), "companycd")) {
            entity.setCompanycd(dto.getCompanycd());
        }
        if (needsMapping(dto, dto.getLogicflg1(), "logicflg1")) {
            entity.setLogicflg1(dto.getLogicflg1());
        }
        if (needsMapping(dto, dto.getLogicflg2(), "logicflg2")) {
            entity.setLogicflg2(dto.getLogicflg2());
        }
        if (needsMapping(dto, dto.getLogicflg3(), "logicflg3")) {
            entity.setLogicflg3(dto.getLogicflg3());
        }
        if (needsMapping(dto, dto.getTagcd(), "tagcd")) {
            entity.setTagcd(dto.getTagcd());
        }
        if (needsMapping(dto, dto.getQty2avg(), "qty2avg")) {
            entity.setQty2avg(dto.getQty2avg());
        }
        if (needsMapping(dto, dto.getQty3avg(), "qty3avg")) {
            entity.setQty3avg(dto.getQty3avg());
        }
        if (needsMapping(dto, dto.getQty1instructed(), "qty1instructed")) {
            entity.setQty1instructed(dto.getQty1instructed());
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
        if (!_suppressMShape && dto.getMShape() != null) {
            MShapeDto relationDto = dto.getMShape();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MShape relationEntity = (MShape)cachedEntity;
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMShape().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShape());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TLot relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getTLot().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTLot());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
                }
            }
        };
        if (!_suppressMCustomer && dto.getMCustomer() != null) {
            MCustomerDto relationDto = dto.getMCustomer();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
                }
            }
        };
        if (!_suppressTStoreNo && dto.getTStoreNo() != null) {
            TStoreNoDto relationDto = dto.getTStoreNo();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStoreNo relationEntity = (TStoreNo)cachedEntity;
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                TStoreNo relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getTStoreNo().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreNo());
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
                    relationEntity.getTStockList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTPalletList && !dto.getTPalletList().isEmpty()) {
            TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPallet> relationEntityList = mapper.mappingToEntityList(dto.getTPalletList());
            entity.setTPalletList(relationEntityList);
            if (reverseReference) {
                for (TPallet relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTPickingBList && !dto.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TPickingB> relationEntityList = mapper.mappingToEntityList(dto.getTPickingBList());
            entity.setTPickingBList(relationEntityList);
            if (reverseReference) {
                for (TPickingB relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTStockInoutList && !dto.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutList());
            entity.setTStockInoutList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTStockReportAsOne && dto.getTStockReportAsOne() != null) {
            TStockReportDto relationDto = dto.getTStockReportAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStockReport relationEntity = (TStockReport)cachedEntity;
                entity.setTStockReportAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStock(entity);
                }
            } else {
                TStockReportDtoMapper mapper = new TStockReportDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStock();
                TStockReport relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStockReportAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStock(entity);
                }
                if (instanceCache && entity.getTStockReportAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStockReportAsOne());
                }
            }
        };
        if (!_suppressTTrimallocstockList && !dto.getTTrimallocstockList().isEmpty()) {
            TTrimallocstockDtoMapper mapper = new TTrimallocstockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TTrimallocstock> relationEntityList = mapper.mappingToEntityList(dto.getTTrimallocstockList());
            entity.setTTrimallocstockList(relationEntityList);
            if (reverseReference) {
                for (TTrimallocstock relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !dto.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStock();
            List<TTrpickdetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrpickdetailList());
            entity.setTTrpickdetailList(relationEntityList);
            if (reverseReference) {
                for (TTrpickdetail relationEntity : relationEntityList) {
                    relationEntity.setTStock(entity);
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
    protected boolean needsMapping(TStockDto dto, Object value, String propName) {
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
    public List<TStock> mappingToEntityList(List<TStockDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStock> entityList = new ArrayList<TStock>();
        for (TStockDto dto : dtoList) {
            TStock entity = mappingToEntity(dto);
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
    public void suppressMShape() {
        _suppressMShape = true;
    }
    public void suppressTLot() {
        _suppressTLot = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressTStoreNo() {
        _suppressTStoreNo = true;
    }
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTPalletList() {
        _suppressTPalletList = true;
    }
    public void suppressTPickingBList() {
        _suppressTPickingBList = true;
    }
    public void suppressTStockInoutList() {
        _suppressTStockInoutList = true;
    }
    public void suppressTStockReportAsOne() {
        _suppressTStockReportAsOne = true;
    }
    public void suppressTTrimallocstockList() {
        _suppressTTrimallocstockList = true;
    }
    public void suppressTTrpickdetailList() {
        _suppressTTrpickdetailList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMShape();
        suppressTLot();
        suppressMStockType();
        suppressMClient();
        suppressMProduct();
        suppressMWarehouse();
        suppressMCustomer();
        suppressTStoreNo();
        suppressMLocation();
        suppressTInventoryBList();
        suppressTPalletList();
        suppressTPickingBList();
        suppressTStockInoutList();
        suppressTStockReportAsOne();
        suppressTTrimallocstockList();
        suppressTTrpickdetailList();
    }
    protected void doSuppressClear() { // internal
        _suppressMShape = false;
        _suppressTLot = false;
        _suppressMStockType = false;
        _suppressMClient = false;
        _suppressMProduct = false;
        _suppressMWarehouse = false;
        _suppressMCustomer = false;
        _suppressTStoreNo = false;
        _suppressMLocation = false;
        _suppressTInventoryBList = false;
        _suppressTPalletList = false;
        _suppressTPickingBList = false;
        _suppressTStockInoutList = false;
        _suppressTStockReportAsOne = false;
        _suppressTTrimallocstockList = false;
        _suppressTTrpickdetailList = false;
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
    public TStockDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStockDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStockDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStockDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStockDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStockDtoMapper)this;
    }
}
