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
 * The DB meta of M_MFWHxITEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MMfwhxitemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MMfwhxitemDbm _instance = new MMfwhxitemDbm();
    private MMfwhxitemDbm() {}
    public static MMfwhxitemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getMfwhItemId(), (et, vl) -> ((MMfwhxitem)et).setMfwhItemId(ctl(vl)), "mfwhItemId");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getClientId(), (et, vl) -> ((MMfwhxitem)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getCenterId(), (et, vl) -> ((MMfwhxitem)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getProductCd(), (et, vl) -> ((MMfwhxitem)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getSlotlocname(), (et, vl) -> ((MMfwhxitem)et).setSlotlocname((String)vl), "slotlocname");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPicklocname(), (et, vl) -> ((MMfwhxitem)et).setPicklocname((String)vl), "picklocname");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPhysicaltype(), (et, vl) -> ((MMfwhxitem)et).setPhysicaltype((String)vl), "physicaltype");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPhysicalcycle(), (et, vl) -> ((MMfwhxitem)et).setPhysicalcycle(ctb(vl)), "physicalcycle");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPhysicalgroup(), (et, vl) -> ((MMfwhxitem)et).setPhysicalgroup((String)vl), "physicalgroup");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPhysicaldate(), (et, vl) -> ((MMfwhxitem)et).setPhysicaldate((String)vl), "physicaldate");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReordertype(), (et, vl) -> ((MMfwhxitem)et).setReordertype((String)vl), "reordertype");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReorderinterval(), (et, vl) -> ((MMfwhxitem)et).setReorderinterval(ctb(vl)), "reorderinterval");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReorderpoint(), (et, vl) -> ((MMfwhxitem)et).setReorderpoint(ctb(vl)), "reorderpoint");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReorderqty(), (et, vl) -> ((MMfwhxitem)et).setReorderqty(ctb(vl)), "reorderqty");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReorderleadtime(), (et, vl) -> ((MMfwhxitem)et).setReorderleadtime(ctb(vl)), "reorderleadtime");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReorderlastday(), (et, vl) -> ((MMfwhxitem)et).setReorderlastday((String)vl), "reorderlastday");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getSuppliercd(), (et, vl) -> ((MMfwhxitem)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getReplenishpoint(), (et, vl) -> ((MMfwhxitem)et).setReplenishpoint(ctb(vl)), "replenishpoint");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getMaxqty(), (et, vl) -> ((MMfwhxitem)et).setMaxqty(ctb(vl)), "maxqty");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getCauseloc(), (et, vl) -> ((MMfwhxitem)et).setCauseloc((String)vl), "causeloc");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getShippingtype(), (et, vl) -> ((MMfwhxitem)et).setShippingtype((String)vl), "shippingtype");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getSlotpolicykey(), (et, vl) -> ((MMfwhxitem)et).setSlotpolicykey(ctb(vl)), "slotpolicykey");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getInworkingkey(), (et, vl) -> ((MMfwhxitem)et).setInworkingkey(ctb(vl)), "inworkingkey");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getOutworkingkey(), (et, vl) -> ((MMfwhxitem)et).setOutworkingkey(ctb(vl)), "outworkingkey");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getProcessworkingkey(), (et, vl) -> ((MMfwhxitem)et).setProcessworkingkey(ctb(vl)), "processworkingkey");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUseruse1(), (et, vl) -> ((MMfwhxitem)et).setUseruse1((String)vl), "useruse1");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUseruse2(), (et, vl) -> ((MMfwhxitem)et).setUseruse2((String)vl), "useruse2");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUseruse3(), (et, vl) -> ((MMfwhxitem)et).setUseruse3((String)vl), "useruse3");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUseruse4(), (et, vl) -> ((MMfwhxitem)et).setUseruse4((String)vl), "useruse4");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUseruse5(), (et, vl) -> ((MMfwhxitem)et).setUseruse5((String)vl), "useruse5");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getSerialflg(), (et, vl) -> ((MMfwhxitem)et).setSerialflg(ctb(vl)), "serialflg");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getFullpalletflg(), (et, vl) -> ((MMfwhxitem)et).setFullpalletflg(ctb(vl)), "fullpalletflg");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getPlslotlocname(), (et, vl) -> ((MMfwhxitem)et).setPlslotlocname((String)vl), "plslotlocname");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getProductId(), (et, vl) -> ((MMfwhxitem)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getDelFlg(), (et, vl) -> ((MMfwhxitem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getVersionNo(), (et, vl) -> ((MMfwhxitem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getControlNo(), (et, vl) -> ((MMfwhxitem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getAddDt(), (et, vl) -> ((MMfwhxitem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getAddUser(), (et, vl) -> ((MMfwhxitem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getAddProcess(), (et, vl) -> ((MMfwhxitem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUpdDt(), (et, vl) -> ((MMfwhxitem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUpdUser(), (et, vl) -> ((MMfwhxitem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MMfwhxitem)et).getUpdProcess(), (et, vl) -> ((MMfwhxitem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MMfwhxitem)et).getMProduct(), (et, vl) -> ((MMfwhxitem)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((MMfwhxitem)et).getMClient(), (et, vl) -> ((MMfwhxitem)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MMfwhxitem)et).getMCenter(), (et, vl) -> ((MMfwhxitem)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_MFWHxITEM";
    protected final String _tableDispName = "M_MFWHxITEM";
    protected final String _tablePropertyName = "MMfwhxitem";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_MFWHxITEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfwhItemId = cci("MFWH_ITEM_ID", "MFWH_ITEM_ID", null, null, Long.class, "mfwhItemId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotlocname = cci("SLOTLOCNAME", "SLOTLOCNAME", null, null, String.class, "slotlocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicklocname = cci("PICKLOCNAME", "PICKLOCNAME", null, null, String.class, "picklocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhysicaltype = cci("PHYSICALTYPE", "PHYSICALTYPE", null, null, String.class, "physicaltype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhysicalcycle = cci("PHYSICALCYCLE", "PHYSICALCYCLE", null, null, java.math.BigDecimal.class, "physicalcycle", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhysicalgroup = cci("PHYSICALGROUP", "PHYSICALGROUP", null, null, String.class, "physicalgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhysicaldate = cci("PHYSICALDATE", "PHYSICALDATE", null, null, String.class, "physicaldate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReordertype = cci("REORDERTYPE", "REORDERTYPE", null, null, String.class, "reordertype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReorderinterval = cci("REORDERINTERVAL", "REORDERINTERVAL", null, null, java.math.BigDecimal.class, "reorderinterval", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReorderpoint = cci("REORDERPOINT", "REORDERPOINT", null, null, java.math.BigDecimal.class, "reorderpoint", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReorderqty = cci("REORDERQTY", "REORDERQTY", null, null, java.math.BigDecimal.class, "reorderqty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReorderleadtime = cci("REORDERLEADTIME", "REORDERLEADTIME", null, null, java.math.BigDecimal.class, "reorderleadtime", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReorderlastday = cci("REORDERLASTDAY", "REORDERLASTDAY", null, null, String.class, "reorderlastday", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishpoint = cci("REPLENISHPOINT", "REPLENISHPOINT", null, null, java.math.BigDecimal.class, "replenishpoint", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxqty = cci("MAXQTY", "MAXQTY", null, null, java.math.BigDecimal.class, "maxqty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCauseloc = cci("CAUSELOC", "CAUSELOC", null, null, String.class, "causeloc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingtype = cci("SHIPPINGTYPE", "SHIPPINGTYPE", null, null, String.class, "shippingtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlotpolicykey = cci("SLOTPOLICYKEY", "SLOTPOLICYKEY", null, null, java.math.BigDecimal.class, "slotpolicykey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInworkingkey = cci("INWORKINGKEY", "INWORKINGKEY", null, null, java.math.BigDecimal.class, "inworkingkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutworkingkey = cci("OUTWORKINGKEY", "OUTWORKINGKEY", null, null, java.math.BigDecimal.class, "outworkingkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessworkingkey = cci("PROCESSWORKINGKEY", "PROCESSWORKINGKEY", null, null, java.math.BigDecimal.class, "processworkingkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse1 = cci("USERUSE1", "USERUSE1", null, null, String.class, "useruse1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse2 = cci("USERUSE2", "USERUSE2", null, null, String.class, "useruse2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse3 = cci("USERUSE3", "USERUSE3", null, null, String.class, "useruse3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse4 = cci("USERUSE4", "USERUSE4", null, null, String.class, "useruse4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse5 = cci("USERUSE5", "USERUSE5", null, null, String.class, "useruse5", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialflg = cci("SERIALFLG", "SERIALFLG", null, null, java.math.BigDecimal.class, "serialflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFullpalletflg = cci("FULLPALLETFLG", "FULLPALLETFLG", null, null, java.math.BigDecimal.class, "fullpalletflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlslotlocname = cci("PLSLOTLOCNAME", "PLSLOTLOCNAME", null, null, String.class, "plslotlocname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
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
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfwhItemId() { return _columnMfwhItemId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SLOTLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotlocname() { return _columnSlotlocname; }
    /**
     * PICKLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicklocname() { return _columnPicklocname; }
    /**
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhysicaltype() { return _columnPhysicaltype; }
    /**
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhysicalcycle() { return _columnPhysicalcycle; }
    /**
     * PHYSICALGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhysicalgroup() { return _columnPhysicalgroup; }
    /**
     * PHYSICALDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhysicaldate() { return _columnPhysicaldate; }
    /**
     * REORDERTYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReordertype() { return _columnReordertype; }
    /**
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReorderinterval() { return _columnReorderinterval; }
    /**
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReorderpoint() { return _columnReorderpoint; }
    /**
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReorderqty() { return _columnReorderqty; }
    /**
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReorderleadtime() { return _columnReorderleadtime; }
    /**
     * REORDERLASTDAY: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReorderlastday() { return _columnReorderlastday; }
    /**
     * SUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishpoint() { return _columnReplenishpoint; }
    /**
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxqty() { return _columnMaxqty; }
    /**
     * CAUSELOC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCauseloc() { return _columnCauseloc; }
    /**
     * SHIPPINGTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingtype() { return _columnShippingtype; }
    /**
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlotpolicykey() { return _columnSlotpolicykey; }
    /**
     * INWORKINGKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInworkingkey() { return _columnInworkingkey; }
    /**
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutworkingkey() { return _columnOutworkingkey; }
    /**
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessworkingkey() { return _columnProcessworkingkey; }
    /**
     * USERUSE1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse1() { return _columnUseruse1; }
    /**
     * USERUSE2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse2() { return _columnUseruse2; }
    /**
     * USERUSE3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse3() { return _columnUseruse3; }
    /**
     * USERUSE4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse4() { return _columnUseruse4; }
    /**
     * USERUSE5: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse5() { return _columnUseruse5; }
    /**
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialflg() { return _columnSerialflg; }
    /**
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFullpalletflg() { return _columnFullpalletflg; }
    /**
     * PLSLOTLOCNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlslotlocname() { return _columnPlslotlocname; }
    /**
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
        ls.add(columnMfwhItemId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProductCd());
        ls.add(columnSlotlocname());
        ls.add(columnPicklocname());
        ls.add(columnPhysicaltype());
        ls.add(columnPhysicalcycle());
        ls.add(columnPhysicalgroup());
        ls.add(columnPhysicaldate());
        ls.add(columnReordertype());
        ls.add(columnReorderinterval());
        ls.add(columnReorderpoint());
        ls.add(columnReorderqty());
        ls.add(columnReorderleadtime());
        ls.add(columnReorderlastday());
        ls.add(columnSuppliercd());
        ls.add(columnReplenishpoint());
        ls.add(columnMaxqty());
        ls.add(columnCauseloc());
        ls.add(columnShippingtype());
        ls.add(columnSlotpolicykey());
        ls.add(columnInworkingkey());
        ls.add(columnOutworkingkey());
        ls.add(columnProcessworkingkey());
        ls.add(columnUseruse1());
        ls.add(columnUseruse2());
        ls.add(columnUseruse3());
        ls.add(columnUseruse4());
        ls.add(columnUseruse5());
        ls.add(columnSerialflg());
        ls.add(columnFullpalletflg());
        ls.add(columnPlslotlocname());
        ls.add(columnProductId());
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
    protected UniqueInfo cpui() { return hpcpui(columnMfwhItemId()); }
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
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_MFWHxITEM_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MMfwhxitemList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_MFWHxITEM_FK3", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MMfwhxitemList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_MFWHxITEM_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MMfwhxitemList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MMfwhxitem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MMfwhxitemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MMfwhxitemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MMfwhxitem> getEntityType() { return MMfwhxitem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MMfwhxitem newEntity() { return new MMfwhxitem(); }
    public MMfwhxitem newMyEntity() { return new MMfwhxitem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MMfwhxitem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MMfwhxitem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
