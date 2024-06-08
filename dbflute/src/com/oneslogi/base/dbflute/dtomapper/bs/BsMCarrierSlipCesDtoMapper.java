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
 * The DTO mapper of M_CARRIER_SLIP_CES as TABLE. <br>
 * キャリアEDIシステム送り状マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, B_CLASS_DTL(BySatDeliveryFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCustomer, bClassDtlBySatDeliveryFlg, bClassDtlByResidentialDeliveryFlg, bClassDtlByCodFlg, bClassDtlBySignatureRequiredFlg, bClassDtlBySignatureReleaseFlg, bClassDtlByCallBeforeDeliveryFlg, bClassDtlByFreezableProtectionFlg, bClassDtlByGuaranteedPlusFlg, bClassDtlByResidentialPickupFlg, bClassDtlByDoNotStackStackFlg, bClassDtlByLimitedAccessDeliveryFlg, bClassDtlByLimitedAccessPickupFlg, bClassDtlByOverSizedFlg, bClassDtlByPoisonFlg, bClassDtlByFoogFlg, bClassDtlByLiftgateDeliveryPrepaidFlg, bClassDtlByLiftgateDeliveryCollectFlg, bClassDtlByLiftgatePickupPrepaidFlg, bClassDtlByLiftgatePickupCollectFlg, bClassDtlByInsideDeliveryPrepaidFlg, bClassDtlByInsideDeliveryCollectFlg, bClassDtlByInsidePickupPrepaidFlg, bClassDtlByInsidePickupCollectFlg, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierSlipCesDtoMapper implements DtoMapper<MCarrierSlipCes, MCarrierSlipCesDto>, Serializable {

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
    protected boolean _suppressMCustomer;
    protected boolean _suppressBClassDtlBySatDeliveryFlg;
    protected boolean _suppressBClassDtlByResidentialDeliveryFlg;
    protected boolean _suppressBClassDtlByCodFlg;
    protected boolean _suppressBClassDtlBySignatureRequiredFlg;
    protected boolean _suppressBClassDtlBySignatureReleaseFlg;
    protected boolean _suppressBClassDtlByCallBeforeDeliveryFlg;
    protected boolean _suppressBClassDtlByFreezableProtectionFlg;
    protected boolean _suppressBClassDtlByGuaranteedPlusFlg;
    protected boolean _suppressBClassDtlByResidentialPickupFlg;
    protected boolean _suppressBClassDtlByDoNotStackStackFlg;
    protected boolean _suppressBClassDtlByLimitedAccessDeliveryFlg;
    protected boolean _suppressBClassDtlByLimitedAccessPickupFlg;
    protected boolean _suppressBClassDtlByOverSizedFlg;
    protected boolean _suppressBClassDtlByPoisonFlg;
    protected boolean _suppressBClassDtlByFoogFlg;
    protected boolean _suppressBClassDtlByLiftgateDeliveryPrepaidFlg;
    protected boolean _suppressBClassDtlByLiftgateDeliveryCollectFlg;
    protected boolean _suppressBClassDtlByLiftgatePickupPrepaidFlg;
    protected boolean _suppressBClassDtlByLiftgatePickupCollectFlg;
    protected boolean _suppressBClassDtlByInsideDeliveryPrepaidFlg;
    protected boolean _suppressBClassDtlByInsideDeliveryCollectFlg;
    protected boolean _suppressBClassDtlByInsidePickupPrepaidFlg;
    protected boolean _suppressBClassDtlByInsidePickupCollectFlg;
    protected boolean _suppressBClassDtlByDelFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipCesDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierSlipCesDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierSlipCesDto mappingToDto(MCarrierSlipCes entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierSlipCesDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipCesDto dto = new MCarrierSlipCesDto();
        dto.setCustomerId(entity.getCustomerId());
        dto.setCollectAccountNoBillTo(entity.getCollectAccountNoBillTo());
        dto.setCollectZipCdBillTo(entity.getCollectZipCdBillTo());
        dto.setCollectCountryCdBillTo(entity.getCollectCountryCdBillTo());
        dto.setPaymentTermCdTaxesTo(entity.getPaymentTermCdTaxesTo());
        dto.setCollectAccountNoTaxesTo(entity.getCollectAccountNoTaxesTo());
        dto.setCollectZipCdTaxesTo(entity.getCollectZipCdTaxesTo());
        dto.setCollectCountryCdTaxesTo(entity.getCollectCountryCdTaxesTo());
        dto.setCodPaymentTermCd(entity.getCodPaymentTermCd());
        dto.setCodAmount(entity.getCodAmount());
        dto.setCodFeePayer(entity.getCodFeePayer());
        dto.setTermsOfSales(entity.getTermsOfSales());
        dto.setBrokerName(entity.getBrokerName());
        dto.setBrokerPhoneNo(entity.getBrokerPhoneNo());
        dto.setBrokerFaxNo(entity.getBrokerFaxNo());
        dto.setSatDeliveryFlg(entity.getSatDeliveryFlg());
        dto.setResidentialDeliveryFlg(entity.getResidentialDeliveryFlg());
        dto.setCodFlg(entity.getCodFlg());
        dto.setSignatureRequiredFlg(entity.getSignatureRequiredFlg());
        dto.setSignatureReleaseFlg(entity.getSignatureReleaseFlg());
        dto.setCallBeforeDeliveryFlg(entity.getCallBeforeDeliveryFlg());
        dto.setFreezableProtectionFlg(entity.getFreezableProtectionFlg());
        dto.setGuaranteedPlusFlg(entity.getGuaranteedPlusFlg());
        dto.setResidentialPickupFlg(entity.getResidentialPickupFlg());
        dto.setDoNotStackStackFlg(entity.getDoNotStackStackFlg());
        dto.setLimitedAccessDeliveryFlg(entity.getLimitedAccessDeliveryFlg());
        dto.setLimitedAccessPickupFlg(entity.getLimitedAccessPickupFlg());
        dto.setOverSizedFlg(entity.getOverSizedFlg());
        dto.setPoisonFlg(entity.getPoisonFlg());
        dto.setFoogFlg(entity.getFoogFlg());
        dto.setLiftgateDeliveryPrepaidFlg(entity.getLiftgateDeliveryPrepaidFlg());
        dto.setLiftgateDeliveryCollectFlg(entity.getLiftgateDeliveryCollectFlg());
        dto.setLiftgatePickupPrepaidFlg(entity.getLiftgatePickupPrepaidFlg());
        dto.setLiftgatePickupCollectFlg(entity.getLiftgatePickupCollectFlg());
        dto.setInsideDeliveryPrepaidFlg(entity.getInsideDeliveryPrepaidFlg());
        dto.setInsideDeliveryCollectFlg(entity.getInsideDeliveryCollectFlg());
        dto.setInsidePickupPrepaidFlg(entity.getInsidePickupPrepaidFlg());
        dto.setInsidePickupCollectFlg(entity.getInsidePickupCollectFlg());
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
        if (!_suppressMCustomer && entity.getMCustomer() != null) {
            MCustomer relationEntity = entity.getMCustomer();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCustomerDto relationDto = (MCustomerDto)cachedDto;
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.setMCarrierSlipCesAsOne(dto);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipCesAsOne();
                MCustomerDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCustomer(relationDto);
                if (reverseReference) {
                    relationDto.setMCarrierSlipCesAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCustomer());
                }
            }
        };
        if (!_suppressBClassDtlBySatDeliveryFlg && entity.getBClassDtlBySatDeliveryFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySatDeliveryFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySatDeliveryFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySatDeliveryFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySatDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByResidentialDeliveryFlg && entity.getBClassDtlByResidentialDeliveryFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByResidentialDeliveryFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByResidentialDeliveryFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByResidentialDeliveryFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByResidentialDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCodFlg && entity.getBClassDtlByCodFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCodFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCodFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCodFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCodFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySignatureRequiredFlg && entity.getBClassDtlBySignatureRequiredFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySignatureRequiredFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySignatureRequiredFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySignatureRequiredFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySignatureRequiredFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySignatureReleaseFlg && entity.getBClassDtlBySignatureReleaseFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySignatureReleaseFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySignatureReleaseFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySignatureReleaseFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySignatureReleaseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCallBeforeDeliveryFlg && entity.getBClassDtlByCallBeforeDeliveryFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCallBeforeDeliveryFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCallBeforeDeliveryFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCallBeforeDeliveryFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCallBeforeDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreezableProtectionFlg && entity.getBClassDtlByFreezableProtectionFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFreezableProtectionFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFreezableProtectionFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFreezableProtectionFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFreezableProtectionFlg());
                }
            }
        };
        if (!_suppressBClassDtlByGuaranteedPlusFlg && entity.getBClassDtlByGuaranteedPlusFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByGuaranteedPlusFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByGuaranteedPlusFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByGuaranteedPlusFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByGuaranteedPlusFlg());
                }
            }
        };
        if (!_suppressBClassDtlByResidentialPickupFlg && entity.getBClassDtlByResidentialPickupFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByResidentialPickupFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByResidentialPickupFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByResidentialPickupFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByResidentialPickupFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDoNotStackStackFlg && entity.getBClassDtlByDoNotStackStackFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDoNotStackStackFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDoNotStackStackFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDoNotStackStackFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDoNotStackStackFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitedAccessDeliveryFlg && entity.getBClassDtlByLimitedAccessDeliveryFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitedAccessDeliveryFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitedAccessDeliveryFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitedAccessDeliveryFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitedAccessDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitedAccessPickupFlg && entity.getBClassDtlByLimitedAccessPickupFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLimitedAccessPickupFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLimitedAccessPickupFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLimitedAccessPickupFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLimitedAccessPickupFlg());
                }
            }
        };
        if (!_suppressBClassDtlByOverSizedFlg && entity.getBClassDtlByOverSizedFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByOverSizedFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByOverSizedFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByOverSizedFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByOverSizedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPoisonFlg && entity.getBClassDtlByPoisonFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPoisonFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPoisonFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPoisonFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPoisonFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFoogFlg && entity.getBClassDtlByFoogFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByFoogFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByFoogFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByFoogFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByFoogFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgateDeliveryPrepaidFlg && entity.getBClassDtlByLiftgateDeliveryPrepaidFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLiftgateDeliveryPrepaidFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLiftgateDeliveryPrepaidFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLiftgateDeliveryPrepaidFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLiftgateDeliveryPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgateDeliveryCollectFlg && entity.getBClassDtlByLiftgateDeliveryCollectFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLiftgateDeliveryCollectFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLiftgateDeliveryCollectFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLiftgateDeliveryCollectFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLiftgateDeliveryCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgatePickupPrepaidFlg && entity.getBClassDtlByLiftgatePickupPrepaidFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLiftgatePickupPrepaidFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLiftgatePickupPrepaidFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLiftgatePickupPrepaidFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLiftgatePickupPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgatePickupCollectFlg && entity.getBClassDtlByLiftgatePickupCollectFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLiftgatePickupCollectFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLiftgatePickupCollectFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLiftgatePickupCollectFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLiftgatePickupCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsideDeliveryPrepaidFlg && entity.getBClassDtlByInsideDeliveryPrepaidFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInsideDeliveryPrepaidFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInsideDeliveryPrepaidFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInsideDeliveryPrepaidFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInsideDeliveryPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsideDeliveryCollectFlg && entity.getBClassDtlByInsideDeliveryCollectFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInsideDeliveryCollectFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInsideDeliveryCollectFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInsideDeliveryCollectFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInsideDeliveryCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsidePickupPrepaidFlg && entity.getBClassDtlByInsidePickupPrepaidFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInsidePickupPrepaidFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInsidePickupPrepaidFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInsidePickupPrepaidFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInsidePickupPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsidePickupCollectFlg && entity.getBClassDtlByInsidePickupCollectFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInsidePickupCollectFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInsidePickupCollectFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInsidePickupCollectFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInsidePickupCollectFlg());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierSlipCesDto> mappingToDtoList(List<MCarrierSlipCes> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierSlipCesDto> dtoList = new ArrayList<MCarrierSlipCesDto>();
        for (MCarrierSlipCes entity : entityList) {
            MCarrierSlipCesDto dto = mappingToDto(entity);
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
    public MCarrierSlipCes mappingToEntity(MCarrierSlipCesDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrierSlipCes)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierSlipCes entity = new MCarrierSlipCes();
        if (needsMapping(dto, dto.getCustomerId(), "customerId")) {
            entity.setCustomerId(dto.getCustomerId());
        }
        if (needsMapping(dto, dto.getCollectAccountNoBillTo(), "collectAccountNoBillTo")) {
            entity.setCollectAccountNoBillTo(dto.getCollectAccountNoBillTo());
        }
        if (needsMapping(dto, dto.getCollectZipCdBillTo(), "collectZipCdBillTo")) {
            entity.setCollectZipCdBillTo(dto.getCollectZipCdBillTo());
        }
        if (needsMapping(dto, dto.getCollectCountryCdBillTo(), "collectCountryCdBillTo")) {
            entity.setCollectCountryCdBillTo(dto.getCollectCountryCdBillTo());
        }
        if (needsMapping(dto, dto.getPaymentTermCdTaxesTo(), "paymentTermCdTaxesTo")) {
            entity.setPaymentTermCdTaxesTo(dto.getPaymentTermCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectAccountNoTaxesTo(), "collectAccountNoTaxesTo")) {
            entity.setCollectAccountNoTaxesTo(dto.getCollectAccountNoTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectZipCdTaxesTo(), "collectZipCdTaxesTo")) {
            entity.setCollectZipCdTaxesTo(dto.getCollectZipCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectCountryCdTaxesTo(), "collectCountryCdTaxesTo")) {
            entity.setCollectCountryCdTaxesTo(dto.getCollectCountryCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCodPaymentTermCd(), "codPaymentTermCd")) {
            entity.setCodPaymentTermCd(dto.getCodPaymentTermCd());
        }
        if (needsMapping(dto, dto.getCodAmount(), "codAmount")) {
            entity.setCodAmount(dto.getCodAmount());
        }
        if (needsMapping(dto, dto.getCodFeePayer(), "codFeePayer")) {
            entity.setCodFeePayer(dto.getCodFeePayer());
        }
        if (needsMapping(dto, dto.getTermsOfSales(), "termsOfSales")) {
            entity.setTermsOfSales(dto.getTermsOfSales());
        }
        if (needsMapping(dto, dto.getBrokerName(), "brokerName")) {
            entity.setBrokerName(dto.getBrokerName());
        }
        if (needsMapping(dto, dto.getBrokerPhoneNo(), "brokerPhoneNo")) {
            entity.setBrokerPhoneNo(dto.getBrokerPhoneNo());
        }
        if (needsMapping(dto, dto.getBrokerFaxNo(), "brokerFaxNo")) {
            entity.setBrokerFaxNo(dto.getBrokerFaxNo());
        }
        if (needsMapping(dto, dto.getSatDeliveryFlg(), "satDeliveryFlg")) {
            entity.setSatDeliveryFlgAsSatDeliveryFlg(CDef.SatDeliveryFlg.codeOf(dto.getSatDeliveryFlg()));
        }
        if (needsMapping(dto, dto.getResidentialDeliveryFlg(), "residentialDeliveryFlg")) {
            entity.setResidentialDeliveryFlgAsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.codeOf(dto.getResidentialDeliveryFlg()));
        }
        if (needsMapping(dto, dto.getCodFlg(), "codFlg")) {
            entity.setCodFlgAsCodFlg(CDef.CodFlg.codeOf(dto.getCodFlg()));
        }
        if (needsMapping(dto, dto.getSignatureRequiredFlg(), "signatureRequiredFlg")) {
            entity.setSignatureRequiredFlgAsSignatureRequiredFlg(CDef.SignatureRequiredFlg.codeOf(dto.getSignatureRequiredFlg()));
        }
        if (needsMapping(dto, dto.getSignatureReleaseFlg(), "signatureReleaseFlg")) {
            entity.setSignatureReleaseFlgAsSignatureReleaseFlg(CDef.SignatureReleaseFlg.codeOf(dto.getSignatureReleaseFlg()));
        }
        if (needsMapping(dto, dto.getCallBeforeDeliveryFlg(), "callBeforeDeliveryFlg")) {
            entity.setCallBeforeDeliveryFlgAsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.codeOf(dto.getCallBeforeDeliveryFlg()));
        }
        if (needsMapping(dto, dto.getFreezableProtectionFlg(), "freezableProtectionFlg")) {
            entity.setFreezableProtectionFlgAsFreezableProtectionFlg(CDef.FreezableProtectionFlg.codeOf(dto.getFreezableProtectionFlg()));
        }
        if (needsMapping(dto, dto.getGuaranteedPlusFlg(), "guaranteedPlusFlg")) {
            entity.setGuaranteedPlusFlgAsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.codeOf(dto.getGuaranteedPlusFlg()));
        }
        if (needsMapping(dto, dto.getResidentialPickupFlg(), "residentialPickupFlg")) {
            entity.setResidentialPickupFlgAsResidentialPickupFlg(CDef.ResidentialPickupFlg.codeOf(dto.getResidentialPickupFlg()));
        }
        if (needsMapping(dto, dto.getDoNotStackStackFlg(), "doNotStackStackFlg")) {
            entity.setDoNotStackStackFlgAsDoNotStackStackFlg(CDef.DoNotStackStackFlg.codeOf(dto.getDoNotStackStackFlg()));
        }
        if (needsMapping(dto, dto.getLimitedAccessDeliveryFlg(), "limitedAccessDeliveryFlg")) {
            entity.setLimitedAccessDeliveryFlgAsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.codeOf(dto.getLimitedAccessDeliveryFlg()));
        }
        if (needsMapping(dto, dto.getLimitedAccessPickupFlg(), "limitedAccessPickupFlg")) {
            entity.setLimitedAccessPickupFlgAsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.codeOf(dto.getLimitedAccessPickupFlg()));
        }
        if (needsMapping(dto, dto.getOverSizedFlg(), "overSizedFlg")) {
            entity.setOverSizedFlgAsOverSizedFlg(CDef.OverSizedFlg.codeOf(dto.getOverSizedFlg()));
        }
        if (needsMapping(dto, dto.getPoisonFlg(), "poisonFlg")) {
            entity.setPoisonFlgAsPoisonFlg(CDef.PoisonFlg.codeOf(dto.getPoisonFlg()));
        }
        if (needsMapping(dto, dto.getFoogFlg(), "foogFlg")) {
            entity.setFoogFlgAsFoogFlg(CDef.FoogFlg.codeOf(dto.getFoogFlg()));
        }
        if (needsMapping(dto, dto.getLiftgateDeliveryPrepaidFlg(), "liftgateDeliveryPrepaidFlg")) {
            entity.setLiftgateDeliveryPrepaidFlgAsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.codeOf(dto.getLiftgateDeliveryPrepaidFlg()));
        }
        if (needsMapping(dto, dto.getLiftgateDeliveryCollectFlg(), "liftgateDeliveryCollectFlg")) {
            entity.setLiftgateDeliveryCollectFlgAsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.codeOf(dto.getLiftgateDeliveryCollectFlg()));
        }
        if (needsMapping(dto, dto.getLiftgatePickupPrepaidFlg(), "liftgatePickupPrepaidFlg")) {
            entity.setLiftgatePickupPrepaidFlgAsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.codeOf(dto.getLiftgatePickupPrepaidFlg()));
        }
        if (needsMapping(dto, dto.getLiftgatePickupCollectFlg(), "liftgatePickupCollectFlg")) {
            entity.setLiftgatePickupCollectFlgAsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.codeOf(dto.getLiftgatePickupCollectFlg()));
        }
        if (needsMapping(dto, dto.getInsideDeliveryPrepaidFlg(), "insideDeliveryPrepaidFlg")) {
            entity.setInsideDeliveryPrepaidFlgAsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.codeOf(dto.getInsideDeliveryPrepaidFlg()));
        }
        if (needsMapping(dto, dto.getInsideDeliveryCollectFlg(), "insideDeliveryCollectFlg")) {
            entity.setInsideDeliveryCollectFlgAsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.codeOf(dto.getInsideDeliveryCollectFlg()));
        }
        if (needsMapping(dto, dto.getInsidePickupPrepaidFlg(), "insidePickupPrepaidFlg")) {
            entity.setInsidePickupPrepaidFlgAsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.codeOf(dto.getInsidePickupPrepaidFlg()));
        }
        if (needsMapping(dto, dto.getInsidePickupCollectFlg(), "insidePickupCollectFlg")) {
            entity.setInsidePickupCollectFlgAsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.codeOf(dto.getInsidePickupCollectFlg()));
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
        if (!_suppressMCustomer && dto.getMCustomer() != null) {
            MCustomerDto relationDto = dto.getMCustomer();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCustomer relationEntity = (MCustomer)cachedEntity;
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCarrierSlipCesAsOne(entity);
                }
            } else {
                MCustomerDtoMapper mapper = new MCustomerDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierSlipCesAsOne();
                MCustomer relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCustomer(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCarrierSlipCesAsOne(entity);
                }
                if (instanceCache && entity.getMCustomer().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCustomer());
                }
            }
        };
        if (!_suppressBClassDtlBySatDeliveryFlg && dto.getBClassDtlBySatDeliveryFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySatDeliveryFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySatDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySatDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySatDeliveryFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySatDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByResidentialDeliveryFlg && dto.getBClassDtlByResidentialDeliveryFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByResidentialDeliveryFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByResidentialDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByResidentialDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByResidentialDeliveryFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByResidentialDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCodFlg && dto.getBClassDtlByCodFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCodFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCodFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCodFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCodFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCodFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySignatureRequiredFlg && dto.getBClassDtlBySignatureRequiredFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySignatureRequiredFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySignatureRequiredFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySignatureRequiredFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySignatureRequiredFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySignatureRequiredFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySignatureReleaseFlg && dto.getBClassDtlBySignatureReleaseFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySignatureReleaseFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySignatureReleaseFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySignatureReleaseFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySignatureReleaseFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySignatureReleaseFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCallBeforeDeliveryFlg && dto.getBClassDtlByCallBeforeDeliveryFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCallBeforeDeliveryFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCallBeforeDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCallBeforeDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCallBeforeDeliveryFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCallBeforeDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFreezableProtectionFlg && dto.getBClassDtlByFreezableProtectionFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFreezableProtectionFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFreezableProtectionFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFreezableProtectionFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFreezableProtectionFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFreezableProtectionFlg());
                }
            }
        };
        if (!_suppressBClassDtlByGuaranteedPlusFlg && dto.getBClassDtlByGuaranteedPlusFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByGuaranteedPlusFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByGuaranteedPlusFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByGuaranteedPlusFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByGuaranteedPlusFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByGuaranteedPlusFlg());
                }
            }
        };
        if (!_suppressBClassDtlByResidentialPickupFlg && dto.getBClassDtlByResidentialPickupFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByResidentialPickupFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByResidentialPickupFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByResidentialPickupFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByResidentialPickupFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByResidentialPickupFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDoNotStackStackFlg && dto.getBClassDtlByDoNotStackStackFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDoNotStackStackFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDoNotStackStackFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDoNotStackStackFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDoNotStackStackFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDoNotStackStackFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitedAccessDeliveryFlg && dto.getBClassDtlByLimitedAccessDeliveryFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitedAccessDeliveryFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitedAccessDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitedAccessDeliveryFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitedAccessDeliveryFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitedAccessDeliveryFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLimitedAccessPickupFlg && dto.getBClassDtlByLimitedAccessPickupFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLimitedAccessPickupFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLimitedAccessPickupFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLimitedAccessPickupFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLimitedAccessPickupFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLimitedAccessPickupFlg());
                }
            }
        };
        if (!_suppressBClassDtlByOverSizedFlg && dto.getBClassDtlByOverSizedFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByOverSizedFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByOverSizedFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByOverSizedFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByOverSizedFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByOverSizedFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPoisonFlg && dto.getBClassDtlByPoisonFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPoisonFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPoisonFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPoisonFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPoisonFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPoisonFlg());
                }
            }
        };
        if (!_suppressBClassDtlByFoogFlg && dto.getBClassDtlByFoogFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByFoogFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByFoogFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByFoogFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByFoogFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByFoogFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgateDeliveryPrepaidFlg && dto.getBClassDtlByLiftgateDeliveryPrepaidFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLiftgateDeliveryPrepaidFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLiftgateDeliveryPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLiftgateDeliveryPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLiftgateDeliveryPrepaidFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLiftgateDeliveryPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgateDeliveryCollectFlg && dto.getBClassDtlByLiftgateDeliveryCollectFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLiftgateDeliveryCollectFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLiftgateDeliveryCollectFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLiftgateDeliveryCollectFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLiftgateDeliveryCollectFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLiftgateDeliveryCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgatePickupPrepaidFlg && dto.getBClassDtlByLiftgatePickupPrepaidFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLiftgatePickupPrepaidFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLiftgatePickupPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLiftgatePickupPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLiftgatePickupPrepaidFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLiftgatePickupPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByLiftgatePickupCollectFlg && dto.getBClassDtlByLiftgatePickupCollectFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLiftgatePickupCollectFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLiftgatePickupCollectFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLiftgatePickupCollectFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLiftgatePickupCollectFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLiftgatePickupCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsideDeliveryPrepaidFlg && dto.getBClassDtlByInsideDeliveryPrepaidFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInsideDeliveryPrepaidFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInsideDeliveryPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInsideDeliveryPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInsideDeliveryPrepaidFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInsideDeliveryPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsideDeliveryCollectFlg && dto.getBClassDtlByInsideDeliveryCollectFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInsideDeliveryCollectFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInsideDeliveryCollectFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInsideDeliveryCollectFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInsideDeliveryCollectFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInsideDeliveryCollectFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsidePickupPrepaidFlg && dto.getBClassDtlByInsidePickupPrepaidFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInsidePickupPrepaidFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInsidePickupPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInsidePickupPrepaidFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInsidePickupPrepaidFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInsidePickupPrepaidFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInsidePickupCollectFlg && dto.getBClassDtlByInsidePickupCollectFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInsidePickupCollectFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInsidePickupCollectFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInsidePickupCollectFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInsidePickupCollectFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInsidePickupCollectFlg());
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
    protected boolean needsMapping(MCarrierSlipCesDto dto, Object value, String propName) {
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
    public List<MCarrierSlipCes> mappingToEntityList(List<MCarrierSlipCesDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrierSlipCes> entityList = new ArrayList<MCarrierSlipCes>();
        for (MCarrierSlipCesDto dto : dtoList) {
            MCarrierSlipCes entity = mappingToEntity(dto);
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
    public void suppressMCustomer() {
        _suppressMCustomer = true;
    }
    public void suppressBClassDtlBySatDeliveryFlg() {
        _suppressBClassDtlBySatDeliveryFlg = true;
    }
    public void suppressBClassDtlByResidentialDeliveryFlg() {
        _suppressBClassDtlByResidentialDeliveryFlg = true;
    }
    public void suppressBClassDtlByCodFlg() {
        _suppressBClassDtlByCodFlg = true;
    }
    public void suppressBClassDtlBySignatureRequiredFlg() {
        _suppressBClassDtlBySignatureRequiredFlg = true;
    }
    public void suppressBClassDtlBySignatureReleaseFlg() {
        _suppressBClassDtlBySignatureReleaseFlg = true;
    }
    public void suppressBClassDtlByCallBeforeDeliveryFlg() {
        _suppressBClassDtlByCallBeforeDeliveryFlg = true;
    }
    public void suppressBClassDtlByFreezableProtectionFlg() {
        _suppressBClassDtlByFreezableProtectionFlg = true;
    }
    public void suppressBClassDtlByGuaranteedPlusFlg() {
        _suppressBClassDtlByGuaranteedPlusFlg = true;
    }
    public void suppressBClassDtlByResidentialPickupFlg() {
        _suppressBClassDtlByResidentialPickupFlg = true;
    }
    public void suppressBClassDtlByDoNotStackStackFlg() {
        _suppressBClassDtlByDoNotStackStackFlg = true;
    }
    public void suppressBClassDtlByLimitedAccessDeliveryFlg() {
        _suppressBClassDtlByLimitedAccessDeliveryFlg = true;
    }
    public void suppressBClassDtlByLimitedAccessPickupFlg() {
        _suppressBClassDtlByLimitedAccessPickupFlg = true;
    }
    public void suppressBClassDtlByOverSizedFlg() {
        _suppressBClassDtlByOverSizedFlg = true;
    }
    public void suppressBClassDtlByPoisonFlg() {
        _suppressBClassDtlByPoisonFlg = true;
    }
    public void suppressBClassDtlByFoogFlg() {
        _suppressBClassDtlByFoogFlg = true;
    }
    public void suppressBClassDtlByLiftgateDeliveryPrepaidFlg() {
        _suppressBClassDtlByLiftgateDeliveryPrepaidFlg = true;
    }
    public void suppressBClassDtlByLiftgateDeliveryCollectFlg() {
        _suppressBClassDtlByLiftgateDeliveryCollectFlg = true;
    }
    public void suppressBClassDtlByLiftgatePickupPrepaidFlg() {
        _suppressBClassDtlByLiftgatePickupPrepaidFlg = true;
    }
    public void suppressBClassDtlByLiftgatePickupCollectFlg() {
        _suppressBClassDtlByLiftgatePickupCollectFlg = true;
    }
    public void suppressBClassDtlByInsideDeliveryPrepaidFlg() {
        _suppressBClassDtlByInsideDeliveryPrepaidFlg = true;
    }
    public void suppressBClassDtlByInsideDeliveryCollectFlg() {
        _suppressBClassDtlByInsideDeliveryCollectFlg = true;
    }
    public void suppressBClassDtlByInsidePickupPrepaidFlg() {
        _suppressBClassDtlByInsidePickupPrepaidFlg = true;
    }
    public void suppressBClassDtlByInsidePickupCollectFlg() {
        _suppressBClassDtlByInsidePickupCollectFlg = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCustomer();
        suppressBClassDtlBySatDeliveryFlg();
        suppressBClassDtlByResidentialDeliveryFlg();
        suppressBClassDtlByCodFlg();
        suppressBClassDtlBySignatureRequiredFlg();
        suppressBClassDtlBySignatureReleaseFlg();
        suppressBClassDtlByCallBeforeDeliveryFlg();
        suppressBClassDtlByFreezableProtectionFlg();
        suppressBClassDtlByGuaranteedPlusFlg();
        suppressBClassDtlByResidentialPickupFlg();
        suppressBClassDtlByDoNotStackStackFlg();
        suppressBClassDtlByLimitedAccessDeliveryFlg();
        suppressBClassDtlByLimitedAccessPickupFlg();
        suppressBClassDtlByOverSizedFlg();
        suppressBClassDtlByPoisonFlg();
        suppressBClassDtlByFoogFlg();
        suppressBClassDtlByLiftgateDeliveryPrepaidFlg();
        suppressBClassDtlByLiftgateDeliveryCollectFlg();
        suppressBClassDtlByLiftgatePickupPrepaidFlg();
        suppressBClassDtlByLiftgatePickupCollectFlg();
        suppressBClassDtlByInsideDeliveryPrepaidFlg();
        suppressBClassDtlByInsideDeliveryCollectFlg();
        suppressBClassDtlByInsidePickupPrepaidFlg();
        suppressBClassDtlByInsidePickupCollectFlg();
        suppressBClassDtlByDelFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressMCustomer = false;
        _suppressBClassDtlBySatDeliveryFlg = false;
        _suppressBClassDtlByResidentialDeliveryFlg = false;
        _suppressBClassDtlByCodFlg = false;
        _suppressBClassDtlBySignatureRequiredFlg = false;
        _suppressBClassDtlBySignatureReleaseFlg = false;
        _suppressBClassDtlByCallBeforeDeliveryFlg = false;
        _suppressBClassDtlByFreezableProtectionFlg = false;
        _suppressBClassDtlByGuaranteedPlusFlg = false;
        _suppressBClassDtlByResidentialPickupFlg = false;
        _suppressBClassDtlByDoNotStackStackFlg = false;
        _suppressBClassDtlByLimitedAccessDeliveryFlg = false;
        _suppressBClassDtlByLimitedAccessPickupFlg = false;
        _suppressBClassDtlByOverSizedFlg = false;
        _suppressBClassDtlByPoisonFlg = false;
        _suppressBClassDtlByFoogFlg = false;
        _suppressBClassDtlByLiftgateDeliveryPrepaidFlg = false;
        _suppressBClassDtlByLiftgateDeliveryCollectFlg = false;
        _suppressBClassDtlByLiftgatePickupPrepaidFlg = false;
        _suppressBClassDtlByLiftgatePickupCollectFlg = false;
        _suppressBClassDtlByInsideDeliveryPrepaidFlg = false;
        _suppressBClassDtlByInsideDeliveryCollectFlg = false;
        _suppressBClassDtlByInsidePickupPrepaidFlg = false;
        _suppressBClassDtlByInsidePickupCollectFlg = false;
        _suppressBClassDtlByDelFlg = false;
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
    public MCarrierSlipCesDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierSlipCesDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierSlipCesDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierSlipCesDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierSlipCesDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierSlipCesDtoMapper)this;
    }
}
