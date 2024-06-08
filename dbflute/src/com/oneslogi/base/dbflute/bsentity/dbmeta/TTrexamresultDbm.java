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
 * The DB meta of T_TREXAMRESULT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrexamresultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrexamresultDbm _instance = new TTrexamresultDbm();
    private TTrexamresultDbm() {}
    public static TTrexamresultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getTrexamresultId(), (et, vl) -> ((TTrexamresult)et).setTrexamresultId(ctl(vl)), "trexamresultId");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getClientId(), (et, vl) -> ((TTrexamresult)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getCenterId(), (et, vl) -> ((TTrexamresult)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getSupplierrcvno(), (et, vl) -> ((TTrexamresult)et).setSupplierrcvno((String)vl), "supplierrcvno");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getProductCd(), (et, vl) -> ((TTrexamresult)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLot1(), (et, vl) -> ((TTrexamresult)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLot2(), (et, vl) -> ((TTrexamresult)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLot3(), (et, vl) -> ((TTrexamresult)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLot4(), (et, vl) -> ((TTrexamresult)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLot5(), (et, vl) -> ((TTrexamresult)et).setLot5((String)vl), "lot5");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getOtherlot2(), (et, vl) -> ((TTrexamresult)et).setOtherlot2((String)vl), "otherlot2");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getOtherlot3(), (et, vl) -> ((TTrexamresult)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getOtherlot4(), (et, vl) -> ((TTrexamresult)et).setOtherlot4((String)vl), "otherlot4");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getOtherlot5(), (et, vl) -> ((TTrexamresult)et).setOtherlot5(ctb(vl)), "otherlot5");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getDamageflg(), (et, vl) -> ((TTrexamresult)et).setDamageflg(ctb(vl)), "damageflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getNoshippingflg(), (et, vl) -> ((TTrexamresult)et).setNoshippingflg(ctb(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getForeigncargoflg(), (et, vl) -> ((TTrexamresult)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getCustomsreleaseflg(), (et, vl) -> ((TTrexamresult)et).setCustomsreleaseflg(ctb(vl)), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getTaxflg(), (et, vl) -> ((TTrexamresult)et).setTaxflg(ctb(vl)), "taxflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getLotId(), (et, vl) -> ((TTrexamresult)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getExamsts(), (et, vl) -> ((TTrexamresult)et).setExamsts((String)vl), "examsts");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getExamendsts(), (et, vl) -> ((TTrexamresult)et).setExamendsts((String)vl), "examendsts");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getAddflg(), (et, vl) -> ((TTrexamresult)et).setAddflg((String)vl), "addflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getReceivedate(), (et, vl) -> ((TTrexamresult)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getSendflg(), (et, vl) -> ((TTrexamresult)et).setSendflg((String)vl), "sendflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getExamqty(), (et, vl) -> ((TTrexamresult)et).setExamqty(ctb(vl)), "examqty");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getRes40qty(), (et, vl) -> ((TTrexamresult)et).setRes40qty(ctb(vl)), "res40qty");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getInferiorqty(), (et, vl) -> ((TTrexamresult)et).setInferiorqty(ctb(vl)), "inferiorqty");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getNotexamqty(), (et, vl) -> ((TTrexamresult)et).setNotexamqty(ctb(vl)), "notexamqty");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getFirstexamsendflg(), (et, vl) -> ((TTrexamresult)et).setFirstexamsendflg((String)vl), "firstexamsendflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getQualityexamflg(), (et, vl) -> ((TTrexamresult)et).setQualityexamflg((String)vl), "qualityexamflg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getDelFlg(), (et, vl) -> ((TTrexamresult)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getVersionNo(), (et, vl) -> ((TTrexamresult)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getControlNo(), (et, vl) -> ((TTrexamresult)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getAddDt(), (et, vl) -> ((TTrexamresult)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getAddUser(), (et, vl) -> ((TTrexamresult)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getAddProcess(), (et, vl) -> ((TTrexamresult)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getUpdDt(), (et, vl) -> ((TTrexamresult)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getUpdUser(), (et, vl) -> ((TTrexamresult)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrexamresult)et).getUpdProcess(), (et, vl) -> ((TTrexamresult)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TREXAMRESULT";
    protected final String _tableDispName = "T_TREXAMRESULT";
    protected final String _tablePropertyName = "TTrexamresult";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TREXAMRESULT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrexamresultId = cci("TREXAMRESULT_ID", "TREXAMRESULT_ID", null, null, Long.class, "trexamresultId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvno = cci("SUPPLIERRCVNO", "SUPPLIERRCVNO", null, null, String.class, "supplierrcvno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot5 = cci("LOT5", "LOT5", null, null, String.class, "lot5", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2 = cci("OTHERLOT2", "OTHERLOT2", null, null, String.class, "otherlot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3 = cci("OTHERLOT3", "OTHERLOT3", null, null, String.class, "otherlot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot4 = cci("OTHERLOT4", "OTHERLOT4", null, null, String.class, "otherlot4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot5 = cci("OTHERLOT5", "OTHERLOT5", null, null, java.math.BigDecimal.class, "otherlot5", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, java.math.BigDecimal.class, "damageflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, java.math.BigDecimal.class, "noshippingflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, java.math.BigDecimal.class, "foreigncargoflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, java.math.BigDecimal.class, "customsreleaseflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, java.math.BigDecimal.class, "taxflg", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamsts = cci("EXAMSTS", "EXAMSTS", null, null, String.class, "examsts", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamendsts = cci("EXAMENDSTS", "EXAMENDSTS", null, null, String.class, "examendsts", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddflg = cci("ADDFLG", "ADDFLG", null, null, String.class, "addflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("RECEIVEDATE", "RECEIVEDATE", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendflg = cci("SENDFLG", "SENDFLG", null, null, String.class, "sendflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExamqty = cci("EXAMQTY", "EXAMQTY", null, null, java.math.BigDecimal.class, "examqty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRes40qty = cci("RES40QTY", "RES40QTY", null, null, java.math.BigDecimal.class, "res40qty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInferiorqty = cci("INFERIORQTY", "INFERIORQTY", null, null, java.math.BigDecimal.class, "inferiorqty", null, false, false, false, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotexamqty = cci("NOTEXAMQTY", "NOTEXAMQTY", null, null, java.math.BigDecimal.class, "notexamqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstexamsendflg = cci("FIRSTEXAMSENDFLG", "FIRSTEXAMSENDFLG", null, null, String.class, "firstexamsendflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQualityexamflg = cci("QUALITYEXAMFLG", "QUALITYEXAMFLG", null, null, String.class, "qualityexamflg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
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
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrexamresultId() { return _columnTrexamresultId; }
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
     * SUPPLIERRCVNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvno() { return _columnSupplierrcvno; }
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
     * LOT5: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot5() { return _columnLot5; }
    /**
     * OTHERLOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot2() { return _columnOtherlot2; }
    /**
     * OTHERLOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3() { return _columnOtherlot3; }
    /**
     * OTHERLOT4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot4() { return _columnOtherlot4; }
    /**
     * OTHERLOT5: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot5() { return _columnOtherlot5; }
    /**
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * LOT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * EXAMSTS: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamsts() { return _columnExamsts; }
    /**
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamendsts() { return _columnExamendsts; }
    /**
     * ADDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddflg() { return _columnAddflg; }
    /**
     * RECEIVEDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * SENDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendflg() { return _columnSendflg; }
    /**
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExamqty() { return _columnExamqty; }
    /**
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRes40qty() { return _columnRes40qty; }
    /**
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInferiorqty() { return _columnInferiorqty; }
    /**
     * NOTEXAMQTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotexamqty() { return _columnNotexamqty; }
    /**
     * FIRSTEXAMSENDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstexamsendflg() { return _columnFirstexamsendflg; }
    /**
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQualityexamflg() { return _columnQualityexamflg; }
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
        ls.add(columnTrexamresultId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnSupplierrcvno());
        ls.add(columnProductCd());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot5());
        ls.add(columnOtherlot2());
        ls.add(columnOtherlot3());
        ls.add(columnOtherlot4());
        ls.add(columnOtherlot5());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnLotId());
        ls.add(columnExamsts());
        ls.add(columnExamendsts());
        ls.add(columnAddflg());
        ls.add(columnReceivedate());
        ls.add(columnSendflg());
        ls.add(columnExamqty());
        ls.add(columnRes40qty());
        ls.add(columnInferiorqty());
        ls.add(columnNotexamqty());
        ls.add(columnFirstexamsendflg());
        ls.add(columnQualityexamflg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrexamresultId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrexamresult"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrexamresultCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrexamresultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrexamresult> getEntityType() { return TTrexamresult.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrexamresult newEntity() { return new TTrexamresult(); }
    public TTrexamresult newMyEntity() { return new TTrexamresult(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrexamresult)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrexamresult)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
