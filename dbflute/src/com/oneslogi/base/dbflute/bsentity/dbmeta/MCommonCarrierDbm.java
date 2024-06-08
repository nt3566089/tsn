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
 * The DB meta of M_COMMON_CARRIER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCommonCarrierDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCommonCarrierDbm _instance = new MCommonCarrierDbm();
    private MCommonCarrierDbm() {}
    public static MCommonCarrierDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getCommonCarrierId(), (et, vl) -> ((MCommonCarrier)et).setCommonCarrierId(ctl(vl)), "commonCarrierId");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getCarrierCd(), (et, vl) -> ((MCommonCarrier)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getCarrierNm(), (et, vl) -> ((MCommonCarrier)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getCarrierAbbr(), (et, vl) -> ((MCommonCarrier)et).setCarrierAbbr((String)vl), "carrierAbbr");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getArrivalStoreBarcode(), (et, vl) -> ((MCommonCarrier)et).setArrivalStoreBarcode((String)vl), "arrivalStoreBarcode");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getArrivalStoreStartBit(), (et, vl) -> ((MCommonCarrier)et).setArrivalStoreStartBit((String)vl), "arrivalStoreStartBit");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getArrivalStoreEndBit(), (et, vl) -> ((MCommonCarrier)et).setArrivalStoreEndBit((String)vl), "arrivalStoreEndBit");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getArrivalStoreFormat(), (et, vl) -> ((MCommonCarrier)et).setArrivalStoreFormat((String)vl), "arrivalStoreFormat");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getTrackingBarcode(), (et, vl) -> ((MCommonCarrier)et).setTrackingBarcode((String)vl), "trackingBarcode");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getTrackingStartBit(), (et, vl) -> ((MCommonCarrier)et).setTrackingStartBit((String)vl), "trackingStartBit");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getTrackingEndBit(), (et, vl) -> ((MCommonCarrier)et).setTrackingEndBit((String)vl), "trackingEndBit");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getBolOutputTargetFlg(), (et, vl) -> ((MCommonCarrier)et).setBolOutputTargetFlg((String)vl), "bolOutputTargetFlg");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getDelFlg(), (et, vl) -> ((MCommonCarrier)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getVersionNo(), (et, vl) -> ((MCommonCarrier)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getControlNo(), (et, vl) -> ((MCommonCarrier)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getAddDt(), (et, vl) -> ((MCommonCarrier)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getAddUser(), (et, vl) -> ((MCommonCarrier)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getAddProcess(), (et, vl) -> ((MCommonCarrier)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getUpdDt(), (et, vl) -> ((MCommonCarrier)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getUpdUser(), (et, vl) -> ((MCommonCarrier)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCommonCarrier)et).getUpdProcess(), (et, vl) -> ((MCommonCarrier)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCommonCarrier)et).getBClassDtlByArrivalStoreFormat(), (et, vl) -> ((MCommonCarrier)et).setBClassDtlByArrivalStoreFormat((BClassDtl)vl), "BClassDtlByArrivalStoreFormat");
        setupEfpg(_efpgMap, et -> ((MCommonCarrier)et).getBClassDtlByBolOutputTargetFlg(), (et, vl) -> ((MCommonCarrier)et).setBClassDtlByBolOutputTargetFlg((BClassDtl)vl), "BClassDtlByBolOutputTargetFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_COMMON_CARRIER";
    protected final String _tableDispName = "M_COMMON_CARRIER";
    protected final String _tablePropertyName = "MCommonCarrier";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_COMMON_CARRIER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCommonCarrierId = cci("COMMON_CARRIER_ID", "COMMON_CARRIER_ID", null, null, Long.class, "commonCarrierId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCarrierList,MCarrierZipList", null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierAbbr = cci("CARRIER_ABBR", "CARRIER_ABBR", null, null, String.class, "carrierAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreBarcode = cci("ARRIVAL_STORE_BARCODE", "ARRIVAL_STORE_BARCODE", null, null, String.class, "arrivalStoreBarcode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreStartBit = cci("ARRIVAL_STORE_START_BIT", "ARRIVAL_STORE_START_BIT", null, null, String.class, "arrivalStoreStartBit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreEndBit = cci("ARRIVAL_STORE_END_BIT", "ARRIVAL_STORE_END_BIT", null, null, String.class, "arrivalStoreEndBit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArrivalStoreFormat = cci("ARRIVAL_STORE_FORMAT", "ARRIVAL_STORE_FORMAT", null, null, String.class, "arrivalStoreFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByArrivalStoreFormat", null, CDef.DefMeta.ArrivalStoreFormat, false);
    protected final ColumnInfo _columnTrackingBarcode = cci("TRACKING_BARCODE", "TRACKING_BARCODE", null, null, String.class, "trackingBarcode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingStartBit = cci("TRACKING_START_BIT", "TRACKING_START_BIT", null, null, String.class, "trackingStartBit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingEndBit = cci("TRACKING_END_BIT", "TRACKING_END_BIT", null, null, String.class, "trackingEndBit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutputTargetFlg = cci("BOL_OUTPUT_TARGET_FLG", "BOL_OUTPUT_TARGET_FLG", null, null, String.class, "bolOutputTargetFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByBolOutputTargetFlg", null, CDef.DefMeta.BolOutputTargetFlg, false);
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
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommonCarrierId() { return _columnCommonCarrierId; }
    /**
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * CARRIER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierAbbr() { return _columnCarrierAbbr; }
    /**
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreBarcode() { return _columnArrivalStoreBarcode; }
    /**
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreStartBit() { return _columnArrivalStoreStartBit; }
    /**
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreEndBit() { return _columnArrivalStoreEndBit; }
    /**
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreFormat() { return _columnArrivalStoreFormat; }
    /**
     * TRACKING_BARCODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingBarcode() { return _columnTrackingBarcode; }
    /**
     * TRACKING_START_BIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingStartBit() { return _columnTrackingStartBit; }
    /**
     * TRACKING_END_BIT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingEndBit() { return _columnTrackingEndBit; }
    /**
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutputTargetFlg() { return _columnBolOutputTargetFlg; }
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
        ls.add(columnCommonCarrierId());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnCarrierAbbr());
        ls.add(columnArrivalStoreBarcode());
        ls.add(columnArrivalStoreStartBit());
        ls.add(columnArrivalStoreEndBit());
        ls.add(columnArrivalStoreFormat());
        ls.add(columnTrackingBarcode());
        ls.add(columnTrackingStartBit());
        ls.add(columnTrackingEndBit());
        ls.add(columnBolOutputTargetFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCommonCarrierId()); }
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
    /**
     * B_CLASS_DTL by my ARRIVAL_STORE_FORMAT, named 'BClassDtlByArrivalStoreFormat'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByArrivalStoreFormat() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnArrivalStoreFormat(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_COMMON_CARRIER_ARRIVAL_STORE_FORMAT", "BClassDtlByArrivalStoreFormat", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ARRIVAL_STORE_FORMAT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my BOL_OUTPUT_TARGET_FLG, named 'BClassDtlByBolOutputTargetFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByBolOutputTargetFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBolOutputTargetFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_COMMON_CARRIER_BOL_OUTPUT_TARGET_FLG", "BClassDtlByBolOutputTargetFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'BOL_OUTPUT_TARGET_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommonCarrierId(), MCarrierDbm.getInstance().columnCommonCarrierId());
        return cri("M_CARRIER_FK2", "MCarrierList", this, MCarrierDbm.getInstance(), mp, false, "MCommonCarrier");
    }
    /**
     * M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierZipList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommonCarrierId(), MCarrierZipDbm.getInstance().columnCommonCarrierId());
        return cri("M_CARRIER_ZIP_FK1", "MCarrierZipList", this, MCarrierZipDbm.getInstance(), mp, false, "MCommonCarrier");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCommonCarrier"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCommonCarrierCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCommonCarrierBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCommonCarrier> getEntityType() { return MCommonCarrier.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCommonCarrier newEntity() { return new MCommonCarrier(); }
    public MCommonCarrier newMyEntity() { return new MCommonCarrier(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCommonCarrier)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCommonCarrier)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
