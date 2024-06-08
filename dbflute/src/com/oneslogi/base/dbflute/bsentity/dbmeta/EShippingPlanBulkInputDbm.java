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
 * The DB meta of E_SHIPPING_PLAN_BULK_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EShippingPlanBulkInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EShippingPlanBulkInputDbm _instance = new EShippingPlanBulkInputDbm();
    private EShippingPlanBulkInputDbm() {}
    public static EShippingPlanBulkInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getBondedShippingPlanBulkInputId(), (et, vl) -> ((EShippingPlanBulkInput)et).setBondedShippingPlanBulkInputId(ctl(vl)), "bondedShippingPlanBulkInputId");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getReceiveCd(), (et, vl) -> ((EShippingPlanBulkInput)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getReceiveRowId(), (et, vl) -> ((EShippingPlanBulkInput)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getImportFlg(), (et, vl) -> ((EShippingPlanBulkInput)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getErrorFlg(), (et, vl) -> ((EShippingPlanBulkInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getErrorMessageCd(), (et, vl) -> ((EShippingPlanBulkInput)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getHedderFlg(), (et, vl) -> ((EShippingPlanBulkInput)et).setHedderFlg((String)vl), "hedderFlg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzorgncd(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getDpcd(), (et, vl) -> ((EShippingPlanBulkInput)et).setDpcd((String)vl), "dpcd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getOrdgr(), (et, vl) -> ((EShippingPlanBulkInput)et).setOrdgr((String)vl), "ordgr");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getRmano(), (et, vl) -> ((EShippingPlanBulkInput)et).setRmano((String)vl), "rmano");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSscd(), (et, vl) -> ((EShippingPlanBulkInput)et).setSscd((String)vl), "sscd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSlptyp(), (et, vl) -> ((EShippingPlanBulkInput)et).setSlptyp((String)vl), "slptyp");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSlpno(), (et, vl) -> ((EShippingPlanBulkInput)et).setSlpno((String)vl), "slpno");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSeqno(), (et, vl) -> ((EShippingPlanBulkInput)et).setSeqno((String)vl), "seqno");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzordymd(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzordymd((String)vl), "zzordymd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzwaymd1(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzwaymd1((String)vl), "zzwaymd1");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getOtorgcd(), (et, vl) -> ((EShippingPlanBulkInput)et).setOtorgcd((String)vl), "otorgcd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getOrdorgcd(), (et, vl) -> ((EShippingPlanBulkInput)et).setOrdorgcd((String)vl), "ordorgcd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getRlybscd(), (et, vl) -> ((EShippingPlanBulkInput)et).setRlybscd((String)vl), "rlybscd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getDed(), (et, vl) -> ((EShippingPlanBulkInput)et).setDed((String)vl), "ded");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getPstnid(), (et, vl) -> ((EShippingPlanBulkInput)et).setPstnid((String)vl), "pstnid");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getDlvrnk(), (et, vl) -> ((EShippingPlanBulkInput)et).setDlvrnk((String)vl), "dlvrnk");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getLmpdlvno(), (et, vl) -> ((EShippingPlanBulkInput)et).setLmpdlvno((String)vl), "lmpdlvno");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getDivmtd(), (et, vl) -> ((EShippingPlanBulkInput)et).setDivmtd((String)vl), "divmtd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getHdvid(), (et, vl) -> ((EShippingPlanBulkInput)et).setHdvid((String)vl), "hdvid");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getName1(), (et, vl) -> ((EShippingPlanBulkInput)et).setName1((String)vl), "name1");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZregprca(), (et, vl) -> ((EShippingPlanBulkInput)et).setZregprca((String)vl), "zregprca");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZregprcc(), (et, vl) -> ((EShippingPlanBulkInput)et).setZregprcc((String)vl), "zregprcc");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzsaltax(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzsaltax((String)vl), "zzsaltax");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzgodfpc(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzgodfpc((String)vl), "zzgodfpc");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzgodspc(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzgodspc((String)vl), "zzgodspc");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzgodctx(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzgodctx((String)vl), "zzgodctx");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getLogisticscd(), (et, vl) -> ((EShippingPlanBulkInput)et).setLogisticscd((String)vl), "logisticscd");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSlediv(), (et, vl) -> ((EShippingPlanBulkInput)et).setSlediv((String)vl), "slediv");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getHvrtrsn(), (et, vl) -> ((EShippingPlanBulkInput)et).setHvrtrsn((String)vl), "hvrtrsn");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzvbelnb(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzvbelnb((String)vl), "zzvbelnb");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getCngprtslpno(), (et, vl) -> ((EShippingPlanBulkInput)et).setCngprtslpno((String)vl), "cngprtslpno");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getTrnsctndiv(), (et, vl) -> ((EShippingPlanBulkInput)et).setTrnsctndiv((String)vl), "trnsctndiv");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getEosordaftflg(), (et, vl) -> ((EShippingPlanBulkInput)et).setEosordaftflg((String)vl), "eosordaftflg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getEosslpno(), (et, vl) -> ((EShippingPlanBulkInput)et).setEosslpno((String)vl), "eosslpno");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getHdrdbxdiv(), (et, vl) -> ((EShippingPlanBulkInput)et).setHdrdbxdiv((String)vl), "hdrdbxdiv");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getInotrfsldiv(), (et, vl) -> ((EShippingPlanBulkInput)et).setInotrfsldiv((String)vl), "inotrfsldiv");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getBxmntrfsldiv(), (et, vl) -> ((EShippingPlanBulkInput)et).setBxmntrfsldiv((String)vl), "bxmntrfsldiv");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getSlpmrgtmg(), (et, vl) -> ((EShippingPlanBulkInput)et).setSlpmrgtmg((String)vl), "slpmrgtmg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getZzblotdt(), (et, vl) -> ((EShippingPlanBulkInput)et).setZzblotdt((String)vl), "zzblotdt");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getCggdid(), (et, vl) -> ((EShippingPlanBulkInput)et).setCggdid((String)vl), "cggdid");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getMatnr(), (et, vl) -> ((EShippingPlanBulkInput)et).setMatnr((String)vl), "matnr");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getKwmeng(), (et, vl) -> ((EShippingPlanBulkInput)et).setKwmeng((String)vl), "kwmeng");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getMvgr1(), (et, vl) -> ((EShippingPlanBulkInput)et).setMvgr1((String)vl), "mvgr1");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getMvgr4(), (et, vl) -> ((EShippingPlanBulkInput)et).setMvgr4((String)vl), "mvgr4");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getKzwi3(), (et, vl) -> ((EShippingPlanBulkInput)et).setKzwi3((String)vl), "kzwi3");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getDelFlg(), (et, vl) -> ((EShippingPlanBulkInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getVersionNo(), (et, vl) -> ((EShippingPlanBulkInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getControlNo(), (et, vl) -> ((EShippingPlanBulkInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getAddDt(), (et, vl) -> ((EShippingPlanBulkInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getAddUser(), (et, vl) -> ((EShippingPlanBulkInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getAddProcess(), (et, vl) -> ((EShippingPlanBulkInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getUpdDt(), (et, vl) -> ((EShippingPlanBulkInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getUpdUser(), (et, vl) -> ((EShippingPlanBulkInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EShippingPlanBulkInput)et).getUpdProcess(), (et, vl) -> ((EShippingPlanBulkInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_SHIPPING_PLAN_BULK_INPUT";
    protected final String _tableDispName = "E_SHIPPING_PLAN_BULK_INPUT";
    protected final String _tablePropertyName = "EShippingPlanBulkInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_SHIPPING_PLAN_BULK_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBondedShippingPlanBulkInputId = cci("BONDED_SHIPPING_PLAN_BULK_INPUT_ID", "BONDED_SHIPPING_PLAN_BULK_INPUT_ID", null, null, Long.class, "bondedShippingPlanBulkInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHedderFlg = cci("HEDDER_FLG", "HEDDER_FLG", null, null, String.class, "hedderFlg", null, false, false, true, "char", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDpcd = cci("DPCD", "DPCD", null, null, String.class, "dpcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdgr = cci("ORDGR", "ORDGR", null, null, String.class, "ordgr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRmano = cci("RMANO", "RMANO", null, null, String.class, "rmano", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSscd = cci("SSCD", "SSCD", null, null, String.class, "sscd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlptyp = cci("SLPTYP", "SLPTYP", null, null, String.class, "slptyp", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpno = cci("SLPNO", "SLPNO", null, null, String.class, "slpno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeqno = cci("SEQNO", "SEQNO", null, null, String.class, "seqno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzordymd = cci("ZZORDYMD", "ZZORDYMD", null, null, String.class, "zzordymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzwaymd1 = cci("ZZWAYMD1", "ZZWAYMD1", null, null, String.class, "zzwaymd1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtorgcd = cci("OTORGCD", "OTORGCD", null, null, String.class, "otorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdorgcd = cci("ORDORGCD", "ORDORGCD", null, null, String.class, "ordorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRlybscd = cci("RLYBSCD", "RLYBSCD", null, null, String.class, "rlybscd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDed = cci("DED", "DED", null, null, String.class, "ded", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPstnid = cci("PSTNID", "PSTNID", null, null, String.class, "pstnid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDlvrnk = cci("DLVRNK", "DLVRNK", null, null, String.class, "dlvrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLmpdlvno = cci("LMPDLVNO", "LMPDLVNO", null, null, String.class, "lmpdlvno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDivmtd = cci("DIVMTD", "DIVMTD", null, null, String.class, "divmtd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdvid = cci("HDVID", "HDVID", null, null, String.class, "hdvid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName1 = cci("NAME1", "NAME1", null, null, String.class, "name1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZregprca = cci("ZREGPRCA", "ZREGPRCA", null, null, String.class, "zregprca", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZregprcc = cci("ZREGPRCC", "ZREGPRCC", null, null, String.class, "zregprcc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzsaltax = cci("ZZSALTAX", "ZZSALTAX", null, null, String.class, "zzsaltax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodfpc = cci("ZZGODFPC", "ZZGODFPC", null, null, String.class, "zzgodfpc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodspc = cci("ZZGODSPC", "ZZGODSPC", null, null, String.class, "zzgodspc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzgodctx = cci("ZZGODCTX", "ZZGODCTX", null, null, String.class, "zzgodctx", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogisticscd = cci("LOGISTICSCD", "LOGISTICSCD", null, null, String.class, "logisticscd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlediv = cci("SLEDIV", "SLEDIV", null, null, String.class, "slediv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHvrtrsn = cci("HVRTRSN", "HVRTRSN", null, null, String.class, "hvrtrsn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzvbelnb = cci("ZZVBELNB", "ZZVBELNB", null, null, String.class, "zzvbelnb", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCngprtslpno = cci("CNGPRTSLPNO", "CNGPRTSLPNO", null, null, String.class, "cngprtslpno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrnsctndiv = cci("TRNSCTNDIV", "TRNSCTNDIV", null, null, String.class, "trnsctndiv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosordaftflg = cci("EOSORDAFTFLG", "EOSORDAFTFLG", null, null, String.class, "eosordaftflg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEosslpno = cci("EOSSLPNO", "EOSSLPNO", null, null, String.class, "eosslpno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrdbxdiv = cci("HDRDBXDIV", "HDRDBXDIV", null, null, String.class, "hdrdbxdiv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInotrfsldiv = cci("INOTRFSLDIV", "INOTRFSLDIV", null, null, String.class, "inotrfsldiv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxmntrfsldiv = cci("BXMNTRFSLDIV", "BXMNTRFSLDIV", null, null, String.class, "bxmntrfsldiv", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlpmrgtmg = cci("SLPMRGTMG", "SLPMRGTMG", null, null, String.class, "slpmrgtmg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzblotdt = cci("ZZBLOTDT", "ZZBLOTDT", null, null, String.class, "zzblotdt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCggdid = cci("CGGDID", "CGGDID", null, null, String.class, "cggdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMatnr = cci("MATNR", "MATNR", null, null, String.class, "matnr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKwmeng = cci("KWMENG", "KWMENG", null, null, String.class, "kwmeng", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMvgr1 = cci("MVGR1", "MVGR1", null, null, String.class, "mvgr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMvgr4 = cci("MVGR4", "MVGR4", null, null, String.class, "mvgr4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKzwi3 = cci("KZWI3", "KZWI3", null, null, String.class, "kzwi3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBondedShippingPlanBulkInputId() { return _columnBondedShippingPlanBulkInputId; }
    /**
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * HEDDER_FLG: {NotNull, char(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHedderFlg() { return _columnHedderFlg; }
    /**
     * ZZORGNCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * DPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDpcd() { return _columnDpcd; }
    /**
     * ORDGR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdgr() { return _columnOrdgr; }
    /**
     * RMANO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRmano() { return _columnRmano; }
    /**
     * SSCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSscd() { return _columnSscd; }
    /**
     * SLPTYP: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlptyp() { return _columnSlptyp; }
    /**
     * SLPNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpno() { return _columnSlpno; }
    /**
     * SEQNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeqno() { return _columnSeqno; }
    /**
     * ZZORDYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzordymd() { return _columnZzordymd; }
    /**
     * ZZWAYMD1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzwaymd1() { return _columnZzwaymd1; }
    /**
     * OTORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtorgcd() { return _columnOtorgcd; }
    /**
     * ORDORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdorgcd() { return _columnOrdorgcd; }
    /**
     * RLYBSCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRlybscd() { return _columnRlybscd; }
    /**
     * DED: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDed() { return _columnDed; }
    /**
     * PSTNID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPstnid() { return _columnPstnid; }
    /**
     * DLVRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDlvrnk() { return _columnDlvrnk; }
    /**
     * LMPDLVNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLmpdlvno() { return _columnLmpdlvno; }
    /**
     * DIVMTD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDivmtd() { return _columnDivmtd; }
    /**
     * HDVID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdvid() { return _columnHdvid; }
    /**
     * NAME1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName1() { return _columnName1; }
    /**
     * ZREGPRCA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZregprca() { return _columnZregprca; }
    /**
     * ZREGPRCC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZregprcc() { return _columnZregprcc; }
    /**
     * ZZSALTAX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzsaltax() { return _columnZzsaltax; }
    /**
     * ZZGODFPC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodfpc() { return _columnZzgodfpc; }
    /**
     * ZZGODSPC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodspc() { return _columnZzgodspc; }
    /**
     * ZZGODCTX: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzgodctx() { return _columnZzgodctx; }
    /**
     * LOGISTICSCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogisticscd() { return _columnLogisticscd; }
    /**
     * SLEDIV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlediv() { return _columnSlediv; }
    /**
     * HVRTRSN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHvrtrsn() { return _columnHvrtrsn; }
    /**
     * ZZVBELNB: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzvbelnb() { return _columnZzvbelnb; }
    /**
     * CNGPRTSLPNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCngprtslpno() { return _columnCngprtslpno; }
    /**
     * TRNSCTNDIV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrnsctndiv() { return _columnTrnsctndiv; }
    /**
     * EOSORDAFTFLG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosordaftflg() { return _columnEosordaftflg; }
    /**
     * EOSSLPNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEosslpno() { return _columnEosslpno; }
    /**
     * HDRDBXDIV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrdbxdiv() { return _columnHdrdbxdiv; }
    /**
     * INOTRFSLDIV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInotrfsldiv() { return _columnInotrfsldiv; }
    /**
     * BXMNTRFSLDIV: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxmntrfsldiv() { return _columnBxmntrfsldiv; }
    /**
     * SLPMRGTMG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlpmrgtmg() { return _columnSlpmrgtmg; }
    /**
     * ZZBLOTDT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzblotdt() { return _columnZzblotdt; }
    /**
     * CGGDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCggdid() { return _columnCggdid; }
    /**
     * MATNR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMatnr() { return _columnMatnr; }
    /**
     * KWMENG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKwmeng() { return _columnKwmeng; }
    /**
     * MVGR1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMvgr1() { return _columnMvgr1; }
    /**
     * MVGR4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMvgr4() { return _columnMvgr4; }
    /**
     * KZWI3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKzwi3() { return _columnKzwi3; }
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
        ls.add(columnBondedShippingPlanBulkInputId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnHedderFlg());
        ls.add(columnZzorgncd());
        ls.add(columnDpcd());
        ls.add(columnOrdgr());
        ls.add(columnRmano());
        ls.add(columnSscd());
        ls.add(columnSlptyp());
        ls.add(columnSlpno());
        ls.add(columnSeqno());
        ls.add(columnZzordymd());
        ls.add(columnZzwaymd1());
        ls.add(columnOtorgcd());
        ls.add(columnOrdorgcd());
        ls.add(columnRlybscd());
        ls.add(columnDed());
        ls.add(columnPstnid());
        ls.add(columnDlvrnk());
        ls.add(columnLmpdlvno());
        ls.add(columnDivmtd());
        ls.add(columnHdvid());
        ls.add(columnName1());
        ls.add(columnZregprca());
        ls.add(columnZregprcc());
        ls.add(columnZzsaltax());
        ls.add(columnZzgodfpc());
        ls.add(columnZzgodspc());
        ls.add(columnZzgodctx());
        ls.add(columnLogisticscd());
        ls.add(columnSlediv());
        ls.add(columnHvrtrsn());
        ls.add(columnZzvbelnb());
        ls.add(columnCngprtslpno());
        ls.add(columnTrnsctndiv());
        ls.add(columnEosordaftflg());
        ls.add(columnEosslpno());
        ls.add(columnHdrdbxdiv());
        ls.add(columnInotrfsldiv());
        ls.add(columnBxmntrfsldiv());
        ls.add(columnSlpmrgtmg());
        ls.add(columnZzblotdt());
        ls.add(columnCggdid());
        ls.add(columnMatnr());
        ls.add(columnKwmeng());
        ls.add(columnMvgr1());
        ls.add(columnMvgr4());
        ls.add(columnKzwi3());
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
    protected UniqueInfo cpui() { return hpcpui(columnBondedShippingPlanBulkInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EShippingPlanBulkInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EShippingPlanBulkInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EShippingPlanBulkInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EShippingPlanBulkInput> getEntityType() { return EShippingPlanBulkInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EShippingPlanBulkInput newEntity() { return new EShippingPlanBulkInput(); }
    public EShippingPlanBulkInput newMyEntity() { return new EShippingPlanBulkInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EShippingPlanBulkInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EShippingPlanBulkInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
