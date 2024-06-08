package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_TRSODETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsodetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsodetailDbm _instance = new TTrsodetailDbm();
    private TTrsodetailDbm() {}
    public static TTrsodetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getSodetailid(), (et, vl) -> ((TTrsodetail)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getSoid(), (et, vl) -> ((TTrsodetail)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getSolineno(), (et, vl) -> ((TTrsodetail)et).setSolineno(ctl(vl)), "solineno");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOrderlineno(), (et, vl) -> ((TTrsodetail)et).setOrderlineno(ctl(vl)), "orderlineno");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOwnerorderlineno(), (et, vl) -> ((TTrsodetail)et).setOwnerorderlineno(ctl(vl)), "ownerorderlineno");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getCustorderlineno(), (et, vl) -> ((TTrsodetail)et).setCustorderlineno(ctl(vl)), "custorderlineno");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOriginalpolineno(), (et, vl) -> ((TTrsodetail)et).setOriginalpolineno(ctl(vl)), "originalpolineno");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getProductId(), (et, vl) -> ((TTrsodetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getIfitemcd(), (et, vl) -> ((TTrsodetail)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLot1(), (et, vl) -> ((TTrsodetail)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLot2(), (et, vl) -> ((TTrsodetail)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLot3(), (et, vl) -> ((TTrsodetail)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLot4(), (et, vl) -> ((TTrsodetail)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLot5(), (et, vl) -> ((TTrsodetail)et).setLot5((String)vl), "lot5");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getStockTypeCd(), (et, vl) -> ((TTrsodetail)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOtherlot2(), (et, vl) -> ((TTrsodetail)et).setOtherlot2((String)vl), "otherlot2");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOtherlot3(), (et, vl) -> ((TTrsodetail)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOtherlot4(), (et, vl) -> ((TTrsodetail)et).setOtherlot4((String)vl), "otherlot4");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getOtherlot5(), (et, vl) -> ((TTrsodetail)et).setOtherlot5(ctl(vl)), "otherlot5");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getDamageflg(), (et, vl) -> ((TTrsodetail)et).setDamageflg((String)vl), "damageflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getNoshippingflg(), (et, vl) -> ((TTrsodetail)et).setNoshippingflg((String)vl), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getForeigncargoflg(), (et, vl) -> ((TTrsodetail)et).setForeigncargoflg((String)vl), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getCustomsreleaseflg(), (et, vl) -> ((TTrsodetail)et).setCustomsreleaseflg((String)vl), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getTaxflg(), (et, vl) -> ((TTrsodetail)et).setTaxflg((String)vl), "taxflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getExpectqty1(), (et, vl) -> ((TTrsodetail)et).setExpectqty1(ctl(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getXdockqty1(), (et, vl) -> ((TTrsodetail)et).setXdockqty1(ctl(vl)), "xdockqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getAllocqty1(), (et, vl) -> ((TTrsodetail)et).setAllocqty1(ctl(vl)), "allocqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getPickedqty1(), (et, vl) -> ((TTrsodetail)et).setPickedqty1(ctl(vl)), "pickedqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getSortedqty1(), (et, vl) -> ((TTrsodetail)et).setSortedqty1(ctl(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getInspectedqty1(), (et, vl) -> ((TTrsodetail)et).setInspectedqty1(ctl(vl)), "inspectedqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getShippedqty1(), (et, vl) -> ((TTrsodetail)et).setShippedqty1(ctl(vl)), "shippedqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getAdjustqty1(), (et, vl) -> ((TTrsodetail)et).setAdjustqty1(ctl(vl)), "adjustqty1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getPrice1(), (et, vl) -> ((TTrsodetail)et).setPrice1(ctb(vl)), "price1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getPrice2(), (et, vl) -> ((TTrsodetail)et).setPrice2(ctb(vl)), "price2");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getPrice3(), (et, vl) -> ((TTrsodetail)et).setPrice3(ctb(vl)), "price3");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getNotes(), (et, vl) -> ((TTrsodetail)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLotreserveflg(), (et, vl) -> ((TTrsodetail)et).setLotreserveflg((String)vl), "lotreserveflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getPickqtyerrorflg(), (et, vl) -> ((TTrsodetail)et).setPickqtyerrorflg((String)vl), "pickqtyerrorflg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLogicflg1(), (et, vl) -> ((TTrsodetail)et).setLogicflg1((String)vl), "logicflg1");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLogicflg2(), (et, vl) -> ((TTrsodetail)et).setLogicflg2((String)vl), "logicflg2");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getLogicflg3(), (et, vl) -> ((TTrsodetail)et).setLogicflg3((String)vl), "logicflg3");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getDelFlg(), (et, vl) -> ((TTrsodetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getVersionNo(), (et, vl) -> ((TTrsodetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getControlNo(), (et, vl) -> ((TTrsodetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getAddDt(), (et, vl) -> ((TTrsodetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getAddUser(), (et, vl) -> ((TTrsodetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getAddProcess(), (et, vl) -> ((TTrsodetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getUpdDt(), (et, vl) -> ((TTrsodetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getUpdUser(), (et, vl) -> ((TTrsodetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsodetail)et).getUpdProcess(), (et, vl) -> ((TTrsodetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSODETAIL";
    protected final String _tableDispName = "T_TRSODETAIL";
    protected final String _tablePropertyName = "TTrsodetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSODETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSolineno = cci("SOLINENO", "SOLINENO", null, null, Long.class, "solineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderlineno = cci("ORDERLINENO", "ORDERLINENO", null, null, Long.class, "orderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderlineno = cci("OWNERORDERLINENO", "OWNERORDERLINENO", null, null, Long.class, "ownerorderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderlineno = cci("CUSTORDERLINENO", "CUSTORDERLINENO", null, null, Long.class, "custorderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalpolineno = cci("ORIGINALPOLINENO", "ORIGINALPOLINENO", null, null, Long.class, "originalpolineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot5 = cci("LOT5", "LOT5", null, null, String.class, "lot5", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2 = cci("OTHERLOT2", "OTHERLOT2", null, null, String.class, "otherlot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3 = cci("OTHERLOT3", "OTHERLOT3", null, null, String.class, "otherlot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot4 = cci("OTHERLOT4", "OTHERLOT4", null, null, String.class, "otherlot4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot5 = cci("OTHERLOT5", "OTHERLOT5", null, null, Long.class, "otherlot5", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, String.class, "damageflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, String.class, "noshippingflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, String.class, "foreigncargoflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, String.class, "customsreleaseflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, String.class, "taxflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, Long.class, "expectqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnXdockqty1 = cci("XDOCKQTY1", "XDOCKQTY1", null, null, Long.class, "xdockqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocqty1 = cci("ALLOCQTY1", "ALLOCQTY1", null, null, Long.class, "allocqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty1 = cci("PICKEDQTY1", "PICKEDQTY1", null, null, Long.class, "pickedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, Long.class, "sortedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty1 = cci("INSPECTEDQTY1", "INSPECTEDQTY1", null, null, Long.class, "inspectedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippedqty1 = cci("SHIPPEDQTY1", "SHIPPEDQTY1", null, null, Long.class, "shippedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustqty1 = cci("ADJUSTQTY1", "ADJUSTQTY1", null, null, Long.class, "adjustqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice1 = cci("PRICE1", "PRICE1", null, null, java.math.BigDecimal.class, "price1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice2 = cci("PRICE2", "PRICE2", null, null, java.math.BigDecimal.class, "price2", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice3 = cci("PRICE3", "PRICE3", null, null, java.math.BigDecimal.class, "price3", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotreserveflg = cci("LOTRESERVEFLG", "LOTRESERVEFLG", null, null, String.class, "lotreserveflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickqtyerrorflg = cci("PICKQTYERRORFLG", "PICKQTYERRORFLG", null, null, String.class, "pickqtyerrorflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg1 = cci("LOGICFLG1", "LOGICFLG1", null, null, String.class, "logicflg1", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg2 = cci("LOGICFLG2", "LOGICFLG2", null, null, String.class, "logicflg2", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg3 = cci("LOGICFLG3", "LOGICFLG3", null, null, String.class, "logicflg3", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SODETAILID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSodetailid() { return _columnSodetailid; }
    /**
     * SOID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SOLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSolineno() { return _columnSolineno; }
    /**
     * ORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderlineno() { return _columnOrderlineno; }
    /**
     * OWNERORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderlineno() { return _columnOwnerorderlineno; }
    /**
     * CUSTORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderlineno() { return _columnCustorderlineno; }
    /**
     * ORIGINALPOLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalpolineno() { return _columnOriginalpolineno; }
    /**
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT5: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot5() { return _columnLot5; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * OTHERLOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot2() { return _columnOtherlot2; }
    /**
     * OTHERLOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3() { return _columnOtherlot3; }
    /**
     * OTHERLOT4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot4() { return _columnOtherlot4; }
    /**
     * OTHERLOT5: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot5() { return _columnOtherlot5; }
    /**
     * DAMAGEFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * XDOCKQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnXdockqty1() { return _columnXdockqty1; }
    /**
     * ALLOCQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocqty1() { return _columnAllocqty1; }
    /**
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty1() { return _columnPickedqty1; }
    /**
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
    /**
     * INSPECTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty1() { return _columnInspectedqty1; }
    /**
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippedqty1() { return _columnShippedqty1; }
    /**
     * ADJUSTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustqty1() { return _columnAdjustqty1; }
    /**
     * PRICE1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice1() { return _columnPrice1; }
    /**
     * PRICE2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice2() { return _columnPrice2; }
    /**
     * PRICE3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice3() { return _columnPrice3; }
    /**
     * NOTES: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * LOTRESERVEFLG: {IX, NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotreserveflg() { return _columnLotreserveflg; }
    /**
     * PICKQTYERRORFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickqtyerrorflg() { return _columnPickqtyerrorflg; }
    /**
     * LOGICFLG1: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg1() { return _columnLogicflg1; }
    /**
     * LOGICFLG2: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg2() { return _columnLogicflg2; }
    /**
     * LOGICFLG3: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg3() { return _columnLogicflg3; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSodetailid());
        ls.add(columnSoid());
        ls.add(columnSolineno());
        ls.add(columnOrderlineno());
        ls.add(columnOwnerorderlineno());
        ls.add(columnCustorderlineno());
        ls.add(columnOriginalpolineno());
        ls.add(columnProductId());
        ls.add(columnIfitemcd());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot5());
        ls.add(columnStockTypeCd());
        ls.add(columnOtherlot2());
        ls.add(columnOtherlot3());
        ls.add(columnOtherlot4());
        ls.add(columnOtherlot5());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnExpectqty1());
        ls.add(columnXdockqty1());
        ls.add(columnAllocqty1());
        ls.add(columnPickedqty1());
        ls.add(columnSortedqty1());
        ls.add(columnInspectedqty1());
        ls.add(columnShippedqty1());
        ls.add(columnAdjustqty1());
        ls.add(columnPrice1());
        ls.add(columnPrice2());
        ls.add(columnPrice3());
        ls.add(columnNotes());
        ls.add(columnLotreserveflg());
        ls.add(columnPickqtyerrorflg());
        ls.add(columnLogicflg1());
        ls.add(columnLogicflg2());
        ls.add(columnLogicflg3());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSodetailid()); }
    public boolean hasPrimaryKey() { return true; }
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
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsodetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsodetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsodetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsodetail> getEntityType() { return TTrsodetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsodetail newEntity() { return new TTrsodetail(); }
    public TTrsodetail newMyEntity() { return new TTrsodetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsodetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsodetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
