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
 * The DB meta of T_TRPALLETSYMBOL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletsymbolDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpalletsymbolDbm _instance = new TTrpalletsymbolDbm();
    private TTrpalletsymbolDbm() {}
    public static TTrpalletsymbolDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getPalletIndividualInfoId(), (et, vl) -> ((TTrpalletsymbol)et).setPalletIndividualInfoId(ctl(vl)), "palletIndividualInfoId");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getPalletsymbolkey(), (et, vl) -> ((TTrpalletsymbol)et).setPalletsymbolkey(ctb(vl)), "palletsymbolkey");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getPalletkey(), (et, vl) -> ((TTrpalletsymbol)et).setPalletkey((String)vl), "palletkey");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getSoid(), (et, vl) -> ((TTrpalletsymbol)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getSodetailid(), (et, vl) -> ((TTrpalletsymbol)et).setSodetailid(ctl(vl)), "sodetailid");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getOwnersono(), (et, vl) -> ((TTrpalletsymbol)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getSopalletno(), (et, vl) -> ((TTrpalletsymbol)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getRcvid(), (et, vl) -> ((TTrpalletsymbol)et).setRcvid(ctl(vl)), "rcvid");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getCenterSymbolId(), (et, vl) -> ((TTrpalletsymbol)et).setCenterSymbolId(ctl(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getSortedqty1(), (et, vl) -> ((TTrpalletsymbol)et).setSortedqty1(ctl(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getLotId(), (et, vl) -> ((TTrpalletsymbol)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getPalletsymbolprintflg(), (et, vl) -> ((TTrpalletsymbol)et).setPalletsymbolprintflg(ctb(vl)), "palletsymbolprintflg");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getPackedflg(), (et, vl) -> ((TTrpalletsymbol)et).setPackedflg((String)vl), "packedflg");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getCenterId(), (et, vl) -> ((TTrpalletsymbol)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getClientId(), (et, vl) -> ((TTrpalletsymbol)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getDelFlg(), (et, vl) -> ((TTrpalletsymbol)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getVersionNo(), (et, vl) -> ((TTrpalletsymbol)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getControlNo(), (et, vl) -> ((TTrpalletsymbol)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getAddDt(), (et, vl) -> ((TTrpalletsymbol)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getAddUser(), (et, vl) -> ((TTrpalletsymbol)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getAddProcess(), (et, vl) -> ((TTrpalletsymbol)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getUpdDt(), (et, vl) -> ((TTrpalletsymbol)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getUpdUser(), (et, vl) -> ((TTrpalletsymbol)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpalletsymbol)et).getUpdProcess(), (et, vl) -> ((TTrpalletsymbol)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLETSYMBOL";
    protected final String _tableDispName = "T_TRPALLETSYMBOL";
    protected final String _tablePropertyName = "TTrpalletsymbol";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLETSYMBOL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPalletIndividualInfoId = cci("PALLET_INDIVIDUAL_INFO_ID", "PALLET_INDIVIDUAL_INFO_ID", null, null, Long.class, "palletIndividualInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsymbolkey = cci("PALLETSYMBOLKEY", "PALLETSYMBOLKEY", null, null, java.math.BigDecimal.class, "palletsymbolkey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletkey = cci("PALLETKEY", "PALLETKEY", null, null, String.class, "palletkey", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSodetailid = cci("SODETAILID", "SODETAILID", null, null, Long.class, "sodetailid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvid = cci("RCVID", "RCVID", null, null, Long.class, "rcvid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, Long.class, "centerSymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, Long.class, "sortedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsymbolprintflg = cci("PALLETSYMBOLPRINTFLG", "PALLETSYMBOLPRINTFLG", null, null, java.math.BigDecimal.class, "palletsymbolprintflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackedflg = cci("PACKEDFLG", "PACKEDFLG", null, null, String.class, "packedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * PALLET_INDIVIDUAL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletIndividualInfoId() { return _columnPalletIndividualInfoId; }
    /**
     * PALLETSYMBOLKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletsymbolkey() { return _columnPalletsymbolkey; }
    /**
     * PALLETKEY: {IX+, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletkey() { return _columnPalletkey; }
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
     * OWNERSONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnersono() { return _columnOwnersono; }
    /**
     * SOPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSopalletno() { return _columnSopalletno; }
    /**
     * RCVID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvid() { return _columnRcvid; }
    /**
     * CENTER_SYMBOL_ID: {IX+, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * SORTEDQTY1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortedqty1() { return _columnSortedqty1; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PALLETSYMBOLPRINTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletsymbolprintflg() { return _columnPalletsymbolprintflg; }
    /**
     * PACKEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedflg() { return _columnPackedflg; }
    /**
     * CENTER_ID: {IX+, NotNull, bigint(19)}
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
        ls.add(columnPalletIndividualInfoId());
        ls.add(columnPalletsymbolkey());
        ls.add(columnPalletkey());
        ls.add(columnSoid());
        ls.add(columnSodetailid());
        ls.add(columnOwnersono());
        ls.add(columnSopalletno());
        ls.add(columnRcvid());
        ls.add(columnCenterSymbolId());
        ls.add(columnSortedqty1());
        ls.add(columnLotId());
        ls.add(columnPalletsymbolprintflg());
        ls.add(columnPackedflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnPalletIndividualInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpalletsymbol"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpalletsymbolCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpalletsymbolBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpalletsymbol> getEntityType() { return TTrpalletsymbol.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpalletsymbol newEntity() { return new TTrpalletsymbol(); }
    public TTrpalletsymbol newMyEntity() { return new TTrpalletsymbol(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpalletsymbol)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpalletsymbol)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
