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
 * The DB meta of T_TRSORCVDIRECT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsorcvdirectDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsorcvdirectDbm _instance = new TTrsorcvdirectDbm();
    private TTrsorcvdirectDbm() {}
    public static TTrsorcvdirectDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getSojtlineid(), (et, vl) -> ((TTrsorcvdirect)et).setSojtlineid(ctl(vl)), "sojtlineid");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getSorcvdirectkey(), (et, vl) -> ((TTrsorcvdirect)et).setSorcvdirectkey(ctl(vl)), "sorcvdirectkey");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getInstructionsdate(), (et, vl) -> ((TTrsorcvdirect)et).setInstructionsdate((String)vl), "instructionsdate");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getOwnerdirectno(), (et, vl) -> ((TTrsorcvdirect)et).setOwnerdirectno((String)vl), "ownerdirectno");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getSalestype(), (et, vl) -> ((TTrsorcvdirect)et).setSalestype((String)vl), "salestype");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getSalestypecd(), (et, vl) -> ((TTrsorcvdirect)et).setSalestypecd((String)vl), "salestypecd");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getShiptocode(), (et, vl) -> ((TTrsorcvdirect)et).setShiptocode((String)vl), "shiptocode");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getOriginalpono(), (et, vl) -> ((TTrsorcvdirect)et).setOriginalpono((String)vl), "originalpono");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getProductId(), (et, vl) -> ((TTrsorcvdirect)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getExpectqty(), (et, vl) -> ((TTrsorcvdirect)et).setExpectqty(ctl(vl)), "expectqty");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanprice(), (et, vl) -> ((TTrsorcvdirect)et).setPlanprice(ctl(vl)), "planprice");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanpricetotal(), (et, vl) -> ((TTrsorcvdirect)et).setPlanpricetotal(ctl(vl)), "planpricetotal");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanname(), (et, vl) -> ((TTrsorcvdirect)et).setPlanname((String)vl), "planname");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanpost(), (et, vl) -> ((TTrsorcvdirect)et).setPlanpost((String)vl), "planpost");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanaddress1(), (et, vl) -> ((TTrsorcvdirect)et).setPlanaddress1((String)vl), "planaddress1");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanaddress2(), (et, vl) -> ((TTrsorcvdirect)et).setPlanaddress2((String)vl), "planaddress2");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPlanitemname(), (et, vl) -> ((TTrsorcvdirect)et).setPlanitemname((String)vl), "planitemname");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getWarehouseplant(), (et, vl) -> ((TTrsorcvdirect)et).setWarehouseplant((String)vl), "warehouseplant");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getWarehouseplantname(), (et, vl) -> ((TTrsorcvdirect)et).setWarehouseplantname((String)vl), "warehouseplantname");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getWarehousename(), (et, vl) -> ((TTrsorcvdirect)et).setWarehousename((String)vl), "warehousename");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getOrderdate(), (et, vl) -> ((TTrsorcvdirect)et).setOrderdate((String)vl), "orderdate");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getDeliverydate(), (et, vl) -> ((TTrsorcvdirect)et).setDeliverydate((String)vl), "deliverydate");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getPurchasenumber(), (et, vl) -> ((TTrsorcvdirect)et).setPurchasenumber((String)vl), "purchasenumber");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getOrdernumber(), (et, vl) -> ((TTrsorcvdirect)et).setOrdernumber(ctl(vl)), "ordernumber");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getItemlineno(), (et, vl) -> ((TTrsorcvdirect)et).setItemlineno((String)vl), "itemlineno");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getSkucode(), (et, vl) -> ((TTrsorcvdirect)et).setSkucode((String)vl), "skucode");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getCardboard(), (et, vl) -> ((TTrsorcvdirect)et).setCardboard(ctl(vl)), "cardboard");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getCarton(), (et, vl) -> ((TTrsorcvdirect)et).setCarton(ctl(vl)), "carton");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getTotalexpectqty(), (et, vl) -> ((TTrsorcvdirect)et).setTotalexpectqty(ctl(vl)), "totalexpectqty");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getTotalcardboardqty(), (et, vl) -> ((TTrsorcvdirect)et).setTotalcardboardqty(ctl(vl)), "totalcardboardqty");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getTotalcartonqty(), (et, vl) -> ((TTrsorcvdirect)et).setTotalcartonqty(ctl(vl)), "totalcartonqty");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getNote(), (et, vl) -> ((TTrsorcvdirect)et).setNote((String)vl), "note");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getReserve2(), (et, vl) -> ((TTrsorcvdirect)et).setReserve2((String)vl), "reserve2");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getReserve3(), (et, vl) -> ((TTrsorcvdirect)et).setReserve3((String)vl), "reserve3");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getReserve(), (et, vl) -> ((TTrsorcvdirect)et).setReserve((String)vl), "reserve");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getCenterid(), (et, vl) -> ((TTrsorcvdirect)et).setCenterid(ctl(vl)), "centerid");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getClientid(), (et, vl) -> ((TTrsorcvdirect)et).setClientid(ctl(vl)), "clientid");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getDelFlg(), (et, vl) -> ((TTrsorcvdirect)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getVersionNo(), (et, vl) -> ((TTrsorcvdirect)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getControlNo(), (et, vl) -> ((TTrsorcvdirect)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getAddDt(), (et, vl) -> ((TTrsorcvdirect)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getAddUser(), (et, vl) -> ((TTrsorcvdirect)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getAddProcess(), (et, vl) -> ((TTrsorcvdirect)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getUpdDt(), (et, vl) -> ((TTrsorcvdirect)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getUpdUser(), (et, vl) -> ((TTrsorcvdirect)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsorcvdirect)et).getUpdProcess(), (et, vl) -> ((TTrsorcvdirect)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSORCVDIRECT";
    protected final String _tableDispName = "T_TRSORCVDIRECT";
    protected final String _tablePropertyName = "TTrsorcvdirect";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSORCVDIRECT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSojtlineid = cci("SOJTLINEID", "SOJTLINEID", null, null, Long.class, "sojtlineid", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSorcvdirectkey = cci("SoRcvDirectKey", "SoRcvDirectKey", null, null, Long.class, "sorcvdirectkey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstructionsdate = cci("InstructionsDate", "InstructionsDate", null, null, String.class, "instructionsdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerdirectno = cci("OwnerDirectNo", "OwnerDirectNo", null, null, String.class, "ownerdirectno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalestype = cci("SalesType", "SalesType", null, null, String.class, "salestype", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalestypecd = cci("SalesTypeCd", "SalesTypeCd", null, null, String.class, "salestypecd", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocode = cci("ShipToCode", "ShipToCode", null, null, String.class, "shiptocode", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalpono = cci("OriginalPONo", "OriginalPONo", null, null, String.class, "originalpono", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty = cci("ExpectQty", "ExpectQty", null, null, Long.class, "expectqty", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanprice = cci("PlanPrice", "PlanPrice", null, null, Long.class, "planprice", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanpricetotal = cci("PlanPriceTotal", "PlanPriceTotal", null, null, Long.class, "planpricetotal", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanname = cci("PlanName", "PlanName", null, null, String.class, "planname", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanpost = cci("PlanPost", "PlanPost", null, null, String.class, "planpost", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanaddress1 = cci("PlanAddress1", "PlanAddress1", null, null, String.class, "planaddress1", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanaddress2 = cci("PlanAddress2", "PlanAddress2", null, null, String.class, "planaddress2", null, false, false, true, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanitemname = cci("PlanItemName", "PlanItemName", null, null, String.class, "planitemname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseplant = cci("WareHousePlant", "WareHousePlant", null, null, String.class, "warehouseplant", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseplantname = cci("WareHousePlantName", "WareHousePlantName", null, null, String.class, "warehouseplantname", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousename = cci("WareHouseName", "WareHouseName", null, null, String.class, "warehousename", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderdate = cci("OrderDate", "OrderDate", null, null, String.class, "orderdate", null, false, false, true, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverydate = cci("DeliveryDate", "DeliveryDate", null, null, String.class, "deliverydate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchasenumber = cci("PurchaseNumber", "PurchaseNumber", null, null, String.class, "purchasenumber", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdernumber = cci("OrderNumber", "OrderNumber", null, null, Long.class, "ordernumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemlineno = cci("ItemLineNo", "ItemLineNo", null, null, String.class, "itemlineno", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkucode = cci("SkuCode", "SkuCode", null, null, String.class, "skucode", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardboard = cci("CardBoard", "CardBoard", null, null, Long.class, "cardboard", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarton = cci("CarTon", "CarTon", null, null, Long.class, "carton", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalexpectqty = cci("TotalExpectQty", "TotalExpectQty", null, null, Long.class, "totalexpectqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalcardboardqty = cci("TotalCardBoardQty", "TotalCardBoardQty", null, null, Long.class, "totalcardboardqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalcartonqty = cci("TotalCarTonQty", "TotalCarTonQty", null, null, Long.class, "totalcartonqty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNote = cci("Note", "Note", null, null, String.class, "note", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve2 = cci("Reserve2", "Reserve2", null, null, String.class, "reserve2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve3 = cci("Reserve3", "Reserve3", null, null, String.class, "reserve3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReserve = cci("Reserve", "Reserve", null, null, String.class, "reserve", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterid = cci("CenterId", "CenterId", null, null, Long.class, "centerid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientid = cci("ClientId", "ClientId", null, null, Long.class, "clientid", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSojtlineid() { return _columnSojtlineid; }
    /**
     * SoRcvDirectKey: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSorcvdirectkey() { return _columnSorcvdirectkey; }
    /**
     * InstructionsDate: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstructionsdate() { return _columnInstructionsdate; }
    /**
     * OwnerDirectNo: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerdirectno() { return _columnOwnerdirectno; }
    /**
     * SalesType: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalestype() { return _columnSalestype; }
    /**
     * SalesTypeCd: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalestypecd() { return _columnSalestypecd; }
    /**
     * ShipToCode: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocode() { return _columnShiptocode; }
    /**
     * OriginalPONo: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalpono() { return _columnOriginalpono; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * ExpectQty: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty() { return _columnExpectqty; }
    /**
     * PlanPrice: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanprice() { return _columnPlanprice; }
    /**
     * PlanPriceTotal: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanpricetotal() { return _columnPlanpricetotal; }
    /**
     * PlanName: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanname() { return _columnPlanname; }
    /**
     * PlanPost: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanpost() { return _columnPlanpost; }
    /**
     * PlanAddress1: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanaddress1() { return _columnPlanaddress1; }
    /**
     * PlanAddress2: {NotNull, varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanaddress2() { return _columnPlanaddress2; }
    /**
     * PlanItemName: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanitemname() { return _columnPlanitemname; }
    /**
     * WareHousePlant: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseplant() { return _columnWarehouseplant; }
    /**
     * WareHousePlantName: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseplantname() { return _columnWarehouseplantname; }
    /**
     * WareHouseName: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousename() { return _columnWarehousename; }
    /**
     * OrderDate: {NotNull, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderdate() { return _columnOrderdate; }
    /**
     * DeliveryDate: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverydate() { return _columnDeliverydate; }
    /**
     * PurchaseNumber: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasenumber() { return _columnPurchasenumber; }
    /**
     * OrderNumber: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdernumber() { return _columnOrdernumber; }
    /**
     * ItemLineNo: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemlineno() { return _columnItemlineno; }
    /**
     * SkuCode: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkucode() { return _columnSkucode; }
    /**
     * CardBoard: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardboard() { return _columnCardboard; }
    /**
     * CarTon: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarton() { return _columnCarton; }
    /**
     * TotalExpectQty: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalexpectqty() { return _columnTotalexpectqty; }
    /**
     * TotalCardBoardQty: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalcardboardqty() { return _columnTotalcardboardqty; }
    /**
     * TotalCarTonQty: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalcartonqty() { return _columnTotalcartonqty; }
    /**
     * Note: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNote() { return _columnNote; }
    /**
     * Reserve2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve2() { return _columnReserve2; }
    /**
     * Reserve3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve3() { return _columnReserve3; }
    /**
     * Reserve: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReserve() { return _columnReserve; }
    /**
     * CenterId: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterid() { return _columnCenterid; }
    /**
     * ClientId: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientid() { return _columnClientid; }
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
        ls.add(columnSojtlineid());
        ls.add(columnSorcvdirectkey());
        ls.add(columnInstructionsdate());
        ls.add(columnOwnerdirectno());
        ls.add(columnSalestype());
        ls.add(columnSalestypecd());
        ls.add(columnShiptocode());
        ls.add(columnOriginalpono());
        ls.add(columnProductId());
        ls.add(columnExpectqty());
        ls.add(columnPlanprice());
        ls.add(columnPlanpricetotal());
        ls.add(columnPlanname());
        ls.add(columnPlanpost());
        ls.add(columnPlanaddress1());
        ls.add(columnPlanaddress2());
        ls.add(columnPlanitemname());
        ls.add(columnWarehouseplant());
        ls.add(columnWarehouseplantname());
        ls.add(columnWarehousename());
        ls.add(columnOrderdate());
        ls.add(columnDeliverydate());
        ls.add(columnPurchasenumber());
        ls.add(columnOrdernumber());
        ls.add(columnItemlineno());
        ls.add(columnSkucode());
        ls.add(columnCardboard());
        ls.add(columnCarton());
        ls.add(columnTotalexpectqty());
        ls.add(columnTotalcardboardqty());
        ls.add(columnTotalcartonqty());
        ls.add(columnNote());
        ls.add(columnReserve2());
        ls.add(columnReserve3());
        ls.add(columnReserve());
        ls.add(columnCenterid());
        ls.add(columnClientid());
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
    protected UniqueInfo cpui() { return hpcpui(columnSojtlineid()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsorcvdirect"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsorcvdirectCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsorcvdirectBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsorcvdirect> getEntityType() { return TTrsorcvdirect.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsorcvdirect newEntity() { return new TTrsorcvdirect(); }
    public TTrsorcvdirect newMyEntity() { return new TTrsorcvdirect(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsorcvdirect)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsorcvdirect)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
