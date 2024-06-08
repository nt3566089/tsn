package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, VERSION_NO, INVENTORY_INST_KBN, LOCATION_GRP, CGGDID, INSTRUCTION_KEY, INVENTORY_DT, ADD_DT, LINE_BLOCK, DIRECTIONAL_PISTON, SORTING_ORDER, SORTING_NUM_TIMES, LOCATION_CD, PRODUCT_CD, JAN_CD, PRODUCT_NM, FIRM_TRANSPORT_CD, UNIT_NUM_BREAKDOWN, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_BEFORE_BREAKDOWN, INVENTORY_NUM, INVENTORY_NUM_OLD, INVENTORY_ITEMS, DIFFERENCE_NUM, DIFFERENCE_ITEMS, NO_SHIPPING_FLG, UPD_DT, CENTER_CD, CENTER_NM, P_QTY, UNIT1, UNIT2, USERNUM4, INVENTORY_PARCENT, INVENTORY_INPUT_FLG
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long inventoryBId = entity.getInventoryBId();
 * Long versionNo = entity.getVersionNo();
 * String inventoryInstKbn = entity.getInventoryInstKbn();
 * String locationGrp = entity.getLocationGrp();
 * String cggdid = entity.getCggdid();
 * Long instructionKey = entity.getInstructionKey();
 * String inventoryDt = entity.getInventoryDt();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String lineBlock = entity.getLineBlock();
 * String directionalPiston = entity.getDirectionalPiston();
 * String sortingOrder = entity.getSortingOrder();
 * Long sortingNumTimes = entity.getSortingNumTimes();
 * String locationCd = entity.getLocationCd();
 * String productCd = entity.getProductCd();
 * String janCd = entity.getJanCd();
 * String productNm = entity.getProductNm();
 * String firmTransportCd = entity.getFirmTransportCd();
 * String unitNumBreakdown = entity.getUnitNumBreakdown();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * String inventoryBeforeBreakdown = entity.getInventoryBeforeBreakdown();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * java.math.BigDecimal inventoryNumOld = entity.getInventoryNumOld();
 * String inventoryItems = entity.getInventoryItems();
 * String differenceNum = entity.getDifferenceNum();
 * String differenceItems = entity.getDifferenceItems();
 * String noShippingFlg = entity.getNoShippingFlg();
 * String updDt = entity.getUpdDt();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * java.math.BigDecimal pQty = entity.getPQty();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * Long usernum4 = entity.getUsernum4();
 * Integer inventoryParcent = entity.getInventoryParcent();
 * String inventoryInputFlg = entity.getInventoryInputFlg();
 * entity.setInventoryBId(inventoryBId);
 * entity.setVersionNo(versionNo);
 * entity.setInventoryInstKbn(inventoryInstKbn);
 * entity.setLocationGrp(locationGrp);
 * entity.setCggdid(cggdid);
 * entity.setInstructionKey(instructionKey);
 * entity.setInventoryDt(inventoryDt);
 * entity.setAddDt(addDt);
 * entity.setLineBlock(lineBlock);
 * entity.setDirectionalPiston(directionalPiston);
 * entity.setSortingOrder(sortingOrder);
 * entity.setSortingNumTimes(sortingNumTimes);
 * entity.setLocationCd(locationCd);
 * entity.setProductCd(productCd);
 * entity.setJanCd(janCd);
 * entity.setProductNm(productNm);
 * entity.setFirmTransportCd(firmTransportCd);
 * entity.setUnitNumBreakdown(unitNumBreakdown);
 * entity.setChargeNum(chargeNum);
 * entity.setAllocNum(allocNum);
 * entity.setMoveNum(moveNum);
 * entity.setInventoryBeforeBreakdown(inventoryBeforeBreakdown);
 * entity.setInventoryNum(inventoryNum);
 * entity.setInventoryNumOld(inventoryNumOld);
 * entity.setInventoryItems(inventoryItems);
 * entity.setDifferenceNum(differenceNum);
 * entity.setDifferenceItems(differenceItems);
 * entity.setNoShippingFlg(noShippingFlg);
 * entity.setUpdDt(updDt);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setPQty(pQty);
 * entity.setUnit1(unit1);
 * entity.setUnit2(unit2);
 * entity.setUsernum4(usernum4);
 * entity.setInventoryParcent(inventoryParcent);
 * entity.setInventoryInputFlg(inventoryInputFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryInputList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {bigint(19)} */
    protected Long _inventoryBId;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** INVENTORY_INST_KBN: {varchar(100)} */
    protected String _inventoryInstKbn;

    /** LOCATION_GRP: {varchar(100)} */
    protected String _locationGrp;

    /** CGGDID: {varchar(100)} */
    protected String _cggdid;

    /** INSTRUCTION_KEY: {bigint(19)} */
    protected Long _instructionKey;

    /** INVENTORY_DT: {varchar(8)} */
    protected String _inventoryDt;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** LINE_BLOCK: {varchar(30)} */
    protected String _lineBlock;

    /** DIRECTIONAL_PISTON: {varchar(255)} */
    protected String _directionalPiston;

    /** SORTING_ORDER: {varchar(255)} */
    protected String _sortingOrder;

    /** SORTING_NUM_TIMES: {bigint(19)} */
    protected Long _sortingNumTimes;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** JAN_CD: {varchar(30)} */
    protected String _janCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** FIRM_TRANSPORT_CD: {varchar(30)} */
    protected String _firmTransportCd;

    /** UNIT_NUM_BREAKDOWN: {varchar(1)} */
    protected String _unitNumBreakdown;

    /** CHARGE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} */
    protected String _inventoryBeforeBreakdown;

    /** INVENTORY_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _inventoryNum;

    /** INVENTORY_NUM_OLD: {decimal(16, 6)} */
    protected java.math.BigDecimal _inventoryNumOld;

    /** INVENTORY_ITEMS: {varchar(1)} */
    protected String _inventoryItems;

    /** DIFFERENCE_NUM: {varchar(1)} */
    protected String _differenceNum;

    /** DIFFERENCE_ITEMS: {varchar(1)} */
    protected String _differenceItems;

    /** NO_SHIPPING_FLG: {char(1)} */
    protected String _noShippingFlg;

    /** UPD_DT: {nvarchar(4000)} */
    protected String _updDt;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** P_QTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _pQty;

    /** UNIT1: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** USERNUM4: {bigint(19)} */
    protected Long _usernum4;

    /** INVENTORY_PARCENT: {int(10)} */
    protected Integer _inventoryParcent;

    /** INVENTORY_INPUT_FLG: {char(1)} */
    protected String _inventoryInputFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryInputListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryInputList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlInventoryInputList) {
            BsSqlInventoryInputList other = (BsSqlInventoryInputList)obj;
            if (!xSV(_inventoryBId, other._inventoryBId)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_inventoryInstKbn, other._inventoryInstKbn)) { return false; }
            if (!xSV(_locationGrp, other._locationGrp)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
            if (!xSV(_instructionKey, other._instructionKey)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_lineBlock, other._lineBlock)) { return false; }
            if (!xSV(_directionalPiston, other._directionalPiston)) { return false; }
            if (!xSV(_sortingOrder, other._sortingOrder)) { return false; }
            if (!xSV(_sortingNumTimes, other._sortingNumTimes)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_firmTransportCd, other._firmTransportCd)) { return false; }
            if (!xSV(_unitNumBreakdown, other._unitNumBreakdown)) { return false; }
            if (!xSV(_chargeNum, other._chargeNum)) { return false; }
            if (!xSV(_allocNum, other._allocNum)) { return false; }
            if (!xSV(_moveNum, other._moveNum)) { return false; }
            if (!xSV(_inventoryBeforeBreakdown, other._inventoryBeforeBreakdown)) { return false; }
            if (!xSV(_inventoryNum, other._inventoryNum)) { return false; }
            if (!xSV(_inventoryNumOld, other._inventoryNumOld)) { return false; }
            if (!xSV(_inventoryItems, other._inventoryItems)) { return false; }
            if (!xSV(_differenceNum, other._differenceNum)) { return false; }
            if (!xSV(_differenceItems, other._differenceItems)) { return false; }
            if (!xSV(_noShippingFlg, other._noShippingFlg)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_pQty, other._pQty)) { return false; }
            if (!xSV(_unit1, other._unit1)) { return false; }
            if (!xSV(_unit2, other._unit2)) { return false; }
            if (!xSV(_usernum4, other._usernum4)) { return false; }
            if (!xSV(_inventoryParcent, other._inventoryParcent)) { return false; }
            if (!xSV(_inventoryInputFlg, other._inventoryInputFlg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBId);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _inventoryInstKbn);
        hs = xCH(hs, _locationGrp);
        hs = xCH(hs, _cggdid);
        hs = xCH(hs, _instructionKey);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _lineBlock);
        hs = xCH(hs, _directionalPiston);
        hs = xCH(hs, _sortingOrder);
        hs = xCH(hs, _sortingNumTimes);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _firmTransportCd);
        hs = xCH(hs, _unitNumBreakdown);
        hs = xCH(hs, _chargeNum);
        hs = xCH(hs, _allocNum);
        hs = xCH(hs, _moveNum);
        hs = xCH(hs, _inventoryBeforeBreakdown);
        hs = xCH(hs, _inventoryNum);
        hs = xCH(hs, _inventoryNumOld);
        hs = xCH(hs, _inventoryItems);
        hs = xCH(hs, _differenceNum);
        hs = xCH(hs, _differenceItems);
        hs = xCH(hs, _noShippingFlg);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _pQty);
        hs = xCH(hs, _unit1);
        hs = xCH(hs, _unit2);
        hs = xCH(hs, _usernum4);
        hs = xCH(hs, _inventoryParcent);
        hs = xCH(hs, _inventoryInputFlg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_inventoryInstKbn));
        sb.append(dm).append(xfND(_locationGrp));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_instructionKey));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_lineBlock));
        sb.append(dm).append(xfND(_directionalPiston));
        sb.append(dm).append(xfND(_sortingOrder));
        sb.append(dm).append(xfND(_sortingNumTimes));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_firmTransportCd));
        sb.append(dm).append(xfND(_unitNumBreakdown));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_inventoryBeforeBreakdown));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_inventoryNumOld));
        sb.append(dm).append(xfND(_inventoryItems));
        sb.append(dm).append(xfND(_differenceNum));
        sb.append(dm).append(xfND(_differenceItems));
        sb.append(dm).append(xfND(_noShippingFlg));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_pQty));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_usernum4));
        sb.append(dm).append(xfND(_inventoryParcent));
        sb.append(dm).append(xfND(_inventoryInputFlg));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlInventoryInputList clone() {
        return (SqlInventoryInputList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {bigint(19)} <br>
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] INVENTORY_INST_KBN: {varchar(100)} <br>
     * @return The value of the column 'INVENTORY_INST_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInstKbn() {
        checkSpecifiedProperty("inventoryInstKbn");
        return convertEmptyToNull(_inventoryInstKbn);
    }

    /**
     * [set] INVENTORY_INST_KBN: {varchar(100)} <br>
     * @param inventoryInstKbn The value of the column 'INVENTORY_INST_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInstKbn(String inventoryInstKbn) {
        registerModifiedProperty("inventoryInstKbn");
        _inventoryInstKbn = inventoryInstKbn;
    }

    /**
     * [get] LOCATION_GRP: {varchar(100)} <br>
     * @return The value of the column 'LOCATION_GRP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationGrp() {
        checkSpecifiedProperty("locationGrp");
        return convertEmptyToNull(_locationGrp);
    }

    /**
     * [set] LOCATION_GRP: {varchar(100)} <br>
     * @param locationGrp The value of the column 'LOCATION_GRP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationGrp(String locationGrp) {
        registerModifiedProperty("locationGrp");
        _locationGrp = locationGrp;
    }

    /**
     * [get] CGGDID: {varchar(100)} <br>
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(100)} <br>
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] INSTRUCTION_KEY: {bigint(19)} <br>
     * @return The value of the column 'INSTRUCTION_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInstructionKey() {
        checkSpecifiedProperty("instructionKey");
        return _instructionKey;
    }

    /**
     * [set] INSTRUCTION_KEY: {bigint(19)} <br>
     * @param instructionKey The value of the column 'INSTRUCTION_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInstructionKey(Long instructionKey) {
        registerModifiedProperty("instructionKey");
        _instructionKey = instructionKey;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] LINE_BLOCK: {varchar(30)} <br>
     * @return The value of the column 'LINE_BLOCK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineBlock() {
        checkSpecifiedProperty("lineBlock");
        return convertEmptyToNull(_lineBlock);
    }

    /**
     * [set] LINE_BLOCK: {varchar(30)} <br>
     * @param lineBlock The value of the column 'LINE_BLOCK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineBlock(String lineBlock) {
        registerModifiedProperty("lineBlock");
        _lineBlock = lineBlock;
    }

    /**
     * [get] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @return The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectionalPiston() {
        checkSpecifiedProperty("directionalPiston");
        return convertEmptyToNull(_directionalPiston);
    }

    /**
     * [set] DIRECTIONAL_PISTON: {varchar(255)} <br>
     * @param directionalPiston The value of the column 'DIRECTIONAL_PISTON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectionalPiston(String directionalPiston) {
        registerModifiedProperty("directionalPiston");
        _directionalPiston = directionalPiston;
    }

    /**
     * [get] SORTING_ORDER: {varchar(255)} <br>
     * @return The value of the column 'SORTING_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public String getSortingOrder() {
        checkSpecifiedProperty("sortingOrder");
        return convertEmptyToNull(_sortingOrder);
    }

    /**
     * [set] SORTING_ORDER: {varchar(255)} <br>
     * @param sortingOrder The value of the column 'SORTING_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingOrder(String sortingOrder) {
        registerModifiedProperty("sortingOrder");
        _sortingOrder = sortingOrder;
    }

    /**
     * [get] SORTING_NUM_TIMES: {bigint(19)} <br>
     * @return The value of the column 'SORTING_NUM_TIMES'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortingNumTimes() {
        checkSpecifiedProperty("sortingNumTimes");
        return _sortingNumTimes;
    }

    /**
     * [set] SORTING_NUM_TIMES: {bigint(19)} <br>
     * @param sortingNumTimes The value of the column 'SORTING_NUM_TIMES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortingNumTimes(Long sortingNumTimes) {
        registerModifiedProperty("sortingNumTimes");
        _sortingNumTimes = sortingNumTimes;
    }

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] JAN_CD: {varchar(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {varchar(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] FIRM_TRANSPORT_CD: {varchar(30)} <br>
     * @return The value of the column 'FIRM_TRANSPORT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirmTransportCd() {
        checkSpecifiedProperty("firmTransportCd");
        return convertEmptyToNull(_firmTransportCd);
    }

    /**
     * [set] FIRM_TRANSPORT_CD: {varchar(30)} <br>
     * @param firmTransportCd The value of the column 'FIRM_TRANSPORT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirmTransportCd(String firmTransportCd) {
        registerModifiedProperty("firmTransportCd");
        _firmTransportCd = firmTransportCd;
    }

    /**
     * [get] UNIT_NUM_BREAKDOWN: {varchar(1)} <br>
     * @return The value of the column 'UNIT_NUM_BREAKDOWN'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNumBreakdown() {
        checkSpecifiedProperty("unitNumBreakdown");
        return convertEmptyToNull(_unitNumBreakdown);
    }

    /**
     * [set] UNIT_NUM_BREAKDOWN: {varchar(1)} <br>
     * @param unitNumBreakdown The value of the column 'UNIT_NUM_BREAKDOWN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNumBreakdown(String unitNumBreakdown) {
        registerModifiedProperty("unitNumBreakdown");
        _unitNumBreakdown = unitNumBreakdown;
    }

    /**
     * [get] CHARGE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {decimal(16, 6)} <br>
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'MOVE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {decimal(16, 6)} <br>
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
    }

    /**
     * [get] INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} <br>
     * @return The value of the column 'INVENTORY_BEFORE_BREAKDOWN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryBeforeBreakdown() {
        checkSpecifiedProperty("inventoryBeforeBreakdown");
        return convertEmptyToNull(_inventoryBeforeBreakdown);
    }

    /**
     * [set] INVENTORY_BEFORE_BREAKDOWN: {varchar(1)} <br>
     * @param inventoryBeforeBreakdown The value of the column 'INVENTORY_BEFORE_BREAKDOWN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBeforeBreakdown(String inventoryBeforeBreakdown) {
        registerModifiedProperty("inventoryBeforeBreakdown");
        _inventoryBeforeBreakdown = inventoryBeforeBreakdown;
    }

    /**
     * [get] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] INVENTORY_NUM_OLD: {decimal(16, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM_OLD'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNumOld() {
        checkSpecifiedProperty("inventoryNumOld");
        return _inventoryNumOld;
    }

    /**
     * [set] INVENTORY_NUM_OLD: {decimal(16, 6)} <br>
     * @param inventoryNumOld The value of the column 'INVENTORY_NUM_OLD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNumOld(java.math.BigDecimal inventoryNumOld) {
        registerModifiedProperty("inventoryNumOld");
        _inventoryNumOld = inventoryNumOld;
    }

    /**
     * [get] INVENTORY_ITEMS: {varchar(1)} <br>
     * @return The value of the column 'INVENTORY_ITEMS'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryItems() {
        checkSpecifiedProperty("inventoryItems");
        return convertEmptyToNull(_inventoryItems);
    }

    /**
     * [set] INVENTORY_ITEMS: {varchar(1)} <br>
     * @param inventoryItems The value of the column 'INVENTORY_ITEMS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryItems(String inventoryItems) {
        registerModifiedProperty("inventoryItems");
        _inventoryItems = inventoryItems;
    }

    /**
     * [get] DIFFERENCE_NUM: {varchar(1)} <br>
     * @return The value of the column 'DIFFERENCE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDifferenceNum() {
        checkSpecifiedProperty("differenceNum");
        return convertEmptyToNull(_differenceNum);
    }

    /**
     * [set] DIFFERENCE_NUM: {varchar(1)} <br>
     * @param differenceNum The value of the column 'DIFFERENCE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDifferenceNum(String differenceNum) {
        registerModifiedProperty("differenceNum");
        _differenceNum = differenceNum;
    }

    /**
     * [get] DIFFERENCE_ITEMS: {varchar(1)} <br>
     * @return The value of the column 'DIFFERENCE_ITEMS'. (NullAllowed even if selected: for no constraint)
     */
    public String getDifferenceItems() {
        checkSpecifiedProperty("differenceItems");
        return convertEmptyToNull(_differenceItems);
    }

    /**
     * [set] DIFFERENCE_ITEMS: {varchar(1)} <br>
     * @param differenceItems The value of the column 'DIFFERENCE_ITEMS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDifferenceItems(String differenceItems) {
        registerModifiedProperty("differenceItems");
        _differenceItems = differenceItems;
    }

    /**
     * [get] NO_SHIPPING_FLG: {char(1)} <br>
     * @return The value of the column 'NO_SHIPPING_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoShippingFlg() {
        checkSpecifiedProperty("noShippingFlg");
        return convertEmptyToNull(_noShippingFlg);
    }

    /**
     * [set] NO_SHIPPING_FLG: {char(1)} <br>
     * @param noShippingFlg The value of the column 'NO_SHIPPING_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoShippingFlg(String noShippingFlg) {
        registerModifiedProperty("noShippingFlg");
        _noShippingFlg = noShippingFlg;
    }

    /**
     * [get] UPD_DT: {nvarchar(4000)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdDt() {
        checkSpecifiedProperty("updDt");
        return convertEmptyToNull(_updDt);
    }

    /**
     * [set] UPD_DT: {nvarchar(4000)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(String updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {varchar(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterNm() {
        checkSpecifiedProperty("centerNm");
        return convertEmptyToNull(_centerNm);
    }

    /**
     * [set] CENTER_NM: {varchar(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterNm(String centerNm) {
        registerModifiedProperty("centerNm");
        _centerNm = centerNm;
    }

    /**
     * [get] P_QTY: {decimal(16, 6)} <br>
     * @return The value of the column 'P_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPQty() {
        checkSpecifiedProperty("PQty");
        return _pQty;
    }

    /**
     * [set] P_QTY: {decimal(16, 6)} <br>
     * @param pQty The value of the column 'P_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPQty(java.math.BigDecimal pQty) {
        registerModifiedProperty("PQty");
        _pQty = pQty;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit1() {
        checkSpecifiedProperty("unit1");
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum4() {
        checkSpecifiedProperty("usernum4");
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum4(Long usernum4) {
        registerModifiedProperty("usernum4");
        _usernum4 = usernum4;
    }

    /**
     * [get] INVENTORY_PARCENT: {int(10)} <br>
     * @return The value of the column 'INVENTORY_PARCENT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getInventoryParcent() {
        checkSpecifiedProperty("inventoryParcent");
        return _inventoryParcent;
    }

    /**
     * [set] INVENTORY_PARCENT: {int(10)} <br>
     * @param inventoryParcent The value of the column 'INVENTORY_PARCENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryParcent(Integer inventoryParcent) {
        registerModifiedProperty("inventoryParcent");
        _inventoryParcent = inventoryParcent;
    }

    /**
     * [get] INVENTORY_INPUT_FLG: {char(1)} <br>
     * @return The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryInputFlg() {
        checkSpecifiedProperty("inventoryInputFlg");
        return convertEmptyToNull(_inventoryInputFlg);
    }

    /**
     * [set] INVENTORY_INPUT_FLG: {char(1)} <br>
     * @param inventoryInputFlg The value of the column 'INVENTORY_INPUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryInputFlg(String inventoryInputFlg) {
        registerModifiedProperty("inventoryInputFlg");
        _inventoryInputFlg = inventoryInputFlg;
    }
}
