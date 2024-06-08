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
 * The entity of T_TRSO as TABLE. <br>
 * 出庫予定
 * <pre>
 * [primary-key]
 *     SOID
 *
 * [column]
 *     SOID, SOKEY, OWNERSONO, PREOWNERSONO, SOTYPE, PARTFLG, STS, COMPANYCD, ORDERKEY, OWNERORDERNO, ORDERTYPE, CUSTORDERNO, CUSTOMER_CD, RMANO, ORDERDATE, SHIPSCHDATE, SHIPDATE, DELIVSCHDATE, DELIVDATE, CARRYSCHDATE, CARRYOUTDATE, TRANSPORTPRIORITY, SHIPTOCD, SHIPTOSUB, DELIVNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, PHONENO, FAX1, EMAIL, REFNAME, AREACD, ALLOCGROUP, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARCD, CARRIERSEQ, ITEMCD, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, PICKING_INST_ID, EXECKEY, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOID
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
 * Long soid = entity.getSoid();
 * Long sokey = entity.getSokey();
 * String ownersono = entity.getOwnersono();
 * String preownersono = entity.getPreownersono();
 * String sotype = entity.getSotype();
 * String partflg = entity.getPartflg();
 * String sts = entity.getSts();
 * String companycd = entity.getCompanycd();
 * Long orderkey = entity.getOrderkey();
 * String ownerorderno = entity.getOwnerorderno();
 * String ordertype = entity.getOrdertype();
 * String custorderno = entity.getCustorderno();
 * String customerCd = entity.getCustomerCd();
 * String rmano = entity.getRmano();
 * String orderdate = entity.getOrderdate();
 * String shipschdate = entity.getShipschdate();
 * String shipdate = entity.getShipdate();
 * String delivschdate = entity.getDelivschdate();
 * String delivdate = entity.getDelivdate();
 * String carryschdate = entity.getCarryschdate();
 * String carryoutdate = entity.getCarryoutdate();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * String shiptocd = entity.getShiptocd();
 * String shiptosub = entity.getShiptosub();
 * String delivname = entity.getDelivname();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String postno = entity.getPostno();
 * String countrycd = entity.getCountrycd();
 * String portcd = entity.getPortcd();
 * String districtcd = entity.getDistrictcd();
 * String phoneno = entity.getPhoneno();
 * String fax1 = entity.getFax1();
 * String email = entity.getEmail();
 * String refname = entity.getRefname();
 * String areacd = entity.getAreacd();
 * String allocgroup = entity.getAllocgroup();
 * String carriercd = entity.getCarriercd();
 * String carriername = entity.getCarriername();
 * String carrierwbno = entity.getCarrierwbno();
 * String deliverycd = entity.getDeliverycd();
 * String carrierno = entity.getCarrierno();
 * String carriersname = entity.getCarriersname();
 * String carcd = entity.getCarcd();
 * Long carrierseq = entity.getCarrierseq();
 * String itemcd = entity.getItemcd();
 * String notes = entity.getNotes();
 * String otherrefno1 = entity.getOtherrefno1();
 * String otherrefno2 = entity.getOtherrefno2();
 * String otherrefno3 = entity.getOtherrefno3();
 * Long pickingInstId = entity.getPickingInstId();
 * Long execkey = entity.getExeckey();
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
 * entity.setSoid(soid);
 * entity.setSokey(sokey);
 * entity.setOwnersono(ownersono);
 * entity.setPreownersono(preownersono);
 * entity.setSotype(sotype);
 * entity.setPartflg(partflg);
 * entity.setSts(sts);
 * entity.setCompanycd(companycd);
 * entity.setOrderkey(orderkey);
 * entity.setOwnerorderno(ownerorderno);
 * entity.setOrdertype(ordertype);
 * entity.setCustorderno(custorderno);
 * entity.setCustomerCd(customerCd);
 * entity.setRmano(rmano);
 * entity.setOrderdate(orderdate);
 * entity.setShipschdate(shipschdate);
 * entity.setShipdate(shipdate);
 * entity.setDelivschdate(delivschdate);
 * entity.setDelivdate(delivdate);
 * entity.setCarryschdate(carryschdate);
 * entity.setCarryoutdate(carryoutdate);
 * entity.setTransportpriority(transportpriority);
 * entity.setShiptocd(shiptocd);
 * entity.setShiptosub(shiptosub);
 * entity.setDelivname(delivname);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setPostno(postno);
 * entity.setCountrycd(countrycd);
 * entity.setPortcd(portcd);
 * entity.setDistrictcd(districtcd);
 * entity.setPhoneno(phoneno);
 * entity.setFax1(fax1);
 * entity.setEmail(email);
 * entity.setRefname(refname);
 * entity.setAreacd(areacd);
 * entity.setAllocgroup(allocgroup);
 * entity.setCarriercd(carriercd);
 * entity.setCarriername(carriername);
 * entity.setCarrierwbno(carrierwbno);
 * entity.setDeliverycd(deliverycd);
 * entity.setCarrierno(carrierno);
 * entity.setCarriersname(carriersname);
 * entity.setCarcd(carcd);
 * entity.setCarrierseq(carrierseq);
 * entity.setItemcd(itemcd);
 * entity.setNotes(notes);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setOtherrefno2(otherrefno2);
 * entity.setOtherrefno3(otherrefno3);
 * entity.setPickingInstId(pickingInstId);
 * entity.setExeckey(execkey);
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
public abstract class BsTTrso extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SOID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _soid;

    /** SOKEY: {NotNull, bigint(19)} */
    protected Long _sokey;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** PREOWNERSONO: {varchar(60)} */
    protected String _preownersono;

    /** SOTYPE: {varchar(30)} */
    protected String _sotype;

    /** PARTFLG: {NotNull, char(1), default=[(0)]} */
    protected String _partflg;

    /** STS: {IX, NotNull, varchar(30)} */
    protected String _sts;

    /** COMPANYCD: {IX, varchar(30)} */
    protected String _companycd;

    /** ORDERKEY: {bigint(19)} */
    protected Long _orderkey;

    /** OWNERORDERNO: {varchar(60)} */
    protected String _ownerorderno;

    /** ORDERTYPE: {varchar(30)} */
    protected String _ordertype;

    /** CUSTORDERNO: {varchar(60)} */
    protected String _custorderno;

    /** CUSTOMER_CD: {varchar(60)} */
    protected String _customerCd;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** ORDERDATE: {varchar(8)} */
    protected String _orderdate;

    /** SHIPSCHDATE: {IX, NotNull, varchar(8)} */
    protected String _shipschdate;

    /** SHIPDATE: {IX, varchar(8)} */
    protected String _shipdate;

    /** DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} */
    protected String _delivschdate;

    /** DELIVDATE: {varchar(8)} */
    protected String _delivdate;

    /** CARRYSCHDATE: {varchar(8)} */
    protected String _carryschdate;

    /** CARRYOUTDATE: {varchar(8)} */
    protected String _carryoutdate;

    /** TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transportpriority;

    /** SHIPTOCD: {IX, varchar(30)} */
    protected String _shiptocd;

    /** SHIPTOSUB: {char(1)} */
    protected String _shiptosub;

    /** DELIVNAME: {varchar(255)} */
    protected String _delivname;

    /** ADDRESS1: {char(1)} */
    protected String _address1;

    /** ADDRESS2: {varchar(8)} */
    protected String _address2;

    /** ADDRESS3: {varchar(30)} */
    protected String _address3;

    /** POSTNO: {char(1)} */
    protected String _postno;

    /** COUNTRYCD: {varchar(30)} */
    protected String _countrycd;

    /** PORTCD: {varchar(30)} */
    protected String _portcd;

    /** DISTRICTCD: {varchar(30)} */
    protected String _districtcd;

    /** PHONENO: {varchar(60)} */
    protected String _phoneno;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** EMAIL: {char(1)} */
    protected String _email;

    /** REFNAME: {varchar(60)} */
    protected String _refname;

    /** AREACD: {varchar(30)} */
    protected String _areacd;

    /** ALLOCGROUP: {varchar(60)} */
    protected String _allocgroup;

    /** CARRIERCD: {varchar(30)} */
    protected String _carriercd;

    /** CARRIERNAME: {varchar(255)} */
    protected String _carriername;

    /** CARRIERWBNO: {varchar(60)} */
    protected String _carrierwbno;

    /** DELIVERYCD: {IX, varchar(30)} */
    protected String _deliverycd;

    /** CARRIERNO: {varchar(60)} */
    protected String _carrierno;

    /** CARRIERSNAME: {varchar(100)} */
    protected String _carriersname;

    /** CARCD: {varchar(30)} */
    protected String _carcd;

    /** CARRIERSEQ: {bigint(19), default=[(0)]} */
    protected Long _carrierseq;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** OTHERREFNO1: {varchar(60)} */
    protected String _otherrefno1;

    /** OTHERREFNO2: {varchar(60)} */
    protected String _otherrefno2;

    /** OTHERREFNO3: {varchar(60)} */
    protected String _otherrefno3;

    /** PICKING_INST_ID: {bigint(19)} */
    protected Long _pickingInstId;

    /** EXECKEY: {IX, bigint(19)} */
    protected Long _execkey;

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
        return "T_TRSO";
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
        if (_soid == null) { return false; }
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
        if (obj instanceof BsTTrso) {
            BsTTrso other = (BsTTrso)obj;
            if (!xSV(_soid, other._soid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _soid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_soid));
        sb.append(dm).append(xfND(_sokey));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_preownersono));
        sb.append(dm).append(xfND(_sotype));
        sb.append(dm).append(xfND(_partflg));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_companycd));
        sb.append(dm).append(xfND(_orderkey));
        sb.append(dm).append(xfND(_ownerorderno));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_custorderno));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_orderdate));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_delivschdate));
        sb.append(dm).append(xfND(_delivdate));
        sb.append(dm).append(xfND(_carryschdate));
        sb.append(dm).append(xfND(_carryoutdate));
        sb.append(dm).append(xfND(_transportpriority));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_shiptosub));
        sb.append(dm).append(xfND(_delivname));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_postno));
        sb.append(dm).append(xfND(_countrycd));
        sb.append(dm).append(xfND(_portcd));
        sb.append(dm).append(xfND(_districtcd));
        sb.append(dm).append(xfND(_phoneno));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_refname));
        sb.append(dm).append(xfND(_areacd));
        sb.append(dm).append(xfND(_allocgroup));
        sb.append(dm).append(xfND(_carriercd));
        sb.append(dm).append(xfND(_carriername));
        sb.append(dm).append(xfND(_carrierwbno));
        sb.append(dm).append(xfND(_deliverycd));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_carcd));
        sb.append(dm).append(xfND(_carrierseq));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_otherrefno2));
        sb.append(dm).append(xfND(_otherrefno3));
        sb.append(dm).append(xfND(_pickingInstId));
        sb.append(dm).append(xfND(_execkey));
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
    public TTrso clone() {
        return (TTrso)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SOID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定ID
     * @return The value of the column 'SOID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSoid() {
        checkSpecifiedProperty("soid");
        return _soid;
    }

    /**
     * [set] SOID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 出庫予定ID
     * @param soid The value of the column 'SOID'. (basically NotNull if update: for the constraint)
     */
    public void setSoid(Long soid) {
        registerModifiedProperty("soid");
        _soid = soid;
    }

    /**
     * [get] SOKEY: {NotNull, bigint(19)} <br>
     * 出庫指示Ｋｅｙ
     * @return The value of the column 'SOKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSokey() {
        checkSpecifiedProperty("sokey");
        return _sokey;
    }

    /**
     * [set] SOKEY: {NotNull, bigint(19)} <br>
     * 出庫指示Ｋｅｙ
     * @param sokey The value of the column 'SOKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSokey(Long sokey) {
        registerModifiedProperty("sokey");
        _sokey = sokey;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * 整理番号
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
    }

    /**
     * [get] PREOWNERSONO: {varchar(60)} <br>
     * 元荷主出庫指示番号
     * @return The value of the column 'PREOWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPreownersono() {
        checkSpecifiedProperty("preownersono");
        return convertEmptyToNull(_preownersono);
    }

    /**
     * [set] PREOWNERSONO: {varchar(60)} <br>
     * 元荷主出庫指示番号
     * @param preownersono The value of the column 'PREOWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPreownersono(String preownersono) {
        registerModifiedProperty("preownersono");
        _preownersono = preownersono;
    }

    /**
     * [get] SOTYPE: {varchar(30)} <br>
     * 出庫タイプ
     * @return The value of the column 'SOTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotype() {
        checkSpecifiedProperty("sotype");
        return convertEmptyToNull(_sotype);
    }

    /**
     * [set] SOTYPE: {varchar(30)} <br>
     * 出庫タイプ
     * @param sotype The value of the column 'SOTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotype(String sotype) {
        registerModifiedProperty("sotype");
        _sotype = sotype;
    }

    /**
     * [get] PARTFLG: {NotNull, char(1), default=[(0)]} <br>
     * 分割可能フラグ
     * @return The value of the column 'PARTFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPartflg() {
        checkSpecifiedProperty("partflg");
        return convertEmptyToNull(_partflg);
    }

    /**
     * [set] PARTFLG: {NotNull, char(1), default=[(0)]} <br>
     * 分割可能フラグ
     * @param partflg The value of the column 'PARTFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPartflg(String partflg) {
        registerModifiedProperty("partflg");
        _partflg = partflg;
    }

    /**
     * [get] STS: {IX, NotNull, varchar(30)} <br>
     * 出荷ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public String getSts() {
        checkSpecifiedProperty("sts");
        return convertEmptyToNull(_sts);
    }

    /**
     * [set] STS: {IX, NotNull, varchar(30)} <br>
     * 出荷ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(String sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] COMPANYCD: {IX, varchar(30)} <br>
     * 取引先（代理店）CD
     * @return The value of the column 'COMPANYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanycd() {
        checkSpecifiedProperty("companycd");
        return convertEmptyToNull(_companycd);
    }

    /**
     * [set] COMPANYCD: {IX, varchar(30)} <br>
     * 取引先（代理店）CD
     * @param companycd The value of the column 'COMPANYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanycd(String companycd) {
        registerModifiedProperty("companycd");
        _companycd = companycd;
    }

    /**
     * [get] ORDERKEY: {bigint(19)} <br>
     * 受注オーダＫｅｙ
     * @return The value of the column 'ORDERKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getOrderkey() {
        checkSpecifiedProperty("orderkey");
        return _orderkey;
    }

    /**
     * [set] ORDERKEY: {bigint(19)} <br>
     * 受注オーダＫｅｙ
     * @param orderkey The value of the column 'ORDERKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderkey(Long orderkey) {
        registerModifiedProperty("orderkey");
        _orderkey = orderkey;
    }

    /**
     * [get] OWNERORDERNO: {varchar(60)} <br>
     * 車割キー
     * @return The value of the column 'OWNERORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnerorderno() {
        checkSpecifiedProperty("ownerorderno");
        return convertEmptyToNull(_ownerorderno);
    }

    /**
     * [set] OWNERORDERNO: {varchar(60)} <br>
     * 車割キー
     * @param ownerorderno The value of the column 'OWNERORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnerorderno(String ownerorderno) {
        registerModifiedProperty("ownerorderno");
        _ownerorderno = ownerorderno;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * 依頼種別
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
    }

    /**
     * [get] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @return The value of the column 'CUSTORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustorderno() {
        checkSpecifiedProperty("custorderno");
        return convertEmptyToNull(_custorderno);
    }

    /**
     * [set] CUSTORDERNO: {varchar(60)} <br>
     * 依頼番号
     * @param custorderno The value of the column 'CUSTORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustorderno(String custorderno) {
        registerModifiedProperty("custorderno");
        _custorderno = custorderno;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * 問合せ番号
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * 問合せ番号
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @return The value of the column 'ORDERDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderdate() {
        checkSpecifiedProperty("orderdate");
        return convertEmptyToNull(_orderdate);
    }

    /**
     * [set] ORDERDATE: {varchar(8)} <br>
     * 指図日
     * @param orderdate The value of the column 'ORDERDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderdate(String orderdate) {
        registerModifiedProperty("orderdate");
        _orderdate = orderdate;
    }

    /**
     * [get] SHIPSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 出庫予定日
     * @return The value of the column 'SHIPSCHDATE'. (basically NotNull if selected: for the constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {IX, NotNull, varchar(8)} <br>
     * 出庫予定日
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (basically NotNull if update: for the constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫実績日
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {IX, varchar(8)} <br>
     * 出庫実績日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} <br>
     * 受入予定日
     * @return The value of the column 'DELIVSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivschdate() {
        checkSpecifiedProperty("delivschdate");
        return convertEmptyToNull(_delivschdate);
    }

    /**
     * [set] DELIVSCHDATE: {varchar(8), default=[sysdatetime()]} <br>
     * 受入予定日
     * @param delivschdate The value of the column 'DELIVSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivschdate(String delivschdate) {
        registerModifiedProperty("delivschdate");
        _delivschdate = delivschdate;
    }

    /**
     * [get] DELIVDATE: {varchar(8)} <br>
     * 納品完了日・時刻
     * @return The value of the column 'DELIVDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivdate() {
        checkSpecifiedProperty("delivdate");
        return convertEmptyToNull(_delivdate);
    }

    /**
     * [set] DELIVDATE: {varchar(8)} <br>
     * 納品完了日・時刻
     * @param delivdate The value of the column 'DELIVDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivdate(String delivdate) {
        registerModifiedProperty("delivdate");
        _delivdate = delivdate;
    }

    /**
     * [get] CARRYSCHDATE: {varchar(8)} <br>
     * 積込検品完了日
     * @return The value of the column 'CARRYSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarryschdate() {
        checkSpecifiedProperty("carryschdate");
        return convertEmptyToNull(_carryschdate);
    }

    /**
     * [set] CARRYSCHDATE: {varchar(8)} <br>
     * 積込検品完了日
     * @param carryschdate The value of the column 'CARRYSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarryschdate(String carryschdate) {
        registerModifiedProperty("carryschdate");
        _carryschdate = carryschdate;
    }

    /**
     * [get] CARRYOUTDATE: {varchar(8)} <br>
     * 配送（出発）完了日・時刻
     * @return The value of the column 'CARRYOUTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarryoutdate() {
        checkSpecifiedProperty("carryoutdate");
        return convertEmptyToNull(_carryoutdate);
    }

    /**
     * [set] CARRYOUTDATE: {varchar(8)} <br>
     * 配送（出発）完了日・時刻
     * @param carryoutdate The value of the column 'CARRYOUTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarryoutdate(String carryoutdate) {
        registerModifiedProperty("carryoutdate");
        _carryoutdate = carryoutdate;
    }

    /**
     * [get] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 配送ルート順
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportpriority() {
        checkSpecifiedProperty("transportpriority");
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]} <br>
     * 配送ルート順
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        registerModifiedProperty("transportpriority");
        _transportpriority = transportpriority;
    }

    /**
     * [get] SHIPTOCD: {IX, varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {IX, varchar(30)} <br>
     * 受入先CD
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] SHIPTOSUB: {char(1)} <br>
     * 出庫実績送信フラグ
     * @return The value of the column 'SHIPTOSUB'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptosub() {
        checkSpecifiedProperty("shiptosub");
        return convertEmptyToNull(_shiptosub);
    }

    /**
     * [set] SHIPTOSUB: {char(1)} <br>
     * 出庫実績送信フラグ
     * @param shiptosub The value of the column 'SHIPTOSUB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptosub(String shiptosub) {
        registerModifiedProperty("shiptosub");
        _shiptosub = shiptosub;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @return The value of the column 'DELIVNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivname() {
        checkSpecifiedProperty("delivname");
        return convertEmptyToNull(_delivname);
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * 出庫先名称
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivname(String delivname) {
        registerModifiedProperty("delivname");
        _delivname = delivname;
    }

    /**
     * [get] ADDRESS1: {char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {char(1)} <br>
     * 送信済フラグ
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(8)} <br>
     * 通関日
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(8)} <br>
     * 通関日
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(30)} <br>
     * 製品区分
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(30)} <br>
     * 製品区分
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] POSTNO: {char(1)} <br>
     * マージ状態区分
     * @return The value of the column 'POSTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostno() {
        checkSpecifiedProperty("postno");
        return convertEmptyToNull(_postno);
    }

    /**
     * [set] POSTNO: {char(1)} <br>
     * マージ状態区分
     * @param postno The value of the column 'POSTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostno(String postno) {
        registerModifiedProperty("postno");
        _postno = postno;
    }

    /**
     * [get] COUNTRYCD: {varchar(30)} <br>
     * 納品先国CD
     * @return The value of the column 'COUNTRYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCountrycd() {
        checkSpecifiedProperty("countrycd");
        return convertEmptyToNull(_countrycd);
    }

    /**
     * [set] COUNTRYCD: {varchar(30)} <br>
     * 納品先国CD
     * @param countrycd The value of the column 'COUNTRYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCountrycd(String countrycd) {
        registerModifiedProperty("countrycd");
        _countrycd = countrycd;
    }

    /**
     * [get] PORTCD: {varchar(30)} <br>
     * 納品先入出港CD
     * @return The value of the column 'PORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPortcd() {
        checkSpecifiedProperty("portcd");
        return convertEmptyToNull(_portcd);
    }

    /**
     * [set] PORTCD: {varchar(30)} <br>
     * 納品先入出港CD
     * @param portcd The value of the column 'PORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPortcd(String portcd) {
        registerModifiedProperty("portcd");
        _portcd = portcd;
    }

    /**
     * [get] DISTRICTCD: {varchar(30)} <br>
     * 納品先地区CD
     * @return The value of the column 'DISTRICTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistrictcd() {
        checkSpecifiedProperty("districtcd");
        return convertEmptyToNull(_districtcd);
    }

    /**
     * [set] DISTRICTCD: {varchar(30)} <br>
     * 納品先地区CD
     * @param districtcd The value of the column 'DISTRICTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistrictcd(String districtcd) {
        registerModifiedProperty("districtcd");
        _districtcd = districtcd;
    }

    /**
     * [get] PHONENO: {varchar(60)} <br>
     * 車記号
     * @return The value of the column 'PHONENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneno() {
        checkSpecifiedProperty("phoneno");
        return convertEmptyToNull(_phoneno);
    }

    /**
     * [set] PHONENO: {varchar(60)} <br>
     * 車記号
     * @param phoneno The value of the column 'PHONENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneno(String phoneno) {
        registerModifiedProperty("phoneno");
        _phoneno = phoneno;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @return The value of the column 'FAX1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * 出庫経路区分
     * @param fax1 The value of the column 'FAX1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] EMAIL: {char(1)} <br>
     * 出庫完了選択フラグ
     * @return The value of the column 'EMAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return convertEmptyToNull(_email);
    }

    /**
     * [set] EMAIL: {char(1)} <br>
     * 出庫完了選択フラグ
     * @param email The value of the column 'EMAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] REFNAME: {varchar(60)} <br>
     * 融通輸送倉庫CD
     * @return The value of the column 'REFNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getRefname() {
        checkSpecifiedProperty("refname");
        return convertEmptyToNull(_refname);
    }

    /**
     * [set] REFNAME: {varchar(60)} <br>
     * 融通輸送倉庫CD
     * @param refname The value of the column 'REFNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefname(String refname) {
        registerModifiedProperty("refname");
        _refname = refname;
    }

    /**
     * [get] AREACD: {varchar(30)} <br>
     * 納品先エリアCD
     * @return The value of the column 'AREACD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAreacd() {
        checkSpecifiedProperty("areacd");
        return convertEmptyToNull(_areacd);
    }

    /**
     * [set] AREACD: {varchar(30)} <br>
     * 納品先エリアCD
     * @param areacd The value of the column 'AREACD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAreacd(String areacd) {
        registerModifiedProperty("areacd");
        _areacd = areacd;
    }

    /**
     * [get] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @return The value of the column 'ALLOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocgroup() {
        checkSpecifiedProperty("allocgroup");
        return convertEmptyToNull(_allocgroup);
    }

    /**
     * [set] ALLOCGROUP: {varchar(60)} <br>
     * 引当締めグループ
     * @param allocgroup The value of the column 'ALLOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocgroup(String allocgroup) {
        registerModifiedProperty("allocgroup");
        _allocgroup = allocgroup;
    }

    /**
     * [get] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @return The value of the column 'CARRIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriercd() {
        checkSpecifiedProperty("carriercd");
        return convertEmptyToNull(_carriercd);
    }

    /**
     * [set] CARRIERCD: {varchar(30)} <br>
     * 取引先（運送会社）CD
     * @param carriercd The value of the column 'CARRIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriercd(String carriercd) {
        registerModifiedProperty("carriercd");
        _carriercd = carriercd;
    }

    /**
     * [get] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @return The value of the column 'CARRIERNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriername() {
        checkSpecifiedProperty("carriername");
        return convertEmptyToNull(_carriername);
    }

    /**
     * [set] CARRIERNAME: {varchar(255)} <br>
     * 運送会社名称
     * @param carriername The value of the column 'CARRIERNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriername(String carriername) {
        registerModifiedProperty("carriername");
        _carriername = carriername;
    }

    /**
     * [get] CARRIERWBNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'CARRIERWBNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierwbno() {
        checkSpecifiedProperty("carrierwbno");
        return convertEmptyToNull(_carrierwbno);
    }

    /**
     * [set] CARRIERWBNO: {varchar(60)} <br>
     * 保税管理番号
     * @param carrierwbno The value of the column 'CARRIERWBNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierwbno(String carrierwbno) {
        registerModifiedProperty("carrierwbno");
        _carrierwbno = carrierwbno;
    }

    /**
     * [get] DELIVERYCD: {IX, varchar(30)} <br>
     * 便CD
     * @return The value of the column 'DELIVERYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverycd() {
        checkSpecifiedProperty("deliverycd");
        return convertEmptyToNull(_deliverycd);
    }

    /**
     * [set] DELIVERYCD: {IX, varchar(30)} <br>
     * 便CD
     * @param deliverycd The value of the column 'DELIVERYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverycd(String deliverycd) {
        registerModifiedProperty("deliverycd");
        _deliverycd = deliverycd;
    }

    /**
     * [get] CARRIERNO: {varchar(60)} <br>
     * 輸送形態CD
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(60)} <br>
     * 輸送形態CD
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * 出庫先短縮名称
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * 出庫先短縮名称
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] CARCD: {varchar(30)} <br>
     * 車輌CD
     * @return The value of the column 'CARCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarcd() {
        checkSpecifiedProperty("carcd");
        return convertEmptyToNull(_carcd);
    }

    /**
     * [set] CARCD: {varchar(30)} <br>
     * 車輌CD
     * @param carcd The value of the column 'CARCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarcd(String carcd) {
        registerModifiedProperty("carcd");
        _carcd = carcd;
    }

    /**
     * [get] CARRIERSEQ: {bigint(19), default=[(0)]} <br>
     * 運行回数
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarrierseq() {
        checkSpecifiedProperty("carrierseq");
        return _carrierseq;
    }

    /**
     * [set] CARRIERSEQ: {bigint(19), default=[(0)]} <br>
     * 運行回数
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierseq(Long carrierseq) {
        registerModifiedProperty("carrierseq");
        _carrierseq = carrierseq;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcd() {
        checkSpecifiedProperty("itemcd");
        return convertEmptyToNull(_itemcd);
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcd(String itemcd) {
        registerModifiedProperty("itemcd");
        _itemcd = itemcd;
    }

    /**
     * [get] NOTES: {varchar(4000)} <br>
     * 備考／特約店名称
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * 備考／特約店名称
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
    }

    /**
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * 輸送形態
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * 輸送形態
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @return The value of the column 'OTHERREFNO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno2() {
        checkSpecifiedProperty("otherrefno2");
        return convertEmptyToNull(_otherrefno2);
    }

    /**
     * [set] OTHERREFNO2: {varchar(60)} <br>
     * 着地名称
     * @param otherrefno2 The value of the column 'OTHERREFNO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno2(String otherrefno2) {
        registerModifiedProperty("otherrefno2");
        _otherrefno2 = otherrefno2;
    }

    /**
     * [get] OTHERREFNO3: {varchar(60)} <br>
     * 印刷フラグ
     * @return The value of the column 'OTHERREFNO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno3() {
        checkSpecifiedProperty("otherrefno3");
        return convertEmptyToNull(_otherrefno3);
    }

    /**
     * [set] OTHERREFNO3: {varchar(60)} <br>
     * 印刷フラグ
     * @param otherrefno3 The value of the column 'OTHERREFNO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno3(String otherrefno3) {
        registerModifiedProperty("otherrefno3");
        _otherrefno3 = otherrefno3;
    }

    /**
     * [get] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @return The value of the column 'PICKING_INST_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPickingInstId() {
        checkSpecifiedProperty("pickingInstId");
        return _pickingInstId;
    }

    /**
     * [set] PICKING_INST_ID: {bigint(19)} <br>
     * ピッキング指示ID
     * @param pickingInstId The value of the column 'PICKING_INST_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingInstId(Long pickingInstId) {
        registerModifiedProperty("pickingInstId");
        _pickingInstId = pickingInstId;
    }

    /**
     * [get] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @return The value of the column 'EXECKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExeckey() {
        checkSpecifiedProperty("execkey");
        return _execkey;
    }

    /**
     * [set] EXECKEY: {IX, bigint(19)} <br>
     * ログ実行キー
     * @param execkey The value of the column 'EXECKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExeckey(Long execkey) {
        registerModifiedProperty("execkey");
        _execkey = execkey;
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
