package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlMonthlyDesignChangeInfoMaster. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMonthlyDesignChangeInfoMasterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMonthlyDesignChangeInfoMasterDbm _instance = new SqlMonthlyDesignChangeInfoMasterDbm();
    private SqlMonthlyDesignChangeInfoMasterDbm() {}
    public static SqlMonthlyDesignChangeInfoMasterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getProductCd(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getProductNm(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getSotedunit(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setSotedunit((String)vl), "sotedunit");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getSotedunitNm(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setSotedunitNm((String)vl), "sotedunitNm");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getLimitdate(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getDesignflg(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setDesignflg((String)vl), "designflg");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getDesignflgNm(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setDesignflgNm((String)vl), "designflgNm");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getSotedloc(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setSotedloc((String)vl), "sotedloc");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getPicklistkey(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setPicklistkey(ctl(vl)), "picklistkey");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getPicklistgno(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setPicklistgno(ctl(vl)), "picklistgno");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getUpdDt(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getUpdUser(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getDelFlg(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getDelFlgNm(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setDelFlgNm((String)vl), "delFlgNm");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getMfmonthchgId(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setMfmonthchgId(ctl(vl)), "mfmonthchgId");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getVersionNo(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getCenterId(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlMonthlyDesignChangeInfoMaster)et).getSort(), (et, vl) -> ((SqlMonthlyDesignChangeInfoMaster)et).setSort(cti(vl)), "sort");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMonthlyDesignChangeInfoMaster";
    protected final String _tableDispName = "SqlMonthlyDesignChangeInfoMaster";
    protected final String _tablePropertyName = "sqlMonthlyDesignChangeInfoMaster";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMonthlyDesignChangeInfoMaster", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunit = cci("SOTEDUNIT", "SOTEDUNIT", null, null, String.class, "sotedunit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedunitNm = cci("SOTEDUNIT_NM", "SOTEDUNIT_NM", null, null, String.class, "sotedunitNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignflg = cci("DESIGNFLG", "DESIGNFLG", null, null, String.class, "designflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignflgNm = cci("DESIGNFLG_NM", "DESIGNFLG_NM", null, null, String.class, "designflgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSotedloc = cci("SOTEDLOC", "SOTEDLOC", null, null, String.class, "sotedloc", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistkey = cci("PICKLISTKEY", "PICKLISTKEY", null, null, Long.class, "picklistkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklistgno = cci("PICKLISTGNO", "PICKLISTGNO", null, null, Long.class, "picklistgno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnDelFlgNm = cci("DEL_FLG_NM", "DEL_FLG_NM", null, null, String.class, "delFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMfmonthchgId = cci("MFMONTHCHG_ID", "MFMONTHCHG_ID", null, null, Long.class, "mfmonthchgId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSort = cci("SORT", "SORT", null, null, Integer.class, "sort", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SOTEDUNIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunit() { return _columnSotedunit; }
    /**
     * SOTEDUNIT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedunitNm() { return _columnSotedunitNm; }
    /**
     * LIMITDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * DESIGNFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignflg() { return _columnDesignflg; }
    /**
     * DESIGNFLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignflgNm() { return _columnDesignflgNm; }
    /**
     * SOTEDLOC: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSotedloc() { return _columnSotedloc; }
    /**
     * PICKLISTKEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistkey() { return _columnPicklistkey; }
    /**
     * PICKLISTGNO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklistgno() { return _columnPicklistgno; }
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
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * DEL_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlgNm() { return _columnDelFlgNm; }
    /**
     * MFMONTHCHG_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfmonthchgId() { return _columnMfmonthchgId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * SORT: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSort() { return _columnSort; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnSotedunit());
        ls.add(columnSotedunitNm());
        ls.add(columnLimitdate());
        ls.add(columnDesignflg());
        ls.add(columnDesignflgNm());
        ls.add(columnSotedloc());
        ls.add(columnPicklistkey());
        ls.add(columnPicklistgno());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnDelFlg());
        ls.add(columnDelFlgNm());
        ls.add(columnMfmonthchgId());
        ls.add(columnVersionNo());
        ls.add(columnCenterId());
        ls.add(columnSort());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMonthlyDesignChangeInfoMaster"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMonthlyDesignChangeInfoMaster> getEntityType() { return SqlMonthlyDesignChangeInfoMaster.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMonthlyDesignChangeInfoMaster newEntity() { return new SqlMonthlyDesignChangeInfoMaster(); }
    public SqlMonthlyDesignChangeInfoMaster newMyEntity() { return new SqlMonthlyDesignChangeInfoMaster(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMonthlyDesignChangeInfoMaster)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMonthlyDesignChangeInfoMaster)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
