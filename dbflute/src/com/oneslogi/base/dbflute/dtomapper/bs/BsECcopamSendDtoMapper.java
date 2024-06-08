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
 * The DTO mapper of E_CCOPAM_SEND as TABLE. <br>
 * 配車実績データ送信テーブル
 * <pre>
 * [primary-key]
 *     CCOPAM_SEND_ID
 *
 * [column]
 *     CCOPAM_SEND_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, CCOPAM_ID, SNNO1, SNNO2, SNNO3, CARNO, SNYMD, ARVYMD, SFCD, STCD, GNLPLTQA, OTPLTQA, PLNCARKND, AMCARKND, SELNO1, SELNO2, SELNO3, TRANNM, TDRELAYID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CCOPAM_SEND_ID
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
public abstract class BsECcopamSendDtoMapper implements DtoMapper<ECcopamSend, ECcopamSendDto>, Serializable {

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
    public BsECcopamSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsECcopamSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ECcopamSendDto mappingToDto(ECcopamSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECcopamSendDto dto = new ECcopamSendDto();
        dto.setCcopamSendId(entity.getCcopamSendId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setCcopamId(entity.getCcopamId());
        dto.setSnno1(entity.getSnno1());
        dto.setSnno2(entity.getSnno2());
        dto.setSnno3(entity.getSnno3());
        dto.setCarno(entity.getCarno());
        dto.setSnymd(entity.getSnymd());
        dto.setArvymd(entity.getArvymd());
        dto.setSfcd(entity.getSfcd());
        dto.setStcd(entity.getStcd());
        dto.setGnlpltqa(entity.getGnlpltqa());
        dto.setOtpltqa(entity.getOtpltqa());
        dto.setPlncarknd(entity.getPlncarknd());
        dto.setAmcarknd(entity.getAmcarknd());
        dto.setSelno1(entity.getSelno1());
        dto.setSelno2(entity.getSelno2());
        dto.setSelno3(entity.getSelno3());
        dto.setTrannm(entity.getTrannm());
        dto.setTdrelayid(entity.getTdrelayid());
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
    public List<ECcopamSendDto> mappingToDtoList(List<ECcopamSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ECcopamSendDto> dtoList = new ArrayList<ECcopamSendDto>();
        for (ECcopamSend entity : entityList) {
            ECcopamSendDto dto = mappingToDto(entity);
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
    public ECcopamSend mappingToEntity(ECcopamSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ECcopamSend entity = new ECcopamSend();
        if (needsMapping(dto, dto.getCcopamSendId(), "ccopamSendId")) {
            entity.setCcopamSendId(dto.getCcopamSendId());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getSendRowId(), "sendRowId")) {
            entity.setSendRowId(dto.getSendRowId());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
        }
        if (needsMapping(dto, dto.getCcopamId(), "ccopamId")) {
            entity.setCcopamId(dto.getCcopamId());
        }
        if (needsMapping(dto, dto.getSnno1(), "snno1")) {
            entity.setSnno1(dto.getSnno1());
        }
        if (needsMapping(dto, dto.getSnno2(), "snno2")) {
            entity.setSnno2(dto.getSnno2());
        }
        if (needsMapping(dto, dto.getSnno3(), "snno3")) {
            entity.setSnno3(dto.getSnno3());
        }
        if (needsMapping(dto, dto.getCarno(), "carno")) {
            entity.setCarno(dto.getCarno());
        }
        if (needsMapping(dto, dto.getSnymd(), "snymd")) {
            entity.setSnymd(dto.getSnymd());
        }
        if (needsMapping(dto, dto.getArvymd(), "arvymd")) {
            entity.setArvymd(dto.getArvymd());
        }
        if (needsMapping(dto, dto.getSfcd(), "sfcd")) {
            entity.setSfcd(dto.getSfcd());
        }
        if (needsMapping(dto, dto.getStcd(), "stcd")) {
            entity.setStcd(dto.getStcd());
        }
        if (needsMapping(dto, dto.getGnlpltqa(), "gnlpltqa")) {
            entity.setGnlpltqa(dto.getGnlpltqa());
        }
        if (needsMapping(dto, dto.getOtpltqa(), "otpltqa")) {
            entity.setOtpltqa(dto.getOtpltqa());
        }
        if (needsMapping(dto, dto.getPlncarknd(), "plncarknd")) {
            entity.setPlncarknd(dto.getPlncarknd());
        }
        if (needsMapping(dto, dto.getAmcarknd(), "amcarknd")) {
            entity.setAmcarknd(dto.getAmcarknd());
        }
        if (needsMapping(dto, dto.getSelno1(), "selno1")) {
            entity.setSelno1(dto.getSelno1());
        }
        if (needsMapping(dto, dto.getSelno2(), "selno2")) {
            entity.setSelno2(dto.getSelno2());
        }
        if (needsMapping(dto, dto.getSelno3(), "selno3")) {
            entity.setSelno3(dto.getSelno3());
        }
        if (needsMapping(dto, dto.getTrannm(), "trannm")) {
            entity.setTrannm(dto.getTrannm());
        }
        if (needsMapping(dto, dto.getTdrelayid(), "tdrelayid")) {
            entity.setTdrelayid(dto.getTdrelayid());
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
    protected boolean needsMapping(ECcopamSendDto dto, Object value, String propName) {
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
    public List<ECcopamSend> mappingToEntityList(List<ECcopamSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ECcopamSend> entityList = new ArrayList<ECcopamSend>();
        for (ECcopamSendDto dto : dtoList) {
            ECcopamSend entity = mappingToEntity(dto);
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
    public ECcopamSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ECcopamSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ECcopamSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ECcopamSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ECcopamSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (ECcopamSendDtoMapper)this;
    }
}
