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
 * The DB meta of T_TRPALLETSYMBOLJT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletsymboljtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpalletsymboljtDbm _instance = new TTrpalletsymboljtDbm();
    private TTrpalletsymboljtDbm() {}
    public static TTrpalletsymboljtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getPalletIndividualInfoId(), (et, vl) -> ((TTrpalletsymboljt)et).setPalletIndividualInfoId(ctl(vl)), "palletIndividualInfoId");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getPalletsymbolkey(), (et, vl) -> ((TTrpalletsymboljt)et).setPalletsymbolkey(ctb(vl)), "palletsymbolkey");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getPalletkey(), (et, vl) -> ((TTrpalletsymboljt)et).setPalletkey((String)vl), "palletkey");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getSojtid(), (et, vl) -> ((TTrpalletsymboljt)et).setSojtid(ctb(vl)), "sojtid");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getSojtlineno(), (et, vl) -> ((TTrpalletsymboljt)et).setSojtlineno(ctl(vl)), "sojtlineno");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getOwnersono(), (et, vl) -> ((TTrpalletsymboljt)et).setOwnersono((String)vl), "ownersono");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getSopalletno(), (et, vl) -> ((TTrpalletsymboljt)et).setSopalletno((String)vl), "sopalletno");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getRcvid(), (et, vl) -> ((TTrpalletsymboljt)et).setRcvid(ctl(vl)), "rcvid");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getCenterSymbolId(), (et, vl) -> ((TTrpalletsymboljt)et).setCenterSymbolId(ctl(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getSortedqty1(), (et, vl) -> ((TTrpalletsymboljt)et).setSortedqty1(ctl(vl)), "sortedqty1");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getLotId(), (et, vl) -> ((TTrpalletsymboljt)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getPackedflg(), (et, vl) -> ((TTrpalletsymboljt)et).setPackedflg((String)vl), "packedflg");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getCenterId(), (et, vl) -> ((TTrpalletsymboljt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getClientId(), (et, vl) -> ((TTrpalletsymboljt)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getDelFlg(), (et, vl) -> ((TTrpalletsymboljt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getVersionNo(), (et, vl) -> ((TTrpalletsymboljt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getControlNo(), (et, vl) -> ((TTrpalletsymboljt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getAddDt(), (et, vl) -> ((TTrpalletsymboljt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getAddUser(), (et, vl) -> ((TTrpalletsymboljt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getAddProcess(), (et, vl) -> ((TTrpalletsymboljt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getUpdDt(), (et, vl) -> ((TTrpalletsymboljt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getUpdUser(), (et, vl) -> ((TTrpalletsymboljt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpalletsymboljt)et).getUpdProcess(), (et, vl) -> ((TTrpalletsymboljt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLETSYMBOLJT";
    protected final String _tableDispName = "T_TRPALLETSYMBOLJT";
    protected final String _tablePropertyName = "TTrpalletsymboljt";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLETSYMBOLJT", _tableDbName);
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
    protected final ColumnInfo _columnSojtid = cci("SOJTID", "SOJTID", null, null, java.math.BigDecimal.class, "sojtid", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSojtlineno = cci("SOJTLINENO", "SOJTLINENO", null, null, Long.class, "sojtlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnersono = cci("OWNERSONO", "OWNERSONO", null, null, String.class, "ownersono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSopalletno = cci("SOPALLETNO", "SOPALLETNO", null, null, String.class, "sopalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvid = cci("RCVID", "RCVID", null, null, Long.class, "rcvid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, Long.class, "centerSymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortedqty1 = cci("SORTEDQTY1", "SORTEDQTY1", null, null, Long.class, "sortedqty1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PALLETKEY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletkey() { return _columnPalletkey; }
    /**
     * SOJTID: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtid() { return _columnSojtid; }
    /**
     * SOJTLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtlineno() { return _columnSojtlineno; }
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
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
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
     * PACKEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackedflg() { return _columnPackedflg; }
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
        ls.add(columnPalletIndividualInfoId());
        ls.add(columnPalletsymbolkey());
        ls.add(columnPalletkey());
        ls.add(columnSojtid());
        ls.add(columnSojtlineno());
        ls.add(columnOwnersono());
        ls.add(columnSopalletno());
        ls.add(columnRcvid());
        ls.add(columnCenterSymbolId());
        ls.add(columnSortedqty1());
        ls.add(columnLotId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpalletsymboljt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpalletsymboljtCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpalletsymboljtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpalletsymboljt> getEntityType() { return TTrpalletsymboljt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpalletsymboljt newEntity() { return new TTrpalletsymboljt(); }
    public TTrpalletsymboljt newMyEntity() { return new TTrpalletsymboljt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpalletsymboljt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpalletsymboljt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
