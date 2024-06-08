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
 * The DTO mapper of T_TRPALLETDETAIL as TABLE. <br>
 * パレットはり紙情報明細
 * <pre>
 * [primary-key]
 *     TRPALLETDETAIL_ID
 *
 * [column]
 *     TRPALLETDETAIL_ID, CENTER_ID, CLIENT_ID, PALLET_DETAIL_KEY, INOUT_TYPE, TRPALLET_ID, BASE_PALLET_NO, DIV_PALLET_NO, WORK_TYPE, WORK_KEY, REGISTRATION_DATE, WORK_DATE, PRODUCT_ID, PRODUCT_CD, DESIGN_FLG, LIMIT_DATE, FIRM_CARRY_NO, BAT_ARTICLE_SIGN, MOVE_B_LLOCATION_ID, MOVE_B_LOCATION_CD, MOVE_A_LOCATION_ID, MOVE_A_LOCATION_CD, INST_NUM, REST_QTY_CASE, REST_QTY_BOWL, REST_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPALLETDETAIL_ID
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
public abstract class BsTTrpalletdetailDtoMapper implements DtoMapper<TTrpalletdetail, TTrpalletdetailDto>, Serializable {

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
    public BsTTrpalletdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrpalletdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrpalletdetailDto mappingToDto(TTrpalletdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpalletdetailDto dto = new TTrpalletdetailDto();
        dto.setTrpalletdetailId(entity.getTrpalletdetailId());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setPalletDetailKey(entity.getPalletDetailKey());
        dto.setInoutType(entity.getInoutType());
        dto.setTrpalletId(entity.getTrpalletId());
        dto.setBasePalletNo(entity.getBasePalletNo());
        dto.setDivPalletNo(entity.getDivPalletNo());
        dto.setWorkType(entity.getWorkType());
        dto.setWorkKey(entity.getWorkKey());
        dto.setRegistrationDate(entity.getRegistrationDate());
        dto.setWorkDate(entity.getWorkDate());
        dto.setProductId(entity.getProductId());
        dto.setProductCd(entity.getProductCd());
        dto.setDesignFlg(entity.getDesignFlg());
        dto.setLimitDate(entity.getLimitDate());
        dto.setFirmCarryNo(entity.getFirmCarryNo());
        dto.setBatArticleSign(entity.getBatArticleSign());
        dto.setMoveBLlocationId(entity.getMoveBLlocationId());
        dto.setMoveBLocationCd(entity.getMoveBLocationCd());
        dto.setMoveALocationId(entity.getMoveALocationId());
        dto.setMoveALocationCd(entity.getMoveALocationCd());
        dto.setInstNum(entity.getInstNum());
        dto.setRestQtyCase(entity.getRestQtyCase());
        dto.setRestQtyBowl(entity.getRestQtyBowl());
        dto.setRestQty(entity.getRestQty());
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
    public List<TTrpalletdetailDto> mappingToDtoList(List<TTrpalletdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrpalletdetailDto> dtoList = new ArrayList<TTrpalletdetailDto>();
        for (TTrpalletdetail entity : entityList) {
            TTrpalletdetailDto dto = mappingToDto(entity);
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
    public TTrpalletdetail mappingToEntity(TTrpalletdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpalletdetail entity = new TTrpalletdetail();
        if (needsMapping(dto, dto.getTrpalletdetailId(), "trpalletdetailId")) {
            entity.setTrpalletdetailId(dto.getTrpalletdetailId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getPalletDetailKey(), "palletDetailKey")) {
            entity.setPalletDetailKey(dto.getPalletDetailKey());
        }
        if (needsMapping(dto, dto.getInoutType(), "inoutType")) {
            entity.setInoutType(dto.getInoutType());
        }
        if (needsMapping(dto, dto.getTrpalletId(), "trpalletId")) {
            entity.setTrpalletId(dto.getTrpalletId());
        }
        if (needsMapping(dto, dto.getBasePalletNo(), "basePalletNo")) {
            entity.setBasePalletNo(dto.getBasePalletNo());
        }
        if (needsMapping(dto, dto.getDivPalletNo(), "divPalletNo")) {
            entity.setDivPalletNo(dto.getDivPalletNo());
        }
        if (needsMapping(dto, dto.getWorkType(), "workType")) {
            entity.setWorkType(dto.getWorkType());
        }
        if (needsMapping(dto, dto.getWorkKey(), "workKey")) {
            entity.setWorkKey(dto.getWorkKey());
        }
        if (needsMapping(dto, dto.getRegistrationDate(), "registrationDate")) {
            entity.setRegistrationDate(dto.getRegistrationDate());
        }
        if (needsMapping(dto, dto.getWorkDate(), "workDate")) {
            entity.setWorkDate(dto.getWorkDate());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getDesignFlg(), "designFlg")) {
            entity.setDesignFlg(dto.getDesignFlg());
        }
        if (needsMapping(dto, dto.getLimitDate(), "limitDate")) {
            entity.setLimitDate(dto.getLimitDate());
        }
        if (needsMapping(dto, dto.getFirmCarryNo(), "firmCarryNo")) {
            entity.setFirmCarryNo(dto.getFirmCarryNo());
        }
        if (needsMapping(dto, dto.getBatArticleSign(), "batArticleSign")) {
            entity.setBatArticleSign(dto.getBatArticleSign());
        }
        if (needsMapping(dto, dto.getMoveBLlocationId(), "moveBLlocationId")) {
            entity.setMoveBLlocationId(dto.getMoveBLlocationId());
        }
        if (needsMapping(dto, dto.getMoveBLocationCd(), "moveBLocationCd")) {
            entity.setMoveBLocationCd(dto.getMoveBLocationCd());
        }
        if (needsMapping(dto, dto.getMoveALocationId(), "moveALocationId")) {
            entity.setMoveALocationId(dto.getMoveALocationId());
        }
        if (needsMapping(dto, dto.getMoveALocationCd(), "moveALocationCd")) {
            entity.setMoveALocationCd(dto.getMoveALocationCd());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getRestQtyCase(), "restQtyCase")) {
            entity.setRestQtyCase(dto.getRestQtyCase());
        }
        if (needsMapping(dto, dto.getRestQtyBowl(), "restQtyBowl")) {
            entity.setRestQtyBowl(dto.getRestQtyBowl());
        }
        if (needsMapping(dto, dto.getRestQty(), "restQty")) {
            entity.setRestQty(dto.getRestQty());
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
    protected boolean needsMapping(TTrpalletdetailDto dto, Object value, String propName) {
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
    public List<TTrpalletdetail> mappingToEntityList(List<TTrpalletdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrpalletdetail> entityList = new ArrayList<TTrpalletdetail>();
        for (TTrpalletdetailDto dto : dtoList) {
            TTrpalletdetail entity = mappingToEntity(dto);
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
    public TTrpalletdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrpalletdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrpalletdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrpalletdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrpalletdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrpalletdetailDtoMapper)this;
    }
}
