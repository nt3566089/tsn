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
 * The DTO mapper of SqlGetInventoryItem. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, STOCKDATE, PRODUCT_CD, ITEM_NAME, DUALITEMCDFLG, DUALITEMCD, YDAYTLEQULYTOTALINV, TDAY_DIFF, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, EXCESSTOTALINV, DEFECTTOTALINV, CAPITEMFLG, USER_CD, USER_NM, CGGDID_NM, INVENTORYREPORTINV, USERNUM3, CGGDID
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
public abstract class BsSqlGetInventoryItemDtoMapper implements DtoMapper<SqlGetInventoryItem, SqlGetInventoryItemDto>, Serializable {

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
    public BsSqlGetInventoryItemDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlGetInventoryItemDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlGetInventoryItemDto mappingToDto(SqlGetInventoryItem entity) {
        if (entity == null) {
            return null;
        }
        SqlGetInventoryItemDto dto = new SqlGetInventoryItemDto();
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setStockdate(entity.getStockdate());
        dto.setProductCd(entity.getProductCd());
        dto.setItemName(entity.getItemName());
        dto.setDualitemcdflg(entity.getDualitemcdflg());
        dto.setDualitemcd(entity.getDualitemcd());
        dto.setYdaytlequlytotalinv(entity.getYdaytlequlytotalinv());
        dto.setTdayDiff(entity.getTdayDiff());
        dto.setSysinvtotalinv(entity.getSysinvtotalinv());
        dto.setInvesttotalinv(entity.getInvesttotalinv());
        dto.setInvestkeeplocinv(entity.getInvestkeeplocinv());
        dto.setInvestreceivelocinv(entity.getInvestreceivelocinv());
        dto.setInvestdamageitem(entity.getInvestdamageitem());
        dto.setInvestclssifylocinv(entity.getInvestclssifylocinv());
        dto.setInvesttmplocinv(entity.getInvesttmplocinv());
        dto.setInvestautoinv(entity.getInvestautoinv());
        dto.setExcesstotalinv(entity.getExcesstotalinv());
        dto.setDefecttotalinv(entity.getDefecttotalinv());
        dto.setCapitemflg(entity.getCapitemflg());
        dto.setUserCd(entity.getUserCd());
        dto.setUserNm(entity.getUserNm());
        dto.setCggdidNm(entity.getCggdidNm());
        dto.setInventoryreportinv(entity.getInventoryreportinv());
        dto.setUsernum3(entity.getUsernum3());
        dto.setCggdid(entity.getCggdid());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlGetInventoryItemDto> mappingToDtoList(List<SqlGetInventoryItem> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlGetInventoryItemDto> dtoList = new ArrayList<SqlGetInventoryItemDto>();
        for (SqlGetInventoryItem entity : entityList) {
            SqlGetInventoryItemDto dto = mappingToDto(entity);
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
    public SqlGetInventoryItem mappingToEntity(SqlGetInventoryItemDto dto) {
        if (dto == null) {
            return null;
        }
        SqlGetInventoryItem entity = new SqlGetInventoryItem();
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getStockdate(), "stockdate")) {
            entity.setStockdate(dto.getStockdate());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemName(), "itemName")) {
            entity.setItemName(dto.getItemName());
        }
        if (needsMapping(dto, dto.getDualitemcdflg(), "dualitemcdflg")) {
            entity.setDualitemcdflg(dto.getDualitemcdflg());
        }
        if (needsMapping(dto, dto.getDualitemcd(), "dualitemcd")) {
            entity.setDualitemcd(dto.getDualitemcd());
        }
        if (needsMapping(dto, dto.getYdaytlequlytotalinv(), "ydaytlequlytotalinv")) {
            entity.setYdaytlequlytotalinv(dto.getYdaytlequlytotalinv());
        }
        if (needsMapping(dto, dto.getTdayDiff(), "tdayDiff")) {
            entity.setTdayDiff(dto.getTdayDiff());
        }
        if (needsMapping(dto, dto.getSysinvtotalinv(), "sysinvtotalinv")) {
            entity.setSysinvtotalinv(dto.getSysinvtotalinv());
        }
        if (needsMapping(dto, dto.getInvesttotalinv(), "investtotalinv")) {
            entity.setInvesttotalinv(dto.getInvesttotalinv());
        }
        if (needsMapping(dto, dto.getInvestkeeplocinv(), "investkeeplocinv")) {
            entity.setInvestkeeplocinv(dto.getInvestkeeplocinv());
        }
        if (needsMapping(dto, dto.getInvestreceivelocinv(), "investreceivelocinv")) {
            entity.setInvestreceivelocinv(dto.getInvestreceivelocinv());
        }
        if (needsMapping(dto, dto.getInvestdamageitem(), "investdamageitem")) {
            entity.setInvestdamageitem(dto.getInvestdamageitem());
        }
        if (needsMapping(dto, dto.getInvestclssifylocinv(), "investclssifylocinv")) {
            entity.setInvestclssifylocinv(dto.getInvestclssifylocinv());
        }
        if (needsMapping(dto, dto.getInvesttmplocinv(), "investtmplocinv")) {
            entity.setInvesttmplocinv(dto.getInvesttmplocinv());
        }
        if (needsMapping(dto, dto.getInvestautoinv(), "investautoinv")) {
            entity.setInvestautoinv(dto.getInvestautoinv());
        }
        if (needsMapping(dto, dto.getExcesstotalinv(), "excesstotalinv")) {
            entity.setExcesstotalinv(dto.getExcesstotalinv());
        }
        if (needsMapping(dto, dto.getDefecttotalinv(), "defecttotalinv")) {
            entity.setDefecttotalinv(dto.getDefecttotalinv());
        }
        if (needsMapping(dto, dto.getCapitemflg(), "capitemflg")) {
            entity.setCapitemflg(dto.getCapitemflg());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getUserNm(), "userNm")) {
            entity.setUserNm(dto.getUserNm());
        }
        if (needsMapping(dto, dto.getCggdidNm(), "cggdidNm")) {
            entity.setCggdidNm(dto.getCggdidNm());
        }
        if (needsMapping(dto, dto.getInventoryreportinv(), "inventoryreportinv")) {
            entity.setInventoryreportinv(dto.getInventoryreportinv());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
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
    protected boolean needsMapping(SqlGetInventoryItemDto dto, Object value, String propName) {
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
    public List<SqlGetInventoryItem> mappingToEntityList(List<SqlGetInventoryItemDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlGetInventoryItem> entityList = new ArrayList<SqlGetInventoryItem>();
        for (SqlGetInventoryItemDto dto : dtoList) {
            SqlGetInventoryItem entity = mappingToEntity(dto);
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
    public SqlGetInventoryItemDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlGetInventoryItemDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlGetInventoryItemDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlGetInventoryItemDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlGetInventoryItemDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlGetInventoryItemDtoMapper)this;
    }
}
