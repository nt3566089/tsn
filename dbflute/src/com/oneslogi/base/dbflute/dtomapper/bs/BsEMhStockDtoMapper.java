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
 * The DTO mapper of E_MH_STOCK as TABLE. <br>
 * 共通下位データ送信テーブル(棚在庫)
 * <pre>
 * [primary-key]
 *     MH_STOCK_ID
 *
 * [column]
 *     MH_STOCK_ID, COMPANY_CD, LINBLK, ZONE_CD, LOCNO, LOCKBN, PRODUCT_CD, TSTINVCB, TSTINVCT, TOSPLCBQA, TOSPLCTQA, TSPLCB, TSPLCT, PRESPLCBQA, PRESPLCTQA, TPRESPLCB, TPRESPLCT, TINVMDTCBS, TINVMDTCB, TINVMDTCTS, TINVMDTCT, CSPLNUN, SEND_CD, WORK_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MH_STOCK_ID
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
public abstract class BsEMhStockDtoMapper implements DtoMapper<EMhStock, EMhStockDto>, Serializable {

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
    public BsEMhStockDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEMhStockDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EMhStockDto mappingToDto(EMhStock entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMhStockDto dto = new EMhStockDto();
        dto.setMhStockId(entity.getMhStockId());
        dto.setCompanyCd(entity.getCompanyCd());
        dto.setLinblk(entity.getLinblk());
        dto.setZoneCd(entity.getZoneCd());
        dto.setLocno(entity.getLocno());
        dto.setLockbn(entity.getLockbn());
        dto.setProductCd(entity.getProductCd());
        dto.setTstinvcb(entity.getTstinvcb());
        dto.setTstinvct(entity.getTstinvct());
        dto.setTosplcbqa(entity.getTosplcbqa());
        dto.setTosplctqa(entity.getTosplctqa());
        dto.setTsplcb(entity.getTsplcb());
        dto.setTsplct(entity.getTsplct());
        dto.setPresplcbqa(entity.getPresplcbqa());
        dto.setPresplctqa(entity.getPresplctqa());
        dto.setTpresplcb(entity.getTpresplcb());
        dto.setTpresplct(entity.getTpresplct());
        dto.setTinvmdtcbs(entity.getTinvmdtcbs());
        dto.setTinvmdtcb(entity.getTinvmdtcb());
        dto.setTinvmdtcts(entity.getTinvmdtcts());
        dto.setTinvmdtct(entity.getTinvmdtct());
        dto.setCsplnun(entity.getCsplnun());
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
    public List<EMhStockDto> mappingToDtoList(List<EMhStock> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EMhStockDto> dtoList = new ArrayList<EMhStockDto>();
        for (EMhStock entity : entityList) {
            EMhStockDto dto = mappingToDto(entity);
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
    public EMhStock mappingToEntity(EMhStockDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EMhStock entity = new EMhStock();
        if (needsMapping(dto, dto.getMhStockId(), "mhStockId")) {
            entity.setMhStockId(dto.getMhStockId());
        }
        if (needsMapping(dto, dto.getCompanyCd(), "companyCd")) {
            entity.setCompanyCd(dto.getCompanyCd());
        }
        if (needsMapping(dto, dto.getLinblk(), "linblk")) {
            entity.setLinblk(dto.getLinblk());
        }
        if (needsMapping(dto, dto.getZoneCd(), "zoneCd")) {
            entity.setZoneCd(dto.getZoneCd());
        }
        if (needsMapping(dto, dto.getLocno(), "locno")) {
            entity.setLocno(dto.getLocno());
        }
        if (needsMapping(dto, dto.getLockbn(), "lockbn")) {
            entity.setLockbn(dto.getLockbn());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getTstinvcb(), "tstinvcb")) {
            entity.setTstinvcb(dto.getTstinvcb());
        }
        if (needsMapping(dto, dto.getTstinvct(), "tstinvct")) {
            entity.setTstinvct(dto.getTstinvct());
        }
        if (needsMapping(dto, dto.getTosplcbqa(), "tosplcbqa")) {
            entity.setTosplcbqa(dto.getTosplcbqa());
        }
        if (needsMapping(dto, dto.getTosplctqa(), "tosplctqa")) {
            entity.setTosplctqa(dto.getTosplctqa());
        }
        if (needsMapping(dto, dto.getTsplcb(), "tsplcb")) {
            entity.setTsplcb(dto.getTsplcb());
        }
        if (needsMapping(dto, dto.getTsplct(), "tsplct")) {
            entity.setTsplct(dto.getTsplct());
        }
        if (needsMapping(dto, dto.getPresplcbqa(), "presplcbqa")) {
            entity.setPresplcbqa(dto.getPresplcbqa());
        }
        if (needsMapping(dto, dto.getPresplctqa(), "presplctqa")) {
            entity.setPresplctqa(dto.getPresplctqa());
        }
        if (needsMapping(dto, dto.getTpresplcb(), "tpresplcb")) {
            entity.setTpresplcb(dto.getTpresplcb());
        }
        if (needsMapping(dto, dto.getTpresplct(), "tpresplct")) {
            entity.setTpresplct(dto.getTpresplct());
        }
        if (needsMapping(dto, dto.getTinvmdtcbs(), "tinvmdtcbs")) {
            entity.setTinvmdtcbs(dto.getTinvmdtcbs());
        }
        if (needsMapping(dto, dto.getTinvmdtcb(), "tinvmdtcb")) {
            entity.setTinvmdtcb(dto.getTinvmdtcb());
        }
        if (needsMapping(dto, dto.getTinvmdtcts(), "tinvmdtcts")) {
            entity.setTinvmdtcts(dto.getTinvmdtcts());
        }
        if (needsMapping(dto, dto.getTinvmdtct(), "tinvmdtct")) {
            entity.setTinvmdtct(dto.getTinvmdtct());
        }
        if (needsMapping(dto, dto.getCsplnun(), "csplnun")) {
            entity.setCsplnun(dto.getCsplnun());
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
    protected boolean needsMapping(EMhStockDto dto, Object value, String propName) {
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
    public List<EMhStock> mappingToEntityList(List<EMhStockDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EMhStock> entityList = new ArrayList<EMhStock>();
        for (EMhStockDto dto : dtoList) {
            EMhStock entity = mappingToEntity(dto);
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
    public EMhStockDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EMhStockDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EMhStockDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EMhStockDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EMhStockDtoMapper reverseReference() {
        setReverseReference(true);
        return (EMhStockDtoMapper)this;
    }
}
