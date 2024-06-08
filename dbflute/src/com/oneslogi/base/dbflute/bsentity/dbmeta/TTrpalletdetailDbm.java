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
 * The DB meta of T_TRPALLETDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrpalletdetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrpalletdetailDbm _instance = new TTrpalletdetailDbm();
    private TTrpalletdetailDbm() {}
    public static TTrpalletdetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getTrpalletdetailId(), (et, vl) -> ((TTrpalletdetail)et).setTrpalletdetailId(ctl(vl)), "trpalletdetailId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getCenterId(), (et, vl) -> ((TTrpalletdetail)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getClientId(), (et, vl) -> ((TTrpalletdetail)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getPalletDetailKey(), (et, vl) -> ((TTrpalletdetail)et).setPalletDetailKey(ctl(vl)), "palletDetailKey");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getInoutType(), (et, vl) -> ((TTrpalletdetail)et).setInoutType((String)vl), "inoutType");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getTrpalletId(), (et, vl) -> ((TTrpalletdetail)et).setTrpalletId(ctl(vl)), "trpalletId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getBasePalletNo(), (et, vl) -> ((TTrpalletdetail)et).setBasePalletNo(ctb(vl)), "basePalletNo");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getDivPalletNo(), (et, vl) -> ((TTrpalletdetail)et).setDivPalletNo(ctb(vl)), "divPalletNo");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getWorkType(), (et, vl) -> ((TTrpalletdetail)et).setWorkType((String)vl), "workType");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getWorkKey(), (et, vl) -> ((TTrpalletdetail)et).setWorkKey(ctl(vl)), "workKey");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getRegistrationDate(), (et, vl) -> ((TTrpalletdetail)et).setRegistrationDate((String)vl), "registrationDate");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getWorkDate(), (et, vl) -> ((TTrpalletdetail)et).setWorkDate(cttp(vl)), "workDate");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getProductId(), (et, vl) -> ((TTrpalletdetail)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getProductCd(), (et, vl) -> ((TTrpalletdetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getDesignFlg(), (et, vl) -> ((TTrpalletdetail)et).setDesignFlg((String)vl), "designFlg");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getLimitDate(), (et, vl) -> ((TTrpalletdetail)et).setLimitDate((String)vl), "limitDate");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getFirmCarryNo(), (et, vl) -> ((TTrpalletdetail)et).setFirmCarryNo((String)vl), "firmCarryNo");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getBatArticleSign(), (et, vl) -> ((TTrpalletdetail)et).setBatArticleSign((String)vl), "batArticleSign");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getMoveBLlocationId(), (et, vl) -> ((TTrpalletdetail)et).setMoveBLlocationId(ctl(vl)), "moveBLlocationId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getMoveBLocationCd(), (et, vl) -> ((TTrpalletdetail)et).setMoveBLocationCd((String)vl), "moveBLocationCd");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getMoveALocationId(), (et, vl) -> ((TTrpalletdetail)et).setMoveALocationId(ctl(vl)), "moveALocationId");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getMoveALocationCd(), (et, vl) -> ((TTrpalletdetail)et).setMoveALocationCd((String)vl), "moveALocationCd");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getInstNum(), (et, vl) -> ((TTrpalletdetail)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getRestQtyCase(), (et, vl) -> ((TTrpalletdetail)et).setRestQtyCase(ctb(vl)), "restQtyCase");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getRestQtyBowl(), (et, vl) -> ((TTrpalletdetail)et).setRestQtyBowl(ctb(vl)), "restQtyBowl");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getRestQty(), (et, vl) -> ((TTrpalletdetail)et).setRestQty(ctb(vl)), "restQty");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getDelFlg(), (et, vl) -> ((TTrpalletdetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getVersionNo(), (et, vl) -> ((TTrpalletdetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getControlNo(), (et, vl) -> ((TTrpalletdetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getAddDt(), (et, vl) -> ((TTrpalletdetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getAddUser(), (et, vl) -> ((TTrpalletdetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getAddProcess(), (et, vl) -> ((TTrpalletdetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getUpdDt(), (et, vl) -> ((TTrpalletdetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getUpdUser(), (et, vl) -> ((TTrpalletdetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrpalletdetail)et).getUpdProcess(), (et, vl) -> ((TTrpalletdetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRPALLETDETAIL";
    protected final String _tableDispName = "T_TRPALLETDETAIL";
    protected final String _tablePropertyName = "TTrpalletdetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRPALLETDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrpalletdetailId = cci("TRPALLETDETAIL_ID", "TRPALLETDETAIL_ID", null, null, Long.class, "trpalletdetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalletDetailKey = cci("PALLET_DETAIL_KEY", "PALLET_DETAIL_KEY", null, null, Long.class, "palletDetailKey", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInoutType = cci("INOUT_TYPE", "INOUT_TYPE", null, null, String.class, "inoutType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrpalletId = cci("TRPALLET_ID", "TRPALLET_ID", null, null, Long.class, "trpalletId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBasePalletNo = cci("BASE_PALLET_NO", "BASE_PALLET_NO", null, null, java.math.BigDecimal.class, "basePalletNo", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivPalletNo = cci("DIV_PALLET_NO", "DIV_PALLET_NO", null, null, java.math.BigDecimal.class, "divPalletNo", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkType = cci("WORK_TYPE", "WORK_TYPE", null, null, String.class, "workType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkKey = cci("WORK_KEY", "WORK_KEY", null, null, Long.class, "workKey", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegistrationDate = cci("REGISTRATION_DATE", "REGISTRATION_DATE", null, null, String.class, "registrationDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDate = cci("WORK_DATE", "WORK_DATE", null, null, java.sql.Timestamp.class, "workDate", null, false, false, true, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDesignFlg = cci("DESIGN_FLG", "DESIGN_FLG", null, null, String.class, "designFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDate = cci("LIMIT_DATE", "LIMIT_DATE", null, null, String.class, "limitDate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirmCarryNo = cci("FIRM_CARRY_NO", "FIRM_CARRY_NO", null, null, String.class, "firmCarryNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatArticleSign = cci("BAT_ARTICLE_SIGN", "BAT_ARTICLE_SIGN", null, null, String.class, "batArticleSign", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveBLlocationId = cci("MOVE_B_LLOCATION_ID", "MOVE_B_LLOCATION_ID", null, null, Long.class, "moveBLlocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveBLocationCd = cci("MOVE_B_LOCATION_CD", "MOVE_B_LOCATION_CD", null, null, String.class, "moveBLocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveALocationId = cci("MOVE_A_LOCATION_ID", "MOVE_A_LOCATION_ID", null, null, Long.class, "moveALocationId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveALocationCd = cci("MOVE_A_LOCATION_CD", "MOVE_A_LOCATION_CD", null, null, String.class, "moveALocationCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestQtyCase = cci("REST_QTY_CASE", "REST_QTY_CASE", null, null, java.math.BigDecimal.class, "restQtyCase", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestQtyBowl = cci("REST_QTY_BOWL", "REST_QTY_BOWL", null, null, java.math.BigDecimal.class, "restQtyBowl", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRestQty = cci("REST_QTY", "REST_QTY", null, null, java.math.BigDecimal.class, "restQty", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
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
     * TRPALLETDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletdetailId() { return _columnTrpalletdetailId; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PALLET_DETAIL_KEY: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalletDetailKey() { return _columnPalletDetailKey; }
    /**
     * INOUT_TYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInoutType() { return _columnInoutType; }
    /**
     * TRPALLET_ID: {IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrpalletId() { return _columnTrpalletId; }
    /**
     * BASE_PALLET_NO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBasePalletNo() { return _columnBasePalletNo; }
    /**
     * DIV_PALLET_NO: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivPalletNo() { return _columnDivPalletNo; }
    /**
     * WORK_TYPE: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkType() { return _columnWorkType; }
    /**
     * WORK_KEY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkKey() { return _columnWorkKey; }
    /**
     * REGISTRATION_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegistrationDate() { return _columnRegistrationDate; }
    /**
     * WORK_DATE: {NotNull, datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDate() { return _columnWorkDate; }
    /**
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * DESIGN_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDesignFlg() { return _columnDesignFlg; }
    /**
     * LIMIT_DATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDate() { return _columnLimitDate; }
    /**
     * FIRM_CARRY_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirmCarryNo() { return _columnFirmCarryNo; }
    /**
     * BAT_ARTICLE_SIGN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatArticleSign() { return _columnBatArticleSign; }
    /**
     * MOVE_B_LLOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveBLlocationId() { return _columnMoveBLlocationId; }
    /**
     * MOVE_B_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveBLocationCd() { return _columnMoveBLocationCd; }
    /**
     * MOVE_A_LOCATION_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveALocationId() { return _columnMoveALocationId; }
    /**
     * MOVE_A_LOCATION_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveALocationCd() { return _columnMoveALocationCd; }
    /**
     * INST_NUM: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * REST_QTY_CASE: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestQtyCase() { return _columnRestQtyCase; }
    /**
     * REST_QTY_BOWL: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestQtyBowl() { return _columnRestQtyBowl; }
    /**
     * REST_QTY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRestQty() { return _columnRestQty; }
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
        ls.add(columnTrpalletdetailId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnPalletDetailKey());
        ls.add(columnInoutType());
        ls.add(columnTrpalletId());
        ls.add(columnBasePalletNo());
        ls.add(columnDivPalletNo());
        ls.add(columnWorkType());
        ls.add(columnWorkKey());
        ls.add(columnRegistrationDate());
        ls.add(columnWorkDate());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnDesignFlg());
        ls.add(columnLimitDate());
        ls.add(columnFirmCarryNo());
        ls.add(columnBatArticleSign());
        ls.add(columnMoveBLlocationId());
        ls.add(columnMoveBLocationCd());
        ls.add(columnMoveALocationId());
        ls.add(columnMoveALocationCd());
        ls.add(columnInstNum());
        ls.add(columnRestQtyCase());
        ls.add(columnRestQtyBowl());
        ls.add(columnRestQty());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrpalletdetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrpalletdetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrpalletdetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrpalletdetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrpalletdetail> getEntityType() { return TTrpalletdetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrpalletdetail newEntity() { return new TTrpalletdetail(); }
    public TTrpalletdetail newMyEntity() { return new TTrpalletdetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrpalletdetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrpalletdetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
