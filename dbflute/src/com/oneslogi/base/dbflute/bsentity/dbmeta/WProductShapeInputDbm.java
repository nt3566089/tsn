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
 * The DB meta of W_PRODUCT_SHAPE_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WProductShapeInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WProductShapeInputDbm _instance = new WProductShapeInputDbm();
    private WProductShapeInputDbm() {}
    public static WProductShapeInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getProductShapeInputId(), (et, vl) -> ((WProductShapeInput)et).setProductShapeInputId(ctl(vl)), "productShapeInputId");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getClientCd(), (et, vl) -> ((WProductShapeInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getProductCd(), (et, vl) -> ((WProductShapeInput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getShapeCd(), (et, vl) -> ((WProductShapeInput)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getUnitNum(), (et, vl) -> ((WProductShapeInput)et).setUnitNum((String)vl), "unitNum");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getLength(), (et, vl) -> ((WProductShapeInput)et).setLength((String)vl), "length");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getWidth(), (et, vl) -> ((WProductShapeInput)et).setWidth((String)vl), "width");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getHeight(), (et, vl) -> ((WProductShapeInput)et).setHeight((String)vl), "height");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getVolume(), (et, vl) -> ((WProductShapeInput)et).setVolume((String)vl), "volume");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getNetWeight(), (et, vl) -> ((WProductShapeInput)et).setNetWeight((String)vl), "netWeight");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getGrossWeight(), (et, vl) -> ((WProductShapeInput)et).setGrossWeight((String)vl), "grossWeight");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getLineNo(), (et, vl) -> ((WProductShapeInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getWorkFlg(), (et, vl) -> ((WProductShapeInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getErrorFlg(), (et, vl) -> ((WProductShapeInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getErrorMsg(), (et, vl) -> ((WProductShapeInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getDelFlg(), (et, vl) -> ((WProductShapeInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getVersionNo(), (et, vl) -> ((WProductShapeInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getControlNo(), (et, vl) -> ((WProductShapeInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getAddDt(), (et, vl) -> ((WProductShapeInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getAddUser(), (et, vl) -> ((WProductShapeInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getAddProcess(), (et, vl) -> ((WProductShapeInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getUpdDt(), (et, vl) -> ((WProductShapeInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getUpdUser(), (et, vl) -> ((WProductShapeInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WProductShapeInput)et).getUpdProcess(), (et, vl) -> ((WProductShapeInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_PRODUCT_SHAPE_INPUT";
    protected final String _tableDispName = "W_PRODUCT_SHAPE_INPUT";
    protected final String _tablePropertyName = "WProductShapeInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_PRODUCT_SHAPE_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductShapeInputId = cci("PRODUCT_SHAPE_INPUT_ID", "PRODUCT_SHAPE_INPUT_ID", null, null, Long.class, "productShapeInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, String.class, "unitNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, String.class, "length", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, String.class, "width", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, String.class, "height", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolume = cci("VOLUME", "VOLUME", null, null, String.class, "volume", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetWeight = cci("NET_WEIGHT", "NET_WEIGHT", null, null, String.class, "netWeight", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, String.class, "grossWeight", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_SHAPE_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductShapeInputId() { return _columnProductShapeInputId; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SHAPE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeCd() { return _columnShapeCd; }
    /**
     * UNIT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * LENGTH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * VOLUME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolume() { return _columnVolume; }
    /**
     * NET_WEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetWeight() { return _columnNetWeight; }
    /**
     * GROSS_WEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnProductShapeInputId());
        ls.add(columnClientCd());
        ls.add(columnProductCd());
        ls.add(columnShapeCd());
        ls.add(columnUnitNum());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnVolume());
        ls.add(columnNetWeight());
        ls.add(columnGrossWeight());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductShapeInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WProductShapeInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WProductShapeInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WProductShapeInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WProductShapeInput> getEntityType() { return WProductShapeInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WProductShapeInput newEntity() { return new WProductShapeInput(); }
    public WProductShapeInput newMyEntity() { return new WProductShapeInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WProductShapeInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WProductShapeInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
