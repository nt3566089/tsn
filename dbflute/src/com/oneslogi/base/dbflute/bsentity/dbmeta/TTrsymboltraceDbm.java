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
 * The DB meta of T_TRSYMBOLTRACE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsymboltraceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsymboltraceDbm _instance = new TTrsymboltraceDbm();
    private TTrsymboltraceDbm() {}
    public static TTrsymboltraceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getTrsymboltraceId(), (et, vl) -> ((TTrsymboltrace)et).setTrsymboltraceId(ctl(vl)), "trsymboltraceId");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getSymboltracekey(), (et, vl) -> ((TTrsymboltrace)et).setSymboltracekey(ctb(vl)), "symboltracekey");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getTrsymbolId(), (et, vl) -> ((TTrsymboltrace)et).setTrsymbolId(ctl(vl)), "trsymbolId");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getCreatedatetime(), (et, vl) -> ((TTrsymboltrace)et).setCreatedatetime((String)vl), "createdatetime");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getWarehousecd(), (et, vl) -> ((TTrsymboltrace)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getTracetype(), (et, vl) -> ((TTrsymboltrace)et).setTracetype((String)vl), "tracetype");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getInitnum(), (et, vl) -> ((TTrsymboltrace)et).setInitnum(ctl(vl)), "initnum");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getCaseinnum(), (et, vl) -> ((TTrsymboltrace)et).setCaseinnum(ctl(vl)), "caseinnum");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getAssortnum(), (et, vl) -> ((TTrsymboltrace)et).setAssortnum(ctl(vl)), "assortnum");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getDirectionnum(), (et, vl) -> ((TTrsymboltrace)et).setDirectionnum(ctl(vl)), "directionnum");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getCustomercd(), (et, vl) -> ((TTrsymboltrace)et).setCustomercd((String)vl), "customercd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getDistwarehousecd(), (et, vl) -> ((TTrsymboltrace)et).setDistwarehousecd((String)vl), "distwarehousecd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getMixedflg(), (et, vl) -> ((TTrsymboltrace)et).setMixedflg((String)vl), "mixedflg");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getLoccd(), (et, vl) -> ((TTrsymboltrace)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getProductCd(), (et, vl) -> ((TTrsymboltrace)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getLot1(), (et, vl) -> ((TTrsymboltrace)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getLot2(), (et, vl) -> ((TTrsymboltrace)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getLot3(), (et, vl) -> ((TTrsymboltrace)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getLot4(), (et, vl) -> ((TTrsymboltrace)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getOtherlot1(), (et, vl) -> ((TTrsymboltrace)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getNoshippingflg(), (et, vl) -> ((TTrsymboltrace)et).setNoshippingflg(ctb(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getIfitemcd(), (et, vl) -> ((TTrsymboltrace)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getSendflg(), (et, vl) -> ((TTrsymboltrace)et).setSendflg(ctb(vl)), "sendflg");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getRcvkey(), (et, vl) -> ((TTrsymboltrace)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getPalletno(), (et, vl) -> ((TTrsymboltrace)et).setPalletno(ctb(vl)), "palletno");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getSokey(), (et, vl) -> ((TTrsymboltrace)et).setSokey(ctb(vl)), "sokey");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getFax1(), (et, vl) -> ((TTrsymboltrace)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getOriginalpono(), (et, vl) -> ((TTrsymboltrace)et).setOriginalpono((String)vl), "originalpono");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getMosjtsendflg(), (et, vl) -> ((TTrsymboltrace)et).setMosjtsendflg((String)vl), "mosjtsendflg");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getShipdate(), (et, vl) -> ((TTrsymboltrace)et).setShipdate((String)vl), "shipdate");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getDelivname(), (et, vl) -> ((TTrsymboltrace)et).setDelivname((String)vl), "delivname");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getCenterId(), (et, vl) -> ((TTrsymboltrace)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getClientId(), (et, vl) -> ((TTrsymboltrace)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getDelFlg(), (et, vl) -> ((TTrsymboltrace)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getVersionNo(), (et, vl) -> ((TTrsymboltrace)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getControlNo(), (et, vl) -> ((TTrsymboltrace)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getAddDt(), (et, vl) -> ((TTrsymboltrace)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getAddUser(), (et, vl) -> ((TTrsymboltrace)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getAddProcess(), (et, vl) -> ((TTrsymboltrace)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getUpdDt(), (et, vl) -> ((TTrsymboltrace)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getUpdUser(), (et, vl) -> ((TTrsymboltrace)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsymboltrace)et).getUpdProcess(), (et, vl) -> ((TTrsymboltrace)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TTrsymboltrace)et).getMCenter(), (et, vl) -> ((TTrsymboltrace)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TTrsymboltrace)et).getMClient(), (et, vl) -> ((TTrsymboltrace)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSYMBOLTRACE";
    protected final String _tableDispName = "T_TRSYMBOLTRACE";
    protected final String _tablePropertyName = "TTrsymboltrace";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSYMBOLTRACE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsymboltraceId = cci("TRSYMBOLTRACE_ID", "TRSYMBOLTRACE_ID", null, null, Long.class, "trsymboltraceId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSymboltracekey = cci("SYMBOLTRACEKEY", "SYMBOLTRACEKEY", null, null, java.math.BigDecimal.class, "symboltracekey", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsymbolId = cci("TRSYMBOL_ID", "TRSYMBOL_ID", null, null, Long.class, "trsymbolId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedatetime = cci("CREATEDATETIME", "CREATEDATETIME", null, null, String.class, "createdatetime", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTracetype = cci("TRACETYPE", "TRACETYPE", null, null, String.class, "tracetype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInitnum = cci("INITNUM", "INITNUM", null, null, Long.class, "initnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseinnum = cci("CASEINNUM", "CASEINNUM", null, null, Long.class, "caseinnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssortnum = cci("ASSORTNUM", "ASSORTNUM", null, null, Long.class, "assortnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionnum = cci("DIRECTIONNUM", "DIRECTIONNUM", null, null, Long.class, "directionnum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomercd = cci("CUSTOMERCD", "CUSTOMERCD", null, null, String.class, "customercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistwarehousecd = cci("DISTWAREHOUSECD", "DISTWAREHOUSECD", null, null, String.class, "distwarehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMixedflg = cci("MIXEDFLG", "MIXEDFLG", null, null, String.class, "mixedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, java.math.BigDecimal.class, "noshippingflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendflg = cci("SENDFLG", "SENDFLG", null, null, java.math.BigDecimal.class, "sendflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RCVKEY", "RCVKEY", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, java.math.BigDecimal.class, "palletno", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSokey = cci("SOKEY", "SOKEY", null, null, java.math.BigDecimal.class, "sokey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("FAX1", "FAX1", null, null, String.class, "fax1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalpono = cci("ORIGINALPONO", "ORIGINALPONO", null, null, String.class, "originalpono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMosjtsendflg = cci("MOSJTSENDFLG", "MOSJTSENDFLG", null, null, String.class, "mosjtsendflg", null, false, false, false, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipdate = cci("SHIPDATE", "SHIPDATE", null, null, String.class, "shipdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivname = cci("DELIVNAME", "DELIVNAME", null, null, String.class, "delivname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
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
     * TRSYMBOLTRACE_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymboltraceId() { return _columnTrsymboltraceId; }
    /**
     * SYMBOLTRACEKEY: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSymboltracekey() { return _columnSymboltracekey; }
    /**
     * TRSYMBOL_ID: {IX+, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsymbolId() { return _columnTrsymbolId; }
    /**
     * CREATEDATETIME: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedatetime() { return _columnCreatedatetime; }
    /**
     * WAREHOUSECD: {IX, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * TRACETYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTracetype() { return _columnTracetype; }
    /**
     * INITNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInitnum() { return _columnInitnum; }
    /**
     * CASEINNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseinnum() { return _columnCaseinnum; }
    /**
     * ASSORTNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssortnum() { return _columnAssortnum; }
    /**
     * DIRECTIONNUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionnum() { return _columnDirectionnum; }
    /**
     * CUSTOMERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomercd() { return _columnCustomercd; }
    /**
     * DISTWAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistwarehousecd() { return _columnDistwarehousecd; }
    /**
     * MIXEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMixedflg() { return _columnMixedflg; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * NOSHIPPINGFLG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * SENDFLG: {IX+, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendflg() { return _columnSendflg; }
    /**
     * RCVKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * PALLETNO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * SOKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSokey() { return _columnSokey; }
    /**
     * FAX1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * ORIGINALPONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalpono() { return _columnOriginalpono; }
    /**
     * MOSJTSENDFLG: {char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMosjtsendflg() { return _columnMosjtsendflg; }
    /**
     * SHIPDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipdate() { return _columnShipdate; }
    /**
     * DELIVNAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivname() { return _columnDelivname; }
    /**
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnTrsymboltraceId());
        ls.add(columnSymboltracekey());
        ls.add(columnTrsymbolId());
        ls.add(columnCreatedatetime());
        ls.add(columnWarehousecd());
        ls.add(columnTracetype());
        ls.add(columnInitnum());
        ls.add(columnCaseinnum());
        ls.add(columnAssortnum());
        ls.add(columnDirectionnum());
        ls.add(columnCustomercd());
        ls.add(columnDistwarehousecd());
        ls.add(columnMixedflg());
        ls.add(columnLoccd());
        ls.add(columnProductCd());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnOtherlot1());
        ls.add(columnNoshippingflg());
        ls.add(columnIfitemcd());
        ls.add(columnSendflg());
        ls.add(columnRcvkey());
        ls.add(columnPalletno());
        ls.add(columnSokey());
        ls.add(columnFax1());
        ls.add(columnOriginalpono());
        ls.add(columnMosjtsendflg());
        ls.add(columnShipdate());
        ls.add(columnDelivname());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsymboltraceId()); }
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_TRSYMBOLTRACE_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TTrsymboltraceList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_TRSYMBOLTRACE_FK2", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TTrsymboltraceList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsymboltrace"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsymboltraceCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsymboltraceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsymboltrace> getEntityType() { return TTrsymboltrace.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsymboltrace newEntity() { return new TTrsymboltrace(); }
    public TTrsymboltrace newMyEntity() { return new TTrsymboltrace(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsymboltrace)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsymboltrace)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
