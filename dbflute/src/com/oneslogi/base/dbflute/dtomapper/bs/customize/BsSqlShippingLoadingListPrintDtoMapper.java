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
 * The DTO mapper of SqlShippingLoadingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPSCHDATE, TRSOLISTKEY, CENTER_CD, OWNERSONO, PHONENO, SHIPTOCD, DELIVNAME, CUSTOMER_CD, RMANO, OTHERREFNO1, ORDERTYPE, FAX1, PRICE2, NOTES, PRODUCT_CD, LOT3, LOT1, LOT4, EXPECTQTY1, EXPECTQTY2, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_ABBR, USERNUM3, USER_CD, USER_NM, OTHERREFNO1_NM, ORDERTYPE_NM, OTHERLOT2_CNT, TRANSPORTPRIORITY
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
public abstract class BsSqlShippingLoadingListPrintDtoMapper implements DtoMapper<SqlShippingLoadingListPrint, SqlShippingLoadingListPrintDto>, Serializable {

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
    public BsSqlShippingLoadingListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlShippingLoadingListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlShippingLoadingListPrintDto mappingToDto(SqlShippingLoadingListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlShippingLoadingListPrintDto dto = new SqlShippingLoadingListPrintDto();
        dto.setShipschdate(entity.getShipschdate());
        dto.setTrsolistkey(entity.getTrsolistkey());
        dto.setCenterCd(entity.getCenterCd());
        dto.setOwnersono(entity.getOwnersono());
        dto.setPhoneno(entity.getPhoneno());
        dto.setShiptocd(entity.getShiptocd());
        dto.setDelivname(entity.getDelivname());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setRmano(entity.getRmano());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setOrdertype(entity.getOrdertype());
        dto.setFax1(entity.getFax1());
        dto.setPrice2(entity.getPrice2());
        dto.setNotes(entity.getNotes());
        dto.setProductCd(entity.getProductCd());
        dto.setLot3(entity.getLot3());
        dto.setLot1(entity.getLot1());
        dto.setLot4(entity.getLot4());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setExpectqty2(entity.getExpectqty2());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setCustomerAbbr(entity.getCustomerAbbr());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setUsernum3(entity.getUsernum3());
        dto.setUserCd(entity.getUserCd());
        dto.setUserNm(entity.getUserNm());
        dto.setOtherrefno1Nm(entity.getOtherrefno1Nm());
        dto.setOrdertypeNm(entity.getOrdertypeNm());
        dto.setOtherlot2Cnt(entity.getOtherlot2Cnt());
        dto.setTransportpriority(entity.getTransportpriority());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlShippingLoadingListPrintDto> mappingToDtoList(List<SqlShippingLoadingListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlShippingLoadingListPrintDto> dtoList = new ArrayList<SqlShippingLoadingListPrintDto>();
        for (SqlShippingLoadingListPrint entity : entityList) {
            SqlShippingLoadingListPrintDto dto = mappingToDto(entity);
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
    public SqlShippingLoadingListPrint mappingToEntity(SqlShippingLoadingListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlShippingLoadingListPrint entity = new SqlShippingLoadingListPrint();
        if (needsMapping(dto, dto.getShipschdate(), "shipschdate")) {
            entity.setShipschdate(dto.getShipschdate());
        }
        if (needsMapping(dto, dto.getTrsolistkey(), "trsolistkey")) {
            entity.setTrsolistkey(dto.getTrsolistkey());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getOwnersono(), "ownersono")) {
            entity.setOwnersono(dto.getOwnersono());
        }
        if (needsMapping(dto, dto.getPhoneno(), "phoneno")) {
            entity.setPhoneno(dto.getPhoneno());
        }
        if (needsMapping(dto, dto.getShiptocd(), "shiptocd")) {
            entity.setShiptocd(dto.getShiptocd());
        }
        if (needsMapping(dto, dto.getDelivname(), "delivname")) {
            entity.setDelivname(dto.getDelivname());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getFax1(), "fax1")) {
            entity.setFax1(dto.getFax1());
        }
        if (needsMapping(dto, dto.getPrice2(), "price2")) {
            entity.setPrice2(dto.getPrice2());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getExpectqty2(), "expectqty2")) {
            entity.setExpectqty2(dto.getExpectqty2());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getCustomerAbbr(), "customerAbbr")) {
            entity.setCustomerAbbr(dto.getCustomerAbbr());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
        }
        if (needsMapping(dto, dto.getOtherrefno1Nm(), "otherrefno1Nm")) {
            entity.setOtherrefno1Nm(dto.getOtherrefno1Nm());
        }
        if (needsMapping(dto, dto.getOrdertypeNm(), "ordertypeNm")) {
            entity.setOrdertypeNm(dto.getOrdertypeNm());
        }
        if (needsMapping(dto, dto.getOtherlot2Cnt(), "otherlot2Cnt")) {
            entity.setOtherlot2Cnt(dto.getOtherlot2Cnt());
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
    protected boolean needsMapping(SqlShippingLoadingListPrintDto dto, Object value, String propName) {
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
    public List<SqlShippingLoadingListPrint> mappingToEntityList(List<SqlShippingLoadingListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlShippingLoadingListPrint> entityList = new ArrayList<SqlShippingLoadingListPrint>();
        for (SqlShippingLoadingListPrintDto dto : dtoList) {
            SqlShippingLoadingListPrint entity = mappingToEntity(dto);
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
    public SqlShippingLoadingListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlShippingLoadingListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlShippingLoadingListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlShippingLoadingListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlShippingLoadingListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlShippingLoadingListPrintDtoMapper)this;
    }
}
