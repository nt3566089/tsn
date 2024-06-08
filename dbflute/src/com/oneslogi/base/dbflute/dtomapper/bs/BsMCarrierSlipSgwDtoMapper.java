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
 * The DTO mapper of M_CARRIER_SLIP_SGW as TABLE. <br>
 * 佐川送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_SGW_ID
 *
 * [column]
 *     CARRIER_SLIP_SGW_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, SLIP_CUSTOMER_CD, WEB_API_REQUEST_URL, CUSTOMER_ID, LOGIN_PASSWORD, DEPT_CONSIGNOR_NM, CONSIGNOR_TEL_NO, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_NM1, SLIP_CLIENT_NM2, SLIP_SHAPE_CD, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, TRANSPORT_TYPE_SPEED, TRANSPORT_TYPE_ITEM, SETTLEMENT_TYPE, SEAL_TYPE1, SEAL_TYPE2, SEAL_TYPE3, COD_CLS, SEND_CD, API_OKURI_CODE, API_BINSYU_CODE, API_DAIBIKI_FLG, API_DAIBIKI_TYPE, API_WEIGHT_CD_1, API_WEIGHT_CD_2, API_EIDOME_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_SGW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CENTER_CLASS_DTL(ByApiBinsyuCode), B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer-table]
 *     M_DELIVERY_COURSE
 *
 * [foreign-property]
 *     mCenter, mCenterClassDtlByApiBinsyuCode, mCenterClassDtlByApiDaibikiFlg, mCenterClassDtlByApiDaibikiType, mCenterClassDtlByApiEidomeFlg, mCenterClassDtlByApiWeightCd1, mCenterClassDtlByApiWeightCd2, bClassDtlByCharacterCd, bClassDtlByCodCls, bClassDtlByDelFlg, mCenterClassDtlBySealType1, mCenterClassDtlBySealType2, mCenterClassDtlBySealType3, bClassDtlBySettlementType, mCenterClassDtlBySlipShapeCd, mCenterClassDtlByTransportTypeItem, mCenterClassDtlByTransportTypeSpeed
 *
 * [referrer-property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipSgwDtoMapper implements DtoMapper<MCarrierSlipSgw, MCarrierSlipSgwDto>, Serializable {

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
    protected boolean _suppressMCenterClassDtlByApiBinsyuCode;
    protected boolean _suppressMCenterClassDtlByApiDaibikiFlg;
    protected boolean _suppressMCenterClassDtlByApiDaibikiType;
    protected boolean _suppressMCenterClassDtlByApiEidomeFlg;
    protected boolean _suppressMCenterClassDtlByApiWeightCd1;
    protected boolean _suppressMCenterClassDtlByApiWeightCd2;
    protected boolean _suppressBClassDtlByCharacterCd;
    protected boolean _suppressBClassDtlByCodCls;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressMCenterClassDtlBySealType1;
    protected boolean _suppressMCenterClassDtlBySealType2;
    protected boolean _suppressMCenterClassDtlBySealType3;
    protected boolean _suppressBClassDtlBySettlementType;
    protected boolean _suppressMCenterClassDtlBySlipShapeCd;
    protected boolean _suppressMCenterClassDtlByTransportTypeItem;
    protected boolean _suppressMCenterClassDtlByTransportTypeSpeed;
    protected boolean _suppressMDeliveryCourseList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipSgwDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierSlipSgwDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierSlipSgwDto mappingToDto(MCarrierSlipSgw entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierSlipSgwDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipSgwDto dto = new MCarrierSlipSgwDto();
        dto.setCarrierSlipSgwId(entity.getCarrierSlipSgwId());
        dto.setCenterId(entity.getCenterId());
        dto.setTagType(entity.getTagType());
        dto.setTagNm(entity.getTagNm());
        dto.setCharacterCd(entity.getCharacterCd());
        dto.setSlipCustomerCd(entity.getSlipCustomerCd());
        dto.setWebApiRequestUrl(entity.getWebApiRequestUrl());
        dto.setCustomerId(entity.getCustomerId());
        dto.setLoginPassword(entity.getLoginPassword());
        dto.setDeptConsignorNm(entity.getDeptConsignorNm());
        dto.setConsignorTelNo(entity.getConsignorTelNo());
        dto.setSlipClientTelNo(entity.getSlipClientTelNo());
        dto.setSlipClientZipCd(entity.getSlipClientZipCd());
        dto.setSlipClientAddress1(entity.getSlipClientAddress1());
        dto.setSlipClientAddress2(entity.getSlipClientAddress2());
        dto.setSlipClientNm1(entity.getSlipClientNm1());
        dto.setSlipClientNm2(entity.getSlipClientNm2());
        dto.setSlipShapeCd(entity.getSlipShapeCd());
        dto.setSlipItemNm1(entity.getSlipItemNm1());
        dto.setSlipItemNm2(entity.getSlipItemNm2());
        dto.setSlipItemNm3(entity.getSlipItemNm3());
        dto.setSlipItemNm4(entity.getSlipItemNm4());
        dto.setSlipItemNm5(entity.getSlipItemNm5());
        dto.setTransportTypeSpeed(entity.getTransportTypeSpeed());
        dto.setTransportTypeItem(entity.getTransportTypeItem());
        dto.setSettlementType(entity.getSettlementType());
        dto.setSealType1(entity.getSealType1());
        dto.setSealType2(entity.getSealType2());
        dto.setSealType3(entity.getSealType3());
        dto.setCodCls(entity.getCodCls());
        dto.setSendCd(entity.getSendCd());
        dto.setApiOkuriCode(entity.getApiOkuriCode());
        dto.setApiBinsyuCode(entity.getApiBinsyuCode());
        dto.setApiDaibikiFlg(entity.getApiDaibikiFlg());
        dto.setApiDaibikiType(entity.getApiDaibikiType());
        dto.setApiWeightCd1(entity.getApiWeightCd1());
        dto.setApiWeightCd2(entity.getApiWeightCd2());
        dto.setApiEidomeFlg(entity.getApiEidomeFlg());
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
                    relationDto.getMCarrierSlipSgwList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipSgwList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierSlipSgwList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiBinsyuCode && entity.getMCenterClassDtlByApiBinsyuCode() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiBinsyuCode();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiBinsyuCode(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiBinsyuCode(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiBinsyuCode());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiDaibikiFlg && entity.getMCenterClassDtlByApiDaibikiFlg() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiDaibikiFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiDaibikiFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiDaibikiFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiDaibikiFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiDaibikiType && entity.getMCenterClassDtlByApiDaibikiType() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiDaibikiType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiDaibikiType(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiDaibikiType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiDaibikiType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiEidomeFlg && entity.getMCenterClassDtlByApiEidomeFlg() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiEidomeFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiEidomeFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiEidomeFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiEidomeFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiWeightCd1 && entity.getMCenterClassDtlByApiWeightCd1() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiWeightCd1();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiWeightCd1(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiWeightCd1(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiWeightCd1());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiWeightCd2 && entity.getMCenterClassDtlByApiWeightCd2() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByApiWeightCd2();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByApiWeightCd2(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByApiWeightCd2(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByApiWeightCd2());
                }
            }
        };
        if (!_suppressBClassDtlByCharacterCd && entity.getBClassDtlByCharacterCd() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCharacterCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCharacterCd(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCharacterCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCharacterCd());
                }
            }
        };
        if (!_suppressBClassDtlByCodCls && entity.getBClassDtlByCodCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCodCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCodCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCodCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCodCls());
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
        if (!_suppressMCenterClassDtlBySealType1 && entity.getMCenterClassDtlBySealType1() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlBySealType1();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlBySealType1(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlBySealType1(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlBySealType1());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySealType2 && entity.getMCenterClassDtlBySealType2() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlBySealType2();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlBySealType2(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlBySealType2(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlBySealType2());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySealType3 && entity.getMCenterClassDtlBySealType3() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlBySealType3();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlBySealType3(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlBySealType3(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlBySealType3());
                }
            }
        };
        if (!_suppressBClassDtlBySettlementType && entity.getBClassDtlBySettlementType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySettlementType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySettlementType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySettlementType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySettlementType());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySlipShapeCd && entity.getMCenterClassDtlBySlipShapeCd() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlBySlipShapeCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlBySlipShapeCd(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlBySlipShapeCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlBySlipShapeCd());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTransportTypeItem && entity.getMCenterClassDtlByTransportTypeItem() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByTransportTypeItem();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByTransportTypeItem(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByTransportTypeItem(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByTransportTypeItem());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTransportTypeSpeed && entity.getMCenterClassDtlByTransportTypeSpeed() != null) {
            MCenterClassDtl relationEntity = entity.getMCenterClassDtlByTransportTypeSpeed();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlDto relationDto = (MCenterClassDtlDto)cachedDto;
                dto.setMCenterClassDtlByTransportTypeSpeed(relationDto);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlByTransportTypeSpeed(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlByTransportTypeSpeed());
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !entity.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierSlipSgw();
            List<MDeliveryCourseDto> relationDtoList = mapper.mappingToDtoList(entity.getMDeliveryCourseList());
            dto.setMDeliveryCourseList(relationDtoList);
            if (reverseReference) {
                for (MDeliveryCourseDto relationDto : relationDtoList) {
                    relationDto.setMCarrierSlipSgw(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierSlipSgwDto> mappingToDtoList(List<MCarrierSlipSgw> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierSlipSgwDto> dtoList = new ArrayList<MCarrierSlipSgwDto>();
        for (MCarrierSlipSgw entity : entityList) {
            MCarrierSlipSgwDto dto = mappingToDto(entity);
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
    public MCarrierSlipSgw mappingToEntity(MCarrierSlipSgwDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrierSlipSgw)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipSgw entity = new MCarrierSlipSgw();
        if (needsMapping(dto, dto.getCarrierSlipSgwId(), "carrierSlipSgwId")) {
            entity.setCarrierSlipSgwId(dto.getCarrierSlipSgwId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getTagType(), "tagType")) {
            entity.setTagType(dto.getTagType());
        }
        if (needsMapping(dto, dto.getTagNm(), "tagNm")) {
            entity.setTagNm(dto.getTagNm());
        }
        if (needsMapping(dto, dto.getCharacterCd(), "characterCd")) {
            entity.setCharacterCdAsCharacterCd(CDef.CharacterCd.codeOf(dto.getCharacterCd()));
        }
        if (needsMapping(dto, dto.getSlipCustomerCd(), "slipCustomerCd")) {
            entity.setSlipCustomerCd(dto.getSlipCustomerCd());
        }
        if (needsMapping(dto, dto.getWebApiRequestUrl(), "webApiRequestUrl")) {
            entity.setWebApiRequestUrl(dto.getWebApiRequestUrl());
        }
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
        }
        if (needsMapping(dto, dto.getLoginPassword(), "loginPassword")) {
            entity.setLoginPassword(dto.getLoginPassword());
        }
        if (needsMapping(dto, dto.getDeptConsignorNm(), "deptConsignorNm")) {
            entity.setDeptConsignorNm(dto.getDeptConsignorNm());
        }
        if (needsMapping(dto, dto.getConsignorTelNo(), "consignorTelNo")) {
            entity.setConsignorTelNo(dto.getConsignorTelNo());
        }
        if (needsMapping(dto, dto.getSlipClientTelNo(), "slipClientTelNo")) {
            entity.setSlipClientTelNo(dto.getSlipClientTelNo());
        }
        if (needsMapping(dto, dto.getSlipClientZipCd(), "slipClientZipCd")) {
            entity.setSlipClientZipCd(dto.getSlipClientZipCd());
        }
        if (needsMapping(dto, dto.getSlipClientAddress1(), "slipClientAddress1")) {
            entity.setSlipClientAddress1(dto.getSlipClientAddress1());
        }
        if (needsMapping(dto, dto.getSlipClientAddress2(), "slipClientAddress2")) {
            entity.setSlipClientAddress2(dto.getSlipClientAddress2());
        }
        if (needsMapping(dto, dto.getSlipClientNm1(), "slipClientNm1")) {
            entity.setSlipClientNm1(dto.getSlipClientNm1());
        }
        if (needsMapping(dto, dto.getSlipClientNm2(), "slipClientNm2")) {
            entity.setSlipClientNm2(dto.getSlipClientNm2());
        }
        if (needsMapping(dto, dto.getSlipShapeCd(), "slipShapeCd")) {
            entity.setSlipShapeCdAsCenterSlipShapeCd(CDef.CenterSlipShapeCd.codeOf(dto.getSlipShapeCd()));
        }
        if (needsMapping(dto, dto.getSlipItemNm1(), "slipItemNm1")) {
            entity.setSlipItemNm1(dto.getSlipItemNm1());
        }
        if (needsMapping(dto, dto.getSlipItemNm2(), "slipItemNm2")) {
            entity.setSlipItemNm2(dto.getSlipItemNm2());
        }
        if (needsMapping(dto, dto.getSlipItemNm3(), "slipItemNm3")) {
            entity.setSlipItemNm3(dto.getSlipItemNm3());
        }
        if (needsMapping(dto, dto.getSlipItemNm4(), "slipItemNm4")) {
            entity.setSlipItemNm4(dto.getSlipItemNm4());
        }
        if (needsMapping(dto, dto.getSlipItemNm5(), "slipItemNm5")) {
            entity.setSlipItemNm5(dto.getSlipItemNm5());
        }
        if (needsMapping(dto, dto.getTransportTypeSpeed(), "transportTypeSpeed")) {
            entity.setTransportTypeSpeedAsCenterTransportTypeSpeed(CDef.CenterTransportTypeSpeed.codeOf(dto.getTransportTypeSpeed()));
        }
        if (needsMapping(dto, dto.getTransportTypeItem(), "transportTypeItem")) {
            entity.setTransportTypeItemAsCenterTransportTypeItem(CDef.CenterTransportTypeItem.codeOf(dto.getTransportTypeItem()));
        }
        if (needsMapping(dto, dto.getSettlementType(), "settlementType")) {
            entity.setSettlementTypeAsSettlementType(CDef.SettlementType.codeOf(dto.getSettlementType()));
        }
        if (needsMapping(dto, dto.getSealType1(), "sealType1")) {
            entity.setSealType1AsCenterSealType(CDef.CenterSealType.codeOf(dto.getSealType1()));
        }
        if (needsMapping(dto, dto.getSealType2(), "sealType2")) {
            entity.setSealType2AsCenterSealType(CDef.CenterSealType.codeOf(dto.getSealType2()));
        }
        if (needsMapping(dto, dto.getSealType3(), "sealType3")) {
            entity.setSealType3AsCenterSealType(CDef.CenterSealType.codeOf(dto.getSealType3()));
        }
        if (needsMapping(dto, dto.getCodCls(), "codCls")) {
            entity.setCodClsAsCodCls(CDef.CodCls.codeOf(dto.getCodCls()));
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getApiOkuriCode(), "apiOkuriCode")) {
            entity.setApiOkuriCode(dto.getApiOkuriCode());
        }
        if (needsMapping(dto, dto.getApiBinsyuCode(), "apiBinsyuCode")) {
            entity.setApiBinsyuCodeAsCenterApiBinsyuCode(CDef.CenterApiBinsyuCode.codeOf(dto.getApiBinsyuCode()));
        }
        if (needsMapping(dto, dto.getApiDaibikiFlg(), "apiDaibikiFlg")) {
            entity.setApiDaibikiFlgAsCenterApiDaibikiFlg(CDef.CenterApiDaibikiFlg.codeOf(dto.getApiDaibikiFlg()));
        }
        if (needsMapping(dto, dto.getApiDaibikiType(), "apiDaibikiType")) {
            entity.setApiDaibikiTypeAsCenterApiDaibikiType(CDef.CenterApiDaibikiType.codeOf(dto.getApiDaibikiType()));
        }
        if (needsMapping(dto, dto.getApiWeightCd1(), "apiWeightCd1")) {
            entity.setApiWeightCd1AsCenterApiWeightCd(CDef.CenterApiWeightCd.codeOf(dto.getApiWeightCd1()));
        }
        if (needsMapping(dto, dto.getApiWeightCd2(), "apiWeightCd2")) {
            entity.setApiWeightCd2AsCenterApiWeightCd(CDef.CenterApiWeightCd.codeOf(dto.getApiWeightCd2()));
        }
        if (needsMapping(dto, dto.getApiEidomeFlg(), "apiEidomeFlg")) {
            entity.setApiEidomeFlgAsCenterApiEidomeFlg(CDef.CenterApiEidomeFlg.codeOf(dto.getApiEidomeFlg()));
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
                    relationEntity.getMCarrierSlipSgwList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipSgwList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierSlipSgwList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiBinsyuCode && dto.getMCenterClassDtlByApiBinsyuCode() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiBinsyuCode();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiBinsyuCode(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiBinsyuCode(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiBinsyuCode().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiBinsyuCode());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiDaibikiFlg && dto.getMCenterClassDtlByApiDaibikiFlg() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiDaibikiFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiDaibikiFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiDaibikiFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiDaibikiFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiDaibikiFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiDaibikiType && dto.getMCenterClassDtlByApiDaibikiType() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiDaibikiType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiDaibikiType(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiDaibikiType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiDaibikiType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiDaibikiType());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiEidomeFlg && dto.getMCenterClassDtlByApiEidomeFlg() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiEidomeFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiEidomeFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiEidomeFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiEidomeFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiEidomeFlg());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiWeightCd1 && dto.getMCenterClassDtlByApiWeightCd1() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiWeightCd1();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiWeightCd1(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiWeightCd1(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiWeightCd1().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiWeightCd1());
                }
            }
        };
        if (!_suppressMCenterClassDtlByApiWeightCd2 && dto.getMCenterClassDtlByApiWeightCd2() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByApiWeightCd2();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByApiWeightCd2(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByApiWeightCd2(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByApiWeightCd2().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByApiWeightCd2());
                }
            }
        };
        if (!_suppressBClassDtlByCharacterCd && dto.getBClassDtlByCharacterCd() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCharacterCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCharacterCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCharacterCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCharacterCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCharacterCd());
                }
            }
        };
        if (!_suppressBClassDtlByCodCls && dto.getBClassDtlByCodCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCodCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCodCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCodCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCodCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCodCls());
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
        if (!_suppressMCenterClassDtlBySealType1 && dto.getMCenterClassDtlBySealType1() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlBySealType1();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlBySealType1(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlBySealType1(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlBySealType1().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlBySealType1());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySealType2 && dto.getMCenterClassDtlBySealType2() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlBySealType2();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlBySealType2(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlBySealType2(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlBySealType2().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlBySealType2());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySealType3 && dto.getMCenterClassDtlBySealType3() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlBySealType3();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlBySealType3(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlBySealType3(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlBySealType3().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlBySealType3());
                }
            }
        };
        if (!_suppressBClassDtlBySettlementType && dto.getBClassDtlBySettlementType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySettlementType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySettlementType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySettlementType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySettlementType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySettlementType());
                }
            }
        };
        if (!_suppressMCenterClassDtlBySlipShapeCd && dto.getMCenterClassDtlBySlipShapeCd() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlBySlipShapeCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlBySlipShapeCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlBySlipShapeCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlBySlipShapeCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlBySlipShapeCd());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTransportTypeItem && dto.getMCenterClassDtlByTransportTypeItem() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByTransportTypeItem();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByTransportTypeItem(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByTransportTypeItem(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByTransportTypeItem().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByTransportTypeItem());
                }
            }
        };
        if (!_suppressMCenterClassDtlByTransportTypeSpeed && dto.getMCenterClassDtlByTransportTypeSpeed() != null) {
            MCenterClassDtlDto relationDto = dto.getMCenterClassDtlByTransportTypeSpeed();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtl relationEntity = (MCenterClassDtl)cachedEntity;
                entity.setMCenterClassDtlByTransportTypeSpeed(relationEntity);
                if (reverseReference) {
                }
            } else {
                MCenterClassDtlDtoMapper mapper = new MCenterClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                MCenterClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlByTransportTypeSpeed(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getMCenterClassDtlByTransportTypeSpeed().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlByTransportTypeSpeed());
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !dto.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierSlipSgw();
            List<MDeliveryCourse> relationEntityList = mapper.mappingToEntityList(dto.getMDeliveryCourseList());
            entity.setMDeliveryCourseList(relationEntityList);
            if (reverseReference) {
                for (MDeliveryCourse relationEntity : relationEntityList) {
                    relationEntity.setMCarrierSlipSgw(entity);
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
    protected boolean needsMapping(MCarrierSlipSgwDto dto, Object value, String propName) {
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
    public List<MCarrierSlipSgw> mappingToEntityList(List<MCarrierSlipSgwDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrierSlipSgw> entityList = new ArrayList<MCarrierSlipSgw>();
        for (MCarrierSlipSgwDto dto : dtoList) {
            MCarrierSlipSgw entity = mappingToEntity(dto);
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
    public void suppressMCenterClassDtlByApiBinsyuCode() {
        _suppressMCenterClassDtlByApiBinsyuCode = true;
    }
    public void suppressMCenterClassDtlByApiDaibikiFlg() {
        _suppressMCenterClassDtlByApiDaibikiFlg = true;
    }
    public void suppressMCenterClassDtlByApiDaibikiType() {
        _suppressMCenterClassDtlByApiDaibikiType = true;
    }
    public void suppressMCenterClassDtlByApiEidomeFlg() {
        _suppressMCenterClassDtlByApiEidomeFlg = true;
    }
    public void suppressMCenterClassDtlByApiWeightCd1() {
        _suppressMCenterClassDtlByApiWeightCd1 = true;
    }
    public void suppressMCenterClassDtlByApiWeightCd2() {
        _suppressMCenterClassDtlByApiWeightCd2 = true;
    }
    public void suppressBClassDtlByCharacterCd() {
        _suppressBClassDtlByCharacterCd = true;
    }
    public void suppressBClassDtlByCodCls() {
        _suppressBClassDtlByCodCls = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressMCenterClassDtlBySealType1() {
        _suppressMCenterClassDtlBySealType1 = true;
    }
    public void suppressMCenterClassDtlBySealType2() {
        _suppressMCenterClassDtlBySealType2 = true;
    }
    public void suppressMCenterClassDtlBySealType3() {
        _suppressMCenterClassDtlBySealType3 = true;
    }
    public void suppressBClassDtlBySettlementType() {
        _suppressBClassDtlBySettlementType = true;
    }
    public void suppressMCenterClassDtlBySlipShapeCd() {
        _suppressMCenterClassDtlBySlipShapeCd = true;
    }
    public void suppressMCenterClassDtlByTransportTypeItem() {
        _suppressMCenterClassDtlByTransportTypeItem = true;
    }
    public void suppressMCenterClassDtlByTransportTypeSpeed() {
        _suppressMCenterClassDtlByTransportTypeSpeed = true;
    }
    public void suppressMDeliveryCourseList() {
        _suppressMDeliveryCourseList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMCenterClassDtlByApiBinsyuCode();
        suppressMCenterClassDtlByApiDaibikiFlg();
        suppressMCenterClassDtlByApiDaibikiType();
        suppressMCenterClassDtlByApiEidomeFlg();
        suppressMCenterClassDtlByApiWeightCd1();
        suppressMCenterClassDtlByApiWeightCd2();
        suppressBClassDtlByCharacterCd();
        suppressBClassDtlByCodCls();
        suppressBClassDtlByDelFlg();
        suppressMCenterClassDtlBySealType1();
        suppressMCenterClassDtlBySealType2();
        suppressMCenterClassDtlBySealType3();
        suppressBClassDtlBySettlementType();
        suppressMCenterClassDtlBySlipShapeCd();
        suppressMCenterClassDtlByTransportTypeItem();
        suppressMCenterClassDtlByTransportTypeSpeed();
        suppressMDeliveryCourseList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMCenterClassDtlByApiBinsyuCode = false;
        _suppressMCenterClassDtlByApiDaibikiFlg = false;
        _suppressMCenterClassDtlByApiDaibikiType = false;
        _suppressMCenterClassDtlByApiEidomeFlg = false;
        _suppressMCenterClassDtlByApiWeightCd1 = false;
        _suppressMCenterClassDtlByApiWeightCd2 = false;
        _suppressBClassDtlByCharacterCd = false;
        _suppressBClassDtlByCodCls = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressMCenterClassDtlBySealType1 = false;
        _suppressMCenterClassDtlBySealType2 = false;
        _suppressMCenterClassDtlBySealType3 = false;
        _suppressBClassDtlBySettlementType = false;
        _suppressMCenterClassDtlBySlipShapeCd = false;
        _suppressMCenterClassDtlByTransportTypeItem = false;
        _suppressMCenterClassDtlByTransportTypeSpeed = false;
        _suppressMDeliveryCourseList = false;
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
    public MCarrierSlipSgwDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierSlipSgwDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierSlipSgwDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierSlipSgwDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierSlipSgwDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierSlipSgwDtoMapper)this;
    }
}
