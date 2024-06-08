package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of E_MFCOMPANY as TABLE. <br>
 * 組織マスタ受信テーブル
 * <pre>
 * [primary-key]
 *     MFCOMPANY_ID
 *
 * [column]
 *     MFCOMPANY_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZORGNCD, ZZORGNID, ORGNMKJF, JTONFNF, ONFNHA, JTONFNH, ZZORGNAM, JTONANF, ONANHA, JTONANH, ANWHNM, IOORID, ORGPSNO, ADVCD, COUNC, ORGADR1, ORGTEL, ORTL2, ORGFAX, ZZHORGCD, ZZBASECD, CSADMAG, TAXOCD, UPTAXID, STATCID, STLNDID, ZZWHMGID, TSCPNM, DEPCD, CNLID, OTRNK, ORATTID1, ORATTID2, ORATTID3, ATTID1, ATTID2, ATTID3, ORATTID4, BSDID, RPBCD, FAUORGCD, AUORGCD, CSTCTCD, BIZARCD, FWCTCD, RDVDID, ZZABLYMD, BPTNID, SNKHG, TXCANSFG, CSNPT, TBSOCSTM, ODTSCD, LNARCD, SASASID, CMLRASID, CSOID, UPMN, CHNGYD, UPDTM, UPDIS, UPBMN, BCHNGYD, BUPDTM, UPOBMN, OBCHNGYD, OBUPDTM, ZZFRDATEH, ZZTODATEH, RCDUPDPS, UPDUSRID, UPDPOCD, OTCMPFG, TMCMPFG, STMID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFCOMPANY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long mfcompanyId = entity.getMfcompanyId();
 * Long receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String zzorgncd = entity.getZzorgncd();
 * String zzorgnid = entity.getZzorgnid();
 * String orgnmkjf = entity.getOrgnmkjf();
 * String jtonfnf = entity.getJtonfnf();
 * String onfnha = entity.getOnfnha();
 * String jtonfnh = entity.getJtonfnh();
 * String zzorgnam = entity.getZzorgnam();
 * String jtonanf = entity.getJtonanf();
 * String onanha = entity.getOnanha();
 * String jtonanh = entity.getJtonanh();
 * String anwhnm = entity.getAnwhnm();
 * String ioorid = entity.getIoorid();
 * String orgpsno = entity.getOrgpsno();
 * String advcd = entity.getAdvcd();
 * String counc = entity.getCounc();
 * String orgadr1 = entity.getOrgadr1();
 * String orgtel = entity.getOrgtel();
 * String ortl2 = entity.getOrtl2();
 * String orgfax = entity.getOrgfax();
 * String zzhorgcd = entity.getZzhorgcd();
 * String zzbasecd = entity.getZzbasecd();
 * String csadmag = entity.getCsadmag();
 * String taxocd = entity.getTaxocd();
 * String uptaxid = entity.getUptaxid();
 * String statcid = entity.getStatcid();
 * String stlndid = entity.getStlndid();
 * String zzwhmgid = entity.getZzwhmgid();
 * String tscpnm = entity.getTscpnm();
 * String depcd = entity.getDepcd();
 * String cnlid = entity.getCnlid();
 * String otrnk = entity.getOtrnk();
 * String orattid1 = entity.getOrattid1();
 * String orattid2 = entity.getOrattid2();
 * String orattid3 = entity.getOrattid3();
 * String attid1 = entity.getAttid1();
 * String attid2 = entity.getAttid2();
 * String attid3 = entity.getAttid3();
 * String orattid4 = entity.getOrattid4();
 * String bsdid = entity.getBsdid();
 * String rpbcd = entity.getRpbcd();
 * String fauorgcd = entity.getFauorgcd();
 * String auorgcd = entity.getAuorgcd();
 * String cstctcd = entity.getCstctcd();
 * String bizarcd = entity.getBizarcd();
 * String fwctcd = entity.getFwctcd();
 * String rdvdid = entity.getRdvdid();
 * String zzablymd = entity.getZzablymd();
 * String bptnid = entity.getBptnid();
 * String snkhg = entity.getSnkhg();
 * String txcansfg = entity.getTxcansfg();
 * String csnpt = entity.getCsnpt();
 * String tbsocstm = entity.getTbsocstm();
 * String odtscd = entity.getOdtscd();
 * String lnarcd = entity.getLnarcd();
 * String sasasid = entity.getSasasid();
 * String cmlrasid = entity.getCmlrasid();
 * String csoid = entity.getCsoid();
 * String upmn = entity.getUpmn();
 * String chngyd = entity.getChngyd();
 * String updtm = entity.getUpdtm();
 * String updis = entity.getUpdis();
 * String upbmn = entity.getUpbmn();
 * String bchngyd = entity.getBchngyd();
 * String bupdtm = entity.getBupdtm();
 * String upobmn = entity.getUpobmn();
 * String obchngyd = entity.getObchngyd();
 * String obupdtm = entity.getObupdtm();
 * String zzfrdateh = entity.getZzfrdateh();
 * String zztodateh = entity.getZztodateh();
 * String rcdupdps = entity.getRcdupdps();
 * String updusrid = entity.getUpdusrid();
 * String updpocd = entity.getUpdpocd();
 * String otcmpfg = entity.getOtcmpfg();
 * String tmcmpfg = entity.getTmcmpfg();
 * Long stmid = entity.getStmid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMfcompanyId(mfcompanyId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setZzorgncd(zzorgncd);
 * entity.setZzorgnid(zzorgnid);
 * entity.setOrgnmkjf(orgnmkjf);
 * entity.setJtonfnf(jtonfnf);
 * entity.setOnfnha(onfnha);
 * entity.setJtonfnh(jtonfnh);
 * entity.setZzorgnam(zzorgnam);
 * entity.setJtonanf(jtonanf);
 * entity.setOnanha(onanha);
 * entity.setJtonanh(jtonanh);
 * entity.setAnwhnm(anwhnm);
 * entity.setIoorid(ioorid);
 * entity.setOrgpsno(orgpsno);
 * entity.setAdvcd(advcd);
 * entity.setCounc(counc);
 * entity.setOrgadr1(orgadr1);
 * entity.setOrgtel(orgtel);
 * entity.setOrtl2(ortl2);
 * entity.setOrgfax(orgfax);
 * entity.setZzhorgcd(zzhorgcd);
 * entity.setZzbasecd(zzbasecd);
 * entity.setCsadmag(csadmag);
 * entity.setTaxocd(taxocd);
 * entity.setUptaxid(uptaxid);
 * entity.setStatcid(statcid);
 * entity.setStlndid(stlndid);
 * entity.setZzwhmgid(zzwhmgid);
 * entity.setTscpnm(tscpnm);
 * entity.setDepcd(depcd);
 * entity.setCnlid(cnlid);
 * entity.setOtrnk(otrnk);
 * entity.setOrattid1(orattid1);
 * entity.setOrattid2(orattid2);
 * entity.setOrattid3(orattid3);
 * entity.setAttid1(attid1);
 * entity.setAttid2(attid2);
 * entity.setAttid3(attid3);
 * entity.setOrattid4(orattid4);
 * entity.setBsdid(bsdid);
 * entity.setRpbcd(rpbcd);
 * entity.setFauorgcd(fauorgcd);
 * entity.setAuorgcd(auorgcd);
 * entity.setCstctcd(cstctcd);
 * entity.setBizarcd(bizarcd);
 * entity.setFwctcd(fwctcd);
 * entity.setRdvdid(rdvdid);
 * entity.setZzablymd(zzablymd);
 * entity.setBptnid(bptnid);
 * entity.setSnkhg(snkhg);
 * entity.setTxcansfg(txcansfg);
 * entity.setCsnpt(csnpt);
 * entity.setTbsocstm(tbsocstm);
 * entity.setOdtscd(odtscd);
 * entity.setLnarcd(lnarcd);
 * entity.setSasasid(sasasid);
 * entity.setCmlrasid(cmlrasid);
 * entity.setCsoid(csoid);
 * entity.setUpmn(upmn);
 * entity.setChngyd(chngyd);
 * entity.setUpdtm(updtm);
 * entity.setUpdis(updis);
 * entity.setUpbmn(upbmn);
 * entity.setBchngyd(bchngyd);
 * entity.setBupdtm(bupdtm);
 * entity.setUpobmn(upobmn);
 * entity.setObchngyd(obchngyd);
 * entity.setObupdtm(obupdtm);
 * entity.setZzfrdateh(zzfrdateh);
 * entity.setZztodateh(zztodateh);
 * entity.setRcdupdps(rcdupdps);
 * entity.setUpdusrid(updusrid);
 * entity.setUpdpocd(updpocd);
 * entity.setOtcmpfg(otcmpfg);
 * entity.setTmcmpfg(tmcmpfg);
 * entity.setStmid(stmid);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEMfcompany extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _mfcompanyId;

    /** RECEIVE_CD: {NotNull, bigint(19)} */
    protected Long _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[(0)]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[(0)]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** ZZORGNCD: {varchar(255)} */
    protected String _zzorgncd;

    /** ZZORGNID: {varchar(255)} */
    protected String _zzorgnid;

    /** ORGNMKJF: {varchar(255)} */
    protected String _orgnmkjf;

    /** JTONFNF: {varchar(255)} */
    protected String _jtonfnf;

    /** ONFNHA: {varchar(255)} */
    protected String _onfnha;

    /** JTONFNH: {varchar(255)} */
    protected String _jtonfnh;

    /** ZZORGNAM: {varchar(255)} */
    protected String _zzorgnam;

    /** JTONANF: {varchar(255)} */
    protected String _jtonanf;

    /** ONANHA: {varchar(255)} */
    protected String _onanha;

    /** JTONANH: {varchar(255)} */
    protected String _jtonanh;

    /** ANWHNM: {varchar(255)} */
    protected String _anwhnm;

    /** IOORID: {varchar(255)} */
    protected String _ioorid;

    /** ORGPSNO: {varchar(255)} */
    protected String _orgpsno;

    /** ADVCD: {varchar(255)} */
    protected String _advcd;

    /** COUNC: {varchar(255)} */
    protected String _counc;

    /** ORGADR1: {varchar(255)} */
    protected String _orgadr1;

    /** ORGTEL: {varchar(255)} */
    protected String _orgtel;

    /** ORTL2: {varchar(255)} */
    protected String _ortl2;

    /** ORGFAX: {varchar(255)} */
    protected String _orgfax;

    /** ZZHORGCD: {varchar(255)} */
    protected String _zzhorgcd;

    /** ZZBASECD: {varchar(255)} */
    protected String _zzbasecd;

    /** CSADMAG: {varchar(255)} */
    protected String _csadmag;

    /** TAXOCD: {varchar(255)} */
    protected String _taxocd;

    /** UPTAXID: {varchar(255)} */
    protected String _uptaxid;

    /** STATCID: {varchar(255)} */
    protected String _statcid;

    /** STLNDID: {varchar(255)} */
    protected String _stlndid;

    /** ZZWHMGID: {varchar(255)} */
    protected String _zzwhmgid;

    /** TSCPNM: {varchar(255)} */
    protected String _tscpnm;

    /** DEPCD: {varchar(255)} */
    protected String _depcd;

    /** CNLID: {varchar(255)} */
    protected String _cnlid;

    /** OTRNK: {varchar(255)} */
    protected String _otrnk;

    /** ORATTID1: {varchar(255)} */
    protected String _orattid1;

    /** ORATTID2: {varchar(255)} */
    protected String _orattid2;

    /** ORATTID3: {varchar(255)} */
    protected String _orattid3;

    /** ATTID1: {varchar(255)} */
    protected String _attid1;

    /** ATTID2: {varchar(255)} */
    protected String _attid2;

    /** ATTID3: {varchar(255)} */
    protected String _attid3;

    /** ORATTID4: {varchar(255)} */
    protected String _orattid4;

    /** BSDID: {varchar(255)} */
    protected String _bsdid;

    /** RPBCD: {varchar(255)} */
    protected String _rpbcd;

    /** FAUORGCD: {varchar(255)} */
    protected String _fauorgcd;

    /** AUORGCD: {varchar(255)} */
    protected String _auorgcd;

    /** CSTCTCD: {varchar(255)} */
    protected String _cstctcd;

    /** BIZARCD: {varchar(255)} */
    protected String _bizarcd;

    /** FWCTCD: {varchar(255)} */
    protected String _fwctcd;

    /** RDVDID: {varchar(255)} */
    protected String _rdvdid;

    /** ZZABLYMD: {varchar(255)} */
    protected String _zzablymd;

    /** BPTNID: {varchar(255)} */
    protected String _bptnid;

    /** SNKHG: {varchar(255)} */
    protected String _snkhg;

    /** TXCANSFG: {varchar(255)} */
    protected String _txcansfg;

    /** CSNPT: {varchar(255)} */
    protected String _csnpt;

    /** TBSOCSTM: {varchar(255)} */
    protected String _tbsocstm;

    /** ODTSCD: {varchar(255)} */
    protected String _odtscd;

    /** LNARCD: {varchar(255)} */
    protected String _lnarcd;

    /** SASASID: {varchar(255)} */
    protected String _sasasid;

    /** CMLRASID: {varchar(255)} */
    protected String _cmlrasid;

    /** CSOID: {varchar(255)} */
    protected String _csoid;

    /** UPMN: {varchar(255)} */
    protected String _upmn;

    /** CHNGYD: {varchar(255)} */
    protected String _chngyd;

    /** UPDTM: {varchar(255)} */
    protected String _updtm;

    /** UPDIS: {varchar(255)} */
    protected String _updis;

    /** UPBMN: {varchar(255)} */
    protected String _upbmn;

    /** BCHNGYD: {varchar(255)} */
    protected String _bchngyd;

    /** BUPDTM: {varchar(255)} */
    protected String _bupdtm;

    /** UPOBMN: {varchar(255)} */
    protected String _upobmn;

    /** OBCHNGYD: {varchar(255)} */
    protected String _obchngyd;

    /** OBUPDTM: {varchar(255)} */
    protected String _obupdtm;

    /** ZZFRDATEH: {varchar(255)} */
    protected String _zzfrdateh;

    /** ZZTODATEH: {varchar(255)} */
    protected String _zztodateh;

    /** RCDUPDPS: {varchar(255)} */
    protected String _rcdupdps;

    /** UPDUSRID: {varchar(255)} */
    protected String _updusrid;

    /** UPDPOCD: {varchar(255)} */
    protected String _updpocd;

    /** OTCMPFG: {varchar(255)} */
    protected String _otcmpfg;

    /** TMCMPFG: {varchar(255)} */
    protected String _tmcmpfg;

    /** STMID: {bigint(19)} */
    protected Long _stmid;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "E_MFCOMPANY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_mfcompanyId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEMfcompany) {
            BsEMfcompany other = (BsEMfcompany)obj;
            if (!xSV(_mfcompanyId, other._mfcompanyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mfcompanyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mfcompanyId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_zzorgnid));
        sb.append(dm).append(xfND(_orgnmkjf));
        sb.append(dm).append(xfND(_jtonfnf));
        sb.append(dm).append(xfND(_onfnha));
        sb.append(dm).append(xfND(_jtonfnh));
        sb.append(dm).append(xfND(_zzorgnam));
        sb.append(dm).append(xfND(_jtonanf));
        sb.append(dm).append(xfND(_onanha));
        sb.append(dm).append(xfND(_jtonanh));
        sb.append(dm).append(xfND(_anwhnm));
        sb.append(dm).append(xfND(_ioorid));
        sb.append(dm).append(xfND(_orgpsno));
        sb.append(dm).append(xfND(_advcd));
        sb.append(dm).append(xfND(_counc));
        sb.append(dm).append(xfND(_orgadr1));
        sb.append(dm).append(xfND(_orgtel));
        sb.append(dm).append(xfND(_ortl2));
        sb.append(dm).append(xfND(_orgfax));
        sb.append(dm).append(xfND(_zzhorgcd));
        sb.append(dm).append(xfND(_zzbasecd));
        sb.append(dm).append(xfND(_csadmag));
        sb.append(dm).append(xfND(_taxocd));
        sb.append(dm).append(xfND(_uptaxid));
        sb.append(dm).append(xfND(_statcid));
        sb.append(dm).append(xfND(_stlndid));
        sb.append(dm).append(xfND(_zzwhmgid));
        sb.append(dm).append(xfND(_tscpnm));
        sb.append(dm).append(xfND(_depcd));
        sb.append(dm).append(xfND(_cnlid));
        sb.append(dm).append(xfND(_otrnk));
        sb.append(dm).append(xfND(_orattid1));
        sb.append(dm).append(xfND(_orattid2));
        sb.append(dm).append(xfND(_orattid3));
        sb.append(dm).append(xfND(_attid1));
        sb.append(dm).append(xfND(_attid2));
        sb.append(dm).append(xfND(_attid3));
        sb.append(dm).append(xfND(_orattid4));
        sb.append(dm).append(xfND(_bsdid));
        sb.append(dm).append(xfND(_rpbcd));
        sb.append(dm).append(xfND(_fauorgcd));
        sb.append(dm).append(xfND(_auorgcd));
        sb.append(dm).append(xfND(_cstctcd));
        sb.append(dm).append(xfND(_bizarcd));
        sb.append(dm).append(xfND(_fwctcd));
        sb.append(dm).append(xfND(_rdvdid));
        sb.append(dm).append(xfND(_zzablymd));
        sb.append(dm).append(xfND(_bptnid));
        sb.append(dm).append(xfND(_snkhg));
        sb.append(dm).append(xfND(_txcansfg));
        sb.append(dm).append(xfND(_csnpt));
        sb.append(dm).append(xfND(_tbsocstm));
        sb.append(dm).append(xfND(_odtscd));
        sb.append(dm).append(xfND(_lnarcd));
        sb.append(dm).append(xfND(_sasasid));
        sb.append(dm).append(xfND(_cmlrasid));
        sb.append(dm).append(xfND(_csoid));
        sb.append(dm).append(xfND(_upmn));
        sb.append(dm).append(xfND(_chngyd));
        sb.append(dm).append(xfND(_updtm));
        sb.append(dm).append(xfND(_updis));
        sb.append(dm).append(xfND(_upbmn));
        sb.append(dm).append(xfND(_bchngyd));
        sb.append(dm).append(xfND(_bupdtm));
        sb.append(dm).append(xfND(_upobmn));
        sb.append(dm).append(xfND(_obchngyd));
        sb.append(dm).append(xfND(_obupdtm));
        sb.append(dm).append(xfND(_zzfrdateh));
        sb.append(dm).append(xfND(_zztodateh));
        sb.append(dm).append(xfND(_rcdupdps));
        sb.append(dm).append(xfND(_updusrid));
        sb.append(dm).append(xfND(_updpocd));
        sb.append(dm).append(xfND(_otcmpfg));
        sb.append(dm).append(xfND(_tmcmpfg));
        sb.append(dm).append(xfND(_stmid));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public EMfcompany clone() {
        return (EMfcompany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織マスタ受信ID
     * @return The value of the column 'MFCOMPANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMfcompanyId() {
        checkSpecifiedProperty("mfcompanyId");
        return _mfcompanyId;
    }

    /**
     * [set] MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 組織マスタ受信ID
     * @param mfcompanyId The value of the column 'MFCOMPANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMfcompanyId(Long mfcompanyId) {
        registerModifiedProperty("mfcompanyId");
        _mfcompanyId = mfcompanyId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, bigint(19)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {NotNull, bigint(19)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(Long receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {NotNull, bigint(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[(0)]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[(0)]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[(0)]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {varchar(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] ZZORGNCD: {varchar(255)} <br>
     * 組織コード
     * @return The value of the column 'ZZORGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzorgncd() {
        checkSpecifiedProperty("zzorgncd");
        return convertEmptyToNull(_zzorgncd);
    }

    /**
     * [set] ZZORGNCD: {varchar(255)} <br>
     * 組織コード
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzorgncd(String zzorgncd) {
        registerModifiedProperty("zzorgncd");
        _zzorgncd = zzorgncd;
    }

    /**
     * [get] ZZORGNID: {varchar(255)} <br>
     * 組織区分
     * @return The value of the column 'ZZORGNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzorgnid() {
        checkSpecifiedProperty("zzorgnid");
        return convertEmptyToNull(_zzorgnid);
    }

    /**
     * [set] ZZORGNID: {varchar(255)} <br>
     * 組織区分
     * @param zzorgnid The value of the column 'ZZORGNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzorgnid(String zzorgnid) {
        registerModifiedProperty("zzorgnid");
        _zzorgnid = zzorgnid;
    }

    /**
     * [get] ORGNMKJF: {varchar(255)} <br>
     * 組織名正称(TSN)(全角)
     * @return The value of the column 'ORGNMKJF'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgnmkjf() {
        checkSpecifiedProperty("orgnmkjf");
        return convertEmptyToNull(_orgnmkjf);
    }

    /**
     * [set] ORGNMKJF: {varchar(255)} <br>
     * 組織名正称(TSN)(全角)
     * @param orgnmkjf The value of the column 'ORGNMKJF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgnmkjf(String orgnmkjf) {
        registerModifiedProperty("orgnmkjf");
        _orgnmkjf = orgnmkjf;
    }

    /**
     * [get] JTONFNF: {varchar(255)} <br>
     * 組織名正称(JT)(全角)
     * @return The value of the column 'JTONFNF'. (NullAllowed even if selected: for no constraint)
     */
    public String getJtonfnf() {
        checkSpecifiedProperty("jtonfnf");
        return convertEmptyToNull(_jtonfnf);
    }

    /**
     * [set] JTONFNF: {varchar(255)} <br>
     * 組織名正称(JT)(全角)
     * @param jtonfnf The value of the column 'JTONFNF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJtonfnf(String jtonfnf) {
        registerModifiedProperty("jtonfnf");
        _jtonfnf = jtonfnf;
    }

    /**
     * [get] ONFNHA: {varchar(255)} <br>
     * 組織名正称(TSN)(半角)
     * @return The value of the column 'ONFNHA'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnfnha() {
        checkSpecifiedProperty("onfnha");
        return convertEmptyToNull(_onfnha);
    }

    /**
     * [set] ONFNHA: {varchar(255)} <br>
     * 組織名正称(TSN)(半角)
     * @param onfnha The value of the column 'ONFNHA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnfnha(String onfnha) {
        registerModifiedProperty("onfnha");
        _onfnha = onfnha;
    }

    /**
     * [get] JTONFNH: {varchar(255)} <br>
     * 組織名正称(JT)(半角)
     * @return The value of the column 'JTONFNH'. (NullAllowed even if selected: for no constraint)
     */
    public String getJtonfnh() {
        checkSpecifiedProperty("jtonfnh");
        return convertEmptyToNull(_jtonfnh);
    }

    /**
     * [set] JTONFNH: {varchar(255)} <br>
     * 組織名正称(JT)(半角)
     * @param jtonfnh The value of the column 'JTONFNH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJtonfnh(String jtonfnh) {
        registerModifiedProperty("jtonfnh");
        _jtonfnh = jtonfnh;
    }

    /**
     * [get] ZZORGNAM: {varchar(255)} <br>
     * 組織名略称(TSN)(全角)
     * @return The value of the column 'ZZORGNAM'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzorgnam() {
        checkSpecifiedProperty("zzorgnam");
        return convertEmptyToNull(_zzorgnam);
    }

    /**
     * [set] ZZORGNAM: {varchar(255)} <br>
     * 組織名略称(TSN)(全角)
     * @param zzorgnam The value of the column 'ZZORGNAM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzorgnam(String zzorgnam) {
        registerModifiedProperty("zzorgnam");
        _zzorgnam = zzorgnam;
    }

    /**
     * [get] JTONANF: {varchar(255)} <br>
     * 組織名略称(JT)(全角)
     * @return The value of the column 'JTONANF'. (NullAllowed even if selected: for no constraint)
     */
    public String getJtonanf() {
        checkSpecifiedProperty("jtonanf");
        return convertEmptyToNull(_jtonanf);
    }

    /**
     * [set] JTONANF: {varchar(255)} <br>
     * 組織名略称(JT)(全角)
     * @param jtonanf The value of the column 'JTONANF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJtonanf(String jtonanf) {
        registerModifiedProperty("jtonanf");
        _jtonanf = jtonanf;
    }

    /**
     * [get] ONANHA: {varchar(255)} <br>
     * 組織名略称(TSN)(半角)
     * @return The value of the column 'ONANHA'. (NullAllowed even if selected: for no constraint)
     */
    public String getOnanha() {
        checkSpecifiedProperty("onanha");
        return convertEmptyToNull(_onanha);
    }

    /**
     * [set] ONANHA: {varchar(255)} <br>
     * 組織名略称(TSN)(半角)
     * @param onanha The value of the column 'ONANHA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOnanha(String onanha) {
        registerModifiedProperty("onanha");
        _onanha = onanha;
    }

    /**
     * [get] JTONANH: {varchar(255)} <br>
     * 組織名略称(JT)(半角)
     * @return The value of the column 'JTONANH'. (NullAllowed even if selected: for no constraint)
     */
    public String getJtonanh() {
        checkSpecifiedProperty("jtonanh");
        return convertEmptyToNull(_jtonanh);
    }

    /**
     * [set] JTONANH: {varchar(255)} <br>
     * 組織名略称(JT)(半角)
     * @param jtonanh The value of the column 'JTONANH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJtonanh(String jtonanh) {
        registerModifiedProperty("jtonanh");
        _jtonanh = jtonanh;
    }

    /**
     * [get] ANWHNM: {varchar(255)} <br>
     * 短縮組織名
     * @return The value of the column 'ANWHNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAnwhnm() {
        checkSpecifiedProperty("anwhnm");
        return convertEmptyToNull(_anwhnm);
    }

    /**
     * [set] ANWHNM: {varchar(255)} <br>
     * 短縮組織名
     * @param anwhnm The value of the column 'ANWHNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAnwhnm(String anwhnm) {
        registerModifiedProperty("anwhnm");
        _anwhnm = anwhnm;
    }

    /**
     * [get] IOORID: {varchar(255)} <br>
     * 内外組織区分
     * @return The value of the column 'IOORID'. (NullAllowed even if selected: for no constraint)
     */
    public String getIoorid() {
        checkSpecifiedProperty("ioorid");
        return convertEmptyToNull(_ioorid);
    }

    /**
     * [set] IOORID: {varchar(255)} <br>
     * 内外組織区分
     * @param ioorid The value of the column 'IOORID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIoorid(String ioorid) {
        registerModifiedProperty("ioorid");
        _ioorid = ioorid;
    }

    /**
     * [get] ORGPSNO: {varchar(255)} <br>
     * 組織郵便番号
     * @return The value of the column 'ORGPSNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgpsno() {
        checkSpecifiedProperty("orgpsno");
        return convertEmptyToNull(_orgpsno);
    }

    /**
     * [set] ORGPSNO: {varchar(255)} <br>
     * 組織郵便番号
     * @param orgpsno The value of the column 'ORGPSNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgpsno(String orgpsno) {
        registerModifiedProperty("orgpsno");
        _orgpsno = orgpsno;
    }

    /**
     * [get] ADVCD: {varchar(255)} <br>
     * 都道府県コード
     * @return The value of the column 'ADVCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdvcd() {
        checkSpecifiedProperty("advcd");
        return convertEmptyToNull(_advcd);
    }

    /**
     * [set] ADVCD: {varchar(255)} <br>
     * 都道府県コード
     * @param advcd The value of the column 'ADVCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdvcd(String advcd) {
        registerModifiedProperty("advcd");
        _advcd = advcd;
    }

    /**
     * [get] COUNC: {varchar(255)} <br>
     * 市区町村コード
     * @return The value of the column 'COUNC'. (NullAllowed even if selected: for no constraint)
     */
    public String getCounc() {
        checkSpecifiedProperty("counc");
        return convertEmptyToNull(_counc);
    }

    /**
     * [set] COUNC: {varchar(255)} <br>
     * 市区町村コード
     * @param counc The value of the column 'COUNC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCounc(String counc) {
        registerModifiedProperty("counc");
        _counc = counc;
    }

    /**
     * [get] ORGADR1: {varchar(255)} <br>
     * 組織住所
     * @return The value of the column 'ORGADR1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgadr1() {
        checkSpecifiedProperty("orgadr1");
        return convertEmptyToNull(_orgadr1);
    }

    /**
     * [set] ORGADR1: {varchar(255)} <br>
     * 組織住所
     * @param orgadr1 The value of the column 'ORGADR1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgadr1(String orgadr1) {
        registerModifiedProperty("orgadr1");
        _orgadr1 = orgadr1;
    }

    /**
     * [get] ORGTEL: {varchar(255)} <br>
     * 組織電話番号
     * @return The value of the column 'ORGTEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgtel() {
        checkSpecifiedProperty("orgtel");
        return convertEmptyToNull(_orgtel);
    }

    /**
     * [set] ORGTEL: {varchar(255)} <br>
     * 組織電話番号
     * @param orgtel The value of the column 'ORGTEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgtel(String orgtel) {
        registerModifiedProperty("orgtel");
        _orgtel = orgtel;
    }

    /**
     * [get] ORTL2: {varchar(255)} <br>
     * 組織電話番号２
     * @return The value of the column 'ORTL2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrtl2() {
        checkSpecifiedProperty("ortl2");
        return convertEmptyToNull(_ortl2);
    }

    /**
     * [set] ORTL2: {varchar(255)} <br>
     * 組織電話番号２
     * @param ortl2 The value of the column 'ORTL2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrtl2(String ortl2) {
        registerModifiedProperty("ortl2");
        _ortl2 = ortl2;
    }

    /**
     * [get] ORGFAX: {varchar(255)} <br>
     * 組織ＦＡＸ番号
     * @return The value of the column 'ORGFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrgfax() {
        checkSpecifiedProperty("orgfax");
        return convertEmptyToNull(_orgfax);
    }

    /**
     * [set] ORGFAX: {varchar(255)} <br>
     * 組織ＦＡＸ番号
     * @param orgfax The value of the column 'ORGFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrgfax(String orgfax) {
        registerModifiedProperty("orgfax");
        _orgfax = orgfax;
    }

    /**
     * [get] ZZHORGCD: {varchar(255)} <br>
     * 上位組織コード
     * @return The value of the column 'ZZHORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzhorgcd() {
        checkSpecifiedProperty("zzhorgcd");
        return convertEmptyToNull(_zzhorgcd);
    }

    /**
     * [set] ZZHORGCD: {varchar(255)} <br>
     * 上位組織コード
     * @param zzhorgcd The value of the column 'ZZHORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzhorgcd(String zzhorgcd) {
        registerModifiedProperty("zzhorgcd");
        _zzhorgcd = zzhorgcd;
    }

    /**
     * [get] ZZBASECD: {varchar(255)} <br>
     * 基地圏コード
     * @return The value of the column 'ZZBASECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzbasecd() {
        checkSpecifiedProperty("zzbasecd");
        return convertEmptyToNull(_zzbasecd);
    }

    /**
     * [set] ZZBASECD: {varchar(255)} <br>
     * 基地圏コード
     * @param zzbasecd The value of the column 'ZZBASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzbasecd(String zzbasecd) {
        registerModifiedProperty("zzbasecd");
        _zzbasecd = zzbasecd;
    }

    /**
     * [get] CSADMAG: {varchar(255)} <br>
     * 委託管理業者
     * @return The value of the column 'CSADMAG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCsadmag() {
        checkSpecifiedProperty("csadmag");
        return convertEmptyToNull(_csadmag);
    }

    /**
     * [set] CSADMAG: {varchar(255)} <br>
     * 委託管理業者
     * @param csadmag The value of the column 'CSADMAG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsadmag(String csadmag) {
        registerModifiedProperty("csadmag");
        _csadmag = csadmag;
    }

    /**
     * [get] TAXOCD: {varchar(255)} <br>
     * 税務署コード
     * @return The value of the column 'TAXOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaxocd() {
        checkSpecifiedProperty("taxocd");
        return convertEmptyToNull(_taxocd);
    }

    /**
     * [set] TAXOCD: {varchar(255)} <br>
     * 税務署コード
     * @param taxocd The value of the column 'TAXOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxocd(String taxocd) {
        registerModifiedProperty("taxocd");
        _taxocd = taxocd;
    }

    /**
     * [get] UPTAXID: {varchar(255)} <br>
     * 未納税・課税区分
     * @return The value of the column 'UPTAXID'. (NullAllowed even if selected: for no constraint)
     */
    public String getUptaxid() {
        checkSpecifiedProperty("uptaxid");
        return convertEmptyToNull(_uptaxid);
    }

    /**
     * [set] UPTAXID: {varchar(255)} <br>
     * 未納税・課税区分
     * @param uptaxid The value of the column 'UPTAXID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUptaxid(String uptaxid) {
        registerModifiedProperty("uptaxid");
        _uptaxid = uptaxid;
    }

    /**
     * [get] STATCID: {varchar(255)} <br>
     * 詰所併設区分
     * @return The value of the column 'STATCID'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatcid() {
        checkSpecifiedProperty("statcid");
        return convertEmptyToNull(_statcid);
    }

    /**
     * [set] STATCID: {varchar(255)} <br>
     * 詰所併設区分
     * @param statcid The value of the column 'STATCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatcid(String statcid) {
        registerModifiedProperty("statcid");
        _statcid = statcid;
    }

    /**
     * [get] STLNDID: {varchar(255)} <br>
     * 詰所貸与区分
     * @return The value of the column 'STLNDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getStlndid() {
        checkSpecifiedProperty("stlndid");
        return convertEmptyToNull(_stlndid);
    }

    /**
     * [set] STLNDID: {varchar(255)} <br>
     * 詰所貸与区分
     * @param stlndid The value of the column 'STLNDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStlndid(String stlndid) {
        registerModifiedProperty("stlndid");
        _stlndid = stlndid;
    }

    /**
     * [get] ZZWHMGID: {varchar(255)} <br>
     * 倉庫機能区分
     * @return The value of the column 'ZZWHMGID'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzwhmgid() {
        checkSpecifiedProperty("zzwhmgid");
        return convertEmptyToNull(_zzwhmgid);
    }

    /**
     * [set] ZZWHMGID: {varchar(255)} <br>
     * 倉庫機能区分
     * @param zzwhmgid The value of the column 'ZZWHMGID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzwhmgid(String zzwhmgid) {
        registerModifiedProperty("zzwhmgid");
        _zzwhmgid = zzwhmgid;
    }

    /**
     * [get] TSCPNM: {varchar(255)} <br>
     * 関連会社名
     * @return The value of the column 'TSCPNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTscpnm() {
        checkSpecifiedProperty("tscpnm");
        return convertEmptyToNull(_tscpnm);
    }

    /**
     * [set] TSCPNM: {varchar(255)} <br>
     * 関連会社名
     * @param tscpnm The value of the column 'TSCPNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTscpnm(String tscpnm) {
        registerModifiedProperty("tscpnm");
        _tscpnm = tscpnm;
    }

    /**
     * [get] DEPCD: {varchar(255)} <br>
     * No
     * @return The value of the column 'DEPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepcd() {
        checkSpecifiedProperty("depcd");
        return convertEmptyToNull(_depcd);
    }

    /**
     * [set] DEPCD: {varchar(255)} <br>
     * No
     * @param depcd The value of the column 'DEPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepcd(String depcd) {
        registerModifiedProperty("depcd");
        _depcd = depcd;
    }

    /**
     * [get] CNLID: {varchar(255)} <br>
     * チャネル区分
     * @return The value of the column 'CNLID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCnlid() {
        checkSpecifiedProperty("cnlid");
        return convertEmptyToNull(_cnlid);
    }

    /**
     * [set] CNLID: {varchar(255)} <br>
     * チャネル区分
     * @param cnlid The value of the column 'CNLID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCnlid(String cnlid) {
        registerModifiedProperty("cnlid");
        _cnlid = cnlid;
    }

    /**
     * [get] OTRNK: {varchar(255)} <br>
     * 出力順
     * @return The value of the column 'OTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtrnk() {
        checkSpecifiedProperty("otrnk");
        return convertEmptyToNull(_otrnk);
    }

    /**
     * [set] OTRNK: {varchar(255)} <br>
     * 出力順
     * @param otrnk The value of the column 'OTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtrnk(String otrnk) {
        registerModifiedProperty("otrnk");
        _otrnk = otrnk;
    }

    /**
     * [get] ORATTID1: {varchar(255)} <br>
     * 倉庫機能区分2
     * @return The value of the column 'ORATTID1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrattid1() {
        checkSpecifiedProperty("orattid1");
        return convertEmptyToNull(_orattid1);
    }

    /**
     * [set] ORATTID1: {varchar(255)} <br>
     * 倉庫機能区分2
     * @param orattid1 The value of the column 'ORATTID1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrattid1(String orattid1) {
        registerModifiedProperty("orattid1");
        _orattid1 = orattid1;
    }

    /**
     * [get] ORATTID2: {varchar(255)} <br>
     * 倉庫属性区分
     * @return The value of the column 'ORATTID2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrattid2() {
        checkSpecifiedProperty("orattid2");
        return convertEmptyToNull(_orattid2);
    }

    /**
     * [set] ORATTID2: {varchar(255)} <br>
     * 倉庫属性区分
     * @param orattid2 The value of the column 'ORATTID2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrattid2(String orattid2) {
        registerModifiedProperty("orattid2");
        _orattid2 = orattid2;
    }

    /**
     * [get] ORATTID3: {varchar(255)} <br>
     * 倉庫在庫区分
     * @return The value of the column 'ORATTID3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrattid3() {
        checkSpecifiedProperty("orattid3");
        return convertEmptyToNull(_orattid3);
    }

    /**
     * [set] ORATTID3: {varchar(255)} <br>
     * 倉庫在庫区分
     * @param orattid3 The value of the column 'ORATTID3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrattid3(String orattid3) {
        registerModifiedProperty("orattid3");
        _orattid3 = orattid3;
    }

    /**
     * [get] ATTID1: {varchar(255)} <br>
     * 属性区分1
     * @return The value of the column 'ATTID1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttid1() {
        checkSpecifiedProperty("attid1");
        return convertEmptyToNull(_attid1);
    }

    /**
     * [set] ATTID1: {varchar(255)} <br>
     * 属性区分1
     * @param attid1 The value of the column 'ATTID1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttid1(String attid1) {
        registerModifiedProperty("attid1");
        _attid1 = attid1;
    }

    /**
     * [get] ATTID2: {varchar(255)} <br>
     * 属性区分2
     * @return The value of the column 'ATTID2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttid2() {
        checkSpecifiedProperty("attid2");
        return convertEmptyToNull(_attid2);
    }

    /**
     * [set] ATTID2: {varchar(255)} <br>
     * 属性区分2
     * @param attid2 The value of the column 'ATTID2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttid2(String attid2) {
        registerModifiedProperty("attid2");
        _attid2 = attid2;
    }

    /**
     * [get] ATTID3: {varchar(255)} <br>
     * 属性区分3
     * @return The value of the column 'ATTID3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAttid3() {
        checkSpecifiedProperty("attid3");
        return convertEmptyToNull(_attid3);
    }

    /**
     * [set] ATTID3: {varchar(255)} <br>
     * 属性区分3
     * @param attid3 The value of the column 'ATTID3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAttid3(String attid3) {
        registerModifiedProperty("attid3");
        _attid3 = attid3;
    }

    /**
     * [get] ORATTID4: {varchar(255)} <br>
     * 属性区分4
     * @return The value of the column 'ORATTID4'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrattid4() {
        checkSpecifiedProperty("orattid4");
        return convertEmptyToNull(_orattid4);
    }

    /**
     * [set] ORATTID4: {varchar(255)} <br>
     * 属性区分4
     * @param orattid4 The value of the column 'ORATTID4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrattid4(String orattid4) {
        registerModifiedProperty("orattid4");
        _orattid4 = orattid4;
    }

    /**
     * [get] BSDID: {varchar(255)} <br>
     * 支社事業所区分
     * @return The value of the column 'BSDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getBsdid() {
        checkSpecifiedProperty("bsdid");
        return convertEmptyToNull(_bsdid);
    }

    /**
     * [set] BSDID: {varchar(255)} <br>
     * 支社事業所区分
     * @param bsdid The value of the column 'BSDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBsdid(String bsdid) {
        registerModifiedProperty("bsdid");
        _bsdid = bsdid;
    }

    /**
     * [get] RPBCD: {varchar(255)} <br>
     * 申告支社コード
     * @return The value of the column 'RPBCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRpbcd() {
        checkSpecifiedProperty("rpbcd");
        return convertEmptyToNull(_rpbcd);
    }

    /**
     * [set] RPBCD: {varchar(255)} <br>
     * 申告支社コード
     * @param rpbcd The value of the column 'RPBCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRpbcd(String rpbcd) {
        registerModifiedProperty("rpbcd");
        _rpbcd = rpbcd;
    }

    /**
     * [get] FAUORGCD: {varchar(255)} <br>
     * 擬制会計単位組織コード
     * @return The value of the column 'FAUORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFauorgcd() {
        checkSpecifiedProperty("fauorgcd");
        return convertEmptyToNull(_fauorgcd);
    }

    /**
     * [set] FAUORGCD: {varchar(255)} <br>
     * 擬制会計単位組織コード
     * @param fauorgcd The value of the column 'FAUORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFauorgcd(String fauorgcd) {
        registerModifiedProperty("fauorgcd");
        _fauorgcd = fauorgcd;
    }

    /**
     * [get] AUORGCD: {varchar(255)} <br>
     * 会計単位組織コード
     * @return The value of the column 'AUORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAuorgcd() {
        checkSpecifiedProperty("auorgcd");
        return convertEmptyToNull(_auorgcd);
    }

    /**
     * [set] AUORGCD: {varchar(255)} <br>
     * 会計単位組織コード
     * @param auorgcd The value of the column 'AUORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAuorgcd(String auorgcd) {
        registerModifiedProperty("auorgcd");
        _auorgcd = auorgcd;
    }

    /**
     * [get] CSTCTCD: {varchar(255)} <br>
     * 原価センターコード
     * @return The value of the column 'CSTCTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCstctcd() {
        checkSpecifiedProperty("cstctcd");
        return convertEmptyToNull(_cstctcd);
    }

    /**
     * [set] CSTCTCD: {varchar(255)} <br>
     * 原価センターコード
     * @param cstctcd The value of the column 'CSTCTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCstctcd(String cstctcd) {
        registerModifiedProperty("cstctcd");
        _cstctcd = cstctcd;
    }

    /**
     * [get] BIZARCD: {varchar(255)} <br>
     * 事業領域コード
     * @return The value of the column 'BIZARCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBizarcd() {
        checkSpecifiedProperty("bizarcd");
        return convertEmptyToNull(_bizarcd);
    }

    /**
     * [set] BIZARCD: {varchar(255)} <br>
     * 事業領域コード
     * @param bizarcd The value of the column 'BIZARCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBizarcd(String bizarcd) {
        registerModifiedProperty("bizarcd");
        _bizarcd = bizarcd;
    }

    /**
     * [get] FWCTCD: {varchar(255)} <br>
     * CAPセンターコード
     * @return The value of the column 'FWCTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFwctcd() {
        checkSpecifiedProperty("fwctcd");
        return convertEmptyToNull(_fwctcd);
    }

    /**
     * [set] FWCTCD: {varchar(255)} <br>
     * CAPセンターコード
     * @param fwctcd The value of the column 'FWCTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFwctcd(String fwctcd) {
        registerModifiedProperty("fwctcd");
        _fwctcd = fwctcd;
    }

    /**
     * [get] RDVDID: {varchar(255)} <br>
     * SAP振分区分
     * @return The value of the column 'RDVDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getRdvdid() {
        checkSpecifiedProperty("rdvdid");
        return convertEmptyToNull(_rdvdid);
    }

    /**
     * [set] RDVDID: {varchar(255)} <br>
     * SAP振分区分
     * @param rdvdid The value of the column 'RDVDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRdvdid(String rdvdid) {
        registerModifiedProperty("rdvdid");
        _rdvdid = rdvdid;
    }

    /**
     * [get] ZZABLYMD: {varchar(255)} <br>
     * 廃止年月日
     * @return The value of the column 'ZZABLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzablymd() {
        checkSpecifiedProperty("zzablymd");
        return convertEmptyToNull(_zzablymd);
    }

    /**
     * [set] ZZABLYMD: {varchar(255)} <br>
     * 廃止年月日
     * @param zzablymd The value of the column 'ZZABLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzablymd(String zzablymd) {
        registerModifiedProperty("zzablymd");
        _zzablymd = zzablymd;
    }

    /**
     * [get] BPTNID: {varchar(255)} <br>
     * 営業日パターン区分
     * @return The value of the column 'BPTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getBptnid() {
        checkSpecifiedProperty("bptnid");
        return convertEmptyToNull(_bptnid);
    }

    /**
     * [set] BPTNID: {varchar(255)} <br>
     * 営業日パターン区分
     * @param bptnid The value of the column 'BPTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBptnid(String bptnid) {
        registerModifiedProperty("bptnid");
        _bptnid = bptnid;
    }

    /**
     * [get] SNKHG: {varchar(255)} <br>
     * 収入金上位組織コード
     * @return The value of the column 'SNKHG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSnkhg() {
        checkSpecifiedProperty("snkhg");
        return convertEmptyToNull(_snkhg);
    }

    /**
     * [set] SNKHG: {varchar(255)} <br>
     * 収入金上位組織コード
     * @param snkhg The value of the column 'SNKHG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSnkhg(String snkhg) {
        registerModifiedProperty("snkhg");
        _snkhg = snkhg;
    }

    /**
     * [get] TXCANSFG: {varchar(255)} <br>
     * 税計算対象外フラグ
     * @return The value of the column 'TXCANSFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTxcansfg() {
        checkSpecifiedProperty("txcansfg");
        return convertEmptyToNull(_txcansfg);
    }

    /**
     * [set] TXCANSFG: {varchar(255)} <br>
     * 税計算対象外フラグ
     * @param txcansfg The value of the column 'TXCANSFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTxcansfg(String txcansfg) {
        registerModifiedProperty("txcansfg");
        _txcansfg = txcansfg;
    }

    /**
     * [get] CSNPT: {varchar(255)} <br>
     * CAP発送パターン
     * @return The value of the column 'CSNPT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCsnpt() {
        checkSpecifiedProperty("csnpt");
        return convertEmptyToNull(_csnpt);
    }

    /**
     * [set] CSNPT: {varchar(255)} <br>
     * CAP発送パターン
     * @param csnpt The value of the column 'CSNPT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsnpt(String csnpt) {
        registerModifiedProperty("csnpt");
        _csnpt = csnpt;
    }

    /**
     * [get] TBSOCSTM: {varchar(255)} <br>
     * 引取受注締時刻
     * @return The value of the column 'TBSOCSTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTbsocstm() {
        checkSpecifiedProperty("tbsocstm");
        return convertEmptyToNull(_tbsocstm);
    }

    /**
     * [set] TBSOCSTM: {varchar(255)} <br>
     * 引取受注締時刻
     * @param tbsocstm The value of the column 'TBSOCSTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTbsocstm(String tbsocstm) {
        registerModifiedProperty("tbsocstm");
        _tbsocstm = tbsocstm;
    }

    /**
     * [get] ODTSCD: {varchar(255)} <br>
     * 旧TSコード
     * @return The value of the column 'ODTSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOdtscd() {
        checkSpecifiedProperty("odtscd");
        return convertEmptyToNull(_odtscd);
    }

    /**
     * [set] ODTSCD: {varchar(255)} <br>
     * 旧TSコード
     * @param odtscd The value of the column 'ODTSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOdtscd(String odtscd) {
        registerModifiedProperty("odtscd");
        _odtscd = odtscd;
    }

    /**
     * [get] LNARCD: {varchar(255)} <br>
     * 仕入エリアコード
     * @return The value of the column 'LNARCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLnarcd() {
        checkSpecifiedProperty("lnarcd");
        return convertEmptyToNull(_lnarcd);
    }

    /**
     * [set] LNARCD: {varchar(255)} <br>
     * 仕入エリアコード
     * @param lnarcd The value of the column 'LNARCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLnarcd(String lnarcd) {
        registerModifiedProperty("lnarcd");
        _lnarcd = lnarcd;
    }

    /**
     * [get] SASASID: {varchar(255)} <br>
     * 入出庫管理区分
     * @return The value of the column 'SASASID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSasasid() {
        checkSpecifiedProperty("sasasid");
        return convertEmptyToNull(_sasasid);
    }

    /**
     * [set] SASASID: {varchar(255)} <br>
     * 入出庫管理区分
     * @param sasasid The value of the column 'SASASID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSasasid(String sasasid) {
        registerModifiedProperty("sasasid");
        _sasasid = sasasid;
    }

    /**
     * [get] CMLRASID: {varchar(255)} <br>
     * 共通下位管理区分
     * @return The value of the column 'CMLRASID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmlrasid() {
        checkSpecifiedProperty("cmlrasid");
        return convertEmptyToNull(_cmlrasid);
    }

    /**
     * [set] CMLRASID: {varchar(255)} <br>
     * 共通下位管理区分
     * @param cmlrasid The value of the column 'CMLRASID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmlrasid(String cmlrasid) {
        registerModifiedProperty("cmlrasid");
        _cmlrasid = cmlrasid;
    }

    /**
     * [get] CSOID: {varchar(255)} <br>
     * ＣＡＰ受注停止区分
     * @return The value of the column 'CSOID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCsoid() {
        checkSpecifiedProperty("csoid");
        return convertEmptyToNull(_csoid);
    }

    /**
     * [set] CSOID: {varchar(255)} <br>
     * ＣＡＰ受注停止区分
     * @param csoid The value of the column 'CSOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCsoid(String csoid) {
        registerModifiedProperty("csoid");
        _csoid = csoid;
    }

    /**
     * [get] UPMN: {varchar(255)} <br>
     * 更新者
     * @return The value of the column 'UPMN'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpmn() {
        checkSpecifiedProperty("upmn");
        return convertEmptyToNull(_upmn);
    }

    /**
     * [set] UPMN: {varchar(255)} <br>
     * 更新者
     * @param upmn The value of the column 'UPMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpmn(String upmn) {
        registerModifiedProperty("upmn");
        _upmn = upmn;
    }

    /**
     * [get] CHNGYD: {varchar(255)} <br>
     * 更新年月日
     * @return The value of the column 'CHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getChngyd() {
        checkSpecifiedProperty("chngyd");
        return convertEmptyToNull(_chngyd);
    }

    /**
     * [set] CHNGYD: {varchar(255)} <br>
     * 更新年月日
     * @param chngyd The value of the column 'CHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChngyd(String chngyd) {
        registerModifiedProperty("chngyd");
        _chngyd = chngyd;
    }

    /**
     * [get] UPDTM: {varchar(255)} <br>
     * 更新時刻
     * @return The value of the column 'UPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdtm() {
        checkSpecifiedProperty("updtm");
        return convertEmptyToNull(_updtm);
    }

    /**
     * [set] UPDTM: {varchar(255)} <br>
     * 更新時刻
     * @param updtm The value of the column 'UPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdtm(String updtm) {
        registerModifiedProperty("updtm");
        _updtm = updtm;
    }

    /**
     * [get] UPDIS: {varchar(255)} <br>
     * 更新画面ID
     * @return The value of the column 'UPDIS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdis() {
        checkSpecifiedProperty("updis");
        return convertEmptyToNull(_updis);
    }

    /**
     * [set] UPDIS: {varchar(255)} <br>
     * 更新画面ID
     * @param updis The value of the column 'UPDIS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdis(String updis) {
        registerModifiedProperty("updis");
        _updis = updis;
    }

    /**
     * [get] UPBMN: {varchar(255)} <br>
     * バッチ更新者
     * @return The value of the column 'UPBMN'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpbmn() {
        checkSpecifiedProperty("upbmn");
        return convertEmptyToNull(_upbmn);
    }

    /**
     * [set] UPBMN: {varchar(255)} <br>
     * バッチ更新者
     * @param upbmn The value of the column 'UPBMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpbmn(String upbmn) {
        registerModifiedProperty("upbmn");
        _upbmn = upbmn;
    }

    /**
     * [get] BCHNGYD: {varchar(255)} <br>
     * バッチ更新年月日
     * @return The value of the column 'BCHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBchngyd() {
        checkSpecifiedProperty("bchngyd");
        return convertEmptyToNull(_bchngyd);
    }

    /**
     * [set] BCHNGYD: {varchar(255)} <br>
     * バッチ更新年月日
     * @param bchngyd The value of the column 'BCHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBchngyd(String bchngyd) {
        registerModifiedProperty("bchngyd");
        _bchngyd = bchngyd;
    }

    /**
     * [get] BUPDTM: {varchar(255)} <br>
     * バッチ更新時刻
     * @return The value of the column 'BUPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBupdtm() {
        checkSpecifiedProperty("bupdtm");
        return convertEmptyToNull(_bupdtm);
    }

    /**
     * [set] BUPDTM: {varchar(255)} <br>
     * バッチ更新時刻
     * @param bupdtm The value of the column 'BUPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBupdtm(String bupdtm) {
        registerModifiedProperty("bupdtm");
        _bupdtm = bupdtm;
    }

    /**
     * [get] UPOBMN: {varchar(255)} <br>
     * オンラインバッチ更新者
     * @return The value of the column 'UPOBMN'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpobmn() {
        checkSpecifiedProperty("upobmn");
        return convertEmptyToNull(_upobmn);
    }

    /**
     * [set] UPOBMN: {varchar(255)} <br>
     * オンラインバッチ更新者
     * @param upobmn The value of the column 'UPOBMN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpobmn(String upobmn) {
        registerModifiedProperty("upobmn");
        _upobmn = upobmn;
    }

    /**
     * [get] OBCHNGYD: {varchar(255)} <br>
     * オンラインバッチ更新年月日
     * @return The value of the column 'OBCHNGYD'. (NullAllowed even if selected: for no constraint)
     */
    public String getObchngyd() {
        checkSpecifiedProperty("obchngyd");
        return convertEmptyToNull(_obchngyd);
    }

    /**
     * [set] OBCHNGYD: {varchar(255)} <br>
     * オンラインバッチ更新年月日
     * @param obchngyd The value of the column 'OBCHNGYD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setObchngyd(String obchngyd) {
        registerModifiedProperty("obchngyd");
        _obchngyd = obchngyd;
    }

    /**
     * [get] OBUPDTM: {varchar(255)} <br>
     * オンラインバッチ更新時刻
     * @return The value of the column 'OBUPDTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getObupdtm() {
        checkSpecifiedProperty("obupdtm");
        return convertEmptyToNull(_obupdtm);
    }

    /**
     * [set] OBUPDTM: {varchar(255)} <br>
     * オンラインバッチ更新時刻
     * @param obupdtm The value of the column 'OBUPDTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setObupdtm(String obupdtm) {
        registerModifiedProperty("obupdtm");
        _obupdtm = obupdtm;
    }

    /**
     * [get] ZZFRDATEH: {varchar(255)} <br>
     * 適用開始年月日
     * @return The value of the column 'ZZFRDATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzfrdateh() {
        checkSpecifiedProperty("zzfrdateh");
        return convertEmptyToNull(_zzfrdateh);
    }

    /**
     * [set] ZZFRDATEH: {varchar(255)} <br>
     * 適用開始年月日
     * @param zzfrdateh The value of the column 'ZZFRDATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzfrdateh(String zzfrdateh) {
        registerModifiedProperty("zzfrdateh");
        _zzfrdateh = zzfrdateh;
    }

    /**
     * [get] ZZTODATEH: {varchar(255)} <br>
     * 適用終了年月日
     * @return The value of the column 'ZZTODATEH'. (NullAllowed even if selected: for no constraint)
     */
    public String getZztodateh() {
        checkSpecifiedProperty("zztodateh");
        return convertEmptyToNull(_zztodateh);
    }

    /**
     * [set] ZZTODATEH: {varchar(255)} <br>
     * 適用終了年月日
     * @param zztodateh The value of the column 'ZZTODATEH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZztodateh(String zztodateh) {
        registerModifiedProperty("zztodateh");
        _zztodateh = zztodateh;
    }

    /**
     * [get] RCDUPDPS: {varchar(255)} <br>
     * レコード更新処理区分
     * @return The value of the column 'RCDUPDPS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcdupdps() {
        checkSpecifiedProperty("rcdupdps");
        return convertEmptyToNull(_rcdupdps);
    }

    /**
     * [set] RCDUPDPS: {varchar(255)} <br>
     * レコード更新処理区分
     * @param rcdupdps The value of the column 'RCDUPDPS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcdupdps(String rcdupdps) {
        registerModifiedProperty("rcdupdps");
        _rcdupdps = rcdupdps;
    }

    /**
     * [get] UPDUSRID: {varchar(255)} <br>
     * レコード更新ユーザＩＤ
     * @return The value of the column 'UPDUSRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdusrid() {
        checkSpecifiedProperty("updusrid");
        return convertEmptyToNull(_updusrid);
    }

    /**
     * [set] UPDUSRID: {varchar(255)} <br>
     * レコード更新ユーザＩＤ
     * @param updusrid The value of the column 'UPDUSRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdusrid(String updusrid) {
        registerModifiedProperty("updusrid");
        _updusrid = updusrid;
    }

    /**
     * [get] UPDPOCD: {varchar(255)} <br>
     * レコード更新部署コード
     * @return The value of the column 'UPDPOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdpocd() {
        checkSpecifiedProperty("updpocd");
        return convertEmptyToNull(_updpocd);
    }

    /**
     * [set] UPDPOCD: {varchar(255)} <br>
     * レコード更新部署コード
     * @param updpocd The value of the column 'UPDPOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdpocd(String updpocd) {
        registerModifiedProperty("updpocd");
        _updpocd = updpocd;
    }

    /**
     * [get] OTCMPFG: {varchar(255)} <br>
     * 出力済フラグ
     * @return The value of the column 'OTCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtcmpfg() {
        checkSpecifiedProperty("otcmpfg");
        return convertEmptyToNull(_otcmpfg);
    }

    /**
     * [set] OTCMPFG: {varchar(255)} <br>
     * 出力済フラグ
     * @param otcmpfg The value of the column 'OTCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtcmpfg(String otcmpfg) {
        registerModifiedProperty("otcmpfg");
        _otcmpfg = otcmpfg;
    }

    /**
     * [get] TMCMPFG: {varchar(255)} <br>
     * 送信済フラグ
     * @return The value of the column 'TMCMPFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTmcmpfg() {
        checkSpecifiedProperty("tmcmpfg");
        return convertEmptyToNull(_tmcmpfg);
    }

    /**
     * [set] TMCMPFG: {varchar(255)} <br>
     * 送信済フラグ
     * @param tmcmpfg The value of the column 'TMCMPFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTmcmpfg(String tmcmpfg) {
        registerModifiedProperty("tmcmpfg");
        _tmcmpfg = tmcmpfg;
    }

    /**
     * [get] STMID: {bigint(19)} <br>
     * システム区分
     * @return The value of the column 'STMID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStmid() {
        checkSpecifiedProperty("stmid");
        return _stmid;
    }

    /**
     * [set] STMID: {bigint(19)} <br>
     * システム区分
     * @param stmid The value of the column 'STMID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStmid(Long stmid) {
        registerModifiedProperty("stmid");
        _stmid = stmid;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
