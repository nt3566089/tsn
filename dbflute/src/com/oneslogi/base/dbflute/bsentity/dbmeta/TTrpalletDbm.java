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
 * The DB meta of T_TRPALLET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpalletDbm _instance = new TTrpalletDbm();
    private TTrpalletDbm() {}
    public static TTrpalletDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpallet)et).getTrpalletId(), (et, vl) -> ((TTrpallet)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPalletNo(), (et, vl) -> ((TTrpallet)et).setPalletNo(ctb(vl)), "palletNo");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getLotId(), (et, vl) -> ((TTrpallet)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceivePlanHId(), (et, vl) -> ((TTrpallet)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRcvlineno(), (et, vl) -> ((TTrpallet)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPrintedflg(), (et, vl) -> ((TTrpallet)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPrintingdate(), (et, vl) -> ((TTrpallet)et).setPrintingdate((String)vl), "printingdate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getFirmcarryno(), (et, vl) -> ((TTrpallet)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getTransportno(), (et, vl) -> ((TTrpallet)et).setTransportno((String)vl), "transportno");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getSourcecd(), (et, vl) -> ((TTrpallet)et).setSourcecd((String)vl), "sourcecd");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getSchdate(), (et, vl) -> ((TTrpallet)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceivecd(), (et, vl) -> ((TTrpallet)et).setReceivecd((String)vl), "receivecd");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRcvdate(), (et, vl) -> ((TTrpallet)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceivedate(), (et, vl) -> ((TTrpallet)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getLocationId(), (et, vl) -> ((TTrpallet)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getProductCd(), (et, vl) -> ((TTrpallet)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getLot3(), (et, vl) -> ((TTrpallet)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getManufactureDate(), (et, vl) -> ((TTrpallet)et).setManufactureDate((String)vl), "manufactureDate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getBatarticlesign(), (et, vl) -> ((TTrpallet)et).setBatarticlesign((String)vl), "batarticlesign");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getStockTypeCd(), (et, vl) -> ((TTrpallet)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceiveqtycase(), (et, vl) -> ((TTrpallet)et).setReceiveqtycase(ctb(vl)), "receiveqtycase");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceiveqtybowl(), (et, vl) -> ((TTrpallet)et).setReceiveqtybowl(ctb(vl)), "receiveqtybowl");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceiveqty(), (et, vl) -> ((TTrpallet)et).setReceiveqty(ctb(vl)), "receiveqty");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRestqtycase(), (et, vl) -> ((TTrpallet)et).setRestqtycase(ctb(vl)), "restqtycase");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRestqtybowl(), (et, vl) -> ((TTrpallet)et).setRestqtybowl(ctb(vl)), "restqtybowl");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRestqty(), (et, vl) -> ((TTrpallet)et).setRestqty(ctb(vl)), "restqty");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAllocqty1(), (et, vl) -> ((TTrpallet)et).setAllocqty1(ctb(vl)), "allocqty1");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getFullpalletflg(), (et, vl) -> ((TTrpallet)et).setFullpalletflg((String)vl), "fullpalletflg");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPalletsts(), (et, vl) -> ((TTrpallet)et).setPalletsts((String)vl), "palletsts");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPluralproductionkbn(), (et, vl) -> ((TTrpallet)et).setPluralproductionkbn((String)vl), "pluralproductionkbn");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPalletcuttingkbn(), (et, vl) -> ((TTrpallet)et).setPalletcuttingkbn((String)vl), "palletcuttingkbn");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getRcvpalletno(), (et, vl) -> ((TTrpallet)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getPalletaddflg(), (et, vl) -> ((TTrpallet)et).setPalletaddflg((String)vl), "palletaddflg");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAcceptusercd(), (et, vl) -> ((TTrpallet)et).setAcceptusercd((String)vl), "acceptusercd");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAcceptdate(), (et, vl) -> ((TTrpallet)et).setAcceptdate(cttp(vl)), "acceptdate");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getClientId(), (et, vl) -> ((TTrpallet)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getCenterId(), (et, vl) -> ((TTrpallet)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getReceivePlanBId(), (et, vl) -> ((TTrpallet)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getDelFlg(), (et, vl) -> ((TTrpallet)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getVersionNo(), (et, vl) -> ((TTrpallet)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getControlNo(), (et, vl) -> ((TTrpallet)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAddDt(), (et, vl) -> ((TTrpallet)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAddUser(), (et, vl) -> ((TTrpallet)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getAddProcess(), (et, vl) -> ((TTrpallet)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getUpdDt(), (et, vl) -> ((TTrpallet)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getUpdUser(), (et, vl) -> ((TTrpallet)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpallet)et).getUpdProcess(), (et, vl) -> ((TTrpallet)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLET";
    protected final String _tableDispName = "T_TRPALLET";
    protected final String _tablePropertyName = "TTrpallet";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TPalletList", null, false);
    protected final ColumnInfo _columnPalletNo = cci("PALLET_NO", "PALLET_NO", null, null, java.math.BigDecimal.class, "palletNo", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintingdate = cci("PRINTINGDATE", "PRINTINGDATE", null, null, String.class, "printingdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FIRMCARRYNO", "FIRMCARRYNO", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportno = cci("TRANSPORTNO", "TRANSPORTNO", null, null, String.class, "transportno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourcecd = cci("SOURCECD", "SOURCECD", null, null, String.class, "sourcecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SCHDATE", "SCHDATE", null, null, String.class, "schdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivecd = cci("RECEIVECD", "RECEIVECD", null, null, String.class, "receivecd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RCVDATE", "RCVDATE", null, null, String.class, "rcvdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureDate = cci("MANUFACTURE_DATE", "MANUFACTURE_DATE", null, null, String.class, "manufactureDate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatarticlesign = cci("BATARTICLESIGN", "BATARTICLESIGN", null, null, String.class, "batarticlesign", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtycase = cci("RECEIVEQTYCASE", "RECEIVEQTYCASE", null, null, java.math.BigDecimal.class, "receiveqtycase", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtybowl = cci("RECEIVEQTYBOWL", "RECEIVEQTYBOWL", null, null, java.math.BigDecimal.class, "receiveqtybowl", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqty = cci("RECEIVEQTY", "RECEIVEQTY", null, null, java.math.BigDecimal.class, "receiveqty", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtycase = cci("RESTQTYCASE", "RESTQTYCASE", null, null, java.math.BigDecimal.class, "restqtycase", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtybowl = cci("RESTQTYBOWL", "RESTQTYBOWL", null, null, java.math.BigDecimal.class, "restqtybowl", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqty = cci("RESTQTY", "RESTQTY", null, null, java.math.BigDecimal.class, "restqty", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocqty1 = cci("ALLOCQTY1", "ALLOCQTY1", null, null, java.math.BigDecimal.class, "allocqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFullpalletflg = cci("FULLPALLETFLG", "FULLPALLETFLG", null, null, String.class, "fullpalletflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsts = cci("PALLETSTS", "PALLETSTS", null, null, String.class, "palletsts", null, false, false, true, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPluralproductionkbn = cci("PLURALPRODUCTIONKBN", "PLURALPRODUCTIONKBN", null, null, String.class, "pluralproductionkbn", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletcuttingkbn = cci("PALLETCUTTINGKBN", "PALLETCUTTINGKBN", null, null, String.class, "palletcuttingkbn", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletaddflg = cci("PALLETADDFLG", "PALLETADDFLG", null, null, String.class, "palletaddflg", null, false, false, false, "varchar", 30, 0, null, "(2)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptusercd = cci("ACCEPTUSERCD", "ACCEPTUSERCD", null, null, String.class, "acceptusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptdate = cci("ACCEPTDATE", "ACCEPTDATE", null, null, java.sql.Timestamp.class, "acceptdate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * PALLET_NO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletNo() { return _columnPalletNo; }
    /**
     * LOT_ID: {IX, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * RECEIVE_PLAN_H_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * RCVLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * PRINTEDFLG: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * PRINTINGDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintingdate() { return _columnPrintingdate; }
    /**
     * FIRMCARRYNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * TRANSPORTNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportno() { return _columnTransportno; }
    /**
     * SOURCECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourcecd() { return _columnSourcecd; }
    /**
     * SCHDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * RECEIVECD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivecd() { return _columnReceivecd; }
    /**
     * RCVDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT3: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * MANUFACTURE_DATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureDate() { return _columnManufactureDate; }
    /**
     * BATARTICLESIGN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatarticlesign() { return _columnBatarticlesign; }
    /**
     * STOCK_TYPE_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
    /**
     * RECEIVEQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqtycase() { return _columnReceiveqtycase; }
    /**
     * RECEIVEQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqtybowl() { return _columnReceiveqtybowl; }
    /**
     * RECEIVEQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqty() { return _columnReceiveqty; }
    /**
     * RESTQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtycase() { return _columnRestqtycase; }
    /**
     * RESTQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtybowl() { return _columnRestqtybowl; }
    /**
     * RESTQTY: {IX+, NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqty() { return _columnRestqty; }
    /**
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocqty1() { return _columnAllocqty1; }
    /**
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFullpalletflg() { return _columnFullpalletflg; }
    /**
     * PALLETSTS: {NotNull, varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletsts() { return _columnPalletsts; }
    /**
     * PLURALPRODUCTIONKBN: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPluralproductionkbn() { return _columnPluralproductionkbn; }
    /**
     * PALLETCUTTINGKBN: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletcuttingkbn() { return _columnPalletcuttingkbn; }
    /**
     * RCVPALLETNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * PALLETADDFLG: {varchar(30), default=[(2)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletaddflg() { return _columnPalletaddflg; }
    /**
     * ACCEPTUSERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptusercd() { return _columnAcceptusercd; }
    /**
     * ACCEPTDATE: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptdate() { return _columnAcceptdate; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * RECEIVE_PLAN_B_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
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
        ls.add(columnTrpalletId());
        ls.add(columnPalletNo());
        ls.add(columnLotId());
        ls.add(columnReceivePlanHId());
        ls.add(columnRcvlineno());
        ls.add(columnPrintedflg());
        ls.add(columnPrintingdate());
        ls.add(columnFirmcarryno());
        ls.add(columnTransportno());
        ls.add(columnSourcecd());
        ls.add(columnSchdate());
        ls.add(columnReceivecd());
        ls.add(columnRcvdate());
        ls.add(columnReceivedate());
        ls.add(columnLocationId());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnManufactureDate());
        ls.add(columnBatarticlesign());
        ls.add(columnStockTypeCd());
        ls.add(columnReceiveqtycase());
        ls.add(columnReceiveqtybowl());
        ls.add(columnReceiveqty());
        ls.add(columnRestqtycase());
        ls.add(columnRestqtybowl());
        ls.add(columnRestqty());
        ls.add(columnAllocqty1());
        ls.add(columnFullpalletflg());
        ls.add(columnPalletsts());
        ls.add(columnPluralproductionkbn());
        ls.add(columnPalletcuttingkbn());
        ls.add(columnRcvpalletno());
        ls.add(columnPalletaddflg());
        ls.add(columnAcceptusercd());
        ls.add(columnAcceptdate());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnReceivePlanBId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrpalletId()); }
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
    /**
     * T_PALLET by TRPALLET_ID, named 'TPalletList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPalletList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTrpalletId(), TPalletDbm.getInstance().columnTrpalletId());
        return cri("T_PALLET_FK1", "TPalletList", this, TPalletDbm.getInstance(), mp, false, "TTrpallet");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpallet"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpalletCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpalletBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpallet> getEntityType() { return TTrpallet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpallet newEntity() { return new TTrpallet(); }
    public TTrpallet newMyEntity() { return new TTrpallet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpallet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpallet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
