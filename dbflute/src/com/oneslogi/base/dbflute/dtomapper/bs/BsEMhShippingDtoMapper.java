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
 * The DTO mapper of E_MH_SHIPPING as TABLE. <br>
 * 共通下位データ送信テーブル(さしず実績)
 * <pre>
 * [primary-key]
 *     MH_SHIPPING_ID
 *
 * [column]
 *     MH_SHIPPING_ID, DPCD, DLVYMD, DED, PSTNID, SRDED, SRPSTNID, SRLINCD, SRRNK, SSCD, SSNM, ZZMATNR, SLQACB, SLQACT, LINBLK, LOCNO, LOCID, DLVPRTRNK, DLVSNM, DLVDTLSNM, SROPRTCNT, TTSROPRTCNT, TTTOPDEDRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_SHIPPING_ID
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
public abstract class BsEMhShippingDtoMapper implements DtoMapper<EMhShipping, EMhShippingDto>, Serializable {

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
    public BsEMhShippingDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEMhShippingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EMhShippingDto mappingToDto(EMhShipping entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMhShippingDto dto = new EMhShippingDto();
        dto.setMhShippingId(entity.getMhShippingId());
        dto.setDpcd(entity.getDpcd());
        dto.setDlvymd(entity.getDlvymd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setSrded(entity.getSrded());
        dto.setSrpstnid(entity.getSrpstnid());
        dto.setSrlincd(entity.getSrlincd());
        dto.setSrrnk(entity.getSrrnk());
        dto.setSscd(entity.getSscd());
        dto.setSsnm(entity.getSsnm());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setSlqacb(entity.getSlqacb());
        dto.setSlqact(entity.getSlqact());
        dto.setLinblk(entity.getLinblk());
        dto.setLocno(entity.getLocno());
        dto.setLocid(entity.getLocid());
        dto.setDlvprtrnk(entity.getDlvprtrnk());
        dto.setDlvsnm(entity.getDlvsnm());
        dto.setDlvdtlsnm(entity.getDlvdtlsnm());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setTtsroprtcnt(entity.getTtsroprtcnt());
        dto.setTttopdedrnk(entity.getTttopdedrnk());
        dto.setBrtyp(entity.getBrtyp());
        dto.setBoxno(entity.getBoxno());
        dto.setBoxnocnsnm(entity.getBoxnocnsnm());
        dto.setBoxtyp(entity.getBoxtyp());
        dto.setMgboxdid(entity.getMgboxdid());
        dto.setDmdid(entity.getDmdid());
        dto.setTtboxqa(entity.getTtboxqa());
        dto.setBoxctqata(entity.getBoxctqata());
        dto.setBoxctqaapsrplc(entity.getBoxctqaapsrplc());
        dto.setDrclstlbcbid(entity.getDrclstlbcbid());
        dto.setLbboxno(entity.getLbboxno());
        dto.setLbttboxqa(entity.getLbttboxqa());
        dto.setSendCd(entity.getSendCd());
        dto.setWorkFlg(entity.getWorkFlg());
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
    public List<EMhShippingDto> mappingToDtoList(List<EMhShipping> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EMhShippingDto> dtoList = new ArrayList<EMhShippingDto>();
        for (EMhShipping entity : entityList) {
            EMhShippingDto dto = mappingToDto(entity);
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
    public EMhShipping mappingToEntity(EMhShippingDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMhShipping entity = new EMhShipping();
        if (needsMapping(dto, dto.getMhShippingId(), "mhShippingId")) {
            entity.setMhShippingId(dto.getMhShippingId());
        }
        if (needsMapping(dto, dto.getDpcd(), "dpcd")) {
            entity.setDpcd(dto.getDpcd());
        }
        if (needsMapping(dto, dto.getDlvymd(), "dlvymd")) {
            entity.setDlvymd(dto.getDlvymd());
        }
        if (needsMapping(dto, dto.getDed(), "ded")) {
            entity.setDed(dto.getDed());
        }
        if (needsMapping(dto, dto.getPstnid(), "pstnid")) {
            entity.setPstnid(dto.getPstnid());
        }
        if (needsMapping(dto, dto.getSrded(), "srded")) {
            entity.setSrded(dto.getSrded());
        }
        if (needsMapping(dto, dto.getSrpstnid(), "srpstnid")) {
            entity.setSrpstnid(dto.getSrpstnid());
        }
        if (needsMapping(dto, dto.getSrlincd(), "srlincd")) {
            entity.setSrlincd(dto.getSrlincd());
        }
        if (needsMapping(dto, dto.getSrrnk(), "srrnk")) {
            entity.setSrrnk(dto.getSrrnk());
        }
        if (needsMapping(dto, dto.getSscd(), "sscd")) {
            entity.setSscd(dto.getSscd());
        }
        if (needsMapping(dto, dto.getSsnm(), "ssnm")) {
            entity.setSsnm(dto.getSsnm());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getSlqacb(), "slqacb")) {
            entity.setSlqacb(dto.getSlqacb());
        }
        if (needsMapping(dto, dto.getSlqact(), "slqact")) {
            entity.setSlqact(dto.getSlqact());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getLocno(), "locno")) {
            entity.setLocno(dto.getLocno());
        }
        if (needsMapping(dto, dto.getLocid(), "locid")) {
            entity.setLocid(dto.getLocid());
        }
        if (needsMapping(dto, dto.getDlvprtrnk(), "dlvprtrnk")) {
            entity.setDlvprtrnk(dto.getDlvprtrnk());
        }
        if (needsMapping(dto, dto.getDlvsnm(), "dlvsnm")) {
            entity.setDlvsnm(dto.getDlvsnm());
        }
        if (needsMapping(dto, dto.getDlvdtlsnm(), "dlvdtlsnm")) {
            entity.setDlvdtlsnm(dto.getDlvdtlsnm());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getTtsroprtcnt(), "ttsroprtcnt")) {
            entity.setTtsroprtcnt(dto.getTtsroprtcnt());
        }
        if (needsMapping(dto, dto.getTttopdedrnk(), "tttopdedrnk")) {
            entity.setTttopdedrnk(dto.getTttopdedrnk());
        }
        if (needsMapping(dto, dto.getBrtyp(), "brtyp")) {
            entity.setBrtyp(dto.getBrtyp());
        }
        if (needsMapping(dto, dto.getBoxno(), "boxno")) {
            entity.setBoxno(dto.getBoxno());
        }
        if (needsMapping(dto, dto.getBoxnocnsnm(), "boxnocnsnm")) {
            entity.setBoxnocnsnm(dto.getBoxnocnsnm());
        }
        if (needsMapping(dto, dto.getBoxtyp(), "boxtyp")) {
            entity.setBoxtyp(dto.getBoxtyp());
        }
        if (needsMapping(dto, dto.getMgboxdid(), "mgboxdid")) {
            entity.setMgboxdid(dto.getMgboxdid());
        }
        if (needsMapping(dto, dto.getDmdid(), "dmdid")) {
            entity.setDmdid(dto.getDmdid());
        }
        if (needsMapping(dto, dto.getTtboxqa(), "ttboxqa")) {
            entity.setTtboxqa(dto.getTtboxqa());
        }
        if (needsMapping(dto, dto.getBoxctqata(), "boxctqata")) {
            entity.setBoxctqata(dto.getBoxctqata());
        }
        if (needsMapping(dto, dto.getBoxctqaapsrplc(), "boxctqaapsrplc")) {
            entity.setBoxctqaapsrplc(dto.getBoxctqaapsrplc());
        }
        if (needsMapping(dto, dto.getDrclstlbcbid(), "drclstlbcbid")) {
            entity.setDrclstlbcbid(dto.getDrclstlbcbid());
        }
        if (needsMapping(dto, dto.getLbboxno(), "lbboxno")) {
            entity.setLbboxno(dto.getLbboxno());
        }
        if (needsMapping(dto, dto.getLbttboxqa(), "lbttboxqa")) {
            entity.setLbttboxqa(dto.getLbttboxqa());
        }
        if (needsMapping(dto, dto.getSendCd(), "sendCd")) {
            entity.setSendCd(dto.getSendCd());
        }
        if (needsMapping(dto, dto.getWorkFlg(), "workFlg")) {
            entity.setWorkFlg(dto.getWorkFlg());
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
    protected boolean needsMapping(EMhShippingDto dto, Object value, String propName) {
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
    public List<EMhShipping> mappingToEntityList(List<EMhShippingDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EMhShipping> entityList = new ArrayList<EMhShipping>();
        for (EMhShippingDto dto : dtoList) {
            EMhShipping entity = mappingToEntity(dto);
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
    public EMhShippingDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EMhShippingDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EMhShippingDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EMhShippingDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EMhShippingDtoMapper reverseReference() {
        setReverseReference(true);
        return (EMhShippingDtoMapper)this;
    }
}
