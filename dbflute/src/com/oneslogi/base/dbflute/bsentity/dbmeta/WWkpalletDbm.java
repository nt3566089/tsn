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
 * The DB meta of W_WKPALLET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkpalletDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkpalletDbm _instance = new WWkpalletDbm();
    private WWkpalletDbm() {}
    public static WWkpalletDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkpallet)et).getWkpalletId(), (et, vl) -> ((WWkpallet)et).setWkpalletId(ctl(vl)), "wkpalletId");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPalletno(), (et, vl) -> ((WWkpallet)et).setPalletno(ctb(vl)), "palletno");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPrintkey(), (et, vl) -> ((WWkpallet)et).setPrintkey(ctl(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLotkey(), (et, vl) -> ((WWkpallet)et).setLotkey(ctl(vl)), "lotkey");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRcvkey(), (et, vl) -> ((WWkpallet)et).setRcvkey(ctb(vl)), "rcvkey");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRcvlineno(), (et, vl) -> ((WWkpallet)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPrintedflg(), (et, vl) -> ((WWkpallet)et).setPrintedflg((String)vl), "printedflg");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPrintingdate(), (et, vl) -> ((WWkpallet)et).setPrintingdate((String)vl), "printingdate");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLot1(), (et, vl) -> ((WWkpallet)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getTransportno(), (et, vl) -> ((WWkpallet)et).setTransportno((String)vl), "transportno");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getSourcecd(), (et, vl) -> ((WWkpallet)et).setSourcecd((String)vl), "sourcecd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getSchdate(), (et, vl) -> ((WWkpallet)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getReceivecd(), (et, vl) -> ((WWkpallet)et).setReceivecd((String)vl), "receivecd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRcvdate(), (et, vl) -> ((WWkpallet)et).setRcvdate((String)vl), "rcvdate");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getReceivedate(), (et, vl) -> ((WWkpallet)et).setReceivedate((String)vl), "receivedate");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getWarehousecd(), (et, vl) -> ((WWkpallet)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getProductCd(), (et, vl) -> ((WWkpallet)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLot3(), (et, vl) -> ((WWkpallet)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLot4(), (et, vl) -> ((WWkpallet)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLot2(), (et, vl) -> ((WWkpallet)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getReceiveqtycase(), (et, vl) -> ((WWkpallet)et).setReceiveqtycase(ctb(vl)), "receiveqtycase");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getReceiveqtybowl(), (et, vl) -> ((WWkpallet)et).setReceiveqtybowl(ctb(vl)), "receiveqtybowl");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getReceiveqty(), (et, vl) -> ((WWkpallet)et).setReceiveqty(ctb(vl)), "receiveqty");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRestqtycase(), (et, vl) -> ((WWkpallet)et).setRestqtycase(ctb(vl)), "restqtycase");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRestqtybowl(), (et, vl) -> ((WWkpallet)et).setRestqtybowl(ctb(vl)), "restqtybowl");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRestqty(), (et, vl) -> ((WWkpallet)et).setRestqty(ctb(vl)), "restqty");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPalletsts(), (et, vl) -> ((WWkpallet)et).setPalletsts((String)vl), "palletsts");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPluralproductionkbn(), (et, vl) -> ((WWkpallet)et).setPluralproductionkbn((String)vl), "pluralproductionkbn");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRtnrcvkbn(), (et, vl) -> ((WWkpallet)et).setRtnrcvkbn((String)vl), "rtnrcvkbn");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getShtypecd(), (et, vl) -> ((WWkpallet)et).setShtypecd((String)vl), "shtypecd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getPalletcuttingkbn(), (et, vl) -> ((WWkpallet)et).setPalletcuttingkbn((String)vl), "palletcuttingkbn");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getLoccd(), (et, vl) -> ((WWkpallet)et).setLoccd((String)vl), "loccd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getRcvpalletno(), (et, vl) -> ((WWkpallet)et).setRcvpalletno((String)vl), "rcvpalletno");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getImagename1(), (et, vl) -> ((WWkpallet)et).setImagename1((String)vl), "imagename1");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getImagename2(), (et, vl) -> ((WWkpallet)et).setImagename2((String)vl), "imagename2");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getImagename3(), (et, vl) -> ((WWkpallet)et).setImagename3((String)vl), "imagename3");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getWarehouseSname(), (et, vl) -> ((WWkpallet)et).setWarehouseSname((String)vl), "warehouseSname");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getItemSname(), (et, vl) -> ((WWkpallet)et).setItemSname((String)vl), "itemSname");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getForeigncargocd(), (et, vl) -> ((WWkpallet)et).setForeigncargocd((String)vl), "foreigncargocd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getCarrierseq(), (et, vl) -> ((WWkpallet)et).setCarrierseq((String)vl), "carrierseq");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getOtherlot1(), (et, vl) -> ((WWkpallet)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getUsernum3(), (et, vl) -> ((WWkpallet)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAddress2(), (et, vl) -> ((WWkpallet)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAcceptusercd(), (et, vl) -> ((WWkpallet)et).setAcceptusercd((String)vl), "acceptusercd");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAcceptdate(), (et, vl) -> ((WWkpallet)et).setAcceptdate((String)vl), "acceptdate");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getDelFlg(), (et, vl) -> ((WWkpallet)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getVersionNo(), (et, vl) -> ((WWkpallet)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getControlNo(), (et, vl) -> ((WWkpallet)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAddDt(), (et, vl) -> ((WWkpallet)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAddUser(), (et, vl) -> ((WWkpallet)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getAddProcess(), (et, vl) -> ((WWkpallet)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getUpdDt(), (et, vl) -> ((WWkpallet)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getUpdUser(), (et, vl) -> ((WWkpallet)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkpallet)et).getUpdProcess(), (et, vl) -> ((WWkpallet)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKPALLET";
    protected final String _tableDispName = "W_WKPALLET";
    protected final String _tablePropertyName = "WWkpallet";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKPALLET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWkpalletId = cci("WKPALLET_ID", "WKPALLET_ID", null, null, Long.class, "wkpalletId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PALLETNO", "PALLETNO", null, null, java.math.BigDecimal.class, "palletno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintkey = cci("PRINTKEY", "PRINTKEY", null, null, Long.class, "printkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotkey = cci("LotKey", "LotKey", null, null, Long.class, "lotkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvkey = cci("RcvKey", "RcvKey", null, null, java.math.BigDecimal.class, "rcvkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RcvLineNo", "RcvLineNo", null, null, Long.class, "rcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintedflg = cci("PRINTEDFLG", "PRINTEDFLG", null, null, String.class, "printedflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintingdate = cci("PrintingDate", "PrintingDate", null, null, String.class, "printingdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportno = cci("TRANSPORTNO", "TRANSPORTNO", null, null, String.class, "transportno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSourcecd = cci("SourceCd", "SourceCd", null, null, String.class, "sourcecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SchDate", "SchDate", null, null, String.class, "schdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivecd = cci("ReceiveCd", "ReceiveCd", null, null, String.class, "receivecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvdate = cci("RcvDate", "RcvDate", null, null, String.class, "rcvdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedate = cci("ReceiveDate", "ReceiveDate", null, null, String.class, "receivedate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WAREHOUSECD", "WAREHOUSECD", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtycase = cci("ReceiveQtyCase", "ReceiveQtyCase", null, null, java.math.BigDecimal.class, "receiveqtycase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqtybowl = cci("ReceiveQtyBowl", "ReceiveQtyBowl", null, null, java.math.BigDecimal.class, "receiveqtybowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveqty = cci("ReceiveQty", "ReceiveQty", null, null, java.math.BigDecimal.class, "receiveqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtycase = cci("RestQtyCase", "RestQtyCase", null, null, java.math.BigDecimal.class, "restqtycase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqtybowl = cci("RestQtyBowl", "RestQtyBowl", null, null, java.math.BigDecimal.class, "restqtybowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestqty = cci("RestQty", "RestQty", null, null, java.math.BigDecimal.class, "restqty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletsts = cci("PalletSts", "PalletSts", null, null, String.class, "palletsts", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPluralproductionkbn = cci("PluralproductionKBN", "PluralproductionKBN", null, null, String.class, "pluralproductionkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRtnrcvkbn = cci("RtnRcvKbn", "RtnRcvKbn", null, null, String.class, "rtnrcvkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShtypecd = cci("ShTypeCd", "ShTypeCd", null, null, String.class, "shtypecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletcuttingkbn = cci("PALLETCUTTINGKBN", "PALLETCUTTINGKBN", null, null, String.class, "palletcuttingkbn", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoccd = cci("LOCCD", "LOCCD", null, null, String.class, "loccd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvpalletno = cci("RcvPalletNo", "RcvPalletNo", null, null, String.class, "rcvpalletno", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImagename1 = cci("IMAGENAME1", "IMAGENAME1", null, null, String.class, "imagename1", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImagename2 = cci("IMAGENAME2", "IMAGENAME2", null, null, String.class, "imagename2", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImagename3 = cci("IMAGENAME3", "IMAGENAME3", null, null, String.class, "imagename3", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseSname = cci("WAREHOUSE_SNAME", "WAREHOUSE_SNAME", null, null, String.class, "warehouseSname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemSname = cci("ITEM_SNAME", "ITEM_SNAME", null, null, String.class, "itemSname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargocd = cci("FOREIGNCARGOCD", "FOREIGNCARGOCD", null, null, String.class, "foreigncargocd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierseq = cci("CARRIERSEQ", "CARRIERSEQ", null, null, String.class, "carrierseq", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("ADDRESS2", "ADDRESS2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptusercd = cci("AcceptUserCd", "AcceptUserCd", null, null, String.class, "acceptusercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAcceptdate = cci("AcceptDate", "AcceptDate", null, null, String.class, "acceptdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWkpalletId() { return _columnWkpalletId; }
    /**
     * PALLETNO: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * PRINTKEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintkey() { return _columnPrintkey; }
    /**
     * LotKey: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotkey() { return _columnLotkey; }
    /**
     * RcvKey: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvkey() { return _columnRcvkey; }
    /**
     * RcvLineNo: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * PRINTEDFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintedflg() { return _columnPrintedflg; }
    /**
     * PrintingDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintingdate() { return _columnPrintingdate; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * TRANSPORTNO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportno() { return _columnTransportno; }
    /**
     * SourceCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSourcecd() { return _columnSourcecd; }
    /**
     * SchDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * ReceiveCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivecd() { return _columnReceivecd; }
    /**
     * RcvDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvdate() { return _columnRcvdate; }
    /**
     * ReceiveDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedate() { return _columnReceivedate; }
    /**
     * WAREHOUSECD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOT3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * ReceiveQtyCase: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqtycase() { return _columnReceiveqtycase; }
    /**
     * ReceiveQtyBowl: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqtybowl() { return _columnReceiveqtybowl; }
    /**
     * ReceiveQty: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveqty() { return _columnReceiveqty; }
    /**
     * RestQtyCase: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtycase() { return _columnRestqtycase; }
    /**
     * RestQtyBowl: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqtybowl() { return _columnRestqtybowl; }
    /**
     * RestQty: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestqty() { return _columnRestqty; }
    /**
     * PalletSts: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletsts() { return _columnPalletsts; }
    /**
     * PluralproductionKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPluralproductionkbn() { return _columnPluralproductionkbn; }
    /**
     * RtnRcvKbn: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRtnrcvkbn() { return _columnRtnrcvkbn; }
    /**
     * ShTypeCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShtypecd() { return _columnShtypecd; }
    /**
     * PALLETCUTTINGKBN: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletcuttingkbn() { return _columnPalletcuttingkbn; }
    /**
     * LOCCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoccd() { return _columnLoccd; }
    /**
     * RcvPalletNo: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvpalletno() { return _columnRcvpalletno; }
    /**
     * IMAGENAME1: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImagename1() { return _columnImagename1; }
    /**
     * IMAGENAME2: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImagename2() { return _columnImagename2; }
    /**
     * IMAGENAME3: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImagename3() { return _columnImagename3; }
    /**
     * WAREHOUSE_SNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseSname() { return _columnWarehouseSname; }
    /**
     * ITEM_SNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemSname() { return _columnItemSname; }
    /**
     * FOREIGNCARGOCD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargocd() { return _columnForeigncargocd; }
    /**
     * CARRIERSEQ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierseq() { return _columnCarrierseq; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * USERNUM3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * AcceptUserCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptusercd() { return _columnAcceptusercd; }
    /**
     * AcceptDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAcceptdate() { return _columnAcceptdate; }
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
        ls.add(columnWkpalletId());
        ls.add(columnPalletno());
        ls.add(columnPrintkey());
        ls.add(columnLotkey());
        ls.add(columnRcvkey());
        ls.add(columnRcvlineno());
        ls.add(columnPrintedflg());
        ls.add(columnPrintingdate());
        ls.add(columnLot1());
        ls.add(columnTransportno());
        ls.add(columnSourcecd());
        ls.add(columnSchdate());
        ls.add(columnReceivecd());
        ls.add(columnRcvdate());
        ls.add(columnReceivedate());
        ls.add(columnWarehousecd());
        ls.add(columnProductCd());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot2());
        ls.add(columnReceiveqtycase());
        ls.add(columnReceiveqtybowl());
        ls.add(columnReceiveqty());
        ls.add(columnRestqtycase());
        ls.add(columnRestqtybowl());
        ls.add(columnRestqty());
        ls.add(columnPalletsts());
        ls.add(columnPluralproductionkbn());
        ls.add(columnRtnrcvkbn());
        ls.add(columnShtypecd());
        ls.add(columnPalletcuttingkbn());
        ls.add(columnLoccd());
        ls.add(columnRcvpalletno());
        ls.add(columnImagename1());
        ls.add(columnImagename2());
        ls.add(columnImagename3());
        ls.add(columnWarehouseSname());
        ls.add(columnItemSname());
        ls.add(columnForeigncargocd());
        ls.add(columnCarrierseq());
        ls.add(columnOtherlot1());
        ls.add(columnUsernum3());
        ls.add(columnAddress2());
        ls.add(columnAcceptusercd());
        ls.add(columnAcceptdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnWkpalletId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkpallet"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkpalletCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkpalletBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkpallet> getEntityType() { return WWkpallet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkpallet newEntity() { return new WWkpallet(); }
    public WWkpallet newMyEntity() { return new WWkpallet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkpallet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkpallet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
