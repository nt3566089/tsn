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
 * The DB meta of E_MFCOMPANY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EMfcompanyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EMfcompanyDbm _instance = new EMfcompanyDbm();
    private EMfcompanyDbm() {}
    public static EMfcompanyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EMfcompany)et).getMfcompanyId(), (et, vl) -> ((EMfcompany)et).setMfcompanyId(ctl(vl)), "mfcompanyId");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getReceiveCd(), (et, vl) -> ((EMfcompany)et).setReceiveCd(ctl(vl)), "receiveCd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getReceiveRowId(), (et, vl) -> ((EMfcompany)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getImportFlg(), (et, vl) -> ((EMfcompany)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getErrorFlg(), (et, vl) -> ((EMfcompany)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getErrorMessageCd(), (et, vl) -> ((EMfcompany)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzorgncd(), (et, vl) -> ((EMfcompany)et).setZzorgncd((String)vl), "zzorgncd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzorgnid(), (et, vl) -> ((EMfcompany)et).setZzorgnid((String)vl), "zzorgnid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrgnmkjf(), (et, vl) -> ((EMfcompany)et).setOrgnmkjf((String)vl), "orgnmkjf");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getJtonfnf(), (et, vl) -> ((EMfcompany)et).setJtonfnf((String)vl), "jtonfnf");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOnfnha(), (et, vl) -> ((EMfcompany)et).setOnfnha((String)vl), "onfnha");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getJtonfnh(), (et, vl) -> ((EMfcompany)et).setJtonfnh((String)vl), "jtonfnh");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzorgnam(), (et, vl) -> ((EMfcompany)et).setZzorgnam((String)vl), "zzorgnam");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getJtonanf(), (et, vl) -> ((EMfcompany)et).setJtonanf((String)vl), "jtonanf");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOnanha(), (et, vl) -> ((EMfcompany)et).setOnanha((String)vl), "onanha");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getJtonanh(), (et, vl) -> ((EMfcompany)et).setJtonanh((String)vl), "jtonanh");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAnwhnm(), (et, vl) -> ((EMfcompany)et).setAnwhnm((String)vl), "anwhnm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getIoorid(), (et, vl) -> ((EMfcompany)et).setIoorid((String)vl), "ioorid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrgpsno(), (et, vl) -> ((EMfcompany)et).setOrgpsno((String)vl), "orgpsno");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAdvcd(), (et, vl) -> ((EMfcompany)et).setAdvcd((String)vl), "advcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCounc(), (et, vl) -> ((EMfcompany)et).setCounc((String)vl), "counc");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrgadr1(), (et, vl) -> ((EMfcompany)et).setOrgadr1((String)vl), "orgadr1");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrgtel(), (et, vl) -> ((EMfcompany)et).setOrgtel((String)vl), "orgtel");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrtl2(), (et, vl) -> ((EMfcompany)et).setOrtl2((String)vl), "ortl2");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrgfax(), (et, vl) -> ((EMfcompany)et).setOrgfax((String)vl), "orgfax");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzhorgcd(), (et, vl) -> ((EMfcompany)et).setZzhorgcd((String)vl), "zzhorgcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzbasecd(), (et, vl) -> ((EMfcompany)et).setZzbasecd((String)vl), "zzbasecd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCsadmag(), (et, vl) -> ((EMfcompany)et).setCsadmag((String)vl), "csadmag");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getTaxocd(), (et, vl) -> ((EMfcompany)et).setTaxocd((String)vl), "taxocd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUptaxid(), (et, vl) -> ((EMfcompany)et).setUptaxid((String)vl), "uptaxid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getStatcid(), (et, vl) -> ((EMfcompany)et).setStatcid((String)vl), "statcid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getStlndid(), (et, vl) -> ((EMfcompany)et).setStlndid((String)vl), "stlndid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzwhmgid(), (et, vl) -> ((EMfcompany)et).setZzwhmgid((String)vl), "zzwhmgid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getTscpnm(), (et, vl) -> ((EMfcompany)et).setTscpnm((String)vl), "tscpnm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getDepcd(), (et, vl) -> ((EMfcompany)et).setDepcd((String)vl), "depcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCnlid(), (et, vl) -> ((EMfcompany)et).setCnlid((String)vl), "cnlid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOtrnk(), (et, vl) -> ((EMfcompany)et).setOtrnk((String)vl), "otrnk");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrattid1(), (et, vl) -> ((EMfcompany)et).setOrattid1((String)vl), "orattid1");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrattid2(), (et, vl) -> ((EMfcompany)et).setOrattid2((String)vl), "orattid2");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrattid3(), (et, vl) -> ((EMfcompany)et).setOrattid3((String)vl), "orattid3");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAttid1(), (et, vl) -> ((EMfcompany)et).setAttid1((String)vl), "attid1");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAttid2(), (et, vl) -> ((EMfcompany)et).setAttid2((String)vl), "attid2");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAttid3(), (et, vl) -> ((EMfcompany)et).setAttid3((String)vl), "attid3");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOrattid4(), (et, vl) -> ((EMfcompany)et).setOrattid4((String)vl), "orattid4");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getBsdid(), (et, vl) -> ((EMfcompany)et).setBsdid((String)vl), "bsdid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getRpbcd(), (et, vl) -> ((EMfcompany)et).setRpbcd((String)vl), "rpbcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getFauorgcd(), (et, vl) -> ((EMfcompany)et).setFauorgcd((String)vl), "fauorgcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAuorgcd(), (et, vl) -> ((EMfcompany)et).setAuorgcd((String)vl), "auorgcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCstctcd(), (et, vl) -> ((EMfcompany)et).setCstctcd((String)vl), "cstctcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getBizarcd(), (et, vl) -> ((EMfcompany)et).setBizarcd((String)vl), "bizarcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getFwctcd(), (et, vl) -> ((EMfcompany)et).setFwctcd((String)vl), "fwctcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getRdvdid(), (et, vl) -> ((EMfcompany)et).setRdvdid((String)vl), "rdvdid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzablymd(), (et, vl) -> ((EMfcompany)et).setZzablymd((String)vl), "zzablymd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getBptnid(), (et, vl) -> ((EMfcompany)et).setBptnid((String)vl), "bptnid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getSnkhg(), (et, vl) -> ((EMfcompany)et).setSnkhg((String)vl), "snkhg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getTxcansfg(), (et, vl) -> ((EMfcompany)et).setTxcansfg((String)vl), "txcansfg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCsnpt(), (et, vl) -> ((EMfcompany)et).setCsnpt((String)vl), "csnpt");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getTbsocstm(), (et, vl) -> ((EMfcompany)et).setTbsocstm((String)vl), "tbsocstm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOdtscd(), (et, vl) -> ((EMfcompany)et).setOdtscd((String)vl), "odtscd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getLnarcd(), (et, vl) -> ((EMfcompany)et).setLnarcd((String)vl), "lnarcd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getSasasid(), (et, vl) -> ((EMfcompany)et).setSasasid((String)vl), "sasasid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCmlrasid(), (et, vl) -> ((EMfcompany)et).setCmlrasid((String)vl), "cmlrasid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getCsoid(), (et, vl) -> ((EMfcompany)et).setCsoid((String)vl), "csoid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpmn(), (et, vl) -> ((EMfcompany)et).setUpmn((String)vl), "upmn");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getChngyd(), (et, vl) -> ((EMfcompany)et).setChngyd((String)vl), "chngyd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdtm(), (et, vl) -> ((EMfcompany)et).setUpdtm((String)vl), "updtm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdis(), (et, vl) -> ((EMfcompany)et).setUpdis((String)vl), "updis");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpbmn(), (et, vl) -> ((EMfcompany)et).setUpbmn((String)vl), "upbmn");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getBchngyd(), (et, vl) -> ((EMfcompany)et).setBchngyd((String)vl), "bchngyd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getBupdtm(), (et, vl) -> ((EMfcompany)et).setBupdtm((String)vl), "bupdtm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpobmn(), (et, vl) -> ((EMfcompany)et).setUpobmn((String)vl), "upobmn");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getObchngyd(), (et, vl) -> ((EMfcompany)et).setObchngyd((String)vl), "obchngyd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getObupdtm(), (et, vl) -> ((EMfcompany)et).setObupdtm((String)vl), "obupdtm");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZzfrdateh(), (et, vl) -> ((EMfcompany)et).setZzfrdateh((String)vl), "zzfrdateh");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getZztodateh(), (et, vl) -> ((EMfcompany)et).setZztodateh((String)vl), "zztodateh");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getRcdupdps(), (et, vl) -> ((EMfcompany)et).setRcdupdps((String)vl), "rcdupdps");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdusrid(), (et, vl) -> ((EMfcompany)et).setUpdusrid((String)vl), "updusrid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdpocd(), (et, vl) -> ((EMfcompany)et).setUpdpocd((String)vl), "updpocd");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getOtcmpfg(), (et, vl) -> ((EMfcompany)et).setOtcmpfg((String)vl), "otcmpfg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getTmcmpfg(), (et, vl) -> ((EMfcompany)et).setTmcmpfg((String)vl), "tmcmpfg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getStmid(), (et, vl) -> ((EMfcompany)et).setStmid(ctl(vl)), "stmid");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getDelFlg(), (et, vl) -> ((EMfcompany)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getVersionNo(), (et, vl) -> ((EMfcompany)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getControlNo(), (et, vl) -> ((EMfcompany)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAddDt(), (et, vl) -> ((EMfcompany)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAddUser(), (et, vl) -> ((EMfcompany)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getAddProcess(), (et, vl) -> ((EMfcompany)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdDt(), (et, vl) -> ((EMfcompany)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdUser(), (et, vl) -> ((EMfcompany)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EMfcompany)et).getUpdProcess(), (et, vl) -> ((EMfcompany)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_MFCOMPANY";
    protected final String _tableDispName = "E_MFCOMPANY";
    protected final String _tablePropertyName = "EMfcompany";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_MFCOMPANY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfcompanyId = cci("MFCOMPANY_ID", "MFCOMPANY_ID", null, null, Long.class, "mfcompanyId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, Long.class, "receiveCd", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgncd = cci("ZZORGNCD", "ZZORGNCD", null, null, String.class, "zzorgncd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgnid = cci("ZZORGNID", "ZZORGNID", null, null, String.class, "zzorgnid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgnmkjf = cci("ORGNMKJF", "ORGNMKJF", null, null, String.class, "orgnmkjf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonfnf = cci("JTONFNF", "JTONFNF", null, null, String.class, "jtonfnf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnfnha = cci("ONFNHA", "ONFNHA", null, null, String.class, "onfnha", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonfnh = cci("JTONFNH", "JTONFNH", null, null, String.class, "jtonfnh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzorgnam = cci("ZZORGNAM", "ZZORGNAM", null, null, String.class, "zzorgnam", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonanf = cci("JTONANF", "JTONANF", null, null, String.class, "jtonanf", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnanha = cci("ONANHA", "ONANHA", null, null, String.class, "onanha", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJtonanh = cci("JTONANH", "JTONANH", null, null, String.class, "jtonanh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnwhnm = cci("ANWHNM", "ANWHNM", null, null, String.class, "anwhnm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIoorid = cci("IOORID", "IOORID", null, null, String.class, "ioorid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgpsno = cci("ORGPSNO", "ORGPSNO", null, null, String.class, "orgpsno", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdvcd = cci("ADVCD", "ADVCD", null, null, String.class, "advcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCounc = cci("COUNC", "COUNC", null, null, String.class, "counc", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgadr1 = cci("ORGADR1", "ORGADR1", null, null, String.class, "orgadr1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgtel = cci("ORGTEL", "ORGTEL", null, null, String.class, "orgtel", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrtl2 = cci("ORTL2", "ORTL2", null, null, String.class, "ortl2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrgfax = cci("ORGFAX", "ORGFAX", null, null, String.class, "orgfax", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzhorgcd = cci("ZZHORGCD", "ZZHORGCD", null, null, String.class, "zzhorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzbasecd = cci("ZZBASECD", "ZZBASECD", null, null, String.class, "zzbasecd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsadmag = cci("CSADMAG", "CSADMAG", null, null, String.class, "csadmag", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxocd = cci("TAXOCD", "TAXOCD", null, null, String.class, "taxocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUptaxid = cci("UPTAXID", "UPTAXID", null, null, String.class, "uptaxid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatcid = cci("STATCID", "STATCID", null, null, String.class, "statcid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStlndid = cci("STLNDID", "STLNDID", null, null, String.class, "stlndid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzwhmgid = cci("ZZWHMGID", "ZZWHMGID", null, null, String.class, "zzwhmgid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTscpnm = cci("TSCPNM", "TSCPNM", null, null, String.class, "tscpnm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepcd = cci("DEPCD", "DEPCD", null, null, String.class, "depcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCnlid = cci("CNLID", "CNLID", null, null, String.class, "cnlid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtrnk = cci("OTRNK", "OTRNK", null, null, String.class, "otrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid1 = cci("ORATTID1", "ORATTID1", null, null, String.class, "orattid1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid2 = cci("ORATTID2", "ORATTID2", null, null, String.class, "orattid2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid3 = cci("ORATTID3", "ORATTID3", null, null, String.class, "orattid3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid1 = cci("ATTID1", "ATTID1", null, null, String.class, "attid1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid2 = cci("ATTID2", "ATTID2", null, null, String.class, "attid2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttid3 = cci("ATTID3", "ATTID3", null, null, String.class, "attid3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrattid4 = cci("ORATTID4", "ORATTID4", null, null, String.class, "orattid4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBsdid = cci("BSDID", "BSDID", null, null, String.class, "bsdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRpbcd = cci("RPBCD", "RPBCD", null, null, String.class, "rpbcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFauorgcd = cci("FAUORGCD", "FAUORGCD", null, null, String.class, "fauorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuorgcd = cci("AUORGCD", "AUORGCD", null, null, String.class, "auorgcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCstctcd = cci("CSTCTCD", "CSTCTCD", null, null, String.class, "cstctcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBizarcd = cci("BIZARCD", "BIZARCD", null, null, String.class, "bizarcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwctcd = cci("FWCTCD", "FWCTCD", null, null, String.class, "fwctcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRdvdid = cci("RDVDID", "RDVDID", null, null, String.class, "rdvdid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzablymd = cci("ZZABLYMD", "ZZABLYMD", null, null, String.class, "zzablymd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBptnid = cci("BPTNID", "BPTNID", null, null, String.class, "bptnid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSnkhg = cci("SNKHG", "SNKHG", null, null, String.class, "snkhg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTxcansfg = cci("TXCANSFG", "TXCANSFG", null, null, String.class, "txcansfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsnpt = cci("CSNPT", "CSNPT", null, null, String.class, "csnpt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTbsocstm = cci("TBSOCSTM", "TBSOCSTM", null, null, String.class, "tbsocstm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOdtscd = cci("ODTSCD", "ODTSCD", null, null, String.class, "odtscd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLnarcd = cci("LNARCD", "LNARCD", null, null, String.class, "lnarcd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSasasid = cci("SASASID", "SASASID", null, null, String.class, "sasasid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmlrasid = cci("CMLRASID", "CMLRASID", null, null, String.class, "cmlrasid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsoid = cci("CSOID", "CSOID", null, null, String.class, "csoid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpmn = cci("UPMN", "UPMN", null, null, String.class, "upmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChngyd = cci("CHNGYD", "CHNGYD", null, null, String.class, "chngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdtm = cci("UPDTM", "UPDTM", null, null, String.class, "updtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdis = cci("UPDIS", "UPDIS", null, null, String.class, "updis", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpbmn = cci("UPBMN", "UPBMN", null, null, String.class, "upbmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBchngyd = cci("BCHNGYD", "BCHNGYD", null, null, String.class, "bchngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBupdtm = cci("BUPDTM", "BUPDTM", null, null, String.class, "bupdtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpobmn = cci("UPOBMN", "UPOBMN", null, null, String.class, "upobmn", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObchngyd = cci("OBCHNGYD", "OBCHNGYD", null, null, String.class, "obchngyd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnObupdtm = cci("OBUPDTM", "OBUPDTM", null, null, String.class, "obupdtm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZzfrdateh = cci("ZZFRDATEH", "ZZFRDATEH", null, null, String.class, "zzfrdateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZztodateh = cci("ZZTODATEH", "ZZTODATEH", null, null, String.class, "zztodateh", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcdupdps = cci("RCDUPDPS", "RCDUPDPS", null, null, String.class, "rcdupdps", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdusrid = cci("UPDUSRID", "UPDUSRID", null, null, String.class, "updusrid", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdpocd = cci("UPDPOCD", "UPDPOCD", null, null, String.class, "updpocd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtcmpfg = cci("OTCMPFG", "OTCMPFG", null, null, String.class, "otcmpfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTmcmpfg = cci("TMCMPFG", "TMCMPFG", null, null, String.class, "tmcmpfg", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStmid = cci("STMID", "STMID", null, null, Long.class, "stmid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfcompanyId() { return _columnMfcompanyId; }
    /**
     * RECEIVE_CD: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * ZZORGNCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzorgncd() { return _columnZzorgncd; }
    /**
     * ZZORGNID: {varchar(255)}
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
     * ONFNHA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnfnha() { return _columnOnfnha; }
    /**
     * JTONFNH: {varchar(255)}
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
     * ONANHA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnanha() { return _columnOnanha; }
    /**
     * JTONANH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJtonanh() { return _columnJtonanh; }
    /**
     * ANWHNM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnwhnm() { return _columnAnwhnm; }
    /**
     * IOORID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIoorid() { return _columnIoorid; }
    /**
     * ORGPSNO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgpsno() { return _columnOrgpsno; }
    /**
     * ADVCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdvcd() { return _columnAdvcd; }
    /**
     * COUNC: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCounc() { return _columnCounc; }
    /**
     * ORGADR1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgadr1() { return _columnOrgadr1; }
    /**
     * ORGTEL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrgtel() { return _columnOrgtel; }
    /**
     * ORTL2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrtl2() { return _columnOrtl2; }
    /**
     * ORGFAX: {varchar(255)}
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
     * UPTAXID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUptaxid() { return _columnUptaxid; }
    /**
     * STATCID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatcid() { return _columnStatcid; }
    /**
     * STLNDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStlndid() { return _columnStlndid; }
    /**
     * ZZWHMGID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzwhmgid() { return _columnZzwhmgid; }
    /**
     * TSCPNM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTscpnm() { return _columnTscpnm; }
    /**
     * DEPCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepcd() { return _columnDepcd; }
    /**
     * CNLID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCnlid() { return _columnCnlid; }
    /**
     * OTRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtrnk() { return _columnOtrnk; }
    /**
     * ORATTID1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid1() { return _columnOrattid1; }
    /**
     * ORATTID2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid2() { return _columnOrattid2; }
    /**
     * ORATTID3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid3() { return _columnOrattid3; }
    /**
     * ATTID1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid1() { return _columnAttid1; }
    /**
     * ATTID2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid2() { return _columnAttid2; }
    /**
     * ATTID3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttid3() { return _columnAttid3; }
    /**
     * ORATTID4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrattid4() { return _columnOrattid4; }
    /**
     * BSDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBsdid() { return _columnBsdid; }
    /**
     * RPBCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRpbcd() { return _columnRpbcd; }
    /**
     * FAUORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFauorgcd() { return _columnFauorgcd; }
    /**
     * AUORGCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuorgcd() { return _columnAuorgcd; }
    /**
     * CSTCTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCstctcd() { return _columnCstctcd; }
    /**
     * BIZARCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBizarcd() { return _columnBizarcd; }
    /**
     * FWCTCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwctcd() { return _columnFwctcd; }
    /**
     * RDVDID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRdvdid() { return _columnRdvdid; }
    /**
     * ZZABLYMD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzablymd() { return _columnZzablymd; }
    /**
     * BPTNID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBptnid() { return _columnBptnid; }
    /**
     * SNKHG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSnkhg() { return _columnSnkhg; }
    /**
     * TXCANSFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTxcansfg() { return _columnTxcansfg; }
    /**
     * CSNPT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsnpt() { return _columnCsnpt; }
    /**
     * TBSOCSTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTbsocstm() { return _columnTbsocstm; }
    /**
     * ODTSCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOdtscd() { return _columnOdtscd; }
    /**
     * LNARCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLnarcd() { return _columnLnarcd; }
    /**
     * SASASID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSasasid() { return _columnSasasid; }
    /**
     * CMLRASID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmlrasid() { return _columnCmlrasid; }
    /**
     * CSOID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsoid() { return _columnCsoid; }
    /**
     * UPMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpmn() { return _columnUpmn; }
    /**
     * CHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChngyd() { return _columnChngyd; }
    /**
     * UPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdtm() { return _columnUpdtm; }
    /**
     * UPDIS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdis() { return _columnUpdis; }
    /**
     * UPBMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpbmn() { return _columnUpbmn; }
    /**
     * BCHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBchngyd() { return _columnBchngyd; }
    /**
     * BUPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBupdtm() { return _columnBupdtm; }
    /**
     * UPOBMN: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpobmn() { return _columnUpobmn; }
    /**
     * OBCHNGYD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObchngyd() { return _columnObchngyd; }
    /**
     * OBUPDTM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnObupdtm() { return _columnObupdtm; }
    /**
     * ZZFRDATEH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZzfrdateh() { return _columnZzfrdateh; }
    /**
     * ZZTODATEH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZztodateh() { return _columnZztodateh; }
    /**
     * RCDUPDPS: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcdupdps() { return _columnRcdupdps; }
    /**
     * UPDUSRID: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdusrid() { return _columnUpdusrid; }
    /**
     * UPDPOCD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdpocd() { return _columnUpdpocd; }
    /**
     * OTCMPFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtcmpfg() { return _columnOtcmpfg; }
    /**
     * TMCMPFG: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTmcmpfg() { return _columnTmcmpfg; }
    /**
     * STMID: {bigint(19)}
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
        ls.add(columnMfcompanyId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnMfcompanyId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EMfcompany"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EMfcompanyCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EMfcompanyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EMfcompany> getEntityType() { return EMfcompany.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EMfcompany newEntity() { return new EMfcompany(); }
    public EMfcompany newMyEntity() { return new EMfcompany(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EMfcompany)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EMfcompany)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
