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
 * The DB meta of T_EC_ORDER_B. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TEcOrderBDbm _instance = new TEcOrderBDbm();
    private TEcOrderBDbm() {}
    public static TEcOrderBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getEcOrderBId(), (et, vl) -> ((TEcOrderB)et).setEcOrderBId(ctl(vl)), "ecOrderBId");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getEcOrderHId(), (et, vl) -> ((TEcOrderB)et).setEcOrderHId(ctl(vl)), "ecOrderHId");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getProductCd(), (et, vl) -> ((TEcOrderB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getProductNm(), (et, vl) -> ((TEcOrderB)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getProductOption(), (et, vl) -> ((TEcOrderB)et).setProductOption((String)vl), "productOption");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getOrderNum(), (et, vl) -> ((TEcOrderB)et).setOrderNum(ctl(vl)), "orderNum");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getUnitPrice(), (et, vl) -> ((TEcOrderB)et).setUnitPrice(ctl(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getUnitTotalPrice(), (et, vl) -> ((TEcOrderB)et).setUnitTotalPrice(ctl(vl)), "unitTotalPrice");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getErrorFlg(), (et, vl) -> ((TEcOrderB)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getErrorMessageCd(), (et, vl) -> ((TEcOrderB)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getDelFlg(), (et, vl) -> ((TEcOrderB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getVersionNo(), (et, vl) -> ((TEcOrderB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getControlNo(), (et, vl) -> ((TEcOrderB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getAddDt(), (et, vl) -> ((TEcOrderB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getAddUser(), (et, vl) -> ((TEcOrderB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getAddProcess(), (et, vl) -> ((TEcOrderB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getUpdDt(), (et, vl) -> ((TEcOrderB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getUpdUser(), (et, vl) -> ((TEcOrderB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TEcOrderB)et).getUpdProcess(), (et, vl) -> ((TEcOrderB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TEcOrderB)et).getTEcOrderH(), (et, vl) -> ((TEcOrderB)et).setTEcOrderH((TEcOrderH)vl), "TEcOrderH");
        setupEfpg(_efpgMap, et -> ((TEcOrderB)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TEcOrderB)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_EC_ORDER_B";
    protected final String _tableDispName = "T_EC_ORDER_B";
    protected final String _tablePropertyName = "TEcOrderB";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_EC_ORDER_B", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEcOrderBId = cci("EC_ORDER_B_ID", "EC_ORDER_B_ID", null, null, Long.class, "ecOrderBId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TAmazonOrderList,TRakutenOrderList,TYahooOrderList", null, false);
    protected final ColumnInfo _columnEcOrderHId = cci("EC_ORDER_H_ID", "EC_ORDER_H_ID", null, null, Long.class, "ecOrderHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TEcOrderH", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductOption = cci("PRODUCT_OPTION", "PRODUCT_OPTION", null, null, String.class, "productOption", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNum = cci("ORDER_NUM", "ORDER_NUM", null, null, Long.class, "orderNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, Long.class, "unitPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitTotalPrice = cci("UNIT_TOTAL_PRICE", "UNIT_TOTAL_PRICE", null, null, Long.class, "unitTotalPrice", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * EC_ORDER_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBId() { return _columnEcOrderBId; }
    /**
     * EC_ORDER_H_ID: {IX, bigint(19), FK to T_EC_ORDER_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderHId() { return _columnEcOrderHId; }
    /**
     * PRODUCT_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_OPTION: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductOption() { return _columnProductOption; }
    /**
     * ORDER_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNum() { return _columnOrderNum; }
    /**
     * UNIT_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * UNIT_TOTAL_PRICE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitTotalPrice() { return _columnUnitTotalPrice; }
    /**
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
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
        ls.add(columnEcOrderBId());
        ls.add(columnEcOrderHId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductOption());
        ls.add(columnOrderNum());
        ls.add(columnUnitPrice());
        ls.add(columnUnitTotalPrice());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnEcOrderBId()); }
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
     * T_EC_ORDER_H by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTEcOrderH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderHId(), TEcOrderHDbm.getInstance().columnEcOrderHId());
        return cfi("T_EC_ORDER_B_FK1", "TEcOrderH", this, TEcOrderHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TEcOrderBList", false);
    }
    /**
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_B_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_AMAZON_ORDER by EC_ORDER_B_ID, named 'TAmazonOrderList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAmazonOrderList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderBId(), TAmazonOrderDbm.getInstance().columnEcOrderBId());
        return cri("T_AMAZON_ORDER_FK1", "TAmazonOrderList", this, TAmazonOrderDbm.getInstance(), mp, false, "TEcOrderB");
    }
    /**
     * T_RAKUTEN_ORDER by EC_ORDER_B_ID, named 'TRakutenOrderList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTRakutenOrderList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderBId(), TRakutenOrderDbm.getInstance().columnEcOrderBId());
        return cri("T_RAKUTEN_ORDER_FK1", "TRakutenOrderList", this, TRakutenOrderDbm.getInstance(), mp, false, "TEcOrderB");
    }
    /**
     * T_YAHOO_ORDER by EC_ORDER_B_ID, named 'TYahooOrderList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTYahooOrderList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderBId(), TYahooOrderDbm.getInstance().columnEcOrderBId());
        return cri("T_YAHOO_ORDER_FK1", "TYahooOrderList", this, TYahooOrderDbm.getInstance(), mp, false, "TEcOrderB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TEcOrderB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TEcOrderBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TEcOrderBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TEcOrderB> getEntityType() { return TEcOrderB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TEcOrderB newEntity() { return new TEcOrderB(); }
    public TEcOrderB newMyEntity() { return new TEcOrderB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TEcOrderB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TEcOrderB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
