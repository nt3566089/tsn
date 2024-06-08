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
 * The entity of E_TRACKING_INFO_IMPORT as TABLE. <br>
 * 追跡情報送信テーブル（輸入）
 * <pre>
 * [primary-key]
 *     TRACKING_INFO_IMPORT_ID
 *
 * [column]
 *     TRACKING_INFO_IMPORT_ID, SYMBOLPOSKEY, WAREHOUSECD, WAREHOUSE_SNAME, FACTORY_SNAME, FACTORYCD, ITEMCD_CASE, ITEM_SNAME_CASE, ITEMCD_WH, ITEM_SNAME_WH, RCVKEY, MACHINENO, CREATENO, LIMITDATENOW, DESIGNCD_CASE, LOT1, MANUFACTURECD, OTHERLOT1, CASECREATETYPE, CASECREATETYPE_NM, RECEIVEDATE, ARRIVALPORTDATE, SHIPNAME, INITNUM, MIXEDFLG, LENDFLG, LOCGROUP, LOCCD, SHIPDATE, CURRENT_LOCATION_CD, CURRENT_LOCATION_SNAME, ADDDATETIME, TRACETYPE, OTHERCD1, EXAMSTS, CASEINNUMBOWL, SHIPNUMBOWL, SUPPLIERRCVNO, TOKUHANCD, TOKUHAN_NM, MAKERCASENO, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, CASECENTERNO, CASEPACKNO, CASEPACKTIME, SENDER_LOCATION, RECEIVER_LOCATION, SHIPMENT_ID, SHIPMENT_DATE, NUMBER_OF_PALLETS, CARRIERNO, TKHNORDERNO, SRCCD, BLNO, INVOICENO, SSCC, CASENO, INV_NUM, SORT_NUM, ADOPT_NUM, SEND_CD, SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRACKING_INFO_IMPORT_ID
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
 * Long trackingInfoImportId = entity.getTrackingInfoImportId();
 * Long symbolposkey = entity.getSymbolposkey();
 * String warehousecd = entity.getWarehousecd();
 * String warehouseSname = entity.getWarehouseSname();
 * String factorySname = entity.getFactorySname();
 * String factorycd = entity.getFactorycd();
 * String itemcdCase = entity.getItemcdCase();
 * String itemSnameCase = entity.getItemSnameCase();
 * String itemcdWh = entity.getItemcdWh();
 * String itemSnameWh = entity.getItemSnameWh();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * String machineno = entity.getMachineno();
 * String createno = entity.getCreateno();
 * String limitdatenow = entity.getLimitdatenow();
 * String designcdCase = entity.getDesigncdCase();
 * String lot1 = entity.getLot1();
 * String manufacturecd = entity.getManufacturecd();
 * String otherlot1 = entity.getOtherlot1();
 * String casecreatetype = entity.getCasecreatetype();
 * String casecreatetypeNm = entity.getCasecreatetypeNm();
 * String receivedate = entity.getReceivedate();
 * String arrivalportdate = entity.getArrivalportdate();
 * String shipname = entity.getShipname();
 * Long initnum = entity.getInitnum();
 * String mixedflg = entity.getMixedflg();
 * String lendflg = entity.getLendflg();
 * String locgroup = entity.getLocgroup();
 * String loccd = entity.getLoccd();
 * String shipdate = entity.getShipdate();
 * String currentLocationCd = entity.getCurrentLocationCd();
 * String currentLocationSname = entity.getCurrentLocationSname();
 * java.sql.Timestamp adddatetime = entity.getAdddatetime();
 * String tracetype = entity.getTracetype();
 * String othercd1 = entity.getOthercd1();
 * Long examsts = entity.getExamsts();
 * Long caseinnumbowl = entity.getCaseinnumbowl();
 * Long shipnumbowl = entity.getShipnumbowl();
 * String supplierrcvno = entity.getSupplierrcvno();
 * String tokuhancd = entity.getTokuhancd();
 * String tokuhanNm = entity.getTokuhanNm();
 * String makercaseno = entity.getMakercaseno();
 * String caseitfno = entity.getCaseitfno();
 * String casebarcodevaliant = entity.getCasebarcodevaliant();
 * String caselot4 = entity.getCaselot4();
 * String casecenterno = entity.getCasecenterno();
 * String casepackno = entity.getCasepackno();
 * String casepacktime = entity.getCasepacktime();
 * String senderLocation = entity.getSenderLocation();
 * String receiverLocation = entity.getReceiverLocation();
 * String shipmentId = entity.getShipmentId();
 * String shipmentDate = entity.getShipmentDate();
 * String numberOfPallets = entity.getNumberOfPallets();
 * String carrierno = entity.getCarrierno();
 * String tkhnorderno = entity.getTkhnorderno();
 * String srccd = entity.getSrccd();
 * String blno = entity.getBlno();
 * String invoiceno = entity.getInvoiceno();
 * String sscc = entity.getSscc();
 * String caseno = entity.getCaseno();
 * Long invNum = entity.getInvNum();
 * Long sortNum = entity.getSortNum();
 * Long adoptNum = entity.getAdoptNum();
 * String sendCd = entity.getSendCd();
 * String sendFlg = entity.getSendFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrackingInfoImportId(trackingInfoImportId);
 * entity.setSymbolposkey(symbolposkey);
 * entity.setWarehousecd(warehousecd);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setFactorySname(factorySname);
 * entity.setFactorycd(factorycd);
 * entity.setItemcdCase(itemcdCase);
 * entity.setItemSnameCase(itemSnameCase);
 * entity.setItemcdWh(itemcdWh);
 * entity.setItemSnameWh(itemSnameWh);
 * entity.setRcvkey(rcvkey);
 * entity.setMachineno(machineno);
 * entity.setCreateno(createno);
 * entity.setLimitdatenow(limitdatenow);
 * entity.setDesigncdCase(designcdCase);
 * entity.setLot1(lot1);
 * entity.setManufacturecd(manufacturecd);
 * entity.setOtherlot1(otherlot1);
 * entity.setCasecreatetype(casecreatetype);
 * entity.setCasecreatetypeNm(casecreatetypeNm);
 * entity.setReceivedate(receivedate);
 * entity.setArrivalportdate(arrivalportdate);
 * entity.setShipname(shipname);
 * entity.setInitnum(initnum);
 * entity.setMixedflg(mixedflg);
 * entity.setLendflg(lendflg);
 * entity.setLocgroup(locgroup);
 * entity.setLoccd(loccd);
 * entity.setShipdate(shipdate);
 * entity.setCurrentLocationCd(currentLocationCd);
 * entity.setCurrentLocationSname(currentLocationSname);
 * entity.setAdddatetime(adddatetime);
 * entity.setTracetype(tracetype);
 * entity.setOthercd1(othercd1);
 * entity.setExamsts(examsts);
 * entity.setCaseinnumbowl(caseinnumbowl);
 * entity.setShipnumbowl(shipnumbowl);
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setTokuhancd(tokuhancd);
 * entity.setTokuhanNm(tokuhanNm);
 * entity.setMakercaseno(makercaseno);
 * entity.setCaseitfno(caseitfno);
 * entity.setCasebarcodevaliant(casebarcodevaliant);
 * entity.setCaselot4(caselot4);
 * entity.setCasecenterno(casecenterno);
 * entity.setCasepackno(casepackno);
 * entity.setCasepacktime(casepacktime);
 * entity.setSenderLocation(senderLocation);
 * entity.setReceiverLocation(receiverLocation);
 * entity.setShipmentId(shipmentId);
 * entity.setShipmentDate(shipmentDate);
 * entity.setNumberOfPallets(numberOfPallets);
 * entity.setCarrierno(carrierno);
 * entity.setTkhnorderno(tkhnorderno);
 * entity.setSrccd(srccd);
 * entity.setBlno(blno);
 * entity.setInvoiceno(invoiceno);
 * entity.setSscc(sscc);
 * entity.setCaseno(caseno);
 * entity.setInvNum(invNum);
 * entity.setSortNum(sortNum);
 * entity.setAdoptNum(adoptNum);
 * entity.setSendCd(sendCd);
 * entity.setSendFlg(sendFlg);
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
public abstract class BsETrackingInfoImport extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _trackingInfoImportId;

    /** SYMBOLPOSKEY: {NotNull, bigint(19)} */
    protected Long _symbolposkey;

    /** WAREHOUSECD: {NotNull, varchar(30)} */
    protected String _warehousecd;

    /** WAREHOUSE_SNAME: {NotNull, varchar(100)} */
    protected String _warehouseSname;

    /** FACTORY_SNAME: {NotNull, varchar(30)} */
    protected String _factorySname;

    /** FACTORYCD: {NotNull, varchar(100)} */
    protected String _factorycd;

    /** ITEMCD_CASE: {NotNull, varchar(30)} */
    protected String _itemcdCase;

    /** ITEM_SNAME_CASE: {NotNull, varchar(60)} */
    protected String _itemSnameCase;

    /** ITEMCD_WH: {NotNull, varchar(30)} */
    protected String _itemcdWh;

    /** ITEM_SNAME_WH: {NotNull, varchar(60)} */
    protected String _itemSnameWh;

    /** RCVKEY: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** MACHINENO: {NotNull, varchar(30)} */
    protected String _machineno;

    /** CREATENO: {NotNull, varchar(30)} */
    protected String _createno;

    /** LIMITDATENOW: {NotNull, varchar(8)} */
    protected String _limitdatenow;

    /** DESIGNCD_CASE: {NotNull, varchar(30)} */
    protected String _designcdCase;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** MANUFACTURECD: {varchar(60)} */
    protected String _manufacturecd;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** CASECREATETYPE: {varchar(30)} */
    protected String _casecreatetype;

    /** CASECREATETYPE_NM: {varchar(60)} */
    protected String _casecreatetypeNm;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** ARRIVALPORTDATE: {varchar(8)} */
    protected String _arrivalportdate;

    /** SHIPNAME: {varchar(100)} */
    protected String _shipname;

    /** INITNUM: {bigint(19)} */
    protected Long _initnum;

    /** MIXEDFLG: {char(1)} */
    protected String _mixedflg;

    /** LENDFLG: {char(1)} */
    protected String _lendflg;

    /** LOCGROUP: {varchar(30)} */
    protected String _locgroup;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** SHIPDATE: {varchar(8)} */
    protected String _shipdate;

    /** CURRENT_LOCATION_CD: {varchar(30)} */
    protected String _currentLocationCd;

    /** CURRENT_LOCATION_SNAME: {varchar(100)} */
    protected String _currentLocationSname;

    /** ADDDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _adddatetime;

    /** TRACETYPE: {varchar(30)} */
    protected String _tracetype;

    /** OTHERCD1: {varchar(60)} */
    protected String _othercd1;

    /** EXAMSTS: {bigint(19)} */
    protected Long _examsts;

    /** CASEINNUMBOWL: {bigint(19)} */
    protected Long _caseinnumbowl;

    /** SHIPNUMBOWL: {bigint(19)} */
    protected Long _shipnumbowl;

    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** TOKUHANCD: {varchar(100)} */
    protected String _tokuhancd;

    /** TOKUHAN_NM: {varchar(60)} */
    protected String _tokuhanNm;

    /** MAKERCASENO: {varchar(60)} */
    protected String _makercaseno;

    /** CASEITFNO: {varchar(30)} */
    protected String _caseitfno;

    /** CASEBARCODEVALIANT: {varchar(30)} */
    protected String _casebarcodevaliant;

    /** CASELOT4: {varchar(30)} */
    protected String _caselot4;

    /** CASECENTERNO: {varchar(30)} */
    protected String _casecenterno;

    /** CASEPACKNO: {varchar(30)} */
    protected String _casepackno;

    /** CASEPACKTIME: {varchar(30)} */
    protected String _casepacktime;

    /** SENDER_LOCATION: {varchar(30)} */
    protected String _senderLocation;

    /** RECEIVER_LOCATION: {varchar(30)} */
    protected String _receiverLocation;

    /** SHIPMENT_ID: {varchar(30)} */
    protected String _shipmentId;

    /** SHIPMENT_DATE: {varchar(30)} */
    protected String _shipmentDate;

    /** NUMBER_OF_PALLETS: {varchar(30)} */
    protected String _numberOfPallets;

    /** CARRIERNO: {varchar(30)} */
    protected String _carrierno;

    /** TKHNORDERNO: {varchar(30)} */
    protected String _tkhnorderno;

    /** SRCCD: {varchar(30)} */
    protected String _srccd;

    /** BLNO: {varchar(60)} */
    protected String _blno;

    /** INVOICENO: {varchar(60)} */
    protected String _invoiceno;

    /** SSCC: {varchar(30)} */
    protected String _sscc;

    /** CASENO: {varchar(30)} */
    protected String _caseno;

    /** INV_NUM: {bigint(19)} */
    protected Long _invNum;

    /** SORT_NUM: {bigint(19)} */
    protected Long _sortNum;

    /** ADOPT_NUM: {bigint(19)} */
    protected Long _adoptNum;

    /** SEND_CD: {varchar(30)} */
    protected String _sendCd;

    /** SEND_FLG: {NotNull, char(1)} */
    protected String _sendFlg;

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
        return "E_TRACKING_INFO_IMPORT";
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
        if (_trackingInfoImportId == null) { return false; }
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
        if (obj instanceof BsETrackingInfoImport) {
            BsETrackingInfoImport other = (BsETrackingInfoImport)obj;
            if (!xSV(_trackingInfoImportId, other._trackingInfoImportId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trackingInfoImportId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trackingInfoImportId));
        sb.append(dm).append(xfND(_symbolposkey));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_factorySname));
        sb.append(dm).append(xfND(_factorycd));
        sb.append(dm).append(xfND(_itemcdCase));
        sb.append(dm).append(xfND(_itemSnameCase));
        sb.append(dm).append(xfND(_itemcdWh));
        sb.append(dm).append(xfND(_itemSnameWh));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_machineno));
        sb.append(dm).append(xfND(_createno));
        sb.append(dm).append(xfND(_limitdatenow));
        sb.append(dm).append(xfND(_designcdCase));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_manufacturecd));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_casecreatetype));
        sb.append(dm).append(xfND(_casecreatetypeNm));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_arrivalportdate));
        sb.append(dm).append(xfND(_shipname));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_mixedflg));
        sb.append(dm).append(xfND(_lendflg));
        sb.append(dm).append(xfND(_locgroup));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_shipdate));
        sb.append(dm).append(xfND(_currentLocationCd));
        sb.append(dm).append(xfND(_currentLocationSname));
        sb.append(dm).append(xfND(_adddatetime));
        sb.append(dm).append(xfND(_tracetype));
        sb.append(dm).append(xfND(_othercd1));
        sb.append(dm).append(xfND(_examsts));
        sb.append(dm).append(xfND(_caseinnumbowl));
        sb.append(dm).append(xfND(_shipnumbowl));
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_tokuhancd));
        sb.append(dm).append(xfND(_tokuhanNm));
        sb.append(dm).append(xfND(_makercaseno));
        sb.append(dm).append(xfND(_caseitfno));
        sb.append(dm).append(xfND(_casebarcodevaliant));
        sb.append(dm).append(xfND(_caselot4));
        sb.append(dm).append(xfND(_casecenterno));
        sb.append(dm).append(xfND(_casepackno));
        sb.append(dm).append(xfND(_casepacktime));
        sb.append(dm).append(xfND(_senderLocation));
        sb.append(dm).append(xfND(_receiverLocation));
        sb.append(dm).append(xfND(_shipmentId));
        sb.append(dm).append(xfND(_shipmentDate));
        sb.append(dm).append(xfND(_numberOfPallets));
        sb.append(dm).append(xfND(_carrierno));
        sb.append(dm).append(xfND(_tkhnorderno));
        sb.append(dm).append(xfND(_srccd));
        sb.append(dm).append(xfND(_blno));
        sb.append(dm).append(xfND(_invoiceno));
        sb.append(dm).append(xfND(_sscc));
        sb.append(dm).append(xfND(_caseno));
        sb.append(dm).append(xfND(_invNum));
        sb.append(dm).append(xfND(_sortNum));
        sb.append(dm).append(xfND(_adoptNum));
        sb.append(dm).append(xfND(_sendCd));
        sb.append(dm).append(xfND(_sendFlg));
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
    public ETrackingInfoImport clone() {
        return (ETrackingInfoImport)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 追跡情報送信（輸入）ID
     * @return The value of the column 'TRACKING_INFO_IMPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrackingInfoImportId() {
        checkSpecifiedProperty("trackingInfoImportId");
        return _trackingInfoImportId;
    }

    /**
     * [set] TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 追跡情報送信（輸入）ID
     * @param trackingInfoImportId The value of the column 'TRACKING_INFO_IMPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrackingInfoImportId(Long trackingInfoImportId) {
        registerModifiedProperty("trackingInfoImportId");
        _trackingInfoImportId = trackingInfoImportId;
    }

    /**
     * [get] SYMBOLPOSKEY: {NotNull, bigint(19)} <br>
     * 追跡キー
     * @return The value of the column 'SYMBOLPOSKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getSymbolposkey() {
        checkSpecifiedProperty("symbolposkey");
        return _symbolposkey;
    }

    /**
     * [set] SYMBOLPOSKEY: {NotNull, bigint(19)} <br>
     * 追跡キー
     * @param symbolposkey The value of the column 'SYMBOLPOSKEY'. (basically NotNull if update: for the constraint)
     */
    public void setSymbolposkey(Long symbolposkey) {
        registerModifiedProperty("symbolposkey");
        _symbolposkey = symbolposkey;
    }

    /**
     * [get] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 作成拠点CD
     * @return The value of the column 'WAREHOUSECD'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {NotNull, varchar(30)} <br>
     * 作成拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 作成拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * 作成拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
    }

    /**
     * [get] FACTORY_SNAME: {NotNull, varchar(30)} <br>
     * 工場CD
     * @return The value of the column 'FACTORY_SNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFactorySname() {
        checkSpecifiedProperty("factorySname");
        return convertEmptyToNull(_factorySname);
    }

    /**
     * [set] FACTORY_SNAME: {NotNull, varchar(30)} <br>
     * 工場CD
     * @param factorySname The value of the column 'FACTORY_SNAME'. (basically NotNull if update: for the constraint)
     */
    public void setFactorySname(String factorySname) {
        registerModifiedProperty("factorySname");
        _factorySname = factorySname;
    }

    /**
     * [get] FACTORYCD: {NotNull, varchar(100)} <br>
     * 工場名称
     * @return The value of the column 'FACTORYCD'. (basically NotNull if selected: for the constraint)
     */
    public String getFactorycd() {
        checkSpecifiedProperty("factorycd");
        return convertEmptyToNull(_factorycd);
    }

    /**
     * [set] FACTORYCD: {NotNull, varchar(100)} <br>
     * 工場名称
     * @param factorycd The value of the column 'FACTORYCD'. (basically NotNull if update: for the constraint)
     */
    public void setFactorycd(String factorycd) {
        registerModifiedProperty("factorycd");
        _factorycd = factorycd;
    }

    /**
     * [get] ITEMCD_CASE: {NotNull, varchar(30)} <br>
     * 銘柄CD（シンボル）
     * @return The value of the column 'ITEMCD_CASE'. (basically NotNull if selected: for the constraint)
     */
    public String getItemcdCase() {
        checkSpecifiedProperty("itemcdCase");
        return convertEmptyToNull(_itemcdCase);
    }

    /**
     * [set] ITEMCD_CASE: {NotNull, varchar(30)} <br>
     * 銘柄CD（シンボル）
     * @param itemcdCase The value of the column 'ITEMCD_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setItemcdCase(String itemcdCase) {
        registerModifiedProperty("itemcdCase");
        _itemcdCase = itemcdCase;
    }

    /**
     * [get] ITEM_SNAME_CASE: {NotNull, varchar(60)} <br>
     * 銘柄名称（シンボル）
     * @return The value of the column 'ITEM_SNAME_CASE'. (basically NotNull if selected: for the constraint)
     */
    public String getItemSnameCase() {
        checkSpecifiedProperty("itemSnameCase");
        return convertEmptyToNull(_itemSnameCase);
    }

    /**
     * [set] ITEM_SNAME_CASE: {NotNull, varchar(60)} <br>
     * 銘柄名称（シンボル）
     * @param itemSnameCase The value of the column 'ITEM_SNAME_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setItemSnameCase(String itemSnameCase) {
        registerModifiedProperty("itemSnameCase");
        _itemSnameCase = itemSnameCase;
    }

    /**
     * [get] ITEMCD_WH: {NotNull, varchar(30)} <br>
     * 銘柄CD（現在）
     * @return The value of the column 'ITEMCD_WH'. (basically NotNull if selected: for the constraint)
     */
    public String getItemcdWh() {
        checkSpecifiedProperty("itemcdWh");
        return convertEmptyToNull(_itemcdWh);
    }

    /**
     * [set] ITEMCD_WH: {NotNull, varchar(30)} <br>
     * 銘柄CD（現在）
     * @param itemcdWh The value of the column 'ITEMCD_WH'. (basically NotNull if update: for the constraint)
     */
    public void setItemcdWh(String itemcdWh) {
        registerModifiedProperty("itemcdWh");
        _itemcdWh = itemcdWh;
    }

    /**
     * [get] ITEM_SNAME_WH: {NotNull, varchar(60)} <br>
     * 銘柄名称（現在）
     * @return The value of the column 'ITEM_SNAME_WH'. (basically NotNull if selected: for the constraint)
     */
    public String getItemSnameWh() {
        checkSpecifiedProperty("itemSnameWh");
        return convertEmptyToNull(_itemSnameWh);
    }

    /**
     * [set] ITEM_SNAME_WH: {NotNull, varchar(60)} <br>
     * 銘柄名称（現在）
     * @param itemSnameWh The value of the column 'ITEM_SNAME_WH'. (basically NotNull if update: for the constraint)
     */
    public void setItemSnameWh(String itemSnameWh) {
        registerModifiedProperty("itemSnameWh");
        _itemSnameWh = itemSnameWh;
    }

    /**
     * [get] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RCVKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {NotNull, decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RCVKEY'. (basically NotNull if update: for the constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] MACHINENO: {NotNull, varchar(30)} <br>
     * 号機
     * @return The value of the column 'MACHINENO'. (basically NotNull if selected: for the constraint)
     */
    public String getMachineno() {
        checkSpecifiedProperty("machineno");
        return convertEmptyToNull(_machineno);
    }

    /**
     * [set] MACHINENO: {NotNull, varchar(30)} <br>
     * 号機
     * @param machineno The value of the column 'MACHINENO'. (basically NotNull if update: for the constraint)
     */
    public void setMachineno(String machineno) {
        registerModifiedProperty("machineno");
        _machineno = machineno;
    }

    /**
     * [get] CREATENO: {NotNull, varchar(30)} <br>
     * 生出番号
     * @return The value of the column 'CREATENO'. (basically NotNull if selected: for the constraint)
     */
    public String getCreateno() {
        checkSpecifiedProperty("createno");
        return convertEmptyToNull(_createno);
    }

    /**
     * [set] CREATENO: {NotNull, varchar(30)} <br>
     * 生出番号
     * @param createno The value of the column 'CREATENO'. (basically NotNull if update: for the constraint)
     */
    public void setCreateno(String createno) {
        registerModifiedProperty("createno");
        _createno = createno;
    }

    /**
     * [get] LIMITDATENOW: {NotNull, varchar(8)} <br>
     * 製造年月日（現在）
     * @return The value of the column 'LIMITDATENOW'. (basically NotNull if selected: for the constraint)
     */
    public String getLimitdatenow() {
        checkSpecifiedProperty("limitdatenow");
        return convertEmptyToNull(_limitdatenow);
    }

    /**
     * [set] LIMITDATENOW: {NotNull, varchar(8)} <br>
     * 製造年月日（現在）
     * @param limitdatenow The value of the column 'LIMITDATENOW'. (basically NotNull if update: for the constraint)
     */
    public void setLimitdatenow(String limitdatenow) {
        registerModifiedProperty("limitdatenow");
        _limitdatenow = limitdatenow;
    }

    /**
     * [get] DESIGNCD_CASE: {NotNull, varchar(30)} <br>
     * デザイン区分（シンボル）
     * @return The value of the column 'DESIGNCD_CASE'. (basically NotNull if selected: for the constraint)
     */
    public String getDesigncdCase() {
        checkSpecifiedProperty("designcdCase");
        return convertEmptyToNull(_designcdCase);
    }

    /**
     * [set] DESIGNCD_CASE: {NotNull, varchar(30)} <br>
     * デザイン区分（シンボル）
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (basically NotNull if update: for the constraint)
     */
    public void setDesigncdCase(String designcdCase) {
        registerModifiedProperty("designcdCase");
        _designcdCase = designcdCase;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] MANUFACTURECD: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'MANUFACTURECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManufacturecd() {
        checkSpecifiedProperty("manufacturecd");
        return convertEmptyToNull(_manufacturecd);
    }

    /**
     * [set] MANUFACTURECD: {varchar(60)} <br>
     * 製造記号
     * @param manufacturecd The value of the column 'MANUFACTURECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManufacturecd(String manufacturecd) {
        registerModifiedProperty("manufacturecd");
        _manufacturecd = manufacturecd;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * 在庫区分
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @return The value of the column 'CASECREATETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasecreatetype() {
        checkSpecifiedProperty("casecreatetype");
        return convertEmptyToNull(_casecreatetype);
    }

    /**
     * [set] CASECREATETYPE: {varchar(30)} <br>
     * ケース作成区分
     * @param casecreatetype The value of the column 'CASECREATETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecreatetype(String casecreatetype) {
        registerModifiedProperty("casecreatetype");
        _casecreatetype = casecreatetype;
    }

    /**
     * [get] CASECREATETYPE_NM: {varchar(60)} <br>
     * ケース作成区分名称
     * @return The value of the column 'CASECREATETYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasecreatetypeNm() {
        checkSpecifiedProperty("casecreatetypeNm");
        return convertEmptyToNull(_casecreatetypeNm);
    }

    /**
     * [set] CASECREATETYPE_NM: {varchar(60)} <br>
     * ケース作成区分名称
     * @param casecreatetypeNm The value of the column 'CASECREATETYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecreatetypeNm(String casecreatetypeNm) {
        registerModifiedProperty("casecreatetypeNm");
        _casecreatetypeNm = casecreatetypeNm;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'ARRIVALPORTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArrivalportdate() {
        checkSpecifiedProperty("arrivalportdate");
        return convertEmptyToNull(_arrivalportdate);
    }

    /**
     * [set] ARRIVALPORTDATE: {varchar(8)} <br>
     * 入港日
     * @param arrivalportdate The value of the column 'ARRIVALPORTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArrivalportdate(String arrivalportdate) {
        registerModifiedProperty("arrivalportdate");
        _arrivalportdate = arrivalportdate;
    }

    /**
     * [get] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @return The value of the column 'SHIPNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipname() {
        checkSpecifiedProperty("shipname");
        return convertEmptyToNull(_shipname);
    }

    /**
     * [set] SHIPNAME: {varchar(100)} <br>
     * 船名
     * @param shipname The value of the column 'SHIPNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipname(String shipname) {
        registerModifiedProperty("shipname");
        _shipname = shipname;
    }

    /**
     * [get] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'INITNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInitnum() {
        checkSpecifiedProperty("initnum");
        return _initnum;
    }

    /**
     * [set] INITNUM: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'INITNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitnum(Long initnum) {
        registerModifiedProperty("initnum");
        _initnum = initnum;
    }

    /**
     * [get] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMixedflg() {
        checkSpecifiedProperty("mixedflg");
        return convertEmptyToNull(_mixedflg);
    }

    /**
     * [set] MIXEDFLG: {char(1)} <br>
     * 開封フラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMixedflg(String mixedflg) {
        registerModifiedProperty("mixedflg");
        _mixedflg = mixedflg;
    }

    /**
     * [get] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @return The value of the column 'LENDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLendflg() {
        checkSpecifiedProperty("lendflg");
        return convertEmptyToNull(_lendflg);
    }

    /**
     * [set] LENDFLG: {char(1)} <br>
     * 融通フラグ
     * @param lendflg The value of the column 'LENDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLendflg(String lendflg) {
        registerModifiedProperty("lendflg");
        _lendflg = lendflg;
    }

    /**
     * [get] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @return The value of the column 'LOCGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocgroup() {
        checkSpecifiedProperty("locgroup");
        return convertEmptyToNull(_locgroup);
    }

    /**
     * [set] LOCGROUP: {varchar(30)} <br>
     * ロケグループ
     * @param locgroup The value of the column 'LOCGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocgroup(String locgroup) {
        registerModifiedProperty("locgroup");
        _locgroup = locgroup;
    }

    /**
     * [get] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @return The value of the column 'LOCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoccd() {
        checkSpecifiedProperty("loccd");
        return convertEmptyToNull(_loccd);
    }

    /**
     * [set] LOCCD: {varchar(30)} <br>
     * ロケCD
     * @param loccd The value of the column 'LOCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoccd(String loccd) {
        registerModifiedProperty("loccd");
        _loccd = loccd;
    }

    /**
     * [get] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @return The value of the column 'SHIPDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipdate() {
        checkSpecifiedProperty("shipdate");
        return convertEmptyToNull(_shipdate);
    }

    /**
     * [set] SHIPDATE: {varchar(8)} <br>
     * 出庫日
     * @param shipdate The value of the column 'SHIPDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipdate(String shipdate) {
        registerModifiedProperty("shipdate");
        _shipdate = shipdate;
    }

    /**
     * [get] CURRENT_LOCATION_CD: {varchar(30)} <br>
     * 現在地CD
     * @return The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrentLocationCd() {
        checkSpecifiedProperty("currentLocationCd");
        return convertEmptyToNull(_currentLocationCd);
    }

    /**
     * [set] CURRENT_LOCATION_CD: {varchar(30)} <br>
     * 現在地CD
     * @param currentLocationCd The value of the column 'CURRENT_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrentLocationCd(String currentLocationCd) {
        registerModifiedProperty("currentLocationCd");
        _currentLocationCd = currentLocationCd;
    }

    /**
     * [get] CURRENT_LOCATION_SNAME: {varchar(100)} <br>
     * 現在地名称
     * @return The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCurrentLocationSname() {
        checkSpecifiedProperty("currentLocationSname");
        return convertEmptyToNull(_currentLocationSname);
    }

    /**
     * [set] CURRENT_LOCATION_SNAME: {varchar(100)} <br>
     * 現在地名称
     * @param currentLocationSname The value of the column 'CURRENT_LOCATION_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCurrentLocationSname(String currentLocationSname) {
        registerModifiedProperty("currentLocationSname");
        _currentLocationSname = currentLocationSname;
    }

    /**
     * [get] ADDDATETIME: {datetime2(26, 6)} <br>
     * 情報作成日
     * @return The value of the column 'ADDDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAdddatetime() {
        checkSpecifiedProperty("adddatetime");
        return _adddatetime;
    }

    /**
     * [set] ADDDATETIME: {datetime2(26, 6)} <br>
     * 情報作成日
     * @param adddatetime The value of the column 'ADDDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdddatetime(java.sql.Timestamp adddatetime) {
        registerModifiedProperty("adddatetime");
        _adddatetime = adddatetime;
    }

    /**
     * [get] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @return The value of the column 'TRACETYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTracetype() {
        checkSpecifiedProperty("tracetype");
        return convertEmptyToNull(_tracetype);
    }

    /**
     * [set] TRACETYPE: {varchar(30)} <br>
     * 追跡区分
     * @param tracetype The value of the column 'TRACETYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracetype(String tracetype) {
        registerModifiedProperty("tracetype");
        _tracetype = tracetype;
    }

    /**
     * [get] OTHERCD1: {varchar(60)} <br>
     * 追跡区分名称
     * @return The value of the column 'OTHERCD1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd1() {
        checkSpecifiedProperty("othercd1");
        return convertEmptyToNull(_othercd1);
    }

    /**
     * [set] OTHERCD1: {varchar(60)} <br>
     * 追跡区分名称
     * @param othercd1 The value of the column 'OTHERCD1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd1(String othercd1) {
        registerModifiedProperty("othercd1");
        _othercd1 = othercd1;
    }

    /**
     * [get] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @return The value of the column 'EXAMSTS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getExamsts() {
        checkSpecifiedProperty("examsts");
        return _examsts;
    }

    /**
     * [set] EXAMSTS: {bigint(19)} <br>
     * 検査区分
     * @param examsts The value of the column 'EXAMSTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExamsts(Long examsts) {
        registerModifiedProperty("examsts");
        _examsts = examsts;
    }

    /**
     * [get] CASEINNUMBOWL: {bigint(19)} <br>
     * ケース内数量（カートン）
     * @return The value of the column 'CASEINNUMBOWL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCaseinnumbowl() {
        checkSpecifiedProperty("caseinnumbowl");
        return _caseinnumbowl;
    }

    /**
     * [set] CASEINNUMBOWL: {bigint(19)} <br>
     * ケース内数量（カートン）
     * @param caseinnumbowl The value of the column 'CASEINNUMBOWL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseinnumbowl(Long caseinnumbowl) {
        registerModifiedProperty("caseinnumbowl");
        _caseinnumbowl = caseinnumbowl;
    }

    /**
     * [get] SHIPNUMBOWL: {bigint(19)} <br>
     * 出庫数量（カートン）
     * @return The value of the column 'SHIPNUMBOWL'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShipnumbowl() {
        checkSpecifiedProperty("shipnumbowl");
        return _shipnumbowl;
    }

    /**
     * [set] SHIPNUMBOWL: {bigint(19)} <br>
     * 出庫数量（カートン）
     * @param shipnumbowl The value of the column 'SHIPNUMBOWL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipnumbowl(Long shipnumbowl) {
        registerModifiedProperty("shipnumbowl");
        _shipnumbowl = shipnumbowl;
    }

    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * 保税管理番号
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @return The value of the column 'TOKUHANCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTokuhancd() {
        checkSpecifiedProperty("tokuhancd");
        return convertEmptyToNull(_tokuhancd);
    }

    /**
     * [set] TOKUHANCD: {varchar(100)} <br>
     * 特販業者CD
     * @param tokuhancd The value of the column 'TOKUHANCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTokuhancd(String tokuhancd) {
        registerModifiedProperty("tokuhancd");
        _tokuhancd = tokuhancd;
    }

    /**
     * [get] TOKUHAN_NM: {varchar(60)} <br>
     * 特販業者名称
     * @return The value of the column 'TOKUHAN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTokuhanNm() {
        checkSpecifiedProperty("tokuhanNm");
        return convertEmptyToNull(_tokuhanNm);
    }

    /**
     * [set] TOKUHAN_NM: {varchar(60)} <br>
     * 特販業者名称
     * @param tokuhanNm The value of the column 'TOKUHAN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTokuhanNm(String tokuhanNm) {
        registerModifiedProperty("tokuhanNm");
        _tokuhanNm = tokuhanNm;
    }

    /**
     * [get] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @return The value of the column 'MAKERCASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakercaseno() {
        checkSpecifiedProperty("makercaseno");
        return convertEmptyToNull(_makercaseno);
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * メーカーケースCD
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakercaseno(String makercaseno) {
        registerModifiedProperty("makercaseno");
        _makercaseno = makercaseno;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo
     * @return The value of the column 'CASEITFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseitfno() {
        checkSpecifiedProperty("caseitfno");
        return convertEmptyToNull(_caseitfno);
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo
     * @param caseitfno The value of the column 'CASEITFNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseitfno(String caseitfno) {
        registerModifiedProperty("caseitfno");
        _caseitfno = caseitfno;
    }

    /**
     * [get] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @return The value of the column 'CASEBARCODEVALIANT'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasebarcodevaliant() {
        checkSpecifiedProperty("casebarcodevaliant");
        return convertEmptyToNull(_casebarcodevaliant);
    }

    /**
     * [set] CASEBARCODEVALIANT: {varchar(30)} <br>
     * Barcode Valiant
     * @param casebarcodevaliant The value of the column 'CASEBARCODEVALIANT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasebarcodevaliant(String casebarcodevaliant) {
        registerModifiedProperty("casebarcodevaliant");
        _casebarcodevaliant = casebarcodevaliant;
    }

    /**
     * [get] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @return The value of the column 'CASELOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaselot4() {
        checkSpecifiedProperty("caselot4");
        return convertEmptyToNull(_caselot4);
    }

    /**
     * [set] CASELOT4: {varchar(30)} <br>
     * 実製造年月日
     * @param caselot4 The value of the column 'CASELOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaselot4(String caselot4) {
        registerModifiedProperty("caselot4");
        _caselot4 = caselot4;
    }

    /**
     * [get] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @return The value of the column 'CASECENTERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasecenterno() {
        checkSpecifiedProperty("casecenterno");
        return convertEmptyToNull(_casecenterno);
    }

    /**
     * [set] CASECENTERNO: {varchar(30)} <br>
     * 拠点No.
     * @param casecenterno The value of the column 'CASECENTERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecenterno(String casecenterno) {
        registerModifiedProperty("casecenterno");
        _casecenterno = casecenterno;
    }

    /**
     * [get] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo
     * @return The value of the column 'CASEPACKNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasepackno() {
        checkSpecifiedProperty("casepackno");
        return convertEmptyToNull(_casepackno);
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo
     * @param casepackno The value of the column 'CASEPACKNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasepackno(String casepackno) {
        registerModifiedProperty("casepackno");
        _casepackno = casepackno;
    }

    /**
     * [get] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @return The value of the column 'CASEPACKTIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasepacktime() {
        checkSpecifiedProperty("casepacktime");
        return convertEmptyToNull(_casepacktime);
    }

    /**
     * [set] CASEPACKTIME: {varchar(30)} <br>
     * ケースパッキング時間
     * @param casepacktime The value of the column 'CASEPACKTIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasepacktime(String casepacktime) {
        registerModifiedProperty("casepacktime");
        _casepacktime = casepacktime;
    }

    /**
     * [get] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @return The value of the column 'SENDER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getSenderLocation() {
        checkSpecifiedProperty("senderLocation");
        return convertEmptyToNull(_senderLocation);
    }

    /**
     * [set] SENDER_LOCATION: {varchar(30)} <br>
     * 送信ロケーション
     * @param senderLocation The value of the column 'SENDER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSenderLocation(String senderLocation) {
        registerModifiedProperty("senderLocation");
        _senderLocation = senderLocation;
    }

    /**
     * [get] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @return The value of the column 'RECEIVER_LOCATION'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiverLocation() {
        checkSpecifiedProperty("receiverLocation");
        return convertEmptyToNull(_receiverLocation);
    }

    /**
     * [set] RECEIVER_LOCATION: {varchar(30)} <br>
     * 受信ロケーション
     * @param receiverLocation The value of the column 'RECEIVER_LOCATION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiverLocation(String receiverLocation) {
        registerModifiedProperty("receiverLocation");
        _receiverLocation = receiverLocation;
    }

    /**
     * [get] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @return The value of the column 'SHIPMENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentId() {
        checkSpecifiedProperty("shipmentId");
        return convertEmptyToNull(_shipmentId);
    }

    /**
     * [set] SHIPMENT_ID: {varchar(30)} <br>
     * 送信ID
     * @param shipmentId The value of the column 'SHIPMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentId(String shipmentId) {
        registerModifiedProperty("shipmentId");
        _shipmentId = shipmentId;
    }

    /**
     * [get] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @return The value of the column 'SHIPMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipmentDate() {
        checkSpecifiedProperty("shipmentDate");
        return convertEmptyToNull(_shipmentDate);
    }

    /**
     * [set] SHIPMENT_DATE: {varchar(30)} <br>
     * 送信日
     * @param shipmentDate The value of the column 'SHIPMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipmentDate(String shipmentDate) {
        registerModifiedProperty("shipmentDate");
        _shipmentDate = shipmentDate;
    }

    /**
     * [get] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @return The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberOfPallets() {
        checkSpecifiedProperty("numberOfPallets");
        return convertEmptyToNull(_numberOfPallets);
    }

    /**
     * [set] NUMBER_OF_PALLETS: {varchar(30)} <br>
     * パレット番号
     * @param numberOfPallets The value of the column 'NUMBER_OF_PALLETS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberOfPallets(String numberOfPallets) {
        registerModifiedProperty("numberOfPallets");
        _numberOfPallets = numberOfPallets;
    }

    /**
     * [get] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @return The value of the column 'CARRIERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierno() {
        checkSpecifiedProperty("carrierno");
        return convertEmptyToNull(_carrierno);
    }

    /**
     * [set] CARRIERNO: {varchar(30)} <br>
     * コンテナNo
     * @param carrierno The value of the column 'CARRIERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierno(String carrierno) {
        registerModifiedProperty("carrierno");
        _carrierno = carrierno;
    }

    /**
     * [get] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @return The value of the column 'TKHNORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTkhnorderno() {
        checkSpecifiedProperty("tkhnorderno");
        return convertEmptyToNull(_tkhnorderno);
    }

    /**
     * [set] TKHNORDERNO: {varchar(30)} <br>
     * オーダーNo
     * @param tkhnorderno The value of the column 'TKHNORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTkhnorderno(String tkhnorderno) {
        registerModifiedProperty("tkhnorderno");
        _tkhnorderno = tkhnorderno;
    }

    /**
     * [get] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @return The value of the column 'SRCCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSrccd() {
        checkSpecifiedProperty("srccd");
        return convertEmptyToNull(_srccd);
    }

    /**
     * [set] SRCCD: {varchar(30)} <br>
     * SRC_CD
     * @param srccd The value of the column 'SRCCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSrccd(String srccd) {
        registerModifiedProperty("srccd");
        _srccd = srccd;
    }

    /**
     * [get] BLNO: {varchar(60)} <br>
     * BLNo
     * @return The value of the column 'BLNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getBlno() {
        checkSpecifiedProperty("blno");
        return convertEmptyToNull(_blno);
    }

    /**
     * [set] BLNO: {varchar(60)} <br>
     * BLNo
     * @param blno The value of the column 'BLNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlno(String blno) {
        registerModifiedProperty("blno");
        _blno = blno;
    }

    /**
     * [get] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @return The value of the column 'INVOICENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceno() {
        checkSpecifiedProperty("invoiceno");
        return convertEmptyToNull(_invoiceno);
    }

    /**
     * [set] INVOICENO: {varchar(60)} <br>
     * InvoiceNo
     * @param invoiceno The value of the column 'INVOICENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceno(String invoiceno) {
        registerModifiedProperty("invoiceno");
        _invoiceno = invoiceno;
    }

    /**
     * [get] SSCC: {varchar(30)} <br>
     * SSCC
     * @return The value of the column 'SSCC'. (NullAllowed even if selected: for no constraint)
     */
    public String getSscc() {
        checkSpecifiedProperty("sscc");
        return convertEmptyToNull(_sscc);
    }

    /**
     * [set] SSCC: {varchar(30)} <br>
     * SSCC
     * @param sscc The value of the column 'SSCC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSscc(String sscc) {
        registerModifiedProperty("sscc");
        _sscc = sscc;
    }

    /**
     * [get] CASENO: {varchar(30)} <br>
     * ケース番号
     * @return The value of the column 'CASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseno() {
        checkSpecifiedProperty("caseno");
        return convertEmptyToNull(_caseno);
    }

    /**
     * [set] CASENO: {varchar(30)} <br>
     * ケース番号
     * @param caseno The value of the column 'CASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseno(String caseno) {
        registerModifiedProperty("caseno");
        _caseno = caseno;
    }

    /**
     * [get] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @return The value of the column 'INV_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInvNum() {
        checkSpecifiedProperty("invNum");
        return _invNum;
    }

    /**
     * [set] INV_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（保管場）
     * @param invNum The value of the column 'INV_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvNum(Long invNum) {
        registerModifiedProperty("invNum");
        _invNum = invNum;
    }

    /**
     * [get] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @return The value of the column 'SORT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSortNum() {
        checkSpecifiedProperty("sortNum");
        return _sortNum;
    }

    /**
     * [set] SORT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（仕分場）
     * @param sortNum The value of the column 'SORT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortNum(Long sortNum) {
        registerModifiedProperty("sortNum");
        _sortNum = sortNum;
    }

    /**
     * [get] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @return The value of the column 'ADOPT_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdoptNum() {
        checkSpecifiedProperty("adoptNum");
        return _adoptNum;
    }

    /**
     * [set] ADOPT_NUM: {bigint(19)} <br>
     * 倉庫内数量内訳（引取場）
     * @param adoptNum The value of the column 'ADOPT_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdoptNum(Long adoptNum) {
        registerModifiedProperty("adoptNum");
        _adoptNum = adoptNum;
    }

    /**
     * [get] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @return The value of the column 'SEND_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSendCd() {
        checkSpecifiedProperty("sendCd");
        return convertEmptyToNull(_sendCd);
    }

    /**
     * [set] SEND_CD: {varchar(30)} <br>
     * 送信CD
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendCd(String sendCd) {
        registerModifiedProperty("sendCd");
        _sendCd = sendCd;
    }

    /**
     * [get] SEND_FLG: {NotNull, char(1)} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {NotNull, char(1)} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
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
