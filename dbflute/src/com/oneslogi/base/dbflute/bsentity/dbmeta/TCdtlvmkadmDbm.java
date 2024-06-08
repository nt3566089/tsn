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
 * The DB meta of T_CDTLVMKADM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TCdtlvmkadmDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TCdtlvmkadmDbm _instance = new TCdtlvmkadmDbm();
    private TCdtlvmkadmDbm() {}
    public static TCdtlvmkadmDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSpecificationLabelMakeManageId(), (et, vl) -> ((TCdtlvmkadm)et).setSpecificationLabelMakeManageId(ctl(vl)), "specificationLabelMakeManageId");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getZzorgncd(), (et, vl) -> ((TCdtlvmkadm)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSrymd(), (et, vl) -> ((TCdtlvmkadm)et).setSrymd((String)vl), "srymd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSroprtcnt(), (et, vl) -> ((TCdtlvmkadm)et).setSroprtcnt(ctl(vl)), "sroprtcnt");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getDlvymd(), (et, vl) -> ((TCdtlvmkadm)et).setDlvymd((String)vl), "dlvymd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getDpcd(), (et, vl) -> ((TCdtlvmkadm)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getDed(), (et, vl) -> ((TCdtlvmkadm)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getPstnid(), (et, vl) -> ((TCdtlvmkadm)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getLinblk(), (et, vl) -> ((TCdtlvmkadm)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSrrnk(), (et, vl) -> ((TCdtlvmkadm)et).setSrrnk(ctl(vl)), "srrnk");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getMkdtm(), (et, vl) -> ((TCdtlvmkadm)et).setMkdtm(cttp(vl)), "mkdtm");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getLstdsymd(), (et, vl) -> ((TCdtlvmkadm)et).setLstdsymd((String)vl), "lstdsymd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSrlincd(), (et, vl) -> ((TCdtlvmkadm)et).setSrlincd((String)vl), "srlincd");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSrsrrnk(), (et, vl) -> ((TCdtlvmkadm)et).setSrsrrnk(ctl(vl)), "srsrrnk");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getSpecificationPrintedflg(), (et, vl) -> ((TCdtlvmkadm)et).setSpecificationPrintedflg((String)vl), "specificationPrintedflg");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getLabelPrintedflg(), (et, vl) -> ((TCdtlvmkadm)et).setLabelPrintedflg((String)vl), "labelPrintedflg");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getReportId(), (et, vl) -> ((TCdtlvmkadm)et).setReportId(ctl(vl)), "reportId");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getReportNm(), (et, vl) -> ((TCdtlvmkadm)et).setReportNm((String)vl), "reportNm");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getStockNum(), (et, vl) -> ((TCdtlvmkadm)et).setStockNum(ctl(vl)), "stockNum");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getCenterId(), (et, vl) -> ((TCdtlvmkadm)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getDelFlg(), (et, vl) -> ((TCdtlvmkadm)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getVersionNo(), (et, vl) -> ((TCdtlvmkadm)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getControlNo(), (et, vl) -> ((TCdtlvmkadm)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getAddDt(), (et, vl) -> ((TCdtlvmkadm)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getAddUser(), (et, vl) -> ((TCdtlvmkadm)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getAddProcess(), (et, vl) -> ((TCdtlvmkadm)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getUpdDt(), (et, vl) -> ((TCdtlvmkadm)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getUpdUser(), (et, vl) -> ((TCdtlvmkadm)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TCdtlvmkadm)et).getUpdProcess(), (et, vl) -> ((TCdtlvmkadm)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_CDTLVMKADM";
    protected final String _tableDispName = "T_CDTLVMKADM";
    protected final String _tablePropertyName = "TCdtlvmkadm";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_CDTLVMKADM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSpecificationLabelMakeManageId = cci("SPECIFICATION_LABEL_MAKE_MANAGE_ID", "SPECIFICATION_LABEL_MAKE_MANAGE_ID", null, null, Long.class, "specificationLabelMakeManageId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrymd = cci("SRYMD", "SRYMD", null, null, String.class, "srymd", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSroprtcnt = cci("SROPRTCNT", "SROPRTCNT", null, null, Long.class, "sroprtcnt", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvymd = cci("DLVYMD", "DLVYMD", null, null, String.class, "dlvymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrrnk = cci("SRRNK", "SRRNK", null, null, Long.class, "srrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMkdtm = cci("MKDTM", "MKDTM", null, null, java.sql.Timestamp.class, "mkdtm", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLstdsymd = cci("LSTDSYMD", "LSTDSYMD", null, null, String.class, "lstdsymd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrlincd = cci("SRLINCD", "SRLINCD", null, null, String.class, "srlincd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSrsrrnk = cci("SRSRRNK", "SRSRRNK", null, null, Long.class, "srsrrnk", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecificationPrintedflg = cci("SPECIFICATION_PRINTEDFLG", "SPECIFICATION_PRINTEDFLG", null, null, String.class, "specificationPrintedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabelPrintedflg = cci("LABEL_PRINTEDFLG", "LABEL_PRINTEDFLG", null, null, String.class, "labelPrintedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportId = cci("REPORT_ID", "REPORT_ID", null, null, Long.class, "reportId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportNm = cci("REPORT_NM", "REPORT_NM", null, null, String.class, "reportNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockNum = cci("STOCK_NUM", "STOCK_NUM", null, null, Long.class, "stockNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecificationLabelMakeManageId() { return _columnSpecificationLabelMakeManageId; }
    /**
     * ZZORGNCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * SRYMD: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrymd() { return _columnSrymd; }
    /**
     * SROPRTCNT: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSroprtcnt() { return _columnSroprtcnt; }
    /**
     * DLVYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvymd() { return _columnDlvymd; }
    /**
     * DPCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * DED: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * SRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrrnk() { return _columnSrrnk; }
    /**
     * MKDTM: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMkdtm() { return _columnMkdtm; }
    /**
     * LSTDSYMD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLstdsymd() { return _columnLstdsymd; }
    /**
     * SRLINCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrlincd() { return _columnSrlincd; }
    /**
     * SRSRRNK: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSrsrrnk() { return _columnSrsrrnk; }
    /**
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecificationPrintedflg() { return _columnSpecificationPrintedflg; }
    /**
     * LABEL_PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelPrintedflg() { return _columnLabelPrintedflg; }
    /**
     * REPORT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportId() { return _columnReportId; }
    /**
     * REPORT_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportNm() { return _columnReportNm; }
    /**
     * STOCK_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockNum() { return _columnStockNum; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
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
        ls.add(columnSpecificationLabelMakeManageId());
        ls.add(columnZzorgncd());
        ls.add(columnSrymd());
        ls.add(columnSroprtcnt());
        ls.add(columnDlvymd());
        ls.add(columnDpcd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnLinblk());
        ls.add(columnSrrnk());
        ls.add(columnMkdtm());
        ls.add(columnLstdsymd());
        ls.add(columnSrlincd());
        ls.add(columnSrsrrnk());
        ls.add(columnSpecificationPrintedflg());
        ls.add(columnLabelPrintedflg());
        ls.add(columnReportId());
        ls.add(columnReportNm());
        ls.add(columnStockNum());
        ls.add(columnCenterId());
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
    protected UniqueInfo cpui() { return hpcpui(columnSpecificationLabelMakeManageId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TCdtlvmkadm"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TCdtlvmkadmCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TCdtlvmkadmBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TCdtlvmkadm> getEntityType() { return TCdtlvmkadm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TCdtlvmkadm newEntity() { return new TCdtlvmkadm(); }
    public TCdtlvmkadm newMyEntity() { return new TCdtlvmkadm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TCdtlvmkadm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TCdtlvmkadm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
