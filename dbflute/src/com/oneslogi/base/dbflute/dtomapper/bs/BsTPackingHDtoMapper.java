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
 * The DTO mapper of T_PACKING_H as TABLE. <br>
 * 梱包ヘッダ
 * <pre>
 * [primary-key]
 *     PACKING_H_ID
 *
 * [column]
 *     PACKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PACKING_STATUS, ALLOC_INST_H_ID, PICKING_H_ID, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, BOX_ID, GROSS_WEIGHT, TOTAL_VOLUME, MIXED_FLG, MULTI_PIC_FLG, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO, SEEDING_NO, LOADING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_PICKING_H, M_CENTER, M_BOX, T_ALLOC_INST_H, M_CLIENT, M_PROCESS_TYPE, B_USER(ByUpdUser), B_CLASS_DTL(ByLoadingFlg), T_PACKING_R(AsOne)
 *
 * [referrer-table]
 *     T_PACKING_B, T_PIC_MTHD_RCMD_CART, T_PACKING_R
 *
 * [foreign-property]
 *     tPickingH, mCenter, mBox, tAllocInstH, mClient, mProcessType, bUserByUpdUser, bClassDtlByLoadingFlg, bClassDtlByMixedFlg, bClassDtlByMultiPicFlg, bClassDtlByPackingStatus, tPackingRAsOne
 *
 * [referrer-property]
 *     tPackingBList, tPicMthdRcmdCartList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPackingHDtoMapper implements DtoMapper<TPackingH, TPackingHDto>, Serializable {

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
    protected boolean _suppressTPickingH;
    protected boolean _suppressMCenter;
    protected boolean _suppressMBox;
    protected boolean _suppressTAllocInstH;
    protected boolean _suppressMClient;
    protected boolean _suppressMProcessType;
    protected boolean _suppressBUserByUpdUser;
    protected boolean _suppressBClassDtlByLoadingFlg;
    protected boolean _suppressBClassDtlByMixedFlg;
    protected boolean _suppressBClassDtlByMultiPicFlg;
    protected boolean _suppressBClassDtlByPackingStatus;
    protected boolean _suppressTPackingBList;
    protected boolean _suppressTPackingRAsOne;
    protected boolean _suppressTPicMthdRcmdCartList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackingHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTPackingHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TPackingHDto mappingToDto(TPackingH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TPackingHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPackingHDto dto = new TPackingHDto();
        dto.setPackingHId(entity.getPackingHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setPackingStatus(entity.getPackingStatus());
        dto.setAllocInstHId(entity.getAllocInstHId());
        dto.setPickingHId(entity.getPickingHId());
        dto.setShippingPackingNo(entity.getShippingPackingNo());
        dto.setCarrierTraceNum(entity.getCarrierTraceNum());
        dto.setBoxId(entity.getBoxId());
        dto.setGrossWeight(entity.getGrossWeight());
        dto.setTotalVolume(entity.getTotalVolume());
        dto.setMixedFlg(entity.getMixedFlg());
        dto.setMultiPicFlg(entity.getMultiPicFlg());
        dto.setCartNo(entity.getCartNo());
        dto.setBucketColNo(entity.getBucketColNo());
        dto.setBucketRowNo(entity.getBucketRowNo());
        dto.setSeedingNo(entity.getSeedingNo());
        dto.setLoadingFlg(entity.getLoadingFlg());
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
        if (!_suppressTPickingH && entity.getTPickingH() != null) {
            TPickingH relationEntity = entity.getTPickingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPickingHDto relationDto = (TPickingHDto)cachedDto;
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                TPickingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPickingH(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPickingH());
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
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMBox && entity.getMBox() != null) {
            MBox relationEntity = entity.getMBox();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MBoxDto relationDto = (MBoxDto)cachedDto;
                dto.setMBox(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MBoxDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMBox(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMBox());
                }
            }
        };
        if (!_suppressTAllocInstH && entity.getTAllocInstH() != null) {
            TAllocInstH relationEntity = entity.getTAllocInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TAllocInstHDto relationDto = (TAllocInstHDto)cachedDto;
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                TAllocInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTAllocInstH());
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
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
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
                    relationDto.getTPackingHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressBUserByUpdUser && entity.getBUserByUpdUser() != null) {
            BUser relationEntity = entity.getBUserByUpdUser();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BUserDto relationDto = (BUserDto)cachedDto;
                dto.setBUserByUpdUser(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHByUpdUserList().add(dto);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHByUpdUserList();
                BUserDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBUserByUpdUser(relationDto);
                if (reverseReference) {
                    relationDto.getTPackingHByUpdUserList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBUserByUpdUser());
                }
            }
        };
        if (!_suppressBClassDtlByLoadingFlg && entity.getBClassDtlByLoadingFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLoadingFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLoadingFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLoadingFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLoadingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMixedFlg && entity.getBClassDtlByMixedFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMixedFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMixedFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMixedFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMixedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMultiPicFlg && entity.getBClassDtlByMultiPicFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMultiPicFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMultiPicFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMultiPicFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMultiPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingStatus && entity.getBClassDtlByPackingStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPackingStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPackingStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPackingStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPackingStatus());
                }
            }
        };
        if (!_suppressTPackingBList && !entity.getTPackingBList().isEmpty()) {
            TPackingBDtoMapper mapper = new TPackingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPackingH();
            List<TPackingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingBList());
            dto.setTPackingBList(relationDtoList);
            if (reverseReference) {
                for (TPackingBDto relationDto : relationDtoList) {
                    relationDto.setTPackingH(dto);
                }
            }
        };
        if (!_suppressTPackingRAsOne && entity.getTPackingRAsOne() != null) {
            TPackingR relationEntity = entity.getTPackingRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPackingRDto relationDto = (TPackingRDto)cachedDto;
                dto.setTPackingRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTPackingH(dto);
                }
            } else {
                TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingH();
                TPackingRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPackingRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTPackingH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPackingRAsOne());
                }
            }
        };
        if (!_suppressTPicMthdRcmdCartList && !entity.getTPicMthdRcmdCartList().isEmpty()) {
            TPicMthdRcmdCartDtoMapper mapper = new TPicMthdRcmdCartDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPackingH();
            List<TPicMthdRcmdCartDto> relationDtoList = mapper.mappingToDtoList(entity.getTPicMthdRcmdCartList());
            dto.setTPicMthdRcmdCartList(relationDtoList);
            if (reverseReference) {
                for (TPicMthdRcmdCartDto relationDto : relationDtoList) {
                    relationDto.setTPackingH(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TPackingHDto> mappingToDtoList(List<TPackingH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TPackingHDto> dtoList = new ArrayList<TPackingHDto>();
        for (TPackingH entity : entityList) {
            TPackingHDto dto = mappingToDto(entity);
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
    public TPackingH mappingToEntity(TPackingHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TPackingH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPackingH entity = new TPackingH();
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
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
        if (needsMapping(dto, dto.getPackingStatus(), "packingStatus")) {
            entity.setPackingStatusAsPackingStatus(CDef.PackingStatus.codeOf(dto.getPackingStatus()));
        }
        if (needsMapping(dto, dto.getAllocInstHId(), "allocInstHId")) {
            entity.setAllocInstHId(dto.getAllocInstHId());
        }
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getShippingPackingNo(), "shippingPackingNo")) {
            entity.setShippingPackingNo(dto.getShippingPackingNo());
        }
        if (needsMapping(dto, dto.getCarrierTraceNum(), "carrierTraceNum")) {
            entity.setCarrierTraceNum(dto.getCarrierTraceNum());
        }
        if (needsMapping(dto, dto.getBoxId(), "boxId")) {
            entity.setBoxId(dto.getBoxId());
        }
        if (needsMapping(dto, dto.getGrossWeight(), "grossWeight")) {
            entity.setGrossWeight(dto.getGrossWeight());
        }
        if (needsMapping(dto, dto.getTotalVolume(), "totalVolume")) {
            entity.setTotalVolume(dto.getTotalVolume());
        }
        if (needsMapping(dto, dto.getMixedFlg(), "mixedFlg")) {
            entity.setMixedFlgAsMixedFlg(CDef.MixedFlg.codeOf(dto.getMixedFlg()));
        }
        if (needsMapping(dto, dto.getMultiPicFlg(), "multiPicFlg")) {
            entity.setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.codeOf(dto.getMultiPicFlg()));
        }
        if (needsMapping(dto, dto.getCartNo(), "cartNo")) {
            entity.setCartNo(dto.getCartNo());
        }
        if (needsMapping(dto, dto.getBucketColNo(), "bucketColNo")) {
            entity.setBucketColNo(dto.getBucketColNo());
        }
        if (needsMapping(dto, dto.getBucketRowNo(), "bucketRowNo")) {
            entity.setBucketRowNo(dto.getBucketRowNo());
        }
        if (needsMapping(dto, dto.getSeedingNo(), "seedingNo")) {
            entity.setSeedingNo(dto.getSeedingNo());
        }
        if (needsMapping(dto, dto.getLoadingFlg(), "loadingFlg")) {
            entity.setLoadingFlgAsLoadingFlg(CDef.LoadingFlg.codeOf(dto.getLoadingFlg()));
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
        if (!_suppressTPickingH && dto.getTPickingH() != null) {
            TPickingHDto relationDto = dto.getTPickingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPickingH relationEntity = (TPickingH)cachedEntity;
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                TPickingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPickingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getTPickingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPickingH());
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
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMBox && dto.getMBox() != null) {
            MBoxDto relationDto = dto.getMBox();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MBox relationEntity = (MBox)cachedEntity;
                entity.setMBox(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MBox relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMBox(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getMBox().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMBox());
                }
            }
        };
        if (!_suppressTAllocInstH && dto.getTAllocInstH() != null) {
            TAllocInstHDto relationDto = dto.getTAllocInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TAllocInstH relationEntity = (TAllocInstH)cachedEntity;
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                TAllocInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getTAllocInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTAllocInstH());
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
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
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
                    relationEntity.getTPackingHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressBUserByUpdUser && dto.getBUserByUpdUser() != null) {
            BUserDto relationDto = dto.getBUserByUpdUser();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BUser relationEntity = (BUser)cachedEntity;
                entity.setBUserByUpdUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHByUpdUserList().add(entity);
                }
            } else {
                BUserDtoMapper mapper = new BUserDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingHByUpdUserList();
                BUser relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBUserByUpdUser(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPackingHByUpdUserList().add(entity);
                }
                if (instanceCache && entity.getBUserByUpdUser().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBUserByUpdUser());
                }
            }
        };
        if (!_suppressBClassDtlByLoadingFlg && dto.getBClassDtlByLoadingFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLoadingFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLoadingFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLoadingFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLoadingFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLoadingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMixedFlg && dto.getBClassDtlByMixedFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMixedFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMixedFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMixedFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMixedFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMixedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMultiPicFlg && dto.getBClassDtlByMultiPicFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMultiPicFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMultiPicFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMultiPicFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMultiPicFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMultiPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingStatus && dto.getBClassDtlByPackingStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPackingStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPackingStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPackingStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPackingStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPackingStatus());
                }
            }
        };
        if (!_suppressTPackingBList && !dto.getTPackingBList().isEmpty()) {
            TPackingBDtoMapper mapper = new TPackingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPackingH();
            List<TPackingB> relationEntityList = mapper.mappingToEntityList(dto.getTPackingBList());
            entity.setTPackingBList(relationEntityList);
            if (reverseReference) {
                for (TPackingB relationEntity : relationEntityList) {
                    relationEntity.setTPackingH(entity);
                }
            }
        };
        if (!_suppressTPackingRAsOne && dto.getTPackingRAsOne() != null) {
            TPackingRDto relationDto = dto.getTPackingRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPackingR relationEntity = (TPackingR)cachedEntity;
                entity.setTPackingRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPackingH(entity);
                }
            } else {
                TPackingRDtoMapper mapper = new TPackingRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPackingH();
                TPackingR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPackingRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPackingH(entity);
                }
                if (instanceCache && entity.getTPackingRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPackingRAsOne());
                }
            }
        };
        if (!_suppressTPicMthdRcmdCartList && !dto.getTPicMthdRcmdCartList().isEmpty()) {
            TPicMthdRcmdCartDtoMapper mapper = new TPicMthdRcmdCartDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPackingH();
            List<TPicMthdRcmdCart> relationEntityList = mapper.mappingToEntityList(dto.getTPicMthdRcmdCartList());
            entity.setTPicMthdRcmdCartList(relationEntityList);
            if (reverseReference) {
                for (TPicMthdRcmdCart relationEntity : relationEntityList) {
                    relationEntity.setTPackingH(entity);
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
    protected boolean needsMapping(TPackingHDto dto, Object value, String propName) {
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
    public List<TPackingH> mappingToEntityList(List<TPackingHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TPackingH> entityList = new ArrayList<TPackingH>();
        for (TPackingHDto dto : dtoList) {
            TPackingH entity = mappingToEntity(dto);
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
    public void suppressTPickingH() {
        _suppressTPickingH = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMBox() {
        _suppressMBox = true;
    }
    public void suppressTAllocInstH() {
        _suppressTAllocInstH = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressBUserByUpdUser() {
        _suppressBUserByUpdUser = true;
    }
    public void suppressBClassDtlByLoadingFlg() {
        _suppressBClassDtlByLoadingFlg = true;
    }
    public void suppressBClassDtlByMixedFlg() {
        _suppressBClassDtlByMixedFlg = true;
    }
    public void suppressBClassDtlByMultiPicFlg() {
        _suppressBClassDtlByMultiPicFlg = true;
    }
    public void suppressBClassDtlByPackingStatus() {
        _suppressBClassDtlByPackingStatus = true;
    }
    public void suppressTPackingBList() {
        _suppressTPackingBList = true;
    }
    public void suppressTPackingRAsOne() {
        _suppressTPackingRAsOne = true;
    }
    public void suppressTPicMthdRcmdCartList() {
        _suppressTPicMthdRcmdCartList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTPickingH();
        suppressMCenter();
        suppressMBox();
        suppressTAllocInstH();
        suppressMClient();
        suppressMProcessType();
        suppressBUserByUpdUser();
        suppressBClassDtlByLoadingFlg();
        suppressBClassDtlByMixedFlg();
        suppressBClassDtlByMultiPicFlg();
        suppressBClassDtlByPackingStatus();
        suppressTPackingBList();
        suppressTPackingRAsOne();
        suppressTPicMthdRcmdCartList();
    }
    protected void doSuppressClear() { // internal
        _suppressTPickingH = false;
        _suppressMCenter = false;
        _suppressMBox = false;
        _suppressTAllocInstH = false;
        _suppressMClient = false;
        _suppressMProcessType = false;
        _suppressBUserByUpdUser = false;
        _suppressBClassDtlByLoadingFlg = false;
        _suppressBClassDtlByMixedFlg = false;
        _suppressBClassDtlByMultiPicFlg = false;
        _suppressBClassDtlByPackingStatus = false;
        _suppressTPackingBList = false;
        _suppressTPackingRAsOne = false;
        _suppressTPicMthdRcmdCartList = false;
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
    public TPackingHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TPackingHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TPackingHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TPackingHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TPackingHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TPackingHDtoMapper)this;
    }
}
