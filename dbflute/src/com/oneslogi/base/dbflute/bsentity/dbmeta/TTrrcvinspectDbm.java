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
 * The DB meta of T_TRRCVINSPECT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrrcvinspectDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrrcvinspectDbm _instance = new TTrrcvinspectDbm();
    private TTrrcvinspectDbm() {}
    public static TTrrcvinspectDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getTrrcvinspectId(), (et, vl) -> ((TTrrcvinspect)et).setTrrcvinspectId(ctl(vl)), "trrcvinspectId");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getAcceptkey(), (et, vl) -> ((TTrrcvinspect)et).setAcceptkey(ctb(vl)), "acceptkey");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getRcvkey(), (et, vl) -> ((TTrrcvinspect)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getRcvlineno(), (et, vl) -> ((TTrrcvinspect)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInspectusercd(), (et, vl) -> ((TTrrcvinspect)et).setInspectusercd((String)vl), "inspectusercd");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInspectedqty1(), (et, vl) -> ((TTrrcvinspect)et).setInspectedqty1(ctb(vl)), "inspectedqty1");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInspectedqty2(), (et, vl) -> ((TTrrcvinspect)et).setInspectedqty2(ctl(vl)), "inspectedqty2");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInspectedqty3(), (et, vl) -> ((TTrrcvinspect)et).setInspectedqty3(ctl(vl)), "inspectedqty3");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInstructqty1(), (et, vl) -> ((TTrrcvinspect)et).setInstructqty1(ctb(vl)), "instructqty1");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInstructqty2(), (et, vl) -> ((TTrrcvinspect)et).setInstructqty2(ctl(vl)), "instructqty2");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getInstructqty3(), (et, vl) -> ((TTrrcvinspect)et).setInstructqty3(ctl(vl)), "instructqty3");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getWarehousecd(), (et, vl) -> ((TTrrcvinspect)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOwnercd(), (et, vl) -> ((TTrrcvinspect)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getItemadmin(), (et, vl) -> ((TTrrcvinspect)et).setItemadmin((String)vl), "itemadmin");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getProductCd(), (et, vl) -> ((TTrrcvinspect)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getIfitemcd(), (et, vl) -> ((TTrrcvinspect)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLot1(), (et, vl) -> ((TTrrcvinspect)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLot2(), (et, vl) -> ((TTrrcvinspect)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLot3(), (et, vl) -> ((TTrrcvinspect)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLot4(), (et, vl) -> ((TTrrcvinspect)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLot5(), (et, vl) -> ((TTrrcvinspect)et).setLot5((String)vl), "lot5");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOtherlot1(), (et, vl) -> ((TTrrcvinspect)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOtherlot2(), (et, vl) -> ((TTrrcvinspect)et).setOtherlot2((String)vl), "otherlot2");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOtherlot3(), (et, vl) -> ((TTrrcvinspect)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOtherlot4(), (et, vl) -> ((TTrrcvinspect)et).setOtherlot4((String)vl), "otherlot4");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getOtherlot5(), (et, vl) -> ((TTrrcvinspect)et).setOtherlot5(ctb(vl)), "otherlot5");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getDamageflg(), (et, vl) -> ((TTrrcvinspect)et).setDamageflg(ctb(vl)), "damageflg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getNoshippingflg(), (et, vl) -> ((TTrrcvinspect)et).setNoshippingflg(ctb(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getForeigncargoflg(), (et, vl) -> ((TTrrcvinspect)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getCustomsreleaseflg(), (et, vl) -> ((TTrrcvinspect)et).setCustomsreleaseflg(ctb(vl)), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getTaxflg(), (et, vl) -> ((TTrrcvinspect)et).setTaxflg(ctb(vl)), "taxflg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getLotkey(), (et, vl) -> ((TTrrcvinspect)et).setLotkey(ctl(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getNotes(), (et, vl) -> ((TTrrcvinspect)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getDelFlg(), (et, vl) -> ((TTrrcvinspect)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getVersionNo(), (et, vl) -> ((TTrrcvinspect)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getControlNo(), (et, vl) -> ((TTrrcvinspect)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getAddDt(), (et, vl) -> ((TTrrcvinspect)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getAddUser(), (et, vl) -> ((TTrrcvinspect)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getAddProcess(), (et, vl) -> ((TTrrcvinspect)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getUpdDt(), (et, vl) -> ((TTrrcvinspect)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getUpdUser(), (et, vl) -> ((TTrrcvinspect)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrrcvinspect)et).getUpdProcess(), (et, vl) -> ((TTrrcvinspect)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRRCVINSPECT";
    protected final String _tableDispName = "T_TRRCVINSPECT";
    protected final String _tablePropertyName = "TTrrcvinspect";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRRCVINSPECT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrrcvinspectId = cci("TRRCVINSPECT_ID", "TRRCVINSPECT_ID", null, null, Long.class, "trrcvinspectId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptkey = cci("ACCEPTKEY", "ACCEPTKEY", null, null, java.math.BigDecimal.class, "acceptkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectusercd = cci("INSPECTUSERCD", "INSPECTUSERCD", null, null, String.class, "inspectusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty1 = cci("INSPECTEDQTY1", "INSPECTEDQTY1", null, null, java.math.BigDecimal.class, "inspectedqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty2 = cci("INSPECTEDQTY2", "INSPECTEDQTY2", null, null, Long.class, "inspectedqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty3 = cci("INSPECTEDQTY3", "INSPECTEDQTY3", null, null, Long.class, "inspectedqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty1 = cci("INSTRUCTQTY1", "INSTRUCTQTY1", null, null, java.math.BigDecimal.class, "instructqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty2 = cci("INSTRUCTQTY2", "INSTRUCTQTY2", null, null, Long.class, "instructqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructqty3 = cci("INSTRUCTQTY3", "INSTRUCTQTY3", null, null, Long.class, "instructqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnLotkey = cci("LOTKEY", "LOTKEY", null, null, Long.class, "lotkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
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
     * TRRCVINSPECT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrrcvinspectId() { return _columnTrrcvinspectId; }
    /**
     * ACCEPTKEY: {IX, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptkey() { return _columnAcceptkey; }
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
     * INSPECTUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectusercd() { return _columnInspectusercd; }
    /**
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty1() { return _columnInspectedqty1; }
    /**
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty2() { return _columnInspectedqty2; }
    /**
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty3() { return _columnInspectedqty3; }
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
     * WAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * OWNERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * ITEMADMIN: {IX+, NotNull, varchar(30)}
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
     * LOTKEY: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
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
        ls.add(columnTrrcvinspectId());
        ls.add(columnAcceptkey());
        ls.add(columnRcvkey());
        ls.add(columnRcvlineno());
        ls.add(columnInspectusercd());
        ls.add(columnInspectedqty1());
        ls.add(columnInspectedqty2());
        ls.add(columnInspectedqty3());
        ls.add(columnInstructqty1());
        ls.add(columnInstructqty2());
        ls.add(columnInstructqty3());
        ls.add(columnWarehousecd());
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
        ls.add(columnLotkey());
        ls.add(columnNotes());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrrcvinspectId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrrcvinspect"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrrcvinspectCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrrcvinspectBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrrcvinspect> getEntityType() { return TTrrcvinspect.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrrcvinspect newEntity() { return new TTrrcvinspect(); }
    public TTrrcvinspect newMyEntity() { return new TTrrcvinspect(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrrcvinspect)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrrcvinspect)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
