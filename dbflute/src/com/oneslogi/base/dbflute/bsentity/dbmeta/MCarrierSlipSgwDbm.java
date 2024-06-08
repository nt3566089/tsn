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
 * The DB meta of M_CARRIER_SLIP_SGW. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipSgwDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierSlipSgwDbm _instance = new MCarrierSlipSgwDbm();
    private MCarrierSlipSgwDbm() {}
    public static MCarrierSlipSgwDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getCarrierSlipSgwId(), (et, vl) -> ((MCarrierSlipSgw)et).setCarrierSlipSgwId(ctl(vl)), "carrierSlipSgwId");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getCenterId(), (et, vl) -> ((MCarrierSlipSgw)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getTagType(), (et, vl) -> ((MCarrierSlipSgw)et).setTagType((String)vl), "tagType");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getTagNm(), (et, vl) -> ((MCarrierSlipSgw)et).setTagNm((String)vl), "tagNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getCharacterCd(), (et, vl) -> ((MCarrierSlipSgw)et).setCharacterCd((String)vl), "characterCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipCustomerCd(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipCustomerCd((String)vl), "slipCustomerCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getWebApiRequestUrl(), (et, vl) -> ((MCarrierSlipSgw)et).setWebApiRequestUrl((String)vl), "webApiRequestUrl");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getCustomerId(), (et, vl) -> ((MCarrierSlipSgw)et).setCustomerId((String)vl), "customerId");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getLoginPassword(), (et, vl) -> ((MCarrierSlipSgw)et).setLoginPassword((String)vl), "loginPassword");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getDeptConsignorNm(), (et, vl) -> ((MCarrierSlipSgw)et).setDeptConsignorNm((String)vl), "deptConsignorNm");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getConsignorTelNo(), (et, vl) -> ((MCarrierSlipSgw)et).setConsignorTelNo((String)vl), "consignorTelNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientTelNo(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientTelNo((String)vl), "slipClientTelNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientZipCd(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientZipCd((String)vl), "slipClientZipCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientAddress1(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientAddress1((String)vl), "slipClientAddress1");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientAddress2(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientAddress2((String)vl), "slipClientAddress2");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientNm1(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientNm1((String)vl), "slipClientNm1");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipClientNm2(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipClientNm2((String)vl), "slipClientNm2");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipShapeCd(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipShapeCd((String)vl), "slipShapeCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipItemNm1(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipItemNm2(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipItemNm3(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipItemNm3((String)vl), "slipItemNm3");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipItemNm4(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipItemNm4((String)vl), "slipItemNm4");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSlipItemNm5(), (et, vl) -> ((MCarrierSlipSgw)et).setSlipItemNm5((String)vl), "slipItemNm5");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getTransportTypeSpeed(), (et, vl) -> ((MCarrierSlipSgw)et).setTransportTypeSpeed((String)vl), "transportTypeSpeed");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getTransportTypeItem(), (et, vl) -> ((MCarrierSlipSgw)et).setTransportTypeItem((String)vl), "transportTypeItem");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSettlementType(), (et, vl) -> ((MCarrierSlipSgw)et).setSettlementType((String)vl), "settlementType");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSealType1(), (et, vl) -> ((MCarrierSlipSgw)et).setSealType1((String)vl), "sealType1");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSealType2(), (et, vl) -> ((MCarrierSlipSgw)et).setSealType2((String)vl), "sealType2");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSealType3(), (et, vl) -> ((MCarrierSlipSgw)et).setSealType3((String)vl), "sealType3");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getCodCls(), (et, vl) -> ((MCarrierSlipSgw)et).setCodCls((String)vl), "codCls");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getSendCd(), (et, vl) -> ((MCarrierSlipSgw)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiOkuriCode(), (et, vl) -> ((MCarrierSlipSgw)et).setApiOkuriCode((String)vl), "apiOkuriCode");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiBinsyuCode(), (et, vl) -> ((MCarrierSlipSgw)et).setApiBinsyuCode((String)vl), "apiBinsyuCode");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiDaibikiFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setApiDaibikiFlg((String)vl), "apiDaibikiFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiDaibikiType(), (et, vl) -> ((MCarrierSlipSgw)et).setApiDaibikiType((String)vl), "apiDaibikiType");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiWeightCd1(), (et, vl) -> ((MCarrierSlipSgw)et).setApiWeightCd1((String)vl), "apiWeightCd1");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiWeightCd2(), (et, vl) -> ((MCarrierSlipSgw)et).setApiWeightCd2((String)vl), "apiWeightCd2");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getApiEidomeFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setApiEidomeFlg((String)vl), "apiEidomeFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getDelFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getVersionNo(), (et, vl) -> ((MCarrierSlipSgw)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getControlNo(), (et, vl) -> ((MCarrierSlipSgw)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getAddDt(), (et, vl) -> ((MCarrierSlipSgw)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getAddUser(), (et, vl) -> ((MCarrierSlipSgw)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getAddProcess(), (et, vl) -> ((MCarrierSlipSgw)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getUpdDt(), (et, vl) -> ((MCarrierSlipSgw)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getUpdUser(), (et, vl) -> ((MCarrierSlipSgw)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrierSlipSgw)et).getUpdProcess(), (et, vl) -> ((MCarrierSlipSgw)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenter(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiBinsyuCode(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiBinsyuCode((MCenterClassDtl)vl), "MCenterClassDtlByApiBinsyuCode");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiDaibikiFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiDaibikiFlg((MCenterClassDtl)vl), "MCenterClassDtlByApiDaibikiFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiDaibikiType(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiDaibikiType((MCenterClassDtl)vl), "MCenterClassDtlByApiDaibikiType");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiEidomeFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiEidomeFlg((MCenterClassDtl)vl), "MCenterClassDtlByApiEidomeFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiWeightCd1(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiWeightCd1((MCenterClassDtl)vl), "MCenterClassDtlByApiWeightCd1");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByApiWeightCd2(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByApiWeightCd2((MCenterClassDtl)vl), "MCenterClassDtlByApiWeightCd2");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getBClassDtlByCharacterCd(), (et, vl) -> ((MCarrierSlipSgw)et).setBClassDtlByCharacterCd((BClassDtl)vl), "BClassDtlByCharacterCd");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getBClassDtlByCodCls(), (et, vl) -> ((MCarrierSlipSgw)et).setBClassDtlByCodCls((BClassDtl)vl), "BClassDtlByCodCls");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCarrierSlipSgw)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlBySealType1(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlBySealType1((MCenterClassDtl)vl), "MCenterClassDtlBySealType1");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlBySealType2(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlBySealType2((MCenterClassDtl)vl), "MCenterClassDtlBySealType2");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlBySealType3(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlBySealType3((MCenterClassDtl)vl), "MCenterClassDtlBySealType3");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getBClassDtlBySettlementType(), (et, vl) -> ((MCarrierSlipSgw)et).setBClassDtlBySettlementType((BClassDtl)vl), "BClassDtlBySettlementType");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlBySlipShapeCd(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlBySlipShapeCd((MCenterClassDtl)vl), "MCenterClassDtlBySlipShapeCd");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByTransportTypeItem(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByTransportTypeItem((MCenterClassDtl)vl), "MCenterClassDtlByTransportTypeItem");
        setupEfpg(_efpgMap, et -> ((MCarrierSlipSgw)et).getMCenterClassDtlByTransportTypeSpeed(), (et, vl) -> ((MCarrierSlipSgw)et).setMCenterClassDtlByTransportTypeSpeed((MCenterClassDtl)vl), "MCenterClassDtlByTransportTypeSpeed");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_CARRIER_SLIP_SGW";
    protected final String _tableDispName = "M_CARRIER_SLIP_SGW";
    protected final String _tablePropertyName = "MCarrierSlipSgw";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_CARRIER_SLIP_SGW", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierSlipSgwId = cci("CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", null, null, Long.class, "carrierSlipSgwId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MDeliveryCourseList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnTagType = cci("TAG_TYPE", "TAG_TYPE", null, null, String.class, "tagType", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagNm = cci("TAG_NM", "TAG_NM", null, null, String.class, "tagNm", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCharacterCd = cci("CHARACTER_CD", "CHARACTER_CD", null, null, String.class, "characterCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCharacterCd", null, CDef.DefMeta.CharacterCd, false);
    protected final ColumnInfo _columnSlipCustomerCd = cci("SLIP_CUSTOMER_CD", "SLIP_CUSTOMER_CD", null, null, String.class, "slipCustomerCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWebApiRequestUrl = cci("WEB_API_REQUEST_URL", "WEB_API_REQUEST_URL", null, null, String.class, "webApiRequestUrl", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerId = cci("CUSTOMER_ID", "CUSTOMER_ID", null, null, String.class, "customerId", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoginPassword = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, null, String.class, "loginPassword", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeptConsignorNm = cci("DEPT_CONSIGNOR_NM", "DEPT_CONSIGNOR_NM", null, null, String.class, "deptConsignorNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConsignorTelNo = cci("CONSIGNOR_TEL_NO", "CONSIGNOR_TEL_NO", null, null, String.class, "consignorTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientTelNo = cci("SLIP_CLIENT_TEL_NO", "SLIP_CLIENT_TEL_NO", null, null, String.class, "slipClientTelNo", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientZipCd = cci("SLIP_CLIENT_ZIP_CD", "SLIP_CLIENT_ZIP_CD", null, null, String.class, "slipClientZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress1 = cci("SLIP_CLIENT_ADDRESS1", "SLIP_CLIENT_ADDRESS1", null, null, String.class, "slipClientAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress2 = cci("SLIP_CLIENT_ADDRESS2", "SLIP_CLIENT_ADDRESS2", null, null, String.class, "slipClientAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm1 = cci("SLIP_CLIENT_NM1", "SLIP_CLIENT_NM1", null, null, String.class, "slipClientNm1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm2 = cci("SLIP_CLIENT_NM2", "SLIP_CLIENT_NM2", null, null, String.class, "slipClientNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipShapeCd = cci("SLIP_SHAPE_CD", "SLIP_SHAPE_CD", null, null, String.class, "slipShapeCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlBySlipShapeCd", null, CDef.DefMeta.CenterSlipShapeCd, false);
    protected final ColumnInfo _columnSlipItemNm1 = cci("SLIP_ITEM_NM1", "SLIP_ITEM_NM1", null, null, String.class, "slipItemNm1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm2 = cci("SLIP_ITEM_NM2", "SLIP_ITEM_NM2", null, null, String.class, "slipItemNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm3 = cci("SLIP_ITEM_NM3", "SLIP_ITEM_NM3", null, null, String.class, "slipItemNm3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm4 = cci("SLIP_ITEM_NM4", "SLIP_ITEM_NM4", null, null, String.class, "slipItemNm4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm5 = cci("SLIP_ITEM_NM5", "SLIP_ITEM_NM5", null, null, String.class, "slipItemNm5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransportTypeSpeed = cci("TRANSPORT_TYPE_SPEED", "TRANSPORT_TYPE_SPEED", null, null, String.class, "transportTypeSpeed", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByTransportTypeSpeed", null, CDef.DefMeta.CenterTransportTypeSpeed, false);
    protected final ColumnInfo _columnTransportTypeItem = cci("TRANSPORT_TYPE_ITEM", "TRANSPORT_TYPE_ITEM", null, null, String.class, "transportTypeItem", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByTransportTypeItem", null, CDef.DefMeta.CenterTransportTypeItem, false);
    protected final ColumnInfo _columnSettlementType = cci("SETTLEMENT_TYPE", "SETTLEMENT_TYPE", null, null, String.class, "settlementType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlBySettlementType", null, CDef.DefMeta.SettlementType, false);
    protected final ColumnInfo _columnSealType1 = cci("SEAL_TYPE1", "SEAL_TYPE1", null, null, String.class, "sealType1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlBySealType1", null, CDef.DefMeta.CenterSealType, false);
    protected final ColumnInfo _columnSealType2 = cci("SEAL_TYPE2", "SEAL_TYPE2", null, null, String.class, "sealType2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlBySealType2", null, CDef.DefMeta.CenterSealType, false);
    protected final ColumnInfo _columnSealType3 = cci("SEAL_TYPE3", "SEAL_TYPE3", null, null, String.class, "sealType3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlBySealType3", null, CDef.DefMeta.CenterSealType, false);
    protected final ColumnInfo _columnCodCls = cci("COD_CLS", "COD_CLS", null, null, String.class, "codCls", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "BClassDtlByCodCls", null, CDef.DefMeta.CodCls, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnApiOkuriCode = cci("API_OKURI_CODE", "API_OKURI_CODE", null, null, String.class, "apiOkuriCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnApiBinsyuCode = cci("API_BINSYU_CODE", "API_BINSYU_CODE", null, null, String.class, "apiBinsyuCode", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByApiBinsyuCode", null, CDef.DefMeta.CenterApiBinsyuCode, false);
    protected final ColumnInfo _columnApiDaibikiFlg = cci("API_DAIBIKI_FLG", "API_DAIBIKI_FLG", null, null, String.class, "apiDaibikiFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "MCenterClassDtlByApiDaibikiFlg", null, CDef.DefMeta.CenterApiDaibikiFlg, false);
    protected final ColumnInfo _columnApiDaibikiType = cci("API_DAIBIKI_TYPE", "API_DAIBIKI_TYPE", null, null, String.class, "apiDaibikiType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByApiDaibikiType", null, CDef.DefMeta.CenterApiDaibikiType, false);
    protected final ColumnInfo _columnApiWeightCd1 = cci("API_WEIGHT_CD_1", "API_WEIGHT_CD_1", null, null, String.class, "apiWeightCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByApiWeightCd1", null, CDef.DefMeta.CenterApiWeightCd, false);
    protected final ColumnInfo _columnApiWeightCd2 = cci("API_WEIGHT_CD_2", "API_WEIGHT_CD_2", null, null, String.class, "apiWeightCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, "MCenterClassDtlByApiWeightCd2", null, CDef.DefMeta.CenterApiWeightCd, false);
    protected final ColumnInfo _columnApiEidomeFlg = cci("API_EIDOME_FLG", "API_EIDOME_FLG", null, null, String.class, "apiEidomeFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "MCenterClassDtlByApiEidomeFlg", null, CDef.DefMeta.CenterApiEidomeFlg, false);
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
     * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipSgwId() { return _columnCarrierSlipSgwId; }
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
     * SLIP_CUSTOMER_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipCustomerCd() { return _columnSlipCustomerCd; }
    /**
     * WEB_API_REQUEST_URL: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWebApiRequestUrl() { return _columnWebApiRequestUrl; }
    /**
     * CUSTOMER_ID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerId() { return _columnCustomerId; }
    /**
     * LOGIN_PASSWORD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    /**
     * DEPT_CONSIGNOR_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeptConsignorNm() { return _columnDeptConsignorNm; }
    /**
     * CONSIGNOR_TEL_NO: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConsignorTelNo() { return _columnConsignorTelNo; }
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
     * SLIP_CLIENT_NM1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm1() { return _columnSlipClientNm1; }
    /**
     * SLIP_CLIENT_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm2() { return _columnSlipClientNm2; }
    /**
     * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipShapeCd() { return _columnSlipShapeCd; }
    /**
     * SLIP_ITEM_NM1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm1() { return _columnSlipItemNm1; }
    /**
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm2() { return _columnSlipItemNm2; }
    /**
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm3() { return _columnSlipItemNm3; }
    /**
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm4() { return _columnSlipItemNm4; }
    /**
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm5() { return _columnSlipItemNm5; }
    /**
     * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportTypeSpeed() { return _columnTransportTypeSpeed; }
    /**
     * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransportTypeItem() { return _columnTransportTypeItem; }
    /**
     * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSettlementType() { return _columnSettlementType; }
    /**
     * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealType1() { return _columnSealType1; }
    /**
     * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealType2() { return _columnSealType2; }
    /**
     * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSealType3() { return _columnSealType3; }
    /**
     * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodCls() { return _columnCodCls; }
    /**
     * SEND_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * API_OKURI_CODE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiOkuriCode() { return _columnApiOkuriCode; }
    /**
     * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiBinsyuCode() { return _columnApiBinsyuCode; }
    /**
     * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiDaibikiFlg() { return _columnApiDaibikiFlg; }
    /**
     * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiDaibikiType() { return _columnApiDaibikiType; }
    /**
     * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiWeightCd1() { return _columnApiWeightCd1; }
    /**
     * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiWeightCd2() { return _columnApiWeightCd2; }
    /**
     * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnApiEidomeFlg() { return _columnApiEidomeFlg; }
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
        ls.add(columnCarrierSlipSgwId());
        ls.add(columnCenterId());
        ls.add(columnTagType());
        ls.add(columnTagNm());
        ls.add(columnCharacterCd());
        ls.add(columnSlipCustomerCd());
        ls.add(columnWebApiRequestUrl());
        ls.add(columnCustomerId());
        ls.add(columnLoginPassword());
        ls.add(columnDeptConsignorNm());
        ls.add(columnConsignorTelNo());
        ls.add(columnSlipClientTelNo());
        ls.add(columnSlipClientZipCd());
        ls.add(columnSlipClientAddress1());
        ls.add(columnSlipClientAddress2());
        ls.add(columnSlipClientNm1());
        ls.add(columnSlipClientNm2());
        ls.add(columnSlipShapeCd());
        ls.add(columnSlipItemNm1());
        ls.add(columnSlipItemNm2());
        ls.add(columnSlipItemNm3());
        ls.add(columnSlipItemNm4());
        ls.add(columnSlipItemNm5());
        ls.add(columnTransportTypeSpeed());
        ls.add(columnTransportTypeItem());
        ls.add(columnSettlementType());
        ls.add(columnSealType1());
        ls.add(columnSealType2());
        ls.add(columnSealType3());
        ls.add(columnCodCls());
        ls.add(columnSendCd());
        ls.add(columnApiOkuriCode());
        ls.add(columnApiBinsyuCode());
        ls.add(columnApiDaibikiFlg());
        ls.add(columnApiDaibikiType());
        ls.add(columnApiWeightCd1());
        ls.add(columnApiWeightCd2());
        ls.add(columnApiEidomeFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierSlipSgwId()); }
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
        return cfi("M_CARRIER_SLIP_SGW_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCarrierSlipSgwList", false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiBinsyuCode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiBinsyuCode(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_BINSYU_CODE", "MCenterClassDtlByApiBinsyuCode", this, MCenterClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_BINSYU_CODE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiBinsyuCode.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiDaibikiFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiDaibikiFlg(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_DAIBIKI_FLG", "MCenterClassDtlByApiDaibikiFlg", this, MCenterClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_DAIBIKI_FLG'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiDaibikiFlg.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiDaibikiType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiDaibikiType(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_DAIBIKI_TYPE", "MCenterClassDtlByApiDaibikiType", this, MCenterClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_DAIBIKI_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiDaibikiType.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiEidomeFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiEidomeFlg(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_EIDOME_FLG", "MCenterClassDtlByApiEidomeFlg", this, MCenterClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_EIDOME_FLG'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiEidomeFlg.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiWeightCd1() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiWeightCd1(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_WEIGHT_CD_1", "MCenterClassDtlByApiWeightCd1", this, MCenterClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_WEIGHT_CD'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiWeightCd1.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByApiWeightCd2() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnApiWeightCd2(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_API_WEIGHT_CD_2", "MCenterClassDtlByApiWeightCd2", this, MCenterClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'API_WEIGHT_CD'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByApiWeightCd2.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCharacterCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCharacterCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_SGW_CHARACTER_CD", "BClassDtlByCharacterCd", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'CHARACTER_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCodCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCodCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_SGW_COD_CLS", "BClassDtlByCodCls", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'COD_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_SGW_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlBySealType1() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSealType1(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_SEAL_TYPE1", "MCenterClassDtlBySealType1", this, MCenterClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'SEAL_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlBySealType1.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlBySealType2() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSealType2(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_SEAL_TYPE2", "MCenterClassDtlBySealType2", this, MCenterClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'SEAL_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlBySealType2.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlBySealType3() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSealType3(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_SEAL_TYPE3", "MCenterClassDtlBySealType3", this, MCenterClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'SEAL_TYPE'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlBySealType3.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySettlementType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSettlementType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_SLIP_SGW_SETTLEMENT_TYPE", "BClassDtlBySettlementType", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SETTLEMENT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlBySlipShapeCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipShapeCd(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_SLIP_SHAPE_CD", "MCenterClassDtlBySlipShapeCd", this, MCenterClassDtlDbm.getInstance(), mp, 14, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'SLIP_SHAPE_CD'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlBySlipShapeCd.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByTransportTypeItem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTransportTypeItem(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_TRANSPORT_TYPE_ITEM", "MCenterClassDtlByTransportTypeItem", this, MCenterClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'TRANSPORT_TYPE_ITEM'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByTransportTypeItem.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }
    /**
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenterClassDtlByTransportTypeSpeed() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTransportTypeSpeed(), MCenterClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_CENTER_M_CARRIER_SLIP_SGW_TRANSPORT_TYPE_SPEED", "MCenterClassDtlByTransportTypeSpeed", this, MCenterClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM M_CENTER_CLASS C\n                  WHERE C.CENTER_CLASS_ID = $$foreignAlias$$.CENTER_CLASS_ID\n                    AND C.CLASS_CD  = 'TRANSPORT_TYPE_SPEED'\n                    AND C.CENTER_ID = /*$$locationBase$$.parameterMapMCenterClassDtlByTransportTypeSpeed.centerId*/null\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", newArrayList("centerId"), false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierSlipSgwId(), MDeliveryCourseDbm.getInstance().columnCarrierSlipSgwId());
        return cri("M_DELIVERY_COURSE_FK1", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCarrierSlipSgw");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrierSlipSgw> getEntityType() { return MCarrierSlipSgw.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrierSlipSgw newEntity() { return new MCarrierSlipSgw(); }
    public MCarrierSlipSgw newMyEntity() { return new MCarrierSlipSgw(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrierSlipSgw)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrierSlipSgw)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
