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
 * The DTO mapper of T_TRSYMBOL as TABLE. <br>
 * 段ボール情報
 * <pre>
 * [primary-key]
 *     TRSYMBOL_ID
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, PRODUCT_CD, ITEMCD, PRODUCT_CD_CASE, PRODUCT_CD_IN, LOT3, DESIGNCD_IN, DESIGNCD_CASE, LOT4, LOT1, LOT2, SYMBOLLINENO, OWNERCD, STOCK_TYPE_CD, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, DAMAGEFLG, RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, RCVLINENO, SENDRCVKEY, MAKERCASENO, SYMBOLSTS, SYMBOLADDFLG, PRINTEDFLG, SYMBOLSNDDATE, SYMBOLPASTDATE, SYMBOLPALLETONDATE, RECEIVEDATE, PALLET_ID, BASE_PALLET_ID, PARENTPALLETUPDDATE, PRINTINGDATE, LOCATION_ID, RESTQTY, RECEIVEDQTY, DISTRIBUTIONCD, TRANSPORTCD, ORDERNO, RCV_PALLET_ID, SYMBOLFACTORYCD, SYMBOLITEMCD, SYMBOLSKU, SYMBOLRECEIVECD, SYMBOLPRODUCTMARK, SYMBOLORDERNO, SYMBOLPRINTERNO, SYMBOLMAKENO, SYMBOLLOT4, SYMBOLMAKETIME, SYMBOLCIRCULATIONID, SYMBOLRCVKEY, SYMBOLLOT3, QRData, TREXAMRESULT_ID, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, DATETIME, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, MIXEDFLG, SHIPPEDFLG, CASECREATETYPE, CREATEDATETIME, InitNum, ParentCaseCd, TR_PICKLIST_ID, PicklistGNo, RecombDatetime, ReprintedFlg, TraceSts, CLIENT_ID, BATJPRODUCTIONYM, COMETODATE, RCVPALLETNO, TAXPALLETNO, SHTYPECD, CENTER_ID, RESTCTN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     T_CENTER_SYMBOL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tCenterSymbolList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrsymbolDtoMapper implements DtoMapper<TTrsymbol, TTrsymbolDto>, Serializable {

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
    protected boolean _suppressTCenterSymbolList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsymbolDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrsymbolDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrsymbolDto mappingToDto(TTrsymbol entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrsymbolDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsymbolDto dto = new TTrsymbolDto();
        dto.setTrsymbolId(entity.getTrsymbolId());
        dto.setCasecd(entity.getCasecd());
        dto.setProductCd(entity.getProductCd());
        dto.setItemcd(entity.getItemcd());
        dto.setProductCdCase(entity.getProductCdCase());
        dto.setProductCdIn(entity.getProductCdIn());
        dto.setLot3(entity.getLot3());
        dto.setDesigncdIn(entity.getDesigncdIn());
        dto.setDesigncdCase(entity.getDesigncdCase());
        dto.setLot4(entity.getLot4());
        dto.setLot1(entity.getLot1());
        dto.setLot2(entity.getLot2());
        dto.setSymbollineno(entity.getSymbollineno());
        dto.setOwnercd(entity.getOwnercd());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setForeigncargoflg(entity.getForeigncargoflg());
        dto.setCustomsreleaseflg(entity.getCustomsreleaseflg());
        dto.setDamageflg(entity.getDamageflg());
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setRcvlineno(entity.getRcvlineno());
        dto.setSendrcvkey(entity.getSendrcvkey());
        dto.setMakercaseno(entity.getMakercaseno());
        dto.setSymbolsts(entity.getSymbolsts());
        dto.setSymboladdflg(entity.getSymboladdflg());
        dto.setPrintedflg(entity.getPrintedflg());
        dto.setSymbolsnddate(entity.getSymbolsnddate());
        dto.setSymbolpastdate(entity.getSymbolpastdate());
        dto.setSymbolpalletondate(entity.getSymbolpalletondate());
        dto.setReceivedate(entity.getReceivedate());
        dto.setPalletId(entity.getPalletId());
        dto.setBasePalletId(entity.getBasePalletId());
        dto.setParentpalletupddate(entity.getParentpalletupddate());
        dto.setPrintingdate(entity.getPrintingdate());
        dto.setLocationId(entity.getLocationId());
        dto.setRestqty(entity.getRestqty());
        dto.setReceivedqty(entity.getReceivedqty());
        dto.setDistributioncd(entity.getDistributioncd());
        dto.setTransportcd(entity.getTransportcd());
        dto.setOrderno(entity.getOrderno());
        dto.setRcvPalletId(entity.getRcvPalletId());
        dto.setSymbolfactorycd(entity.getSymbolfactorycd());
        dto.setSymbolitemcd(entity.getSymbolitemcd());
        dto.setSymbolsku(entity.getSymbolsku());
        dto.setSymbolreceivecd(entity.getSymbolreceivecd());
        dto.setSymbolproductmark(entity.getSymbolproductmark());
        dto.setSymbolorderno(entity.getSymbolorderno());
        dto.setSymbolprinterno(entity.getSymbolprinterno());
        dto.setSymbolmakeno(entity.getSymbolmakeno());
        dto.setSymbollot4(entity.getSymbollot4());
        dto.setSymbolmaketime(entity.getSymbolmaketime());
        dto.setSymbolcirculationid(entity.getSymbolcirculationid());
        dto.setSymbolrcvkey(entity.getSymbolrcvkey());
        dto.setSymbollot3(entity.getSymbollot3());
        dto.setQrdata(entity.getQrdata());
        dto.setTrexamresultId(entity.getTrexamresultId());
        dto.setCaseitfno(entity.getCaseitfno());
        dto.setCasebarcodevaliant(entity.getCasebarcodevaliant());
        dto.setCaselot4(entity.getCaselot4());
        dto.setDatetime(entity.getDatetime());
        dto.setCasecenterno(entity.getCasecenterno());
        dto.setCasepackno(entity.getCasepackno());
        dto.setCasepacktime(entity.getCasepacktime());
        dto.setCasebarcode(entity.getCasebarcode());
        dto.setMixedflg(entity.getMixedflg());
        dto.setShippedflg(entity.getShippedflg());
        dto.setCasecreatetype(entity.getCasecreatetype());
        dto.setCreatedatetime(entity.getCreatedatetime());
        dto.setInitnum(entity.getInitnum());
        dto.setParentcasecd(entity.getParentcasecd());
        dto.setTrPicklistId(entity.getTrPicklistId());
        dto.setPicklistgno(entity.getPicklistgno());
        dto.setRecombdatetime(entity.getRecombdatetime());
        dto.setReprintedflg(entity.getReprintedflg());
        dto.setTracests(entity.getTracests());
        dto.setClientId(entity.getClientId());
        dto.setBatjproductionym(entity.getBatjproductionym());
        dto.setCometodate(entity.getCometodate());
        dto.setRcvpalletno(entity.getRcvpalletno());
        dto.setTaxpalletno(entity.getTaxpalletno());
        dto.setShtypecd(entity.getShtypecd());
        dto.setCenterId(entity.getCenterId());
        dto.setRestctn(entity.getRestctn());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTCenterSymbolList && !entity.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrsymbol();
            List<TCenterSymbolDto> relationDtoList = mapper.mappingToDtoList(entity.getTCenterSymbolList());
            dto.setTCenterSymbolList(relationDtoList);
            if (reverseReference) {
                for (TCenterSymbolDto relationDto : relationDtoList) {
                    relationDto.setTTrsymbol(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrsymbolDto> mappingToDtoList(List<TTrsymbol> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrsymbolDto> dtoList = new ArrayList<TTrsymbolDto>();
        for (TTrsymbol entity : entityList) {
            TTrsymbolDto dto = mappingToDto(entity);
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
    public TTrsymbol mappingToEntity(TTrsymbolDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrsymbol)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrsymbol entity = new TTrsymbol();
        if (needsMapping(dto, dto.getTrsymbolId(), "trsymbolId")) {
            entity.setTrsymbolId(dto.getTrsymbolId());
        }
        if (needsMapping(dto, dto.getCasecd(), "casecd")) {
            entity.setCasecd(dto.getCasecd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getItemcd(), "itemcd")) {
            entity.setItemcd(dto.getItemcd());
        }
        if (needsMapping(dto, dto.getProductCdCase(), "productCdCase")) {
            entity.setProductCdCase(dto.getProductCdCase());
        }
        if (needsMapping(dto, dto.getProductCdIn(), "productCdIn")) {
            entity.setProductCdIn(dto.getProductCdIn());
        }
        if (needsMapping(dto, dto.getLot3(), "lot3")) {
            entity.setLot3(dto.getLot3());
        }
        if (needsMapping(dto, dto.getDesigncdIn(), "designcdIn")) {
            entity.setDesigncdIn(dto.getDesigncdIn());
        }
        if (needsMapping(dto, dto.getDesigncdCase(), "designcdCase")) {
            entity.setDesigncdCase(dto.getDesigncdCase());
        }
        if (needsMapping(dto, dto.getLot4(), "lot4")) {
            entity.setLot4(dto.getLot4());
        }
        if (needsMapping(dto, dto.getLot1(), "lot1")) {
            entity.setLot1(dto.getLot1());
        }
        if (needsMapping(dto, dto.getLot2(), "lot2")) {
            entity.setLot2(dto.getLot2());
        }
        if (needsMapping(dto, dto.getSymbollineno(), "symbollineno")) {
            entity.setSymbollineno(dto.getSymbollineno());
        }
        if (needsMapping(dto, dto.getOwnercd(), "ownercd")) {
            entity.setOwnercd(dto.getOwnercd());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getForeigncargoflg(), "foreigncargoflg")) {
            entity.setForeigncargoflg(dto.getForeigncargoflg());
        }
        if (needsMapping(dto, dto.getCustomsreleaseflg(), "customsreleaseflg")) {
            entity.setCustomsreleaseflg(dto.getCustomsreleaseflg());
        }
        if (needsMapping(dto, dto.getDamageflg(), "damageflg")) {
            entity.setDamageflg(dto.getDamageflg());
        }
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
        }
        if (needsMapping(dto, dto.getRcvlineno(), "rcvlineno")) {
            entity.setRcvlineno(dto.getRcvlineno());
        }
        if (needsMapping(dto, dto.getSendrcvkey(), "sendrcvkey")) {
            entity.setSendrcvkey(dto.getSendrcvkey());
        }
        if (needsMapping(dto, dto.getMakercaseno(), "makercaseno")) {
            entity.setMakercaseno(dto.getMakercaseno());
        }
        if (needsMapping(dto, dto.getSymbolsts(), "symbolsts")) {
            entity.setSymbolsts(dto.getSymbolsts());
        }
        if (needsMapping(dto, dto.getSymboladdflg(), "symboladdflg")) {
            entity.setSymboladdflg(dto.getSymboladdflg());
        }
        if (needsMapping(dto, dto.getPrintedflg(), "printedflg")) {
            entity.setPrintedflg(dto.getPrintedflg());
        }
        if (needsMapping(dto, dto.getSymbolsnddate(), "symbolsnddate")) {
            entity.setSymbolsnddate(dto.getSymbolsnddate());
        }
        if (needsMapping(dto, dto.getSymbolpastdate(), "symbolpastdate")) {
            entity.setSymbolpastdate(dto.getSymbolpastdate());
        }
        if (needsMapping(dto, dto.getSymbolpalletondate(), "symbolpalletondate")) {
            entity.setSymbolpalletondate(dto.getSymbolpalletondate());
        }
        if (needsMapping(dto, dto.getReceivedate(), "receivedate")) {
            entity.setReceivedate(dto.getReceivedate());
        }
        if (needsMapping(dto, dto.getPalletId(), "palletId")) {
            entity.setPalletId(dto.getPalletId());
        }
        if (needsMapping(dto, dto.getBasePalletId(), "basePalletId")) {
            entity.setBasePalletId(dto.getBasePalletId());
        }
        if (needsMapping(dto, dto.getParentpalletupddate(), "parentpalletupddate")) {
            entity.setParentpalletupddate(dto.getParentpalletupddate());
        }
        if (needsMapping(dto, dto.getPrintingdate(), "printingdate")) {
            entity.setPrintingdate(dto.getPrintingdate());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getRestqty(), "restqty")) {
            entity.setRestqty(dto.getRestqty());
        }
        if (needsMapping(dto, dto.getReceivedqty(), "receivedqty")) {
            entity.setReceivedqty(dto.getReceivedqty());
        }
        if (needsMapping(dto, dto.getDistributioncd(), "distributioncd")) {
            entity.setDistributioncd(dto.getDistributioncd());
        }
        if (needsMapping(dto, dto.getTransportcd(), "transportcd")) {
            entity.setTransportcd(dto.getTransportcd());
        }
        if (needsMapping(dto, dto.getOrderno(), "orderno")) {
            entity.setOrderno(dto.getOrderno());
        }
        if (needsMapping(dto, dto.getRcvPalletId(), "rcvPalletId")) {
            entity.setRcvPalletId(dto.getRcvPalletId());
        }
        if (needsMapping(dto, dto.getSymbolfactorycd(), "symbolfactorycd")) {
            entity.setSymbolfactorycd(dto.getSymbolfactorycd());
        }
        if (needsMapping(dto, dto.getSymbolitemcd(), "symbolitemcd")) {
            entity.setSymbolitemcd(dto.getSymbolitemcd());
        }
        if (needsMapping(dto, dto.getSymbolsku(), "symbolsku")) {
            entity.setSymbolsku(dto.getSymbolsku());
        }
        if (needsMapping(dto, dto.getSymbolreceivecd(), "symbolreceivecd")) {
            entity.setSymbolreceivecd(dto.getSymbolreceivecd());
        }
        if (needsMapping(dto, dto.getSymbolproductmark(), "symbolproductmark")) {
            entity.setSymbolproductmark(dto.getSymbolproductmark());
        }
        if (needsMapping(dto, dto.getSymbolorderno(), "symbolorderno")) {
            entity.setSymbolorderno(dto.getSymbolorderno());
        }
        if (needsMapping(dto, dto.getSymbolprinterno(), "symbolprinterno")) {
            entity.setSymbolprinterno(dto.getSymbolprinterno());
        }
        if (needsMapping(dto, dto.getSymbolmakeno(), "symbolmakeno")) {
            entity.setSymbolmakeno(dto.getSymbolmakeno());
        }
        if (needsMapping(dto, dto.getSymbollot4(), "symbollot4")) {
            entity.setSymbollot4(dto.getSymbollot4());
        }
        if (needsMapping(dto, dto.getSymbolmaketime(), "symbolmaketime")) {
            entity.setSymbolmaketime(dto.getSymbolmaketime());
        }
        if (needsMapping(dto, dto.getSymbolcirculationid(), "symbolcirculationid")) {
            entity.setSymbolcirculationid(dto.getSymbolcirculationid());
        }
        if (needsMapping(dto, dto.getSymbolrcvkey(), "symbolrcvkey")) {
            entity.setSymbolrcvkey(dto.getSymbolrcvkey());
        }
        if (needsMapping(dto, dto.getSymbollot3(), "symbollot3")) {
            entity.setSymbollot3(dto.getSymbollot3());
        }
        if (needsMapping(dto, dto.getQrdata(), "qrdata")) {
            entity.setQrdata(dto.getQrdata());
        }
        if (needsMapping(dto, dto.getTrexamresultId(), "trexamresultId")) {
            entity.setTrexamresultId(dto.getTrexamresultId());
        }
        if (needsMapping(dto, dto.getCaseitfno(), "caseitfno")) {
            entity.setCaseitfno(dto.getCaseitfno());
        }
        if (needsMapping(dto, dto.getCasebarcodevaliant(), "casebarcodevaliant")) {
            entity.setCasebarcodevaliant(dto.getCasebarcodevaliant());
        }
        if (needsMapping(dto, dto.getCaselot4(), "caselot4")) {
            entity.setCaselot4(dto.getCaselot4());
        }
        if (needsMapping(dto, dto.getDatetime(), "datetime")) {
            entity.setDatetime(dto.getDatetime());
        }
        if (needsMapping(dto, dto.getCasecenterno(), "casecenterno")) {
            entity.setCasecenterno(dto.getCasecenterno());
        }
        if (needsMapping(dto, dto.getCasepackno(), "casepackno")) {
            entity.setCasepackno(dto.getCasepackno());
        }
        if (needsMapping(dto, dto.getCasepacktime(), "casepacktime")) {
            entity.setCasepacktime(dto.getCasepacktime());
        }
        if (needsMapping(dto, dto.getCasebarcode(), "casebarcode")) {
            entity.setCasebarcode(dto.getCasebarcode());
        }
        if (needsMapping(dto, dto.getMixedflg(), "mixedflg")) {
            entity.setMixedflg(dto.getMixedflg());
        }
        if (needsMapping(dto, dto.getShippedflg(), "shippedflg")) {
            entity.setShippedflg(dto.getShippedflg());
        }
        if (needsMapping(dto, dto.getCasecreatetype(), "casecreatetype")) {
            entity.setCasecreatetype(dto.getCasecreatetype());
        }
        if (needsMapping(dto, dto.getCreatedatetime(), "createdatetime")) {
            entity.setCreatedatetime(dto.getCreatedatetime());
        }
        if (needsMapping(dto, dto.getInitnum(), "initnum")) {
            entity.setInitnum(dto.getInitnum());
        }
        if (needsMapping(dto, dto.getParentcasecd(), "parentcasecd")) {
            entity.setParentcasecd(dto.getParentcasecd());
        }
        if (needsMapping(dto, dto.getTrPicklistId(), "trPicklistId")) {
            entity.setTrPicklistId(dto.getTrPicklistId());
        }
        if (needsMapping(dto, dto.getPicklistgno(), "picklistgno")) {
            entity.setPicklistgno(dto.getPicklistgno());
        }
        if (needsMapping(dto, dto.getRecombdatetime(), "recombdatetime")) {
            entity.setRecombdatetime(dto.getRecombdatetime());
        }
        if (needsMapping(dto, dto.getReprintedflg(), "reprintedflg")) {
            entity.setReprintedflg(dto.getReprintedflg());
        }
        if (needsMapping(dto, dto.getTracests(), "tracests")) {
            entity.setTracests(dto.getTracests());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getBatjproductionym(), "batjproductionym")) {
            entity.setBatjproductionym(dto.getBatjproductionym());
        }
        if (needsMapping(dto, dto.getCometodate(), "cometodate")) {
            entity.setCometodate(dto.getCometodate());
        }
        if (needsMapping(dto, dto.getRcvpalletno(), "rcvpalletno")) {
            entity.setRcvpalletno(dto.getRcvpalletno());
        }
        if (needsMapping(dto, dto.getTaxpalletno(), "taxpalletno")) {
            entity.setTaxpalletno(dto.getTaxpalletno());
        }
        if (needsMapping(dto, dto.getShtypecd(), "shtypecd")) {
            entity.setShtypecd(dto.getShtypecd());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getRestctn(), "restctn")) {
            entity.setRestctn(dto.getRestctn());
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
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressTCenterSymbolList && !dto.getTCenterSymbolList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrsymbol();
            List<TCenterSymbol> relationEntityList = mapper.mappingToEntityList(dto.getTCenterSymbolList());
            entity.setTCenterSymbolList(relationEntityList);
            if (reverseReference) {
                for (TCenterSymbol relationEntity : relationEntityList) {
                    relationEntity.setTTrsymbol(entity);
                }
            }
        };
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
    protected boolean needsMapping(TTrsymbolDto dto, Object value, String propName) {
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
    public List<TTrsymbol> mappingToEntityList(List<TTrsymbolDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrsymbol> entityList = new ArrayList<TTrsymbol>();
        for (TTrsymbolDto dto : dtoList) {
            TTrsymbol entity = mappingToEntity(dto);
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
    public void suppressTCenterSymbolList() {
        _suppressTCenterSymbolList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTCenterSymbolList();
    }
    protected void doSuppressClear() { // internal
        _suppressTCenterSymbolList = false;
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
    public TTrsymbolDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrsymbolDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrsymbolDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrsymbolDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrsymbolDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrsymbolDtoMapper)this;
    }
}
