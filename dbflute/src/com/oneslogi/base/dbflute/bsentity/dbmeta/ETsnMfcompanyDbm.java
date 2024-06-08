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
 * The DB meta of E_TSN_MFCOMPANY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETsnMfcompanyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETsnMfcompanyDbm _instance = new ETsnMfcompanyDbm();
    private ETsnMfcompanyDbm() {}
    public static ETsnMfcompanyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTsnMfcompanyId(), (et, vl) -> ((ETsnMfcompany)et).setTsnMfcompanyId(ctl(vl)), "tsnMfcompanyId");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getImportFlg(), (et, vl) -> ((ETsnMfcompany)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzorgncd(), (et, vl) -> ((ETsnMfcompany)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzorgnid(), (et, vl) -> ((ETsnMfcompany)et).setZzorgnid((String)vl), "zzorgnid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrgnmkjf(), (et, vl) -> ((ETsnMfcompany)et).setOrgnmkjf((String)vl), "orgnmkjf");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getJtonfnf(), (et, vl) -> ((ETsnMfcompany)et).setJtonfnf((String)vl), "jtonfnf");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOnfnha(), (et, vl) -> ((ETsnMfcompany)et).setOnfnha((String)vl), "onfnha");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getJtonfnh(), (et, vl) -> ((ETsnMfcompany)et).setJtonfnh((String)vl), "jtonfnh");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzorgnam(), (et, vl) -> ((ETsnMfcompany)et).setZzorgnam((String)vl), "zzorgnam");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getJtonanf(), (et, vl) -> ((ETsnMfcompany)et).setJtonanf((String)vl), "jtonanf");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOnanha(), (et, vl) -> ((ETsnMfcompany)et).setOnanha((String)vl), "onanha");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getJtonanh(), (et, vl) -> ((ETsnMfcompany)et).setJtonanh((String)vl), "jtonanh");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAnwhnm(), (et, vl) -> ((ETsnMfcompany)et).setAnwhnm((String)vl), "anwhnm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getIoorid(), (et, vl) -> ((ETsnMfcompany)et).setIoorid((String)vl), "ioorid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrgpsno(), (et, vl) -> ((ETsnMfcompany)et).setOrgpsno((String)vl), "orgpsno");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAdvcd(), (et, vl) -> ((ETsnMfcompany)et).setAdvcd((String)vl), "advcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCounc(), (et, vl) -> ((ETsnMfcompany)et).setCounc((String)vl), "counc");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrgadr1(), (et, vl) -> ((ETsnMfcompany)et).setOrgadr1((String)vl), "orgadr1");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrgtel(), (et, vl) -> ((ETsnMfcompany)et).setOrgtel((String)vl), "orgtel");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrtl2(), (et, vl) -> ((ETsnMfcompany)et).setOrtl2((String)vl), "ortl2");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrgfax(), (et, vl) -> ((ETsnMfcompany)et).setOrgfax((String)vl), "orgfax");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzhorgcd(), (et, vl) -> ((ETsnMfcompany)et).setZzhorgcd((String)vl), "zzhorgcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzbasecd(), (et, vl) -> ((ETsnMfcompany)et).setZzbasecd((String)vl), "zzbasecd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCsadmag(), (et, vl) -> ((ETsnMfcompany)et).setCsadmag((String)vl), "csadmag");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTaxocd(), (et, vl) -> ((ETsnMfcompany)et).setTaxocd((String)vl), "taxocd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUptaxid(), (et, vl) -> ((ETsnMfcompany)et).setUptaxid((String)vl), "uptaxid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getStatcid(), (et, vl) -> ((ETsnMfcompany)et).setStatcid((String)vl), "statcid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getStlndid(), (et, vl) -> ((ETsnMfcompany)et).setStlndid((String)vl), "stlndid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzwhmgid(), (et, vl) -> ((ETsnMfcompany)et).setZzwhmgid((String)vl), "zzwhmgid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTscpnm(), (et, vl) -> ((ETsnMfcompany)et).setTscpnm((String)vl), "tscpnm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getDepcd(), (et, vl) -> ((ETsnMfcompany)et).setDepcd((String)vl), "depcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCnlid(), (et, vl) -> ((ETsnMfcompany)et).setCnlid((String)vl), "cnlid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOtrnk(), (et, vl) -> ((ETsnMfcompany)et).setOtrnk((String)vl), "otrnk");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrattid1(), (et, vl) -> ((ETsnMfcompany)et).setOrattid1((String)vl), "orattid1");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrattid2(), (et, vl) -> ((ETsnMfcompany)et).setOrattid2((String)vl), "orattid2");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrattid3(), (et, vl) -> ((ETsnMfcompany)et).setOrattid3((String)vl), "orattid3");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAttid1(), (et, vl) -> ((ETsnMfcompany)et).setAttid1((String)vl), "attid1");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAttid2(), (et, vl) -> ((ETsnMfcompany)et).setAttid2((String)vl), "attid2");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAttid3(), (et, vl) -> ((ETsnMfcompany)et).setAttid3((String)vl), "attid3");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOrattid4(), (et, vl) -> ((ETsnMfcompany)et).setOrattid4((String)vl), "orattid4");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getBsdid(), (et, vl) -> ((ETsnMfcompany)et).setBsdid((String)vl), "bsdid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getRpbcd(), (et, vl) -> ((ETsnMfcompany)et).setRpbcd((String)vl), "rpbcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getFauorgcd(), (et, vl) -> ((ETsnMfcompany)et).setFauorgcd((String)vl), "fauorgcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAuorgcd(), (et, vl) -> ((ETsnMfcompany)et).setAuorgcd((String)vl), "auorgcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCstctcd(), (et, vl) -> ((ETsnMfcompany)et).setCstctcd((String)vl), "cstctcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getBizarcd(), (et, vl) -> ((ETsnMfcompany)et).setBizarcd((String)vl), "bizarcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getFwctcd(), (et, vl) -> ((ETsnMfcompany)et).setFwctcd((String)vl), "fwctcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getRdvdid(), (et, vl) -> ((ETsnMfcompany)et).setRdvdid((String)vl), "rdvdid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzablymd(), (et, vl) -> ((ETsnMfcompany)et).setZzablymd((String)vl), "zzablymd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getBptnid(), (et, vl) -> ((ETsnMfcompany)et).setBptnid((String)vl), "bptnid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getSnkhg(), (et, vl) -> ((ETsnMfcompany)et).setSnkhg((String)vl), "snkhg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTxcansfg(), (et, vl) -> ((ETsnMfcompany)et).setTxcansfg((String)vl), "txcansfg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCsnpt(), (et, vl) -> ((ETsnMfcompany)et).setCsnpt((String)vl), "csnpt");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTbsocstm(), (et, vl) -> ((ETsnMfcompany)et).setTbsocstm((String)vl), "tbsocstm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOdtscd(), (et, vl) -> ((ETsnMfcompany)et).setOdtscd((String)vl), "odtscd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getLnarcd(), (et, vl) -> ((ETsnMfcompany)et).setLnarcd((String)vl), "lnarcd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getSasasid(), (et, vl) -> ((ETsnMfcompany)et).setSasasid((String)vl), "sasasid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCmlrasid(), (et, vl) -> ((ETsnMfcompany)et).setCmlrasid((String)vl), "cmlrasid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getCsoid(), (et, vl) -> ((ETsnMfcompany)et).setCsoid((String)vl), "csoid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpmn(), (et, vl) -> ((ETsnMfcompany)et).setUpmn(ctl(vl)), "upmn");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getChngyd(), (et, vl) -> ((ETsnMfcompany)et).setChngyd((String)vl), "chngyd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdtm(), (et, vl) -> ((ETsnMfcompany)et).setUpdtm((String)vl), "updtm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdis(), (et, vl) -> ((ETsnMfcompany)et).setUpdis(ctl(vl)), "updis");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpbmn(), (et, vl) -> ((ETsnMfcompany)et).setUpbmn(ctl(vl)), "upbmn");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getBchngyd(), (et, vl) -> ((ETsnMfcompany)et).setBchngyd((String)vl), "bchngyd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getBupdtm(), (et, vl) -> ((ETsnMfcompany)et).setBupdtm(ctl(vl)), "bupdtm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpobmn(), (et, vl) -> ((ETsnMfcompany)et).setUpobmn(ctl(vl)), "upobmn");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getObchngyd(), (et, vl) -> ((ETsnMfcompany)et).setObchngyd((String)vl), "obchngyd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getObupdtm(), (et, vl) -> ((ETsnMfcompany)et).setObupdtm(ctl(vl)), "obupdtm");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZzfrdateh(), (et, vl) -> ((ETsnMfcompany)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getZztodateh(), (et, vl) -> ((ETsnMfcompany)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getRcdupdps(), (et, vl) -> ((ETsnMfcompany)et).setRcdupdps((String)vl), "rcdupdps");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdusrid(), (et, vl) -> ((ETsnMfcompany)et).setUpdusrid(ctl(vl)), "updusrid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdpocd(), (et, vl) -> ((ETsnMfcompany)et).setUpdpocd((String)vl), "updpocd");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getOtcmpfg(), (et, vl) -> ((ETsnMfcompany)et).setOtcmpfg(ctb(vl)), "otcmpfg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getTmcmpfg(), (et, vl) -> ((ETsnMfcompany)et).setTmcmpfg(ctb(vl)), "tmcmpfg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getStmid(), (et, vl) -> ((ETsnMfcompany)et).setStmid((String)vl), "stmid");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getDelFlg(), (et, vl) -> ((ETsnMfcompany)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getVersionNo(), (et, vl) -> ((ETsnMfcompany)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getControlNo(), (et, vl) -> ((ETsnMfcompany)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAddDt(), (et, vl) -> ((ETsnMfcompany)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAddUser(), (et, vl) -> ((ETsnMfcompany)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getAddProcess(), (et, vl) -> ((ETsnMfcompany)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdDt(), (et, vl) -> ((ETsnMfcompany)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdUser(), (et, vl) -> ((ETsnMfcompany)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETsnMfcompany)et).getUpdProcess(), (et, vl) -> ((ETsnMfcompany)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TSN_MFCOMPANY";
    protected final String _tableDispName = "E_TSN_MFCOMPANY";
    protected final String _tablePropertyName = "ETsnMfcompany";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TSN_MFCOMPANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTsnMfcompanyId = cci("TSN_MFCOMPANY_ID", "TSN_MFCOMPANY_ID", null, null, Long.class, "tsnMfcompanyId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgnid = cci("ZZORGNID", "ZZORGNID", null, null, String.class, "zzorgnid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmkjf = cci("ORGNMKJF", "ORGNMKJF", null, null, String.class, "orgnmkjf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonfnf = cci("JTONFNF", "JTONFNF", null, null, String.class, "jtonfnf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnfnha = cci("ONFNHA", "ONFNHA", null, null, String.class, "onfnha", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonfnh = cci("JTONFNH", "JTONFNH", null, null, String.class, "jtonfnh", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgnam = cci("ZZORGNAM", "ZZORGNAM", null, null, String.class, "zzorgnam", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonanf = cci("JTONANF", "JTONANF", null, null, String.class, "jtonanf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnanha = cci("ONANHA", "ONANHA", null, null, String.class, "onanha", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonanh = cci("JTONANH", "JTONANH", null, null, String.class, "jtonanh", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnwhnm = cci("ANWHNM", "ANWHNM", null, null, String.class, "anwhnm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoorid = cci("IOORID", "IOORID", null, null, String.class, "ioorid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgpsno = cci("ORGPSNO", "ORGPSNO", null, null, String.class, "orgpsno", null, false, false, false, "varchar", 100, 0, null, "000-0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdvcd = cci("ADVCD", "ADVCD", null, null, String.class, "advcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCounc = cci("COUNC", "COUNC", null, null, String.class, "counc", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgadr1 = cci("ORGADR1", "ORGADR1", null, null, String.class, "orgadr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgtel = cci("ORGTEL", "ORGTEL", null, null, String.class, "orgtel", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrtl2 = cci("ORTL2", "ORTL2", null, null, String.class, "ortl2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgfax = cci("ORGFAX", "ORGFAX", null, null, String.class, "orgfax", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzhorgcd = cci("ZZHORGCD", "ZZHORGCD", null, null, String.class, "zzhorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzbasecd = cci("ZZBASECD", "ZZBASECD", null, null, String.class, "zzbasecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsadmag = cci("CSADMAG", "CSADMAG", null, null, String.class, "csadmag", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxocd = cci("TAXOCD", "TAXOCD", null, null, String.class, "taxocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUptaxid = cci("UPTAXID", "UPTAXID", null, null, String.class, "uptaxid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatcid = cci("STATCID", "STATCID", null, null, String.class, "statcid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStlndid = cci("STLNDID", "STLNDID", null, null, String.class, "stlndid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzwhmgid = cci("ZZWHMGID", "ZZWHMGID", null, null, String.class, "zzwhmgid", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTscpnm = cci("TSCPNM", "TSCPNM", null, null, String.class, "tscpnm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepcd = cci("DEPCD", "DEPCD", null, null, String.class, "depcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCnlid = cci("CNLID", "CNLID", null, null, String.class, "cnlid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtrnk = cci("OTRNK", "OTRNK", null, null, String.class, "otrnk", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid1 = cci("ORATTID1", "ORATTID1", null, null, String.class, "orattid1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid2 = cci("ORATTID2", "ORATTID2", null, null, String.class, "orattid2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid3 = cci("ORATTID3", "ORATTID3", null, null, String.class, "orattid3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid1 = cci("ATTID1", "ATTID1", null, null, String.class, "attid1", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid2 = cci("ATTID2", "ATTID2", null, null, String.class, "attid2", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid3 = cci("ATTID3", "ATTID3", null, null, String.class, "attid3", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid4 = cci("ORATTID4", "ORATTID4", null, null, String.class, "orattid4", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBsdid = cci("BSDID", "BSDID", null, null, String.class, "bsdid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRpbcd = cci("RPBCD", "RPBCD", null, null, String.class, "rpbcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFauorgcd = cci("FAUORGCD", "FAUORGCD", null, null, String.class, "fauorgcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuorgcd = cci("AUORGCD", "AUORGCD", null, null, String.class, "auorgcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCstctcd = cci("CSTCTCD", "CSTCTCD", null, null, String.class, "cstctcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizarcd = cci("BIZARCD", "BIZARCD", null, null, String.class, "bizarcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwctcd = cci("FWCTCD", "FWCTCD", null, null, String.class, "fwctcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRdvdid = cci("RDVDID", "RDVDID", null, null, String.class, "rdvdid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzablymd = cci("ZZABLYMD", "ZZABLYMD", null, null, String.class, "zzablymd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBptnid = cci("BPTNID", "BPTNID", null, null, String.class, "bptnid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnkhg = cci("SNKHG", "SNKHG", null, null, String.class, "snkhg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTxcansfg = cci("TXCANSFG", "TXCANSFG", null, null, String.class, "txcansfg", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsnpt = cci("CSNPT", "CSNPT", null, null, String.class, "csnpt", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTbsocstm = cci("TBSOCSTM", "TBSOCSTM", null, null, String.class, "tbsocstm", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOdtscd = cci("ODTSCD", "ODTSCD", null, null, String.class, "odtscd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLnarcd = cci("LNARCD", "LNARCD", null, null, String.class, "lnarcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSasasid = cci("SASASID", "SASASID", null, null, String.class, "sasasid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmlrasid = cci("CMLRASID", "CMLRASID", null, null, String.class, "cmlrasid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsoid = cci("CSOID", "CSOID", null, null, String.class, "csoid", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpmn = cci("UPMN", "UPMN", null, null, Long.class, "upmn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChngyd = cci("CHNGYD", "CHNGYD", null, null, String.class, "chngyd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdtm = cci("UPDTM", "UPDTM", null, null, String.class, "updtm", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdis = cci("UPDIS", "UPDIS", null, null, Long.class, "updis", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpbmn = cci("UPBMN", "UPBMN", null, null, Long.class, "upbmn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBchngyd = cci("BCHNGYD", "BCHNGYD", null, null, String.class, "bchngyd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBupdtm = cci("BUPDTM", "BUPDTM", null, null, Long.class, "bupdtm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpobmn = cci("UPOBMN", "UPOBMN", null, null, Long.class, "upobmn", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObchngyd = cci("OBCHNGYD", "OBCHNGYD", null, null, String.class, "obchngyd", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObupdtm = cci("OBUPDTM", "OBUPDTM", null, null, Long.class, "obupdtm", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcdupdps = cci("RCDUPDPS", "RCDUPDPS", null, null, String.class, "rcdupdps", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdusrid = cci("UPDUSRID", "UPDUSRID", null, null, Long.class, "updusrid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdpocd = cci("UPDPOCD", "UPDPOCD", null, null, String.class, "updpocd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtcmpfg = cci("OTCMPFG", "OTCMPFG", null, null, java.math.BigDecimal.class, "otcmpfg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTmcmpfg = cci("TMCMPFG", "TMCMPFG", null, null, java.math.BigDecimal.class, "tmcmpfg", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStmid = cci("STMID", "STMID", null, null, String.class, "stmid", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsnMfcompanyId() { return _columnTsnMfcompanyId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ZZORGNCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * ZZORGNID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgnid() { return _columnZzorgnid; }
    /**
     * ORGNMKJF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgnmkjf() { return _columnOrgnmkjf; }
    /**
     * JTONFNF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtonfnf() { return _columnJtonfnf; }
    /**
     * ONFNHA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnfnha() { return _columnOnfnha; }
    /**
     * JTONFNH: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtonfnh() { return _columnJtonfnh; }
    /**
     * ZZORGNAM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgnam() { return _columnZzorgnam; }
    /**
     * JTONANF: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtonanf() { return _columnJtonanf; }
    /**
     * ONANHA: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnanha() { return _columnOnanha; }
    /**
     * JTONANH: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtonanh() { return _columnJtonanh; }
    /**
     * ANWHNM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnwhnm() { return _columnAnwhnm; }
    /**
     * IOORID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoorid() { return _columnIoorid; }
    /**
     * ORGPSNO: {varchar(100), default=[000-0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgpsno() { return _columnOrgpsno; }
    /**
     * ADVCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdvcd() { return _columnAdvcd; }
    /**
     * COUNC: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCounc() { return _columnCounc; }
    /**
     * ORGADR1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgadr1() { return _columnOrgadr1; }
    /**
     * ORGTEL: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgtel() { return _columnOrgtel; }
    /**
     * ORTL2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrtl2() { return _columnOrtl2; }
    /**
     * ORGFAX: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgfax() { return _columnOrgfax; }
    /**
     * ZZHORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzhorgcd() { return _columnZzhorgcd; }
    /**
     * ZZBASECD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzbasecd() { return _columnZzbasecd; }
    /**
     * CSADMAG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsadmag() { return _columnCsadmag; }
    /**
     * TAXOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxocd() { return _columnTaxocd; }
    /**
     * UPTAXID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUptaxid() { return _columnUptaxid; }
    /**
     * STATCID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatcid() { return _columnStatcid; }
    /**
     * STLNDID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStlndid() { return _columnStlndid; }
    /**
     * ZZWHMGID: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzwhmgid() { return _columnZzwhmgid; }
    /**
     * TSCPNM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTscpnm() { return _columnTscpnm; }
    /**
     * DEPCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepcd() { return _columnDepcd; }
    /**
     * CNLID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCnlid() { return _columnCnlid; }
    /**
     * OTRNK: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtrnk() { return _columnOtrnk; }
    /**
     * ORATTID1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid1() { return _columnOrattid1; }
    /**
     * ORATTID2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid2() { return _columnOrattid2; }
    /**
     * ORATTID3: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid3() { return _columnOrattid3; }
    /**
     * ATTID1: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid1() { return _columnAttid1; }
    /**
     * ATTID2: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid2() { return _columnAttid2; }
    /**
     * ATTID3: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid3() { return _columnAttid3; }
    /**
     * ORATTID4: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid4() { return _columnOrattid4; }
    /**
     * BSDID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBsdid() { return _columnBsdid; }
    /**
     * RPBCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRpbcd() { return _columnRpbcd; }
    /**
     * FAUORGCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFauorgcd() { return _columnFauorgcd; }
    /**
     * AUORGCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuorgcd() { return _columnAuorgcd; }
    /**
     * CSTCTCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCstctcd() { return _columnCstctcd; }
    /**
     * BIZARCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizarcd() { return _columnBizarcd; }
    /**
     * FWCTCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwctcd() { return _columnFwctcd; }
    /**
     * RDVDID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRdvdid() { return _columnRdvdid; }
    /**
     * ZZABLYMD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzablymd() { return _columnZzablymd; }
    /**
     * BPTNID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBptnid() { return _columnBptnid; }
    /**
     * SNKHG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnkhg() { return _columnSnkhg; }
    /**
     * TXCANSFG: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTxcansfg() { return _columnTxcansfg; }
    /**
     * CSNPT: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsnpt() { return _columnCsnpt; }
    /**
     * TBSOCSTM: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTbsocstm() { return _columnTbsocstm; }
    /**
     * ODTSCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOdtscd() { return _columnOdtscd; }
    /**
     * LNARCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLnarcd() { return _columnLnarcd; }
    /**
     * SASASID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSasasid() { return _columnSasasid; }
    /**
     * CMLRASID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmlrasid() { return _columnCmlrasid; }
    /**
     * CSOID: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsoid() { return _columnCsoid; }
    /**
     * UPMN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpmn() { return _columnUpmn; }
    /**
     * CHNGYD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChngyd() { return _columnChngyd; }
    /**
     * UPDTM: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdtm() { return _columnUpdtm; }
    /**
     * UPDIS: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdis() { return _columnUpdis; }
    /**
     * UPBMN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpbmn() { return _columnUpbmn; }
    /**
     * BCHNGYD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBchngyd() { return _columnBchngyd; }
    /**
     * BUPDTM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBupdtm() { return _columnBupdtm; }
    /**
     * UPOBMN: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpobmn() { return _columnUpobmn; }
    /**
     * OBCHNGYD: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObchngyd() { return _columnObchngyd; }
    /**
     * OBUPDTM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObupdtm() { return _columnObupdtm; }
    /**
     * ZZFRDATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * RCDUPDPS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcdupdps() { return _columnRcdupdps; }
    /**
     * UPDUSRID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdusrid() { return _columnUpdusrid; }
    /**
     * UPDPOCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdpocd() { return _columnUpdpocd; }
    /**
     * OTCMPFG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtcmpfg() { return _columnOtcmpfg; }
    /**
     * TMCMPFG: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTmcmpfg() { return _columnTmcmpfg; }
    /**
     * STMID: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStmid() { return _columnStmid; }
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
        ls.add(columnTsnMfcompanyId());
        ls.add(columnImportFlg());
        ls.add(columnZzorgncd());
        ls.add(columnZzorgnid());
        ls.add(columnOrgnmkjf());
        ls.add(columnJtonfnf());
        ls.add(columnOnfnha());
        ls.add(columnJtonfnh());
        ls.add(columnZzorgnam());
        ls.add(columnJtonanf());
        ls.add(columnOnanha());
        ls.add(columnJtonanh());
        ls.add(columnAnwhnm());
        ls.add(columnIoorid());
        ls.add(columnOrgpsno());
        ls.add(columnAdvcd());
        ls.add(columnCounc());
        ls.add(columnOrgadr1());
        ls.add(columnOrgtel());
        ls.add(columnOrtl2());
        ls.add(columnOrgfax());
        ls.add(columnZzhorgcd());
        ls.add(columnZzbasecd());
        ls.add(columnCsadmag());
        ls.add(columnTaxocd());
        ls.add(columnUptaxid());
        ls.add(columnStatcid());
        ls.add(columnStlndid());
        ls.add(columnZzwhmgid());
        ls.add(columnTscpnm());
        ls.add(columnDepcd());
        ls.add(columnCnlid());
        ls.add(columnOtrnk());
        ls.add(columnOrattid1());
        ls.add(columnOrattid2());
        ls.add(columnOrattid3());
        ls.add(columnAttid1());
        ls.add(columnAttid2());
        ls.add(columnAttid3());
        ls.add(columnOrattid4());
        ls.add(columnBsdid());
        ls.add(columnRpbcd());
        ls.add(columnFauorgcd());
        ls.add(columnAuorgcd());
        ls.add(columnCstctcd());
        ls.add(columnBizarcd());
        ls.add(columnFwctcd());
        ls.add(columnRdvdid());
        ls.add(columnZzablymd());
        ls.add(columnBptnid());
        ls.add(columnSnkhg());
        ls.add(columnTxcansfg());
        ls.add(columnCsnpt());
        ls.add(columnTbsocstm());
        ls.add(columnOdtscd());
        ls.add(columnLnarcd());
        ls.add(columnSasasid());
        ls.add(columnCmlrasid());
        ls.add(columnCsoid());
        ls.add(columnUpmn());
        ls.add(columnChngyd());
        ls.add(columnUpdtm());
        ls.add(columnUpdis());
        ls.add(columnUpbmn());
        ls.add(columnBchngyd());
        ls.add(columnBupdtm());
        ls.add(columnUpobmn());
        ls.add(columnObchngyd());
        ls.add(columnObupdtm());
        ls.add(columnZzfrdateh());
        ls.add(columnZztodateh());
        ls.add(columnRcdupdps());
        ls.add(columnUpdusrid());
        ls.add(columnUpdpocd());
        ls.add(columnOtcmpfg());
        ls.add(columnTmcmpfg());
        ls.add(columnStmid());
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
    protected UniqueInfo cpui() { return hpcpui(columnTsnMfcompanyId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETsnMfcompany"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETsnMfcompanyCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETsnMfcompanyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETsnMfcompany> getEntityType() { return ETsnMfcompany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETsnMfcompany newEntity() { return new ETsnMfcompany(); }
    public ETsnMfcompany newMyEntity() { return new ETsnMfcompany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETsnMfcompany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETsnMfcompany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
