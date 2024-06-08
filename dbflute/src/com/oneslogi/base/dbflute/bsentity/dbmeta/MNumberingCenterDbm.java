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
 * The DB meta of M_NUMBERING_CENTER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MNumberingCenterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MNumberingCenterDbm _instance = new MNumberingCenterDbm();
    private MNumberingCenterDbm() {}
    public static MNumberingCenterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getNumberingCenterId(), (et, vl) -> ((MNumberingCenter)et).setNumberingCenterId(ctl(vl)), "numberingCenterId");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getCenterId(), (et, vl) -> ((MNumberingCenter)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getBizCd(), (et, vl) -> ((MNumberingCenter)et).setBizCd((String)vl), "bizCd");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getBizNm(), (et, vl) -> ((MNumberingCenter)et).setBizNm((String)vl), "bizNm");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getLength(), (et, vl) -> ((MNumberingCenter)et).setLength(ctl(vl)), "length");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getFixedValue(), (et, vl) -> ((MNumberingCenter)et).setFixedValue((String)vl), "fixedValue");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getFixedDtFormat(), (et, vl) -> ((MNumberingCenter)et).setFixedDtFormat((String)vl), "fixedDtFormat");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getPresentNumber(), (et, vl) -> ((MNumberingCenter)et).setPresentNumber(ctl(vl)), "presentNumber");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getIncNumber(), (et, vl) -> ((MNumberingCenter)et).setIncNumber(ctl(vl)), "incNumber");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getMinNumber(), (et, vl) -> ((MNumberingCenter)et).setMinNumber(ctl(vl)), "minNumber");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getMaxNumber(), (et, vl) -> ((MNumberingCenter)et).setMaxNumber(ctl(vl)), "maxNumber");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getCheckDigit(), (et, vl) -> ((MNumberingCenter)et).setCheckDigit((String)vl), "checkDigit");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getCashCount(), (et, vl) -> ((MNumberingCenter)et).setCashCount(ctl(vl)), "cashCount");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getUserEditable(), (et, vl) -> ((MNumberingCenter)et).setUserEditable((String)vl), "userEditable");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getDelFlg(), (et, vl) -> ((MNumberingCenter)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getVersionNo(), (et, vl) -> ((MNumberingCenter)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getControlNo(), (et, vl) -> ((MNumberingCenter)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getAddDt(), (et, vl) -> ((MNumberingCenter)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getAddUser(), (et, vl) -> ((MNumberingCenter)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getAddProcess(), (et, vl) -> ((MNumberingCenter)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getUpdDt(), (et, vl) -> ((MNumberingCenter)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getUpdUser(), (et, vl) -> ((MNumberingCenter)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MNumberingCenter)et).getUpdProcess(), (et, vl) -> ((MNumberingCenter)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MNumberingCenter)et).getMCenter(), (et, vl) -> ((MNumberingCenter)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MNumberingCenter)et).getBClassDtlByUserEditable(), (et, vl) -> ((MNumberingCenter)et).setBClassDtlByUserEditable((BClassDtl)vl), "BClassDtlByUserEditable");
        setupEfpg(_efpgMap, et -> ((MNumberingCenter)et).getBClassDtlByCheckDigit(), (et, vl) -> ((MNumberingCenter)et).setBClassDtlByCheckDigit((BClassDtl)vl), "BClassDtlByCheckDigit");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_NUMBERING_CENTER";
    protected final String _tableDispName = "M_NUMBERING_CENTER";
    protected final String _tablePropertyName = "MNumberingCenter";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_NUMBERING_CENTER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNumberingCenterId = cci("NUMBERING_CENTER_ID", "NUMBERING_CENTER_ID", null, null, Long.class, "numberingCenterId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBizCd = cci("BIZ_CD", "BIZ_CD", null, null, String.class, "bizCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizNm = cci("BIZ_NM", "BIZ_NM", null, null, String.class, "bizNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, Long.class, "length", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixedValue = cci("FIXED_VALUE", "FIXED_VALUE", null, null, String.class, "fixedValue", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixedDtFormat = cci("FIXED_DT_FORMAT", "FIXED_DT_FORMAT", null, null, String.class, "fixedDtFormat", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPresentNumber = cci("PRESENT_NUMBER", "PRESENT_NUMBER", null, null, Long.class, "presentNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncNumber = cci("INC_NUMBER", "INC_NUMBER", null, null, Long.class, "incNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinNumber = cci("MIN_NUMBER", "MIN_NUMBER", null, null, Long.class, "minNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxNumber = cci("MAX_NUMBER", "MAX_NUMBER", null, null, Long.class, "maxNumber", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCheckDigit = cci("CHECK_DIGIT", "CHECK_DIGIT", null, null, String.class, "checkDigit", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCheckDigit", null, CDef.DefMeta.CheckDigit, false);
    protected final ColumnInfo _columnCashCount = cci("CASH_COUNT", "CASH_COUNT", null, null, Long.class, "cashCount", null, false, false, false, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserEditable = cci("USER_EDITABLE", "USER_EDITABLE", null, null, String.class, "userEditable", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByUserEditable", null, CDef.DefMeta.UserEditable, false);
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
     * NUMBERING_CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberingCenterId() { return _columnNumberingCenterId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BIZ_CD: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizCd() { return _columnBizCd; }
    /**
     * BIZ_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizNm() { return _columnBizNm; }
    /**
     * LENGTH: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * FIXED_VALUE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedValue() { return _columnFixedValue; }
    /**
     * FIXED_DT_FORMAT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedDtFormat() { return _columnFixedDtFormat; }
    /**
     * PRESENT_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPresentNumber() { return _columnPresentNumber; }
    /**
     * INC_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncNumber() { return _columnIncNumber; }
    /**
     * MIN_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinNumber() { return _columnMinNumber; }
    /**
     * MAX_NUMBER: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxNumber() { return _columnMaxNumber; }
    /**
     * CHECK_DIGIT: {varchar(30), FK to B_CLASS_DTL, classification=CheckDigit}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCheckDigit() { return _columnCheckDigit; }
    /**
     * CASH_COUNT: {bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCashCount() { return _columnCashCount; }
    /**
     * USER_EDITABLE: {char(1), FK to B_CLASS_DTL, classification=UserEditable}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserEditable() { return _columnUserEditable; }
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
        ls.add(columnNumberingCenterId());
        ls.add(columnCenterId());
        ls.add(columnBizCd());
        ls.add(columnBizNm());
        ls.add(columnLength());
        ls.add(columnFixedValue());
        ls.add(columnFixedDtFormat());
        ls.add(columnPresentNumber());
        ls.add(columnIncNumber());
        ls.add(columnMinNumber());
        ls.add(columnMaxNumber());
        ls.add(columnCheckDigit());
        ls.add(columnCashCount());
        ls.add(columnUserEditable());
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
    protected UniqueInfo cpui() { return hpcpui(columnNumberingCenterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnBizCd());
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
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_NUMBERING_CENTER_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MNumberingCenterList", false);
    }
    /**
     * B_CLASS_DTL by my USER_EDITABLE, named 'BClassDtlByUserEditable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByUserEditable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserEditable(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_NUMBERING_CENTER_USER_EDITABLE", "BClassDtlByUserEditable", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'USER_EDITABLE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my CHECK_DIGIT, named 'BClassDtlByCheckDigit'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCheckDigit() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCheckDigit(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_NUMBERING_CENTER_CHECK_DIGIT", "BClassDtlByCheckDigit", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CHECK_DIGIT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MNumberingCenter"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MNumberingCenterCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MNumberingCenterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MNumberingCenter> getEntityType() { return MNumberingCenter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MNumberingCenter newEntity() { return new MNumberingCenter(); }
    public MNumberingCenter newMyEntity() { return new MNumberingCenter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MNumberingCenter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MNumberingCenter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
