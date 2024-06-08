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
 * The DB meta of T_TRSOJTDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsojtdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsojtdetailDbm _instance = new TTrsojtdetailDbm();
    private TTrsojtdetailDbm() {}
    public static TTrsojtdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getSojtlineid(), (et, vl) -> ((TTrsojtdetail)et).setSojtlineid(ctl(vl)), "sojtlineid");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getSojtid(), (et, vl) -> ((TTrsojtdetail)et).setSojtid(ctl(vl)), "sojtid");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getSojtlineno(), (et, vl) -> ((TTrsojtdetail)et).setSojtlineno(ctl(vl)), "sojtlineno");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getDatatype(), (et, vl) -> ((TTrsojtdetail)et).setDatatype((String)vl), "datatype");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlanseq(), (et, vl) -> ((TTrsojtdetail)et).setPlanseq(ctl(vl)), "planseq");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getProductId(), (et, vl) -> ((TTrsojtdetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getLot3(), (et, vl) -> ((TTrsojtdetail)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getLot4(), (et, vl) -> ((TTrsojtdetail)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getExpectqty1(), (et, vl) -> ((TTrsojtdetail)et).setExpectqty1(ctl(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPickedqty1(), (et, vl) -> ((TTrsojtdetail)et).setPickedqty1(ctl(vl)), "pickedqty1");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPoid(), (et, vl) -> ((TTrsojtdetail)et).setPoid((String)vl), "poid");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPalletId(), (et, vl) -> ((TTrsojtdetail)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getLocationId(), (et, vl) -> ((TTrsojtdetail)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getLotId(), (et, vl) -> ((TTrsojtdetail)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getSoid(), (et, vl) -> ((TTrsojtdetail)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getSodetailid(), (et, vl) -> ((TTrsojtdetail)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getTrsoaddflg(), (et, vl) -> ((TTrsojtdetail)et).setTrsoaddflg((String)vl), "trsoaddflg");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlanoutseq(), (et, vl) -> ((TTrsojtdetail)et).setPlanoutseq((String)vl), "planoutseq");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlanprice1(), (et, vl) -> ((TTrsojtdetail)et).setPlanprice1((String)vl), "planprice1");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlanprice2(), (et, vl) -> ((TTrsojtdetail)et).setPlanprice2((String)vl), "planprice2");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlanitemname(), (et, vl) -> ((TTrsojtdetail)et).setPlanitemname((String)vl), "planitemname");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlandata1(), (et, vl) -> ((TTrsojtdetail)et).setPlandata1((String)vl), "plandata1");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlandata2(), (et, vl) -> ((TTrsojtdetail)et).setPlandata2((String)vl), "plandata2");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getPlandata3(), (et, vl) -> ((TTrsojtdetail)et).setPlandata3((String)vl), "plandata3");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getDelFlg(), (et, vl) -> ((TTrsojtdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getVersionNo(), (et, vl) -> ((TTrsojtdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getControlNo(), (et, vl) -> ((TTrsojtdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getAddDt(), (et, vl) -> ((TTrsojtdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getAddUser(), (et, vl) -> ((TTrsojtdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getAddProcess(), (et, vl) -> ((TTrsojtdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getUpdDt(), (et, vl) -> ((TTrsojtdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getUpdUser(), (et, vl) -> ((TTrsojtdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsojtdetail)et).getUpdProcess(), (et, vl) -> ((TTrsojtdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSOJTDETAIL";
    protected final String _tableDispName = "T_TRSOJTDETAIL";
    protected final String _tablePropertyName = "TTrsojtdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSOJTDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSojtlineid = cci("SOJTLINEID", "SOJTLINEID", null, null, Long.class, "sojtlineid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtid = cci("SOJTID", "SOJTID", null, null, Long.class, "sojtid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtlineno = cci("SOJTLINENO", "SOJTLINENO", null, null, Long.class, "sojtlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDatatype = cci("DATATYPE", "DATATYPE", null, null, String.class, "datatype", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanseq = cci("PLANSEQ", "PLANSEQ", null, null, Long.class, "planseq", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, Long.class, "expectqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickedqty1 = cci("PICKEDQTY1", "PICKEDQTY1", null, null, Long.class, "pickedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPoid = cci("POID", "POID", null, null, String.class, "poid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsoaddflg = cci("TRSOADDFLG", "TRSOADDFLG", null, null, String.class, "trsoaddflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanoutseq = cci("PLANOUTSEQ", "PLANOUTSEQ", null, null, String.class, "planoutseq", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanprice1 = cci("PLANPRICE1", "PLANPRICE1", null, null, String.class, "planprice1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanprice2 = cci("PLANPRICE2", "PLANPRICE2", null, null, String.class, "planprice2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanitemname = cci("PLANITEMNAME", "PLANITEMNAME", null, null, String.class, "planitemname", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlandata1 = cci("PLANDATA1", "PLANDATA1", null, null, String.class, "plandata1", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlandata2 = cci("PLANDATA2", "PLANDATA2", null, null, String.class, "plandata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlandata3 = cci("PLANDATA3", "PLANDATA3", null, null, String.class, "plandata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtlineid() { return _columnSojtlineid; }
    /**
     * SOJTID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtid() { return _columnSojtid; }
    /**
     * SOJTLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtlineno() { return _columnSojtlineno; }
    /**
     * DATATYPE: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDatatype() { return _columnDatatype; }
    /**
     * PLANSEQ: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanseq() { return _columnPlanseq; }
    /**
     * PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * EXPECTQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * PICKEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedqty1() { return _columnPickedqty1; }
    /**
     * POID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPoid() { return _columnPoid; }
    /**
     * PALLET_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
    /**
     * SODETAILID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSodetailid() { return _columnSodetailid; }
    /**
     * TRSOADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsoaddflg() { return _columnTrsoaddflg; }
    /**
     * PLANOUTSEQ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanoutseq() { return _columnPlanoutseq; }
    /**
     * PLANPRICE1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanprice1() { return _columnPlanprice1; }
    /**
     * PLANPRICE2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanprice2() { return _columnPlanprice2; }
    /**
     * PLANITEMNAME: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanitemname() { return _columnPlanitemname; }
    /**
     * PLANDATA1: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlandata1() { return _columnPlandata1; }
    /**
     * PLANDATA2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlandata2() { return _columnPlandata2; }
    /**
     * PLANDATA3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlandata3() { return _columnPlandata3; }
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
        ls.add(columnSojtlineid());
        ls.add(columnSojtid());
        ls.add(columnSojtlineno());
        ls.add(columnDatatype());
        ls.add(columnPlanseq());
        ls.add(columnProductId());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnExpectqty1());
        ls.add(columnPickedqty1());
        ls.add(columnPoid());
        ls.add(columnPalletId());
        ls.add(columnLocationId());
        ls.add(columnLotId());
        ls.add(columnSoid());
        ls.add(columnSodetailid());
        ls.add(columnTrsoaddflg());
        ls.add(columnPlanoutseq());
        ls.add(columnPlanprice1());
        ls.add(columnPlanprice2());
        ls.add(columnPlanitemname());
        ls.add(columnPlandata1());
        ls.add(columnPlandata2());
        ls.add(columnPlandata3());
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
    protected UniqueInfo cpui() { return hpcpui(columnSojtlineid()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsojtdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsojtdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsojtdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsojtdetail> getEntityType() { return TTrsojtdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsojtdetail newEntity() { return new TTrsojtdetail(); }
    public TTrsojtdetail newMyEntity() { return new TTrsojtdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsojtdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsojtdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
