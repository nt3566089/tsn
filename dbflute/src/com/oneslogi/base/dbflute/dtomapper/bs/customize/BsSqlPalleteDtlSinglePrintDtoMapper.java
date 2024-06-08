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
 * The DTO mapper of SqlPalleteDtlSinglePrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSOLISTKEY, WORKALLOCATEID, FAX1, CARRIERSNAME, SHIPSCHDATE, OWNERSONO, NOTES, RMANO, SOPALLETNO, STOCK_TYPE_CD, SOLINENO, CASE_EXPECTQTY1, LOT1, LOT4, IFITEMCD, LOCATION_CD, LOT3, LOT2, CUSTOMER_ABBR, CENTER_ABBR, PRODUCT_CD, PRODUCT_ABBR, USERNUM3, TRANSPORTPRIORITY, OTHERCD3, OTHERREFNO1
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
public abstract class BsSqlPalleteDtlSinglePrintDtoMapper implements DtoMapper<SqlPalleteDtlSinglePrint, SqlPalleteDtlSinglePrintDto>, Serializable {

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
    public BsSqlPalleteDtlSinglePrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPalleteDtlSinglePrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPalleteDtlSinglePrintDto mappingToDto(SqlPalleteDtlSinglePrint entity) {
        if (entity == null) {
            return null;
        }
        SqlPalleteDtlSinglePrintDto dto = new SqlPalleteDtlSinglePrintDto();
        dto.setTrsolistkey(entity.getTrsolistkey());
        dto.setWorkallocateid(entity.getWorkallocateid());
        dto.setFax1(entity.getFax1());
        dto.setCarriersname(entity.getCarriersname());
        dto.setShipschdate(entity.getShipschdate());
        dto.setOwnersono(entity.getOwnersono());
        dto.setNotes(entity.getNotes());
        dto.setRmano(entity.getRmano());
        dto.setSopalletno(entity.getSopalletno());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setSolineno(entity.getSolineno());
        dto.setCaseExpectqty1(entity.getCaseExpectqty1());
        dto.setLot1(entity.getLot1());
        dto.setLot4(entity.getLot4());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setLocationCd(entity.getLocationCd());
        dto.setLot3(entity.getLot3());
        dto.setLot2(entity.getLot2());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setProductCd(entity.getProductCd());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setUsernum3(entity.getUsernum3());
        dto.setTransportpriority(entity.getTransportpriority());
        dto.setOthercd3(entity.getOthercd3());
        dto.setOtherrefno1(entity.getOtherrefno1());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPalleteDtlSinglePrintDto> mappingToDtoList(List<SqlPalleteDtlSinglePrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPalleteDtlSinglePrintDto> dtoList = new ArrayList<SqlPalleteDtlSinglePrintDto>();
        for (SqlPalleteDtlSinglePrint entity : entityList) {
            SqlPalleteDtlSinglePrintDto dto = mappingToDto(entity);
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
    public SqlPalleteDtlSinglePrint mappingToEntity(SqlPalleteDtlSinglePrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPalleteDtlSinglePrint entity = new SqlPalleteDtlSinglePrint();
        if (needsMapping(dto, dto.getTrsolistkey(), "trsolistkey")) {
            entity.setTrsolistkey(dto.getTrsolistkey());
        }
        if (needsMapping(dto, dto.getWorkallocateid(), "workallocateid")) {
            entity.setWorkallocateid(dto.getWorkallocateid());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getCarriersname(), "carriersname")) {
            entity.setCarriersname(dto.getCarriersname());
        }
        if (needsMapping(dto, dto.getShipschdate(), "shipschdate")) {
            entity.setShipschdate(dto.getShipschdate());
        }
        if (needsMapping(dto, dto.getOwnersono(), "ownersono")) {
            entity.setOwnersono(dto.getOwnersono());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getSopalletno(), "sopalletno")) {
            entity.setSopalletno(dto.getSopalletno());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getSolineno(), "solineno")) {
            entity.setSolineno(dto.getSolineno());
        }
        if (needsMapping(dto, dto.getCaseExpectqty1(), "caseExpectqty1")) {
            entity.setCaseExpectqty1(dto.getCaseExpectqty1());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getIfitemcd(), "ifitemcd")) {
            entity.setIfitemcd(dto.getIfitemcd());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getTransportpriority(), "transportpriority")) {
            entity.setTransportpriority(dto.getTransportpriority());
        }
        if (needsMapping(dto, dto.getOthercd3(), "othercd3")) {
            entity.setOthercd3(dto.getOthercd3());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
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
    protected boolean needsMapping(SqlPalleteDtlSinglePrintDto dto, Object value, String propName) {
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
    public List<SqlPalleteDtlSinglePrint> mappingToEntityList(List<SqlPalleteDtlSinglePrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPalleteDtlSinglePrint> entityList = new ArrayList<SqlPalleteDtlSinglePrint>();
        for (SqlPalleteDtlSinglePrintDto dto : dtoList) {
            SqlPalleteDtlSinglePrint entity = mappingToEntity(dto);
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
    public SqlPalleteDtlSinglePrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPalleteDtlSinglePrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPalleteDtlSinglePrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPalleteDtlSinglePrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPalleteDtlSinglePrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPalleteDtlSinglePrintDtoMapper)this;
    }
}
