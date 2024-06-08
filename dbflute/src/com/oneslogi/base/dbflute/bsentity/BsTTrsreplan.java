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
 * The entity of T_TRSREPLAN as TABLE. <br>
 * 返品入庫予定
 * <pre>
 * [primary-key]
 *     TRSREPLAN_ID
 *
 * [column]
 *     TRSREPLAN_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, PARTFLG, ACTFLG, STS, PRIORITIES, COMPANYCD, RCVSCHDATE, RECEIVEDATE, LOGISTICSCD, WAREHOUSECD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, ACCEPTKEY, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, SYHN_KBN, CGGDID, CONFIRMED_FLG, SUFFER_USAGE_FLG, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSREPLAN_ID
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
 * Long trsreplanId = entity.getTrsreplanId();
 * java.math.BigDecimal prekey = entity.getPrekey();
 * java.math.BigDecimal templateflg = entity.getTemplateflg();
 * java.math.BigDecimal rcvinspectflg = entity.getRcvinspectflg();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String rmano = entity.getRmano();
 * String rcvtype = entity.getRcvtype();
 * java.math.BigDecimal partflg = entity.getPartflg();
 * java.math.BigDecimal actflg = entity.getActflg();
 * Long sts = entity.getSts();
 * java.math.BigDecimal priorities = entity.getPriorities();
 * String companycd = entity.getCompanycd();
 * String rcvschdate = entity.getRcvschdate();
 * String receivedate = entity.getReceivedate();
 * String logisticscd = entity.getLogisticscd();
 * String warehousecd = entity.getWarehousecd();
 * String suppliercd = entity.getSuppliercd();
 * String suppliername = entity.getSuppliername();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String postno = entity.getPostno();
 * String countrycd = entity.getCountrycd();
 * String portcd = entity.getPortcd();
 * String districtcd = entity.getDistrictcd();
 * String supplierphone = entity.getSupplierphone();
 * String fax1 = entity.getFax1();
 * String email = entity.getEmail();
 * String refname = entity.getRefname();
 * String fromcd = entity.getFromcd();
 * String fromsub = entity.getFromsub();
 * String fromname = entity.getFromname();
 * String fromaddress1 = entity.getFromaddress1();
 * String fromaddress2 = entity.getFromaddress2();
 * String fromaddress3 = entity.getFromaddress3();
 * String frompostno = entity.getFrompostno();
 * String fromcountrycd = entity.getFromcountrycd();
 * String fromportcd = entity.getFromportcd();
 * String fromdistrictcd = entity.getFromdistrictcd();
 * String fromphone = entity.getFromphone();
 * String fromfax = entity.getFromfax();
 * String fromemail = entity.getFromemail();
 * String fromrefname = entity.getFromrefname();
 * String carriercd = entity.getCarriercd();
 * String carriername = entity.getCarriername();
 * String carrierwbno = entity.getCarrierwbno();
 * String deliverycd = entity.getDeliverycd();
 * String carrierno = entity.getCarrierno();
 * String carriersname = entity.getCarriersname();
 * java.math.BigDecimal carrierseq = entity.getCarrierseq();
 * String expectedtime = entity.getExpectedtime();
 * String notes = entity.getNotes();
 * String otherrefno1 = entity.getOtherrefno1();
 * String otherrefno2 = entity.getOtherrefno2();
 * String otherrefno3 = entity.getOtherrefno3();
 * String allocgroup = entity.getAllocgroup();
 * java.math.BigDecimal acceptkey = entity.getAcceptkey();
 * String acceptusercd = entity.getAcceptusercd();
 * String inspectedusercd = entity.getInspectedusercd();
 * String receivedusercd = entity.getReceivedusercd();
 * java.math.BigDecimal movekey = entity.getMovekey();
 * java.math.BigDecimal assykey = entity.getAssykey();
 * Long producekey = entity.getProducekey();
 * String syhnKbn = entity.getSyhnKbn();
 * String cggdid = entity.getCggdid();
 * String confirmedFlg = entity.getConfirmedFlg();
 * String sufferUsageFlg = entity.getSufferUsageFlg();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrsreplanId(trsreplanId);
 * entity.setPrekey(prekey);
 * entity.setTemplateflg(templateflg);
 * entity.setRcvinspectflg(rcvinspectflg);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setRmano(rmano);
 * entity.setRcvtype(rcvtype);
 * entity.setPartflg(partflg);
 * entity.setActflg(actflg);
 * entity.setSts(sts);
 * entity.setPriorities(priorities);
 * entity.setCompanycd(companycd);
 * entity.setRcvschdate(rcvschdate);
 * entity.setReceivedate(receivedate);
 * entity.setLogisticscd(logisticscd);
 * entity.setWarehousecd(warehousecd);
 * entity.setSuppliercd(suppliercd);
 * entity.setSuppliername(suppliername);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setPostno(postno);
 * entity.setCountrycd(countrycd);
 * entity.setPortcd(portcd);
 * entity.setDistrictcd(districtcd);
 * entity.setSupplierphone(supplierphone);
 * entity.setFax1(fax1);
 * entity.setEmail(email);
 * entity.setRefname(refname);
 * entity.setFromcd(fromcd);
 * entity.setFromsub(fromsub);
 * entity.setFromname(fromname);
 * entity.setFromaddress1(fromaddress1);
 * entity.setFromaddress2(fromaddress2);
 * entity.setFromaddress3(fromaddress3);
 * entity.setFrompostno(frompostno);
 * entity.setFromcountrycd(fromcountrycd);
 * entity.setFromportcd(fromportcd);
 * entity.setFromdistrictcd(fromdistrictcd);
 * entity.setFromphone(fromphone);
 * entity.setFromfax(fromfax);
 * entity.setFromemail(fromemail);
 * entity.setFromrefname(fromrefname);
 * entity.setCarriercd(carriercd);
 * entity.setCarriername(carriername);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setDeliverycd(deliverycd);
 * entity.setCarrierno(carrierno);
 * entity.setCarriersname(carriersname);
 * entity.setCarrierseq(carrierseq);
 * entity.setExpectedtime(expectedtime);
 * entity.setNotes(notes);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setOtherrefno2(otherrefno2);
 * entity.setOtherrefno3(otherrefno3);
 * entity.setAllocgroup(allocgroup);
 * entity.setAcceptkey(acceptkey);
 * entity.setAcceptusercd(acceptusercd);
 * entity.setInspectedusercd(inspectedusercd);
 * entity.setReceivedusercd(receivedusercd);
 * entity.setMovekey(movekey);
 * entity.setAssykey(assykey);
 * entity.setProducekey(producekey);
 * entity.setSyhnKbn(syhnKbn);
 * entity.setCggdid(cggdid);
 * entity.setConfirmedFlg(confirmedFlg);
 * entity.setSufferUsageFlg(sufferUsageFlg);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
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
public abstract class BsTTrsreplan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trsreplanId;

    /** PREKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _prekey;

    /** TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _templateflg;

    /** RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} */
    protected java.math.BigDecimal _rcvinspectflg;

    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** RCVTYPE: {varchar(30)} */
    protected String _rcvtype;

    /** PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _partflg;

    /** ACTFLG: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _actflg;

    /** STS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _sts;

    /** PRIORITIES: {decimal(16, 6)} */
    protected java.math.BigDecimal _priorities;

    /** COMPANYCD: {NotNull, varchar(30)} */
    protected String _companycd;

    /** RCVSCHDATE: {varchar(8)} */
    protected String _rcvschdate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** LOGISTICSCD: {NotNull, varchar(30)} */
    protected String _logisticscd;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** SUPPLIERNAME: {varchar(255)} */
    protected String _suppliername;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** POSTNO: {varchar(30)} */
    protected String _postno;

    /** COUNTRYCD: {varchar(60)} */
    protected String _countrycd;

    /** PORTCD: {varchar(60)} */
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    protected String _districtcd;

    /** SUPPLIERPHONE: {varchar(60)} */
    protected String _supplierphone;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** EMAIL: {varchar(255)} */
    protected String _email;

    /** REFNAME: {varchar(60)} */
    protected String _refname;

    /** FROMCD: {varchar(30)} */
    protected String _fromcd;

    /** FROMSUB: {varchar(60)} */
    protected String _fromsub;

    /** FROMNAME: {varchar(255)} */
    protected String _fromname;

    /** FROMADDRESS1: {varchar(255)} */
    protected String _fromaddress1;

    /** FROMADDRESS2: {varchar(255)} */
    protected String _fromaddress2;

    /** FROMADDRESS3: {varchar(255)} */
    protected String _fromaddress3;

    /** FROMPOSTNO: {varchar(30)} */
    protected String _frompostno;

    /** FROMCOUNTRYCD: {varchar(60)} */
    protected String _fromcountrycd;

    /** FROMPORTCD: {varchar(60)} */
    protected String _fromportcd;

    /** FROMDISTRICTCD: {varchar(30)} */
    protected String _fromdistrictcd;

    /** FROMPHONE: {varchar(60)} */
    protected String _fromphone;

    /** FROMFAX: {varchar(60)} */
    protected String _fromfax;

    /** FROMEMAIL: {varchar(255)} */
    protected String _fromemail;

    /** FROMREFNAME: {varchar(60)} */
    protected String _fromrefname;

    /** CARRIERCD: {varchar(30)} */
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    protected String _carrierwbno;

    /** DELIVERYCD: {varchar(30)} */
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100), default=[(0)]} */
    protected String _carriersname;

    /** CARRIERSEQ: {decimal(16, 6)} */
    protected java.math.BigDecimal _carrierseq;

    /** EXPECTEDTIME: {varchar(8)} */
    protected String _expectedtime;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** OTHERREFNO1: {varchar(60)} */
    protected String _otherrefno1;

    /** OTHERREFNO2: {varchar(60)} */
    protected String _otherrefno2;

    /** OTHERREFNO3: {varchar(60)} */
    protected String _otherrefno3;

    /** ALLOCGROUP: {varchar(60)} */
    protected String _allocgroup;

    /** ACCEPTKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _acceptkey;

    /** ACCEPTUSERCD: {varchar(30)} */
    protected String _acceptusercd;

    /** INSPECTEDUSERCD: {varchar(30)} */
    protected String _inspectedusercd;

    /** RECEIVEDUSERCD: {varchar(30)} */
    protected String _receivedusercd;

    /** MOVEKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _movekey;

    /** ASSYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _assykey;

    /** PRODUCEKEY: {bigint(19)} */
    protected Long _producekey;

    /** SYHN_KBN: {varchar(30)} */
    protected String _syhnKbn;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** CONFIRMED_FLG: {char(1)} */
    protected String _confirmedFlg;

    /** SUFFER_USAGE_FLG: {char(1)} */
    protected String _sufferUsageFlg;

    /** CENTER_ID: {NotNull, bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

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
        return "T_TRSREPLAN";
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
        if (_trsreplanId == null) { return false; }
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
        if (obj instanceof BsTTrsreplan) {
            BsTTrsreplan other = (BsTTrsreplan)obj;
            if (!xSV(_trsreplanId, other._trsreplanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsreplanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsreplanId));
        sb.append(dm).append(xfND(_prekey));
        sb.append(dm).append(xfND(_templateflg));
        sb.append(dm).append(xfND(_rcvinspectflg));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_rcvtype));
        sb.append(dm).append(xfND(_partflg));
        sb.append(dm).append(xfND(_actflg));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_priorities));
        sb.append(dm).append(xfND(_companycd));
        sb.append(dm).append(xfND(_rcvschdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_logisticscd));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_suppliername));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_postno));
        sb.append(dm).append(xfND(_countrycd));
        sb.append(dm).append(xfND(_portcd));
        sb.append(dm).append(xfND(_districtcd));
        sb.append(dm).append(xfND(_supplierphone));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_refname));
        sb.append(dm).append(xfND(_fromcd));
        sb.append(dm).append(xfND(_fromsub));
        sb.append(dm).append(xfND(_fromname));
        sb.append(dm).append(xfND(_fromaddress1));
        sb.append(dm).append(xfND(_fromaddress2));
        sb.append(dm).append(xfND(_fromaddress3));
        sb.append(dm).append(xfND(_frompostno));
        sb.append(dm).append(xfND(_fromcountrycd));
        sb.append(dm).append(xfND(_fromportcd));
        sb.append(dm).append(xfND(_fromdistrictcd));
        sb.append(dm).append(xfND(_fromphone));
        sb.append(dm).append(xfND(_fromfax));
        sb.append(dm).append(xfND(_fromemail));
        sb.append(dm).append(xfND(_fromrefname));
        sb.append(dm).append(xfND(_carriercd));
        sb.append(dm).append(xfND(_carriername));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_deliverycd));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_carrierseq));
        sb.append(dm).append(xfND(_expectedtime));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_otherrefno2));
        sb.append(dm).append(xfND(_otherrefno3));
        sb.append(dm).append(xfND(_allocgroup));
        sb.append(dm).append(xfND(_acceptkey));
        sb.append(dm).append(xfND(_acceptusercd));
        sb.append(dm).append(xfND(_inspectedusercd));
        sb.append(dm).append(xfND(_receivedusercd));
        sb.append(dm).append(xfND(_movekey));
        sb.append(dm).append(xfND(_assykey));
        sb.append(dm).append(xfND(_producekey));
        sb.append(dm).append(xfND(_syhnKbn));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_confirmedFlg));
        sb.append(dm).append(xfND(_sufferUsageFlg));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
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
    public TTrsreplan clone() {
        return (TTrsreplan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定ID
     * @return The value of the column 'TRSREPLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsreplanId() {
        checkSpecifiedProperty("trsreplanId");
        return _trsreplanId;
    }

    /**
     * [set] TRSREPLAN_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 返品入庫予定ID
     * @param trsreplanId The value of the column 'TRSREPLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsreplanId(Long trsreplanId) {
        registerModifiedProperty("trsreplanId");
        _trsreplanId = trsreplanId;
    }

    /**
     * [get] PREKEY: {decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @return The value of the column 'PREKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrekey() {
        checkSpecifiedProperty("prekey");
        return _prekey;
    }

    /**
     * [set] PREKEY: {decimal(16, 6)} <br>
     * 元Ｋｅｙ
     * @param prekey The value of the column 'PREKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrekey(java.math.BigDecimal prekey) {
        registerModifiedProperty("prekey");
        _prekey = prekey;
    }

    /**
     * [get] TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * り災品区分
     * @return The value of the column 'TEMPLATEFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTemplateflg() {
        checkSpecifiedProperty("templateflg");
        return _templateflg;
    }

    /**
     * [set] TEMPLATEFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * り災品区分
     * @param templateflg The value of the column 'TEMPLATEFLG'. (basically NotNull if update: for the constraint)
     */
    public void setTemplateflg(java.math.BigDecimal templateflg) {
        registerModifiedProperty("templateflg");
        _templateflg = templateflg;
    }

    /**
     * [get] RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 入庫検品フラグ
     * @return The value of the column 'RCVINSPECTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvinspectflg() {
        checkSpecifiedProperty("rcvinspectflg");
        return _rcvinspectflg;
    }

    /**
     * [set] RCVINSPECTFLG: {NotNull, decimal(16, 6), default=[(1)]} <br>
     * 入庫検品フラグ
     * @param rcvinspectflg The value of the column 'RCVINSPECTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setRcvinspectflg(java.math.BigDecimal rcvinspectflg) {
        registerModifiedProperty("rcvinspectflg");
        _rcvinspectflg = rcvinspectflg;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 伝票番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 伝票番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * 販売年月日
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * 販売年月日
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] RCVTYPE: {varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @return The value of the column 'RCVTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvtype() {
        checkSpecifiedProperty("rcvtype");
        return convertEmptyToNull(_rcvtype);
    }

    /**
     * [set] RCVTYPE: {varchar(30)} <br>
     * 返品/取替区分(返品、取替)
     * @param rcvtype The value of the column 'RCVTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvtype(String rcvtype) {
        registerModifiedProperty("rcvtype");
        _rcvtype = rcvtype;
    }

    /**
     * [get] PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 一括登録フラグ
     * @return The value of the column 'PARTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPartflg() {
        checkSpecifiedProperty("partflg");
        return _partflg;
    }

    /**
     * [set] PARTFLG: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 一括登録フラグ
     * @param partflg The value of the column 'PARTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPartflg(java.math.BigDecimal partflg) {
        registerModifiedProperty("partflg");
        _partflg = partflg;
    }

    /**
     * [get] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getActflg() {
        checkSpecifiedProperty("actflg");
        return _actflg;
    }

    /**
     * [set] ACTFLG: {NotNull, decimal(16, 6)} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setActflg(java.math.BigDecimal actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
    }

    /**
     * [get] STS: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public Long getSts() {
        checkSpecifiedProperty("sts");
        return _sts;
    }

    /**
     * [set] STS: {NotNull, bigint(19), default=[(0)]} <br>
     * 入庫ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(Long sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] PRIORITIES: {decimal(16, 6)} <br>
     * 配達順位
     * @return The value of the column 'PRIORITIES'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPriorities() {
        checkSpecifiedProperty("priorities");
        return _priorities;
    }

    /**
     * [set] PRIORITIES: {decimal(16, 6)} <br>
     * 配達順位
     * @param priorities The value of the column 'PRIORITIES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriorities(java.math.BigDecimal priorities) {
        registerModifiedProperty("priorities");
        _priorities = priorities;
    }

    /**
     * [get] COMPANYCD: {NotNull, varchar(30)} <br>
     * 取引先(発注元)CD
     * @return The value of the column 'COMPANYCD'. (basically NotNull if selected: for the constraint)
     */
    public String getCompanycd() {
        checkSpecifiedProperty("companycd");
        return convertEmptyToNull(_companycd);
    }

    /**
     * [set] COMPANYCD: {NotNull, varchar(30)} <br>
     * 取引先(発注元)CD
     * @param companycd The value of the column 'COMPANYCD'. (basically NotNull if update: for the constraint)
     */
    public void setCompanycd(String companycd) {
        registerModifiedProperty("companycd");
        _companycd = companycd;
    }

    /**
     * [get] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日
     * @return The value of the column 'RCVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvschdate() {
        checkSpecifiedProperty("rcvschdate");
        return convertEmptyToNull(_rcvschdate);
    }

    /**
     * [set] RCVSCHDATE: {varchar(8)} <br>
     * 入庫予定日
     * @param rcvschdate The value of the column 'RCVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvschdate(String rcvschdate) {
        registerModifiedProperty("rcvschdate");
        _rcvschdate = rcvschdate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 検品実施日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 検品実施日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先(倉庫会社)CD
     * @return The value of the column 'LOGISTICSCD'. (basically NotNull if selected: for the constraint)
     */
    public String getLogisticscd() {
        checkSpecifiedProperty("logisticscd");
        return convertEmptyToNull(_logisticscd);
    }

    /**
     * [set] LOGISTICSCD: {NotNull, varchar(30)} <br>
     * 取引先(倉庫会社)CD
     * @param logisticscd The value of the column 'LOGISTICSCD'. (basically NotNull if update: for the constraint)
     */
    public void setLogisticscd(String logisticscd) {
        registerModifiedProperty("logisticscd");
        _logisticscd = logisticscd;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 仕分拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 配達拠点CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 配達拠点CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] SUPPLIERNAME: {varchar(255)} <br>
     * 調達先名称
     * @return The value of the column 'SUPPLIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliername() {
        checkSpecifiedProperty("suppliername");
        return convertEmptyToNull(_suppliername);
    }

    /**
     * [set] SUPPLIERNAME: {varchar(255)} <br>
     * 調達先名称
     * @param suppliername The value of the column 'SUPPLIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliername(String suppliername) {
        registerModifiedProperty("suppliername");
        _suppliername = suppliername;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 保留登録日
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 保留登録日
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 保留解除日
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 保留解除日
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 調達先住所３
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 調達先住所３
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] POSTNO: {varchar(30)} <br>
     * 調達先郵便番号
     * @return The value of the column 'POSTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostno() {
        checkSpecifiedProperty("postno");
        return convertEmptyToNull(_postno);
    }

    /**
     * [set] POSTNO: {varchar(30)} <br>
     * 調達先郵便番号
     * @param postno The value of the column 'POSTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostno(String postno) {
        registerModifiedProperty("postno");
        _postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(60)} <br>
     * 調達先国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCountrycd() {
        checkSpecifiedProperty("countrycd");
        return convertEmptyToNull(_countrycd);
    }

    /**
     * [set] COUNTRYCD: {varchar(60)} <br>
     * 調達先国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountrycd(String countrycd) {
        registerModifiedProperty("countrycd");
        _countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(60)} <br>
     * 調達先入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPortcd() {
        checkSpecifiedProperty("portcd");
        return convertEmptyToNull(_portcd);
    }

    /**
     * [set] PORTCD: {varchar(60)} <br>
     * 調達先入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPortcd(String portcd) {
        registerModifiedProperty("portcd");
        _portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 一致／不一致区分
     * @return The value of the column 'DISTRICTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistrictcd() {
        checkSpecifiedProperty("districtcd");
        return convertEmptyToNull(_districtcd);
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 一致／不一致区分
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistrictcd(String districtcd) {
        registerModifiedProperty("districtcd");
        _districtcd = districtcd;
    }

    /**
     * [get] SUPPLIERPHONE: {varchar(60)} <br>
     * 調達先電話番号
     * @return The value of the column 'SUPPLIERPHONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierphone() {
        checkSpecifiedProperty("supplierphone");
        return convertEmptyToNull(_supplierphone);
    }

    /**
     * [set] SUPPLIERPHONE: {varchar(60)} <br>
     * 調達先電話番号
     * @param supplierphone The value of the column 'SUPPLIERPHONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierphone(String supplierphone) {
        registerModifiedProperty("supplierphone");
        _supplierphone = supplierphone;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 調達先Fax
     * @return The value of the column 'FAX1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 調達先Fax
     * @param fax1 The value of the column 'FAX1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] EMAIL: {varchar(255)} <br>
     * 調達先E-Mail
     * @return The value of the column 'EMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return convertEmptyToNull(_email);
    }

    /**
     * [set] EMAIL: {varchar(255)} <br>
     * 調達先E-Mail
     * @param email The value of the column 'EMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 調達先担当者名
     * @return The value of the column 'REFNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefname() {
        checkSpecifiedProperty("refname");
        return convertEmptyToNull(_refname);
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 調達先担当者名
     * @param refname The value of the column 'REFNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefname(String refname) {
        registerModifiedProperty("refname");
        _refname = refname;
    }

    /**
     * [get] FROMCD: {varchar(30)} <br>
     * 取引先(積地)CD
     * @return The value of the column 'FROMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromcd() {
        checkSpecifiedProperty("fromcd");
        return convertEmptyToNull(_fromcd);
    }

    /**
     * [set] FROMCD: {varchar(30)} <br>
     * 取引先(積地)CD
     * @param fromcd The value of the column 'FROMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromcd(String fromcd) {
        registerModifiedProperty("fromcd");
        _fromcd = fromcd;
    }

    /**
     * [get] FROMSUB: {varchar(60)} <br>
     * 積地カテゴリ
     * @return The value of the column 'FROMSUB'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromsub() {
        checkSpecifiedProperty("fromsub");
        return convertEmptyToNull(_fromsub);
    }

    /**
     * [set] FROMSUB: {varchar(60)} <br>
     * 積地カテゴリ
     * @param fromsub The value of the column 'FROMSUB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromsub(String fromsub) {
        registerModifiedProperty("fromsub");
        _fromsub = fromsub;
    }

    /**
     * [get] FROMNAME: {varchar(255)} <br>
     * 伝票表示名称
     * @return The value of the column 'FROMNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromname() {
        checkSpecifiedProperty("fromname");
        return convertEmptyToNull(_fromname);
    }

    /**
     * [set] FROMNAME: {varchar(255)} <br>
     * 伝票表示名称
     * @param fromname The value of the column 'FROMNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromname(String fromname) {
        registerModifiedProperty("fromname");
        _fromname = fromname;
    }

    /**
     * [get] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @return The value of the column 'FROMADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromaddress1() {
        checkSpecifiedProperty("fromaddress1");
        return convertEmptyToNull(_fromaddress1);
    }

    /**
     * [set] FROMADDRESS1: {varchar(255)} <br>
     * 内外
     * @param fromaddress1 The value of the column 'FROMADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromaddress1(String fromaddress1) {
        registerModifiedProperty("fromaddress1");
        _fromaddress1 = fromaddress1;
    }

    /**
     * [get] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @return The value of the column 'FROMADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromaddress2() {
        checkSpecifiedProperty("fromaddress2");
        return convertEmptyToNull(_fromaddress2);
    }

    /**
     * [set] FROMADDRESS2: {varchar(255)} <br>
     * 方面CD
     * @param fromaddress2 The value of the column 'FROMADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromaddress2(String fromaddress2) {
        registerModifiedProperty("fromaddress2");
        _fromaddress2 = fromaddress2;
    }

    /**
     * [get] FROMADDRESS3: {varchar(255)} <br>
     * 中継拠点
     * @return The value of the column 'FROMADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromaddress3() {
        checkSpecifiedProperty("fromaddress3");
        return convertEmptyToNull(_fromaddress3);
    }

    /**
     * [set] FROMADDRESS3: {varchar(255)} <br>
     * 中継拠点
     * @param fromaddress3 The value of the column 'FROMADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromaddress3(String fromaddress3) {
        registerModifiedProperty("fromaddress3");
        _fromaddress3 = fromaddress3;
    }

    /**
     * [get] FROMPOSTNO: {varchar(30)} <br>
     * 注意喚起
     * @return The value of the column 'FROMPOSTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFrompostno() {
        checkSpecifiedProperty("frompostno");
        return convertEmptyToNull(_frompostno);
    }

    /**
     * [set] FROMPOSTNO: {varchar(30)} <br>
     * 注意喚起
     * @param frompostno The value of the column 'FROMPOSTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFrompostno(String frompostno) {
        registerModifiedProperty("frompostno");
        _frompostno = frompostno;
    }

    /**
     * [get] FROMCOUNTRYCD: {varchar(60)} <br>
     * 積地国CD
     * @return The value of the column 'FROMCOUNTRYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromcountrycd() {
        checkSpecifiedProperty("fromcountrycd");
        return convertEmptyToNull(_fromcountrycd);
    }

    /**
     * [set] FROMCOUNTRYCD: {varchar(60)} <br>
     * 積地国CD
     * @param fromcountrycd The value of the column 'FROMCOUNTRYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromcountrycd(String fromcountrycd) {
        registerModifiedProperty("fromcountrycd");
        _fromcountrycd = fromcountrycd;
    }

    /**
     * [get] FROMPORTCD: {varchar(60)} <br>
     * 積地入出港CD
     * @return The value of the column 'FROMPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromportcd() {
        checkSpecifiedProperty("fromportcd");
        return convertEmptyToNull(_fromportcd);
    }

    /**
     * [set] FROMPORTCD: {varchar(60)} <br>
     * 積地入出港CD
     * @param fromportcd The value of the column 'FROMPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromportcd(String fromportcd) {
        registerModifiedProperty("fromportcd");
        _fromportcd = fromportcd;
    }

    /**
     * [get] FROMDISTRICTCD: {varchar(30)} <br>
     * 積地地区CD
     * @return The value of the column 'FROMDISTRICTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromdistrictcd() {
        checkSpecifiedProperty("fromdistrictcd");
        return convertEmptyToNull(_fromdistrictcd);
    }

    /**
     * [set] FROMDISTRICTCD: {varchar(30)} <br>
     * 積地地区CD
     * @param fromdistrictcd The value of the column 'FROMDISTRICTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromdistrictcd(String fromdistrictcd) {
        registerModifiedProperty("fromdistrictcd");
        _fromdistrictcd = fromdistrictcd;
    }

    /**
     * [get] FROMPHONE: {varchar(60)} <br>
     * 積地電話番号
     * @return The value of the column 'FROMPHONE'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromphone() {
        checkSpecifiedProperty("fromphone");
        return convertEmptyToNull(_fromphone);
    }

    /**
     * [set] FROMPHONE: {varchar(60)} <br>
     * 積地電話番号
     * @param fromphone The value of the column 'FROMPHONE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromphone(String fromphone) {
        registerModifiedProperty("fromphone");
        _fromphone = fromphone;
    }

    /**
     * [get] FROMFAX: {varchar(60)} <br>
     * 積地FAX番号１
     * @return The value of the column 'FROMFAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromfax() {
        checkSpecifiedProperty("fromfax");
        return convertEmptyToNull(_fromfax);
    }

    /**
     * [set] FROMFAX: {varchar(60)} <br>
     * 積地FAX番号１
     * @param fromfax The value of the column 'FROMFAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromfax(String fromfax) {
        registerModifiedProperty("fromfax");
        _fromfax = fromfax;
    }

    /**
     * [get] FROMEMAIL: {varchar(255)} <br>
     * 積地E-Mail
     * @return The value of the column 'FROMEMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromemail() {
        checkSpecifiedProperty("fromemail");
        return convertEmptyToNull(_fromemail);
    }

    /**
     * [set] FROMEMAIL: {varchar(255)} <br>
     * 積地E-Mail
     * @param fromemail The value of the column 'FROMEMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromemail(String fromemail) {
        registerModifiedProperty("fromemail");
        _fromemail = fromemail;
    }

    /**
     * [get] FROMREFNAME: {varchar(60)} <br>
     * 積地担当者名
     * @return The value of the column 'FROMREFNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFromrefname() {
        checkSpecifiedProperty("fromrefname");
        return convertEmptyToNull(_fromrefname);
    }

    /**
     * [set] FROMREFNAME: {varchar(60)} <br>
     * 積地担当者名
     * @param fromrefname The value of the column 'FROMREFNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFromrefname(String fromrefname) {
        registerModifiedProperty("fromrefname");
        _fromrefname = fromrefname;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先(運送会社)コード
     * @return The value of the column 'CARRIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriercd() {
        checkSpecifiedProperty("carriercd");
        return convertEmptyToNull(_carriercd);
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先(運送会社)コード
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriercd(String carriercd) {
        registerModifiedProperty("carriercd");
        _carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * ピストン区分
     * @return The value of the column 'CARRIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriername() {
        checkSpecifiedProperty("carriername");
        return convertEmptyToNull(_carriername);
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * ピストン区分
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriername(String carriername) {
        registerModifiedProperty("carriername");
        _carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 運送会社送り状番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverycd() {
        checkSpecifiedProperty("deliverycd");
        return convertEmptyToNull(_deliverycd);
    }

    /**
     * [set] DELIVERYCD: {varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverycd(String deliverycd) {
        registerModifiedProperty("deliverycd");
        _deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 返品ステータス
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 返品ステータス
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100), default=[(0)]} <br>
     * 乗務員
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(100), default=[(0)]} <br>
     * 乗務員
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] CARRIERSEQ: {decimal(16, 6)} <br>
     * 入庫実績計
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCarrierseq() {
        checkSpecifiedProperty("carrierseq");
        return _carrierseq;
    }

    /**
     * [set] CARRIERSEQ: {decimal(16, 6)} <br>
     * 入庫実績計
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierseq(java.math.BigDecimal carrierseq) {
        registerModifiedProperty("carrierseq");
        _carrierseq = carrierseq;
    }

    /**
     * [get] EXPECTEDTIME: {varchar(8)} <br>
     * 削除実施日
     * @return The value of the column 'EXPECTEDTIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpectedtime() {
        checkSpecifiedProperty("expectedtime");
        return convertEmptyToNull(_expectedtime);
    }

    /**
     * [set] EXPECTEDTIME: {varchar(8)} <br>
     * 削除実施日
     * @param expectedtime The value of the column 'EXPECTEDTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectedtime(String expectedtime) {
        registerModifiedProperty("expectedtime");
        _expectedtime = expectedtime;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * お得意様CD
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * お得意様CD
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 取引方法
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno2() {
        checkSpecifiedProperty("otherrefno2");
        return convertEmptyToNull(_otherrefno2);
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 取引方法
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno2(String otherrefno2) {
        registerModifiedProperty("otherrefno2");
        _otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {varchar(60)} <br>
     * 返品区分
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno3() {
        checkSpecifiedProperty("otherrefno3");
        return convertEmptyToNull(_otherrefno3);
    }

    /**
     * [set] OTHERREFNO3: {varchar(60)} <br>
     * 返品区分
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno3(String otherrefno3) {
        registerModifiedProperty("otherrefno3");
        _otherrefno3 = otherrefno3;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 入庫締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocgroup() {
        checkSpecifiedProperty("allocgroup");
        return convertEmptyToNull(_allocgroup);
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 入庫締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocgroup(String allocgroup) {
        registerModifiedProperty("allocgroup");
        _allocgroup = allocgroup;
    }

    /**
     * [get] ACCEPTKEY: {decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @return The value of the column 'ACCEPTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAcceptkey() {
        checkSpecifiedProperty("acceptkey");
        return _acceptkey;
    }

    /**
     * [set] ACCEPTKEY: {decimal(16, 6)} <br>
     * 入庫受付Ｋｅｙ
     * @param acceptkey The value of the column 'ACCEPTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptkey(java.math.BigDecimal acceptkey) {
        registerModifiedProperty("acceptkey");
        _acceptkey = acceptkey;
    }

    /**
     * [get] ACCEPTUSERCD: {varchar(30)} <br>
     * 入庫受付担当者
     * @return The value of the column 'ACCEPTUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptusercd() {
        checkSpecifiedProperty("acceptusercd");
        return convertEmptyToNull(_acceptusercd);
    }

    /**
     * [set] ACCEPTUSERCD: {varchar(30)} <br>
     * 入庫受付担当者
     * @param acceptusercd The value of the column 'ACCEPTUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptusercd(String acceptusercd) {
        registerModifiedProperty("acceptusercd");
        _acceptusercd = acceptusercd;
    }

    /**
     * [get] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @return The value of the column 'INSPECTEDUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectedusercd() {
        checkSpecifiedProperty("inspectedusercd");
        return convertEmptyToNull(_inspectedusercd);
    }

    /**
     * [set] INSPECTEDUSERCD: {varchar(30)} <br>
     * 検品担当者
     * @param inspectedusercd The value of the column 'INSPECTEDUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectedusercd(String inspectedusercd) {
        registerModifiedProperty("inspectedusercd");
        _inspectedusercd = inspectedusercd;
    }

    /**
     * [get] RECEIVEDUSERCD: {varchar(30)} <br>
     * 入庫確定担当者
     * @return The value of the column 'RECEIVEDUSERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedusercd() {
        checkSpecifiedProperty("receivedusercd");
        return convertEmptyToNull(_receivedusercd);
    }

    /**
     * [set] RECEIVEDUSERCD: {varchar(30)} <br>
     * 入庫確定担当者
     * @param receivedusercd The value of the column 'RECEIVEDUSERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedusercd(String receivedusercd) {
        registerModifiedProperty("receivedusercd");
        _receivedusercd = receivedusercd;
    }

    /**
     * [get] MOVEKEY: {decimal(16, 6)} <br>
     * 移動予定Ｋｅｙ
     * @return The value of the column 'MOVEKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMovekey() {
        checkSpecifiedProperty("movekey");
        return _movekey;
    }

    /**
     * [set] MOVEKEY: {decimal(16, 6)} <br>
     * 移動予定Ｋｅｙ
     * @param movekey The value of the column 'MOVEKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMovekey(java.math.BigDecimal movekey) {
        registerModifiedProperty("movekey");
        _movekey = movekey;
    }

    /**
     * [get] ASSYKEY: {decimal(16, 6)} <br>
     * 加工指示Ｋｅｙ
     * @return The value of the column 'ASSYKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAssykey() {
        checkSpecifiedProperty("assykey");
        return _assykey;
    }

    /**
     * [set] ASSYKEY: {decimal(16, 6)} <br>
     * 加工指示Ｋｅｙ
     * @param assykey The value of the column 'ASSYKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssykey(java.math.BigDecimal assykey) {
        registerModifiedProperty("assykey");
        _assykey = assykey;
    }

    /**
     * [get] PRODUCEKEY: {bigint(19)} <br>
     * 加工結果Ｋｅｙ
     * @return The value of the column 'PRODUCEKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProducekey() {
        checkSpecifiedProperty("producekey");
        return _producekey;
    }

    /**
     * [set] PRODUCEKEY: {bigint(19)} <br>
     * 加工結果Ｋｅｙ
     * @param producekey The value of the column 'PRODUCEKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProducekey(Long producekey) {
        registerModifiedProperty("producekey");
        _producekey = producekey;
    }

    /**
     * [get] SYHN_KBN: {varchar(30)} <br>
     * 銘柄区分
     * @return The value of the column 'SYHN_KBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getSyhnKbn() {
        checkSpecifiedProperty("syhnKbn");
        return convertEmptyToNull(_syhnKbn);
    }

    /**
     * [set] SYHN_KBN: {varchar(30)} <br>
     * 銘柄区分
     * @param syhnKbn The value of the column 'SYHN_KBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSyhnKbn(String syhnKbn) {
        registerModifiedProperty("syhnKbn");
        _syhnKbn = syhnKbn;
    }

    /**
     * [get] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @return The value of the column 'CGGDID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdid() {
        checkSpecifiedProperty("cggdid");
        return convertEmptyToNull(_cggdid);
    }

    /**
     * [set] CGGDID: {varchar(30)} <br>
     * たばこ商品区分
     * @param cggdid The value of the column 'CGGDID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdid(String cggdid) {
        registerModifiedProperty("cggdid");
        _cggdid = cggdid;
    }

    /**
     * [get] CONFIRMED_FLG: {char(1)} <br>
     * 実績確定対象フラグ
     * @return The value of the column 'CONFIRMED_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfirmedFlg() {
        checkSpecifiedProperty("confirmedFlg");
        return convertEmptyToNull(_confirmedFlg);
    }

    /**
     * [set] CONFIRMED_FLG: {char(1)} <br>
     * 実績確定対象フラグ
     * @param confirmedFlg The value of the column 'CONFIRMED_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfirmedFlg(String confirmedFlg) {
        registerModifiedProperty("confirmedFlg");
        _confirmedFlg = confirmedFlg;
    }

    /**
     * [get] SUFFER_USAGE_FLG: {char(1)} <br>
     * り災品取扱区分
     * @return The value of the column 'SUFFER_USAGE_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSufferUsageFlg() {
        checkSpecifiedProperty("sufferUsageFlg");
        return convertEmptyToNull(_sufferUsageFlg);
    }

    /**
     * [set] SUFFER_USAGE_FLG: {char(1)} <br>
     * り災品取扱区分
     * @param sufferUsageFlg The value of the column 'SUFFER_USAGE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSufferUsageFlg(String sufferUsageFlg) {
        registerModifiedProperty("sufferUsageFlg");
        _sufferUsageFlg = sufferUsageFlg;
    }

    /**
     * [get] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
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
