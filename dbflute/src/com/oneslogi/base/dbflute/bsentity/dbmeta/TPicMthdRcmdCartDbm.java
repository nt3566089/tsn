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
 * The DB meta of T_PIC_MTHD_RCMD_CART. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdCartDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPicMthdRcmdCartDbm _instance = new TPicMthdRcmdCartDbm();
    private TPicMthdRcmdCartDbm() {}
    public static TPicMthdRcmdCartDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getPicMthdRcmdCartId(), (et, vl) -> ((TPicMthdRcmdCart)et).setPicMthdRcmdCartId(ctl(vl)), "picMthdRcmdCartId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getPackingHId(), (et, vl) -> ((TPicMthdRcmdCart)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getCartNo(), (et, vl) -> ((TPicMthdRcmdCart)et).setCartNo(ctl(vl)), "cartNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getPicMthdRcmdId(), (et, vl) -> ((TPicMthdRcmdCart)et).setPicMthdRcmdId(ctl(vl)), "picMthdRcmdId");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getDelFlg(), (et, vl) -> ((TPicMthdRcmdCart)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getVersionNo(), (et, vl) -> ((TPicMthdRcmdCart)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getControlNo(), (et, vl) -> ((TPicMthdRcmdCart)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getAddDt(), (et, vl) -> ((TPicMthdRcmdCart)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getAddUser(), (et, vl) -> ((TPicMthdRcmdCart)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getAddProcess(), (et, vl) -> ((TPicMthdRcmdCart)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getUpdDt(), (et, vl) -> ((TPicMthdRcmdCart)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getUpdUser(), (et, vl) -> ((TPicMthdRcmdCart)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPicMthdRcmdCart)et).getUpdProcess(), (et, vl) -> ((TPicMthdRcmdCart)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmdCart)et).getTPackingH(), (et, vl) -> ((TPicMthdRcmdCart)et).setTPackingH((TPackingH)vl), "TPackingH");
        setupEfpg(_efpgMap, et -> ((TPicMthdRcmdCart)et).getTPicMthdRcmd(), (et, vl) -> ((TPicMthdRcmdCart)et).setTPicMthdRcmd((TPicMthdRcmd)vl), "TPicMthdRcmd");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PIC_MTHD_RCMD_CART";
    protected final String _tableDispName = "T_PIC_MTHD_RCMD_CART";
    protected final String _tablePropertyName = "TPicMthdRcmdCart";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PIC_MTHD_RCMD_CART", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPicMthdRcmdCartId = cci("PIC_MTHD_RCMD_CART_ID", "PIC_MTHD_RCMD_CART_ID", null, null, Long.class, "picMthdRcmdCartId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "TPackingH", null, null, false);
    protected final ColumnInfo _columnCartNo = cci("CART_NO", "CART_NO", null, null, Long.class, "cartNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicMthdRcmdId = cci("PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", null, null, Long.class, "picMthdRcmdId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TPicMthdRcmd", null, null, false);
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
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdCartId() { return _columnPicMthdRcmdCartId; }
    /**
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * CART_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartNo() { return _columnCartNo; }
    /**
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicMthdRcmdId() { return _columnPicMthdRcmdId; }
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
        ls.add(columnPicMthdRcmdCartId());
        ls.add(columnPackingHId());
        ls.add(columnCartNo());
        ls.add(columnPicMthdRcmdId());
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
    protected UniqueInfo cpui() { return hpcpui(columnPicMthdRcmdCartId()); }
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
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPackingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingHId(), TPackingHDbm.getInstance().columnPackingHId());
        return cfi("T_PIC_MTHD_RCMD_CART_FK1", "TPackingH", this, TPackingHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPicMthdRcmdCartList", false);
    }
    /**
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPicMthdRcmd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPicMthdRcmdId(), TPicMthdRcmdDbm.getInstance().columnPicMthdRcmdId());
        return cfi("T_PIC_MTHD_RCMD_CART_FK2", "TPicMthdRcmd", this, TPicMthdRcmdDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPicMthdRcmdCartList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPicMthdRcmdCart"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCartCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdCartBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPicMthdRcmdCart> getEntityType() { return TPicMthdRcmdCart.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPicMthdRcmdCart newEntity() { return new TPicMthdRcmdCart(); }
    public TPicMthdRcmdCart newMyEntity() { return new TPicMthdRcmdCart(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPicMthdRcmdCart)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPicMthdRcmdCart)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
