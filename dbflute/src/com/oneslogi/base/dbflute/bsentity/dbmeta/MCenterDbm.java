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
 * The DB meta of M_CENTER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterDbm _instance = new MCenterDbm();
    private MCenterDbm() {}
    public static MCenterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterId(), (et, vl) -> ((MCenter)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterCd(), (et, vl) -> ((MCenter)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterNm(), (et, vl) -> ((MCenter)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterAbbr(), (et, vl) -> ((MCenter)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((MCenter)et).getCultureId(), (et, vl) -> ((MCenter)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((MCenter)et).getTimeZoneId(), (et, vl) -> ((MCenter)et).setTimeZoneId(ctl(vl)), "timeZoneId");
        setupEpg(_epgMap, et -> ((MCenter)et).getWarehousegroup(), (et, vl) -> ((MCenter)et).setWarehousegroup((String)vl), "warehousegroup");
        setupEpg(_epgMap, et -> ((MCenter)et).getVirtualwhouseflg(), (et, vl) -> ((MCenter)et).setVirtualwhouseflg((String)vl), "virtualwhouseflg");
        setupEpg(_epgMap, et -> ((MCenter)et).getAname(), (et, vl) -> ((MCenter)et).setAname((String)vl), "aname");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddress1(), (et, vl) -> ((MCenter)et).setAddress1((String)vl), "address1");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddress2(), (et, vl) -> ((MCenter)et).setAddress2((String)vl), "address2");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddress3(), (et, vl) -> ((MCenter)et).setAddress3((String)vl), "address3");
        setupEpg(_epgMap, et -> ((MCenter)et).getPostno(), (et, vl) -> ((MCenter)et).setPostno((String)vl), "postno");
        setupEpg(_epgMap, et -> ((MCenter)et).getCountrycd(), (et, vl) -> ((MCenter)et).setCountrycd((String)vl), "countrycd");
        setupEpg(_epgMap, et -> ((MCenter)et).getPortcd(), (et, vl) -> ((MCenter)et).setPortcd((String)vl), "portcd");
        setupEpg(_epgMap, et -> ((MCenter)et).getDistrictcd(), (et, vl) -> ((MCenter)et).setDistrictcd((String)vl), "districtcd");
        setupEpg(_epgMap, et -> ((MCenter)et).getPhone1(), (et, vl) -> ((MCenter)et).setPhone1((String)vl), "phone1");
        setupEpg(_epgMap, et -> ((MCenter)et).getPhone2(), (et, vl) -> ((MCenter)et).setPhone2((String)vl), "phone2");
        setupEpg(_epgMap, et -> ((MCenter)et).getFax1(), (et, vl) -> ((MCenter)et).setFax1((String)vl), "fax1");
        setupEpg(_epgMap, et -> ((MCenter)et).getFax2(), (et, vl) -> ((MCenter)et).setFax2((String)vl), "fax2");
        setupEpg(_epgMap, et -> ((MCenter)et).getWarehouseflg(), (et, vl) -> ((MCenter)et).setWarehouseflg((String)vl), "warehouseflg");
        setupEpg(_epgMap, et -> ((MCenter)et).getRefname(), (et, vl) -> ((MCenter)et).setRefname((String)vl), "refname");
        setupEpg(_epgMap, et -> ((MCenter)et).getSubcontractflg(), (et, vl) -> ((MCenter)et).setSubcontractflg(ctb(vl)), "subcontractflg");
        setupEpg(_epgMap, et -> ((MCenter)et).getWeightcapacity(), (et, vl) -> ((MCenter)et).setWeightcapacity(ctb(vl)), "weightcapacity");
        setupEpg(_epgMap, et -> ((MCenter)et).getCapacity(), (et, vl) -> ((MCenter)et).setCapacity(ctb(vl)), "capacity");
        setupEpg(_epgMap, et -> ((MCenter)et).getHulftId(), (et, vl) -> ((MCenter)et).setHulftId(ctl(vl)), "hulftId");
        setupEpg(_epgMap, et -> ((MCenter)et).getWarehousecls(), (et, vl) -> ((MCenter)et).setWarehousecls((String)vl), "warehousecls");
        setupEpg(_epgMap, et -> ((MCenter)et).getCmlrasid(), (et, vl) -> ((MCenter)et).setCmlrasid((String)vl), "cmlrasid");
        setupEpg(_epgMap, et -> ((MCenter)et).getOwnOrAnotherFlg(), (et, vl) -> ((MCenter)et).setOwnOrAnotherFlg((String)vl), "ownOrAnotherFlg");
        setupEpg(_epgMap, et -> ((MCenter)et).getDelFlg(), (et, vl) -> ((MCenter)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenter)et).getVersionNo(), (et, vl) -> ((MCenter)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenter)et).getControlNo(), (et, vl) -> ((MCenter)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddDt(), (et, vl) -> ((MCenter)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddUser(), (et, vl) -> ((MCenter)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddProcess(), (et, vl) -> ((MCenter)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdDt(), (et, vl) -> ((MCenter)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdUser(), (et, vl) -> ((MCenter)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdProcess(), (et, vl) -> ((MCenter)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBCulture(), (et, vl) -> ((MCenter)et).setBCulture((BCulture)vl), "BCulture");
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBTimeZone(), (et, vl) -> ((MCenter)et).setBTimeZone((BTimeZone)vl), "BTimeZone");
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCenter)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CENTER";
    protected final String _tableDispName = "M_CENTER";
    protected final String _tablePropertyName = "MCenter";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CENTER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MBoxList,MBoxGrpList,MCarrierList,MCarrierSlipSgwList,MCarrierSlipYmtList,MCarrierSlipYupkList,MCblkList,MCbrctgList,MCdrcattList,MCenterClassList,MCenterColList,MCenterCustomerList,MCenterItemList,MCenterScreenList,MClientCenterList,MClinList,MCorgList,MDeliveryCourseList,MLocationList,MMfinvoperationList,MMfmonthchgList,MMfstockitemList,MMfwhstrctList,MMfwhxitemList,MNumberingCenterList,MUserCenterList,MUserLoginList,MWarehouseList,MWebHtInfoList,TAllocInstHList,TCcopamList,TCenterSymbolList,TCordhdrList,TCsrwhadmList,TEcOrderHList,TInventoryHList,TMflastshiplotList,TMoveInstHList,TPackingHList,TPalletList,TPickingHList,TPicMthdRcmdList,TReceivePlanHList,TSerialNoList,TShippingInstHList,TSplinfoList,TStoreRecordHList,TTrallinvList,TTrallinvhistoryList,TTrcaseinventoryList,TTrcasenumList,TTrcasestockList,TTrhanbaiinvList,TTrinvcheckinfoList,TTrinvcorrectList,TTrinvreanswerList,TTrinvrequestList,TTritemconvresultList,TTrjukyuinvList,TTrmanufacturedateList,TTrmanufacturedatedetailList,TTrmanufacturedatehistoryList,TTrpallettraceList,TTrreversestockList,TTrstockdiffhistoryList,TTrsymboltraceList,TTrsymboltraceextendList,TTrtraceList,TYtrsoList,WHtInventoryInputProdList,WHtLoadingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtSerialReceiveInspList,WHtSerialShippingInspList,WHtShippingList,WHtShippingPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
    protected final ColumnInfo _columnTimeZoneId = cci("TIME_ZONE_ID", "TIME_ZONE_ID", null, null, Long.class, "timeZoneId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BTimeZone", null, null, false);
    protected final ColumnInfo _columnWarehousegroup = cci("WarehouseGroup", "WarehouseGroup", null, null, String.class, "warehousegroup", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVirtualwhouseflg = cci("VirtualWhouseFlg", "VirtualWhouseFlg", null, null, String.class, "virtualwhouseflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAname = cci("Aname", "Aname", null, null, String.class, "aname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress1 = cci("Address1", "Address1", null, null, String.class, "address1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress2 = cci("Address2", "Address2", null, null, String.class, "address2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress3 = cci("Address3", "Address3", null, null, String.class, "address3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostno = cci("PostNo", "PostNo", null, null, String.class, "postno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountrycd = cci("CountryCd", "CountryCd", null, null, String.class, "countrycd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPortcd = cci("PortCd", "PortCd", null, null, String.class, "portcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistrictcd = cci("DistrictCd", "DistrictCd", null, null, String.class, "districtcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone1 = cci("Phone1", "Phone1", null, null, String.class, "phone1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone2 = cci("Phone2", "Phone2", null, null, String.class, "phone2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax1 = cci("Fax1", "Fax1", null, null, String.class, "fax1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFax2 = cci("Fax2", "Fax2", null, null, String.class, "fax2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseflg = cci("WarehouseFlg", "WarehouseFlg", null, null, String.class, "warehouseflg", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefname = cci("RefName", "RefName", null, null, String.class, "refname", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubcontractflg = cci("SubcontractFlg", "SubcontractFlg", null, null, java.math.BigDecimal.class, "subcontractflg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWeightcapacity = cci("WeightCapacity", "WeightCapacity", null, null, java.math.BigDecimal.class, "weightcapacity", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapacity = cci("Capacity", "Capacity", null, null, java.math.BigDecimal.class, "capacity", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHulftId = cci("HULFT_ID", "HULFT_ID", null, null, Long.class, "hulftId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehousecls = cci("WarehouseCls", "WarehouseCls", null, null, String.class, "warehousecls", null, false, false, false, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmlrasid = cci("CMLRASID", "CMLRASID", null, null, String.class, "cmlrasid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnOrAnotherFlg = cci("OWN_OR_ANOTHER_FLG", "OWN_OR_ANOTHER_FLG", null, null, String.class, "ownOrAnotherFlg", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CENTER_ABBR: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
    /**
     * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneId() { return _columnTimeZoneId; }
    /**
     * WarehouseGroup: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousegroup() { return _columnWarehousegroup; }
    /**
     * VirtualWhouseFlg: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVirtualwhouseflg() { return _columnVirtualwhouseflg; }
    /**
     * Aname: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAname() { return _columnAname; }
    /**
     * Address1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress1() { return _columnAddress1; }
    /**
     * Address2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress2() { return _columnAddress2; }
    /**
     * Address3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress3() { return _columnAddress3; }
    /**
     * PostNo: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostno() { return _columnPostno; }
    /**
     * CountryCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountrycd() { return _columnCountrycd; }
    /**
     * PortCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPortcd() { return _columnPortcd; }
    /**
     * DistrictCd: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistrictcd() { return _columnDistrictcd; }
    /**
     * Phone1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone1() { return _columnPhone1; }
    /**
     * Phone2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone2() { return _columnPhone2; }
    /**
     * Fax1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax1() { return _columnFax1; }
    /**
     * Fax2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFax2() { return _columnFax2; }
    /**
     * WarehouseFlg: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseflg() { return _columnWarehouseflg; }
    /**
     * RefName: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefname() { return _columnRefname; }
    /**
     * SubcontractFlg: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubcontractflg() { return _columnSubcontractflg; }
    /**
     * WeightCapacity: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWeightcapacity() { return _columnWeightcapacity; }
    /**
     * Capacity: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapacity() { return _columnCapacity; }
    /**
     * HULFT_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHulftId() { return _columnHulftId; }
    /**
     * WarehouseCls: {char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehousecls() { return _columnWarehousecls; }
    /**
     * CMLRASID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmlrasid() { return _columnCmlrasid; }
    /**
     * OWN_OR_ANOTHER_FLG: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnOrAnotherFlg() { return _columnOwnOrAnotherFlg; }
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
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnCenterAbbr());
        ls.add(columnCultureId());
        ls.add(columnTimeZoneId());
        ls.add(columnWarehousegroup());
        ls.add(columnVirtualwhouseflg());
        ls.add(columnAname());
        ls.add(columnAddress1());
        ls.add(columnAddress2());
        ls.add(columnAddress3());
        ls.add(columnPostno());
        ls.add(columnCountrycd());
        ls.add(columnPortcd());
        ls.add(columnDistrictcd());
        ls.add(columnPhone1());
        ls.add(columnPhone2());
        ls.add(columnFax1());
        ls.add(columnFax2());
        ls.add(columnWarehouseflg());
        ls.add(columnRefname());
        ls.add(columnSubcontractflg());
        ls.add(columnWeightcapacity());
        ls.add(columnCapacity());
        ls.add(columnHulftId());
        ls.add(columnWarehousecls());
        ls.add(columnCmlrasid());
        ls.add(columnOwnOrAnotherFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnCenterCd()); }

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
        return cfi("M_CENTER_FK2", "BCulture", this, BCultureDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterList", false);
    }
    /**
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBTimeZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTimeZoneId(), BTimeZoneDbm.getInstance().columnTimeZoneId());
        return cfi("M_CENTER_FK1", "BTimeZone", this, BTimeZoneDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCenterList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CENTER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_BOX by CENTER_ID, named 'MBoxList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MBoxDbm.getInstance().columnCenterId());
        return cri("M_BOX_FK1", "MBoxList", this, MBoxDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MBoxGrpDbm.getInstance().columnCenterId());
        return cri("M_BOX_GRP_FK2", "MBoxGrpList", this, MBoxGrpDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CARRIER by CENTER_ID, named 'MCarrierList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_FK1", "MCarrierList", this, MCarrierDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipSgwList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipSgwDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_SGW_FK1", "MCarrierSlipSgwList", this, MCarrierSlipSgwDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipYmtList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipYmtDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_YMT_FK1", "MCarrierSlipYmtList", this, MCarrierSlipYmtDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipYupkList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipYupkDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_YUPK_FK1", "MCarrierSlipYupkList", this, MCarrierSlipYupkDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CBLK by CENTER_ID, named 'MCblkList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCblkList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCblkDbm.getInstance().columnCenterId());
        return cri("M_CBLK_FK1", "MCblkList", this, MCblkDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCbrctgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCbrctgDbm.getInstance().columnCenterId());
        return cri("M_CBRCTG_FK1", "MCbrctgList", this, MCbrctgDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCdrcattList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCdrcattDbm.getInstance().columnCenterId());
        return cri("M_CDRCATT_FK2", "MCdrcattList", this, MCdrcattDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterClassDbm.getInstance().columnCenterId());
        return cri("M_CENTER_CLASS_FK1", "MCenterClassList", this, MCenterClassDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterColDbm.getInstance().columnCenterId());
        return cri("M_CENTER_COL_FK3", "MCenterColList", this, MCenterColDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterCustomerDbm.getInstance().columnCenterId());
        return cri("M_CENTER_CUSTOMER_FK2", "MCenterCustomerList", this, MCenterCustomerDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterItemDbm.getInstance().columnCenterId());
        return cri("M_CENTER_ITEM_FK1", "MCenterItemList", this, MCenterItemDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterScreenDbm.getInstance().columnCenterId());
        return cri("M_CENTER_SCREEN_FK1", "MCenterScreenList", this, MCenterScreenDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MClientCenterDbm.getInstance().columnCenterId());
        return cri("M_CLIENT_CENTER_FK2", "MClientCenterList", this, MClientCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CLIN by CENTER_ID, named 'MClinList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClinList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MClinDbm.getInstance().columnCenterId());
        return cri("M_CLIN_FK1", "MClinList", this, MClinDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_CORG by CENTER_ID, named 'MCorgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCorgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCorgDbm.getInstance().columnCenterId());
        return cri("M_CORG_FK1", "MCorgList", this, MCorgDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MDeliveryCourseDbm.getInstance().columnCenterId());
        return cri("M_DELIVERY_COURSE_FK3", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_LOCATION by CENTER_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MLocationDbm.getInstance().columnCenterId());
        return cri("M_LOCATION_FK7", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfinvoperationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MMfinvoperationDbm.getInstance().columnCenterId());
        return cri("M_MFINVOPERATION_FK1", "MMfinvoperationList", this, MMfinvoperationDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfmonthchgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MMfmonthchgDbm.getInstance().columnCenterId());
        return cri("M_MFMONTHCHG_FK2", "MMfmonthchgList", this, MMfmonthchgDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfstockitemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MMfstockitemDbm.getInstance().columnCenterId());
        return cri("M_MFSTOCKITEM_FK1", "MMfstockitemList", this, MMfstockitemDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfwhstrctList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MMfwhstrctDbm.getInstance().columnCenterId());
        return cri("M_MFWHSTRCT_FK1", "MMfwhstrctList", this, MMfwhstrctDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMMfwhxitemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MMfwhxitemDbm.getInstance().columnCenterId());
        return cri("M_MFWHxITEM_FK2", "MMfwhxitemList", this, MMfwhxitemDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMNumberingCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MNumberingCenterDbm.getInstance().columnCenterId());
        return cri("M_NUMBERING_CENTER_FK1", "MNumberingCenterList", this, MNumberingCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MUserCenterDbm.getInstance().columnCenterId());
        return cri("M_USER_CENTER_FK2", "MUserCenterList", this, MUserCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MUserLoginDbm.getInstance().columnCenterId());
        return cri("M_USER_LOGIN_FK2", "MUserLoginList", this, MUserLoginDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWarehouseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MWarehouseDbm.getInstance().columnCenterId());
        return cri("M_WAREHOUSE_FK1", "MWarehouseList", this, MWarehouseDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWebHtInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MWebHtInfoDbm.getInstance().columnCenterId());
        return cri("M_WEB_HT_INFO_FK2", "MWebHtInfoList", this, MWebHtInfoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TAllocInstHDbm.getInstance().columnCenterId());
        return cri("T_ALLOC_INST_H_FK3", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_CCOPAM by CENTER_ID, named 'TCcopamList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCcopamList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TCcopamDbm.getInstance().columnCenterId());
        return cri("T_CCOPAM_FK1", "TCcopamList", this, TCcopamDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCenterSymbolList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TCenterSymbolDbm.getInstance().columnCenterId());
        return cri("T_CENTER_SYMBOL_FK1", "TCenterSymbolList", this, TCenterSymbolDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCordhdrList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TCordhdrDbm.getInstance().columnCenterId());
        return cri("T_CORDHDR_FK2", "TCordhdrList", this, TCordhdrDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTCsrwhadmList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TCsrwhadmDbm.getInstance().columnCenterId());
        return cri("T_CSRWHADM_FK1", "TCsrwhadmList", this, TCsrwhadmDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TEcOrderHDbm.getInstance().columnCenterId());
        return cri("T_EC_ORDER_H_FK1", "TEcOrderHList", this, TEcOrderHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TInventoryHDbm.getInstance().columnCenterId());
        return cri("T_INVENTORY_H_FK1", "TInventoryHList", this, TInventoryHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMflastshiplotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TMflastshiplotDbm.getInstance().columnCenterId());
        return cri("T_MFLASTSHIPLOT_FK1", "TMflastshiplotList", this, TMflastshiplotDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TMoveInstHDbm.getInstance().columnCenterId());
        return cri("T_MOVE_INST_H_FK2", "TMoveInstHList", this, TMoveInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_PACKING_H by CENTER_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPackingHDbm.getInstance().columnCenterId());
        return cri("T_PACKING_H_FK5", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_PALLET by CENTER_ID, named 'TPalletList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPalletList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPalletDbm.getInstance().columnCenterId());
        return cri("T_PALLET_FK2", "TPalletList", this, TPalletDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_PICKING_H by CENTER_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPickingHDbm.getInstance().columnCenterId());
        return cri("T_PICKING_H_FK1", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPicMthdRcmdDbm.getInstance().columnCenterId());
        return cri("T_PIC_MTHD_RCMD_FK2", "TPicMthdRcmdList", this, TPicMthdRcmdDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TReceivePlanHDbm.getInstance().columnCenterId());
        return cri("T_RECEIVE_PLAN_H_FK8", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TSerialNoDbm.getInstance().columnCenterId());
        return cri("T_SERIAL_NO_FK1", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TShippingInstHDbm.getInstance().columnCenterId());
        return cri("T_SHIPPING_INST_H_FK6", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSplinfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TSplinfoDbm.getInstance().columnCenterId());
        return cri("T_SPLINFO_FK2", "TSplinfoList", this, TSplinfoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TStoreRecordHDbm.getInstance().columnCenterId());
        return cri("T_STORE_RECORD_H_FK1", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrallinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrallinvDbm.getInstance().columnCenterId());
        return cri("T_TRALLINV_FK2", "TTrallinvList", this, TTrallinvDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrallinvhistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrallinvhistoryDbm.getInstance().columnCenterId());
        return cri("T_TRALLINVHISTORY_FK2", "TTrallinvhistoryList", this, TTrallinvhistoryDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcaseinventoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrcaseinventoryDbm.getInstance().columnCenterId());
        return cri("T_TRCASEINVENTORY_FK2", "TTrcaseinventoryList", this, TTrcaseinventoryDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcasenumList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrcasenumDbm.getInstance().columnCenterId());
        return cri("T_TRCASENUM_FK2", "TTrcasenumList", this, TTrcasenumDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrcasestockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrcasestockDbm.getInstance().columnCenterId());
        return cri("T_TRCASESTOCK_FK1", "TTrcasestockList", this, TTrcasestockDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrhanbaiinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrhanbaiinvDbm.getInstance().columnCenterId());
        return cri("T_TRHANBAIINV_FK2", "TTrhanbaiinvList", this, TTrhanbaiinvDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvcheckinfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrinvcheckinfoDbm.getInstance().columnCenterId());
        return cri("T_TRINVCHECKINFO_FK1", "TTrinvcheckinfoList", this, TTrinvcheckinfoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvcorrectList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrinvcorrectDbm.getInstance().columnCenterId());
        return cri("T_TRINVCORRECT_FK1", "TTrinvcorrectList", this, TTrinvcorrectDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvreanswerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrinvreanswerDbm.getInstance().columnCenterId());
        return cri("T_TRINVREANSWER_FK1", "TTrinvreanswerList", this, TTrinvreanswerDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrinvrequestList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrinvrequestDbm.getInstance().columnCenterId());
        return cri("T_TRINVREQUEST_FK2", "TTrinvrequestList", this, TTrinvrequestDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTritemconvresultList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTritemconvresultDbm.getInstance().columnCenterId());
        return cri("T_TRITEMCONVRESULT_FK1", "TTritemconvresultList", this, TTritemconvresultDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrjukyuinvList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrjukyuinvDbm.getInstance().columnCenterId());
        return cri("T_TRJUKYUINV_FK2", "TTrjukyuinvList", this, TTrjukyuinvDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedateList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrmanufacturedateDbm.getInstance().columnCenterId());
        return cri("T_TRMANUFACTUREDATE_FK2", "TTrmanufacturedateList", this, TTrmanufacturedateDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedatedetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrmanufacturedatedetailDbm.getInstance().columnCenterId());
        return cri("T_TRMANUFACTUREDATEDETAIL_FK1", "TTrmanufacturedatedetailList", this, TTrmanufacturedatedetailDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrmanufacturedatehistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrmanufacturedatehistoryDbm.getInstance().columnCenterId());
        return cri("T_TRMANUFACTUREDATEHISTORY_FK2", "TTrmanufacturedatehistoryList", this, TTrmanufacturedatehistoryDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrpallettraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrpallettraceDbm.getInstance().columnCenterId());
        return cri("T_TRPALLETTRACE_FK2", "TTrpallettraceList", this, TTrpallettraceDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrreversestockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrreversestockDbm.getInstance().columnCenterId());
        return cri("T_TRREVERSESTOCK_FK2", "TTrreversestockList", this, TTrreversestockDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrstockdiffhistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrstockdiffhistoryDbm.getInstance().columnCenterId());
        return cri("T_TRSTOCKDIFFHISTORY_FK1", "TTrstockdiffhistoryList", this, TTrstockdiffhistoryDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrsymboltraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrsymboltraceDbm.getInstance().columnCenterId());
        return cri("T_TRSYMBOLTRACE_FK1", "TTrsymboltraceList", this, TTrsymboltraceDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrsymboltraceextendList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrsymboltraceextendDbm.getInstance().columnCenterId());
        return cri("T_TRSYMBOLTRACEEXTEND_FK1", "TTrsymboltraceextendList", this, TTrsymboltraceextendDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTTrtraceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TTrtraceDbm.getInstance().columnCenterId());
        return cri("T_TRTRACE_FK1", "TTrtraceList", this, TTrtraceDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * T_YTRSO by CENTER_ID, named 'TYtrsoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTYtrsoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TYtrsoDbm.getInstance().columnCenterId());
        return cri("T_YTRSO_FK2", "TYtrsoList", this, TYtrsoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtInventoryInputProdDbm.getInstance().columnCenterId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK1", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtLoadingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtLoadingDbm.getInstance().columnCenterId());
        return cri("W_HT_LOADING_FK1", "WHtLoadingList", this, WHtLoadingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveInspectionDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_INSPECTION_FK5", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveNoPlanInspDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK4", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveStoreDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_STORE_FK7", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialReceiveInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtSerialReceiveInspDbm.getInstance().columnCenterId());
        return cri("W_HT_SERIAL_RECEIVE_INSP_FK1", "WHtSerialReceiveInspList", this, WHtSerialReceiveInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialShippingInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtSerialShippingInspDbm.getInstance().columnCenterId());
        return cri("W_HT_SERIAL_SHIPPING_INSP_FK1", "WHtSerialShippingInspList", this, WHtSerialShippingInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtShippingDbm.getInstance().columnCenterId());
        return cri("W_HT_SHIPPING_FK4", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtShippingPickingDbm.getInstance().columnCenterId());
        return cri("W_HT_SHIPPING_PICKING_FK2", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WSglRowShipInspHDbm.getInstance().columnCenterId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK4", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WShippingInterruptDbm.getInstance().columnCenterId());
        return cri("W_SHIPPING_INTERRUPT_FK1", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MCenter");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenter"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenter> getEntityType() { return MCenter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenter newEntity() { return new MCenter(); }
    public MCenter newMyEntity() { return new MCenter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
