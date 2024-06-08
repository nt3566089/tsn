package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlTCcopamPrintUsed. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DELIVERY_CLASS_CD, SHIP_CD, SN_NO1, SN_NO2, SN_NO3, SN_Y_M_D, ARV_Y_M_D, PLN_CAR_KND, AM_CAR_KND, CARRIER_NM, CAR_NO, SEAL_NO1, SEAL_NO2, SEAL_NO3, CCOPAM_ID, DELIVERY_CLASS, SHIP_NM, GN_PLT_QA, OT_PLT_QA, RCV_SUM_QTY1_PALLET, NO, SUM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTCcopamPrintUsedDtoMapper implements DtoMapper<SqlTCcopamPrintUsed, SqlTCcopamPrintUsedDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTCcopamPrintUsedDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlTCcopamPrintUsedDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlTCcopamPrintUsedDto mappingToDto(SqlTCcopamPrintUsed entity) {
        if (entity == null) {
            return null;
        }
        SqlTCcopamPrintUsedDto dto = new SqlTCcopamPrintUsedDto();
        dto.setDeliveryClassCd(entity.getDeliveryClassCd());
        dto.setShipCd(entity.getShipCd());
        dto.setSnNo1(entity.getSnNo1());
        dto.setSnNo2(entity.getSnNo2());
        dto.setSnNo3(entity.getSnNo3());
        dto.setSnYMD(entity.getSnYMD());
        dto.setArvYMD(entity.getArvYMD());
        dto.setPlnCarKnd(entity.getPlnCarKnd());
        dto.setAmCarKnd(entity.getAmCarKnd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setCarNo(entity.getCarNo());
        dto.setSealNo1(entity.getSealNo1());
        dto.setSealNo2(entity.getSealNo2());
        dto.setSealNo3(entity.getSealNo3());
        dto.setCcopamId(entity.getCcopamId());
        dto.setDeliveryClass(entity.getDeliveryClass());
        dto.setShipNm(entity.getShipNm());
        dto.setGnPltQa(entity.getGnPltQa());
        dto.setOtPltQa(entity.getOtPltQa());
        dto.setRcvSumQty1Pallet(entity.getRcvSumQty1Pallet());
        dto.setNo(entity.getNo());
        dto.setSum(entity.getSum());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlTCcopamPrintUsedDto> mappingToDtoList(List<SqlTCcopamPrintUsed> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlTCcopamPrintUsedDto> dtoList = new ArrayList<SqlTCcopamPrintUsedDto>();
        for (SqlTCcopamPrintUsed entity : entityList) {
            SqlTCcopamPrintUsedDto dto = mappingToDto(entity);
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
    public SqlTCcopamPrintUsed mappingToEntity(SqlTCcopamPrintUsedDto dto) {
        if (dto == null) {
            return null;
        }
        SqlTCcopamPrintUsed entity = new SqlTCcopamPrintUsed();
        if (needsMapping(dto, dto.getDeliveryClassCd(), "deliveryClassCd")) {
            entity.setDeliveryClassCd(dto.getDeliveryClassCd());
        }
        if (needsMapping(dto, dto.getShipCd(), "shipCd")) {
            entity.setShipCd(dto.getShipCd());
        }
        if (needsMapping(dto, dto.getSnNo1(), "snNo1")) {
            entity.setSnNo1(dto.getSnNo1());
        }
        if (needsMapping(dto, dto.getSnNo2(), "snNo2")) {
            entity.setSnNo2(dto.getSnNo2());
        }
        if (needsMapping(dto, dto.getSnNo3(), "snNo3")) {
            entity.setSnNo3(dto.getSnNo3());
        }
        if (needsMapping(dto, dto.getSnYMD(), "snYMD")) {
            entity.setSnYMD(dto.getSnYMD());
        }
        if (needsMapping(dto, dto.getArvYMD(), "arvYMD")) {
            entity.setArvYMD(dto.getArvYMD());
        }
        if (needsMapping(dto, dto.getPlnCarKnd(), "plnCarKnd")) {
            entity.setPlnCarKnd(dto.getPlnCarKnd());
        }
        if (needsMapping(dto, dto.getAmCarKnd(), "amCarKnd")) {
            entity.setAmCarKnd(dto.getAmCarKnd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getCarNo(), "carNo")) {
            entity.setCarNo(dto.getCarNo());
        }
        if (needsMapping(dto, dto.getSealNo1(), "sealNo1")) {
            entity.setSealNo1(dto.getSealNo1());
        }
        if (needsMapping(dto, dto.getSealNo2(), "sealNo2")) {
            entity.setSealNo2(dto.getSealNo2());
        }
        if (needsMapping(dto, dto.getSealNo3(), "sealNo3")) {
            entity.setSealNo3(dto.getSealNo3());
        }
        if (needsMapping(dto, dto.getCcopamId(), "ccopamId")) {
            entity.setCcopamId(dto.getCcopamId());
        }
        if (needsMapping(dto, dto.getDeliveryClass(), "deliveryClass")) {
            entity.setDeliveryClass(dto.getDeliveryClass());
        }
        if (needsMapping(dto, dto.getShipNm(), "shipNm")) {
            entity.setShipNm(dto.getShipNm());
        }
        if (needsMapping(dto, dto.getGnPltQa(), "gnPltQa")) {
            entity.setGnPltQa(dto.getGnPltQa());
        }
        if (needsMapping(dto, dto.getOtPltQa(), "otPltQa")) {
            entity.setOtPltQa(dto.getOtPltQa());
        }
        if (needsMapping(dto, dto.getRcvSumQty1Pallet(), "rcvSumQty1Pallet")) {
            entity.setRcvSumQty1Pallet(dto.getRcvSumQty1Pallet());
        }
        if (needsMapping(dto, dto.getNo(), "no")) {
            entity.setNo(dto.getNo());
        }
        if (needsMapping(dto, dto.getSum(), "sum")) {
            entity.setSum(dto.getSum());
        }
        reflectDerivedProperty(entity, dto, false);
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
    protected boolean needsMapping(SqlTCcopamPrintUsedDto dto, Object value, String propName) {
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
    public List<SqlTCcopamPrintUsed> mappingToEntityList(List<SqlTCcopamPrintUsedDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlTCcopamPrintUsed> entityList = new ArrayList<SqlTCcopamPrintUsed>();
        for (SqlTCcopamPrintUsedDto dto : dtoList) {
            SqlTCcopamPrintUsed entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
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
    public SqlTCcopamPrintUsedDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlTCcopamPrintUsedDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlTCcopamPrintUsedDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlTCcopamPrintUsedDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlTCcopamPrintUsedDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlTCcopamPrintUsedDtoMapper)this;
    }
}
