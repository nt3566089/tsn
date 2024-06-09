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
 * The DB meta of T_EC_ORDER_R. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TEcOrderRDbm _instance = new TEcOrderRDbm();
    private TEcOrderRDbm() {}
    public static TEcOrderRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getEcOrderHId(), (et, vl) -> ((TEcOrderR)et).setEcOrderHId(ctl(vl)), "ecOrderHId");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getStatementOutFlg(), (et, vl) -> ((TEcOrderR)et).setStatementOutFlg((String)vl), "statementOutFlg");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getStatementOutUserId(), (et, vl) -> ((TEcOrderR)et).setStatementOutUserId(ctl(vl)), "statementOutUserId");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getStatementOutDt(), (et, vl) -> ((TEcOrderR)et).setStatementOutDt(cttp(vl)), "statementOutDt");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getInvoiceCreateFlg(), (et, vl) -> ((TEcOrderR)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getInvoiceCreateDt(), (et, vl) -> ((TEcOrderR)et).setInvoiceCreateDt(cttp(vl)), "invoiceCreateDt");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getDelFlg(), (et, vl) -> ((TEcOrderR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getVersionNo(), (et, vl) -> ((TEcOrderR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getControlNo(), (et, vl) -> ((TEcOrderR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getAddDt(), (et, vl) -> ((TEcOrderR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getAddUser(), (et, vl) -> ((TEcOrderR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getAddProcess(), (et, vl) -> ((TEcOrderR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getUpdDt(), (et, vl) -> ((TEcOrderR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getUpdUser(), (et, vl) -> ((TEcOrderR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TEcOrderR)et).getUpdProcess(), (et, vl) -> ((TEcOrderR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TEcOrderR)et).getTEcOrderH(), (et, vl) -> ((TEcOrderR)et).setTEcOrderH((TEcOrderH)vl), "TEcOrderH");
        setupEfpg(_efpgMap, et -> ((TEcOrderR)et).getBUser(), (et, vl) -> ((TEcOrderR)et).setBUser((BUser)vl), "BUser");
        setupEfpg(_efpgMap, et -> ((TEcOrderR)et).getBClassDtlByInvoiceCreateFlg(), (et, vl) -> ((TEcOrderR)et).setBClassDtlByInvoiceCreateFlg((BClassDtl)vl), "BClassDtlByInvoiceCreateFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderR)et).getBClassDtlByStatementOutFlg(), (et, vl) -> ((TEcOrderR)et).setBClassDtlByStatementOutFlg((BClassDtl)vl), "BClassDtlByStatementOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_EC_ORDER_R";
    protected final String _tableDispName = "T_EC_ORDER_R";
    protected final String _tablePropertyName = "TEcOrderR";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_EC_ORDER_R", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEcOrderHId = cci("EC_ORDER_H_ID", "EC_ORDER_H_ID", null, null, Long.class, "ecOrderHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TEcOrderH", null, null, false);
    protected final ColumnInfo _columnStatementOutFlg = cci("STATEMENT_OUT_FLG", "STATEMENT_OUT_FLG", null, null, String.class, "statementOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByStatementOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnStatementOutUserId = cci("STATEMENT_OUT_USER_ID", "STATEMENT_OUT_USER_ID", null, null, Long.class, "statementOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnStatementOutDt = cci("STATEMENT_OUT_DT", "STATEMENT_OUT_DT", null, null, java.sql.Timestamp.class, "statementOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInvoiceCreateFlg", null, CDef.DefMeta.InvoiceCreateFlg, false);
    protected final ColumnInfo _columnInvoiceCreateDt = cci("INVOICE_CREATE_DT", "INVOICE_CREATE_DT", null, null, java.sql.Timestamp.class, "invoiceCreateDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_EC_ORDER_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderHId() { return _columnEcOrderHId; }
    /**
     * STATEMENT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatementOutFlg() { return _columnStatementOutFlg; }
    /**
     * STATEMENT_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatementOutUserId() { return _columnStatementOutUserId; }
    /**
     * STATEMENT_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatementOutDt() { return _columnStatementOutDt; }
    /**
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateDt() { return _columnInvoiceCreateDt; }
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
        ls.add(columnEcOrderHId());
        ls.add(columnStatementOutFlg());
        ls.add(columnStatementOutUserId());
        ls.add(columnStatementOutDt());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnInvoiceCreateDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnEcOrderHId()); }
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
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTEcOrderH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderHId(), TEcOrderHDbm.getInstance().columnEcOrderHId());
        return cfi("T_EC_ORDER_R_FK1", "TEcOrderH", this, TEcOrderHDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "TEcOrderRAsOne", false);
    }
    /**
     * B_USER by my STATEMENT_OUT_USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStatementOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_EC_ORDER_R_FK2", "BUser", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TEcOrderRList", false);
    }
    /**
     * B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInvoiceCreateFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInvoiceCreateFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_R_INVOICE_CREATE_FLG", "BClassDtlByInvoiceCreateFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INVOICE_CREATE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStatementOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStatementOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_R_STATEMENT_OUT_FLG", "BClassDtlByStatementOutFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TEcOrderR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TEcOrderRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TEcOrderR> getEntityType() { return TEcOrderR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TEcOrderR newEntity() { return new TEcOrderR(); }
    public TEcOrderR newMyEntity() { return new TEcOrderR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TEcOrderR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TEcOrderR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
