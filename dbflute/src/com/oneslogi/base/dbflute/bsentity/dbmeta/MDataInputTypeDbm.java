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
 * The DB meta of M_DATA_INPUT_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MDataInputTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MDataInputTypeDbm _instance = new MDataInputTypeDbm();
    private MDataInputTypeDbm() {}
    public static MDataInputTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MDataInputType)et).getDataInputTypeId(), (et, vl) -> ((MDataInputType)et).setDataInputTypeId(ctl(vl)), "dataInputTypeId");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getDataInputTypeCd(), (et, vl) -> ((MDataInputType)et).setDataInputTypeCd((String)vl), "dataInputTypeCd");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getDataInputTypeNm(), (et, vl) -> ((MDataInputType)et).setDataInputTypeNm((String)vl), "dataInputTypeNm");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getCharacterCd(), (et, vl) -> ((MDataInputType)et).setCharacterCd((String)vl), "characterCd");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getLineFeedCd(), (et, vl) -> ((MDataInputType)et).setLineFeedCd((String)vl), "lineFeedCd");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getDelimiter(), (et, vl) -> ((MDataInputType)et).setDelimiter((String)vl), "delimiter");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getSkippingRows(), (et, vl) -> ((MDataInputType)et).setSkippingRows(ctl(vl)), "skippingRows");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getUploadTableNm(), (et, vl) -> ((MDataInputType)et).setUploadTableNm((String)vl), "uploadTableNm");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getDelFlg(), (et, vl) -> ((MDataInputType)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getVersionNo(), (et, vl) -> ((MDataInputType)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getControlNo(), (et, vl) -> ((MDataInputType)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getAddDt(), (et, vl) -> ((MDataInputType)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getAddUser(), (et, vl) -> ((MDataInputType)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getAddProcess(), (et, vl) -> ((MDataInputType)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getUpdDt(), (et, vl) -> ((MDataInputType)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getUpdUser(), (et, vl) -> ((MDataInputType)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MDataInputType)et).getUpdProcess(), (et, vl) -> ((MDataInputType)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MDataInputType)et).getBClassDtlByDataInputTypeCd(), (et, vl) -> ((MDataInputType)et).setBClassDtlByDataInputTypeCd((BClassDtl)vl), "BClassDtlByDataInputTypeCd");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_DATA_INPUT_TYPE";
    protected final String _tableDispName = "M_DATA_INPUT_TYPE";
    protected final String _tablePropertyName = "MDataInputType";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_DATA_INPUT_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDataInputTypeId = cci("DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", null, null, Long.class, "dataInputTypeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MDataInputTypeBList", null, false);
    protected final ColumnInfo _columnDataInputTypeCd = cci("DATA_INPUT_TYPE_CD", "DATA_INPUT_TYPE_CD", null, null, String.class, "dataInputTypeCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByDataInputTypeCd", null, CDef.DefMeta.DataInputType, false);
    protected final ColumnInfo _columnDataInputTypeNm = cci("DATA_INPUT_TYPE_NM", "DATA_INPUT_TYPE_NM", null, null, String.class, "dataInputTypeNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacterCd = cci("CHARACTER_CD", "CHARACTER_CD", null, null, String.class, "characterCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineFeedCd = cci("LINE_FEED_CD", "LINE_FEED_CD", null, null, String.class, "lineFeedCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelimiter = cci("DELIMITER", "DELIMITER", null, null, String.class, "delimiter", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkippingRows = cci("SKIPPING_ROWS", "SKIPPING_ROWS", null, null, Long.class, "skippingRows", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUploadTableNm = cci("UPLOAD_TABLE_NM", "UPLOAD_TABLE_NM", null, null, String.class, "uploadTableNm", null, false, false, true, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataInputTypeId() { return _columnDataInputTypeId; }
    /**
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataInputTypeCd() { return _columnDataInputTypeCd; }
    /**
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataInputTypeNm() { return _columnDataInputTypeNm; }
    /**
     * CHARACTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacterCd() { return _columnCharacterCd; }
    /**
     * LINE_FEED_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineFeedCd() { return _columnLineFeedCd; }
    /**
     * DELIMITER: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelimiter() { return _columnDelimiter; }
    /**
     * SKIPPING_ROWS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkippingRows() { return _columnSkippingRows; }
    /**
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUploadTableNm() { return _columnUploadTableNm; }
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
        ls.add(columnDataInputTypeId());
        ls.add(columnDataInputTypeCd());
        ls.add(columnDataInputTypeNm());
        ls.add(columnCharacterCd());
        ls.add(columnLineFeedCd());
        ls.add(columnDelimiter());
        ls.add(columnSkippingRows());
        ls.add(columnUploadTableNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnDataInputTypeId()); }
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
     * B_CLASS_DTL by my DATA_INPUT_TYPE_CD, named 'BClassDtlByDataInputTypeCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDataInputTypeCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataInputTypeCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_DATA_INPUT_TYPE_DATA_INPUT_TYPE_CD", "BClassDtlByDataInputTypeCd", this, BClassDtlDbm.getInstance(), mp, 0, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DATA_INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDataInputTypeBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataInputTypeId(), MDataInputTypeBDbm.getInstance().columnDataInputTypeId());
        return cri("M_DATA_INPUT_TYPE_B_FK1", "MDataInputTypeBList", this, MDataInputTypeBDbm.getInstance(), mp, false, "MDataInputType");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MDataInputType"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MDataInputTypeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MDataInputTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MDataInputType> getEntityType() { return MDataInputType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MDataInputType newEntity() { return new MDataInputType(); }
    public MDataInputType newMyEntity() { return new MDataInputType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MDataInputType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MDataInputType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
