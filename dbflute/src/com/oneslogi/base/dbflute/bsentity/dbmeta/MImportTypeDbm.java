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
 * The DB meta of M_IMPORT_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MImportTypeDbm _instance = new MImportTypeDbm();
    private MImportTypeDbm() {}
    public static MImportTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MImportType)et).getImportTypeId(), (et, vl) -> ((MImportType)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((MImportType)et).getClientId(), (et, vl) -> ((MImportType)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MImportType)et).getImportTypeCd(), (et, vl) -> ((MImportType)et).setImportTypeCd((String)vl), "importTypeCd");
        setupEpg(_epgMap, et -> ((MImportType)et).getImportTypeNm(), (et, vl) -> ((MImportType)et).setImportTypeNm((String)vl), "importTypeNm");
        setupEpg(_epgMap, et -> ((MImportType)et).getEdiId(), (et, vl) -> ((MImportType)et).setEdiId(ctl(vl)), "ediId");
        setupEpg(_epgMap, et -> ((MImportType)et).getCharacterCd(), (et, vl) -> ((MImportType)et).setCharacterCd((String)vl), "characterCd");
        setupEpg(_epgMap, et -> ((MImportType)et).getLineFeedCd(), (et, vl) -> ((MImportType)et).setLineFeedCd((String)vl), "lineFeedCd");
        setupEpg(_epgMap, et -> ((MImportType)et).getDelimiter(), (et, vl) -> ((MImportType)et).setDelimiter((String)vl), "delimiter");
        setupEpg(_epgMap, et -> ((MImportType)et).getSkippingRows(), (et, vl) -> ((MImportType)et).setSkippingRows(ctl(vl)), "skippingRows");
        setupEpg(_epgMap, et -> ((MImportType)et).getUploadTableNm(), (et, vl) -> ((MImportType)et).setUploadTableNm((String)vl), "uploadTableNm");
        setupEpg(_epgMap, et -> ((MImportType)et).getDuplicateColumnNm(), (et, vl) -> ((MImportType)et).setDuplicateColumnNm((String)vl), "duplicateColumnNm");
        setupEpg(_epgMap, et -> ((MImportType)et).getRcvIdColumnNm(), (et, vl) -> ((MImportType)et).setRcvIdColumnNm((String)vl), "rcvIdColumnNm");
        setupEpg(_epgMap, et -> ((MImportType)et).getRowNoColumnNm(), (et, vl) -> ((MImportType)et).setRowNoColumnNm((String)vl), "rowNoColumnNm");
        setupEpg(_epgMap, et -> ((MImportType)et).getGiftStatementType(), (et, vl) -> ((MImportType)et).setGiftStatementType((String)vl), "giftStatementType");
        setupEpg(_epgMap, et -> ((MImportType)et).getGiftStatementDetail(), (et, vl) -> ((MImportType)et).setGiftStatementDetail((String)vl), "giftStatementDetail");
        setupEpg(_epgMap, et -> ((MImportType)et).getOKeepingDays(), (et, vl) -> ((MImportType)et).setOKeepingDays(ctl(vl)), "OKeepingDays");
        setupEpg(_epgMap, et -> ((MImportType)et).getStatementTitle(), (et, vl) -> ((MImportType)et).setStatementTitle((String)vl), "statementTitle");
        setupEpg(_epgMap, et -> ((MImportType)et).getStatementUrl(), (et, vl) -> ((MImportType)et).setStatementUrl((String)vl), "statementUrl");
        setupEpg(_epgMap, et -> ((MImportType)et).getDelFlg(), (et, vl) -> ((MImportType)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MImportType)et).getVersionNo(), (et, vl) -> ((MImportType)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MImportType)et).getControlNo(), (et, vl) -> ((MImportType)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MImportType)et).getAddDt(), (et, vl) -> ((MImportType)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MImportType)et).getAddUser(), (et, vl) -> ((MImportType)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MImportType)et).getAddProcess(), (et, vl) -> ((MImportType)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MImportType)et).getUpdDt(), (et, vl) -> ((MImportType)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MImportType)et).getUpdUser(), (et, vl) -> ((MImportType)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MImportType)et).getUpdProcess(), (et, vl) -> ((MImportType)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MImportType)et).getMClient(), (et, vl) -> ((MImportType)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MImportType)et).getMEdi(), (et, vl) -> ((MImportType)et).setMEdi((MEdi)vl), "MEdi");
        setupEfpg(_efpgMap, et -> ((MImportType)et).getBClassDtlByGiftStatementType(), (et, vl) -> ((MImportType)et).setBClassDtlByGiftStatementType((BClassDtl)vl), "BClassDtlByGiftStatementType");
        setupEfpg(_efpgMap, et -> ((MImportType)et).getBClassDtlByLineFeedCd(), (et, vl) -> ((MImportType)et).setBClassDtlByLineFeedCd((BClassDtl)vl), "BClassDtlByLineFeedCd");
        setupEfpg(_efpgMap, et -> ((MImportType)et).getBClassDtlByUploadTableNm(), (et, vl) -> ((MImportType)et).setBClassDtlByUploadTableNm((BClassDtl)vl), "BClassDtlByUploadTableNm");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_IMPORT_TYPE";
    protected final String _tableDispName = "M_IMPORT_TYPE";
    protected final String _tablePropertyName = "MImportType";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_IMPORT_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImportTypeId = cci("IMPORT_TYPE_ID", "IMPORT_TYPE_ID", null, null, Long.class, "importTypeId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MImportTypeBList,TEcOrderHList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnImportTypeCd = cci("IMPORT_TYPE_CD", "IMPORT_TYPE_CD", null, null, String.class, "importTypeCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportTypeNm = cci("IMPORT_TYPE_NM", "IMPORT_TYPE_NM", null, null, String.class, "importTypeNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEdiId = cci("EDI_ID", "EDI_ID", null, null, Long.class, "ediId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MEdi", null, null, false);
    protected final ColumnInfo _columnCharacterCd = cci("CHARACTER_CD", "CHARACTER_CD", null, null, String.class, "characterCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineFeedCd = cci("LINE_FEED_CD", "LINE_FEED_CD", null, null, String.class, "lineFeedCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByLineFeedCd", null, CDef.DefMeta.LineFeedCd, false);
    protected final ColumnInfo _columnDelimiter = cci("DELIMITER", "DELIMITER", null, null, String.class, "delimiter", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkippingRows = cci("SKIPPING_ROWS", "SKIPPING_ROWS", null, null, Long.class, "skippingRows", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUploadTableNm = cci("UPLOAD_TABLE_NM", "UPLOAD_TABLE_NM", null, null, String.class, "uploadTableNm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, "BClassDtlByUploadTableNm", null, CDef.DefMeta.UploadTableNm, false);
    protected final ColumnInfo _columnDuplicateColumnNm = cci("DUPLICATE_COLUMN_NM", "DUPLICATE_COLUMN_NM", null, null, String.class, "duplicateColumnNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvIdColumnNm = cci("RCV_ID_COLUMN_NM", "RCV_ID_COLUMN_NM", null, null, String.class, "rcvIdColumnNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNoColumnNm = cci("ROW_NO_COLUMN_NM", "ROW_NO_COLUMN_NM", null, null, String.class, "rowNoColumnNm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftStatementType = cci("GIFT_STATEMENT_TYPE", "GIFT_STATEMENT_TYPE", null, null, String.class, "giftStatementType", null, false, false, true, "varchar", 30, 0, null, "0", false, null, null, "BClassDtlByGiftStatementType", null, CDef.DefMeta.GiftStatementType, false);
    protected final ColumnInfo _columnGiftStatementDetail = cci("GIFT_STATEMENT_DETAIL", "GIFT_STATEMENT_DETAIL", null, null, String.class, "giftStatementDetail", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOKeepingDays = cci("O_KEEPING_DAYS", "O_KEEPING_DAYS", null, null, Long.class, "OKeepingDays", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatementTitle = cci("STATEMENT_TITLE", "STATEMENT_TITLE", null, null, String.class, "statementTitle", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatementUrl = cci("STATEMENT_URL", "STATEMENT_URL", null, null, String.class, "statementUrl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeId() { return _columnImportTypeId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeCd() { return _columnImportTypeCd; }
    /**
     * IMPORT_TYPE_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeNm() { return _columnImportTypeNm; }
    /**
     * EDI_ID: {IX, bigint(19), FK to M_EDI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEdiId() { return _columnEdiId; }
    /**
     * CHARACTER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacterCd() { return _columnCharacterCd; }
    /**
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineFeedCd() { return _columnLineFeedCd; }
    /**
     * DELIMITER: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelimiter() { return _columnDelimiter; }
    /**
     * SKIPPING_ROWS: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkippingRows() { return _columnSkippingRows; }
    /**
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUploadTableNm() { return _columnUploadTableNm; }
    /**
     * DUPLICATE_COLUMN_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDuplicateColumnNm() { return _columnDuplicateColumnNm; }
    /**
     * RCV_ID_COLUMN_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvIdColumnNm() { return _columnRcvIdColumnNm; }
    /**
     * ROW_NO_COLUMN_NM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNoColumnNm() { return _columnRowNoColumnNm; }
    /**
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftStatementType() { return _columnGiftStatementType; }
    /**
     * GIFT_STATEMENT_DETAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftStatementDetail() { return _columnGiftStatementDetail; }
    /**
     * O_KEEPING_DAYS: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOKeepingDays() { return _columnOKeepingDays; }
    /**
     * STATEMENT_TITLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatementTitle() { return _columnStatementTitle; }
    /**
     * STATEMENT_URL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatementUrl() { return _columnStatementUrl; }
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
        ls.add(columnImportTypeId());
        ls.add(columnClientId());
        ls.add(columnImportTypeCd());
        ls.add(columnImportTypeNm());
        ls.add(columnEdiId());
        ls.add(columnCharacterCd());
        ls.add(columnLineFeedCd());
        ls.add(columnDelimiter());
        ls.add(columnSkippingRows());
        ls.add(columnUploadTableNm());
        ls.add(columnDuplicateColumnNm());
        ls.add(columnRcvIdColumnNm());
        ls.add(columnRowNoColumnNm());
        ls.add(columnGiftStatementType());
        ls.add(columnGiftStatementDetail());
        ls.add(columnOKeepingDays());
        ls.add(columnStatementTitle());
        ls.add(columnStatementUrl());
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
    protected UniqueInfo cpui() { return hpcpui(columnImportTypeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnImportTypeCd());
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
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_IMPORT_TYPE_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MImportTypeList", false);
    }
    /**
     * M_EDI by my EDI_ID, named 'MEdi'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMEdi() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEdiId(), MEdiDbm.getInstance().columnEdiId());
        return cfi("M_IMPORT_TYPE_FK1", "MEdi", this, MEdiDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MImportTypeList", false);
    }
    /**
     * B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByGiftStatementType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiftStatementType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_IMPORT_TYPE_GIFT_STATEMENT_TYPE", "BClassDtlByGiftStatementType", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'GIFT_STATEMENT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLineFeedCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLineFeedCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_IMPORT_TYPE_LINE_FEED_CD", "BClassDtlByLineFeedCd", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LINE_FEED_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUploadTableNm() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUploadTableNm(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_IMPORT_TYPE_UPLOAD_TABLE_NM", "BClassDtlByUploadTableNm", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'UPLOAD_TABLE_NM'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeId(), MImportTypeBDbm.getInstance().columnImportTypeId());
        return cri("M_IMPORT_TYPE_B_FK1", "MImportTypeBList", this, MImportTypeBDbm.getInstance(), mp, false, "MImportType");
    }
    /**
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeId(), TEcOrderHDbm.getInstance().columnImportTypeId());
        return cri("T_EC_ORDER_H_FK4", "TEcOrderHList", this, TEcOrderHDbm.getInstance(), mp, false, "MImportType");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MImportType"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MImportTypeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MImportTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MImportType> getEntityType() { return MImportType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MImportType newEntity() { return new MImportType(); }
    public MImportType newMyEntity() { return new MImportType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MImportType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MImportType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
