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
 * The DB meta of SqlMLocationMasterList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlMLocationMasterListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlMLocationMasterListDbm _instance = new SqlMLocationMasterListDbm();
    private SqlMLocationMasterListDbm() {}
    public static SqlMLocationMasterListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocGroup(), (et, vl) -> ((SqlMLocationMasterList)et).setLocGroup((String)vl), "locGroup");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocGroupNm(), (et, vl) -> ((SqlMLocationMasterList)et).setLocGroupNm((String)vl), "locGroupNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocationCd(), (et, vl) -> ((SqlMLocationMasterList)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getAllocNgFlg(), (et, vl) -> ((SqlMLocationMasterList)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getAllocNgFlgNm(), (et, vl) -> ((SqlMLocationMasterList)et).setAllocNgFlgNm((String)vl), "allocNgFlgNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getDelFlg(), (et, vl) -> ((SqlMLocationMasterList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getDelFlgNm(), (et, vl) -> ((SqlMLocationMasterList)et).setDelFlgNm((String)vl), "delFlgNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocationNm(), (et, vl) -> ((SqlMLocationMasterList)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getPickingOrder(), (et, vl) -> ((SqlMLocationMasterList)et).setPickingOrder(ctl(vl)), "pickingOrder");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getPalletecapacity(), (et, vl) -> ((SqlMLocationMasterList)et).setPalletecapacity(ctl(vl)), "palletecapacity");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getMaxStoreNum(), (et, vl) -> ((SqlMLocationMasterList)et).setMaxStoreNum(ctb(vl)), "maxStoreNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLinblk(), (et, vl) -> ((SqlMLocationMasterList)et).setLinblk((String)vl), "linblk");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLinOrBlock(), (et, vl) -> ((SqlMLocationMasterList)et).setLinOrBlock((String)vl), "linOrBlock");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocid(), (et, vl) -> ((SqlMLocationMasterList)et).setLocid((String)vl), "locid");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLockbnNm(), (et, vl) -> ((SqlMLocationMasterList)et).setLockbnNm((String)vl), "lockbnNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getProductCd(), (et, vl) -> ((SqlMLocationMasterList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getProductNm(), (et, vl) -> ((SqlMLocationMasterList)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getBrctg(), (et, vl) -> ((SqlMLocationMasterList)et).setBrctg(ctl(vl)), "brctg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getSplrevun(), (et, vl) -> ((SqlMLocationMasterList)et).setSplrevun((String)vl), "splrevun");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishmentRoundedupUnitNm(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishmentRoundedupUnitNm((String)vl), "replenishmentRoundedupUnitNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getSplrevctqa(), (et, vl) -> ((SqlMLocationMasterList)et).setSplrevctqa(ctl(vl)), "splrevctqa");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishPNum(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishPNum(ctb(vl)), "replenishPNum");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getBssplpt(), (et, vl) -> ((SqlMLocationMasterList)et).setBssplpt((String)vl), "bssplpt");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getTosplmd(), (et, vl) -> ((SqlMLocationMasterList)et).setTosplmd((String)vl), "tosplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getTosplmdNm(), (et, vl) -> ((SqlMLocationMasterList)et).setTosplmdNm((String)vl), "tosplmdNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getPresplmd(), (et, vl) -> ((SqlMLocationMasterList)et).setPresplmd((String)vl), "presplmd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getPresplmdNm(), (et, vl) -> ((SqlMLocationMasterList)et).setPresplmdNm((String)vl), "presplmdNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getTransportpriority(), (et, vl) -> ((SqlMLocationMasterList)et).setTransportpriority(ctb(vl)), "transportpriority");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getVirtuallocflg(), (et, vl) -> ((SqlMLocationMasterList)et).setVirtuallocflg((String)vl), "virtuallocflg");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLinnm(), (et, vl) -> ((SqlMLocationMasterList)et).setLinnm((String)vl), "linnm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getBlknm(), (et, vl) -> ((SqlMLocationMasterList)et).setBlknm((String)vl), "blknm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getCenterCd(), (et, vl) -> ((SqlMLocationMasterList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getCenterNm(), (et, vl) -> ((SqlMLocationMasterList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getClientId(), (et, vl) -> ((SqlMLocationMasterList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getClientCd(), (et, vl) -> ((SqlMLocationMasterList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getClientNm(), (et, vl) -> ((SqlMLocationMasterList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocationId(), (et, vl) -> ((SqlMLocationMasterList)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getUpdDt(), (et, vl) -> ((SqlMLocationMasterList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getUserNm(), (et, vl) -> ((SqlMLocationMasterList)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getZone(), (et, vl) -> ((SqlMLocationMasterList)et).setZone((String)vl), "zone");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getAllocOrder(), (et, vl) -> ((SqlMLocationMasterList)et).setAllocOrder(cti(vl)), "allocOrder");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getLocationType(), (et, vl) -> ((SqlMLocationMasterList)et).setLocationType(cti(vl)), "locationType");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishProductId(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishProductId(cti(vl)), "replenishProductId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishStockTypeId(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishStockTypeId(cti(vl)), "replenishStockTypeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishDepositId(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishDepositId(cti(vl)), "replenishDepositId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getReplenishPProductShapeId(), (et, vl) -> ((SqlMLocationMasterList)et).setReplenishPProductShapeId(cti(vl)), "replenishPProductShapeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getMaxStoreProductShapeId(), (et, vl) -> ((SqlMLocationMasterList)et).setMaxStoreProductShapeId(cti(vl)), "maxStoreProductShapeId");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getVersionNo(), (et, vl) -> ((SqlMLocationMasterList)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getControlNo(), (et, vl) -> ((SqlMLocationMasterList)et).setControlNo(cti(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((SqlMLocationMasterList)et).getAddProcess(), (et, vl) -> ((SqlMLocationMasterList)et).setAddProcess(cti(vl)), "addProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlMLocationMasterList";
    protected final String _tableDispName = "SqlMLocationMasterList";
    protected final String _tablePropertyName = "sqlMLocationMasterList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlMLocationMasterList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocGroup = cci("LocGroup", "LocGroup", null, null, String.class, "locGroup", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocGroupNm = cci("LocGroupNm", "LocGroupNm", null, null, String.class, "locGroupNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlgNm = cci("ALLOC_NG_FLG_NM", "ALLOC_NG_FLG_NM", null, null, String.class, "allocNgFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnDelFlgNm = cci("DEL_FLG_NM", "DEL_FLG_NM", null, null, String.class, "delFlgNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, Long.class, "pickingOrder", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletecapacity = cci("PALLETECAPACITY", "PALLETECAPACITY", null, null, Long.class, "palletecapacity", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, java.math.BigDecimal.class, "maxStoreNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinblk = cci("LINBLK", "LINBLK", null, null, String.class, "linblk", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinOrBlock = cci("LIN_OR_BLOCK", "LIN_OR_BLOCK", null, null, String.class, "linOrBlock", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocid = cci("LOCID", "LOCID", null, null, String.class, "locid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLockbnNm = cci("LOCKBN_NM", "LOCKBN_NM", null, null, String.class, "lockbnNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBrctg = cci("BRCTG", "BRCTG", null, null, Long.class, "brctg", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevun = cci("SPLREVUN", "SPLREVUN", null, null, String.class, "splrevun", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishmentRoundedupUnitNm = cci("REPLENISHMENT_ROUNDEDUP__UNIT_NM", "REPLENISHMENT_ROUNDEDUP__UNIT_NM", null, null, String.class, "replenishmentRoundedupUnitNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSplrevctqa = cci("SPLREVCTQA", "SPLREVCTQA", null, null, Long.class, "splrevctqa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "replenishPNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBssplpt = cci("BSSPLPT", "BSSPLPT", null, null, String.class, "bssplpt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplmd = cci("TOSPLMD", "TOSPLMD", null, null, String.class, "tosplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTosplmdNm = cci("TOSPLMD_NM", "TOSPLMD_NM", null, null, String.class, "tosplmdNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplmd = cci("PRESPLMD", "PRESPLMD", null, null, String.class, "presplmd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresplmdNm = cci("PRESPLMD_NM", "PRESPLMD_NM", null, null, String.class, "presplmdNm", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportpriority = cci("TRANSPORTPRIORITY", "TRANSPORTPRIORITY", null, null, java.math.BigDecimal.class, "transportpriority", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVirtuallocflg = cci("VIRTUALLOCFLG", "VIRTUALLOCFLG", null, null, String.class, "virtuallocflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLinnm = cci("LINNM", "LINNM", null, null, String.class, "linnm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlknm = cci("BLKNM", "BLKNM", null, null, String.class, "blknm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZone = cci("ZONE", "ZONE", null, null, String.class, "zone", null, false, false, false, "varchar", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, Integer.class, "allocOrder", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, Integer.class, "locationType", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishProductId = cci("REPLENISH_PRODUCT_ID", "REPLENISH_PRODUCT_ID", null, null, Integer.class, "replenishProductId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeId = cci("REPLENISH_STOCK_TYPE_ID", "REPLENISH_STOCK_TYPE_ID", null, null, Integer.class, "replenishStockTypeId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishDepositId = cci("REPLENISH_DEPOSIT_ID", "REPLENISH_DEPOSIT_ID", null, null, Integer.class, "replenishDepositId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeId = cci("REPLENISH_P_PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", null, null, Integer.class, "replenishPProductShapeId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeId = cci("MAX_STORE_PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", null, null, Integer.class, "maxStoreProductShapeId", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, false, "int", 10, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Integer.class, "controlNo", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, Integer.class, "addProcess", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LocGroup: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroup() { return _columnLocGroup; }
    /**
     * LocGroupNm: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocGroupNm() { return _columnLocGroupNm; }
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
     * ALLOC_NG_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlgNm() { return _columnAllocNgFlgNm; }
    /**
     * DEL_FLG: {char(1), classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * DEL_FLG_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlgNm() { return _columnDelFlgNm; }
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
     * LIN_OR_BLOCK: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinOrBlock() { return _columnLinOrBlock; }
    /**
     * LOCID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocid() { return _columnLocid; }
    /**
     * LOCKBN_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLockbnNm() { return _columnLockbnNm; }
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
     * REPLENISHMENT_ROUNDEDUP__UNIT_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishmentRoundedupUnitNm() { return _columnReplenishmentRoundedupUnitNm; }
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
     * TOSPLMD_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTosplmdNm() { return _columnTosplmdNm; }
    /**
     * PRESPLMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplmd() { return _columnPresplmd; }
    /**
     * PRESPLMD_NM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresplmdNm() { return _columnPresplmdNm; }
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
     * ALLOC_ORDER: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * LOCATION_TYPE: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * REPLENISH_PRODUCT_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductId() { return _columnReplenishProductId; }
    /**
     * REPLENISH_STOCK_TYPE_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeId() { return _columnReplenishStockTypeId; }
    /**
     * REPLENISH_DEPOSIT_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositId() { return _columnReplenishDepositId; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeId() { return _columnReplenishPProductShapeId; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_ID: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeId() { return _columnMaxStoreProductShapeId; }
    /**
     * VERSION_NO: {int(10)}
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
        ls.add(columnLocGroupNm());
        ls.add(columnLocationCd());
        ls.add(columnAllocNgFlg());
        ls.add(columnAllocNgFlgNm());
        ls.add(columnDelFlg());
        ls.add(columnDelFlgNm());
        ls.add(columnLocationNm());
        ls.add(columnPickingOrder());
        ls.add(columnPalletecapacity());
        ls.add(columnMaxStoreNum());
        ls.add(columnLinblk());
        ls.add(columnLinOrBlock());
        ls.add(columnLocid());
        ls.add(columnLockbnNm());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnBrctg());
        ls.add(columnSplrevun());
        ls.add(columnReplenishmentRoundedupUnitNm());
        ls.add(columnSplrevctqa());
        ls.add(columnReplenishPNum());
        ls.add(columnBssplpt());
        ls.add(columnTosplmd());
        ls.add(columnTosplmdNm());
        ls.add(columnPresplmd());
        ls.add(columnPresplmdNm());
        ls.add(columnTransportpriority());
        ls.add(columnVirtuallocflg());
        ls.add(columnLinnm());
        ls.add(columnBlknm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlMLocationMasterList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlMLocationMasterList> getEntityType() { return SqlMLocationMasterList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlMLocationMasterList newEntity() { return new SqlMLocationMasterList(); }
    public SqlMLocationMasterList newMyEntity() { return new SqlMLocationMasterList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlMLocationMasterList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlMLocationMasterList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
