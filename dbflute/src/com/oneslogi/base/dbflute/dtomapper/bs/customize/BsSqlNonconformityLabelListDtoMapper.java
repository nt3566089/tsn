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
 * The DTO mapper of SqlNonconformityLabelList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRBADITEMCASE_ID, CREATEDDATE, TARGETMON, ITEMCD, PRODUCT_ABBR, LBLKBN, INOUTKBN, VA_EXTDATA2, ALLOCPOLICYKEY, CASE_NUM, BADITEMCD, TODAY_NUM, CREATEDNUM, REPRINTEDFLG, VA_EXTDATA1, VERSION_NO, USERNUM3, CENTER_ID, CENTER_NM, CLIENT_ID, CLIENT_NM
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
public abstract class BsSqlNonconformityLabelListDtoMapper implements DtoMapper<SqlNonconformityLabelList, SqlNonconformityLabelListDto>, Serializable {

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
    public BsSqlNonconformityLabelListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlNonconformityLabelListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlNonconformityLabelListDto mappingToDto(SqlNonconformityLabelList entity) {
        if (entity == null) {
            return null;
        }
        SqlNonconformityLabelListDto dto = new SqlNonconformityLabelListDto();
        dto.setTrbaditemcaseId(entity.getTrbaditemcaseId());
        dto.setCreateddate(entity.getCreateddate());
        dto.setTargetmon(entity.getTargetmon());
        dto.setItemcd(entity.getItemcd());
        dto.setProductAbbr(entity.getProductAbbr());
        dto.setLblkbn(entity.getLblkbn());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setVaExtdata2(entity.getVaExtdata2());
        dto.setAllocpolicykey(entity.getAllocpolicykey());
        dto.setCaseNum(entity.getCaseNum());
        dto.setBaditemcd(entity.getBaditemcd());
        dto.setTodayNum(entity.getTodayNum());
        dto.setCreatednum(entity.getCreatednum());
        dto.setReprintedflg(entity.getReprintedflg());
        dto.setVaExtdata1(entity.getVaExtdata1());
        dto.setVersionNo(entity.getVersionNo());
        dto.setUsernum3(entity.getUsernum3());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterNm(entity.getCenterNm());
        dto.setClientId(entity.getClientId());
        dto.setClientNm(entity.getClientNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlNonconformityLabelListDto> mappingToDtoList(List<SqlNonconformityLabelList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlNonconformityLabelListDto> dtoList = new ArrayList<SqlNonconformityLabelListDto>();
        for (SqlNonconformityLabelList entity : entityList) {
            SqlNonconformityLabelListDto dto = mappingToDto(entity);
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
    public SqlNonconformityLabelList mappingToEntity(SqlNonconformityLabelListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlNonconformityLabelList entity = new SqlNonconformityLabelList();
        if (needsMapping(dto, dto.getTrbaditemcaseId(), "trbaditemcaseId")) {
            entity.setTrbaditemcaseId(dto.getTrbaditemcaseId());
        }
        if (needsMapping(dto, dto.getCreateddate(), "createddate")) {
            entity.setCreateddate(dto.getCreateddate());
        }
        if (needsMapping(dto, dto.getTargetmon(), "targetmon")) {
            entity.setTargetmon(dto.getTargetmon());
        }
        if (needsMapping(dto, dto.getItemcd(), "itemcd")) {
            entity.setItemcd(dto.getItemcd());
        }
        if (needsMapping(dto, dto.getProductAbbr(), "productAbbr")) {
            entity.setProductAbbr(dto.getProductAbbr());
        }
        if (needsMapping(dto, dto.getLblkbn(), "lblkbn")) {
            entity.setLblkbn(dto.getLblkbn());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getVaExtdata2(), "vaExtdata2")) {
            entity.setVaExtdata2(dto.getVaExtdata2());
        }
        if (needsMapping(dto, dto.getAllocpolicykey(), "allocpolicykey")) {
            entity.setAllocpolicykey(dto.getAllocpolicykey());
        }
        if (needsMapping(dto, dto.getCaseNum(), "caseNum")) {
            entity.setCaseNum(dto.getCaseNum());
        }
        if (needsMapping(dto, dto.getBaditemcd(), "baditemcd")) {
            entity.setBaditemcd(dto.getBaditemcd());
        }
        if (needsMapping(dto, dto.getTodayNum(), "todayNum")) {
            entity.setTodayNum(dto.getTodayNum());
        }
        if (needsMapping(dto, dto.getCreatednum(), "creatednum")) {
            entity.setCreatednum(dto.getCreatednum());
        }
        if (needsMapping(dto, dto.getReprintedflg(), "reprintedflg")) {
            entity.setReprintedflg(dto.getReprintedflg());
        }
        if (needsMapping(dto, dto.getVaExtdata1(), "vaExtdata1")) {
            entity.setVaExtdata1(dto.getVaExtdata1());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
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
    protected boolean needsMapping(SqlNonconformityLabelListDto dto, Object value, String propName) {
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
    public List<SqlNonconformityLabelList> mappingToEntityList(List<SqlNonconformityLabelListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlNonconformityLabelList> entityList = new ArrayList<SqlNonconformityLabelList>();
        for (SqlNonconformityLabelListDto dto : dtoList) {
            SqlNonconformityLabelList entity = mappingToEntity(dto);
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
    public SqlNonconformityLabelListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlNonconformityLabelListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlNonconformityLabelListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlNonconformityLabelListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlNonconformityLabelListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlNonconformityLabelListDtoMapper)this;
    }
}
