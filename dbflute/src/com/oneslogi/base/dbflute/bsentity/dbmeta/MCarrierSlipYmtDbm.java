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
 * The DB meta of M_CARRIER_SLIP_YMT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYmtDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierSlipYmtDbm _instance = new MCarrierSlipYmtDbm();
    private MCarrierSlipYmtDbm() {}
    public static MCarrierSlipYmtDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getCarrierSlipYmtId(), (et, vl) -> ((MCarrierSlipYmt)et).setCarrierSlipYmtId(ctl(vl)), "carrierSlipYmtId");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getCenterId(), (et, vl) -> ((MCarrierSlipYmt)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getTagType(), (et, vl) -> ((MCarrierSlipYmt)et).setTagType((String)vl), "tagType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getTagNm(), (et, vl) -> ((MCarrierSlipYmt)et).setTagNm((String)vl), "tagNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getCharacterCd(), (et, vl) -> ((MCarrierSlipYmt)et).setCharacterCd((String)vl), "characterCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipType(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipType((String)vl), "slipType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getCoolCls(), (et, vl) -> ((MCarrierSlipYmt)et).setCoolCls((String)vl), "coolCls");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getHonorific(), (et, vl) -> ((MCarrierSlipYmt)et).setHonorific((String)vl), "honorific");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getPackingShowFlg(), (et, vl) -> ((MCarrierSlipYmt)et).setPackingShowFlg((String)vl), "packingShowFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientTelNo(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientTelNo((String)vl), "slipClientTelNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientZipCd(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientZipCd((String)vl), "slipClientZipCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientAddress1(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientAddress1((String)vl), "slipClientAddress1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientAddress2(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientAddress2((String)vl), "slipClientAddress2");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientAddress3(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientAddress3((String)vl), "slipClientAddress3");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientAddress4(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientAddress4((String)vl), "slipClientAddress4");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipClientNm(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipClientNm((String)vl), "slipClientNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipItemCd1(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipItemCd1((String)vl), "slipItemCd1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipItemNm1(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipItemCd2(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipItemCd2((String)vl), "slipItemCd2");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSlipItemNm2(), (et, vl) -> ((MCarrierSlipYmt)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getFreightHandling1(), (et, vl) -> ((MCarrierSlipYmt)et).setFreightHandling1((String)vl), "freightHandling1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getFreightHandling2(), (et, vl) -> ((MCarrierSlipYmt)et).setFreightHandling2((String)vl), "freightHandling2");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getArticle(), (et, vl) -> ((MCarrierSlipYmt)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getBillingCustomerCd(), (et, vl) -> ((MCarrierSlipYmt)et).setBillingCustomerCd((String)vl), "billingCustomerCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getFareNo(), (et, vl) -> ((MCarrierSlipYmt)et).setFareNo((String)vl), "fareNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getSendCd(), (et, vl) -> ((MCarrierSlipYmt)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getDelFlg(), (et, vl) -> ((MCarrierSlipYmt)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getVersionNo(), (et, vl) -> ((MCarrierSlipYmt)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getControlNo(), (et, vl) -> ((MCarrierSlipYmt)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getAddDt(), (et, vl) -> ((MCarrierSlipYmt)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getAddUser(), (et, vl) -> ((MCarrierSlipYmt)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getAddProcess(), (et, vl) -> ((MCarrierSlipYmt)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getUpdDt(), (et, vl) -> ((MCarrierSlipYmt)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getUpdUser(), (et, vl) -> ((MCarrierSlipYmt)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipYmt)et).getUpdProcess(), (et, vl) -> ((MCarrierSlipYmt)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getMCenter(), (et, vl) -> ((MCarrierSlipYmt)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getBClassDtlByCharacterCd(), (et, vl) -> ((MCarrierSlipYmt)et).setBClassDtlByCharacterCd((BClassDtl)vl), "BClassDtlByCharacterCd");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getBClassDtlByCoolCls(), (et, vl) -> ((MCarrierSlipYmt)et).setBClassDtlByCoolCls((BClassDtl)vl), "BClassDtlByCoolCls");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCarrierSlipYmt)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getBClassDtlByPackingShowFlg(), (et, vl) -> ((MCarrierSlipYmt)et).setBClassDtlByPackingShowFlg((BClassDtl)vl), "BClassDtlByPackingShowFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYmt)et).getBClassDtlBySlipType(), (et, vl) -> ((MCarrierSlipYmt)et).setBClassDtlBySlipType((BClassDtl)vl), "BClassDtlBySlipType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CARRIER_SLIP_YMT";
    protected final String _tableDispName = "M_CARRIER_SLIP_YMT";
    protected final String _tablePropertyName = "MCarrierSlipYmt";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CARRIER_SLIP_YMT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierSlipYmtId = cci("CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", null, null, Long.class, "carrierSlipYmtId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MDeliveryCourseList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnTagType = cci("TAG_TYPE", "TAG_TYPE", null, null, String.class, "tagType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNm = cci("TAG_NM", "TAG_NM", null, null, String.class, "tagNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacterCd = cci("CHARACTER_CD", "CHARACTER_CD", null, null, String.class, "characterCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCharacterCd", null, CDef.DefMeta.CharacterCd, false);
    protected final ColumnInfo _columnSlipType = cci("SLIP_TYPE", "SLIP_TYPE", null, null, String.class, "slipType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySlipType", null, CDef.DefMeta.SlipType, false);
    protected final ColumnInfo _columnCoolCls = cci("COOL_CLS", "COOL_CLS", null, null, String.class, "coolCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCoolCls", null, CDef.DefMeta.CoolCls, false);
    protected final ColumnInfo _columnHonorific = cci("HONORIFIC", "HONORIFIC", null, null, String.class, "honorific", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingShowFlg = cci("PACKING_SHOW_FLG", "PACKING_SHOW_FLG", null, null, String.class, "packingShowFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPackingShowFlg", null, CDef.DefMeta.PackingShowFlg, false);
    protected final ColumnInfo _columnSlipClientTelNo = cci("SLIP_CLIENT_TEL_NO", "SLIP_CLIENT_TEL_NO", null, null, String.class, "slipClientTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientZipCd = cci("SLIP_CLIENT_ZIP_CD", "SLIP_CLIENT_ZIP_CD", null, null, String.class, "slipClientZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress1 = cci("SLIP_CLIENT_ADDRESS1", "SLIP_CLIENT_ADDRESS1", null, null, String.class, "slipClientAddress1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress2 = cci("SLIP_CLIENT_ADDRESS2", "SLIP_CLIENT_ADDRESS2", null, null, String.class, "slipClientAddress2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress3 = cci("SLIP_CLIENT_ADDRESS3", "SLIP_CLIENT_ADDRESS3", null, null, String.class, "slipClientAddress3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress4 = cci("SLIP_CLIENT_ADDRESS4", "SLIP_CLIENT_ADDRESS4", null, null, String.class, "slipClientAddress4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm = cci("SLIP_CLIENT_NM", "SLIP_CLIENT_NM", null, null, String.class, "slipClientNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd1 = cci("SLIP_ITEM_CD1", "SLIP_ITEM_CD1", null, null, String.class, "slipItemCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm1 = cci("SLIP_ITEM_NM1", "SLIP_ITEM_NM1", null, null, String.class, "slipItemNm1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd2 = cci("SLIP_ITEM_CD2", "SLIP_ITEM_CD2", null, null, String.class, "slipItemCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm2 = cci("SLIP_ITEM_NM2", "SLIP_ITEM_NM2", null, null, String.class, "slipItemNm2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling1 = cci("FREIGHT_HANDLING1", "FREIGHT_HANDLING1", null, null, String.class, "freightHandling1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling2 = cci("FREIGHT_HANDLING2", "FREIGHT_HANDLING2", null, null, String.class, "freightHandling2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticle = cci("ARTICLE", "ARTICLE", null, null, String.class, "article", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBillingCustomerCd = cci("BILLING_CUSTOMER_CD", "BILLING_CUSTOMER_CD", null, null, String.class, "billingCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFareNo = cci("FARE_NO", "FARE_NO", null, null, String.class, "fareNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipYmtId() { return _columnCarrierSlipYmtId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * TAG_TYPE: {+UQ, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagType() { return _columnTagType; }
    /**
     * TAG_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagNm() { return _columnTagNm; }
    /**
     * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacterCd() { return _columnCharacterCd; }
    /**
     * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipType() { return _columnSlipType; }
    /**
     * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCoolCls() { return _columnCoolCls; }
    /**
     * HONORIFIC: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHonorific() { return _columnHonorific; }
    /**
     * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingShowFlg() { return _columnPackingShowFlg; }
    /**
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientTelNo() { return _columnSlipClientTelNo; }
    /**
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientZipCd() { return _columnSlipClientZipCd; }
    /**
     * SLIP_CLIENT_ADDRESS1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress1() { return _columnSlipClientAddress1; }
    /**
     * SLIP_CLIENT_ADDRESS2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress2() { return _columnSlipClientAddress2; }
    /**
     * SLIP_CLIENT_ADDRESS3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress3() { return _columnSlipClientAddress3; }
    /**
     * SLIP_CLIENT_ADDRESS4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress4() { return _columnSlipClientAddress4; }
    /**
     * SLIP_CLIENT_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm() { return _columnSlipClientNm; }
    /**
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd1() { return _columnSlipItemCd1; }
    /**
     * SLIP_ITEM_NM1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm1() { return _columnSlipItemNm1; }
    /**
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd2() { return _columnSlipItemCd2; }
    /**
     * SLIP_ITEM_NM2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm2() { return _columnSlipItemNm2; }
    /**
     * FREIGHT_HANDLING1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling1() { return _columnFreightHandling1; }
    /**
     * FREIGHT_HANDLING2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling2() { return _columnFreightHandling2; }
    /**
     * ARTICLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticle() { return _columnArticle; }
    /**
     * BILLING_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBillingCustomerCd() { return _columnBillingCustomerCd; }
    /**
     * FARE_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFareNo() { return _columnFareNo; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
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
        ls.add(columnCarrierSlipYmtId());
        ls.add(columnCenterId());
        ls.add(columnTagType());
        ls.add(columnTagNm());
        ls.add(columnCharacterCd());
        ls.add(columnSlipType());
        ls.add(columnCoolCls());
        ls.add(columnHonorific());
        ls.add(columnPackingShowFlg());
        ls.add(columnSlipClientTelNo());
        ls.add(columnSlipClientZipCd());
        ls.add(columnSlipClientAddress1());
        ls.add(columnSlipClientAddress2());
        ls.add(columnSlipClientAddress3());
        ls.add(columnSlipClientAddress4());
        ls.add(columnSlipClientNm());
        ls.add(columnSlipItemCd1());
        ls.add(columnSlipItemNm1());
        ls.add(columnSlipItemCd2());
        ls.add(columnSlipItemNm2());
        ls.add(columnFreightHandling1());
        ls.add(columnFreightHandling2());
        ls.add(columnArticle());
        ls.add(columnBillingCustomerCd());
        ls.add(columnFareNo());
        ls.add(columnSendCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierSlipYmtId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnTagType());
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
        return cfi("M_CARRIER_SLIP_YMT_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCarrierSlipYmtList", false);
    }
    /**
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCharacterCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharacterCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YMT_CHARACTER_CD", "BClassDtlByCharacterCd", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CHARACTER_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCoolCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCoolCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YMT_COOL_CLS", "BClassDtlByCoolCls", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COOL_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YMT_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingShowFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingShowFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YMT_PACKING_SHOW_FLG", "BClassDtlByPackingShowFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PACKING_SHOW_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySlipType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YMT_SLIP_TYPE", "BClassDtlBySlipType", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SLIP_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipYmtId(), MDeliveryCourseDbm.getInstance().columnCarrierSlipYmtId());
        return cri("M_DELIVERY_COURSE_FK5", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCarrierSlipYmt");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrierSlipYmt> getEntityType() { return MCarrierSlipYmt.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrierSlipYmt newEntity() { return new MCarrierSlipYmt(); }
    public MCarrierSlipYmt newMyEntity() { return new MCarrierSlipYmt(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrierSlipYmt)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrierSlipYmt)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
