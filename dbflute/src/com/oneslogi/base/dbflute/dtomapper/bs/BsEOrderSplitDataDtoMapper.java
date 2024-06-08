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
 * The DTO mapper of E_ORDER_SPLIT_DATA as TABLE. <br>
 * オーダー分割結果データ送信テーブル
 * <pre>
 * [primary-key]
 *     ORDER_SPLIT_DATA_ID
 *
 * [column]
 *     ORDER_SPLIT_DATA_ID, SEND_CD, SEND_ROW_ID, WORK_FLG, REC_FLG, SRWHCD, DPCD, DED, PSTNID, DLVRNK, DLVSNM, SROPRTCNT, SSCD, DLVYMD, ZZORDYMD, SLPMRGTMG, ORDGR, S, H, M, SRYMD, RLYBSCD, KEEPAREAH1, SLPTYP, CMPCD, SLPNO, SLEDIV, CNGPRTSLPNO, SPPLYMD, CGGDID, KEEPAREAH2, ZZMATNR, BOXNO, BOXTYPE, ZZMATNRTOTAL, BOXNOCNSNM, BXOSZL, BXOSZH, BXOSZW, BOXTOTALWEIGH, WEIGHTYPE, BOXTOTALNUMBER, KEEPAREAM1, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SPLIT_DATA_ID
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
public abstract class BsEOrderSplitDataDtoMapper implements DtoMapper<EOrderSplitData, EOrderSplitDataDto>, Serializable {

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
    public BsEOrderSplitDataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEOrderSplitDataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EOrderSplitDataDto mappingToDto(EOrderSplitData entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EOrderSplitDataDto dto = new EOrderSplitDataDto();
        dto.setOrderSplitDataId(entity.getOrderSplitDataId());
        dto.setSendCd(entity.getSendCd());
        dto.setSendRowId(entity.getSendRowId());
        dto.setWorkFlg(entity.getWorkFlg());
        dto.setRecFlg(entity.getRecFlg());
        dto.setSrwhcd(entity.getSrwhcd());
        dto.setDpcd(entity.getDpcd());
        dto.setDed(entity.getDed());
        dto.setPstnid(entity.getPstnid());
        dto.setDlvrnk(entity.getDlvrnk());
        dto.setDlvsnm(entity.getDlvsnm());
        dto.setSroprtcnt(entity.getSroprtcnt());
        dto.setSscd(entity.getSscd());
        dto.setDlvymd(entity.getDlvymd());
        dto.setZzordymd(entity.getZzordymd());
        dto.setSlpmrgtmg(entity.getSlpmrgtmg());
        dto.setOrdgr(entity.getOrdgr());
        dto.setS(entity.getS());
        dto.setH(entity.getH());
        dto.setM(entity.getM());
        dto.setSrymd(entity.getSrymd());
        dto.setRlybscd(entity.getRlybscd());
        dto.setKeepareah1(entity.getKeepareah1());
        dto.setSlptyp(entity.getSlptyp());
        dto.setCmpcd(entity.getCmpcd());
        dto.setSlpno(entity.getSlpno());
        dto.setSlediv(entity.getSlediv());
        dto.setCngprtslpno(entity.getCngprtslpno());
        dto.setSpplymd(entity.getSpplymd());
        dto.setCggdid(entity.getCggdid());
        dto.setKeepareah2(entity.getKeepareah2());
        dto.setZzmatnr(entity.getZzmatnr());
        dto.setBoxno(entity.getBoxno());
        dto.setBoxtype(entity.getBoxtype());
        dto.setZzmatnrtotal(entity.getZzmatnrtotal());
        dto.setBoxnocnsnm(entity.getBoxnocnsnm());
        dto.setBxoszl(entity.getBxoszl());
        dto.setBxoszh(entity.getBxoszh());
        dto.setBxoszw(entity.getBxoszw());
        dto.setBoxtotalweigh(entity.getBoxtotalweigh());
        dto.setWeightype(entity.getWeightype());
        dto.setBoxtotalnumber(entity.getBoxtotalnumber());
        dto.setKeepaream1(entity.getKeepaream1());
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
    public List<EOrderSplitDataDto> mappingToDtoList(List<EOrderSplitData> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EOrderSplitDataDto> dtoList = new ArrayList<EOrderSplitDataDto>();
        for (EOrderSplitData entity : entityList) {
            EOrderSplitDataDto dto = mappingToDto(entity);
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
    public EOrderSplitData mappingToEntity(EOrderSplitDataDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EOrderSplitData entity = new EOrderSplitData();
        if (needsMapping(dto, dto.getOrderSplitDataId(), "orderSplitDataId")) {
            entity.setOrderSplitDataId(dto.getOrderSplitDataId());
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
        if (needsMapping(dto, dto.getRecFlg(), "recFlg")) {
            entity.setRecFlg(dto.getRecFlg());
        }
        if (needsMapping(dto, dto.getSrwhcd(), "srwhcd")) {
            entity.setSrwhcd(dto.getSrwhcd());
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
        if (needsMapping(dto, dto.getDlvrnk(), "dlvrnk")) {
            entity.setDlvrnk(dto.getDlvrnk());
        }
        if (needsMapping(dto, dto.getDlvsnm(), "dlvsnm")) {
            entity.setDlvsnm(dto.getDlvsnm());
        }
        if (needsMapping(dto, dto.getSroprtcnt(), "sroprtcnt")) {
            entity.setSroprtcnt(dto.getSroprtcnt());
        }
        if (needsMapping(dto, dto.getSscd(), "sscd")) {
            entity.setSscd(dto.getSscd());
        }
        if (needsMapping(dto, dto.getDlvymd(), "dlvymd")) {
            entity.setDlvymd(dto.getDlvymd());
        }
        if (needsMapping(dto, dto.getZzordymd(), "zzordymd")) {
            entity.setZzordymd(dto.getZzordymd());
        }
        if (needsMapping(dto, dto.getSlpmrgtmg(), "slpmrgtmg")) {
            entity.setSlpmrgtmg(dto.getSlpmrgtmg());
        }
        if (needsMapping(dto, dto.getOrdgr(), "ordgr")) {
            entity.setOrdgr(dto.getOrdgr());
        }
        if (needsMapping(dto, dto.getS(), "s")) {
            entity.setS(dto.getS());
        }
        if (needsMapping(dto, dto.getH(), "h")) {
            entity.setH(dto.getH());
        }
        if (needsMapping(dto, dto.getM(), "m")) {
            entity.setM(dto.getM());
        }
        if (needsMapping(dto, dto.getSrymd(), "srymd")) {
            entity.setSrymd(dto.getSrymd());
        }
        if (needsMapping(dto, dto.getRlybscd(), "rlybscd")) {
            entity.setRlybscd(dto.getRlybscd());
        }
        if (needsMapping(dto, dto.getKeepareah1(), "keepareah1")) {
            entity.setKeepareah1(dto.getKeepareah1());
        }
        if (needsMapping(dto, dto.getSlptyp(), "slptyp")) {
            entity.setSlptyp(dto.getSlptyp());
        }
        if (needsMapping(dto, dto.getCmpcd(), "cmpcd")) {
            entity.setCmpcd(dto.getCmpcd());
        }
        if (needsMapping(dto, dto.getSlpno(), "slpno")) {
            entity.setSlpno(dto.getSlpno());
        }
        if (needsMapping(dto, dto.getSlediv(), "slediv")) {
            entity.setSlediv(dto.getSlediv());
        }
        if (needsMapping(dto, dto.getCngprtslpno(), "cngprtslpno")) {
            entity.setCngprtslpno(dto.getCngprtslpno());
        }
        if (needsMapping(dto, dto.getSpplymd(), "spplymd")) {
            entity.setSpplymd(dto.getSpplymd());
        }
        if (needsMapping(dto, dto.getCggdid(), "cggdid")) {
            entity.setCggdid(dto.getCggdid());
        }
        if (needsMapping(dto, dto.getKeepareah2(), "keepareah2")) {
            entity.setKeepareah2(dto.getKeepareah2());
        }
        if (needsMapping(dto, dto.getZzmatnr(), "zzmatnr")) {
            entity.setZzmatnr(dto.getZzmatnr());
        }
        if (needsMapping(dto, dto.getBoxno(), "boxno")) {
            entity.setBoxno(dto.getBoxno());
        }
        if (needsMapping(dto, dto.getBoxtype(), "boxtype")) {
            entity.setBoxtype(dto.getBoxtype());
        }
        if (needsMapping(dto, dto.getZzmatnrtotal(), "zzmatnrtotal")) {
            entity.setZzmatnrtotal(dto.getZzmatnrtotal());
        }
        if (needsMapping(dto, dto.getBoxnocnsnm(), "boxnocnsnm")) {
            entity.setBoxnocnsnm(dto.getBoxnocnsnm());
        }
        if (needsMapping(dto, dto.getBxoszl(), "bxoszl")) {
            entity.setBxoszl(dto.getBxoszl());
        }
        if (needsMapping(dto, dto.getBxoszh(), "bxoszh")) {
            entity.setBxoszh(dto.getBxoszh());
        }
        if (needsMapping(dto, dto.getBxoszw(), "bxoszw")) {
            entity.setBxoszw(dto.getBxoszw());
        }
        if (needsMapping(dto, dto.getBoxtotalweigh(), "boxtotalweigh")) {
            entity.setBoxtotalweigh(dto.getBoxtotalweigh());
        }
        if (needsMapping(dto, dto.getWeightype(), "weightype")) {
            entity.setWeightype(dto.getWeightype());
        }
        if (needsMapping(dto, dto.getBoxtotalnumber(), "boxtotalnumber")) {
            entity.setBoxtotalnumber(dto.getBoxtotalnumber());
        }
        if (needsMapping(dto, dto.getKeepaream1(), "keepaream1")) {
            entity.setKeepaream1(dto.getKeepaream1());
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
    protected boolean needsMapping(EOrderSplitDataDto dto, Object value, String propName) {
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
    public List<EOrderSplitData> mappingToEntityList(List<EOrderSplitDataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EOrderSplitData> entityList = new ArrayList<EOrderSplitData>();
        for (EOrderSplitDataDto dto : dtoList) {
            EOrderSplitData entity = mappingToEntity(dto);
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
    public EOrderSplitDataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EOrderSplitDataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EOrderSplitDataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EOrderSplitDataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EOrderSplitDataDtoMapper reverseReference() {
        setReverseReference(true);
        return (EOrderSplitDataDtoMapper)this;
    }
}
