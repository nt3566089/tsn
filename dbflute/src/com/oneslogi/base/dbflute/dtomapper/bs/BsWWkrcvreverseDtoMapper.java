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
 * The DTO mapper of W_WKRCVREVERSE as TABLE. <br>
 * 製造年月日逆転リスト（入庫）情報
 * <pre>
 * [primary-key]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO
 *
 * [column]
 *     PRINTKEY, RCVREVERSENO, RCVREVERSELINENO, WAREHOUSECD, WAREHOUSENAME, TRANSPORTNO, RCVSCHDATE, SUPPLIERCD, SUPPLIERNAME, PRODUCT_CD, ITEMNAME, RCVLIMITDATE, RCVDESIGNCD, RCVQTY, WORKDATETIME, LOC, LOCCD, LIMITDAY, DESIGNCD, QTYCASE, QTYBOWL, FLG, INSIDE_OUTSIDE_KBN, ITEM_ORDERBY, PRINTPAGENO, SEQSORTKEY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public abstract class BsWWkrcvreverseDtoMapper implements DtoMapper<WWkrcvreverse, WWkrcvreverseDto>, Serializable {

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
    public BsWWkrcvreverseDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWWkrcvreverseDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WWkrcvreverseDto mappingToDto(WWkrcvreverse entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkrcvreverseDto dto = new WWkrcvreverseDto();
        dto.setPrintkey(entity.getPrintkey());
        dto.setRcvreverseno(entity.getRcvreverseno());
        dto.setRcvreverselineno(entity.getRcvreverselineno());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setWarehousename(entity.getWarehousename());
        dto.setTransportno(entity.getTransportno());
        dto.setRcvschdate(entity.getRcvschdate());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setSuppliername(entity.getSuppliername());
        dto.setProductCd(entity.getProductCd());
        dto.setItemname(entity.getItemname());
        dto.setRcvlimitdate(entity.getRcvlimitdate());
        dto.setRcvdesigncd(entity.getRcvdesigncd());
        dto.setRcvqty(entity.getRcvqty());
        dto.setWorkdatetime(entity.getWorkdatetime());
        dto.setLoc(entity.getLoc());
        dto.setLoccd(entity.getLoccd());
        dto.setLimitday(entity.getLimitday());
        dto.setDesigncd(entity.getDesigncd());
        dto.setQtycase(entity.getQtycase());
        dto.setQtybowl(entity.getQtybowl());
        dto.setFlg(entity.getFlg());
        dto.setInsideOutsideKbn(entity.getInsideOutsideKbn());
        dto.setItemOrderby(entity.getItemOrderby());
        dto.setPrintpageno(entity.getPrintpageno());
        dto.setSeqsortkey(entity.getSeqsortkey());
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
    public List<WWkrcvreverseDto> mappingToDtoList(List<WWkrcvreverse> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WWkrcvreverseDto> dtoList = new ArrayList<WWkrcvreverseDto>();
        for (WWkrcvreverse entity : entityList) {
            WWkrcvreverseDto dto = mappingToDto(entity);
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
    public WWkrcvreverse mappingToEntity(WWkrcvreverseDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkrcvreverse entity = new WWkrcvreverse();
        if (needsMapping(dto, dto.getPrintkey(), "printkey")) {
            entity.setPrintkey(dto.getPrintkey());
        }
        if (needsMapping(dto, dto.getRcvreverseno(), "rcvreverseno")) {
            entity.setRcvreverseno(dto.getRcvreverseno());
        }
        if (needsMapping(dto, dto.getRcvreverselineno(), "rcvreverselineno")) {
            entity.setRcvreverselineno(dto.getRcvreverselineno());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getWarehousename(), "warehousename")) {
            entity.setWarehousename(dto.getWarehousename());
        }
        if (needsMapping(dto, dto.getTransportno(), "transportno")) {
            entity.setTransportno(dto.getTransportno());
        }
        if (needsMapping(dto, dto.getRcvschdate(), "rcvschdate")) {
            entity.setRcvschdate(dto.getRcvschdate());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getSuppliername(), "suppliername")) {
            entity.setSuppliername(dto.getSuppliername());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemname(), "itemname")) {
            entity.setItemname(dto.getItemname());
        }
        if (needsMapping(dto, dto.getRcvlimitdate(), "rcvlimitdate")) {
            entity.setRcvlimitdate(dto.getRcvlimitdate());
        }
        if (needsMapping(dto, dto.getRcvdesigncd(), "rcvdesigncd")) {
            entity.setRcvdesigncd(dto.getRcvdesigncd());
        }
        if (needsMapping(dto, dto.getRcvqty(), "rcvqty")) {
            entity.setRcvqty(dto.getRcvqty());
        }
        if (needsMapping(dto, dto.getWorkdatetime(), "workdatetime")) {
            entity.setWorkdatetime(dto.getWorkdatetime());
        }
        if (needsMapping(dto, dto.getLoc(), "loc")) {
            entity.setLoc(dto.getLoc());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getLimitday(), "limitday")) {
            entity.setLimitday(dto.getLimitday());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getQtycase(), "qtycase")) {
            entity.setQtycase(dto.getQtycase());
        }
        if (needsMapping(dto, dto.getQtybowl(), "qtybowl")) {
            entity.setQtybowl(dto.getQtybowl());
        }
        if (needsMapping(dto, dto.getFlg(), "flg")) {
            entity.setFlg(dto.getFlg());
        }
        if (needsMapping(dto, dto.getInsideOutsideKbn(), "insideOutsideKbn")) {
            entity.setInsideOutsideKbn(dto.getInsideOutsideKbn());
        }
        if (needsMapping(dto, dto.getItemOrderby(), "itemOrderby")) {
            entity.setItemOrderby(dto.getItemOrderby());
        }
        if (needsMapping(dto, dto.getPrintpageno(), "printpageno")) {
            entity.setPrintpageno(dto.getPrintpageno());
        }
        if (needsMapping(dto, dto.getSeqsortkey(), "seqsortkey")) {
            entity.setSeqsortkey(dto.getSeqsortkey());
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
    protected boolean needsMapping(WWkrcvreverseDto dto, Object value, String propName) {
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
    public List<WWkrcvreverse> mappingToEntityList(List<WWkrcvreverseDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WWkrcvreverse> entityList = new ArrayList<WWkrcvreverse>();
        for (WWkrcvreverseDto dto : dtoList) {
            WWkrcvreverse entity = mappingToEntity(dto);
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
    public WWkrcvreverseDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WWkrcvreverseDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WWkrcvreverseDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WWkrcvreverseDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WWkrcvreverseDtoMapper reverseReference() {
        setReverseReference(true);
        return (WWkrcvreverseDtoMapper)this;
    }
}
