package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlMLocationMasterEdit. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMLocationMasterEditDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMLocationMasterEditDbm _instance = new SqlMLocationMasterEditDbm();
    private SqlMLocationMasterEditDbm() {}
    public static SqlMLocationMasterEditDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocGroup(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocGroup((String)vl), "locGroup");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocationCd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getAllocNgFlg(), (et, vl) -> ((SqlMLocationMasterEdit)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getDelFlg(), (et, vl) -> ((SqlMLocationMasterEdit)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocationNm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getPickingOrder(), (et, vl) -> ((SqlMLocationMasterEdit)et).setPickingOrder(ctl(vl)), "pickingOrder");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getPalletecapacity(), (et, vl) -> ((SqlMLocationMasterEdit)et).setPalletecapacity(ctl(vl)), "palletecapacity");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getMaxStoreNum(), (et, vl) -> ((SqlMLocationMasterEdit)et).setMaxStoreNum(ctb(vl)), "maxStoreNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLinblk(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocid(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getProductCd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getProductNm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getBrctg(), (et, vl) -> ((SqlMLocationMasterEdit)et).setBrctg(ctl(vl)), "brctg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getSplrevun(), (et, vl) -> ((SqlMLocationMasterEdit)et).setSplrevun((String)vl), "splrevun");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getSplrevctqa(), (et, vl) -> ((SqlMLocationMasterEdit)et).setSplrevctqa(ctl(vl)), "splrevctqa");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getReplenishPNum(), (et, vl) -> ((SqlMLocationMasterEdit)et).setReplenishPNum(ctb(vl)), "replenishPNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getBssplpt(), (et, vl) -> ((SqlMLocationMasterEdit)et).setBssplpt((String)vl), "bssplpt");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getTosplmd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setTosplmd((String)vl), "tosplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getPresplmd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setPresplmd((String)vl), "presplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getTransportpriority(), (et, vl) -> ((SqlMLocationMasterEdit)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getVirtuallocflg(), (et, vl) -> ((SqlMLocationMasterEdit)et).setVirtuallocflg((String)vl), "virtuallocflg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLinnm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLinnm((String)vl), "linnm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getBlknm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setBlknm((String)vl), "blknm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getCenterId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getCenterCd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getCenterNm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getClientId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getClientCd(), (et, vl) -> ((SqlMLocationMasterEdit)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getClientNm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocationId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getUpdDt(), (et, vl) -> ((SqlMLocationMasterEdit)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getUserNm(), (et, vl) -> ((SqlMLocationMasterEdit)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getZone(), (et, vl) -> ((SqlMLocationMasterEdit)et).setZone((String)vl), "zone");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getAllocOrder(), (et, vl) -> ((SqlMLocationMasterEdit)et).setAllocOrder(ctl(vl)), "allocOrder");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getLocationType(), (et, vl) -> ((SqlMLocationMasterEdit)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getReplenishProductId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setReplenishProductId(ctl(vl)), "replenishProductId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getReplenishStockTypeId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setReplenishStockTypeId(ctl(vl)), "replenishStockTypeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getReplenishDepositId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setReplenishDepositId(ctl(vl)), "replenishDepositId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getReplenishPProductShapeId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setReplenishPProductShapeId(ctl(vl)), "replenishPProductShapeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getMaxStoreProductShapeId(), (et, vl) -> ((SqlMLocationMasterEdit)et).setMaxStoreProductShapeId(ctl(vl)), "maxStoreProductShapeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getVersionNo(), (et, vl) -> ((SqlMLocationMasterEdit)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getControlNo(), (et, vl) -> ((SqlMLocationMasterEdit)et).setControlNo(cti(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterEdit)et).getAddProcess(), (et, vl) -> ((SqlMLocationMasterEdit)et).setAddProcess(cti(vl)), "addProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMLocationMasterEdit";
    protected final String _tableDispName = "SqlMLocationMasterEdit";
    protected final String _tablePropertyName = "sqlMLocationMasterEdit";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMLocationMasterEdit", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocGroup = cci("LocGroup", "LocGroup", null, null, String.class, "locGroup", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, Long.class, "pickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletecapacity = cci("PALLETECAPACITY", "PALLETECAPACITY", null, null, Long.class, "palletecapacity", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, java.math.BigDecimal.class, "maxStoreNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrctg = cci("BRCTG", "BRCTG", null, null, Long.class, "brctg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevun = cci("SPLREVUN", "SPLREVUN", null, null, String.class, "splrevun", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevctqa = cci("SPLREVCTQA", "SPLREVCTQA", null, null, Long.class, "splrevctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "replenishPNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBssplpt = cci("BSSPLPT", "BSSPLPT", null, null, String.class, "bssplpt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplmd = cci("TOSPLMD", "TOSPLMD", null, null, String.class, "tosplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplmd = cci("PRESPLMD", "PRESPLMD", null, null, String.class, "presplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVirtuallocflg = cci("VIRTUALLOCFLG", "VIRTUALLOCFLG", null, null, String.class, "virtuallocflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinnm = cci("LINNM", "LINNM", null, null, String.class, "linnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlknm = cci("BLKNM", "BLKNM", null, null, String.class, "blknm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZone = cci("ZONE", "ZONE", null, null, String.class, "zone", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, Long.class, "allocOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductId = cci("REPLENISH_PRODUCT_ID", "REPLENISH_PRODUCT_ID", null, null, Long.class, "replenishProductId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeId = cci("REPLENISH_STOCK_TYPE_ID", "REPLENISH_STOCK_TYPE_ID", null, null, Long.class, "replenishStockTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishDepositId = cci("REPLENISH_DEPOSIT_ID", "REPLENISH_DEPOSIT_ID", null, null, Long.class, "replenishDepositId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeId = cci("REPLENISH_P_PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", null, null, Long.class, "replenishPProductShapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeId = cci("MAX_STORE_PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", null, null, Long.class, "maxStoreProductShapeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Integer.class, "controlNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, Integer.class, "addProcess", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LocGroup: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroup() { return _columnLocGroup; }
    /**
     * LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * ALLOC_NG_FLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlg() { return _columnAllocNgFlg; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * LOCATION_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * PICKING_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * PALLETECAPACITY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletecapacity() { return _columnPalletecapacity; }
    /**
     * MAX_STORE_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * LINBLK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinblk() { return _columnLinblk; }
    /**
     * LOCID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * BRCTG: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBrctg() { return _columnBrctg; }
    /**
     * SPLREVUN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplrevun() { return _columnSplrevun; }
    /**
     * SPLREVCTQA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplrevctqa() { return _columnSplrevctqa; }
    /**
     * REPLENISH_P_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * BSSPLPT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBssplpt() { return _columnBssplpt; }
    /**
     * TOSPLMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTosplmd() { return _columnTosplmd; }
    /**
     * PRESPLMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplmd() { return _columnPresplmd; }
    /**
     * TRANSPORTPRIORITY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportpriority() { return _columnTransportpriority; }
    /**
     * VIRTUALLOCFLG: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVirtuallocflg() { return _columnVirtuallocflg; }
    /**
     * LINNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinnm() { return _columnLinnm; }
    /**
     * BLKNM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlknm() { return _columnBlknm; }
    /**
     * CENTER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CLIENT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * USER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * ZONE: {varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZone() { return _columnZone; }
    /**
     * ALLOC_ORDER: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * LOCATION_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * REPLENISH_PRODUCT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductId() { return _columnReplenishProductId; }
    /**
     * REPLENISH_STOCK_TYPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeId() { return _columnReplenishStockTypeId; }
    /**
     * REPLENISH_DEPOSIT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositId() { return _columnReplenishDepositId; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeId() { return _columnReplenishPProductShapeId; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeId() { return _columnMaxStoreProductShapeId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_PROCESS: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocGroup());
        ls.add(columnLocationCd());
        ls.add(columnAllocNgFlg());
        ls.add(columnDelFlg());
        ls.add(columnLocationNm());
        ls.add(columnPickingOrder());
        ls.add(columnPalletecapacity());
        ls.add(columnMaxStoreNum());
        ls.add(columnLinblk());
        ls.add(columnLocid());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnBrctg());
        ls.add(columnSplrevun());
        ls.add(columnSplrevctqa());
        ls.add(columnReplenishPNum());
        ls.add(columnBssplpt());
        ls.add(columnTosplmd());
        ls.add(columnPresplmd());
        ls.add(columnTransportpriority());
        ls.add(columnVirtuallocflg());
        ls.add(columnLinnm());
        ls.add(columnBlknm());
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnLocationId());
        ls.add(columnUpdDt());
        ls.add(columnUserNm());
        ls.add(columnZone());
        ls.add(columnAllocOrder());
        ls.add(columnLocationType());
        ls.add(columnReplenishProductId());
        ls.add(columnReplenishStockTypeId());
        ls.add(columnReplenishDepositId());
        ls.add(columnReplenishPProductShapeId());
        ls.add(columnMaxStoreProductShapeId());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterEdit"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMLocationMasterEdit> getEntityType() { return SqlMLocationMasterEdit.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMLocationMasterEdit newEntity() { return new SqlMLocationMasterEdit(); }
    public SqlMLocationMasterEdit newMyEntity() { return new SqlMLocationMasterEdit(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMLocationMasterEdit)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMLocationMasterEdit)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
