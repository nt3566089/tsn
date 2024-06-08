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
 * The DTO mapper of E_CSRSTINF_SEND as TABLE. <br>
 * 仕分統計情報送信テーブル
 * <pre>
 * [primary-key]
 *     CSRSTINF_SEND_ID
 *
 * [column]
 *     CSRSTINF_SEND_ID, SEND_CD, SEND_ROW_CD, WORK_FLG, SROPRTYMD, SROPRTCNT, LINBLK, DLVYMD, DPCD, DED, PSTNID, SRLINCD, SRRNK, SRPAT, TTBRQA, SHPQA, SPRQASFTPCL, SPRQATSNBOX, SPRQAJTBOX, SPRQA100BOX, SPRQAHL, SPRQAHLBGBOX, SPRQAHL12BOX, SPRQAHL5BOX, SPRQAFUL, ZZORGNCD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CSRSTINF_SEND_ID
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
public abstract class BsECsrstinfSendDtoMapper implements DtoMapper<ECsrstinfSend, ECsrstinfSendDto>, Serializable {

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
    public BsECsrstinfSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsECsrstinfSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ECsrstinfSendDto mappingToDto(ECsrstinfSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECsrstinfSendDto dto = new ECsrstinfSendDto();
        dto.setCsrstinfSendId(entity.getCsrstinfSendId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowCd(entity.getSendRowCd());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setSroprtymd(entity.getSroprtymd());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setLinblk(entity.getLinblk());
        dto.setDlvymd(entity.getDlvymd());
        dto.setDpcd(entity.getDpcd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setSrlincd(entity.getSrlincd());
        dto.setSrrnk(entity.getSrrnk());
        dto.setSrpat(entity.getSrpat());
        dto.setTtbrqa(entity.getTtbrqa());
        dto.setShpqa(entity.getShpqa());
        dto.setSprqasftpcl(entity.getSprqasftpcl());
        dto.setSprqatsnbox(entity.getSprqatsnbox());
        dto.setSprqajtbox(entity.getSprqajtbox());
        dto.setSprqa100box(entity.getSprqa100box());
        dto.setSprqahl(entity.getSprqahl());
        dto.setSprqahlbgbox(entity.getSprqahlbgbox());
        dto.setSprqahl12box(entity.getSprqahl12box());
        dto.setSprqahl5box(entity.getSprqahl5box());
        dto.setSprqaful(entity.getSprqaful());
        dto.setZzorgncd(entity.getZzorgncd());
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
    public List<ECsrstinfSendDto> mappingToDtoList(List<ECsrstinfSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ECsrstinfSendDto> dtoList = new ArrayList<ECsrstinfSendDto>();
        for (ECsrstinfSend entity : entityList) {
            ECsrstinfSendDto dto = mappingToDto(entity);
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
    public ECsrstinfSend mappingToEntity(ECsrstinfSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECsrstinfSend entity = new ECsrstinfSend();
        if (needsMapping(dto, dto.getCsrstinfSendId(), "csrstinfSendId")) {
            entity.setCsrstinfSendId(dto.getCsrstinfSendId());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendRowCd(), "sendRowCd")) {
            entity.setSendRowCd(dto.getSendRowCd());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
        }
        if (needsMapping(dto, dto.getSroprtymd(), "sroprtymd")) {
            entity.setSroprtymd(dto.getSroprtymd());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
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
        if (needsMapping(dto, dto.getSrlincd(), "srlincd")) {
            entity.setSrlincd(dto.getSrlincd());
        }
        if (needsMapping(dto, dto.getSrrnk(), "srrnk")) {
            entity.setSrrnk(dto.getSrrnk());
        }
        if (needsMapping(dto, dto.getSrpat(), "srpat")) {
            entity.setSrpat(dto.getSrpat());
        }
        if (needsMapping(dto, dto.getTtbrqa(), "ttbrqa")) {
            entity.setTtbrqa(dto.getTtbrqa());
        }
        if (needsMapping(dto, dto.getShpqa(), "shpqa")) {
            entity.setShpqa(dto.getShpqa());
        }
        if (needsMapping(dto, dto.getSprqasftpcl(), "sprqasftpcl")) {
            entity.setSprqasftpcl(dto.getSprqasftpcl());
        }
        if (needsMapping(dto, dto.getSprqatsnbox(), "sprqatsnbox")) {
            entity.setSprqatsnbox(dto.getSprqatsnbox());
        }
        if (needsMapping(dto, dto.getSprqajtbox(), "sprqajtbox")) {
            entity.setSprqajtbox(dto.getSprqajtbox());
        }
        if (needsMapping(dto, dto.getSprqa100box(), "sprqa100box")) {
            entity.setSprqa100box(dto.getSprqa100box());
        }
        if (needsMapping(dto, dto.getSprqahl(), "sprqahl")) {
            entity.setSprqahl(dto.getSprqahl());
        }
        if (needsMapping(dto, dto.getSprqahlbgbox(), "sprqahlbgbox")) {
            entity.setSprqahlbgbox(dto.getSprqahlbgbox());
        }
        if (needsMapping(dto, dto.getSprqahl12box(), "sprqahl12box")) {
            entity.setSprqahl12box(dto.getSprqahl12box());
        }
        if (needsMapping(dto, dto.getSprqahl5box(), "sprqahl5box")) {
            entity.setSprqahl5box(dto.getSprqahl5box());
        }
        if (needsMapping(dto, dto.getSprqaful(), "sprqaful")) {
            entity.setSprqaful(dto.getSprqaful());
        }
        if (needsMapping(dto, dto.getZzorgncd(), "zzorgncd")) {
            entity.setZzorgncd(dto.getZzorgncd());
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
    protected boolean needsMapping(ECsrstinfSendDto dto, Object value, String propName) {
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
    public List<ECsrstinfSend> mappingToEntityList(List<ECsrstinfSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ECsrstinfSend> entityList = new ArrayList<ECsrstinfSend>();
        for (ECsrstinfSendDto dto : dtoList) {
            ECsrstinfSend entity = mappingToEntity(dto);
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
    public ECsrstinfSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ECsrstinfSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ECsrstinfSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ECsrstinfSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ECsrstinfSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (ECsrstinfSendDtoMapper)this;
    }
}
