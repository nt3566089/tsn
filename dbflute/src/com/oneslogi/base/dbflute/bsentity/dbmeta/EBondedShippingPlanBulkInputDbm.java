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
 * The DB meta of E_BONDED_SHIPPING_PLAN_BULK_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EBondedShippingPlanBulkInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EBondedShippingPlanBulkInputDbm _instance = new EBondedShippingPlanBulkInputDbm();
    private EBondedShippingPlanBulkInputDbm() {}
    public static EBondedShippingPlanBulkInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getBondedShippingPlanBulkInputId(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setBondedShippingPlanBulkInputId(ctl(vl)), "bondedShippingPlanBulkInputId");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getReceiveCd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getReceiveRowId(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getImportFlg(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getErrorFlg(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getErrorMessageCd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getSbwarehousecd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setSbwarehousecd((String)vl), "sbwarehousecd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getCustorderno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getOrdertype(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getShipcd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setShipcd((String)vl), "shipcd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getCarryoutplancd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setCarryoutplancd((String)vl), "carryoutplancd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getShiptocd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setShiptocd((String)vl), "shiptocd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getShiptonm(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setShiptonm((String)vl), "shiptonm");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getReceiveplanym(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setReceiveplanym((String)vl), "receiveplanym");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getShtypecd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setShtypecd((String)vl), "shtypecd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getShtypenm(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setShtypenm((String)vl), "shtypenm");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getRefno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setRefno((String)vl), "refno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getPickingcomment(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setPickingcomment((String)vl), "pickingcomment");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getPhoneno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setPhoneno((String)vl), "phoneno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getBatjmfym(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setBatjmfym((String)vl), "batjmfym");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getRmano(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getOwnerorderno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setOwnerorderno((String)vl), "ownerorderno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getPalletno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setPalletno((String)vl), "palletno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getProductCd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getDesigncd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setDesigncd((String)vl), "designcd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getManufactureym(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setManufactureym((String)vl), "manufactureym");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getFirmcarryno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setFirmcarryno((String)vl), "firmcarryno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getQty(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setQty((String)vl), "qty");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getInoutkbn(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setInoutkbn((String)vl), "inoutkbn");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getStocktype(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setStocktype((String)vl), "stocktype");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getCustomsreleasedate(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setCustomsreleasedate((String)vl), "customsreleasedate");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getSuppliercvno(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setSuppliercvno((String)vl), "suppliercvno");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getIfitemcd(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getSendflg(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setSendflg((String)vl), "sendflg");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getPalletorder(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setPalletorder((String)vl), "palletorder");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getPallettype(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setPallettype((String)vl), "pallettype");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getDelFlg(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getVersionNo(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getControlNo(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getAddDt(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getAddUser(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getAddProcess(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getUpdDt(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getUpdUser(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EBondedShippingPlanBulkInput)et).getUpdProcess(), (et, vl) -> ((EBondedShippingPlanBulkInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_BONDED_SHIPPING_PLAN_BULK_INPUT";
    protected final String _tableDispName = "E_BONDED_SHIPPING_PLAN_BULK_INPUT";
    protected final String _tablePropertyName = "EBondedShippingPlanBulkInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_BONDED_SHIPPING_PLAN_BULK_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBondedShippingPlanBulkInputId = cci("BONDED_SHIPPING_PLAN_BULK_INPUT_ID", "BONDED_SHIPPING_PLAN_BULK_INPUT_ID", null, null, Long.class, "bondedShippingPlanBulkInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSbwarehousecd = cci("SBWAREHOUSECD", "SBWAREHOUSECD", null, null, String.class, "sbwarehousecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipcd = cci("SHIPCD", "SHIPCD", null, null, String.class, "shipcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarryoutplancd = cci("CarryoutPlanCd", "CarryoutPlanCd", null, null, String.class, "carryoutplancd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptocd = cci("ShipToCd", "ShipToCd", null, null, String.class, "shiptocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShiptonm = cci("ShipToNm", "ShipToNm", null, null, String.class, "shiptonm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveplanym = cci("ReceivePlanYm", "ReceivePlanYm", null, null, String.class, "receiveplanym", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShtypecd = cci("ShTypeCd", "ShTypeCd", null, null, String.class, "shtypecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShtypenm = cci("ShTypeNm", "ShTypeNm", null, null, String.class, "shtypenm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefno = cci("Refno", "Refno", null, null, String.class, "refno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingcomment = cci("PickingComment", "PickingComment", null, null, String.class, "pickingcomment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneno = cci("PhoneNo", "PhoneNo", null, null, String.class, "phoneno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjmfym = cci("BATJMfYm", "BATJMfYm", null, null, String.class, "batjmfym", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RmaNo", "RmaNo", null, null, String.class, "rmano", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderno = cci("OwnerOrderNo", "OwnerOrderNo", null, null, String.class, "ownerorderno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletno = cci("PalletNo", "PalletNo", null, null, String.class, "palletno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesigncd = cci("DesignCd", "DesignCd", null, null, String.class, "designcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManufactureym = cci("ManufactureYm", "ManufactureYm", null, null, String.class, "manufactureym", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmcarryno = cci("FirmcarryNo", "FirmcarryNo", null, null, String.class, "firmcarryno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty = cci("Qty", "Qty", null, null, String.class, "qty", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutkbn = cci("InOutKbn", "InOutKbn", null, null, String.class, "inoutkbn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStocktype = cci("StockType", "StockType", null, null, String.class, "stocktype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleasedate = cci("CustomsReleaseDate", "CustomsReleaseDate", null, null, String.class, "customsreleasedate", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercvno = cci("SupplierCvNo", "SupplierCvNo", null, null, String.class, "suppliercvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IfItemCd", "IfItemCd", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendflg = cci("SendFlg", "SendFlg", null, null, String.class, "sendflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletorder = cci("PalletOrder", "PalletOrder", null, null, String.class, "palletorder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPallettype = cci("PalletType", "PalletType", null, null, String.class, "pallettype", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBondedShippingPlanBulkInputId() { return _columnBondedShippingPlanBulkInputId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * SBWAREHOUSECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSbwarehousecd() { return _columnSbwarehousecd; }
    /**
     * CUSTORDERNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * ORDERTYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * SHIPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipcd() { return _columnShipcd; }
    /**
     * CarryoutPlanCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarryoutplancd() { return _columnCarryoutplancd; }
    /**
     * ShipToCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptocd() { return _columnShiptocd; }
    /**
     * ShipToNm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiptonm() { return _columnShiptonm; }
    /**
     * ReceivePlanYm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveplanym() { return _columnReceiveplanym; }
    /**
     * ShTypeCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShtypecd() { return _columnShtypecd; }
    /**
     * ShTypeNm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShtypenm() { return _columnShtypenm; }
    /**
     * Refno: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefno() { return _columnRefno; }
    /**
     * PickingComment: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingcomment() { return _columnPickingcomment; }
    /**
     * PhoneNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneno() { return _columnPhoneno; }
    /**
     * BATJMfYm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjmfym() { return _columnBatjmfym; }
    /**
     * RmaNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * OwnerOrderNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderno() { return _columnOwnerorderno; }
    /**
     * PalletNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletno() { return _columnPalletno; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * DesignCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesigncd() { return _columnDesigncd; }
    /**
     * ManufactureYm: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManufactureym() { return _columnManufactureym; }
    /**
     * FirmcarryNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmcarryno() { return _columnFirmcarryno; }
    /**
     * Qty: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * InOutKbn: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutkbn() { return _columnInoutkbn; }
    /**
     * StockType: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStocktype() { return _columnStocktype; }
    /**
     * CustomsReleaseDate: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleasedate() { return _columnCustomsreleasedate; }
    /**
     * SupplierCvNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercvno() { return _columnSuppliercvno; }
    /**
     * IfItemCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * SendFlg: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendflg() { return _columnSendflg; }
    /**
     * PalletOrder: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletorder() { return _columnPalletorder; }
    /**
     * PalletType: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPallettype() { return _columnPallettype; }
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
        ls.add(columnBondedShippingPlanBulkInputId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnSbwarehousecd());
        ls.add(columnCustorderno());
        ls.add(columnOrdertype());
        ls.add(columnShipcd());
        ls.add(columnCarryoutplancd());
        ls.add(columnShiptocd());
        ls.add(columnShiptonm());
        ls.add(columnReceiveplanym());
        ls.add(columnShtypecd());
        ls.add(columnShtypenm());
        ls.add(columnRefno());
        ls.add(columnPickingcomment());
        ls.add(columnPhoneno());
        ls.add(columnBatjmfym());
        ls.add(columnRmano());
        ls.add(columnOwnerorderno());
        ls.add(columnPalletno());
        ls.add(columnProductCd());
        ls.add(columnDesigncd());
        ls.add(columnManufactureym());
        ls.add(columnFirmcarryno());
        ls.add(columnQty());
        ls.add(columnInoutkbn());
        ls.add(columnStocktype());
        ls.add(columnCustomsreleasedate());
        ls.add(columnSuppliercvno());
        ls.add(columnIfitemcd());
        ls.add(columnSendflg());
        ls.add(columnPalletorder());
        ls.add(columnPallettype());
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
    protected UniqueInfo cpui() { return hpcpui(columnBondedShippingPlanBulkInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EBondedShippingPlanBulkInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EBondedShippingPlanBulkInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EBondedShippingPlanBulkInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EBondedShippingPlanBulkInput> getEntityType() { return EBondedShippingPlanBulkInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EBondedShippingPlanBulkInput newEntity() { return new EBondedShippingPlanBulkInput(); }
    public EBondedShippingPlanBulkInput newMyEntity() { return new EBondedShippingPlanBulkInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EBondedShippingPlanBulkInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EBondedShippingPlanBulkInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
