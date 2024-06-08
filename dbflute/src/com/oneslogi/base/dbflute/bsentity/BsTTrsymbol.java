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
 * The entity of T_TRSYMBOL as TABLE. <br>
 * 段ボール情報
 * <pre>
 * [primary-key]
 *     TRSYMBOL_ID
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, PRODUCT_CD, ITEMCD, PRODUCT_CD_CASE, PRODUCT_CD_IN, LOT3, DESIGNCD_IN, DESIGNCD_CASE, LOT4, LOT1, LOT2, SYMBOLLINENO, OWNERCD, STOCK_TYPE_CD, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, DAMAGEFLG, RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, RCVLINENO, SENDRCVKEY, MAKERCASENO, SYMBOLSTS, SYMBOLADDFLG, PRINTEDFLG, SYMBOLSNDDATE, SYMBOLPASTDATE, SYMBOLPALLETONDATE, RECEIVEDATE, PALLET_ID, BASE_PALLET_ID, PARENTPALLETUPDDATE, PRINTINGDATE, LOCATION_ID, RESTQTY, RECEIVEDQTY, DISTRIBUTIONCD, TRANSPORTCD, ORDERNO, RCV_PALLET_ID, SYMBOLFACTORYCD, SYMBOLITEMCD, SYMBOLSKU, SYMBOLRECEIVECD, SYMBOLPRODUCTMARK, SYMBOLORDERNO, SYMBOLPRINTERNO, SYMBOLMAKENO, SYMBOLLOT4, SYMBOLMAKETIME, SYMBOLCIRCULATIONID, SYMBOLRCVKEY, SYMBOLLOT3, QRData, TREXAMRESULT_ID, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, DATETIME, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, MIXEDFLG, SHIPPEDFLG, CASECREATETYPE, CREATEDATETIME, InitNum, ParentCaseCd, TR_PICKLIST_ID, PicklistGNo, RecombDatetime, ReprintedFlg, TraceSts, CLIENT_ID, BATJPRODUCTIONYM, COMETODATE, RCVPALLETNO, TAXPALLETNO, SHTYPECD, CENTER_ID, RESTCTN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tCenterSymbolList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long trsymbolId = entity.getTrsymbolId();
 * Long casecd = entity.getCasecd();
 * String productCd = entity.getProductCd();
 * String itemcd = entity.getItemcd();
 * String productCdCase = entity.getProductCdCase();
 * String productCdIn = entity.getProductCdIn();
 * String lot3 = entity.getLot3();
 * String designcdIn = entity.getDesigncdIn();
 * String designcdCase = entity.getDesigncdCase();
 * String lot4 = entity.getLot4();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * Long symbollineno = entity.getSymbollineno();
 * String ownercd = entity.getOwnercd();
 * String stockTypeCd = entity.getStockTypeCd();
 * java.math.BigDecimal foreigncargoflg = entity.getForeigncargoflg();
 * java.math.BigDecimal customsreleaseflg = entity.getCustomsreleaseflg();
 * java.math.BigDecimal damageflg = entity.getDamageflg();
 * Long receivePlanHId = entity.getReceivePlanHId();
 * java.math.BigDecimal receivePlanBId = entity.getReceivePlanBId();
 * Long rcvlineno = entity.getRcvlineno();
 * java.math.BigDecimal sendrcvkey = entity.getSendrcvkey();
 * String makercaseno = entity.getMakercaseno();
 * String symbolsts = entity.getSymbolsts();
 * String symboladdflg = entity.getSymboladdflg();
 * String printedflg = entity.getPrintedflg();
 * String symbolsnddate = entity.getSymbolsnddate();
 * String symbolpastdate = entity.getSymbolpastdate();
 * String symbolpalletondate = entity.getSymbolpalletondate();
 * String receivedate = entity.getReceivedate();
 * Long palletId = entity.getPalletId();
 * java.math.BigDecimal basePalletId = entity.getBasePalletId();
 * java.sql.Timestamp parentpalletupddate = entity.getParentpalletupddate();
 * String printingdate = entity.getPrintingdate();
 * Long locationId = entity.getLocationId();
 * java.math.BigDecimal restqty = entity.getRestqty();
 * java.math.BigDecimal receivedqty = entity.getReceivedqty();
 * String distributioncd = entity.getDistributioncd();
 * String transportcd = entity.getTransportcd();
 * String orderno = entity.getOrderno();
 * Long rcvPalletId = entity.getRcvPalletId();
 * String symbolfactorycd = entity.getSymbolfactorycd();
 * String symbolitemcd = entity.getSymbolitemcd();
 * String symbolsku = entity.getSymbolsku();
 * String symbolreceivecd = entity.getSymbolreceivecd();
 * String symbolproductmark = entity.getSymbolproductmark();
 * String symbolorderno = entity.getSymbolorderno();
 * String symbolprinterno = entity.getSymbolprinterno();
 * String symbolmakeno = entity.getSymbolmakeno();
 * String symbollot4 = entity.getSymbollot4();
 * String symbolmaketime = entity.getSymbolmaketime();
 * String symbolcirculationid = entity.getSymbolcirculationid();
 * Long symbolrcvkey = entity.getSymbolrcvkey();
 * String symbollot3 = entity.getSymbollot3();
 * String qrdata = entity.getQrdata();
 * Long trexamresultId = entity.getTrexamresultId();
 * String caseitfno = entity.getCaseitfno();
 * String casebarcodevaliant = entity.getCasebarcodevaliant();
 * String caselot4 = entity.getCaselot4();
 * java.sql.Timestamp datetime = entity.getDatetime();
 * String casecenterno = entity.getCasecenterno();
 * String casepackno = entity.getCasepackno();
 * String casepacktime = entity.getCasepacktime();
 * String casebarcode = entity.getCasebarcode();
 * String mixedflg = entity.getMixedflg();
 * String shippedflg = entity.getShippedflg();
 * String casecreatetype = entity.getCasecreatetype();
 * java.sql.Timestamp createdatetime = entity.getCreatedatetime();
 * Long initnum = entity.getInitnum();
 * Long parentcasecd = entity.getParentcasecd();
 * Long trPicklistId = entity.getTrPicklistId();
 * Long picklistgno = entity.getPicklistgno();
 * java.sql.Timestamp recombdatetime = entity.getRecombdatetime();
 * String reprintedflg = entity.getReprintedflg();
 * Long tracests = entity.getTracests();
 * Long clientId = entity.getClientId();
 * String batjproductionym = entity.getBatjproductionym();
 * String cometodate = entity.getCometodate();
 * String rcvpalletno = entity.getRcvpalletno();
 * String taxpalletno = entity.getTaxpalletno();
 * String shtypecd = entity.getShtypecd();
 * Long centerId = entity.getCenterId();
 * java.math.BigDecimal restctn = entity.getRestctn();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrsymbolId(trsymbolId);
 * entity.setCasecd(casecd);
 * entity.setProductCd(productCd);
 * entity.setItemcd(itemcd);
 * entity.setProductCdCase(productCdCase);
 * entity.setProductCdIn(productCdIn);
 * entity.setLot3(lot3);
 * entity.setDesigncdIn(designcdIn);
 * entity.setDesigncdCase(designcdCase);
 * entity.setLot4(lot4);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setSymbollineno(symbollineno);
 * entity.setOwnercd(ownercd);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setCustomsreleaseflg(customsreleaseflg);
 * entity.setDamageflg(damageflg);
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setRcvlineno(rcvlineno);
 * entity.setSendrcvkey(sendrcvkey);
 * entity.setMakercaseno(makercaseno);
 * entity.setSymbolsts(symbolsts);
 * entity.setSymboladdflg(symboladdflg);
 * entity.setPrintedflg(printedflg);
 * entity.setSymbolsnddate(symbolsnddate);
 * entity.setSymbolpastdate(symbolpastdate);
 * entity.setSymbolpalletondate(symbolpalletondate);
 * entity.setReceivedate(receivedate);
 * entity.setPalletId(palletId);
 * entity.setBasePalletId(basePalletId);
 * entity.setParentpalletupddate(parentpalletupddate);
 * entity.setPrintingdate(printingdate);
 * entity.setLocationId(locationId);
 * entity.setRestqty(restqty);
 * entity.setReceivedqty(receivedqty);
 * entity.setDistributioncd(distributioncd);
 * entity.setTransportcd(transportcd);
 * entity.setOrderno(orderno);
 * entity.setRcvPalletId(rcvPalletId);
 * entity.setSymbolfactorycd(symbolfactorycd);
 * entity.setSymbolitemcd(symbolitemcd);
 * entity.setSymbolsku(symbolsku);
 * entity.setSymbolreceivecd(symbolreceivecd);
 * entity.setSymbolproductmark(symbolproductmark);
 * entity.setSymbolorderno(symbolorderno);
 * entity.setSymbolprinterno(symbolprinterno);
 * entity.setSymbolmakeno(symbolmakeno);
 * entity.setSymbollot4(symbollot4);
 * entity.setSymbolmaketime(symbolmaketime);
 * entity.setSymbolcirculationid(symbolcirculationid);
 * entity.setSymbolrcvkey(symbolrcvkey);
 * entity.setSymbollot3(symbollot3);
 * entity.setQrdata(qrdata);
 * entity.setTrexamresultId(trexamresultId);
 * entity.setCaseitfno(caseitfno);
 * entity.setCasebarcodevaliant(casebarcodevaliant);
 * entity.setCaselot4(caselot4);
 * entity.setDatetime(datetime);
 * entity.setCasecenterno(casecenterno);
 * entity.setCasepackno(casepackno);
 * entity.setCasepacktime(casepacktime);
 * entity.setCasebarcode(casebarcode);
 * entity.setMixedflg(mixedflg);
 * entity.setShippedflg(shippedflg);
 * entity.setCasecreatetype(casecreatetype);
 * entity.setCreatedatetime(createdatetime);
 * entity.setInitnum(initnum);
 * entity.setParentcasecd(parentcasecd);
 * entity.setTrPicklistId(trPicklistId);
 * entity.setPicklistgno(picklistgno);
 * entity.setRecombdatetime(recombdatetime);
 * entity.setReprintedflg(reprintedflg);
 * entity.setTracests(tracests);
 * entity.setClientId(clientId);
 * entity.setBatjproductionym(batjproductionym);
 * entity.setCometodate(cometodate);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setTaxpalletno(taxpalletno);
 * entity.setShtypecd(shtypecd);
 * entity.setCenterId(centerId);
 * entity.setRestctn(restctn);
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
public abstract class BsTTrsymbol extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} */
    protected Long _trsymbolId;

    /** CASECD: {NotNull, bigint(19)} */
    protected Long _casecd;

    /** PRODUCT_CD: {IX, varchar(30)} */
    protected String _productCd;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** PRODUCT_CD_CASE: {IX+, varchar(30)} */
    protected String _productCdCase;

    /** PRODUCT_CD_IN: {varchar(30)} */
    protected String _productCdIn;

    /** LOT3: {varchar(30)} */
    protected String _lot3;

    /** DESIGNCD_IN: {varchar(30)} */
    protected String _designcdIn;

    /** DESIGNCD_CASE: {varchar(30)} */
    protected String _designcdCase;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT1: {varchar(30)} */
    protected String _lot1;

    /** LOT2: {varchar(30)} */
    protected String _lot2;

    /** SYMBOLLINENO: {bigint(19)} */
    protected Long _symbollineno;

    /** OWNERCD: {varchar(30)} */
    protected String _ownercd;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** FOREIGNCARGOFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _foreigncargoflg;

    /** CUSTOMSRELEASEFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _customsreleaseflg;

    /** DAMAGEFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _damageflg;

    /** RECEIVE_PLAN_H_ID: {IX, bigint(19)} */
    protected Long _receivePlanHId;

    /** RECEIVE_PLAN_B_ID: {decimal(16, 6)} */
    protected java.math.BigDecimal _receivePlanBId;

    /** RCVLINENO: {bigint(19)} */
    protected Long _rcvlineno;

    /** SENDRCVKEY: {IX, decimal(16, 6)} */
    protected java.math.BigDecimal _sendrcvkey;

    /** MAKERCASENO: {varchar(60)} */
    protected String _makercaseno;

    /** SYMBOLSTS: {NotNull, varchar(30)} */
    protected String _symbolsts;

    /** SYMBOLADDFLG: {NotNull, varchar(30)} */
    protected String _symboladdflg;

    /** PRINTEDFLG: {NotNull, char(1)} */
    protected String _printedflg;

    /** SYMBOLSNDDATE: {varchar(8)} */
    protected String _symbolsnddate;

    /** SYMBOLPASTDATE: {varchar(8)} */
    protected String _symbolpastdate;

    /** SYMBOLPALLETONDATE: {varchar(8)} */
    protected String _symbolpalletondate;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** PALLET_ID: {IX, bigint(19)} */
    protected Long _palletId;

    /** BASE_PALLET_ID: {decimal(16, 6)} */
    protected java.math.BigDecimal _basePalletId;

    /** PARENTPALLETUPDDATE: {datetime2(26, 6)} */
    protected java.sql.Timestamp _parentpalletupddate;

    /** PRINTINGDATE: {varchar(8)} */
    protected String _printingdate;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** RESTQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _restqty;

    /** RECEIVEDQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _receivedqty;

    /** DISTRIBUTIONCD: {varchar(30)} */
    protected String _distributioncd;

    /** TRANSPORTCD: {varchar(30)} */
    protected String _transportcd;

    /** ORDERNO: {varchar(30)} */
    protected String _orderno;

    /** RCV_PALLET_ID: {bigint(19)} */
    protected Long _rcvPalletId;

    /** SYMBOLFACTORYCD: {IX+, varchar(30)} */
    protected String _symbolfactorycd;

    /** SYMBOLITEMCD: {varchar(30)} */
    protected String _symbolitemcd;

    /** SYMBOLSKU: {varchar(30)} */
    protected String _symbolsku;

    /** SYMBOLRECEIVECD: {varchar(30)} */
    protected String _symbolreceivecd;

    /** SYMBOLPRODUCTMARK: {varchar(30)} */
    protected String _symbolproductmark;

    /** SYMBOLORDERNO: {varchar(30)} */
    protected String _symbolorderno;

    /** SYMBOLPRINTERNO: {varchar(30)} */
    protected String _symbolprinterno;

    /** SYMBOLMAKENO: {varchar(30)} */
    protected String _symbolmakeno;

    /** SYMBOLLOT4: {varchar(30)} */
    protected String _symbollot4;

    /** SYMBOLMAKETIME: {varchar(30)} */
    protected String _symbolmaketime;

    /** SYMBOLCIRCULATIONID: {varchar(30)} */
    protected String _symbolcirculationid;

    /** SYMBOLRCVKEY: {bigint(19)} */
    protected Long _symbolrcvkey;

    /** SYMBOLLOT3: {varchar(30)} */
    protected String _symbollot3;

    /** QRData: {varchar(255)} */
    protected String _qrdata;

    /** TREXAMRESULT_ID: {IX, bigint(19)} */
    protected Long _trexamresultId;

    /** CASEITFNO: {varchar(30)} */
    protected String _caseitfno;

    /** CASEBARCODEVALIANT: {varchar(30)} */
    protected String _casebarcodevaliant;

    /** CASELOT4: {varchar(30)} */
    protected String _caselot4;

    /** DATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _datetime;

    /** CASECENTERNO: {varchar(30)} */
    protected String _casecenterno;

    /** CASEPACKNO: {varchar(30)} */
    protected String _casepackno;

    /** CASEPACKTIME: {varchar(30)} */
    protected String _casepacktime;

    /** CASEBARCODE: {IX, varchar(60)} */
    protected String _casebarcode;

    /** MIXEDFLG: {char(1), default=[(0)]} */
    protected String _mixedflg;

    /** SHIPPEDFLG: {char(1), default=[(0)]} */
    protected String _shippedflg;

    /** CASECREATETYPE: {NotNull, varchar(30)} */
    protected String _casecreatetype;

    /** CREATEDATETIME: {datetime2(26, 6)} */
    protected java.sql.Timestamp _createdatetime;

    /** InitNum: {bigint(19)} */
    protected Long _initnum;

    /** ParentCaseCd: {bigint(19)} */
    protected Long _parentcasecd;

    /** TR_PICKLIST_ID: {bigint(19)} */
    protected Long _trPicklistId;

    /** PicklistGNo: {bigint(19)} */
    protected Long _picklistgno;

    /** RecombDatetime: {datetime2(26, 6)} */
    protected java.sql.Timestamp _recombdatetime;

    /** ReprintedFlg: {varchar(30)} */
    protected String _reprintedflg;

    /** TraceSts: {bigint(19)} */
    protected Long _tracests;

    /** CLIENT_ID: {NotNull, bigint(19)} */
    protected Long _clientId;

    /** BATJPRODUCTIONYM: {varchar(30)} */
    protected String _batjproductionym;

    /** COMETODATE: {varchar(8)} */
    protected String _cometodate;

    /** RCVPALLETNO: {varchar(30)} */
    protected String _rcvpalletno;

    /** TAXPALLETNO: {varchar(30)} */
    protected String _taxpalletno;

    /** SHTYPECD: {varchar(30)} */
    protected String _shtypecd;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** RESTCTN: {decimal(16, 6)} */
    protected java.math.BigDecimal _restctn;

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
        return "T_TRSYMBOL";
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
        if (_trsymbolId == null) { return false; }
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
    /** T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'. */
    protected List<TCenterSymbol> _tCenterSymbolList;

    /**
     * [get] T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * @return The entity list of referrer property 'TCenterSymbolList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TCenterSymbol> getTCenterSymbolList() {
        if (_tCenterSymbolList == null) { _tCenterSymbolList = newReferrerList(); }
        return _tCenterSymbolList;
    }

    /**
     * [set] T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * @param tCenterSymbolList The entity list of referrer property 'TCenterSymbolList'. (NullAllowed)
     */
    public void setTCenterSymbolList(List<TCenterSymbol> tCenterSymbolList) {
        _tCenterSymbolList = tCenterSymbolList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTTrsymbol) {
            BsTTrsymbol other = (BsTTrsymbol)obj;
            if (!xSV(_trsymbolId, other._trsymbolId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsymbolId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tCenterSymbolList != null) { for (TCenterSymbol et : _tCenterSymbolList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tCenterSymbolList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_casecd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_productCdCase));
        sb.append(dm).append(xfND(_productCdIn));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_designcdIn));
        sb.append(dm).append(xfND(_designcdCase));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_symbollineno));
        sb.append(dm).append(xfND(_ownercd));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_customsreleaseflg));
        sb.append(dm).append(xfND(_damageflg));
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_sendrcvkey));
        sb.append(dm).append(xfND(_makercaseno));
        sb.append(dm).append(xfND(_symbolsts));
        sb.append(dm).append(xfND(_symboladdflg));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_symbolsnddate));
        sb.append(dm).append(xfND(_symbolpastdate));
        sb.append(dm).append(xfND(_symbolpalletondate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_palletId));
        sb.append(dm).append(xfND(_basePalletId));
        sb.append(dm).append(xfND(_parentpalletupddate));
        sb.append(dm).append(xfND(_printingdate));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_restqty));
        sb.append(dm).append(xfND(_receivedqty));
        sb.append(dm).append(xfND(_distributioncd));
        sb.append(dm).append(xfND(_transportcd));
        sb.append(dm).append(xfND(_orderno));
        sb.append(dm).append(xfND(_rcvPalletId));
        sb.append(dm).append(xfND(_symbolfactorycd));
        sb.append(dm).append(xfND(_symbolitemcd));
        sb.append(dm).append(xfND(_symbolsku));
        sb.append(dm).append(xfND(_symbolreceivecd));
        sb.append(dm).append(xfND(_symbolproductmark));
        sb.append(dm).append(xfND(_symbolorderno));
        sb.append(dm).append(xfND(_symbolprinterno));
        sb.append(dm).append(xfND(_symbolmakeno));
        sb.append(dm).append(xfND(_symbollot4));
        sb.append(dm).append(xfND(_symbolmaketime));
        sb.append(dm).append(xfND(_symbolcirculationid));
        sb.append(dm).append(xfND(_symbolrcvkey));
        sb.append(dm).append(xfND(_symbollot3));
        sb.append(dm).append(xfND(_qrdata));
        sb.append(dm).append(xfND(_trexamresultId));
        sb.append(dm).append(xfND(_caseitfno));
        sb.append(dm).append(xfND(_casebarcodevaliant));
        sb.append(dm).append(xfND(_caselot4));
        sb.append(dm).append(xfND(_datetime));
        sb.append(dm).append(xfND(_casecenterno));
        sb.append(dm).append(xfND(_casepackno));
        sb.append(dm).append(xfND(_casepacktime));
        sb.append(dm).append(xfND(_casebarcode));
        sb.append(dm).append(xfND(_mixedflg));
        sb.append(dm).append(xfND(_shippedflg));
        sb.append(dm).append(xfND(_casecreatetype));
        sb.append(dm).append(xfND(_createdatetime));
        sb.append(dm).append(xfND(_initnum));
        sb.append(dm).append(xfND(_parentcasecd));
        sb.append(dm).append(xfND(_trPicklistId));
        sb.append(dm).append(xfND(_picklistgno));
        sb.append(dm).append(xfND(_recombdatetime));
        sb.append(dm).append(xfND(_reprintedflg));
        sb.append(dm).append(xfND(_tracests));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_batjproductionym));
        sb.append(dm).append(xfND(_cometodate));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_taxpalletno));
        sb.append(dm).append(xfND(_shtypecd));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_restctn));
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
        if (_tCenterSymbolList != null && !_tCenterSymbolList.isEmpty())
        { sb.append(dm).append("tCenterSymbolList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TTrsymbol clone() {
        return (TTrsymbol)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール情報ID
     * @return The value of the column 'TRSYMBOL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)} <br>
     * 段ボール情報ID
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] CASECD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @return The value of the column 'CASECD'. (basically NotNull if selected: for the constraint)
     */
    public Long getCasecd() {
        checkSpecifiedProperty("casecd");
        return _casecd;
    }

    /**
     * [set] CASECD: {NotNull, bigint(19)} <br>
     * ケースCD
     * @param casecd The value of the column 'CASECD'. (basically NotNull if update: for the constraint)
     */
    public void setCasecd(Long casecd) {
        registerModifiedProperty("casecd");
        _casecd = casecd;
    }

    /**
     * [get] PRODUCT_CD: {IX, varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {IX, varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] PRODUCT_CD_CASE: {IX+, varchar(30)} <br>
     * 銘柄CD(ケース)
     * @return The value of the column 'PRODUCT_CD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCdCase() {
        checkSpecifiedProperty("productCdCase");
        return convertEmptyToNull(_productCdCase);
    }

    /**
     * [set] PRODUCT_CD_CASE: {IX+, varchar(30)} <br>
     * 銘柄CD(ケース)
     * @param productCdCase The value of the column 'PRODUCT_CD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCdCase(String productCdCase) {
        registerModifiedProperty("productCdCase");
        _productCdCase = productCdCase;
    }

    /**
     * [get] PRODUCT_CD_IN: {varchar(30)} <br>
     * 銘柄CD(入庫時)
     * @return The value of the column 'PRODUCT_CD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCdIn() {
        checkSpecifiedProperty("productCdIn");
        return convertEmptyToNull(_productCdIn);
    }

    /**
     * [set] PRODUCT_CD_IN: {varchar(30)} <br>
     * 銘柄CD(入庫時)
     * @param productCdIn The value of the column 'PRODUCT_CD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCdIn(String productCdIn) {
        registerModifiedProperty("productCdIn");
        _productCdIn = productCdIn;
    }

    /**
     * [get] LOT3: {varchar(30)} <br>
     * デザイン区分
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(30)} <br>
     * デザイン区分
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分(入庫時)
     * @return The value of the column 'DESIGNCD_IN'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdIn() {
        checkSpecifiedProperty("designcdIn");
        return convertEmptyToNull(_designcdIn);
    }

    /**
     * [set] DESIGNCD_IN: {varchar(30)} <br>
     * デザイン区分(入庫時)
     * @param designcdIn The value of the column 'DESIGNCD_IN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdIn(String designcdIn) {
        registerModifiedProperty("designcdIn");
        _designcdIn = designcdIn;
    }

    /**
     * [get] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分(ケース)
     * @return The value of the column 'DESIGNCD_CASE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDesigncdCase() {
        checkSpecifiedProperty("designcdCase");
        return convertEmptyToNull(_designcdCase);
    }

    /**
     * [set] DESIGNCD_CASE: {varchar(30)} <br>
     * デザイン区分(ケース)
     * @param designcdCase The value of the column 'DESIGNCD_CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDesigncdCase(String designcdCase) {
        registerModifiedProperty("designcdCase");
        _designcdCase = designcdCase;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * 製造年月日
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] LOT1: {varchar(30)} <br>
     * 商社搬入番号
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(30)} <br>
     * 商社搬入番号
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(30)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(30)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] SYMBOLLINENO: {bigint(19)} <br>
     * 段ボール番号
     * @return The value of the column 'SYMBOLLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSymbollineno() {
        checkSpecifiedProperty("symbollineno");
        return _symbollineno;
    }

    /**
     * [set] SYMBOLLINENO: {bigint(19)} <br>
     * 段ボール番号
     * @param symbollineno The value of the column 'SYMBOLLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbollineno(Long symbollineno) {
        registerModifiedProperty("symbollineno");
        _symbollineno = symbollineno;
    }

    /**
     * [get] OWNERCD: {varchar(30)} <br>
     * 取引先（荷主）CD
     * @return The value of the column 'OWNERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnercd() {
        checkSpecifiedProperty("ownercd");
        return convertEmptyToNull(_ownercd);
    }

    /**
     * [set] OWNERCD: {varchar(30)} <br>
     * 取引先（荷主）CD
     * @param ownercd The value of the column 'OWNERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnercd(String ownercd) {
        registerModifiedProperty("ownercd");
        _ownercd = ownercd;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return _foreigncargoflg;
    }

    /**
     * [set] FOREIGNCARGOFLG: {decimal(16, 6)} <br>
     * 内貨・外貨区分
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(java.math.BigDecimal foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
    }

    /**
     * [get] CUSTOMSRELEASEFLG: {decimal(16, 6)} <br>
     * 通関済みフラグ
     * @return The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCustomsreleaseflg() {
        checkSpecifiedProperty("customsreleaseflg");
        return _customsreleaseflg;
    }

    /**
     * [set] CUSTOMSRELEASEFLG: {decimal(16, 6)} <br>
     * 通関済みフラグ
     * @param customsreleaseflg The value of the column 'CUSTOMSRELEASEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomsreleaseflg(java.math.BigDecimal customsreleaseflg) {
        registerModifiedProperty("customsreleaseflg");
        _customsreleaseflg = customsreleaseflg;
    }

    /**
     * [get] DAMAGEFLG: {decimal(16, 6)} <br>
     * 詰合せ状態
     * @return The value of the column 'DAMAGEFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDamageflg() {
        checkSpecifiedProperty("damageflg");
        return _damageflg;
    }

    /**
     * [set] DAMAGEFLG: {decimal(16, 6)} <br>
     * 詰合せ状態
     * @param damageflg The value of the column 'DAMAGEFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDamageflg(java.math.BigDecimal damageflg) {
        registerModifiedProperty("damageflg");
        _damageflg = damageflg;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, bigint(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {decimal(16, 6)} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(java.math.BigDecimal receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RCVLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RCVLINENO: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RCVLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] SENDRCVKEY: {IX, decimal(16, 6)} <br>
     * 送信入庫キー
     * @return The value of the column 'SENDRCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSendrcvkey() {
        checkSpecifiedProperty("sendrcvkey");
        return _sendrcvkey;
    }

    /**
     * [set] SENDRCVKEY: {IX, decimal(16, 6)} <br>
     * 送信入庫キー
     * @param sendrcvkey The value of the column 'SENDRCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSendrcvkey(java.math.BigDecimal sendrcvkey) {
        registerModifiedProperty("sendrcvkey");
        _sendrcvkey = sendrcvkey;
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
     * [get] SYMBOLSTS: {NotNull, varchar(30)} <br>
     * 段ボールステータス
     * @return The value of the column 'SYMBOLSTS'. (basically NotNull if selected: for the constraint)
     */
    public String getSymbolsts() {
        checkSpecifiedProperty("symbolsts");
        return convertEmptyToNull(_symbolsts);
    }

    /**
     * [set] SYMBOLSTS: {NotNull, varchar(30)} <br>
     * 段ボールステータス
     * @param symbolsts The value of the column 'SYMBOLSTS'. (basically NotNull if update: for the constraint)
     */
    public void setSymbolsts(String symbolsts) {
        registerModifiedProperty("symbolsts");
        _symbolsts = symbolsts;
    }

    /**
     * [get] SYMBOLADDFLG: {NotNull, varchar(30)} <br>
     * シンボル作成元フラグ
     * @return The value of the column 'SYMBOLADDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSymboladdflg() {
        checkSpecifiedProperty("symboladdflg");
        return convertEmptyToNull(_symboladdflg);
    }

    /**
     * [set] SYMBOLADDFLG: {NotNull, varchar(30)} <br>
     * シンボル作成元フラグ
     * @param symboladdflg The value of the column 'SYMBOLADDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setSymboladdflg(String symboladdflg) {
        registerModifiedProperty("symboladdflg");
        _symboladdflg = symboladdflg;
    }

    /**
     * [get] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @return The value of the column 'PRINTEDFLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {NotNull, char(1)} <br>
     * 印刷済フラグ
     * @param printedflg The value of the column 'PRINTEDFLG'. (basically NotNull if update: for the constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] SYMBOLSNDDATE: {varchar(8)} <br>
     * シンボル送信日
     * @return The value of the column 'SYMBOLSNDDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolsnddate() {
        checkSpecifiedProperty("symbolsnddate");
        return convertEmptyToNull(_symbolsnddate);
    }

    /**
     * [set] SYMBOLSNDDATE: {varchar(8)} <br>
     * シンボル送信日
     * @param symbolsnddate The value of the column 'SYMBOLSNDDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolsnddate(String symbolsnddate) {
        registerModifiedProperty("symbolsnddate");
        _symbolsnddate = symbolsnddate;
    }

    /**
     * [get] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @return The value of the column 'SYMBOLPASTDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolpastdate() {
        checkSpecifiedProperty("symbolpastdate");
        return convertEmptyToNull(_symbolpastdate);
    }

    /**
     * [set] SYMBOLPASTDATE: {varchar(8)} <br>
     * シンボル貼付日
     * @param symbolpastdate The value of the column 'SYMBOLPASTDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolpastdate(String symbolpastdate) {
        registerModifiedProperty("symbolpastdate");
        _symbolpastdate = symbolpastdate;
    }

    /**
     * [get] SYMBOLPALLETONDATE: {varchar(8)} <br>
     * パレタイザ投入日
     * @return The value of the column 'SYMBOLPALLETONDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolpalletondate() {
        checkSpecifiedProperty("symbolpalletondate");
        return convertEmptyToNull(_symbolpalletondate);
    }

    /**
     * [set] SYMBOLPALLETONDATE: {varchar(8)} <br>
     * パレタイザ投入日
     * @param symbolpalletondate The value of the column 'SYMBOLPALLETONDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolpalletondate(String symbolpalletondate) {
        registerModifiedProperty("symbolpalletondate");
        _symbolpalletondate = symbolpalletondate;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * 入庫年月日
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] PALLET_ID: {IX, bigint(19)} <br>
     * パレットはり紙情報ID
     * @return The value of the column 'PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPalletId() {
        checkSpecifiedProperty("palletId");
        return _palletId;
    }

    /**
     * [set] PALLET_ID: {IX, bigint(19)} <br>
     * パレットはり紙情報ID
     * @param palletId The value of the column 'PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletId(Long palletId) {
        registerModifiedProperty("palletId");
        _palletId = palletId;
    }

    /**
     * [get] BASE_PALLET_ID: {decimal(16, 6)} <br>
     * 親パレットはり紙情報ID
     * @return The value of the column 'BASE_PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBasePalletId() {
        checkSpecifiedProperty("basePalletId");
        return _basePalletId;
    }

    /**
     * [set] BASE_PALLET_ID: {decimal(16, 6)} <br>
     * 親パレットはり紙情報ID
     * @param basePalletId The value of the column 'BASE_PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBasePalletId(java.math.BigDecimal basePalletId) {
        registerModifiedProperty("basePalletId");
        _basePalletId = basePalletId;
    }

    /**
     * [get] PARENTPALLETUPDDATE: {datetime2(26, 6)} <br>
     * 親パレット管理番号更新日時
     * @return The value of the column 'PARENTPALLETUPDDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getParentpalletupddate() {
        checkSpecifiedProperty("parentpalletupddate");
        return _parentpalletupddate;
    }

    /**
     * [set] PARENTPALLETUPDDATE: {datetime2(26, 6)} <br>
     * 親パレット管理番号更新日時
     * @param parentpalletupddate The value of the column 'PARENTPALLETUPDDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentpalletupddate(java.sql.Timestamp parentpalletupddate) {
        registerModifiedProperty("parentpalletupddate");
        _parentpalletupddate = parentpalletupddate;
    }

    /**
     * [get] PRINTINGDATE: {varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PRINTINGDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintingdate() {
        checkSpecifiedProperty("printingdate");
        return convertEmptyToNull(_printingdate);
    }

    /**
     * [set] PRINTINGDATE: {varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PRINTINGDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintingdate(String printingdate) {
        registerModifiedProperty("printingdate");
        _printingdate = printingdate;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] RESTQTY: {decimal(16, 6)} <br>
     * 残数量（個装）
     * @return The value of the column 'RESTQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqty() {
        checkSpecifiedProperty("restqty");
        return _restqty;
    }

    /**
     * [set] RESTQTY: {decimal(16, 6)} <br>
     * 残数量（個装）
     * @param restqty The value of the column 'RESTQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        registerModifiedProperty("restqty");
        _restqty = restqty;
    }

    /**
     * [get] RECEIVEDQTY: {decimal(16, 6)} <br>
     * 入庫実績数量（個装）
     * @return The value of the column 'RECEIVEDQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceivedqty() {
        checkSpecifiedProperty("receivedqty");
        return _receivedqty;
    }

    /**
     * [set] RECEIVEDQTY: {decimal(16, 6)} <br>
     * 入庫実績数量（個装）
     * @param receivedqty The value of the column 'RECEIVEDQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty(java.math.BigDecimal receivedqty) {
        registerModifiedProperty("receivedqty");
        _receivedqty = receivedqty;
    }

    /**
     * [get] DISTRIBUTIONCD: {varchar(30)} <br>
     * 流通識別
     * @return The value of the column 'DISTRIBUTIONCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDistributioncd() {
        checkSpecifiedProperty("distributioncd");
        return convertEmptyToNull(_distributioncd);
    }

    /**
     * [set] DISTRIBUTIONCD: {varchar(30)} <br>
     * 流通識別
     * @param distributioncd The value of the column 'DISTRIBUTIONCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDistributioncd(String distributioncd) {
        registerModifiedProperty("distributioncd");
        _distributioncd = distributioncd;
    }

    /**
     * [get] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @return The value of the column 'TRANSPORTCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportcd() {
        checkSpecifiedProperty("transportcd");
        return convertEmptyToNull(_transportcd);
    }

    /**
     * [set] TRANSPORTCD: {varchar(30)} <br>
     * 輸送番号
     * @param transportcd The value of the column 'TRANSPORTCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportcd(String transportcd) {
        registerModifiedProperty("transportcd");
        _transportcd = transportcd;
    }

    /**
     * [get] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @return The value of the column 'ORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderno() {
        checkSpecifiedProperty("orderno");
        return convertEmptyToNull(_orderno);
    }

    /**
     * [set] ORDERNO: {varchar(30)} <br>
     * 発注番号
     * @param orderno The value of the column 'ORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderno(String orderno) {
        registerModifiedProperty("orderno");
        _orderno = orderno;
    }

    /**
     * [get] RCV_PALLET_ID: {bigint(19)} <br>
     * 入庫パレットID
     * @return The value of the column 'RCV_PALLET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvPalletId() {
        checkSpecifiedProperty("rcvPalletId");
        return _rcvPalletId;
    }

    /**
     * [set] RCV_PALLET_ID: {bigint(19)} <br>
     * 入庫パレットID
     * @param rcvPalletId The value of the column 'RCV_PALLET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvPalletId(Long rcvPalletId) {
        registerModifiedProperty("rcvPalletId");
        _rcvPalletId = rcvPalletId;
    }

    /**
     * [get] SYMBOLFACTORYCD: {IX+, varchar(30)} <br>
     * 二次元コードの工場コード
     * @return The value of the column 'SYMBOLFACTORYCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolfactorycd() {
        checkSpecifiedProperty("symbolfactorycd");
        return convertEmptyToNull(_symbolfactorycd);
    }

    /**
     * [set] SYMBOLFACTORYCD: {IX+, varchar(30)} <br>
     * 二次元コードの工場コード
     * @param symbolfactorycd The value of the column 'SYMBOLFACTORYCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolfactorycd(String symbolfactorycd) {
        registerModifiedProperty("symbolfactorycd");
        _symbolfactorycd = symbolfactorycd;
    }

    /**
     * [get] SYMBOLITEMCD: {varchar(30)} <br>
     * 二次元コードの銘柄コード
     * @return The value of the column 'SYMBOLITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolitemcd() {
        checkSpecifiedProperty("symbolitemcd");
        return convertEmptyToNull(_symbolitemcd);
    }

    /**
     * [set] SYMBOLITEMCD: {varchar(30)} <br>
     * 二次元コードの銘柄コード
     * @param symbolitemcd The value of the column 'SYMBOLITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolitemcd(String symbolitemcd) {
        registerModifiedProperty("symbolitemcd");
        _symbolitemcd = symbolitemcd;
    }

    /**
     * [get] SYMBOLSKU: {varchar(30)} <br>
     * 二次元コードのＳＫＵ
     * @return The value of the column 'SYMBOLSKU'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolsku() {
        checkSpecifiedProperty("symbolsku");
        return convertEmptyToNull(_symbolsku);
    }

    /**
     * [set] SYMBOLSKU: {varchar(30)} <br>
     * 二次元コードのＳＫＵ
     * @param symbolsku The value of the column 'SYMBOLSKU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolsku(String symbolsku) {
        registerModifiedProperty("symbolsku");
        _symbolsku = symbolsku;
    }

    /**
     * [get] SYMBOLRECEIVECD: {varchar(30)} <br>
     * 二次元コードの仕向地コード
     * @return The value of the column 'SYMBOLRECEIVECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolreceivecd() {
        checkSpecifiedProperty("symbolreceivecd");
        return convertEmptyToNull(_symbolreceivecd);
    }

    /**
     * [set] SYMBOLRECEIVECD: {varchar(30)} <br>
     * 二次元コードの仕向地コード
     * @param symbolreceivecd The value of the column 'SYMBOLRECEIVECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolreceivecd(String symbolreceivecd) {
        registerModifiedProperty("symbolreceivecd");
        _symbolreceivecd = symbolreceivecd;
    }

    /**
     * [get] SYMBOLPRODUCTMARK: {varchar(30)} <br>
     * 二次元コードの製造記号
     * @return The value of the column 'SYMBOLPRODUCTMARK'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolproductmark() {
        checkSpecifiedProperty("symbolproductmark");
        return convertEmptyToNull(_symbolproductmark);
    }

    /**
     * [set] SYMBOLPRODUCTMARK: {varchar(30)} <br>
     * 二次元コードの製造記号
     * @param symbolproductmark The value of the column 'SYMBOLPRODUCTMARK'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolproductmark(String symbolproductmark) {
        registerModifiedProperty("symbolproductmark");
        _symbolproductmark = symbolproductmark;
    }

    /**
     * [get] SYMBOLORDERNO: {varchar(30)} <br>
     * 二次元コードの発注番号
     * @return The value of the column 'SYMBOLORDERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolorderno() {
        checkSpecifiedProperty("symbolorderno");
        return convertEmptyToNull(_symbolorderno);
    }

    /**
     * [set] SYMBOLORDERNO: {varchar(30)} <br>
     * 二次元コードの発注番号
     * @param symbolorderno The value of the column 'SYMBOLORDERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolorderno(String symbolorderno) {
        registerModifiedProperty("symbolorderno");
        _symbolorderno = symbolorderno;
    }

    /**
     * [get] SYMBOLPRINTERNO: {varchar(30)} <br>
     * 二次元コードの号機（印字機）
     * @return The value of the column 'SYMBOLPRINTERNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolprinterno() {
        checkSpecifiedProperty("symbolprinterno");
        return convertEmptyToNull(_symbolprinterno);
    }

    /**
     * [set] SYMBOLPRINTERNO: {varchar(30)} <br>
     * 二次元コードの号機（印字機）
     * @param symbolprinterno The value of the column 'SYMBOLPRINTERNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolprinterno(String symbolprinterno) {
        registerModifiedProperty("symbolprinterno");
        _symbolprinterno = symbolprinterno;
    }

    /**
     * [get] SYMBOLMAKENO: {varchar(30)} <br>
     * 二次元コードの生出番号
     * @return The value of the column 'SYMBOLMAKENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolmakeno() {
        checkSpecifiedProperty("symbolmakeno");
        return convertEmptyToNull(_symbolmakeno);
    }

    /**
     * [set] SYMBOLMAKENO: {varchar(30)} <br>
     * 二次元コードの生出番号
     * @param symbolmakeno The value of the column 'SYMBOLMAKENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolmakeno(String symbolmakeno) {
        registerModifiedProperty("symbolmakeno");
        _symbolmakeno = symbolmakeno;
    }

    /**
     * [get] SYMBOLLOT4: {varchar(30)} <br>
     * 二次元コードの製造年月日
     * @return The value of the column 'SYMBOLLOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbollot4() {
        checkSpecifiedProperty("symbollot4");
        return convertEmptyToNull(_symbollot4);
    }

    /**
     * [set] SYMBOLLOT4: {varchar(30)} <br>
     * 二次元コードの製造年月日
     * @param symbollot4 The value of the column 'SYMBOLLOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbollot4(String symbollot4) {
        registerModifiedProperty("symbollot4");
        _symbollot4 = symbollot4;
    }

    /**
     * [get] SYMBOLMAKETIME: {varchar(30)} <br>
     * 二次元コードの実製造時間
     * @return The value of the column 'SYMBOLMAKETIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolmaketime() {
        checkSpecifiedProperty("symbolmaketime");
        return convertEmptyToNull(_symbolmaketime);
    }

    /**
     * [set] SYMBOLMAKETIME: {varchar(30)} <br>
     * 二次元コードの実製造時間
     * @param symbolmaketime The value of the column 'SYMBOLMAKETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolmaketime(String symbolmaketime) {
        registerModifiedProperty("symbolmaketime");
        _symbolmaketime = symbolmaketime;
    }

    /**
     * [get] SYMBOLCIRCULATIONID: {varchar(30)} <br>
     * 二次元コードの流通識別コード
     * @return The value of the column 'SYMBOLCIRCULATIONID'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolcirculationid() {
        checkSpecifiedProperty("symbolcirculationid");
        return convertEmptyToNull(_symbolcirculationid);
    }

    /**
     * [set] SYMBOLCIRCULATIONID: {varchar(30)} <br>
     * 二次元コードの流通識別コード
     * @param symbolcirculationid The value of the column 'SYMBOLCIRCULATIONID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolcirculationid(String symbolcirculationid) {
        registerModifiedProperty("symbolcirculationid");
        _symbolcirculationid = symbolcirculationid;
    }

    /**
     * [get] SYMBOLRCVKEY: {bigint(19)} <br>
     * 二次元コードの入荷予定ヘッダID
     * @return The value of the column 'SYMBOLRCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSymbolrcvkey() {
        checkSpecifiedProperty("symbolrcvkey");
        return _symbolrcvkey;
    }

    /**
     * [set] SYMBOLRCVKEY: {bigint(19)} <br>
     * 二次元コードの入荷予定ヘッダID
     * @param symbolrcvkey The value of the column 'SYMBOLRCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolrcvkey(Long symbolrcvkey) {
        registerModifiedProperty("symbolrcvkey");
        _symbolrcvkey = symbolrcvkey;
    }

    /**
     * [get] SYMBOLLOT3: {varchar(30)} <br>
     * 二次元コードのデザイン区分
     * @return The value of the column 'SYMBOLLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbollot3() {
        checkSpecifiedProperty("symbollot3");
        return convertEmptyToNull(_symbollot3);
    }

    /**
     * [set] SYMBOLLOT3: {varchar(30)} <br>
     * 二次元コードのデザイン区分
     * @param symbollot3 The value of the column 'SYMBOLLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbollot3(String symbollot3) {
        registerModifiedProperty("symbollot3");
        _symbollot3 = symbollot3;
    }

    /**
     * [get] QRData: {varchar(255)} <br>
     * ２次元データ
     * @return The value of the column 'QRData'. (NullAllowed even if selected: for no constraint)
     */
    public String getQrdata() {
        checkSpecifiedProperty("qrdata");
        return convertEmptyToNull(_qrdata);
    }

    /**
     * [set] QRData: {varchar(255)} <br>
     * ２次元データ
     * @param qrdata The value of the column 'QRData'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQrdata(String qrdata) {
        registerModifiedProperty("qrdata");
        _qrdata = qrdata;
    }

    /**
     * [get] TREXAMRESULT_ID: {IX, bigint(19)} <br>
     * 検査実績ID
     * @return The value of the column 'TREXAMRESULT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrexamresultId() {
        checkSpecifiedProperty("trexamresultId");
        return _trexamresultId;
    }

    /**
     * [set] TREXAMRESULT_ID: {IX, bigint(19)} <br>
     * 検査実績ID
     * @param trexamresultId The value of the column 'TREXAMRESULT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrexamresultId(Long trexamresultId) {
        registerModifiedProperty("trexamresultId");
        _trexamresultId = trexamresultId;
    }

    /**
     * [get] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
     * @return The value of the column 'CASEITFNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseitfno() {
        checkSpecifiedProperty("caseitfno");
        return convertEmptyToNull(_caseitfno);
    }

    /**
     * [set] CASEITFNO: {varchar(30)} <br>
     * ITFNo.
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
     * [get] DATETIME: {datetime2(26, 6)} <br>
     * 日付時刻
     * @return The value of the column 'DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getDatetime() {
        checkSpecifiedProperty("datetime");
        return _datetime;
    }

    /**
     * [set] DATETIME: {datetime2(26, 6)} <br>
     * 日付時刻
     * @param datetime The value of the column 'DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDatetime(java.sql.Timestamp datetime) {
        registerModifiedProperty("datetime");
        _datetime = datetime;
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
     * ケースパッカーNo.
     * @return The value of the column 'CASEPACKNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasepackno() {
        checkSpecifiedProperty("casepackno");
        return convertEmptyToNull(_casepackno);
    }

    /**
     * [set] CASEPACKNO: {varchar(30)} <br>
     * ケースパッカーNo.
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
     * [get] CASEBARCODE: {IX, varchar(60)} <br>
     * 段ボールバーコード
     * @return The value of the column 'CASEBARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasebarcode() {
        checkSpecifiedProperty("casebarcode");
        return convertEmptyToNull(_casebarcode);
    }

    /**
     * [set] CASEBARCODE: {IX, varchar(60)} <br>
     * 段ボールバーコード
     * @param casebarcode The value of the column 'CASEBARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasebarcode(String casebarcode) {
        registerModifiedProperty("casebarcode");
        _casebarcode = casebarcode;
    }

    /**
     * [get] MIXEDFLG: {char(1), default=[(0)]} <br>
     * 開封フラグ
     * @return The value of the column 'MIXEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMixedflg() {
        checkSpecifiedProperty("mixedflg");
        return convertEmptyToNull(_mixedflg);
    }

    /**
     * [set] MIXEDFLG: {char(1), default=[(0)]} <br>
     * 開封フラグ
     * @param mixedflg The value of the column 'MIXEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMixedflg(String mixedflg) {
        registerModifiedProperty("mixedflg");
        _mixedflg = mixedflg;
    }

    /**
     * [get] SHIPPEDFLG: {char(1), default=[(0)]} <br>
     * 出庫済フラグ
     * @return The value of the column 'SHIPPEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippedflg() {
        checkSpecifiedProperty("shippedflg");
        return convertEmptyToNull(_shippedflg);
    }

    /**
     * [set] SHIPPEDFLG: {char(1), default=[(0)]} <br>
     * 出庫済フラグ
     * @param shippedflg The value of the column 'SHIPPEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippedflg(String shippedflg) {
        registerModifiedProperty("shippedflg");
        _shippedflg = shippedflg;
    }

    /**
     * [get] CASECREATETYPE: {NotNull, varchar(30)} <br>
     * ケース作成区分
     * @return The value of the column 'CASECREATETYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getCasecreatetype() {
        checkSpecifiedProperty("casecreatetype");
        return convertEmptyToNull(_casecreatetype);
    }

    /**
     * [set] CASECREATETYPE: {NotNull, varchar(30)} <br>
     * ケース作成区分
     * @param casecreatetype The value of the column 'CASECREATETYPE'. (basically NotNull if update: for the constraint)
     */
    public void setCasecreatetype(String casecreatetype) {
        registerModifiedProperty("casecreatetype");
        _casecreatetype = casecreatetype;
    }

    /**
     * [get] CREATEDATETIME: {datetime2(26, 6)} <br>
     * 作成日時
     * @return The value of the column 'CREATEDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCreatedatetime() {
        checkSpecifiedProperty("createdatetime");
        return _createdatetime;
    }

    /**
     * [set] CREATEDATETIME: {datetime2(26, 6)} <br>
     * 作成日時
     * @param createdatetime The value of the column 'CREATEDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedatetime(java.sql.Timestamp createdatetime) {
        registerModifiedProperty("createdatetime");
        _createdatetime = createdatetime;
    }

    /**
     * [get] InitNum: {bigint(19)} <br>
     * ケース初期数量
     * @return The value of the column 'InitNum'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInitnum() {
        checkSpecifiedProperty("initnum");
        return _initnum;
    }

    /**
     * [set] InitNum: {bigint(19)} <br>
     * ケース初期数量
     * @param initnum The value of the column 'InitNum'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInitnum(Long initnum) {
        registerModifiedProperty("initnum");
        _initnum = initnum;
    }

    /**
     * [get] ParentCaseCd: {bigint(19)} <br>
     * 親ケースCD
     * @return The value of the column 'ParentCaseCd'. (NullAllowed even if selected: for no constraint)
     */
    public Long getParentcasecd() {
        checkSpecifiedProperty("parentcasecd");
        return _parentcasecd;
    }

    /**
     * [set] ParentCaseCd: {bigint(19)} <br>
     * 親ケースCD
     * @param parentcasecd The value of the column 'ParentCaseCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentcasecd(Long parentcasecd) {
        registerModifiedProperty("parentcasecd");
        _parentcasecd = parentcasecd;
    }

    /**
     * [get] TR_PICKLIST_ID: {bigint(19)} <br>
     * 山出しリストID
     * @return The value of the column 'TR_PICKLIST_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrPicklistId() {
        checkSpecifiedProperty("trPicklistId");
        return _trPicklistId;
    }

    /**
     * [set] TR_PICKLIST_ID: {bigint(19)} <br>
     * 山出しリストID
     * @param trPicklistId The value of the column 'TR_PICKLIST_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrPicklistId(Long trPicklistId) {
        registerModifiedProperty("trPicklistId");
        _trPicklistId = trPicklistId;
    }

    /**
     * [get] PicklistGNo: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @return The value of the column 'PicklistGNo'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPicklistgno() {
        checkSpecifiedProperty("picklistgno");
        return _picklistgno;
    }

    /**
     * [set] PicklistGNo: {bigint(19)} <br>
     * 山出しリスト明細行№
     * @param picklistgno The value of the column 'PicklistGNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicklistgno(Long picklistgno) {
        registerModifiedProperty("picklistgno");
        _picklistgno = picklistgno;
    }

    /**
     * [get] RecombDatetime: {datetime2(26, 6)} <br>
     * 最終組替日時
     * @return The value of the column 'RecombDatetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRecombdatetime() {
        checkSpecifiedProperty("recombdatetime");
        return _recombdatetime;
    }

    /**
     * [set] RecombDatetime: {datetime2(26, 6)} <br>
     * 最終組替日時
     * @param recombdatetime The value of the column 'RecombDatetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecombdatetime(java.sql.Timestamp recombdatetime) {
        registerModifiedProperty("recombdatetime");
        _recombdatetime = recombdatetime;
    }

    /**
     * [get] ReprintedFlg: {varchar(30)} <br>
     * 再印刷区分
     * @return The value of the column 'ReprintedFlg'. (NullAllowed even if selected: for no constraint)
     */
    public String getReprintedflg() {
        checkSpecifiedProperty("reprintedflg");
        return convertEmptyToNull(_reprintedflg);
    }

    /**
     * [set] ReprintedFlg: {varchar(30)} <br>
     * 再印刷区分
     * @param reprintedflg The value of the column 'ReprintedFlg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReprintedflg(String reprintedflg) {
        registerModifiedProperty("reprintedflg");
        _reprintedflg = reprintedflg;
    }

    /**
     * [get] TraceSts: {bigint(19)} <br>
     * 追跡状態
     * @return The value of the column 'TraceSts'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTracests() {
        checkSpecifiedProperty("tracests");
        return _tracests;
    }

    /**
     * [set] TraceSts: {bigint(19)} <br>
     * 追跡状態
     * @param tracests The value of the column 'TraceSts'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTracests(Long tracests) {
        registerModifiedProperty("tracests");
        _tracests = tracests;
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
     * [get] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @return The value of the column 'BATJPRODUCTIONYM'. (NullAllowed even if selected: for no constraint)
     */
    public String getBatjproductionym() {
        checkSpecifiedProperty("batjproductionym");
        return convertEmptyToNull(_batjproductionym);
    }

    /**
     * [set] BATJPRODUCTIONYM: {varchar(30)} <br>
     * BATJ製造月情報
     * @param batjproductionym The value of the column 'BATJPRODUCTIONYM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBatjproductionym(String batjproductionym) {
        registerModifiedProperty("batjproductionym");
        _batjproductionym = batjproductionym;
    }

    /**
     * [get] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @return The value of the column 'COMETODATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCometodate() {
        checkSpecifiedProperty("cometodate");
        return convertEmptyToNull(_cometodate);
    }

    /**
     * [set] COMETODATE: {varchar(8)} <br>
     * 入港日
     * @param cometodate The value of the column 'COMETODATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCometodate(String cometodate) {
        registerModifiedProperty("cometodate");
        _cometodate = cometodate;
    }

    /**
     * [get] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @return The value of the column 'RCVPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RCVPALLETNO: {varchar(30)} <br>
     * 08需給パレット番号
     * @param rcvpalletno The value of the column 'RCVPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @return The value of the column 'TAXPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTaxpalletno() {
        checkSpecifiedProperty("taxpalletno");
        return convertEmptyToNull(_taxpalletno);
    }

    /**
     * [set] TAXPALLETNO: {varchar(30)} <br>
     * 保税パレット番号
     * @param taxpalletno The value of the column 'TAXPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTaxpalletno(String taxpalletno) {
        registerModifiedProperty("taxpalletno");
        _taxpalletno = taxpalletno;
    }

    /**
     * [get] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'SHTYPECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShtypecd() {
        checkSpecifiedProperty("shtypecd");
        return convertEmptyToNull(_shtypecd);
    }

    /**
     * [set] SHTYPECD: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'SHTYPECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShtypecd(String shtypecd) {
        registerModifiedProperty("shtypecd");
        _shtypecd = shtypecd;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * 拠点ID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] RESTCTN: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @return The value of the column 'RESTCTN'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestctn() {
        checkSpecifiedProperty("restctn");
        return _restctn;
    }

    /**
     * [set] RESTCTN: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @param restctn The value of the column 'RESTCTN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestctn(java.math.BigDecimal restctn) {
        registerModifiedProperty("restctn");
        _restctn = restctn;
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
