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
 * The DB meta of T_PICKLIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPicklistDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPicklistDbm _instance = new TPicklistDbm();
    private TPicklistDbm() {}
    public static TPicklistDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPicklist)et).getTPicklistId(), (et, vl) -> ((TPicklist)et).setTPicklistId(ctl(vl)), "TPicklistId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getPicklistkey(), (et, vl) -> ((TPicklist)et).setPicklistkey(ctl(vl)), "picklistkey");
        setupEpg(_epgMap, et -> ((TPicklist)et).getWorkallocateid(), (et, vl) -> ((TPicklist)et).setWorkallocateid(ctl(vl)), "workallocateid");
        setupEpg(_epgMap, et -> ((TPicklist)et).getFloor(), (et, vl) -> ((TPicklist)et).setFloor((String)vl), "floor");
        setupEpg(_epgMap, et -> ((TPicklist)et).getListkbn(), (et, vl) -> ((TPicklist)et).setListkbn((String)vl), "listkbn");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLocationId(), (et, vl) -> ((TPicklist)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLotId(), (et, vl) -> ((TPicklist)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getProductId(), (et, vl) -> ((TPicklist)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLot1(), (et, vl) -> ((TPicklist)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLot2(), (et, vl) -> ((TPicklist)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLot3(), (et, vl) -> ((TPicklist)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TPicklist)et).getLot4(), (et, vl) -> ((TPicklist)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TPicklist)et).getOtherlot1(), (et, vl) -> ((TPicklist)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TPicklist)et).getNoshippingflg(), (et, vl) -> ((TPicklist)et).setNoshippingflg(ctl(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TPicklist)et).getPickschdate(), (et, vl) -> ((TPicklist)et).setPickschdate((String)vl), "pickschdate");
        setupEpg(_epgMap, et -> ((TPicklist)et).getExpectqty1(), (et, vl) -> ((TPicklist)et).setExpectqty1(ctl(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TPicklist)et).getExpectqty2(), (et, vl) -> ((TPicklist)et).setExpectqty2(ctl(vl)), "expectqty2");
        setupEpg(_epgMap, et -> ((TPicklist)et).getExpectqty3(), (et, vl) -> ((TPicklist)et).setExpectqty3(ctl(vl)), "expectqty3");
        setupEpg(_epgMap, et -> ((TPicklist)et).getPickedqty1(), (et, vl) -> ((TPicklist)et).setPickedqty1(ctl(vl)), "pickedqty1");
        setupEpg(_epgMap, et -> ((TPicklist)et).getPickedqty2(), (et, vl) -> ((TPicklist)et).setPickedqty2(ctl(vl)), "pickedqty2");
        setupEpg(_epgMap, et -> ((TPicklist)et).getPickedqty3(), (et, vl) -> ((TPicklist)et).setPickedqty3(ctl(vl)), "pickedqty3");
        setupEpg(_epgMap, et -> ((TPicklist)et).getSortrecievedqty1(), (et, vl) -> ((TPicklist)et).setSortrecievedqty1(ctl(vl)), "sortrecievedqty1");
        setupEpg(_epgMap, et -> ((TPicklist)et).getSortrecievedqty2(), (et, vl) -> ((TPicklist)et).setSortrecievedqty2(ctl(vl)), "sortrecievedqty2");
        setupEpg(_epgMap, et -> ((TPicklist)et).getSortrecievedqty3(), (et, vl) -> ((TPicklist)et).setSortrecievedqty3(ctl(vl)), "sortrecievedqty3");
        setupEpg(_epgMap, et -> ((TPicklist)et).getCenterId(), (et, vl) -> ((TPicklist)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getClientId(), (et, vl) -> ((TPicklist)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPicklist)et).getDelFlg(), (et, vl) -> ((TPicklist)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPicklist)et).getVersionNo(), (et, vl) -> ((TPicklist)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPicklist)et).getControlNo(), (et, vl) -> ((TPicklist)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPicklist)et).getAddDt(), (et, vl) -> ((TPicklist)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPicklist)et).getAddUser(), (et, vl) -> ((TPicklist)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPicklist)et).getAddProcess(), (et, vl) -> ((TPicklist)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPicklist)et).getUpdDt(), (et, vl) -> ((TPicklist)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPicklist)et).getUpdUser(), (et, vl) -> ((TPicklist)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPicklist)et).getUpdProcess(), (et, vl) -> ((TPicklist)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PICKLIST";
    protected final String _tableDispName = "T_PICKLIST";
    protected final String _tablePropertyName = "TPicklist";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PICKLIST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTPicklistId = cci("T_PICKLIST_ID", "T_PICKLIST_ID", null, null, Long.class, "TPicklistId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistkey = cci("PICKLISTKEY", "PICKLISTKEY", null, null, Long.class, "picklistkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkallocateid = cci("WORKALLOCATEID", "WORKALLOCATEID", null, null, Long.class, "workallocateid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloor = cci("FLOOR", "FLOOR", null, null, String.class, "floor", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnListkbn = cci("LISTKBN", "LISTKBN", null, null, String.class, "listkbn", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, Long.class, "noshippingflg", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickschdate = cci("PICKSCHDATE", "PICKSCHDATE", null, null, String.class, "pickschdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, Long.class, "expectqty1", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty2 = cci("EXPECTQTY2", "EXPECTQTY2", null, null, Long.class, "expectqty2", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty3 = cci("EXPECTQTY3", "EXPECTQTY3", null, null, Long.class, "expectqty3", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty1 = cci("PICKEDQTY1", "PICKEDQTY1", null, null, Long.class, "pickedqty1", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty2 = cci("PICKEDQTY2", "PICKEDQTY2", null, null, Long.class, "pickedqty2", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty3 = cci("PICKEDQTY3", "PICKEDQTY3", null, null, Long.class, "pickedqty3", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortrecievedqty1 = cci("SORTRECIEVEDQTY1", "SORTRECIEVEDQTY1", null, null, Long.class, "sortrecievedqty1", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortrecievedqty2 = cci("SORTRECIEVEDQTY2", "SORTRECIEVEDQTY2", null, null, Long.class, "sortrecievedqty2", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortrecievedqty3 = cci("SORTRECIEVEDQTY3", "SORTRECIEVEDQTY3", null, null, Long.class, "sortrecievedqty3", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * T_PICKLIST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTPicklistId() { return _columnTPicklistId; }
    /**
     * PICKLISTKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistkey() { return _columnPicklistkey; }
    /**
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkallocateid() { return _columnWorkallocateid; }
    /**
     * FLOOR: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloor() { return _columnFloor; }
    /**
     * LISTKBN: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnListkbn() { return _columnListkbn; }
    /**
     * LOCATION_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * NOSHIPPINGFLG: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * PICKSCHDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickschdate() { return _columnPickschdate; }
    /**
     * EXPECTQTY1: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * EXPECTQTY2: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty2() { return _columnExpectqty2; }
    /**
     * EXPECTQTY3: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty3() { return _columnExpectqty3; }
    /**
     * PICKEDQTY1: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty1() { return _columnPickedqty1; }
    /**
     * PICKEDQTY2: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty2() { return _columnPickedqty2; }
    /**
     * PICKEDQTY3: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty3() { return _columnPickedqty3; }
    /**
     * SORTRECIEVEDQTY1: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortrecievedqty1() { return _columnSortrecievedqty1; }
    /**
     * SORTRECIEVEDQTY2: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortrecievedqty2() { return _columnSortrecievedqty2; }
    /**
     * SORTRECIEVEDQTY3: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortrecievedqty3() { return _columnSortrecievedqty3; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnTPicklistId());
        ls.add(columnPicklistkey());
        ls.add(columnWorkallocateid());
        ls.add(columnFloor());
        ls.add(columnListkbn());
        ls.add(columnLocationId());
        ls.add(columnLotId());
        ls.add(columnProductId());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnOtherlot1());
        ls.add(columnNoshippingflg());
        ls.add(columnPickschdate());
        ls.add(columnExpectqty1());
        ls.add(columnExpectqty2());
        ls.add(columnExpectqty3());
        ls.add(columnPickedqty1());
        ls.add(columnPickedqty2());
        ls.add(columnPickedqty3());
        ls.add(columnSortrecievedqty1());
        ls.add(columnSortrecievedqty2());
        ls.add(columnSortrecievedqty3());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTPicklistId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPicklist"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPicklistCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPicklistBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPicklist> getEntityType() { return TPicklist.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPicklist newEntity() { return new TPicklist(); }
    public TPicklist newMyEntity() { return new TPicklist(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPicklist)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPicklist)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
