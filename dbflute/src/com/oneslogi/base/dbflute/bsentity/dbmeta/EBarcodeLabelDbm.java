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
 * The DB meta of E_BARCODE_LABEL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EBarcodeLabelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EBarcodeLabelDbm _instance = new EBarcodeLabelDbm();
    private EBarcodeLabelDbm() {}
    public static EBarcodeLabelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getBarcodeLabelId(), (et, vl) -> ((EBarcodeLabel)et).setBarcodeLabelId(ctl(vl)), "barcodeLabelId");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getReceiveId(), (et, vl) -> ((EBarcodeLabel)et).setReceiveId(ctl(vl)), "receiveId");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getReceiveRowId(), (et, vl) -> ((EBarcodeLabel)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getImportFlg(), (et, vl) -> ((EBarcodeLabel)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getErrorFlg(), (et, vl) -> ((EBarcodeLabel)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getErrorMessageCd(), (et, vl) -> ((EBarcodeLabel)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getBarcode(), (et, vl) -> ((EBarcodeLabel)et).setBarcode((String)vl), "barcode");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getBarcodeNm(), (et, vl) -> ((EBarcodeLabel)et).setBarcodeNm((String)vl), "barcodeNm");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getBarcodeLabelComment(), (et, vl) -> ((EBarcodeLabel)et).setBarcodeLabelComment((String)vl), "barcodeLabelComment");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getOutputCnt(), (et, vl) -> ((EBarcodeLabel)et).setOutputCnt((String)vl), "outputCnt");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getDelFlg(), (et, vl) -> ((EBarcodeLabel)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getVersionNo(), (et, vl) -> ((EBarcodeLabel)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getControlNo(), (et, vl) -> ((EBarcodeLabel)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getAddDt(), (et, vl) -> ((EBarcodeLabel)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getAddUser(), (et, vl) -> ((EBarcodeLabel)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getAddProcess(), (et, vl) -> ((EBarcodeLabel)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getUpdDt(), (et, vl) -> ((EBarcodeLabel)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getUpdUser(), (et, vl) -> ((EBarcodeLabel)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EBarcodeLabel)et).getUpdProcess(), (et, vl) -> ((EBarcodeLabel)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_BARCODE_LABEL";
    protected final String _tableDispName = "E_BARCODE_LABEL";
    protected final String _tablePropertyName = "EBarcodeLabel";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_BARCODE_LABEL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarcodeLabelId = cci("BARCODE_LABEL_ID", "BARCODE_LABEL_ID", null, null, Long.class, "barcodeLabelId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveId = cci("RECEIVE_ID", "RECEIVE_ID", null, null, Long.class, "receiveId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcode = cci("BARCODE", "BARCODE", null, null, String.class, "barcode", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcodeNm = cci("BARCODE_NM", "BARCODE_NM", null, null, String.class, "barcodeNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcodeLabelComment = cci("BARCODE_LABEL_COMMENT", "BARCODE_LABEL_COMMENT", null, null, String.class, "barcodeLabelComment", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutputCnt = cci("OUTPUT_CNT", "OUTPUT_CNT", null, null, String.class, "outputCnt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BARCODE_LABEL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcodeLabelId() { return _columnBarcodeLabelId; }
    /**
     * RECEIVE_ID: {UQ+, IX, NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveId() { return _columnReceiveId; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, bigint(19)}
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
     * BARCODE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcode() { return _columnBarcode; }
    /**
     * BARCODE_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcodeNm() { return _columnBarcodeNm; }
    /**
     * BARCODE_LABEL_COMMENT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcodeLabelComment() { return _columnBarcodeLabelComment; }
    /**
     * OUTPUT_CNT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutputCnt() { return _columnOutputCnt; }
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
        ls.add(columnBarcodeLabelId());
        ls.add(columnReceiveId());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnBarcode());
        ls.add(columnBarcodeNm());
        ls.add(columnBarcodeLabelComment());
        ls.add(columnOutputCnt());
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
    protected UniqueInfo cpui() { return hpcpui(columnBarcodeLabelId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveId());
        ls.add(columnReceiveRowId());
        return hpcui(ls);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EBarcodeLabel"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EBarcodeLabelCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EBarcodeLabelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EBarcodeLabel> getEntityType() { return EBarcodeLabel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EBarcodeLabel newEntity() { return new EBarcodeLabel(); }
    public EBarcodeLabel newMyEntity() { return new EBarcodeLabel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EBarcodeLabel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EBarcodeLabel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
