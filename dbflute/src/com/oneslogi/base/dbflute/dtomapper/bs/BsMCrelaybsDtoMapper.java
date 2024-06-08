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
 * The DTO mapper of M_CRELAYBS as TABLE. <br>
 * 中継拠点マスタ
 * <pre>
 * [primary-key]
 *     CRELAYBS_ID
 *
 * [column]
 *     CRELAYBS_ID, RLYBSCD, DLVDPCD, RLYBSNM, RLYBSSNM, RLYBSP, RLYBSACD, RLYBSCCD, RLYBSAR, RLYBSTL, RLYBSFN, RLYBSID, RLYSHAN, DELYMD, CHNGYD, UPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CRELAYBS_ID
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
public abstract class BsMCrelaybsDtoMapper implements DtoMapper<MCrelaybs, MCrelaybsDto>, Serializable {

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
    public BsMCrelaybsDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCrelaybsDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCrelaybsDto mappingToDto(MCrelaybs entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCrelaybsDto dto = new MCrelaybsDto();
        dto.setCrelaybsId(entity.getCrelaybsId());
        dto.setRlybscd(entity.getRlybscd());
        dto.setDlvdpcd(entity.getDlvdpcd());
        dto.setRlybsnm(entity.getRlybsnm());
        dto.setRlybssnm(entity.getRlybssnm());
        dto.setRlybsp(entity.getRlybsp());
        dto.setRlybsacd(entity.getRlybsacd());
        dto.setRlybsccd(entity.getRlybsccd());
        dto.setRlybsar(entity.getRlybsar());
        dto.setRlybstl(entity.getRlybstl());
        dto.setRlybsfn(entity.getRlybsfn());
        dto.setRlybsid(entity.getRlybsid());
        dto.setRlyshan(entity.getRlyshan());
        dto.setDelymd(entity.getDelymd());
        dto.setChngyd(entity.getChngyd());
        dto.setUpdtm(entity.getUpdtm());
        dto.setZzfrdateh(entity.getZzfrdateh());
        dto.setZztodateh(entity.getZztodateh());
        dto.setRcdupdps(entity.getRcdupdps());
        dto.setUpdpocd(entity.getUpdpocd());
        dto.setOtcmpfg(entity.getOtcmpfg());
        dto.setTmcmpfg(entity.getTmcmpfg());
        dto.setStmid(entity.getStmid());
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
    public List<MCrelaybsDto> mappingToDtoList(List<MCrelaybs> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCrelaybsDto> dtoList = new ArrayList<MCrelaybsDto>();
        for (MCrelaybs entity : entityList) {
            MCrelaybsDto dto = mappingToDto(entity);
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
    public MCrelaybs mappingToEntity(MCrelaybsDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCrelaybs entity = new MCrelaybs();
        if (needsMapping(dto, dto.getCrelaybsId(), "crelaybsId")) {
            entity.setCrelaybsId(dto.getCrelaybsId());
        }
        if (needsMapping(dto, dto.getRlybscd(), "rlybscd")) {
            entity.setRlybscd(dto.getRlybscd());
        }
        if (needsMapping(dto, dto.getDlvdpcd(), "dlvdpcd")) {
            entity.setDlvdpcd(dto.getDlvdpcd());
        }
        if (needsMapping(dto, dto.getRlybsnm(), "rlybsnm")) {
            entity.setRlybsnm(dto.getRlybsnm());
        }
        if (needsMapping(dto, dto.getRlybssnm(), "rlybssnm")) {
            entity.setRlybssnm(dto.getRlybssnm());
        }
        if (needsMapping(dto, dto.getRlybsp(), "rlybsp")) {
            entity.setRlybsp(dto.getRlybsp());
        }
        if (needsMapping(dto, dto.getRlybsacd(), "rlybsacd")) {
            entity.setRlybsacd(dto.getRlybsacd());
        }
        if (needsMapping(dto, dto.getRlybsccd(), "rlybsccd")) {
            entity.setRlybsccd(dto.getRlybsccd());
        }
        if (needsMapping(dto, dto.getRlybsar(), "rlybsar")) {
            entity.setRlybsar(dto.getRlybsar());
        }
        if (needsMapping(dto, dto.getRlybstl(), "rlybstl")) {
            entity.setRlybstl(dto.getRlybstl());
        }
        if (needsMapping(dto, dto.getRlybsfn(), "rlybsfn")) {
            entity.setRlybsfn(dto.getRlybsfn());
        }
        if (needsMapping(dto, dto.getRlybsid(), "rlybsid")) {
            entity.setRlybsid(dto.getRlybsid());
        }
        if (needsMapping(dto, dto.getRlyshan(), "rlyshan")) {
            entity.setRlyshan(dto.getRlyshan());
        }
        if (needsMapping(dto, dto.getDelymd(), "delymd")) {
            entity.setDelymd(dto.getDelymd());
        }
        if (needsMapping(dto, dto.getChngyd(), "chngyd")) {
            entity.setChngyd(dto.getChngyd());
        }
        if (needsMapping(dto, dto.getUpdtm(), "updtm")) {
            entity.setUpdtm(dto.getUpdtm());
        }
        if (needsMapping(dto, dto.getZzfrdateh(), "zzfrdateh")) {
            entity.setZzfrdateh(dto.getZzfrdateh());
        }
        if (needsMapping(dto, dto.getZztodateh(), "zztodateh")) {
            entity.setZztodateh(dto.getZztodateh());
        }
        if (needsMapping(dto, dto.getRcdupdps(), "rcdupdps")) {
            entity.setRcdupdps(dto.getRcdupdps());
        }
        if (needsMapping(dto, dto.getUpdpocd(), "updpocd")) {
            entity.setUpdpocd(dto.getUpdpocd());
        }
        if (needsMapping(dto, dto.getOtcmpfg(), "otcmpfg")) {
            entity.setOtcmpfg(dto.getOtcmpfg());
        }
        if (needsMapping(dto, dto.getTmcmpfg(), "tmcmpfg")) {
            entity.setTmcmpfg(dto.getTmcmpfg());
        }
        if (needsMapping(dto, dto.getStmid(), "stmid")) {
            entity.setStmid(dto.getStmid());
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
    protected boolean needsMapping(MCrelaybsDto dto, Object value, String propName) {
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
    public List<MCrelaybs> mappingToEntityList(List<MCrelaybsDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCrelaybs> entityList = new ArrayList<MCrelaybs>();
        for (MCrelaybsDto dto : dtoList) {
            MCrelaybs entity = mappingToEntity(dto);
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
    public MCrelaybsDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCrelaybsDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCrelaybsDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCrelaybsDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCrelaybsDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCrelaybsDtoMapper)this;
    }
}
