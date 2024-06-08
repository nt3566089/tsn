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
 * The DTO mapper of W_WKPALLET as TABLE. <br>
 * 印刷用パレットはり紙情報
 * <pre>
 * [primary-key]
 *     WKPALLET_ID
 *
 * [column]
 *     WKPALLET_ID, PALLETNO, PRINTKEY, LotKey, RcvKey, RcvLineNo, PRINTEDFLG, PrintingDate, LOT1, TRANSPORTNO, SourceCd, SchDate, ReceiveCd, RcvDate, ReceiveDate, WAREHOUSECD, PRODUCT_CD, LOT3, LOT4, LOT2, ReceiveQtyCase, ReceiveQtyBowl, ReceiveQty, RestQtyCase, RestQtyBowl, RestQty, PalletSts, PluralproductionKBN, RtnRcvKbn, ShTypeCd, PALLETCUTTINGKBN, LOCCD, RcvPalletNo, IMAGENAME1, IMAGENAME2, IMAGENAME3, WAREHOUSE_SNAME, ITEM_SNAME, FOREIGNCARGOCD, CARRIERSEQ, OTHERLOT1, USERNUM3, ADDRESS2, AcceptUserCd, AcceptDate, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLET_ID
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
public abstract class BsWWkpalletDtoMapper implements DtoMapper<WWkpallet, WWkpalletDto>, Serializable {

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
    public BsWWkpalletDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWWkpalletDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WWkpalletDto mappingToDto(WWkpallet entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkpalletDto dto = new WWkpalletDto();
        dto.setWkpalletId(entity.getWkpalletId());
        dto.setPalletno(entity.getPalletno());
        dto.setPrintkey(entity.getPrintkey());
        dto.setLotkey(entity.getLotkey());
        dto.setRcvkey(entity.getRcvkey());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setPrintedflg(entity.getPrintedflg());
        dto.setPrintingdate(entity.getPrintingdate());
        dto.setLot1(entity.getLot1());
        dto.setTransportno(entity.getTransportno());
        dto.setSourcecd(entity.getSourcecd());
        dto.setSchdate(entity.getSchdate());
        dto.setReceivecd(entity.getReceivecd());
        dto.setRcvdate(entity.getRcvdate());
        dto.setReceivedate(entity.getReceivedate());
        dto.setWarehousecd(entity.getWarehousecd());
        dto.setProductCd(entity.getProductCd());
        dto.setLot3(entity.getLot3());
        dto.setLot4(entity.getLot4());
        dto.setLot2(entity.getLot2());
        dto.setReceiveqtycase(entity.getReceiveqtycase());
        dto.setReceiveqtybowl(entity.getReceiveqtybowl());
        dto.setReceiveqty(entity.getReceiveqty());
        dto.setRestqtycase(entity.getRestqtycase());
        dto.setRestqtybowl(entity.getRestqtybowl());
        dto.setRestqty(entity.getRestqty());
        dto.setPalletsts(entity.getPalletsts());
        dto.setPluralproductionkbn(entity.getPluralproductionkbn());
        dto.setRtnrcvkbn(entity.getRtnrcvkbn());
        dto.setShtypecd(entity.getShtypecd());
        dto.setPalletcuttingkbn(entity.getPalletcuttingkbn());
        dto.setLoccd(entity.getLoccd());
        dto.setRcvpalletno(entity.getRcvpalletno());
        dto.setImagename1(entity.getImagename1());
        dto.setImagename2(entity.getImagename2());
        dto.setImagename3(entity.getImagename3());
        dto.setWarehouseSname(entity.getWarehouseSname());
        dto.setItemSname(entity.getItemSname());
        dto.setForeigncargocd(entity.getForeigncargocd());
        dto.setCarrierseq(entity.getCarrierseq());
        dto.setOtherlot1(entity.getOtherlot1());
        dto.setUsernum3(entity.getUsernum3());
        dto.setAddress2(entity.getAddress2());
        dto.setAcceptusercd(entity.getAcceptusercd());
        dto.setAcceptdate(entity.getAcceptdate());
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
    public List<WWkpalletDto> mappingToDtoList(List<WWkpallet> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WWkpalletDto> dtoList = new ArrayList<WWkpalletDto>();
        for (WWkpallet entity : entityList) {
            WWkpalletDto dto = mappingToDto(entity);
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
    public WWkpallet mappingToEntity(WWkpalletDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WWkpallet entity = new WWkpallet();
        if (needsMapping(dto, dto.getWkpalletId(), "wkpalletId")) {
            entity.setWkpalletId(dto.getWkpalletId());
        }
        if (needsMapping(dto, dto.getPalletno(), "palletno")) {
            entity.setPalletno(dto.getPalletno());
        }
        if (needsMapping(dto, dto.getPrintkey(), "printkey")) {
            entity.setPrintkey(dto.getPrintkey());
        }
        if (needsMapping(dto, dto.getLotkey(), "lotkey")) {
            entity.setLotkey(dto.getLotkey());
        }
        if (needsMapping(dto, dto.getRcvkey(), "rcvkey")) {
            entity.setRcvkey(dto.getRcvkey());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getPrintedflg(), "printedflg")) {
            entity.setPrintedflg(dto.getPrintedflg());
        }
        if (needsMapping(dto, dto.getPrintingdate(), "printingdate")) {
            entity.setPrintingdate(dto.getPrintingdate());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getTransportno(), "transportno")) {
            entity.setTransportno(dto.getTransportno());
        }
        if (needsMapping(dto, dto.getSourcecd(), "sourcecd")) {
            entity.setSourcecd(dto.getSourcecd());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getReceivecd(), "receivecd")) {
            entity.setReceivecd(dto.getReceivecd());
        }
        if (needsMapping(dto, dto.getRcvdate(), "rcvdate")) {
            entity.setRcvdate(dto.getRcvdate());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getWarehousecd(), "warehousecd")) {
            entity.setWarehousecd(dto.getWarehousecd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getReceiveqtycase(), "receiveqtycase")) {
            entity.setReceiveqtycase(dto.getReceiveqtycase());
        }
        if (needsMapping(dto, dto.getReceiveqtybowl(), "receiveqtybowl")) {
            entity.setReceiveqtybowl(dto.getReceiveqtybowl());
        }
        if (needsMapping(dto, dto.getReceiveqty(), "receiveqty")) {
            entity.setReceiveqty(dto.getReceiveqty());
        }
        if (needsMapping(dto, dto.getRestqtycase(), "restqtycase")) {
            entity.setRestqtycase(dto.getRestqtycase());
        }
        if (needsMapping(dto, dto.getRestqtybowl(), "restqtybowl")) {
            entity.setRestqtybowl(dto.getRestqtybowl());
        }
        if (needsMapping(dto, dto.getRestqty(), "restqty")) {
            entity.setRestqty(dto.getRestqty());
        }
        if (needsMapping(dto, dto.getPalletsts(), "palletsts")) {
            entity.setPalletsts(dto.getPalletsts());
        }
        if (needsMapping(dto, dto.getPluralproductionkbn(), "pluralproductionkbn")) {
            entity.setPluralproductionkbn(dto.getPluralproductionkbn());
        }
        if (needsMapping(dto, dto.getRtnrcvkbn(), "rtnrcvkbn")) {
            entity.setRtnrcvkbn(dto.getRtnrcvkbn());
        }
        if (needsMapping(dto, dto.getShtypecd(), "shtypecd")) {
            entity.setShtypecd(dto.getShtypecd());
        }
        if (needsMapping(dto, dto.getPalletcuttingkbn(), "palletcuttingkbn")) {
            entity.setPalletcuttingkbn(dto.getPalletcuttingkbn());
        }
        if (needsMapping(dto, dto.getLoccd(), "loccd")) {
            entity.setLoccd(dto.getLoccd());
        }
        if (needsMapping(dto, dto.getRcvpalletno(), "rcvpalletno")) {
            entity.setRcvpalletno(dto.getRcvpalletno());
        }
        if (needsMapping(dto, dto.getImagename1(), "imagename1")) {
            entity.setImagename1(dto.getImagename1());
        }
        if (needsMapping(dto, dto.getImagename2(), "imagename2")) {
            entity.setImagename2(dto.getImagename2());
        }
        if (needsMapping(dto, dto.getImagename3(), "imagename3")) {
            entity.setImagename3(dto.getImagename3());
        }
        if (needsMapping(dto, dto.getWarehouseSname(), "warehouseSname")) {
            entity.setWarehouseSname(dto.getWarehouseSname());
        }
        if (needsMapping(dto, dto.getItemSname(), "itemSname")) {
            entity.setItemSname(dto.getItemSname());
        }
        if (needsMapping(dto, dto.getForeigncargocd(), "foreigncargocd")) {
            entity.setForeigncargocd(dto.getForeigncargocd());
        }
        if (needsMapping(dto, dto.getCarrierseq(), "carrierseq")) {
            entity.setCarrierseq(dto.getCarrierseq());
        }
        if (needsMapping(dto, dto.getOtherlot1(), "otherlot1")) {
            entity.setOtherlot1(dto.getOtherlot1());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getAddress2(), "address2")) {
            entity.setAddress2(dto.getAddress2());
        }
        if (needsMapping(dto, dto.getAcceptusercd(), "acceptusercd")) {
            entity.setAcceptusercd(dto.getAcceptusercd());
        }
        if (needsMapping(dto, dto.getAcceptdate(), "acceptdate")) {
            entity.setAcceptdate(dto.getAcceptdate());
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
    protected boolean needsMapping(WWkpalletDto dto, Object value, String propName) {
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
    public List<WWkpallet> mappingToEntityList(List<WWkpalletDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WWkpallet> entityList = new ArrayList<WWkpallet>();
        for (WWkpalletDto dto : dtoList) {
            WWkpallet entity = mappingToEntity(dto);
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
    public WWkpalletDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WWkpalletDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WWkpalletDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WWkpalletDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WWkpalletDtoMapper reverseReference() {
        setReverseReference(true);
        return (WWkpalletDtoMapper)this;
    }
}
