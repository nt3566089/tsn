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
 * The entity of W_WKPALLET as TABLE. <br>
 * 印刷用パレットはり紙情報
 * <pre>
 * [primary-key]
 *     WKPALLET_ID
 *
 * [column]
 *     WKPALLET_ID, PALLETNO, PRINTKEY, LotKey, RcvKey, RcvLineNo, PRINTEDFLG, PrintingDate, LOT1, TRANSPORTNO, SourceCd, SchDate, ReceiveCd, RcvDate, ReceiveDate, WAREHOUSECD, PRODUCT_CD, LOT3, LOT4, LOT2, ReceiveQtyCase, ReceiveQtyBowl, ReceiveQty, RestQtyCase, RestQtyBowl, RestQty, PalletSts, PluralproductionKBN, RtnRcvKbn, ShTypeCd, PALLETCUTTINGKBN, LOCCD, RcvPalletNo, IMAGENAME1, IMAGENAME2, IMAGENAME3, WAREHOUSE_SNAME, ITEM_SNAME, FOREIGNCARGOCD, CARRIERSEQ, OTHERLOT1, USERNUM3, ADDRESS2, AcceptUserCd, AcceptDate, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WKPALLET_ID
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
 * Long wkpalletId = entity.getWkpalletId();
 * java.math.BigDecimal palletno = entity.getPalletno();
 * Long printkey = entity.getPrintkey();
 * Long lotkey = entity.getLotkey();
 * java.math.BigDecimal rcvkey = entity.getRcvkey();
 * Long rcvlineno = entity.getRcvlineno();
 * String printedflg = entity.getPrintedflg();
 * String printingdate = entity.getPrintingdate();
 * String lot1 = entity.getLot1();
 * String transportno = entity.getTransportno();
 * String sourcecd = entity.getSourcecd();
 * String schdate = entity.getSchdate();
 * String receivecd = entity.getReceivecd();
 * String rcvdate = entity.getRcvdate();
 * String receivedate = entity.getReceivedate();
 * String warehousecd = entity.getWarehousecd();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String lot2 = entity.getLot2();
 * java.math.BigDecimal receiveqtycase = entity.getReceiveqtycase();
 * java.math.BigDecimal receiveqtybowl = entity.getReceiveqtybowl();
 * java.math.BigDecimal receiveqty = entity.getReceiveqty();
 * java.math.BigDecimal restqtycase = entity.getRestqtycase();
 * java.math.BigDecimal restqtybowl = entity.getRestqtybowl();
 * java.math.BigDecimal restqty = entity.getRestqty();
 * String palletsts = entity.getPalletsts();
 * String pluralproductionkbn = entity.getPluralproductionkbn();
 * String rtnrcvkbn = entity.getRtnrcvkbn();
 * String shtypecd = entity.getShtypecd();
 * String palletcuttingkbn = entity.getPalletcuttingkbn();
 * String loccd = entity.getLoccd();
 * String rcvpalletno = entity.getRcvpalletno();
 * String imagename1 = entity.getImagename1();
 * String imagename2 = entity.getImagename2();
 * String imagename3 = entity.getImagename3();
 * String warehouseSname = entity.getWarehouseSname();
 * String itemSname = entity.getItemSname();
 * String foreigncargocd = entity.getForeigncargocd();
 * String carrierseq = entity.getCarrierseq();
 * String otherlot1 = entity.getOtherlot1();
 * Long usernum3 = entity.getUsernum3();
 * String address2 = entity.getAddress2();
 * String acceptusercd = entity.getAcceptusercd();
 * String acceptdate = entity.getAcceptdate();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setWkpalletId(wkpalletId);
 * entity.setPalletno(palletno);
 * entity.setPrintkey(printkey);
 * entity.setLotkey(lotkey);
 * entity.setRcvkey(rcvkey);
 * entity.setRcvlineno(rcvlineno);
 * entity.setPrintedflg(printedflg);
 * entity.setPrintingdate(printingdate);
 * entity.setLot1(lot1);
 * entity.setTransportno(transportno);
 * entity.setSourcecd(sourcecd);
 * entity.setSchdate(schdate);
 * entity.setReceivecd(receivecd);
 * entity.setRcvdate(rcvdate);
 * entity.setReceivedate(receivedate);
 * entity.setWarehousecd(warehousecd);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setLot2(lot2);
 * entity.setReceiveqtycase(receiveqtycase);
 * entity.setReceiveqtybowl(receiveqtybowl);
 * entity.setReceiveqty(receiveqty);
 * entity.setRestqtycase(restqtycase);
 * entity.setRestqtybowl(restqtybowl);
 * entity.setRestqty(restqty);
 * entity.setPalletsts(palletsts);
 * entity.setPluralproductionkbn(pluralproductionkbn);
 * entity.setRtnrcvkbn(rtnrcvkbn);
 * entity.setShtypecd(shtypecd);
 * entity.setPalletcuttingkbn(palletcuttingkbn);
 * entity.setLoccd(loccd);
 * entity.setRcvpalletno(rcvpalletno);
 * entity.setImagename1(imagename1);
 * entity.setImagename2(imagename2);
 * entity.setImagename3(imagename3);
 * entity.setWarehouseSname(warehouseSname);
 * entity.setItemSname(itemSname);
 * entity.setForeigncargocd(foreigncargocd);
 * entity.setCarrierseq(carrierseq);
 * entity.setOtherlot1(otherlot1);
 * entity.setUsernum3(usernum3);
 * entity.setAddress2(address2);
 * entity.setAcceptusercd(acceptusercd);
 * entity.setAcceptdate(acceptdate);
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
public abstract class BsWWkpallet extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _wkpalletId;

    /** PALLETNO: {NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _palletno;

    /** PRINTKEY: {NotNull, bigint(19)} */
    protected Long _printkey;

    /** LotKey: {bigint(19)} */
    protected Long _lotkey;

    /** RcvKey: {decimal(16, 6)} */
    protected java.math.BigDecimal _rcvkey;

    /** RcvLineNo: {bigint(19)} */
    protected Long _rcvlineno;

    /** PRINTEDFLG: {char(1)} */
    protected String _printedflg;

    /** PrintingDate: {varchar(8)} */
    protected String _printingdate;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** TRANSPORTNO: {varchar(30)} */
    protected String _transportno;

    /** SourceCd: {varchar(30)} */
    protected String _sourcecd;

    /** SchDate: {varchar(8)} */
    protected String _schdate;

    /** ReceiveCd: {varchar(30)} */
    protected String _receivecd;

    /** RcvDate: {varchar(8)} */
    protected String _rcvdate;

    /** ReceiveDate: {varchar(8)} */
    protected String _receivedate;

    /** WAREHOUSECD: {varchar(30)} */
    protected String _warehousecd;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** LOT3: {varchar(30)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** ReceiveQtyCase: {decimal(16, 6)} */
    protected java.math.BigDecimal _receiveqtycase;

    /** ReceiveQtyBowl: {decimal(16, 6)} */
    protected java.math.BigDecimal _receiveqtybowl;

    /** ReceiveQty: {decimal(16, 6)} */
    protected java.math.BigDecimal _receiveqty;

    /** RestQtyCase: {decimal(16, 6)} */
    protected java.math.BigDecimal _restqtycase;

    /** RestQtyBowl: {decimal(16, 6)} */
    protected java.math.BigDecimal _restqtybowl;

    /** RestQty: {decimal(16, 6)} */
    protected java.math.BigDecimal _restqty;

    /** PalletSts: {char(1)} */
    protected String _palletsts;

    /** PluralproductionKBN: {char(1)} */
    protected String _pluralproductionkbn;

    /** RtnRcvKbn: {char(1)} */
    protected String _rtnrcvkbn;

    /** ShTypeCd: {varchar(30)} */
    protected String _shtypecd;

    /** PALLETCUTTINGKBN: {char(1)} */
    protected String _palletcuttingkbn;

    /** LOCCD: {varchar(30)} */
    protected String _loccd;

    /** RcvPalletNo: {varchar(30)} */
    protected String _rcvpalletno;

    /** IMAGENAME1: {varchar(4000)} */
    protected String _imagename1;

    /** IMAGENAME2: {varchar(4000)} */
    protected String _imagename2;

    /** IMAGENAME3: {varchar(4000)} */
    protected String _imagename3;

    /** WAREHOUSE_SNAME: {varchar(100)} */
    protected String _warehouseSname;

    /** ITEM_SNAME: {varchar(100)} */
    protected String _itemSname;

    /** FOREIGNCARGOCD: {char(1)} */
    protected String _foreigncargocd;

    /** CARRIERSEQ: {varchar(30)} */
    protected String _carrierseq;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** AcceptUserCd: {varchar(30)} */
    protected String _acceptusercd;

    /** AcceptDate: {varchar(8)} */
    protected String _acceptdate;

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
        return "W_WKPALLET";
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
        if (_wkpalletId == null) { return false; }
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
        if (obj instanceof BsWWkpallet) {
            BsWWkpallet other = (BsWWkpallet)obj;
            if (!xSV(_wkpalletId, other._wkpalletId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _wkpalletId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_wkpalletId));
        sb.append(dm).append(xfND(_palletno));
        sb.append(dm).append(xfND(_printkey));
        sb.append(dm).append(xfND(_lotkey));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_rcvlineno));
        sb.append(dm).append(xfND(_printedflg));
        sb.append(dm).append(xfND(_printingdate));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_transportno));
        sb.append(dm).append(xfND(_sourcecd));
        sb.append(dm).append(xfND(_schdate));
        sb.append(dm).append(xfND(_receivecd));
        sb.append(dm).append(xfND(_rcvdate));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_warehousecd));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_receiveqtycase));
        sb.append(dm).append(xfND(_receiveqtybowl));
        sb.append(dm).append(xfND(_receiveqty));
        sb.append(dm).append(xfND(_restqtycase));
        sb.append(dm).append(xfND(_restqtybowl));
        sb.append(dm).append(xfND(_restqty));
        sb.append(dm).append(xfND(_palletsts));
        sb.append(dm).append(xfND(_pluralproductionkbn));
        sb.append(dm).append(xfND(_rtnrcvkbn));
        sb.append(dm).append(xfND(_shtypecd));
        sb.append(dm).append(xfND(_palletcuttingkbn));
        sb.append(dm).append(xfND(_loccd));
        sb.append(dm).append(xfND(_rcvpalletno));
        sb.append(dm).append(xfND(_imagename1));
        sb.append(dm).append(xfND(_imagename2));
        sb.append(dm).append(xfND(_imagename3));
        sb.append(dm).append(xfND(_warehouseSname));
        sb.append(dm).append(xfND(_itemSname));
        sb.append(dm).append(xfND(_foreigncargocd));
        sb.append(dm).append(xfND(_carrierseq));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_acceptusercd));
        sb.append(dm).append(xfND(_acceptdate));
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
    public WWkpallet clone() {
        return (WWkpallet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷用パレットはり紙情報ID
     * @return The value of the column 'WKPALLET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWkpalletId() {
        checkSpecifiedProperty("wkpalletId");
        return _wkpalletId;
    }

    /**
     * [set] WKPALLET_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 印刷用パレットはり紙情報ID
     * @param wkpalletId The value of the column 'WKPALLET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWkpalletId(Long wkpalletId) {
        registerModifiedProperty("wkpalletId");
        _wkpalletId = wkpalletId;
    }

    /**
     * [get] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @return The value of the column 'PALLETNO'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPalletno() {
        checkSpecifiedProperty("palletno");
        return _palletno;
    }

    /**
     * [set] PALLETNO: {NotNull, decimal(16, 6)} <br>
     * パレット管理番号
     * @param palletno The value of the column 'PALLETNO'. (basically NotNull if update: for the constraint)
     */
    public void setPalletno(java.math.BigDecimal palletno) {
        registerModifiedProperty("palletno");
        _palletno = palletno;
    }

    /**
     * [get] PRINTKEY: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @return The value of the column 'PRINTKEY'. (basically NotNull if selected: for the constraint)
     */
    public Long getPrintkey() {
        checkSpecifiedProperty("printkey");
        return _printkey;
    }

    /**
     * [set] PRINTKEY: {NotNull, bigint(19)} <br>
     * 印刷キー
     * @param printkey The value of the column 'PRINTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setPrintkey(Long printkey) {
        registerModifiedProperty("printkey");
        _printkey = printkey;
    }

    /**
     * [get] LotKey: {bigint(19)} <br>
     * ロットキー
     * @return The value of the column 'LotKey'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLotkey() {
        checkSpecifiedProperty("lotkey");
        return _lotkey;
    }

    /**
     * [set] LotKey: {bigint(19)} <br>
     * ロットキー
     * @param lotkey The value of the column 'LotKey'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotkey(Long lotkey) {
        registerModifiedProperty("lotkey");
        _lotkey = lotkey;
    }

    /**
     * [get] RcvKey: {decimal(16, 6)} <br>
     * 入庫キー
     * @return The value of the column 'RcvKey'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RcvKey: {decimal(16, 6)} <br>
     * 入庫キー
     * @param rcvkey The value of the column 'RcvKey'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(java.math.BigDecimal rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] RcvLineNo: {bigint(19)} <br>
     * 入庫キー行番号
     * @return The value of the column 'RcvLineNo'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvlineno() {
        checkSpecifiedProperty("rcvlineno");
        return _rcvlineno;
    }

    /**
     * [set] RcvLineNo: {bigint(19)} <br>
     * 入庫キー行番号
     * @param rcvlineno The value of the column 'RcvLineNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvlineno(Long rcvlineno) {
        registerModifiedProperty("rcvlineno");
        _rcvlineno = rcvlineno;
    }

    /**
     * [get] PRINTEDFLG: {char(1)} <br>
     * PRINTEDFLG
     * @return The value of the column 'PRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintedflg() {
        checkSpecifiedProperty("printedflg");
        return convertEmptyToNull(_printedflg);
    }

    /**
     * [set] PRINTEDFLG: {char(1)} <br>
     * PRINTEDFLG
     * @param printedflg The value of the column 'PRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintedflg(String printedflg) {
        registerModifiedProperty("printedflg");
        _printedflg = printedflg;
    }

    /**
     * [get] PrintingDate: {varchar(8)} <br>
     * パレットはり紙作成日
     * @return The value of the column 'PrintingDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrintingdate() {
        checkSpecifiedProperty("printingdate");
        return convertEmptyToNull(_printingdate);
    }

    /**
     * [set] PrintingDate: {varchar(8)} <br>
     * パレットはり紙作成日
     * @param printingdate The value of the column 'PrintingDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrintingdate(String printingdate) {
        registerModifiedProperty("printingdate");
        _printingdate = printingdate;
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
     * [get] TRANSPORTNO: {varchar(30)} <br>
     * 保税管理番号
     * @return The value of the column 'TRANSPORTNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransportno() {
        checkSpecifiedProperty("transportno");
        return convertEmptyToNull(_transportno);
    }

    /**
     * [set] TRANSPORTNO: {varchar(30)} <br>
     * 保税管理番号
     * @param transportno The value of the column 'TRANSPORTNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportno(String transportno) {
        registerModifiedProperty("transportno");
        _transportno = transportno;
    }

    /**
     * [get] SourceCd: {varchar(30)} <br>
     * 発送元CD
     * @return The value of the column 'SourceCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getSourcecd() {
        checkSpecifiedProperty("sourcecd");
        return convertEmptyToNull(_sourcecd);
    }

    /**
     * [set] SourceCd: {varchar(30)} <br>
     * 発送元CD
     * @param sourcecd The value of the column 'SourceCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSourcecd(String sourcecd) {
        registerModifiedProperty("sourcecd");
        _sourcecd = sourcecd;
    }

    /**
     * [get] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @return The value of the column 'SchDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getSchdate() {
        checkSpecifiedProperty("schdate");
        return convertEmptyToNull(_schdate);
    }

    /**
     * [set] SchDate: {varchar(8)} <br>
     * 発送予定日
     * @param schdate The value of the column 'SchDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSchdate(String schdate) {
        registerModifiedProperty("schdate");
        _schdate = schdate;
    }

    /**
     * [get] ReceiveCd: {varchar(30)} <br>
     * 受入先CD
     * @return The value of the column 'ReceiveCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivecd() {
        checkSpecifiedProperty("receivecd");
        return convertEmptyToNull(_receivecd);
    }

    /**
     * [set] ReceiveCd: {varchar(30)} <br>
     * 受入先CD
     * @param receivecd The value of the column 'ReceiveCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivecd(String receivecd) {
        registerModifiedProperty("receivecd");
        _receivecd = receivecd;
    }

    /**
     * [get] RcvDate: {varchar(8)} <br>
     * 受入予定日
     * @return The value of the column 'RcvDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvdate() {
        checkSpecifiedProperty("rcvdate");
        return convertEmptyToNull(_rcvdate);
    }

    /**
     * [set] RcvDate: {varchar(8)} <br>
     * 受入予定日
     * @param rcvdate The value of the column 'RcvDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvdate(String rcvdate) {
        registerModifiedProperty("rcvdate");
        _rcvdate = rcvdate;
    }

    /**
     * [get] ReceiveDate: {varchar(8)} <br>
     * 入庫実績日
     * @return The value of the column 'ReceiveDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] ReceiveDate: {varchar(8)} <br>
     * 入庫実績日
     * @param receivedate The value of the column 'ReceiveDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @return The value of the column 'WAREHOUSECD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehousecd() {
        checkSpecifiedProperty("warehousecd");
        return convertEmptyToNull(_warehousecd);
    }

    /**
     * [set] WAREHOUSECD: {varchar(30)} <br>
     * 拠点CD
     * @param warehousecd The value of the column 'WAREHOUSECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehousecd(String warehousecd) {
        registerModifiedProperty("warehousecd");
        _warehousecd = warehousecd;
    }

    /**
     * [get] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(30)} <br>
     * 銘柄CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
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
     * [get] LOT2: {varchar(60)} <br>
     * 製造記号
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * 製造記号
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] ReceiveQtyCase: {decimal(16, 6)} <br>
     * 入庫時数量（ケース）
     * @return The value of the column 'ReceiveQtyCase'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceiveqtycase() {
        checkSpecifiedProperty("receiveqtycase");
        return _receiveqtycase;
    }

    /**
     * [set] ReceiveQtyCase: {decimal(16, 6)} <br>
     * 入庫時数量（ケース）
     * @param receiveqtycase The value of the column 'ReceiveQtyCase'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveqtycase(java.math.BigDecimal receiveqtycase) {
        registerModifiedProperty("receiveqtycase");
        _receiveqtycase = receiveqtycase;
    }

    /**
     * [get] ReceiveQtyBowl: {decimal(16, 6)} <br>
     * 入庫時数量（カートン）
     * @return The value of the column 'ReceiveQtyBowl'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceiveqtybowl() {
        checkSpecifiedProperty("receiveqtybowl");
        return _receiveqtybowl;
    }

    /**
     * [set] ReceiveQtyBowl: {decimal(16, 6)} <br>
     * 入庫時数量（カートン）
     * @param receiveqtybowl The value of the column 'ReceiveQtyBowl'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveqtybowl(java.math.BigDecimal receiveqtybowl) {
        registerModifiedProperty("receiveqtybowl");
        _receiveqtybowl = receiveqtybowl;
    }

    /**
     * [get] ReceiveQty: {decimal(16, 6)} <br>
     * 個装入庫時数量
     * @return The value of the column 'ReceiveQty'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceiveqty() {
        checkSpecifiedProperty("receiveqty");
        return _receiveqty;
    }

    /**
     * [set] ReceiveQty: {decimal(16, 6)} <br>
     * 個装入庫時数量
     * @param receiveqty The value of the column 'ReceiveQty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveqty(java.math.BigDecimal receiveqty) {
        registerModifiedProperty("receiveqty");
        _receiveqty = receiveqty;
    }

    /**
     * [get] RestQtyCase: {decimal(16, 6)} <br>
     * 残数量（ケース）
     * @return The value of the column 'RestQtyCase'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqtycase() {
        checkSpecifiedProperty("restqtycase");
        return _restqtycase;
    }

    /**
     * [set] RestQtyCase: {decimal(16, 6)} <br>
     * 残数量（ケース）
     * @param restqtycase The value of the column 'RestQtyCase'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqtycase(java.math.BigDecimal restqtycase) {
        registerModifiedProperty("restqtycase");
        _restqtycase = restqtycase;
    }

    /**
     * [get] RestQtyBowl: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @return The value of the column 'RestQtyBowl'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqtybowl() {
        checkSpecifiedProperty("restqtybowl");
        return _restqtybowl;
    }

    /**
     * [set] RestQtyBowl: {decimal(16, 6)} <br>
     * 残数量（カートン）
     * @param restqtybowl The value of the column 'RestQtyBowl'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqtybowl(java.math.BigDecimal restqtybowl) {
        registerModifiedProperty("restqtybowl");
        _restqtybowl = restqtybowl;
    }

    /**
     * [get] RestQty: {decimal(16, 6)} <br>
     * 個装残数量
     * @return The value of the column 'RestQty'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getRestqty() {
        checkSpecifiedProperty("restqty");
        return _restqty;
    }

    /**
     * [set] RestQty: {decimal(16, 6)} <br>
     * 個装残数量
     * @param restqty The value of the column 'RestQty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRestqty(java.math.BigDecimal restqty) {
        registerModifiedProperty("restqty");
        _restqty = restqty;
    }

    /**
     * [get] PalletSts: {char(1)} <br>
     * パレットはり紙ステータス
     * @return The value of the column 'PalletSts'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletsts() {
        checkSpecifiedProperty("palletsts");
        return convertEmptyToNull(_palletsts);
    }

    /**
     * [set] PalletSts: {char(1)} <br>
     * パレットはり紙ステータス
     * @param palletsts The value of the column 'PalletSts'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletsts(String palletsts) {
        registerModifiedProperty("palletsts");
        _palletsts = palletsts;
    }

    /**
     * [get] PluralproductionKBN: {char(1)} <br>
     * 複数製造月日区分
     * @return The value of the column 'PluralproductionKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getPluralproductionkbn() {
        checkSpecifiedProperty("pluralproductionkbn");
        return convertEmptyToNull(_pluralproductionkbn);
    }

    /**
     * [set] PluralproductionKBN: {char(1)} <br>
     * 複数製造月日区分
     * @param pluralproductionkbn The value of the column 'PluralproductionKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPluralproductionkbn(String pluralproductionkbn) {
        registerModifiedProperty("pluralproductionkbn");
        _pluralproductionkbn = pluralproductionkbn;
    }

    /**
     * [get] RtnRcvKbn: {char(1)} <br>
     * 逆転入庫区分
     * @return The value of the column 'RtnRcvKbn'. (NullAllowed even if selected: for no constraint)
     */
    public String getRtnrcvkbn() {
        checkSpecifiedProperty("rtnrcvkbn");
        return convertEmptyToNull(_rtnrcvkbn);
    }

    /**
     * [set] RtnRcvKbn: {char(1)} <br>
     * 逆転入庫区分
     * @param rtnrcvkbn The value of the column 'RtnRcvKbn'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRtnrcvkbn(String rtnrcvkbn) {
        registerModifiedProperty("rtnrcvkbn");
        _rtnrcvkbn = rtnrcvkbn;
    }

    /**
     * [get] ShTypeCd: {varchar(30)} <br>
     * 輸送形態CD
     * @return The value of the column 'ShTypeCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getShtypecd() {
        checkSpecifiedProperty("shtypecd");
        return convertEmptyToNull(_shtypecd);
    }

    /**
     * [set] ShTypeCd: {varchar(30)} <br>
     * 輸送形態CD
     * @param shtypecd The value of the column 'ShTypeCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShtypecd(String shtypecd) {
        registerModifiedProperty("shtypecd");
        _shtypecd = shtypecd;
    }

    /**
     * [get] PALLETCUTTINGKBN: {char(1)} <br>
     * パレット分割区分
     * @return The value of the column 'PALLETCUTTINGKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getPalletcuttingkbn() {
        checkSpecifiedProperty("palletcuttingkbn");
        return convertEmptyToNull(_palletcuttingkbn);
    }

    /**
     * [set] PALLETCUTTINGKBN: {char(1)} <br>
     * パレット分割区分
     * @param palletcuttingkbn The value of the column 'PALLETCUTTINGKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletcuttingkbn(String palletcuttingkbn) {
        registerModifiedProperty("palletcuttingkbn");
        _palletcuttingkbn = palletcuttingkbn;
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
     * [get] RcvPalletNo: {varchar(30)} <br>
     * パレット番号（08需給）
     * @return The value of the column 'RcvPalletNo'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvpalletno() {
        checkSpecifiedProperty("rcvpalletno");
        return convertEmptyToNull(_rcvpalletno);
    }

    /**
     * [set] RcvPalletNo: {varchar(30)} <br>
     * パレット番号（08需給）
     * @param rcvpalletno The value of the column 'RcvPalletNo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvpalletno(String rcvpalletno) {
        registerModifiedProperty("rcvpalletno");
        _rcvpalletno = rcvpalletno;
    }

    /**
     * [get] IMAGENAME1: {varchar(4000)} <br>
     * イメージファイルパス1
     * @return The value of the column 'IMAGENAME1'. (NullAllowed even if selected: for no constraint)
     */
    public String getImagename1() {
        checkSpecifiedProperty("imagename1");
        return convertEmptyToNull(_imagename1);
    }

    /**
     * [set] IMAGENAME1: {varchar(4000)} <br>
     * イメージファイルパス1
     * @param imagename1 The value of the column 'IMAGENAME1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImagename1(String imagename1) {
        registerModifiedProperty("imagename1");
        _imagename1 = imagename1;
    }

    /**
     * [get] IMAGENAME2: {varchar(4000)} <br>
     * イメージファイルパス2
     * @return The value of the column 'IMAGENAME2'. (NullAllowed even if selected: for no constraint)
     */
    public String getImagename2() {
        checkSpecifiedProperty("imagename2");
        return convertEmptyToNull(_imagename2);
    }

    /**
     * [set] IMAGENAME2: {varchar(4000)} <br>
     * イメージファイルパス2
     * @param imagename2 The value of the column 'IMAGENAME2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImagename2(String imagename2) {
        registerModifiedProperty("imagename2");
        _imagename2 = imagename2;
    }

    /**
     * [get] IMAGENAME3: {varchar(4000)} <br>
     * イメージファイルパス3
     * @return The value of the column 'IMAGENAME3'. (NullAllowed even if selected: for no constraint)
     */
    public String getImagename3() {
        checkSpecifiedProperty("imagename3");
        return convertEmptyToNull(_imagename3);
    }

    /**
     * [set] IMAGENAME3: {varchar(4000)} <br>
     * イメージファイルパス3
     * @param imagename3 The value of the column 'IMAGENAME3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImagename3(String imagename3) {
        registerModifiedProperty("imagename3");
        _imagename3 = imagename3;
    }

    /**
     * [get] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @return The value of the column 'WAREHOUSE_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseSname() {
        checkSpecifiedProperty("warehouseSname");
        return convertEmptyToNull(_warehouseSname);
    }

    /**
     * [set] WAREHOUSE_SNAME: {varchar(100)} <br>
     * 拠点名称
     * @param warehouseSname The value of the column 'WAREHOUSE_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseSname(String warehouseSname) {
        registerModifiedProperty("warehouseSname");
        _warehouseSname = warehouseSname;
    }

    /**
     * [get] ITEM_SNAME: {varchar(100)} <br>
     * 銘柄名称
     * @return The value of the column 'ITEM_SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemSname() {
        checkSpecifiedProperty("itemSname");
        return convertEmptyToNull(_itemSname);
    }

    /**
     * [set] ITEM_SNAME: {varchar(100)} <br>
     * 銘柄名称
     * @param itemSname The value of the column 'ITEM_SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemSname(String itemSname) {
        registerModifiedProperty("itemSname");
        _itemSname = itemSname;
    }

    /**
     * [get] FOREIGNCARGOCD: {char(1)} <br>
     * 内貨・外貨区分
     * @return The value of the column 'FOREIGNCARGOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeigncargocd() {
        checkSpecifiedProperty("foreigncargocd");
        return convertEmptyToNull(_foreigncargocd);
    }

    /**
     * [set] FOREIGNCARGOCD: {char(1)} <br>
     * 内貨・外貨区分
     * @param foreigncargocd The value of the column 'FOREIGNCARGOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargocd(String foreigncargocd) {
        registerModifiedProperty("foreigncargocd");
        _foreigncargocd = foreigncargocd;
    }

    /**
     * [get] CARRIERSEQ: {varchar(30)} <br>
     * 銘柄マスタ使用区分
     * @return The value of the column 'CARRIERSEQ'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierseq() {
        checkSpecifiedProperty("carrierseq");
        return convertEmptyToNull(_carrierseq);
    }

    /**
     * [set] CARRIERSEQ: {varchar(30)} <br>
     * 銘柄マスタ使用区分
     * @param carrierseq The value of the column 'CARRIERSEQ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierseq(String carrierseq) {
        registerModifiedProperty("carrierseq");
        _carrierseq = carrierseq;
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
     * [get] USERNUM3: {bigint(19)} <br>
     * 一般出力順
     * @return The value of the column 'USERNUM3'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return _usernum3;
    }

    /**
     * [set] USERNUM3: {bigint(19)} <br>
     * 一般出力順
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(Long usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 親拠点CD
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 親拠点CD
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] AcceptUserCd: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @return The value of the column 'AcceptUserCd'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptusercd() {
        checkSpecifiedProperty("acceptusercd");
        return convertEmptyToNull(_acceptusercd);
    }

    /**
     * [set] AcceptUserCd: {varchar(30)} <br>
     * 受入検品ユーザCD
     * @param acceptusercd The value of the column 'AcceptUserCd'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptusercd(String acceptusercd) {
        registerModifiedProperty("acceptusercd");
        _acceptusercd = acceptusercd;
    }

    /**
     * [get] AcceptDate: {varchar(8)} <br>
     * 受入検品日時
     * @return The value of the column 'AcceptDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getAcceptdate() {
        checkSpecifiedProperty("acceptdate");
        return convertEmptyToNull(_acceptdate);
    }

    /**
     * [set] AcceptDate: {varchar(8)} <br>
     * 受入検品日時
     * @param acceptdate The value of the column 'AcceptDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAcceptdate(String acceptdate) {
        registerModifiedProperty("acceptdate");
        _acceptdate = acceptdate;
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
