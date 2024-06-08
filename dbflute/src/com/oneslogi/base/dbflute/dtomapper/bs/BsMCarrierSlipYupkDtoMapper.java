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
 * The DTO mapper of M_CARRIER_SLIP_YUPK as TABLE. <br>
 * ゆうパック送り状マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [column]
 *     CARRIER_SLIP_YUPK_ID, CENTER_ID, TAG_TYPE, TAG_NM, CHARACTER_CD, POST_TYPE, COOL_TYPE, COD_TYPE, CARRIER_TYPE, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS1, SLIP_CLIENT_ADDRESS2, SLIP_CLIENT_ADDRESS3, SLIP_CLIENT_NM1, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_MAIL, NO_UPSIDE_DOWN_CLS, NO_STOCK_CLS, SLIP_PRODUCT_SIZE_CLS, SLIP_PRODUCT_NO, SLIP_ITEM_NM, SHIP_RESERVE_DATA_MARK, DELI_CERT_PRE_YEARS, SEND_NM, PRODUCT_TYPE_CODE, POST_BIZ_CARD_CUSTOMER_NO, SHIPPING_COMPANY_CODE, SHIPMENT_CODE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_SLIP_YUPK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, B_CLASS_DTL(ByCharacterCd)
 *
 * [referrer-table]
 *     M_DELIVERY_COURSE
 *
 * [foreign-property]
 *     mCenter, bClassDtlByCharacterCd, bClassDtlByCodType, bClassDtlByCoolType, bClassDtlByDelFlg, bClassDtlByNoStockCls, bClassDtlByNoUpsideDownCls, bClassDtlByPostType
 *
 * [referrer-property]
 *     mDeliveryCourseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipYupkDtoMapper implements DtoMapper<MCarrierSlipYupk, MCarrierSlipYupkDto>, Serializable {

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
    protected boolean _suppressBClassDtlByCharacterCd;
    protected boolean _suppressBClassDtlByCodType;
    protected boolean _suppressBClassDtlByCoolType;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByNoStockCls;
    protected boolean _suppressBClassDtlByNoUpsideDownCls;
    protected boolean _suppressBClassDtlByPostType;
    protected boolean _suppressMDeliveryCourseList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipYupkDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierSlipYupkDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierSlipYupkDto mappingToDto(MCarrierSlipYupk entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierSlipYupkDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipYupkDto dto = new MCarrierSlipYupkDto();
        dto.setCarrierSlipYupkId(entity.getCarrierSlipYupkId());
        dto.setCenterId(entity.getCenterId());
        dto.setTagType(entity.getTagType());
        dto.setTagNm(entity.getTagNm());
        dto.setCharacterCd(entity.getCharacterCd());
        dto.setPostType(entity.getPostType());
        dto.setCoolType(entity.getCoolType());
        dto.setCodType(entity.getCodType());
        dto.setCarrierType(entity.getCarrierType());
        dto.setSlipClientZipCd(entity.getSlipClientZipCd());
        dto.setSlipClientAddress1(entity.getSlipClientAddress1());
        dto.setSlipClientAddress2(entity.getSlipClientAddress2());
        dto.setSlipClientAddress3(entity.getSlipClientAddress3());
        dto.setSlipClientNm1(entity.getSlipClientNm1());
        dto.setSlipClientTelNo(entity.getSlipClientTelNo());
        dto.setSlipClientMail(entity.getSlipClientMail());
        dto.setNoUpsideDownCls(entity.getNoUpsideDownCls());
        dto.setNoStockCls(entity.getNoStockCls());
        dto.setSlipProductSizeCls(entity.getSlipProductSizeCls());
        dto.setSlipProductNo(entity.getSlipProductNo());
        dto.setSlipItemNm(entity.getSlipItemNm());
        dto.setShipReserveDataMark(entity.getShipReserveDataMark());
        dto.setDeliCertPreYears(entity.getDeliCertPreYears());
        dto.setSendNm(entity.getSendNm());
        dto.setProductTypeCode(entity.getProductTypeCode());
        dto.setPostBizCardCustomerNo(entity.getPostBizCardCustomerNo());
        dto.setShippingCompanyCode(entity.getShippingCompanyCode());
        dto.setShipmentCode(entity.getShipmentCode());
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
                    relationDto.getMCarrierSlipYupkList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipYupkList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierSlipYupkList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
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
        if (!_suppressBClassDtlByCodType && entity.getBClassDtlByCodType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCodType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCodType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCodType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCodType());
                }
            }
        };
        if (!_suppressBClassDtlByCoolType && entity.getBClassDtlByCoolType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCoolType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCoolType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCoolType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCoolType());
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
        if (!_suppressBClassDtlByNoStockCls && entity.getBClassDtlByNoStockCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByNoStockCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByNoStockCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByNoStockCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByNoStockCls());
                }
            }
        };
        if (!_suppressBClassDtlByNoUpsideDownCls && entity.getBClassDtlByNoUpsideDownCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByNoUpsideDownCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByNoUpsideDownCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByNoUpsideDownCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByNoUpsideDownCls());
                }
            }
        };
        if (!_suppressBClassDtlByPostType && entity.getBClassDtlByPostType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPostType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPostType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPostType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPostType());
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !entity.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierSlipYupk();
            List<MDeliveryCourseDto> relationDtoList = mapper.mappingToDtoList(entity.getMDeliveryCourseList());
            dto.setMDeliveryCourseList(relationDtoList);
            if (reverseReference) {
                for (MDeliveryCourseDto relationDto : relationDtoList) {
                    relationDto.setMCarrierSlipYupk(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierSlipYupkDto> mappingToDtoList(List<MCarrierSlipYupk> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierSlipYupkDto> dtoList = new ArrayList<MCarrierSlipYupkDto>();
        for (MCarrierSlipYupk entity : entityList) {
            MCarrierSlipYupkDto dto = mappingToDto(entity);
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
    public MCarrierSlipYupk mappingToEntity(MCarrierSlipYupkDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrierSlipYupk)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipYupk entity = new MCarrierSlipYupk();
        if (needsMapping(dto, dto.getCarrierSlipYupkId(), "carrierSlipYupkId")) {
            entity.setCarrierSlipYupkId(dto.getCarrierSlipYupkId());
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
        if (needsMapping(dto, dto.getPostType(), "postType")) {
            entity.setPostTypeAsPostType(CDef.PostType.codeOf(dto.getPostType()));
        }
        if (needsMapping(dto, dto.getCoolType(), "coolType")) {
            entity.setCoolTypeAsCoolType(CDef.CoolType.codeOf(dto.getCoolType()));
        }
        if (needsMapping(dto, dto.getCodType(), "codType")) {
            entity.setCodTypeAsCodType(CDef.CodType.codeOf(dto.getCodType()));
        }
        if (needsMapping(dto, dto.getCarrierType(), "carrierType")) {
            entity.setCarrierType(dto.getCarrierType());
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
        if (needsMapping(dto, dto.getSlipClientAddress3(), "slipClientAddress3")) {
            entity.setSlipClientAddress3(dto.getSlipClientAddress3());
        }
        if (needsMapping(dto, dto.getSlipClientNm1(), "slipClientNm1")) {
            entity.setSlipClientNm1(dto.getSlipClientNm1());
        }
        if (needsMapping(dto, dto.getSlipClientTelNo(), "slipClientTelNo")) {
            entity.setSlipClientTelNo(dto.getSlipClientTelNo());
        }
        if (needsMapping(dto, dto.getSlipClientMail(), "slipClientMail")) {
            entity.setSlipClientMail(dto.getSlipClientMail());
        }
        if (needsMapping(dto, dto.getNoUpsideDownCls(), "noUpsideDownCls")) {
            entity.setNoUpsideDownClsAsNoUpsideDownCls(CDef.NoUpsideDownCls.codeOf(dto.getNoUpsideDownCls()));
        }
        if (needsMapping(dto, dto.getNoStockCls(), "noStockCls")) {
            entity.setNoStockClsAsNoStockCls(CDef.NoStockCls.codeOf(dto.getNoStockCls()));
        }
        if (needsMapping(dto, dto.getSlipProductSizeCls(), "slipProductSizeCls")) {
            entity.setSlipProductSizeCls(dto.getSlipProductSizeCls());
        }
        if (needsMapping(dto, dto.getSlipProductNo(), "slipProductNo")) {
            entity.setSlipProductNo(dto.getSlipProductNo());
        }
        if (needsMapping(dto, dto.getSlipItemNm(), "slipItemNm")) {
            entity.setSlipItemNm(dto.getSlipItemNm());
        }
        if (needsMapping(dto, dto.getShipReserveDataMark(), "shipReserveDataMark")) {
            entity.setShipReserveDataMark(dto.getShipReserveDataMark());
        }
        if (needsMapping(dto, dto.getDeliCertPreYears(), "deliCertPreYears")) {
            entity.setDeliCertPreYears(dto.getDeliCertPreYears());
        }
        if (needsMapping(dto, dto.getSendNm(), "sendNm")) {
            entity.setSendNm(dto.getSendNm());
        }
        if (needsMapping(dto, dto.getProductTypeCode(), "productTypeCode")) {
            entity.setProductTypeCode(dto.getProductTypeCode());
        }
        if (needsMapping(dto, dto.getPostBizCardCustomerNo(), "postBizCardCustomerNo")) {
            entity.setPostBizCardCustomerNo(dto.getPostBizCardCustomerNo());
        }
        if (needsMapping(dto, dto.getShippingCompanyCode(), "shippingCompanyCode")) {
            entity.setShippingCompanyCode(dto.getShippingCompanyCode());
        }
        if (needsMapping(dto, dto.getShipmentCode(), "shipmentCode")) {
            entity.setShipmentCode(dto.getShipmentCode());
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
                    relationEntity.getMCarrierSlipYupkList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipYupkList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierSlipYupkList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
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
        if (!_suppressBClassDtlByCodType && dto.getBClassDtlByCodType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCodType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCodType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCodType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCodType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCodType());
                }
            }
        };
        if (!_suppressBClassDtlByCoolType && dto.getBClassDtlByCoolType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCoolType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCoolType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCoolType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCoolType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCoolType());
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
        if (!_suppressBClassDtlByNoStockCls && dto.getBClassDtlByNoStockCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByNoStockCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByNoStockCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByNoStockCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByNoStockCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByNoStockCls());
                }
            }
        };
        if (!_suppressBClassDtlByNoUpsideDownCls && dto.getBClassDtlByNoUpsideDownCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByNoUpsideDownCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByNoUpsideDownCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByNoUpsideDownCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByNoUpsideDownCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByNoUpsideDownCls());
                }
            }
        };
        if (!_suppressBClassDtlByPostType && dto.getBClassDtlByPostType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPostType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPostType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPostType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPostType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPostType());
                }
            }
        };
        if (!_suppressMDeliveryCourseList && !dto.getMDeliveryCourseList().isEmpty()) {
            MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCarrierSlipYupk();
            List<MDeliveryCourse> relationEntityList = mapper.mappingToEntityList(dto.getMDeliveryCourseList());
            entity.setMDeliveryCourseList(relationEntityList);
            if (reverseReference) {
                for (MDeliveryCourse relationEntity : relationEntityList) {
                    relationEntity.setMCarrierSlipYupk(entity);
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
    protected boolean needsMapping(MCarrierSlipYupkDto dto, Object value, String propName) {
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
    public List<MCarrierSlipYupk> mappingToEntityList(List<MCarrierSlipYupkDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrierSlipYupk> entityList = new ArrayList<MCarrierSlipYupk>();
        for (MCarrierSlipYupkDto dto : dtoList) {
            MCarrierSlipYupk entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByCharacterCd() {
        _suppressBClassDtlByCharacterCd = true;
    }
    public void suppressBClassDtlByCodType() {
        _suppressBClassDtlByCodType = true;
    }
    public void suppressBClassDtlByCoolType() {
        _suppressBClassDtlByCoolType = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByNoStockCls() {
        _suppressBClassDtlByNoStockCls = true;
    }
    public void suppressBClassDtlByNoUpsideDownCls() {
        _suppressBClassDtlByNoUpsideDownCls = true;
    }
    public void suppressBClassDtlByPostType() {
        _suppressBClassDtlByPostType = true;
    }
    public void suppressMDeliveryCourseList() {
        _suppressMDeliveryCourseList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressBClassDtlByCharacterCd();
        suppressBClassDtlByCodType();
        suppressBClassDtlByCoolType();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByNoStockCls();
        suppressBClassDtlByNoUpsideDownCls();
        suppressBClassDtlByPostType();
        suppressMDeliveryCourseList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressBClassDtlByCharacterCd = false;
        _suppressBClassDtlByCodType = false;
        _suppressBClassDtlByCoolType = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByNoStockCls = false;
        _suppressBClassDtlByNoUpsideDownCls = false;
        _suppressBClassDtlByPostType = false;
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
    public MCarrierSlipYupkDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierSlipYupkDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierSlipYupkDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierSlipYupkDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierSlipYupkDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierSlipYupkDtoMapper)this;
    }
}
