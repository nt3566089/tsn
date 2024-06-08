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
 * The DB meta of E_PRIMARY_SHIPPING_DTL_INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EPrimaryShippingDtlInfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EPrimaryShippingDtlInfoDbm _instance = new EPrimaryShippingDtlInfoDbm();
    private EPrimaryShippingDtlInfoDbm() {}
    public static EPrimaryShippingDtlInfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getPrimaryShippingDtlInfoId(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setPrimaryShippingDtlInfoId(ctl(vl)), "primaryShippingDtlInfoId");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getReceiveCd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getReceiveRowId(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getImportFlg(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getErrorFlg(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getErrorMessageCd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzbukrs(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzbukrs((String)vl), "zzbukrs");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzsndymd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzsndymd((String)vl), "zzsndymd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getRcdid(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setRcdid((String)vl), "rcdid");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefeno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefeno((String)vl), "zzrefeno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getBnwhcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setBnwhcd((String)vl), "bnwhcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getHdrid(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setHdrid((String)vl), "hdrid");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getDtlno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setDtlno((String)vl), "dtlno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSpndda(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSpndda((String)vl), "spndda");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getPdlgtm(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setPdlgtm((String)vl), "pdlgtm");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzsendno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzsendno((String)vl), "zzsendno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getPrcsorg(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setPrcsorg((String)vl), "prcsorg");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getEkgrp(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setEkgrp((String)vl), "ekgrp");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSpcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSpcd((String)vl), "spcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSpskplcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSpskplcd((String)vl), "spskplcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getRccd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setRccd((String)vl), "rccd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getRcskplcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setRcskplcd((String)vl), "rcskplcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrcvymd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrcvymd((String)vl), "zzrcvymd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzshtype(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzshtype((String)vl), "zzshtype");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getAgcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setAgcd((String)vl), "agcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzcbxqty(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzcbxqty((String)vl), "zzcbxqty");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzpltqty(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzpltqty((String)vl), "zzpltqty");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZztplqty(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZztplqty((String)vl), "zztplqty");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzshpcls(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzshpcls((String)vl), "zzshpcls");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe01(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe01((String)vl), "zzrefe01");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe02(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe02((String)vl), "zzrefe02");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe03(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe03((String)vl), "zzrefe03");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe04(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe04((String)vl), "zzrefe04");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe05(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe05((String)vl), "zzrefe05");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe06(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe06((String)vl), "zzrefe06");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe07(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe07((String)vl), "zzrefe07");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe08(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe08((String)vl), "zzrefe08");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe09(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe09((String)vl), "zzrefe09");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefe10(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefe10((String)vl), "zzrefe10");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getDtlqa(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setDtlqa((String)vl), "dtlqa");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzrefeno2(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzrefeno2((String)vl), "zzrefeno2");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getOprtno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setOprtno((String)vl), "oprtno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getBlocknm(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setBlocknm((String)vl), "blocknm");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getZzmatnr(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setZzmatnr((String)vl), "zzmatnr");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getLotno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setLotno((String)vl), "lotno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getQuanty(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setQuanty((String)vl), "quanty");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getGrpcsd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setGrpcsd((String)vl), "grpcsd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSfpoqa(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSfpoqa((String)vl), "sfpoqa");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getDsskplcd(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setDsskplcd((String)vl), "dsskplcd");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getMfinf(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setMfinf((String)vl), "mfinf");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSfthdes(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSfthdes((String)vl), "sfthdes");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getCnfatcl(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setCnfatcl((String)vl), "cnfatcl");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getLastgr(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setLastgr((String)vl), "lastgr");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSflastdes(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSflastdes((String)vl), "sflastdes");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getShno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setShno((String)vl), "shno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getPltno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setPltno((String)vl), "pltno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getTradelivno(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setTradelivno((String)vl), "tradelivno");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getBatjmfym(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setBatjmfym((String)vl), "batjmfym");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getSffil(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setSffil((String)vl), "sffil");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getDelFlg(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getVersionNo(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getControlNo(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getAddDt(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getAddUser(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getAddProcess(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getUpdDt(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getUpdUser(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EPrimaryShippingDtlInfo)et).getUpdProcess(), (et, vl) -> ((EPrimaryShippingDtlInfo)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_PRIMARY_SHIPPING_DTL_INFO";
    protected final String _tableDispName = "E_PRIMARY_SHIPPING_DTL_INFO";
    protected final String _tablePropertyName = "EPrimaryShippingDtlInfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_PRIMARY_SHIPPING_DTL_INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrimaryShippingDtlInfoId = cci("PRIMARY_SHIPPING_DTL_INFO_ID", "PRIMARY_SHIPPING_DTL_INFO_ID", null, null, Long.class, "primaryShippingDtlInfoId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzbukrs = cci("ZZBUKRS", "ZZBUKRS", null, null, String.class, "zzbukrs", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzsndymd = cci("ZZSNDYMD", "ZZSNDYMD", null, null, String.class, "zzsndymd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcdid = cci("RCDID", "RCDID", null, null, String.class, "rcdid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefeno = cci("ZZREFENO", "ZZREFENO", null, null, String.class, "zzrefeno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBnwhcd = cci("BNWHCD", "BNWHCD", null, null, String.class, "bnwhcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHdrid = cci("HDRID", "HDRID", null, null, String.class, "hdrid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtlno = cci("DTLNO", "DTLNO", null, null, String.class, "dtlno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpndda = cci("SPNDDA", "SPNDDA", null, null, String.class, "spndda", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPdlgtm = cci("PDLGTM", "PDLGTM", null, null, String.class, "pdlgtm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzsendno = cci("ZZSENDNO", "ZZSENDNO", null, null, String.class, "zzsendno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrcsorg = cci("PRCSORG", "PRCSORG", null, null, String.class, "prcsorg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEkgrp = cci("EKGRP", "EKGRP", null, null, String.class, "ekgrp", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpcd = cci("SPCD", "SPCD", null, null, String.class, "spcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpskplcd = cci("SPSKPLCD", "SPSKPLCD", null, null, String.class, "spskplcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRccd = cci("RCCD", "RCCD", null, null, String.class, "rccd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcskplcd = cci("RCSKPLCD", "RCSKPLCD", null, null, String.class, "rcskplcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrcvymd = cci("ZZRCVYMD", "ZZRCVYMD", null, null, String.class, "zzrcvymd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzshtype = cci("ZZSHTYPE", "ZZSHTYPE", null, null, String.class, "zzshtype", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAgcd = cci("AGCD", "AGCD", null, null, String.class, "agcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzcbxqty = cci("ZZCBXQTY", "ZZCBXQTY", null, null, String.class, "zzcbxqty", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzpltqty = cci("ZZPLTQTY", "ZZPLTQTY", null, null, String.class, "zzpltqty", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztplqty = cci("ZZTPLQTY", "ZZTPLQTY", null, null, String.class, "zztplqty", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzshpcls = cci("ZZSHPCLS", "ZZSHPCLS", null, null, String.class, "zzshpcls", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe01 = cci("ZZREFE01", "ZZREFE01", null, null, String.class, "zzrefe01", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe02 = cci("ZZREFE02", "ZZREFE02", null, null, String.class, "zzrefe02", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe03 = cci("ZZREFE03", "ZZREFE03", null, null, String.class, "zzrefe03", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe04 = cci("ZZREFE04", "ZZREFE04", null, null, String.class, "zzrefe04", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe05 = cci("ZZREFE05", "ZZREFE05", null, null, String.class, "zzrefe05", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe06 = cci("ZZREFE06", "ZZREFE06", null, null, String.class, "zzrefe06", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe07 = cci("ZZREFE07", "ZZREFE07", null, null, String.class, "zzrefe07", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe08 = cci("ZZREFE08", "ZZREFE08", null, null, String.class, "zzrefe08", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe09 = cci("ZZREFE09", "ZZREFE09", null, null, String.class, "zzrefe09", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefe10 = cci("ZZREFE10", "ZZREFE10", null, null, String.class, "zzrefe10", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDtlqa = cci("DTLQA", "DTLQA", null, null, String.class, "dtlqa", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzrefeno2 = cci("ZZREFENO2", "ZZREFENO2", null, null, String.class, "zzrefeno2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOprtno = cci("OPRTNO", "OPRTNO", null, null, String.class, "oprtno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBlocknm = cci("BLOCKNM", "BLOCKNM", null, null, String.class, "blocknm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzmatnr = cci("ZZMATNR", "ZZMATNR", null, null, String.class, "zzmatnr", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotno = cci("LOTNO", "LOTNO", null, null, String.class, "lotno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuanty = cci("QUANTY", "QUANTY", null, null, String.class, "quanty", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrpcsd = cci("GRPCSD", "GRPCSD", null, null, String.class, "grpcsd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSfpoqa = cci("SFPOQA", "SFPOQA", null, null, String.class, "sfpoqa", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDsskplcd = cci("DSSKPLCD", "DSSKPLCD", null, null, String.class, "dsskplcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMfinf = cci("MFINF", "MFINF", null, null, String.class, "mfinf", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSfthdes = cci("SFTHDES", "SFTHDES", null, null, String.class, "sfthdes", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCnfatcl = cci("CNFATCL", "CNFATCL", null, null, String.class, "cnfatcl", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastgr = cci("LASTGR", "LASTGR", null, null, String.class, "lastgr", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSflastdes = cci("SFLASTDES", "SFLASTDES", null, null, String.class, "sflastdes", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShno = cci("SHNO", "SHNO", null, null, String.class, "shno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPltno = cci("PLTNO", "PLTNO", null, null, String.class, "pltno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTradelivno = cci("TRADELIVNO", "TRADELIVNO", null, null, String.class, "tradelivno", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBatjmfym = cci("BATJMFYM", "BATJMFYM", null, null, String.class, "batjmfym", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSffil = cci("SFFIL", "SFFIL", null, null, String.class, "sffil", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
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
     * PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrimaryShippingDtlInfoId() { return _columnPrimaryShippingDtlInfoId; }
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
     * ZZBUKRS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzbukrs() { return _columnZzbukrs; }
    /**
     * ZZSNDYMD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzsndymd() { return _columnZzsndymd; }
    /**
     * RCDID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcdid() { return _columnRcdid; }
    /**
     * ZZREFENO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefeno() { return _columnZzrefeno; }
    /**
     * BNWHCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBnwhcd() { return _columnBnwhcd; }
    /**
     * HDRID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHdrid() { return _columnHdrid; }
    /**
     * DTLNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtlno() { return _columnDtlno; }
    /**
     * SPNDDA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpndda() { return _columnSpndda; }
    /**
     * PDLGTM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPdlgtm() { return _columnPdlgtm; }
    /**
     * ZZSENDNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzsendno() { return _columnZzsendno; }
    /**
     * PRCSORG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrcsorg() { return _columnPrcsorg; }
    /**
     * EKGRP: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEkgrp() { return _columnEkgrp; }
    /**
     * SPCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpcd() { return _columnSpcd; }
    /**
     * SPSKPLCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpskplcd() { return _columnSpskplcd; }
    /**
     * RCCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRccd() { return _columnRccd; }
    /**
     * RCSKPLCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcskplcd() { return _columnRcskplcd; }
    /**
     * ZZRCVYMD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrcvymd() { return _columnZzrcvymd; }
    /**
     * ZZSHTYPE: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzshtype() { return _columnZzshtype; }
    /**
     * AGCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAgcd() { return _columnAgcd; }
    /**
     * ZZCBXQTY: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzcbxqty() { return _columnZzcbxqty; }
    /**
     * ZZPLTQTY: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzpltqty() { return _columnZzpltqty; }
    /**
     * ZZTPLQTY: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztplqty() { return _columnZztplqty; }
    /**
     * ZZSHPCLS: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzshpcls() { return _columnZzshpcls; }
    /**
     * ZZREFE01: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe01() { return _columnZzrefe01; }
    /**
     * ZZREFE02: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe02() { return _columnZzrefe02; }
    /**
     * ZZREFE03: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe03() { return _columnZzrefe03; }
    /**
     * ZZREFE04: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe04() { return _columnZzrefe04; }
    /**
     * ZZREFE05: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe05() { return _columnZzrefe05; }
    /**
     * ZZREFE06: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe06() { return _columnZzrefe06; }
    /**
     * ZZREFE07: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe07() { return _columnZzrefe07; }
    /**
     * ZZREFE08: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe08() { return _columnZzrefe08; }
    /**
     * ZZREFE09: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe09() { return _columnZzrefe09; }
    /**
     * ZZREFE10: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefe10() { return _columnZzrefe10; }
    /**
     * DTLQA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDtlqa() { return _columnDtlqa; }
    /**
     * ZZREFENO2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzrefeno2() { return _columnZzrefeno2; }
    /**
     * OPRTNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOprtno() { return _columnOprtno; }
    /**
     * BLOCKNM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBlocknm() { return _columnBlocknm; }
    /**
     * ZZMATNR: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzmatnr() { return _columnZzmatnr; }
    /**
     * LOTNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotno() { return _columnLotno; }
    /**
     * QUANTY: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuanty() { return _columnQuanty; }
    /**
     * GRPCSD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrpcsd() { return _columnGrpcsd; }
    /**
     * SFPOQA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSfpoqa() { return _columnSfpoqa; }
    /**
     * DSSKPLCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDsskplcd() { return _columnDsskplcd; }
    /**
     * MFINF: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfinf() { return _columnMfinf; }
    /**
     * SFTHDES: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSfthdes() { return _columnSfthdes; }
    /**
     * CNFATCL: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCnfatcl() { return _columnCnfatcl; }
    /**
     * LASTGR: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastgr() { return _columnLastgr; }
    /**
     * SFLASTDES: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSflastdes() { return _columnSflastdes; }
    /**
     * SHNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShno() { return _columnShno; }
    /**
     * PLTNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPltno() { return _columnPltno; }
    /**
     * TRADELIVNO: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTradelivno() { return _columnTradelivno; }
    /**
     * BATJMFYM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatjmfym() { return _columnBatjmfym; }
    /**
     * SFFIL: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSffil() { return _columnSffil; }
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
        ls.add(columnPrimaryShippingDtlInfoId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnZzbukrs());
        ls.add(columnZzsndymd());
        ls.add(columnRcdid());
        ls.add(columnZzrefeno());
        ls.add(columnBnwhcd());
        ls.add(columnHdrid());
        ls.add(columnDtlno());
        ls.add(columnSpndda());
        ls.add(columnPdlgtm());
        ls.add(columnZzsendno());
        ls.add(columnPrcsorg());
        ls.add(columnEkgrp());
        ls.add(columnSpcd());
        ls.add(columnSpskplcd());
        ls.add(columnRccd());
        ls.add(columnRcskplcd());
        ls.add(columnZzrcvymd());
        ls.add(columnZzshtype());
        ls.add(columnAgcd());
        ls.add(columnZzcbxqty());
        ls.add(columnZzpltqty());
        ls.add(columnZztplqty());
        ls.add(columnZzshpcls());
        ls.add(columnZzrefe01());
        ls.add(columnZzrefe02());
        ls.add(columnZzrefe03());
        ls.add(columnZzrefe04());
        ls.add(columnZzrefe05());
        ls.add(columnZzrefe06());
        ls.add(columnZzrefe07());
        ls.add(columnZzrefe08());
        ls.add(columnZzrefe09());
        ls.add(columnZzrefe10());
        ls.add(columnDtlqa());
        ls.add(columnZzrefeno2());
        ls.add(columnOprtno());
        ls.add(columnBlocknm());
        ls.add(columnZzmatnr());
        ls.add(columnLotno());
        ls.add(columnQuanty());
        ls.add(columnGrpcsd());
        ls.add(columnSfpoqa());
        ls.add(columnDsskplcd());
        ls.add(columnMfinf());
        ls.add(columnSfthdes());
        ls.add(columnCnfatcl());
        ls.add(columnLastgr());
        ls.add(columnSflastdes());
        ls.add(columnShno());
        ls.add(columnPltno());
        ls.add(columnTradelivno());
        ls.add(columnBatjmfym());
        ls.add(columnSffil());
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
    protected UniqueInfo cpui() { return hpcpui(columnPrimaryShippingDtlInfoId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EPrimaryShippingDtlInfo"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EPrimaryShippingDtlInfoCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EPrimaryShippingDtlInfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EPrimaryShippingDtlInfo> getEntityType() { return EPrimaryShippingDtlInfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EPrimaryShippingDtlInfo newEntity() { return new EPrimaryShippingDtlInfo(); }
    public EPrimaryShippingDtlInfo newMyEntity() { return new EPrimaryShippingDtlInfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EPrimaryShippingDtlInfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EPrimaryShippingDtlInfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
