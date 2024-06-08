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
 * The DTO mapper of T_TREXAMRESULT as TABLE. <br>
 * 検査実績
 * <pre>
 * [primary-key]
 *     TREXAMRESULT_ID
 *
 * [column]
 *     TREXAMRESULT_ID, CLIENT_ID, CENTER_ID, SUPPLIERRCVNO, PRODUCT_CD, LOT1, LOT2, LOT3, LOT4, LOT5, OTHERLOT2, OTHERLOT3, OTHERLOT4, OTHERLOT5, DAMAGEFLG, NOSHIPPINGFLG, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, TAXFLG, LOT_ID, EXAMSTS, EXAMENDSTS, ADDFLG, RECEIVEDATE, SENDFLG, EXAMQTY, RES40QTY, INFERIORQTY, NOTEXAMQTY, FIRSTEXAMSENDFLG, QUALITYEXAMFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TREXAMRESULT_ID
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
public abstract class BsTTrexamresultDtoMapper implements DtoMapper<TTrexamresult, TTrexamresultDto>, Serializable {

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
    public BsTTrexamresultDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrexamresultDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrexamresultDto mappingToDto(TTrexamresult entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrexamresultDto dto = new TTrexamresultDto();
        dto.setTrexamresultId(entity.getTrexamresultId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setSupplierrcvno(entity.getSupplierrcvno());
        dto.setProductCd(entity.getProductCd());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot5(entity.getLot5());
        dto.setOtherlot2(entity.getOtherlot2());
        dto.setOtherlot3(entity.getOtherlot3());
        dto.setOtherlot4(entity.getOtherlot4());
        dto.setOtherlot5(entity.getOtherlot5());
        dto.setDamageflg(entity.getDamageflg());
        dto.setNoshippingflg(entity.getNoshippingflg());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setCustomsreleaseflg(entity.getCustomsreleaseflg());
        dto.setTaxflg(entity.getTaxflg());
        dto.setLotId(entity.getLotId());
        dto.setExamsts(entity.getExamsts());
        dto.setExamendsts(entity.getExamendsts());
        dto.setAddflg(entity.getAddflg());
        dto.setReceivedate(entity.getReceivedate());
        dto.setSendflg(entity.getSendflg());
        dto.setExamqty(entity.getExamqty());
        dto.setRes40qty(entity.getRes40qty());
        dto.setInferiorqty(entity.getInferiorqty());
        dto.setNotexamqty(entity.getNotexamqty());
        dto.setFirstexamsendflg(entity.getFirstexamsendflg());
        dto.setQualityexamflg(entity.getQualityexamflg());
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
    public List<TTrexamresultDto> mappingToDtoList(List<TTrexamresult> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrexamresultDto> dtoList = new ArrayList<TTrexamresultDto>();
        for (TTrexamresult entity : entityList) {
            TTrexamresultDto dto = mappingToDto(entity);
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
    public TTrexamresult mappingToEntity(TTrexamresultDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrexamresult entity = new TTrexamresult();
        if (needsMapping(dto, dto.getTrexamresultId(), "trexamresultId")) {
            entity.setTrexamresultId(dto.getTrexamresultId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getSupplierrcvno(), "supplierrcvno")) {
            entity.setSupplierrcvno(dto.getSupplierrcvno());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot5(), "lot5")) {
            entity.setLot5(dto.getLot5());
        }
        if (needsMapping(dto, dto.getOtherlot2(), "otherlot2")) {
            entity.setOtherlot2(dto.getOtherlot2());
        }
        if (needsMapping(dto, dto.getOtherlot3(), "otherlot3")) {
            entity.setOtherlot3(dto.getOtherlot3());
        }
        if (needsMapping(dto, dto.getOtherlot4(), "otherlot4")) {
            entity.setOtherlot4(dto.getOtherlot4());
        }
        if (needsMapping(dto, dto.getOtherlot5(), "otherlot5")) {
            entity.setOtherlot5(dto.getOtherlot5());
        }
        if (needsMapping(dto, dto.getDamageflg(), "damageflg")) {
            entity.setDamageflg(dto.getDamageflg());
        }
        if (needsMapping(dto, dto.getNoshippingflg(), "noshippingflg")) {
            entity.setNoshippingflg(dto.getNoshippingflg());
        }
        if (needsMapping(dto, dto.getForeigncargoflg(), "foreigncargoflg")) {
            entity.setForeigncargoflg(dto.getForeigncargoflg());
        }
        if (needsMapping(dto, dto.getCustomsreleaseflg(), "customsreleaseflg")) {
            entity.setCustomsreleaseflg(dto.getCustomsreleaseflg());
        }
        if (needsMapping(dto, dto.getTaxflg(), "taxflg")) {
            entity.setTaxflg(dto.getTaxflg());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getExamsts(), "examsts")) {
            entity.setExamsts(dto.getExamsts());
        }
        if (needsMapping(dto, dto.getExamendsts(), "examendsts")) {
            entity.setExamendsts(dto.getExamendsts());
        }
        if (needsMapping(dto, dto.getAddflg(), "addflg")) {
            entity.setAddflg(dto.getAddflg());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getSendflg(), "sendflg")) {
            entity.setSendflg(dto.getSendflg());
        }
        if (needsMapping(dto, dto.getExamqty(), "examqty")) {
            entity.setExamqty(dto.getExamqty());
        }
        if (needsMapping(dto, dto.getRes40qty(), "res40qty")) {
            entity.setRes40qty(dto.getRes40qty());
        }
        if (needsMapping(dto, dto.getInferiorqty(), "inferiorqty")) {
            entity.setInferiorqty(dto.getInferiorqty());
        }
        if (needsMapping(dto, dto.getNotexamqty(), "notexamqty")) {
            entity.setNotexamqty(dto.getNotexamqty());
        }
        if (needsMapping(dto, dto.getFirstexamsendflg(), "firstexamsendflg")) {
            entity.setFirstexamsendflg(dto.getFirstexamsendflg());
        }
        if (needsMapping(dto, dto.getQualityexamflg(), "qualityexamflg")) {
            entity.setQualityexamflg(dto.getQualityexamflg());
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
    protected boolean needsMapping(TTrexamresultDto dto, Object value, String propName) {
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
    public List<TTrexamresult> mappingToEntityList(List<TTrexamresultDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrexamresult> entityList = new ArrayList<TTrexamresult>();
        for (TTrexamresultDto dto : dtoList) {
            TTrexamresult entity = mappingToEntity(dto);
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
    public TTrexamresultDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrexamresultDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrexamresultDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrexamresultDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrexamresultDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrexamresultDtoMapper)this;
    }
}
