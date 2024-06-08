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
 * The DTO mapper of SqlPalletDtlFractionPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSOLISTKEY, SHIPSCHDATE, FAX1, CARRIERSNAME, RMANO, OWNERSONO, LOT2, LOT4, OTHERLOT3, LOT3, SOPALLETNO, IFITEMCD, LOT1, LOT4_CNT, LOT1_CNT, EXPECT_CASE_QTY, EXPECT_CARTON_QTY, OTHERLOT3_CNT, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_CD, PRODUCT_ABBR, OTHERREFNO1, PRICE2, USERNUM3, TRANSPORTPRIORITY
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
public abstract class BsSqlPalletDtlFractionPrintDtoMapper implements DtoMapper<SqlPalletDtlFractionPrint, SqlPalletDtlFractionPrintDto>, Serializable {

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
    public BsSqlPalletDtlFractionPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPalletDtlFractionPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPalletDtlFractionPrintDto mappingToDto(SqlPalletDtlFractionPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlPalletDtlFractionPrintDto dto = new SqlPalletDtlFractionPrintDto();
        dto.setTrsolistkey(entity.getTrsolistkey());
        dto.setShipschdate(entity.getShipschdate());
        dto.setFax1(entity.getFax1());
        dto.setCarriersname(entity.getCarriersname());
        dto.setRmano(entity.getRmano());
        dto.setOwnersono(entity.getOwnersono());
        dto.setLot2(entity.getLot2());
        dto.setLot4(entity.getLot4());
        dto.setOtherlot3(entity.getOtherlot3());
        dto.setLot3(entity.getLot3());
        dto.setSopalletno(entity.getSopalletno());
        dto.setIfitemcd(entity.getIfitemcd());
        dto.setLot1(entity.getLot1());
        dto.setLot4Cnt(entity.getLot4Cnt());
        dto.setLot1Cnt(entity.getLot1Cnt());
        dto.setExpectCaseQty(entity.getExpectCaseQty());
        dto.setExpectCartonQty(entity.getExpectCartonQty());
        dto.setOtherlot3Cnt(entity.getOtherlot3Cnt());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setProductCd(entity.getProductCd());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setPrice2(entity.getPrice2());
        dto.setUsernum3(entity.getUsernum3());
        dto.setTransportpriority(entity.getTransportpriority());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPalletDtlFractionPrintDto> mappingToDtoList(List<SqlPalletDtlFractionPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPalletDtlFractionPrintDto> dtoList = new ArrayList<SqlPalletDtlFractionPrintDto>();
        for (SqlPalletDtlFractionPrint entity : entityList) {
            SqlPalletDtlFractionPrintDto dto = mappingToDto(entity);
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
    public SqlPalletDtlFractionPrint mappingToEntity(SqlPalletDtlFractionPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPalletDtlFractionPrint entity = new SqlPalletDtlFractionPrint();
        if (needsMapping(dto, dto.getTrsolistkey(), "trsolistkey")) {
            entity.setTrsolistkey(dto.getTrsolistkey());
        }
        if (needsMapping(dto, dto.getShipschdate(), "shipschdate")) {
            entity.setShipschdate(dto.getShipschdate());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getCarriersname(), "carriersname")) {
            entity.setCarriersname(dto.getCarriersname());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getOwnersono(), "ownersono")) {
            entity.setOwnersono(dto.getOwnersono());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getOtherlot3(), "otherlot3")) {
            entity.setOtherlot3(dto.getOtherlot3());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getSopalletno(), "sopalletno")) {
            entity.setSopalletno(dto.getSopalletno());
        }
        if (needsMapping(dto, dto.getIfitemcd(), "ifitemcd")) {
            entity.setIfitemcd(dto.getIfitemcd());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot4Cnt(), "lot4Cnt")) {
            entity.setLot4Cnt(dto.getLot4Cnt());
        }
        if (needsMapping(dto, dto.getLot1Cnt(), "lot1Cnt")) {
            entity.setLot1Cnt(dto.getLot1Cnt());
        }
        if (needsMapping(dto, dto.getExpectCaseQty(), "expectCaseQty")) {
            entity.setExpectCaseQty(dto.getExpectCaseQty());
        }
        if (needsMapping(dto, dto.getExpectCartonQty(), "expectCartonQty")) {
            entity.setExpectCartonQty(dto.getExpectCartonQty());
        }
        if (needsMapping(dto, dto.getOtherlot3Cnt(), "otherlot3Cnt")) {
            entity.setOtherlot3Cnt(dto.getOtherlot3Cnt());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
        }
        if (needsMapping(dto, dto.getPrice2(), "price2")) {
            entity.setPrice2(dto.getPrice2());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getTransportpriority(), "transportpriority")) {
            entity.setTransportpriority(dto.getTransportpriority());
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
    protected boolean needsMapping(SqlPalletDtlFractionPrintDto dto, Object value, String propName) {
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
    public List<SqlPalletDtlFractionPrint> mappingToEntityList(List<SqlPalletDtlFractionPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPalletDtlFractionPrint> entityList = new ArrayList<SqlPalletDtlFractionPrint>();
        for (SqlPalletDtlFractionPrintDto dto : dtoList) {
            SqlPalletDtlFractionPrint entity = mappingToEntity(dto);
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
    public SqlPalletDtlFractionPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPalletDtlFractionPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPalletDtlFractionPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPalletDtlFractionPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPalletDtlFractionPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPalletDtlFractionPrintDtoMapper)this;
    }
}
