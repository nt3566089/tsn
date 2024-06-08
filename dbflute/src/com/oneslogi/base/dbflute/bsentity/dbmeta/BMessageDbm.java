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
 * The DB meta of B_MESSAGE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BMessageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BMessageDbm _instance = new BMessageDbm();
    private BMessageDbm() {}
    public static BMessageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BMessage)et).getMessageId(), (et, vl) -> ((BMessage)et).setMessageId(ctl(vl)), "messageId");
        setupEpg(_epgMap, et -> ((BMessage)et).getMessageCd(), (et, vl) -> ((BMessage)et).setMessageCd((String)vl), "messageCd");
        setupEpg(_epgMap, et -> ((BMessage)et).getMessageNm(), (et, vl) -> ((BMessage)et).setMessageNm((String)vl), "messageNm");
        setupEpg(_epgMap, et -> ((BMessage)et).getMessageAbbr(), (et, vl) -> ((BMessage)et).setMessageAbbr((String)vl), "messageAbbr");
        setupEpg(_epgMap, et -> ((BMessage)et).getMessageType(), (et, vl) -> ((BMessage)et).setMessageType((String)vl), "messageType");
        setupEpg(_epgMap, et -> ((BMessage)et).getSystemType(), (et, vl) -> ((BMessage)et).setSystemType((String)vl), "systemType");
        setupEpg(_epgMap, et -> ((BMessage)et).getCultureId(), (et, vl) -> ((BMessage)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((BMessage)et).getDelFlg(), (et, vl) -> ((BMessage)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BMessage)et).getVersionNo(), (et, vl) -> ((BMessage)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BMessage)et).getControlNo(), (et, vl) -> ((BMessage)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BMessage)et).getAddDt(), (et, vl) -> ((BMessage)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BMessage)et).getAddUser(), (et, vl) -> ((BMessage)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BMessage)et).getAddProcess(), (et, vl) -> ((BMessage)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BMessage)et).getUpdDt(), (et, vl) -> ((BMessage)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BMessage)et).getUpdUser(), (et, vl) -> ((BMessage)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BMessage)et).getUpdProcess(), (et, vl) -> ((BMessage)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BMessage)et).getBCulture(), (et, vl) -> ((BMessage)et).setBCulture((BCulture)vl), "BCulture");
        setupEfpg(_efpgMap, et -> ((BMessage)et).getBClassDtlByMessageType(), (et, vl) -> ((BMessage)et).setBClassDtlByMessageType((BClassDtl)vl), "BClassDtlByMessageType");
        setupEfpg(_efpgMap, et -> ((BMessage)et).getBClassDtlBySystemType(), (et, vl) -> ((BMessage)et).setBClassDtlBySystemType((BClassDtl)vl), "BClassDtlBySystemType");
        setupEfpg(_efpgMap, et -> ((BMessage)et).getMHtMessageAsOne(), (et, vl) -> ((BMessage)et).setMHtMessageAsOne((MHtMessage)vl), "MHtMessageAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "B_MESSAGE";
    protected final String _tableDispName = "B_MESSAGE";
    protected final String _tablePropertyName = "BMessage";
    protected final TableSqlName _tableSqlName = new TableSqlName("B_MESSAGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMessageId = cci("MESSAGE_ID", "MESSAGE_ID", null, null, Long.class, "messageId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnMessageCd = cci("MESSAGE_CD", "MESSAGE_CD", null, null, String.class, "messageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageNm = cci("MESSAGE_NM", "MESSAGE_NM", null, null, String.class, "messageNm", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageAbbr = cci("MESSAGE_ABBR", "MESSAGE_ABBR", null, null, String.class, "messageAbbr", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMessageType = cci("MESSAGE_TYPE", "MESSAGE_TYPE", null, null, String.class, "messageType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByMessageType", null, CDef.DefMeta.MessageType, false);
    protected final ColumnInfo _columnSystemType = cci("SYSTEM_TYPE", "SYSTEM_TYPE", null, null, String.class, "systemType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySystemType", null, CDef.DefMeta.SystemType, false);
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
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
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageId() { return _columnMessageId; }
    /**
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageCd() { return _columnMessageCd; }
    /**
     * MESSAGE_NM: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageNm() { return _columnMessageNm; }
    /**
     * MESSAGE_ABBR: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageAbbr() { return _columnMessageAbbr; }
    /**
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMessageType() { return _columnMessageType; }
    /**
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSystemType() { return _columnSystemType; }
    /**
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
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
        ls.add(columnMessageId());
        ls.add(columnMessageCd());
        ls.add(columnMessageNm());
        ls.add(columnMessageAbbr());
        ls.add(columnMessageType());
        ls.add(columnSystemType());
        ls.add(columnCultureId());
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
    protected UniqueInfo cpui() { return hpcpui(columnMessageId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMessageCd());
        ls.add(columnCultureId());
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
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("B_MESSAGE_FK1", "BCulture", this, BCultureDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BMessageList", false);
    }
    /**
     * B_CLASS_DTL by my MESSAGE_TYPE, named 'BClassDtlByMessageType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMessageType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_MESSAGE_MESSAGE_TYPE", "BClassDtlByMessageType", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MESSAGE_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SYSTEM_TYPE, named 'BClassDtlBySystemType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySystemType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSystemType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_MESSAGE_SYSTEM_TYPE", "BClassDtlBySystemType", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SYSTEM_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMHtMessageAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMessageId(), MHtMessageDbm.getInstance().columnMessageId());
        return cfi("M_HT_MESSAGE_FK1", "MHtMessageAsOne", this, MHtMessageDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "BMessage", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BMessage"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BMessageCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BMessageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BMessage> getEntityType() { return BMessage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BMessage newEntity() { return new BMessage(); }
    public BMessage newMyEntity() { return new BMessage(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BMessage)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BMessage)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
