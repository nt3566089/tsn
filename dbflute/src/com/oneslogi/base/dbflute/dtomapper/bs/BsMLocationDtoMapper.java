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
 * The DTO mapper of M_LOCATION as TABLE. <br>
 * ロケーションマスタ
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, CENTER_ID, ZONE_ID, LOCATION_CD, LOCATION_NM, PICKING_LOCATION_FLG, PICKING_ORDER, LOCATION_TYPE, ALLOC_ORDER, ALLOC_NG_FLG, REPLENISH_PRODUCT_ID, REPLENISH_STOCK_TYPE_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_ID, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_ID, LocGroup, PALLETECAPACITY, CAPACITY, LINBLK, LOCID, PRODUCT_ID, SPLREVUN, SPLREVCTQA, BSSPLPT, TOSPLMD, PRESPLMD, VIRTUALLOCFLG, RootOutSeq, FLOOR, ZNE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT_SHAPE, M_PRODUCT, M_ZONE, M_STOCK_TYPE, M_CUSTOMER, M_CENTER, B_CLASS_DTL(ByAllocNgFlg)
 *
 * [referrer-table]
 *     T_ALLOC_INST_B, T_INVENTORY_B, T_MOVE_INST_B, T_MOVE_RECORD_B, T_RECEIVE_PLAN_B, T_SHIPPING_INST_B, T_STOCK, T_STORE_RECORD_B, T_TRPICKDETAIL, W_HT_INVENTORY_INPUT_PROD, W_HT_RECEIVE_INSPECTION, W_HT_RECEIVE_NO_PLAN_INSP, W_HT_RECEIVE_STORE, W_HT_SHIPPING_PICKING
 *
 * [foreign-property]
 *     mProductShapeByMaxStoreProductShapeId, mProduct, mZone, mProductShapeByReplenishPProductShapeId, mStockType, mCustomer, mCenter, bClassDtlByAllocNgFlg, bClassDtlByDelFlg, bClassDtlByLocationType, bClassDtlByPickingLocationFlg
 *
 * [referrer-property]
 *     tAllocInstBList, tInventoryBList, tMoveInstBList, tMoveRecordBList, tReceivePlanBList, tShippingInstBList, tStockList, tStoreRecordBList, tTrpickdetailList, wHtInventoryInputProdList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingPickingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMLocationDtoMapper implements DtoMapper<MLocation, MLocationDto>, Serializable {

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
    protected boolean _suppressMProductShapeByMaxStoreProductShapeId;
    protected boolean _suppressMProduct;
    protected boolean _suppressMZone;
    protected boolean _suppressMProductShapeByReplenishPProductShapeId;
    protected boolean _suppressMStockType;
    protected boolean _suppressMCustomer;
    protected boolean _suppressMCenter;
    protected boolean _suppressBClassDtlByAllocNgFlg;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByLocationType;
    protected boolean _suppressBClassDtlByPickingLocationFlg;
    protected boolean _suppressTAllocInstBList;
    protected boolean _suppressTInventoryBList;
    protected boolean _suppressTMoveInstBList;
    protected boolean _suppressTMoveRecordBList;
    protected boolean _suppressTReceivePlanBList;
    protected boolean _suppressTShippingInstBList;
    protected boolean _suppressTStockList;
    protected boolean _suppressTStoreRecordBList;
    protected boolean _suppressTTrpickdetailList;
    protected boolean _suppressWHtInventoryInputProdList;
    protected boolean _suppressWHtReceiveInspectionList;
    protected boolean _suppressWHtReceiveNoPlanInspList;
    protected boolean _suppressWHtReceiveStoreList;
    protected boolean _suppressWHtShippingPickingList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMLocationDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMLocationDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MLocationDto mappingToDto(MLocation entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MLocationDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MLocationDto dto = new MLocationDto();
        dto.setLocationId(entity.getLocationId());
        dto.setCenterId(entity.getCenterId());
        dto.setZoneId(entity.getZoneId());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLocationNm(entity.getLocationNm());
        dto.setPickingLocationFlg(entity.getPickingLocationFlg());
        dto.setPickingOrder(entity.getPickingOrder());
        dto.setLocationType(entity.getLocationType());
        dto.setAllocOrder(entity.getAllocOrder());
        dto.setAllocNgFlg(entity.getAllocNgFlg());
        dto.setReplenishProductId(entity.getReplenishProductId());
        dto.setReplenishStockTypeId(entity.getReplenishStockTypeId());
        dto.setReplenishDepositId(entity.getReplenishDepositId());
        dto.setReplenishPNum(entity.getReplenishPNum());
        dto.setReplenishPProductShapeId(entity.getReplenishPProductShapeId());
        dto.setMaxStoreNum(entity.getMaxStoreNum());
        dto.setMaxStoreProductShapeId(entity.getMaxStoreProductShapeId());
        dto.setLocgroup(entity.getLocgroup());
        dto.setPalletecapacity(entity.getPalletecapacity());
        dto.setCapacity(entity.getCapacity());
        dto.setLinblk(entity.getLinblk());
        dto.setLocid(entity.getLocid());
        dto.setProductId(entity.getProductId());
        dto.setSplrevun(entity.getSplrevun());
        dto.setSplrevctqa(entity.getSplrevctqa());
        dto.setBssplpt(entity.getBssplpt());
        dto.setTosplmd(entity.getTosplmd());
        dto.setPresplmd(entity.getPresplmd());
        dto.setVirtuallocflg(entity.getVirtuallocflg());
        dto.setRootoutseq(entity.getRootoutseq());
        dto.setFloor(entity.getFloor());
        dto.setZne(entity.getZne());
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
        if (!_suppressMProductShapeByMaxStoreProductShapeId && entity.getMProductShapeByMaxStoreProductShapeId() != null) {
            MProductShape relationEntity = entity.getMProductShapeByMaxStoreProductShapeId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductShapeDto relationDto = (MProductShapeDto)cachedDto;
                dto.setMProductShapeByMaxStoreProductShapeId(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationByMaxStoreProductShapeIdList().add(dto);
                }
            } else {
                MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationByMaxStoreProductShapeIdList();
                MProductShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProductShapeByMaxStoreProductShapeId(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationByMaxStoreProductShapeIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProductShapeByMaxStoreProductShapeId());
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
                    relationDto.getMLocationList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressMZone && entity.getMZone() != null) {
            MZone relationEntity = entity.getMZone();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MZoneDto relationDto = (MZoneDto)cachedDto;
                dto.setMZone(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
            } else {
                MZoneDtoMapper mapper = new MZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MZoneDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMZone(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMZone());
                }
            }
        };
        if (!_suppressMProductShapeByReplenishPProductShapeId && entity.getMProductShapeByReplenishPProductShapeId() != null) {
            MProductShape relationEntity = entity.getMProductShapeByReplenishPProductShapeId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductShapeDto relationDto = (MProductShapeDto)cachedDto;
                dto.setMProductShapeByReplenishPProductShapeId(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationByReplenishPProductShapeIdList().add(dto);
                }
            } else {
                MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationByReplenishPProductShapeIdList();
                MProductShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProductShapeByReplenishPProductShapeId(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationByReplenishPProductShapeIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProductShapeByReplenishPProductShapeId());
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
                    relationDto.getMLocationList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getMLocationList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
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
                    relationDto.getMLocationList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMLocationList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByAllocNgFlg && entity.getBClassDtlByAllocNgFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAllocNgFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAllocNgFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAllocNgFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAllocNgFlg());
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
        if (!_suppressBClassDtlByLocationType && entity.getBClassDtlByLocationType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLocationType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLocationType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLocationType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLocationType());
                }
            }
        };
        if (!_suppressBClassDtlByPickingLocationFlg && entity.getBClassDtlByPickingLocationFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPickingLocationFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPickingLocationFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPickingLocationFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPickingLocationFlg());
                }
            }
        };
        if (!_suppressTAllocInstBList && !entity.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TAllocInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstBList());
            dto.setTAllocInstBList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTInventoryBList && !entity.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TInventoryBDto> relationDtoList = mapper.mappingToDtoList(entity.getTInventoryBList());
            dto.setTInventoryBList(relationDtoList);
            if (reverseReference) {
                for (TInventoryBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTMoveInstBList && !entity.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TMoveInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstBList());
            dto.setTMoveInstBList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTMoveRecordBList && !entity.getTMoveRecordBList().isEmpty()) {
            TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TMoveRecordBDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveRecordBList());
            dto.setTMoveRecordBList(relationDtoList);
            if (reverseReference) {
                for (TMoveRecordBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !entity.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TReceivePlanBDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanBList());
            dto.setTReceivePlanBList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTShippingInstBList && !entity.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TShippingInstBDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstBList());
            dto.setTShippingInstBList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTStockList && !entity.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TStockDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockList());
            dto.setTStockList(relationDtoList);
            if (reverseReference) {
                for (TStockDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTStoreRecordBList && !entity.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TStoreRecordBDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordBList());
            dto.setTStoreRecordBList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordBDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !entity.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TTrpickdetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpickdetailList());
            dto.setTTrpickdetailList(relationDtoList);
            if (reverseReference) {
                for (TTrpickdetailDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !entity.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtInventoryInputProdDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtInventoryInputProdList());
            dto.setWHtInventoryInputProdList(relationDtoList);
            if (reverseReference) {
                for (WHtInventoryInputProdDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !entity.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveInspectionDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveInspectionList());
            dto.setWHtReceiveInspectionList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveInspectionDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !entity.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveStoreDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveStoreList());
            dto.setWHtReceiveStoreList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveStoreDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !entity.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtShippingPickingDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtShippingPickingList());
            dto.setWHtShippingPickingList(relationDtoList);
            if (reverseReference) {
                for (WHtShippingPickingDto relationDto : relationDtoList) {
                    relationDto.setMLocation(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MLocationDto> mappingToDtoList(List<MLocation> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MLocationDto> dtoList = new ArrayList<MLocationDto>();
        for (MLocation entity : entityList) {
            MLocationDto dto = mappingToDto(entity);
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
    public MLocation mappingToEntity(MLocationDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MLocation)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MLocation entity = new MLocation();
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getZoneId(), "zoneId")) {
            entity.setZoneId(dto.getZoneId());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLocationNm(), "locationNm")) {
            entity.setLocationNm(dto.getLocationNm());
        }
        if (needsMapping(dto, dto.getPickingLocationFlg(), "pickingLocationFlg")) {
            entity.setPickingLocationFlgAsPickingLocationFlg(CDef.PickingLocationFlg.codeOf(dto.getPickingLocationFlg()));
        }
        if (needsMapping(dto, dto.getPickingOrder(), "pickingOrder")) {
            entity.setPickingOrder(dto.getPickingOrder());
        }
        if (needsMapping(dto, dto.getLocationType(), "locationType")) {
            entity.setLocationTypeAsLocationType(CDef.LocationType.codeOf(dto.getLocationType()));
        }
        if (needsMapping(dto, dto.getAllocOrder(), "allocOrder")) {
            entity.setAllocOrder(dto.getAllocOrder());
        }
        if (needsMapping(dto, dto.getAllocNgFlg(), "allocNgFlg")) {
            entity.setAllocNgFlgAsAllcNgFlg(CDef.AllcNgFlg.codeOf(dto.getAllocNgFlg()));
        }
        if (needsMapping(dto, dto.getReplenishProductId(), "replenishProductId")) {
            entity.setReplenishProductId(dto.getReplenishProductId());
        }
        if (needsMapping(dto, dto.getReplenishStockTypeId(), "replenishStockTypeId")) {
            entity.setReplenishStockTypeId(dto.getReplenishStockTypeId());
        }
        if (needsMapping(dto, dto.getReplenishDepositId(), "replenishDepositId")) {
            entity.setReplenishDepositId(dto.getReplenishDepositId());
        }
        if (needsMapping(dto, dto.getReplenishPNum(), "replenishPNum")) {
            entity.setReplenishPNum(dto.getReplenishPNum());
        }
        if (needsMapping(dto, dto.getReplenishPProductShapeId(), "replenishPProductShapeId")) {
            entity.setReplenishPProductShapeId(dto.getReplenishPProductShapeId());
        }
        if (needsMapping(dto, dto.getMaxStoreNum(), "maxStoreNum")) {
            entity.setMaxStoreNum(dto.getMaxStoreNum());
        }
        if (needsMapping(dto, dto.getMaxStoreProductShapeId(), "maxStoreProductShapeId")) {
            entity.setMaxStoreProductShapeId(dto.getMaxStoreProductShapeId());
        }
        if (needsMapping(dto, dto.getLocgroup(), "locgroup")) {
            entity.setLocgroup(dto.getLocgroup());
        }
        if (needsMapping(dto, dto.getPalletecapacity(), "palletecapacity")) {
            entity.setPalletecapacity(dto.getPalletecapacity());
        }
        if (needsMapping(dto, dto.getCapacity(), "capacity")) {
            entity.setCapacity(dto.getCapacity());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getSplrevun(), "splrevun")) {
            entity.setSplrevun(dto.getSplrevun());
        }
        if (needsMapping(dto, dto.getSplrevctqa(), "splrevctqa")) {
            entity.setSplrevctqa(dto.getSplrevctqa());
        }
        if (needsMapping(dto, dto.getBssplpt(), "bssplpt")) {
            entity.setBssplpt(dto.getBssplpt());
        }
        if (needsMapping(dto, dto.getTosplmd(), "tosplmd")) {
            entity.setTosplmd(dto.getTosplmd());
        }
        if (needsMapping(dto, dto.getPresplmd(), "presplmd")) {
            entity.setPresplmd(dto.getPresplmd());
        }
        if (needsMapping(dto, dto.getVirtuallocflg(), "virtuallocflg")) {
            entity.setVirtuallocflg(dto.getVirtuallocflg());
        }
        if (needsMapping(dto, dto.getRootoutseq(), "rootoutseq")) {
            entity.setRootoutseq(dto.getRootoutseq());
        }
        if (needsMapping(dto, dto.getFloor(), "floor")) {
            entity.setFloor(dto.getFloor());
        }
        if (needsMapping(dto, dto.getZne(), "zne")) {
            entity.setZne(dto.getZne());
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
        if (!_suppressMProductShapeByMaxStoreProductShapeId && dto.getMProductShapeByMaxStoreProductShapeId() != null) {
            MProductShapeDto relationDto = dto.getMProductShapeByMaxStoreProductShapeId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProductShape relationEntity = (MProductShape)cachedEntity;
                entity.setMProductShapeByMaxStoreProductShapeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationByMaxStoreProductShapeIdList().add(entity);
                }
            } else {
                MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationByMaxStoreProductShapeIdList();
                MProductShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProductShapeByMaxStoreProductShapeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationByMaxStoreProductShapeIdList().add(entity);
                }
                if (instanceCache && entity.getMProductShapeByMaxStoreProductShapeId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProductShapeByMaxStoreProductShapeId());
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
                    relationEntity.getMLocationList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressMZone && dto.getMZone() != null) {
            MZoneDto relationDto = dto.getMZone();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MZone relationEntity = (MZone)cachedEntity;
                entity.setMZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
            } else {
                MZoneDtoMapper mapper = new MZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MZone relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
                if (instanceCache && entity.getMZone().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMZone());
                }
            }
        };
        if (!_suppressMProductShapeByReplenishPProductShapeId && dto.getMProductShapeByReplenishPProductShapeId() != null) {
            MProductShapeDto relationDto = dto.getMProductShapeByReplenishPProductShapeId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProductShape relationEntity = (MProductShape)cachedEntity;
                entity.setMProductShapeByReplenishPProductShapeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationByReplenishPProductShapeIdList().add(entity);
                }
            } else {
                MProductShapeDtoMapper mapper = new MProductShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationByReplenishPProductShapeIdList();
                MProductShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProductShapeByReplenishPProductShapeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationByReplenishPProductShapeIdList().add(entity);
                }
                if (instanceCache && entity.getMProductShapeByReplenishPProductShapeId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProductShapeByReplenishPProductShapeId());
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
                    relationEntity.getMLocationList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getMLocationList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
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
                    relationEntity.getMLocationList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMLocationList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMLocationList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressBClassDtlByAllocNgFlg && dto.getBClassDtlByAllocNgFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAllocNgFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAllocNgFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAllocNgFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAllocNgFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAllocNgFlg());
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
        if (!_suppressBClassDtlByLocationType && dto.getBClassDtlByLocationType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLocationType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLocationType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLocationType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLocationType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLocationType());
                }
            }
        };
        if (!_suppressBClassDtlByPickingLocationFlg && dto.getBClassDtlByPickingLocationFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPickingLocationFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPickingLocationFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPickingLocationFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPickingLocationFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPickingLocationFlg());
                }
            }
        };
        if (!_suppressTAllocInstBList && !dto.getTAllocInstBList().isEmpty()) {
            TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TAllocInstB> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstBList());
            entity.setTAllocInstBList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTInventoryBList && !dto.getTInventoryBList().isEmpty()) {
            TInventoryBDtoMapper mapper = new TInventoryBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TInventoryB> relationEntityList = mapper.mappingToEntityList(dto.getTInventoryBList());
            entity.setTInventoryBList(relationEntityList);
            if (reverseReference) {
                for (TInventoryB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTMoveInstBList && !dto.getTMoveInstBList().isEmpty()) {
            TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TMoveInstB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstBList());
            entity.setTMoveInstBList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTMoveRecordBList && !dto.getTMoveRecordBList().isEmpty()) {
            TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TMoveRecordB> relationEntityList = mapper.mappingToEntityList(dto.getTMoveRecordBList());
            entity.setTMoveRecordBList(relationEntityList);
            if (reverseReference) {
                for (TMoveRecordB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTReceivePlanBList && !dto.getTReceivePlanBList().isEmpty()) {
            TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TReceivePlanB> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanBList());
            entity.setTReceivePlanBList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTShippingInstBList && !dto.getTShippingInstBList().isEmpty()) {
            TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TShippingInstB> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstBList());
            entity.setTShippingInstBList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTStockList && !dto.getTStockList().isEmpty()) {
            TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TStock> relationEntityList = mapper.mappingToEntityList(dto.getTStockList());
            entity.setTStockList(relationEntityList);
            if (reverseReference) {
                for (TStock relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTStoreRecordBList && !dto.getTStoreRecordBList().isEmpty()) {
            TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TStoreRecordB> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordBList());
            entity.setTStoreRecordBList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordB relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !dto.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<TTrpickdetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrpickdetailList());
            entity.setTTrpickdetailList(relationEntityList);
            if (reverseReference) {
                for (TTrpickdetail relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressWHtInventoryInputProdList && !dto.getWHtInventoryInputProdList().isEmpty()) {
            WHtInventoryInputProdDtoMapper mapper = new WHtInventoryInputProdDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtInventoryInputProd> relationEntityList = mapper.mappingToEntityList(dto.getWHtInventoryInputProdList());
            entity.setWHtInventoryInputProdList(relationEntityList);
            if (reverseReference) {
                for (WHtInventoryInputProd relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressWHtReceiveInspectionList && !dto.getWHtReceiveInspectionList().isEmpty()) {
            WHtReceiveInspectionDtoMapper mapper = new WHtReceiveInspectionDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveInspection> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveInspectionList());
            entity.setWHtReceiveInspectionList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveInspection relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressWHtReceiveStoreList && !dto.getWHtReceiveStoreList().isEmpty()) {
            WHtReceiveStoreDtoMapper mapper = new WHtReceiveStoreDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtReceiveStore> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveStoreList());
            entity.setWHtReceiveStoreList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveStore relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
                }
            }
        };
        if (!_suppressWHtShippingPickingList && !dto.getWHtShippingPickingList().isEmpty()) {
            WHtShippingPickingDtoMapper mapper = new WHtShippingPickingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMLocation();
            List<WHtShippingPicking> relationEntityList = mapper.mappingToEntityList(dto.getWHtShippingPickingList());
            entity.setWHtShippingPickingList(relationEntityList);
            if (reverseReference) {
                for (WHtShippingPicking relationEntity : relationEntityList) {
                    relationEntity.setMLocation(entity);
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
    protected boolean needsMapping(MLocationDto dto, Object value, String propName) {
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
    public List<MLocation> mappingToEntityList(List<MLocationDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MLocation> entityList = new ArrayList<MLocation>();
        for (MLocationDto dto : dtoList) {
            MLocation entity = mappingToEntity(dto);
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
    public void suppressMProductShapeByMaxStoreProductShapeId() {
        _suppressMProductShapeByMaxStoreProductShapeId = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMZone() {
        _suppressMZone = true;
    }
    public void suppressMProductShapeByReplenishPProductShapeId() {
        _suppressMProductShapeByReplenishPProductShapeId = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressBClassDtlByAllocNgFlg() {
        _suppressBClassDtlByAllocNgFlg = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByLocationType() {
        _suppressBClassDtlByLocationType = true;
    }
    public void suppressBClassDtlByPickingLocationFlg() {
        _suppressBClassDtlByPickingLocationFlg = true;
    }
    public void suppressTAllocInstBList() {
        _suppressTAllocInstBList = true;
    }
    public void suppressTInventoryBList() {
        _suppressTInventoryBList = true;
    }
    public void suppressTMoveInstBList() {
        _suppressTMoveInstBList = true;
    }
    public void suppressTMoveRecordBList() {
        _suppressTMoveRecordBList = true;
    }
    public void suppressTReceivePlanBList() {
        _suppressTReceivePlanBList = true;
    }
    public void suppressTShippingInstBList() {
        _suppressTShippingInstBList = true;
    }
    public void suppressTStockList() {
        _suppressTStockList = true;
    }
    public void suppressTStoreRecordBList() {
        _suppressTStoreRecordBList = true;
    }
    public void suppressTTrpickdetailList() {
        _suppressTTrpickdetailList = true;
    }
    public void suppressWHtInventoryInputProdList() {
        _suppressWHtInventoryInputProdList = true;
    }
    public void suppressWHtReceiveInspectionList() {
        _suppressWHtReceiveInspectionList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    public void suppressWHtReceiveStoreList() {
        _suppressWHtReceiveStoreList = true;
    }
    public void suppressWHtShippingPickingList() {
        _suppressWHtShippingPickingList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProductShapeByMaxStoreProductShapeId();
        suppressMProduct();
        suppressMZone();
        suppressMProductShapeByReplenishPProductShapeId();
        suppressMStockType();
        suppressMCustomer();
        suppressMCenter();
        suppressBClassDtlByAllocNgFlg();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByLocationType();
        suppressBClassDtlByPickingLocationFlg();
        suppressTAllocInstBList();
        suppressTInventoryBList();
        suppressTMoveInstBList();
        suppressTMoveRecordBList();
        suppressTReceivePlanBList();
        suppressTShippingInstBList();
        suppressTStockList();
        suppressTStoreRecordBList();
        suppressTTrpickdetailList();
        suppressWHtInventoryInputProdList();
        suppressWHtReceiveInspectionList();
        suppressWHtReceiveNoPlanInspList();
        suppressWHtReceiveStoreList();
        suppressWHtShippingPickingList();
    }
    protected void doSuppressClear() { // internal
        _suppressMProductShapeByMaxStoreProductShapeId = false;
        _suppressMProduct = false;
        _suppressMZone = false;
        _suppressMProductShapeByReplenishPProductShapeId = false;
        _suppressMStockType = false;
        _suppressMCustomer = false;
        _suppressMCenter = false;
        _suppressBClassDtlByAllocNgFlg = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByLocationType = false;
        _suppressBClassDtlByPickingLocationFlg = false;
        _suppressTAllocInstBList = false;
        _suppressTInventoryBList = false;
        _suppressTMoveInstBList = false;
        _suppressTMoveRecordBList = false;
        _suppressTReceivePlanBList = false;
        _suppressTShippingInstBList = false;
        _suppressTStockList = false;
        _suppressTStoreRecordBList = false;
        _suppressTTrpickdetailList = false;
        _suppressWHtInventoryInputProdList = false;
        _suppressWHtReceiveInspectionList = false;
        _suppressWHtReceiveNoPlanInspList = false;
        _suppressWHtReceiveStoreList = false;
        _suppressWHtShippingPickingList = false;
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
    public MLocationDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MLocationDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MLocationDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MLocationDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MLocationDtoMapper reverseReference() {
        setReverseReference(true);
        return (MLocationDtoMapper)this;
    }
}
