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
 * The DTO mapper of SqlLogList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MESSAGE_NM, DICT_NM, PROCESS_START_DT, PROCESS_END_DT, LOG_GROUP_CD, LOG_ID, LOG_GROUP_NM, PGM_CD, PGM_NM, ATTRIBUTE1, CENTER_NM, ATTRIBUTE2, CLIENT_NM, ATTRIBUTE3, ATTRIBUTE3_NM, ATTRIBUTE4, ATTRIBUTE4_NM, ATTRIBUTE5, ATTRIBUTE5_NM
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
public abstract class BsSqlLogListDtoMapper implements DtoMapper<SqlLogList, SqlLogListDto>, Serializable {

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
    public BsSqlLogListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlLogListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlLogListDto mappingToDto(SqlLogList entity) {
        if (entity == null) {
            return null;
        }
        SqlLogListDto dto = new SqlLogListDto();
        dto.setMessageNm(entity.getMessageNm());
        dto.setDictNm(entity.getDictNm());
        dto.setProcessStartDt(entity.getProcessStartDt());
        dto.setProcessEndDt(entity.getProcessEndDt());
        dto.setLogGroupCd(entity.getLogGroupCd());
        dto.setLogId(entity.getLogId());
        dto.setLogGroupNm(entity.getLogGroupNm());
        dto.setPgmCd(entity.getPgmCd());
        dto.setPgmNm(entity.getPgmNm());
        dto.setAttribute1(entity.getAttribute1());
        dto.setCenterNm(entity.getCenterNm());
        dto.setAttribute2(entity.getAttribute2());
        dto.setClientNm(entity.getClientNm());
        dto.setAttribute3(entity.getAttribute3());
        dto.setAttribute3Nm(entity.getAttribute3Nm());
        dto.setAttribute4(entity.getAttribute4());
        dto.setAttribute4Nm(entity.getAttribute4Nm());
        dto.setAttribute5(entity.getAttribute5());
        dto.setAttribute5Nm(entity.getAttribute5Nm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlLogListDto> mappingToDtoList(List<SqlLogList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlLogListDto> dtoList = new ArrayList<SqlLogListDto>();
        for (SqlLogList entity : entityList) {
            SqlLogListDto dto = mappingToDto(entity);
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
    public SqlLogList mappingToEntity(SqlLogListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlLogList entity = new SqlLogList();
        if (needsMapping(dto, dto.getMessageNm(), "messageNm")) {
            entity.setMessageNm(dto.getMessageNm());
        }
        if (needsMapping(dto, dto.getDictNm(), "dictNm")) {
            entity.setDictNm(dto.getDictNm());
        }
        if (needsMapping(dto, dto.getProcessStartDt(), "processStartDt")) {
            entity.setProcessStartDt(dto.getProcessStartDt());
        }
        if (needsMapping(dto, dto.getProcessEndDt(), "processEndDt")) {
            entity.setProcessEndDt(dto.getProcessEndDt());
        }
        if (needsMapping(dto, dto.getLogGroupCd(), "logGroupCd")) {
            entity.setLogGroupCd(dto.getLogGroupCd());
        }
        if (needsMapping(dto, dto.getLogId(), "logId")) {
            entity.setLogId(dto.getLogId());
        }
        if (needsMapping(dto, dto.getLogGroupNm(), "logGroupNm")) {
            entity.setLogGroupNm(dto.getLogGroupNm());
        }
        if (needsMapping(dto, dto.getPgmCd(), "pgmCd")) {
            entity.setPgmCd(dto.getPgmCd());
        }
        if (needsMapping(dto, dto.getPgmNm(), "pgmNm")) {
            entity.setPgmNm(dto.getPgmNm());
        }
        if (needsMapping(dto, dto.getAttribute1(), "attribute1")) {
            entity.setAttribute1(dto.getAttribute1());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getAttribute2(), "attribute2")) {
            entity.setAttribute2(dto.getAttribute2());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getAttribute3(), "attribute3")) {
            entity.setAttribute3(dto.getAttribute3());
        }
        if (needsMapping(dto, dto.getAttribute3Nm(), "attribute3Nm")) {
            entity.setAttribute3Nm(dto.getAttribute3Nm());
        }
        if (needsMapping(dto, dto.getAttribute4(), "attribute4")) {
            entity.setAttribute4(dto.getAttribute4());
        }
        if (needsMapping(dto, dto.getAttribute4Nm(), "attribute4Nm")) {
            entity.setAttribute4Nm(dto.getAttribute4Nm());
        }
        if (needsMapping(dto, dto.getAttribute5(), "attribute5")) {
            entity.setAttribute5(dto.getAttribute5());
        }
        if (needsMapping(dto, dto.getAttribute5Nm(), "attribute5Nm")) {
            entity.setAttribute5Nm(dto.getAttribute5Nm());
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
    protected boolean needsMapping(SqlLogListDto dto, Object value, String propName) {
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
    public List<SqlLogList> mappingToEntityList(List<SqlLogListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlLogList> entityList = new ArrayList<SqlLogList>();
        for (SqlLogListDto dto : dtoList) {
            SqlLogList entity = mappingToEntity(dto);
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
    public SqlLogListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlLogListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlLogListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlLogListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlLogListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlLogListDtoMapper)this;
    }
}
