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
 * The DTO mapper of SqlInstKeyPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_H_ID, INVENTORY_DT, PRODUCT_CD, PRODUCT_NM, CGGDID, FCFLG, USERNUM4, USERNUM3, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, CHARGE_NUM, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, UNIT1, UNIT2, CGGDID_NM, FCFLG_NM
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
public abstract class BsSqlInstKeyPrintDtoMapper implements DtoMapper<SqlInstKeyPrint, SqlInstKeyPrintDto>, Serializable {

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
    public BsSqlInstKeyPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlInstKeyPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlInstKeyPrintDto mappingToDto(SqlInstKeyPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlInstKeyPrintDto dto = new SqlInstKeyPrintDto();
        dto.setInventoryHId(entity.getInventoryHId());
        dto.setInventoryDt(entity.getInventoryDt());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setCggdid(entity.getCggdid());
        dto.setFcflg(entity.getFcflg());
        dto.setUsernum4(entity.getUsernum4());
        dto.setUsernum3(entity.getUsernum3());
        dto.setDiffqtyHenpin(entity.getDiffqtyHenpin());
        dto.setDiffqtyTaxrefond(entity.getDiffqtyTaxrefond());
        dto.setChargeNum(entity.getChargeNum());
        dto.setSuffererQty(entity.getSuffererQty());
        dto.setMonthStatussu(entity.getMonthStatussu());
        dto.setBlukRecivedQty(entity.getBlukRecivedQty());
        dto.setRefunditemQty(entity.getRefunditemQty());
        dto.setUnit1(entity.getUnit1());
        dto.setUnit2(entity.getUnit2());
        dto.setCggdidNm(entity.getCggdidNm());
        dto.setFcflgNm(entity.getFcflgNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlInstKeyPrintDto> mappingToDtoList(List<SqlInstKeyPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlInstKeyPrintDto> dtoList = new ArrayList<SqlInstKeyPrintDto>();
        for (SqlInstKeyPrint entity : entityList) {
            SqlInstKeyPrintDto dto = mappingToDto(entity);
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
    public SqlInstKeyPrint mappingToEntity(SqlInstKeyPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlInstKeyPrint entity = new SqlInstKeyPrint();
        if (needsMapping(dto, dto.getInventoryHId(), "inventoryHId")) {
            entity.setInventoryHId(dto.getInventoryHId());
        }
        if (needsMapping(dto, dto.getInventoryDt(), "inventoryDt")) {
            entity.setInventoryDt(dto.getInventoryDt());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getFcflg(), "fcflg")) {
            entity.setFcflg(dto.getFcflg());
        }
        if (needsMapping(dto, dto.getUsernum4(), "usernum4")) {
            entity.setUsernum4(dto.getUsernum4());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getDiffqtyHenpin(), "diffqtyHenpin")) {
            entity.setDiffqtyHenpin(dto.getDiffqtyHenpin());
        }
        if (needsMapping(dto, dto.getDiffqtyTaxrefond(), "diffqtyTaxrefond")) {
            entity.setDiffqtyTaxrefond(dto.getDiffqtyTaxrefond());
        }
        if (needsMapping(dto, dto.getChargeNum(), "chargeNum")) {
            entity.setChargeNum(dto.getChargeNum());
        }
        if (needsMapping(dto, dto.getSuffererQty(), "suffererQty")) {
            entity.setSuffererQty(dto.getSuffererQty());
        }
        if (needsMapping(dto, dto.getMonthStatussu(), "monthStatussu")) {
            entity.setMonthStatussu(dto.getMonthStatussu());
        }
        if (needsMapping(dto, dto.getBlukRecivedQty(), "blukRecivedQty")) {
            entity.setBlukRecivedQty(dto.getBlukRecivedQty());
        }
        if (needsMapping(dto, dto.getRefunditemQty(), "refunditemQty")) {
            entity.setRefunditemQty(dto.getRefunditemQty());
        }
        if (needsMapping(dto, dto.getUnit1(), "unit1")) {
            entity.setUnit1(dto.getUnit1());
        }
        if (needsMapping(dto, dto.getUnit2(), "unit2")) {
            entity.setUnit2(dto.getUnit2());
        }
        if (needsMapping(dto, dto.getCggdidNm(), "cggdidNm")) {
            entity.setCggdidNm(dto.getCggdidNm());
        }
        if (needsMapping(dto, dto.getFcflgNm(), "fcflgNm")) {
            entity.setFcflgNm(dto.getFcflgNm());
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
    protected boolean needsMapping(SqlInstKeyPrintDto dto, Object value, String propName) {
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
    public List<SqlInstKeyPrint> mappingToEntityList(List<SqlInstKeyPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlInstKeyPrint> entityList = new ArrayList<SqlInstKeyPrint>();
        for (SqlInstKeyPrintDto dto : dtoList) {
            SqlInstKeyPrint entity = mappingToEntity(dto);
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
    public SqlInstKeyPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlInstKeyPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlInstKeyPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlInstKeyPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlInstKeyPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlInstKeyPrintDtoMapper)this;
    }
}
