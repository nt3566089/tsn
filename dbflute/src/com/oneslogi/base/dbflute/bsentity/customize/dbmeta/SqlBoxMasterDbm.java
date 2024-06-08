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
 * The DB meta of SqlBoxMaster. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlBoxMasterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlBoxMasterDbm _instance = new SqlBoxMasterDbm();
    private SqlBoxMasterDbm() {}
    public static SqlBoxMasterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBoxCd(), (et, vl) -> ((SqlBoxMaster)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBoxNm(), (et, vl) -> ((SqlBoxMaster)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBoxType(), (et, vl) -> ((SqlBoxMaster)et).setBoxType((String)vl), "boxType");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBoxTypeNm(), (et, vl) -> ((SqlBoxMaster)et).setBoxTypeNm((String)vl), "boxTypeNm");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBxweight(), (et, vl) -> ((SqlBoxMaster)et).setBxweight(ctb(vl)), "bxweight");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBxoszl(), (et, vl) -> ((SqlBoxMaster)et).setBxoszl(ctl(vl)), "bxoszl");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBxoszw(), (et, vl) -> ((SqlBoxMaster)et).setBxoszw(ctl(vl)), "bxoszw");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBxoszh(), (et, vl) -> ((SqlBoxMaster)et).setBxoszh(ctl(vl)), "bxoszh");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getLength(), (et, vl) -> ((SqlBoxMaster)et).setLength(ctb(vl)), "length");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getWidth(), (et, vl) -> ((SqlBoxMaster)et).setWidth(ctb(vl)), "width");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getHeight(), (et, vl) -> ((SqlBoxMaster)et).setHeight(ctb(vl)), "height");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBxcpy(), (et, vl) -> ((SqlBoxMaster)et).setBxcpy(ctb(vl)), "bxcpy");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getVolumeRate(), (et, vl) -> ((SqlBoxMaster)et).setVolumeRate(ctl(vl)), "volumeRate");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getDelFlg(), (et, vl) -> ((SqlBoxMaster)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getDelFlgNm(), (et, vl) -> ((SqlBoxMaster)et).setDelFlgNm((String)vl), "delFlgNm");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getVersionNo(), (et, vl) -> ((SqlBoxMaster)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getBoxId(), (et, vl) -> ((SqlBoxMaster)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((SqlBoxMaster)et).getCenterId(), (et, vl) -> ((SqlBoxMaster)et).setCenterId(ctl(vl)), "centerId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlBoxMaster";
    protected final String _tableDispName = "SqlBoxMaster";
    protected final String _tablePropertyName = "sqlBoxMaster";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlBoxMaster", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxType = cci("BOX_TYPE", "BOX_TYPE", null, null, String.class, "boxType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxTypeNm = cci("BOX_TYPE_NM", "BOX_TYPE_NM", null, null, String.class, "boxTypeNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxweight = cci("BXWEIGHT", "BXWEIGHT", null, null, java.math.BigDecimal.class, "bxweight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszl = cci("BXOSZL", "BXOSZL", null, null, Long.class, "bxoszl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszw = cci("BXOSZW", "BXOSZW", null, null, Long.class, "bxoszw", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszh = cci("BXOSZH", "BXOSZH", null, null, Long.class, "bxoszh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, java.math.BigDecimal.class, "length", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, java.math.BigDecimal.class, "width", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, java.math.BigDecimal.class, "height", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxcpy = cci("BXCPY", "BXCPY", null, null, java.math.BigDecimal.class, "bxcpy", null, false, false, false, "float", 15, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolumeRate = cci("VOLUME_RATE", "VOLUME_RATE", null, null, Long.class, "volumeRate", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnDelFlgNm = cci("DEL_FLG_NM", "DEL_FLG_NM", null, null, String.class, "delFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * BOX_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * BOX_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxType() { return _columnBoxType; }
    /**
     * BOX_TYPE_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxTypeNm() { return _columnBoxTypeNm; }
    /**
     * BXWEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxweight() { return _columnBxweight; }
    /**
     * BXOSZL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszl() { return _columnBxoszl; }
    /**
     * BXOSZW: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszw() { return _columnBxoszw; }
    /**
     * BXOSZH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszh() { return _columnBxoszh; }
    /**
     * LENGTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * BXCPY: {float(15)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxcpy() { return _columnBxcpy; }
    /**
     * VOLUME_RATE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolumeRate() { return _columnVolumeRate; }
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
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * BOX_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnBoxType());
        ls.add(columnBoxTypeNm());
        ls.add(columnBxweight());
        ls.add(columnBxoszl());
        ls.add(columnBxoszw());
        ls.add(columnBxoszh());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnBxcpy());
        ls.add(columnVolumeRate());
        ls.add(columnDelFlg());
        ls.add(columnDelFlgNm());
        ls.add(columnVersionNo());
        ls.add(columnBoxId());
        ls.add(columnCenterId());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlBoxMaster"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlBoxMaster> getEntityType() { return SqlBoxMaster.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlBoxMaster newEntity() { return new SqlBoxMaster(); }
    public SqlBoxMaster newMyEntity() { return new SqlBoxMaster(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlBoxMaster)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlBoxMaster)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
