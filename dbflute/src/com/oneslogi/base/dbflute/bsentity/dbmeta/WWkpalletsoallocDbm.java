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
 * The DB meta of W_WKPALLETSOALLOC. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkpalletsoallocDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkpalletsoallocDbm _instance = new WWkpalletsoallocDbm();
    private WWkpalletsoallocDbm() {}
    public static WWkpalletsoallocDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getWkpalletsoallocId(), (et, vl) -> ((WWkpalletsoalloc)et).setWkpalletsoallocId(ctl(vl)), "wkpalletsoallocId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getTrpalletId(), (et, vl) -> ((WWkpalletsoalloc)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPalletno(), (et, vl) -> ((WWkpalletsoalloc)et).setPalletno(ctl(vl)), "palletno");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getLotId(), (et, vl) -> ((WWkpalletsoalloc)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceivePlanHId(), (et, vl) -> ((WWkpalletsoalloc)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRcvlineno(), (et, vl) -> ((WWkpalletsoalloc)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPrintedflg(), (et, vl) -> ((WWkpalletsoalloc)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPrintingdate(), (et, vl) -> ((WWkpalletsoalloc)et).setPrintingdate((String)vl), "printingdate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getFirmcarryno(), (et, vl) -> ((WWkpalletsoalloc)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getTransportno(), (et, vl) -> ((WWkpalletsoalloc)et).setTransportno((String)vl), "transportno");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getSourcecd(), (et, vl) -> ((WWkpalletsoalloc)et).setSourcecd((String)vl), "sourcecd");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getSchdate(), (et, vl) -> ((WWkpalletsoalloc)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceivecd(), (et, vl) -> ((WWkpalletsoalloc)et).setReceivecd((String)vl), "receivecd");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRcvdate(), (et, vl) -> ((WWkpalletsoalloc)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceivedate(), (et, vl) -> ((WWkpalletsoalloc)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getLocationId(), (et, vl) -> ((WWkpalletsoalloc)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getProductCd(), (et, vl) -> ((WWkpalletsoalloc)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getLot3(), (et, vl) -> ((WWkpalletsoalloc)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getLimitdate(), (et, vl) -> ((WWkpalletsoalloc)et).setLimitdate((String)vl), "limitdate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getBatarticlesign(), (et, vl) -> ((WWkpalletsoalloc)et).setBatarticlesign((String)vl), "batarticlesign");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getOtherlot1(), (et, vl) -> ((WWkpalletsoalloc)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceiveqtycase(), (et, vl) -> ((WWkpalletsoalloc)et).setReceiveqtycase(ctb(vl)), "receiveqtycase");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceiveqtybowl(), (et, vl) -> ((WWkpalletsoalloc)et).setReceiveqtybowl(ctb(vl)), "receiveqtybowl");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getReceiveqty(), (et, vl) -> ((WWkpalletsoalloc)et).setReceiveqty(ctb(vl)), "receiveqty");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRestqtycase(), (et, vl) -> ((WWkpalletsoalloc)et).setRestqtycase(ctb(vl)), "restqtycase");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRestqtybowl(), (et, vl) -> ((WWkpalletsoalloc)et).setRestqtybowl(ctb(vl)), "restqtybowl");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRestqty(), (et, vl) -> ((WWkpalletsoalloc)et).setRestqty(ctb(vl)), "restqty");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAllocqty1(), (et, vl) -> ((WWkpalletsoalloc)et).setAllocqty1(ctb(vl)), "allocqty1");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getTempallocqtycase(), (et, vl) -> ((WWkpalletsoalloc)et).setTempallocqtycase(ctb(vl)), "tempallocqtycase");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getTempallocqtybowl(), (et, vl) -> ((WWkpalletsoalloc)et).setTempallocqtybowl(ctb(vl)), "tempallocqtybowl");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getFullpalletflg(), (et, vl) -> ((WWkpalletsoalloc)et).setFullpalletflg((String)vl), "fullpalletflg");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPalletsts(), (et, vl) -> ((WWkpalletsoalloc)et).setPalletsts((String)vl), "palletsts");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPluralproductionkbn(), (et, vl) -> ((WWkpalletsoalloc)et).setPluralproductionkbn((String)vl), "pluralproductionkbn");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPalletcuttingkbn(), (et, vl) -> ((WWkpalletsoalloc)et).setPalletcuttingkbn((String)vl), "palletcuttingkbn");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getRcvpalletno(), (et, vl) -> ((WWkpalletsoalloc)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getPalletaddflg(), (et, vl) -> ((WWkpalletsoalloc)et).setPalletaddflg((String)vl), "palletaddflg");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAcceptusercd(), (et, vl) -> ((WWkpalletsoalloc)et).setAcceptusercd((String)vl), "acceptusercd");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAcceptdate(), (et, vl) -> ((WWkpalletsoalloc)et).setAcceptdate(cttp(vl)), "acceptdate");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getClientId(), (et, vl) -> ((WWkpalletsoalloc)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getCenterId(), (et, vl) -> ((WWkpalletsoalloc)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getDelFlg(), (et, vl) -> ((WWkpalletsoalloc)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getVersionNo(), (et, vl) -> ((WWkpalletsoalloc)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getControlNo(), (et, vl) -> ((WWkpalletsoalloc)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAddDt(), (et, vl) -> ((WWkpalletsoalloc)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAddUser(), (et, vl) -> ((WWkpalletsoalloc)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getAddProcess(), (et, vl) -> ((WWkpalletsoalloc)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getUpdDt(), (et, vl) -> ((WWkpalletsoalloc)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getUpdUser(), (et, vl) -> ((WWkpalletsoalloc)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkpalletsoalloc)et).getUpdProcess(), (et, vl) -> ((WWkpalletsoalloc)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKPALLETSOALLOC";
    protected final String _tableDispName = "W_WKPALLETSOALLOC";
    protected final String _tablePropertyName = "WWkpalletsoalloc";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKPALLETSOALLOC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWkpalletsoallocId = cci("WKPALLETSOALLOC_ID", "WKPALLETSOALLOC_ID", null, null, Long.class, "wkpalletsoallocId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, Long.class, "palletno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnLimitdate = cci("LIMITDATE", "LIMITDATE", null, null, String.class, "limitdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatarticlesign = cci("BATARTICLESIGN", "BATARTICLESIGN", null, null, String.class, "batarticlesign", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtycase = cci("RECEIVEQTYCASE", "RECEIVEQTYCASE", null, null, java.math.BigDecimal.class, "receiveqtycase", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtybowl = cci("RECEIVEQTYBOWL", "RECEIVEQTYBOWL", null, null, java.math.BigDecimal.class, "receiveqtybowl", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqty = cci("RECEIVEQTY", "RECEIVEQTY", null, null, java.math.BigDecimal.class, "receiveqty", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtycase = cci("RESTQTYCASE", "RESTQTYCASE", null, null, java.math.BigDecimal.class, "restqtycase", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtybowl = cci("RESTQTYBOWL", "RESTQTYBOWL", null, null, java.math.BigDecimal.class, "restqtybowl", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqty = cci("RESTQTY", "RESTQTY", null, null, java.math.BigDecimal.class, "restqty", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocqty1 = cci("ALLOCQTY1", "ALLOCQTY1", null, null, java.math.BigDecimal.class, "allocqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempallocqtycase = cci("TEMPALLOCQTYCASE", "TEMPALLOCQTYCASE", null, null, java.math.BigDecimal.class, "tempallocqtycase", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempallocqtybowl = cci("TEMPALLOCQTYBOWL", "TEMPALLOCQTYBOWL", null, null, java.math.BigDecimal.class, "tempallocqtybowl", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFullpalletflg = cci("FULLPALLETFLG", "FULLPALLETFLG", null, null, String.class, "fullpalletflg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsts = cci("PALLETSTS", "PALLETSTS", null, null, String.class, "palletsts", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPluralproductionkbn = cci("PLURALPRODUCTIONKBN", "PLURALPRODUCTIONKBN", null, null, String.class, "pluralproductionkbn", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletcuttingkbn = cci("PALLETCUTTINGKBN", "PALLETCUTTINGKBN", null, null, String.class, "palletcuttingkbn", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RCVPALLETNO", "RCVPALLETNO", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletaddflg = cci("PALLETADDFLG", "PALLETADDFLG", null, null, String.class, "palletaddflg", null, false, false, false, "char", 1, 0, null, "(2)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptusercd = cci("ACCEPTUSERCD", "ACCEPTUSERCD", null, null, String.class, "acceptusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptdate = cci("ACCEPTDATE", "ACCEPTDATE", null, null, java.sql.Timestamp.class, "acceptdate", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * WKPALLETSOALLOC_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWkpalletsoallocId() { return _columnWkpalletsoallocId; }
    /**
     * TRPALLET_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * PALLETNO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * LOT_ID: {bigint(19)}
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
     * PRINTEDFLG: {NotNull, char(1)}
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
     * LIMITDATE: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitdate() { return _columnLimitdate; }
    /**
     * BATARTICLESIGN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatarticlesign() { return _columnBatarticlesign; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
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
     * RESTQTY: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqty() { return _columnRestqty; }
    /**
     * ALLOCQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocqty1() { return _columnAllocqty1; }
    /**
     * TEMPALLOCQTYCASE: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempallocqtycase() { return _columnTempallocqtycase; }
    /**
     * TEMPALLOCQTYBOWL: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempallocqtybowl() { return _columnTempallocqtybowl; }
    /**
     * FULLPALLETFLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFullpalletflg() { return _columnFullpalletflg; }
    /**
     * PALLETSTS: {NotNull, char(1), default=[(0)]}
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
     * PALLETADDFLG: {char(1), default=[(2)]}
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
        ls.add(columnWkpalletsoallocId());
        ls.add(columnTrpalletId());
        ls.add(columnPalletno());
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
        ls.add(columnLimitdate());
        ls.add(columnBatarticlesign());
        ls.add(columnOtherlot1());
        ls.add(columnReceiveqtycase());
        ls.add(columnReceiveqtybowl());
        ls.add(columnReceiveqty());
        ls.add(columnRestqtycase());
        ls.add(columnRestqtybowl());
        ls.add(columnRestqty());
        ls.add(columnAllocqty1());
        ls.add(columnTempallocqtycase());
        ls.add(columnTempallocqtybowl());
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
    protected UniqueInfo cpui() { return hpcpui(columnWkpalletsoallocId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkpalletsoalloc"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkpalletsoallocCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkpalletsoallocBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkpalletsoalloc> getEntityType() { return WWkpalletsoalloc.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkpalletsoalloc newEntity() { return new WWkpalletsoalloc(); }
    public WWkpalletsoalloc newMyEntity() { return new WWkpalletsoalloc(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkpalletsoalloc)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkpalletsoalloc)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
