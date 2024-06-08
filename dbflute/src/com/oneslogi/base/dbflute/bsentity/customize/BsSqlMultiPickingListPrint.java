package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlMultiPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, WAREHOUSE_CD, WAREHOUSE_NM, EMERGENCY_FLG, PICKING_GROUP_NO, WORK_DT, CART_NO, LOCATION_CD, LOCATION_NM, PRODUCT_CD, PRODUCT_NM, JANCD, LOT, LIMT_DT, STORE_LABEL_NO, STORE_DT, BACKET_COL_NUM, BACKET_ROW_NUM, SUM_PICKING_NUM, PACKING_NUM_1_1, PACKING_NUM_1_2, PACKING_NUM_1_3, PACKING_NUM_1_4, PACKING_NUM_1_5, PACKING_NUM_1_6, PACKING_NUM_2_1, PACKING_NUM_2_2, PACKING_NUM_2_3, PACKING_NUM_2_4, PACKING_NUM_2_5, PACKING_NUM_2_6, PACKING_NUM_3_1, PACKING_NUM_3_2, PACKING_NUM_3_3, PACKING_NUM_3_4, PACKING_NUM_3_5, PACKING_NUM_3_6, PACKING_NUM_4_1, PACKING_NUM_4_2, PACKING_NUM_4_3, PACKING_NUM_4_4, PACKING_NUM_4_5, PACKING_NUM_4_6, PACKING_NUM_5_1, PACKING_NUM_5_2, PACKING_NUM_5_3, PACKING_NUM_5_4, PACKING_NUM_5_5, PACKING_NUM_5_6, PACKING_NUM_6_1, PACKING_NUM_6_2, PACKING_NUM_6_3, PACKING_NUM_6_4, PACKING_NUM_6_5, PACKING_NUM_6_6, MLT_OUT_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * String warehouseCd = entity.getWarehouseCd();
 * String warehouseNm = entity.getWarehouseNm();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String pickingGroupNo = entity.getPickingGroupNo();
 * String workDt = entity.getWorkDt();
 * Long cartNo = entity.getCartNo();
 * String locationCd = entity.getLocationCd();
 * String locationNm = entity.getLocationNm();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String jancd = entity.getJancd();
 * String lot = entity.getLot();
 * String limtDt = entity.getLimtDt();
 * String storeLabelNo = entity.getStoreLabelNo();
 * String storeDt = entity.getStoreDt();
 * Long backetColNum = entity.getBacketColNum();
 * Long backetRowNum = entity.getBacketRowNum();
 * java.math.BigDecimal sumPickingNum = entity.getSumPickingNum();
 * java.math.BigDecimal packingNum11 = entity.getPackingNum11();
 * java.math.BigDecimal packingNum12 = entity.getPackingNum12();
 * java.math.BigDecimal packingNum13 = entity.getPackingNum13();
 * java.math.BigDecimal packingNum14 = entity.getPackingNum14();
 * java.math.BigDecimal packingNum15 = entity.getPackingNum15();
 * java.math.BigDecimal packingNum16 = entity.getPackingNum16();
 * java.math.BigDecimal packingNum21 = entity.getPackingNum21();
 * java.math.BigDecimal packingNum22 = entity.getPackingNum22();
 * java.math.BigDecimal packingNum23 = entity.getPackingNum23();
 * java.math.BigDecimal packingNum24 = entity.getPackingNum24();
 * java.math.BigDecimal packingNum25 = entity.getPackingNum25();
 * java.math.BigDecimal packingNum26 = entity.getPackingNum26();
 * java.math.BigDecimal packingNum31 = entity.getPackingNum31();
 * java.math.BigDecimal packingNum32 = entity.getPackingNum32();
 * java.math.BigDecimal packingNum33 = entity.getPackingNum33();
 * java.math.BigDecimal packingNum34 = entity.getPackingNum34();
 * java.math.BigDecimal packingNum35 = entity.getPackingNum35();
 * java.math.BigDecimal packingNum36 = entity.getPackingNum36();
 * java.math.BigDecimal packingNum41 = entity.getPackingNum41();
 * java.math.BigDecimal packingNum42 = entity.getPackingNum42();
 * java.math.BigDecimal packingNum43 = entity.getPackingNum43();
 * java.math.BigDecimal packingNum44 = entity.getPackingNum44();
 * java.math.BigDecimal packingNum45 = entity.getPackingNum45();
 * java.math.BigDecimal packingNum46 = entity.getPackingNum46();
 * java.math.BigDecimal packingNum51 = entity.getPackingNum51();
 * java.math.BigDecimal packingNum52 = entity.getPackingNum52();
 * java.math.BigDecimal packingNum53 = entity.getPackingNum53();
 * java.math.BigDecimal packingNum54 = entity.getPackingNum54();
 * java.math.BigDecimal packingNum55 = entity.getPackingNum55();
 * java.math.BigDecimal packingNum56 = entity.getPackingNum56();
 * java.math.BigDecimal packingNum61 = entity.getPackingNum61();
 * java.math.BigDecimal packingNum62 = entity.getPackingNum62();
 * java.math.BigDecimal packingNum63 = entity.getPackingNum63();
 * java.math.BigDecimal packingNum64 = entity.getPackingNum64();
 * java.math.BigDecimal packingNum65 = entity.getPackingNum65();
 * java.math.BigDecimal packingNum66 = entity.getPackingNum66();
 * String mltOutFlg = entity.getMltOutFlg();
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setWarehouseNm(warehouseNm);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setPickingGroupNo(pickingGroupNo);
 * entity.setWorkDt(workDt);
 * entity.setCartNo(cartNo);
 * entity.setLocationCd(locationCd);
 * entity.setLocationNm(locationNm);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setJancd(jancd);
 * entity.setLot(lot);
 * entity.setLimtDt(limtDt);
 * entity.setStoreLabelNo(storeLabelNo);
 * entity.setStoreDt(storeDt);
 * entity.setBacketColNum(backetColNum);
 * entity.setBacketRowNum(backetRowNum);
 * entity.setSumPickingNum(sumPickingNum);
 * entity.setPackingNum11(packingNum11);
 * entity.setPackingNum12(packingNum12);
 * entity.setPackingNum13(packingNum13);
 * entity.setPackingNum14(packingNum14);
 * entity.setPackingNum15(packingNum15);
 * entity.setPackingNum16(packingNum16);
 * entity.setPackingNum21(packingNum21);
 * entity.setPackingNum22(packingNum22);
 * entity.setPackingNum23(packingNum23);
 * entity.setPackingNum24(packingNum24);
 * entity.setPackingNum25(packingNum25);
 * entity.setPackingNum26(packingNum26);
 * entity.setPackingNum31(packingNum31);
 * entity.setPackingNum32(packingNum32);
 * entity.setPackingNum33(packingNum33);
 * entity.setPackingNum34(packingNum34);
 * entity.setPackingNum35(packingNum35);
 * entity.setPackingNum36(packingNum36);
 * entity.setPackingNum41(packingNum41);
 * entity.setPackingNum42(packingNum42);
 * entity.setPackingNum43(packingNum43);
 * entity.setPackingNum44(packingNum44);
 * entity.setPackingNum45(packingNum45);
 * entity.setPackingNum46(packingNum46);
 * entity.setPackingNum51(packingNum51);
 * entity.setPackingNum52(packingNum52);
 * entity.setPackingNum53(packingNum53);
 * entity.setPackingNum54(packingNum54);
 * entity.setPackingNum55(packingNum55);
 * entity.setPackingNum56(packingNum56);
 * entity.setPackingNum61(packingNum61);
 * entity.setPackingNum62(packingNum62);
 * entity.setPackingNum63(packingNum63);
 * entity.setPackingNum64(packingNum64);
 * entity.setPackingNum65(packingNum65);
 * entity.setPackingNum66(packingNum66);
 * entity.setMltOutFlg(mltOutFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlMultiPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    /** WAREHOUSE_CD: {varchar(30)} */
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {varchar(60)} */
    protected String _warehouseNm;

    /** EMERGENCY_FLG: {varchar(1)} */
    protected String _emergencyFlg;

    /** PICKING_GROUP_NO: {varchar(30)} */
    protected String _pickingGroupNo;

    /** WORK_DT: {varchar(8)} */
    protected String _workDt;

    /** CART_NO: {bigint(19)} */
    protected Long _cartNo;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LOCATION_NM: {varchar(60)} */
    protected String _locationNm;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(60)} */
    protected String _productNm;

    /** JANCD: {varchar(30)} */
    protected String _jancd;

    /** LOT: {varchar(30)} */
    protected String _lot;

    /** LIMT_DT: {varchar(8)} */
    protected String _limtDt;

    /** STORE_LABEL_NO: {varchar(30)} */
    protected String _storeLabelNo;

    /** STORE_DT: {varchar(8)} */
    protected String _storeDt;

    /** BACKET_COL_NUM: {bigint(19)} */
    protected Long _backetColNum;

    /** BACKET_ROW_NUM: {bigint(19)} */
    protected Long _backetRowNum;

    /** SUM_PICKING_NUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _sumPickingNum;

    /** PACKING_NUM_1_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum11;

    /** PACKING_NUM_1_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum12;

    /** PACKING_NUM_1_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum13;

    /** PACKING_NUM_1_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum14;

    /** PACKING_NUM_1_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum15;

    /** PACKING_NUM_1_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum16;

    /** PACKING_NUM_2_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum21;

    /** PACKING_NUM_2_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum22;

    /** PACKING_NUM_2_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum23;

    /** PACKING_NUM_2_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum24;

    /** PACKING_NUM_2_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum25;

    /** PACKING_NUM_2_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum26;

    /** PACKING_NUM_3_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum31;

    /** PACKING_NUM_3_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum32;

    /** PACKING_NUM_3_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum33;

    /** PACKING_NUM_3_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum34;

    /** PACKING_NUM_3_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum35;

    /** PACKING_NUM_3_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum36;

    /** PACKING_NUM_4_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum41;

    /** PACKING_NUM_4_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum42;

    /** PACKING_NUM_4_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum43;

    /** PACKING_NUM_4_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum44;

    /** PACKING_NUM_4_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum45;

    /** PACKING_NUM_4_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum46;

    /** PACKING_NUM_5_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum51;

    /** PACKING_NUM_5_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum52;

    /** PACKING_NUM_5_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum53;

    /** PACKING_NUM_5_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum54;

    /** PACKING_NUM_5_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum55;

    /** PACKING_NUM_5_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum56;

    /** PACKING_NUM_6_1: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum61;

    /** PACKING_NUM_6_2: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum62;

    /** PACKING_NUM_6_3: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum63;

    /** PACKING_NUM_6_4: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum64;

    /** PACKING_NUM_6_5: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum65;

    /** PACKING_NUM_6_6: {decimal(38, 6)} */
    protected java.math.BigDecimal _packingNum66;

    /** MLT_OUT_FLG: {char(1), classification=ListOutFlg} */
    protected String _mltOutFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlMultiPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlMultiPickingListPrint";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mltOutFlg as the classification of ListOutFlg. <br>
     * MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ListOutFlg getMltOutFlgAsListOutFlg() {
        return CDef.ListOutFlg.codeOf(getMltOutFlg());
    }

    /**
     * Set the value of mltOutFlg as the classification of ListOutFlg. <br>
     * MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMltOutFlgAsListOutFlg(CDef.ListOutFlg cdef) {
        setMltOutFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mltOutFlg as $0 (0). <br>
     * $0: 未発行
     */
    public void setMltOutFlg_$0() {
        setMltOutFlgAsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Set the value of mltOutFlg as $1 (1). <br>
     * $1: 発行済
     */
    public void setMltOutFlg_$1() {
        setMltOutFlgAsListOutFlg(CDef.ListOutFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mltOutFlg $0? <br>
     * $0: 未発行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMltOutFlg$0() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$0) : false;
    }

    /**
     * Is the value of mltOutFlg $1? <br>
     * $1: 発行済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMltOutFlg$1() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.equals(CDef.ListOutFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'mltOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMltOutFlgName() {
        CDef.ListOutFlg cdef = getMltOutFlgAsListOutFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlMultiPickingListPrint) {
            BsSqlMultiPickingListPrint other = (BsSqlMultiPickingListPrint)obj;
            if (!xSV(_clientCd, other._clientCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_warehouseCd, other._warehouseCd)) { return false; }
            if (!xSV(_warehouseNm, other._warehouseNm)) { return false; }
            if (!xSV(_emergencyFlg, other._emergencyFlg)) { return false; }
            if (!xSV(_pickingGroupNo, other._pickingGroupNo)) { return false; }
            if (!xSV(_workDt, other._workDt)) { return false; }
            if (!xSV(_cartNo, other._cartNo)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_locationNm, other._locationNm)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_jancd, other._jancd)) { return false; }
            if (!xSV(_lot, other._lot)) { return false; }
            if (!xSV(_limtDt, other._limtDt)) { return false; }
            if (!xSV(_storeLabelNo, other._storeLabelNo)) { return false; }
            if (!xSV(_storeDt, other._storeDt)) { return false; }
            if (!xSV(_backetColNum, other._backetColNum)) { return false; }
            if (!xSV(_backetRowNum, other._backetRowNum)) { return false; }
            if (!xSV(_sumPickingNum, other._sumPickingNum)) { return false; }
            if (!xSV(_packingNum11, other._packingNum11)) { return false; }
            if (!xSV(_packingNum12, other._packingNum12)) { return false; }
            if (!xSV(_packingNum13, other._packingNum13)) { return false; }
            if (!xSV(_packingNum14, other._packingNum14)) { return false; }
            if (!xSV(_packingNum15, other._packingNum15)) { return false; }
            if (!xSV(_packingNum16, other._packingNum16)) { return false; }
            if (!xSV(_packingNum21, other._packingNum21)) { return false; }
            if (!xSV(_packingNum22, other._packingNum22)) { return false; }
            if (!xSV(_packingNum23, other._packingNum23)) { return false; }
            if (!xSV(_packingNum24, other._packingNum24)) { return false; }
            if (!xSV(_packingNum25, other._packingNum25)) { return false; }
            if (!xSV(_packingNum26, other._packingNum26)) { return false; }
            if (!xSV(_packingNum31, other._packingNum31)) { return false; }
            if (!xSV(_packingNum32, other._packingNum32)) { return false; }
            if (!xSV(_packingNum33, other._packingNum33)) { return false; }
            if (!xSV(_packingNum34, other._packingNum34)) { return false; }
            if (!xSV(_packingNum35, other._packingNum35)) { return false; }
            if (!xSV(_packingNum36, other._packingNum36)) { return false; }
            if (!xSV(_packingNum41, other._packingNum41)) { return false; }
            if (!xSV(_packingNum42, other._packingNum42)) { return false; }
            if (!xSV(_packingNum43, other._packingNum43)) { return false; }
            if (!xSV(_packingNum44, other._packingNum44)) { return false; }
            if (!xSV(_packingNum45, other._packingNum45)) { return false; }
            if (!xSV(_packingNum46, other._packingNum46)) { return false; }
            if (!xSV(_packingNum51, other._packingNum51)) { return false; }
            if (!xSV(_packingNum52, other._packingNum52)) { return false; }
            if (!xSV(_packingNum53, other._packingNum53)) { return false; }
            if (!xSV(_packingNum54, other._packingNum54)) { return false; }
            if (!xSV(_packingNum55, other._packingNum55)) { return false; }
            if (!xSV(_packingNum56, other._packingNum56)) { return false; }
            if (!xSV(_packingNum61, other._packingNum61)) { return false; }
            if (!xSV(_packingNum62, other._packingNum62)) { return false; }
            if (!xSV(_packingNum63, other._packingNum63)) { return false; }
            if (!xSV(_packingNum64, other._packingNum64)) { return false; }
            if (!xSV(_packingNum65, other._packingNum65)) { return false; }
            if (!xSV(_packingNum66, other._packingNum66)) { return false; }
            if (!xSV(_mltOutFlg, other._mltOutFlg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _warehouseCd);
        hs = xCH(hs, _warehouseNm);
        hs = xCH(hs, _emergencyFlg);
        hs = xCH(hs, _pickingGroupNo);
        hs = xCH(hs, _workDt);
        hs = xCH(hs, _cartNo);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _locationNm);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _jancd);
        hs = xCH(hs, _lot);
        hs = xCH(hs, _limtDt);
        hs = xCH(hs, _storeLabelNo);
        hs = xCH(hs, _storeDt);
        hs = xCH(hs, _backetColNum);
        hs = xCH(hs, _backetRowNum);
        hs = xCH(hs, _sumPickingNum);
        hs = xCH(hs, _packingNum11);
        hs = xCH(hs, _packingNum12);
        hs = xCH(hs, _packingNum13);
        hs = xCH(hs, _packingNum14);
        hs = xCH(hs, _packingNum15);
        hs = xCH(hs, _packingNum16);
        hs = xCH(hs, _packingNum21);
        hs = xCH(hs, _packingNum22);
        hs = xCH(hs, _packingNum23);
        hs = xCH(hs, _packingNum24);
        hs = xCH(hs, _packingNum25);
        hs = xCH(hs, _packingNum26);
        hs = xCH(hs, _packingNum31);
        hs = xCH(hs, _packingNum32);
        hs = xCH(hs, _packingNum33);
        hs = xCH(hs, _packingNum34);
        hs = xCH(hs, _packingNum35);
        hs = xCH(hs, _packingNum36);
        hs = xCH(hs, _packingNum41);
        hs = xCH(hs, _packingNum42);
        hs = xCH(hs, _packingNum43);
        hs = xCH(hs, _packingNum44);
        hs = xCH(hs, _packingNum45);
        hs = xCH(hs, _packingNum46);
        hs = xCH(hs, _packingNum51);
        hs = xCH(hs, _packingNum52);
        hs = xCH(hs, _packingNum53);
        hs = xCH(hs, _packingNum54);
        hs = xCH(hs, _packingNum55);
        hs = xCH(hs, _packingNum56);
        hs = xCH(hs, _packingNum61);
        hs = xCH(hs, _packingNum62);
        hs = xCH(hs, _packingNum63);
        hs = xCH(hs, _packingNum64);
        hs = xCH(hs, _packingNum65);
        hs = xCH(hs, _packingNum66);
        hs = xCH(hs, _mltOutFlg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_warehouseNm));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_pickingGroupNo));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_cartNo));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_locationNm));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_jancd));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limtDt));
        sb.append(dm).append(xfND(_storeLabelNo));
        sb.append(dm).append(xfND(_storeDt));
        sb.append(dm).append(xfND(_backetColNum));
        sb.append(dm).append(xfND(_backetRowNum));
        sb.append(dm).append(xfND(_sumPickingNum));
        sb.append(dm).append(xfND(_packingNum11));
        sb.append(dm).append(xfND(_packingNum12));
        sb.append(dm).append(xfND(_packingNum13));
        sb.append(dm).append(xfND(_packingNum14));
        sb.append(dm).append(xfND(_packingNum15));
        sb.append(dm).append(xfND(_packingNum16));
        sb.append(dm).append(xfND(_packingNum21));
        sb.append(dm).append(xfND(_packingNum22));
        sb.append(dm).append(xfND(_packingNum23));
        sb.append(dm).append(xfND(_packingNum24));
        sb.append(dm).append(xfND(_packingNum25));
        sb.append(dm).append(xfND(_packingNum26));
        sb.append(dm).append(xfND(_packingNum31));
        sb.append(dm).append(xfND(_packingNum32));
        sb.append(dm).append(xfND(_packingNum33));
        sb.append(dm).append(xfND(_packingNum34));
        sb.append(dm).append(xfND(_packingNum35));
        sb.append(dm).append(xfND(_packingNum36));
        sb.append(dm).append(xfND(_packingNum41));
        sb.append(dm).append(xfND(_packingNum42));
        sb.append(dm).append(xfND(_packingNum43));
        sb.append(dm).append(xfND(_packingNum44));
        sb.append(dm).append(xfND(_packingNum45));
        sb.append(dm).append(xfND(_packingNum46));
        sb.append(dm).append(xfND(_packingNum51));
        sb.append(dm).append(xfND(_packingNum52));
        sb.append(dm).append(xfND(_packingNum53));
        sb.append(dm).append(xfND(_packingNum54));
        sb.append(dm).append(xfND(_packingNum55));
        sb.append(dm).append(xfND(_packingNum56));
        sb.append(dm).append(xfND(_packingNum61));
        sb.append(dm).append(xfND(_packingNum62));
        sb.append(dm).append(xfND(_packingNum63));
        sb.append(dm).append(xfND(_packingNum64));
        sb.append(dm).append(xfND(_packingNum65));
        sb.append(dm).append(xfND(_packingNum66));
        sb.append(dm).append(xfND(_mltOutFlg));
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
    public SqlMultiPickingListPrint clone() {
        return (SqlMultiPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseNm() {
        checkSpecifiedProperty("warehouseNm");
        return convertEmptyToNull(_warehouseNm);
    }

    /**
     * [set] WAREHOUSE_NM: {varchar(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseNm(String warehouseNm) {
        registerModifiedProperty("warehouseNm");
        _warehouseNm = warehouseNm;
    }

    /**
     * [get] EMERGENCY_FLG: {varchar(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {varchar(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_GROUP_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingGroupNo() {
        checkSpecifiedProperty("pickingGroupNo");
        return convertEmptyToNull(_pickingGroupNo);
    }

    /**
     * [set] PICKING_GROUP_NO: {varchar(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        registerModifiedProperty("pickingGroupNo");
        _pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] WORK_DT: {varchar(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {varchar(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] CART_NO: {bigint(19)} <br>
     * @return The value of the column 'CART_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCartNo() {
        checkSpecifiedProperty("cartNo");
        return _cartNo;
    }

    /**
     * [set] CART_NO: {bigint(19)} <br>
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCartNo(Long cartNo) {
        registerModifiedProperty("cartNo");
        _cartNo = cartNo;
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
     * [get] LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationNm() {
        checkSpecifiedProperty("locationNm");
        return convertEmptyToNull(_locationNm);
    }

    /**
     * [set] LOCATION_NM: {varchar(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationNm(String locationNm) {
        registerModifiedProperty("locationNm");
        _locationNm = locationNm;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {varchar(60)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(60)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] JANCD: {varchar(30)} <br>
     * @return The value of the column 'JANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJancd() {
        checkSpecifiedProperty("jancd");
        return convertEmptyToNull(_jancd);
    }

    /**
     * [set] JANCD: {varchar(30)} <br>
     * @param jancd The value of the column 'JANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJancd(String jancd) {
        registerModifiedProperty("jancd");
        _jancd = jancd;
    }

    /**
     * [get] LOT: {varchar(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {varchar(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMT_DT: {varchar(8)} <br>
     * @return The value of the column 'LIMT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimtDt() {
        checkSpecifiedProperty("limtDt");
        return convertEmptyToNull(_limtDt);
    }

    /**
     * [set] LIMT_DT: {varchar(8)} <br>
     * @param limtDt The value of the column 'LIMT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimtDt(String limtDt) {
        registerModifiedProperty("limtDt");
        _limtDt = limtDt;
    }

    /**
     * [get] STORE_LABEL_NO: {varchar(30)} <br>
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreLabelNo() {
        checkSpecifiedProperty("storeLabelNo");
        return convertEmptyToNull(_storeLabelNo);
    }

    /**
     * [set] STORE_LABEL_NO: {varchar(30)} <br>
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        registerModifiedProperty("storeLabelNo");
        _storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {varchar(8)} <br>
     * @return The value of the column 'STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDt() {
        checkSpecifiedProperty("storeDt");
        return convertEmptyToNull(_storeDt);
    }

    /**
     * [set] STORE_DT: {varchar(8)} <br>
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDt(String storeDt) {
        registerModifiedProperty("storeDt");
        _storeDt = storeDt;
    }

    /**
     * [get] BACKET_COL_NUM: {bigint(19)} <br>
     * @return The value of the column 'BACKET_COL_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBacketColNum() {
        checkSpecifiedProperty("backetColNum");
        return _backetColNum;
    }

    /**
     * [set] BACKET_COL_NUM: {bigint(19)} <br>
     * @param backetColNum The value of the column 'BACKET_COL_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBacketColNum(Long backetColNum) {
        registerModifiedProperty("backetColNum");
        _backetColNum = backetColNum;
    }

    /**
     * [get] BACKET_ROW_NUM: {bigint(19)} <br>
     * @return The value of the column 'BACKET_ROW_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBacketRowNum() {
        checkSpecifiedProperty("backetRowNum");
        return _backetRowNum;
    }

    /**
     * [set] BACKET_ROW_NUM: {bigint(19)} <br>
     * @param backetRowNum The value of the column 'BACKET_ROW_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBacketRowNum(Long backetRowNum) {
        registerModifiedProperty("backetRowNum");
        _backetRowNum = backetRowNum;
    }

    /**
     * [get] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @return The value of the column 'SUM_PICKING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSumPickingNum() {
        checkSpecifiedProperty("sumPickingNum");
        return _sumPickingNum;
    }

    /**
     * [set] SUM_PICKING_NUM: {decimal(38, 6)} <br>
     * @param sumPickingNum The value of the column 'SUM_PICKING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSumPickingNum(java.math.BigDecimal sumPickingNum) {
        registerModifiedProperty("sumPickingNum");
        _sumPickingNum = sumPickingNum;
    }

    /**
     * [get] PACKING_NUM_1_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum11() {
        checkSpecifiedProperty("packingNum11");
        return _packingNum11;
    }

    /**
     * [set] PACKING_NUM_1_1: {decimal(38, 6)} <br>
     * @param packingNum11 The value of the column 'PACKING_NUM_1_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum11(java.math.BigDecimal packingNum11) {
        registerModifiedProperty("packingNum11");
        _packingNum11 = packingNum11;
    }

    /**
     * [get] PACKING_NUM_1_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum12() {
        checkSpecifiedProperty("packingNum12");
        return _packingNum12;
    }

    /**
     * [set] PACKING_NUM_1_2: {decimal(38, 6)} <br>
     * @param packingNum12 The value of the column 'PACKING_NUM_1_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum12(java.math.BigDecimal packingNum12) {
        registerModifiedProperty("packingNum12");
        _packingNum12 = packingNum12;
    }

    /**
     * [get] PACKING_NUM_1_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum13() {
        checkSpecifiedProperty("packingNum13");
        return _packingNum13;
    }

    /**
     * [set] PACKING_NUM_1_3: {decimal(38, 6)} <br>
     * @param packingNum13 The value of the column 'PACKING_NUM_1_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum13(java.math.BigDecimal packingNum13) {
        registerModifiedProperty("packingNum13");
        _packingNum13 = packingNum13;
    }

    /**
     * [get] PACKING_NUM_1_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum14() {
        checkSpecifiedProperty("packingNum14");
        return _packingNum14;
    }

    /**
     * [set] PACKING_NUM_1_4: {decimal(38, 6)} <br>
     * @param packingNum14 The value of the column 'PACKING_NUM_1_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum14(java.math.BigDecimal packingNum14) {
        registerModifiedProperty("packingNum14");
        _packingNum14 = packingNum14;
    }

    /**
     * [get] PACKING_NUM_1_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum15() {
        checkSpecifiedProperty("packingNum15");
        return _packingNum15;
    }

    /**
     * [set] PACKING_NUM_1_5: {decimal(38, 6)} <br>
     * @param packingNum15 The value of the column 'PACKING_NUM_1_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum15(java.math.BigDecimal packingNum15) {
        registerModifiedProperty("packingNum15");
        _packingNum15 = packingNum15;
    }

    /**
     * [get] PACKING_NUM_1_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_1_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum16() {
        checkSpecifiedProperty("packingNum16");
        return _packingNum16;
    }

    /**
     * [set] PACKING_NUM_1_6: {decimal(38, 6)} <br>
     * @param packingNum16 The value of the column 'PACKING_NUM_1_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum16(java.math.BigDecimal packingNum16) {
        registerModifiedProperty("packingNum16");
        _packingNum16 = packingNum16;
    }

    /**
     * [get] PACKING_NUM_2_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum21() {
        checkSpecifiedProperty("packingNum21");
        return _packingNum21;
    }

    /**
     * [set] PACKING_NUM_2_1: {decimal(38, 6)} <br>
     * @param packingNum21 The value of the column 'PACKING_NUM_2_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum21(java.math.BigDecimal packingNum21) {
        registerModifiedProperty("packingNum21");
        _packingNum21 = packingNum21;
    }

    /**
     * [get] PACKING_NUM_2_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum22() {
        checkSpecifiedProperty("packingNum22");
        return _packingNum22;
    }

    /**
     * [set] PACKING_NUM_2_2: {decimal(38, 6)} <br>
     * @param packingNum22 The value of the column 'PACKING_NUM_2_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum22(java.math.BigDecimal packingNum22) {
        registerModifiedProperty("packingNum22");
        _packingNum22 = packingNum22;
    }

    /**
     * [get] PACKING_NUM_2_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum23() {
        checkSpecifiedProperty("packingNum23");
        return _packingNum23;
    }

    /**
     * [set] PACKING_NUM_2_3: {decimal(38, 6)} <br>
     * @param packingNum23 The value of the column 'PACKING_NUM_2_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum23(java.math.BigDecimal packingNum23) {
        registerModifiedProperty("packingNum23");
        _packingNum23 = packingNum23;
    }

    /**
     * [get] PACKING_NUM_2_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum24() {
        checkSpecifiedProperty("packingNum24");
        return _packingNum24;
    }

    /**
     * [set] PACKING_NUM_2_4: {decimal(38, 6)} <br>
     * @param packingNum24 The value of the column 'PACKING_NUM_2_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum24(java.math.BigDecimal packingNum24) {
        registerModifiedProperty("packingNum24");
        _packingNum24 = packingNum24;
    }

    /**
     * [get] PACKING_NUM_2_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum25() {
        checkSpecifiedProperty("packingNum25");
        return _packingNum25;
    }

    /**
     * [set] PACKING_NUM_2_5: {decimal(38, 6)} <br>
     * @param packingNum25 The value of the column 'PACKING_NUM_2_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum25(java.math.BigDecimal packingNum25) {
        registerModifiedProperty("packingNum25");
        _packingNum25 = packingNum25;
    }

    /**
     * [get] PACKING_NUM_2_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_2_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum26() {
        checkSpecifiedProperty("packingNum26");
        return _packingNum26;
    }

    /**
     * [set] PACKING_NUM_2_6: {decimal(38, 6)} <br>
     * @param packingNum26 The value of the column 'PACKING_NUM_2_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum26(java.math.BigDecimal packingNum26) {
        registerModifiedProperty("packingNum26");
        _packingNum26 = packingNum26;
    }

    /**
     * [get] PACKING_NUM_3_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum31() {
        checkSpecifiedProperty("packingNum31");
        return _packingNum31;
    }

    /**
     * [set] PACKING_NUM_3_1: {decimal(38, 6)} <br>
     * @param packingNum31 The value of the column 'PACKING_NUM_3_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum31(java.math.BigDecimal packingNum31) {
        registerModifiedProperty("packingNum31");
        _packingNum31 = packingNum31;
    }

    /**
     * [get] PACKING_NUM_3_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum32() {
        checkSpecifiedProperty("packingNum32");
        return _packingNum32;
    }

    /**
     * [set] PACKING_NUM_3_2: {decimal(38, 6)} <br>
     * @param packingNum32 The value of the column 'PACKING_NUM_3_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum32(java.math.BigDecimal packingNum32) {
        registerModifiedProperty("packingNum32");
        _packingNum32 = packingNum32;
    }

    /**
     * [get] PACKING_NUM_3_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum33() {
        checkSpecifiedProperty("packingNum33");
        return _packingNum33;
    }

    /**
     * [set] PACKING_NUM_3_3: {decimal(38, 6)} <br>
     * @param packingNum33 The value of the column 'PACKING_NUM_3_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum33(java.math.BigDecimal packingNum33) {
        registerModifiedProperty("packingNum33");
        _packingNum33 = packingNum33;
    }

    /**
     * [get] PACKING_NUM_3_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum34() {
        checkSpecifiedProperty("packingNum34");
        return _packingNum34;
    }

    /**
     * [set] PACKING_NUM_3_4: {decimal(38, 6)} <br>
     * @param packingNum34 The value of the column 'PACKING_NUM_3_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum34(java.math.BigDecimal packingNum34) {
        registerModifiedProperty("packingNum34");
        _packingNum34 = packingNum34;
    }

    /**
     * [get] PACKING_NUM_3_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum35() {
        checkSpecifiedProperty("packingNum35");
        return _packingNum35;
    }

    /**
     * [set] PACKING_NUM_3_5: {decimal(38, 6)} <br>
     * @param packingNum35 The value of the column 'PACKING_NUM_3_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum35(java.math.BigDecimal packingNum35) {
        registerModifiedProperty("packingNum35");
        _packingNum35 = packingNum35;
    }

    /**
     * [get] PACKING_NUM_3_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_3_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum36() {
        checkSpecifiedProperty("packingNum36");
        return _packingNum36;
    }

    /**
     * [set] PACKING_NUM_3_6: {decimal(38, 6)} <br>
     * @param packingNum36 The value of the column 'PACKING_NUM_3_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum36(java.math.BigDecimal packingNum36) {
        registerModifiedProperty("packingNum36");
        _packingNum36 = packingNum36;
    }

    /**
     * [get] PACKING_NUM_4_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum41() {
        checkSpecifiedProperty("packingNum41");
        return _packingNum41;
    }

    /**
     * [set] PACKING_NUM_4_1: {decimal(38, 6)} <br>
     * @param packingNum41 The value of the column 'PACKING_NUM_4_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum41(java.math.BigDecimal packingNum41) {
        registerModifiedProperty("packingNum41");
        _packingNum41 = packingNum41;
    }

    /**
     * [get] PACKING_NUM_4_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum42() {
        checkSpecifiedProperty("packingNum42");
        return _packingNum42;
    }

    /**
     * [set] PACKING_NUM_4_2: {decimal(38, 6)} <br>
     * @param packingNum42 The value of the column 'PACKING_NUM_4_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum42(java.math.BigDecimal packingNum42) {
        registerModifiedProperty("packingNum42");
        _packingNum42 = packingNum42;
    }

    /**
     * [get] PACKING_NUM_4_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum43() {
        checkSpecifiedProperty("packingNum43");
        return _packingNum43;
    }

    /**
     * [set] PACKING_NUM_4_3: {decimal(38, 6)} <br>
     * @param packingNum43 The value of the column 'PACKING_NUM_4_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum43(java.math.BigDecimal packingNum43) {
        registerModifiedProperty("packingNum43");
        _packingNum43 = packingNum43;
    }

    /**
     * [get] PACKING_NUM_4_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum44() {
        checkSpecifiedProperty("packingNum44");
        return _packingNum44;
    }

    /**
     * [set] PACKING_NUM_4_4: {decimal(38, 6)} <br>
     * @param packingNum44 The value of the column 'PACKING_NUM_4_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum44(java.math.BigDecimal packingNum44) {
        registerModifiedProperty("packingNum44");
        _packingNum44 = packingNum44;
    }

    /**
     * [get] PACKING_NUM_4_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum45() {
        checkSpecifiedProperty("packingNum45");
        return _packingNum45;
    }

    /**
     * [set] PACKING_NUM_4_5: {decimal(38, 6)} <br>
     * @param packingNum45 The value of the column 'PACKING_NUM_4_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum45(java.math.BigDecimal packingNum45) {
        registerModifiedProperty("packingNum45");
        _packingNum45 = packingNum45;
    }

    /**
     * [get] PACKING_NUM_4_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_4_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum46() {
        checkSpecifiedProperty("packingNum46");
        return _packingNum46;
    }

    /**
     * [set] PACKING_NUM_4_6: {decimal(38, 6)} <br>
     * @param packingNum46 The value of the column 'PACKING_NUM_4_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum46(java.math.BigDecimal packingNum46) {
        registerModifiedProperty("packingNum46");
        _packingNum46 = packingNum46;
    }

    /**
     * [get] PACKING_NUM_5_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum51() {
        checkSpecifiedProperty("packingNum51");
        return _packingNum51;
    }

    /**
     * [set] PACKING_NUM_5_1: {decimal(38, 6)} <br>
     * @param packingNum51 The value of the column 'PACKING_NUM_5_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum51(java.math.BigDecimal packingNum51) {
        registerModifiedProperty("packingNum51");
        _packingNum51 = packingNum51;
    }

    /**
     * [get] PACKING_NUM_5_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum52() {
        checkSpecifiedProperty("packingNum52");
        return _packingNum52;
    }

    /**
     * [set] PACKING_NUM_5_2: {decimal(38, 6)} <br>
     * @param packingNum52 The value of the column 'PACKING_NUM_5_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum52(java.math.BigDecimal packingNum52) {
        registerModifiedProperty("packingNum52");
        _packingNum52 = packingNum52;
    }

    /**
     * [get] PACKING_NUM_5_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum53() {
        checkSpecifiedProperty("packingNum53");
        return _packingNum53;
    }

    /**
     * [set] PACKING_NUM_5_3: {decimal(38, 6)} <br>
     * @param packingNum53 The value of the column 'PACKING_NUM_5_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum53(java.math.BigDecimal packingNum53) {
        registerModifiedProperty("packingNum53");
        _packingNum53 = packingNum53;
    }

    /**
     * [get] PACKING_NUM_5_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum54() {
        checkSpecifiedProperty("packingNum54");
        return _packingNum54;
    }

    /**
     * [set] PACKING_NUM_5_4: {decimal(38, 6)} <br>
     * @param packingNum54 The value of the column 'PACKING_NUM_5_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum54(java.math.BigDecimal packingNum54) {
        registerModifiedProperty("packingNum54");
        _packingNum54 = packingNum54;
    }

    /**
     * [get] PACKING_NUM_5_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum55() {
        checkSpecifiedProperty("packingNum55");
        return _packingNum55;
    }

    /**
     * [set] PACKING_NUM_5_5: {decimal(38, 6)} <br>
     * @param packingNum55 The value of the column 'PACKING_NUM_5_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum55(java.math.BigDecimal packingNum55) {
        registerModifiedProperty("packingNum55");
        _packingNum55 = packingNum55;
    }

    /**
     * [get] PACKING_NUM_5_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_5_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum56() {
        checkSpecifiedProperty("packingNum56");
        return _packingNum56;
    }

    /**
     * [set] PACKING_NUM_5_6: {decimal(38, 6)} <br>
     * @param packingNum56 The value of the column 'PACKING_NUM_5_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum56(java.math.BigDecimal packingNum56) {
        registerModifiedProperty("packingNum56");
        _packingNum56 = packingNum56;
    }

    /**
     * [get] PACKING_NUM_6_1: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum61() {
        checkSpecifiedProperty("packingNum61");
        return _packingNum61;
    }

    /**
     * [set] PACKING_NUM_6_1: {decimal(38, 6)} <br>
     * @param packingNum61 The value of the column 'PACKING_NUM_6_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum61(java.math.BigDecimal packingNum61) {
        registerModifiedProperty("packingNum61");
        _packingNum61 = packingNum61;
    }

    /**
     * [get] PACKING_NUM_6_2: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum62() {
        checkSpecifiedProperty("packingNum62");
        return _packingNum62;
    }

    /**
     * [set] PACKING_NUM_6_2: {decimal(38, 6)} <br>
     * @param packingNum62 The value of the column 'PACKING_NUM_6_2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum62(java.math.BigDecimal packingNum62) {
        registerModifiedProperty("packingNum62");
        _packingNum62 = packingNum62;
    }

    /**
     * [get] PACKING_NUM_6_3: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum63() {
        checkSpecifiedProperty("packingNum63");
        return _packingNum63;
    }

    /**
     * [set] PACKING_NUM_6_3: {decimal(38, 6)} <br>
     * @param packingNum63 The value of the column 'PACKING_NUM_6_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum63(java.math.BigDecimal packingNum63) {
        registerModifiedProperty("packingNum63");
        _packingNum63 = packingNum63;
    }

    /**
     * [get] PACKING_NUM_6_4: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum64() {
        checkSpecifiedProperty("packingNum64");
        return _packingNum64;
    }

    /**
     * [set] PACKING_NUM_6_4: {decimal(38, 6)} <br>
     * @param packingNum64 The value of the column 'PACKING_NUM_6_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum64(java.math.BigDecimal packingNum64) {
        registerModifiedProperty("packingNum64");
        _packingNum64 = packingNum64;
    }

    /**
     * [get] PACKING_NUM_6_5: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum65() {
        checkSpecifiedProperty("packingNum65");
        return _packingNum65;
    }

    /**
     * [set] PACKING_NUM_6_5: {decimal(38, 6)} <br>
     * @param packingNum65 The value of the column 'PACKING_NUM_6_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum65(java.math.BigDecimal packingNum65) {
        registerModifiedProperty("packingNum65");
        _packingNum65 = packingNum65;
    }

    /**
     * [get] PACKING_NUM_6_6: {decimal(38, 6)} <br>
     * @return The value of the column 'PACKING_NUM_6_6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPackingNum66() {
        checkSpecifiedProperty("packingNum66");
        return _packingNum66;
    }

    /**
     * [set] PACKING_NUM_6_6: {decimal(38, 6)} <br>
     * @param packingNum66 The value of the column 'PACKING_NUM_6_6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingNum66(java.math.BigDecimal packingNum66) {
        registerModifiedProperty("packingNum66");
        _packingNum66 = packingNum66;
    }

    /**
     * [get] MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMltOutFlg() {
        checkSpecifiedProperty("mltOutFlg");
        return convertEmptyToNull(_mltOutFlg);
    }

    /**
     * [set] MLT_OUT_FLG: {char(1), classification=ListOutFlg} <br>
     * // cls(ListOutFlg)
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMltOutFlg(String mltOutFlg) {
        registerModifiedProperty("mltOutFlg");
        _mltOutFlg = mltOutFlg;
    }
}
