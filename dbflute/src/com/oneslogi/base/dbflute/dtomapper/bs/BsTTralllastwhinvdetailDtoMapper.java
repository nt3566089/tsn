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
 * The DTO mapper of T_TRALLLASTWHINVDETAIL as TABLE. <br>
 * 拠点別在庫照会（保管場・仕分場・引取場）明細情報
 * <pre>
 * [primary-key]
 *     ALLLASTWHINVDETAILKEY
 *
 * [column]
 *     ALLLASTWHINVDETAILKEY, PRODUCT_CD, PRODUCTDATE, DESIGNCD, INVNUM, INVKBNCD, INVKBN, TRANSPORTCD, FIRMCARRYNO, ASSORTEDUNIT, LOCCD, SCHDATE, RECEIVEDATE, OUTPUTTYPE, OUTPUTORG, USETYPE, PROCFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLLASTWHINVDETAILKEY
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
public abstract class BsTTralllastwhinvdetailDtoMapper implements DtoMapper<TTralllastwhinvdetail, TTralllastwhinvdetailDto>, Serializable {

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
    public BsTTralllastwhinvdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTralllastwhinvdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTralllastwhinvdetailDto mappingToDto(TTralllastwhinvdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTralllastwhinvdetailDto dto = new TTralllastwhinvdetailDto();
        dto.setAlllastwhinvdetailkey(entity.getAlllastwhinvdetailkey());
        dto.setProductCd(entity.getProductCd());
        dto.setProductdate(entity.getProductdate());
        dto.setDesigncd(entity.getDesigncd());
        dto.setInvnum(entity.getInvnum());
        dto.setInvkbncd(entity.getInvkbncd());
        dto.setInvkbn(entity.getInvkbn());
        dto.setTransportcd(entity.getTransportcd());
        dto.setFirmcarryno(entity.getFirmcarryno());
        dto.setAssortedunit(entity.getAssortedunit());
        dto.setLoccd(entity.getLoccd());
        dto.setSchdate(entity.getSchdate());
        dto.setReceivedate(entity.getReceivedate());
        dto.setOutputtype(entity.getOutputtype());
        dto.setOutputorg(entity.getOutputorg());
        dto.setUsetype(entity.getUsetype());
        dto.setProcflg(entity.getProcflg());
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
    public List<TTralllastwhinvdetailDto> mappingToDtoList(List<TTralllastwhinvdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTralllastwhinvdetailDto> dtoList = new ArrayList<TTralllastwhinvdetailDto>();
        for (TTralllastwhinvdetail entity : entityList) {
            TTralllastwhinvdetailDto dto = mappingToDto(entity);
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
    public TTralllastwhinvdetail mappingToEntity(TTralllastwhinvdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTralllastwhinvdetail entity = new TTralllastwhinvdetail();
        if (needsMapping(dto, dto.getAlllastwhinvdetailkey(), "alllastwhinvdetailkey")) {
            entity.setAlllastwhinvdetailkey(dto.getAlllastwhinvdetailkey());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductdate(), "productdate")) {
            entity.setProductdate(dto.getProductdate());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getInvnum(), "invnum")) {
            entity.setInvnum(dto.getInvnum());
        }
        if (needsMapping(dto, dto.getInvkbncd(), "invkbncd")) {
            entity.setInvkbncd(dto.getInvkbncd());
        }
        if (needsMapping(dto, dto.getInvkbn(), "invkbn")) {
            entity.setInvkbn(dto.getInvkbn());
        }
        if (needsMapping(dto, dto.getTransportcd(), "transportcd")) {
            entity.setTransportcd(dto.getTransportcd());
        }
        if (needsMapping(dto, dto.getFirmcarryno(), "firmcarryno")) {
            entity.setFirmcarryno(dto.getFirmcarryno());
        }
        if (needsMapping(dto, dto.getAssortedunit(), "assortedunit")) {
            entity.setAssortedunit(dto.getAssortedunit());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getOutputtype(), "outputtype")) {
            entity.setOutputtype(dto.getOutputtype());
        }
        if (needsMapping(dto, dto.getOutputorg(), "outputorg")) {
            entity.setOutputorg(dto.getOutputorg());
        }
        if (needsMapping(dto, dto.getUsetype(), "usetype")) {
            entity.setUsetype(dto.getUsetype());
        }
        if (needsMapping(dto, dto.getProcflg(), "procflg")) {
            entity.setProcflg(dto.getProcflg());
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
    protected boolean needsMapping(TTralllastwhinvdetailDto dto, Object value, String propName) {
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
    public List<TTralllastwhinvdetail> mappingToEntityList(List<TTralllastwhinvdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTralllastwhinvdetail> entityList = new ArrayList<TTralllastwhinvdetail>();
        for (TTralllastwhinvdetailDto dto : dtoList) {
            TTralllastwhinvdetail entity = mappingToEntity(dto);
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
    public TTralllastwhinvdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTralllastwhinvdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTralllastwhinvdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTralllastwhinvdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTralllastwhinvdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTralllastwhinvdetailDtoMapper)this;
    }
}
