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
 * The DTO mapper of SqlDispatchRecordInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SUPPLIERR_CV_FLG_CD, SHIP_CD, SUPPLIERR_CV_NO1, SUPPLIERR_CV_NO2, SUPPLIERR_CV_NO, SHIPMENT_DT, ARRIVAL_DT, PLANNED_CAR, ACHIEVED_CAR, TRANSPORTATION_CO, CAR_NO, SEAL_NO1, SEAL_NO2, SEAL_NO3, CCOPAM_ID, VERSION_NO, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM, SUPPLIERR_CV_FLG, GENERIC_PALLET_NO, OTHER_PALLET_NO, RCV_SUM_QTY1_PALLET, NO, SUM, LANDING
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSqlDispatchRecordInputListDtoMapper implements DtoMapper<SqlDispatchRecordInputList, SqlDispatchRecordInputListDto>, Serializable {

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
    public BsSqlDispatchRecordInputListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlDispatchRecordInputListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlDispatchRecordInputListDto mappingToDto(SqlDispatchRecordInputList entity) {
        if (entity == null) {
            return null;
        }
        SqlDispatchRecordInputListDto dto = new SqlDispatchRecordInputListDto();
        dto.setSupplierrCvFlgCd(entity.getSupplierrCvFlgCd());
        dto.setShipCd(entity.getShipCd());
        dto.setSupplierrCvNo1(entity.getSupplierrCvNo1());
        dto.setSupplierrCvNo2(entity.getSupplierrCvNo2());
        dto.setSupplierrCvNo(entity.getSupplierrCvNo());
        dto.setShipmentDt(entity.getShipmentDt());
        dto.setArrivalDt(entity.getArrivalDt());
        dto.setPlannedCar(entity.getPlannedCar());
        dto.setAchievedCar(entity.getAchievedCar());
        dto.setTransportationCo(entity.getTransportationCo());
        dto.setCarNo(entity.getCarNo());
        dto.setSealNo1(entity.getSealNo1());
        dto.setSealNo2(entity.getSealNo2());
        dto.setSealNo3(entity.getSealNo3());
        dto.setCcopamId(entity.getCcopamId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setSupplierrCvFlg(entity.getSupplierrCvFlg());
        dto.setGenericPalletNo(entity.getGenericPalletNo());
        dto.setOtherPalletNo(entity.getOtherPalletNo());
        dto.setRcvSumQty1Pallet(entity.getRcvSumQty1Pallet());
        dto.setNo(entity.getNo());
        dto.setSum(entity.getSum());
        dto.setLanding(entity.getLanding());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlDispatchRecordInputListDto> mappingToDtoList(List<SqlDispatchRecordInputList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlDispatchRecordInputListDto> dtoList = new ArrayList<SqlDispatchRecordInputListDto>();
        for (SqlDispatchRecordInputList entity : entityList) {
            SqlDispatchRecordInputListDto dto = mappingToDto(entity);
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
    public SqlDispatchRecordInputList mappingToEntity(SqlDispatchRecordInputListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlDispatchRecordInputList entity = new SqlDispatchRecordInputList();
        if (needsMapping(dto, dto.getSupplierrCvFlgCd(), "supplierrCvFlgCd")) {
            entity.setSupplierrCvFlgCd(dto.getSupplierrCvFlgCd());
        }
        if (needsMapping(dto, dto.getShipCd(), "shipCd")) {
            entity.setShipCd(dto.getShipCd());
        }
        if (needsMapping(dto, dto.getSupplierrCvNo1(), "supplierrCvNo1")) {
            entity.setSupplierrCvNo1(dto.getSupplierrCvNo1());
        }
        if (needsMapping(dto, dto.getSupplierrCvNo2(), "supplierrCvNo2")) {
            entity.setSupplierrCvNo2(dto.getSupplierrCvNo2());
        }
        if (needsMapping(dto, dto.getSupplierrCvNo(), "supplierrCvNo")) {
            entity.setSupplierrCvNo(dto.getSupplierrCvNo());
        }
        if (needsMapping(dto, dto.getShipmentDt(), "shipmentDt")) {
            entity.setShipmentDt(dto.getShipmentDt());
        }
        if (needsMapping(dto, dto.getArrivalDt(), "arrivalDt")) {
            entity.setArrivalDt(dto.getArrivalDt());
        }
        if (needsMapping(dto, dto.getPlannedCar(), "plannedCar")) {
            entity.setPlannedCar(dto.getPlannedCar());
        }
        if (needsMapping(dto, dto.getAchievedCar(), "achievedCar")) {
            entity.setAchievedCar(dto.getAchievedCar());
        }
        if (needsMapping(dto, dto.getTransportationCo(), "transportationCo")) {
            entity.setTransportationCo(dto.getTransportationCo());
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
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getSupplierrCvFlg(), "supplierrCvFlg")) {
            entity.setSupplierrCvFlg(dto.getSupplierrCvFlg());
        }
        if (needsMapping(dto, dto.getGenericPalletNo(), "genericPalletNo")) {
            entity.setGenericPalletNo(dto.getGenericPalletNo());
        }
        if (needsMapping(dto, dto.getOtherPalletNo(), "otherPalletNo")) {
            entity.setOtherPalletNo(dto.getOtherPalletNo());
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
        if (needsMapping(dto, dto.getLanding(), "landing")) {
            entity.setLanding(dto.getLanding());
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
    protected boolean needsMapping(SqlDispatchRecordInputListDto dto, Object value, String propName) {
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
    public List<SqlDispatchRecordInputList> mappingToEntityList(List<SqlDispatchRecordInputListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlDispatchRecordInputList> entityList = new ArrayList<SqlDispatchRecordInputList>();
        for (SqlDispatchRecordInputListDto dto : dtoList) {
            SqlDispatchRecordInputList entity = mappingToEntity(dto);
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
    public SqlDispatchRecordInputListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlDispatchRecordInputListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlDispatchRecordInputListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlDispatchRecordInputListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlDispatchRecordInputListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlDispatchRecordInputListDtoMapper)this;
    }
}
