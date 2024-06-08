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
 * The DB meta of T_BTRPICKDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBtrpickdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBtrpickdetailDbm _instance = new TBtrpickdetailDbm();
    private TBtrpickdetailDbm() {}
    public static TBtrpickdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickingInstDetailId(), (et, vl) -> ((TBtrpickdetail)et).setPickingInstDetailId(ctl(vl)), "pickingInstDetailId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickingInstId(), (et, vl) -> ((TBtrpickdetail)et).setPickingInstId(ctl(vl)), "pickingInstId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickbatchlineno(), (et, vl) -> ((TBtrpickdetail)et).setPickbatchlineno(ctl(vl)), "pickbatchlineno");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getSoid(), (et, vl) -> ((TBtrpickdetail)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getSodetailid(), (et, vl) -> ((TBtrpickdetail)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getSts(), (et, vl) -> ((TBtrpickdetail)et).setSts(ctl(vl)), "sts");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getProductId(), (et, vl) -> ((TBtrpickdetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getIfProductId(), (et, vl) -> ((TBtrpickdetail)et).setIfProductId(ctl(vl)), "ifProductId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLotId(), (et, vl) -> ((TBtrpickdetail)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLocationId(), (et, vl) -> ((TBtrpickdetail)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLocgroup(), (et, vl) -> ((TBtrpickdetail)et).setLocgroup((String)vl), "locgroup");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLoctype(), (et, vl) -> ((TBtrpickdetail)et).setLoctype((String)vl), "loctype");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPicktype(), (et, vl) -> ((TBtrpickdetail)et).setPicktype((String)vl), "picktype");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAlloctype(), (et, vl) -> ((TBtrpickdetail)et).setAlloctype((String)vl), "alloctype");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getTagcd(), (et, vl) -> ((TBtrpickdetail)et).setTagcd((String)vl), "tagcd");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getActualtagcd(), (et, vl) -> ((TBtrpickdetail)et).setActualtagcd((String)vl), "actualtagcd");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getFromLocationId(), (et, vl) -> ((TBtrpickdetail)et).setFromLocationId(ctl(vl)), "fromLocationId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getFromtagcd(), (et, vl) -> ((TBtrpickdetail)et).setFromtagcd((String)vl), "fromtagcd");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getToLocationId(), (et, vl) -> ((TBtrpickdetail)et).setToLocationId(ctl(vl)), "toLocationId");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getTotagcd(), (et, vl) -> ((TBtrpickdetail)et).setTotagcd((String)vl), "totagcd");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getExpectqty1(), (et, vl) -> ((TBtrpickdetail)et).setExpectqty1(ctl(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickedqty1(), (et, vl) -> ((TBtrpickdetail)et).setPickedqty1(ctl(vl)), "pickedqty1");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPallettype(), (et, vl) -> ((TBtrpickdetail)et).setPallettype(ctl(vl)), "pallettype");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getSortedqty1(), (et, vl) -> ((TBtrpickdetail)et).setSortedqty1(ctl(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getShippedqty1(), (et, vl) -> ((TBtrpickdetail)et).setShippedqty1(ctl(vl)), "shippedqty1");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getRcvkey(), (et, vl) -> ((TBtrpickdetail)et).setRcvkey(ctl(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getRcvlineno(), (et, vl) -> ((TBtrpickdetail)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickusercd(), (et, vl) -> ((TBtrpickdetail)et).setPickusercd((String)vl), "pickusercd");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLotreserveflg(), (et, vl) -> ((TBtrpickdetail)et).setLotreserveflg(ctl(vl)), "lotreserveflg");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getLabelprintedflg(), (et, vl) -> ((TBtrpickdetail)et).setLabelprintedflg(ctl(vl)), "labelprintedflg");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAllocstyletype(), (et, vl) -> ((TBtrpickdetail)et).setAllocstyletype(ctl(vl)), "allocstyletype");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getFullpalletkey(), (et, vl) -> ((TBtrpickdetail)et).setFullpalletkey(ctl(vl)), "fullpalletkey");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getPickingunit(), (et, vl) -> ((TBtrpickdetail)et).setPickingunit(ctl(vl)), "pickingunit");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getWorkallocateid(), (et, vl) -> ((TBtrpickdetail)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getWorkallocatename(), (et, vl) -> ((TBtrpickdetail)et).setWorkallocatename((String)vl), "workallocatename");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAlertflg(), (et, vl) -> ((TBtrpickdetail)et).setAlertflg(ctl(vl)), "alertflg");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getDelFlg(), (et, vl) -> ((TBtrpickdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getVersionNo(), (et, vl) -> ((TBtrpickdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getControlNo(), (et, vl) -> ((TBtrpickdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAddDt(), (et, vl) -> ((TBtrpickdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAddUser(), (et, vl) -> ((TBtrpickdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getAddProcess(), (et, vl) -> ((TBtrpickdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getUpdDt(), (et, vl) -> ((TBtrpickdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getUpdUser(), (et, vl) -> ((TBtrpickdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBtrpickdetail)et).getUpdProcess(), (et, vl) -> ((TBtrpickdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_BTRPICKDETAIL";
    protected final String _tableDispName = "T_BTRPICKDETAIL";
    protected final String _tablePropertyName = "TBtrpickdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_BTRPICKDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingInstDetailId = cci("PICKING_INST_DETAIL_ID", "PICKING_INST_DETAIL_ID", null, null, Long.class, "pickingInstDetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingInstId = cci("PICKING_INST_ID", "PICKING_INST_ID", null, null, Long.class, "pickingInstId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickbatchlineno = cci("PICKBATCHLINENO", "PICKBATCHLINENO", null, null, Long.class, "pickbatchlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, Long.class, "sts", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfProductId = cci("IF_PRODUCT_ID", "IF_PRODUCT_ID", null, null, Long.class, "ifProductId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocgroup = cci("LOCGROUP", "LOCGROUP", null, null, String.class, "locgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoctype = cci("LOCTYPE", "LOCTYPE", null, null, String.class, "loctype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicktype = cci("PICKTYPE", "PICKTYPE", null, null, String.class, "picktype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlloctype = cci("ALLOCTYPE", "ALLOCTYPE", null, null, String.class, "alloctype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagcd = cci("TAGCD", "TAGCD", null, null, String.class, "tagcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActualtagcd = cci("ACTUALTAGCD", "ACTUALTAGCD", null, null, String.class, "actualtagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromLocationId = cci("FROM_LOCATION_ID", "FROM_LOCATION_ID", null, null, Long.class, "fromLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromtagcd = cci("FROMTAGCD", "FROMTAGCD", null, null, String.class, "fromtagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToLocationId = cci("TO_LOCATION_ID", "TO_LOCATION_ID", null, null, Long.class, "toLocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotagcd = cci("TOTAGCD", "TOTAGCD", null, null, String.class, "totagcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, Long.class, "expectqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty1 = cci("PICKEDQTY1", "PICKEDQTY1", null, null, Long.class, "pickedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPallettype = cci("PALLETTYPE", "PALLETTYPE", null, null, Long.class, "pallettype", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, Long.class, "sortedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippedqty1 = cci("SHIPPEDQTY1", "SHIPPEDQTY1", null, null, Long.class, "shippedqty1", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, Long.class, "rcvkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickusercd = cci("PICKUSERCD", "PICKUSERCD", null, null, String.class, "pickusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotreserveflg = cci("LOTRESERVEFLG", "LOTRESERVEFLG", null, null, Long.class, "lotreserveflg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabelprintedflg = cci("LABELPRINTEDFLG", "LABELPRINTEDFLG", null, null, Long.class, "labelprintedflg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocstyletype = cci("ALLOCSTYLETYPE", "ALLOCSTYLETYPE", null, null, Long.class, "allocstyletype", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFullpalletkey = cci("FULLPALLETKEY", "FULLPALLETKEY", null, null, Long.class, "fullpalletkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingunit = cci("PICKINGUNIT", "PICKINGUNIT", null, null, Long.class, "pickingunit", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocatename = cci("WORKALLOCATENAME", "WORKALLOCATENAME", null, null, String.class, "workallocatename", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlertflg = cci("ALERTFLG", "ALERTFLG", null, null, Long.class, "alertflg", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * PICKING_INST_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstDetailId() { return _columnPickingInstDetailId; }
    /**
     * PICKING_INST_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingInstId() { return _columnPickingInstId; }
    /**
     * PICKBATCHLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickbatchlineno() { return _columnPickbatchlineno; }
    /**
     * SOID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SODETAILID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSodetailid() { return _columnSodetailid; }
    /**
     * STS: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * PRODUCT_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * IF_PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfProductId() { return _columnIfProductId; }
    /**
     * LOT_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * LOCATION_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocgroup() { return _columnLocgroup; }
    /**
     * LOCTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoctype() { return _columnLoctype; }
    /**
     * PICKTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicktype() { return _columnPicktype; }
    /**
     * ALLOCTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlloctype() { return _columnAlloctype; }
    /**
     * TAGCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagcd() { return _columnTagcd; }
    /**
     * ACTUALTAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActualtagcd() { return _columnActualtagcd; }
    /**
     * FROM_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromLocationId() { return _columnFromLocationId; }
    /**
     * FROMTAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromtagcd() { return _columnFromtagcd; }
    /**
     * TO_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToLocationId() { return _columnToLocationId; }
    /**
     * TOTAGCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotagcd() { return _columnTotagcd; }
    /**
     * EXPECTQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * PICKEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty1() { return _columnPickedqty1; }
    /**
     * PALLETTYPE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPallettype() { return _columnPallettype; }
    /**
     * SORTEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
    /**
     * SHIPPEDQTY1: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippedqty1() { return _columnShippedqty1; }
    /**
     * RCVKEY: {IX+, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * RCVLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * PICKUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickusercd() { return _columnPickusercd; }
    /**
     * LOTRESERVEFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotreserveflg() { return _columnLotreserveflg; }
    /**
     * LABELPRINTEDFLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelprintedflg() { return _columnLabelprintedflg; }
    /**
     * ALLOCSTYLETYPE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocstyletype() { return _columnAllocstyletype; }
    /**
     * FULLPALLETKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFullpalletkey() { return _columnFullpalletkey; }
    /**
     * PICKINGUNIT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingunit() { return _columnPickingunit; }
    /**
     * WORKALLOCATEID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * WORKALLOCATENAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocatename() { return _columnWorkallocatename; }
    /**
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlertflg() { return _columnAlertflg; }
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
        ls.add(columnPickingInstDetailId());
        ls.add(columnPickingInstId());
        ls.add(columnPickbatchlineno());
        ls.add(columnSoid());
        ls.add(columnSodetailid());
        ls.add(columnSts());
        ls.add(columnProductId());
        ls.add(columnIfProductId());
        ls.add(columnLotId());
        ls.add(columnLocationId());
        ls.add(columnLocgroup());
        ls.add(columnLoctype());
        ls.add(columnPicktype());
        ls.add(columnAlloctype());
        ls.add(columnTagcd());
        ls.add(columnActualtagcd());
        ls.add(columnFromLocationId());
        ls.add(columnFromtagcd());
        ls.add(columnToLocationId());
        ls.add(columnTotagcd());
        ls.add(columnExpectqty1());
        ls.add(columnPickedqty1());
        ls.add(columnPallettype());
        ls.add(columnSortedqty1());
        ls.add(columnShippedqty1());
        ls.add(columnRcvkey());
        ls.add(columnRcvlineno());
        ls.add(columnPickusercd());
        ls.add(columnLotreserveflg());
        ls.add(columnLabelprintedflg());
        ls.add(columnAllocstyletype());
        ls.add(columnFullpalletkey());
        ls.add(columnPickingunit());
        ls.add(columnWorkallocateid());
        ls.add(columnWorkallocatename());
        ls.add(columnAlertflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingInstDetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBtrpickdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBtrpickdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBtrpickdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBtrpickdetail> getEntityType() { return TBtrpickdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBtrpickdetail newEntity() { return new TBtrpickdetail(); }
    public TBtrpickdetail newMyEntity() { return new TBtrpickdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBtrpickdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBtrpickdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
