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
 * The DB meta of SqlTCcopamPrintUsed. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTCcopamPrintUsedDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTCcopamPrintUsedDbm _instance = new SqlTCcopamPrintUsedDbm();
    private SqlTCcopamPrintUsedDbm() {}
    public static SqlTCcopamPrintUsedDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getDeliveryClassCd(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setDeliveryClassCd((String)vl), "deliveryClassCd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getShipCd(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setShipCd((String)vl), "shipCd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSnNo1(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSnNo1((String)vl), "snNo1");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSnNo2(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSnNo2((String)vl), "snNo2");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSnNo3(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSnNo3((String)vl), "snNo3");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSnYMD(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSnYMD((String)vl), "snYMD");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getArvYMD(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setArvYMD((String)vl), "arvYMD");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getPlnCarKnd(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setPlnCarKnd((String)vl), "plnCarKnd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getAmCarKnd(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setAmCarKnd((String)vl), "amCarKnd");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getCarrierNm(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getCarNo(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setCarNo((String)vl), "carNo");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSealNo1(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSealNo1((String)vl), "sealNo1");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSealNo2(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSealNo2((String)vl), "sealNo2");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSealNo3(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSealNo3((String)vl), "sealNo3");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getCcopamId(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setCcopamId(ctl(vl)), "ccopamId");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getDeliveryClass(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setDeliveryClass((String)vl), "deliveryClass");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getShipNm(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setShipNm((String)vl), "shipNm");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getGnPltQa(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setGnPltQa(ctl(vl)), "gnPltQa");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getOtPltQa(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setOtPltQa(ctl(vl)), "otPltQa");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getRcvSumQty1Pallet(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setRcvSumQty1Pallet(ctl(vl)), "rcvSumQty1Pallet");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getNo(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setNo(cti(vl)), "no");
        setupEpg(_epgMap, et -> ((SqlTCcopamPrintUsed)et).getSum(), (et, vl) -> ((SqlTCcopamPrintUsed)et).setSum(cti(vl)), "sum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTCcopamPrintUsed";
    protected final String _tableDispName = "SqlTCcopamPrintUsed";
    protected final String _tablePropertyName = "sqlTCcopamPrintUsed";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTCcopamPrintUsed", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeliveryClassCd = cci("DELIVERY_CLASS_CD", "DELIVERY_CLASS_CD", null, null, String.class, "deliveryClassCd", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipCd = cci("SHIP_CD", "SHIP_CD", null, null, String.class, "shipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnNo1 = cci("SN_NO1", "SN_NO1", null, null, String.class, "snNo1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnNo2 = cci("SN_NO2", "SN_NO2", null, null, String.class, "snNo2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnNo3 = cci("SN_NO3", "SN_NO3", null, null, String.class, "snNo3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnYMD = cci("SN_Y_M_D", "SN_Y_M_D", null, null, String.class, "snYMD", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArvYMD = cci("ARV_Y_M_D", "ARV_Y_M_D", null, null, String.class, "arvYMD", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlnCarKnd = cci("PLN_CAR_KND", "PLN_CAR_KND", null, null, String.class, "plnCarKnd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmCarKnd = cci("AM_CAR_KND", "AM_CAR_KND", null, null, String.class, "amCarKnd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarNo = cci("CAR_NO", "CAR_NO", null, null, String.class, "carNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo1 = cci("SEAL_NO1", "SEAL_NO1", null, null, String.class, "sealNo1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo2 = cci("SEAL_NO2", "SEAL_NO2", null, null, String.class, "sealNo2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSealNo3 = cci("SEAL_NO3", "SEAL_NO3", null, null, String.class, "sealNo3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCcopamId = cci("CCOPAM_ID", "CCOPAM_ID", null, null, Long.class, "ccopamId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryClass = cci("DELIVERY_CLASS", "DELIVERY_CLASS", null, null, String.class, "deliveryClass", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipNm = cci("SHIP_NM", "SHIP_NM", null, null, String.class, "shipNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGnPltQa = cci("GN_PLT_QA", "GN_PLT_QA", null, null, Long.class, "gnPltQa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtPltQa = cci("OT_PLT_QA", "OT_PLT_QA", null, null, Long.class, "otPltQa", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvSumQty1Pallet = cci("RCV_SUM_QTY1_PALLET", "RCV_SUM_QTY1_PALLET", null, null, Long.class, "rcvSumQty1Pallet", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNo = cci("NO", "NO", null, null, Integer.class, "no", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSum = cci("SUM", "SUM", null, null, Integer.class, "sum", null, false, false, false, "int", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DELIVERY_CLASS_CD: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryClassCd() { return _columnDeliveryClassCd; }
    /**
     * SHIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipCd() { return _columnShipCd; }
    /**
     * SN_NO1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnNo1() { return _columnSnNo1; }
    /**
     * SN_NO2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnNo2() { return _columnSnNo2; }
    /**
     * SN_NO3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnNo3() { return _columnSnNo3; }
    /**
     * SN_Y_M_D: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnYMD() { return _columnSnYMD; }
    /**
     * ARV_Y_M_D: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArvYMD() { return _columnArvYMD; }
    /**
     * PLN_CAR_KND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlnCarKnd() { return _columnPlnCarKnd; }
    /**
     * AM_CAR_KND: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmCarKnd() { return _columnAmCarKnd; }
    /**
     * CARRIER_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
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
     * DELIVERY_CLASS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryClass() { return _columnDeliveryClass; }
    /**
     * SHIP_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipNm() { return _columnShipNm; }
    /**
     * GN_PLT_QA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGnPltQa() { return _columnGnPltQa; }
    /**
     * OT_PLT_QA: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtPltQa() { return _columnOtPltQa; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeliveryClassCd());
        ls.add(columnShipCd());
        ls.add(columnSnNo1());
        ls.add(columnSnNo2());
        ls.add(columnSnNo3());
        ls.add(columnSnYMD());
        ls.add(columnArvYMD());
        ls.add(columnPlnCarKnd());
        ls.add(columnAmCarKnd());
        ls.add(columnCarrierNm());
        ls.add(columnCarNo());
        ls.add(columnSealNo1());
        ls.add(columnSealNo2());
        ls.add(columnSealNo3());
        ls.add(columnCcopamId());
        ls.add(columnDeliveryClass());
        ls.add(columnShipNm());
        ls.add(columnGnPltQa());
        ls.add(columnOtPltQa());
        ls.add(columnRcvSumQty1Pallet());
        ls.add(columnNo());
        ls.add(columnSum());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamPrintUsed"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTCcopamPrintUsed> getEntityType() { return SqlTCcopamPrintUsed.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTCcopamPrintUsed newEntity() { return new SqlTCcopamPrintUsed(); }
    public SqlTCcopamPrintUsed newMyEntity() { return new SqlTCcopamPrintUsed(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTCcopamPrintUsed)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTCcopamPrintUsed)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
