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
 * The DTO mapper of T_TRCASEDETAIL as TABLE. <br>
 * ケース明細情報
 * <pre>
 * [primary-key]
 *     TRCASEDETAIL_ID
 *
 * [column]
 *     TRCASEDETAIL_ID, CASEDETAILNO, TRSYMBOL_ID, CREATEDATETIME, TRACETYPEDT, OPERATIONNUM, ASSORTINITNUM, ASSORTNUM, ASSORTEDCD, ASSORTEDUNIT, ASSORTEDINDEX, ASSORTDIFNUM, DIRECTIONCD, PISTONTYPE, DIRECTIONNUM, SHIPORDER, CUSTOMERCD, CASESERIAL, DISTWAREHOUSECD, SENDSTS, DT_EXTDATA1, DT_EXTDATA2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRCASEDETAIL_ID
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
public abstract class BsTTrcasedetailDtoMapper implements DtoMapper<TTrcasedetail, TTrcasedetailDto>, Serializable {

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
    public BsTTrcasedetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrcasedetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrcasedetailDto mappingToDto(TTrcasedetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrcasedetailDto dto = new TTrcasedetailDto();
        dto.setTrcasedetailId(entity.getTrcasedetailId());
        dto.setCasedetailno(entity.getCasedetailno());
        dto.setTrsymbolId(entity.getTrsymbolId());
        dto.setCreatedatetime(entity.getCreatedatetime());
        dto.setTracetypedt(entity.getTracetypedt());
        dto.setOperationnum(entity.getOperationnum());
        dto.setAssortinitnum(entity.getAssortinitnum());
        dto.setAssortnum(entity.getAssortnum());
        dto.setAssortedcd(entity.getAssortedcd());
        dto.setAssortedunit(entity.getAssortedunit());
        dto.setAssortedindex(entity.getAssortedindex());
        dto.setAssortdifnum(entity.getAssortdifnum());
        dto.setDirectioncd(entity.getDirectioncd());
        dto.setPistontype(entity.getPistontype());
        dto.setDirectionnum(entity.getDirectionnum());
        dto.setShiporder(entity.getShiporder());
        dto.setCustomercd(entity.getCustomercd());
        dto.setCaseserial(entity.getCaseserial());
        dto.setDistwarehousecd(entity.getDistwarehousecd());
        dto.setSendsts(entity.getSendsts());
        dto.setDtExtdata1(entity.getDtExtdata1());
        dto.setDtExtdata2(entity.getDtExtdata2());
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
    public List<TTrcasedetailDto> mappingToDtoList(List<TTrcasedetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrcasedetailDto> dtoList = new ArrayList<TTrcasedetailDto>();
        for (TTrcasedetail entity : entityList) {
            TTrcasedetailDto dto = mappingToDto(entity);
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
    public TTrcasedetail mappingToEntity(TTrcasedetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrcasedetail entity = new TTrcasedetail();
        if (needsMapping(dto, dto.getTrcasedetailId(), "trcasedetailId")) {
            entity.setTrcasedetailId(dto.getTrcasedetailId());
        }
        if (needsMapping(dto, dto.getCasedetailno(), "casedetailno")) {
            entity.setCasedetailno(dto.getCasedetailno());
        }
        if (needsMapping(dto, dto.getTrsymbolId(), "trsymbolId")) {
            entity.setTrsymbolId(dto.getTrsymbolId());
        }
        if (needsMapping(dto, dto.getCreatedatetime(), "createdatetime")) {
            entity.setCreatedatetime(dto.getCreatedatetime());
        }
        if (needsMapping(dto, dto.getTracetypedt(), "tracetypedt")) {
            entity.setTracetypedt(dto.getTracetypedt());
        }
        if (needsMapping(dto, dto.getOperationnum(), "operationnum")) {
            entity.setOperationnum(dto.getOperationnum());
        }
        if (needsMapping(dto, dto.getAssortinitnum(), "assortinitnum")) {
            entity.setAssortinitnum(dto.getAssortinitnum());
        }
        if (needsMapping(dto, dto.getAssortnum(), "assortnum")) {
            entity.setAssortnum(dto.getAssortnum());
        }
        if (needsMapping(dto, dto.getAssortedcd(), "assortedcd")) {
            entity.setAssortedcd(dto.getAssortedcd());
        }
        if (needsMapping(dto, dto.getAssortedunit(), "assortedunit")) {
            entity.setAssortedunit(dto.getAssortedunit());
        }
        if (needsMapping(dto, dto.getAssortedindex(), "assortedindex")) {
            entity.setAssortedindex(dto.getAssortedindex());
        }
        if (needsMapping(dto, dto.getAssortdifnum(), "assortdifnum")) {
            entity.setAssortdifnum(dto.getAssortdifnum());
        }
        if (needsMapping(dto, dto.getDirectioncd(), "directioncd")) {
            entity.setDirectioncd(dto.getDirectioncd());
        }
        if (needsMapping(dto, dto.getPistontype(), "pistontype")) {
            entity.setPistontype(dto.getPistontype());
        }
        if (needsMapping(dto, dto.getDirectionnum(), "directionnum")) {
            entity.setDirectionnum(dto.getDirectionnum());
        }
        if (needsMapping(dto, dto.getShiporder(), "shiporder")) {
            entity.setShiporder(dto.getShiporder());
        }
        if (needsMapping(dto, dto.getCustomercd(), "customercd")) {
            entity.setCustomercd(dto.getCustomercd());
        }
        if (needsMapping(dto, dto.getCaseserial(), "caseserial")) {
            entity.setCaseserial(dto.getCaseserial());
        }
        if (needsMapping(dto, dto.getDistwarehousecd(), "distwarehousecd")) {
            entity.setDistwarehousecd(dto.getDistwarehousecd());
        }
        if (needsMapping(dto, dto.getSendsts(), "sendsts")) {
            entity.setSendsts(dto.getSendsts());
        }
        if (needsMapping(dto, dto.getDtExtdata1(), "dtExtdata1")) {
            entity.setDtExtdata1(dto.getDtExtdata1());
        }
        if (needsMapping(dto, dto.getDtExtdata2(), "dtExtdata2")) {
            entity.setDtExtdata2(dto.getDtExtdata2());
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
    protected boolean needsMapping(TTrcasedetailDto dto, Object value, String propName) {
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
    public List<TTrcasedetail> mappingToEntityList(List<TTrcasedetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrcasedetail> entityList = new ArrayList<TTrcasedetail>();
        for (TTrcasedetailDto dto : dtoList) {
            TTrcasedetail entity = mappingToEntity(dto);
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
    public TTrcasedetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrcasedetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrcasedetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrcasedetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrcasedetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrcasedetailDtoMapper)this;
    }
}
