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
 * The entity of E_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * さしず受信テーブル
 * <pre>
 * [primary-key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEDDER_FLG, ZZORGNCD, DPCD, ORDGR, RMANO, SSCD, SLPTYP, SLPNO, SEQNO, ZZORDYMD, ZZWAYMD1, OTORGCD, ORDORGCD, RLYBSCD, DED, PSTNID, DLVRNK, LMPDLVNO, DIVMTD, HDVID, NAME1, ZREGPRCA, ZREGPRCC, ZZSALTAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, LOGISTICSCD, SLEDIV, HVRTRSN, ZZVBELNB, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, ZZBLOTDT, CGGDID, MATNR, KWMENG, MVGR1, MVGR4, KZWI3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
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
 * Long bondedShippingPlanBulkInputId = entity.getBondedShippingPlanBulkInputId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String hedderFlg = entity.getHedderFlg();
 * String zzorgncd = entity.getZzorgncd();
 * String dpcd = entity.getDpcd();
 * String ordgr = entity.getOrdgr();
 * String rmano = entity.getRmano();
 * String sscd = entity.getSscd();
 * String slptyp = entity.getSlptyp();
 * String slpno = entity.getSlpno();
 * String seqno = entity.getSeqno();
 * String zzordymd = entity.getZzordymd();
 * String zzwaymd1 = entity.getZzwaymd1();
 * String otorgcd = entity.getOtorgcd();
 * String ordorgcd = entity.getOrdorgcd();
 * String rlybscd = entity.getRlybscd();
 * String ded = entity.getDed();
 * String pstnid = entity.getPstnid();
 * String dlvrnk = entity.getDlvrnk();
 * String lmpdlvno = entity.getLmpdlvno();
 * String divmtd = entity.getDivmtd();
 * String hdvid = entity.getHdvid();
 * String name1 = entity.getName1();
 * String zregprca = entity.getZregprca();
 * String zregprcc = entity.getZregprcc();
 * String zzsaltax = entity.getZzsaltax();
 * String zzgodfpc = entity.getZzgodfpc();
 * String zzgodspc = entity.getZzgodspc();
 * String zzgodctx = entity.getZzgodctx();
 * String logisticscd = entity.getLogisticscd();
 * String slediv = entity.getSlediv();
 * String hvrtrsn = entity.getHvrtrsn();
 * String zzvbelnb = entity.getZzvbelnb();
 * String cngprtslpno = entity.getCngprtslpno();
 * String trnsctndiv = entity.getTrnsctndiv();
 * String eosordaftflg = entity.getEosordaftflg();
 * String eosslpno = entity.getEosslpno();
 * String hdrdbxdiv = entity.getHdrdbxdiv();
 * String inotrfsldiv = entity.getInotrfsldiv();
 * String bxmntrfsldiv = entity.getBxmntrfsldiv();
 * String slpmrgtmg = entity.getSlpmrgtmg();
 * String zzblotdt = entity.getZzblotdt();
 * String cggdid = entity.getCggdid();
 * String matnr = entity.getMatnr();
 * String kwmeng = entity.getKwmeng();
 * String mvgr1 = entity.getMvgr1();
 * String mvgr4 = entity.getMvgr4();
 * String kzwi3 = entity.getKzwi3();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setBondedShippingPlanBulkInputId(bondedShippingPlanBulkInputId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setHedderFlg(hedderFlg);
 * entity.setZzorgncd(zzorgncd);
 * entity.setDpcd(dpcd);
 * entity.setOrdgr(ordgr);
 * entity.setRmano(rmano);
 * entity.setSscd(sscd);
 * entity.setSlptyp(slptyp);
 * entity.setSlpno(slpno);
 * entity.setSeqno(seqno);
 * entity.setZzordymd(zzordymd);
 * entity.setZzwaymd1(zzwaymd1);
 * entity.setOtorgcd(otorgcd);
 * entity.setOrdorgcd(ordorgcd);
 * entity.setRlybscd(rlybscd);
 * entity.setDed(ded);
 * entity.setPstnid(pstnid);
 * entity.setDlvrnk(dlvrnk);
 * entity.setLmpdlvno(lmpdlvno);
 * entity.setDivmtd(divmtd);
 * entity.setHdvid(hdvid);
 * entity.setName1(name1);
 * entity.setZregprca(zregprca);
 * entity.setZregprcc(zregprcc);
 * entity.setZzsaltax(zzsaltax);
 * entity.setZzgodfpc(zzgodfpc);
 * entity.setZzgodspc(zzgodspc);
 * entity.setZzgodctx(zzgodctx);
 * entity.setLogisticscd(logisticscd);
 * entity.setSlediv(slediv);
 * entity.setHvrtrsn(hvrtrsn);
 * entity.setZzvbelnb(zzvbelnb);
 * entity.setCngprtslpno(cngprtslpno);
 * entity.setTrnsctndiv(trnsctndiv);
 * entity.setEosordaftflg(eosordaftflg);
 * entity.setEosslpno(eosslpno);
 * entity.setHdrdbxdiv(hdrdbxdiv);
 * entity.setInotrfsldiv(inotrfsldiv);
 * entity.setBxmntrfsldiv(bxmntrfsldiv);
 * entity.setSlpmrgtmg(slpmrgtmg);
 * entity.setZzblotdt(zzblotdt);
 * entity.setCggdid(cggdid);
 * entity.setMatnr(matnr);
 * entity.setKwmeng(kwmeng);
 * entity.setMvgr1(mvgr1);
 * entity.setMvgr4(mvgr4);
 * entity.setKzwi3(kzwi3);
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
public abstract class BsEShippingPlanBulkInput extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _bondedShippingPlanBulkInputId;

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

    /** HEDDER_FLG: {NotNull, char(1)} */
    protected String _hedderFlg;

    /** ZZORGNCD: {varchar(255)} */
    protected String _zzorgncd;

    /** DPCD: {varchar(255)} */
    protected String _dpcd;

    /** ORDGR: {varchar(255)} */
    protected String _ordgr;

    /** RMANO: {varchar(255)} */
    protected String _rmano;

    /** SSCD: {varchar(255)} */
    protected String _sscd;

    /** SLPTYP: {varchar(255)} */
    protected String _slptyp;

    /** SLPNO: {varchar(255)} */
    protected String _slpno;

    /** SEQNO: {varchar(255)} */
    protected String _seqno;

    /** ZZORDYMD: {varchar(255)} */
    protected String _zzordymd;

    /** ZZWAYMD1: {varchar(255)} */
    protected String _zzwaymd1;

    /** OTORGCD: {varchar(255)} */
    protected String _otorgcd;

    /** ORDORGCD: {varchar(255)} */
    protected String _ordorgcd;

    /** RLYBSCD: {varchar(255)} */
    protected String _rlybscd;

    /** DED: {varchar(255)} */
    protected String _ded;

    /** PSTNID: {varchar(255)} */
    protected String _pstnid;

    /** DLVRNK: {varchar(255)} */
    protected String _dlvrnk;

    /** LMPDLVNO: {varchar(255)} */
    protected String _lmpdlvno;

    /** DIVMTD: {varchar(255)} */
    protected String _divmtd;

    /** HDVID: {varchar(255)} */
    protected String _hdvid;

    /** NAME1: {varchar(255)} */
    protected String _name1;

    /** ZREGPRCA: {varchar(255)} */
    protected String _zregprca;

    /** ZREGPRCC: {varchar(255)} */
    protected String _zregprcc;

    /** ZZSALTAX: {varchar(255)} */
    protected String _zzsaltax;

    /** ZZGODFPC: {varchar(255)} */
    protected String _zzgodfpc;

    /** ZZGODSPC: {varchar(255)} */
    protected String _zzgodspc;

    /** ZZGODCTX: {varchar(255)} */
    protected String _zzgodctx;

    /** LOGISTICSCD: {varchar(255)} */
    protected String _logisticscd;

    /** SLEDIV: {varchar(255)} */
    protected String _slediv;

    /** HVRTRSN: {varchar(255)} */
    protected String _hvrtrsn;

    /** ZZVBELNB: {varchar(255)} */
    protected String _zzvbelnb;

    /** CNGPRTSLPNO: {varchar(255)} */
    protected String _cngprtslpno;

    /** TRNSCTNDIV: {varchar(255)} */
    protected String _trnsctndiv;

    /** EOSORDAFTFLG: {varchar(255)} */
    protected String _eosordaftflg;

    /** EOSSLPNO: {varchar(255)} */
    protected String _eosslpno;

    /** HDRDBXDIV: {varchar(255)} */
    protected String _hdrdbxdiv;

    /** INOTRFSLDIV: {varchar(255)} */
    protected String _inotrfsldiv;

    /** BXMNTRFSLDIV: {varchar(255)} */
    protected String _bxmntrfsldiv;

    /** SLPMRGTMG: {varchar(255)} */
    protected String _slpmrgtmg;

    /** ZZBLOTDT: {varchar(255)} */
    protected String _zzblotdt;

    /** CGGDID: {varchar(255)} */
    protected String _cggdid;

    /** MATNR: {varchar(255)} */
    protected String _matnr;

    /** KWMENG: {varchar(255)} */
    protected String _kwmeng;

    /** MVGR1: {varchar(255)} */
    protected String _mvgr1;

    /** MVGR4: {varchar(255)} */
    protected String _mvgr4;

    /** KZWI3: {varchar(255)} */
    protected String _kzwi3;

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
        return "E_SHIPPING_PLAN_BULK_INPUT";
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
        if (_bondedShippingPlanBulkInputId == null) { return false; }
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
        if (obj instanceof BsEShippingPlanBulkInput) {
            BsEShippingPlanBulkInput other = (BsEShippingPlanBulkInput)obj;
            if (!xSV(_bondedShippingPlanBulkInputId, other._bondedShippingPlanBulkInputId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bondedShippingPlanBulkInputId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bondedShippingPlanBulkInputId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_hedderFlg));
        sb.append(dm).append(xfND(_zzorgncd));
        sb.append(dm).append(xfND(_dpcd));
        sb.append(dm).append(xfND(_ordgr));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_sscd));
        sb.append(dm).append(xfND(_slptyp));
        sb.append(dm).append(xfND(_slpno));
        sb.append(dm).append(xfND(_seqno));
        sb.append(dm).append(xfND(_zzordymd));
        sb.append(dm).append(xfND(_zzwaymd1));
        sb.append(dm).append(xfND(_otorgcd));
        sb.append(dm).append(xfND(_ordorgcd));
        sb.append(dm).append(xfND(_rlybscd));
        sb.append(dm).append(xfND(_ded));
        sb.append(dm).append(xfND(_pstnid));
        sb.append(dm).append(xfND(_dlvrnk));
        sb.append(dm).append(xfND(_lmpdlvno));
        sb.append(dm).append(xfND(_divmtd));
        sb.append(dm).append(xfND(_hdvid));
        sb.append(dm).append(xfND(_name1));
        sb.append(dm).append(xfND(_zregprca));
        sb.append(dm).append(xfND(_zregprcc));
        sb.append(dm).append(xfND(_zzsaltax));
        sb.append(dm).append(xfND(_zzgodfpc));
        sb.append(dm).append(xfND(_zzgodspc));
        sb.append(dm).append(xfND(_zzgodctx));
        sb.append(dm).append(xfND(_logisticscd));
        sb.append(dm).append(xfND(_slediv));
        sb.append(dm).append(xfND(_hvrtrsn));
        sb.append(dm).append(xfND(_zzvbelnb));
        sb.append(dm).append(xfND(_cngprtslpno));
        sb.append(dm).append(xfND(_trnsctndiv));
        sb.append(dm).append(xfND(_eosordaftflg));
        sb.append(dm).append(xfND(_eosslpno));
        sb.append(dm).append(xfND(_hdrdbxdiv));
        sb.append(dm).append(xfND(_inotrfsldiv));
        sb.append(dm).append(xfND(_bxmntrfsldiv));
        sb.append(dm).append(xfND(_slpmrgtmg));
        sb.append(dm).append(xfND(_zzblotdt));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_matnr));
        sb.append(dm).append(xfND(_kwmeng));
        sb.append(dm).append(xfND(_mvgr1));
        sb.append(dm).append(xfND(_mvgr4));
        sb.append(dm).append(xfND(_kzwi3));
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
    public EShippingPlanBulkInput clone() {
        return (EShippingPlanBulkInput)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず受信ID
     * @return The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBondedShippingPlanBulkInputId() {
        checkSpecifiedProperty("bondedShippingPlanBulkInputId");
        return _bondedShippingPlanBulkInputId;
    }

    /**
     * [set] BONDED_SHIPPING_PLAN_BULK_INPUT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * さしず受信ID
     * @param bondedShippingPlanBulkInputId The value of the column 'BONDED_SHIPPING_PLAN_BULK_INPUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBondedShippingPlanBulkInputId(Long bondedShippingPlanBulkInputId) {
        registerModifiedProperty("bondedShippingPlanBulkInputId");
        _bondedShippingPlanBulkInputId = bondedShippingPlanBulkInputId;
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
     * [get] HEDDER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @return The value of the column 'HEDDER_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getHedderFlg() {
        checkSpecifiedProperty("hedderFlg");
        return convertEmptyToNull(_hedderFlg);
    }

    /**
     * [set] HEDDER_FLG: {NotNull, char(1)} <br>
     * ヘッダフラグ
     * @param hedderFlg The value of the column 'HEDDER_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setHedderFlg(String hedderFlg) {
        registerModifiedProperty("hedderFlg");
        _hedderFlg = hedderFlg;
    }

    /**
     * [get] ZZORGNCD: {varchar(255)} <br>
     * 仕分基地CD
     * @return The value of the column 'ZZORGNCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzorgncd() {
        checkSpecifiedProperty("zzorgncd");
        return convertEmptyToNull(_zzorgncd);
    }

    /**
     * [set] ZZORGNCD: {varchar(255)} <br>
     * 仕分基地CD
     * @param zzorgncd The value of the column 'ZZORGNCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzorgncd(String zzorgncd) {
        registerModifiedProperty("zzorgncd");
        _zzorgncd = zzorgncd;
    }

    /**
     * [get] DPCD: {varchar(255)} <br>
     * 配達拠点コード
     * @return The value of the column 'DPCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDpcd() {
        checkSpecifiedProperty("dpcd");
        return convertEmptyToNull(_dpcd);
    }

    /**
     * [set] DPCD: {varchar(255)} <br>
     * 配達拠点コード
     * @param dpcd The value of the column 'DPCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDpcd(String dpcd) {
        registerModifiedProperty("dpcd");
        _dpcd = dpcd;
    }

    /**
     * [get] ORDGR: {varchar(255)} <br>
     * さしずグループ
     * @return The value of the column 'ORDGR'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdgr() {
        checkSpecifiedProperty("ordgr");
        return convertEmptyToNull(_ordgr);
    }

    /**
     * [set] ORDGR: {varchar(255)} <br>
     * さしずグループ
     * @param ordgr The value of the column 'ORDGR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdgr(String ordgr) {
        registerModifiedProperty("ordgr");
        _ordgr = ordgr;
    }

    /**
     * [get] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(255)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] SSCD: {varchar(255)} <br>
     * お得意様CD
     * @return The value of the column 'SSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscd() {
        checkSpecifiedProperty("sscd");
        return convertEmptyToNull(_sscd);
    }

    /**
     * [set] SSCD: {varchar(255)} <br>
     * お得意様CD
     * @param sscd The value of the column 'SSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscd(String sscd) {
        registerModifiedProperty("sscd");
        _sscd = sscd;
    }

    /**
     * [get] SLPTYP: {varchar(255)} <br>
     * 伝票タイプ
     * @return The value of the column 'SLPTYP'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlptyp() {
        checkSpecifiedProperty("slptyp");
        return convertEmptyToNull(_slptyp);
    }

    /**
     * [set] SLPTYP: {varchar(255)} <br>
     * 伝票タイプ
     * @param slptyp The value of the column 'SLPTYP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlptyp(String slptyp) {
        registerModifiedProperty("slptyp");
        _slptyp = slptyp;
    }

    /**
     * [get] SLPNO: {varchar(255)} <br>
     * 伝票番号
     * @return The value of the column 'SLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpno() {
        checkSpecifiedProperty("slpno");
        return convertEmptyToNull(_slpno);
    }

    /**
     * [set] SLPNO: {varchar(255)} <br>
     * 伝票番号
     * @param slpno The value of the column 'SLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpno(String slpno) {
        registerModifiedProperty("slpno");
        _slpno = slpno;
    }

    /**
     * [get] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @return The value of the column 'SEQNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeqno() {
        checkSpecifiedProperty("seqno");
        return convertEmptyToNull(_seqno);
    }

    /**
     * [set] SEQNO: {varchar(255)} <br>
     * シーケンス番号
     * @param seqno The value of the column 'SEQNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeqno(String seqno) {
        registerModifiedProperty("seqno");
        _seqno = seqno;
    }

    /**
     * [get] ZZORDYMD: {varchar(255)} <br>
     * さしず年月日
     * @return The value of the column 'ZZORDYMD'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzordymd() {
        checkSpecifiedProperty("zzordymd");
        return convertEmptyToNull(_zzordymd);
    }

    /**
     * [set] ZZORDYMD: {varchar(255)} <br>
     * さしず年月日
     * @param zzordymd The value of the column 'ZZORDYMD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzordymd(String zzordymd) {
        registerModifiedProperty("zzordymd");
        _zzordymd = zzordymd;
    }

    /**
     * [get] ZZWAYMD1: {varchar(255)} <br>
     * 出荷予定年月日
     * @return The value of the column 'ZZWAYMD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzwaymd1() {
        checkSpecifiedProperty("zzwaymd1");
        return convertEmptyToNull(_zzwaymd1);
    }

    /**
     * [set] ZZWAYMD1: {varchar(255)} <br>
     * 出荷予定年月日
     * @param zzwaymd1 The value of the column 'ZZWAYMD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzwaymd1(String zzwaymd1) {
        registerModifiedProperty("zzwaymd1");
        _zzwaymd1 = zzwaymd1;
    }

    /**
     * [get] OTORGCD: {varchar(255)} <br>
     * 出力先組織CD
     * @return The value of the column 'OTORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtorgcd() {
        checkSpecifiedProperty("otorgcd");
        return convertEmptyToNull(_otorgcd);
    }

    /**
     * [set] OTORGCD: {varchar(255)} <br>
     * 出力先組織CD
     * @param otorgcd The value of the column 'OTORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtorgcd(String otorgcd) {
        registerModifiedProperty("otorgcd");
        _otorgcd = otorgcd;
    }

    /**
     * [get] ORDORGCD: {varchar(255)} <br>
     * さしず元組織CD
     * @return The value of the column 'ORDORGCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdorgcd() {
        checkSpecifiedProperty("ordorgcd");
        return convertEmptyToNull(_ordorgcd);
    }

    /**
     * [set] ORDORGCD: {varchar(255)} <br>
     * さしず元組織CD
     * @param ordorgcd The value of the column 'ORDORGCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdorgcd(String ordorgcd) {
        registerModifiedProperty("ordorgcd");
        _ordorgcd = ordorgcd;
    }

    /**
     * [get] RLYBSCD: {varchar(255)} <br>
     * 中継拠点CD
     * @return The value of the column 'RLYBSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getRlybscd() {
        checkSpecifiedProperty("rlybscd");
        return convertEmptyToNull(_rlybscd);
    }

    /**
     * [set] RLYBSCD: {varchar(255)} <br>
     * 中継拠点CD
     * @param rlybscd The value of the column 'RLYBSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRlybscd(String rlybscd) {
        registerModifiedProperty("rlybscd");
        _rlybscd = rlybscd;
    }

    /**
     * [get] DED: {varchar(255)} <br>
     * 配達方面
     * @return The value of the column 'DED'. (NullAllowed even if selected: for no constraint)
     */
    public String getDed() {
        checkSpecifiedProperty("ded");
        return convertEmptyToNull(_ded);
    }

    /**
     * [set] DED: {varchar(255)} <br>
     * 配達方面
     * @param ded The value of the column 'DED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDed(String ded) {
        registerModifiedProperty("ded");
        _ded = ded;
    }

    /**
     * [get] PSTNID: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'PSTNID'. (NullAllowed even if selected: for no constraint)
     */
    public String getPstnid() {
        checkSpecifiedProperty("pstnid");
        return convertEmptyToNull(_pstnid);
    }

    /**
     * [set] PSTNID: {varchar(255)} <br>
     * ピストン区分
     * @param pstnid The value of the column 'PSTNID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPstnid(String pstnid) {
        registerModifiedProperty("pstnid");
        _pstnid = pstnid;
    }

    /**
     * [get] DLVRNK: {varchar(255)} <br>
     * 配達順位
     * @return The value of the column 'DLVRNK'. (NullAllowed even if selected: for no constraint)
     */
    public String getDlvrnk() {
        checkSpecifiedProperty("dlvrnk");
        return convertEmptyToNull(_dlvrnk);
    }

    /**
     * [set] DLVRNK: {varchar(255)} <br>
     * 配達順位
     * @param dlvrnk The value of the column 'DLVRNK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDlvrnk(String dlvrnk) {
        registerModifiedProperty("dlvrnk");
        _dlvrnk = dlvrnk;
    }

    /**
     * [get] LMPDLVNO: {varchar(255)} <br>
     * 一括配達番号
     * @return The value of the column 'LMPDLVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getLmpdlvno() {
        checkSpecifiedProperty("lmpdlvno");
        return convertEmptyToNull(_lmpdlvno);
    }

    /**
     * [set] LMPDLVNO: {varchar(255)} <br>
     * 一括配達番号
     * @param lmpdlvno The value of the column 'LMPDLVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLmpdlvno(String lmpdlvno) {
        registerModifiedProperty("lmpdlvno");
        _lmpdlvno = lmpdlvno;
    }

    /**
     * [get] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @return The value of the column 'DIVMTD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDivmtd() {
        checkSpecifiedProperty("divmtd");
        return convertEmptyToNull(_divmtd);
    }

    /**
     * [set] DIVMTD: {varchar(255)} <br>
     * 仕分方式
     * @param divmtd The value of the column 'DIVMTD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDivmtd(String divmtd) {
        registerModifiedProperty("divmtd");
        _divmtd = divmtd;
    }

    /**
     * [get] HDVID: {varchar(255)} <br>
     * 宅配区分
     * @return The value of the column 'HDVID'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdvid() {
        checkSpecifiedProperty("hdvid");
        return convertEmptyToNull(_hdvid);
    }

    /**
     * [set] HDVID: {varchar(255)} <br>
     * 宅配区分
     * @param hdvid The value of the column 'HDVID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdvid(String hdvid) {
        registerModifiedProperty("hdvid");
        _hdvid = hdvid;
    }

    /**
     * [get] NAME1: {varchar(255)} <br>
     * お得意様名称
     * @return The value of the column 'NAME1'. (NullAllowed even if selected: for no constraint)
     */
    public String getName1() {
        checkSpecifiedProperty("name1");
        return convertEmptyToNull(_name1);
    }

    /**
     * [set] NAME1: {varchar(255)} <br>
     * お得意様名称
     * @param name1 The value of the column 'NAME1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName1(String name1) {
        registerModifiedProperty("name1");
        _name1 = name1;
    }

    /**
     * [get] ZREGPRCA: {varchar(255)} <br>
     * 定価代金
     * @return The value of the column 'ZREGPRCA'. (NullAllowed even if selected: for no constraint)
     */
    public String getZregprca() {
        checkSpecifiedProperty("zregprca");
        return convertEmptyToNull(_zregprca);
    }

    /**
     * [set] ZREGPRCA: {varchar(255)} <br>
     * 定価代金
     * @param zregprca The value of the column 'ZREGPRCA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZregprca(String zregprca) {
        registerModifiedProperty("zregprca");
        _zregprca = zregprca;
    }

    /**
     * [get] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @return The value of the column 'ZREGPRCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZregprcc() {
        checkSpecifiedProperty("zregprcc");
        return convertEmptyToNull(_zregprcc);
    }

    /**
     * [set] ZREGPRCC: {varchar(255)} <br>
     * 販売代金
     * @param zregprcc The value of the column 'ZREGPRCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZregprcc(String zregprcc) {
        registerModifiedProperty("zregprcc");
        _zregprcc = zregprcc;
    }

    /**
     * [get] ZZSALTAX: {varchar(255)} <br>
     * 消費税
     * @return The value of the column 'ZZSALTAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzsaltax() {
        checkSpecifiedProperty("zzsaltax");
        return convertEmptyToNull(_zzsaltax);
    }

    /**
     * [set] ZZSALTAX: {varchar(255)} <br>
     * 消費税
     * @param zzsaltax The value of the column 'ZZSALTAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzsaltax(String zzsaltax) {
        registerModifiedProperty("zzsaltax");
        _zzsaltax = zzsaltax;
    }

    /**
     * [get] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @return The value of the column 'ZZGODFPC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodfpc() {
        checkSpecifiedProperty("zzgodfpc");
        return convertEmptyToNull(_zzgodfpc);
    }

    /**
     * [set] ZZGODFPC: {varchar(255)} <br>
     * 商品分定価代金
     * @param zzgodfpc The value of the column 'ZZGODFPC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodfpc(String zzgodfpc) {
        registerModifiedProperty("zzgodfpc");
        _zzgodfpc = zzgodfpc;
    }

    /**
     * [get] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @return The value of the column 'ZZGODSPC'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodspc() {
        checkSpecifiedProperty("zzgodspc");
        return convertEmptyToNull(_zzgodspc);
    }

    /**
     * [set] ZZGODSPC: {varchar(255)} <br>
     * 商品分販売代金
     * @param zzgodspc The value of the column 'ZZGODSPC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodspc(String zzgodspc) {
        registerModifiedProperty("zzgodspc");
        _zzgodspc = zzgodspc;
    }

    /**
     * [get] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @return The value of the column 'ZZGODCTX'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzgodctx() {
        checkSpecifiedProperty("zzgodctx");
        return convertEmptyToNull(_zzgodctx);
    }

    /**
     * [set] ZZGODCTX: {varchar(255)} <br>
     * 商品分消費税
     * @param zzgodctx The value of the column 'ZZGODCTX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzgodctx(String zzgodctx) {
        registerModifiedProperty("zzgodctx");
        _zzgodctx = zzgodctx;
    }

    /**
     * [get] LOGISTICSCD: {varchar(255)} <br>
     * 会社CD
     * @return The value of the column 'LOGISTICSCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogisticscd() {
        checkSpecifiedProperty("logisticscd");
        return convertEmptyToNull(_logisticscd);
    }

    /**
     * [set] LOGISTICSCD: {varchar(255)} <br>
     * 会社CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogisticscd(String logisticscd) {
        registerModifiedProperty("logisticscd");
        _logisticscd = logisticscd;
    }

    /**
     * [get] SLEDIV: {varchar(255)} <br>
     * 販売区分
     * @return The value of the column 'SLEDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlediv() {
        checkSpecifiedProperty("slediv");
        return convertEmptyToNull(_slediv);
    }

    /**
     * [set] SLEDIV: {varchar(255)} <br>
     * 販売区分
     * @param slediv The value of the column 'SLEDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlediv(String slediv) {
        registerModifiedProperty("slediv");
        _slediv = slediv;
    }

    /**
     * [get] HVRTRSN: {varchar(255)} <br>
     * 持戻理由
     * @return The value of the column 'HVRTRSN'. (NullAllowed even if selected: for no constraint)
     */
    public String getHvrtrsn() {
        checkSpecifiedProperty("hvrtrsn");
        return convertEmptyToNull(_hvrtrsn);
    }

    /**
     * [set] HVRTRSN: {varchar(255)} <br>
     * 持戻理由
     * @param hvrtrsn The value of the column 'HVRTRSN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHvrtrsn(String hvrtrsn) {
        registerModifiedProperty("hvrtrsn");
        _hvrtrsn = hvrtrsn;
    }

    /**
     * [get] ZZVBELNB: {varchar(255)} <br>
     * 持戻入庫予定日
     * @return The value of the column 'ZZVBELNB'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzvbelnb() {
        checkSpecifiedProperty("zzvbelnb");
        return convertEmptyToNull(_zzvbelnb);
    }

    /**
     * [set] ZZVBELNB: {varchar(255)} <br>
     * 持戻入庫予定日
     * @param zzvbelnb The value of the column 'ZZVBELNB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzvbelnb(String zzvbelnb) {
        registerModifiedProperty("zzvbelnb");
        _zzvbelnb = zzvbelnb;
    }

    /**
     * [get] CNGPRTSLPNO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @return The value of the column 'CNGPRTSLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCngprtslpno() {
        checkSpecifiedProperty("cngprtslpno");
        return convertEmptyToNull(_cngprtslpno);
    }

    /**
     * [set] CNGPRTSLPNO: {varchar(255)} <br>
     * 取替相手伝票番号
     * @param cngprtslpno The value of the column 'CNGPRTSLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCngprtslpno(String cngprtslpno) {
        registerModifiedProperty("cngprtslpno");
        _cngprtslpno = cngprtslpno;
    }

    /**
     * [get] TRNSCTNDIV: {varchar(255)} <br>
     * 処理区分
     * @return The value of the column 'TRNSCTNDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getTrnsctndiv() {
        checkSpecifiedProperty("trnsctndiv");
        return convertEmptyToNull(_trnsctndiv);
    }

    /**
     * [set] TRNSCTNDIV: {varchar(255)} <br>
     * 処理区分
     * @param trnsctndiv The value of the column 'TRNSCTNDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrnsctndiv(String trnsctndiv) {
        registerModifiedProperty("trnsctndiv");
        _trnsctndiv = trnsctndiv;
    }

    /**
     * [get] EOSORDAFTFLG: {varchar(255)} <br>
     * ＥＯＳさしず後フラグ
     * @return The value of the column 'EOSORDAFTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosordaftflg() {
        checkSpecifiedProperty("eosordaftflg");
        return convertEmptyToNull(_eosordaftflg);
    }

    /**
     * [set] EOSORDAFTFLG: {varchar(255)} <br>
     * ＥＯＳさしず後フラグ
     * @param eosordaftflg The value of the column 'EOSORDAFTFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosordaftflg(String eosordaftflg) {
        registerModifiedProperty("eosordaftflg");
        _eosordaftflg = eosordaftflg;
    }

    /**
     * [get] EOSSLPNO: {varchar(255)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @return The value of the column 'EOSSLPNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEosslpno() {
        checkSpecifiedProperty("eosslpno");
        return convertEmptyToNull(_eosslpno);
    }

    /**
     * [set] EOSSLPNO: {varchar(255)} <br>
     * 相手（ＥＯＳ）伝票番号
     * @param eosslpno The value of the column 'EOSSLPNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEosslpno(String eosslpno) {
        registerModifiedProperty("eosslpno");
        _eosslpno = eosslpno;
    }

    /**
     * [get] HDRDBXDIV: {varchar(255)} <br>
     * 100箱拒否区分
     * @return The value of the column 'HDRDBXDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getHdrdbxdiv() {
        checkSpecifiedProperty("hdrdbxdiv");
        return convertEmptyToNull(_hdrdbxdiv);
    }

    /**
     * [set] HDRDBXDIV: {varchar(255)} <br>
     * 100箱拒否区分
     * @param hdrdbxdiv The value of the column 'HDRDBXDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHdrdbxdiv(String hdrdbxdiv) {
        registerModifiedProperty("hdrdbxdiv");
        _hdrdbxdiv = hdrdbxdiv;
    }

    /**
     * [get] INOTRFSLDIV: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @return The value of the column 'INOTRFSLDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getInotrfsldiv() {
        checkSpecifiedProperty("inotrfsldiv");
        return convertEmptyToNull(_inotrfsldiv);
    }

    /**
     * [set] INOTRFSLDIV: {varchar(255)} <br>
     * 内外仕分拒否区分
     * @param inotrfsldiv The value of the column 'INOTRFSLDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInotrfsldiv(String inotrfsldiv) {
        registerModifiedProperty("inotrfsldiv");
        _inotrfsldiv = inotrfsldiv;
    }

    /**
     * [get] BXMNTRFSLDIV: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @return The value of the column 'BXMNTRFSLDIV'. (NullAllowed even if selected: for no constraint)
     */
    public String getBxmntrfsldiv() {
        checkSpecifiedProperty("bxmntrfsldiv");
        return convertEmptyToNull(_bxmntrfsldiv);
    }

    /**
     * [set] BXMNTRFSLDIV: {varchar(255)} <br>
     * 箱跨り拒否区分
     * @param bxmntrfsldiv The value of the column 'BXMNTRFSLDIV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBxmntrfsldiv(String bxmntrfsldiv) {
        registerModifiedProperty("bxmntrfsldiv");
        _bxmntrfsldiv = bxmntrfsldiv;
    }

    /**
     * [get] SLPMRGTMG: {varchar(255)} <br>
     * 帳票マージタイミング
     * @return The value of the column 'SLPMRGTMG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlpmrgtmg() {
        checkSpecifiedProperty("slpmrgtmg");
        return convertEmptyToNull(_slpmrgtmg);
    }

    /**
     * [set] SLPMRGTMG: {varchar(255)} <br>
     * 帳票マージタイミング
     * @param slpmrgtmg The value of the column 'SLPMRGTMG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlpmrgtmg(String slpmrgtmg) {
        registerModifiedProperty("slpmrgtmg");
        _slpmrgtmg = slpmrgtmg;
    }

    /**
     * [get] ZZBLOTDT: {varchar(255)} <br>
     * 帳票出力年月日
     * @return The value of the column 'ZZBLOTDT'. (NullAllowed even if selected: for no constraint)
     */
    public String getZzblotdt() {
        checkSpecifiedProperty("zzblotdt");
        return convertEmptyToNull(_zzblotdt);
    }

    /**
     * [set] ZZBLOTDT: {varchar(255)} <br>
     * 帳票出力年月日
     * @param zzblotdt The value of the column 'ZZBLOTDT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZzblotdt(String zzblotdt) {
        registerModifiedProperty("zzblotdt");
        _zzblotdt = zzblotdt;
    }

    /**
     * [get] CGGDID: {varchar(255)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(255)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] MATNR: {varchar(255)} <br>
     * 銘柄CD
     * @return The value of the column 'MATNR'. (NullAllowed even if selected: for no constraint)
     */
    public String getMatnr() {
        checkSpecifiedProperty("matnr");
        return convertEmptyToNull(_matnr);
    }

    /**
     * [set] MATNR: {varchar(255)} <br>
     * 銘柄CD
     * @param matnr The value of the column 'MATNR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMatnr(String matnr) {
        registerModifiedProperty("matnr");
        _matnr = matnr;
    }

    /**
     * [get] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @return The value of the column 'KWMENG'. (NullAllowed even if selected: for no constraint)
     */
    public String getKwmeng() {
        checkSpecifiedProperty("kwmeng");
        return convertEmptyToNull(_kwmeng);
    }

    /**
     * [set] KWMENG: {varchar(255)} <br>
     * 販売数量
     * @param kwmeng The value of the column 'KWMENG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKwmeng(String kwmeng) {
        registerModifiedProperty("kwmeng");
        _kwmeng = kwmeng;
    }

    /**
     * [get] MVGR1: {varchar(255)} <br>
     * 状態CD
     * @return The value of the column 'MVGR1'. (NullAllowed even if selected: for no constraint)
     */
    public String getMvgr1() {
        checkSpecifiedProperty("mvgr1");
        return convertEmptyToNull(_mvgr1);
    }

    /**
     * [set] MVGR1: {varchar(255)} <br>
     * 状態CD
     * @param mvgr1 The value of the column 'MVGR1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMvgr1(String mvgr1) {
        registerModifiedProperty("mvgr1");
        _mvgr1 = mvgr1;
    }

    /**
     * [get] MVGR4: {varchar(255)} <br>
     * 不足本数
     * @return The value of the column 'MVGR4'. (NullAllowed even if selected: for no constraint)
     */
    public String getMvgr4() {
        checkSpecifiedProperty("mvgr4");
        return convertEmptyToNull(_mvgr4);
    }

    /**
     * [set] MVGR4: {varchar(255)} <br>
     * 不足本数
     * @param mvgr4 The value of the column 'MVGR4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMvgr4(String mvgr4) {
        registerModifiedProperty("mvgr4");
        _mvgr4 = mvgr4;
    }

    /**
     * [get] KZWI3: {varchar(255)} <br>
     * 定価代金
     * @return The value of the column 'KZWI3'. (NullAllowed even if selected: for no constraint)
     */
    public String getKzwi3() {
        checkSpecifiedProperty("kzwi3");
        return convertEmptyToNull(_kzwi3);
    }

    /**
     * [set] KZWI3: {varchar(255)} <br>
     * 定価代金
     * @param kzwi3 The value of the column 'KZWI3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKzwi3(String kzwi3) {
        registerModifiedProperty("kzwi3");
        _kzwi3 = kzwi3;
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
