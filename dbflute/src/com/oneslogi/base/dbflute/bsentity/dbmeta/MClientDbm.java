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
 * The DB meta of M_CLIENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MClientDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MClientDbm _instance = new MClientDbm();
    private MClientDbm() {}
    public static MClientDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MClient)et).getClientId(), (et, vl) -> ((MClient)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MClient)et).getClientCd(), (et, vl) -> ((MClient)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((MClient)et).getClientNm(), (et, vl) -> ((MClient)et).setClientNm((String)vl), "clientNm");
        setupEpg(_epgMap, et -> ((MClient)et).getClientAbbr(), (et, vl) -> ((MClient)et).setClientAbbr((String)vl), "clientAbbr");
        setupEpg(_epgMap, et -> ((MClient)et).getCustomerId(), (et, vl) -> ((MClient)et).setCustomerId(ctl(vl)), "customerId");
        setupEpg(_epgMap, et -> ((MClient)et).getShapeGrpId(), (et, vl) -> ((MClient)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MClient)et).getDelFlg(), (et, vl) -> ((MClient)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MClient)et).getVersionNo(), (et, vl) -> ((MClient)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MClient)et).getControlNo(), (et, vl) -> ((MClient)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MClient)et).getAddDt(), (et, vl) -> ((MClient)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MClient)et).getAddUser(), (et, vl) -> ((MClient)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MClient)et).getAddProcess(), (et, vl) -> ((MClient)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdDt(), (et, vl) -> ((MClient)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdUser(), (et, vl) -> ((MClient)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MClient)et).getUpdProcess(), (et, vl) -> ((MClient)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MClient)et).getMShapeGrp(), (et, vl) -> ((MClient)et).setMShapeGrp((MShapeGrp)vl), "MShapeGrp");
        setupEfpg(_efpgMap, et -> ((MClient)et).getMCustomer(), (et, vl) -> ((MClient)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MClient)et).getBClassDtlByDelFlg(), (et, vl) -> ((MClient)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CLIENT";
    protected final String _tableDispName = "M_CLIENT";
    protected final String _tablePropertyName = "MClient";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CLIENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MCbrctgList,MCdrcattList,MClientCenterList,MClientColList,MClientItemList,MClientScreenList,MCustomerList,MImportTypeList,MMfinvoperationList,MMfmonthchgList,MMfpickctlList,MMfrcvdesignList,MMfrcvitemList,MMfwhxitemList,MProductList,MShapeGrpList,MUserClientList,MUserLoginList,MWebHtInfoList,TAllocInstHList,TCcopamList,TCenterSymbolList,TCordhdrList,TEcOrderHList,TInventoryHList,TMflastshiplotList,TMoveInstHList,TPackingHList,TPalletList,TPickingHList,TPicMthdRcmdList,TReceivePlanHList,TSerialNoList,TShippingInstHList,TSplinfoList,TStockList,TStoreRecordHList,TTrallinvList,TTrallinvhistoryList,TTrcaseinventoryList,TTrcasenumList,TTrcasestockList,TTrhanbaiinvList,TTrinvcheckinfoList,TTrinvcorrectList,TTrinvreanswerList,TTrinvrequestList,TTritemconvresultList,TTrjukyuinvList,TTrmanufacturedateList,TTrmanufacturedatedetailList,TTrmanufacturedatehistoryList,TTrpallettraceList,TTrreversestockList,TTrstockdiffhistoryList,TTrsymboltraceList,TTrsymboltraceextendList,TTrtraceList,TYtrsoList,WHtInventoryInputProdList,WHtLoadingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtSerialReceiveInspList,WHtSerialShippingInspList,WHtShippingList,WHtShippingPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientNm = cci("CLIENT_NM", "CLIENT_NM", null, null, String.class, "clientNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientAbbr = cci("CLIENT_ABBR", "CLIENT_ABBR", null, null, String.class, "clientAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, Long.class, "customerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MShapeGrp", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * CLIENT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CLIENT_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CLIENT_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientNm() { return _columnClientNm; }
    /**
     * CLIENT_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientAbbr() { return _columnClientAbbr; }
    /**
     * CUSTOMER_ID: {IX, bigint(19), FK to M_CUSTOMER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnClientId());
        ls.add(columnClientCd());
        ls.add(columnClientNm());
        ls.add(columnClientAbbr());
        ls.add(columnCustomerId());
        ls.add(columnShapeGrpId());
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
    protected UniqueInfo cpui() { return hpcpui(columnClientId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnClientCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDbm.getInstance().columnShapeGrpId());
        return cfi("M_CLIENT_FK1", "MShapeGrp", this, MShapeGrpDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MClientList", false);
    }
    /**
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCustomerId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_CLIENT_FK2", "MCustomer", this, MCustomerDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MClientList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CLIENT_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_CBRCTG by CLIENT_ID, named 'MCbrctgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCbrctgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MCbrctgDbm.getInstance().columnClientId());
        return cri("M_CBRCTG_FK2", "MCbrctgList", this, MCbrctgDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CDRCATT by CLIENT_ID, named 'MCdrcattList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCdrcattList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MCdrcattDbm.getInstance().columnClientId());
        return cri("M_CDRCATT_FK1", "MCdrcattList", this, MCdrcattDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CLIENT_CENTER by CLIENT_ID, named 'MClientCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientCenterDbm.getInstance().columnClientId());
        return cri("M_CLIENT_CENTER_FK1", "MClientCenterList", this, MClientCenterDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CLIENT_COL by CLIENT_ID, named 'MClientColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientColDbm.getInstance().columnClientId());
        return cri("M_CLIENT_COL_FK3", "MClientColList", this, MClientColDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CLIENT_ITEM by CLIENT_ID, named 'MClientItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientItemDbm.getInstance().columnClientId());
        return cri("M_CLIENT_ITEM_FK3", "MClientItemList", this, MClientItemDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CLIENT_SCREEN by CLIENT_ID, named 'MClientScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientScreenDbm.getInstance().columnClientId());
        return cri("M_CLIENT_SCREEN_FK1", "MClientScreenList", this, MClientScreenDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_CUSTOMER by CLIENT_ID, named 'MCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MCustomerDbm.getInstance().columnClientId());
        return cri("M_CUSTOMER_FK2", "MCustomerList", this, MCustomerDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_IMPORT_TYPE by CLIENT_ID, named 'MImportTypeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMImportTypeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MImportTypeDbm.getInstance().columnClientId());
        return cri("M_IMPORT_TYPE_FK2", "MImportTypeList", this, MImportTypeDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFINVOPERATION by CLIENT_ID, named 'MMfinvoperationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfinvoperationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfinvoperationDbm.getInstance().columnClientId());
        return cri("M_MFINVOPERATION_FK2", "MMfinvoperationList", this, MMfinvoperationDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFMONTHCHG by CLIENT_ID, named 'MMfmonthchgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfmonthchgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfmonthchgDbm.getInstance().columnClientId());
        return cri("M_MFMONTHCHG_FK1", "MMfmonthchgList", this, MMfmonthchgDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFPICKCTL by CLIENT_ID, named 'MMfpickctlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfpickctlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfpickctlDbm.getInstance().columnClientId());
        return cri("M_MFPICKCTL_FK1", "MMfpickctlList", this, MMfpickctlDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFRCVDESIGN by CLIENT_ID, named 'MMfrcvdesignList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfrcvdesignList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfrcvdesignDbm.getInstance().columnClientId());
        return cri("M_MFRCVDESIGN_FK1", "MMfrcvdesignList", this, MMfrcvdesignDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFRCVITEM by CLIENT_ID, named 'MMfrcvitemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfrcvitemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfrcvitemDbm.getInstance().columnClientId());
        return cri("M_MFRCVITEM_FK1", "MMfrcvitemList", this, MMfrcvitemDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_MFWHxITEM by CLIENT_ID, named 'MMfwhxitemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfwhxitemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MMfwhxitemDbm.getInstance().columnClientId());
        return cri("M_MFWHxITEM_FK3", "MMfwhxitemList", this, MMfwhxitemDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_PRODUCT by CLIENT_ID, named 'MProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MProductDbm.getInstance().columnClientId());
        return cri("M_PRODUCT_FK2", "MProductList", this, MProductDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_SHAPE_GRP by CLIENT_ID, named 'MShapeGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMShapeGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MShapeGrpDbm.getInstance().columnClientId());
        return cri("M_SHAPE_GRP_FK1", "MShapeGrpList", this, MShapeGrpDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_USER_CLIENT by CLIENT_ID, named 'MUserClientList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserClientList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MUserClientDbm.getInstance().columnClientId());
        return cri("M_USER_CLIENT_FK2", "MUserClientList", this, MUserClientDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_USER_LOGIN by CLIENT_ID, named 'MUserLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MUserLoginDbm.getInstance().columnClientId());
        return cri("M_USER_LOGIN_FK3", "MUserLoginList", this, MUserLoginDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * M_WEB_HT_INFO by CLIENT_ID, named 'MWebHtInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWebHtInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MWebHtInfoDbm.getInstance().columnClientId());
        return cri("M_WEB_HT_INFO_FK1", "MWebHtInfoList", this, MWebHtInfoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_ALLOC_INST_H by CLIENT_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TAllocInstHDbm.getInstance().columnClientId());
        return cri("T_ALLOC_INST_H_FK5", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_CCOPAM by CLIENT_ID, named 'TCcopamList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCcopamList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TCcopamDbm.getInstance().columnClientId());
        return cri("T_CCOPAM_FK2", "TCcopamList", this, TCcopamDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_CENTER_SYMBOL by CLIENT_ID, named 'TCenterSymbolList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCenterSymbolList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TCenterSymbolDbm.getInstance().columnClientId());
        return cri("T_CENTER_SYMBOL_FK5", "TCenterSymbolList", this, TCenterSymbolDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_CORDHDR by CLIENT_ID, named 'TCordhdrList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCordhdrList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TCordhdrDbm.getInstance().columnClientId());
        return cri("T_CORDHDR_FK1", "TCordhdrList", this, TCordhdrDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_EC_ORDER_H by CLIENT_ID, named 'TEcOrderHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TEcOrderHDbm.getInstance().columnClientId());
        return cri("T_EC_ORDER_H_FK3", "TEcOrderHList", this, TEcOrderHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_INVENTORY_H by CLIENT_ID, named 'TInventoryHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TInventoryHDbm.getInstance().columnClientId());
        return cri("T_INVENTORY_H_FK2", "TInventoryHList", this, TInventoryHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_MFLASTSHIPLOT by CLIENT_ID, named 'TMflastshiplotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMflastshiplotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TMflastshiplotDbm.getInstance().columnClientId());
        return cri("T_MFLASTSHIPLOT_FK2", "TMflastshiplotList", this, TMflastshiplotDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_MOVE_INST_H by CLIENT_ID, named 'TMoveInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TMoveInstHDbm.getInstance().columnClientId());
        return cri("T_MOVE_INST_H_FK3", "TMoveInstHList", this, TMoveInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_PACKING_H by CLIENT_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPackingHDbm.getInstance().columnClientId());
        return cri("T_PACKING_H_FK6", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_PALLET by CLIENT_ID, named 'TPalletList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPalletList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPalletDbm.getInstance().columnClientId());
        return cri("T_PALLET_FK4", "TPalletList", this, TPalletDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_PICKING_H by CLIENT_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPickingHDbm.getInstance().columnClientId());
        return cri("T_PICKING_H_FK4", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_PIC_MTHD_RCMD by CLIENT_ID, named 'TPicMthdRcmdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TPicMthdRcmdDbm.getInstance().columnClientId());
        return cri("T_PIC_MTHD_RCMD_FK1", "TPicMthdRcmdList", this, TPicMthdRcmdDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_RECEIVE_PLAN_H by CLIENT_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TReceivePlanHDbm.getInstance().columnClientId());
        return cri("T_RECEIVE_PLAN_H_FK6", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_SERIAL_NO by CLIENT_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TSerialNoDbm.getInstance().columnClientId());
        return cri("T_SERIAL_NO_FK3", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_SHIPPING_INST_H by CLIENT_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TShippingInstHDbm.getInstance().columnClientId());
        return cri("T_SHIPPING_INST_H_FK5", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_SPLINFO by CLIENT_ID, named 'TSplinfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSplinfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TSplinfoDbm.getInstance().columnClientId());
        return cri("T_SPLINFO_FK1", "TSplinfoList", this, TSplinfoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_STOCK by CLIENT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TStockDbm.getInstance().columnClientId());
        return cri("T_STOCK_FK5", "TStockList", this, TStockDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_STORE_RECORD_H by CLIENT_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TStoreRecordHDbm.getInstance().columnClientId());
        return cri("T_STORE_RECORD_H_FK3", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRALLINV by CLIENT_ID, named 'TTrallinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrallinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrallinvDbm.getInstance().columnClientId());
        return cri("T_TRALLINV_FK1", "TTrallinvList", this, TTrallinvDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRALLINVHISTORY by CLIENT_ID, named 'TTrallinvhistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrallinvhistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrallinvhistoryDbm.getInstance().columnClientId());
        return cri("T_TRALLINVHISTORY_FK1", "TTrallinvhistoryList", this, TTrallinvhistoryDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRCASEINVENTORY by CLIENT_ID, named 'TTrcaseinventoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcaseinventoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrcaseinventoryDbm.getInstance().columnClientId());
        return cri("T_TRCASEINVENTORY_FK1", "TTrcaseinventoryList", this, TTrcaseinventoryDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRCASENUM by CLIENT_ID, named 'TTrcasenumList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcasenumList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrcasenumDbm.getInstance().columnClientId());
        return cri("T_TRCASENUM_FK1", "TTrcasenumList", this, TTrcasenumDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRCASESTOCK by CLIENT_ID, named 'TTrcasestockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcasestockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrcasestockDbm.getInstance().columnClientId());
        return cri("T_TRCASESTOCK_FK2", "TTrcasestockList", this, TTrcasestockDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRHANBAIINV by CLIENT_ID, named 'TTrhanbaiinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrhanbaiinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrhanbaiinvDbm.getInstance().columnClientId());
        return cri("T_TRHANBAIINV_FK1", "TTrhanbaiinvList", this, TTrhanbaiinvDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRINVCHECKINFO by CLIENT_ID, named 'TTrinvcheckinfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvcheckinfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrinvcheckinfoDbm.getInstance().columnClientId());
        return cri("T_TRINVCHECKINFO_FK2", "TTrinvcheckinfoList", this, TTrinvcheckinfoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRINVCORRECT by CLIENT_ID, named 'TTrinvcorrectList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvcorrectList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrinvcorrectDbm.getInstance().columnClientId());
        return cri("T_TRINVCORRECT_FK2", "TTrinvcorrectList", this, TTrinvcorrectDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRINVREANSWER by CLIENT_ID, named 'TTrinvreanswerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvreanswerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrinvreanswerDbm.getInstance().columnClientId());
        return cri("T_TRINVREANSWER_FK2", "TTrinvreanswerList", this, TTrinvreanswerDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRINVREQUEST by CLIENT_ID, named 'TTrinvrequestList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvrequestList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrinvrequestDbm.getInstance().columnClientId());
        return cri("T_TRINVREQUEST_FK1", "TTrinvrequestList", this, TTrinvrequestDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRITEMCONVRESULT by CLIENT_ID, named 'TTritemconvresultList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTritemconvresultList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTritemconvresultDbm.getInstance().columnClientId());
        return cri("T_TRITEMCONVRESULT_FK2", "TTritemconvresultList", this, TTritemconvresultDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRJUKYUINV by CLIENT_ID, named 'TTrjukyuinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrjukyuinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrjukyuinvDbm.getInstance().columnClientId());
        return cri("T_TRJUKYUINV_FK1", "TTrjukyuinvList", this, TTrjukyuinvDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRMANUFACTUREDATE by CLIENT_ID, named 'TTrmanufacturedateList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedateList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrmanufacturedateDbm.getInstance().columnClientId());
        return cri("T_TRMANUFACTUREDATE_FK1", "TTrmanufacturedateList", this, TTrmanufacturedateDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRMANUFACTUREDATEDETAIL by CLIENT_ID, named 'TTrmanufacturedatedetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedatedetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrmanufacturedatedetailDbm.getInstance().columnClientId());
        return cri("T_TRMANUFACTUREDATEDETAIL_FK2", "TTrmanufacturedatedetailList", this, TTrmanufacturedatedetailDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRMANUFACTUREDATEHISTORY by CLIENT_ID, named 'TTrmanufacturedatehistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedatehistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrmanufacturedatehistoryDbm.getInstance().columnClientId());
        return cri("T_TRMANUFACTUREDATEHISTORY_FK1", "TTrmanufacturedatehistoryList", this, TTrmanufacturedatehistoryDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRPALLETTRACE by CLIENT_ID, named 'TTrpallettraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrpallettraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrpallettraceDbm.getInstance().columnClientId());
        return cri("T_TRPALLETTRACE_FK1", "TTrpallettraceList", this, TTrpallettraceDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRREVERSESTOCK by CLIENT_ID, named 'TTrreversestockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrreversestockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrreversestockDbm.getInstance().columnClientId());
        return cri("T_TRREVERSESTOCK_FK1", "TTrreversestockList", this, TTrreversestockDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRSTOCKDIFFHISTORY by CLIENT_ID, named 'TTrstockdiffhistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrstockdiffhistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrstockdiffhistoryDbm.getInstance().columnClientId());
        return cri("T_TRSTOCKDIFFHISTORY_FK2", "TTrstockdiffhistoryList", this, TTrstockdiffhistoryDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRSYMBOLTRACE by CLIENT_ID, named 'TTrsymboltraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrsymboltraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrsymboltraceDbm.getInstance().columnClientId());
        return cri("T_TRSYMBOLTRACE_FK2", "TTrsymboltraceList", this, TTrsymboltraceDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRSYMBOLTRACEEXTEND by CLIENT_ID, named 'TTrsymboltraceextendList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrsymboltraceextendList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrsymboltraceextendDbm.getInstance().columnClientId());
        return cri("T_TRSYMBOLTRACEEXTEND_FK2", "TTrsymboltraceextendList", this, TTrsymboltraceextendDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_TRTRACE by CLIENT_ID, named 'TTrtraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrtraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TTrtraceDbm.getInstance().columnClientId());
        return cri("T_TRTRACE_FK2", "TTrtraceList", this, TTrtraceDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * T_YTRSO by CLIENT_ID, named 'TYtrsoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTYtrsoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), TYtrsoDbm.getInstance().columnClientId());
        return cri("T_YTRSO_FK1", "TYtrsoList", this, TYtrsoDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtInventoryInputProdDbm.getInstance().columnClientId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK4", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_LOADING by CLIENT_ID, named 'WHtLoadingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtLoadingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtLoadingDbm.getInstance().columnClientId());
        return cri("W_HT_LOADING_FK3", "WHtLoadingList", this, WHtLoadingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveInspectionDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_INSPECTION_FK7", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveNoPlanInspDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK5", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_RECEIVE_STORE by CLIENT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtReceiveStoreDbm.getInstance().columnClientId());
        return cri("W_HT_RECEIVE_STORE_FK3", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_SERIAL_RECEIVE_INSP by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialReceiveInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtSerialReceiveInspDbm.getInstance().columnClientId());
        return cri("W_HT_SERIAL_RECEIVE_INSP_FK3", "WHtSerialReceiveInspList", this, WHtSerialReceiveInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_SERIAL_SHIPPING_INSP by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialShippingInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtSerialShippingInspDbm.getInstance().columnClientId());
        return cri("W_HT_SERIAL_SHIPPING_INSP_FK3", "WHtSerialShippingInspList", this, WHtSerialShippingInspDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_SHIPPING by CLIENT_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtShippingDbm.getInstance().columnClientId());
        return cri("W_HT_SHIPPING_FK1", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_HT_SHIPPING_PICKING by CLIENT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WHtShippingPickingDbm.getInstance().columnClientId());
        return cri("W_HT_SHIPPING_PICKING_FK1", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_SGL_ROW_SHIP_INSP_H by CLIENT_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WSglRowShipInspHDbm.getInstance().columnClientId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK3", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MClient");
    }
    /**
     * W_SHIPPING_INTERRUPT by CLIENT_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), WShippingInterruptDbm.getInstance().columnClientId());
        return cri("W_SHIPPING_INTERRUPT_FK2", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MClient");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MClient"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MClientCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MClientBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MClient> getEntityType() { return MClient.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MClient newEntity() { return new MClient(); }
    public MClient newMyEntity() { return new MClient(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MClient)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MClient)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
