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
 * The entity of T_CORDDTAEC as TABLE. <br>
 * さしずデータ(取替用）
 * <pre>
 * [primary-key]
 *     ORDER_CHANGE_ID
 *
 * [column]
 *     ORDER_CHANGE_ID, ORDER_H_ID, SRWHCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, HPYNID, IPYNID, SRDED, SRPSTNID, SRYMD, SROPRTCNT, SRLINCD, SRRNK, DLVSNM, DLVDTLSNM, SSCD, SSNM, HDVID, DTLSNM, ZZMATNR, SLQACB, SLQACT, SLQANUM, LINBLK, LOCNO, LOCID, DLVPRTRNK, SRDLVYMD, SRHPYNID, SRIPYNID, SRSRLINCD, SRSRRNK, SRDLVSNM, SRDLVDTLSNM, SRDLVPRTRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, TTSROPRTCNT, BXMTRID, SPPLYMD, SLPTYP, SEQNO, OTORGCD, ORDORGCD, RLYBSCD, DLVRNK, LMPDLVNO, DIVMTD, SLEDIV, HVRTRSN, HVRTINOTYMD, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, SLPOTYMD, CMPCD, STSCD, STGVAL, SLPNO, TTTOPDEDRNK, CORDRCVCNT, ORDDVFG, LBCBQA, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, IKEIINCLDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_CHANGE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_CORDHDR
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tCordhdr
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long orderChangeId = entity.getOrderChangeId();
 * Long orderHId = entity.getOrderHId();
 * String srwhcd = entity.getSrwhcd();
 * String dpcd = entity.getDpcd();
 * String zzordymd = entity.getZzordymd();
 * String ordgr = entity.getOrdgr();
 * String dlvymd = entity.getDlvymd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String scddlvymd = entity.getScddlvymd();
 * String scdded = entity.getScdded();
 * String scdpstnid = entity.getScdpstnid();
 * String hpynid = entity.getHpynid();
 * String ipynid = entity.getIpynid();
 * String srded = entity.getSrded();
 * String srpstnid = entity.getSrpstnid();
 * String srymd = entity.getSrymd();
 * Long sroprtcnt = entity.getSroprtcnt();
 * String srlincd = entity.getSrlincd();
 * Long srrnk = entity.getSrrnk();
 * Long dlvsnm = entity.getDlvsnm();
 * Long dlvdtlsnm = entity.getDlvdtlsnm();
 * String sscd = entity.getSscd();
 * String ssnm = entity.getSsnm();
 * String hdvid = entity.getHdvid();
 * String dtlsnm = entity.getDtlsnm();
 * String zzmatnr = entity.getZzmatnr();
 * Long slqacb = entity.getSlqacb();
 * Long slqact = entity.getSlqact();
 * Long slqanum = entity.getSlqanum();
 * String linblk = entity.getLinblk();
 * String locno = entity.getLocno();
 * String locid = entity.getLocid();
 * Long dlvprtrnk = entity.getDlvprtrnk();
 * String srdlvymd = entity.getSrdlvymd();
 * String srhpynid = entity.getSrhpynid();
 * String sripynid = entity.getSripynid();
 * String srsrlincd = entity.getSrsrlincd();
 * Long srsrrnk = entity.getSrsrrnk();
 * Long srdlvsnm = entity.getSrdlvsnm();
 * java.math.BigDecimal srdlvdtlsnm = entity.getSrdlvdtlsnm();
 * Long srdlvprtrnk = entity.getSrdlvprtrnk();
 * String brtyp = entity.getBrtyp();
 * String boxno = entity.getBoxno();
 * String boxnocnsnm = entity.getBoxnocnsnm();
 * String boxtyp = entity.getBoxtyp();
 * String mgboxdid = entity.getMgboxdid();
 * String dmdid = entity.getDmdid();
 * Long ttboxqa = entity.getTtboxqa();
 * Long boxctqata = entity.getBoxctqata();
 * Long boxctqaapsrplc = entity.getBoxctqaapsrplc();
 * Long ttsroprtcnt = entity.getTtsroprtcnt();
 * String bxmtrid = entity.getBxmtrid();
 * String spplymd = entity.getSpplymd();
 * String slptyp = entity.getSlptyp();
 * Long seqno = entity.getSeqno();
 * String otorgcd = entity.getOtorgcd();
 * String ordorgcd = entity.getOrdorgcd();
 * String rlybscd = entity.getRlybscd();
 * String dlvrnk = entity.getDlvrnk();
 * String lmpdlvno = entity.getLmpdlvno();
 * String divmtd = entity.getDivmtd();
 * String slediv = entity.getSlediv();
 * String hvrtrsn = entity.getHvrtrsn();
 * String hvrtinotymd = entity.getHvrtinotymd();
 * String cngprtslpno = entity.getCngprtslpno();
 * String trnsctndiv = entity.getTrnsctndiv();
 * String eosordaftflg = entity.getEosordaftflg();
 * String eosslpno = entity.getEosslpno();
 * String hdrdbxdiv = entity.getHdrdbxdiv();
 * String inotrfsldiv = entity.getInotrfsldiv();
 * String bxmntrfsldiv = entity.getBxmntrfsldiv();
 * String slpmrgtmg = entity.getSlpmrgtmg();
 * String slpotymd = entity.getSlpotymd();
 * String cmpcd = entity.getCmpcd();
 * String stscd = entity.getStscd();
 * Long stgval = entity.getStgval();
 * String slpno = entity.getSlpno();
 * Long tttopdedrnk = entity.getTttopdedrnk();
 * Long cordrcvcnt = entity.getCordrcvcnt();
 * String orddvfg = entity.getOrddvfg();
 * Long lbcbqa = entity.getLbcbqa();
 * String drclstlbcbid = entity.getDrclstlbcbid();
 * Long lbboxno = entity.getLbboxno();
 * Long lbttboxqa = entity.getLbttboxqa();
 * String ikeiincldflg = entity.getIkeiincldflg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setOrderChangeId(orderChangeId);
 * entity.setOrderHId(orderHId);
 * entity.setSrwhcd(srwhcd);
 * entity.setDpcd(dpcd);
 * entity.setZzordymd(zzordymd);
 * entity.setOrdgr(ordgr);
 * entity.setDlvymd(dlvymd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setScddlvymd(scddlvymd);
 * entity.setScdded(scdded);
 * entity.setScdpstnid(scdpstnid);
 * entity.setHpynid(hpynid);
 * entity.setIpynid(ipynid);
 * entity.setSrded(srded);
 * entity.setSrpstnid(srpstnid);
 * entity.setSrymd(srymd);
 * entity.setSroprtcnt(sroprtcnt);
 * entity.setSrlincd(srlincd);
 * entity.setSrrnk(srrnk);
 * entity.setDlvsnm(dlvsnm);
 * entity.setDlvdtlsnm(dlvdtlsnm);
 * entity.setSscd(sscd);
 * entity.setSsnm(ssnm);
 * entity.setHdvid(hdvid);
 * entity.setDtlsnm(dtlsnm);
 * entity.setZzmatnr(zzmatnr);
 * entity.setSlqacb(slqacb);
 * entity.setSlqact(slqact);
 * entity.setSlqanum(slqanum);
 * entity.setLinblk(linblk);
 * entity.setLocno(locno);
 * entity.setLocid(locid);
 * entity.setDlvprtrnk(dlvprtrnk);
 * entity.setSrdlvymd(srdlvymd);
 * entity.setSrhpynid(srhpynid);
 * entity.setSripynid(sripynid);
 * entity.setSrsrlincd(srsrlincd);
 * entity.setSrsrrnk(srsrrnk);
 * entity.setSrdlvsnm(srdlvsnm);
 * entity.setSrdlvdtlsnm(srdlvdtlsnm);
 * entity.setSrdlvprtrnk(srdlvprtrnk);
 * entity.setBrtyp(brtyp);
 * entity.setBoxno(boxno);
 * entity.setBoxnocnsnm(boxnocnsnm);
 * entity.setBoxtyp(boxtyp);
 * entity.setMgboxdid(mgboxdid);
 * entity.setDmdid(dmdid);
 * entity.setTtboxqa(ttboxqa);
 * entity.setBoxctqata(boxctqata);
 * entity.setBoxctqaapsrplc(boxctqaapsrplc);
 * entity.setTtsroprtcnt(ttsroprtcnt);
 * entity.setBxmtrid(bxmtrid);
 * entity.setSpplymd(spplymd);
 * entity.setSlptyp(slptyp);
 * entity.setSeqno(seqno);
 * entity.setOtorgcd(otorgcd);
 * entity.setOrdorgcd(ordorgcd);
 * entity.setRlybscd(rlybscd);
 * entity.setDlvrnk(dlvrnk);
 * entity.setLmpdlvno(lmpdlvno);
 * entity.setDivmtd(divmtd);
 * entity.setSlediv(slediv);
 * entity.setHvrtrsn(hvrtrsn);
 * entity.setHvrtinotymd(hvrtinotymd);
 * entity.setCngprtslpno(cngprtslpno);
 * entity.setTrnsctndiv(trnsctndiv);
 * entity.setEosordaftflg(eosordaftflg);
 * entity.setEosslpno(eosslpno);
 * entity.setHdrdbxdiv(hdrdbxdiv);
 * entity.setInotrfsldiv(inotrfsldiv);
 * entity.setBxmntrfsldiv(bxmntrfsldiv);
 * entity.setSlpmrgtmg(slpmrgtmg);
 * entity.setSlpotymd(slpotymd);
 * entity.setCmpcd(cmpcd);
 * entity.setStscd(stscd);
 * entity.setStgval(stgval);
 * entity.setSlpno(slpno);
 * entity.setTttopdedrnk(tttopdedrnk);
 * entity.setCordrcvcnt(cordrcvcnt);
 * entity.setOrddvfg(orddvfg);
 * entity.setLbcbqa(lbcbqa);
 * entity.setDrclstlbcbid(drclstlbcbid);
 * entity.setLbboxno(lbboxno);
 * entity.setLbttboxqa(lbttboxqa);
 * entity.setIkeiincldflg(ikeiincldflg);
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
public abstract class BsTCorddtaec extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _orderChangeId;

    /** ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} */
    protected Long _orderHId;

    /** SRWHCD: {NotNull, varchar(30)} */
    protected String _srwhcd;

    /** DPCD: {NotNull, varchar(30)} */
    protected String _dpcd;

    /** ZZORDYMD: {NotNull, varchar(8)} */
    protected String _zzordymd;

    /** ORDGR: {NotNull, varchar(30)} */
    protected String _ordgr;

    /** DLVYMD: {NotNull, varchar(8)} */
    protected String _dlvymd;

    /** DED: {NotNull, varchar(30)} */
    protected String _ded;

    /** PSTNID: {NotNull, varchar(30)} */
    protected String _pstnid;

    /** SCDDLVYMD: {varchar(8)} */
    protected String _scddlvymd;

    /** SCDDED: {NotNull, varchar(30)} */
    protected String _scdded;

    /** SCDPSTNID: {varchar(30)} */
    protected String _scdpstnid;

    /** HPYNID: {char(1)} */
    protected String _hpynid;

    /** IPYNID: {char(1)} */
    protected String _ipynid;

    /** SRDED: {varchar(30)} */
    protected String _srded;

    /** SRPSTNID: {varchar(30)} */
    protected String _srpstnid;

    /** SRYMD: {NotNull, varchar(8)} */
    protected String _srymd;

    /** SROPRTCNT: {NotNull, bigint(19)} */
    protected Long _sroprtcnt;

    /** SRLINCD: {varchar(30)} */
    protected String _srlincd;

    /** SRRNK: {bigint(19)} */
    protected Long _srrnk;

    /** DLVSNM: {bigint(19)} */
    protected Long _dlvsnm;

    /** DLVDTLSNM: {bigint(19)} */
    protected Long _dlvdtlsnm;

    /** SSCD: {NotNull, varchar(30)} */
    protected String _sscd;

    /** SSNM: {varchar(60)} */
    protected String _ssnm;

    /** HDVID: {char(1)} */
    protected String _hdvid;

    /** DTLSNM: {varchar(30)} */
    protected String _dtlsnm;

    /** ZZMATNR: {NotNull, varchar(30)} */
    protected String _zzmatnr;

    /** SLQACB: {bigint(19)} */
    protected Long _slqacb;

    /** SLQACT: {bigint(19)} */
    protected Long _slqact;

    /** SLQANUM: {bigint(19)} */
    protected Long _slqanum;

    /** LINBLK: {varchar(30)} */
    protected String _linblk;

    /** LOCNO: {varchar(255)} */
    protected String _locno;

    /** LOCID: {char(1)} */
    protected String _locid;

    /** DLVPRTRNK: {bigint(19)} */
    protected Long _dlvprtrnk;

    /** SRDLVYMD: {varchar(8)} */
    protected String _srdlvymd;

    /** SRHPYNID: {char(1)} */
    protected String _srhpynid;

    /** SRIPYNID: {char(1)} */
    protected String _sripynid;

    /** SRSRLINCD: {varchar(30)} */
    protected String _srsrlincd;

    /** SRSRRNK: {bigint(19)} */
    protected Long _srsrrnk;

    /** SRDLVSNM: {bigint(19)} */
    protected Long _srdlvsnm;

    /** SRDLVDTLSNM: {decimal(16, 6)} */
    protected java.math.BigDecimal _srdlvdtlsnm;

    /** SRDLVPRTRNK: {bigint(19)} */
    protected Long _srdlvprtrnk;

    /** BRTYP: {varchar(30)} */
    protected String _brtyp;

    /** BOXNO: {NotNull, varchar(30)} */
    protected String _boxno;

    /** BOXNOCNSNM: {varchar(30)} */
    protected String _boxnocnsnm;

    /** BOXTYP: {varchar(30)} */
    protected String _boxtyp;

    /** MGBOXDID: {char(1)} */
    protected String _mgboxdid;

    /** DMDID: {char(1)} */
    protected String _dmdid;

    /** TTBOXQA: {bigint(19)} */
    protected Long _ttboxqa;

    /** BOXCTQATA: {bigint(19)} */
    protected Long _boxctqata;

    /** BOXCTQAAPSRPLC: {bigint(19)} */
    protected Long _boxctqaapsrplc;

    /** TTSROPRTCNT: {bigint(19)} */
    protected Long _ttsroprtcnt;

    /** BXMTRID: {char(1)} */
    protected String _bxmtrid;

    /** SPPLYMD: {varchar(8)} */
    protected String _spplymd;

    /** SLPTYP: {NotNull, varchar(30)} */
    protected String _slptyp;

    /** SEQNO: {bigint(19)} */
    protected Long _seqno;

    /** OTORGCD: {varchar(30)} */
    protected String _otorgcd;

    /** ORDORGCD: {varchar(30)} */
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(30)} */
    protected String _rlybscd;

    /** DLVRNK: {varchar(30)} */
    protected String _dlvrnk;

    /** LMPDLVNO: {varchar(30)} */
    protected String _lmpdlvno;

    /** DIVMTD: {char(1)} */
    protected String _divmtd;

    /** SLEDIV: {varchar(30)} */
    protected String _slediv;

    /** HVRTRSN: {varchar(30)} */
    protected String _hvrtrsn;

    /** HVRTINOTYMD: {varchar(30)} */
    protected String _hvrtinotymd;

    /** CNGPRTSLPNO: {varchar(30)} */
    protected String _cngprtslpno;

    /** TRNSCTNDIV: {char(1)} */
    protected String _trnsctndiv;

    /** EOSORDAFTFLG: {char(1)} */
    protected String _eosordaftflg;

    /** EOSSLPNO: {varchar(30)} */
    protected String _eosslpno;

    /** HDRDBXDIV: {char(1)} */
    protected String _hdrdbxdiv;

    /** INOTRFSLDIV: {char(1)} */
    protected String _inotrfsldiv;

    /** BXMNTRFSLDIV: {char(1)} */
    protected String _bxmntrfsldiv;

    /** SLPMRGTMG: {varchar(30)} */
    protected String _slpmrgtmg;

    /** SLPOTYMD: {varchar(8)} */
    protected String _slpotymd;

    /** CMPCD: {varchar(30)} */
    protected String _cmpcd;

    /** STSCD: {varchar(30)} */
    protected String _stscd;

    /** STGVAL: {bigint(19)} */
    protected Long _stgval;

    /** SLPNO: {NotNull, varchar(30)} */
    protected String _slpno;

    /** TTTOPDEDRNK: {bigint(19)} */
    protected Long _tttopdedrnk;

    /** CORDRCVCNT: {bigint(19)} */
    protected Long _cordrcvcnt;

    /** ORDDVFG: {char(1)} */
    protected String _orddvfg;

    /** LBCBQA: {bigint(19), default=[0]} */
    protected Long _lbcbqa;

    /** DRCLSTLBCBID: {char(1)} */
    protected String _drclstlbcbid;

    /** LBBOXNO: {bigint(19), default=[(0)]} */
    protected Long _lbboxno;

    /** LBTTBOXQA: {bigint(19), default=[(0)]} */
    protected Long _lbttboxqa;

    /** IKEIINCLDFLG: {char(1), default=[0]} */
    protected String _ikeiincldflg;

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
        return "T_CORDDTAEC";
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
        if (_orderChangeId == null) { return false; }
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
    /** T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'. */
    protected TCordhdr _tCordhdr;

    /**
     * [get] T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'. <br>
     * @return The entity of foreign property 'TCordhdr'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TCordhdr getTCordhdr() {
        return _tCordhdr;
    }

    /**
     * [set] T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'.
     * @param tCordhdr The entity of foreign property 'TCordhdr'. (NullAllowed)
     */
    public void setTCordhdr(TCordhdr tCordhdr) {
        _tCordhdr = tCordhdr;
    }

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
        if (obj instanceof BsTCorddtaec) {
            BsTCorddtaec other = (BsTCorddtaec)obj;
            if (!xSV(_orderChangeId, other._orderChangeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _orderChangeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tCordhdr != null)
        { sb.append(li).append(xbRDS(_tCordhdr, "tCordhdr")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_orderChangeId));
        sb.append(dm).append(xfND(_orderHId));
        sb.append(dm).append(xfND(_srwhcd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_zzordymd));
        sb.append(dm).append(xfND(_ordgr));
        sb.append(dm).append(xfND(_dlvymd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_scddlvymd));
        sb.append(dm).append(xfND(_scdded));
        sb.append(dm).append(xfND(_scdpstnid));
        sb.append(dm).append(xfND(_hpynid));
        sb.append(dm).append(xfND(_ipynid));
        sb.append(dm).append(xfND(_srded));
        sb.append(dm).append(xfND(_srpstnid));
        sb.append(dm).append(xfND(_srymd));
        sb.append(dm).append(xfND(_sroprtcnt));
        sb.append(dm).append(xfND(_srlincd));
        sb.append(dm).append(xfND(_srrnk));
        sb.append(dm).append(xfND(_dlvsnm));
        sb.append(dm).append(xfND(_dlvdtlsnm));
        sb.append(dm).append(xfND(_sscd));
        sb.append(dm).append(xfND(_ssnm));
        sb.append(dm).append(xfND(_hdvid));
        sb.append(dm).append(xfND(_dtlsnm));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_slqacb));
        sb.append(dm).append(xfND(_slqact));
        sb.append(dm).append(xfND(_slqanum));
        sb.append(dm).append(xfND(_linblk));
        sb.append(dm).append(xfND(_locno));
        sb.append(dm).append(xfND(_locid));
        sb.append(dm).append(xfND(_dlvprtrnk));
        sb.append(dm).append(xfND(_srdlvymd));
        sb.append(dm).append(xfND(_srhpynid));
        sb.append(dm).append(xfND(_sripynid));
        sb.append(dm).append(xfND(_srsrlincd));
        sb.append(dm).append(xfND(_srsrrnk));
        sb.append(dm).append(xfND(_srdlvsnm));
        sb.append(dm).append(xfND(_srdlvdtlsnm));
        sb.append(dm).append(xfND(_srdlvprtrnk));
        sb.append(dm).append(xfND(_brtyp));
        sb.append(dm).append(xfND(_boxno));
        sb.append(dm).append(xfND(_boxnocnsnm));
        sb.append(dm).append(xfND(_boxtyp));
        sb.append(dm).append(xfND(_mgboxdid));
        sb.append(dm).append(xfND(_dmdid));
        sb.append(dm).append(xfND(_ttboxqa));
        sb.append(dm).append(xfND(_boxctqata));
        sb.append(dm).append(xfND(_boxctqaapsrplc));
        sb.append(dm).append(xfND(_ttsroprtcnt));
        sb.append(dm).append(xfND(_bxmtrid));
        sb.append(dm).append(xfND(_spplymd));
        sb.append(dm).append(xfND(_slptyp));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_otorgcd));
        sb.append(dm).append(xfND(_ordorgcd));
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_dlvrnk));
        sb.append(dm).append(xfND(_lmpdlvno));
        sb.append(dm).append(xfND(_divmtd));
        sb.append(dm).append(xfND(_slediv));
        sb.append(dm).append(xfND(_hvrtrsn));
        sb.append(dm).append(xfND(_hvrtinotymd));
        sb.append(dm).append(xfND(_cngprtslpno));
        sb.append(dm).append(xfND(_trnsctndiv));
        sb.append(dm).append(xfND(_eosordaftflg));
        sb.append(dm).append(xfND(_eosslpno));
        sb.append(dm).append(xfND(_hdrdbxdiv));
        sb.append(dm).append(xfND(_inotrfsldiv));
        sb.append(dm).append(xfND(_bxmntrfsldiv));
        sb.append(dm).append(xfND(_slpmrgtmg));
        sb.append(dm).append(xfND(_slpotymd));
        sb.append(dm).append(xfND(_cmpcd));
        sb.append(dm).append(xfND(_stscd));
        sb.append(dm).append(xfND(_stgval));
        sb.append(dm).append(xfND(_slpno));
        sb.append(dm).append(xfND(_tttopdedrnk));
        sb.append(dm).append(xfND(_cordrcvcnt));
        sb.append(dm).append(xfND(_orddvfg));
        sb.append(dm).append(xfND(_lbcbqa));
        sb.append(dm).append(xfND(_drclstlbcbid));
        sb.append(dm).append(xfND(_lbboxno));
        sb.append(dm).append(xfND(_lbttboxqa));
        sb.append(dm).append(xfND(_ikeiincldflg));
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
        StringBuilder sb = new StringBuilder();
        if (_tCordhdr != null)
        { sb.append(dm).append("tCordhdr"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TCorddtaec clone() {
        return (TCorddtaec)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずデータ(取替用)ID
     * @return The value of the column 'ORDER_CHANGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOrderChangeId() {
        checkSpecifiedProperty("orderChangeId");
        return _orderChangeId;
    }

    /**
     * [set] ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしずデータ(取替用)ID
     * @param orderChangeId The value of the column 'ORDER_CHANGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOrderChangeId(Long orderChangeId) {
        registerModifiedProperty("orderChangeId");
        _orderChangeId = orderChangeId;
    }

    /**
     * [get] ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} <br>
     * さしずヘッダID
     * @return The value of the column 'ORDER_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOrderHId() {
        checkSpecifiedProperty("orderHId");
        return _orderHId;
    }

    /**
     * [set] ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR} <br>
     * さしずヘッダID
     * @param orderHId The value of the column 'ORDER_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOrderHId(Long orderHId) {
        registerModifiedProperty("orderHId");
        _orderHId = orderHId;
    }

    /**
     * [get] SRWHCD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @return The value of the column 'SRWHCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSrwhcd() {
        checkSpecifiedProperty("srwhcd");
        return convertEmptyToNull(_srwhcd);
    }

    /**
     * [set] SRWHCD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @param srwhcd The value of the column 'SRWHCD'. (basically NotNull if update: for the constraint)
     */
    public void setSrwhcd(String srwhcd) {
        registerModifiedProperty("srwhcd");
        _srwhcd = srwhcd;
    }

    /**
     * [get] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'DPCD'. (basically NotNull if selected: for the constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {NotNull, varchar(30)} <br>
     * 配達拠点CD
     * @param dpcd The value of the column 'DPCD'. (basically NotNull if update: for the constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getZzordymd() {
        checkSpecifiedProperty("zzordymd");
        return convertEmptyToNull(_zzordymd);
    }

    /**
     * [set] ZZORDYMD: {NotNull, varchar(8)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (basically NotNull if update: for the constraint)
     */
    public void setZzordymd(String zzordymd) {
        registerModifiedProperty("zzordymd");
        _zzordymd = zzordymd;
    }

    /**
     * [get] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (basically NotNull if selected: for the constraint)
     */
    public String getOrdgr() {
        checkSpecifiedProperty("ordgr");
        return convertEmptyToNull(_ordgr);
    }

    /**
     * [set] ORDGR: {NotNull, varchar(30)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (basically NotNull if update: for the constraint)
     */
    public void setOrdgr(String ordgr) {
        registerModifiedProperty("ordgr");
        _ordgr = ordgr;
    }

    /**
     * [get] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @return The value of the column 'DLVYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getDlvymd() {
        checkSpecifiedProperty("dlvymd");
        return convertEmptyToNull(_dlvymd);
    }

    /**
     * [set] DLVYMD: {NotNull, varchar(8)} <br>
     * 配達年月日
     * @param dlvymd The value of the column 'DLVYMD'. (basically NotNull if update: for the constraint)
     */
    public void setDlvymd(String dlvymd) {
        registerModifiedProperty("dlvymd");
        _dlvymd = dlvymd;
    }

    /**
     * [get] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (basically NotNull if selected: for the constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {NotNull, varchar(30)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (basically NotNull if update: for the constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (basically NotNull if selected: for the constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {NotNull, varchar(30)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (basically NotNull if update: for the constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] SCDDLVYMD: {varchar(8)} <br>
     * 画面表示用配達年月日
     * @return The value of the column 'SCDDLVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getScddlvymd() {
        checkSpecifiedProperty("scddlvymd");
        return convertEmptyToNull(_scddlvymd);
    }

    /**
     * [set] SCDDLVYMD: {varchar(8)} <br>
     * 画面表示用配達年月日
     * @param scddlvymd The value of the column 'SCDDLVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScddlvymd(String scddlvymd) {
        registerModifiedProperty("scddlvymd");
        _scddlvymd = scddlvymd;
    }

    /**
     * [get] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @return The value of the column 'SCDDED'. (basically NotNull if selected: for the constraint)
     */
    public String getScdded() {
        checkSpecifiedProperty("scdded");
        return convertEmptyToNull(_scdded);
    }

    /**
     * [set] SCDDED: {NotNull, varchar(30)} <br>
     * 画面表示用配達方面
     * @param scdded The value of the column 'SCDDED'. (basically NotNull if update: for the constraint)
     */
    public void setScdded(String scdded) {
        registerModifiedProperty("scdded");
        _scdded = scdded;
    }

    /**
     * [get] SCDPSTNID: {varchar(30)} <br>
     * 画面表示用ピストン区分
     * @return The value of the column 'SCDPSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getScdpstnid() {
        checkSpecifiedProperty("scdpstnid");
        return convertEmptyToNull(_scdpstnid);
    }

    /**
     * [set] SCDPSTNID: {varchar(30)} <br>
     * 画面表示用ピストン区分
     * @param scdpstnid The value of the column 'SCDPSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScdpstnid(String scdpstnid) {
        registerModifiedProperty("scdpstnid");
        _scdpstnid = scdpstnid;
    }

    /**
     * [get] HPYNID: {char(1)} <br>
     * 国内の有無区分
     * @return The value of the column 'HPYNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHpynid() {
        checkSpecifiedProperty("hpynid");
        return convertEmptyToNull(_hpynid);
    }

    /**
     * [set] HPYNID: {char(1)} <br>
     * 国内の有無区分
     * @param hpynid The value of the column 'HPYNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHpynid(String hpynid) {
        registerModifiedProperty("hpynid");
        _hpynid = hpynid;
    }

    /**
     * [get] IPYNID: {char(1)} <br>
     * 輸入の有無区分
     * @return The value of the column 'IPYNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getIpynid() {
        checkSpecifiedProperty("ipynid");
        return convertEmptyToNull(_ipynid);
    }

    /**
     * [set] IPYNID: {char(1)} <br>
     * 輸入の有無区分
     * @param ipynid The value of the column 'IPYNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIpynid(String ipynid) {
        registerModifiedProperty("ipynid");
        _ipynid = ipynid;
    }

    /**
     * [get] SRDED: {varchar(30)} <br>
     * ＣＡＰ用配達方面
     * @return The value of the column 'SRDED'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrded() {
        checkSpecifiedProperty("srded");
        return convertEmptyToNull(_srded);
    }

    /**
     * [set] SRDED: {varchar(30)} <br>
     * ＣＡＰ用配達方面
     * @param srded The value of the column 'SRDED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrded(String srded) {
        registerModifiedProperty("srded");
        _srded = srded;
    }

    /**
     * [get] SRPSTNID: {varchar(30)} <br>
     * ＣＡＰ用ピストン区分
     * @return The value of the column 'SRPSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrpstnid() {
        checkSpecifiedProperty("srpstnid");
        return convertEmptyToNull(_srpstnid);
    }

    /**
     * [set] SRPSTNID: {varchar(30)} <br>
     * ＣＡＰ用ピストン区分
     * @param srpstnid The value of the column 'SRPSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrpstnid(String srpstnid) {
        registerModifiedProperty("srpstnid");
        _srpstnid = srpstnid;
    }

    /**
     * [get] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @return The value of the column 'SRYMD'. (basically NotNull if selected: for the constraint)
     */
    public String getSrymd() {
        checkSpecifiedProperty("srymd");
        return convertEmptyToNull(_srymd);
    }

    /**
     * [set] SRYMD: {NotNull, varchar(8)} <br>
     * 仕分作業日付
     * @param srymd The value of the column 'SRYMD'. (basically NotNull if update: for the constraint)
     */
    public void setSrymd(String srymd) {
        registerModifiedProperty("srymd");
        _srymd = srymd;
    }

    /**
     * [get] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @return The value of the column 'SROPRTCNT'. (basically NotNull if selected: for the constraint)
     */
    public Long getSroprtcnt() {
        checkSpecifiedProperty("sroprtcnt");
        return _sroprtcnt;
    }

    /**
     * [set] SROPRTCNT: {NotNull, bigint(19)} <br>
     * 仕分作業回数
     * @param sroprtcnt The value of the column 'SROPRTCNT'. (basically NotNull if update: for the constraint)
     */
    public void setSroprtcnt(Long sroprtcnt) {
        registerModifiedProperty("sroprtcnt");
        _sroprtcnt = sroprtcnt;
    }

    /**
     * [get] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @return The value of the column 'SRLINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrlincd() {
        checkSpecifiedProperty("srlincd");
        return convertEmptyToNull(_srlincd);
    }

    /**
     * [set] SRLINCD: {varchar(30)} <br>
     * 仕分ラインCD
     * @param srlincd The value of the column 'SRLINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrlincd(String srlincd) {
        registerModifiedProperty("srlincd");
        _srlincd = srlincd;
    }

    /**
     * [get] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @return The value of the column 'SRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrrnk() {
        checkSpecifiedProperty("srrnk");
        return _srrnk;
    }

    /**
     * [set] SRRNK: {bigint(19)} <br>
     * 仕分順
     * @param srrnk The value of the column 'SRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrrnk(Long srrnk) {
        registerModifiedProperty("srrnk");
        _srrnk = srrnk;
    }

    /**
     * [get] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @return The value of the column 'DLVSNM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvsnm() {
        checkSpecifiedProperty("dlvsnm");
        return _dlvsnm;
    }

    /**
     * [set] DLVSNM: {bigint(19)} <br>
     * 配達通番
     * @param dlvsnm The value of the column 'DLVSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvsnm(Long dlvsnm) {
        registerModifiedProperty("dlvsnm");
        _dlvsnm = dlvsnm;
    }

    /**
     * [get] DLVDTLSNM: {bigint(19)} <br>
     * 配達通番枝番
     * @return The value of the column 'DLVDTLSNM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvdtlsnm() {
        checkSpecifiedProperty("dlvdtlsnm");
        return _dlvdtlsnm;
    }

    /**
     * [set] DLVDTLSNM: {bigint(19)} <br>
     * 配達通番枝番
     * @param dlvdtlsnm The value of the column 'DLVDTLSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvdtlsnm(Long dlvdtlsnm) {
        registerModifiedProperty("dlvdtlsnm");
        _dlvdtlsnm = dlvdtlsnm;
    }

    /**
     * [get] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (basically NotNull if selected: for the constraint)
     */
    public String getSscd() {
        checkSpecifiedProperty("sscd");
        return convertEmptyToNull(_sscd);
    }

    /**
     * [set] SSCD: {NotNull, varchar(30)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (basically NotNull if update: for the constraint)
     */
    public void setSscd(String sscd) {
        registerModifiedProperty("sscd");
        _sscd = sscd;
    }

    /**
     * [get] SSNM: {varchar(60)} <br>
     * お得意様名
     * @return The value of the column 'SSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSsnm() {
        checkSpecifiedProperty("ssnm");
        return convertEmptyToNull(_ssnm);
    }

    /**
     * [set] SSNM: {varchar(60)} <br>
     * お得意様名
     * @param ssnm The value of the column 'SSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSsnm(String ssnm) {
        registerModifiedProperty("ssnm");
        _ssnm = ssnm;
    }

    /**
     * [get] HDVID: {char(1)} <br>
     * 宅配区分
     * @return The value of the column 'HDVID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdvid() {
        checkSpecifiedProperty("hdvid");
        return convertEmptyToNull(_hdvid);
    }

    /**
     * [set] HDVID: {char(1)} <br>
     * 宅配区分
     * @param hdvid The value of the column 'HDVID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdvid(String hdvid) {
        registerModifiedProperty("hdvid");
        _hdvid = hdvid;
    }

    /**
     * [get] DTLSNM: {varchar(30)} <br>
     * 明細シーケンス
     * @return The value of the column 'DTLSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtlsnm() {
        checkSpecifiedProperty("dtlsnm");
        return convertEmptyToNull(_dtlsnm);
    }

    /**
     * [set] DTLSNM: {varchar(30)} <br>
     * 明細シーケンス
     * @param dtlsnm The value of the column 'DTLSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtlsnm(String dtlsnm) {
        registerModifiedProperty("dtlsnm");
        _dtlsnm = dtlsnm;
    }

    /**
     * [get] ZZMATNR: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'ZZMATNR'. (basically NotNull if selected: for the constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {NotNull, varchar(30)} <br>
     * 銘柄CD
     * @param zzmatnr The value of the column 'ZZMATNR'. (basically NotNull if update: for the constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @return The value of the column 'SLQACB'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlqacb() {
        checkSpecifiedProperty("slqacb");
        return _slqacb;
    }

    /**
     * [set] SLQACB: {bigint(19)} <br>
     * 販売数量、ダンボール数
     * @param slqacb The value of the column 'SLQACB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqacb(Long slqacb) {
        registerModifiedProperty("slqacb");
        _slqacb = slqacb;
    }

    /**
     * [get] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @return The value of the column 'SLQACT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlqact() {
        checkSpecifiedProperty("slqact");
        return _slqact;
    }

    /**
     * [set] SLQACT: {bigint(19)} <br>
     * 販売数量、カートン数
     * @param slqact The value of the column 'SLQACT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqact(Long slqact) {
        registerModifiedProperty("slqact");
        _slqact = slqact;
    }

    /**
     * [get] SLQANUM: {bigint(19)} <br>
     * 販売数量、個数
     * @return The value of the column 'SLQANUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSlqanum() {
        checkSpecifiedProperty("slqanum");
        return _slqanum;
    }

    /**
     * [set] SLQANUM: {bigint(19)} <br>
     * 販売数量、個数
     * @param slqanum The value of the column 'SLQANUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlqanum(Long slqanum) {
        registerModifiedProperty("slqanum");
        _slqanum = slqanum;
    }

    /**
     * [get] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @return The value of the column 'LINBLK'. (NullAllowed even if selected: for no constraint)
     */
    public String getLinblk() {
        checkSpecifiedProperty("linblk");
        return convertEmptyToNull(_linblk);
    }

    /**
     * [set] LINBLK: {varchar(30)} <br>
     * ライン／ブロック
     * @param linblk The value of the column 'LINBLK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLinblk(String linblk) {
        registerModifiedProperty("linblk");
        _linblk = linblk;
    }

    /**
     * [get] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @return The value of the column 'LOCNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocno() {
        checkSpecifiedProperty("locno");
        return convertEmptyToNull(_locno);
    }

    /**
     * [set] LOCNO: {varchar(255)} <br>
     * ロケーションＮｏ.
     * @param locno The value of the column 'LOCNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocno(String locno) {
        registerModifiedProperty("locno");
        _locno = locno;
    }

    /**
     * [get] LOCID: {char(1)} <br>
     * ロケーション区分
     * @return The value of the column 'LOCID'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocid() {
        checkSpecifiedProperty("locid");
        return convertEmptyToNull(_locid);
    }

    /**
     * [set] LOCID: {char(1)} <br>
     * ロケーション区分
     * @param locid The value of the column 'LOCID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocid(String locid) {
        registerModifiedProperty("locid");
        _locid = locid;
    }

    /**
     * [get] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @return The value of the column 'DLVPRTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDlvprtrnk() {
        checkSpecifiedProperty("dlvprtrnk");
        return _dlvprtrnk;
    }

    /**
     * [set] DLVPRTRNK: {bigint(19)} <br>
     * 配達通番印刷順
     * @param dlvprtrnk The value of the column 'DLVPRTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvprtrnk(Long dlvprtrnk) {
        registerModifiedProperty("dlvprtrnk");
        _dlvprtrnk = dlvprtrnk;
    }

    /**
     * [get] SRDLVYMD: {varchar(8)} <br>
     * 仕分用配達年月日
     * @return The value of the column 'SRDLVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrdlvymd() {
        checkSpecifiedProperty("srdlvymd");
        return convertEmptyToNull(_srdlvymd);
    }

    /**
     * [set] SRDLVYMD: {varchar(8)} <br>
     * 仕分用配達年月日
     * @param srdlvymd The value of the column 'SRDLVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrdlvymd(String srdlvymd) {
        registerModifiedProperty("srdlvymd");
        _srdlvymd = srdlvymd;
    }

    /**
     * [get] SRHPYNID: {char(1)} <br>
     * 仕分用国内の有無区分
     * @return The value of the column 'SRHPYNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrhpynid() {
        checkSpecifiedProperty("srhpynid");
        return convertEmptyToNull(_srhpynid);
    }

    /**
     * [set] SRHPYNID: {char(1)} <br>
     * 仕分用国内の有無区分
     * @param srhpynid The value of the column 'SRHPYNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrhpynid(String srhpynid) {
        registerModifiedProperty("srhpynid");
        _srhpynid = srhpynid;
    }

    /**
     * [get] SRIPYNID: {char(1)} <br>
     * 仕分用輸入の有無区分
     * @return The value of the column 'SRIPYNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSripynid() {
        checkSpecifiedProperty("sripynid");
        return convertEmptyToNull(_sripynid);
    }

    /**
     * [set] SRIPYNID: {char(1)} <br>
     * 仕分用輸入の有無区分
     * @param sripynid The value of the column 'SRIPYNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSripynid(String sripynid) {
        registerModifiedProperty("sripynid");
        _sripynid = sripynid;
    }

    /**
     * [get] SRSRLINCD: {varchar(30)} <br>
     * 仕分用仕分ラインCD
     * @return The value of the column 'SRSRLINCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrsrlincd() {
        checkSpecifiedProperty("srsrlincd");
        return convertEmptyToNull(_srsrlincd);
    }

    /**
     * [set] SRSRLINCD: {varchar(30)} <br>
     * 仕分用仕分ラインCD
     * @param srsrlincd The value of the column 'SRSRLINCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrsrlincd(String srsrlincd) {
        registerModifiedProperty("srsrlincd");
        _srsrlincd = srsrlincd;
    }

    /**
     * [get] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @return The value of the column 'SRSRRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrsrrnk() {
        checkSpecifiedProperty("srsrrnk");
        return _srsrrnk;
    }

    /**
     * [set] SRSRRNK: {bigint(19)} <br>
     * 仕分用仕分順
     * @param srsrrnk The value of the column 'SRSRRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrsrrnk(Long srsrrnk) {
        registerModifiedProperty("srsrrnk");
        _srsrrnk = srsrrnk;
    }

    /**
     * [get] SRDLVSNM: {bigint(19)} <br>
     * 仕分用配達通番
     * @return The value of the column 'SRDLVSNM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrdlvsnm() {
        checkSpecifiedProperty("srdlvsnm");
        return _srdlvsnm;
    }

    /**
     * [set] SRDLVSNM: {bigint(19)} <br>
     * 仕分用配達通番
     * @param srdlvsnm The value of the column 'SRDLVSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrdlvsnm(Long srdlvsnm) {
        registerModifiedProperty("srdlvsnm");
        _srdlvsnm = srdlvsnm;
    }

    /**
     * [get] SRDLVDTLSNM: {decimal(16, 6)} <br>
     * 仕分用配達通番枝番
     * @return The value of the column 'SRDLVDTLSNM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSrdlvdtlsnm() {
        checkSpecifiedProperty("srdlvdtlsnm");
        return _srdlvdtlsnm;
    }

    /**
     * [set] SRDLVDTLSNM: {decimal(16, 6)} <br>
     * 仕分用配達通番枝番
     * @param srdlvdtlsnm The value of the column 'SRDLVDTLSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrdlvdtlsnm(java.math.BigDecimal srdlvdtlsnm) {
        registerModifiedProperty("srdlvdtlsnm");
        _srdlvdtlsnm = srdlvdtlsnm;
    }

    /**
     * [get] SRDLVPRTRNK: {bigint(19)} <br>
     * 仕分用配達通番印刷順
     * @return The value of the column 'SRDLVPRTRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSrdlvprtrnk() {
        checkSpecifiedProperty("srdlvprtrnk");
        return _srdlvprtrnk;
    }

    /**
     * [set] SRDLVPRTRNK: {bigint(19)} <br>
     * 仕分用配達通番印刷順
     * @param srdlvprtrnk The value of the column 'SRDLVPRTRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrdlvprtrnk(Long srdlvprtrnk) {
        registerModifiedProperty("srdlvprtrnk");
        _srdlvprtrnk = srdlvprtrnk;
    }

    /**
     * [get] BRTYP: {varchar(30)} <br>
     * 銘柄タイプ
     * @return The value of the column 'BRTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getBrtyp() {
        checkSpecifiedProperty("brtyp");
        return convertEmptyToNull(_brtyp);
    }

    /**
     * [set] BRTYP: {varchar(30)} <br>
     * 銘柄タイプ
     * @param brtyp The value of the column 'BRTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBrtyp(String brtyp) {
        registerModifiedProperty("brtyp");
        _brtyp = brtyp;
    }

    /**
     * [get] BOXNO: {NotNull, varchar(30)} <br>
     * 箱Ｎｏ．
     * @return The value of the column 'BOXNO'. (basically NotNull if selected: for the constraint)
     */
    public String getBoxno() {
        checkSpecifiedProperty("boxno");
        return convertEmptyToNull(_boxno);
    }

    /**
     * [set] BOXNO: {NotNull, varchar(30)} <br>
     * 箱Ｎｏ．
     * @param boxno The value of the column 'BOXNO'. (basically NotNull if update: for the constraint)
     */
    public void setBoxno(String boxno) {
        registerModifiedProperty("boxno");
        _boxno = boxno;
    }

    /**
     * [get] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．（通番）
     * @return The value of the column 'BOXNOCNSNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxnocnsnm() {
        checkSpecifiedProperty("boxnocnsnm");
        return convertEmptyToNull(_boxnocnsnm);
    }

    /**
     * [set] BOXNOCNSNM: {varchar(30)} <br>
     * 箱Ｎｏ．（通番）
     * @param boxnocnsnm The value of the column 'BOXNOCNSNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxnocnsnm(String boxnocnsnm) {
        registerModifiedProperty("boxnocnsnm");
        _boxnocnsnm = boxnocnsnm;
    }

    /**
     * [get] BOXTYP: {varchar(30)} <br>
     * 箱タイプ
     * @return The value of the column 'BOXTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxtyp() {
        checkSpecifiedProperty("boxtyp");
        return convertEmptyToNull(_boxtyp);
    }

    /**
     * [set] BOXTYP: {varchar(30)} <br>
     * 箱タイプ
     * @param boxtyp The value of the column 'BOXTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxtyp(String boxtyp) {
        registerModifiedProperty("boxtyp");
        _boxtyp = boxtyp;
    }

    /**
     * [get] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @return The value of the column 'MGBOXDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getMgboxdid() {
        checkSpecifiedProperty("mgboxdid");
        return convertEmptyToNull(_mgboxdid);
    }

    /**
     * [set] MGBOXDID: {char(1)} <br>
     * マージ箱表示区分
     * @param mgboxdid The value of the column 'MGBOXDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMgboxdid(String mgboxdid) {
        registerModifiedProperty("mgboxdid");
        _mgboxdid = mgboxdid;
    }

    /**
     * [get] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @return The value of the column 'DMDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getDmdid() {
        checkSpecifiedProperty("dmdid");
        return convertEmptyToNull(_dmdid);
    }

    /**
     * [set] DMDID: {char(1)} <br>
     * ＤＭ表示区分
     * @param dmdid The value of the column 'DMDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDmdid(String dmdid) {
        registerModifiedProperty("dmdid");
        _dmdid = dmdid;
    }

    /**
     * [get] TTBOXQA: {bigint(19)} <br>
     * トータル箱数
     * @return The value of the column 'TTBOXQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTtboxqa() {
        checkSpecifiedProperty("ttboxqa");
        return _ttboxqa;
    }

    /**
     * [set] TTBOXQA: {bigint(19)} <br>
     * トータル箱数
     * @param ttboxqa The value of the column 'TTBOXQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTtboxqa(Long ttboxqa) {
        registerModifiedProperty("ttboxqa");
        _ttboxqa = ttboxqa;
    }

    /**
     * [get] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数（総数）
     * @return The value of the column 'BOXCTQATA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxctqata() {
        checkSpecifiedProperty("boxctqata");
        return _boxctqata;
    }

    /**
     * [set] BOXCTQATA: {bigint(19)} <br>
     * 箱内カートン数（総数）
     * @param boxctqata The value of the column 'BOXCTQATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxctqata(Long boxctqata) {
        registerModifiedProperty("boxctqata");
        _boxctqata = boxctqata;
    }

    /**
     * [get] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数（該当仕分場分）
     * @return The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBoxctqaapsrplc() {
        checkSpecifiedProperty("boxctqaapsrplc");
        return _boxctqaapsrplc;
    }

    /**
     * [set] BOXCTQAAPSRPLC: {bigint(19)} <br>
     * 箱内カートン数（該当仕分場分）
     * @param boxctqaapsrplc The value of the column 'BOXCTQAAPSRPLC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxctqaapsrplc(Long boxctqaapsrplc) {
        registerModifiedProperty("boxctqaapsrplc");
        _boxctqaapsrplc = boxctqaapsrplc;
    }

    /**
     * [get] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @return The value of the column 'TTSROPRTCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTtsroprtcnt() {
        checkSpecifiedProperty("ttsroprtcnt");
        return _ttsroprtcnt;
    }

    /**
     * [set] TTSROPRTCNT: {bigint(19)} <br>
     * 今回仕分作業回数
     * @param ttsroprtcnt The value of the column 'TTSROPRTCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTtsroprtcnt(Long ttsroprtcnt) {
        registerModifiedProperty("ttsroprtcnt");
        _ttsroprtcnt = ttsroprtcnt;
    }

    /**
     * [get] BXMTRID: {char(1)} <br>
     * 箱跨り区分
     * @return The value of the column 'BXMTRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getBxmtrid() {
        checkSpecifiedProperty("bxmtrid");
        return convertEmptyToNull(_bxmtrid);
    }

    /**
     * [set] BXMTRID: {char(1)} <br>
     * 箱跨り区分
     * @param bxmtrid The value of the column 'BXMTRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxmtrid(String bxmtrid) {
        registerModifiedProperty("bxmtrid");
        _bxmtrid = bxmtrid;
    }

    /**
     * [get] SPPLYMD: {varchar(8)} <br>
     * 出庫予定年月日
     * @return The value of the column 'SPPLYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpplymd() {
        checkSpecifiedProperty("spplymd");
        return convertEmptyToNull(_spplymd);
    }

    /**
     * [set] SPPLYMD: {varchar(8)} <br>
     * 出庫予定年月日
     * @param spplymd The value of the column 'SPPLYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpplymd(String spplymd) {
        registerModifiedProperty("spplymd");
        _spplymd = spplymd;
    }

    /**
     * [get] SLPTYP: {NotNull, varchar(30)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (basically NotNull if selected: for the constraint)
     */
    public String getSlptyp() {
        checkSpecifiedProperty("slptyp");
        return convertEmptyToNull(_slptyp);
    }

    /**
     * [set] SLPTYP: {NotNull, varchar(30)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (basically NotNull if update: for the constraint)
     */
    public void setSlptyp(String slptyp) {
        registerModifiedProperty("slptyp");
        _slptyp = slptyp;
    }

    /**
     * [get] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSeqno() {
        checkSpecifiedProperty("seqno");
        return _seqno;
    }

    /**
     * [set] SEQNO: {bigint(19)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqno(Long seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] OTORGCD: {varchar(30)} <br>
     * 出力先組織CD
     * @return The value of the column 'OTORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtorgcd() {
        checkSpecifiedProperty("otorgcd");
        return convertEmptyToNull(_otorgcd);
    }

    /**
     * [set] OTORGCD: {varchar(30)} <br>
     * 出力先組織CD
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtorgcd(String otorgcd) {
        registerModifiedProperty("otorgcd");
        _otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(30)} <br>
     * さしず元組織CD
     * @return The value of the column 'ORDORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdorgcd() {
        checkSpecifiedProperty("ordorgcd");
        return convertEmptyToNull(_ordorgcd);
    }

    /**
     * [set] ORDORGCD: {varchar(30)} <br>
     * さしず元組織CD
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdorgcd(String ordorgcd) {
        registerModifiedProperty("ordorgcd");
        _ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(30)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {varchar(30)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @return The value of the column 'DLVRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvrnk() {
        checkSpecifiedProperty("dlvrnk");
        return convertEmptyToNull(_dlvrnk);
    }

    /**
     * [set] DLVRNK: {varchar(30)} <br>
     * 配達順位
     * @param dlvrnk The value of the column 'DLVRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvrnk(String dlvrnk) {
        registerModifiedProperty("dlvrnk");
        _dlvrnk = dlvrnk;
    }

    /**
     * [get] LMPDLVNO: {varchar(30)} <br>
     * 一括配達番号
     * @return The value of the column 'LMPDLVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLmpdlvno() {
        checkSpecifiedProperty("lmpdlvno");
        return convertEmptyToNull(_lmpdlvno);
    }

    /**
     * [set] LMPDLVNO: {varchar(30)} <br>
     * 一括配達番号
     * @param lmpdlvno The value of the column 'LMPDLVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLmpdlvno(String lmpdlvno) {
        registerModifiedProperty("lmpdlvno");
        _lmpdlvno = lmpdlvno;
    }

    /**
     * [get] DIVMTD: {char(1)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDivmtd() {
        checkSpecifiedProperty("divmtd");
        return convertEmptyToNull(_divmtd);
    }

    /**
     * [set] DIVMTD: {char(1)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivmtd(String divmtd) {
        registerModifiedProperty("divmtd");
        _divmtd = divmtd;
    }

    /**
     * [get] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @return The value of the column 'SLEDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlediv() {
        checkSpecifiedProperty("slediv");
        return convertEmptyToNull(_slediv);
    }

    /**
     * [set] SLEDIV: {varchar(30)} <br>
     * 販売区分
     * @param slediv The value of the column 'SLEDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlediv(String slediv) {
        registerModifiedProperty("slediv");
        _slediv = slediv;
    }

    /**
     * [get] HVRTRSN: {varchar(30)} <br>
     * 持戻理由
     * @return The value of the column 'HVRTRSN'. (NullAllowed even if selected: for no constraint)
     */
    public String getHvrtrsn() {
        checkSpecifiedProperty("hvrtrsn");
        return convertEmptyToNull(_hvrtrsn);
    }

    /**
     * [set] HVRTRSN: {varchar(30)} <br>
     * 持戻理由
     * @param hvrtrsn The value of the column 'HVRTRSN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHvrtrsn(String hvrtrsn) {
        registerModifiedProperty("hvrtrsn");
        _hvrtrsn = hvrtrsn;
    }

    /**
     * [get] HVRTINOTYMD: {varchar(30)} <br>
     * 持戻入出庫予定日
     * @return The value of the column 'HVRTINOTYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHvrtinotymd() {
        checkSpecifiedProperty("hvrtinotymd");
        return convertEmptyToNull(_hvrtinotymd);
    }

    /**
     * [set] HVRTINOTYMD: {varchar(30)} <br>
     * 持戻入出庫予定日
     * @param hvrtinotymd The value of the column 'HVRTINOTYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHvrtinotymd(String hvrtinotymd) {
        registerModifiedProperty("hvrtinotymd");
        _hvrtinotymd = hvrtinotymd;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(30)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCngprtslpno() {
        checkSpecifiedProperty("cngprtslpno");
        return convertEmptyToNull(_cngprtslpno);
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(30)} <br>
     * 取替相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCngprtslpno(String cngprtslpno) {
        registerModifiedProperty("cngprtslpno");
        _cngprtslpno = cngprtslpno;
    }

    /**
     * [get] TRNSCTNDIV: {char(1)} <br>
     * 処理区分
     * @return The value of the column 'TRNSCTNDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrnsctndiv() {
        checkSpecifiedProperty("trnsctndiv");
        return convertEmptyToNull(_trnsctndiv);
    }

    /**
     * [set] TRNSCTNDIV: {char(1)} <br>
     * 処理区分
     * @param trnsctndiv The value of the column 'TRNSCTNDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrnsctndiv(String trnsctndiv) {
        registerModifiedProperty("trnsctndiv");
        _trnsctndiv = trnsctndiv;
    }

    /**
     * [get] EOSORDAFTFLG: {char(1)} <br>
     * ＥＯＳさしず後フラグ
     * @return The value of the column 'EOSORDAFTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosordaftflg() {
        checkSpecifiedProperty("eosordaftflg");
        return convertEmptyToNull(_eosordaftflg);
    }

    /**
     * [set] EOSORDAFTFLG: {char(1)} <br>
     * ＥＯＳさしず後フラグ
     * @param eosordaftflg The value of the column 'EOSORDAFTFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosordaftflg(String eosordaftflg) {
        registerModifiedProperty("eosordaftflg");
        _eosordaftflg = eosordaftflg;
    }

    /**
     * [get] EOSSLPNO: {varchar(30)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @return The value of the column 'EOSSLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosslpno() {
        checkSpecifiedProperty("eosslpno");
        return convertEmptyToNull(_eosslpno);
    }

    /**
     * [set] EOSSLPNO: {varchar(30)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @param eosslpno The value of the column 'EOSSLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosslpno(String eosslpno) {
        registerModifiedProperty("eosslpno");
        _eosslpno = eosslpno;
    }

    /**
     * [get] HDRDBXDIV: {char(1)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRDBXDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdbxdiv() {
        checkSpecifiedProperty("hdrdbxdiv");
        return convertEmptyToNull(_hdrdbxdiv);
    }

    /**
     * [set] HDRDBXDIV: {char(1)} <br>
     * 100箱拒否区分
     * @param hdrdbxdiv The value of the column 'HDRDBXDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdbxdiv(String hdrdbxdiv) {
        registerModifiedProperty("hdrdbxdiv");
        _hdrdbxdiv = hdrdbxdiv;
    }

    /**
     * [get] INOTRFSLDIV: {char(1)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOTRFSLDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getInotrfsldiv() {
        checkSpecifiedProperty("inotrfsldiv");
        return convertEmptyToNull(_inotrfsldiv);
    }

    /**
     * [set] INOTRFSLDIV: {char(1)} <br>
     * 内外仕分拒否区分
     * @param inotrfsldiv The value of the column 'INOTRFSLDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInotrfsldiv(String inotrfsldiv) {
        registerModifiedProperty("inotrfsldiv");
        _inotrfsldiv = inotrfsldiv;
    }

    /**
     * [get] BXMNTRFSLDIV: {char(1)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BXMNTRFSLDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBxmntrfsldiv() {
        checkSpecifiedProperty("bxmntrfsldiv");
        return convertEmptyToNull(_bxmntrfsldiv);
    }

    /**
     * [set] BXMNTRFSLDIV: {char(1)} <br>
     * 箱跨り拒否区分
     * @param bxmntrfsldiv The value of the column 'BXMNTRFSLDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxmntrfsldiv(String bxmntrfsldiv) {
        registerModifiedProperty("bxmntrfsldiv");
        _bxmntrfsldiv = bxmntrfsldiv;
    }

    /**
     * [get] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'SLPMRGTMG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpmrgtmg() {
        checkSpecifiedProperty("slpmrgtmg");
        return convertEmptyToNull(_slpmrgtmg);
    }

    /**
     * [set] SLPMRGTMG: {varchar(30)} <br>
     * 帳票マージタイミング
     * @param slpmrgtmg The value of the column 'SLPMRGTMG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpmrgtmg(String slpmrgtmg) {
        registerModifiedProperty("slpmrgtmg");
        _slpmrgtmg = slpmrgtmg;
    }

    /**
     * [get] SLPOTYMD: {varchar(8)} <br>
     * 帳票出力年月日
     * @return The value of the column 'SLPOTYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpotymd() {
        checkSpecifiedProperty("slpotymd");
        return convertEmptyToNull(_slpotymd);
    }

    /**
     * [set] SLPOTYMD: {varchar(8)} <br>
     * 帳票出力年月日
     * @param slpotymd The value of the column 'SLPOTYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpotymd(String slpotymd) {
        registerModifiedProperty("slpotymd");
        _slpotymd = slpotymd;
    }

    /**
     * [get] CMPCD: {varchar(30)} <br>
     * 会社CD
     * @return The value of the column 'CMPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCmpcd() {
        checkSpecifiedProperty("cmpcd");
        return convertEmptyToNull(_cmpcd);
    }

    /**
     * [set] CMPCD: {varchar(30)} <br>
     * 会社CD
     * @param cmpcd The value of the column 'CMPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCmpcd(String cmpcd) {
        registerModifiedProperty("cmpcd");
        _cmpcd = cmpcd;
    }

    /**
     * [get] STSCD: {varchar(30)} <br>
     * 状態CD
     * @return The value of the column 'STSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStscd() {
        checkSpecifiedProperty("stscd");
        return convertEmptyToNull(_stscd);
    }

    /**
     * [set] STSCD: {varchar(30)} <br>
     * 状態CD
     * @param stscd The value of the column 'STSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStscd(String stscd) {
        registerModifiedProperty("stscd");
        _stscd = stscd;
    }

    /**
     * [get] STGVAL: {bigint(19)} <br>
     * 不足本数
     * @return The value of the column 'STGVAL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStgval() {
        checkSpecifiedProperty("stgval");
        return _stgval;
    }

    /**
     * [set] STGVAL: {bigint(19)} <br>
     * 不足本数
     * @param stgval The value of the column 'STGVAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStgval(Long stgval) {
        registerModifiedProperty("stgval");
        _stgval = stgval;
    }

    /**
     * [get] SLPNO: {NotNull, varchar(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (basically NotNull if selected: for the constraint)
     */
    public String getSlpno() {
        checkSpecifiedProperty("slpno");
        return convertEmptyToNull(_slpno);
    }

    /**
     * [set] SLPNO: {NotNull, varchar(30)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (basically NotNull if update: for the constraint)
     */
    public void setSlpno(String slpno) {
        registerModifiedProperty("slpno");
        _slpno = slpno;
    }

    /**
     * [get] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @return The value of the column 'TTTOPDEDRNK'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTttopdedrnk() {
        checkSpecifiedProperty("tttopdedrnk");
        return _tttopdedrnk;
    }

    /**
     * [set] TTTOPDEDRNK: {bigint(19)} <br>
     * 今回先頭方面仕分順
     * @param tttopdedrnk The value of the column 'TTTOPDEDRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTttopdedrnk(Long tttopdedrnk) {
        registerModifiedProperty("tttopdedrnk");
        _tttopdedrnk = tttopdedrnk;
    }

    /**
     * [get] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @return The value of the column 'CORDRCVCNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCordrcvcnt() {
        checkSpecifiedProperty("cordrcvcnt");
        return _cordrcvcnt;
    }

    /**
     * [set] CORDRCVCNT: {bigint(19)} <br>
     * さしず受信回数
     * @param cordrcvcnt The value of the column 'CORDRCVCNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCordrcvcnt(Long cordrcvcnt) {
        registerModifiedProperty("cordrcvcnt");
        _cordrcvcnt = cordrcvcnt;
    }

    /**
     * [get] ORDDVFG: {char(1)} <br>
     * オーダ分割フラグ
     * @return The value of the column 'ORDDVFG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrddvfg() {
        checkSpecifiedProperty("orddvfg");
        return convertEmptyToNull(_orddvfg);
    }

    /**
     * [set] ORDDVFG: {char(1)} <br>
     * オーダ分割フラグ
     * @param orddvfg The value of the column 'ORDDVFG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrddvfg(String orddvfg) {
        registerModifiedProperty("orddvfg");
        _orddvfg = orddvfg;
    }

    /**
     * [get] LBCBQA: {bigint(19), default=[0]} <br>
     * 個口数
     * @return The value of the column 'LBCBQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbcbqa() {
        checkSpecifiedProperty("lbcbqa");
        return _lbcbqa;
    }

    /**
     * [set] LBCBQA: {bigint(19), default=[0]} <br>
     * 個口数
     * @param lbcbqa The value of the column 'LBCBQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbcbqa(Long lbcbqa) {
        registerModifiedProperty("lbcbqa");
        _lbcbqa = lbcbqa;
    }

    /**
     * [get] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @return The value of the column 'DRCLSTLBCBID'. (NullAllowed even if selected: for no constraint)
     */
    public String getDrclstlbcbid() {
        checkSpecifiedProperty("drclstlbcbid");
        return convertEmptyToNull(_drclstlbcbid);
    }

    /**
     * [set] DRCLSTLBCBID: {char(1)} <br>
     * 方面最終個口区分
     * @param drclstlbcbid The value of the column 'DRCLSTLBCBID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDrclstlbcbid(String drclstlbcbid) {
        registerModifiedProperty("drclstlbcbid");
        _drclstlbcbid = drclstlbcbid;
    }

    /**
     * [get] LBBOXNO: {bigint(19), default=[(0)]} <br>
     * ライン／ブロック箱Ｎｏ
     * @return The value of the column 'LBBOXNO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbboxno() {
        checkSpecifiedProperty("lbboxno");
        return _lbboxno;
    }

    /**
     * [set] LBBOXNO: {bigint(19), default=[(0)]} <br>
     * ライン／ブロック箱Ｎｏ
     * @param lbboxno The value of the column 'LBBOXNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbboxno(Long lbboxno) {
        registerModifiedProperty("lbboxno");
        _lbboxno = lbboxno;
    }

    /**
     * [get] LBTTBOXQA: {bigint(19), default=[(0)]} <br>
     * ライン／ブロックトータル箱数
     * @return The value of the column 'LBTTBOXQA'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLbttboxqa() {
        checkSpecifiedProperty("lbttboxqa");
        return _lbttboxqa;
    }

    /**
     * [set] LBTTBOXQA: {bigint(19), default=[(0)]} <br>
     * ライン／ブロックトータル箱数
     * @param lbttboxqa The value of the column 'LBTTBOXQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLbttboxqa(Long lbttboxqa) {
        registerModifiedProperty("lbttboxqa");
        _lbttboxqa = lbttboxqa;
    }

    /**
     * [get] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @return The value of the column 'IKEIINCLDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getIkeiincldflg() {
        checkSpecifiedProperty("ikeiincldflg");
        return convertEmptyToNull(_ikeiincldflg);
    }

    /**
     * [set] IKEIINCLDFLG: {char(1), default=[0]} <br>
     * 異型品同梱フラグ
     * @param ikeiincldflg The value of the column 'IKEIINCLDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIkeiincldflg(String ikeiincldflg) {
        registerModifiedProperty("ikeiincldflg");
        _ikeiincldflg = ikeiincldflg;
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
