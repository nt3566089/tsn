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
 * The DB meta of SqlDispatchRecordInputList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlDispatchRecordInputListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlDispatchRecordInputListDbm _instance = new SqlDispatchRecordInputListDbm();
    private SqlDispatchRecordInputListDbm() {}
    public static SqlDispatchRecordInputListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSupplierrCvFlgCd(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSupplierrCvFlgCd((String)vl), "supplierrCvFlgCd");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getShipCd(), (et, vl) -> ((SqlDispatchRecordInputList)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSupplierrCvNo1(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSupplierrCvNo1((String)vl), "supplierrCvNo1");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSupplierrCvNo2(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSupplierrCvNo2((String)vl), "supplierrCvNo2");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSupplierrCvNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSupplierrCvNo((String)vl), "supplierrCvNo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getShipmentDt(), (et, vl) -> ((SqlDispatchRecordInputList)et).setShipmentDt((String)vl), "shipmentDt");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getArrivalDt(), (et, vl) -> ((SqlDispatchRecordInputList)et).setArrivalDt((String)vl), "arrivalDt");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getPlannedCar(), (et, vl) -> ((SqlDispatchRecordInputList)et).setPlannedCar((String)vl), "plannedCar");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getAchievedCar(), (et, vl) -> ((SqlDispatchRecordInputList)et).setAchievedCar((String)vl), "achievedCar");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getTransportationCo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setTransportationCo((String)vl), "transportationCo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getCarNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setCarNo((String)vl), "carNo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSealNo1(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSealNo1((String)vl), "sealNo1");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSealNo2(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSealNo2((String)vl), "sealNo2");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSealNo3(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSealNo3((String)vl), "sealNo3");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getCcopamId(), (et, vl) -> ((SqlDispatchRecordInputList)et).setCcopamId(ctl(vl)), "ccopamId");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getVersionNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getCenterCd(), (et, vl) -> ((SqlDispatchRecordInputList)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getCenterNm(), (et, vl) -> ((SqlDispatchRecordInputList)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getClientCd(), (et, vl) -> ((SqlDispatchRecordInputList)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getClientNm(), (et, vl) -> ((SqlDispatchRecordInputList)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSupplierrCvFlg(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSupplierrCvFlg((String)vl), "supplierrCvFlg");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getGenericPalletNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setGenericPalletNo(ctl(vl)), "genericPalletNo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getOtherPalletNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setOtherPalletNo(ctl(vl)), "otherPalletNo");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getRcvSumQty1Pallet(), (et, vl) -> ((SqlDispatchRecordInputList)et).setRcvSumQty1Pallet(ctl(vl)), "rcvSumQty1Pallet");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getNo(), (et, vl) -> ((SqlDispatchRecordInputList)et).setNo(cti(vl)), "no");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getSum(), (et, vl) -> ((SqlDispatchRecordInputList)et).setSum(cti(vl)), "sum");
        setupEpg(_epgMap, et -> ((SqlDispatchRecordInputList)et).getLanding(), (et, vl) -> ((SqlDispatchRecordInputList)et).setLanding((String)vl), "landing");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlDispatchRecordInputList";
    protected final String _tableDispName = "SqlDispatchRecordInputList";
    protected final String _tablePropertyName = "sqlDispatchRecordInputList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlDispatchRecordInputList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSupplierrCvFlgCd = cci("SUPPLIERR_CV_FLG_CD", "SUPPLIERR_CV_FLG_CD", null, null, String.class, "supplierrCvFlgCd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrCvNo1 = cci("SUPPLIERR_CV_NO1", "SUPPLIERR_CV_NO1", null, null, String.class, "supplierrCvNo1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrCvNo2 = cci("SUPPLIERR_CV_NO2", "SUPPLIERR_CV_NO2", null, null, String.class, "supplierrCvNo2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrCvNo = cci("SUPPLIERR_CV_NO", "SUPPLIERR_CV_NO", null, null, String.class, "supplierrCvNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentDt = cci("SHIPMENT_DT", "SHIPMENT_DT", null, null, String.class, "shipmentDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalDt = cci("ARRIVAL_DT", "ARRIVAL_DT", null, null, String.class, "arrivalDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlannedCar = cci("PLANNED_CAR", "PLANNED_CAR", null, null, String.class, "plannedCar", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAchievedCar = cci("ACHIEVED_CAR", "ACHIEVED_CAR", null, null, String.class, "achievedCar", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportationCo = cci("TRANSPORTATION_CO", "TRANSPORTATION_CO", null, null, String.class, "transportationCo", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarNo = cci("CAR_NO", "CAR_NO", null, null, String.class, "carNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo1 = cci("SEAL_NO1", "SEAL_NO1", null, null, String.class, "sealNo1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo2 = cci("SEAL_NO2", "SEAL_NO2", null, null, String.class, "sealNo2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo3 = cci("SEAL_NO3", "SEAL_NO3", null, null, String.class, "sealNo3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCcopamId = cci("CCOPAM_ID", "CCOPAM_ID", null, null, Long.class, "ccopamId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrCvFlg = cci("SUPPLIERR_CV_FLG", "SUPPLIERR_CV_FLG", null, null, String.class, "supplierrCvFlg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenericPalletNo = cci("GENERIC_PALLET_NO", "GENERIC_PALLET_NO", null, null, Long.class, "genericPalletNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherPalletNo = cci("OTHER_PALLET_NO", "OTHER_PALLET_NO", null, null, Long.class, "otherPalletNo", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvSumQty1Pallet = cci("RCV_SUM_QTY1_PALLET", "RCV_SUM_QTY1_PALLET", null, null, Long.class, "rcvSumQty1Pallet", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNo = cci("NO", "NO", null, null, Integer.class, "no", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSum = cci("SUM", "SUM", null, null, Integer.class, "sum", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLanding = cci("LANDING", "LANDING", null, null, String.class, "landing", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SUPPLIERR_CV_FLG_CD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrCvFlgCd() { return _columnSupplierrCvFlgCd; }
    /**
     * SHIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCd() { return _columnShipCd; }
    /**
     * SUPPLIERR_CV_NO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrCvNo1() { return _columnSupplierrCvNo1; }
    /**
     * SUPPLIERR_CV_NO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrCvNo2() { return _columnSupplierrCvNo2; }
    /**
     * SUPPLIERR_CV_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrCvNo() { return _columnSupplierrCvNo; }
    /**
     * SHIPMENT_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentDt() { return _columnShipmentDt; }
    /**
     * ARRIVAL_DT: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalDt() { return _columnArrivalDt; }
    /**
     * PLANNED_CAR: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlannedCar() { return _columnPlannedCar; }
    /**
     * ACHIEVED_CAR: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAchievedCar() { return _columnAchievedCar; }
    /**
     * TRANSPORTATION_CO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportationCo() { return _columnTransportationCo; }
    /**
     * CAR_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarNo() { return _columnCarNo; }
    /**
     * SEAL_NO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealNo1() { return _columnSealNo1; }
    /**
     * SEAL_NO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealNo2() { return _columnSealNo2; }
    /**
     * SEAL_NO3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealNo3() { return _columnSealNo3; }
    /**
     * CCOPAM_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCcopamId() { return _columnCcopamId; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
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
     * SUPPLIERR_CV_FLG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrCvFlg() { return _columnSupplierrCvFlg; }
    /**
     * GENERIC_PALLET_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenericPalletNo() { return _columnGenericPalletNo; }
    /**
     * OTHER_PALLET_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherPalletNo() { return _columnOtherPalletNo; }
    /**
     * RCV_SUM_QTY1_PALLET: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvSumQty1Pallet() { return _columnRcvSumQty1Pallet; }
    /**
     * NO: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNo() { return _columnNo; }
    /**
     * SUM: {int(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSum() { return _columnSum; }
    /**
     * LANDING: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLanding() { return _columnLanding; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSupplierrCvFlgCd());
        ls.add(columnShipCd());
        ls.add(columnSupplierrCvNo1());
        ls.add(columnSupplierrCvNo2());
        ls.add(columnSupplierrCvNo());
        ls.add(columnShipmentDt());
        ls.add(columnArrivalDt());
        ls.add(columnPlannedCar());
        ls.add(columnAchievedCar());
        ls.add(columnTransportationCo());
        ls.add(columnCarNo());
        ls.add(columnSealNo1());
        ls.add(columnSealNo2());
        ls.add(columnSealNo3());
        ls.add(columnCcopamId());
        ls.add(columnVersionNo());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnSupplierrCvFlg());
        ls.add(columnGenericPalletNo());
        ls.add(columnOtherPalletNo());
        ls.add(columnRcvSumQty1Pallet());
        ls.add(columnNo());
        ls.add(columnSum());
        ls.add(columnLanding());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlDispatchRecordInputList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlDispatchRecordInputList> getEntityType() { return SqlDispatchRecordInputList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlDispatchRecordInputList newEntity() { return new SqlDispatchRecordInputList(); }
    public SqlDispatchRecordInputList newMyEntity() { return new SqlDispatchRecordInputList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlDispatchRecordInputList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlDispatchRecordInputList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
