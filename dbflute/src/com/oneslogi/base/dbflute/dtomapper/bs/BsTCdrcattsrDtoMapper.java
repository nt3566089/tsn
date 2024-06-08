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
 * The DTO mapper of T_CDRCATTSR as TABLE. <br>
 * 方面属性（仕分処理用）
 * <pre>
 * [primary-key]
 *     HOUMEN_SORT_ID
 *
 * [column]
 *     HOUMEN_SORT_ID, ZZORGNCD, DPCD, DLVYMD, DRCCD, ZZPSTNID, SRLIN, SRRNK, SNMPRTRNKAD, SRWKDY, COMT, SPRPRSID, ODDVID, HDRDBXUSID, SROPRTCNT, IOID, WRKMFG, IKEIINCLDFLG, SORT_DATE, CENTER_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_SORT_ID
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
public abstract class BsTCdrcattsrDtoMapper implements DtoMapper<TCdrcattsr, TCdrcattsrDto>, Serializable {

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
    public BsTCdrcattsrDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTCdrcattsrDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TCdrcattsrDto mappingToDto(TCdrcattsr entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCdrcattsrDto dto = new TCdrcattsrDto();
        dto.setHoumenSortId(entity.getHoumenSortId());
        dto.setZzorgncd(entity.getZzorgncd());
        dto.setDpcd(entity.getDpcd());
        dto.setDlvymd(entity.getDlvymd());
        dto.setDrccd(entity.getDrccd());
        dto.setZzpstnid(entity.getZzpstnid());
        dto.setSrlin(entity.getSrlin());
        dto.setSrrnk(entity.getSrrnk());
        dto.setSnmprtrnkad(entity.getSnmprtrnkad());
        dto.setSrwkdy(entity.getSrwkdy());
        dto.setComt(entity.getComt());
        dto.setSprprsid(entity.getSprprsid());
        dto.setOddvid(entity.getOddvid());
        dto.setHdrdbxusid(entity.getHdrdbxusid());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setIoid(entity.getIoid());
        dto.setWrkmfg(entity.getWrkmfg());
        dto.setIkeiincldflg(entity.getIkeiincldflg());
        dto.setSortDate(entity.getSortDate());
        dto.setCenterId(entity.getCenterId());
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
    public List<TCdrcattsrDto> mappingToDtoList(List<TCdrcattsr> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TCdrcattsrDto> dtoList = new ArrayList<TCdrcattsrDto>();
        for (TCdrcattsr entity : entityList) {
            TCdrcattsrDto dto = mappingToDto(entity);
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
    public TCdrcattsr mappingToEntity(TCdrcattsrDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCdrcattsr entity = new TCdrcattsr();
        if (needsMapping(dto, dto.getHoumenSortId(), "houmenSortId")) {
            entity.setHoumenSortId(dto.getHoumenSortId());
        }
        if (needsMapping(dto, dto.getZzorgncd(), "zzorgncd")) {
            entity.setZzorgncd(dto.getZzorgncd());
        }
        if (needsMapping(dto, dto.getDpcd(), "dpcd")) {
            entity.setDpcd(dto.getDpcd());
        }
        if (needsMapping(dto, dto.getDlvymd(), "dlvymd")) {
            entity.setDlvymd(dto.getDlvymd());
        }
        if (needsMapping(dto, dto.getDrccd(), "drccd")) {
            entity.setDrccd(dto.getDrccd());
        }
        if (needsMapping(dto, dto.getZzpstnid(), "zzpstnid")) {
            entity.setZzpstnid(dto.getZzpstnid());
        }
        if (needsMapping(dto, dto.getSrlin(), "srlin")) {
            entity.setSrlin(dto.getSrlin());
        }
        if (needsMapping(dto, dto.getSrrnk(), "srrnk")) {
            entity.setSrrnk(dto.getSrrnk());
        }
        if (needsMapping(dto, dto.getSnmprtrnkad(), "snmprtrnkad")) {
            entity.setSnmprtrnkad(dto.getSnmprtrnkad());
        }
        if (needsMapping(dto, dto.getSrwkdy(), "srwkdy")) {
            entity.setSrwkdy(dto.getSrwkdy());
        }
        if (needsMapping(dto, dto.getComt(), "comt")) {
            entity.setComt(dto.getComt());
        }
        if (needsMapping(dto, dto.getSprprsid(), "sprprsid")) {
            entity.setSprprsid(dto.getSprprsid());
        }
        if (needsMapping(dto, dto.getOddvid(), "oddvid")) {
            entity.setOddvid(dto.getOddvid());
        }
        if (needsMapping(dto, dto.getHdrdbxusid(), "hdrdbxusid")) {
            entity.setHdrdbxusid(dto.getHdrdbxusid());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getIoid(), "ioid")) {
            entity.setIoid(dto.getIoid());
        }
        if (needsMapping(dto, dto.getWrkmfg(), "wrkmfg")) {
            entity.setWrkmfg(dto.getWrkmfg());
        }
        if (needsMapping(dto, dto.getIkeiincldflg(), "ikeiincldflg")) {
            entity.setIkeiincldflg(dto.getIkeiincldflg());
        }
        if (needsMapping(dto, dto.getSortDate(), "sortDate")) {
            entity.setSortDate(dto.getSortDate());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
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
    protected boolean needsMapping(TCdrcattsrDto dto, Object value, String propName) {
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
    public List<TCdrcattsr> mappingToEntityList(List<TCdrcattsrDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TCdrcattsr> entityList = new ArrayList<TCdrcattsr>();
        for (TCdrcattsrDto dto : dtoList) {
            TCdrcattsr entity = mappingToEntity(dto);
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
    public TCdrcattsrDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TCdrcattsrDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TCdrcattsrDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TCdrcattsrDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TCdrcattsrDtoMapper reverseReference() {
        setReverseReference(true);
        return (TCdrcattsrDtoMapper)this;
    }
}
