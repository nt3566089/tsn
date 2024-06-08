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
 * The DTO mapper of T_TRSOJTDETAIL as TABLE. <br>
 * 出庫指図明細
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SOJTID, SOJTLINENO, DATATYPE, PLANSEQ, PRODUCT_ID, LOT3, LOT4, EXPECTQTY1, PICKEDQTY1, POID, PALLET_ID, LOCATION_ID, LOT_ID, SOID, SODETAILID, TRSOADDFLG, PLANOUTSEQ, PLANPRICE1, PLANPRICE2, PLANITEMNAME, PLANDATA1, PLANDATA2, PLANDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
public abstract class BsTTrsojtdetailDtoMapper implements DtoMapper<TTrsojtdetail, TTrsojtdetailDto>, Serializable {

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
    public BsTTrsojtdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsojtdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsojtdetailDto mappingToDto(TTrsojtdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsojtdetailDto dto = new TTrsojtdetailDto();
        dto.setSojtlineid(entity.getSojtlineid());
        dto.setSojtid(entity.getSojtid());
        dto.setSojtlineno(entity.getSojtlineno());
        dto.setDatatype(entity.getDatatype());
        dto.setPlanseq(entity.getPlanseq());
        dto.setProductId(entity.getProductId());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setExpectqty1(entity.getExpectqty1());
        dto.setPickedqty1(entity.getPickedqty1());
        dto.setPoid(entity.getPoid());
        dto.setPalletId(entity.getPalletId());
        dto.setLocationId(entity.getLocationId());
        dto.setLotId(entity.getLotId());
        dto.setSoid(entity.getSoid());
        dto.setSodetailid(entity.getSodetailid());
        dto.setTrsoaddflg(entity.getTrsoaddflg());
        dto.setPlanoutseq(entity.getPlanoutseq());
        dto.setPlanprice1(entity.getPlanprice1());
        dto.setPlanprice2(entity.getPlanprice2());
        dto.setPlanitemname(entity.getPlanitemname());
        dto.setPlandata1(entity.getPlandata1());
        dto.setPlandata2(entity.getPlandata2());
        dto.setPlandata3(entity.getPlandata3());
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
    public List<TTrsojtdetailDto> mappingToDtoList(List<TTrsojtdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsojtdetailDto> dtoList = new ArrayList<TTrsojtdetailDto>();
        for (TTrsojtdetail entity : entityList) {
            TTrsojtdetailDto dto = mappingToDto(entity);
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
    public TTrsojtdetail mappingToEntity(TTrsojtdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsojtdetail entity = new TTrsojtdetail();
        if (needsMapping(dto, dto.getSojtlineid(), "sojtlineid")) {
            entity.setSojtlineid(dto.getSojtlineid());
        }
        if (needsMapping(dto, dto.getSojtid(), "sojtid")) {
            entity.setSojtid(dto.getSojtid());
        }
        if (needsMapping(dto, dto.getSojtlineno(), "sojtlineno")) {
            entity.setSojtlineno(dto.getSojtlineno());
        }
        if (needsMapping(dto, dto.getDatatype(), "datatype")) {
            entity.setDatatype(dto.getDatatype());
        }
        if (needsMapping(dto, dto.getPlanseq(), "planseq")) {
            entity.setPlanseq(dto.getPlanseq());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getExpectqty1(), "expectqty1")) {
            entity.setExpectqty1(dto.getExpectqty1());
        }
        if (needsMapping(dto, dto.getPickedqty1(), "pickedqty1")) {
            entity.setPickedqty1(dto.getPickedqty1());
        }
        if (needsMapping(dto, dto.getPoid(), "poid")) {
            entity.setPoid(dto.getPoid());
        }
        if (needsMapping(dto, dto.getPalletId(), "palletId")) {
            entity.setPalletId(dto.getPalletId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getSoid(), "soid")) {
            entity.setSoid(dto.getSoid());
        }
        if (needsMapping(dto, dto.getSodetailid(), "sodetailid")) {
            entity.setSodetailid(dto.getSodetailid());
        }
        if (needsMapping(dto, dto.getTrsoaddflg(), "trsoaddflg")) {
            entity.setTrsoaddflg(dto.getTrsoaddflg());
        }
        if (needsMapping(dto, dto.getPlanoutseq(), "planoutseq")) {
            entity.setPlanoutseq(dto.getPlanoutseq());
        }
        if (needsMapping(dto, dto.getPlanprice1(), "planprice1")) {
            entity.setPlanprice1(dto.getPlanprice1());
        }
        if (needsMapping(dto, dto.getPlanprice2(), "planprice2")) {
            entity.setPlanprice2(dto.getPlanprice2());
        }
        if (needsMapping(dto, dto.getPlanitemname(), "planitemname")) {
            entity.setPlanitemname(dto.getPlanitemname());
        }
        if (needsMapping(dto, dto.getPlandata1(), "plandata1")) {
            entity.setPlandata1(dto.getPlandata1());
        }
        if (needsMapping(dto, dto.getPlandata2(), "plandata2")) {
            entity.setPlandata2(dto.getPlandata2());
        }
        if (needsMapping(dto, dto.getPlandata3(), "plandata3")) {
            entity.setPlandata3(dto.getPlandata3());
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
    protected boolean needsMapping(TTrsojtdetailDto dto, Object value, String propName) {
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
    public List<TTrsojtdetail> mappingToEntityList(List<TTrsojtdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrsojtdetail> entityList = new ArrayList<TTrsojtdetail>();
        for (TTrsojtdetailDto dto : dtoList) {
            TTrsojtdetail entity = mappingToEntity(dto);
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
    public TTrsojtdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsojtdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsojtdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsojtdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsojtdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsojtdetailDtoMapper)this;
    }
}
