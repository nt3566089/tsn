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
 * The DTO mapper of T_SHIPPING_INST_B as TABLE. <br>
 * 出荷指示ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_SHAPE, M_WAREHOUSE, T_LOT, T_ALLOC_INST_B, T_STORE_NO, M_STOCK_TYPE, M_LOCATION, T_SHIPPING_INST_H, M_PRODUCT, M_CUSTOMER, B_CLASS_DTL(ByErrorFlg), T_SHIPPING_INST_SPARE(AsOne)
 *
 * [referrer-table]
 *     T_PICKING_B, T_SHIPPING_INST_SPARE
 *
 * [foreign-property]
 *     mShape, mWarehouse, tLot, tAllocInstB, tStoreNo, mStockType, mLocation, tShippingInstH, mProduct, mCustomer, bClassDtlByErrorFlg, tShippingInstSpareAsOne
 *
 * [referrer-property]
 *     tPickingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstBDtoMapper implements DtoMapper<TShippingInstB, TShippingInstBDto>, Serializable {

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
    protected boolean _suppressMWarehouse;
    protected boolean _suppressTLot;
    protected boolean _suppressTAllocInstB;
    protected boolean _suppressTStoreNo;
    protected boolean _suppressMStockType;
    protected boolean _suppressMLocation;
    protected boolean _suppressTShippingInstH;
    protected boolean _suppressMProduct;
    protected boolean _suppressMCustomer;
    protected boolean _suppressBClassDtlByErrorFlg;
    protected boolean _suppressTPickingBList;
    protected boolean _suppressTShippingInstSpareAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTShippingInstBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TShippingInstBDto mappingToDto(TShippingInstB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TShippingInstBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstBDto dto = new TShippingInstBDto();
        dto.setShippingInstBId(entity.getShippingInstBId());
        dto.setShippingInstHId(entity.getShippingInstHId());
        dto.setLineNo(entity.getLineNo());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setWarehouseCd(entity.getWarehouseCd());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setLocationId(entity.getLocationId());
        dto.setLocationCd(entity.getLocationCd());
        dto.setDepositId(entity.getDepositId());
        dto.setDepositCd(entity.getDepositCd());
        dto.setLotId(entity.getLotId());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setStoreNoId(entity.getStoreNoId());
        dto.setStoreLabelNo(entity.getStoreLabelNo());
        dto.setShapeId(entity.getShapeId());
        dto.setShapeCd(entity.getShapeCd());
        dto.setUnitNum(entity.getUnitNum());
        dto.setInstNum(entity.getInstNum());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setAllocInstBId(entity.getAllocInstBId());
        dto.setAllocNum(entity.getAllocNum());
        dto.setStockOutNum(entity.getStockOutNum());
        dto.setUnitPrice(entity.getUnitPrice());
        dto.setPrice(entity.getPrice());
        dto.setTax(entity.getTax());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MShapeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMShape(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMShape());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MWarehouseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMWarehouse(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMWarehouse());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TLotDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTLot(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTLot());
                }
            }
        };
        if (!_suppressTAllocInstB && entity.getTAllocInstB() != null) {
            TAllocInstB relationEntity = entity.getTAllocInstB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TAllocInstBDto relationDto = (TAllocInstBDto)cachedDto;
                dto.setTAllocInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TAllocInstBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTAllocInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTAllocInstB());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TStoreNoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreNo(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreNo());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TShippingInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingInstH());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
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
                    relationDto.getTShippingInstBList().add(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.getTShippingInstBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
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
        if (!_suppressTPickingBList && !entity.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstB();
            List<TPickingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingBList());
            dto.setTPickingBList(relationDtoList);
            if (reverseReference) {
                for (TPickingBDto relationDto : relationDtoList) {
                    relationDto.setTShippingInstB(dto);
                }
            }
        };
        if (!_suppressTShippingInstSpareAsOne && entity.getTShippingInstSpareAsOne() != null) {
            TShippingInstSpare relationEntity = entity.getTShippingInstSpareAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TShippingInstSpareDto relationDto = (TShippingInstSpareDto)cachedDto;
                dto.setTShippingInstSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTShippingInstB(dto);
                }
            } else {
                TShippingInstSpareDtoMapper mapper = new TShippingInstSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstB();
                TShippingInstSpareDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTShippingInstSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTShippingInstB(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTShippingInstSpareAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TShippingInstBDto> mappingToDtoList(List<TShippingInstB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TShippingInstBDto> dtoList = new ArrayList<TShippingInstBDto>();
        for (TShippingInstB entity : entityList) {
            TShippingInstBDto dto = mappingToDto(entity);
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
    public TShippingInstB mappingToEntity(TShippingInstBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TShippingInstB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TShippingInstB entity = new TShippingInstB();
        if (needsMapping(dto, dto.getShippingInstBId(), "shippingInstBId")) {
            entity.setShippingInstBId(dto.getShippingInstBId());
        }
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getWarehouseCd(), "warehouseCd")) {
            entity.setWarehouseCd(dto.getWarehouseCd());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getDepositId(), "depositId")) {
            entity.setDepositId(dto.getDepositId());
        }
        if (needsMapping(dto, dto.getDepositCd(), "depositCd")) {
            entity.setDepositCd(dto.getDepositCd());
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
        if (needsMapping(dto, dto.getStoreNoId(), "storeNoId")) {
            entity.setStoreNoId(dto.getStoreNoId());
        }
        if (needsMapping(dto, dto.getStoreLabelNo(), "storeLabelNo")) {
            entity.setStoreLabelNo(dto.getStoreLabelNo());
        }
        if (needsMapping(dto, dto.getShapeId(), "shapeId")) {
            entity.setShapeId(dto.getShapeId());
        }
        if (needsMapping(dto, dto.getShapeCd(), "shapeCd")) {
            entity.setShapeCd(dto.getShapeCd());
        }
        if (needsMapping(dto, dto.getUnitNum(), "unitNum")) {
            entity.setUnitNum(dto.getUnitNum());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlgAsErrorFlg(CDef.ErrorFlg.codeOf(dto.getErrorFlg()));
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getAllocInstBId(), "allocInstBId")) {
            entity.setAllocInstBId(dto.getAllocInstBId());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getStockOutNum(), "stockOutNum")) {
            entity.setStockOutNum(dto.getStockOutNum());
        }
        if (needsMapping(dto, dto.getUnitPrice(), "unitPrice")) {
            entity.setUnitPrice(dto.getUnitPrice());
        }
        if (needsMapping(dto, dto.getPrice(), "price")) {
            entity.setPrice(dto.getPrice());
        }
        if (needsMapping(dto, dto.getTax(), "tax")) {
            entity.setTax(dto.getTax());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MShapeDtoMapper mapper = new MShapeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MShape relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMShape(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMShape().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMShape());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MWarehouseDtoMapper mapper = new MWarehouseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MWarehouse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMWarehouse(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMWarehouse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMWarehouse());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                TLotDtoMapper mapper = new TLotDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TLot relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTLot(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getTLot().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTLot());
                }
            }
        };
        if (!_suppressTAllocInstB && dto.getTAllocInstB() != null) {
            TAllocInstBDto relationDto = dto.getTAllocInstB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TAllocInstB relationEntity = (TAllocInstB)cachedEntity;
                entity.setTAllocInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TAllocInstB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTAllocInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getTAllocInstB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTAllocInstB());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                TStoreNoDtoMapper mapper = new TStoreNoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TStoreNo relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreNo(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getTStoreNo().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreNo());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                TShippingInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getTShippingInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingInstH());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
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
                    relationEntity.getTShippingInstBList().add(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstBList();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.getTShippingInstBList().add(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
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
        if (!_suppressTPickingBList && !dto.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTShippingInstB();
            List<TPickingB> relationEntityList = mapper.mappingToEntityList(dto.getTPickingBList());
            entity.setTPickingBList(relationEntityList);
            if (reverseReference) {
                for (TPickingB relationEntity : relationEntityList) {
                    relationEntity.setTShippingInstB(entity);
                }
            }
        };
        if (!_suppressTShippingInstSpareAsOne && dto.getTShippingInstSpareAsOne() != null) {
            TShippingInstSpareDto relationDto = dto.getTShippingInstSpareAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TShippingInstSpare relationEntity = (TShippingInstSpare)cachedEntity;
                entity.setTShippingInstSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTShippingInstB(entity);
                }
            } else {
                TShippingInstSpareDtoMapper mapper = new TShippingInstSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTShippingInstB();
                TShippingInstSpare relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTShippingInstSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTShippingInstB(entity);
                }
                if (instanceCache && entity.getTShippingInstSpareAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTShippingInstSpareAsOne());
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
    protected boolean needsMapping(TShippingInstBDto dto, Object value, String propName) {
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
    public List<TShippingInstB> mappingToEntityList(List<TShippingInstBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TShippingInstB> entityList = new ArrayList<TShippingInstB>();
        for (TShippingInstBDto dto : dtoList) {
            TShippingInstB entity = mappingToEntity(dto);
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
    public void suppressMWarehouse() {
        _suppressMWarehouse = true;
    }
    public void suppressTLot() {
        _suppressTLot = true;
    }
    public void suppressTAllocInstB() {
        _suppressTAllocInstB = true;
    }
    public void suppressTStoreNo() {
        _suppressTStoreNo = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressTShippingInstH() {
        _suppressTShippingInstH = true;
    }
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressBClassDtlByErrorFlg() {
        _suppressBClassDtlByErrorFlg = true;
    }
    public void suppressTPickingBList() {
        _suppressTPickingBList = true;
    }
    public void suppressTShippingInstSpareAsOne() {
        _suppressTShippingInstSpareAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressMShape();
        suppressMWarehouse();
        suppressTLot();
        suppressTAllocInstB();
        suppressTStoreNo();
        suppressMStockType();
        suppressMLocation();
        suppressTShippingInstH();
        suppressMProduct();
        suppressMCustomer();
        suppressBClassDtlByErrorFlg();
        suppressTPickingBList();
        suppressTShippingInstSpareAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressMShape = false;
        _suppressMWarehouse = false;
        _suppressTLot = false;
        _suppressTAllocInstB = false;
        _suppressTStoreNo = false;
        _suppressMStockType = false;
        _suppressMLocation = false;
        _suppressTShippingInstH = false;
        _suppressMProduct = false;
        _suppressMCustomer = false;
        _suppressBClassDtlByErrorFlg = false;
        _suppressTPickingBList = false;
        _suppressTShippingInstSpareAsOne = false;
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
    public TShippingInstBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TShippingInstBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TShippingInstBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TShippingInstBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TShippingInstBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TShippingInstBDtoMapper)this;
    }
}
