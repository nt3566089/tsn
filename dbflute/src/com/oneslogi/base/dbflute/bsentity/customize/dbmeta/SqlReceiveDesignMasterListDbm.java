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
 * The DB meta of SqlReceiveDesignMasterList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlReceiveDesignMasterListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlReceiveDesignMasterListDbm _instance = new SqlReceiveDesignMasterListDbm();
    private SqlReceiveDesignMasterListDbm() {}
    public static SqlReceiveDesignMasterListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getMfrcvdesignId(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setMfrcvdesignId(ctl(vl)), "mfrcvdesignId");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getProductCd(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getProductNm(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getRcvfrdate(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setRcvfrdate((String)vl), "rcvfrdate");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getRcvtodate(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setRcvtodate((String)vl), "rcvtodate");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getValidtype(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getValidTypeNm(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setValidTypeNm((String)vl), "validTypeNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDistributioncd(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDistributioncd((String)vl), "distributioncd");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDistributionCdNm(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDistributionCdNm((String)vl), "distributionCdNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDesignflg(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDesignflg((String)vl), "designflg");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDesignFlgNm(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDesignFlgNm((String)vl), "designFlgNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDelFlg(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getDelFlgNm(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setDelFlgNm((String)vl), "delFlgNm");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getAddDt(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getAddUser(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getUpdDt(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getUpdUser(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((SqlReceiveDesignMasterList)et).getUsernum3(), (et, vl) -> ((SqlReceiveDesignMasterList)et).setUsernum3(ctl(vl)), "usernum3");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlReceiveDesignMasterList";
    protected final String _tableDispName = "SqlReceiveDesignMasterList";
    protected final String _tablePropertyName = "sqlReceiveDesignMasterList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlReceiveDesignMasterList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfrcvdesignId = cci("MFRCVDESIGN_ID", "MFRCVDESIGN_ID", null, null, Long.class, "mfrcvdesignId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvfrdate = cci("RCVFRDATE", "RCVFRDATE", null, null, String.class, "rcvfrdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtodate = cci("RCVTODATE", "RCVTODATE", null, null, String.class, "rcvtodate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtype = cci("VALIDTYPE", "VALIDTYPE", null, null, String.class, "validtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidTypeNm = cci("VALID_TYPE_NM", "VALID_TYPE_NM", null, null, String.class, "validTypeNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributioncd = cci("DISTRIBUTIONCD", "DISTRIBUTIONCD", null, null, String.class, "distributioncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistributionCdNm = cci("DISTRIBUTION_CD_NM", "DISTRIBUTION_CD_NM", null, null, String.class, "distributionCdNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignflg = cci("DESIGNFLG", "DESIGNFLG", null, null, String.class, "designflg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlgNm = cci("DESIGN_FLG_NM", "DESIGN_FLG_NM", null, null, String.class, "designFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnDelFlgNm = cci("DEL_FLG_NM", "DEL_FLG_NM", null, null, String.class, "delFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * MFRCVDESIGN_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfrcvdesignId() { return _columnMfrcvdesignId; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * RCVFRDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvfrdate() { return _columnRcvfrdate; }
    /**
     * RCVTODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtodate() { return _columnRcvtodate; }
    /**
     * VALIDTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtype() { return _columnValidtype; }
    /**
     * VALID_TYPE_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidTypeNm() { return _columnValidTypeNm; }
    /**
     * DISTRIBUTIONCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributioncd() { return _columnDistributioncd; }
    /**
     * DISTRIBUTION_CD_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributionCdNm() { return _columnDistributionCdNm; }
    /**
     * DESIGNFLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignflg() { return _columnDesignflg; }
    /**
     * DESIGN_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlgNm() { return _columnDesignFlgNm; }
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
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfrcvdesignId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnRcvfrdate());
        ls.add(columnRcvtodate());
        ls.add(columnValidtype());
        ls.add(columnValidTypeNm());
        ls.add(columnDistributioncd());
        ls.add(columnDistributionCdNm());
        ls.add(columnDesignflg());
        ls.add(columnDesignFlgNm());
        ls.add(columnDelFlg());
        ls.add(columnDelFlgNm());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUsernum3());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlReceiveDesignMasterList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlReceiveDesignMasterList> getEntityType() { return SqlReceiveDesignMasterList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlReceiveDesignMasterList newEntity() { return new SqlReceiveDesignMasterList(); }
    public SqlReceiveDesignMasterList newMyEntity() { return new SqlReceiveDesignMasterList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlReceiveDesignMasterList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlReceiveDesignMasterList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
