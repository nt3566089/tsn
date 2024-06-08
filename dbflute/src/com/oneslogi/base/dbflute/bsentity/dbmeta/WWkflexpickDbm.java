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
 * The DB meta of W_WKFLEXPICK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WWkflexpickDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WWkflexpickDbm _instance = new WWkflexpickDbm();
    private WWkflexpickDbm() {}
    public static WWkflexpickDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getZipInputId(), (et, vl) -> ((WWkflexpick)et).setZipInputId(ctl(vl)), "zipInputId");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getPrintkey(), (et, vl) -> ((WWkflexpick)et).setPrintkey(ctl(vl)), "printkey");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getFlexibityno(), (et, vl) -> ((WWkflexpick)et).setFlexibityno(ctb(vl)), "flexibityno");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getFlexpicklistno(), (et, vl) -> ((WWkflexpick)et).setFlexpicklistno((String)vl), "flexpicklistno");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getFlexpicklistlno(), (et, vl) -> ((WWkflexpick)et).setFlexpicklistlno(ctb(vl)), "flexpicklistlno");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getWarehousecd(), (et, vl) -> ((WWkflexpick)et).setWarehousecd((String)vl), "warehousecd");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getWarehousename(), (et, vl) -> ((WWkflexpick)et).setWarehousename((String)vl), "warehousename");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getShipcd(), (et, vl) -> ((WWkflexpick)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getShipName(), (et, vl) -> ((WWkflexpick)et).setShipName((String)vl), "shipName");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getSchdate(), (et, vl) -> ((WWkflexpick)et).setSchdate((String)vl), "schdate");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getTransportcd(), (et, vl) -> ((WWkflexpick)et).setTransportcd((String)vl), "transportcd");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getProductCd(), (et, vl) -> ((WWkflexpick)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getItemName(), (et, vl) -> ((WWkflexpick)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getManufacturdate(), (et, vl) -> ((WWkflexpick)et).setManufacturdate((String)vl), "manufacturdate");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getDesigncd(), (et, vl) -> ((WWkflexpick)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getQtycase(), (et, vl) -> ((WWkflexpick)et).setQtycase(ctb(vl)), "qtycase");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getQtybowl(), (et, vl) -> ((WWkflexpick)et).setQtybowl(ctb(vl)), "qtybowl");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getRootoutseq(), (et, vl) -> ((WWkflexpick)et).setRootoutseq(ctb(vl)), "rootoutseq");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getUsernum1(), (et, vl) -> ((WWkflexpick)et).setUsernum1(ctl(vl)), "usernum1");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getUsernum3(), (et, vl) -> ((WWkflexpick)et).setUsernum3(ctl(vl)), "usernum3");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getVaExtdata1(), (et, vl) -> ((WWkflexpick)et).setVaExtdata1((String)vl), "vaExtdata1");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getVaExtdata2(), (et, vl) -> ((WWkflexpick)et).setVaExtdata2((String)vl), "vaExtdata2");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getVaExtdata3(), (et, vl) -> ((WWkflexpick)et).setVaExtdata3((String)vl), "vaExtdata3");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNvExtdata1(), (et, vl) -> ((WWkflexpick)et).setNvExtdata1((String)vl), "nvExtdata1");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNvExtdata2(), (et, vl) -> ((WWkflexpick)et).setNvExtdata2((String)vl), "nvExtdata2");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNvExtdata3(), (et, vl) -> ((WWkflexpick)et).setNvExtdata3((String)vl), "nvExtdata3");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNmExtdata1(), (et, vl) -> ((WWkflexpick)et).setNmExtdata1(ctl(vl)), "nmExtdata1");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNmExtdata2(), (et, vl) -> ((WWkflexpick)et).setNmExtdata2(ctl(vl)), "nmExtdata2");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getNmExtdata3(), (et, vl) -> ((WWkflexpick)et).setNmExtdata3(ctl(vl)), "nmExtdata3");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getDtExtdata1(), (et, vl) -> ((WWkflexpick)et).setDtExtdata1((String)vl), "dtExtdata1");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getDtExtdata2(), (et, vl) -> ((WWkflexpick)et).setDtExtdata2((String)vl), "dtExtdata2");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getDtExtdata3(), (et, vl) -> ((WWkflexpick)et).setDtExtdata3((String)vl), "dtExtdata3");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getDelFlg(), (et, vl) -> ((WWkflexpick)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getVersionNo(), (et, vl) -> ((WWkflexpick)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getControlNo(), (et, vl) -> ((WWkflexpick)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getAddDt(), (et, vl) -> ((WWkflexpick)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getAddUser(), (et, vl) -> ((WWkflexpick)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getAddProcess(), (et, vl) -> ((WWkflexpick)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getUpdDt(), (et, vl) -> ((WWkflexpick)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getUpdUser(), (et, vl) -> ((WWkflexpick)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WWkflexpick)et).getUpdProcess(), (et, vl) -> ((WWkflexpick)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_WKFLEXPICK";
    protected final String _tableDispName = "W_WKFLEXPICK";
    protected final String _tablePropertyName = "WWkflexpick";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_WKFLEXPICK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnZipInputId = cci("ZIP_INPUT_ID", "ZIP_INPUT_ID", null, null, Long.class, "zipInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintkey = cci("PrintKey", "PrintKey", null, null, Long.class, "printkey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexibityno = cci("FlexibityNo", "FlexibityNo", null, null, java.math.BigDecimal.class, "flexibityno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexpicklistno = cci("FlexPickListNo", "FlexPickListNo", null, null, String.class, "flexpicklistno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFlexpicklistlno = cci("FlexPickListLNo", "FlexPickListLNo", null, null, java.math.BigDecimal.class, "flexpicklistlno", null, false, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecd = cci("WarehouseCd", "WarehouseCd", null, null, String.class, "warehousecd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousename = cci("WarehouseName", "WarehouseName", null, null, String.class, "warehousename", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("ShipCd", "ShipCd", null, null, String.class, "shipcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipName = cci("Ship_Name", "Ship_Name", null, null, String.class, "shipName", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSchdate = cci("SchDate", "SchDate", null, null, String.class, "schdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportcd = cci("TransportCd", "TransportCd", null, null, String.class, "transportcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemName = cci("Item_Name", "Item_Name", null, null, String.class, "itemName", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufacturdate = cci("ManufacturDate", "ManufacturDate", null, null, String.class, "manufacturdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DesignCd", "DesignCd", null, null, String.class, "designcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtycase = cci("QtyCase", "QtyCase", null, null, java.math.BigDecimal.class, "qtycase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQtybowl = cci("QtyBowl", "QtyBowl", null, null, java.math.BigDecimal.class, "qtybowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRootoutseq = cci("RootOutSeq", "RootOutSeq", null, null, java.math.BigDecimal.class, "rootoutseq", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("UserNum1", "UserNum1", null, null, Long.class, "usernum1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("UserNum3", "UserNum3", null, null, Long.class, "usernum3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata1 = cci("VA_ExtData1", "VA_ExtData1", null, null, String.class, "vaExtdata1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata2 = cci("VA_ExtData2", "VA_ExtData2", null, null, String.class, "vaExtdata2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVaExtdata3 = cci("VA_ExtData3", "VA_ExtData3", null, null, String.class, "vaExtdata3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata1 = cci("NV_ExtData1", "NV_ExtData1", null, null, String.class, "nvExtdata1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata2 = cci("NV_ExtData2", "NV_ExtData2", null, null, String.class, "nvExtdata2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNvExtdata3 = cci("NV_ExtData3", "NV_ExtData3", null, null, String.class, "nvExtdata3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata1 = cci("NM_ExtData1", "NM_ExtData1", null, null, Long.class, "nmExtdata1", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata2 = cci("NM_ExtData2", "NM_ExtData2", null, null, Long.class, "nmExtdata2", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNmExtdata3 = cci("NM_ExtData3", "NM_ExtData3", null, null, Long.class, "nmExtdata3", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata1 = cci("DT_ExtData1", "DT_ExtData1", null, null, String.class, "dtExtdata1", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata2 = cci("DT_ExtData2", "DT_ExtData2", null, null, String.class, "dtExtdata2", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtExtdata3 = cci("DT_ExtData3", "DT_ExtData3", null, null, String.class, "dtExtdata3", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * ZIP_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZipInputId() { return _columnZipInputId; }
    /**
     * PrintKey: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintkey() { return _columnPrintkey; }
    /**
     * FlexibityNo: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexibityno() { return _columnFlexibityno; }
    /**
     * FlexPickListNo: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexpicklistno() { return _columnFlexpicklistno; }
    /**
     * FlexPickListLNo: {NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFlexpicklistlno() { return _columnFlexpicklistlno; }
    /**
     * WarehouseCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecd() { return _columnWarehousecd; }
    /**
     * WarehouseName: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousename() { return _columnWarehousename; }
    /**
     * ShipCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * Ship_Name: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipName() { return _columnShipName; }
    /**
     * SchDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSchdate() { return _columnSchdate; }
    /**
     * TransportCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportcd() { return _columnTransportcd; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * Item_Name: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemName() { return _columnItemName; }
    /**
     * ManufacturDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufacturdate() { return _columnManufacturdate; }
    /**
     * DesignCd: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * QtyCase: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtycase() { return _columnQtycase; }
    /**
     * QtyBowl: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQtybowl() { return _columnQtybowl; }
    /**
     * RootOutSeq: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRootoutseq() { return _columnRootoutseq; }
    /**
     * UserNum1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * UserNum3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * VA_ExtData1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata1() { return _columnVaExtdata1; }
    /**
     * VA_ExtData2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata2() { return _columnVaExtdata2; }
    /**
     * VA_ExtData3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVaExtdata3() { return _columnVaExtdata3; }
    /**
     * NV_ExtData1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata1() { return _columnNvExtdata1; }
    /**
     * NV_ExtData2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata2() { return _columnNvExtdata2; }
    /**
     * NV_ExtData3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNvExtdata3() { return _columnNvExtdata3; }
    /**
     * NM_ExtData1: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata1() { return _columnNmExtdata1; }
    /**
     * NM_ExtData2: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata2() { return _columnNmExtdata2; }
    /**
     * NM_ExtData3: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmExtdata3() { return _columnNmExtdata3; }
    /**
     * DT_ExtData1: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata1() { return _columnDtExtdata1; }
    /**
     * DT_ExtData2: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata2() { return _columnDtExtdata2; }
    /**
     * DT_ExtData3: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtExtdata3() { return _columnDtExtdata3; }
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
        ls.add(columnZipInputId());
        ls.add(columnPrintkey());
        ls.add(columnFlexibityno());
        ls.add(columnFlexpicklistno());
        ls.add(columnFlexpicklistlno());
        ls.add(columnWarehousecd());
        ls.add(columnWarehousename());
        ls.add(columnShipcd());
        ls.add(columnShipName());
        ls.add(columnSchdate());
        ls.add(columnTransportcd());
        ls.add(columnProductCd());
        ls.add(columnItemName());
        ls.add(columnManufacturdate());
        ls.add(columnDesigncd());
        ls.add(columnQtycase());
        ls.add(columnQtybowl());
        ls.add(columnRootoutseq());
        ls.add(columnUsernum1());
        ls.add(columnUsernum3());
        ls.add(columnVaExtdata1());
        ls.add(columnVaExtdata2());
        ls.add(columnVaExtdata3());
        ls.add(columnNvExtdata1());
        ls.add(columnNvExtdata2());
        ls.add(columnNvExtdata3());
        ls.add(columnNmExtdata1());
        ls.add(columnNmExtdata2());
        ls.add(columnNmExtdata3());
        ls.add(columnDtExtdata1());
        ls.add(columnDtExtdata2());
        ls.add(columnDtExtdata3());
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
    protected UniqueInfo cpui() { return hpcpui(columnZipInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WWkflexpick"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WWkflexpickCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WWkflexpickBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WWkflexpick> getEntityType() { return WWkflexpick.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WWkflexpick newEntity() { return new WWkflexpick(); }
    public WWkflexpick newMyEntity() { return new WWkflexpick(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WWkflexpick)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WWkflexpick)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
