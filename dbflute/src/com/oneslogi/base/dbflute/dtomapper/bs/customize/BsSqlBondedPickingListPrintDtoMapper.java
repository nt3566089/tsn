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
 * The DTO mapper of SqlBondedPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLOOR, WORKALLOCATEID, LOT3, OTHERLOT1, LOT1, LOT2, LOT4, LISTKBN, PALLET_QTY, CASE_QTY, SORT_RECEIVED_CASE_QTY, SORT_RECEIVED_CARTON_QTY, PICKED_PALLET_QTY, PICKED_CASE_QTY, PICKED_CARTON_QTY, CLIENT_NM, MIN_SHIPSCHDATE, MAX_SHIPSCHDATE, CENTER_CD, CENTER_ABBR, CLIENT_ABBR, PRODUCT_CD, PRODUCT_ABBR, USERNUM3, OTHERCD3, USER_CD, USER_NM, LOCATION_CD
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
public abstract class BsSqlBondedPickingListPrintDtoMapper implements DtoMapper<SqlBondedPickingListPrint, SqlBondedPickingListPrintDto>, Serializable {

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
    public BsSqlBondedPickingListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlBondedPickingListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlBondedPickingListPrintDto mappingToDto(SqlBondedPickingListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlBondedPickingListPrintDto dto = new SqlBondedPickingListPrintDto();
        dto.setFloor(entity.getFloor());
        dto.setWorkallocateid(entity.getWorkallocateid());
        dto.setLot3(entity.getLot3());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot4(entity.getLot4());
        dto.setListkbn(entity.getListkbn());
        dto.setPalletQty(entity.getPalletQty());
        dto.setCaseQty(entity.getCaseQty());
        dto.setSortReceivedCaseQty(entity.getSortReceivedCaseQty());
        dto.setSortReceivedCartonQty(entity.getSortReceivedCartonQty());
        dto.setPickedPalletQty(entity.getPickedPalletQty());
        dto.setPickedCaseQty(entity.getPickedCaseQty());
        dto.setPickedCartonQty(entity.getPickedCartonQty());
        dto.setClientNm(entity.getClientNm());
        dto.setMinShipschdate(entity.getMinShipschdate());
        dto.setMaxShipschdate(entity.getMaxShipschdate());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterAbbr(entity.getCenterAbbr());
        dto.setClientAbbr(entity.getClientAbbr());
        dto.setProductCd(entity.getProductCd());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setUsernum3(entity.getUsernum3());
        dto.setOthercd3(entity.getOthercd3());
        dto.setUserCd(entity.getUserCd());
        dto.setUserNm(entity.getUserNm());
        dto.setLocationCd(entity.getLocationCd());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlBondedPickingListPrintDto> mappingToDtoList(List<SqlBondedPickingListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlBondedPickingListPrintDto> dtoList = new ArrayList<SqlBondedPickingListPrintDto>();
        for (SqlBondedPickingListPrint entity : entityList) {
            SqlBondedPickingListPrintDto dto = mappingToDto(entity);
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
    public SqlBondedPickingListPrint mappingToEntity(SqlBondedPickingListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlBondedPickingListPrint entity = new SqlBondedPickingListPrint();
        if (needsMapping(dto, dto.getFloor(), "floor")) {
            entity.setFloor(dto.getFloor());
        }
        if (needsMapping(dto, dto.getWorkallocateid(), "workallocateid")) {
            entity.setWorkallocateid(dto.getWorkallocateid());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getListkbn(), "listkbn")) {
            entity.setListkbn(dto.getListkbn());
        }
        if (needsMapping(dto, dto.getPalletQty(), "palletQty")) {
            entity.setPalletQty(dto.getPalletQty());
        }
        if (needsMapping(dto, dto.getCaseQty(), "caseQty")) {
            entity.setCaseQty(dto.getCaseQty());
        }
        if (needsMapping(dto, dto.getSortReceivedCaseQty(), "sortReceivedCaseQty")) {
            entity.setSortReceivedCaseQty(dto.getSortReceivedCaseQty());
        }
        if (needsMapping(dto, dto.getSortReceivedCartonQty(), "sortReceivedCartonQty")) {
            entity.setSortReceivedCartonQty(dto.getSortReceivedCartonQty());
        }
        if (needsMapping(dto, dto.getPickedPalletQty(), "pickedPalletQty")) {
            entity.setPickedPalletQty(dto.getPickedPalletQty());
        }
        if (needsMapping(dto, dto.getPickedCaseQty(), "pickedCaseQty")) {
            entity.setPickedCaseQty(dto.getPickedCaseQty());
        }
        if (needsMapping(dto, dto.getPickedCartonQty(), "pickedCartonQty")) {
            entity.setPickedCartonQty(dto.getPickedCartonQty());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getMinShipschdate(), "minShipschdate")) {
            entity.setMinShipschdate(dto.getMinShipschdate());
        }
        if (needsMapping(dto, dto.getMaxShipschdate(), "maxShipschdate")) {
            entity.setMaxShipschdate(dto.getMaxShipschdate());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterAbbr(), "centerAbbr")) {
            entity.setCenterAbbr(dto.getCenterAbbr());
        }
        if (needsMapping(dto, dto.getClientAbbr(), "clientAbbr")) {
            entity.setClientAbbr(dto.getClientAbbr());
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
        if (needsMapping(dto, dto.getOthercd3(), "othercd3")) {
            entity.setOthercd3(dto.getOthercd3());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
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
    protected boolean needsMapping(SqlBondedPickingListPrintDto dto, Object value, String propName) {
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
    public List<SqlBondedPickingListPrint> mappingToEntityList(List<SqlBondedPickingListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlBondedPickingListPrint> entityList = new ArrayList<SqlBondedPickingListPrint>();
        for (SqlBondedPickingListPrintDto dto : dtoList) {
            SqlBondedPickingListPrint entity = mappingToEntity(dto);
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
    public SqlBondedPickingListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlBondedPickingListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlBondedPickingListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlBondedPickingListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlBondedPickingListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlBondedPickingListPrintDtoMapper)this;
    }
}
