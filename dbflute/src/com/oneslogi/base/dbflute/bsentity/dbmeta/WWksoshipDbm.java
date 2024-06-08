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
 * The DB meta of W_WKSOSHIP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWksoshipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWksoshipDbm _instance = new WWksoshipDbm();
    private WWksoshipDbm() {}
    public static WWksoshipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWksoship)et).getWksoreceiveId(), (et, vl) -> ((WWksoship)et).setWksoreceiveId(ctl(vl)), "wksoreceiveId");
        setupEpg(_epgMap, et -> ((WWksoship)et).getSoKey(), (et, vl) -> ((WWksoship)et).setSoKey(ctl(vl)), "soKey");
        setupEpg(_epgMap, et -> ((WWksoship)et).getSolineno(), (et, vl) -> ((WWksoship)et).setSolineno(ctl(vl)), "solineno");
        setupEpg(_epgMap, et -> ((WWksoship)et).getPlno(), (et, vl) -> ((WWksoship)et).setPlno((String)vl), "plno");
        setupEpg(_epgMap, et -> ((WWksoship)et).getProductCd(), (et, vl) -> ((WWksoship)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWksoship)et).getLot4(), (et, vl) -> ((WWksoship)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWksoship)et).getPalletBarcode(), (et, vl) -> ((WWksoship)et).setPalletBarcode((String)vl), "palletBarcode");
        setupEpg(_epgMap, et -> ((WWksoship)et).getDelFlg(), (et, vl) -> ((WWksoship)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWksoship)et).getVersionNo(), (et, vl) -> ((WWksoship)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWksoship)et).getControlNo(), (et, vl) -> ((WWksoship)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWksoship)et).getAddDt(), (et, vl) -> ((WWksoship)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWksoship)et).getAddUser(), (et, vl) -> ((WWksoship)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWksoship)et).getAddProcess(), (et, vl) -> ((WWksoship)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWksoship)et).getUpdDt(), (et, vl) -> ((WWksoship)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWksoship)et).getUpdUser(), (et, vl) -> ((WWksoship)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWksoship)et).getUpdProcess(), (et, vl) -> ((WWksoship)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKSOSHIP";
    protected final String _tableDispName = "W_WKSOSHIP";
    protected final String _tablePropertyName = "WWksoship";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKSOSHIP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWksoreceiveId = cci("WKSORECEIVE_ID", "WKSORECEIVE_ID", null, null, Long.class, "wksoreceiveId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoKey = cci("SO_KEY", "SO_KEY", null, null, Long.class, "soKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSolineno = cci("SOLINENO", "SOLINENO", null, null, Long.class, "solineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlno = cci("PLNO", "PLNO", null, null, String.class, "plno", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletBarcode = cci("PALLET_BARCODE", "PALLET_BARCODE", null, null, String.class, "palletBarcode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * WKSORECEIVE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWksoreceiveId() { return _columnWksoreceiveId; }
    /**
     * SO_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoKey() { return _columnSoKey; }
    /**
     * SOLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSolineno() { return _columnSolineno; }
    /**
     * PLNO: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlno() { return _columnPlno; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * PALLET_BARCODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletBarcode() { return _columnPalletBarcode; }
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
        ls.add(columnWksoreceiveId());
        ls.add(columnSoKey());
        ls.add(columnSolineno());
        ls.add(columnPlno());
        ls.add(columnProductCd());
        ls.add(columnLot4());
        ls.add(columnPalletBarcode());
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
    protected UniqueInfo cpui() { return hpcpui(columnWksoreceiveId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWksoship"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWksoshipCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWksoshipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWksoship> getEntityType() { return WWksoship.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWksoship newEntity() { return new WWksoship(); }
    public WWksoship newMyEntity() { return new WWksoship(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWksoship)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWksoship)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
