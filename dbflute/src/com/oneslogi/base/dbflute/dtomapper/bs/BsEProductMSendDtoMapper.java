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
 * The DTO mapper of E_PRODUCT_M_SEND as TABLE. <br>
 * 銘柄テーブル(マテハン)送信テーブル
 * <pre>
 * [primary-key]
 *     PRODUCT_M_SEND_ID
 *
 * [column]
 *     PRODUCT_M_SEND_ID, COMPANY_CD, PRODUCT_CD, BRFNFL, BRFNHF, BRANFL, BRANHF, IOID_CLS, OTRNK, BRCTG, NUMCT, CTNUM, CBCT, PATCBQA, CTBCDID, CTBCD, CBBCDID, CBBCD, FWBRID, CTFM, CTSZL, CTSZW, CTSZH, CTCC, CTWEIGHT, ZZFRDATEH, ZZTODATEH, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_M_SEND_ID
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
public abstract class BsEProductMSendDtoMapper implements DtoMapper<EProductMSend, EProductMSendDto>, Serializable {

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
    public BsEProductMSendDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEProductMSendDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EProductMSendDto mappingToDto(EProductMSend entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EProductMSendDto dto = new EProductMSendDto();
        dto.setProductMSendId(entity.getProductMSendId());
        dto.setCompanyCd(entity.getCompanyCd());
        dto.setProductCd(entity.getProductCd());
        dto.setBrfnfl(entity.getBrfnfl());
        dto.setBrfnhf(entity.getBrfnhf());
        dto.setBranfl(entity.getBranfl());
        dto.setBranhf(entity.getBranhf());
        dto.setIoidCls(entity.getIoidCls());
        dto.setOtrnk(entity.getOtrnk());
        dto.setBrctg(entity.getBrctg());
        dto.setNumct(entity.getNumct());
        dto.setCtnum(entity.getCtnum());
        dto.setCbct(entity.getCbct());
        dto.setPatcbqa(entity.getPatcbqa());
        dto.setCtbcdid(entity.getCtbcdid());
        dto.setCtbcd(entity.getCtbcd());
        dto.setCbbcdid(entity.getCbbcdid());
        dto.setCbbcd(entity.getCbbcd());
        dto.setFwbrid(entity.getFwbrid());
        dto.setCtfm(entity.getCtfm());
        dto.setCtszl(entity.getCtszl());
        dto.setCtszw(entity.getCtszw());
        dto.setCtszh(entity.getCtszh());
        dto.setCtcc(entity.getCtcc());
        dto.setCtweight(entity.getCtweight());
        dto.setZzfrdateh(entity.getZzfrdateh());
        dto.setZztodateh(entity.getZztodateh());
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
    public List<EProductMSendDto> mappingToDtoList(List<EProductMSend> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EProductMSendDto> dtoList = new ArrayList<EProductMSendDto>();
        for (EProductMSend entity : entityList) {
            EProductMSendDto dto = mappingToDto(entity);
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
    public EProductMSend mappingToEntity(EProductMSendDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EProductMSend entity = new EProductMSend();
        if (needsMapping(dto, dto.getProductMSendId(), "productMSendId")) {
            entity.setProductMSendId(dto.getProductMSendId());
        }
        if (needsMapping(dto, dto.getCompanyCd(), "companyCd")) {
            entity.setCompanyCd(dto.getCompanyCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getBrfnfl(), "brfnfl")) {
            entity.setBrfnfl(dto.getBrfnfl());
        }
        if (needsMapping(dto, dto.getBrfnhf(), "brfnhf")) {
            entity.setBrfnhf(dto.getBrfnhf());
        }
        if (needsMapping(dto, dto.getBranfl(), "branfl")) {
            entity.setBranfl(dto.getBranfl());
        }
        if (needsMapping(dto, dto.getBranhf(), "branhf")) {
            entity.setBranhf(dto.getBranhf());
        }
        if (needsMapping(dto, dto.getIoidCls(), "ioidCls")) {
            entity.setIoidCls(dto.getIoidCls());
        }
        if (needsMapping(dto, dto.getOtrnk(), "otrnk")) {
            entity.setOtrnk(dto.getOtrnk());
        }
        if (needsMapping(dto, dto.getBrctg(), "brctg")) {
            entity.setBrctg(dto.getBrctg());
        }
        if (needsMapping(dto, dto.getNumct(), "numct")) {
            entity.setNumct(dto.getNumct());
        }
        if (needsMapping(dto, dto.getCtnum(), "ctnum")) {
            entity.setCtnum(dto.getCtnum());
        }
        if (needsMapping(dto, dto.getCbct(), "cbct")) {
            entity.setCbct(dto.getCbct());
        }
        if (needsMapping(dto, dto.getPatcbqa(), "patcbqa")) {
            entity.setPatcbqa(dto.getPatcbqa());
        }
        if (needsMapping(dto, dto.getCtbcdid(), "ctbcdid")) {
            entity.setCtbcdid(dto.getCtbcdid());
        }
        if (needsMapping(dto, dto.getCtbcd(), "ctbcd")) {
            entity.setCtbcd(dto.getCtbcd());
        }
        if (needsMapping(dto, dto.getCbbcdid(), "cbbcdid")) {
            entity.setCbbcdid(dto.getCbbcdid());
        }
        if (needsMapping(dto, dto.getCbbcd(), "cbbcd")) {
            entity.setCbbcd(dto.getCbbcd());
        }
        if (needsMapping(dto, dto.getFwbrid(), "fwbrid")) {
            entity.setFwbrid(dto.getFwbrid());
        }
        if (needsMapping(dto, dto.getCtfm(), "ctfm")) {
            entity.setCtfm(dto.getCtfm());
        }
        if (needsMapping(dto, dto.getCtszl(), "ctszl")) {
            entity.setCtszl(dto.getCtszl());
        }
        if (needsMapping(dto, dto.getCtszw(), "ctszw")) {
            entity.setCtszw(dto.getCtszw());
        }
        if (needsMapping(dto, dto.getCtszh(), "ctszh")) {
            entity.setCtszh(dto.getCtszh());
        }
        if (needsMapping(dto, dto.getCtcc(), "ctcc")) {
            entity.setCtcc(dto.getCtcc());
        }
        if (needsMapping(dto, dto.getCtweight(), "ctweight")) {
            entity.setCtweight(dto.getCtweight());
        }
        if (needsMapping(dto, dto.getZzfrdateh(), "zzfrdateh")) {
            entity.setZzfrdateh(dto.getZzfrdateh());
        }
        if (needsMapping(dto, dto.getZztodateh(), "zztodateh")) {
            entity.setZztodateh(dto.getZztodateh());
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
    protected boolean needsMapping(EProductMSendDto dto, Object value, String propName) {
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
    public List<EProductMSend> mappingToEntityList(List<EProductMSendDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EProductMSend> entityList = new ArrayList<EProductMSend>();
        for (EProductMSendDto dto : dtoList) {
            EProductMSend entity = mappingToEntity(dto);
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
    public EProductMSendDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EProductMSendDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EProductMSendDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EProductMSendDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EProductMSendDtoMapper reverseReference() {
        setReverseReference(true);
        return (EProductMSendDtoMapper)this;
    }
}
