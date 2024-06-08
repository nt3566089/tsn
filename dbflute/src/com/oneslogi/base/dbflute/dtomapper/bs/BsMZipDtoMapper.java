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
 * The DTO mapper of M_ZIP as TABLE. <br>
 * 郵便番号マスタ
 * <pre>
 * [primary-key]
 *     ZIP_ID
 *
 * [column]
 *     ZIP_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByFlg6)
 *
 * [referrer-table]
 *     M_CARRIER_ZIP, T_SHIPPING_INST_H
 *
 * [foreign-property]
 *     bClassDtlByFlg6, bClassDtlByFlg5, bClassDtlByCompanyFlg, bClassDtlByDelFlg, bClassDtlByReasonType, bClassDtlByUpdCd, bClassDtlByUpdType, bClassDtlByFlg1, bClassDtlByFlg2, bClassDtlByFlg3, bClassDtlByFlg4
 *
 * [referrer-property]
 *     mCarrierZipList, tShippingInstHForDelivList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMZipDtoMapper implements DtoMapper<MZip, MZipDto>, Serializable {

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
    protected boolean _suppressBClassDtlByFlg6;
    protected boolean _suppressBClassDtlByFlg5;
    protected boolean _suppressBClassDtlByCompanyFlg;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByReasonType;
    protected boolean _suppressBClassDtlByUpdCd;
    protected boolean _suppressBClassDtlByUpdType;
    protected boolean _suppressBClassDtlByFlg1;
    protected boolean _suppressBClassDtlByFlg2;
    protected boolean _suppressBClassDtlByFlg3;
    protected boolean _suppressBClassDtlByFlg4;
    protected boolean _suppressMCarrierZipList;
    protected boolean _suppressTShippingInstHForDelivList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMZipDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMZipDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MZipDto mappingToDto(MZip entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MZipDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MZipDto dto = new MZipDto();
        dto.setZipId(entity.getZipId());
        dto.setPublicCd(entity.getPublicCd());
        dto.setZipCd5(entity.getZipCd5());
        dto.setZipCd(entity.getZipCd());
        dto.setAddressKn1(entity.getAddressKn1());
        dto.setAddressKn2(entity.getAddressKn2());
        dto.setAddressKn3(entity.getAddressKn3());
        dto.setCompanyKn(entity.getCompanyKn());
        dto.setAddress1(entity.getAddress1());
        dto.setAddress2(entity.getAddress2());
        dto.setAddress3(entity.getAddress3());
        dto.setAddress4(entity.getAddress4());
        dto.setCompanyNm(entity.getCompanyNm());
        dto.setFlg1(entity.getFlg1());
        dto.setFlg2(entity.getFlg2());
        dto.setFlg3(entity.getFlg3());
        dto.setFlg4(entity.getFlg4());
        dto.setUpdType(entity.getUpdType());
        dto.setReasonType(entity.getReasonType());
        dto.setHandlingAddress(entity.getHandlingAddress());
        dto.setFlg5(entity.getFlg5());
        dto.setFlg6(entity.getFlg6());
        dto.setUpdCd(entity.getUpdCd());
        dto.setCompanyFlg(entity.getCompanyFlg());
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
        if (!_suppressBClassDtlByFlg6 && entity.getBClassDtlByFlg6() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg6();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg6(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg6(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg6());
                }
            }
        };
        if (!_suppressBClassDtlByFlg5 && entity.getBClassDtlByFlg5() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg5();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg5(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg5(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg5());
                }
            }
        };
        if (!_suppressBClassDtlByCompanyFlg && entity.getBClassDtlByCompanyFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCompanyFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCompanyFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCompanyFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCompanyFlg());
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
        if (!_suppressBClassDtlByReasonType && entity.getBClassDtlByReasonType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByReasonType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByReasonType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByReasonType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByReasonType());
                }
            }
        };
        if (!_suppressBClassDtlByUpdCd && entity.getBClassDtlByUpdCd() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByUpdCd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByUpdCd(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByUpdCd(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByUpdCd());
                }
            }
        };
        if (!_suppressBClassDtlByUpdType && entity.getBClassDtlByUpdType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByUpdType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByUpdType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByUpdType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByUpdType());
                }
            }
        };
        if (!_suppressBClassDtlByFlg1 && entity.getBClassDtlByFlg1() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg1();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg1(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg1(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg1());
                }
            }
        };
        if (!_suppressBClassDtlByFlg2 && entity.getBClassDtlByFlg2() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg2();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg2(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg2(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg2());
                }
            }
        };
        if (!_suppressBClassDtlByFlg3 && entity.getBClassDtlByFlg3() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg3();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg3(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg3(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg3());
                }
            }
        };
        if (!_suppressBClassDtlByFlg4 && entity.getBClassDtlByFlg4() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFlg4();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFlg4(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFlg4(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFlg4());
                }
            }
        };
        if (!_suppressMCarrierZipList && !entity.getMCarrierZipList().isEmpty()) {
            MCarrierZipDtoMapper mapper = new MCarrierZipDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMZip();
            List<MCarrierZipDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierZipList());
            dto.setMCarrierZipList(relationDtoList);
            if (reverseReference) {
                for (MCarrierZipDto relationDto : relationDtoList) {
                    relationDto.setMZip(dto);
                }
            }
        };
        if (!_suppressTShippingInstHForDelivList && !entity.getTShippingInstHForDelivList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMZipForDeliv();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHForDelivList());
            dto.setTShippingInstHForDelivList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMZipForDeliv(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MZipDto> mappingToDtoList(List<MZip> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MZipDto> dtoList = new ArrayList<MZipDto>();
        for (MZip entity : entityList) {
            MZipDto dto = mappingToDto(entity);
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
    public MZip mappingToEntity(MZipDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MZip)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MZip entity = new MZip();
        if (needsMapping(dto, dto.getZipId(), "zipId")) {
            entity.setZipId(dto.getZipId());
        }
        if (needsMapping(dto, dto.getPublicCd(), "publicCd")) {
            entity.setPublicCd(dto.getPublicCd());
        }
        if (needsMapping(dto, dto.getZipCd5(), "zipCd5")) {
            entity.setZipCd5(dto.getZipCd5());
        }
        if (needsMapping(dto, dto.getZipCd(), "zipCd")) {
            entity.setZipCd(dto.getZipCd());
        }
        if (needsMapping(dto, dto.getAddressKn1(), "addressKn1")) {
            entity.setAddressKn1(dto.getAddressKn1());
        }
        if (needsMapping(dto, dto.getAddressKn2(), "addressKn2")) {
            entity.setAddressKn2(dto.getAddressKn2());
        }
        if (needsMapping(dto, dto.getAddressKn3(), "addressKn3")) {
            entity.setAddressKn3(dto.getAddressKn3());
        }
        if (needsMapping(dto, dto.getCompanyKn(), "companyKn")) {
            entity.setCompanyKn(dto.getCompanyKn());
        }
        if (needsMapping(dto, dto.getAddress1(), "address1")) {
            entity.setAddress1(dto.getAddress1());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAddress3(), "address3")) {
            entity.setAddress3(dto.getAddress3());
        }
        if (needsMapping(dto, dto.getAddress4(), "address4")) {
            entity.setAddress4(dto.getAddress4());
        }
        if (needsMapping(dto, dto.getCompanyNm(), "companyNm")) {
            entity.setCompanyNm(dto.getCompanyNm());
        }
        if (needsMapping(dto, dto.getFlg1(), "flg1")) {
            entity.setFlg1AsZipFlg(CDef.ZipFlg.codeOf(dto.getFlg1()));
        }
        if (needsMapping(dto, dto.getFlg2(), "flg2")) {
            entity.setFlg2AsZipFlg(CDef.ZipFlg.codeOf(dto.getFlg2()));
        }
        if (needsMapping(dto, dto.getFlg3(), "flg3")) {
            entity.setFlg3AsZipFlg(CDef.ZipFlg.codeOf(dto.getFlg3()));
        }
        if (needsMapping(dto, dto.getFlg4(), "flg4")) {
            entity.setFlg4AsZipFlg(CDef.ZipFlg.codeOf(dto.getFlg4()));
        }
        if (needsMapping(dto, dto.getUpdType(), "updType")) {
            entity.setUpdTypeAsUpdType(CDef.UpdType.codeOf(dto.getUpdType()));
        }
        if (needsMapping(dto, dto.getReasonType(), "reasonType")) {
            entity.setReasonTypeAsReasonType(CDef.ReasonType.codeOf(dto.getReasonType()));
        }
        if (needsMapping(dto, dto.getHandlingAddress(), "handlingAddress")) {
            entity.setHandlingAddress(dto.getHandlingAddress());
        }
        if (needsMapping(dto, dto.getFlg5(), "flg5")) {
            entity.setFlg5AsCodeType(CDef.CodeType.codeOf(dto.getFlg5()));
        }
        if (needsMapping(dto, dto.getFlg6(), "flg6")) {
            entity.setFlg6AsCodeFlg(CDef.CodeFlg.codeOf(dto.getFlg6()));
        }
        if (needsMapping(dto, dto.getUpdCd(), "updCd")) {
            entity.setUpdCdAsUpdCd(CDef.UpdCd.codeOf(dto.getUpdCd()));
        }
        if (needsMapping(dto, dto.getCompanyFlg(), "companyFlg")) {
            entity.setCompanyFlgAsCompanyFlg(CDef.CompanyFlg.codeOf(dto.getCompanyFlg()));
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
        if (!_suppressBClassDtlByFlg6 && dto.getBClassDtlByFlg6() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg6();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg6(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg6(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg6().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg6());
                }
            }
        };
        if (!_suppressBClassDtlByFlg5 && dto.getBClassDtlByFlg5() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg5();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg5(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg5(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg5().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg5());
                }
            }
        };
        if (!_suppressBClassDtlByCompanyFlg && dto.getBClassDtlByCompanyFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCompanyFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCompanyFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCompanyFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCompanyFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCompanyFlg());
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
        if (!_suppressBClassDtlByReasonType && dto.getBClassDtlByReasonType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByReasonType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByReasonType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByReasonType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByReasonType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByReasonType());
                }
            }
        };
        if (!_suppressBClassDtlByUpdCd && dto.getBClassDtlByUpdCd() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByUpdCd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByUpdCd(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByUpdCd(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByUpdCd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByUpdCd());
                }
            }
        };
        if (!_suppressBClassDtlByUpdType && dto.getBClassDtlByUpdType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByUpdType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByUpdType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByUpdType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByUpdType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByUpdType());
                }
            }
        };
        if (!_suppressBClassDtlByFlg1 && dto.getBClassDtlByFlg1() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg1();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg1(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg1(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg1().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg1());
                }
            }
        };
        if (!_suppressBClassDtlByFlg2 && dto.getBClassDtlByFlg2() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg2();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg2(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg2(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg2().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg2());
                }
            }
        };
        if (!_suppressBClassDtlByFlg3 && dto.getBClassDtlByFlg3() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg3();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg3(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg3(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg3().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg3());
                }
            }
        };
        if (!_suppressBClassDtlByFlg4 && dto.getBClassDtlByFlg4() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFlg4();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFlg4(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFlg4(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFlg4().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFlg4());
                }
            }
        };
        if (!_suppressMCarrierZipList && !dto.getMCarrierZipList().isEmpty()) {
            MCarrierZipDtoMapper mapper = new MCarrierZipDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMZip();
            List<MCarrierZip> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierZipList());
            entity.setMCarrierZipList(relationEntityList);
            if (reverseReference) {
                for (MCarrierZip relationEntity : relationEntityList) {
                    relationEntity.setMZip(entity);
                }
            }
        };
        if (!_suppressTShippingInstHForDelivList && !dto.getTShippingInstHForDelivList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMZipForDeliv();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHForDelivList());
            entity.setTShippingInstHForDelivList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMZipForDeliv(entity);
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
    protected boolean needsMapping(MZipDto dto, Object value, String propName) {
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
    public List<MZip> mappingToEntityList(List<MZipDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MZip> entityList = new ArrayList<MZip>();
        for (MZipDto dto : dtoList) {
            MZip entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByFlg6() {
        _suppressBClassDtlByFlg6 = true;
    }
    public void suppressBClassDtlByFlg5() {
        _suppressBClassDtlByFlg5 = true;
    }
    public void suppressBClassDtlByCompanyFlg() {
        _suppressBClassDtlByCompanyFlg = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByReasonType() {
        _suppressBClassDtlByReasonType = true;
    }
    public void suppressBClassDtlByUpdCd() {
        _suppressBClassDtlByUpdCd = true;
    }
    public void suppressBClassDtlByUpdType() {
        _suppressBClassDtlByUpdType = true;
    }
    public void suppressBClassDtlByFlg1() {
        _suppressBClassDtlByFlg1 = true;
    }
    public void suppressBClassDtlByFlg2() {
        _suppressBClassDtlByFlg2 = true;
    }
    public void suppressBClassDtlByFlg3() {
        _suppressBClassDtlByFlg3 = true;
    }
    public void suppressBClassDtlByFlg4() {
        _suppressBClassDtlByFlg4 = true;
    }
    public void suppressMCarrierZipList() {
        _suppressMCarrierZipList = true;
    }
    public void suppressTShippingInstHForDelivList() {
        _suppressTShippingInstHForDelivList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBClassDtlByFlg6();
        suppressBClassDtlByFlg5();
        suppressBClassDtlByCompanyFlg();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByReasonType();
        suppressBClassDtlByUpdCd();
        suppressBClassDtlByUpdType();
        suppressBClassDtlByFlg1();
        suppressBClassDtlByFlg2();
        suppressBClassDtlByFlg3();
        suppressBClassDtlByFlg4();
        suppressMCarrierZipList();
        suppressTShippingInstHForDelivList();
    }
    protected void doSuppressClear() { // internal
        _suppressBClassDtlByFlg6 = false;
        _suppressBClassDtlByFlg5 = false;
        _suppressBClassDtlByCompanyFlg = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByReasonType = false;
        _suppressBClassDtlByUpdCd = false;
        _suppressBClassDtlByUpdType = false;
        _suppressBClassDtlByFlg1 = false;
        _suppressBClassDtlByFlg2 = false;
        _suppressBClassDtlByFlg3 = false;
        _suppressBClassDtlByFlg4 = false;
        _suppressMCarrierZipList = false;
        _suppressTShippingInstHForDelivList = false;
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
    public MZipDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MZipDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MZipDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MZipDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MZipDtoMapper reverseReference() {
        setReverseReference(true);
        return (MZipDtoMapper)this;
    }
}
