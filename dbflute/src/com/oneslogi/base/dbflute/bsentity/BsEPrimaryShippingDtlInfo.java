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
 * The entity of E_PRIMARY_SHIPPING_DTL_INFO as TABLE. <br>
 * 一次輸送詳細情報受信テーブル
 * <pre>
 * [primary-key]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
 *
 * [column]
 *     PRIMARY_SHIPPING_DTL_INFO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, ZZBUKRS, ZZSNDYMD, RCDID, ZZREFENO, BNWHCD, HDRID, DTLNO, SPNDDA, PDLGTM, ZZSENDNO, PRCSORG, EKGRP, SPCD, SPSKPLCD, RCCD, RCSKPLCD, ZZRCVYMD, ZZSHTYPE, AGCD, ZZCBXQTY, ZZPLTQTY, ZZTPLQTY, ZZSHPCLS, ZZREFE01, ZZREFE02, ZZREFE03, ZZREFE04, ZZREFE05, ZZREFE06, ZZREFE07, ZZREFE08, ZZREFE09, ZZREFE10, DTLQA, ZZREFENO2, OPRTNO, BLOCKNM, ZZMATNR, LOTNO, QUANTY, GRPCSD, SFPOQA, DSSKPLCD, MFINF, SFTHDES, CNFATCL, LASTGR, SFLASTDES, SHNO, PLTNO, TRADELIVNO, BATJMFYM, SFFIL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRIMARY_SHIPPING_DTL_INFO_ID
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
 * Long primaryShippingDtlInfoId = entity.getPrimaryShippingDtlInfoId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String zzbukrs = entity.getZzbukrs();
 * String zzsndymd = entity.getZzsndymd();
 * String rcdid = entity.getRcdid();
 * String zzrefeno = entity.getZzrefeno();
 * String bnwhcd = entity.getBnwhcd();
 * String hdrid = entity.getHdrid();
 * String dtlno = entity.getDtlno();
 * String spndda = entity.getSpndda();
 * String pdlgtm = entity.getPdlgtm();
 * String zzsendno = entity.getZzsendno();
 * String prcsorg = entity.getPrcsorg();
 * String ekgrp = entity.getEkgrp();
 * String spcd = entity.getSpcd();
 * String spskplcd = entity.getSpskplcd();
 * String rccd = entity.getRccd();
 * String rcskplcd = entity.getRcskplcd();
 * String zzrcvymd = entity.getZzrcvymd();
 * String zzshtype = entity.getZzshtype();
 * String agcd = entity.getAgcd();
 * String zzcbxqty = entity.getZzcbxqty();
 * String zzpltqty = entity.getZzpltqty();
 * String zztplqty = entity.getZztplqty();
 * String zzshpcls = entity.getZzshpcls();
 * String zzrefe01 = entity.getZzrefe01();
 * String zzrefe02 = entity.getZzrefe02();
 * String zzrefe03 = entity.getZzrefe03();
 * String zzrefe04 = entity.getZzrefe04();
 * String zzrefe05 = entity.getZzrefe05();
 * String zzrefe06 = entity.getZzrefe06();
 * String zzrefe07 = entity.getZzrefe07();
 * String zzrefe08 = entity.getZzrefe08();
 * String zzrefe09 = entity.getZzrefe09();
 * String zzrefe10 = entity.getZzrefe10();
 * String dtlqa = entity.getDtlqa();
 * String zzrefeno2 = entity.getZzrefeno2();
 * String oprtno = entity.getOprtno();
 * String blocknm = entity.getBlocknm();
 * String zzmatnr = entity.getZzmatnr();
 * String lotno = entity.getLotno();
 * String quanty = entity.getQuanty();
 * String grpcsd = entity.getGrpcsd();
 * String sfpoqa = entity.getSfpoqa();
 * String dsskplcd = entity.getDsskplcd();
 * String mfinf = entity.getMfinf();
 * String sfthdes = entity.getSfthdes();
 * String cnfatcl = entity.getCnfatcl();
 * String lastgr = entity.getLastgr();
 * String sflastdes = entity.getSflastdes();
 * String shno = entity.getShno();
 * String pltno = entity.getPltno();
 * String tradelivno = entity.getTradelivno();
 * String batjmfym = entity.getBatjmfym();
 * String sffil = entity.getSffil();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setPrimaryShippingDtlInfoId(primaryShippingDtlInfoId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setZzbukrs(zzbukrs);
 * entity.setZzsndymd(zzsndymd);
 * entity.setRcdid(rcdid);
 * entity.setZzrefeno(zzrefeno);
 * entity.setBnwhcd(bnwhcd);
 * entity.setHdrid(hdrid);
 * entity.setDtlno(dtlno);
 * entity.setSpndda(spndda);
 * entity.setPdlgtm(pdlgtm);
 * entity.setZzsendno(zzsendno);
 * entity.setPrcsorg(prcsorg);
 * entity.setEkgrp(ekgrp);
 * entity.setSpcd(spcd);
 * entity.setSpskplcd(spskplcd);
 * entity.setRccd(rccd);
 * entity.setRcskplcd(rcskplcd);
 * entity.setZzrcvymd(zzrcvymd);
 * entity.setZzshtype(zzshtype);
 * entity.setAgcd(agcd);
 * entity.setZzcbxqty(zzcbxqty);
 * entity.setZzpltqty(zzpltqty);
 * entity.setZztplqty(zztplqty);
 * entity.setZzshpcls(zzshpcls);
 * entity.setZzrefe01(zzrefe01);
 * entity.setZzrefe02(zzrefe02);
 * entity.setZzrefe03(zzrefe03);
 * entity.setZzrefe04(zzrefe04);
 * entity.setZzrefe05(zzrefe05);
 * entity.setZzrefe06(zzrefe06);
 * entity.setZzrefe07(zzrefe07);
 * entity.setZzrefe08(zzrefe08);
 * entity.setZzrefe09(zzrefe09);
 * entity.setZzrefe10(zzrefe10);
 * entity.setDtlqa(dtlqa);
 * entity.setZzrefeno2(zzrefeno2);
 * entity.setOprtno(oprtno);
 * entity.setBlocknm(blocknm);
 * entity.setZzmatnr(zzmatnr);
 * entity.setLotno(lotno);
 * entity.setQuanty(quanty);
 * entity.setGrpcsd(grpcsd);
 * entity.setSfpoqa(sfpoqa);
 * entity.setDsskplcd(dsskplcd);
 * entity.setMfinf(mfinf);
 * entity.setSfthdes(sfthdes);
 * entity.setCnfatcl(cnfatcl);
 * entity.setLastgr(lastgr);
 * entity.setSflastdes(sflastdes);
 * entity.setShno(shno);
 * entity.setPltno(pltno);
 * entity.setTradelivno(tradelivno);
 * entity.setBatjmfym(batjmfym);
 * entity.setSffil(sffil);
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
public abstract class BsEPrimaryShippingDtlInfo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _primaryShippingDtlInfoId;

    /** RECEIVE_CD: {NotNull, varchar(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {NotNull, bigint(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, char(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, char(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {varchar(100)} */
    protected String _errorMessageCd;

    /** ZZBUKRS: {varchar(100)} */
    protected String _zzbukrs;

    /** ZZSNDYMD: {varchar(100)} */
    protected String _zzsndymd;

    /** RCDID: {varchar(100)} */
    protected String _rcdid;

    /** ZZREFENO: {varchar(100)} */
    protected String _zzrefeno;

    /** BNWHCD: {varchar(100)} */
    protected String _bnwhcd;

    /** HDRID: {varchar(100)} */
    protected String _hdrid;

    /** DTLNO: {varchar(100)} */
    protected String _dtlno;

    /** SPNDDA: {varchar(100)} */
    protected String _spndda;

    /** PDLGTM: {varchar(100)} */
    protected String _pdlgtm;

    /** ZZSENDNO: {varchar(100)} */
    protected String _zzsendno;

    /** PRCSORG: {varchar(100)} */
    protected String _prcsorg;

    /** EKGRP: {varchar(100)} */
    protected String _ekgrp;

    /** SPCD: {varchar(100)} */
    protected String _spcd;

    /** SPSKPLCD: {varchar(100)} */
    protected String _spskplcd;

    /** RCCD: {varchar(100)} */
    protected String _rccd;

    /** RCSKPLCD: {varchar(100)} */
    protected String _rcskplcd;

    /** ZZRCVYMD: {varchar(100)} */
    protected String _zzrcvymd;

    /** ZZSHTYPE: {varchar(100)} */
    protected String _zzshtype;

    /** AGCD: {varchar(100)} */
    protected String _agcd;

    /** ZZCBXQTY: {varchar(100)} */
    protected String _zzcbxqty;

    /** ZZPLTQTY: {varchar(100)} */
    protected String _zzpltqty;

    /** ZZTPLQTY: {varchar(100)} */
    protected String _zztplqty;

    /** ZZSHPCLS: {varchar(100)} */
    protected String _zzshpcls;

    /** ZZREFE01: {varchar(100)} */
    protected String _zzrefe01;

    /** ZZREFE02: {varchar(100)} */
    protected String _zzrefe02;

    /** ZZREFE03: {varchar(100)} */
    protected String _zzrefe03;

    /** ZZREFE04: {varchar(100)} */
    protected String _zzrefe04;

    /** ZZREFE05: {varchar(100)} */
    protected String _zzrefe05;

    /** ZZREFE06: {varchar(100)} */
    protected String _zzrefe06;

    /** ZZREFE07: {varchar(100)} */
    protected String _zzrefe07;

    /** ZZREFE08: {varchar(100)} */
    protected String _zzrefe08;

    /** ZZREFE09: {varchar(100)} */
    protected String _zzrefe09;

    /** ZZREFE10: {varchar(100)} */
    protected String _zzrefe10;

    /** DTLQA: {varchar(100)} */
    protected String _dtlqa;

    /** ZZREFENO2: {varchar(100)} */
    protected String _zzrefeno2;

    /** OPRTNO: {varchar(100)} */
    protected String _oprtno;

    /** BLOCKNM: {varchar(100)} */
    protected String _blocknm;

    /** ZZMATNR: {varchar(100)} */
    protected String _zzmatnr;

    /** LOTNO: {varchar(100)} */
    protected String _lotno;

    /** QUANTY: {varchar(100)} */
    protected String _quanty;

    /** GRPCSD: {varchar(100)} */
    protected String _grpcsd;

    /** SFPOQA: {varchar(100)} */
    protected String _sfpoqa;

    /** DSSKPLCD: {varchar(100)} */
    protected String _dsskplcd;

    /** MFINF: {varchar(100)} */
    protected String _mfinf;

    /** SFTHDES: {varchar(100)} */
    protected String _sfthdes;

    /** CNFATCL: {varchar(100)} */
    protected String _cnfatcl;

    /** LASTGR: {varchar(100)} */
    protected String _lastgr;

    /** SFLASTDES: {varchar(100)} */
    protected String _sflastdes;

    /** SHNO: {varchar(100)} */
    protected String _shno;

    /** PLTNO: {varchar(100)} */
    protected String _pltno;

    /** TRADELIVNO: {varchar(100)} */
    protected String _tradelivno;

    /** BATJMFYM: {varchar(100)} */
    protected String _batjmfym;

    /** SFFIL: {varchar(100)} */
    protected String _sffil;

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
        return "E_PRIMARY_SHIPPING_DTL_INFO";
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
        if (_primaryShippingDtlInfoId == null) { return false; }
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
        if (obj instanceof BsEPrimaryShippingDtlInfo) {
            BsEPrimaryShippingDtlInfo other = (BsEPrimaryShippingDtlInfo)obj;
            if (!xSV(_primaryShippingDtlInfoId, other._primaryShippingDtlInfoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _primaryShippingDtlInfoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_primaryShippingDtlInfoId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_zzbukrs));
        sb.append(dm).append(xfND(_zzsndymd));
        sb.append(dm).append(xfND(_rcdid));
        sb.append(dm).append(xfND(_zzrefeno));
        sb.append(dm).append(xfND(_bnwhcd));
        sb.append(dm).append(xfND(_hdrid));
        sb.append(dm).append(xfND(_dtlno));
        sb.append(dm).append(xfND(_spndda));
        sb.append(dm).append(xfND(_pdlgtm));
        sb.append(dm).append(xfND(_zzsendno));
        sb.append(dm).append(xfND(_prcsorg));
        sb.append(dm).append(xfND(_ekgrp));
        sb.append(dm).append(xfND(_spcd));
        sb.append(dm).append(xfND(_spskplcd));
        sb.append(dm).append(xfND(_rccd));
        sb.append(dm).append(xfND(_rcskplcd));
        sb.append(dm).append(xfND(_zzrcvymd));
        sb.append(dm).append(xfND(_zzshtype));
        sb.append(dm).append(xfND(_agcd));
        sb.append(dm).append(xfND(_zzcbxqty));
        sb.append(dm).append(xfND(_zzpltqty));
        sb.append(dm).append(xfND(_zztplqty));
        sb.append(dm).append(xfND(_zzshpcls));
        sb.append(dm).append(xfND(_zzrefe01));
        sb.append(dm).append(xfND(_zzrefe02));
        sb.append(dm).append(xfND(_zzrefe03));
        sb.append(dm).append(xfND(_zzrefe04));
        sb.append(dm).append(xfND(_zzrefe05));
        sb.append(dm).append(xfND(_zzrefe06));
        sb.append(dm).append(xfND(_zzrefe07));
        sb.append(dm).append(xfND(_zzrefe08));
        sb.append(dm).append(xfND(_zzrefe09));
        sb.append(dm).append(xfND(_zzrefe10));
        sb.append(dm).append(xfND(_dtlqa));
        sb.append(dm).append(xfND(_zzrefeno2));
        sb.append(dm).append(xfND(_oprtno));
        sb.append(dm).append(xfND(_blocknm));
        sb.append(dm).append(xfND(_zzmatnr));
        sb.append(dm).append(xfND(_lotno));
        sb.append(dm).append(xfND(_quanty));
        sb.append(dm).append(xfND(_grpcsd));
        sb.append(dm).append(xfND(_sfpoqa));
        sb.append(dm).append(xfND(_dsskplcd));
        sb.append(dm).append(xfND(_mfinf));
        sb.append(dm).append(xfND(_sfthdes));
        sb.append(dm).append(xfND(_cnfatcl));
        sb.append(dm).append(xfND(_lastgr));
        sb.append(dm).append(xfND(_sflastdes));
        sb.append(dm).append(xfND(_shno));
        sb.append(dm).append(xfND(_pltno));
        sb.append(dm).append(xfND(_tradelivno));
        sb.append(dm).append(xfND(_batjmfym));
        sb.append(dm).append(xfND(_sffil));
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
    public EPrimaryShippingDtlInfo clone() {
        return (EPrimaryShippingDtlInfo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細情報受信ID
     * @return The value of the column 'PRIMARY_SHIPPING_DTL_INFO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrimaryShippingDtlInfoId() {
        checkSpecifiedProperty("primaryShippingDtlInfoId");
        return _primaryShippingDtlInfoId;
    }

    /**
     * [set] PRIMARY_SHIPPING_DTL_INFO_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 一次輸送詳細情報受信ID
     * @param primaryShippingDtlInfoId The value of the column 'PRIMARY_SHIPPING_DTL_INFO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPrimaryShippingDtlInfoId(Long primaryShippingDtlInfoId) {
        registerModifiedProperty("primaryShippingDtlInfoId");
        _primaryShippingDtlInfoId = primaryShippingDtlInfoId;
    }

    /**
     * [get] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {NotNull, varchar(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
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
     * [get] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, char(1), default=[0]} <br>
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
     * [get] ZZBUKRS: {varchar(100)} <br>
     * 会社コード
     * @return The value of the column 'ZZBUKRS'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzbukrs() {
        checkSpecifiedProperty("zzbukrs");
        return convertEmptyToNull(_zzbukrs);
    }

    /**
     * [set] ZZBUKRS: {varchar(100)} <br>
     * 会社コード
     * @param zzbukrs The value of the column 'ZZBUKRS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzbukrs(String zzbukrs) {
        registerModifiedProperty("zzbukrs");
        _zzbukrs = zzbukrs;
    }

    /**
     * [get] ZZSNDYMD: {varchar(100)} <br>
     * 発送予定年月日
     * @return The value of the column 'ZZSNDYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzsndymd() {
        checkSpecifiedProperty("zzsndymd");
        return convertEmptyToNull(_zzsndymd);
    }

    /**
     * [set] ZZSNDYMD: {varchar(100)} <br>
     * 発送予定年月日
     * @param zzsndymd The value of the column 'ZZSNDYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzsndymd(String zzsndymd) {
        registerModifiedProperty("zzsndymd");
        _zzsndymd = zzsndymd;
    }

    /**
     * [get] RCDID: {varchar(100)} <br>
     * レコード区分
     * @return The value of the column 'RCDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcdid() {
        checkSpecifiedProperty("rcdid");
        return convertEmptyToNull(_rcdid);
    }

    /**
     * [set] RCDID: {varchar(100)} <br>
     * レコード区分
     * @param rcdid The value of the column 'RCDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcdid(String rcdid) {
        registerModifiedProperty("rcdid");
        _rcdid = rcdid;
    }

    /**
     * [get] ZZREFENO: {varchar(100)} <br>
     * 整理番号
     * @return The value of the column 'ZZREFENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefeno() {
        checkSpecifiedProperty("zzrefeno");
        return convertEmptyToNull(_zzrefeno);
    }

    /**
     * [set] ZZREFENO: {varchar(100)} <br>
     * 整理番号
     * @param zzrefeno The value of the column 'ZZREFENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefeno(String zzrefeno) {
        registerModifiedProperty("zzrefeno");
        _zzrefeno = zzrefeno;
    }

    /**
     * [get] BNWHCD: {varchar(100)} <br>
     * 枝倉庫コード
     * @return The value of the column 'BNWHCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBnwhcd() {
        checkSpecifiedProperty("bnwhcd");
        return convertEmptyToNull(_bnwhcd);
    }

    /**
     * [set] BNWHCD: {varchar(100)} <br>
     * 枝倉庫コード
     * @param bnwhcd The value of the column 'BNWHCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBnwhcd(String bnwhcd) {
        registerModifiedProperty("bnwhcd");
        _bnwhcd = bnwhcd;
    }

    /**
     * [get] HDRID: {varchar(100)} <br>
     * ヘッダ区分
     * @return The value of the column 'HDRID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrid() {
        checkSpecifiedProperty("hdrid");
        return convertEmptyToNull(_hdrid);
    }

    /**
     * [set] HDRID: {varchar(100)} <br>
     * ヘッダ区分
     * @param hdrid The value of the column 'HDRID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrid(String hdrid) {
        registerModifiedProperty("hdrid");
        _hdrid = hdrid;
    }

    /**
     * [get] DTLNO: {varchar(100)} <br>
     * 明細番号
     * @return The value of the column 'DTLNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtlno() {
        checkSpecifiedProperty("dtlno");
        return convertEmptyToNull(_dtlno);
    }

    /**
     * [set] DTLNO: {varchar(100)} <br>
     * 明細番号
     * @param dtlno The value of the column 'DTLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtlno(String dtlno) {
        registerModifiedProperty("dtlno");
        _dtlno = dtlno;
    }

    /**
     * [get] SPNDDA: {varchar(100)} <br>
     * 発地所要日付
     * @return The value of the column 'SPNDDA'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpndda() {
        checkSpecifiedProperty("spndda");
        return convertEmptyToNull(_spndda);
    }

    /**
     * [set] SPNDDA: {varchar(100)} <br>
     * 発地所要日付
     * @param spndda The value of the column 'SPNDDA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpndda(String spndda) {
        registerModifiedProperty("spndda");
        _spndda = spndda;
    }

    /**
     * [get] PDLGTM: {varchar(100)} <br>
     * 予定納入時間
     * @return The value of the column 'PDLGTM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPdlgtm() {
        checkSpecifiedProperty("pdlgtm");
        return convertEmptyToNull(_pdlgtm);
    }

    /**
     * [set] PDLGTM: {varchar(100)} <br>
     * 予定納入時間
     * @param pdlgtm The value of the column 'PDLGTM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPdlgtm(String pdlgtm) {
        registerModifiedProperty("pdlgtm");
        _pdlgtm = pdlgtm;
    }

    /**
     * [get] ZZSENDNO: {varchar(100)} <br>
     * 発送番号
     * @return The value of the column 'ZZSENDNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzsendno() {
        checkSpecifiedProperty("zzsendno");
        return convertEmptyToNull(_zzsendno);
    }

    /**
     * [set] ZZSENDNO: {varchar(100)} <br>
     * 発送番号
     * @param zzsendno The value of the column 'ZZSENDNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzsendno(String zzsendno) {
        registerModifiedProperty("zzsendno");
        _zzsendno = zzsendno;
    }

    /**
     * [get] PRCSORG: {varchar(100)} <br>
     * 購買組織
     * @return The value of the column 'PRCSORG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrcsorg() {
        checkSpecifiedProperty("prcsorg");
        return convertEmptyToNull(_prcsorg);
    }

    /**
     * [set] PRCSORG: {varchar(100)} <br>
     * 購買組織
     * @param prcsorg The value of the column 'PRCSORG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrcsorg(String prcsorg) {
        registerModifiedProperty("prcsorg");
        _prcsorg = prcsorg;
    }

    /**
     * [get] EKGRP: {varchar(100)} <br>
     * 購買グループ
     * @return The value of the column 'EKGRP'. (NullAllowed even if selected: for no constraint)
     */
    public String getEkgrp() {
        checkSpecifiedProperty("ekgrp");
        return convertEmptyToNull(_ekgrp);
    }

    /**
     * [set] EKGRP: {varchar(100)} <br>
     * 購買グループ
     * @param ekgrp The value of the column 'EKGRP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEkgrp(String ekgrp) {
        registerModifiedProperty("ekgrp");
        _ekgrp = ekgrp;
    }

    /**
     * [get] SPCD: {varchar(100)} <br>
     * 発地コード
     * @return The value of the column 'SPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpcd() {
        checkSpecifiedProperty("spcd");
        return convertEmptyToNull(_spcd);
    }

    /**
     * [set] SPCD: {varchar(100)} <br>
     * 発地コード
     * @param spcd The value of the column 'SPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpcd(String spcd) {
        registerModifiedProperty("spcd");
        _spcd = spcd;
    }

    /**
     * [get] SPSKPLCD: {varchar(100)} <br>
     * 発地保管場所コード
     * @return The value of the column 'SPSKPLCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpskplcd() {
        checkSpecifiedProperty("spskplcd");
        return convertEmptyToNull(_spskplcd);
    }

    /**
     * [set] SPSKPLCD: {varchar(100)} <br>
     * 発地保管場所コード
     * @param spskplcd The value of the column 'SPSKPLCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpskplcd(String spskplcd) {
        registerModifiedProperty("spskplcd");
        _spskplcd = spskplcd;
    }

    /**
     * [get] RCCD: {varchar(100)} <br>
     * 受地コード
     * @return The value of the column 'RCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRccd() {
        checkSpecifiedProperty("rccd");
        return convertEmptyToNull(_rccd);
    }

    /**
     * [set] RCCD: {varchar(100)} <br>
     * 受地コード
     * @param rccd The value of the column 'RCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRccd(String rccd) {
        registerModifiedProperty("rccd");
        _rccd = rccd;
    }

    /**
     * [get] RCSKPLCD: {varchar(100)} <br>
     * 受地保管場所コード
     * @return The value of the column 'RCSKPLCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcskplcd() {
        checkSpecifiedProperty("rcskplcd");
        return convertEmptyToNull(_rcskplcd);
    }

    /**
     * [set] RCSKPLCD: {varchar(100)} <br>
     * 受地保管場所コード
     * @param rcskplcd The value of the column 'RCSKPLCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcskplcd(String rcskplcd) {
        registerModifiedProperty("rcskplcd");
        _rcskplcd = rcskplcd;
    }

    /**
     * [get] ZZRCVYMD: {varchar(100)} <br>
     * 受入予定年月日
     * @return The value of the column 'ZZRCVYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrcvymd() {
        checkSpecifiedProperty("zzrcvymd");
        return convertEmptyToNull(_zzrcvymd);
    }

    /**
     * [set] ZZRCVYMD: {varchar(100)} <br>
     * 受入予定年月日
     * @param zzrcvymd The value of the column 'ZZRCVYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrcvymd(String zzrcvymd) {
        registerModifiedProperty("zzrcvymd");
        _zzrcvymd = zzrcvymd;
    }

    /**
     * [get] ZZSHTYPE: {varchar(100)} <br>
     * 輸送形態コード
     * @return The value of the column 'ZZSHTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzshtype() {
        checkSpecifiedProperty("zzshtype");
        return convertEmptyToNull(_zzshtype);
    }

    /**
     * [set] ZZSHTYPE: {varchar(100)} <br>
     * 輸送形態コード
     * @param zzshtype The value of the column 'ZZSHTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzshtype(String zzshtype) {
        registerModifiedProperty("zzshtype");
        _zzshtype = zzshtype;
    }

    /**
     * [get] AGCD: {varchar(100)} <br>
     * 業者コード
     * @return The value of the column 'AGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAgcd() {
        checkSpecifiedProperty("agcd");
        return convertEmptyToNull(_agcd);
    }

    /**
     * [set] AGCD: {varchar(100)} <br>
     * 業者コード
     * @param agcd The value of the column 'AGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAgcd(String agcd) {
        registerModifiedProperty("agcd");
        _agcd = agcd;
    }

    /**
     * [get] ZZCBXQTY: {varchar(100)} <br>
     * 総段ボール数
     * @return The value of the column 'ZZCBXQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzcbxqty() {
        checkSpecifiedProperty("zzcbxqty");
        return convertEmptyToNull(_zzcbxqty);
    }

    /**
     * [set] ZZCBXQTY: {varchar(100)} <br>
     * 総段ボール数
     * @param zzcbxqty The value of the column 'ZZCBXQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzcbxqty(String zzcbxqty) {
        registerModifiedProperty("zzcbxqty");
        _zzcbxqty = zzcbxqty;
    }

    /**
     * [get] ZZPLTQTY: {varchar(100)} <br>
     * パレット数
     * @return The value of the column 'ZZPLTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzpltqty() {
        checkSpecifiedProperty("zzpltqty");
        return convertEmptyToNull(_zzpltqty);
    }

    /**
     * [set] ZZPLTQTY: {varchar(100)} <br>
     * パレット数
     * @param zzpltqty The value of the column 'ZZPLTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzpltqty(String zzpltqty) {
        registerModifiedProperty("zzpltqty");
        _zzpltqty = zzpltqty;
    }

    /**
     * [get] ZZTPLQTY: {varchar(100)} <br>
     * 総パレット数
     * @return The value of the column 'ZZTPLQTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getZztplqty() {
        checkSpecifiedProperty("zztplqty");
        return convertEmptyToNull(_zztplqty);
    }

    /**
     * [set] ZZTPLQTY: {varchar(100)} <br>
     * 総パレット数
     * @param zztplqty The value of the column 'ZZTPLQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZztplqty(String zztplqty) {
        registerModifiedProperty("zztplqty");
        _zztplqty = zztplqty;
    }

    /**
     * [get] ZZSHPCLS: {varchar(100)} <br>
     * 輸送種別
     * @return The value of the column 'ZZSHPCLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzshpcls() {
        checkSpecifiedProperty("zzshpcls");
        return convertEmptyToNull(_zzshpcls);
    }

    /**
     * [set] ZZSHPCLS: {varchar(100)} <br>
     * 輸送種別
     * @param zzshpcls The value of the column 'ZZSHPCLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzshpcls(String zzshpcls) {
        registerModifiedProperty("zzshpcls");
        _zzshpcls = zzshpcls;
    }

    /**
     * [get] ZZREFE01: {varchar(100)} <br>
     * 発送番号内整理番号(1)
     * @return The value of the column 'ZZREFE01'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe01() {
        checkSpecifiedProperty("zzrefe01");
        return convertEmptyToNull(_zzrefe01);
    }

    /**
     * [set] ZZREFE01: {varchar(100)} <br>
     * 発送番号内整理番号(1)
     * @param zzrefe01 The value of the column 'ZZREFE01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe01(String zzrefe01) {
        registerModifiedProperty("zzrefe01");
        _zzrefe01 = zzrefe01;
    }

    /**
     * [get] ZZREFE02: {varchar(100)} <br>
     * 発送番号内整理番号(2)
     * @return The value of the column 'ZZREFE02'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe02() {
        checkSpecifiedProperty("zzrefe02");
        return convertEmptyToNull(_zzrefe02);
    }

    /**
     * [set] ZZREFE02: {varchar(100)} <br>
     * 発送番号内整理番号(2)
     * @param zzrefe02 The value of the column 'ZZREFE02'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe02(String zzrefe02) {
        registerModifiedProperty("zzrefe02");
        _zzrefe02 = zzrefe02;
    }

    /**
     * [get] ZZREFE03: {varchar(100)} <br>
     * 発送番号内整理番号(3)
     * @return The value of the column 'ZZREFE03'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe03() {
        checkSpecifiedProperty("zzrefe03");
        return convertEmptyToNull(_zzrefe03);
    }

    /**
     * [set] ZZREFE03: {varchar(100)} <br>
     * 発送番号内整理番号(3)
     * @param zzrefe03 The value of the column 'ZZREFE03'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe03(String zzrefe03) {
        registerModifiedProperty("zzrefe03");
        _zzrefe03 = zzrefe03;
    }

    /**
     * [get] ZZREFE04: {varchar(100)} <br>
     * 発送番号内整理番号(4)
     * @return The value of the column 'ZZREFE04'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe04() {
        checkSpecifiedProperty("zzrefe04");
        return convertEmptyToNull(_zzrefe04);
    }

    /**
     * [set] ZZREFE04: {varchar(100)} <br>
     * 発送番号内整理番号(4)
     * @param zzrefe04 The value of the column 'ZZREFE04'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe04(String zzrefe04) {
        registerModifiedProperty("zzrefe04");
        _zzrefe04 = zzrefe04;
    }

    /**
     * [get] ZZREFE05: {varchar(100)} <br>
     * 発送番号内整理番号(5)
     * @return The value of the column 'ZZREFE05'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe05() {
        checkSpecifiedProperty("zzrefe05");
        return convertEmptyToNull(_zzrefe05);
    }

    /**
     * [set] ZZREFE05: {varchar(100)} <br>
     * 発送番号内整理番号(5)
     * @param zzrefe05 The value of the column 'ZZREFE05'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe05(String zzrefe05) {
        registerModifiedProperty("zzrefe05");
        _zzrefe05 = zzrefe05;
    }

    /**
     * [get] ZZREFE06: {varchar(100)} <br>
     * 発送番号内整理番号(6)
     * @return The value of the column 'ZZREFE06'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe06() {
        checkSpecifiedProperty("zzrefe06");
        return convertEmptyToNull(_zzrefe06);
    }

    /**
     * [set] ZZREFE06: {varchar(100)} <br>
     * 発送番号内整理番号(6)
     * @param zzrefe06 The value of the column 'ZZREFE06'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe06(String zzrefe06) {
        registerModifiedProperty("zzrefe06");
        _zzrefe06 = zzrefe06;
    }

    /**
     * [get] ZZREFE07: {varchar(100)} <br>
     * 発送番号内整理番号(7)
     * @return The value of the column 'ZZREFE07'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe07() {
        checkSpecifiedProperty("zzrefe07");
        return convertEmptyToNull(_zzrefe07);
    }

    /**
     * [set] ZZREFE07: {varchar(100)} <br>
     * 発送番号内整理番号(7)
     * @param zzrefe07 The value of the column 'ZZREFE07'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe07(String zzrefe07) {
        registerModifiedProperty("zzrefe07");
        _zzrefe07 = zzrefe07;
    }

    /**
     * [get] ZZREFE08: {varchar(100)} <br>
     * 発送番号内整理番号(8)
     * @return The value of the column 'ZZREFE08'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe08() {
        checkSpecifiedProperty("zzrefe08");
        return convertEmptyToNull(_zzrefe08);
    }

    /**
     * [set] ZZREFE08: {varchar(100)} <br>
     * 発送番号内整理番号(8)
     * @param zzrefe08 The value of the column 'ZZREFE08'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe08(String zzrefe08) {
        registerModifiedProperty("zzrefe08");
        _zzrefe08 = zzrefe08;
    }

    /**
     * [get] ZZREFE09: {varchar(100)} <br>
     * 発送番号内整理番号(9)
     * @return The value of the column 'ZZREFE09'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe09() {
        checkSpecifiedProperty("zzrefe09");
        return convertEmptyToNull(_zzrefe09);
    }

    /**
     * [set] ZZREFE09: {varchar(100)} <br>
     * 発送番号内整理番号(9)
     * @param zzrefe09 The value of the column 'ZZREFE09'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe09(String zzrefe09) {
        registerModifiedProperty("zzrefe09");
        _zzrefe09 = zzrefe09;
    }

    /**
     * [get] ZZREFE10: {varchar(100)} <br>
     * 発送番号内整理番号(10)
     * @return The value of the column 'ZZREFE10'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefe10() {
        checkSpecifiedProperty("zzrefe10");
        return convertEmptyToNull(_zzrefe10);
    }

    /**
     * [set] ZZREFE10: {varchar(100)} <br>
     * 発送番号内整理番号(10)
     * @param zzrefe10 The value of the column 'ZZREFE10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefe10(String zzrefe10) {
        registerModifiedProperty("zzrefe10");
        _zzrefe10 = zzrefe10;
    }

    /**
     * [get] DTLQA: {varchar(100)} <br>
     * 明細数
     * @return The value of the column 'DTLQA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDtlqa() {
        checkSpecifiedProperty("dtlqa");
        return convertEmptyToNull(_dtlqa);
    }

    /**
     * [set] DTLQA: {varchar(100)} <br>
     * 明細数
     * @param dtlqa The value of the column 'DTLQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDtlqa(String dtlqa) {
        registerModifiedProperty("dtlqa");
        _dtlqa = dtlqa;
    }

    /**
     * [get] ZZREFENO2: {varchar(100)} <br>
     * 相手整理番号
     * @return The value of the column 'ZZREFENO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzrefeno2() {
        checkSpecifiedProperty("zzrefeno2");
        return convertEmptyToNull(_zzrefeno2);
    }

    /**
     * [set] ZZREFENO2: {varchar(100)} <br>
     * 相手整理番号
     * @param zzrefeno2 The value of the column 'ZZREFENO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzrefeno2(String zzrefeno2) {
        registerModifiedProperty("zzrefeno2");
        _zzrefeno2 = zzrefeno2;
    }

    /**
     * [get] OPRTNO: {varchar(100)} <br>
     * 作業番号
     * @return The value of the column 'OPRTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOprtno() {
        checkSpecifiedProperty("oprtno");
        return convertEmptyToNull(_oprtno);
    }

    /**
     * [set] OPRTNO: {varchar(100)} <br>
     * 作業番号
     * @param oprtno The value of the column 'OPRTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOprtno(String oprtno) {
        registerModifiedProperty("oprtno");
        _oprtno = oprtno;
    }

    /**
     * [get] BLOCKNM: {varchar(100)} <br>
     * ブロック名
     * @return The value of the column 'BLOCKNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlocknm() {
        checkSpecifiedProperty("blocknm");
        return convertEmptyToNull(_blocknm);
    }

    /**
     * [set] BLOCKNM: {varchar(100)} <br>
     * ブロック名
     * @param blocknm The value of the column 'BLOCKNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlocknm(String blocknm) {
        registerModifiedProperty("blocknm");
        _blocknm = blocknm;
    }

    /**
     * [get] ZZMATNR: {varchar(100)} <br>
     * 銘柄コード
     * @return The value of the column 'ZZMATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzmatnr() {
        checkSpecifiedProperty("zzmatnr");
        return convertEmptyToNull(_zzmatnr);
    }

    /**
     * [set] ZZMATNR: {varchar(100)} <br>
     * 銘柄コード
     * @param zzmatnr The value of the column 'ZZMATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzmatnr(String zzmatnr) {
        registerModifiedProperty("zzmatnr");
        _zzmatnr = zzmatnr;
    }

    /**
     * [get] LOTNO: {varchar(100)} <br>
     * ロット番号
     * @return The value of the column 'LOTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotno() {
        checkSpecifiedProperty("lotno");
        return convertEmptyToNull(_lotno);
    }

    /**
     * [set] LOTNO: {varchar(100)} <br>
     * ロット番号
     * @param lotno The value of the column 'LOTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotno(String lotno) {
        registerModifiedProperty("lotno");
        _lotno = lotno;
    }

    /**
     * [get] QUANTY: {varchar(100)} <br>
     * 数量（１３桁）
     * @return The value of the column 'QUANTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getQuanty() {
        checkSpecifiedProperty("quanty");
        return convertEmptyToNull(_quanty);
    }

    /**
     * [set] QUANTY: {varchar(100)} <br>
     * 数量（１３桁）
     * @param quanty The value of the column 'QUANTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuanty(String quanty) {
        registerModifiedProperty("quanty");
        _quanty = quanty;
    }

    /**
     * [get] GRPCSD: {varchar(100)} <br>
     * 入庫処理日数
     * @return The value of the column 'GRPCSD'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrpcsd() {
        checkSpecifiedProperty("grpcsd");
        return convertEmptyToNull(_grpcsd);
    }

    /**
     * [set] GRPCSD: {varchar(100)} <br>
     * 入庫処理日数
     * @param grpcsd The value of the column 'GRPCSD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrpcsd(String grpcsd) {
        registerModifiedProperty("grpcsd");
        _grpcsd = grpcsd;
    }

    /**
     * [get] SFPOQA: {varchar(100)} <br>
     * 滅却数量（計算用）
     * @return The value of the column 'SFPOQA'. (NullAllowed even if selected: for no constraint)
     */
    public String getSfpoqa() {
        checkSpecifiedProperty("sfpoqa");
        return convertEmptyToNull(_sfpoqa);
    }

    /**
     * [set] SFPOQA: {varchar(100)} <br>
     * 滅却数量（計算用）
     * @param sfpoqa The value of the column 'SFPOQA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSfpoqa(String sfpoqa) {
        registerModifiedProperty("sfpoqa");
        _sfpoqa = sfpoqa;
    }

    /**
     * [get] DSSKPLCD: {varchar(100)} <br>
     * 相手先保管場所
     * @return The value of the column 'DSSKPLCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDsskplcd() {
        checkSpecifiedProperty("dsskplcd");
        return convertEmptyToNull(_dsskplcd);
    }

    /**
     * [set] DSSKPLCD: {varchar(100)} <br>
     * 相手先保管場所
     * @param dsskplcd The value of the column 'DSSKPLCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDsskplcd(String dsskplcd) {
        registerModifiedProperty("dsskplcd");
        _dsskplcd = dsskplcd;
    }

    /**
     * [get] MFINF: {varchar(100)} <br>
     * 製造情報
     * @return The value of the column 'MFINF'. (NullAllowed even if selected: for no constraint)
     */
    public String getMfinf() {
        checkSpecifiedProperty("mfinf");
        return convertEmptyToNull(_mfinf);
    }

    /**
     * [set] MFINF: {varchar(100)} <br>
     * 製造情報
     * @param mfinf The value of the column 'MFINF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMfinf(String mfinf) {
        registerModifiedProperty("mfinf");
        _mfinf = mfinf;
    }

    /**
     * [get] SFTHDES: {varchar(100)} <br>
     * 今回デザイン
     * @return The value of the column 'SFTHDES'. (NullAllowed even if selected: for no constraint)
     */
    public String getSfthdes() {
        checkSpecifiedProperty("sfthdes");
        return convertEmptyToNull(_sfthdes);
    }

    /**
     * [set] SFTHDES: {varchar(100)} <br>
     * 今回デザイン
     * @param sfthdes The value of the column 'SFTHDES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSfthdes(String sfthdes) {
        registerModifiedProperty("sfthdes");
        _sfthdes = sfthdes;
    }

    /**
     * [get] CNFATCL: {varchar(100)} <br>
     * 確認事項
     * @return The value of the column 'CNFATCL'. (NullAllowed even if selected: for no constraint)
     */
    public String getCnfatcl() {
        checkSpecifiedProperty("cnfatcl");
        return convertEmptyToNull(_cnfatcl);
    }

    /**
     * [set] CNFATCL: {varchar(100)} <br>
     * 確認事項
     * @param cnfatcl The value of the column 'CNFATCL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCnfatcl(String cnfatcl) {
        registerModifiedProperty("cnfatcl");
        _cnfatcl = cnfatcl;
    }

    /**
     * [get] LASTGR: {varchar(100)} <br>
     * 前回入庫
     * @return The value of the column 'LASTGR'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastgr() {
        checkSpecifiedProperty("lastgr");
        return convertEmptyToNull(_lastgr);
    }

    /**
     * [set] LASTGR: {varchar(100)} <br>
     * 前回入庫
     * @param lastgr The value of the column 'LASTGR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastgr(String lastgr) {
        registerModifiedProperty("lastgr");
        _lastgr = lastgr;
    }

    /**
     * [get] SFLASTDES: {varchar(100)} <br>
     * 前回デザイン
     * @return The value of the column 'SFLASTDES'. (NullAllowed even if selected: for no constraint)
     */
    public String getSflastdes() {
        checkSpecifiedProperty("sflastdes");
        return convertEmptyToNull(_sflastdes);
    }

    /**
     * [set] SFLASTDES: {varchar(100)} <br>
     * 前回デザイン
     * @param sflastdes The value of the column 'SFLASTDES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSflastdes(String sflastdes) {
        registerModifiedProperty("sflastdes");
        _sflastdes = sflastdes;
    }

    /**
     * [get] SHNO: {varchar(100)} <br>
     * 問合せ番号
     * @return The value of the column 'SHNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShno() {
        checkSpecifiedProperty("shno");
        return convertEmptyToNull(_shno);
    }

    /**
     * [set] SHNO: {varchar(100)} <br>
     * 問合せ番号
     * @param shno The value of the column 'SHNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShno(String shno) {
        registerModifiedProperty("shno");
        _shno = shno;
    }

    /**
     * [get] PLTNO: {varchar(100)} <br>
     * パレット番号（０８需給）
     * @return The value of the column 'PLTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPltno() {
        checkSpecifiedProperty("pltno");
        return convertEmptyToNull(_pltno);
    }

    /**
     * [set] PLTNO: {varchar(100)} <br>
     * パレット番号（０８需給）
     * @param pltno The value of the column 'PLTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPltno(String pltno) {
        registerModifiedProperty("pltno");
        _pltno = pltno;
    }

    /**
     * [get] TRADELIVNO: {varchar(100)} <br>
     * 商社搬入番号
     * @return The value of the column 'TRADELIVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTradelivno() {
        checkSpecifiedProperty("tradelivno");
        return convertEmptyToNull(_tradelivno);
    }

    /**
     * [set] TRADELIVNO: {varchar(100)} <br>
     * 商社搬入番号
     * @param tradelivno The value of the column 'TRADELIVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTradelivno(String tradelivno) {
        registerModifiedProperty("tradelivno");
        _tradelivno = tradelivno;
    }

    /**
     * [get] BATJMFYM: {varchar(100)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJMFYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjmfym() {
        checkSpecifiedProperty("batjmfym");
        return convertEmptyToNull(_batjmfym);
    }

    /**
     * [set] BATJMFYM: {varchar(100)} <br>
     * BATJ製造月情報
     * @param batjmfym The value of the column 'BATJMFYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjmfym(String batjmfym) {
        registerModifiedProperty("batjmfym");
        _batjmfym = batjmfym;
    }

    /**
     * [get] SFFIL: {varchar(100)} <br>
     * 空白
     * @return The value of the column 'SFFIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getSffil() {
        checkSpecifiedProperty("sffil");
        return convertEmptyToNull(_sffil);
    }

    /**
     * [set] SFFIL: {varchar(100)} <br>
     * 空白
     * @param sffil The value of the column 'SFFIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSffil(String sffil) {
        registerModifiedProperty("sffil");
        _sffil = sffil;
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
