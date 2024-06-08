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
 * The DB meta of T_TRREVERSESTOCK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrreversestockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrreversestockDbm _instance = new TTrreversestockDbm();
    private TTrreversestockDbm() {}
    public static TTrreversestockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getTrreversestockId(), (et, vl) -> ((TTrreversestock)et).setTrreversestockId(ctl(vl)), "trreversestockId");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getTrcasestockdetailId(), (et, vl) -> ((TTrreversestock)et).setTrcasestockdetailId(ctl(vl)), "trcasestockdetailId");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getCenterSymbolId(), (et, vl) -> ((TTrreversestock)et).setCenterSymbolId(ctb(vl)), "centerSymbolId");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getSortstockdate(), (et, vl) -> ((TTrreversestock)et).setSortstockdate((String)vl), "sortstockdate");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getSortstockkbn(), (et, vl) -> ((TTrreversestock)et).setSortstockkbn((String)vl), "sortstockkbn");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getSotedunit(), (et, vl) -> ((TTrreversestock)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getSortloccd(), (et, vl) -> ((TTrreversestock)et).setSortloccd((String)vl), "sortloccd");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getProductCd(), (et, vl) -> ((TTrreversestock)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getStmanufacturedate(), (et, vl) -> ((TTrreversestock)et).setStmanufacturedate((String)vl), "stmanufacturedate");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getSomanufacturedate(), (et, vl) -> ((TTrreversestock)et).setSomanufacturedate((String)vl), "somanufacturedate");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getCenterId(), (et, vl) -> ((TTrreversestock)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getClientId(), (et, vl) -> ((TTrreversestock)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getDelFlg(), (et, vl) -> ((TTrreversestock)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getVersionNo(), (et, vl) -> ((TTrreversestock)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getControlNo(), (et, vl) -> ((TTrreversestock)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getAddDt(), (et, vl) -> ((TTrreversestock)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getAddUser(), (et, vl) -> ((TTrreversestock)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getAddProcess(), (et, vl) -> ((TTrreversestock)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getUpdDt(), (et, vl) -> ((TTrreversestock)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getUpdUser(), (et, vl) -> ((TTrreversestock)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrreversestock)et).getUpdProcess(), (et, vl) -> ((TTrreversestock)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrreversestock)et).getMCenter(), (et, vl) -> ((TTrreversestock)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrreversestock)et).getMClient(), (et, vl) -> ((TTrreversestock)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRREVERSESTOCK";
    protected final String _tableDispName = "T_TRREVERSESTOCK";
    protected final String _tablePropertyName = "TTrreversestock";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRREVERSESTOCK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrreversestockId = cci("TRREVERSESTOCK_ID", "TRREVERSESTOCK_ID", null, null, Long.class, "trreversestockId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrcasestockdetailId = cci("TRCASESTOCKDETAIL_ID", "TRCASESTOCKDETAIL_ID", null, null, Long.class, "trcasestockdetailId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterSymbolId = cci("CENTER_SYMBOL_ID", "CENTER_SYMBOL_ID", null, null, java.math.BigDecimal.class, "centerSymbolId", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortstockdate = cci("SORTSTOCKDATE", "SORTSTOCKDATE", null, null, String.class, "sortstockdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortstockkbn = cci("SORTSTOCKKBN", "SORTSTOCKKBN", null, null, String.class, "sortstockkbn", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortloccd = cci("SORTLOCCD", "SORTLOCCD", null, null, String.class, "sortloccd", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStmanufacturedate = cci("STMANUFACTUREDATE", "STMANUFACTUREDATE", null, null, String.class, "stmanufacturedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSomanufacturedate = cci("SOMANUFACTUREDATE", "SOMANUFACTUREDATE", null, null, String.class, "somanufacturedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRREVERSESTOCK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrreversestockId() { return _columnTrreversestockId; }
    /**
     * TRCASESTOCKDETAIL_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrcasestockdetailId() { return _columnTrcasestockdetailId; }
    /**
     * CENTER_SYMBOL_ID: {IX, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterSymbolId() { return _columnCenterSymbolId; }
    /**
     * SORTSTOCKDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortstockdate() { return _columnSortstockdate; }
    /**
     * SORTSTOCKKBN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortstockkbn() { return _columnSortstockkbn; }
    /**
     * SOTEDUNIT: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * SORTLOCCD: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortloccd() { return _columnSortloccd; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * STMANUFACTUREDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStmanufacturedate() { return _columnStmanufacturedate; }
    /**
     * SOMANUFACTUREDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSomanufacturedate() { return _columnSomanufacturedate; }
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
        ls.add(columnTrreversestockId());
        ls.add(columnTrcasestockdetailId());
        ls.add(columnCenterSymbolId());
        ls.add(columnSortstockdate());
        ls.add(columnSortstockkbn());
        ls.add(columnSotedunit());
        ls.add(columnSortloccd());
        ls.add(columnProductCd());
        ls.add(columnStmanufacturedate());
        ls.add(columnSomanufacturedate());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrreversestockId()); }
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
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRREVERSESTOCK_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrreversestockList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRREVERSESTOCK_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrreversestockList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrreversestock"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrreversestockCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrreversestockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrreversestock> getEntityType() { return TTrreversestock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrreversestock newEntity() { return new TTrreversestock(); }
    public TTrreversestock newMyEntity() { return new TTrreversestock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrreversestock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrreversestock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
