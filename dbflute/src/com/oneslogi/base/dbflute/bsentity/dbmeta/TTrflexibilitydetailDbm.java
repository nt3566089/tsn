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
 * The DB meta of T_TRFLEXIBILITYDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrflexibilitydetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrflexibilitydetailDbm _instance = new TTrflexibilitydetailDbm();
    private TTrflexibilitydetailDbm() {}
    public static TTrflexibilitydetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getFlexibleTransportDetailInfoId(), (et, vl) -> ((TTrflexibilitydetail)et).setFlexibleTransportDetailInfoId(ctl(vl)), "flexibleTransportDetailInfoId");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getFlexibleTransportInfoId(), (et, vl) -> ((TTrflexibilitydetail)et).setFlexibleTransportInfoId(ctl(vl)), "flexibleTransportInfoId");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getFlexibitylineno(), (et, vl) -> ((TTrflexibilitydetail)et).setFlexibitylineno(ctb(vl)), "flexibitylineno");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getProductId(), (et, vl) -> ((TTrflexibilitydetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getStddifflg(), (et, vl) -> ((TTrflexibilitydetail)et).setStddifflg(ctb(vl)), "stddifflg");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getFlexpicklistno(), (et, vl) -> ((TTrflexibilitydetail)et).setFlexpicklistno((String)vl), "flexpicklistno");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getPrintedflg(), (et, vl) -> ((TTrflexibilitydetail)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getCompleteflg(), (et, vl) -> ((TTrflexibilitydetail)et).setCompleteflg(ctb(vl)), "completeflg");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getManufacturedate(), (et, vl) -> ((TTrflexibilitydetail)et).setManufacturedate((String)vl), "manufacturedate");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getDesigncd(), (et, vl) -> ((TTrflexibilitydetail)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getQtycase(), (et, vl) -> ((TTrflexibilitydetail)et).setQtycase(ctb(vl)), "qtycase");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getQtybowl(), (et, vl) -> ((TTrflexibilitydetail)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getHtqtycase(), (et, vl) -> ((TTrflexibilitydetail)et).setHtqtycase(ctb(vl)), "htqtycase");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getHtqtybowl(), (et, vl) -> ((TTrflexibilitydetail)et).setHtqtybowl(ctb(vl)), "htqtybowl");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getNvExtdata1(), (et, vl) -> ((TTrflexibilitydetail)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getCenterId(), (et, vl) -> ((TTrflexibilitydetail)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getClientId(), (et, vl) -> ((TTrflexibilitydetail)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getSoid(), (et, vl) -> ((TTrflexibilitydetail)et).setSoid(ctl(vl)), "soid");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getDelFlg(), (et, vl) -> ((TTrflexibilitydetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getVersionNo(), (et, vl) -> ((TTrflexibilitydetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getControlNo(), (et, vl) -> ((TTrflexibilitydetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getAddDt(), (et, vl) -> ((TTrflexibilitydetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getAddUser(), (et, vl) -> ((TTrflexibilitydetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getAddProcess(), (et, vl) -> ((TTrflexibilitydetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getUpdDt(), (et, vl) -> ((TTrflexibilitydetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getUpdUser(), (et, vl) -> ((TTrflexibilitydetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrflexibilitydetail)et).getUpdProcess(), (et, vl) -> ((TTrflexibilitydetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrflexibilitydetail)et).getTTrflexibility(), (et, vl) -> ((TTrflexibilitydetail)et).setTTrflexibility((TTrflexibility)vl), "TTrflexibility");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRFLEXIBILITYDETAIL";
    protected final String _tableDispName = "T_TRFLEXIBILITYDETAIL";
    protected final String _tablePropertyName = "TTrflexibilitydetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRFLEXIBILITYDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFlexibleTransportDetailInfoId = cci("FLEXIBLE_TRANSPORT_DETAIL_INFO_ID", "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID", null, null, Long.class, "flexibleTransportDetailInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexibleTransportInfoId = cci("FLEXIBLE_TRANSPORT_INFO_ID", "FLEXIBLE_TRANSPORT_INFO_ID", null, null, Long.class, "flexibleTransportInfoId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TTrflexibility", null, null, false);
    protected final ColumnInfo _columnFlexibitylineno = cci("FLEXIBITYLINENO", "FLEXIBITYLINENO", null, null, java.math.BigDecimal.class, "flexibitylineno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStddifflg = cci("STDDIFFLG", "STDDIFFLG", null, null, java.math.BigDecimal.class, "stddifflg", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexpicklistno = cci("FLEXPICKLISTNO", "FLEXPICKLISTNO", null, null, String.class, "flexpicklistno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompleteflg = cci("COMPLETEFLG", "COMPLETEFLG", null, null, java.math.BigDecimal.class, "completeflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturedate = cci("MANUFACTUREDATE", "MANUFACTUREDATE", null, null, String.class, "manufacturedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DESIGNCD", "DESIGNCD", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtycase = cci("QTYCASE", "QTYCASE", null, null, java.math.BigDecimal.class, "qtycase", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QTYBOWL", "QTYBOWL", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtqtycase = cci("HTQTYCASE", "HTQTYCASE", null, null, java.math.BigDecimal.class, "htqtycase", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtqtybowl = cci("HTQTYBOWL", "HTQTYBOWL", null, null, java.math.BigDecimal.class, "htqtybowl", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_EXTDATA1", "NV_EXTDATA1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoid = cci("SOID", "SOID", null, null, Long.class, "soid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibleTransportDetailInfoId() { return _columnFlexibleTransportDetailInfoId; }
    /**
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibleTransportInfoId() { return _columnFlexibleTransportInfoId; }
    /**
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibitylineno() { return _columnFlexibitylineno; }
    /**
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStddifflg() { return _columnStddifflg; }
    /**
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexpicklistno() { return _columnFlexpicklistno; }
    /**
     * PRINTEDFLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * COMPLETEFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompleteflg() { return _columnCompleteflg; }
    /**
     * MANUFACTUREDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturedate() { return _columnManufacturedate; }
    /**
     * DESIGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtycase() { return _columnQtycase; }
    /**
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtqtycase() { return _columnHtqtycase; }
    /**
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtqtybowl() { return _columnHtqtybowl; }
    /**
     * NV_EXTDATA1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SOID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoid() { return _columnSoid; }
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
        ls.add(columnFlexibleTransportDetailInfoId());
        ls.add(columnFlexibleTransportInfoId());
        ls.add(columnFlexibitylineno());
        ls.add(columnProductId());
        ls.add(columnStddifflg());
        ls.add(columnFlexpicklistno());
        ls.add(columnPrintedflg());
        ls.add(columnCompleteflg());
        ls.add(columnManufacturedate());
        ls.add(columnDesigncd());
        ls.add(columnQtycase());
        ls.add(columnQtybowl());
        ls.add(columnHtqtycase());
        ls.add(columnHtqtybowl());
        ls.add(columnNvExtdata1());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnSoid());
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
    protected UniqueInfo cpui() { return hpcpui(columnFlexibleTransportDetailInfoId()); }
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
     * T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTTrflexibility() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFlexibleTransportInfoId(), TTrflexibilityDbm.getInstance().columnFlexibleTransportInfoId());
        return cfi("T_TRFLEXIBILITYDETAIL_FK1", "TTrflexibility", this, TTrflexibilityDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrflexibilitydetailList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrflexibilitydetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrflexibilitydetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrflexibilitydetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrflexibilitydetail> getEntityType() { return TTrflexibilitydetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrflexibilitydetail newEntity() { return new TTrflexibilitydetail(); }
    public TTrflexibilitydetail newMyEntity() { return new TTrflexibilitydetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrflexibilitydetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrflexibilitydetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
