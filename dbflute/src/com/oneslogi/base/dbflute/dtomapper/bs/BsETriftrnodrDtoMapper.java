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
 * The DTO mapper of E_TRIFTRNODR as TABLE. <br>
 * IF振替指示
 * <pre>
 * [primary-key]
 *     IFDATAKEY
 *
 * [column]
 *     IFDATAKEY, SEGNAME, REFNO, NEXUSPKEY, ORDERNO, ORDERTYPE, CUSTORDERNO, TRANTYPE, RMANO, TRANSDETAILTYPE, SCHDATE, SCHTIME, ACTUALDATE, ACTUALTIME, WAREHOUSECD, FROMCOMPANYCD, FROMOWNERCD, TOCOMPANYCD, TOOWNERCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PRIORITY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsETriftrnodrDtoMapper implements DtoMapper<ETriftrnodr, ETriftrnodrDto>, Serializable {

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
    public BsETriftrnodrDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsETriftrnodrDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ETriftrnodrDto mappingToDto(ETriftrnodr entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETriftrnodrDto dto = new ETriftrnodrDto();
        dto.setIfdatakey(entity.getIfdatakey());
        dto.setSegname(entity.getSegname());
        dto.setRefno(entity.getRefno());
        dto.setNexuspkey(entity.getNexuspkey());
        dto.setOrderno(entity.getOrderno());
        dto.setOrdertype(entity.getOrdertype());
        dto.setCustorderno(entity.getCustorderno());
        dto.setTrantype(entity.getTrantype());
        dto.setRmano(entity.getRmano());
        dto.setTransdetailtype(entity.getTransdetailtype());
        dto.setSchdate(entity.getSchdate());
        dto.setSchtime(entity.getSchtime());
        dto.setActualdate(entity.getActualdate());
        dto.setActualtime(entity.getActualtime());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setFromcompanycd(entity.getFromcompanycd());
        dto.setFromownercd(entity.getFromownercd());
        dto.setTocompanycd(entity.getTocompanycd());
        dto.setToownercd(entity.getToownercd());
        dto.setNotes(entity.getNotes());
        dto.setOtherrefno1(entity.getOtherrefno1());
        dto.setOtherrefno2(entity.getOtherrefno2());
        dto.setOtherrefno3(entity.getOtherrefno3());
        dto.setPriority(entity.getPriority());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ETriftrnodrDto> mappingToDtoList(List<ETriftrnodr> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ETriftrnodrDto> dtoList = new ArrayList<ETriftrnodrDto>();
        for (ETriftrnodr entity : entityList) {
            ETriftrnodrDto dto = mappingToDto(entity);
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
    public ETriftrnodr mappingToEntity(ETriftrnodrDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETriftrnodr entity = new ETriftrnodr();
        if (needsMapping(dto, dto.getIfdatakey(), "ifdatakey")) {
            entity.setIfdatakey(dto.getIfdatakey());
        }
        if (needsMapping(dto, dto.getSegname(), "segname")) {
            entity.setSegname(dto.getSegname());
        }
        if (needsMapping(dto, dto.getRefno(), "refno")) {
            entity.setRefno(dto.getRefno());
        }
        if (needsMapping(dto, dto.getNexuspkey(), "nexuspkey")) {
            entity.setNexuspkey(dto.getNexuspkey());
        }
        if (needsMapping(dto, dto.getOrderno(), "orderno")) {
            entity.setOrderno(dto.getOrderno());
        }
        if (needsMapping(dto, dto.getOrdertype(), "ordertype")) {
            entity.setOrdertype(dto.getOrdertype());
        }
        if (needsMapping(dto, dto.getCustorderno(), "custorderno")) {
            entity.setCustorderno(dto.getCustorderno());
        }
        if (needsMapping(dto, dto.getTrantype(), "trantype")) {
            entity.setTrantype(dto.getTrantype());
        }
        if (needsMapping(dto, dto.getRmano(), "rmano")) {
            entity.setRmano(dto.getRmano());
        }
        if (needsMapping(dto, dto.getTransdetailtype(), "transdetailtype")) {
            entity.setTransdetailtype(dto.getTransdetailtype());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getSchtime(), "schtime")) {
            entity.setSchtime(dto.getSchtime());
        }
        if (needsMapping(dto, dto.getActualdate(), "actualdate")) {
            entity.setActualdate(dto.getActualdate());
        }
        if (needsMapping(dto, dto.getActualtime(), "actualtime")) {
            entity.setActualtime(dto.getActualtime());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getFromcompanycd(), "fromcompanycd")) {
            entity.setFromcompanycd(dto.getFromcompanycd());
        }
        if (needsMapping(dto, dto.getFromownercd(), "fromownercd")) {
            entity.setFromownercd(dto.getFromownercd());
        }
        if (needsMapping(dto, dto.getTocompanycd(), "tocompanycd")) {
            entity.setTocompanycd(dto.getTocompanycd());
        }
        if (needsMapping(dto, dto.getToownercd(), "toownercd")) {
            entity.setToownercd(dto.getToownercd());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getOtherrefno1(), "otherrefno1")) {
            entity.setOtherrefno1(dto.getOtherrefno1());
        }
        if (needsMapping(dto, dto.getOtherrefno2(), "otherrefno2")) {
            entity.setOtherrefno2(dto.getOtherrefno2());
        }
        if (needsMapping(dto, dto.getOtherrefno3(), "otherrefno3")) {
            entity.setOtherrefno3(dto.getOtherrefno3());
        }
        if (needsMapping(dto, dto.getPriority(), "priority")) {
            entity.setPriority(dto.getPriority());
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
    protected boolean needsMapping(ETriftrnodrDto dto, Object value, String propName) {
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
    public List<ETriftrnodr> mappingToEntityList(List<ETriftrnodrDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ETriftrnodr> entityList = new ArrayList<ETriftrnodr>();
        for (ETriftrnodrDto dto : dtoList) {
            ETriftrnodr entity = mappingToEntity(dto);
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
    public ETriftrnodrDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ETriftrnodrDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ETriftrnodrDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ETriftrnodrDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ETriftrnodrDtoMapper reverseReference() {
        setReverseReference(true);
        return (ETriftrnodrDtoMapper)this;
    }
}
