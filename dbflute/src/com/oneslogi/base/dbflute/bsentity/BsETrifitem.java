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
 * The entity of E_TRIFITEM as TABLE. <br>
 * 銘柄インタフェース
 * <pre>
 * [primary-key]
 *     IMPORTKEY
 *
 * [column]
 *     IMPORTKEY, STS, IMPCHECKKEY, ITEMADMIN, PRODUCT_CD, ITEMGROUP, ACTFLG, INVTYPE, SETITEMFLG, NAME, SNAME, ANAME, OWNERITEMCD, SUPPLIERITEMCD, POSITEMCD, ITFCD, MANUITEMCD, PRICE_BUY, PRICE_WHOLESALE, PRICE_SALE, ABCTYPE, QTY1TYPE, UNIT1, UNIT1STYLE, LENGTH1, WIDTH1, HEIGHT1, GROSSWEIGHT1, NETWEIGHT1, CUBE1, LITER1, UNIT2, UNIT2STYLE, LENGTH2, WIDTH2, HEIGHT2, GROSSWEIGHT2, NETWEIGHT2, CUBE2, LITER2, UNIT3, UNIT3STYLE, LENGTH3, WIDTH3, HEIGHT3, GROSSWEIGHT3, NETWEIGHT3, CUBE3, LITER3, P_QTY, P_HEIGHT, P_ODD, NOTES, F_USER1, F_USER2, F_USER3, F_USER4, F_USER5, PRICE_INSURANCE, LIMITDAY, SUPPLIERCD, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, PRICELEVEL, ITEMCATALOGURL, USERNUM1, USERNUM2, USERNUM3, USERNUM4, USERNUM5, USERDATE1, USERDATE2, USERDATE3, USERDATE4, USERDATE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * java.math.BigDecimal importkey = entity.getImportkey();
 * Long sts = entity.getSts();
 * java.math.BigDecimal impcheckkey = entity.getImpcheckkey();
 * String itemadmin = entity.getItemadmin();
 * String productCd = entity.getProductCd();
 * String itemgroup = entity.getItemgroup();
 * String actflg = entity.getActflg();
 * String invtype = entity.getInvtype();
 * String setitemflg = entity.getSetitemflg();
 * String name = entity.getName();
 * String sname = entity.getSname();
 * String aname = entity.getAname();
 * String owneritemcd = entity.getOwneritemcd();
 * String supplieritemcd = entity.getSupplieritemcd();
 * String positemcd = entity.getPositemcd();
 * String itfcd = entity.getItfcd();
 * String manuitemcd = entity.getManuitemcd();
 * String priceBuy = entity.getPriceBuy();
 * String priceWholesale = entity.getPriceWholesale();
 * String priceSale = entity.getPriceSale();
 * String abctype = entity.getAbctype();
 * String qty1type = entity.getQty1type();
 * String unit1 = entity.getUnit1();
 * String unit1style = entity.getUnit1style();
 * String length1 = entity.getLength1();
 * String width1 = entity.getWidth1();
 * String height1 = entity.getHeight1();
 * String grossweight1 = entity.getGrossweight1();
 * String netweight1 = entity.getNetweight1();
 * String cube1 = entity.getCube1();
 * String liter1 = entity.getLiter1();
 * String unit2 = entity.getUnit2();
 * String unit2style = entity.getUnit2style();
 * String length2 = entity.getLength2();
 * String width2 = entity.getWidth2();
 * String height2 = entity.getHeight2();
 * String grossweight2 = entity.getGrossweight2();
 * String netweight2 = entity.getNetweight2();
 * String cube2 = entity.getCube2();
 * String liter2 = entity.getLiter2();
 * String unit3 = entity.getUnit3();
 * String unit3style = entity.getUnit3style();
 * String length3 = entity.getLength3();
 * String width3 = entity.getWidth3();
 * String height3 = entity.getHeight3();
 * String grossweight3 = entity.getGrossweight3();
 * String netweight3 = entity.getNetweight3();
 * String cube3 = entity.getCube3();
 * String liter3 = entity.getLiter3();
 * String pQty = entity.getPQty();
 * String pHeight = entity.getPHeight();
 * String pOdd = entity.getPOdd();
 * String notes = entity.getNotes();
 * String fUser1 = entity.getFUser1();
 * String fUser2 = entity.getFUser2();
 * String fUser3 = entity.getFUser3();
 * String fUser4 = entity.getFUser4();
 * String fUser5 = entity.getFUser5();
 * String priceInsurance = entity.getPriceInsurance();
 * String limitday = entity.getLimitday();
 * String suppliercd = entity.getSuppliercd();
 * String useruse1 = entity.getUseruse1();
 * String useruse2 = entity.getUseruse2();
 * String useruse3 = entity.getUseruse3();
 * String useruse4 = entity.getUseruse4();
 * String useruse5 = entity.getUseruse5();
 * String pricelevel = entity.getPricelevel();
 * String itemcatalogurl = entity.getItemcatalogurl();
 * String usernum1 = entity.getUsernum1();
 * String usernum2 = entity.getUsernum2();
 * String usernum3 = entity.getUsernum3();
 * String usernum4 = entity.getUsernum4();
 * String usernum5 = entity.getUsernum5();
 * String userdate1 = entity.getUserdate1();
 * String userdate2 = entity.getUserdate2();
 * String userdate3 = entity.getUserdate3();
 * String userdate4 = entity.getUserdate4();
 * String userdate5 = entity.getUserdate5();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setImportkey(importkey);
 * entity.setSts(sts);
 * entity.setImpcheckkey(impcheckkey);
 * entity.setItemadmin(itemadmin);
 * entity.setProductCd(productCd);
 * entity.setItemgroup(itemgroup);
 * entity.setActflg(actflg);
 * entity.setInvtype(invtype);
 * entity.setSetitemflg(setitemflg);
 * entity.setName(name);
 * entity.setSname(sname);
 * entity.setAname(aname);
 * entity.setOwneritemcd(owneritemcd);
 * entity.setSupplieritemcd(supplieritemcd);
 * entity.setPositemcd(positemcd);
 * entity.setItfcd(itfcd);
 * entity.setManuitemcd(manuitemcd);
 * entity.setPriceBuy(priceBuy);
 * entity.setPriceWholesale(priceWholesale);
 * entity.setPriceSale(priceSale);
 * entity.setAbctype(abctype);
 * entity.setQty1type(qty1type);
 * entity.setUnit1(unit1);
 * entity.setUnit1style(unit1style);
 * entity.setLength1(length1);
 * entity.setWidth1(width1);
 * entity.setHeight1(height1);
 * entity.setGrossweight1(grossweight1);
 * entity.setNetweight1(netweight1);
 * entity.setCube1(cube1);
 * entity.setLiter1(liter1);
 * entity.setUnit2(unit2);
 * entity.setUnit2style(unit2style);
 * entity.setLength2(length2);
 * entity.setWidth2(width2);
 * entity.setHeight2(height2);
 * entity.setGrossweight2(grossweight2);
 * entity.setNetweight2(netweight2);
 * entity.setCube2(cube2);
 * entity.setLiter2(liter2);
 * entity.setUnit3(unit3);
 * entity.setUnit3style(unit3style);
 * entity.setLength3(length3);
 * entity.setWidth3(width3);
 * entity.setHeight3(height3);
 * entity.setGrossweight3(grossweight3);
 * entity.setNetweight3(netweight3);
 * entity.setCube3(cube3);
 * entity.setLiter3(liter3);
 * entity.setPQty(pQty);
 * entity.setPHeight(pHeight);
 * entity.setPOdd(pOdd);
 * entity.setNotes(notes);
 * entity.setFUser1(fUser1);
 * entity.setFUser2(fUser2);
 * entity.setFUser3(fUser3);
 * entity.setFUser4(fUser4);
 * entity.setFUser5(fUser5);
 * entity.setPriceInsurance(priceInsurance);
 * entity.setLimitday(limitday);
 * entity.setSuppliercd(suppliercd);
 * entity.setUseruse1(useruse1);
 * entity.setUseruse2(useruse2);
 * entity.setUseruse3(useruse3);
 * entity.setUseruse4(useruse4);
 * entity.setUseruse5(useruse5);
 * entity.setPricelevel(pricelevel);
 * entity.setItemcatalogurl(itemcatalogurl);
 * entity.setUsernum1(usernum1);
 * entity.setUsernum2(usernum2);
 * entity.setUsernum3(usernum3);
 * entity.setUsernum4(usernum4);
 * entity.setUsernum5(usernum5);
 * entity.setUserdate1(userdate1);
 * entity.setUserdate2(userdate2);
 * entity.setUserdate3(userdate3);
 * entity.setUserdate4(userdate4);
 * entity.setUserdate5(userdate5);
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
public abstract class BsETrifitem extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** IMPORTKEY: {PK, NotNull, decimal(16, 6)} */
    protected java.math.BigDecimal _importkey;

    /** STS: {NotNull, bigint(19)} */
    protected Long _sts;

    /** IMPCHECKKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _impcheckkey;

    /** ITEMADMIN: {varchar(30)} */
    protected String _itemadmin;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** ITEMGROUP: {varchar(60)} */
    protected String _itemgroup;

    /** ACTFLG: {char(1), default=[(1)]} */
    protected String _actflg;

    /** INVTYPE: {varchar(30)} */
    protected String _invtype;

    /** SETITEMFLG: {char(1), default=[(0)]} */
    protected String _setitemflg;

    /** NAME: {varchar(255)} */
    protected String _name;

    /** SNAME: {varchar(100)} */
    protected String _sname;

    /** ANAME: {varchar(100)} */
    protected String _aname;

    /** OWNERITEMCD: {varchar(30)} */
    protected String _owneritemcd;

    /** SUPPLIERITEMCD: {varchar(30)} */
    protected String _supplieritemcd;

    /** POSITEMCD: {varchar(30)} */
    protected String _positemcd;

    /** ITFCD: {varchar(30)} */
    protected String _itfcd;

    /** MANUITEMCD: {varchar(30)} */
    protected String _manuitemcd;

    /** PRICE_BUY: {varchar(30)} */
    protected String _priceBuy;

    /** PRICE_WHOLESALE: {varchar(30), default=[(0)]} */
    protected String _priceWholesale;

    /** PRICE_SALE: {varchar(30), default=[(0)]} */
    protected String _priceSale;

    /** ABCTYPE: {varchar(30)} */
    protected String _abctype;

    /** QTY1TYPE: {char(1), default=[(0)]} */
    protected String _qty1type;

    /** UNIT1: {varchar(30), default=[(0)]} */
    protected String _unit1;

    /** UNIT1STYLE: {varchar(60)} */
    protected String _unit1style;

    /** LENGTH1: {varchar(30), default=[(0)]} */
    protected String _length1;

    /** WIDTH1: {varchar(30), default=[(0)]} */
    protected String _width1;

    /** HEIGHT1: {varchar(30), default=[(0)]} */
    protected String _height1;

    /** GROSSWEIGHT1: {varchar(30), default=[(0)]} */
    protected String _grossweight1;

    /** NETWEIGHT1: {varchar(30), default=[(0)]} */
    protected String _netweight1;

    /** CUBE1: {varchar(30), default=[(0)]} */
    protected String _cube1;

    /** LITER1: {varchar(30), default=[(0)]} */
    protected String _liter1;

    /** UNIT2: {varchar(30), default=[(0)]} */
    protected String _unit2;

    /** UNIT2STYLE: {varchar(60)} */
    protected String _unit2style;

    /** LENGTH2: {varchar(30), default=[(0)]} */
    protected String _length2;

    /** WIDTH2: {varchar(30), default=[(0)]} */
    protected String _width2;

    /** HEIGHT2: {varchar(30), default=[(0)]} */
    protected String _height2;

    /** GROSSWEIGHT2: {varchar(30), default=[(0)]} */
    protected String _grossweight2;

    /** NETWEIGHT2: {varchar(30), default=[(0)]} */
    protected String _netweight2;

    /** CUBE2: {varchar(30), default=[(0)]} */
    protected String _cube2;

    /** LITER2: {varchar(30), default=[(0)]} */
    protected String _liter2;

    /** UNIT3: {varchar(30), default=[(0)]} */
    protected String _unit3;

    /** UNIT3STYLE: {varchar(60)} */
    protected String _unit3style;

    /** LENGTH3: {varchar(30), default=[(0)]} */
    protected String _length3;

    /** WIDTH3: {varchar(30), default=[(0)]} */
    protected String _width3;

    /** HEIGHT3: {varchar(30), default=[(0)]} */
    protected String _height3;

    /** GROSSWEIGHT3: {varchar(30), default=[(0)]} */
    protected String _grossweight3;

    /** NETWEIGHT3: {varchar(30), default=[(0)]} */
    protected String _netweight3;

    /** CUBE3: {varchar(30), default=[(0)]} */
    protected String _cube3;

    /** LITER3: {varchar(30), default=[(0)]} */
    protected String _liter3;

    /** P_QTY: {varchar(30), default=[(0)]} */
    protected String _pQty;

    /** P_HEIGHT: {varchar(30), default=[(0)]} */
    protected String _pHeight;

    /** P_ODD: {varchar(30), default=[(0)]} */
    protected String _pOdd;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** F_USER1: {varchar(30)} */
    protected String _fUser1;

    /** F_USER2: {varchar(30)} */
    protected String _fUser2;

    /** F_USER3: {varchar(30)} */
    protected String _fUser3;

    /** F_USER4: {varchar(30)} */
    protected String _fUser4;

    /** F_USER5: {varchar(30)} */
    protected String _fUser5;

    /** PRICE_INSURANCE: {varchar(30), default=[(0)]} */
    protected String _priceInsurance;

    /** LIMITDAY: {varchar(30), default=[(0)]} */
    protected String _limitday;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** USERUSE1: {varchar(60)} */
    protected String _useruse1;

    /** USERUSE2: {varchar(60)} */
    protected String _useruse2;

    /** USERUSE3: {varchar(60)} */
    protected String _useruse3;

    /** USERUSE4: {varchar(60)} */
    protected String _useruse4;

    /** USERUSE5: {varchar(60)} */
    protected String _useruse5;

    /** PRICELEVEL: {char(1), default=[(0)]} */
    protected String _pricelevel;

    /** ITEMCATALOGURL: {varchar(255)} */
    protected String _itemcatalogurl;

    /** USERNUM1: {varchar(30), default=[(0)]} */
    protected String _usernum1;

    /** USERNUM2: {varchar(30), default=[(0)]} */
    protected String _usernum2;

    /** USERNUM3: {varchar(30), default=[(0)]} */
    protected String _usernum3;

    /** USERNUM4: {varchar(30), default=[(0)]} */
    protected String _usernum4;

    /** USERNUM5: {varchar(30), default=[(0)]} */
    protected String _usernum5;

    /** USERDATE1: {varchar(30)} */
    protected String _userdate1;

    /** USERDATE2: {varchar(30)} */
    protected String _userdate2;

    /** USERDATE3: {varchar(30)} */
    protected String _userdate3;

    /** USERDATE4: {varchar(30)} */
    protected String _userdate4;

    /** USERDATE5: {varchar(30)} */
    protected String _userdate5;

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
        return "E_TRIFITEM";
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
        if (_importkey == null) { return false; }
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
        if (obj instanceof BsETrifitem) {
            BsETrifitem other = (BsETrifitem)obj;
            if (!xSV(_importkey, other._importkey)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _importkey);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_importkey));
        sb.append(dm).append(xfND(_sts));
        sb.append(dm).append(xfND(_impcheckkey));
        sb.append(dm).append(xfND(_itemadmin));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_itemgroup));
        sb.append(dm).append(xfND(_actflg));
        sb.append(dm).append(xfND(_invtype));
        sb.append(dm).append(xfND(_setitemflg));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_sname));
        sb.append(dm).append(xfND(_aname));
        sb.append(dm).append(xfND(_owneritemcd));
        sb.append(dm).append(xfND(_supplieritemcd));
        sb.append(dm).append(xfND(_positemcd));
        sb.append(dm).append(xfND(_itfcd));
        sb.append(dm).append(xfND(_manuitemcd));
        sb.append(dm).append(xfND(_priceBuy));
        sb.append(dm).append(xfND(_priceWholesale));
        sb.append(dm).append(xfND(_priceSale));
        sb.append(dm).append(xfND(_abctype));
        sb.append(dm).append(xfND(_qty1type));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit1style));
        sb.append(dm).append(xfND(_length1));
        sb.append(dm).append(xfND(_width1));
        sb.append(dm).append(xfND(_height1));
        sb.append(dm).append(xfND(_grossweight1));
        sb.append(dm).append(xfND(_netweight1));
        sb.append(dm).append(xfND(_cube1));
        sb.append(dm).append(xfND(_liter1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_unit2style));
        sb.append(dm).append(xfND(_length2));
        sb.append(dm).append(xfND(_width2));
        sb.append(dm).append(xfND(_height2));
        sb.append(dm).append(xfND(_grossweight2));
        sb.append(dm).append(xfND(_netweight2));
        sb.append(dm).append(xfND(_cube2));
        sb.append(dm).append(xfND(_liter2));
        sb.append(dm).append(xfND(_unit3));
        sb.append(dm).append(xfND(_unit3style));
        sb.append(dm).append(xfND(_length3));
        sb.append(dm).append(xfND(_width3));
        sb.append(dm).append(xfND(_height3));
        sb.append(dm).append(xfND(_grossweight3));
        sb.append(dm).append(xfND(_netweight3));
        sb.append(dm).append(xfND(_cube3));
        sb.append(dm).append(xfND(_liter3));
        sb.append(dm).append(xfND(_pQty));
        sb.append(dm).append(xfND(_pHeight));
        sb.append(dm).append(xfND(_pOdd));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_fUser1));
        sb.append(dm).append(xfND(_fUser2));
        sb.append(dm).append(xfND(_fUser3));
        sb.append(dm).append(xfND(_fUser4));
        sb.append(dm).append(xfND(_fUser5));
        sb.append(dm).append(xfND(_priceInsurance));
        sb.append(dm).append(xfND(_limitday));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_useruse1));
        sb.append(dm).append(xfND(_useruse2));
        sb.append(dm).append(xfND(_useruse3));
        sb.append(dm).append(xfND(_useruse4));
        sb.append(dm).append(xfND(_useruse5));
        sb.append(dm).append(xfND(_pricelevel));
        sb.append(dm).append(xfND(_itemcatalogurl));
        sb.append(dm).append(xfND(_usernum1));
        sb.append(dm).append(xfND(_usernum2));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_usernum4));
        sb.append(dm).append(xfND(_usernum5));
        sb.append(dm).append(xfND(_userdate1));
        sb.append(dm).append(xfND(_userdate2));
        sb.append(dm).append(xfND(_userdate3));
        sb.append(dm).append(xfND(_userdate4));
        sb.append(dm).append(xfND(_userdate5));
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
    public ETrifitem clone() {
        return (ETrifitem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPORTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * インポートＫｅｙ
     * @return The value of the column 'IMPORTKEY'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImportkey() {
        checkSpecifiedProperty("importkey");
        return _importkey;
    }

    /**
     * [set] IMPORTKEY: {PK, NotNull, decimal(16, 6)} <br>
     * インポートＫｅｙ
     * @param importkey The value of the column 'IMPORTKEY'. (basically NotNull if update: for the constraint)
     */
    public void setImportkey(java.math.BigDecimal importkey) {
        registerModifiedProperty("importkey");
        _importkey = importkey;
    }

    /**
     * [get] STS: {NotNull, bigint(19)} <br>
     * ステータス
     * @return The value of the column 'STS'. (basically NotNull if selected: for the constraint)
     */
    public Long getSts() {
        checkSpecifiedProperty("sts");
        return _sts;
    }

    /**
     * [set] STS: {NotNull, bigint(19)} <br>
     * ステータス
     * @param sts The value of the column 'STS'. (basically NotNull if update: for the constraint)
     */
    public void setSts(Long sts) {
        registerModifiedProperty("sts");
        _sts = sts;
    }

    /**
     * [get] IMPCHECKKEY: {decimal(16, 6)} <br>
     * インポートチェックＫｅｙ
     * @return The value of the column 'IMPCHECKKEY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getImpcheckkey() {
        checkSpecifiedProperty("impcheckkey");
        return _impcheckkey;
    }

    /**
     * [set] IMPCHECKKEY: {decimal(16, 6)} <br>
     * インポートチェックＫｅｙ
     * @param impcheckkey The value of the column 'IMPCHECKKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImpcheckkey(java.math.BigDecimal impcheckkey) {
        registerModifiedProperty("impcheckkey");
        _impcheckkey = impcheckkey;
    }

    /**
     * [get] ITEMADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @return The value of the column 'ITEMADMIN'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemadmin() {
        checkSpecifiedProperty("itemadmin");
        return convertEmptyToNull(_itemadmin);
    }

    /**
     * [set] ITEMADMIN: {varchar(30)} <br>
     * 銘柄管理社
     * @param itemadmin The value of the column 'ITEMADMIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemadmin(String itemadmin) {
        registerModifiedProperty("itemadmin");
        _itemadmin = itemadmin;
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
     * [get] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @return The value of the column 'ITEMGROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemgroup() {
        checkSpecifiedProperty("itemgroup");
        return convertEmptyToNull(_itemgroup);
    }

    /**
     * [set] ITEMGROUP: {varchar(60)} <br>
     * 銘柄グループ
     * @param itemgroup The value of the column 'ITEMGROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemgroup(String itemgroup) {
        registerModifiedProperty("itemgroup");
        _itemgroup = itemgroup;
    }

    /**
     * [get] ACTFLG: {char(1), default=[(1)]} <br>
     * 活動中フラグ
     * @return The value of the column 'ACTFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getActflg() {
        checkSpecifiedProperty("actflg");
        return convertEmptyToNull(_actflg);
    }

    /**
     * [set] ACTFLG: {char(1), default=[(1)]} <br>
     * 活動中フラグ
     * @param actflg The value of the column 'ACTFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setActflg(String actflg) {
        registerModifiedProperty("actflg");
        _actflg = actflg;
    }

    /**
     * [get] INVTYPE: {varchar(30)} <br>
     * 銘柄在庫タイプ
     * @return The value of the column 'INVTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvtype() {
        checkSpecifiedProperty("invtype");
        return convertEmptyToNull(_invtype);
    }

    /**
     * [set] INVTYPE: {varchar(30)} <br>
     * 銘柄在庫タイプ
     * @param invtype The value of the column 'INVTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvtype(String invtype) {
        registerModifiedProperty("invtype");
        _invtype = invtype;
    }

    /**
     * [get] SETITEMFLG: {char(1), default=[(0)]} <br>
     * セット品フラグ
     * @return The value of the column 'SETITEMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSetitemflg() {
        checkSpecifiedProperty("setitemflg");
        return convertEmptyToNull(_setitemflg);
    }

    /**
     * [set] SETITEMFLG: {char(1), default=[(0)]} <br>
     * セット品フラグ
     * @param setitemflg The value of the column 'SETITEMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSetitemflg(String setitemflg) {
        registerModifiedProperty("setitemflg");
        _setitemflg = setitemflg;
    }

    /**
     * [get] NAME: {varchar(255)} <br>
     * 正式名称
     * @return The value of the column 'NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return convertEmptyToNull(_name);
    }

    /**
     * [set] NAME: {varchar(255)} <br>
     * 正式名称
     * @param name The value of the column 'NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] SNAME: {varchar(100)} <br>
     * 略式名称
     * @return The value of the column 'SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSname() {
        checkSpecifiedProperty("sname");
        return convertEmptyToNull(_sname);
    }

    /**
     * [set] SNAME: {varchar(100)} <br>
     * 略式名称
     * @param sname The value of the column 'SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSname(String sname) {
        registerModifiedProperty("sname");
        _sname = sname;
    }

    /**
     * [get] ANAME: {varchar(100)} <br>
     * 検索名称
     * @return The value of the column 'ANAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getAname() {
        checkSpecifiedProperty("aname");
        return convertEmptyToNull(_aname);
    }

    /**
     * [set] ANAME: {varchar(100)} <br>
     * 検索名称
     * @param aname The value of the column 'ANAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAname(String aname) {
        registerModifiedProperty("aname");
        _aname = aname;
    }

    /**
     * [get] OWNERITEMCD: {varchar(30)} <br>
     * 荷主銘柄CD
     * @return The value of the column 'OWNERITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwneritemcd() {
        checkSpecifiedProperty("owneritemcd");
        return convertEmptyToNull(_owneritemcd);
    }

    /**
     * [set] OWNERITEMCD: {varchar(30)} <br>
     * 荷主銘柄CD
     * @param owneritemcd The value of the column 'OWNERITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwneritemcd(String owneritemcd) {
        registerModifiedProperty("owneritemcd");
        _owneritemcd = owneritemcd;
    }

    /**
     * [get] SUPPLIERITEMCD: {varchar(30)} <br>
     * 調達先銘柄CD
     * @return The value of the column 'SUPPLIERITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplieritemcd() {
        checkSpecifiedProperty("supplieritemcd");
        return convertEmptyToNull(_supplieritemcd);
    }

    /**
     * [set] SUPPLIERITEMCD: {varchar(30)} <br>
     * 調達先銘柄CD
     * @param supplieritemcd The value of the column 'SUPPLIERITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplieritemcd(String supplieritemcd) {
        registerModifiedProperty("supplieritemcd");
        _supplieritemcd = supplieritemcd;
    }

    /**
     * [get] POSITEMCD: {varchar(30)} <br>
     * ＰＯＳ銘柄CD
     * @return The value of the column 'POSITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPositemcd() {
        checkSpecifiedProperty("positemcd");
        return convertEmptyToNull(_positemcd);
    }

    /**
     * [set] POSITEMCD: {varchar(30)} <br>
     * ＰＯＳ銘柄CD
     * @param positemcd The value of the column 'POSITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPositemcd(String positemcd) {
        registerModifiedProperty("positemcd");
        _positemcd = positemcd;
    }

    /**
     * [get] ITFCD: {varchar(30)} <br>
     * ＩＴＦ銘柄CD
     * @return The value of the column 'ITFCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItfcd() {
        checkSpecifiedProperty("itfcd");
        return convertEmptyToNull(_itfcd);
    }

    /**
     * [set] ITFCD: {varchar(30)} <br>
     * ＩＴＦ銘柄CD
     * @param itfcd The value of the column 'ITFCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItfcd(String itfcd) {
        registerModifiedProperty("itfcd");
        _itfcd = itfcd;
    }

    /**
     * [get] MANUITEMCD: {varchar(30)} <br>
     * 製造銘柄CD
     * @return The value of the column 'MANUITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getManuitemcd() {
        checkSpecifiedProperty("manuitemcd");
        return convertEmptyToNull(_manuitemcd);
    }

    /**
     * [set] MANUITEMCD: {varchar(30)} <br>
     * 製造銘柄CD
     * @param manuitemcd The value of the column 'MANUITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setManuitemcd(String manuitemcd) {
        registerModifiedProperty("manuitemcd");
        _manuitemcd = manuitemcd;
    }

    /**
     * [get] PRICE_BUY: {varchar(30)} <br>
     * 銘柄単価（仕入値）
     * @return The value of the column 'PRICE_BUY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceBuy() {
        checkSpecifiedProperty("priceBuy");
        return convertEmptyToNull(_priceBuy);
    }

    /**
     * [set] PRICE_BUY: {varchar(30)} <br>
     * 銘柄単価（仕入値）
     * @param priceBuy The value of the column 'PRICE_BUY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceBuy(String priceBuy) {
        registerModifiedProperty("priceBuy");
        _priceBuy = priceBuy;
    }

    /**
     * [get] PRICE_WHOLESALE: {varchar(30), default=[(0)]} <br>
     * 銘柄単価（卸値）
     * @return The value of the column 'PRICE_WHOLESALE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceWholesale() {
        checkSpecifiedProperty("priceWholesale");
        return convertEmptyToNull(_priceWholesale);
    }

    /**
     * [set] PRICE_WHOLESALE: {varchar(30), default=[(0)]} <br>
     * 銘柄単価（卸値）
     * @param priceWholesale The value of the column 'PRICE_WHOLESALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceWholesale(String priceWholesale) {
        registerModifiedProperty("priceWholesale");
        _priceWholesale = priceWholesale;
    }

    /**
     * [get] PRICE_SALE: {varchar(30), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @return The value of the column 'PRICE_SALE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceSale() {
        checkSpecifiedProperty("priceSale");
        return convertEmptyToNull(_priceSale);
    }

    /**
     * [set] PRICE_SALE: {varchar(30), default=[(0)]} <br>
     * 銘柄単価（売値）
     * @param priceSale The value of the column 'PRICE_SALE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceSale(String priceSale) {
        registerModifiedProperty("priceSale");
        _priceSale = priceSale;
    }

    /**
     * [get] ABCTYPE: {varchar(30)} <br>
     * ＡＢＣ分類
     * @return The value of the column 'ABCTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getAbctype() {
        checkSpecifiedProperty("abctype");
        return convertEmptyToNull(_abctype);
    }

    /**
     * [set] ABCTYPE: {varchar(30)} <br>
     * ＡＢＣ分類
     * @param abctype The value of the column 'ABCTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbctype(String abctype) {
        registerModifiedProperty("abctype");
        _abctype = abctype;
    }

    /**
     * [get] QTY1TYPE: {char(1), default=[(0)]} <br>
     * 数量１単位レベル
     * @return The value of the column 'QTY1TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getQty1type() {
        checkSpecifiedProperty("qty1type");
        return convertEmptyToNull(_qty1type);
    }

    /**
     * [set] QTY1TYPE: {char(1), default=[(0)]} <br>
     * 数量１単位レベル
     * @param qty1type The value of the column 'QTY1TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQty1type(String qty1type) {
        registerModifiedProperty("qty1type");
        _qty1type = qty1type;
    }

    /**
     * [get] UNIT1: {varchar(30), default=[(0)]} <br>
     * 荷姿１入り数
     * @return The value of the column 'UNIT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit1() {
        checkSpecifiedProperty("unit1");
        return convertEmptyToNull(_unit1);
    }

    /**
     * [set] UNIT1: {varchar(30), default=[(0)]} <br>
     * 荷姿１入り数
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1(String unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT1STYLE: {varchar(60)} <br>
     * 荷姿１単位
     * @return The value of the column 'UNIT1STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit1style() {
        checkSpecifiedProperty("unit1style");
        return convertEmptyToNull(_unit1style);
    }

    /**
     * [set] UNIT1STYLE: {varchar(60)} <br>
     * 荷姿１単位
     * @param unit1style The value of the column 'UNIT1STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1style(String unit1style) {
        registerModifiedProperty("unit1style");
        _unit1style = unit1style;
    }

    /**
     * [get] LENGTH1: {varchar(30), default=[(0)]} <br>
     * 縦１
     * @return The value of the column 'LENGTH1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLength1() {
        checkSpecifiedProperty("length1");
        return convertEmptyToNull(_length1);
    }

    /**
     * [set] LENGTH1: {varchar(30), default=[(0)]} <br>
     * 縦１
     * @param length1 The value of the column 'LENGTH1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength1(String length1) {
        registerModifiedProperty("length1");
        _length1 = length1;
    }

    /**
     * [get] WIDTH1: {varchar(30), default=[(0)]} <br>
     * 横１
     * @return The value of the column 'WIDTH1'. (NullAllowed even if selected: for no constraint)
     */
    public String getWidth1() {
        checkSpecifiedProperty("width1");
        return convertEmptyToNull(_width1);
    }

    /**
     * [set] WIDTH1: {varchar(30), default=[(0)]} <br>
     * 横１
     * @param width1 The value of the column 'WIDTH1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth1(String width1) {
        registerModifiedProperty("width1");
        _width1 = width1;
    }

    /**
     * [get] HEIGHT1: {varchar(30), default=[(0)]} <br>
     * 高さ１
     * @return The value of the column 'HEIGHT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeight1() {
        checkSpecifiedProperty("height1");
        return convertEmptyToNull(_height1);
    }

    /**
     * [set] HEIGHT1: {varchar(30), default=[(0)]} <br>
     * 高さ１
     * @param height1 The value of the column 'HEIGHT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight1(String height1) {
        registerModifiedProperty("height1");
        _height1 = height1;
    }

    /**
     * [get] GROSSWEIGHT1: {varchar(30), default=[(0)]} <br>
     * グロス重量１
     * @return The value of the column 'GROSSWEIGHT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrossweight1() {
        checkSpecifiedProperty("grossweight1");
        return convertEmptyToNull(_grossweight1);
    }

    /**
     * [set] GROSSWEIGHT1: {varchar(30), default=[(0)]} <br>
     * グロス重量１
     * @param grossweight1 The value of the column 'GROSSWEIGHT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossweight1(String grossweight1) {
        registerModifiedProperty("grossweight1");
        _grossweight1 = grossweight1;
    }

    /**
     * [get] NETWEIGHT1: {varchar(30), default=[(0)]} <br>
     * ネット重量１
     * @return The value of the column 'NETWEIGHT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getNetweight1() {
        checkSpecifiedProperty("netweight1");
        return convertEmptyToNull(_netweight1);
    }

    /**
     * [set] NETWEIGHT1: {varchar(30), default=[(0)]} <br>
     * ネット重量１
     * @param netweight1 The value of the column 'NETWEIGHT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetweight1(String netweight1) {
        registerModifiedProperty("netweight1");
        _netweight1 = netweight1;
    }

    /**
     * [get] CUBE1: {varchar(30), default=[(0)]} <br>
     * 体積（容積）１
     * @return The value of the column 'CUBE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getCube1() {
        checkSpecifiedProperty("cube1");
        return convertEmptyToNull(_cube1);
    }

    /**
     * [set] CUBE1: {varchar(30), default=[(0)]} <br>
     * 体積（容積）１
     * @param cube1 The value of the column 'CUBE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCube1(String cube1) {
        registerModifiedProperty("cube1");
        _cube1 = cube1;
    }

    /**
     * [get] LITER1: {varchar(30), default=[(0)]} <br>
     * 内容量１
     * @return The value of the column 'LITER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiter1() {
        checkSpecifiedProperty("liter1");
        return convertEmptyToNull(_liter1);
    }

    /**
     * [set] LITER1: {varchar(30), default=[(0)]} <br>
     * 内容量１
     * @param liter1 The value of the column 'LITER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiter1(String liter1) {
        registerModifiedProperty("liter1");
        _liter1 = liter1;
    }

    /**
     * [get] UNIT2: {varchar(30), default=[(0)]} <br>
     * 荷姿２入り数
     * @return The value of the column 'UNIT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit2() {
        checkSpecifiedProperty("unit2");
        return convertEmptyToNull(_unit2);
    }

    /**
     * [set] UNIT2: {varchar(30), default=[(0)]} <br>
     * 荷姿２入り数
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2(String unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
    }

    /**
     * [get] UNIT2STYLE: {varchar(60)} <br>
     * 荷姿２単位
     * @return The value of the column 'UNIT2STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit2style() {
        checkSpecifiedProperty("unit2style");
        return convertEmptyToNull(_unit2style);
    }

    /**
     * [set] UNIT2STYLE: {varchar(60)} <br>
     * 荷姿２単位
     * @param unit2style The value of the column 'UNIT2STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2style(String unit2style) {
        registerModifiedProperty("unit2style");
        _unit2style = unit2style;
    }

    /**
     * [get] LENGTH2: {varchar(30), default=[(0)]} <br>
     * 縦２
     * @return The value of the column 'LENGTH2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLength2() {
        checkSpecifiedProperty("length2");
        return convertEmptyToNull(_length2);
    }

    /**
     * [set] LENGTH2: {varchar(30), default=[(0)]} <br>
     * 縦２
     * @param length2 The value of the column 'LENGTH2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength2(String length2) {
        registerModifiedProperty("length2");
        _length2 = length2;
    }

    /**
     * [get] WIDTH2: {varchar(30), default=[(0)]} <br>
     * 横２
     * @return The value of the column 'WIDTH2'. (NullAllowed even if selected: for no constraint)
     */
    public String getWidth2() {
        checkSpecifiedProperty("width2");
        return convertEmptyToNull(_width2);
    }

    /**
     * [set] WIDTH2: {varchar(30), default=[(0)]} <br>
     * 横２
     * @param width2 The value of the column 'WIDTH2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth2(String width2) {
        registerModifiedProperty("width2");
        _width2 = width2;
    }

    /**
     * [get] HEIGHT2: {varchar(30), default=[(0)]} <br>
     * 高さ２
     * @return The value of the column 'HEIGHT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeight2() {
        checkSpecifiedProperty("height2");
        return convertEmptyToNull(_height2);
    }

    /**
     * [set] HEIGHT2: {varchar(30), default=[(0)]} <br>
     * 高さ２
     * @param height2 The value of the column 'HEIGHT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight2(String height2) {
        registerModifiedProperty("height2");
        _height2 = height2;
    }

    /**
     * [get] GROSSWEIGHT2: {varchar(30), default=[(0)]} <br>
     * グロス重量２
     * @return The value of the column 'GROSSWEIGHT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrossweight2() {
        checkSpecifiedProperty("grossweight2");
        return convertEmptyToNull(_grossweight2);
    }

    /**
     * [set] GROSSWEIGHT2: {varchar(30), default=[(0)]} <br>
     * グロス重量２
     * @param grossweight2 The value of the column 'GROSSWEIGHT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossweight2(String grossweight2) {
        registerModifiedProperty("grossweight2");
        _grossweight2 = grossweight2;
    }

    /**
     * [get] NETWEIGHT2: {varchar(30), default=[(0)]} <br>
     * ネット重量２
     * @return The value of the column 'NETWEIGHT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNetweight2() {
        checkSpecifiedProperty("netweight2");
        return convertEmptyToNull(_netweight2);
    }

    /**
     * [set] NETWEIGHT2: {varchar(30), default=[(0)]} <br>
     * ネット重量２
     * @param netweight2 The value of the column 'NETWEIGHT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetweight2(String netweight2) {
        registerModifiedProperty("netweight2");
        _netweight2 = netweight2;
    }

    /**
     * [get] CUBE2: {varchar(30), default=[(0)]} <br>
     * 体積（容積）２
     * @return The value of the column 'CUBE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getCube2() {
        checkSpecifiedProperty("cube2");
        return convertEmptyToNull(_cube2);
    }

    /**
     * [set] CUBE2: {varchar(30), default=[(0)]} <br>
     * 体積（容積）２
     * @param cube2 The value of the column 'CUBE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCube2(String cube2) {
        registerModifiedProperty("cube2");
        _cube2 = cube2;
    }

    /**
     * [get] LITER2: {varchar(30), default=[(0)]} <br>
     * 内容量２
     * @return The value of the column 'LITER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiter2() {
        checkSpecifiedProperty("liter2");
        return convertEmptyToNull(_liter2);
    }

    /**
     * [set] LITER2: {varchar(30), default=[(0)]} <br>
     * 内容量２
     * @param liter2 The value of the column 'LITER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiter2(String liter2) {
        registerModifiedProperty("liter2");
        _liter2 = liter2;
    }

    /**
     * [get] UNIT3: {varchar(30), default=[(0)]} <br>
     * 荷姿３入り数
     * @return The value of the column 'UNIT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit3() {
        checkSpecifiedProperty("unit3");
        return convertEmptyToNull(_unit3);
    }

    /**
     * [set] UNIT3: {varchar(30), default=[(0)]} <br>
     * 荷姿３入り数
     * @param unit3 The value of the column 'UNIT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit3(String unit3) {
        registerModifiedProperty("unit3");
        _unit3 = unit3;
    }

    /**
     * [get] UNIT3STYLE: {varchar(60)} <br>
     * 荷姿３単位
     * @return The value of the column 'UNIT3STYLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnit3style() {
        checkSpecifiedProperty("unit3style");
        return convertEmptyToNull(_unit3style);
    }

    /**
     * [set] UNIT3STYLE: {varchar(60)} <br>
     * 荷姿３単位
     * @param unit3style The value of the column 'UNIT3STYLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit3style(String unit3style) {
        registerModifiedProperty("unit3style");
        _unit3style = unit3style;
    }

    /**
     * [get] LENGTH3: {varchar(30), default=[(0)]} <br>
     * 縦３
     * @return The value of the column 'LENGTH3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLength3() {
        checkSpecifiedProperty("length3");
        return convertEmptyToNull(_length3);
    }

    /**
     * [set] LENGTH3: {varchar(30), default=[(0)]} <br>
     * 縦３
     * @param length3 The value of the column 'LENGTH3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLength3(String length3) {
        registerModifiedProperty("length3");
        _length3 = length3;
    }

    /**
     * [get] WIDTH3: {varchar(30), default=[(0)]} <br>
     * 横３
     * @return The value of the column 'WIDTH3'. (NullAllowed even if selected: for no constraint)
     */
    public String getWidth3() {
        checkSpecifiedProperty("width3");
        return convertEmptyToNull(_width3);
    }

    /**
     * [set] WIDTH3: {varchar(30), default=[(0)]} <br>
     * 横３
     * @param width3 The value of the column 'WIDTH3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWidth3(String width3) {
        registerModifiedProperty("width3");
        _width3 = width3;
    }

    /**
     * [get] HEIGHT3: {varchar(30), default=[(0)]} <br>
     * 高さ３
     * @return The value of the column 'HEIGHT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getHeight3() {
        checkSpecifiedProperty("height3");
        return convertEmptyToNull(_height3);
    }

    /**
     * [set] HEIGHT3: {varchar(30), default=[(0)]} <br>
     * 高さ３
     * @param height3 The value of the column 'HEIGHT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHeight3(String height3) {
        registerModifiedProperty("height3");
        _height3 = height3;
    }

    /**
     * [get] GROSSWEIGHT3: {varchar(30), default=[(0)]} <br>
     * グロス重量３
     * @return The value of the column 'GROSSWEIGHT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getGrossweight3() {
        checkSpecifiedProperty("grossweight3");
        return convertEmptyToNull(_grossweight3);
    }

    /**
     * [set] GROSSWEIGHT3: {varchar(30), default=[(0)]} <br>
     * グロス重量３
     * @param grossweight3 The value of the column 'GROSSWEIGHT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGrossweight3(String grossweight3) {
        registerModifiedProperty("grossweight3");
        _grossweight3 = grossweight3;
    }

    /**
     * [get] NETWEIGHT3: {varchar(30), default=[(0)]} <br>
     * ネット重量３
     * @return The value of the column 'NETWEIGHT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getNetweight3() {
        checkSpecifiedProperty("netweight3");
        return convertEmptyToNull(_netweight3);
    }

    /**
     * [set] NETWEIGHT3: {varchar(30), default=[(0)]} <br>
     * ネット重量３
     * @param netweight3 The value of the column 'NETWEIGHT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNetweight3(String netweight3) {
        registerModifiedProperty("netweight3");
        _netweight3 = netweight3;
    }

    /**
     * [get] CUBE3: {varchar(30), default=[(0)]} <br>
     * 体積（容積）３
     * @return The value of the column 'CUBE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getCube3() {
        checkSpecifiedProperty("cube3");
        return convertEmptyToNull(_cube3);
    }

    /**
     * [set] CUBE3: {varchar(30), default=[(0)]} <br>
     * 体積（容積）３
     * @param cube3 The value of the column 'CUBE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCube3(String cube3) {
        registerModifiedProperty("cube3");
        _cube3 = cube3;
    }

    /**
     * [get] LITER3: {varchar(30), default=[(0)]} <br>
     * 内容量３
     * @return The value of the column 'LITER3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLiter3() {
        checkSpecifiedProperty("liter3");
        return convertEmptyToNull(_liter3);
    }

    /**
     * [set] LITER3: {varchar(30), default=[(0)]} <br>
     * 内容量３
     * @param liter3 The value of the column 'LITER3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLiter3(String liter3) {
        registerModifiedProperty("liter3");
        _liter3 = liter3;
    }

    /**
     * [get] P_QTY: {varchar(30), default=[(0)]} <br>
     * パレット平面積付数量
     * @return The value of the column 'P_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPQty() {
        checkSpecifiedProperty("PQty");
        return convertEmptyToNull(_pQty);
    }

    /**
     * [set] P_QTY: {varchar(30), default=[(0)]} <br>
     * パレット平面積付数量
     * @param pQty The value of the column 'P_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPQty(String pQty) {
        registerModifiedProperty("PQty");
        _pQty = pQty;
    }

    /**
     * [get] P_HEIGHT: {varchar(30), default=[(0)]} <br>
     * パレット積付段数
     * @return The value of the column 'P_HEIGHT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPHeight() {
        checkSpecifiedProperty("PHeight");
        return convertEmptyToNull(_pHeight);
    }

    /**
     * [set] P_HEIGHT: {varchar(30), default=[(0)]} <br>
     * パレット積付段数
     * @param pHeight The value of the column 'P_HEIGHT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPHeight(String pHeight) {
        registerModifiedProperty("PHeight");
        _pHeight = pHeight;
    }

    /**
     * [get] P_ODD: {varchar(30), default=[(0)]} <br>
     * パレット積付端数
     * @return The value of the column 'P_ODD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPOdd() {
        checkSpecifiedProperty("POdd");
        return convertEmptyToNull(_pOdd);
    }

    /**
     * [set] P_ODD: {varchar(30), default=[(0)]} <br>
     * パレット積付端数
     * @param pOdd The value of the column 'P_ODD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPOdd(String pOdd) {
        registerModifiedProperty("POdd");
        _pOdd = pOdd;
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
     * [get] F_USER1: {varchar(30)} <br>
     * カテゴリ１
     * @return The value of the column 'F_USER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser1() {
        checkSpecifiedProperty("FUser1");
        return convertEmptyToNull(_fUser1);
    }

    /**
     * [set] F_USER1: {varchar(30)} <br>
     * カテゴリ１
     * @param fUser1 The value of the column 'F_USER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser1(String fUser1) {
        registerModifiedProperty("FUser1");
        _fUser1 = fUser1;
    }

    /**
     * [get] F_USER2: {varchar(30)} <br>
     * カテゴリ２
     * @return The value of the column 'F_USER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser2() {
        checkSpecifiedProperty("FUser2");
        return convertEmptyToNull(_fUser2);
    }

    /**
     * [set] F_USER2: {varchar(30)} <br>
     * カテゴリ２
     * @param fUser2 The value of the column 'F_USER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser2(String fUser2) {
        registerModifiedProperty("FUser2");
        _fUser2 = fUser2;
    }

    /**
     * [get] F_USER3: {varchar(30)} <br>
     * カテゴリ３
     * @return The value of the column 'F_USER3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser3() {
        checkSpecifiedProperty("FUser3");
        return convertEmptyToNull(_fUser3);
    }

    /**
     * [set] F_USER3: {varchar(30)} <br>
     * カテゴリ３
     * @param fUser3 The value of the column 'F_USER3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser3(String fUser3) {
        registerModifiedProperty("FUser3");
        _fUser3 = fUser3;
    }

    /**
     * [get] F_USER4: {varchar(30)} <br>
     * カテゴリ４
     * @return The value of the column 'F_USER4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser4() {
        checkSpecifiedProperty("FUser4");
        return convertEmptyToNull(_fUser4);
    }

    /**
     * [set] F_USER4: {varchar(30)} <br>
     * カテゴリ４
     * @param fUser4 The value of the column 'F_USER4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser4(String fUser4) {
        registerModifiedProperty("FUser4");
        _fUser4 = fUser4;
    }

    /**
     * [get] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @return The value of the column 'F_USER5'. (NullAllowed even if selected: for no constraint)
     */
    public String getFUser5() {
        checkSpecifiedProperty("FUser5");
        return convertEmptyToNull(_fUser5);
    }

    /**
     * [set] F_USER5: {varchar(30)} <br>
     * カテゴリ５
     * @param fUser5 The value of the column 'F_USER5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFUser5(String fUser5) {
        registerModifiedProperty("FUser5");
        _fUser5 = fUser5;
    }

    /**
     * [get] PRICE_INSURANCE: {varchar(30), default=[(0)]} <br>
     * 寄託価格
     * @return The value of the column 'PRICE_INSURANCE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceInsurance() {
        checkSpecifiedProperty("priceInsurance");
        return convertEmptyToNull(_priceInsurance);
    }

    /**
     * [set] PRICE_INSURANCE: {varchar(30), default=[(0)]} <br>
     * 寄託価格
     * @param priceInsurance The value of the column 'PRICE_INSURANCE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceInsurance(String priceInsurance) {
        registerModifiedProperty("priceInsurance");
        _priceInsurance = priceInsurance;
    }

    /**
     * [get] LIMITDAY: {varchar(30), default=[(0)]} <br>
     * 賞味期限日数
     * @return The value of the column 'LIMITDAY'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitday() {
        checkSpecifiedProperty("limitday");
        return convertEmptyToNull(_limitday);
    }

    /**
     * [set] LIMITDAY: {varchar(30), default=[(0)]} <br>
     * 賞味期限日数
     * @param limitday The value of the column 'LIMITDAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitday(String limitday) {
        registerModifiedProperty("limitday");
        _limitday = limitday;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * 取引先（調達先）CD
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @return The value of the column 'USERUSE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse1() {
        checkSpecifiedProperty("useruse1");
        return convertEmptyToNull(_useruse1);
    }

    /**
     * [set] USERUSE1: {varchar(60)} <br>
     * ユーザ設定項目１
     * @param useruse1 The value of the column 'USERUSE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse1(String useruse1) {
        registerModifiedProperty("useruse1");
        _useruse1 = useruse1;
    }

    /**
     * [get] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @return The value of the column 'USERUSE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse2() {
        checkSpecifiedProperty("useruse2");
        return convertEmptyToNull(_useruse2);
    }

    /**
     * [set] USERUSE2: {varchar(60)} <br>
     * ユーザ設定項目２
     * @param useruse2 The value of the column 'USERUSE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse2(String useruse2) {
        registerModifiedProperty("useruse2");
        _useruse2 = useruse2;
    }

    /**
     * [get] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @return The value of the column 'USERUSE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse3() {
        checkSpecifiedProperty("useruse3");
        return convertEmptyToNull(_useruse3);
    }

    /**
     * [set] USERUSE3: {varchar(60)} <br>
     * ユーザ設定項目３
     * @param useruse3 The value of the column 'USERUSE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse3(String useruse3) {
        registerModifiedProperty("useruse3");
        _useruse3 = useruse3;
    }

    /**
     * [get] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @return The value of the column 'USERUSE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse4() {
        checkSpecifiedProperty("useruse4");
        return convertEmptyToNull(_useruse4);
    }

    /**
     * [set] USERUSE4: {varchar(60)} <br>
     * ユーザ設定項目４
     * @param useruse4 The value of the column 'USERUSE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse4(String useruse4) {
        registerModifiedProperty("useruse4");
        _useruse4 = useruse4;
    }

    /**
     * [get] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @return The value of the column 'USERUSE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUseruse5() {
        checkSpecifiedProperty("useruse5");
        return convertEmptyToNull(_useruse5);
    }

    /**
     * [set] USERUSE5: {varchar(60)} <br>
     * ユーザ設定項目５
     * @param useruse5 The value of the column 'USERUSE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUseruse5(String useruse5) {
        registerModifiedProperty("useruse5");
        _useruse5 = useruse5;
    }

    /**
     * [get] PRICELEVEL: {char(1), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @return The value of the column 'PRICELEVEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getPricelevel() {
        checkSpecifiedProperty("pricelevel");
        return convertEmptyToNull(_pricelevel);
    }

    /**
     * [set] PRICELEVEL: {char(1), default=[(0)]} <br>
     * 銘柄単価設定レベル
     * @param pricelevel The value of the column 'PRICELEVEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPricelevel(String pricelevel) {
        registerModifiedProperty("pricelevel");
        _pricelevel = pricelevel;
    }

    /**
     * [get] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @return The value of the column 'ITEMCATALOGURL'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcatalogurl() {
        checkSpecifiedProperty("itemcatalogurl");
        return convertEmptyToNull(_itemcatalogurl);
    }

    /**
     * [set] ITEMCATALOGURL: {varchar(255)} <br>
     * 銘柄紹介URL
     * @param itemcatalogurl The value of the column 'ITEMCATALOGURL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcatalogurl(String itemcatalogurl) {
        registerModifiedProperty("itemcatalogurl");
        _itemcatalogurl = itemcatalogurl;
    }

    /**
     * [get] USERNUM1: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値１
     * @return The value of the column 'USERNUM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum1() {
        checkSpecifiedProperty("usernum1");
        return convertEmptyToNull(_usernum1);
    }

    /**
     * [set] USERNUM1: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値１
     * @param usernum1 The value of the column 'USERNUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum1(String usernum1) {
        registerModifiedProperty("usernum1");
        _usernum1 = usernum1;
    }

    /**
     * [get] USERNUM2: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値２
     * @return The value of the column 'USERNUM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum2() {
        checkSpecifiedProperty("usernum2");
        return convertEmptyToNull(_usernum2);
    }

    /**
     * [set] USERNUM2: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値２
     * @param usernum2 The value of the column 'USERNUM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum2(String usernum2) {
        registerModifiedProperty("usernum2");
        _usernum2 = usernum2;
    }

    /**
     * [get] USERNUM3: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値３
     * @return The value of the column 'USERNUM3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum3() {
        checkSpecifiedProperty("usernum3");
        return convertEmptyToNull(_usernum3);
    }

    /**
     * [set] USERNUM3: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値３
     * @param usernum3 The value of the column 'USERNUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum3(String usernum3) {
        registerModifiedProperty("usernum3");
        _usernum3 = usernum3;
    }

    /**
     * [get] USERNUM4: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値４
     * @return The value of the column 'USERNUM4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum4() {
        checkSpecifiedProperty("usernum4");
        return convertEmptyToNull(_usernum4);
    }

    /**
     * [set] USERNUM4: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値４
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum4(String usernum4) {
        registerModifiedProperty("usernum4");
        _usernum4 = usernum4;
    }

    /**
     * [get] USERNUM5: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値５
     * @return The value of the column 'USERNUM5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUsernum5() {
        checkSpecifiedProperty("usernum5");
        return convertEmptyToNull(_usernum5);
    }

    /**
     * [set] USERNUM5: {varchar(30), default=[(0)]} <br>
     * ユーザ設定数値５
     * @param usernum5 The value of the column 'USERNUM5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum5(String usernum5) {
        registerModifiedProperty("usernum5");
        _usernum5 = usernum5;
    }

    /**
     * [get] USERDATE1: {varchar(30)} <br>
     * ユーザ設定日付１
     * @return The value of the column 'USERDATE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate1() {
        checkSpecifiedProperty("userdate1");
        return convertEmptyToNull(_userdate1);
    }

    /**
     * [set] USERDATE1: {varchar(30)} <br>
     * ユーザ設定日付１
     * @param userdate1 The value of the column 'USERDATE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate1(String userdate1) {
        registerModifiedProperty("userdate1");
        _userdate1 = userdate1;
    }

    /**
     * [get] USERDATE2: {varchar(30)} <br>
     * ユーザ設定日付２
     * @return The value of the column 'USERDATE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate2() {
        checkSpecifiedProperty("userdate2");
        return convertEmptyToNull(_userdate2);
    }

    /**
     * [set] USERDATE2: {varchar(30)} <br>
     * ユーザ設定日付２
     * @param userdate2 The value of the column 'USERDATE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate2(String userdate2) {
        registerModifiedProperty("userdate2");
        _userdate2 = userdate2;
    }

    /**
     * [get] USERDATE3: {varchar(30)} <br>
     * ユーザ設定日付３
     * @return The value of the column 'USERDATE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate3() {
        checkSpecifiedProperty("userdate3");
        return convertEmptyToNull(_userdate3);
    }

    /**
     * [set] USERDATE3: {varchar(30)} <br>
     * ユーザ設定日付３
     * @param userdate3 The value of the column 'USERDATE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate3(String userdate3) {
        registerModifiedProperty("userdate3");
        _userdate3 = userdate3;
    }

    /**
     * [get] USERDATE4: {varchar(30)} <br>
     * ユーザ設定日付４
     * @return The value of the column 'USERDATE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate4() {
        checkSpecifiedProperty("userdate4");
        return convertEmptyToNull(_userdate4);
    }

    /**
     * [set] USERDATE4: {varchar(30)} <br>
     * ユーザ設定日付４
     * @param userdate4 The value of the column 'USERDATE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate4(String userdate4) {
        registerModifiedProperty("userdate4");
        _userdate4 = userdate4;
    }

    /**
     * [get] USERDATE5: {varchar(30)} <br>
     * ユーザ設定日付５
     * @return The value of the column 'USERDATE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserdate5() {
        checkSpecifiedProperty("userdate5");
        return convertEmptyToNull(_userdate5);
    }

    /**
     * [set] USERDATE5: {varchar(30)} <br>
     * ユーザ設定日付５
     * @param userdate5 The value of the column 'USERDATE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserdate5(String userdate5) {
        registerModifiedProperty("userdate5");
        _userdate5 = userdate5;
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
