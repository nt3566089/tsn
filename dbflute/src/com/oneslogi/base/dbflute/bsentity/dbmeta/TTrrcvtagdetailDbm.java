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
 * The DB meta of T_TRRCVTAGDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvtagdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrcvtagdetailDbm _instance = new TTrrcvtagdetailDbm();
    private TTrrcvtagdetailDbm() {}
    public static TTrrcvtagdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getTrrcvtagdetailId(), (et, vl) -> ((TTrrcvtagdetail)et).setTrrcvtagdetailId(ctl(vl)), "trrcvtagdetailId");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getRcvtagkey(), (et, vl) -> ((TTrrcvtagdetail)et).setRcvtagkey(ctb(vl)), "rcvtagkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getAcceptkey(), (et, vl) -> ((TTrrcvtagdetail)et).setAcceptkey(ctb(vl)), "acceptkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getAcceptlineno(), (et, vl) -> ((TTrrcvtagdetail)et).setAcceptlineno(ctl(vl)), "acceptlineno");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getRcvkey(), (et, vl) -> ((TTrrcvtagdetail)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getRcvlineno(), (et, vl) -> ((TTrrcvtagdetail)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSts(), (et, vl) -> ((TTrrcvtagdetail)et).setSts(ctl(vl)), "sts");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOwnercd(), (et, vl) -> ((TTrrcvtagdetail)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getItemadmin(), (et, vl) -> ((TTrrcvtagdetail)et).setItemadmin((String)vl), "itemadmin");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getProductCd(), (et, vl) -> ((TTrrcvtagdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getIfitemcd(), (et, vl) -> ((TTrrcvtagdetail)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLot1(), (et, vl) -> ((TTrrcvtagdetail)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLot2(), (et, vl) -> ((TTrrcvtagdetail)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLot3(), (et, vl) -> ((TTrrcvtagdetail)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLot4(), (et, vl) -> ((TTrrcvtagdetail)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLot5(), (et, vl) -> ((TTrrcvtagdetail)et).setLot5((String)vl), "lot5");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOtherlot1(), (et, vl) -> ((TTrrcvtagdetail)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOtherlot2(), (et, vl) -> ((TTrrcvtagdetail)et).setOtherlot2((String)vl), "otherlot2");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOtherlot3(), (et, vl) -> ((TTrrcvtagdetail)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOtherlot4(), (et, vl) -> ((TTrrcvtagdetail)et).setOtherlot4((String)vl), "otherlot4");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOtherlot5(), (et, vl) -> ((TTrrcvtagdetail)et).setOtherlot5(ctb(vl)), "otherlot5");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getDamageflg(), (et, vl) -> ((TTrrcvtagdetail)et).setDamageflg(ctb(vl)), "damageflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getNoshippingflg(), (et, vl) -> ((TTrrcvtagdetail)et).setNoshippingflg(ctb(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getForeigncargoflg(), (et, vl) -> ((TTrrcvtagdetail)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getCustomsreleaseflg(), (et, vl) -> ((TTrrcvtagdetail)et).setCustomsreleaseflg(ctb(vl)), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getTaxflg(), (et, vl) -> ((TTrrcvtagdetail)et).setTaxflg(ctb(vl)), "taxflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLogisticscd(), (et, vl) -> ((TTrrcvtagdetail)et).setLogisticscd((String)vl), "logisticscd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getWarehousecd(), (et, vl) -> ((TTrrcvtagdetail)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSlotflg(), (et, vl) -> ((TTrrcvtagdetail)et).setSlotflg(ctb(vl)), "slotflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getToloccd(), (et, vl) -> ((TTrrcvtagdetail)et).setToloccd((String)vl), "toloccd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLoccd(), (et, vl) -> ((TTrrcvtagdetail)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLotkey(), (et, vl) -> ((TTrrcvtagdetail)et).setLotkey(ctl(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getTagcd(), (et, vl) -> ((TTrrcvtagdetail)et).setTagcd((String)vl), "tagcd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getOddsflg(), (et, vl) -> ((TTrrcvtagdetail)et).setOddsflg(ctb(vl)), "oddsflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getInstructqty1(), (et, vl) -> ((TTrrcvtagdetail)et).setInstructqty1(ctb(vl)), "instructqty1");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getInstructqty2(), (et, vl) -> ((TTrrcvtagdetail)et).setInstructqty2(ctl(vl)), "instructqty2");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getInstructqty3(), (et, vl) -> ((TTrrcvtagdetail)et).setInstructqty3(ctl(vl)), "instructqty3");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLoadqty1(), (et, vl) -> ((TTrrcvtagdetail)et).setLoadqty1(ctb(vl)), "loadqty1");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLoadqty2(), (et, vl) -> ((TTrrcvtagdetail)et).setLoadqty2(ctl(vl)), "loadqty2");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLoadqty3(), (et, vl) -> ((TTrrcvtagdetail)et).setLoadqty3(ctl(vl)), "loadqty3");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getLabelprintedflg(), (et, vl) -> ((TTrrcvtagdetail)et).setLabelprintedflg(ctb(vl)), "labelprintedflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getNotes(), (et, vl) -> ((TTrrcvtagdetail)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSokey(), (et, vl) -> ((TTrrcvtagdetail)et).setSokey(ctb(vl)), "sokey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSolineno(), (et, vl) -> ((TTrrcvtagdetail)et).setSolineno(ctl(vl)), "solineno");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getTriggertype(), (et, vl) -> ((TTrrcvtagdetail)et).setTriggertype((String)vl), "triggertype");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getProspectflg(), (et, vl) -> ((TTrrcvtagdetail)et).setProspectflg(ctb(vl)), "prospectflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getProspectupdateflg(), (et, vl) -> ((TTrrcvtagdetail)et).setProspectupdateflg(ctb(vl)), "prospectupdateflg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSlottype(), (et, vl) -> ((TTrrcvtagdetail)et).setSlottype((String)vl), "slottype");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getSlottedusercd(), (et, vl) -> ((TTrrcvtagdetail)et).setSlottedusercd((String)vl), "slottedusercd");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getXdockorderkey(), (et, vl) -> ((TTrrcvtagdetail)et).setXdockorderkey(ctb(vl)), "xdockorderkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getPickkey(), (et, vl) -> ((TTrrcvtagdetail)et).setPickkey(ctl(vl)), "pickkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getFullpalletkey(), (et, vl) -> ((TTrrcvtagdetail)et).setFullpalletkey(ctb(vl)), "fullpalletkey");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getDelFlg(), (et, vl) -> ((TTrrcvtagdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getVersionNo(), (et, vl) -> ((TTrrcvtagdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getControlNo(), (et, vl) -> ((TTrrcvtagdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getAddDt(), (et, vl) -> ((TTrrcvtagdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getAddUser(), (et, vl) -> ((TTrrcvtagdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getAddProcess(), (et, vl) -> ((TTrrcvtagdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getUpdDt(), (et, vl) -> ((TTrrcvtagdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getUpdUser(), (et, vl) -> ((TTrrcvtagdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrcvtagdetail)et).getUpdProcess(), (et, vl) -> ((TTrrcvtagdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRRCVTAGDETAIL";
    protected final String _tableDispName = "T_TRRCVTAGDETAIL";
    protected final String _tablePropertyName = "TTrrcvtagdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRRCVTAGDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrrcvtagdetailId = cci("TRRCVTAGDETAIL_ID", "TRRCVTAGDETAIL_ID", null, null, Long.class, "trrcvtagdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtagkey = cci("RCVTAGKEY", "RCVTAGKEY", null, null, java.math.BigDecimal.class, "rcvtagkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptkey = cci("ACCEPTKEY", "ACCEPTKEY", null, null, java.math.BigDecimal.class, "acceptkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptlineno = cci("ACCEPTLINENO", "ACCEPTLINENO", null, null, Long.class, "acceptlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, Long.class, "sts", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercd = cci("OWNERCD", "OWNERCD", null, null, String.class, "ownercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemadmin = cci("ITEMADMIN", "ITEMADMIN", null, null, String.class, "itemadmin", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot5 = cci("LOT5", "LOT5", null, null, String.class, "lot5", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2 = cci("OTHERLOT2", "OTHERLOT2", null, null, String.class, "otherlot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3 = cci("OTHERLOT3", "OTHERLOT3", null, null, String.class, "otherlot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot4 = cci("OTHERLOT4", "OTHERLOT4", null, null, String.class, "otherlot4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot5 = cci("OTHERLOT5", "OTHERLOT5", null, null, java.math.BigDecimal.class, "otherlot5", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, java.math.BigDecimal.class, "damageflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, java.math.BigDecimal.class, "noshippingflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, java.math.BigDecimal.class, "foreigncargoflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, java.math.BigDecimal.class, "customsreleaseflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, java.math.BigDecimal.class, "taxflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticscd = cci("LOGISTICSCD", "LOGISTICSCD", null, null, String.class, "logisticscd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotflg = cci("SLOTFLG", "SLOTFLG", null, null, java.math.BigDecimal.class, "slotflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToloccd = cci("TOLOCCD", "TOLOCCD", null, null, String.class, "toloccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, Long.class, "lotkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagcd = cci("TAGCD", "TAGCD", null, null, String.class, "tagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOddsflg = cci("ODDSFLG", "ODDSFLG", null, null, java.math.BigDecimal.class, "oddsflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty1 = cci("INSTRUCTQTY1", "INSTRUCTQTY1", null, null, java.math.BigDecimal.class, "instructqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty2 = cci("INSTRUCTQTY2", "INSTRUCTQTY2", null, null, Long.class, "instructqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty3 = cci("INSTRUCTQTY3", "INSTRUCTQTY3", null, null, Long.class, "instructqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadqty1 = cci("LOADQTY1", "LOADQTY1", null, null, java.math.BigDecimal.class, "loadqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadqty2 = cci("LOADQTY2", "LOADQTY2", null, null, Long.class, "loadqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadqty3 = cci("LOADQTY3", "LOADQTY3", null, null, Long.class, "loadqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabelprintedflg = cci("LABELPRINTEDFLG", "LABELPRINTEDFLG", null, null, java.math.BigDecimal.class, "labelprintedflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, java.math.BigDecimal.class, "sokey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSolineno = cci("SOLINENO", "SOLINENO", null, null, Long.class, "solineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTriggertype = cci("TRIGGERTYPE", "TRIGGERTYPE", null, null, String.class, "triggertype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProspectflg = cci("PROSPECTFLG", "PROSPECTFLG", null, null, java.math.BigDecimal.class, "prospectflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProspectupdateflg = cci("PROSPECTUPDATEFLG", "PROSPECTUPDATEFLG", null, null, java.math.BigDecimal.class, "prospectupdateflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlottype = cci("SLOTTYPE", "SLOTTYPE", null, null, String.class, "slottype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlottedusercd = cci("SLOTTEDUSERCD", "SLOTTEDUSERCD", null, null, String.class, "slottedusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnXdockorderkey = cci("XDOCKORDERKEY", "XDOCKORDERKEY", null, null, java.math.BigDecimal.class, "xdockorderkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickkey = cci("PICKKEY", "PICKKEY", null, null, Long.class, "pickkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFullpalletkey = cci("FULLPALLETKEY", "FULLPALLETKEY", null, null, java.math.BigDecimal.class, "fullpalletkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TRRCVTAGDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvtagdetailId() { return _columnTrrcvtagdetailId; }
    /**
     * RCVTAGKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtagkey() { return _columnRcvtagkey; }
    /**
     * ACCEPTKEY: {IX+, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptkey() { return _columnAcceptkey; }
    /**
     * ACCEPTLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptlineno() { return _columnAcceptlineno; }
    /**
     * RCVKEY: {IX+, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * RCVLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * STS: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * OWNERCD: {IX+, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemadmin() { return _columnItemadmin; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
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
     * OTHERLOT5: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot5() { return _columnOtherlot5; }
    /**
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * LOGISTICSCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticscd() { return _columnLogisticscd; }
    /**
     * WAREHOUSECD: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * SLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotflg() { return _columnSlotflg; }
    /**
     * TOLOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToloccd() { return _columnToloccd; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * LOTKEY: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * TAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagcd() { return _columnTagcd; }
    /**
     * ODDSFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOddsflg() { return _columnOddsflg; }
    /**
     * INSTRUCTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructqty1() { return _columnInstructqty1; }
    /**
     * INSTRUCTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructqty2() { return _columnInstructqty2; }
    /**
     * INSTRUCTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructqty3() { return _columnInstructqty3; }
    /**
     * LOADQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadqty1() { return _columnLoadqty1; }
    /**
     * LOADQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadqty2() { return _columnLoadqty2; }
    /**
     * LOADQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadqty3() { return _columnLoadqty3; }
    /**
     * LABELPRINTEDFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelprintedflg() { return _columnLabelprintedflg; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * SOKEY: {IX+, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * SOLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSolineno() { return _columnSolineno; }
    /**
     * TRIGGERTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTriggertype() { return _columnTriggertype; }
    /**
     * PROSPECTFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProspectflg() { return _columnProspectflg; }
    /**
     * PROSPECTUPDATEFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProspectupdateflg() { return _columnProspectupdateflg; }
    /**
     * SLOTTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlottype() { return _columnSlottype; }
    /**
     * SLOTTEDUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlottedusercd() { return _columnSlottedusercd; }
    /**
     * XDOCKORDERKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnXdockorderkey() { return _columnXdockorderkey; }
    /**
     * PICKKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickkey() { return _columnPickkey; }
    /**
     * FULLPALLETKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFullpalletkey() { return _columnFullpalletkey; }
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
        ls.add(columnTrrcvtagdetailId());
        ls.add(columnRcvtagkey());
        ls.add(columnAcceptkey());
        ls.add(columnAcceptlineno());
        ls.add(columnRcvkey());
        ls.add(columnRcvlineno());
        ls.add(columnSts());
        ls.add(columnOwnercd());
        ls.add(columnItemadmin());
        ls.add(columnProductCd());
        ls.add(columnIfitemcd());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot5());
        ls.add(columnOtherlot1());
        ls.add(columnOtherlot2());
        ls.add(columnOtherlot3());
        ls.add(columnOtherlot4());
        ls.add(columnOtherlot5());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnLogisticscd());
        ls.add(columnWarehousecd());
        ls.add(columnSlotflg());
        ls.add(columnToloccd());
        ls.add(columnLoccd());
        ls.add(columnLotkey());
        ls.add(columnTagcd());
        ls.add(columnOddsflg());
        ls.add(columnInstructqty1());
        ls.add(columnInstructqty2());
        ls.add(columnInstructqty3());
        ls.add(columnLoadqty1());
        ls.add(columnLoadqty2());
        ls.add(columnLoadqty3());
        ls.add(columnLabelprintedflg());
        ls.add(columnNotes());
        ls.add(columnSokey());
        ls.add(columnSolineno());
        ls.add(columnTriggertype());
        ls.add(columnProspectflg());
        ls.add(columnProspectupdateflg());
        ls.add(columnSlottype());
        ls.add(columnSlottedusercd());
        ls.add(columnXdockorderkey());
        ls.add(columnPickkey());
        ls.add(columnFullpalletkey());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrrcvtagdetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrcvtagdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrcvtagdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrcvtagdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrcvtagdetail> getEntityType() { return TTrrcvtagdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrcvtagdetail newEntity() { return new TTrrcvtagdetail(); }
    public TTrrcvtagdetail newMyEntity() { return new TTrrcvtagdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrcvtagdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrcvtagdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
