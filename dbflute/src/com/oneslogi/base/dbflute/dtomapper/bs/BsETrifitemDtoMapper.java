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
 * The DTO mapper of E_TRIFITEM as TABLE. <br>
 * 銘柄インタフェース
 * <pre>
 * [primary-key]
 *     IMPORTKEY
 *
 * [column]
 *     IMPORTKEY, STS, IMPCHECKKEY, ITEMADMIN, PRODUCT_CD, ITEMGROUP, ACTFLG, INVTYPE, SETITEMFLG, NAME, SNAME, ANAME, OWNERITEMCD, SUPPLIERITEMCD, POSITEMCD, ITFCD, MANUITEMCD, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, ABCTYPE, QTY1TYPE, UNIT1, UNIT1STYLE, LENGTH1, WIDTH1, HEIGHT1, GROSSWEIGHT1, NETWEIGHT1, CUBE1, LITER1, UNIT2, UNIT2STYLE, LENGTH2, WIDTH2, HEIGHT2, GROSSWEIGHT2, NETWEIGHT2, CUBE2, LITER2, UNIT3, UNIT3STYLE, LENGTH3, WIDTH3, HEIGHT3, GROSSWEIGHT3, NETWEIGHT3, CUBE3, LITER3, P_QTY, P_HEIGHT, P_ODD, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, PRICE_INSURANCE, LIMITDAY, SUPPLIERCD, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, PRICELEVEL, ITEMCATALOGURL, USERNUM1, USERNUM2, USERNUM3, USERNUM4, USERNUM5, USERDATE1, USERDATE2, USERDATE3, USERDATE4, USERDATE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsETrifitemDtoMapper implements DtoMapper<ETrifitem, ETrifitemDto>, Serializable {

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
    public BsETrifitemDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsETrifitemDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ETrifitemDto mappingToDto(ETrifitem entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrifitemDto dto = new ETrifitemDto();
        dto.setImportkey(entity.getImportkey());
        dto.setSts(entity.getSts());
        dto.setImpcheckkey(entity.getImpcheckkey());
        dto.setItemadmin(entity.getItemadmin());
        dto.setProductCd(entity.getProductCd());
        dto.setItemgroup(entity.getItemgroup());
        dto.setActflg(entity.getActflg());
        dto.setInvtype(entity.getInvtype());
        dto.setSetitemflg(entity.getSetitemflg());
        dto.setName(entity.getName());
        dto.setSname(entity.getSname());
        dto.setAname(entity.getAname());
        dto.setOwneritemcd(entity.getOwneritemcd());
        dto.setSupplieritemcd(entity.getSupplieritemcd());
        dto.setPositemcd(entity.getPositemcd());
        dto.setItfcd(entity.getItfcd());
        dto.setManuitemcd(entity.getManuitemcd());
        dto.setPriceBuy(entity.getPriceBuy());
        dto.setPriceWholesale(entity.getPriceWholesale());
        dto.setPriceSale(entity.getPriceSale());
        dto.setAbctype(entity.getAbctype());
        dto.setQty1type(entity.getQty1type());
        dto.setUnit1(entity.getUnit1());
        dto.setUnit1style(entity.getUnit1style());
        dto.setLength1(entity.getLength1());
        dto.setWidth1(entity.getWidth1());
        dto.setHeight1(entity.getHeight1());
        dto.setGrossweight1(entity.getGrossweight1());
        dto.setNetweight1(entity.getNetweight1());
        dto.setCube1(entity.getCube1());
        dto.setLiter1(entity.getLiter1());
        dto.setUnit2(entity.getUnit2());
        dto.setUnit2style(entity.getUnit2style());
        dto.setLength2(entity.getLength2());
        dto.setWidth2(entity.getWidth2());
        dto.setHeight2(entity.getHeight2());
        dto.setGrossweight2(entity.getGrossweight2());
        dto.setNetweight2(entity.getNetweight2());
        dto.setCube2(entity.getCube2());
        dto.setLiter2(entity.getLiter2());
        dto.setUnit3(entity.getUnit3());
        dto.setUnit3style(entity.getUnit3style());
        dto.setLength3(entity.getLength3());
        dto.setWidth3(entity.getWidth3());
        dto.setHeight3(entity.getHeight3());
        dto.setGrossweight3(entity.getGrossweight3());
        dto.setNetweight3(entity.getNetweight3());
        dto.setCube3(entity.getCube3());
        dto.setLiter3(entity.getLiter3());
        dto.setPQty(entity.getPQty());
        dto.setPHeight(entity.getPHeight());
        dto.setPOdd(entity.getPOdd());
        dto.setNotes(entity.getNotes());
        dto.setFUser1(entity.getFUser1());
        dto.setFUser2(entity.getFUser2());
        dto.setFUser3(entity.getFUser3());
        dto.setFUser4(entity.getFUser4());
        dto.setFUser5(entity.getFUser5());
        dto.setPriceInsurance(entity.getPriceInsurance());
        dto.setLimitday(entity.getLimitday());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setUseruse1(entity.getUseruse1());
        dto.setUseruse2(entity.getUseruse2());
        dto.setUseruse3(entity.getUseruse3());
        dto.setUseruse4(entity.getUseruse4());
        dto.setUseruse5(entity.getUseruse5());
        dto.setPricelevel(entity.getPricelevel());
        dto.setItemcatalogurl(entity.getItemcatalogurl());
        dto.setUsernum1(entity.getUsernum1());
        dto.setUsernum2(entity.getUsernum2());
        dto.setUsernum3(entity.getUsernum3());
        dto.setUsernum4(entity.getUsernum4());
        dto.setUsernum5(entity.getUsernum5());
        dto.setUserdate1(entity.getUserdate1());
        dto.setUserdate2(entity.getUserdate2());
        dto.setUserdate3(entity.getUserdate3());
        dto.setUserdate4(entity.getUserdate4());
        dto.setUserdate5(entity.getUserdate5());
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
    public List<ETrifitemDto> mappingToDtoList(List<ETrifitem> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ETrifitemDto> dtoList = new ArrayList<ETrifitemDto>();
        for (ETrifitem entity : entityList) {
            ETrifitemDto dto = mappingToDto(entity);
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
    public ETrifitem mappingToEntity(ETrifitemDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ETrifitem entity = new ETrifitem();
        if (needsMapping(dto, dto.getImportkey(), "importkey")) {
            entity.setImportkey(dto.getImportkey());
        }
        if (needsMapping(dto, dto.getSts(), "sts")) {
            entity.setSts(dto.getSts());
        }
        if (needsMapping(dto, dto.getImpcheckkey(), "impcheckkey")) {
            entity.setImpcheckkey(dto.getImpcheckkey());
        }
        if (needsMapping(dto, dto.getItemadmin(), "itemadmin")) {
            entity.setItemadmin(dto.getItemadmin());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemgroup(), "itemgroup")) {
            entity.setItemgroup(dto.getItemgroup());
        }
        if (needsMapping(dto, dto.getActflg(), "actflg")) {
            entity.setActflg(dto.getActflg());
        }
        if (needsMapping(dto, dto.getInvtype(), "invtype")) {
            entity.setInvtype(dto.getInvtype());
        }
        if (needsMapping(dto, dto.getSetitemflg(), "setitemflg")) {
            entity.setSetitemflg(dto.getSetitemflg());
        }
        if (needsMapping(dto, dto.getName(), "name")) {
            entity.setName(dto.getName());
        }
        if (needsMapping(dto, dto.getSname(), "sname")) {
            entity.setSname(dto.getSname());
        }
        if (needsMapping(dto, dto.getAname(), "aname")) {
            entity.setAname(dto.getAname());
        }
        if (needsMapping(dto, dto.getOwneritemcd(), "owneritemcd")) {
            entity.setOwneritemcd(dto.getOwneritemcd());
        }
        if (needsMapping(dto, dto.getSupplieritemcd(), "supplieritemcd")) {
            entity.setSupplieritemcd(dto.getSupplieritemcd());
        }
        if (needsMapping(dto, dto.getPositemcd(), "positemcd")) {
            entity.setPositemcd(dto.getPositemcd());
        }
        if (needsMapping(dto, dto.getItfcd(), "itfcd")) {
            entity.setItfcd(dto.getItfcd());
        }
        if (needsMapping(dto, dto.getManuitemcd(), "manuitemcd")) {
            entity.setManuitemcd(dto.getManuitemcd());
        }
        if (needsMapping(dto, dto.getPriceBuy(), "priceBuy")) {
            entity.setPriceBuy(dto.getPriceBuy());
        }
        if (needsMapping(dto, dto.getPriceWholesale(), "priceWholesale")) {
            entity.setPriceWholesale(dto.getPriceWholesale());
        }
        if (needsMapping(dto, dto.getPriceSale(), "priceSale")) {
            entity.setPriceSale(dto.getPriceSale());
        }
        if (needsMapping(dto, dto.getAbctype(), "abctype")) {
            entity.setAbctype(dto.getAbctype());
        }
        if (needsMapping(dto, dto.getQty1type(), "qty1type")) {
            entity.setQty1type(dto.getQty1type());
        }
        if (needsMapping(dto, dto.getUnit1(), "unit1")) {
            entity.setUnit1(dto.getUnit1());
        }
        if (needsMapping(dto, dto.getUnit1style(), "unit1style")) {
            entity.setUnit1style(dto.getUnit1style());
        }
        if (needsMapping(dto, dto.getLength1(), "length1")) {
            entity.setLength1(dto.getLength1());
        }
        if (needsMapping(dto, dto.getWidth1(), "width1")) {
            entity.setWidth1(dto.getWidth1());
        }
        if (needsMapping(dto, dto.getHeight1(), "height1")) {
            entity.setHeight1(dto.getHeight1());
        }
        if (needsMapping(dto, dto.getGrossweight1(), "grossweight1")) {
            entity.setGrossweight1(dto.getGrossweight1());
        }
        if (needsMapping(dto, dto.getNetweight1(), "netweight1")) {
            entity.setNetweight1(dto.getNetweight1());
        }
        if (needsMapping(dto, dto.getCube1(), "cube1")) {
            entity.setCube1(dto.getCube1());
        }
        if (needsMapping(dto, dto.getLiter1(), "liter1")) {
            entity.setLiter1(dto.getLiter1());
        }
        if (needsMapping(dto, dto.getUnit2(), "unit2")) {
            entity.setUnit2(dto.getUnit2());
        }
        if (needsMapping(dto, dto.getUnit2style(), "unit2style")) {
            entity.setUnit2style(dto.getUnit2style());
        }
        if (needsMapping(dto, dto.getLength2(), "length2")) {
            entity.setLength2(dto.getLength2());
        }
        if (needsMapping(dto, dto.getWidth2(), "width2")) {
            entity.setWidth2(dto.getWidth2());
        }
        if (needsMapping(dto, dto.getHeight2(), "height2")) {
            entity.setHeight2(dto.getHeight2());
        }
        if (needsMapping(dto, dto.getGrossweight2(), "grossweight2")) {
            entity.setGrossweight2(dto.getGrossweight2());
        }
        if (needsMapping(dto, dto.getNetweight2(), "netweight2")) {
            entity.setNetweight2(dto.getNetweight2());
        }
        if (needsMapping(dto, dto.getCube2(), "cube2")) {
            entity.setCube2(dto.getCube2());
        }
        if (needsMapping(dto, dto.getLiter2(), "liter2")) {
            entity.setLiter2(dto.getLiter2());
        }
        if (needsMapping(dto, dto.getUnit3(), "unit3")) {
            entity.setUnit3(dto.getUnit3());
        }
        if (needsMapping(dto, dto.getUnit3style(), "unit3style")) {
            entity.setUnit3style(dto.getUnit3style());
        }
        if (needsMapping(dto, dto.getLength3(), "length3")) {
            entity.setLength3(dto.getLength3());
        }
        if (needsMapping(dto, dto.getWidth3(), "width3")) {
            entity.setWidth3(dto.getWidth3());
        }
        if (needsMapping(dto, dto.getHeight3(), "height3")) {
            entity.setHeight3(dto.getHeight3());
        }
        if (needsMapping(dto, dto.getGrossweight3(), "grossweight3")) {
            entity.setGrossweight3(dto.getGrossweight3());
        }
        if (needsMapping(dto, dto.getNetweight3(), "netweight3")) {
            entity.setNetweight3(dto.getNetweight3());
        }
        if (needsMapping(dto, dto.getCube3(), "cube3")) {
            entity.setCube3(dto.getCube3());
        }
        if (needsMapping(dto, dto.getLiter3(), "liter3")) {
            entity.setLiter3(dto.getLiter3());
        }
        if (needsMapping(dto, dto.getPQty(), "PQty")) {
            entity.setPQty(dto.getPQty());
        }
        if (needsMapping(dto, dto.getPHeight(), "PHeight")) {
            entity.setPHeight(dto.getPHeight());
        }
        if (needsMapping(dto, dto.getPOdd(), "POdd")) {
            entity.setPOdd(dto.getPOdd());
        }
        if (needsMapping(dto, dto.getNotes(), "notes")) {
            entity.setNotes(dto.getNotes());
        }
        if (needsMapping(dto, dto.getFUser1(), "FUser1")) {
            entity.setFUser1(dto.getFUser1());
        }
        if (needsMapping(dto, dto.getFUser2(), "FUser2")) {
            entity.setFUser2(dto.getFUser2());
        }
        if (needsMapping(dto, dto.getFUser3(), "FUser3")) {
            entity.setFUser3(dto.getFUser3());
        }
        if (needsMapping(dto, dto.getFUser4(), "FUser4")) {
            entity.setFUser4(dto.getFUser4());
        }
        if (needsMapping(dto, dto.getFUser5(), "FUser5")) {
            entity.setFUser5(dto.getFUser5());
        }
        if (needsMapping(dto, dto.getPriceInsurance(), "priceInsurance")) {
            entity.setPriceInsurance(dto.getPriceInsurance());
        }
        if (needsMapping(dto, dto.getLimitday(), "limitday")) {
            entity.setLimitday(dto.getLimitday());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getUseruse1(), "useruse1")) {
            entity.setUseruse1(dto.getUseruse1());
        }
        if (needsMapping(dto, dto.getUseruse2(), "useruse2")) {
            entity.setUseruse2(dto.getUseruse2());
        }
        if (needsMapping(dto, dto.getUseruse3(), "useruse3")) {
            entity.setUseruse3(dto.getUseruse3());
        }
        if (needsMapping(dto, dto.getUseruse4(), "useruse4")) {
            entity.setUseruse4(dto.getUseruse4());
        }
        if (needsMapping(dto, dto.getUseruse5(), "useruse5")) {
            entity.setUseruse5(dto.getUseruse5());
        }
        if (needsMapping(dto, dto.getPricelevel(), "pricelevel")) {
            entity.setPricelevel(dto.getPricelevel());
        }
        if (needsMapping(dto, dto.getItemcatalogurl(), "itemcatalogurl")) {
            entity.setItemcatalogurl(dto.getItemcatalogurl());
        }
        if (needsMapping(dto, dto.getUsernum1(), "usernum1")) {
            entity.setUsernum1(dto.getUsernum1());
        }
        if (needsMapping(dto, dto.getUsernum2(), "usernum2")) {
            entity.setUsernum2(dto.getUsernum2());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
        }
        if (needsMapping(dto, dto.getUsernum4(), "usernum4")) {
            entity.setUsernum4(dto.getUsernum4());
        }
        if (needsMapping(dto, dto.getUsernum5(), "usernum5")) {
            entity.setUsernum5(dto.getUsernum5());
        }
        if (needsMapping(dto, dto.getUserdate1(), "userdate1")) {
            entity.setUserdate1(dto.getUserdate1());
        }
        if (needsMapping(dto, dto.getUserdate2(), "userdate2")) {
            entity.setUserdate2(dto.getUserdate2());
        }
        if (needsMapping(dto, dto.getUserdate3(), "userdate3")) {
            entity.setUserdate3(dto.getUserdate3());
        }
        if (needsMapping(dto, dto.getUserdate4(), "userdate4")) {
            entity.setUserdate4(dto.getUserdate4());
        }
        if (needsMapping(dto, dto.getUserdate5(), "userdate5")) {
            entity.setUserdate5(dto.getUserdate5());
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
    protected boolean needsMapping(ETrifitemDto dto, Object value, String propName) {
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
    public List<ETrifitem> mappingToEntityList(List<ETrifitemDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<ETrifitem> entityList = new ArrayList<ETrifitem>();
        for (ETrifitemDto dto : dtoList) {
            ETrifitem entity = mappingToEntity(dto);
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
    public ETrifitemDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ETrifitemDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ETrifitemDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ETrifitemDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ETrifitemDtoMapper reverseReference() {
        setReverseReference(true);
        return (ETrifitemDtoMapper)this;
    }
}
