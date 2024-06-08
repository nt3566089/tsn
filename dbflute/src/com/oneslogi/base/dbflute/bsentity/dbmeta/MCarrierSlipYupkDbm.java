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
 * The DB meta of M_CARRIER_SLIP_YUPK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYupkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierSlipYupkDbm _instance = new MCarrierSlipYupkDbm();
    private MCarrierSlipYupkDbm() {}
    public static MCarrierSlipYupkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCarrierSlipYupkId(), (et, vl) -> ((MCarrierSlipYupk)et).setCarrierSlipYupkId(ctl(vl)), "carrierSlipYupkId");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCenterId(), (et, vl) -> ((MCarrierSlipYupk)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getTagType(), (et, vl) -> ((MCarrierSlipYupk)et).setTagType((String)vl), "tagType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getTagNm(), (et, vl) -> ((MCarrierSlipYupk)et).setTagNm((String)vl), "tagNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCharacterCd(), (et, vl) -> ((MCarrierSlipYupk)et).setCharacterCd((String)vl), "characterCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getPostType(), (et, vl) -> ((MCarrierSlipYupk)et).setPostType((String)vl), "postType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCoolType(), (et, vl) -> ((MCarrierSlipYupk)et).setCoolType((String)vl), "coolType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCodType(), (et, vl) -> ((MCarrierSlipYupk)et).setCodType((String)vl), "codType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getCarrierType(), (et, vl) -> ((MCarrierSlipYupk)et).setCarrierType((String)vl), "carrierType");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientZipCd(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientZipCd((String)vl), "slipClientZipCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientAddress1(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientAddress1((String)vl), "slipClientAddress1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientAddress2(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientAddress2((String)vl), "slipClientAddress2");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientAddress3(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientAddress3((String)vl), "slipClientAddress3");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientNm1(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientNm1((String)vl), "slipClientNm1");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientTelNo(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientTelNo((String)vl), "slipClientTelNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipClientMail(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipClientMail((String)vl), "slipClientMail");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getNoUpsideDownCls(), (et, vl) -> ((MCarrierSlipYupk)et).setNoUpsideDownCls((String)vl), "noUpsideDownCls");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getNoStockCls(), (et, vl) -> ((MCarrierSlipYupk)et).setNoStockCls((String)vl), "noStockCls");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipProductSizeCls(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipProductSizeCls((String)vl), "slipProductSizeCls");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipProductNo(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipProductNo((String)vl), "slipProductNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSlipItemNm(), (et, vl) -> ((MCarrierSlipYupk)et).setSlipItemNm((String)vl), "slipItemNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getShipReserveDataMark(), (et, vl) -> ((MCarrierSlipYupk)et).setShipReserveDataMark((String)vl), "shipReserveDataMark");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getDeliCertPreYears(), (et, vl) -> ((MCarrierSlipYupk)et).setDeliCertPreYears(ctl(vl)), "deliCertPreYears");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getSendNm(), (et, vl) -> ((MCarrierSlipYupk)et).setSendNm((String)vl), "sendNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getProductTypeCode(), (et, vl) -> ((MCarrierSlipYupk)et).setProductTypeCode((String)vl), "productTypeCode");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getPostBizCardCustomerNo(), (et, vl) -> ((MCarrierSlipYupk)et).setPostBizCardCustomerNo((String)vl), "postBizCardCustomerNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getShippingCompanyCode(), (et, vl) -> ((MCarrierSlipYupk)et).setShippingCompanyCode((String)vl), "shippingCompanyCode");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getShipmentCode(), (et, vl) -> ((MCarrierSlipYupk)et).setShipmentCode((String)vl), "shipmentCode");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getDelFlg(), (et, vl) -> ((MCarrierSlipYupk)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getVersionNo(), (et, vl) -> ((MCarrierSlipYupk)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getControlNo(), (et, vl) -> ((MCarrierSlipYupk)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getAddDt(), (et, vl) -> ((MCarrierSlipYupk)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getAddUser(), (et, vl) -> ((MCarrierSlipYupk)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getAddProcess(), (et, vl) -> ((MCarrierSlipYupk)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getUpdDt(), (et, vl) -> ((MCarrierSlipYupk)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getUpdUser(), (et, vl) -> ((MCarrierSlipYupk)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipYupk)et).getUpdProcess(), (et, vl) -> ((MCarrierSlipYupk)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getMCenter(), (et, vl) -> ((MCarrierSlipYupk)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByCharacterCd(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByCharacterCd((BClassDtl)vl), "BClassDtlByCharacterCd");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByCodType(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByCodType((BClassDtl)vl), "BClassDtlByCodType");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByCoolType(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByCoolType((BClassDtl)vl), "BClassDtlByCoolType");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByNoStockCls(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByNoStockCls((BClassDtl)vl), "BClassDtlByNoStockCls");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByNoUpsideDownCls(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByNoUpsideDownCls((BClassDtl)vl), "BClassDtlByNoUpsideDownCls");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipYupk)et).getBClassDtlByPostType(), (et, vl) -> ((MCarrierSlipYupk)et).setBClassDtlByPostType((BClassDtl)vl), "BClassDtlByPostType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CARRIER_SLIP_YUPK";
    protected final String _tableDispName = "M_CARRIER_SLIP_YUPK";
    protected final String _tablePropertyName = "MCarrierSlipYupk";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CARRIER_SLIP_YUPK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierSlipYupkId = cci("CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", null, null, Long.class, "carrierSlipYupkId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MDeliveryCourseList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnTagType = cci("TAG_TYPE", "TAG_TYPE", null, null, String.class, "tagType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNm = cci("TAG_NM", "TAG_NM", null, null, String.class, "tagNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacterCd = cci("CHARACTER_CD", "CHARACTER_CD", null, null, String.class, "characterCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCharacterCd", null, CDef.DefMeta.CharacterCd, false);
    protected final ColumnInfo _columnPostType = cci("POST_TYPE", "POST_TYPE", null, null, String.class, "postType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByPostType", null, CDef.DefMeta.PostType, false);
    protected final ColumnInfo _columnCoolType = cci("COOL_TYPE", "COOL_TYPE", null, null, String.class, "coolType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCoolType", null, CDef.DefMeta.CoolType, false);
    protected final ColumnInfo _columnCodType = cci("COD_TYPE", "COD_TYPE", null, null, String.class, "codType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCodType", null, CDef.DefMeta.CodType, false);
    protected final ColumnInfo _columnCarrierType = cci("CARRIER_TYPE", "CARRIER_TYPE", null, null, String.class, "carrierType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientZipCd = cci("SLIP_CLIENT_ZIP_CD", "SLIP_CLIENT_ZIP_CD", null, null, String.class, "slipClientZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress1 = cci("SLIP_CLIENT_ADDRESS1", "SLIP_CLIENT_ADDRESS1", null, null, String.class, "slipClientAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress2 = cci("SLIP_CLIENT_ADDRESS2", "SLIP_CLIENT_ADDRESS2", null, null, String.class, "slipClientAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress3 = cci("SLIP_CLIENT_ADDRESS3", "SLIP_CLIENT_ADDRESS3", null, null, String.class, "slipClientAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm1 = cci("SLIP_CLIENT_NM1", "SLIP_CLIENT_NM1", null, null, String.class, "slipClientNm1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientTelNo = cci("SLIP_CLIENT_TEL_NO", "SLIP_CLIENT_TEL_NO", null, null, String.class, "slipClientTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientMail = cci("SLIP_CLIENT_MAIL", "SLIP_CLIENT_MAIL", null, null, String.class, "slipClientMail", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoUpsideDownCls = cci("NO_UPSIDE_DOWN_CLS", "NO_UPSIDE_DOWN_CLS", null, null, String.class, "noUpsideDownCls", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByNoUpsideDownCls", null, CDef.DefMeta.NoUpsideDownCls, false);
    protected final ColumnInfo _columnNoStockCls = cci("NO_STOCK_CLS", "NO_STOCK_CLS", null, null, String.class, "noStockCls", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByNoStockCls", null, CDef.DefMeta.NoStockCls, false);
    protected final ColumnInfo _columnSlipProductSizeCls = cci("SLIP_PRODUCT_SIZE_CLS", "SLIP_PRODUCT_SIZE_CLS", null, null, String.class, "slipProductSizeCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipProductNo = cci("SLIP_PRODUCT_NO", "SLIP_PRODUCT_NO", null, null, String.class, "slipProductNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm = cci("SLIP_ITEM_NM", "SLIP_ITEM_NM", null, null, String.class, "slipItemNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipReserveDataMark = cci("SHIP_RESERVE_DATA_MARK", "SHIP_RESERVE_DATA_MARK", null, null, String.class, "shipReserveDataMark", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliCertPreYears = cci("DELI_CERT_PRE_YEARS", "DELI_CERT_PRE_YEARS", null, null, Long.class, "deliCertPreYears", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendNm = cci("SEND_NM", "SEND_NM", null, null, String.class, "sendNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductTypeCode = cci("PRODUCT_TYPE_CODE", "PRODUCT_TYPE_CODE", null, null, String.class, "productTypeCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostBizCardCustomerNo = cci("POST_BIZ_CARD_CUSTOMER_NO", "POST_BIZ_CARD_CUSTOMER_NO", null, null, String.class, "postBizCardCustomerNo", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingCompanyCode = cci("SHIPPING_COMPANY_CODE", "SHIPPING_COMPANY_CODE", null, null, String.class, "shippingCompanyCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShipmentCode = cci("SHIPMENT_CODE", "SHIPMENT_CODE", null, null, String.class, "shipmentCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipYupkId() { return _columnCarrierSlipYupkId; }
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
     * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostType() { return _columnPostType; }
    /**
     * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCoolType() { return _columnCoolType; }
    /**
     * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodType() { return _columnCodType; }
    /**
     * CARRIER_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierType() { return _columnCarrierType; }
    /**
     * SLIP_CLIENT_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientZipCd() { return _columnSlipClientZipCd; }
    /**
     * SLIP_CLIENT_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress1() { return _columnSlipClientAddress1; }
    /**
     * SLIP_CLIENT_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress2() { return _columnSlipClientAddress2; }
    /**
     * SLIP_CLIENT_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress3() { return _columnSlipClientAddress3; }
    /**
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm1() { return _columnSlipClientNm1; }
    /**
     * SLIP_CLIENT_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientTelNo() { return _columnSlipClientTelNo; }
    /**
     * SLIP_CLIENT_MAIL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientMail() { return _columnSlipClientMail; }
    /**
     * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoUpsideDownCls() { return _columnNoUpsideDownCls; }
    /**
     * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoStockCls() { return _columnNoStockCls; }
    /**
     * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipProductSizeCls() { return _columnSlipProductSizeCls; }
    /**
     * SLIP_PRODUCT_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipProductNo() { return _columnSlipProductNo; }
    /**
     * SLIP_ITEM_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm() { return _columnSlipItemNm; }
    /**
     * SHIP_RESERVE_DATA_MARK: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipReserveDataMark() { return _columnShipReserveDataMark; }
    /**
     * DELI_CERT_PRE_YEARS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliCertPreYears() { return _columnDeliCertPreYears; }
    /**
     * SEND_NM: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendNm() { return _columnSendNm; }
    /**
     * PRODUCT_TYPE_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductTypeCode() { return _columnProductTypeCode; }
    /**
     * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostBizCardCustomerNo() { return _columnPostBizCardCustomerNo; }
    /**
     * SHIPPING_COMPANY_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingCompanyCode() { return _columnShippingCompanyCode; }
    /**
     * SHIPMENT_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShipmentCode() { return _columnShipmentCode; }
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
        ls.add(columnCarrierSlipYupkId());
        ls.add(columnCenterId());
        ls.add(columnTagType());
        ls.add(columnTagNm());
        ls.add(columnCharacterCd());
        ls.add(columnPostType());
        ls.add(columnCoolType());
        ls.add(columnCodType());
        ls.add(columnCarrierType());
        ls.add(columnSlipClientZipCd());
        ls.add(columnSlipClientAddress1());
        ls.add(columnSlipClientAddress2());
        ls.add(columnSlipClientAddress3());
        ls.add(columnSlipClientNm1());
        ls.add(columnSlipClientTelNo());
        ls.add(columnSlipClientMail());
        ls.add(columnNoUpsideDownCls());
        ls.add(columnNoStockCls());
        ls.add(columnSlipProductSizeCls());
        ls.add(columnSlipProductNo());
        ls.add(columnSlipItemNm());
        ls.add(columnShipReserveDataMark());
        ls.add(columnDeliCertPreYears());
        ls.add(columnSendNm());
        ls.add(columnProductTypeCode());
        ls.add(columnPostBizCardCustomerNo());
        ls.add(columnShippingCompanyCode());
        ls.add(columnShipmentCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierSlipYupkId()); }
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
        return cfi("M_CARRIER_SLIP_YUPK_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCarrierSlipYupkList", false);
    }
    /**
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCharacterCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharacterCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_CHARACTER_CD", "BClassDtlByCharacterCd", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CHARACTER_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCodType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCodType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_COD_TYPE", "BClassDtlByCodType", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COD_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCoolType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCoolType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_COOL_TYPE", "BClassDtlByCoolType", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COOL_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByNoStockCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNoStockCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_NO_STOCK_CLS", "BClassDtlByNoStockCls", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'NO_STOCK_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByNoUpsideDownCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNoUpsideDownCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_NO_UPSIDE_DOWN_CLS", "BClassDtlByNoUpsideDownCls", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'NO_UPSIDE_DOWN_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPostType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPostType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_YUPK_POST_TYPE", "BClassDtlByPostType", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'POST_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipYupkId(), MDeliveryCourseDbm.getInstance().columnCarrierSlipYupkId());
        return cri("M_DELIVERY_COURSE_FK4", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCarrierSlipYupk");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrierSlipYupk> getEntityType() { return MCarrierSlipYupk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrierSlipYupk newEntity() { return new MCarrierSlipYupk(); }
    public MCarrierSlipYupk newMyEntity() { return new MCarrierSlipYupk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrierSlipYupk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrierSlipYupk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
