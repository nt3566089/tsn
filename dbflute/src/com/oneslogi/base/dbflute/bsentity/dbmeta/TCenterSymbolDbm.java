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
 * The DB meta of T_CENTER_SYMBOL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCenterSymbolDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCenterSymbolDbm _instance = new TCenterSymbolDbm();
    private TCenterSymbolDbm() {}
    public static TCenterSymbolDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getCenterSymbolId(), (et, vl) -> ((TCenterSymbol)et).setCenterSymbolId(ctl(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getCenterId(), (et, vl) -> ((TCenterSymbol)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getClientId(), (et, vl) -> ((TCenterSymbol)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getPalletId(), (et, vl) -> ((TCenterSymbol)et).setPalletId(ctl(vl)), "palletId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getTrsymbolId(), (et, vl) -> ((TCenterSymbol)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getChildCenterSymbolId(), (et, vl) -> ((TCenterSymbol)et).setChildCenterSymbolId(ctl(vl)), "childCenterSymbolId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getSortstockNumber(), (et, vl) -> ((TCenterSymbol)et).setSortstockNumber(ctl(vl)), "sortstockNumber");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getQrCode(), (et, vl) -> ((TCenterSymbol)et).setQrCode((String)vl), "qrCode");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getLotId(), (et, vl) -> ((TCenterSymbol)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getCaseMoveSts(), (et, vl) -> ((TCenterSymbol)et).setCaseMoveSts((String)vl), "caseMoveSts");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getDelFlg(), (et, vl) -> ((TCenterSymbol)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getVersionNo(), (et, vl) -> ((TCenterSymbol)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getControlNo(), (et, vl) -> ((TCenterSymbol)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getAddDt(), (et, vl) -> ((TCenterSymbol)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getAddUser(), (et, vl) -> ((TCenterSymbol)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getAddProcess(), (et, vl) -> ((TCenterSymbol)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getUpdDt(), (et, vl) -> ((TCenterSymbol)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getUpdUser(), (et, vl) -> ((TCenterSymbol)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCenterSymbol)et).getUpdProcess(), (et, vl) -> ((TCenterSymbol)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TCenterSymbol)et).getMCenter(), (et, vl) -> ((TCenterSymbol)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TCenterSymbol)et).getTCenterSymbolSelf(), (et, vl) -> ((TCenterSymbol)et).setTCenterSymbolSelf((TCenterSymbol)vl), "TCenterSymbolSelf");
        setupEfpg(_efpgMap, et -> ((TCenterSymbol)et).getMClient(), (et, vl) -> ((TCenterSymbol)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TCenterSymbol)et).getTTrsymbol(), (et, vl) -> ((TCenterSymbol)et).setTTrsymbol((TTrsymbol)vl), "TTrsymbol");
        setupEfpg(_efpgMap, et -> ((TCenterSymbol)et).getTPallet(), (et, vl) -> ((TCenterSymbol)et).setTPallet((TPallet)vl), "TPallet");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CENTER_SYMBOL";
    protected final String _tableDispName = "T_CENTER_SYMBOL";
    protected final String _tablePropertyName = "TCenterSymbol";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CENTER_SYMBOL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, Long.class, "centerSymbolId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TCenterSymbolSelfList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnPalletId = cci("PALLET_ID", "PALLET_ID", null, null, Long.class, "palletId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPallet", null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TTrsymbol", null, null, false);
    protected final ColumnInfo _columnChildCenterSymbolId = cci("CHILD_CENTER_SYMBOL_ID", "CHILD_CENTER_SYMBOL_ID", null, null, Long.class, "childCenterSymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TCenterSymbolSelf", null, null, false);
    protected final ColumnInfo _columnSortstockNumber = cci("SORTSTOCK_NUMBER", "SORTSTOCK_NUMBER", null, null, Long.class, "sortstockNumber", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQrCode = cci("QR_CODE", "QR_CODE", null, null, String.class, "qrCode", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseMoveSts = cci("CASE_MOVE_STS", "CASE_MOVE_STS", null, null, String.class, "caseMoveSts", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_SYMBOL_ID: {PK, ID, UQ+, IX, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PALLET_ID: {bigint(19), FK to T_PALLET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletId() { return _columnPalletId; }
    /**
     * TRSYMBOL_ID: {bigint(19), FK to T_TRSYMBOL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * CHILD_CENTER_SYMBOL_ID: {bigint(19), FK to T_CENTER_SYMBOL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChildCenterSymbolId() { return _columnChildCenterSymbolId; }
    /**
     * SORTSTOCK_NUMBER: {+UQ, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortstockNumber() { return _columnSortstockNumber; }
    /**
     * QR_CODE: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQrCode() { return _columnQrCode; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * CASE_MOVE_STS: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseMoveSts() { return _columnCaseMoveSts; }
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
        ls.add(columnCenterSymbolId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnPalletId());
        ls.add(columnTrsymbolId());
        ls.add(columnChildCenterSymbolId());
        ls.add(columnSortstockNumber());
        ls.add(columnQrCode());
        ls.add(columnLotId());
        ls.add(columnCaseMoveSts());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterSymbolId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterSymbolId());
        ls.add(columnSortstockNumber());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_CENTER_SYMBOL_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TCenterSymbolList", false);
    }
    /**
     * T_CENTER_SYMBOL by my CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTCenterSymbolSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnChildCenterSymbolId(), TCenterSymbolDbm.getInstance().columnCenterSymbolId());
        return cfi("T_CENTER_SYMBOL_FK4", "TCenterSymbolSelf", this, TCenterSymbolDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TCenterSymbolSelfList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_CENTER_SYMBOL_FK5", "MClient", this, MClientDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TCenterSymbolList", false);
    }
    /**
     * T_TRSYMBOL by my TRSYMBOL_ID, named 'TTrsymbol'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrsymbol() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrsymbolId(), TTrsymbolDbm.getInstance().columnTrsymbolId());
        return cfi("T_CENTER_SYMBOL_FK3", "TTrsymbol", this, TTrsymbolDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TCenterSymbolList", false);
    }
    /**
     * T_PALLET by my PALLET_ID, named 'TPallet'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPallet() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPalletId(), TPalletDbm.getInstance().columnPalletId());
        return cfi("T_CENTER_SYMBOL_FK2", "TPallet", this, TPalletDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TCenterSymbolList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCenterSymbolSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterSymbolId(), TCenterSymbolDbm.getInstance().columnChildCenterSymbolId());
        return cri("T_CENTER_SYMBOL_FK4", "TCenterSymbolSelfList", this, TCenterSymbolDbm.getInstance(), mp, false, "TCenterSymbolSelf");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCenterSymbol"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCenterSymbolCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCenterSymbolBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCenterSymbol> getEntityType() { return TCenterSymbol.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCenterSymbol newEntity() { return new TCenterSymbol(); }
    public TCenterSymbol newMyEntity() { return new TCenterSymbol(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCenterSymbol)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCenterSymbol)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
