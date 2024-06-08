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
 * The DB meta of T_TRIFDTLTRANS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrifdtltransDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrifdtltransDbm _instance = new TTrifdtltransDbm();
    private TTrifdtltransDbm() {}
    public static TTrifdtltransDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getTrifdtltransId(), (et, vl) -> ((TTrifdtltrans)et).setTrifdtltransId(ctl(vl)), "trifdtltransId");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getRefno(), (et, vl) -> ((TTrifdtltrans)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getReflineno(), (et, vl) -> ((TTrifdtltrans)et).setReflineno(ctl(vl)), "reflineno");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getShipcd(), (et, vl) -> ((TTrifdtltrans)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getShipschdate(), (et, vl) -> ((TTrifdtltrans)et).setShipschdate((String)vl), "shipschdate");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getShiptocd(), (et, vl) -> ((TTrifdtltrans)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getShiptoschdate(), (et, vl) -> ((TTrifdtltrans)et).setShiptoschdate((String)vl), "shiptoschdate");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getProductCd(), (et, vl) -> ((TTrifdtltrans)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getQty(), (et, vl) -> ((TTrifdtltrans)et).setQty(ctl(vl)), "qty");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getProductionym(), (et, vl) -> ((TTrifdtltrans)et).setProductionym((String)vl), "productionym");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getDesigncd(), (et, vl) -> ((TTrifdtltrans)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getQano(), (et, vl) -> ((TTrifdtltrans)et).setQano((String)vl), "qano");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getRcvpalletno(), (et, vl) -> ((TTrifdtltrans)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getFirmcarryno(), (et, vl) -> ((TTrifdtltrans)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getBatjproductionym(), (et, vl) -> ((TTrifdtltrans)et).setBatjproductionym((String)vl), "batjproductionym");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getSubwarehousecd(), (et, vl) -> ((TTrifdtltrans)et).setSubwarehousecd((String)vl), "subwarehousecd");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getResultflg(), (et, vl) -> ((TTrifdtltrans)et).setResultflg((String)vl), "resultflg");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getDelFlg(), (et, vl) -> ((TTrifdtltrans)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getVersionNo(), (et, vl) -> ((TTrifdtltrans)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getControlNo(), (et, vl) -> ((TTrifdtltrans)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getAddDt(), (et, vl) -> ((TTrifdtltrans)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getAddUser(), (et, vl) -> ((TTrifdtltrans)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getAddProcess(), (et, vl) -> ((TTrifdtltrans)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getUpdDt(), (et, vl) -> ((TTrifdtltrans)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getUpdUser(), (et, vl) -> ((TTrifdtltrans)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrifdtltrans)et).getUpdProcess(), (et, vl) -> ((TTrifdtltrans)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRIFDTLTRANS";
    protected final String _tableDispName = "T_TRIFDTLTRANS";
    protected final String _tablePropertyName = "TTrifdtltrans";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRIFDTLTRANS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrifdtltransId = cci("TRIFDTLTRANS_ID", "TRIFDTLTRANS_ID", null, null, Long.class, "trifdtltransId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("REFNO", "REFNO", null, null, String.class, "refno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReflineno = cci("REFLINENO", "REFLINENO", null, null, Long.class, "reflineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipschdate = cci("SHIPSCHDATE", "SHIPSCHDATE", null, null, String.class, "shipschdate", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("SHIPTOCD", "SHIPTOCD", null, null, String.class, "shiptocd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptoschdate = cci("SHIPTOSCHDATE", "SHIPTOSCHDATE", null, null, String.class, "shiptoschdate", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("QTY", "QTY", null, null, Long.class, "qty", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductionym = cci("PRODUCTIONYM", "PRODUCTIONYM", null, null, String.class, "productionym", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQano = cci("QANO", "QANO", null, null, String.class, "qano", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjproductionym = cci("BATJPRODUCTIONYM", "BATJPRODUCTIONYM", null, null, String.class, "batjproductionym", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubwarehousecd = cci("SUBWAREHOUSECD", "SUBWAREHOUSECD", null, null, String.class, "subwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResultflg = cci("RESULTFLG", "RESULTFLG", null, null, String.class, "resultflg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * TRIFDTLTRANS_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrifdtltransId() { return _columnTrifdtltransId; }
    /**
     * REFNO: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * REFLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReflineno() { return _columnReflineno; }
    /**
     * SHIPCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * SHIPSCHDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipschdate() { return _columnShipschdate; }
    /**
     * SHIPTOCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * SHIPTOSCHDATE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptoschdate() { return _columnShiptoschdate; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * QTY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * PRODUCTIONYM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductionym() { return _columnProductionym; }
    /**
     * DESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * QANO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQano() { return _columnQano; }
    /**
     * RCVPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * FIRMCARRYNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * BATJPRODUCTIONYM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjproductionym() { return _columnBatjproductionym; }
    /**
     * SUBWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubwarehousecd() { return _columnSubwarehousecd; }
    /**
     * RESULTFLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultflg() { return _columnResultflg; }
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
        ls.add(columnTrifdtltransId());
        ls.add(columnRefno());
        ls.add(columnReflineno());
        ls.add(columnShipcd());
        ls.add(columnShipschdate());
        ls.add(columnShiptocd());
        ls.add(columnShiptoschdate());
        ls.add(columnProductCd());
        ls.add(columnQty());
        ls.add(columnProductionym());
        ls.add(columnDesigncd());
        ls.add(columnQano());
        ls.add(columnRcvpalletno());
        ls.add(columnFirmcarryno());
        ls.add(columnBatjproductionym());
        ls.add(columnSubwarehousecd());
        ls.add(columnResultflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrifdtltransId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrifdtltrans"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrifdtltransCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrifdtltransBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrifdtltrans> getEntityType() { return TTrifdtltrans.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrifdtltrans newEntity() { return new TTrifdtltrans(); }
    public TTrifdtltrans newMyEntity() { return new TTrifdtltrans(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrifdtltrans)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrifdtltrans)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
