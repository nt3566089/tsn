package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlMultiPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMultiPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMultiPickingListPrintDbm _instance = new SqlMultiPickingListPrintDbm();
    private SqlMultiPickingListPrintDbm() {}
    public static SqlMultiPickingListPrintDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getClientCd(), (et, vl) -> ((SqlMultiPickingListPrint)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getClientNm(), (et, vl) -> ((SqlMultiPickingListPrint)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getWarehouseCd(), (et, vl) -> ((SqlMultiPickingListPrint)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getWarehouseNm(), (et, vl) -> ((SqlMultiPickingListPrint)et).setWarehouseNm((String)vl), "warehouseNm");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getEmergencyFlg(), (et, vl) -> ((SqlMultiPickingListPrint)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPickingGroupNo(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPickingGroupNo((String)vl), "pickingGroupNo");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlMultiPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getCartNo(), (et, vl) -> ((SqlMultiPickingListPrint)et).setCartNo(ctl(vl)), "cartNo");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getLocationCd(), (et, vl) -> ((SqlMultiPickingListPrint)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getLocationNm(), (et, vl) -> ((SqlMultiPickingListPrint)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getProductCd(), (et, vl) -> ((SqlMultiPickingListPrint)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getProductNm(), (et, vl) -> ((SqlMultiPickingListPrint)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getJancd(), (et, vl) -> ((SqlMultiPickingListPrint)et).setJancd((String)vl), "jancd");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getLot(), (et, vl) -> ((SqlMultiPickingListPrint)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getLimtDt(), (et, vl) -> ((SqlMultiPickingListPrint)et).setLimtDt((String)vl), "limtDt");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getStoreLabelNo(), (et, vl) -> ((SqlMultiPickingListPrint)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getStoreDt(), (et, vl) -> ((SqlMultiPickingListPrint)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getBacketColNum(), (et, vl) -> ((SqlMultiPickingListPrint)et).setBacketColNum(ctl(vl)), "backetColNum");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getBacketRowNum(), (et, vl) -> ((SqlMultiPickingListPrint)et).setBacketRowNum(ctl(vl)), "backetRowNum");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getSumPickingNum(), (et, vl) -> ((SqlMultiPickingListPrint)et).setSumPickingNum(ctb(vl)), "sumPickingNum");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum11(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum11(ctb(vl)), "packingNum11");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum12(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum12(ctb(vl)), "packingNum12");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum13(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum13(ctb(vl)), "packingNum13");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum14(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum14(ctb(vl)), "packingNum14");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum15(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum15(ctb(vl)), "packingNum15");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum16(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum16(ctb(vl)), "packingNum16");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum21(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum21(ctb(vl)), "packingNum21");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum22(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum22(ctb(vl)), "packingNum22");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum23(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum23(ctb(vl)), "packingNum23");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum24(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum24(ctb(vl)), "packingNum24");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum25(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum25(ctb(vl)), "packingNum25");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum26(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum26(ctb(vl)), "packingNum26");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum31(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum31(ctb(vl)), "packingNum31");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum32(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum32(ctb(vl)), "packingNum32");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum33(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum33(ctb(vl)), "packingNum33");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum34(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum34(ctb(vl)), "packingNum34");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum35(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum35(ctb(vl)), "packingNum35");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum36(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum36(ctb(vl)), "packingNum36");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum41(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum41(ctb(vl)), "packingNum41");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum42(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum42(ctb(vl)), "packingNum42");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum43(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum43(ctb(vl)), "packingNum43");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum44(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum44(ctb(vl)), "packingNum44");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum45(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum45(ctb(vl)), "packingNum45");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum46(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum46(ctb(vl)), "packingNum46");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum51(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum51(ctb(vl)), "packingNum51");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum52(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum52(ctb(vl)), "packingNum52");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum53(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum53(ctb(vl)), "packingNum53");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum54(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum54(ctb(vl)), "packingNum54");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum55(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum55(ctb(vl)), "packingNum55");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum56(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum56(ctb(vl)), "packingNum56");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum61(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum61(ctb(vl)), "packingNum61");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum62(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum62(ctb(vl)), "packingNum62");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum63(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum63(ctb(vl)), "packingNum63");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum64(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum64(ctb(vl)), "packingNum64");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum65(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum65(ctb(vl)), "packingNum65");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getPackingNum66(), (et, vl) -> ((SqlMultiPickingListPrint)et).setPackingNum66(ctb(vl)), "packingNum66");
        setupEpg(_epgMap, et -> ((SqlMultiPickingListPrint)et).getMltOutFlg(), (et, vl) -> ((SqlMultiPickingListPrint)et).setMltOutFlg((String)vl), "mltOutFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMultiPickingListPrint";
    protected final String _tableDispName = "SqlMultiPickingListPrint";
    protected final String _tablePropertyName = "sqlMultiPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMultiPickingListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseNm = cci("WAREHOUSE_NM", "WAREHOUSE_NM", null, null, String.class, "warehouseNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "varchar", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingGroupNo = cci("PICKING_GROUP_NO", "PICKING_GROUP_NO", null, null, String.class, "pickingGroupNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCartNo = cci("CART_NO", "CART_NO", null, null, Long.class, "cartNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJancd = cci("JANCD", "JANCD", null, null, String.class, "jancd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimtDt = cci("LIMT_DT", "LIMT_DT", null, null, String.class, "limtDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBacketColNum = cci("BACKET_COL_NUM", "BACKET_COL_NUM", null, null, Long.class, "backetColNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBacketRowNum = cci("BACKET_ROW_NUM", "BACKET_ROW_NUM", null, null, Long.class, "backetRowNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumPickingNum = cci("SUM_PICKING_NUM", "SUM_PICKING_NUM", null, null, java.math.BigDecimal.class, "sumPickingNum", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum11 = cci("PACKING_NUM_1_1", "PACKING_NUM_1_1", null, null, java.math.BigDecimal.class, "packingNum11", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum12 = cci("PACKING_NUM_1_2", "PACKING_NUM_1_2", null, null, java.math.BigDecimal.class, "packingNum12", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum13 = cci("PACKING_NUM_1_3", "PACKING_NUM_1_3", null, null, java.math.BigDecimal.class, "packingNum13", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum14 = cci("PACKING_NUM_1_4", "PACKING_NUM_1_4", null, null, java.math.BigDecimal.class, "packingNum14", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum15 = cci("PACKING_NUM_1_5", "PACKING_NUM_1_5", null, null, java.math.BigDecimal.class, "packingNum15", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum16 = cci("PACKING_NUM_1_6", "PACKING_NUM_1_6", null, null, java.math.BigDecimal.class, "packingNum16", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum21 = cci("PACKING_NUM_2_1", "PACKING_NUM_2_1", null, null, java.math.BigDecimal.class, "packingNum21", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum22 = cci("PACKING_NUM_2_2", "PACKING_NUM_2_2", null, null, java.math.BigDecimal.class, "packingNum22", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum23 = cci("PACKING_NUM_2_3", "PACKING_NUM_2_3", null, null, java.math.BigDecimal.class, "packingNum23", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum24 = cci("PACKING_NUM_2_4", "PACKING_NUM_2_4", null, null, java.math.BigDecimal.class, "packingNum24", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum25 = cci("PACKING_NUM_2_5", "PACKING_NUM_2_5", null, null, java.math.BigDecimal.class, "packingNum25", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum26 = cci("PACKING_NUM_2_6", "PACKING_NUM_2_6", null, null, java.math.BigDecimal.class, "packingNum26", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum31 = cci("PACKING_NUM_3_1", "PACKING_NUM_3_1", null, null, java.math.BigDecimal.class, "packingNum31", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum32 = cci("PACKING_NUM_3_2", "PACKING_NUM_3_2", null, null, java.math.BigDecimal.class, "packingNum32", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum33 = cci("PACKING_NUM_3_3", "PACKING_NUM_3_3", null, null, java.math.BigDecimal.class, "packingNum33", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum34 = cci("PACKING_NUM_3_4", "PACKING_NUM_3_4", null, null, java.math.BigDecimal.class, "packingNum34", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum35 = cci("PACKING_NUM_3_5", "PACKING_NUM_3_5", null, null, java.math.BigDecimal.class, "packingNum35", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum36 = cci("PACKING_NUM_3_6", "PACKING_NUM_3_6", null, null, java.math.BigDecimal.class, "packingNum36", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum41 = cci("PACKING_NUM_4_1", "PACKING_NUM_4_1", null, null, java.math.BigDecimal.class, "packingNum41", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum42 = cci("PACKING_NUM_4_2", "PACKING_NUM_4_2", null, null, java.math.BigDecimal.class, "packingNum42", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum43 = cci("PACKING_NUM_4_3", "PACKING_NUM_4_3", null, null, java.math.BigDecimal.class, "packingNum43", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum44 = cci("PACKING_NUM_4_4", "PACKING_NUM_4_4", null, null, java.math.BigDecimal.class, "packingNum44", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum45 = cci("PACKING_NUM_4_5", "PACKING_NUM_4_5", null, null, java.math.BigDecimal.class, "packingNum45", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum46 = cci("PACKING_NUM_4_6", "PACKING_NUM_4_6", null, null, java.math.BigDecimal.class, "packingNum46", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum51 = cci("PACKING_NUM_5_1", "PACKING_NUM_5_1", null, null, java.math.BigDecimal.class, "packingNum51", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum52 = cci("PACKING_NUM_5_2", "PACKING_NUM_5_2", null, null, java.math.BigDecimal.class, "packingNum52", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum53 = cci("PACKING_NUM_5_3", "PACKING_NUM_5_3", null, null, java.math.BigDecimal.class, "packingNum53", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum54 = cci("PACKING_NUM_5_4", "PACKING_NUM_5_4", null, null, java.math.BigDecimal.class, "packingNum54", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum55 = cci("PACKING_NUM_5_5", "PACKING_NUM_5_5", null, null, java.math.BigDecimal.class, "packingNum55", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum56 = cci("PACKING_NUM_5_6", "PACKING_NUM_5_6", null, null, java.math.BigDecimal.class, "packingNum56", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum61 = cci("PACKING_NUM_6_1", "PACKING_NUM_6_1", null, null, java.math.BigDecimal.class, "packingNum61", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum62 = cci("PACKING_NUM_6_2", "PACKING_NUM_6_2", null, null, java.math.BigDecimal.class, "packingNum62", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum63 = cci("PACKING_NUM_6_3", "PACKING_NUM_6_3", null, null, java.math.BigDecimal.class, "packingNum63", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum64 = cci("PACKING_NUM_6_4", "PACKING_NUM_6_4", null, null, java.math.BigDecimal.class, "packingNum64", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum65 = cci("PACKING_NUM_6_5", "PACKING_NUM_6_5", null, null, java.math.BigDecimal.class, "packingNum65", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum66 = cci("PACKING_NUM_6_6", "PACKING_NUM_6_6", null, null, java.math.BigDecimal.class, "packingNum66", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMltOutFlg = cci("MLT_OUT_FLG", "MLT_OUT_FLG", null, null, String.class, "mltOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.ListOutFlg, false);

    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * WAREHOUSE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * WAREHOUSE_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseNm() { return _columnWarehouseNm; }
    /**
     * EMERGENCY_FLG: {varchar(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * PICKING_GROUP_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingGroupNo() { return _columnPickingGroupNo; }
    /**
     * WORK_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * CART_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartNo() { return _columnCartNo; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * JANCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJancd() { return _columnJancd; }
    /**
     * LOT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimtDt() { return _columnLimtDt; }
    /**
     * STORE_LABEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * STORE_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * BACKET_COL_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBacketColNum() { return _columnBacketColNum; }
    /**
     * BACKET_ROW_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBacketRowNum() { return _columnBacketRowNum; }
    /**
     * SUM_PICKING_NUM: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumPickingNum() { return _columnSumPickingNum; }
    /**
     * PACKING_NUM_1_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum11() { return _columnPackingNum11; }
    /**
     * PACKING_NUM_1_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum12() { return _columnPackingNum12; }
    /**
     * PACKING_NUM_1_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum13() { return _columnPackingNum13; }
    /**
     * PACKING_NUM_1_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum14() { return _columnPackingNum14; }
    /**
     * PACKING_NUM_1_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum15() { return _columnPackingNum15; }
    /**
     * PACKING_NUM_1_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum16() { return _columnPackingNum16; }
    /**
     * PACKING_NUM_2_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum21() { return _columnPackingNum21; }
    /**
     * PACKING_NUM_2_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum22() { return _columnPackingNum22; }
    /**
     * PACKING_NUM_2_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum23() { return _columnPackingNum23; }
    /**
     * PACKING_NUM_2_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum24() { return _columnPackingNum24; }
    /**
     * PACKING_NUM_2_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum25() { return _columnPackingNum25; }
    /**
     * PACKING_NUM_2_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum26() { return _columnPackingNum26; }
    /**
     * PACKING_NUM_3_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum31() { return _columnPackingNum31; }
    /**
     * PACKING_NUM_3_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum32() { return _columnPackingNum32; }
    /**
     * PACKING_NUM_3_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum33() { return _columnPackingNum33; }
    /**
     * PACKING_NUM_3_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum34() { return _columnPackingNum34; }
    /**
     * PACKING_NUM_3_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum35() { return _columnPackingNum35; }
    /**
     * PACKING_NUM_3_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum36() { return _columnPackingNum36; }
    /**
     * PACKING_NUM_4_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum41() { return _columnPackingNum41; }
    /**
     * PACKING_NUM_4_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum42() { return _columnPackingNum42; }
    /**
     * PACKING_NUM_4_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum43() { return _columnPackingNum43; }
    /**
     * PACKING_NUM_4_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum44() { return _columnPackingNum44; }
    /**
     * PACKING_NUM_4_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum45() { return _columnPackingNum45; }
    /**
     * PACKING_NUM_4_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum46() { return _columnPackingNum46; }
    /**
     * PACKING_NUM_5_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum51() { return _columnPackingNum51; }
    /**
     * PACKING_NUM_5_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum52() { return _columnPackingNum52; }
    /**
     * PACKING_NUM_5_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum53() { return _columnPackingNum53; }
    /**
     * PACKING_NUM_5_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum54() { return _columnPackingNum54; }
    /**
     * PACKING_NUM_5_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum55() { return _columnPackingNum55; }
    /**
     * PACKING_NUM_5_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum56() { return _columnPackingNum56; }
    /**
     * PACKING_NUM_6_1: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum61() { return _columnPackingNum61; }
    /**
     * PACKING_NUM_6_2: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum62() { return _columnPackingNum62; }
    /**
     * PACKING_NUM_6_3: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum63() { return _columnPackingNum63; }
    /**
     * PACKING_NUM_6_4: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum64() { return _columnPackingNum64; }
    /**
     * PACKING_NUM_6_5: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum65() { return _columnPackingNum65; }
    /**
     * PACKING_NUM_6_6: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum66() { return _columnPackingNum66; }
    /**
     * MLT_OUT_FLG: {char(1), classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutFlg() { return _columnMltOutFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnWarehouseCd());
        ls.add(columnWarehouseNm());
        ls.add(columnEmergencyFlg());
        ls.add(columnPickingGroupNo());
        ls.add(columnWorkDt());
        ls.add(columnCartNo());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnJancd());
        ls.add(columnLot());
        ls.add(columnLimtDt());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnBacketColNum());
        ls.add(columnBacketRowNum());
        ls.add(columnSumPickingNum());
        ls.add(columnPackingNum11());
        ls.add(columnPackingNum12());
        ls.add(columnPackingNum13());
        ls.add(columnPackingNum14());
        ls.add(columnPackingNum15());
        ls.add(columnPackingNum16());
        ls.add(columnPackingNum21());
        ls.add(columnPackingNum22());
        ls.add(columnPackingNum23());
        ls.add(columnPackingNum24());
        ls.add(columnPackingNum25());
        ls.add(columnPackingNum26());
        ls.add(columnPackingNum31());
        ls.add(columnPackingNum32());
        ls.add(columnPackingNum33());
        ls.add(columnPackingNum34());
        ls.add(columnPackingNum35());
        ls.add(columnPackingNum36());
        ls.add(columnPackingNum41());
        ls.add(columnPackingNum42());
        ls.add(columnPackingNum43());
        ls.add(columnPackingNum44());
        ls.add(columnPackingNum45());
        ls.add(columnPackingNum46());
        ls.add(columnPackingNum51());
        ls.add(columnPackingNum52());
        ls.add(columnPackingNum53());
        ls.add(columnPackingNum54());
        ls.add(columnPackingNum55());
        ls.add(columnPackingNum56());
        ls.add(columnPackingNum61());
        ls.add(columnPackingNum62());
        ls.add(columnPackingNum63());
        ls.add(columnPackingNum64());
        ls.add(columnPackingNum65());
        ls.add(columnPackingNum66());
        ls.add(columnMltOutFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMultiPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMultiPickingListPrint> getEntityType() { return SqlMultiPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMultiPickingListPrint newEntity() { return new SqlMultiPickingListPrint(); }
    public SqlMultiPickingListPrint newMyEntity() { return new SqlMultiPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMultiPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMultiPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
