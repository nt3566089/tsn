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
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlBoxMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BOX_CD, BOX_NM, BOX_TYPE, BOX_TYPE_NM, BXWEIGHT, BXOSZL, BXOSZW, BXOSZH, LENGTH, WIDTH, HEIGHT, BXCPY, VOLUME_RATE, DEL_FLG, DEL_FLG_NM, VERSION_NO, BOX_ID, CENTER_ID
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
public abstract class BsSqlBoxMasterDtoMapper implements DtoMapper<SqlBoxMaster, SqlBoxMasterDto>, Serializable {

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
    public BsSqlBoxMasterDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlBoxMasterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlBoxMasterDto mappingToDto(SqlBoxMaster entity) {
        if (entity == null) {
            return null;
        }
        SqlBoxMasterDto dto = new SqlBoxMasterDto();
        dto.setBoxCd(entity.getBoxCd());
        dto.setBoxNm(entity.getBoxNm());
        dto.setBoxType(entity.getBoxType());
        dto.setBoxTypeNm(entity.getBoxTypeNm());
        dto.setBxweight(entity.getBxweight());
        dto.setBxoszl(entity.getBxoszl());
        dto.setBxoszw(entity.getBxoszw());
        dto.setBxoszh(entity.getBxoszh());
        dto.setLength(entity.getLength());
        dto.setWidth(entity.getWidth());
        dto.setHeight(entity.getHeight());
        dto.setBxcpy(entity.getBxcpy());
        dto.setVolumeRate(entity.getVolumeRate());
        dto.setDelFlg(entity.getDelFlg());
        dto.setDelFlgNm(entity.getDelFlgNm());
        dto.setVersionNo(entity.getVersionNo());
        dto.setBoxId(entity.getBoxId());
        dto.setCenterId(entity.getCenterId());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlBoxMasterDto> mappingToDtoList(List<SqlBoxMaster> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlBoxMasterDto> dtoList = new ArrayList<SqlBoxMasterDto>();
        for (SqlBoxMaster entity : entityList) {
            SqlBoxMasterDto dto = mappingToDto(entity);
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
    public SqlBoxMaster mappingToEntity(SqlBoxMasterDto dto) {
        if (dto == null) {
            return null;
        }
        SqlBoxMaster entity = new SqlBoxMaster();
        if (needsMapping(dto, dto.getBoxCd(), "boxCd")) {
            entity.setBoxCd(dto.getBoxCd());
        }
        if (needsMapping(dto, dto.getBoxNm(), "boxNm")) {
            entity.setBoxNm(dto.getBoxNm());
        }
        if (needsMapping(dto, dto.getBoxType(), "boxType")) {
            entity.setBoxType(dto.getBoxType());
        }
        if (needsMapping(dto, dto.getBoxTypeNm(), "boxTypeNm")) {
            entity.setBoxTypeNm(dto.getBoxTypeNm());
        }
        if (needsMapping(dto, dto.getBxweight(), "bxweight")) {
            entity.setBxweight(dto.getBxweight());
        }
        if (needsMapping(dto, dto.getBxoszl(), "bxoszl")) {
            entity.setBxoszl(dto.getBxoszl());
        }
        if (needsMapping(dto, dto.getBxoszw(), "bxoszw")) {
            entity.setBxoszw(dto.getBxoszw());
        }
        if (needsMapping(dto, dto.getBxoszh(), "bxoszh")) {
            entity.setBxoszh(dto.getBxoszh());
        }
        if (needsMapping(dto, dto.getLength(), "length")) {
            entity.setLength(dto.getLength());
        }
        if (needsMapping(dto, dto.getWidth(), "width")) {
            entity.setWidth(dto.getWidth());
        }
        if (needsMapping(dto, dto.getHeight(), "height")) {
            entity.setHeight(dto.getHeight());
        }
        if (needsMapping(dto, dto.getBxcpy(), "bxcpy")) {
            entity.setBxcpy(dto.getBxcpy());
        }
        if (needsMapping(dto, dto.getVolumeRate(), "volumeRate")) {
            entity.setVolumeRate(dto.getVolumeRate());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getDelFlgNm(), "delFlgNm")) {
            entity.setDelFlgNm(dto.getDelFlgNm());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getBoxId(), "boxId")) {
            entity.setBoxId(dto.getBoxId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
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
    protected boolean needsMapping(SqlBoxMasterDto dto, Object value, String propName) {
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
    public List<SqlBoxMaster> mappingToEntityList(List<SqlBoxMasterDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlBoxMaster> entityList = new ArrayList<SqlBoxMaster>();
        for (SqlBoxMasterDto dto : dtoList) {
            SqlBoxMaster entity = mappingToEntity(dto);
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
    public SqlBoxMasterDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlBoxMasterDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlBoxMasterDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlBoxMasterDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlBoxMasterDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlBoxMasterDtoMapper)this;
    }
}
