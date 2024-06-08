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
 * The DTO mapper of SqlMLocationMasterOutput. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LIN_BLK, SORT_CENTER, LOCATION_CD, PRODUCT_CD, PRODUCT_NM, STOCK_BOX, STOCK_CARTON, LOCID, LOCID_NM, BRCTG, TOSPLMD, PRESPLMD, SPLREVUN, SPLREVUN_NM, SPLREVCTQA, REPLENISH_P_NUM, BSSPLPT, TO_REPLENISH_P_NUM, TO_REPLENISH_P_QTY, PRE_REPLENISH_P_NUM, PRE_REPLENISH_P_QTY, CREATEDATE
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
public abstract class BsSqlMLocationMasterOutputDtoMapper implements DtoMapper<SqlMLocationMasterOutput, SqlMLocationMasterOutputDto>, Serializable {

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
    public BsSqlMLocationMasterOutputDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlMLocationMasterOutputDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlMLocationMasterOutputDto mappingToDto(SqlMLocationMasterOutput entity) {
        if (entity == null) {
            return null;
        }
        SqlMLocationMasterOutputDto dto = new SqlMLocationMasterOutputDto();
        dto.setLinBlk(entity.getLinBlk());
        dto.setSortCenter(entity.getSortCenter());
        dto.setLocationCd(entity.getLocationCd());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setStockBox(entity.getStockBox());
        dto.setStockCarton(entity.getStockCarton());
        dto.setLocid(entity.getLocid());
        dto.setLocidNm(entity.getLocidNm());
        dto.setBrctg(entity.getBrctg());
        dto.setTosplmd(entity.getTosplmd());
        dto.setPresplmd(entity.getPresplmd());
        dto.setSplrevun(entity.getSplrevun());
        dto.setSplrevunNm(entity.getSplrevunNm());
        dto.setSplrevctqa(entity.getSplrevctqa());
        dto.setReplenishPNum(entity.getReplenishPNum());
        dto.setBssplpt(entity.getBssplpt());
        dto.setToReplenishPNum(entity.getToReplenishPNum());
        dto.setToReplenishPQty(entity.getToReplenishPQty());
        dto.setPreReplenishPNum(entity.getPreReplenishPNum());
        dto.setPreReplenishPQty(entity.getPreReplenishPQty());
        dto.setCreatedate(entity.getCreatedate());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlMLocationMasterOutputDto> mappingToDtoList(List<SqlMLocationMasterOutput> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlMLocationMasterOutputDto> dtoList = new ArrayList<SqlMLocationMasterOutputDto>();
        for (SqlMLocationMasterOutput entity : entityList) {
            SqlMLocationMasterOutputDto dto = mappingToDto(entity);
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
    public SqlMLocationMasterOutput mappingToEntity(SqlMLocationMasterOutputDto dto) {
        if (dto == null) {
            return null;
        }
        SqlMLocationMasterOutput entity = new SqlMLocationMasterOutput();
        if (needsMapping(dto, dto.getLinBlk(), "linBlk")) {
            entity.setLinBlk(dto.getLinBlk());
        }
        if (needsMapping(dto, dto.getSortCenter(), "sortCenter")) {
            entity.setSortCenter(dto.getSortCenter());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getStockBox(), "stockBox")) {
            entity.setStockBox(dto.getStockBox());
        }
        if (needsMapping(dto, dto.getStockCarton(), "stockCarton")) {
            entity.setStockCarton(dto.getStockCarton());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getLocidNm(), "locidNm")) {
            entity.setLocidNm(dto.getLocidNm());
        }
        if (needsMapping(dto, dto.getBrctg(), "brctg")) {
            entity.setBrctg(dto.getBrctg());
        }
        if (needsMapping(dto, dto.getTosplmd(), "tosplmd")) {
            entity.setTosplmd(dto.getTosplmd());
        }
        if (needsMapping(dto, dto.getPresplmd(), "presplmd")) {
            entity.setPresplmd(dto.getPresplmd());
        }
        if (needsMapping(dto, dto.getSplrevun(), "splrevun")) {
            entity.setSplrevun(dto.getSplrevun());
        }
        if (needsMapping(dto, dto.getSplrevunNm(), "splrevunNm")) {
            entity.setSplrevunNm(dto.getSplrevunNm());
        }
        if (needsMapping(dto, dto.getSplrevctqa(), "splrevctqa")) {
            entity.setSplrevctqa(dto.getSplrevctqa());
        }
        if (needsMapping(dto, dto.getReplenishPNum(), "replenishPNum")) {
            entity.setReplenishPNum(dto.getReplenishPNum());
        }
        if (needsMapping(dto, dto.getBssplpt(), "bssplpt")) {
            entity.setBssplpt(dto.getBssplpt());
        }
        if (needsMapping(dto, dto.getToReplenishPNum(), "toReplenishPNum")) {
            entity.setToReplenishPNum(dto.getToReplenishPNum());
        }
        if (needsMapping(dto, dto.getToReplenishPQty(), "toReplenishPQty")) {
            entity.setToReplenishPQty(dto.getToReplenishPQty());
        }
        if (needsMapping(dto, dto.getPreReplenishPNum(), "preReplenishPNum")) {
            entity.setPreReplenishPNum(dto.getPreReplenishPNum());
        }
        if (needsMapping(dto, dto.getPreReplenishPQty(), "preReplenishPQty")) {
            entity.setPreReplenishPQty(dto.getPreReplenishPQty());
        }
        if (needsMapping(dto, dto.getCreatedate(), "createdate")) {
            entity.setCreatedate(dto.getCreatedate());
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
    protected boolean needsMapping(SqlMLocationMasterOutputDto dto, Object value, String propName) {
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
    public List<SqlMLocationMasterOutput> mappingToEntityList(List<SqlMLocationMasterOutputDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlMLocationMasterOutput> entityList = new ArrayList<SqlMLocationMasterOutput>();
        for (SqlMLocationMasterOutputDto dto : dtoList) {
            SqlMLocationMasterOutput entity = mappingToEntity(dto);
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
    public SqlMLocationMasterOutputDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlMLocationMasterOutputDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlMLocationMasterOutputDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlMLocationMasterOutputDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlMLocationMasterOutputDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlMLocationMasterOutputDtoMapper)this;
    }
}
