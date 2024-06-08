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
 * The DTO mapper of T_DRCDIZQA as TABLE. <br>
 * 方面別残数
 * <pre>
 * [primary-key]
 *     HOUMEN_REMAINING_ID
 *
 * [column]
 *     HOUMEN_REMAINING_ID, ZZORGNCD, LINBLK, SRRNK, LOCID, ZZMATNR, DLVYMD, DPCD, DED, PSTNID, COMT, SROPRTCNT, CSROPRTCNT, CINLADDRCSRRNK, ZQACP, ZQACTQA, SSQA, DSCB, DSCT, SRLIN, STOCKDATE, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOUMEN_REMAINING_ID
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
public abstract class BsTDrcdizqaDtoMapper implements DtoMapper<TDrcdizqa, TDrcdizqaDto>, Serializable {

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
    public BsTDrcdizqaDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTDrcdizqaDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TDrcdizqaDto mappingToDto(TDrcdizqa entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TDrcdizqaDto dto = new TDrcdizqaDto();
        dto.setHoumenRemainingId(entity.getHoumenRemainingId());
        dto.setZzorgncd(entity.getZzorgncd());
        dto.setLinblk(entity.getLinblk());
        dto.setSrrnk(entity.getSrrnk());
        dto.setLocid(entity.getLocid());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setDlvymd(entity.getDlvymd());
        dto.setDpcd(entity.getDpcd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setComt(entity.getComt());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setCsroprtcnt(entity.getCsroprtcnt());
        dto.setCinladdrcsrrnk(entity.getCinladdrcsrrnk());
        dto.setZqacp(entity.getZqacp());
        dto.setZqactqa(entity.getZqactqa());
        dto.setSsqa(entity.getSsqa());
        dto.setDscb(entity.getDscb());
        dto.setDsct(entity.getDsct());
        dto.setSrlin(entity.getSrlin());
        dto.setStockdate(entity.getStockdate());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
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
    public List<TDrcdizqaDto> mappingToDtoList(List<TDrcdizqa> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TDrcdizqaDto> dtoList = new ArrayList<TDrcdizqaDto>();
        for (TDrcdizqa entity : entityList) {
            TDrcdizqaDto dto = mappingToDto(entity);
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
    public TDrcdizqa mappingToEntity(TDrcdizqaDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TDrcdizqa entity = new TDrcdizqa();
        if (needsMapping(dto, dto.getHoumenRemainingId(), "houmenRemainingId")) {
            entity.setHoumenRemainingId(dto.getHoumenRemainingId());
        }
        if (needsMapping(dto, dto.getZzorgncd(), "zzorgncd")) {
            entity.setZzorgncd(dto.getZzorgncd());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getSrrnk(), "srrnk")) {
            entity.setSrrnk(dto.getSrrnk());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getDlvymd(), "dlvymd")) {
            entity.setDlvymd(dto.getDlvymd());
        }
        if (needsMapping(dto, dto.getDpcd(), "dpcd")) {
            entity.setDpcd(dto.getDpcd());
        }
        if (needsMapping(dto, dto.getDed(), "ded")) {
            entity.setDed(dto.getDed());
        }
        if (needsMapping(dto, dto.getPstnid(), "pstnid")) {
            entity.setPstnid(dto.getPstnid());
        }
        if (needsMapping(dto, dto.getComt(), "comt")) {
            entity.setComt(dto.getComt());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getCsroprtcnt(), "csroprtcnt")) {
            entity.setCsroprtcnt(dto.getCsroprtcnt());
        }
        if (needsMapping(dto, dto.getCinladdrcsrrnk(), "cinladdrcsrrnk")) {
            entity.setCinladdrcsrrnk(dto.getCinladdrcsrrnk());
        }
        if (needsMapping(dto, dto.getZqacp(), "zqacp")) {
            entity.setZqacp(dto.getZqacp());
        }
        if (needsMapping(dto, dto.getZqactqa(), "zqactqa")) {
            entity.setZqactqa(dto.getZqactqa());
        }
        if (needsMapping(dto, dto.getSsqa(), "ssqa")) {
            entity.setSsqa(dto.getSsqa());
        }
        if (needsMapping(dto, dto.getDscb(), "dscb")) {
            entity.setDscb(dto.getDscb());
        }
        if (needsMapping(dto, dto.getDsct(), "dsct")) {
            entity.setDsct(dto.getDsct());
        }
        if (needsMapping(dto, dto.getSrlin(), "srlin")) {
            entity.setSrlin(dto.getSrlin());
        }
        if (needsMapping(dto, dto.getStockdate(), "stockdate")) {
            entity.setStockdate(dto.getStockdate());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
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
    protected boolean needsMapping(TDrcdizqaDto dto, Object value, String propName) {
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
    public List<TDrcdizqa> mappingToEntityList(List<TDrcdizqaDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TDrcdizqa> entityList = new ArrayList<TDrcdizqa>();
        for (TDrcdizqaDto dto : dtoList) {
            TDrcdizqa entity = mappingToEntity(dto);
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
    public TDrcdizqaDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TDrcdizqaDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TDrcdizqaDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TDrcdizqaDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TDrcdizqaDtoMapper reverseReference() {
        setReverseReference(true);
        return (TDrcdizqaDtoMapper)this;
    }
}
